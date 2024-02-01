package ea;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.x0;
import f1.j;
import g3.r0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class p extends q<v> {
    public static final int W0 = 0;
    public static final int X0 = 1;
    public static final int Y0 = 2;
    public final int U0;
    public final boolean V0;

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public p(int i10, boolean z10) {
        super(Y0(i10, z10), Z0());
        this.U0 = i10;
        this.V0 = z10;
    }

    public static v Y0(int i10, boolean z10) {
        if (i10 == 0) {
            return new s(z10 ? 8388613 : j.f7185b);
        } else if (i10 == 1) {
            return new s(z10 ? 80 : 48);
        } else if (i10 == 2) {
            return new r(z10);
        } else {
            throw new IllegalArgumentException("Invalid axis: " + i10);
        }
    }

    public static v Z0() {
        return new e();
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

    @m0
    public /* bridge */ /* synthetic */ v U0() {
        return super.U0();
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

    public int a1() {
        return this.U0;
    }

    public boolean b1() {
        return this.V0;
    }
}
