package e7;

import b6.c0;
import b7.r0;
import g6.f;
import java.io.IOException;
import w7.a;

public final class k implements r0 {
    public final int O;
    public final o P;
    public int Q = -1;

    public k(o oVar, int i10) {
        this.P = oVar;
        this.O = i10;
    }

    public void a() throws IOException {
        if (this.Q != -2) {
            this.P.N();
            return;
        }
        throw new q(this.P.t().a(this.O).a(0).W);
    }

    public void b() {
        a.a(this.Q == -1);
        this.Q = this.P.x(this.O);
    }

    public final boolean c() {
        int i10 = this.Q;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void d() {
        if (this.Q != -1) {
            this.P.d0(this.O);
            this.Q = -1;
        }
    }

    public boolean isReady() {
        return this.Q == -3 || (c() && this.P.K(this.Q));
    }

    public int l(long j10) {
        if (c()) {
            return this.P.c0(this.Q, j10);
        }
        return 0;
    }

    public int q(c0 c0Var, f fVar, boolean z10) {
        if (this.Q == -3) {
            fVar.i(4);
            return -4;
        } else if (c()) {
            return this.P.U(this.Q, c0Var, fVar, z10);
        } else {
            return -3;
        }
    }
}
