package l8;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.common.h;
import d.m0;
import d.o0;
import e8.a;
import j8.s;
import java.util.ArrayList;
import w8.d0;

@a
@d0
public final class c {
    @a
    @m0
    public static <T extends SafeParcelable> T a(@m0 byte[] bArr, @m0 Parcelable.Creator<T> creator) {
        s.l(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t10 = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t10;
    }

    @a
    @o0
    public static <T extends SafeParcelable> T b(@m0 Intent intent, @m0 String str, @m0 Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }

    @a
    @m0
    public static <T extends SafeParcelable> T c(@m0 String str, @m0 Parcelable.Creator<T> creator) {
        return a(w8.c.b(str), creator);
    }

    @o0
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> d(@m0 Bundle bundle, @m0 String str, @m0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(a((byte[]) arrayList.get(i10), creator));
        }
        return arrayList2;
    }

    @a
    @o0
    public static <T extends SafeParcelable> ArrayList<T> e(@m0 Bundle bundle, @m0 String str, @m0 Parcelable.Creator<T> creator) {
        return f(bundle.getByteArray(str), creator);
    }

    @o0
    public static <T extends SafeParcelable> ArrayList<T> f(@o0 byte[] bArr, @m0 Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, length);
        obtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    @a
    @o0
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> g(@m0 Intent intent, @m0 String str, @m0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(a((byte[]) arrayList.get(i10), creator));
        }
        return arrayList2;
    }

    @a
    @o0
    public static <T extends SafeParcelable> ArrayList<T> h(@m0 Intent intent, @m0 String str, @m0 Parcelable.Creator<T> creator) {
        return f(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void i(@m0 Iterable<T> iterable, @m0 Bundle bundle, @m0 String str) {
        ArrayList arrayList = new ArrayList();
        for (T m10 : iterable) {
            arrayList.add(m(m10));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends SafeParcelable> void j(@m0 Iterable<T> iterable, @m0 Bundle bundle, @m0 String str) {
        bundle.putByteArray(str, p(iterable));
    }

    @a
    @Deprecated
    public static <T extends SafeParcelable> void k(@m0 Iterable<T> iterable, @m0 Intent intent, @m0 String str) {
        ArrayList arrayList = new ArrayList();
        for (T m10 : iterable) {
            arrayList.add(m(m10));
        }
        intent.putExtra(str, arrayList);
    }

    @a
    public static <T extends SafeParcelable> void l(@m0 Iterable<T> iterable, @m0 Intent intent, @m0 String str) {
        intent.putExtra(str, p(iterable));
    }

    @a
    @m0
    public static <T extends SafeParcelable> byte[] m(@m0 T t10) {
        Parcel obtain = Parcel.obtain();
        t10.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @a
    public static <T extends SafeParcelable> void n(@m0 T t10, @m0 Intent intent, @m0 String str) {
        intent.putExtra(str, m(t10));
    }

    @a
    @m0
    public static <T extends SafeParcelable> String o(@m0 T t10) {
        return w8.c.e(m(t10));
    }

    public static byte[] p(Iterable iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(h.n(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
