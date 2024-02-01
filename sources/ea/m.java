package ea;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import g3.r0;

public final class m extends q<r> {
    public static final float V0 = 0.85f;
    public final boolean U0;

    public m(boolean z10) {
        super(Y0(z10), Z0());
        this.U0 = z10;
    }

    public static r Y0(boolean z10) {
        r rVar = new r(z10);
        rVar.m(0.85f);
        rVar.l(0.85f);
        return rVar;
    }

    public static v Z0() {
        return new d();
    }

    public /* bridge */ /* synthetic */ Animator L0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return super.L0(viewGroup, view, r0Var, r0Var2);
    }

    public /* bridge */ /* synthetic */ Animator N0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return super.N0(viewGroup, view, r0Var, r0Var2);
    }

    public /* bridge */ /* synthetic */ void Q0(@m0 v vVar) {
        super.Q0(vVar);
    }

    public /* bridge */ /* synthetic */ void S0() {
        super.S0();
    }

    @o0
    public /* bridge */ /* synthetic */ v V0() {
        return super.V0();
    }

    public /* bridge */ /* synthetic */ boolean W0(@m0 v vVar) {
        return super.W0(vVar);
    }

    public /* bridge */ /* synthetic */ void X0(@o0 v vVar) {
        super.X0(vVar);
    }

    public boolean a1() {
        return this.U0;
    }
}
