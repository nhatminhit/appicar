package l5;

import a6.h;
import a6.q;
import i5.b;
import i5.c;
import i5.f;
import i5.g;
import i5.j;
import i5.k;
import i5.l;
import i5.m;
import i5.p;
import java.io.Serializable;
import java.util.HashMap;
import n5.z;
import v4.n;
import z5.a;
import z5.d;
import z5.e;
import z5.i;

public final class o implements Serializable {
    public static final long Q = 1;
    public final q<j, k<Object>> O;
    public final HashMap<j, k<Object>> P;

    public o() {
        this(2000);
    }

    public o(int i10) {
        this.P = new HashMap<>(8);
        this.O = new q<>(Math.min(64, i10 >> 2), i10);
    }

    public k<Object> a(g gVar, p pVar, j jVar) throws l {
        try {
            k<Object> c10 = c(gVar, pVar, jVar);
            if (c10 == null) {
                return null;
            }
            boolean z10 = !h(jVar) && c10.s();
            if (c10 instanceof t) {
                this.P.put(jVar, c10);
                ((t) c10).b(gVar);
                this.P.remove(jVar);
            }
            if (z10) {
                this.O.c(jVar, c10);
            }
            return c10;
        } catch (IllegalArgumentException e10) {
            throw l.i(gVar, h.o(e10), e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.k<java.lang.Object> b(i5.g r4, l5.p r5, i5.j r6) throws i5.l {
        /*
            r3 = this;
            java.util.HashMap<i5.j, i5.k<java.lang.Object>> r0 = r3.P
            monitor-enter(r0)
            i5.k r1 = r3.e(r6)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r1
        L_0x000b:
            java.util.HashMap<i5.j, i5.k<java.lang.Object>> r1 = r3.P     // Catch:{ all -> 0x0045 }
            int r1 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r1 <= 0) goto L_0x001f
            java.util.HashMap<i5.j, i5.k<java.lang.Object>> r2 = r3.P     // Catch:{ all -> 0x0045 }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x0045 }
            i5.k r2 = (i5.k) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r2
        L_0x001f:
            i5.k r4 = r3.a(r4, r5, r6)     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            java.util.HashMap<i5.j, i5.k<java.lang.Object>> r5 = r3.P     // Catch:{ all -> 0x0045 }
            int r5 = r5.size()     // Catch:{ all -> 0x0045 }
            if (r5 <= 0) goto L_0x0032
            java.util.HashMap<i5.j, i5.k<java.lang.Object>> r5 = r3.P     // Catch:{ all -> 0x0045 }
            r5.clear()     // Catch:{ all -> 0x0045 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r4
        L_0x0034:
            r4 = move-exception
            if (r1 != 0) goto L_0x0044
            java.util.HashMap<i5.j, i5.k<java.lang.Object>> r5 = r3.P     // Catch:{ all -> 0x0045 }
            int r5 = r5.size()     // Catch:{ all -> 0x0045 }
            if (r5 <= 0) goto L_0x0044
            java.util.HashMap<i5.j, i5.k<java.lang.Object>> r5 = r3.P     // Catch:{ all -> 0x0045 }
            r5.clear()     // Catch:{ all -> 0x0045 }
        L_0x0044:
            throw r4     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.o.b(i5.g, l5.p, i5.j):i5.k");
    }

    public k<Object> c(g gVar, p pVar, j jVar) throws l {
        f T = gVar.q();
        if (jVar.k() || jVar.t() || jVar.m()) {
            jVar = pVar.o(T, jVar);
        }
        c P0 = T.P0(jVar);
        k<Object> m10 = m(gVar, P0.z());
        if (m10 != null) {
            return m10;
        }
        j r10 = r(gVar, P0.z(), jVar);
        if (r10 != jVar) {
            P0 = T.P0(r10);
            jVar = r10;
        }
        Class<?> r11 = P0.r();
        if (r11 != null) {
            return pVar.c(gVar, jVar, P0, r11);
        }
        a6.j<Object, Object> k10 = P0.k();
        if (k10 == null) {
            return d(gVar, pVar, jVar, P0);
        }
        j b10 = k10.b(gVar.u());
        if (!b10.j(jVar.g())) {
            P0 = T.P0(b10);
        }
        return new z(k10, b10, d(gVar, pVar, b10, P0));
    }

    public k<?> d(g gVar, p pVar, j jVar, c cVar) throws l {
        n.d l10;
        n.d l11;
        f T = gVar.q();
        if (jVar.p()) {
            return pVar.f(gVar, jVar, cVar);
        }
        if (jVar.o()) {
            if (jVar.l()) {
                return pVar.a(gVar, (a) jVar, cVar);
            }
            if (jVar.t() && ((l11 = cVar.l((n.d) null)) == null || l11.m() != n.c.OBJECT)) {
                z5.f fVar = (z5.f) jVar;
                return fVar.n0() ? pVar.h(gVar, (z5.g) fVar, cVar) : pVar.i(gVar, fVar, cVar);
            } else if (jVar.m() && ((l10 = cVar.l((n.d) null)) == null || l10.m() != n.c.OBJECT)) {
                d dVar = (d) jVar;
                return dVar.o0() ? pVar.d(gVar, (e) dVar, cVar) : pVar.e(gVar, dVar, cVar);
            }
        }
        return jVar.v() ? pVar.j(gVar, (i) jVar, cVar) : m.class.isAssignableFrom(jVar.g()) ? pVar.k(T, jVar, cVar) : pVar.b(gVar, jVar, cVar);
    }

    public k<Object> e(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        } else if (h(jVar)) {
            return null;
        } else {
            return this.O.b(jVar);
        }
    }

    public p f(g gVar, j jVar) throws l {
        return (p) gVar.z(jVar, "Cannot find a (Map) Key deserializer for type " + jVar);
    }

    public k<Object> g(g gVar, j jVar) throws l {
        StringBuilder sb2;
        String str;
        if (!h.T(jVar.g())) {
            sb2 = new StringBuilder();
            str = "Cannot find a Value deserializer for abstract type ";
        } else {
            sb2 = new StringBuilder();
            str = "Cannot find a Value deserializer for type ";
        }
        sb2.append(str);
        sb2.append(jVar);
        return (k) gVar.z(jVar, sb2.toString());
    }

    public final boolean h(j jVar) {
        if (!jVar.o()) {
            return false;
        }
        j G = jVar.d();
        if (G == null || (G.S() == null && G.R() == null)) {
            return jVar.t() && jVar.e().S() != null;
        }
        return true;
    }

    public final Class<?> i(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            Class<?> cls2 = (Class) obj;
            if (cls2 == cls || h.R(cls2)) {
                return null;
            }
            return cls2;
        }
        throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
    }

    public int j() {
        return this.O.g();
    }

    public a6.j<Object, Object> k(g gVar, q5.a aVar) throws l {
        Object p10 = gVar.o().p(aVar);
        if (p10 == null) {
            return null;
        }
        return gVar.m(aVar, p10);
    }

    public k<Object> l(g gVar, q5.a aVar, k<Object> kVar) throws l {
        a6.j<Object, Object> k10 = k(gVar, aVar);
        return k10 == null ? kVar : new z(k10, k10.b(gVar.u()), kVar);
    }

    public k<Object> m(g gVar, q5.a aVar) throws l {
        Object s10 = gVar.o().s(aVar);
        if (s10 == null) {
            return null;
        }
        return l(gVar, aVar, gVar.I(aVar, s10));
    }

    public p n(g gVar, p pVar, j jVar) throws l {
        p g10 = pVar.g(gVar, jVar);
        if (g10 == null) {
            return f(gVar, jVar);
        }
        if (g10 instanceof t) {
            ((t) g10).b(gVar);
        }
        return g10;
    }

    public k<Object> o(g gVar, p pVar, j jVar) throws l {
        k<Object> e10 = e(jVar);
        if (e10 != null) {
            return e10;
        }
        k<Object> b10 = b(gVar, pVar, jVar);
        return b10 == null ? g(gVar, jVar) : b10;
    }

    public void p() {
        this.O.a();
    }

    public boolean q(g gVar, p pVar, j jVar) throws l {
        k<Object> e10 = e(jVar);
        if (e10 == null) {
            e10 = b(gVar, pVar, jVar);
        }
        return e10 != null;
    }

    public final j r(g gVar, q5.a aVar, j jVar) throws l {
        Object i10;
        j O2;
        Object C;
        p w02;
        b o10 = gVar.o();
        if (o10 == null) {
            return jVar;
        }
        if (!(!jVar.t() || (O2 = jVar.e()) == null || O2.S() != null || (C = o10.C(aVar)) == null || (w02 = gVar.w0(aVar, C)) == null)) {
            jVar = ((z5.f) jVar).t0(w02);
            jVar.e();
        }
        j G = jVar.d();
        if (!(G == null || G.S() != null || (i10 = o10.i(aVar)) == null)) {
            k<Object> kVar = null;
            if (i10 instanceof k) {
                k kVar2 = (k) i10;
            } else {
                Class<?> i11 = i(i10, "findContentDeserializer", k.a.class);
                if (i11 != null) {
                    kVar = gVar.I(aVar, i11);
                }
            }
            if (kVar != null) {
                jVar = jVar.e0(kVar);
            }
        }
        return o10.I0(gVar.q(), aVar, jVar);
    }

    public Object s() {
        this.P.clear();
        return this;
    }
}
