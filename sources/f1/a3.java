package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import d.m0;
import d.o0;
import d.t0;
import d.v;
import d.x0;
import e0.a;
import f1.e3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import n0.h0;

public final class a3 {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f7005b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final String f7006c = "WindowInsetsAnimCompat";

    /* renamed from: a  reason: collision with root package name */
    public e f7007a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h0 f7008a;

        /* renamed from: b  reason: collision with root package name */
        public final h0 f7009b;

        @t0(30)
        public a(@m0 WindowInsetsAnimation.Bounds bounds) {
            this.f7008a = d.k(bounds);
            this.f7009b = d.j(bounds);
        }

        public a(@m0 h0 h0Var, @m0 h0 h0Var2) {
            this.f7008a = h0Var;
            this.f7009b = h0Var2;
        }

        @t0(30)
        @m0
        public static a e(@m0 WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        @m0
        public h0 a() {
            return this.f7008a;
        }

        @m0
        public h0 b() {
            return this.f7009b;
        }

        @m0
        public a c(@m0 h0 h0Var) {
            return new a(e3.z(this.f7008a, h0Var.f10722a, h0Var.f10723b, h0Var.f10724c, h0Var.f10725d), e3.z(this.f7009b, h0Var.f10722a, h0Var.f10723b, h0Var.f10724c, h0Var.f10725d));
        }

        @t0(30)
        @m0
        public WindowInsetsAnimation.Bounds d() {
            return d.i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f7008a + " upper=" + this.f7009b + p7.a.f11639j;
        }
    }

    public static abstract class b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f7010c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7011d = 1;

        /* renamed from: a  reason: collision with root package name */
        public WindowInsets f7012a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7013b;

        @x0({x0.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i10) {
            this.f7013b = i10;
        }

        public final int a() {
            return this.f7013b;
        }

        public void b(@m0 a3 a3Var) {
        }

        public void c(@m0 a3 a3Var) {
        }

        @m0
        public abstract e3 d(@m0 e3 e3Var, @m0 List<a3> list);

        @m0
        public a e(@m0 a3 a3Var, @m0 a aVar) {
            return aVar;
        }
    }

    @t0(21)
    public static class c extends e {

        @t0(21)
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: c  reason: collision with root package name */
            public static final int f7014c = 160;

            /* renamed from: a  reason: collision with root package name */
            public final b f7015a;

            /* renamed from: b  reason: collision with root package name */
            public e3 f7016b;

            /* renamed from: f1.a3$c$a$a  reason: collision with other inner class name */
            public class C0117a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ a3 f7017a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ e3 f7018b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ e3 f7019c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ int f7020d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ View f7021e;

                public C0117a(a3 a3Var, e3 e3Var, e3 e3Var2, int i10, View view) {
                    this.f7017a = a3Var;
                    this.f7018b = e3Var;
                    this.f7019c = e3Var2;
                    this.f7020d = i10;
                    this.f7021e = view;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f7017a.i(valueAnimator.getAnimatedFraction());
                    c.n(this.f7021e, c.r(this.f7018b, this.f7019c, this.f7017a.d(), this.f7020d), Collections.singletonList(this.f7017a));
                }
            }

            public class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ a3 f7023a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ View f7024b;

