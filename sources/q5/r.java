package q5;

import a6.h;
import i5.b;
import i5.c0;
import i5.f;
import i5.j;
import i5.m;
import j5.e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import k5.i;
import q5.t;
import z5.k;

public class r extends t implements Serializable {
    public static final long O = 2;
    public static final Class<?> P;
    public static final Class<?> Q;
    public static final Class<?> R = m.class;
    public static final q S;
    public static final q T;
    public static final q U;
    public static final q V;
    public static final q W;

    static {
        Class<String> cls = String.class;
        Class<Object> cls2 = Object.class;
        P = cls2;
        Q = cls;
        S = q.Q((i<?>) null, k.o0(cls), c.h(cls));
        Class cls3 = Boolean.TYPE;
        T = q.Q((i<?>) null, k.o0(cls3), c.h(cls3));
        Class cls4 = Integer.TYPE;
        U = q.Q((i<?>) null, k.o0(cls4), c.h(cls4));
        Class cls5 = Long.TYPE;
        V = q.Q((i<?>) null, k.o0(cls5), c.h(cls5));
        W = q.Q((i<?>) null, k.o0(cls2), c.h(cls2));
    }

    public t a() {
        return new r();
    }

    public q h(i<?> iVar, j jVar) {
        if (j(jVar)) {
            return q.Q(iVar, jVar, k(iVar, jVar, iVar));
        }
        return null;
    }

    public q i(i<?> iVar, j jVar) {
        Class<?> g10 = jVar.g();
        if (g10.isPrimitive()) {
            if (g10 == Integer.TYPE) {
                return U;
            }
            if (g10 == Long.TYPE) {
                return V;
            }
            if (g10 == Boolean.TYPE) {
                return T;
            }
            return null;
        } else if (h.W(g10)) {
            if (g10 == P) {
                return W;
            }
            if (g10 == Q) {
                return S;
            }
            if (g10 == Integer.class) {
                return U;
            }
            if (g10 == Long.class) {
                return V;
            }
            if (g10 == Boolean.class) {
                return T;
            }
            return null;
        } else if (R.isAssignableFrom(g10)) {
            return q.Q(iVar, jVar, c.h(g10));
        } else {
            return null;
        }
    }

    public boolean j(j jVar) {
        if (jVar.o() && !jVar.l()) {
            Class<?> g10 = jVar.g();
            return h.W(g10) && (Collection.class.isAssignableFrom(g10) || Map.class.isAssignableFrom(g10));
        }
    }

    public b k(i<?> iVar, j jVar, t.a aVar) {
        return c.i(iVar, jVar, aVar);
    }

    public b l(i<?> iVar, j jVar, t.a aVar) {
        return c.m(iVar, jVar, aVar);
    }

    public a0 m(i<?> iVar, j jVar, t.a aVar, boolean z10, String str) {
        return o(iVar, k(iVar, jVar, aVar), jVar, z10, str);
    }

    public a0 n(i<?> iVar, j jVar, t.a aVar, boolean z10) {
        b k10 = k(iVar, jVar, aVar);
        e.a aVar2 = null;
        b m10 = iVar.S() ? iVar.m() : null;
        if (m10 != null) {
            aVar2 = m10.M(k10);
        }
        return o(iVar, k10, jVar, z10, aVar2 == null ? e.L : aVar2.f9523b);
    }

    public a0 o(i<?> iVar, b bVar, j jVar, boolean z10, String str) {
        return new a0(iVar, z10, jVar, bVar, str);
    }

    /* renamed from: p */
    public q b(i<?> iVar, j jVar, t.a aVar) {
        q i10 = i(iVar, jVar);
        return i10 == null ? q.Q(iVar, jVar, k(iVar, jVar, aVar)) : i10;
    }

    /* renamed from: q */
    public q c(f fVar, j jVar, t.a aVar) {
        q i10 = i(fVar, jVar);
        if (i10 != null) {
            return i10;
        }
        q h10 = h(fVar, jVar);
        return h10 == null ? q.P(m(fVar, jVar, aVar, false, "set")) : h10;
    }

    /* renamed from: r */
    public q d(f fVar, j jVar, t.a aVar) {
        q i10 = i(fVar, jVar);
        if (i10 != null) {
            return i10;
        }
        q h10 = h(fVar, jVar);
        return h10 == null ? q.P(m(fVar, jVar, aVar, false, "set")) : h10;
    }

    /* renamed from: s */
    public q e(f fVar, j jVar, t.a aVar) {
        return q.P(n(fVar, jVar, aVar, false));
    }

    /* renamed from: t */
    public q f(i<?> iVar, j jVar, t.a aVar) {
        q i10 = i(iVar, jVar);
        return i10 == null ? q.Q(iVar, jVar, l(iVar, jVar, aVar)) : i10;
    }

    /* renamed from: u */
    public q g(c0 c0Var, j jVar, t.a aVar) {
        q i10 = i(c0Var, jVar);
        if (i10 != null) {
            return i10;
        }
        q h10 = h(c0Var, jVar);
        return h10 == null ? q.R(m(c0Var, jVar, aVar, true, "set")) : h10;
    }
}
