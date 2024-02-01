package g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import d.m0;
import d.n;
import d.o0;
import d.u;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7506a = "AppCompatResources";

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f7507b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<C0130a>> f7508c = new WeakHashMap<>(0);

    /* renamed from: d  reason: collision with root package name */
    public static final Object f7509d = new Object();

    /* renamed from: g.a$a  reason: collision with other inner class name */
    public static class C0130a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f7510a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f7511b;

        public C0130a(@m0 ColorStateList colorStateList, @m0 Configuration configuration) {
            this.f7510a = colorStateList;
            this.f7511b = configuration;
        }
    }

    public static void a(@m0 Context context, @n int i10, @m0 ColorStateList colorStateList) {
        synchronized (f7509d) {
            WeakHashMap<Context, SparseArray<C0130a>> weakHashMap = f7508c;
            SparseArray sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i10, new C0130a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(@d.m0 android.content.Context r4, @d.n int r5) {
        /*
            java.lang.Object r0 = f7509d
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<g.a$a>> r1 = f7508c     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            g.a$a r2 = (g.a.C0130a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f7511b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f7510a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.b(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static ColorStateList c(@m0 Context context, @n int i10) {
        return context.getColorStateList(i10);
    }

    @o0
    public static Drawable d(@m0 Context context, @u int i10) {
        return androidx.appcompat.widget.m0.h().j(context, i10);
    }

    @m0
    public static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f7507b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @o0
    public static ColorStateList f(Context context, int i10) {
        if (g(context, i10)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return k0.a.a(resources, resources.getXml(i10), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean g(@m0 Context context, @n int i10) {
        Resources resources = context.getResources();
        TypedValue e10 = e();
        resources.getValue(i10, e10, true);
        int i11 = e10.type;
        return i11 >= 28 && i11 <= 31;
    }
}
