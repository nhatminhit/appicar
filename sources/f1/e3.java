package f1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import d.e0;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import n0.h0;

public class e3 {

    /* renamed from: b  reason: collision with root package name */
    public static final String f7069b = "WindowInsetsCompat";
    @m0

    /* renamed from: c  reason: collision with root package name */
    public static final e3 f7070c = (Build.VERSION.SDK_INT >= 30 ? k.f7101r : l.f7102b);

    /* renamed from: a  reason: collision with root package name */
    public final l f7071a;

    @t0(21)
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f7072a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f7073b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f7074c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f7075d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f7072a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f7073b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f7074c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to get visible insets from AttachInfo ");
                sb2.append(e10.getMessage());
            }
        }

        @o0
        public static e3 a(@m0 View view) {
            if (f7075d && view.isAttachedToWindow()) {
                try {
                    Object obj = f7072a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f7073b.get(obj);
                        Rect rect2 = (Rect) f7074c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            e3 a10 = new b().f(h0.e(rect)).h(h0.e(rect2)).a();
                            a10.H(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to get insets from AttachInfo. ");
                    sb2.append(e10.getMessage());
                }
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f7076a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f7076a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(@m0 e3 e3Var) {
            int i10 = Build.VERSION.SDK_INT;
            this.f7076a = i10 >= 30 ? new e(e3Var) : i10 >= 29 ? new d(e3Var) : new c(e3Var);
        }

        @m0
        public e3 a() {
            return this.f7076a.b();
        }

        @m0
        public b b(@o0 f fVar) {
            this.f7076a.c(fVar);
            return this;
        }

        @m0
        public b c(int i10, @m0 h0 h0Var) {
            this.f7076a.d(i10, h0Var);
            return this;
        }

        @m0
        public b d(int i10, @m0 h0 h0Var) {
            this.f7076a.e(i10, h0Var);
            return this;
        }

        @Deprecated
        @m0
        public b e(@m0 h0 h0Var) {
            this.f7076a.f(h0Var);
            return this;
        }

        @Deprecated
        @m0
        public b f(@m0 h0 h0Var) {
            this.f7076a.g(h0Var);
            return this;
        }

        @Deprecated
        @m0
        public b g(@m0 h0 h0Var) {
            this.f7076a.h(h0Var);
            return this;
        }

        @Deprecated
        @m0
        public b h(@m0 h0 h0Var) {
            this.f7076a.i(h0Var);
            return this;
        }

        @Deprecated
        @m0
        public b i(@m0 h0 h0Var) {
            this.f7076a.j(h0Var);
            return this;
        }

        @m0
        public b j(int i10, boolean z10) {
            this.f7076a.k(i10, z10);
            return this;
        }
    }

    @t0(api = 20)
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public static Field f7077e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f7078f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Constructor<WindowInsets> f7079g = null;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f7080h = false;

        /* renamed from: c  reason: collision with root package name */
        public WindowInsets f7081c;

        /* renamed from: d  reason: collision with root package name */
        public h0 f7082d;

        public c() {
            this.f7081c = l();
        }

        public c(@m0 e3 e3Var) {
            super(e3Var);
            this.f7081c = e3Var.J();
        }

        @o0
        private static WindowInsets l() {
            if (!f7078f) {
                try {
                    f7077e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f7078f = true;
            }
            Field field = f7077e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f7080h) {
                try {
                    f7079g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f7080h = true;
            }
            Constructor<WindowInsets> constructor = f7079g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @m0
        public e3 b() {
            a();
            e3 K = e3.K(this.f7081c);
            K.F(this.f7085b);
            K.I(this.f7082d);
            return K;
        }

        public void g(@o0 h0 h0Var) {
            this.f7082d = h0Var;
        }

        public void i(@m0 h0 h0Var) {
            WindowInsets windowInsets = this.f7081c;
            if (windowInsets != null) {
                this.f7081c = windowInsets.replaceSystemWindowInsets(h0Var.f10722a, h0Var.f10723b, h0Var.f10724c, h0Var.f10725d);
            }
        }
    }

    @t0(api = 29)
    public static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets$Builder f7083c;

        public d() {
            this.f7083c = new WindowInsets$Builder();
        }

        public d(@m0 e3 e3Var) {
            super(e3Var);
            WindowInsets$Builder windowInsets$Builder;
            WindowInsets J = e3Var.J();
            if (J == null) {
                windowInsets$Builder = new WindowInsets$Builder();
            }
            this.f7083c = windowInsets$Builder;
        }

        @m0
        public e3 b() {
            a();
            e3 K = e3.K(this.f7083c.build());
            K.F(this.f7085b);
            return K;
        }

        public void c(@o0 f fVar) {
            this.f7083c.setDisplayCutout(fVar != null ? fVar.h() : null);
        }

        public void f(@m0 h0 h0Var) {
            this.f7083c.setMandatorySystemGestureInsets(h0Var.h());
        }

        public void g(@m0 h0 h0Var) {
            this.f7083c.setStableInsets(h0Var.h());
        }

        public void h(@m0 h0 h0Var) {
            this.f7083c.setSystemGestureInsets(h0Var.h());
        }

        public void i(@m0 h0 h0Var) {
            this.f7083c.setSystemWindowInsets(h0Var.h());
        }

        public void j(@m0 h0 h0Var) {
            this.f7083c.setTappableElementInsets(h0Var.h());
        }
    }

    @t0(30)
    public static class e extends d {
        public e() {
        }

        public e(@m0 e3 e3Var) {
            super(e3Var);
        }

        public void d(int i10, @m0 h0 h0Var) {
            WindowInsets$Builder unused = this.f7083c.setInsets(n.a(i10), h0Var.h());
        }

        public void e(int i10, @m0 h0 h0Var) {
            WindowInsets$Builder unused = this.f7083c.setInsetsIgnoringVisibility(n.a(i10), h0Var.h());
        }

        public void k(int i10, boolean z10) {
            WindowInsets$Builder unused = this.f7083c.setVisible(n.a(i10), z10);
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final e3 f7084a;

        /* renamed from: b  reason: collision with root package name */
        public h0[] f7085b;

        public f() {
            this(new e3((e3) null));
        }

        public f(@m0 e3 e3Var) {
            this.f7084a = e3Var;
        }

        public final void a() {
            h0[] h0VarArr = this.f7085b;
            if (h0VarArr != null) {
                h0 h0Var = h0VarArr[m.e(1)];
                h0 h0Var2 = this.f7085b[m.e(2)];
                if (h0Var2 == null) {
                    h0Var2 = this.f7084a.f(2);
                }
                if (h0Var == null) {
                    h0Var = this.f7084a.f(1);
                }
                i(h0.b(h0Var, h0Var2));
                h0 h0Var3 = this.f7085b[m.e(16)];
                if (h0Var3 != null) {
                    h(h0Var3);
                }
                h0 h0Var4 = this.f7085b[m.e(32)];
                if (h0Var4 != null) {
                    f(h0Var4);
                }
                h0 h0Var5 = this.f7085b[m.e(64)];
                if (h0Var5 != null) {
                    j(h0Var5);
                }
            }
        }

        @m0
        public e3 b() {
            a();
            return this.f7084a;
        }

        public void c(@o0 f fVar) {
        }

        public void d(int i10, @m0 h0 h0Var) {
            if (this.f7085b == null) {
                this.f7085b = new h0[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f7085b[m.e(i11)] = h0Var;
                }
            }
        }

        public void e(int i10, @m0 h0 h0Var) {
            if (i10 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        public void f(@m0 h0 h0Var) {
        }

        public void g(@m0 h0 h0Var) {
        }

        public void h(@m0 h0 h0Var) {
        }

        public void i(@m0 h0 h0Var) {
        }

        public void j(@m0 h0 h0Var) {
        }

        public void k(int i10, boolean z10) {
        }
    }

    @t0(20)
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f7086h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f7087i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f7088j;

        /* renamed from: k  reason: collision with root package name */
        public static Class<?> f7089k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f7090l;

        /* renamed from: m  reason: collision with root package name */
        public static Field f7091m;
        @m0

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f7092c;

        /* renamed from: d  reason: collision with root package name */
        public h0[] f7093d;

        /* renamed from: e  reason: collision with root package name */
        public h0 f7094e;

        /* renamed from: f  reason: collision with root package name */
        public e3 f7095f;

        /* renamed from: g  reason: collision with root package name */
        public h0 f7096g;

        public g(@m0 e3 e3Var, @m0 WindowInsets windowInsets) {
            super(e3Var);
            this.f7094e = null;
            this.f7092c = windowInsets;
        }

        public g(@m0 e3 e3Var, @m0 g gVar) {
            this(e3Var, new WindowInsets(gVar.f7092c));
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f7087i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f7088j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f7089k = cls;
                f7090l = cls.getDeclaredField("mVisibleInsets");
                f7091m = f7088j.getDeclaredField("mAttachInfo");
                f7090l.setAccessible(true);
                f7091m.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to get visible insets. (Reflection error). ");
                sb2.append(e10.getMessage());
            }
            f7086h = true;
        }

        @SuppressLint({"WrongConstant"})
        @m0
        private h0 v(int i10, boolean z10) {
            h0 h0Var = h0.f10721e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    h0Var = h0.b(h0Var, w(i11, z10));
                }
            }
            return h0Var;
        }

        private h0 x() {
            e3 e3Var = this.f7095f;
            return e3Var != null ? e3Var.m() : h0.f10721e;
        }

        @o0
        private h0 y(@m0 View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f7086h) {
                    A();
                }
                Method method = f7087i;
                if (!(method == null || f7089k == null || f7090l == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f7090l.get(f7091m.get(invoke));
                        if (rect != null) {
                            return h0.e(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to get visible insets. (Reflection error). ");
                        sb2.append(e10.getMessage());
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public void d(@m0 View view) {
            h0 y10 = y(view);
            if (y10 == null) {
                y10 = h0.f10721e;
            }
            s(y10);
        }

        public void e(@m0 e3 e3Var) {
            e3Var.H(this.f7095f);
            e3Var.G(this.f7096g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f7096g, ((g) obj).f7096g);
        }

        @m0
        public h0 g(int i10) {
            return v(i10, false);
        }

        @m0
        public h0 h(int i10) {
            return v(i10, true);
        }

        @m0
        public final h0 l() {
            if (this.f7094e == null) {
                this.f7094e = h0.d(this.f7092c.getSystemWindowInsetLeft(), this.f7092c.getSystemWindowInsetTop(), this.f7092c.getSystemWindowInsetRight(), this.f7092c.getSystemWindowInsetBottom());
            }
            return this.f7094e;
        }

        @m0
        public e3 n(int i10, int i11, int i12, int i13) {
            b bVar = new b(e3.K(this.f7092c));
            bVar.h(e3.z(l(), i10, i11, i12, i13));
            bVar.f(e3.z(j(), i10, i11, i12, i13));
            return bVar.a();
        }

        public boolean p() {
            return this.f7092c.isRound();
        }

        @SuppressLint({"WrongConstant"})
        public boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        public void r(h0[] h0VarArr) {
            this.f7093d = h0VarArr;
        }

        public void s(@m0 h0 h0Var) {
            this.f7096g = h0Var;
        }

        public void t(@o0 e3 e3Var) {
            this.f7095f = e3Var;
        }

        @m0
        public h0 w(int i10, boolean z10) {
            int i11;
            if (i10 == 1) {
                return z10 ? h0.d(0, Math.max(x().f10723b, l().f10723b), 0, 0) : h0.d(0, l().f10723b, 0, 0);
            }
            h0 h0Var = null;
            if (i10 != 2) {
                if (i10 == 8) {
                    h0[] h0VarArr = this.f7093d;
                    if (h0VarArr != null) {
                        h0Var = h0VarArr[m.e(8)];
                    }
                    if (h0Var != null) {
                        return h0Var;
                    }
                    h0 l10 = l();
                    h0 x10 = x();
                    int i12 = l10.f10725d;
                    if (i12 > x10.f10725d) {
                        return h0.d(0, 0, 0, i12);
                    }
                    h0 h0Var2 = this.f7096g;
                    return (h0Var2 == null || h0Var2.equals(h0.f10721e) || (i11 = this.f7096g.f10725d) <= x10.f10725d) ? h0.f10721e : h0.d(0, 0, 0, i11);
                } else if (i10 == 16) {
                    return k();
                } else {
                    if (i10 == 32) {
                        return i();
                    }
                    if (i10 == 64) {
                        return m();
                    }
                    if (i10 != 128) {
                        return h0.f10721e;
                    }
                    e3 e3Var = this.f7095f;
                    f e10 = e3Var != null ? e3Var.e() : f();
                    return e10 != null ? h0.d(e10.d(), e10.f(), e10.e(), e10.c()) : h0.f10721e;
                }
            } else if (z10) {
                h0 x11 = x();
                h0 j10 = j();
                return h0.d(Math.max(x11.f10722a, j10.f10722a), 0, Math.max(x11.f10724c, j10.f10724c), Math.max(x11.f10725d, j10.f10725d));
            } else {
                h0 l11 = l();
                e3 e3Var2 = this.f7095f;
                if (e3Var2 != null) {
                    h0Var = e3Var2.m();
                }
                int i13 = l11.f10725d;
                if (h0Var != null) {
                    i13 = Math.min(i13, h0Var.f10725d);
                }
                return h0.d(l11.f10722a, 0, l11.f10724c, i13);
            }
        }

        public boolean z(int i10) {
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 4) {
                    return false;
                }
                if (!(i10 == 8 || i10 == 128)) {
                    return true;
                }
            }
            return !w(i10, false).equals(h0.f10721e);
        }
    }

    @t0(21)
    public static class h extends g {

        /* renamed from: n  reason: collision with root package name */
        public h0 f7097n = null;

        public h(@m0 e3 e3Var, @m0 WindowInsets windowInsets) {
            super(e3Var, windowInsets);
        }

        public h(@m0 e3 e3Var, @m0 h hVar) {
            super(e3Var, (g) hVar);
            this.f7097n = hVar.f7097n;
        }

        @m0
        public e3 b() {
            return e3.K(this.f7092c.consumeStableInsets());
        }

        @m0
        public e3 c() {
            return e3.K(this.f7092c.consumeSystemWindowInsets());
        }

        @m0
        public final h0 j() {
            if (this.f7097n == null) {
                this.f7097n = h0.d(this.f7092c.getStableInsetLeft(), this.f7092c.getStableInsetTop(), this.f7092c.getStableInsetRight(), this.f7092c.getStableInsetBottom());
            }
            return this.f7097n;
        }

        public boolean o() {
            return this.f7092c.isConsumed();
        }

        public void u(@o0 h0 h0Var) {
            this.f7097n = h0Var;
        }
    }

    @t0(28)
    public static class i extends h {
        public i(@m0 e3 e3Var, @m0 WindowInsets windowInsets) {
            super(e3Var, windowInsets);
        }

        public i(@m0 e3 e3Var, @m0 i iVar) {
            super(e3Var, (h) iVar);
        }

        @m0
        public e3 a() {
            return e3.K(this.f7092c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f7092c, iVar.f7092c) && Objects.equals(this.f7096g, iVar.f7096g);
        }

        @o0
        public f f() {
            return f.i(this.f7092c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f7092c.hashCode();
        }
    }

    @t0(29)
    public static class j extends i {

        /* renamed from: o  reason: collision with root package name */
        public h0 f7098o = null;

        /* renamed from: p  reason: collision with root package name */
        public h0 f7099p = null;

        /* renamed from: q  reason: collision with root package name */
        public h0 f7100q = null;

        public j(@m0 e3 e3Var, @m0 WindowInsets windowInsets) {
            super(e3Var, windowInsets);
        }

        public j(@m0 e3 e3Var, @m0 j jVar) {
            super(e3Var, (i) jVar);
        }

        @m0
        public h0 i() {
            if (this.f7099p == null) {
                this.f7099p = h0.g(this.f7092c.getMandatorySystemGestureInsets());
            }
            return this.f7099p;
        }

        @m0
        public h0 k() {
            if (this.f7098o == null) {
                this.f7098o = h0.g(this.f7092c.getSystemGestureInsets());
            }
            return this.f7098o;
        }

        @m0
        public h0 m() {
            if (this.f7100q == null) {
                this.f7100q = h0.g(this.f7092c.getTappableElementInsets());
            }
            return this.f7100q;
        }

        @m0
        public e3 n(int i10, int i11, int i12, int i13) {
            return e3.K(this.f7092c.inset(i10, i11, i12, i13));
        }

        public void u(@o0 h0 h0Var) {
        }
    }

    @t0(30)
    public static class k extends j {
        @m0

        /* renamed from: r  reason: collision with root package name */
        public static final e3 f7101r = e3.K(WindowInsets.CONSUMED);

        public k(@m0 e3 e3Var, @m0 WindowInsets windowInsets) {
            super(e3Var, windowInsets);
        }

        public k(@m0 e3 e3Var, @m0 k kVar) {
            super(e3Var, (j) kVar);
        }

        public final void d(@m0 View view) {
        }

        @m0
        public h0 g(int i10) {
            return h0.g(this.f7092c.getInsets(n.a(i10)));
        }

        @m0
        public h0 h(int i10) {
            return h0.g(this.f7092c.getInsetsIgnoringVisibility(n.a(i10)));
        }

        public boolean q(int i10) {
            return this.f7092c.isVisible(n.a(i10));
        }
    }

    public static class l {
        @m0

        /* renamed from: b  reason: collision with root package name */
        public static final e3 f7102b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        public final e3 f7103a;

        public l(@m0 e3 e3Var) {
            this.f7103a = e3Var;
        }

        @m0
        public e3 a() {
            return this.f7103a;
        }

        @m0
        public e3 b() {
            return this.f7103a;
        }

        @m0
        public e3 c() {
            return this.f7103a;
        }

        public void d(@m0 View view) {
        }

        public void e(@m0 e3 e3Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && e1.i.a(l(), lVar.l()) && e1.i.a(j(), lVar.j()) && e1.i.a(f(), lVar.f());
        }

        @o0
        public f f() {
            return null;
        }

        @m0
        public h0 g(int i10) {
            return h0.f10721e;
        }

        @m0
        public h0 h(int i10) {
            if ((i10 & 8) == 0) {
                return h0.f10721e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return e1.i.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @m0
        public h0 i() {
            return l();
        }

        @m0
        public h0 j() {
            return h0.f10721e;
        }

        @m0
        public h0 k() {
            return l();
        }

        @m0
        public h0 l() {
            return h0.f10721e;
        }

        @m0
        public h0 m() {
            return l();
        }

        @m0
        public e3 n(int i10, int i11, int i12, int i13) {
            return f7102b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i10) {
            return true;
        }

        public void r(h0[] h0VarArr) {
        }

        public void s(@m0 h0 h0Var) {
        }

        public void t(@o0 e3 e3Var) {
        }

        public void u(h0 h0Var) {
        }
    }

    public static final class m {

        /* renamed from: a  reason: collision with root package name */
        public static final int f7104a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f7105b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7106c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7107d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f7108e = 8;

        /* renamed from: f  reason: collision with root package name */
        public static final int f7109f = 16;

        /* renamed from: g  reason: collision with root package name */
        public static final int f7110g = 32;

        /* renamed from: h  reason: collision with root package name */
        public static final int f7111h = 64;

        /* renamed from: i  reason: collision with root package name */
        public static final int f7112i = 128;

        /* renamed from: j  reason: collision with root package name */
        public static final int f7113j = 256;

        /* renamed from: k  reason: collision with root package name */
        public static final int f7114k = 9;

        /* renamed from: l  reason: collision with root package name */
        public static final int f7115l = 256;

        @x0({x0.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @x0({x0.a.LIBRARY_GROUP})
        @SuppressLint({"WrongConstant"})
        public static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        public static int e(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    @t0(30)
    public static final class n {
        private n() {
        }

        public static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets$Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets$Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets$Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets$Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets$Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets$Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets$Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    @t0(20)
    public e3(@m0 WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f7071a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public e3(@o0 e3 e3Var) {
        if (e3Var != null) {
            l lVar = e3Var.f7071a;
            int i10 = Build.VERSION.SDK_INT;
            this.f7071a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
            lVar.e(this);
            return;
        }
        this.f7071a = new l(this);
    }

    @t0(20)
    @m0
    public static e3 K(@m0 WindowInsets windowInsets) {
        return L(windowInsets, (View) null);
    }

    @t0(20)
    @m0
    public static e3 L(@m0 WindowInsets windowInsets, @o0 View view) {
        e3 e3Var = new e3((WindowInsets) e1.n.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            e3Var.H(w1.n0(view));
            e3Var.d(view.getRootView());
        }
        return e3Var;
    }

    public static h0 z(@m0 h0 h0Var, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, h0Var.f10722a - i10);
        int max2 = Math.max(0, h0Var.f10723b - i11);
        int max3 = Math.max(0, h0Var.f10724c - i12);
        int max4 = Math.max(0, h0Var.f10725d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? h0Var : h0.d(max, max2, max3, max4);
    }

    public boolean A() {
        return this.f7071a.o();
    }

    public boolean B() {
        return this.f7071a.p();
    }

    public boolean C(int i10) {
        return this.f7071a.q(i10);
    }

    @Deprecated
    @m0
    public e3 D(int i10, int i11, int i12, int i13) {
        return new b(this).h(h0.d(i10, i11, i12, i13)).a();
    }

    @Deprecated
    @m0
    public e3 E(@m0 Rect rect) {
        return new b(this).h(h0.e(rect)).a();
    }

    public void F(h0[] h0VarArr) {
        this.f7071a.r(h0VarArr);
    }

    public void G(@m0 h0 h0Var) {
        this.f7071a.s(h0Var);
    }

    public void H(@o0 e3 e3Var) {
        this.f7071a.t(e3Var);
    }

    public void I(@o0 h0 h0Var) {
        this.f7071a.u(h0Var);
    }

    @t0(20)
    @o0
    public WindowInsets J() {
        l lVar = this.f7071a;
        if (lVar instanceof g) {
            return ((g) lVar).f7092c;
        }
        return null;
    }

    @Deprecated
    @m0
    public e3 a() {
        return this.f7071a.a();
    }

    @Deprecated
    @m0
    public e3 b() {
        return this.f7071a.b();
    }

    @Deprecated
    @m0
    public e3 c() {
        return this.f7071a.c();
    }

    public void d(@m0 View view) {
        this.f7071a.d(view);
    }

    @o0
    public f e() {
        return this.f7071a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        return e1.i.a(this.f7071a, ((e3) obj).f7071a);
    }

    @m0
    public h0 f(int i10) {
        return this.f7071a.g(i10);
    }

    @m0
    public h0 g(int i10) {
        return this.f7071a.h(i10);
    }

    @Deprecated
    @m0
    public h0 h() {
        return this.f7071a.i();
    }

    public int hashCode() {
        l lVar = this.f7071a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f7071a.j().f10725d;
    }

    @Deprecated
    public int j() {
        return this.f7071a.j().f10722a;
    }

    @Deprecated
    public int k() {
        return this.f7071a.j().f10724c;
    }

    @Deprecated
    public int l() {
        return this.f7071a.j().f10723b;
    }

    @Deprecated
    @m0
    public h0 m() {
        return this.f7071a.j();
    }

    @Deprecated
    @m0
    public h0 n() {
        return this.f7071a.k();
    }

    @Deprecated
    public int o() {
        return this.f7071a.l().f10725d;
    }

    @Deprecated
    public int p() {
        return this.f7071a.l().f10722a;
    }

    @Deprecated
    public int q() {
        return this.f7071a.l().f10724c;
    }

    @Deprecated
    public int r() {
        return this.f7071a.l().f10723b;
    }

    @Deprecated
    @m0
    public h0 s() {
        return this.f7071a.l();
    }

    @Deprecated
    @m0
    public h0 t() {
        return this.f7071a.m();
    }

    public boolean u() {
        h0 f10 = f(m.a());
        h0 h0Var = h0.f10721e;
        return !f10.equals(h0Var) || !g(m.a() ^ m.d()).equals(h0Var) || e() != null;
    }

    @Deprecated
    public boolean v() {
        return !this.f7071a.j().equals(h0.f10721e);
    }

    @Deprecated
    public boolean w() {
        return !this.f7071a.l().equals(h0.f10721e);
    }

    @m0
    public e3 x(@e0(from = 0) int i10, @e0(from = 0) int i11, @e0(from = 0) int i12, @e0(from = 0) int i13) {
        return this.f7071a.n(i10, i11, i12, i13);
    }

    @m0
    public e3 y(@m0 h0 h0Var) {
        return x(h0Var.f10722a, h0Var.f10723b, h0Var.f10724c, h0Var.f10725d);
    }
}
