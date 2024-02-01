package l5;

import a6.a;
import a6.b0;
import i5.d;
import i5.j;
import i5.k;
import i5.q;
import i5.x;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l5.y;
import m5.c;
import m5.c0;
import m5.d0;
import m5.g;
import m5.s;
import m5.t;
import m5.u;
import m5.v;
import m5.w;
import n5.a0;
import q5.h;
import q5.m;
import q5.z;
import u5.f;
import v4.f0;
import v4.l0;
import v4.m0;
import v4.n;
import v4.n0;
import v4.s;
import w4.l;
import w4.p;
import z5.b;

public abstract class d extends a0<Object> implements i, t, y.b, Serializable {

    /* renamed from: m0  reason: collision with root package name */
    public static final long f10135m0 = 1;

    /* renamed from: n0  reason: collision with root package name */
    public static final i5.y f10136n0 = new i5.y("#temporary-name");
    public final j T;
    public final n.c U;
    public final y V;
    public k<Object> W;
    public k<Object> X;
    public v Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f10137a0;

    /* renamed from: b0  reason: collision with root package name */
    public final c f10138b0;

    /* renamed from: c0  reason: collision with root package name */
    public final d0[] f10139c0;

    /* renamed from: d0  reason: collision with root package name */
    public u f10140d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Set<String> f10141e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f10142f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f10143g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Map<String, v> f10144h0;

    /* renamed from: i0  reason: collision with root package name */
    public transient HashMap<b, k<Object>> f10145i0;

    /* renamed from: j0  reason: collision with root package name */
    public c0 f10146j0;

    /* renamed from: k0  reason: collision with root package name */
    public g f10147k0;

    /* renamed from: l0  reason: collision with root package name */
    public final s f10148l0;

    public d(d dVar) {
        this(dVar, dVar.f10142f0);
    }

    public d(d dVar, a6.s sVar) {
        super(dVar.T);
        c cVar;
        this.T = dVar.T;
        this.V = dVar.V;
        this.W = dVar.W;
        this.Y = dVar.Y;
        this.f10144h0 = dVar.f10144h0;
        this.f10141e0 = dVar.f10141e0;
        this.f10142f0 = sVar != null || dVar.f10142f0;
        this.f10140d0 = dVar.f10140d0;
        this.f10139c0 = dVar.f10139c0;
        this.f10148l0 = dVar.f10148l0;
        this.Z = dVar.Z;
        c0 c0Var = dVar.f10146j0;
        if (sVar != null) {
            c0Var = c0Var != null ? c0Var.c(sVar) : c0Var;
            cVar = dVar.f10138b0.B(sVar);
        } else {
            cVar = dVar.f10138b0;
        }
        this.f10138b0 = cVar;
        this.f10146j0 = c0Var;
        this.f10143g0 = dVar.f10143g0;
        this.U = dVar.U;
        this.f10137a0 = false;
    }

    public d(d dVar, Set<String> set) {
        super(dVar.T);
        this.T = dVar.T;
        this.V = dVar.V;
        this.W = dVar.W;
        this.Y = dVar.Y;
        this.f10144h0 = dVar.f10144h0;
        this.f10141e0 = set;
        this.f10142f0 = dVar.f10142f0;
        this.f10140d0 = dVar.f10140d0;
        this.f10139c0 = dVar.f10139c0;
        this.Z = dVar.Z;
        this.f10146j0 = dVar.f10146j0;
        this.f10143g0 = dVar.f10143g0;
        this.U = dVar.U;
        this.f10137a0 = dVar.f10137a0;
        this.f10148l0 = dVar.f10148l0;
        this.f10138b0 = dVar.f10138b0.G(set);
    }

    public d(d dVar, c cVar) {
        super(dVar.T);
        this.T = dVar.T;
        this.V = dVar.V;
        this.W = dVar.W;
        this.Y = dVar.Y;
        this.f10138b0 = cVar;
        this.f10144h0 = dVar.f10144h0;
        this.f10141e0 = dVar.f10141e0;
        this.f10142f0 = dVar.f10142f0;
        this.f10140d0 = dVar.f10140d0;
        this.f10139c0 = dVar.f10139c0;
        this.f10148l0 = dVar.f10148l0;
        this.Z = dVar.Z;
        this.f10146j0 = dVar.f10146j0;
        this.f10143g0 = dVar.f10143g0;
        this.U = dVar.U;
        this.f10137a0 = dVar.f10137a0;
    }

