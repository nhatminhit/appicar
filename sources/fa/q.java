package fa;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import f1.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@t0(21)
public final class q extends r<w> {
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public final int R;
    public final boolean S;

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public q(int i10, boolean z10) {
        super(p(i10, z10), q());
        this.R = i10;
        this.S = z10;
    }

    public static w p(int i10, boolean z10) {
        if (i10 == 0) {
            return new t(z10 ? 8388613 : j.f7185b);
        } else if (i10 == 1) {
            return new t(z10 ? 80 : 48);
        } else if (i10 == 2) {
            return new s(z10);
        } else {
            throw new IllegalArgumentException("Invalid axis: " + i10);
        }
    }

    public static w q() {
        return new e();
    }

    public /* bridge */ /* synthetic */ void a(@m0 w wVar) {
        super.a(wVar);
    }

    public /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @m0
    public /* bridge */ /* synthetic */ w j() {
        return super.j();
    }

    @o0
    public /* bridge */ /* synthetic */ w k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ boolean m(@m0 w wVar) {
        return super.m(wVar);
    }

    public /* bridge */ /* synthetic */ void n(@o0 w wVar) {
        super.n(wVar);
    }

    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    public int r() {
        return this.R;
    }

    public boolean s() {
        return this.S;
    }
}
