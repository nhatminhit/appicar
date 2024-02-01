package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import d.x0;
import f1.n2;
import f1.w1;

@x0({x0.a.Q})
public class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static final String X = "TooltipCompatHandler";
    public static final long Y = 2500;
    public static final long Z = 15000;

    /* renamed from: a0  reason: collision with root package name */
    public static final long f1222a0 = 3000;

    /* renamed from: b0  reason: collision with root package name */
    public static a1 f1223b0;

    /* renamed from: c0  reason: collision with root package name */
    public static a1 f1224c0;
    public final View O;
    public final CharSequence P;
    public final int Q;
    public final Runnable R = new a();
    public final Runnable S = new b();
    public int T;
    public int U;
    public b1 V;
    public boolean W;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            a1.this.g(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a1.this.c();
        }
    }

    public a1(View view, CharSequence charSequence) {
        this.O = view;
        this.P = charSequence;
        this.Q = n2.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void e(a1 a1Var) {
        a1 a1Var2 = f1223b0;
        if (a1Var2 != null) {
            a1Var2.a();
        }
        f1223b0 = a1Var;
        if (a1Var != null) {
            a1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        a1 a1Var = f1223b0;
        if (a1Var != null && a1Var.O == view) {
            e((a1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            a1 a1Var2 = f1224c0;
            if (a1Var2 != null && a1Var2.O == view) {
                a1Var2.c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new a1(view, charSequence);
    }

    public final void a() {
        this.O.removeCallbacks(this.R);
    }

    public final void b() {
        this.T = Integer.MAX_VALUE;
        this.U = Integer.MAX_VALUE;
    }

    public void c() {
        if (f1224c0 == this) {
            f1224c0 = null;
            b1 b1Var = this.V;
            if (b1Var != null) {
                b1Var.c();
                this.V = null;
                b();
                this.O.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1223b0 == this) {
            e((a1) null);
        }
        this.O.removeCallbacks(this.S);
    }

    public final void d() {
        this.O.postDelayed(this.R, (long) ViewConfiguration.getLongPressTimeout());
    }

    public void g(boolean z10) {
        long j10;
        if (w1.N0(this.O)) {
            e((a1) null);
            a1 a1Var = f1224c0;
            if (a1Var != null) {
                a1Var.c();
            }
            f1224c0 = this;
            this.W = z10;
            b1 b1Var = new b1(this.O.getContext());
            this.V = b1Var;
            b1Var.e(this.O, this.T, this.U, this.W, this.P);
            this.O.addOnAttachStateChangeListener(this);
            if (this.W) {
                j10 = Y;
            } else {
                j10 = ((w1.B0(this.O) & 1) == 1 ? 3000 : Z) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.O.removeCallbacks(this.S);
            this.O.postDelayed(this.S, j10);
        }
    }

    public final boolean h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.T) <= this.Q && Math.abs(y10 - this.U) <= this.Q) {
            return false;
        }
        this.T = x10;
        this.U = y10;
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.V != null && this.W) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.O.isEnabled() && this.V == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.T = view.getWidth() / 2;
        this.U = view.getHeight() / 2;
        g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