    public d(d dVar, s sVar) {
        super(dVar.T);
        boolean z10;
        this.T = dVar.T;
        this.V = dVar.V;
        this.W = dVar.W;
        this.Y = dVar.Y;
        this.f10144h0 = dVar.f10144h0;
        this.f10141e0 = dVar.f10141e0;
        this.f10142f0 = dVar.f10142f0;
        this.f10140d0 = dVar.f10140d0;
        this.f10139c0 = dVar.f10139c0;
        this.Z = dVar.Z;
        this.f10146j0 = dVar.f10146j0;
        this.f10143g0 = dVar.f10143g0;
        this.U = dVar.U;
        this.f10148l0 = sVar;
        if (sVar == null) {
            this.f10138b0 = dVar.f10138b0;
            z10 = dVar.f10137a0;
        } else {
            this.f10138b0 = dVar.f10138b0.F(new u(sVar, x.W));
            z10 = false;
        }
        this.f10137a0 = z10;
    }

    public d(d dVar, boolean z10) {
        super(dVar.T);
        this.T = dVar.T;
        this.V = dVar.V;
        this.W = dVar.W;
        this.Y = dVar.Y;
        this.f10138b0 = dVar.f10138b0;
        this.f10144h0 = dVar.f10144h0;
        this.f10141e0 = dVar.f10141e0;
        this.f10142f0 = z10;
        this.f10140d0 = dVar.f10140d0;
        this.f10139c0 = dVar.f10139c0;
        this.f10148l0 = dVar.f10148l0;
        this.Z = dVar.Z;
        this.f10146j0 = dVar.f10146j0;
        this.f10143g0 = dVar.f10143g0;
        this.U = dVar.U;
        this.f10137a0 = dVar.f10137a0;
    }

    public d(e eVar, i5.c cVar, c cVar2, Map<String, v> map, Set<String> set, boolean z10, boolean z11) {
        super(cVar.E());
        this.T = cVar.E();
        y v10 = eVar.v();
        this.V = v10;
        this.f10138b0 = cVar2;
        this.f10144h0 = map;
        this.f10141e0 = set;
        this.f10142f0 = z10;
        this.f10140d0 = eVar.p();
        List<d0> s10 = eVar.s();
        n.c cVar3 = null;
        d0[] d0VarArr = (s10 == null || s10.isEmpty()) ? null : (d0[]) s10.toArray(new d0[s10.size()]);
        this.f10139c0 = d0VarArr;
        s t10 = eVar.t();
        this.f10148l0 = t10;
        boolean z12 = false;
        this.Z = this.f10146j0 != null || v10.j() || v10.f() || !v10.i();
        n.d l10 = cVar.l((n.d) null);
        this.U = l10 != null ? l10.m() : cVar3;
        this.f10143g0 = z11;
        if (!this.Z && d0VarArr == null && !z11 && t10 == null) {
            z12 = true;
        }
        this.f10137a0 = z12;
    }

    public void A0(l lVar, i5.g gVar, Object obj, String str) throws IOException {
        if (this.f10142f0) {
            lVar.Z2();
            return;
        }
        Set<String> set = this.f10141e0;
        if (set != null && set.contains(str)) {
            i1(lVar, gVar, obj, str);
        }
        super.A0(lVar, gVar, obj, str);
    }

