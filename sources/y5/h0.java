package y5;

import a6.h;
import com.fasterxml.jackson.databind.ser.j;
import com.fasterxml.jackson.databind.ser.p;
import i5.d;
import i5.e0;
import i5.l;
import i5.m;
import i5.o;
import java.io.IOException;
import java.lang.reflect.Type;
import s5.e;
import s5.g;
import t5.c;
import w4.i;

public class h0 extends m0<Object> implements j, p, e, c {
    public final a6.j<Object, ?> R;
    public final i5.j S;
    public final o<Object> T;

    public h0(a6.j<?, ?> jVar) {
        super(Object.class);
        this.R = jVar;
        this.S = null;
        this.T = null;
    }

    public h0(a6.j<Object, ?> jVar, i5.j jVar2, o<?> oVar) {
        super(jVar2);
        this.R = jVar;
        this.S = jVar2;
        this.T = oVar;
    }

    public <T> h0(Class<T> cls, a6.j<T, ?> jVar) {
        super(cls, false);
        this.R = jVar;
        this.S = null;
        this.T = null;
    }

    public o<Object> M(Object obj, e0 e0Var) throws l {
        return e0Var.h0(obj.getClass());
    }

    public Object N(Object obj) {
        return this.R.a(obj);
    }

    public a6.j<Object, ?> O() {
        return this.R;
    }

    public h0 P(a6.j<Object, ?> jVar, i5.j jVar2, o<?> oVar) {
        h.u0(h0.class, this, "withDelegate");
        return new h0(jVar, jVar2, oVar);
    }

    public m a(e0 e0Var, Type type) throws l {
        o<Object> oVar = this.T;
        return oVar instanceof c ? ((c) oVar).a(e0Var, type) : super.a(e0Var, type);
    }

    public void b(e0 e0Var) throws l {
        o<Object> oVar = this.T;
        if (oVar != null && (oVar instanceof p)) {
            ((p) oVar).b(e0Var);
        }
    }

    public m c(e0 e0Var, Type type, boolean z10) throws l {
        o<Object> oVar = this.T;
        return oVar instanceof c ? ((c) oVar).c(e0Var, type, z10) : super.a(e0Var, type);
    }

    public o<?> d(e0 e0Var, d dVar) throws l {
        o oVar = this.T;
        i5.j jVar = this.S;
        if (oVar == null) {
            if (jVar == null) {
                jVar = this.R.c(e0Var.u());
            }
            if (!jVar.X()) {
                oVar = e0Var.f0(jVar);
            }
        }
        if (oVar instanceof j) {
            oVar = e0Var.s0(oVar, dVar);
        }
        return (oVar == this.T && jVar == this.S) ? this : P(this.R, jVar, oVar);
    }

    public void e(g gVar, i5.j jVar) throws l {
        o<Object> oVar = this.T;
        if (oVar != null) {
            oVar.e(gVar, jVar);
        }
    }

    public o<?> f() {
        return this.T;
    }

    public boolean h(e0 e0Var, Object obj) {
        Object N = N(obj);
        if (N == null) {
            return true;
        }
        o<Object> oVar = this.T;
        return oVar == null ? obj == null : oVar.h(e0Var, N);
    }

    public void m(Object obj, i iVar, e0 e0Var) throws IOException {
        Object N = N(obj);
        if (N == null) {
            e0Var.R(iVar);
            return;
        }
        o<Object> oVar = this.T;
        if (oVar == null) {
            oVar = M(N, e0Var);
        }
        oVar.m(N, iVar, e0Var);
    }

    public void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        Object N = N(obj);
        o<Object> oVar = this.T;
        if (oVar == null) {
            oVar = M(obj, e0Var);
        }
        oVar.n(N, iVar, e0Var, iVar2);
    }
}
