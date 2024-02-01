package ea;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import ea.v;
import g3.r0;
import g3.s1;
import j9.a;
import j9.b;
import java.util.ArrayList;
import java.util.List;

public abstract class q<P extends v> extends s1 {
    public final P R0;
    @o0
    public v S0;
    public final List<v> T0 = new ArrayList();

    public q(P p10, @o0 v vVar) {
        this.R0 = p10;
        this.S0 = vVar;
        z0(a.f19829b);
    }

    public static void R0(List<Animator> list, @o0 v vVar, ViewGroup viewGroup, View view, boolean z10) {
        if (vVar != null) {
            Animator a10 = z10 ? vVar.a(viewGroup, view) : vVar.b(viewGroup, view);
            if (a10 != null) {
                list.add(a10);
            }
        }
    }

    public Animator L0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return T0(viewGroup, view, true);
    }

    public Animator N0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return T0(viewGroup, view, false);
    }

    public void Q0(@m0 v vVar) {
        this.T0.add(vVar);
    }

    public void S0() {
        this.T0.clear();
    }

    public final Animator T0(ViewGroup viewGroup, View view, boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        R0(arrayList, this.R0, viewGroup, view, z10);
        R0(arrayList, this.S0, viewGroup, view, z10);
        for (v R02 : this.T0) {
            R0(arrayList, R02, viewGroup, view, z10);
        }
        b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @m0
    public P U0() {
        return this.R0;
    }

    @o0
    public v V0() {
        return this.S0;
    }

    public boolean W0(@m0 v vVar) {
        return this.T0.remove(vVar);
    }

    public void X0(@o0 v vVar) {
        this.S0 = vVar;
    }
}
