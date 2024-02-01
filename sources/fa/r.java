package fa;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.t0;
import fa.w;
import j9.a;
import j9.b;
import java.util.ArrayList;
import java.util.List;

@t0(21)
public abstract class r<P extends w> extends Visibility {
    public final P O;
    @o0
    public w P;
    public final List<w> Q = new ArrayList();

    public r(P p10, @o0 w wVar) {
        this.O = p10;
        this.P = wVar;
        setInterpolator(a.f19829b);
    }

    public static void d(List<Animator> list, @o0 w wVar, ViewGroup viewGroup, View view, boolean z10) {
        if (wVar != null) {
            Animator a10 = z10 ? wVar.a(viewGroup, view) : wVar.b(viewGroup, view);
            if (a10 != null) {
                list.add(a10);
            }
        }
    }

    public void a(@m0 w wVar) {
        this.Q.add(wVar);
    }

    public void g() {
        this.Q.clear();
    }

    public final Animator i(ViewGroup viewGroup, View view, boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        d(arrayList, this.O, viewGroup, view, z10);
        d(arrayList, this.P, viewGroup, view, z10);
        for (w d10 : this.Q) {
            d(arrayList, d10, viewGroup, view, z10);
        }
        b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @m0
    public P j() {
        return this.O;
    }

    @o0
    public w k() {
        return this.P;
    }

    public boolean m(@m0 w wVar) {
        return this.Q.remove(wVar);
    }

    public void n(@o0 w wVar) {
        this.P = wVar;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return i(viewGroup, view, true);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return i(viewGroup, view, false);
    }
}
