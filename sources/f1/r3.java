package f1;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.collection.i;
import d.m0;
import d.o0;
import d.t0;

public final class r3 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f7230b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7231c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f7232d = 2;

    /* renamed from: a  reason: collision with root package name */
    public final e f7233a;

    @t0(20)
    public static class a extends e {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final Window f7234a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final View f7235b;

        /* renamed from: f1.r3$a$a  reason: collision with other inner class name */
        public class C0121a implements Runnable {
            public final /* synthetic */ View O;

            public C0121a(View view) {
                this.O = view;
            }

            public void run() {
                ((InputMethodManager) this.O.getContext().getSystemService("input_method")).showSoftInput(this.O, 0);
            }
        }

        public a(@m0 Window window, @o0 View view) {
            this.f7234a = window;
            this.f7235b = view;
        }

        public void a(f fVar) {
        }

        public void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, c3 c3Var) {
        }

        public int c() {
            return 0;
        }

        public void d(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    l(i11);
                }
            }
        }

        public void g(@m0 f fVar) {
        }

        public void j(int i10) {
            if (i10 == 0) {
                p(6144);
            } else if (i10 == 1) {
                p(4096);
                m(2048);
            } else if (i10 == 2) {
                p(2048);
                m(4096);
            }
        }

        public void k(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    o(i11);
                }
            }
        }

        public final void l(int i10) {
            if (i10 == 1) {
                m(4);
            } else if (i10 == 2) {
                m(2);
            } else if (i10 == 8) {
                ((InputMethodManager) this.f7234a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f7234a.getDecorView().getWindowToken(), 0);
            }
        }

        public void m(int i10) {
            View decorView = this.f7234a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void n(int i10) {
            this.f7234a.addFlags(i10);
        }

        public final void o(int i10) {
            if (i10 == 1) {
                p(4);
                q(1024);
            } else if (i10 == 2) {
                p(2);
            } else if (i10 == 8) {
                View view = this.f7235b;
                if (view == null || (!view.isInEditMode() && !view.onCheckIsTextEditor())) {
                    view = this.f7234a.getCurrentFocus();
                } else {
                    view.requestFocus();
                }
                if (view == null) {
                    view = this.f7234a.findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new C0121a(view));
                }
            }
        }

        public void p(int i10) {
            View decorView = this.f7234a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public void q(int i10) {
            this.f7234a.clearFlags(i10);
        }
    }

    @t0(23)
    public static class b extends a {
        public b(@m0 Window window, @o0 View view) {
            super(window, view);
        }

        public boolean f() {
            return (this.f7234a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        public void i(boolean z10) {
            if (z10) {
                q(67108864);
                n(Integer.MIN_VALUE);
                m(8192);
                return;
            }
            p(8192);
        }
    }

    @t0(26)
    public static class c extends b {
        public c(@m0 Window window, @o0 View view) {
            super(window, view);
        }

        public boolean e() {
            return (this.f7234a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        public void h(boolean z10) {
            if (z10) {
                q(134217728);
                n(Integer.MIN_VALUE);
                m(16);
                return;
            }
            p(16);
        }
    }

    @t0(30)
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final r3 f7236a;

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsetsController f7237b;

        /* renamed from: c  reason: collision with root package name */
        public final i<f, WindowInsetsController.OnControllableInsetsChangedListener> f7238c;

        public class a implements WindowInsetsAnimationControlListener {

            /* renamed from: a  reason: collision with root package name */
            public d3 f7239a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ c3 f7240b;

            public a(c3 c3Var) {
                this.f7240b = c3Var;
            }

            public void onCancelled(@o0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f7240b.b(windowInsetsAnimationController == null ? null : this.f7239a);
            }

            public void onFinished(@m0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f7240b.a(this.f7239a);
            }

            public void onReady(@m0 WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
                d3 d3Var = new d3(windowInsetsAnimationController);
                this.f7239a = d3Var;
                this.f7240b.c(d3Var, i10);
            }
        }

        public class b implements WindowInsetsController.OnControllableInsetsChangedListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f f7242a;

            public b(f fVar) {
                this.f7242a = fVar;
            }

            public void onControllableInsetsChanged(@m0 WindowInsetsController windowInsetsController, int i10) {
                d dVar = d.this;
                if (dVar.f7237b == windowInsetsController) {
                    this.f7242a.a(dVar.f7236a, i10);
                }
            }
        }

        public d(@m0 Window window, @m0 r3 r3Var) {
            this(window.getInsetsController(), r3Var);
        }

        public d(@m0 WindowInsetsController windowInsetsController, @m0 r3 r3Var) {
            this.f7238c = new i<>();
            this.f7237b = windowInsetsController;
            this.f7236a = r3Var;
        }

        public void a(@m0 f fVar) {
            if (!this.f7238c.containsKey(fVar)) {
                b bVar = new b(fVar);
                this.f7238c.put(fVar, bVar);
                this.f7237b.addOnControllableInsetsChangedListener(bVar);
            }
        }

        public void b(int i10, long j10, @o0 Interpolator interpolator, @o0 CancellationSignal cancellationSignal, @m0 c3 c3Var) {
            this.f7237b.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, new a(c3Var));
        }

        public int c() {
            return this.f7237b.getSystemBarsBehavior();
        }

        public void d(int i10) {
            this.f7237b.hide(i10);
        }

        public boolean e() {
            return (this.f7237b.getSystemBarsAppearance() & 16) != 0;
        }

        public boolean f() {
            return (this.f7237b.getSystemBarsAppearance() & 8) != 0;
        }

        public void g(@m0 f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener remove = this.f7238c.remove(fVar);
            if (remove != null) {
                this.f7237b.removeOnControllableInsetsChangedListener(remove);
            }
        }

        public void h(boolean z10) {
            if (z10) {
                this.f7237b.setSystemBarsAppearance(16, 16);
            } else {
                this.f7237b.setSystemBarsAppearance(0, 16);
            }
        }

        public void i(boolean z10) {
            if (z10) {
                this.f7237b.setSystemBarsAppearance(8, 8);
            } else {
                this.f7237b.setSystemBarsAppearance(0, 8);
            }
        }

        public void j(int i10) {
            this.f7237b.setSystemBarsBehavior(i10);
        }

        public void k(int i10) {
            this.f7237b.show(i10);
        }
    }

    public static class e {
        public void a(f fVar) {
        }

        public void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, c3 c3Var) {
        }

        public int c() {
            return 0;
        }

        public void d(int i10) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        public void g(@m0 f fVar) {
        }

        public void h(boolean z10) {
        }

        public void i(boolean z10) {
        }

        public void j(int i10) {
        }

        public void k(int i10) {
        }
    }

    public interface f {
        void a(@m0 r3 r3Var, int i10);
    }

    public r3(@m0 Window window, @m0 View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f7233a = new d(window, this);
        } else {
            this.f7233a = i10 >= 26 ? new c(window, view) : new b(window, view);
        }
    }

    @t0(30)
    public r3(@m0 WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7233a = new d(windowInsetsController, this);
        } else {
            this.f7233a = new e();
        }
    }

    @t0(30)
    @m0
    public static r3 l(@m0 WindowInsetsController windowInsetsController) {
        return new r3(windowInsetsController);
    }

    public void a(@m0 f fVar) {
        this.f7233a.a(fVar);
    }

    public void b(int i10, long j10, @o0 Interpolator interpolator, @o0 CancellationSignal cancellationSignal, @m0 c3 c3Var) {
        this.f7233a.b(i10, j10, interpolator, cancellationSignal, c3Var);
    }

    public int c() {
        return this.f7233a.c();
    }

    public void d(int i10) {
        this.f7233a.d(i10);
    }

    public boolean e() {
        return this.f7233a.e();
    }

    public boolean f() {
        return this.f7233a.f();
    }

    public void g(@m0 f fVar) {
        this.f7233a.g(fVar);
    }

    public void h(boolean z10) {
        this.f7233a.h(z10);
    }

    public void i(boolean z10) {
        this.f7233a.i(z10);
    }

    public void j(int i10) {
        this.f7233a.j(i10);
    }

    public void k(int i10) {
        this.f7233a.k(i10);
    }
}
