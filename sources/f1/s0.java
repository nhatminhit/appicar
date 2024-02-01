package f1;

import android.view.View;
import android.view.ViewTreeObserver;
import d.m0;

public final class s0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View O;
    public ViewTreeObserver P;
    public final Runnable Q;

    public s0(View view, Runnable runnable) {
        this.O = view;
        this.P = view.getViewTreeObserver();
        this.Q = runnable;
    }

    @m0
    public static s0 a(@m0 View view, @m0 Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            s0 s0Var = new s0(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(s0Var);
            view.addOnAttachStateChangeListener(s0Var);
            return s0Var;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        (this.P.isAlive() ? this.P : this.O.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.O.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.Q.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.P = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
