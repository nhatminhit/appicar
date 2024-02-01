package t2;

import android.os.Bundle;
import android.os.Parcelable;
import d.g1;
import d.m0;
import d.o0;
import e1.n;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class h0<K> {
    @g1

    /* renamed from: b  reason: collision with root package name */
    public static final String f12837b = "androidx.recyclerview.selection.entries";
    @g1

    /* renamed from: c  reason: collision with root package name */
    public static final String f12838c = "androidx.recyclerview.selection.type";

    /* renamed from: a  reason: collision with root package name */
    public final Class<K> f12839a;

    public static class a extends h0<Long> {
        public a() {
            super(Long.class);
        }

        @m0
        public Bundle a(@m0 c0<Long> c0Var) {
            Bundle bundle = new Bundle();
            bundle.putString(h0.f12838c, f());
            long[] jArr = new long[c0Var.size()];
            Iterator<Long> it = c0Var.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                jArr[i10] = it.next().longValue();
                i10++;
            }
            bundle.putLongArray(h0.f12837b, jArr);
            return bundle;
        }

        @o0
        public c0<Long> b(@m0 Bundle bundle) {
            long[] longArray;
            String string = bundle.getString(h0.f12838c, (String) null);
            if (string == null || !string.equals(f()) || (longArray = bundle.getLongArray(h0.f12837b)) == null) {
                return null;
            }
            c0<Long> c0Var = new c0<>();
            for (long valueOf : longArray) {
                c0Var.O.add(Long.valueOf(valueOf));
            }
            return c0Var;
        }
    }

    public static class b<K extends Parcelable> extends h0<K> {
        public b(@m0 Class<K> cls) {
            super(cls);
            n.a(Parcelable.class.isAssignableFrom(cls));
        }

        @m0
        public Bundle a(@m0 c0<K> c0Var) {
            Bundle bundle = new Bundle();
            bundle.putString(h0.f12838c, f());
            ArrayList arrayList = new ArrayList(c0Var.size());
            arrayList.addAll(c0Var.O);
            bundle.putParcelableArrayList(h0.f12837b, arrayList);
            return bundle;
        }

        @o0
        public c0<K> b(@m0 Bundle bundle) {
            ArrayList parcelableArrayList;
            String string = bundle.getString(h0.f12838c, (String) null);
            if (string == null || !string.equals(f()) || (parcelableArrayList = bundle.getParcelableArrayList(h0.f12837b)) == null) {
                return null;
            }
            c0<K> c0Var = new c0<>();
            c0Var.O.addAll(parcelableArrayList);
            return c0Var;
        }
    }

    public static class c extends h0<String> {
        public c() {
            super(String.class);
        }

        @m0
        public Bundle a(@m0 c0<String> c0Var) {
            Bundle bundle = new Bundle();
            bundle.putString(h0.f12838c, f());
            ArrayList arrayList = new ArrayList(c0Var.size());
            arrayList.addAll(c0Var.O);
            bundle.putStringArrayList(h0.f12837b, arrayList);
            return bundle;
        }

        @o0
        public c0<String> b(@m0 Bundle bundle) {
            ArrayList<String> stringArrayList;
            String string = bundle.getString(h0.f12838c, (String) null);
            if (string == null || !string.equals(f()) || (stringArrayList = bundle.getStringArrayList(h0.f12837b)) == null) {
                return null;
            }
            c0<String> c0Var = new c0<>();
            c0Var.O.addAll(stringArrayList);
            return c0Var;
        }
    }

    public h0(@m0 Class<K> cls) {
        n.a(cls != null);
        this.f12839a = cls;
    }

    @m0
    public static h0<Long> c() {
        return new a();
    }

    @m0
    public static <K extends Parcelable> h0<K> d(@m0 Class<K> cls) {
        return new b(cls);
    }

    @m0
    public static h0<String> e() {
        return new c();
    }

    @m0
    public abstract Bundle a(@m0 c0<K> c0Var);

    @o0
    public abstract c0<K> b(@m0 Bundle bundle);

    public String f() {
        return this.f12839a.getCanonicalName();
    }
}