                public b(a3 a3Var, View view) {
                    this.f7023a = a3Var;
                    this.f7024b = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.f7023a.i(1.0f);
                    c.l(this.f7024b, this.f7023a);
                }
            }

            /* renamed from: f1.a3$c$a$c  reason: collision with other inner class name */
            public class C0118c implements Runnable {
                public final /* synthetic */ View O;
                public final /* synthetic */ a3 P;
                public final /* synthetic */ a Q;
                public final /* synthetic */ ValueAnimator R;

                public C0118c(View view, a3 a3Var, a aVar, ValueAnimator valueAnimator) {
                    this.O = view;
                    this.P = a3Var;
                    this.Q = aVar;
                    this.R = valueAnimator;
                }

                public void run() {
                    c.o(this.O, this.P, this.Q);
                    this.R.start();
                }
            }

            public a(@m0 View view, @m0 b bVar) {
                this.f7015a = bVar;
                e3 n02 = w1.n0(view);
                this.f7016b = n02 != null ? new e3.b(n02).a() : null;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                View view2 = view;
                WindowInsets windowInsets2 = windowInsets;
                if (!view.isLaidOut()) {
                    this.f7016b = e3.L(windowInsets2, view2);
                } else {
                    e3 L = e3.L(windowInsets2, view2);
                    if (this.f7016b == null) {
                        this.f7016b = w1.n0(view);
                    }
                    if (this.f7016b != null) {
                        b q10 = c.q(view);
                        if (q10 != null && Objects.equals(q10.f7012a, windowInsets2)) {
                            return c.p(view, windowInsets);
                        }
                        int i10 = c.i(L, this.f7016b);
                        if (i10 == 0) {
                            return c.p(view, windowInsets);
                        }
                        e3 e3Var = this.f7016b;
                        a3 a3Var = new a3(i10, new DecelerateInterpolator(), 160);
                        a3Var.i(0.0f);
                        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(a3Var.b());
                        a j10 = c.j(L, e3Var, i10);
                        c.m(view2, a3Var, windowInsets2, false);
                        duration.addUpdateListener(new C0117a(a3Var, L, e3Var, i10, view));
                        duration.addListener(new b(a3Var, view2));
                        s0.a(view2, new C0118c(view, a3Var, j10, duration));
                    }
                    this.f7016b = L;
                }
                return c.p(view, windowInsets);
            }
        }

        public c(int i10, @o0 Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        @SuppressLint({"WrongConstant"})
        public static int i(@m0 e3 e3Var, @m0 e3 e3Var2) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!e3Var.f(i11).equals(e3Var2.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        @m0
        public static a j(@m0 e3 e3Var, @m0 e3 e3Var2, int i10) {
            h0 f10 = e3Var.f(i10);
            h0 f11 = e3Var2.f(i10);
            return new a(h0.d(Math.min(f10.f10722a, f11.f10722a), Math.min(f10.f10723b, f11.f10723b), Math.min(f10.f10724c, f11.f10724c), Math.min(f10.f10725d, f11.f10725d)), h0.d(Math.max(f10.f10722a, f11.f10722a), Math.max(f10.f10723b, f11.f10723b), Math.max(f10.f10724c, f11.f10724c), Math.max(f10.f10725d, f11.f10725d)));
        }

        @m0
        public static View.OnApplyWindowInsetsListener k(@m0 View view, @m0 b bVar) {
            return new a(view, bVar);
        }

        public static void l(@m0 View view, @m0 a3 a3Var) {
            b q10 = q(view);
            if (q10 != null) {
                q10.b(a3Var);
                if (q10.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), a3Var);
                }
            }
        }

        public static void m(View view, a3 a3Var, WindowInsets windowInsets, boolean z10) {
            b q10 = q(view);
            if (q10 != null) {
                q10.f7012a = windowInsets;
                if (!z10) {
                    q10.c(a3Var);
                    z10 = q10.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m(viewGroup.getChildAt(i10), a3Var, windowInsets, z10);
                }
            }
        }

        public static void n(@m0 View view, @m0 e3 e3Var, @m0 List<a3> list) {
            b q10 = q(view);
            if (q10 != null) {
                e3Var = q10.d(e3Var, list);
                if (q10.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    n(viewGroup.getChildAt(i10), e3Var, list);
                }
            }
        }

        public static void o(View view, a3 a3Var, a aVar) {
            b q10 = q(view);
            if (q10 != null) {
                q10.e(a3Var, aVar);
                if (q10.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    o(viewGroup.getChildAt(i10), a3Var, aVar);
                }
            }
        }

        @m0
        public static WindowInsets p(@m0 View view, @m0 WindowInsets windowInsets) {
            return view.getTag(a.e.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @o0
        public static b q(View view) {
            Object tag = view.getTag(a.e.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f7015a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public static e3 r(e3 e3Var, e3 e3Var2, float f10, int i10) {
            h0 h0Var;
            e3.b bVar = new e3.b(e3Var);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    h0Var = e3Var.f(i11);
                } else {
                    h0 f11 = e3Var.f(i11);
                    h0 f12 = e3Var2.f(i11);
                    float f13 = 1.0f - f10;
                    h0Var = e3.z(f11, (int) (((double) (((float) (f11.f10722a - f12.f10722a)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f10723b - f12.f10723b)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f10724c - f12.f10724c)) * f13)) + 0.5d), (int) (((double) (((float) (f11.f10725d - f12.f10725d)) * f13)) + 0.5d));
                }
                bVar.c(i11, h0Var);
            }
            return bVar.a();
        }

        public static void s(@m0 View view, @o0 b bVar) {
            Object tag = view.getTag(a.e.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(a.e.tag_window_insets_animation_callback, (Object) null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener k10 = k(view, bVar);
            view.setTag(a.e.tag_window_insets_animation_callback, k10);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(k10);
            }
        }
    }

    @t0(30)
    public static class d extends e {
        @m0

        /* renamed from: f  reason: collision with root package name */
        public final WindowInsetsAnimation f7026f;

        @t0(30)
        public static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final b f7027a;

            /* renamed from: b  reason: collision with root package name */
            public List<a3> f7028b;

            /* renamed from: c  reason: collision with root package name */
            public ArrayList<a3> f7029c;

            /* renamed from: d  reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, a3> f7030d = new HashMap<>();

            public a(@m0 b bVar) {
                super(bVar.a());
                this.f7027a = bVar;
            }

            @m0
            public final a3 a(@m0 WindowInsetsAnimation windowInsetsAnimation) {
                a3 a3Var = this.f7030d.get(windowInsetsAnimation);
                if (a3Var != null) {
                    return a3Var;
                }
                a3 j10 = a3.j(windowInsetsAnimation);
                this.f7030d.put(windowInsetsAnimation, j10);
                return j10;
            }

            public void onEnd(@m0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f7027a.b(a(windowInsetsAnimation));
                this.f7030d.remove(windowInsetsAnimation);
            }

            public void onPrepare(@m0 WindowInsetsAnimation windowInsetsAnimation) {
                this.f7027a.c(a(windowInsetsAnimation));
            }

            @m0
            public WindowInsets onProgress(@m0 WindowInsets windowInsets, @m0 List<WindowInsetsAnimation> list) {
                ArrayList<a3> arrayList = this.f7029c;
                if (arrayList == null) {
                    ArrayList<a3> arrayList2 = new ArrayList<>(list.size());
                    this.f7029c = arrayList2;
                    this.f7028b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    a3 a10 = a(windowInsetsAnimation);
                    a10.i(windowInsetsAnimation.getFraction());
                    this.f7029c.add(a10);
                }
                return this.f7027a.d(e3.K(windowInsets), this.f7028b).J();
            }

            @m0
            public WindowInsetsAnimation.Bounds onStart(@m0 WindowInsetsAnimation windowInsetsAnimation, @m0 WindowInsetsAnimation.Bounds bounds) {
                return this.f7027a.e(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        public d(int i10, Interpolator interpolator, long j10) {
            this(new WindowInsetsAnimation(i10, interpolator, j10));
        }

        public d(@m0 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f7026f = windowInsetsAnimation;
        }

        @m0
        public static WindowInsetsAnimation.Bounds i(@m0 a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.a().h(), aVar.b().h());
        }

        @m0
        public static h0 j(@m0 WindowInsetsAnimation.Bounds bounds) {
            return h0.g(bounds.getUpperBound());
        }

        @m0
        public static h0 k(@m0 WindowInsetsAnimation.Bounds bounds) {
            return h0.g(bounds.getLowerBound());
        }

        public static void l(@m0 View view, @o0 b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        public long b() {
            return this.f7026f.getDurationMillis();
        }

        public float c() {
            return this.f7026f.getFraction();
        }

        public float d() {
            return this.f7026f.getInterpolatedFraction();
        }

        @o0
        public Interpolator e() {
            return this.f7026f.getInterpolator();
        }

        public int f() {
            return this.f7026f.getTypeMask();
        }

        public void h(float f10) {
            this.f7026f.setFraction(f10);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f7031a;

        /* renamed from: b  reason: collision with root package name */
        public float f7032b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f7033c;

        /* renamed from: d  reason: collision with root package name */
        public final long f7034d;

        /* renamed from: e  reason: collision with root package name */
        public float f7035e;

        public e(int i10, @o0 Interpolator interpolator, long j10) {
            this.f7031a = i10;
            this.f7033c = interpolator;
            this.f7034d = j10;
        }

        public float a() {
            return this.f7035e;
        }

        public long b() {
            return this.f7034d;
        }

        public float c() {
            return this.f7032b;
        }

        public float d() {
            Interpolator interpolator = this.f7033c;
            return interpolator != null ? interpolator.getInterpolation(this.f7032b) : this.f7032b;
        }

        @o0
        public Interpolator e() {
            return this.f7033c;
        }

        public int f() {
            return this.f7031a;
        }

        public void g(float f10) {
            this.f7035e = f10;
        }

        public void h(float f10) {
            this.f7032b = f10;
        }
    }

    public a3(int i10, @o0 Interpolator interpolator, long j10) {
        this.f7007a = Build.VERSION.SDK_INT >= 30 ? new d(i10, interpolator, j10) : new c(i10, interpolator, j10);
    }

    @t0(30)
    public a3(@m0 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7007a = new d(windowInsetsAnimation);
        }
    }

    public static void h(@m0 View view, @o0 b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.l(view, bVar);
        } else {
            c.s(view, bVar);
        }
    }

    @t0(30)
    public static a3 j(WindowInsetsAnimation windowInsetsAnimation) {
        return new a3(windowInsetsAnimation);
    }

    @v(from = 0.0d, to = 1.0d)
    public float a() {
        return this.f7007a.a();
    }

    public long b() {
        return this.f7007a.b();
    }

    @v(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f7007a.c();
    }

    public float d() {
        return this.f7007a.d();
    }

    @o0
    public Interpolator e() {
        return this.f7007a.e();
    }

    public int f() {
        return this.f7007a.f();
    }

    public void g(@v(from = 0.0d, to = 1.0d) float f10) {
        this.f7007a.g(f10);
    }

    public void i(@v(from = 0.0d, to = 1.0d) float f10) {
        this.f7007a.h(f10);
    }
}
