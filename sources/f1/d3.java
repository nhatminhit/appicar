package f1;

import android.os.Build;
import android.view.WindowInsetsAnimationController;
import d.m0;
import d.o0;
import d.t0;
import d.v;
import n0.h0;

public final class d3 {

    /* renamed from: a  reason: collision with root package name */
    public final b f7060a;

    @t0(30)
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsAnimationController f7061a;

        public a(@m0 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f7061a = windowInsetsAnimationController;
        }

        public void a(boolean z10) {
            this.f7061a.finish(z10);
        }

        public float b() {
            return this.f7061a.getCurrentAlpha();
        }

        public float c() {
            return this.f7061a.getCurrentFraction();
        }

        @m0
        public h0 d() {
            return h0.g(this.f7061a.getCurrentInsets());
        }

        @m0
        public h0 e() {
            return h0.g(this.f7061a.getHiddenStateInsets());
        }

        @m0
        public h0 f() {
            return h0.g(this.f7061a.getShownStateInsets());
        }

        public int g() {
            return this.f7061a.getTypes();
        }

        public boolean h() {
            return this.f7061a.isCancelled();
        }

        public boolean i() {
            return this.f7061a.isFinished();
        }

        public boolean j() {
            return this.f7061a.isReady();
        }

        public void k(@o0 h0 h0Var, float f10, float f11) {
            this.f7061a.setInsetsAndAlpha(h0Var == null ? null : h0Var.h(), f10, f11);
        }
    }

    public static class b {
        public void a(boolean z10) {
        }

        public float b() {
            return 0.0f;
        }

        @v(from = 0.0d, to = 1.0d)
        public float c() {
            return 0.0f;
        }

        @m0
        public h0 d() {
            return h0.f10721e;
        }

        @m0
        public h0 e() {
            return h0.f10721e;
        }

        @m0
        public h0 f() {
            return h0.f10721e;
        }

        public int g() {
            return 0;
        }

        public boolean h() {
            return true;
        }

        public boolean i() {
            return false;
        }

        public boolean j() {
            return false;
        }

        public void k(@o0 h0 h0Var, @v(from = 0.0d, to = 1.0d) float f10, @v(from = 0.0d, to = 1.0d) float f11) {
        }
    }

    public d3() {
        if (Build.VERSION.SDK_INT < 30) {
            this.f7060a = new b();
            return;
        }
        throw new UnsupportedOperationException("On API 30+, the constructor taking a " + WindowInsetsAnimationController.class.getSimpleName() + " as parameter");
    }

    @t0(30)
    public d3(@m0 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f7060a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z10) {
        this.f7060a.a(z10);
    }

    public float b() {
        return this.f7060a.b();
    }

    @v(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f7060a.c();
    }

    @m0
    public h0 d() {
        return this.f7060a.d();
    }

    @m0
    public h0 e() {
        return this.f7060a.e();
    }

    @m0
    public h0 f() {
        return this.f7060a.f();
    }

    public int g() {
        return this.f7060a.g();
    }

    public boolean h() {
        return this.f7060a.h();
    }

    public boolean i() {
        return this.f7060a.i();
    }

    public boolean j() {
        return !i() && !h();
    }

    public void k(@o0 h0 h0Var, @v(from = 0.0d, to = 1.0d) float f10, @v(from = 0.0d, to = 1.0d) float f11) {
        this.f7060a.k(h0Var, f10, f11);
    }
}
