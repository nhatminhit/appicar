package l5;

import i5.b;
import i5.c;
import i5.d;
import i5.g;
import i5.j;
import i5.k;
import i5.l;
import i5.y;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import l5.y;
import m5.s;
import m5.w;
import q5.h;
import q5.z;
import u5.f;
import v4.l0;
import v4.m0;
import v4.n0;
import w4.p;

public class a extends k<Object> implements i, Serializable {
    public static final long W = 1;
    public final j O;
    public final s P;
    public final Map<String, v> Q;
    public transient Map<String, v> R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;

    public a(c cVar) {
        j E = cVar.E();
        this.O = E;
        this.P = null;
        this.Q = null;
        Class<?> g10 = E.g();
        this.S = g10.isAssignableFrom(String.class);
        boolean z10 = false;
        this.T = g10 == Boolean.TYPE || g10.isAssignableFrom(Boolean.class);
        this.U = g10 == Integer.TYPE || g10.isAssignableFrom(Integer.class);
        this.V = (g10 == Double.TYPE || g10.isAssignableFrom(Double.class)) ? true : z10;
    }

    public a(a aVar, s sVar, Map<String, v> map) {
        this.O = aVar.O;
        this.Q = aVar.Q;
        this.S = aVar.S;
        this.T = aVar.T;
        this.U = aVar.U;
        this.V = aVar.V;
        this.P = sVar;
        this.R = map;
    }

    @Deprecated
    public a(e eVar, c cVar, Map<String, v> map) {
        this(eVar, cVar, map, (Map<String, v>) null);
    }

    public a(e eVar, c cVar, Map<String, v> map, Map<String, v> map2) {
        j E = cVar.E();
        this.O = E;
        this.P = eVar.t();
        this.Q = map;
        this.R = map2;
        Class<?> g10 = E.g();
        this.S = g10.isAssignableFrom(String.class);
        boolean z10 = false;
        this.T = g10 == Boolean.TYPE || g10.isAssignableFrom(Boolean.class);
        this.U = g10 == Integer.TYPE || g10.isAssignableFrom(Integer.class);
        this.V = (g10 == Double.TYPE || g10.isAssignableFrom(Double.class)) ? true : z10;
    }

    public static a y(c cVar) {
        return new a(cVar);
    }

    public k<?> a(g gVar, d dVar) throws l {
        h i10;
        z J;
        v vVar;
        j jVar;
        l0 l0Var;
        b o10 = gVar.o();
        if (dVar == null || o10 == null || (i10 = dVar.i()) == null || (J = o10.J(i10)) == null) {
            return this.R == null ? this : new a(this, this.P, (Map<String, v>) null);
        }
        n0 y10 = gVar.y(i10, J);
        z K = o10.K(i10, J);
        Class<? extends l0<?>> c10 = K.c();
        if (c10 == m0.d.class) {
            y d10 = K.d();
            Map<String, v> map = this.R;
            v vVar2 = map == null ? null : map.get(d10.d());
            if (vVar2 == null) {
                gVar.z(this.O, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", new Object[]{r().getName(), d10}));
            }
            j e10 = vVar2.e();
            l0Var = new w(K.f());
            jVar = e10;
            vVar = vVar2;
        } else {
            y10 = gVar.y(i10, K);
            j jVar2 = gVar.u().e0(gVar.H(c10), l0.class)[0];
            l0Var = gVar.x(i10, K);
            vVar = null;
            jVar = jVar2;
        }
        return new a(this, s.a(jVar, K.d(), l0Var, gVar.Q(jVar), vVar, y10), (Map<String, v>) null);
    }

    public Object f(w4.l lVar, g gVar) throws IOException {
        return gVar.c0(this.O.g(), new y.a(this.O), lVar, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    public Object h(w4.l lVar, g gVar, f fVar) throws IOException {
        p P2;
        if (!(this.P == null || (P2 = lVar.P()) == null)) {
            if (P2.k()) {
                return w(lVar, gVar);
            }
            if (P2 == p.START_OBJECT) {
                P2 = lVar.D2();
            }
            if (P2 == p.FIELD_NAME && this.P.e() && this.P.d(lVar.X0(), lVar)) {
                return w(lVar, gVar);
            }
        }
        Object x10 = x(lVar, gVar);
        return x10 != null ? x10 : fVar.e(lVar, gVar);
    }

    public v j(String str) {
        Map<String, v> map = this.Q;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public s q() {
        return this.P;
    }

    public Class<?> r() {
        return this.O.g();
    }

    public boolean s() {
        return true;
    }

    public Boolean u(i5.f fVar) {
        return null;
    }

    public Object w(w4.l lVar, g gVar) throws IOException {
        Object f10 = this.P.f(lVar, gVar);
        s sVar = this.P;
        m5.z P2 = gVar.P(f10, sVar.Q, sVar.R);
        Object g10 = P2.g();
        if (g10 != null) {
            return g10;
        }
        throw new w(lVar, "Could not resolve Object Id [" + f10 + "] -- unresolved forward-reference?", lVar.W0(), P2);
    }

    public Object x(w4.l lVar, g gVar) throws IOException {
        switch (lVar.Q()) {
            case 6:
                if (this.S) {
                    return lVar.Y1();
                }
                return null;
            case 7:
                if (this.U) {
                    return Integer.valueOf(lVar.N1());
                }
                return null;
            case 8:
                if (this.V) {
                    return Double.valueOf(lVar.m1());
                }
                return null;
            case 9:
                if (this.T) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this.T) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }
}
