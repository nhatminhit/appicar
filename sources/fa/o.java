package fa;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.t0;

@t0(21)
public final class o extends r<d> {
    public static final float R = 0.8f;
    public static final float S = 0.3f;

    public o() {
        super(p(), q());
    }

    public static d p() {
        d dVar = new d();
        dVar.e(0.3f);
        return dVar;
    }

    public static w q() {
        s sVar = new s();
        sVar.o(false);
        sVar.l(0.8f);
        return sVar;
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
}
