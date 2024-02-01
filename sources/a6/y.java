package a6;

import i5.b;
import i5.j;
import i5.x;
import java.util.Collections;
import java.util.Iterator;
import k5.i;
import q5.f;
import q5.h;
import q5.l;
import q5.s;
import v4.u;
import z5.n;

public class y extends s {
    public final b P;
    public final h Q;
    public final x R;
    public final i5.y S;
    public final u.b T;

    public y(b bVar, h hVar, i5.y yVar, x xVar, u.b bVar2) {
        this.P = bVar;
        this.Q = hVar;
        this.S = yVar;
        this.R = xVar == null ? x.X : xVar;
        this.T = bVar2;
    }

    public static y U(i<?> iVar, h hVar) {
        return new y(iVar.m(), hVar, i5.y.a(hVar.f()), (x) null, s.O);
    }

    public static y V(i<?> iVar, h hVar, i5.y yVar) {
        return X(iVar, hVar, yVar, (x) null, s.O);
    }

    public static y W(i<?> iVar, h hVar, i5.y yVar, x xVar, u.a aVar) {
        return new y(iVar.m(), hVar, yVar, xVar, (aVar == null || aVar == u.a.USE_DEFAULTS) ? s.O : u.b.b(aVar, (u.a) null));
    }

    public static y X(i<?> iVar, h hVar, i5.y yVar, x xVar, u.b bVar) {
        return new y(iVar.m(), hVar, yVar, xVar, bVar);
    }

    public Iterator<l> A() {
        l z10 = z();
        return z10 == null ? h.n() : Collections.singleton(z10).iterator();
    }

    public f B() {
        h hVar = this.Q;
        if (hVar instanceof f) {
            return (f) hVar;
        }
        return null;
    }

    public q5.i C() {
        h hVar = this.Q;
        if (!(hVar instanceof q5.i) || ((q5.i) hVar).C() != 0) {
            return null;
        }
        return (q5.i) this.Q;
    }

    public String D() {
        return getName();
    }

    public h G() {
        return this.Q;
    }

    public j H() {
        h hVar = this.Q;
        return hVar == null ? n.l0() : hVar.h();
    }

    public Class<?> I() {
        h hVar = this.Q;
        return hVar == null ? Object.class : hVar.g();
    }

    public q5.i J() {
        h hVar = this.Q;
        if (!(hVar instanceof q5.i) || ((q5.i) hVar).C() != 1) {
            return null;
        }
        return (q5.i) this.Q;
    }

    public boolean K() {
        return this.Q instanceof l;
    }

    public boolean L() {
        return this.Q instanceof f;
    }

    public boolean M() {
        return C() != null;
    }

    public boolean N(i5.y yVar) {
        return this.S.equals(yVar);
    }

    public boolean O() {
        return J() != null;
    }

    public boolean P() {
        return false;
    }

    public boolean Q() {
        return false;
    }

    public s S(i5.y yVar) {
        if (this.S.equals(yVar)) {
            return this;
        }
        return new y(this.P, this.Q, yVar, this.R, this.T);
    }

    public s T(String str) {
        return (!this.S.g(str) || this.S.e()) ? new y(this.P, this.Q, new i5.y(str), this.R, this.T) : this;
    }

    public s Y(u.b bVar) {
        return this.T == bVar ? this : new y(this.P, this.Q, this.S, this.R, bVar);
    }

    public s Z(x xVar) {
        if (xVar.equals(this.R)) {
            return this;
        }
        return new y(this.P, this.Q, this.S, xVar, this.T);
    }

    public i5.y a() {
        return this.S;
    }

    public x d() {
        return this.R;
    }

    public String getName() {
        return this.S.d();
    }

    public i5.y o() {
        h hVar;
        b bVar = this.P;
        if (bVar == null || (hVar = this.Q) == null) {
            return null;
        }
        return bVar.t0(hVar);
    }

    public u.b t() {
        return this.T;
    }

    public l z() {
        h hVar = this.Q;
        if (hVar instanceof l) {
            return (l) hVar;
        }
        return null;
    }
}
