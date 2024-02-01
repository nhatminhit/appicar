package b6;

import d.o0;
import w7.c;
import w7.f0;
import w7.r;

public final class g implements r {
    public final f0 O;
    public final a P;
    @o0
    public r0 Q;
    @o0
    public r R;

    public interface a {
        void b(l0 l0Var);
    }

    public g(a aVar, c cVar) {
        this.P = aVar;
        this.O = new f0(cVar);
    }

    public final void a() {
        this.O.a(this.R.j());
        l0 d10 = this.R.d();
        if (!d10.equals(this.O.d())) {
            this.O.c(d10);
            this.P.b(d10);
        }
    }

    public final boolean b() {
        r0 r0Var = this.Q;
        return r0Var != null && !r0Var.a() && (this.Q.isReady() || !this.Q.g());
    }

    public l0 c(l0 l0Var) {
        r rVar = this.R;
        if (rVar != null) {
            l0Var = rVar.c(l0Var);
        }
        this.O.c(l0Var);
        this.P.b(l0Var);
        return l0Var;
    }

    public l0 d() {
        r rVar = this.R;
        return rVar != null ? rVar.d() : this.O.d();
    }

    public void e(r0 r0Var) {
        if (r0Var == this.Q) {
            this.R = null;
            this.Q = null;
        }
    }

    public void f(r0 r0Var) throws i {
        r rVar;
        r v10 = r0Var.v();
        if (v10 != null && v10 != (rVar = this.R)) {
            if (rVar == null) {
                this.R = v10;
                this.Q = r0Var;
                v10.c(this.O.d());
                a();
                return;
            }
            throw i.e(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void g(long j10) {
        this.O.a(j10);
    }

    public void h() {
        this.O.b();
    }

    public void i() {
        this.O.e();
    }

    public long j() {
        return b() ? this.R.j() : this.O.j();
    }

    public long k() {
        if (!b()) {
            return this.O.j();
        }
        a();
        return this.R.j();
    }
}
