package h0;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import d.t0;
import h0.u0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@t0(16)
public class w1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8767a = "NotificationCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final String f8768b = "android.support.dataRemoteInputs";

    /* renamed from: c  reason: collision with root package name */
    public static final String f8769c = "android.support.allowGeneratedReplies";

    /* renamed from: d  reason: collision with root package name */
    public static final String f8770d = "icon";

    /* renamed from: e  reason: collision with root package name */
    public static final String f8771e = "title";

    /* renamed from: f  reason: collision with root package name */
    public static final String f8772f = "actionIntent";

    /* renamed from: g  reason: collision with root package name */
    public static final String f8773g = "extras";

    /* renamed from: h  reason: collision with root package name */
    public static final String f8774h = "remoteInputs";

    /* renamed from: i  reason: collision with root package name */
    public static final String f8775i = "dataOnlyRemoteInputs";

    /* renamed from: j  reason: collision with root package name */
    public static final String f8776j = "resultKey";

    /* renamed from: k  reason: collision with root package name */
    public static final String f8777k = "label";

    /* renamed from: l  reason: collision with root package name */
    public static final String f8778l = "choices";

    /* renamed from: m  reason: collision with root package name */
    public static final String f8779m = "allowFreeFormInput";

    /* renamed from: n  reason: collision with root package name */
    public static final String f8780n = "allowedDataTypes";

    /* renamed from: o  reason: collision with root package name */
    public static final String f8781o = "semanticAction";

    /* renamed from: p  reason: collision with root package name */
    public static final String f8782p = "showsUserInterface";

    /* renamed from: q  reason: collision with root package name */
    public static final Object f8783q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static Field f8784r;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f8785s;

    /* renamed from: t  reason: collision with root package name */
    public static final Object f8786t = new Object();

    /* renamed from: u  reason: collision with root package name */
    public static Field f8787u;

    /* renamed from: v  reason: collision with root package name */
    public static Field f8788v;

    /* renamed from: w  reason: collision with root package name */
    public static Field f8789w;

    /* renamed from: x  reason: collision with root package name */
    public static Field f8790x;

    /* renamed from: y  reason: collision with root package name */
    public static boolean f8791y;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    public static boolean b() {
        if (f8791y) {
            return false;
        }
        try {
            if (f8787u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f8788v = cls.getDeclaredField("icon");
                f8789w = cls.getDeclaredField("title");
                f8790x = cls.getDeclaredField(f8772f);
                Field declaredField = Notification.class.getDeclaredField(u0.q.f8710y);
                f8787u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException | NoSuchFieldException unused) {
            f8791y = true;
        }
        return true ^ f8791y;
    }

    public static v2 c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f8780n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new v2(bundle.getString(f8776j), bundle.getCharSequence(f8777k), bundle.getCharSequenceArray(f8778l), bundle.getBoolean(f8779m), 0, bundle.getBundle("extras"), hashSet);
    }

    public static v2[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        v2[] v2VarArr = new v2[bundleArr.length];
        for (int i10 = 0; i10 < bundleArr.length; i10++) {
            v2VarArr[i10] = c(bundleArr[i10]);
        }
        return v2VarArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r5 = r5.getSparseParcelableArray(h0.v1.f8741e);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h0.u0.b e(android.app.Notification r5, int r6) {
        /*
            java.lang.Object r0 = f8786t
            monitor-enter(r0)
            r1 = 0
            java.lang.Object[] r2 = h(r5)     // Catch:{ IllegalAccessException -> 0x0040 }
            if (r2 == 0) goto L_0x0043
            r2 = r2[r6]     // Catch:{ IllegalAccessException -> 0x0040 }
            android.os.Bundle r5 = k(r5)     // Catch:{ IllegalAccessException -> 0x0040 }
            if (r5 == 0) goto L_0x0021
            java.lang.String r3 = "android.support.actionExtras"
            android.util.SparseArray r5 = r5.getSparseParcelableArray(r3)     // Catch:{ IllegalAccessException -> 0x0040 }
            if (r5 == 0) goto L_0x0021
            java.lang.Object r5 = r5.get(r6)     // Catch:{ IllegalAccessException -> 0x0040 }
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch:{ IllegalAccessException -> 0x0040 }
            goto L_0x0022
        L_0x0021:
            r5 = r1
        L_0x0022:
            java.lang.reflect.Field r6 = f8788v     // Catch:{ IllegalAccessException -> 0x0040 }
            int r6 = r6.getInt(r2)     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.reflect.Field r3 = f8789w     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.reflect.Field r4 = f8790x     // Catch:{ IllegalAccessException -> 0x0040 }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ IllegalAccessException -> 0x0040 }
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2     // Catch:{ IllegalAccessException -> 0x0040 }
            h0.u0$b r5 = l(r6, r3, r2, r5)     // Catch:{ IllegalAccessException -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return r5
        L_0x003e:
            r5 = move-exception
            goto L_0x0045
        L_0x0040:
            r5 = 1
            f8791y = r5     // Catch:{ all -> 0x003e }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return r1
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.w1.e(android.app.Notification, int):h0.u0$b");
    }

    public static int f(Notification notification) {
        int length;
        synchronized (f8786t) {
            Object[] h10 = h(notification);
            length = h10 != null ? h10.length : 0;
        }
        return length;
    }

    public static u0.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        boolean z10 = false;
        if (bundle2 != null) {
            z10 = bundle2.getBoolean(f8769c, false);
        }
        return new u0.b(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f8772f), bundle.getBundle("extras"), d(i(bundle, f8774h)), d(i(bundle, f8775i)), z10, bundle.getInt(f8781o), bundle.getBoolean(f8782p), false);
    }

    public static Object[] h(Notification notification) {
        synchronized (f8786t) {
            if (!b()) {
                return null;
            }
            try {
                Object[] objArr = (Object[]) f8787u.get(notification);
                return objArr;
            } catch (IllegalAccessException unused) {
                f8791y = true;
                return null;
            }
        }
    }

    public static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static Bundle j(u0.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat f10 = bVar.f();
        bundle.putInt("icon", f10 != null ? f10.B() : 0);
        bundle.putCharSequence("title", bVar.j());
        bundle.putParcelable(f8772f, bVar.a());
        Bundle bundle2 = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle2.putBoolean(f8769c, bVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray(f8774h, n(bVar.g()));
        bundle.putBoolean(f8782p, bVar.i());
        bundle.putInt(f8781o, bVar.h());
        return bundle;
    }

    public static Bundle k(Notification notification) {
        synchronized (f8783q) {
            if (f8785s) {
                return null;
            }
            try {
                if (f8784r == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f8785s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f8784r = declaredField;
                }
                Bundle bundle = (Bundle) f8784r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f8784r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f8785s = true;
                return null;
            }
        }
    }

    public static u0.b l(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z10;
        v2[] v2VarArr;
        v2[] v2VarArr2;
        if (bundle != null) {
            v2VarArr2 = d(i(bundle, v1.f8742f));
            v2VarArr = d(i(bundle, f8768b));
            z10 = bundle.getBoolean(f8769c);
        } else {
            v2VarArr2 = null;
            v2VarArr = null;
            z10 = false;
        }
        return new u0.b(i10, charSequence, pendingIntent, bundle, v2VarArr2, v2VarArr, z10, 0, true, false);
    }

    public static Bundle m(v2 v2Var) {
        Bundle bundle = new Bundle();
        bundle.putString(f8776j, v2Var.o());
        bundle.putCharSequence(f8777k, v2Var.n());
        bundle.putCharSequenceArray(f8778l, v2Var.h());
        bundle.putBoolean(f8779m, v2Var.f());
        bundle.putBundle("extras", v2Var.m());
        Set<String> g10 = v2Var.g();
        if (g10 != null && !g10.isEmpty()) {
            ArrayList arrayList = new ArrayList(g10.size());
            for (String add : g10) {
                arrayList.add(add);
            }
            bundle.putStringArrayList(f8780n, arrayList);
        }
        return bundle;
    }

    public static Bundle[] n(v2[] v2VarArr) {
        if (v2VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[v2VarArr.length];
        for (int i10 = 0; i10 < v2VarArr.length; i10++) {
            bundleArr[i10] = m(v2VarArr[i10]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, u0.b bVar) {
        IconCompat f10 = bVar.f();
        builder.addAction(f10 != null ? f10.B() : 0, bVar.j(), bVar.a());
        Bundle bundle = new Bundle(bVar.d());
        if (bVar.g() != null) {
            bundle.putParcelableArray(v1.f8742f, n(bVar.g()));
        }
        if (bVar.c() != null) {
            bundle.putParcelableArray(f8768b, n(bVar.c()));
        }
        bundle.putBoolean(f8769c, bVar.b());
        return bundle;
    }
}
