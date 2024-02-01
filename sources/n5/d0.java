package n5;

import i5.g;
import i5.j;
import i5.k;
import i5.l;
import i5.m;
import java.io.IOException;
import l5.t;
import u5.f;
import w4.n;

public abstract class d0<T> extends a0<T> implements t {
    public static final long U = 1;
    public k<Object> T;

    public d0(j jVar) {
        super(jVar);
    }

    public d0(Class<T> cls) {
        super((Class<?>) cls);
    }

    public d0(d0<?> d0Var) {
        super((a0<?>) d0Var);
        this.T = d0Var.T;
    }

    public abstract T E0(m mVar, g gVar) throws IOException;

    public void b(g gVar) throws l {
        this.T = gVar.Q(gVar.H(m.class));
    }

    public T f(w4.l lVar, g gVar) throws IOException {
        return E0((m) this.T.f(lVar, gVar), gVar);
    }

    public Object h(w4.l lVar, g gVar, f fVar) throws IOException, n {
        return E0((m) this.T.h(lVar, gVar, fVar), gVar);
    }
}
