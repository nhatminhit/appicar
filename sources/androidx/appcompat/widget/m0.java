package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.collection.i;
import androidx.collection.j;
import d.o0;
import d.u;
import d.x0;
import i.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@x0({x0.a.Q})
public final class m0 {

    /* renamed from: h  reason: collision with root package name */
    public static final String f1360h = "ResourceManagerInternal";

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f1361i = false;

    /* renamed from: j  reason: collision with root package name */
    public static final PorterDuff.Mode f1362j = PorterDuff.Mode.SRC_IN;

    /* renamed from: k  reason: collision with root package name */
    public static final String f1363k = "appcompat_skip_skip";

    /* renamed from: l  reason: collision with root package name */
    public static final String f1364l = "android.graphics.drawable.VectorDrawable";

    /* renamed from: m  reason: collision with root package name */
    public static m0 f1365m;

    /* renamed from: n  reason: collision with root package name */
    public static final c f1366n = new c(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, j<ColorStateList>> f1367a;

    /* renamed from: b  reason: collision with root package name */
    public i<String, e> f1368b;

    /* renamed from: c  reason: collision with root package name */
    public j<String> f1369c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, androidx.collection.f<WeakReference<Drawable.ConstantState>>> f1370d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1371e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1372f;

    /* renamed from: g  reason: collision with root package name */
    public f f1373g;

    public static class a implements e {
        public Drawable a(@d.m0 Context context, @d.m0 XmlPullParser xmlPullParser, @d.m0 AttributeSet attributeSet, @o0 Resources.Theme theme) {
            try {
                return h.a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class b implements e {
        public Drawable a(@d.m0 Context context, @d.m0 XmlPullParser xmlPullParser, @d.m0 AttributeSet attributeSet, @o0 Resources.Theme theme) {
            try {
                return j3.c.e(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class c extends androidx.collection.g<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        public static int s(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter t(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) f(Integer.valueOf(s(i10, mode)));
        }

        public PorterDuffColorFilter u(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) j(Integer.valueOf(s(i10, mode)), porterDuffColorFilter);
        }
    }

    public static class d implements e {
        public Drawable a(@d.m0 Context context, @d.m0 XmlPullParser xmlPullParser, @d.m0 AttributeSet attributeSet, @o0 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public interface e {
        Drawable a(@d.m0 Context context, @d.m0 XmlPullParser xmlPullParser, @d.m0 AttributeSet attributeSet, @o0 Resources.Theme theme);
    }

    @x0({x0.a.Q})
    public interface f {
        boolean a(@d.m0 Context context, @u int i10, @d.m0 Drawable drawable);

        @o0
        PorterDuff.Mode b(int i10);

        @o0
        Drawable c(@d.m0 m0 m0Var, @d.m0 Context context, @u int i10);

        @o0
        ColorStateList d(@d.m0 Context context, @u int i10);

        boolean e(@d.m0 Context context, @u int i10, @d.m0 Drawable drawable);
    }

    public static class g implements e {
        public Drawable a(@d.m0 Context context, @d.m0 XmlPullParser xmlPullParser, @d.m0 AttributeSet attributeSet, @o0 Resources.Theme theme) {
            try {
                return j3.i.e(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        m0 m0Var;
        synchronized (m0.class) {
            if (f1365m == null) {
                m0 m0Var2 = new m0();
                f1365m = m0Var2;
                p(m0Var2);
            }
            m0Var = f1365m;
        }
        return m0Var;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter t10;
        synchronized (m0.class) {
            c cVar = f1366n;
            t10 = cVar.t(i10, mode);
            if (t10 == null) {
                t10 = new PorterDuffColorFilter(i10, mode);
                cVar.u(i10, mode, t10);
            }
        }
        return t10;
    }

    public static void p(@d.m0 m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a(j3.i.f9452d0, new g());
            m0Var.a(j3.c.X, new b());
            m0Var.a("animated-selector", new a());
            m0Var.a("drawable", new d());
        }
    }

    public static boolean q(@d.m0 Drawable drawable) {
        return (drawable instanceof j3.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, u0 u0Var, int[] iArr) {
        if (!b0.a(drawable) || drawable.mutate() == drawable) {
            boolean z10 = u0Var.f1464d;
            if (z10 || u0Var.f1463c) {
                drawable.setColorFilter(g(z10 ? u0Var.f1461a : null, u0Var.f1463c ? u0Var.f1462b : f1362j, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final void a(@d.m0 String str, @d.m0 e eVar) {
        if (this.f1368b == null) {
            this.f1368b = new i<>();
        }
        this.f1368b.put(str, eVar);
    }

    public final synchronized boolean b(@d.m0 Context context, long j10, @d.m0 Drawable drawable) {
        boolean z10;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            androidx.collection.f fVar = this.f1370d.get(context);
            if (fVar == null) {
                fVar = new androidx.collection.f();
                this.f1370d.put(context, fVar);
            }
            fVar.u(j10, new WeakReference(constantState));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final void c(@d.m0 Context context, @u int i10, @d.m0 ColorStateList colorStateList) {
        if (this.f1367a == null) {
            this.f1367a = new WeakHashMap<>();
        }
        j jVar = this.f1367a.get(context);
        if (jVar == null) {
            jVar = new j();
            this.f1367a.put(context, jVar);
        }
        jVar.a(i10, colorStateList);
    }

    public final void d(@d.m0 Context context) {
        if (!this.f1372f) {
            this.f1372f = true;
            Drawable j10 = j(context, a.d.abc_vector_test);
            if (j10 == null || !q(j10)) {
                this.f1372f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    public final Drawable f(@d.m0 Context context, @u int i10) {
        if (this.f1371e == null) {
            this.f1371e = new TypedValue();
        }
        TypedValue typedValue = this.f1371e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        f fVar = this.f1373g;
        Drawable c10 = fVar == null ? null : fVar.c(this, context, i10);
        if (c10 != null) {
            c10.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, c10);
        }
        return c10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable i(@d.m0 android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, androidx.collection.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1370d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            androidx.collection.f r0 = (androidx.collection.f) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.n(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.x(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public synchronized Drawable j(@d.m0 Context context, @u int i10) {
        return k(context, i10, false);
    }

    public synchronized Drawable k(@d.m0 Context context, @u int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = i0.d.i(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            b0.b(r10);
        }
        return r10;
    }

    public synchronized ColorStateList m(@d.m0 Context context, @u int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            f fVar = this.f1373g;
            n10 = fVar == null ? null : fVar.d(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    public final ColorStateList n(@d.m0 Context context, @u int i10) {
        j jVar;
        WeakHashMap<Context, j<ColorStateList>> weakHashMap = this.f1367a;
        if (weakHashMap == null || (jVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) jVar.n(i10);
    }

    public PorterDuff.Mode o(int i10) {
        f fVar = this.f1373g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable r(@d.m0 android.content.Context r11, @d.u int r12) {
        /*
            r10 = this;
            androidx.collection.i<java.lang.String, androidx.appcompat.widget.m0$e> r0 = r10.f1368b
            r1 = 0
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00aa
            androidx.collection.j<java.lang.String> r0 = r10.f1369c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.n(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            androidx.collection.i<java.lang.String, androidx.appcompat.widget.m0$e> r3 = r10.f1368b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            androidx.collection.j r0 = new androidx.collection.j
            r0.<init>()
            r10.f1369c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1371e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1371e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1371e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = e(r0)
            android.graphics.drawable.Drawable r6 = r10.i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00a2
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.j<java.lang.String> r8 = r10.f1369c     // Catch:{ Exception -> 0x00a2 }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.i<java.lang.String, androidx.appcompat.widget.m0$e> r8 = r10.f1368b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.m0$e r3 = (androidx.appcompat.widget.m0.e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00a2
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00a2
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            if (r6 != 0) goto L_0x00a9
            androidx.collection.j<java.lang.String> r11 = r10.f1369c
            r11.a(r12, r2)
        L_0x00a9:
            return r6
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public synchronized void s(@d.m0 Context context) {
        androidx.collection.f fVar = this.f1370d.get(context);
        if (fVar != null) {
            fVar.d();
        }
    }

    public synchronized Drawable t(@d.m0 Context context, @d.m0 c1 c1Var, @u int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = c1Var.d(i10);
        }
        if (r10 == null) {
            return null;
        }
        return v(context, i10, false, r10);
    }

    public synchronized void u(f fVar) {
        this.f1373g = fVar;
    }

    public final Drawable v(@d.m0 Context context, @u int i10, boolean z10, @d.m0 Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 != null) {
            if (b0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r10 = o0.d.r(drawable);
            o0.d.o(r10, m10);
            PorterDuff.Mode o10 = o(i10);
            if (o10 == null) {
                return r10;
            }
            o0.d.p(r10, o10);
            return r10;
        }
        f fVar = this.f1373g;
        if ((fVar == null || !fVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    public boolean x(@d.m0 Context context, @u int i10, @d.m0 Drawable drawable) {
        f fVar = this.f1373g;
        return fVar != null && fVar.a(context, i10, drawable);
    }
}
