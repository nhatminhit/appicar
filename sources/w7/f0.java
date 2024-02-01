package w7;

import b6.c;
import b6.l0;

public final class f0 implements r {
    public final c O;
    public boolean P;
    public long Q;
    public long R;
    public l0 S = l0.f4401e;

    public f0(c cVar) {
        this.O = cVar;
    }

    public void a(long j10) {
        this.Q = j10;
        if (this.P) {
            this.R = this.O.a();
        }
    }

    public void b() {
        if (!this.P) {
            this.R = this.O.a();
            this.P = true;
        }
    }

    public l0 c(l0 l0Var) {
        if (this.P) {
            a(j());
        }
        this.S = l0Var;
        return l0Var;
    }

    public l0 d() {
        return this.S;
    }

    public void e() {
        if (this.P) {
            a(j());
            this.P = false;
        }
    }

    public long j() {
        long j10 = this.Q;
        if (!this.P) {
            return j10;
        }
        long a10 = this.O.a() - this.R;
        l0 l0Var = this.S;
        return j10 + (l0Var.f4402a == 1.0f ? c.b(a10) : l0Var.a(a10));
    }
}
