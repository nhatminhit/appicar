package y5;

import a6.h;
import com.fasterxml.jackson.databind.ser.n;
import i5.d;
import i5.d0;
import i5.e0;
import i5.j;
import i5.l;
import i5.o;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import s5.b;
import s5.e;
import s5.g;
import s5.k;
import s5.m;
import t5.c;
import v4.n;
import v4.u;
import w4.i;
import w4.l;

public abstract class m0<T> extends o<T> implements e, c, Serializable {
    public static final long P = 1;
    public static final Object Q = new Object();
    public final Class<T> O;

    public m0(j jVar) {
        this.O = jVar.g();
    }

    public m0(Class<T> cls) {
        this.O = cls;
    }

    public m0(Class<?> cls, boolean z10) {
        this.O = cls;
    }

    public m0(m0<?> m0Var) {
        this.O = m0Var.O;
    }

    public static final boolean r(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final boolean s(Collection<?> collection) {
        return collection != null && !collection.isEmpty();
    }

    public u.b A(e0 e0Var, d dVar, Class<?> cls) {
        return dVar != null ? dVar.n(e0Var.q(), cls) : e0Var.m0(cls);
    }

    public n B(e0 e0Var, Object obj, Object obj2) throws l {
        com.fasterxml.jackson.databind.ser.l n02 = e0Var.n0();
        if (n02 == null) {
            Class g10 = g();
            e0Var.A(g10, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        }
        return n02.b(obj, obj2);
    }

    public boolean C(o<?> oVar) {
        return h.Y(oVar);
    }

    public void D(g gVar, j jVar, o<?> oVar, j jVar2) throws l {
        b m10 = gVar.m(jVar);
        if (r(m10, oVar)) {
            m10.g(oVar, jVar2);
        }
    }

    public void E(g gVar, j jVar, s5.d dVar) throws l {
        b m10 = gVar.m(jVar);
        if (m10 != null) {
            m10.i(dVar);
        }
    }

    public void F(g gVar, j jVar, l.b bVar) throws i5.l {
        k r10 = gVar.r(jVar);
        if (r10 != null) {
            r10.a(bVar);
        }
    }

    public void G(g gVar, j jVar, l.b bVar) throws i5.l {
        s5.h d10 = gVar.d(jVar);
        if (r(d10, bVar)) {
            d10.a(bVar);
        }
    }

    public void H(g gVar, j jVar, l.b bVar, s5.n nVar) throws i5.l {
        s5.h d10 = gVar.d(jVar);
        if (d10 != null) {
            if (bVar != null) {
                d10.a(bVar);
            }
            if (nVar != null) {
                d10.c(nVar);
            }
        }
    }

    public void I(g gVar, j jVar) throws i5.l {
        gVar.e(jVar);
    }

    public void J(g gVar, j jVar, s5.n nVar) throws i5.l {
        m e10 = gVar.e(jVar);
        if (e10 != null) {
            e10.c(nVar);
        }
    }

    public void K(e0 e0Var, Throwable th2, Object obj, int i10) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        h.o0(th2);
        boolean z10 = e0Var == null || e0Var.w0(d0.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof i5.l)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            h.q0(th2);
        }
        throw i5.l.x(th2, obj, i10);
    }

    public void L(e0 e0Var, Throwable th2, Object obj, String str) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        h.o0(th2);
        boolean z10 = e0Var == null || e0Var.w0(d0.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof i5.l)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            h.q0(th2);
        }
        throw i5.l.y(th2, obj, str);
    }

    public i5.m a(e0 e0Var, Type type) throws i5.l {
        return t("string");
    }

    public i5.m c(e0 e0Var, Type type, boolean z10) throws i5.l {
        com.fasterxml.jackson.databind.node.u uVar = (com.fasterxml.jackson.databind.node.u) a(e0Var, type);
        if (!z10) {
            uVar.X1("required", !z10);
        }
        return uVar;
    }

    public void e(g gVar, j jVar) throws i5.l {
        gVar.q(jVar);
    }

    public Class<T> g() {
        return this.O;
    }

    public abstract void m(T t10, i iVar, e0 e0Var) throws IOException;

    public com.fasterxml.jackson.databind.node.u t(String str) {
        com.fasterxml.jackson.databind.node.u A = com.fasterxml.jackson.databind.node.m.S.A();
        A.T1("type", str);
        return A;
    }

    public com.fasterxml.jackson.databind.node.u u(String str, boolean z10) {
        com.fasterxml.jackson.databind.node.u t10 = t(str);
        if (!z10) {
            t10.X1("required", !z10);
        }
        return t10;
    }

    public o<?> v(e0 e0Var, d dVar) throws i5.l {
        Object j10;
        if (dVar == null) {
            return null;
        }
        q5.h i10 = dVar.i();
        i5.b o10 = e0Var.o();
        if (i10 == null || (j10 = o10.j(i10)) == null) {
            return null;
        }
        return e0Var.G0(i10, j10);
    }

    public o<?> w(e0 e0Var, d dVar, o<?> oVar) throws i5.l {
        Object obj = Q;
        Map map = (Map) e0Var.p(obj);
        if (map == null) {
            map = new IdentityHashMap();
            e0Var.D(obj, map);
        } else if (map.get(dVar) != null) {
            return oVar;
        }
        map.put(dVar, Boolean.TRUE);
        try {
            o<?> x10 = x(e0Var, dVar, oVar);
            if (x10 != null) {
                return e0Var.s0(x10, dVar);
            }
            map.remove(dVar);
            return oVar;
        } finally {
            map.remove(dVar);
        }
    }

    @Deprecated
    public o<?> x(e0 e0Var, d dVar, o<?> oVar) throws i5.l {
        q5.h i10;
        Object b02;
        i5.b o10 = e0Var.o();
        if (!r(o10, dVar) || (i10 = dVar.i()) == null || (b02 = o10.b0(i10)) == null) {
            return oVar;
        }
        a6.j<Object, Object> m10 = e0Var.m(dVar.i(), b02);
        j c10 = m10.c(e0Var.u());
        o<Object> oVar2 = oVar;
        if (oVar == null) {
            oVar2 = oVar;
            if (!c10.X()) {
                oVar2 = e0Var.f0(c10);
            }
        }
        return new h0(m10, c10, oVar2);
    }

    public Boolean y(e0 e0Var, d dVar, Class<?> cls, n.a aVar) {
        n.d z10 = z(e0Var, dVar, cls);
        if (z10 != null) {
            return z10.h(aVar);
        }
        return null;
    }

    public n.d z(e0 e0Var, d dVar, Class<?> cls) {
        return dVar != null ? dVar.q(e0Var.q(), cls) : e0Var.r(cls);
    }
}