    public Object E0(l lVar, i5.g gVar, Object obj, k<Object> kVar) throws IOException {
        b0 b0Var = new b0(lVar, gVar);
        if (obj instanceof String) {
            b0Var.Z2((String) obj);
        } else if (obj instanceof Long) {
            b0Var.p2(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            b0Var.o2(((Integer) obj).intValue());
        } else {
            b0Var.writeObject(obj);
        }
        l t32 = b0Var.t3();
        t32.D2();
        return kVar.f(t32, gVar);
    }

    public final k<Object> F0() {
        k<Object> kVar = this.W;
        return kVar == null ? this.X : kVar;
    }

    public abstract Object G0(l lVar, i5.g gVar) throws IOException;

    public final k<Object> H0(i5.g gVar, j jVar, m mVar) throws i5.l {
        d.b bVar = new d.b(f10136n0, jVar, (i5.y) null, mVar, x.X);
        f fVar = (f) jVar.R();
        if (fVar == null) {
            fVar = gVar.q().H0(jVar);
        }
        k kVar = (k) jVar.S();
        k s02 = kVar == null ? s0(gVar, jVar, bVar) : gVar.f0(kVar, bVar, jVar);
        return fVar != null ? new m5.b0(fVar.g(bVar), s02) : s02;
    }

    public a6.s I0(i5.g gVar, v vVar) throws i5.l {
        a6.s q02;
        h i10 = vVar.i();
        if (i10 == null || (q02 = gVar.o().q0(i10)) == null) {
            return null;
        }
        if (vVar instanceof k) {
            gVar.z(x0(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", new Object[]{vVar.getName()}));
        }
        return q02;
    }

    public k<Object> J0(i5.g gVar, Object obj, b0 b0Var) throws IOException {
        k<Object> kVar;
        synchronized (this) {
            HashMap<b, k<Object>> hashMap = this.f10145i0;
            kVar = hashMap == null ? null : hashMap.get(new b(obj.getClass()));
        }
        if (kVar != null) {
            return kVar;
        }
        k<Object> Q = gVar.Q(gVar.H(obj.getClass()));
        if (Q != null) {
            synchronized (this) {
                if (this.f10145i0 == null) {
                    this.f10145i0 = new HashMap<>();
                }
                this.f10145i0.put(new b(obj.getClass()), Q);
            }
        }
        return Q;
    }

    public Object K0(l lVar, i5.g gVar, Object obj, Object obj2) throws IOException {
        k<Object> b10 = this.f10148l0.b();
        if (b10.r() != obj2.getClass()) {
            obj2 = E0(lVar, gVar, obj2, b10);
        }
        s sVar = this.f10148l0;
        gVar.P(obj2, sVar.Q, sVar.R).b(obj);
        v vVar = this.f10148l0.T;
        return vVar != null ? vVar.N(obj, obj2) : obj;
    }

    public void L0(c cVar, v[] vVarArr, v vVar, v vVar2) {
        cVar.D(vVar, vVar2);
        if (vVarArr != null) {
            int length = vVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (vVarArr[i10] == vVar) {
                    vVarArr[i10] = vVar2;
                    return;
                }
            }
        }
    }

    public v M0(i5.g gVar, v vVar) {
        Class<?> g10;
        Class<?> K;
        k<Object> E = vVar.E();
        if ((E instanceof d) && !((d) E).e().i() && (K = a6.h.K(g10)) != null && K == this.T.g()) {
            Constructor[] constructors = (g10 = vVar.e().g()).getConstructors();
            int length = constructors.length;
            int i10 = 0;
            while (i10 < length) {
                Constructor constructor = constructors[i10];
                Class[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length != 1 || !K.equals(parameterTypes[0])) {
                    i10++;
                } else {
                    if (gVar.j()) {
                        a6.h.g(constructor, gVar.w(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new m5.j(vVar, (Constructor<?>) constructor);
                }
            }
        }
        return vVar;
    }

    public v N0(i5.g gVar, v vVar) throws i5.l {
        String A = vVar.A();
        if (A == null) {
            return vVar;
        }
        v j10 = vVar.E().j(A);
        if (j10 == null) {
            gVar.z(this.T, String.format("Cannot handle managed/back reference '%s': no back reference property found from type %s", new Object[]{A, vVar.e()}));
        }
        j jVar = this.T;
        j e10 = j10.e();
        boolean o10 = vVar.e().o();
        if (!e10.g().isAssignableFrom(jVar.g())) {
            gVar.z(this.T, String.format("Cannot handle managed/back reference '%s': back reference type (%s) not compatible with managed type (%s)", new Object[]{A, e10.g().getName(), jVar.g().getName()}));
        }
        return new m5.m(vVar, A, j10, o10);
    }

    public v O0(i5.g gVar, v vVar, x xVar) throws i5.l {
        x.a g10 = xVar.g();
        if (g10 != null) {
            k<Object> E = vVar.E();
            Boolean u10 = E.u(gVar.q());
            if (u10 == null) {
                if (g10.f9128b) {
                    return vVar;
                }
            } else if (!u10.booleanValue()) {
                if (!g10.f9128b) {
                    gVar.a0(E);
                }
                return vVar;
            }
            h hVar = g10.f9127a;
            hVar.l(gVar.w(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            if (!(vVar instanceof m5.a0)) {
                vVar = m5.n.Z(vVar, hVar);
            }
        }
        s v02 = v0(gVar, vVar, xVar);
        return v02 != null ? vVar.T(v02) : vVar;
    }

    public v P0(i5.g gVar, v vVar) throws i5.l {
        z C = vVar.C();
        k<Object> E = vVar.E();
        return (C == null && (E == null ? null : E.q()) == null) ? vVar : new t(vVar, C);
    }

    public abstract d Q0();

    public Iterator<v> R0() {
        v vVar = this.Y;
        return vVar == null ? Collections.emptyList().iterator() : vVar.g().iterator();
    }

    @Deprecated
    public Object S0(l lVar, i5.g gVar) throws IOException {
        return C(lVar, gVar);
    }

    public Object T0(l lVar, i5.g gVar) throws IOException {
        k<Object> F0 = F0();
        if (F0 == null || this.V.b()) {
            return this.V.l(gVar, lVar.Z0() == p.VALUE_TRUE);
        }
        Object u10 = this.V.u(gVar, F0.f(lVar, gVar));
        if (this.f10139c0 != null) {
            o1(gVar, u10);
        }
        return u10;
    }

    public Object U0(l lVar, i5.g gVar) throws IOException {
        l.b R1 = lVar.R1();
        if (R1 == l.b.DOUBLE || R1 == l.b.FLOAT) {
            k<Object> F0 = F0();
            if (F0 == null || this.V.c()) {
                return this.V.m(gVar, lVar.m1());
            }
            Object u10 = this.V.u(gVar, F0.f(lVar, gVar));
            if (this.f10139c0 != null) {
                o1(gVar, u10);
            }
            return u10;
        }
        k<Object> F02 = F0();
        if (F02 != null) {
            return this.V.u(gVar, F02.f(lVar, gVar));
        }
        return gVar.c0(r(), e(), lVar, "no suitable creator method found to deserialize from Number value (%s)", lVar.S1());
    }

    public Object V0(l lVar, i5.g gVar) throws IOException {
        if (this.f10148l0 != null) {
            return Y0(lVar, gVar);
        }
        k<Object> F0 = F0();
        if (F0 == null || this.V.g()) {
            Object p12 = lVar.p1();
            return (p12 == null || this.T.Z(p12.getClass())) ? p12 : gVar.n0(this.T, p12, lVar);
        }
        Object u10 = this.V.u(gVar, F0.f(lVar, gVar));
        if (this.f10139c0 != null) {
            o1(gVar, u10);
        }
        return u10;
    }

    public Object W0(l lVar, i5.g gVar) throws IOException {
        if (this.f10148l0 != null) {
            return Y0(lVar, gVar);
        }
        k<Object> F0 = F0();
        l.b R1 = lVar.R1();
        if (R1 == l.b.INT) {
            if (F0 == null || this.V.d()) {
                return this.V.n(gVar, lVar.N1());
            }
            Object u10 = this.V.u(gVar, F0.f(lVar, gVar));
            if (this.f10139c0 != null) {
                o1(gVar, u10);
            }
            return u10;
        } else if (R1 == l.b.LONG) {
            if (F0 == null || this.V.d()) {
                return this.V.o(gVar, lVar.P1());
            }
            Object u11 = this.V.u(gVar, F0.f(lVar, gVar));
            if (this.f10139c0 != null) {
                o1(gVar, u11);
            }
            return u11;
        } else if (F0 != null) {
            Object u12 = this.V.u(gVar, F0.f(lVar, gVar));
            if (this.f10139c0 != null) {
                o1(gVar, u12);
            }
            return u12;
        } else {
            return gVar.c0(r(), e(), lVar, "no suitable creator method found to deserialize from Number value (%s)", lVar.S1());
        }
    }

    public abstract Object X0(l lVar, i5.g gVar) throws IOException;

    public Object Y0(l lVar, i5.g gVar) throws IOException {
        Object f10 = this.f10148l0.f(lVar, gVar);
        s sVar = this.f10148l0;
        m5.z P = gVar.P(f10, sVar.Q, sVar.R);
        Object g10 = P.g();
        if (g10 != null) {
            return g10;
        }
        throw new w(lVar, "Could not resolve Object Id [" + f10 + "] (for " + this.T + ").", lVar.W0(), P);
    }

    public Object Z0(l lVar, i5.g gVar) throws IOException {
        k<Object> F0 = F0();
        if (F0 != null) {
            Object u10 = this.V.u(gVar, F0.f(lVar, gVar));
            if (this.f10139c0 != null) {
                o1(gVar, u10);
            }
            return u10;
        } else if (this.Y != null) {
            return G0(lVar, gVar);
        } else {
            Class<?> g10 = this.T.g();
            if (a6.h.a0(g10)) {
                return gVar.c0(g10, (y) null, lVar, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
            }
            return gVar.c0(g10, e(), lVar, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
        }
    }

    public k<?> a(i5.g gVar, i5.d dVar) throws i5.l {
        c cVar;
        c E;
        s.a U2;
        z J;
        v vVar;
        w wVar;
        j jVar;
        m5.s sVar = this.f10148l0;
        i5.b o10 = gVar.o();
        n.c cVar2 = null;
        h i10 = a0.O(dVar, o10) ? dVar.i() : null;
        if (!(i10 == null || (J = o10.J(i10)) == null)) {
            z K = o10.K(i10, J);
            Class<? extends l0<?>> c10 = K.c();
            n0 y10 = gVar.y(i10, K);
            if (c10 == m0.d.class) {
                i5.y d10 = K.d();
                v e12 = e1(d10);
                if (e12 == null) {
                    gVar.z(this.T, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", new Object[]{r().getName(), d10}));
                }
                jVar = e12.e();
                vVar = e12;
                wVar = new w(K.f());
            } else {
                jVar = gVar.u().e0(gVar.H(c10), l0.class)[0];
                vVar = null;
                wVar = gVar.x(i10, K);
            }
            j jVar2 = jVar;
            sVar = m5.s.a(jVar2, K.d(), wVar, gVar.Q(jVar2), vVar, y10);
        }
        d v12 = (sVar == null || sVar == this.f10148l0) ? this : v1(sVar);
        if (!(i10 == null || (U2 = o10.U(i10)) == null)) {
            Set<String> h10 = U2.h();
            if (!h10.isEmpty()) {
                Set<String> set = v12.f10141e0;
                if (set != null && !set.isEmpty()) {
                    HashSet hashSet = new HashSet(h10);
                    hashSet.addAll(set);
                    h10 = hashSet;
                }
                v12 = v12.t1(h10);
            }
            if (U2.p() && !this.f10142f0) {
                v12 = v12.u1(true);
            }
        }
        n.d u02 = u0(gVar, dVar, r());
        if (u02 != null) {
            if (u02.r()) {
                cVar2 = u02.m();
            }
            Boolean h11 = u02.h(n.a.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (!(h11 == null || (E = cVar.E(h11.booleanValue())) == (cVar = this.f10138b0))) {
                v12 = v12.s1(E);
            }
        }
        if (cVar2 == null) {
            cVar2 = this.U;
        }
        return cVar2 == n.c.ARRAY ? v12.Q0() : v12;
    }

    public Object a1(l lVar, i5.g gVar) throws IOException {
        if (this.f10148l0 != null) {
            return Y0(lVar, gVar);
        }
        k<Object> F0 = F0();
        if (F0 == null || this.V.g()) {
            return this.V.r(gVar, lVar.Y1());
        }
        Object u10 = this.V.u(gVar, F0.f(lVar, gVar));
        if (this.f10139c0 != null) {
            o1(gVar, u10);
        }
        return u10;
    }

    public void b(i5.g gVar) throws i5.l {
        v[] vVarArr;
        k<Object> E;
        k<Object> v10;
        g.a aVar = null;
        boolean z10 = false;
        if (this.V.f()) {
            vVarArr = this.V.A(gVar.q());
            if (this.f10141e0 != null) {
                int length = vVarArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    if (this.f10141e0.contains(vVarArr[i10].getName())) {
                        vVarArr[i10].L();
                    }
                }
            }
        } else {
            vVarArr = null;
        }
        Iterator<v> it = this.f10138b0.iterator();
        while (it.hasNext()) {
            v next = it.next();
            if (!next.G()) {
                k<Object> c12 = c1(gVar, next);
                if (c12 == null) {
                    c12 = gVar.O(next.e());
                }
                L0(this.f10138b0, vVarArr, next, next.V(c12));
            }
        }
        Iterator<v> it2 = this.f10138b0.iterator();
        c0 c0Var = null;
        while (it2.hasNext()) {
            v next2 = it2.next();
            v N0 = N0(gVar, next2.V(gVar.e0(next2.E(), next2, next2.e())));
            if (!(N0 instanceof m5.m)) {
                N0 = P0(gVar, N0);
            }
            a6.s I0 = I0(gVar, N0);
            if (I0 == null || (v10 = E.v(I0)) == (E = N0.E()) || v10 == null) {
                v M0 = M0(gVar, O0(gVar, N0, N0.d()));
                if (M0 != next2) {
                    L0(this.f10138b0, vVarArr, next2, M0);
                }
                if (M0.H()) {
                    f F = M0.F();
                    if (F.k() == f0.a.EXTERNAL_PROPERTY) {
                        if (aVar == null) {
                            aVar = g.d(this.T);
                        }
                        aVar.b(M0, F);
                        this.f10138b0.A(M0);
                    }
                }
            } else {
                v V2 = N0.V(v10);
                if (c0Var == null) {
                    c0Var = new c0();
                }
                c0Var.a(V2);
                this.f10138b0.A(V2);
            }
        }
        u uVar = this.f10140d0;
        if (uVar != null && !uVar.h()) {
            u uVar2 = this.f10140d0;
            this.f10140d0 = uVar2.k(s0(gVar, uVar2.g(), this.f10140d0.f()));
        }
        if (this.V.j()) {
            j z11 = this.V.z(gVar.q());
            if (z11 == null) {
                j jVar = this.T;
                gVar.z(jVar, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{jVar, this.V.getClass().getName()}));
            }
            this.W = H0(gVar, z11, this.V.y());
        }
        if (this.V.h()) {
            j w10 = this.V.w(gVar.q());
            if (w10 == null) {
                j jVar2 = this.T;
                gVar.z(jVar2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{jVar2, this.V.getClass().getName()}));
            }
            this.X = H0(gVar, w10, this.V.v());
        }
        if (vVarArr != null) {
            this.Y = v.c(gVar, this.V, vVarArr, this.f10138b0);
        }
        if (aVar != null) {
            this.f10147k0 = aVar.c(this.f10138b0);
            this.Z = true;
        }
        this.f10146j0 = c0Var;
        if (c0Var != null) {
            this.Z = true;
        }
        if (this.f10137a0 && !this.Z) {
            z10 = true;
        }
        this.f10137a0 = z10;
    }

    public Object b1(l lVar, i5.g gVar) throws IOException {
        return X0(lVar, gVar);
    }

    public a c() {
        return a.ALWAYS_NULL;
    }

    public k<Object> c1(i5.g gVar, v vVar) throws i5.l {
        Object p10;
        i5.b o10 = gVar.o();
        if (o10 == null || (p10 = o10.p(vVar.i())) == null) {
            return null;
        }
        a6.j<Object, Object> m10 = gVar.m(vVar.i(), p10);
        j b10 = m10.b(gVar.u());
        return new n5.z(m10, b10, gVar.O(b10));
    }

    public v d1(int i10) {
        v vVar;
        c cVar = this.f10138b0;
        v r10 = cVar == null ? null : cVar.r(i10);
        return (r10 != null || (vVar = this.Y) == null) ? r10 : vVar.e(i10);
    }

    public y e() {
        return this.V;
    }

    public v e1(i5.y yVar) {
        return f1(yVar.d());
    }

    public v f1(String str) {
        v vVar;
        c cVar = this.f10138b0;
        v s10 = cVar == null ? null : cVar.s(str);
        return (s10 != null || (vVar = this.Y) == null) ? s10 : vVar.f(str);
    }

    @Deprecated
    public final Class<?> g1() {
        return this.T.g();
    }

    public Object h(l lVar, i5.g gVar, f fVar) throws IOException {
        Object T1;
        if (this.f10148l0 != null) {
            if (lVar.o() && (T1 = lVar.T1()) != null) {
                return K0(lVar, gVar, fVar.e(lVar, gVar), T1);
            }
            p Z0 = lVar.Z0();
            if (Z0 != null) {
                if (Z0.k()) {
                    return Y0(lVar, gVar);
                }
                if (Z0 == p.START_OBJECT) {
                    Z0 = lVar.D2();
                }
                if (Z0 == p.FIELD_NAME && this.f10148l0.e() && this.f10148l0.d(lVar.X0(), lVar)) {
                    return Y0(lVar, gVar);
                }
            }
        }
        return fVar.e(lVar, gVar);
    }

    public int h1() {
        return this.f10138b0.size();
    }

    public void i1(l lVar, i5.g gVar, Object obj, String str) throws IOException {
        if (!gVar.v0(i5.h.FAIL_ON_IGNORED_PROPERTIES)) {
            lVar.Z2();
            return;
        }
        throw o5.a.H(lVar, obj, str, o());
    }

    public v j(String str) {
        Map<String, v> map = this.f10144h0;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Object j1(l lVar, i5.g gVar, Object obj, b0 b0Var) throws IOException {
        k<Object> J0 = J0(gVar, obj, b0Var);
        if (J0 != null) {
            if (b0Var != null) {
                b0Var.g2();
                l t32 = b0Var.t3();
                t32.D2();
                obj = J0.g(t32, gVar, obj);
            }
            return lVar != null ? J0.g(lVar, gVar, obj) : obj;
        }
        if (b0Var != null) {
            obj = k1(gVar, obj, b0Var);
        }
        return lVar != null ? g(lVar, gVar, obj) : obj;
    }

    public Object k1(i5.g gVar, Object obj, b0 b0Var) throws IOException {
        b0Var.g2();
        l t32 = b0Var.t3();
        while (t32.D2() != p.END_OBJECT) {
            String X0 = t32.X0();
            t32.D2();
            A0(t32, gVar, obj, X0);
        }
        return obj;
    }

    public a l() {
        return a.DYNAMIC;
    }

    public void l1(l lVar, i5.g gVar, Object obj, String str) throws IOException {
        Set<String> set = this.f10141e0;
        if (set == null || !set.contains(str)) {
            u uVar = this.f10140d0;
            if (uVar != null) {
                try {
                    uVar.c(lVar, gVar, obj, str);
                } catch (Exception e10) {
                    w1(e10, obj, str, gVar);
                }
            } else {
                A0(lVar, gVar, obj, str);
            }
        } else {
            i1(lVar, gVar, obj, str);
        }
    }

    public boolean m1(String str) {
        return this.f10138b0.s(str) != null;
    }

    public Object n(i5.g gVar) throws i5.l {
        try {
            return this.V.t(gVar);
        } catch (IOException e10) {
            return a6.h.n0(gVar, e10);
        }
    }

    public boolean n1() {
        return this.f10143g0;
    }

    public Collection<Object> o() {
        ArrayList arrayList = new ArrayList();
        Iterator<v> it = this.f10138b0.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    public void o1(i5.g gVar, Object obj) throws IOException {
        for (d0 g10 : this.f10139c0) {
            g10.g(gVar, obj);
        }
    }

    public Iterator<v> p1() {
        c cVar = this.f10138b0;
        if (cVar != null) {
            return cVar.iterator();
        }
        throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
    }

    public m5.s q() {
        return this.f10148l0;
    }

    public void q1(v vVar, v vVar2) {
        this.f10138b0.D(vVar, vVar2);
    }

    public Class<?> r() {
        return this.T.g();
    }

    public final Throwable r1(Throwable th2, i5.g gVar) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        a6.h.o0(th2);
        boolean z10 = gVar == null || gVar.v0(i5.h.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof w4.n)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            a6.h.q0(th2);
        }
        return th2;
    }

    public boolean s() {
        return true;
    }

    public d s1(c cVar) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    public abstract d t1(Set<String> set);

    public Boolean u(i5.f fVar) {
        return Boolean.TRUE;
    }

    public d u1(boolean z10) {
        return z10 == this.f10142f0 ? this : t1(this.f10141e0);
    }

    public abstract k<Object> v(a6.s sVar);

    public abstract d v1(m5.s sVar);

    public void w1(Throwable th2, Object obj, String str, i5.g gVar) throws IOException {
        throw i5.l.y(r1(th2, gVar), obj, str);
    }

    public j x0() {
        return this.T;
    }

    public Object x1(Throwable th2, i5.g gVar) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        a6.h.o0(th2);
        if (!(th2 instanceof IOException)) {
            if (!(gVar == null || gVar.v0(i5.h.WRAP_EXCEPTIONS))) {
                a6.h.q0(th2);
            }
            return gVar.b0(this.T.g(), (Object) null, th2);
        }
        throw ((IOException) th2);
    }
}
