package fa;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.t0;

@t0(21)
public final class n extends r<s> {
    public static final float S = 0.85f;
    public final boolean R;

    public n(boolean z10) {
        super(p(z10), q());
        this.R = z10;
    }

    public static s p(boolean z10) {
        s sVar = new s(z10);
        sVar.m(0.85f);
        sVar.l(0.85f);
        return sVar;
    }

    public static w q() {
        return new d();
    }

    public /* bridge */ /* synthetic */ void a(@m0 w wVar) {
        super.a(wVar);
    }

    public /* bridge */ /* synthetic */ void g() {
        super.g();
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

    public boolean r() {
        return this.R;
    }
}
