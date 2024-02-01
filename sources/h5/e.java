package h5;

import c5.m;
import java.io.IOException;
import java.io.Serializable;
import p7.f;
import w4.i;
import w4.t;
import w4.u;

public class e implements t, f<e>, Serializable {
    public static final long V = 1;
    public static final m W = new m(" ");
    public b O;
    public b P;
    public final u Q;
    public boolean R;
    public transient int S;
    public m T;
    public String U;

    public static class a extends c {
        public static final a P = new a();

        public boolean l() {
            return true;
        }

        public void m(i iVar, int i10) throws IOException {
            iVar.H2(f.f11698i);
        }
    }

    public interface b {
        boolean l();

        void m(i iVar, int i10) throws IOException;
    }

    public static class c implements b, Serializable {
        public static final c O = new c();

        public boolean l() {
            return true;
        }

        public void m(i iVar, int i10) throws IOException {
        }
    }

    public e() {
        this((u) W);
    }

    public e(e eVar) {
        this(eVar, eVar.Q);
    }

    public e(e eVar, u uVar) {
        this.O = a.P;
        this.P = d.U;
        this.R = true;
        this.O = eVar.O;
        this.P = eVar.P;
        this.R = eVar.R;
        this.S = eVar.S;
        this.T = eVar.T;
        this.U = eVar.U;
        this.Q = uVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(String str) {
        this((u) str == null ? null : new m(str));
    }

    public e(u uVar) {
        this.O = a.P;
        this.P = d.U;
        this.R = true;
        this.Q = uVar;
        t(t.M);
    }

    public void a(i iVar) throws IOException {
        if (!this.O.l()) {
            this.S++;
        }
        iVar.H2('[');
    }

    public void b(i iVar) throws IOException {
        iVar.H2('{');
        if (!this.P.l()) {
            this.S++;
        }
    }

    public void c(i iVar) throws IOException {
        iVar.H2(this.T.c());
        this.P.m(iVar, this.S);
    }

    public void e(i iVar) throws IOException {
        iVar.H2(this.T.b());
        this.O.m(iVar, this.S);
    }

    public void f(i iVar, int i10) throws IOException {
        if (!this.O.l()) {
            this.S--;
        }
        if (i10 > 0) {
            this.O.m(iVar, this.S);
        } else {
            iVar.H2(f.f11698i);
        }
        iVar.H2(']');
    }

    public void g(i iVar) throws IOException {
        u uVar = this.Q;
        if (uVar != null) {
            iVar.K2(uVar);
        }
    }

    public void h(i iVar) throws IOException {
        this.P.m(iVar, this.S);
    }

    public void i(i iVar) throws IOException {
        if (this.R) {
            iVar.I2(this.U);
        } else {
            iVar.H2(this.T.d());
        }
    }

    public void j(i iVar) throws IOException {
        this.O.m(iVar, this.S);
    }

    public void k(i iVar, int i10) throws IOException {
        if (!this.P.l()) {
            this.S--;
        }
        if (i10 > 0) {
            this.P.m(iVar, this.S);
        } else {
            iVar.H2(f.f11698i);
        }
        iVar.H2('}');
    }

    public e l(boolean z10) {
        if (this.R == z10) {
            return this;
        }
        e eVar = new e(this);
        eVar.R = z10;
        return eVar;
    }

    /* renamed from: m */
    public e d() {
        if (getClass() == e.class) {
            return new e(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    public void n(b bVar) {
        if (bVar == null) {
            bVar = c.O;
        }
        this.O = bVar;
    }

    public void o(b bVar) {
        if (bVar == null) {
            bVar = c.O;
        }
        this.P = bVar;
    }

    public e p(b bVar) {
        if (bVar == null) {
            bVar = c.O;
        }
        if (this.O == bVar) {
            return this;
        }
        e eVar = new e(this);
        eVar.O = bVar;
        return eVar;
    }

    public e q(b bVar) {
        if (bVar == null) {
            bVar = c.O;
        }
        if (this.P == bVar) {
            return this;
        }
        e eVar = new e(this);
        eVar.P = bVar;
        return eVar;
    }

    public e r(String str) {
        return s(str == null ? null : new m(str));
    }

    public e s(u uVar) {
        u uVar2 = this.Q;
        return (uVar2 == uVar || (uVar != null && uVar.equals(uVar2))) ? this : new e(this, uVar);
    }

    public e t(m mVar) {
        this.T = mVar;
        this.U = " " + mVar.d() + " ";
        return this;
    }

    public e u() {
        return l(true);
    }

    public e v() {
        return l(false);
    }
}
