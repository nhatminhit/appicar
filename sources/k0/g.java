package k0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import d.l;
import d.m0;
import d.n;
import d.o0;
import d.p;
import d.t0;
import d.u;
import d.w;
import d.x0;
import e1.i;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9909a = "ResourcesCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f9910b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f9911c = new WeakHashMap<>(0);

    /* renamed from: d  reason: collision with root package name */
    public static final Object f9912d = new Object();
    @d.c

    /* renamed from: e  reason: collision with root package name */
    public static final int f9913e = 0;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f9914a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f9915b;

        public a(@m0 ColorStateList colorStateList, @m0 Configuration configuration) {
            this.f9914a = colorStateList;
            this.f9915b = configuration;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f9916a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f9917b;

        public b(@m0 Resources resources, @o0 Resources.Theme theme) {
            this.f9916a = resources;
            this.f9917b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9916a.equals(bVar.f9916a) && i.a(this.f9917b, bVar.f9917b);
        }

        public int hashCode() {
            return i.b(this.f9916a, this.f9917b);
        }
    }

    public static abstract class c {

        public class a implements Runnable {
            public final /* synthetic */ Typeface O;

            public a(Typeface typeface) {
                this.O = typeface;
            }

            public void run() {
                c.this.e(this.O);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ int O;

            public b(int i10) {
                this.O = i10;
            }

            public void run() {
                c.this.d(this.O);
            }
        }

        @x0({x0.a.LIBRARY})
        @m0
        public static Handler c(@o0 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public final void a(int i10, @o0 Handler handler) {
            c(handler).post(new b(i10));
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public final void b(Typeface typeface, @o0 Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i10);

        public abstract void e(@m0 Typeface typeface);
    }

    @t0(29)
    public static class d {
        public static float a(@m0 Resources resources, @p int i10) {
            return resources.getFloat(i10);
        }
    }

    public static final class e {

        @t0(23)
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final Object f9918a = new Object();

            /* renamed from: b  reason: collision with root package name */
            public static Method f9919b;

            /* renamed from: c  reason: collision with root package name */
            public static boolean f9920c;

            /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static void a(@d.m0 android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = f9918a
                    monitor-enter(r0)
                    boolean r1 = f9920c     // Catch:{ all -> 0x0029 }
                    r2 = 0
                    if (r1 != 0) goto L_0x001a
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0018 }
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0018 }
                    f9919b = r3     // Catch:{ NoSuchMethodException -> 0x0018 }
                    r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0018 }
                L_0x0018:
                    f9920c = r1     // Catch:{ all -> 0x0029 }
                L_0x001a:
                    java.lang.reflect.Method r1 = f9919b     // Catch:{ all -> 0x0029 }
                    if (r1 == 0) goto L_0x0027
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    r1.invoke(r6, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    goto L_0x0027
                L_0x0024:
                    r6 = 0
                    f9919b = r6     // Catch:{ all -> 0x0029 }
                L_0x0027:
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    return
                L_0x0029:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: k0.g.e.a.a(android.content.res.Resources$Theme):void");
            }
        }

        @t0(29)
        public static class b {
            public static void a(@m0 Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(@m0 Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static void a(@m0 b bVar, @n int i10, @m0 ColorStateList colorStateList) {
        synchronized (f9912d) {
            WeakHashMap<b, SparseArray<a>> weakHashMap = f9911c;
            SparseArray sparseArray = weakHashMap.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(bVar, sparseArray);
            }
            sparseArray.append(i10, new a(colorStateList, bVar.f9916a.getConfiguration()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return null;
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(@d.m0 k0.g.b r4, @d.n int r5) {
        /*
            java.lang.Object r0 = f9912d
            monitor-enter(r0)
            java.util.WeakHashMap<k0.g$b, android.util.SparseArray<k0.g$a>> r1 = f9911c     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0033 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0030
            int r2 = r1.size()     // Catch:{ all -> 0x0033 }
            if (r2 <= 0) goto L_0x0030
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0033 }
            k0.g$a r2 = (k0.g.a) r2     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0030
            android.content.res.Configuration r3 = r2.f9915b     // Catch:{ all -> 0x0033 }
            android.content.res.Resources r4 = r4.f9916a     // Catch:{ all -> 0x0033 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0033 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002d
            android.content.res.ColorStateList r4 = r2.f9914a     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002d:
            r1.remove(r5)     // Catch:{ all -> 0x0033 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            r4 = 0
            return r4
        L_0x0033:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g.b(k0.g$b, int):android.content.res.ColorStateList");
    }

    @o0
    public static Typeface c(@m0 Context context, @w int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return o(context, i10, new TypedValue(), 0, (c) null, (Handler) null, false, true);
    }

    @l
    public static int d(@m0 Resources resources, @n int i10, @o0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getColor(i10, theme);
    }

    @o0
    public static ColorStateList e(@m0 Resources resources, @n int i10, @o0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getColorStateList(i10, theme);
    }

    @o0
    public static Drawable f(@m0 Resources resources, @u int i10, @o0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawable(i10, theme);
    }

    @o0
    public static Drawable g(@m0 Resources resources, @u int i10, int i11, @o0 Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawableForDensity(i10, i11, theme);
    }

    public static float h(@m0 Resources resources, @p int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(resources, i10);
        }
        TypedValue l10 = l();
        resources.getValue(i10, l10, true);
        if (l10.type == 4) {
            return l10.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(l10.type) + " is not valid");
    }

    @o0
    public static Typeface i(@m0 Context context, @w int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return o(context, i10, new TypedValue(), 0, (c) null, (Handler) null, false, false);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface j(@m0 Context context, @w int i10, TypedValue typedValue, int i11, @o0 c cVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return o(context, i10, typedValue, i11, cVar, (Handler) null, true, false);
    }

    public static void k(@m0 Context context, @w int i10, @m0 c cVar, @o0 Handler handler) throws Resources.NotFoundException {
        e1.n.g(cVar);
        if (context.isRestricted()) {
            cVar.a(-4, handler);
            return;
        }
        o(context, i10, new TypedValue(), 0, cVar, handler, false, false);
    }

    @m0
    public static TypedValue l() {
        ThreadLocal<TypedValue> threadLocal = f9910b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @o0
    public static ColorStateList m(Resources resources, int i10, @o0 Resources.Theme theme) {
        if (n(resources, i10)) {
            return null;
        }
        try {
            return a.a(resources, resources.getXml(i10), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean n(@m0 Resources resources, @n int i10) {
        TypedValue l10 = l();
        resources.getValue(i10, l10, true);
        int i11 = l10.type;
        return i11 >= 28 && i11 <= 31;
    }

    public static Typeface o(@m0 Context context, int i10, TypedValue typedValue, int i11, @o0 c cVar, @o0 Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        int i12 = i10;
        resources.getValue(i10, typedValue, true);
        Typeface p10 = p(context, resources, typedValue, i10, i11, cVar, handler, z10, z11);
        if (p10 != null || cVar != null || z11) {
            return p10;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface p(@d.m0 android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, @d.o0 k0.g.c r18, @d.o0 android.os.Handler r19, boolean r20, boolean r21) {
        /*
            r2 = r14
            r0 = r15
            r3 = r16
            r4 = r17
            r8 = r18
            r9 = r19
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x008a
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r10.startsWith(r0)
            r11 = -3
            r12 = 0
            if (r0 != 0) goto L_0x0022
            if (r8 == 0) goto L_0x0021
            r8.a(r11, r9)
        L_0x0021:
            return r12
        L_0x0022:
            android.graphics.Typeface r0 = n0.x0.g(r14, r3, r4)
            if (r0 == 0) goto L_0x002e
            if (r8 == 0) goto L_0x002d
            r8.b(r0, r9)
        L_0x002d:
            return r0
        L_0x002e:
            if (r21 == 0) goto L_0x0031
            return r12
        L_0x0031:
            java.lang.String r0 = r10.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0077, IOException -> 0x006f }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x0077, IOException -> 0x006f }
            if (r0 == 0) goto L_0x005e
            android.content.res.XmlResourceParser r0 = r14.getXml(r3)     // Catch:{ XmlPullParserException -> 0x0077, IOException -> 0x006f }
            k0.d$a r1 = k0.d.b(r0, r14)     // Catch:{ XmlPullParserException -> 0x0077, IOException -> 0x006f }
            if (r1 != 0) goto L_0x004d
            if (r8 == 0) goto L_0x004c
            r8.a(r11, r9)     // Catch:{ XmlPullParserException -> 0x0077, IOException -> 0x006f }
        L_0x004c:
            return r12
        L_0x004d:
            r0 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            android.graphics.Typeface r0 = n0.x0.d(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x0077, IOException -> 0x006f }
            return r0
        L_0x005e:
            r0 = r13
            android.graphics.Typeface r0 = n0.x0.e(r13, r14, r3, r10, r4)     // Catch:{ XmlPullParserException -> 0x0077, IOException -> 0x006f }
            if (r8 == 0) goto L_0x006e
            if (r0 == 0) goto L_0x006b
            r8.b(r0, r9)     // Catch:{ XmlPullParserException -> 0x0077, IOException -> 0x006f }
            goto L_0x006e
        L_0x006b:
            r8.a(r11, r9)     // Catch:{ XmlPullParserException -> 0x0077, IOException -> 0x006f }
        L_0x006e:
            return r0
        L_0x006f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            goto L_0x007e
        L_0x0077:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
        L_0x007e:
            r0.append(r1)
            r0.append(r10)
            if (r8 == 0) goto L_0x0089
            r8.a(r11, r9)
        L_0x0089:
            return r12
        L_0x008a:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r14.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.g.p(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, k0.g$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
