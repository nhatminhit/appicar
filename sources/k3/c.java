package k3;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import d.m0;
import d.o0;
import d.x0;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9933a = "a";

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static <T extends h> T a(InputStream inputStream) {
        return new g(inputStream, (OutputStream) null).g0();
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static <T extends h> T b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @o0
    public static <T extends h> T c(@m0 Bundle bundle, @m0 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(c.class.getClassLoader());
            return b(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @o0
    public static <T extends h> List<T> d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(c.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(b((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(@m0 Bundle bundle, @m0 String str, @o0 h hVar) {
        if (hVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", h(hVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    public static void f(@m0 Bundle bundle, @m0 String str, @m0 List<? extends h> list) {
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (h h10 : list) {
            arrayList.add(h(h10));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static void g(h hVar, OutputStream outputStream) {
        g gVar = new g((InputStream) null, outputStream);
        gVar.l1(hVar);
        gVar.a();
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static Parcelable h(h hVar) {
        return new ParcelImpl(hVar);
    }
}
