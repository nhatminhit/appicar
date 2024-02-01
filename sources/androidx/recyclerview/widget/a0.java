package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;

public abstract class a0 extends RecyclerView.l {

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f3357m = false;

    /* renamed from: n  reason: collision with root package name */
    public static final String f3358n = "SimpleItemAnimator";

    /* renamed from: l  reason: collision with root package name */
    public boolean f3359l = true;

    public abstract boolean D(RecyclerView.e0 e0Var);

    public abstract boolean E(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean F(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13);

    public abstract boolean G(RecyclerView.e0 e0Var);

    public final void H(RecyclerView.e0 e0Var) {
        Q(e0Var);
        h(e0Var);
    }

    public final void I(RecyclerView.e0 e0Var) {
        R(e0Var);
    }

    public final void J(RecyclerView.e0 e0Var, boolean z10) {
        S(e0Var, z10);
        h(e0Var);
    }

    public final void K(RecyclerView.e0 e0Var, boolean z10) {
        T(e0Var, z10);
    }

    public final void L(RecyclerView.e0 e0Var) {
        U(e0Var);
        h(e0Var);
    }

    public final void M(RecyclerView.e0 e0Var) {
        V(e0Var);
    }

    public final void N(RecyclerView.e0 e0Var) {
        W(e0Var);
        h(e0Var);
    }

    public final void O(RecyclerView.e0 e0Var) {
        X(e0Var);
    }

    public boolean P() {
        return this.f3359l;
    }

    public void Q(RecyclerView.e0 e0Var) {
    }

    public void R(RecyclerView.e0 e0Var) {
    }

    public void S(RecyclerView.e0 e0Var, boolean z10) {
    }

    public void T(RecyclerView.e0 e0Var, boolean z10) {
    }

    public void U(RecyclerView.e0 e0Var) {
    }

    public void V(RecyclerView.e0 e0Var) {
    }

    public void W(RecyclerView.e0 e0Var) {
    }

    public void X(RecyclerView.e0 e0Var) {
    }

    public void Y(boolean z10) {
        this.f3359l = z10;
    }

    public boolean a(@m0 RecyclerView.e0 e0Var, @o0 RecyclerView.l.d dVar, @m0 RecyclerView.l.d dVar2) {
        int i10;
        int i11;
        if (dVar == null || ((i10 = dVar.f3256a) == (i11 = dVar2.f3256a) && dVar.f3257b == dVar2.f3257b)) {
            return D(e0Var);
        }
        return F(e0Var, i10, dVar.f3257b, i11, dVar2.f3257b);
    }

    public boolean b(@m0 RecyclerView.e0 e0Var, @m0 RecyclerView.e0 e0Var2, @m0 RecyclerView.l.d dVar, @m0 RecyclerView.l.d dVar2) {
        int i10;
        int i11;
        int i12 = dVar.f3256a;
        int i13 = dVar.f3257b;
        if (e0Var2.K()) {
            int i14 = dVar.f3256a;
            i10 = dVar.f3257b;
            i11 = i14;
        } else {
            i11 = dVar2.f3256a;
            i10 = dVar2.f3257b;
        }
        return E(e0Var, e0Var2, i12, i13, i11, i10);
    }

    public boolean c(@m0 RecyclerView.e0 e0Var, @m0 RecyclerView.l.d dVar, @o0 RecyclerView.l.d dVar2) {
        int i10 = dVar.f3256a;
        int i11 = dVar.f3257b;
        View view = e0Var.f3220a;
        int left = dVar2 == null ? view.getLeft() : dVar2.f3256a;
        int top = dVar2 == null ? view.getTop() : dVar2.f3257b;
        if (e0Var.w() || (i10 == left && i11 == top)) {
            return G(e0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return F(e0Var, i10, i11, left, top);
    }

    public boolean d(@m0 RecyclerView.e0 e0Var, @m0 RecyclerView.l.d dVar, @m0 RecyclerView.l.d dVar2) {
        int i10 = dVar.f3256a;
        int i11 = dVar2.f3256a;
        if (i10 == i11 && dVar.f3257b == dVar2.f3257b) {
            L(e0Var);
            return false;
        }
        return F(e0Var, i10, dVar.f3257b, i11, dVar2.f3257b);
    }

    public boolean f(@m0 RecyclerView.e0 e0Var) {
        return !this.f3359l || e0Var.u();
    }
}
