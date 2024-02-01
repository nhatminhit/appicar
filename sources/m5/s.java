package m5;

import i5.g;
import i5.j;
import i5.k;
import i5.y;
import java.io.IOException;
import java.io.Serializable;
import l5.v;
import v4.l0;
import v4.n0;
import w4.l;

public class s implements Serializable {
    public static final long U = 1;
    public final j O;
    public final y P;
    public final l0<?> Q;
    public final n0 R;
    public final k<Object> S;
    public final v T;

    public s(j jVar, y yVar, l0<?> l0Var, k<?> kVar, v vVar, n0 n0Var) {
        this.O = jVar;
        this.P = yVar;
        this.Q = l0Var;
        this.R = n0Var;
        this.S = kVar;
        this.T = vVar;
    }

    public static s a(j jVar, y yVar, l0<?> l0Var, k<?> kVar, v vVar, n0 n0Var) {
        return new s(jVar, yVar, l0Var, kVar, vVar, n0Var);
    }

    public k<Object> b() {
        return this.S;
    }

    public j c() {
        return this.O;
    }

    public boolean d(String str, l lVar) {
        return this.Q.e(str, lVar);
    }

    public boolean e() {
        return this.Q.g();
    }

    public Object f(l lVar, g gVar) throws IOException {
        return this.S.f(lVar, gVar);
    }
}
