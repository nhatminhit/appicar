package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class s2 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f7244e = 2113929216;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f7245a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f7246b = null;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f7247c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f7248d = -1;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t2 f7249a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f7250b;

        public a(t2 t2Var, View view) {
            this.f7249a = t2Var;
            this.f7250b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7249a.a(this.f7250b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f7249a.b(this.f7250b);
        }

        public void onAnimationStart(Animator animator) {
            this.f7249a.c(this.f7250b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v2 f7252a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f7253b;

        public b(v2 v2Var, View view) {
            this.f7252a = v2Var;
            this.f7253b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7252a.a(this.f7253b);
        }
    }

    public static class c implements t2 {

        /* renamed from: a  reason: collision with root package name */
        public s2 f7255a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7256b;

        public c(s2 s2Var) {
            this.f7255a = s2Var;
        }

        public void a(View view) {
            Object tag = view.getTag(s2.f7244e);
            t2 t2Var = tag instanceof t2 ? (t2) tag : null;
            if (t2Var != null) {
                t2Var.a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: f1.t2} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(android.view.View r4) {
            /*
                r3 = this;
                f1.s2 r0 = r3.f7255a
                int r0 = r0.f7248d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                f1.s2 r0 = r3.f7255a
                r0.f7248d = r1
            L_0x000f:
                f1.s2 r0 = r3.f7255a
                java.lang.Runnable r1 = r0.f7247c
                if (r1 == 0) goto L_0x001a
                r0.f7247c = r2
                r1.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof f1.t2
                if (r1 == 0) goto L_0x0027
                r2 = r0
                f1.t2 r2 = (f1.t2) r2
            L_0x0027:
                if (r2 == 0) goto L_0x002c
                r2.b(r4)
            L_0x002c:
                r4 = 1
                r3.f7256b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.s2.c.b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: f1.t2} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f7256b = r0
                f1.s2 r0 = r3.f7255a
                int r0 = r0.f7248d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                f1.s2 r0 = r3.f7255a
                java.lang.Runnable r2 = r0.f7246b
                if (r2 == 0) goto L_0x001a
                r0.f7246b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof f1.t2
                if (r2 == 0) goto L_0x0027
                r1 = r0
                f1.t2 r1 = (f1.t2) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.s2.c.c(android.view.View):void");
        }
    }

    public s2(View view) {
        this.f7245a = new WeakReference<>(view);
    }

    public s2 A(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().translationYBy(f10);
        }
        return this;
    }

    public s2 B(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().translationZ(f10);
        }
        return this;
    }

    public s2 C(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().translationZBy(f10);
        }
        return this;
    }

    public s2 D(Runnable runnable) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    public s2 E() {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public s2 F(Runnable runnable) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    public s2 G(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().x(f10);
        }
        return this;
    }

    public s2 H(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().xBy(f10);
        }
        return this;
    }

    public s2 I(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().y(f10);
        }
        return this;
    }

    public s2 J(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().yBy(f10);
        }
        return this;
    }

    public s2 K(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().z(f10);
        }
        return this;
    }

    public s2 L(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().zBy(f10);
        }
        return this;
    }

    public s2 a(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public s2 b(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().alphaBy(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f7245a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public Interpolator e() {
        View view = this.f7245a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long f() {
        View view = this.f7245a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0;
    }

    public s2 g(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().rotation(f10);
        }
        return this;
    }

    public s2 h(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().rotationBy(f10);
        }
        return this;
    }

    public s2 i(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().rotationX(f10);
        }
        return this;
    }

    public s2 j(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().rotationXBy(f10);
        }
        return this;
    }

    public s2 k(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().rotationY(f10);
        }
        return this;
    }

    public s2 l(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().rotationYBy(f10);
        }
        return this;
    }

    public s2 m(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().scaleX(f10);
        }
        return this;
    }

    public s2 n(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().scaleXBy(f10);
        }
        return this;
    }

    public s2 o(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().scaleY(f10);
        }
        return this;
    }

    public s2 p(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().scaleYBy(f10);
        }
        return this;
    }

    public s2 q(long j10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public s2 r(Interpolator interpolator) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public s2 s(t2 t2Var) {
        View view = this.f7245a.get();
        if (view != null) {
            t(view, t2Var);
        }
        return this;
    }

    public final void t(View view, t2 t2Var) {
        if (t2Var != null) {
            view.animate().setListener(new a(t2Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public s2 u(long j10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public s2 v(v2 v2Var) {
        View view = this.f7245a.get();
        if (view != null) {
            b bVar = null;
            if (v2Var != null) {
                bVar = new b(v2Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void w() {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public s2 x(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().translationX(f10);
        }
        return this;
    }

    public s2 y(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().translationXBy(f10);
        }
        return this;
    }

    public s2 z(float f10) {
        View view = this.f7245a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
