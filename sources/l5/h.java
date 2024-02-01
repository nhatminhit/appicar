package l5;

import a6.b0;
import a6.s;
import i5.c;
import i5.f;
import i5.g;
import i5.j;
import i5.k;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import m5.a;
import m5.v;
import m5.y;
import q5.i;
import w4.l;
import w4.p;

public class h extends d {

    /* renamed from: q0  reason: collision with root package name */
    public static final long f10162q0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public final i f10163o0;

    /* renamed from: p0  reason: collision with root package name */
    public final j f10164p0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(e eVar, c cVar, j jVar, m5.c cVar2, Map<String, v> map, Set<String> set, boolean z10, boolean z11) {
        super(eVar, cVar, cVar2, map, set, z10, z11);
        this.f10164p0 = jVar;
        this.f10163o0 = eVar.q();
        if (this.f10148l0 != null) {
            throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + cVar.E() + ")");
        }
    }

    @Deprecated
    public h(e eVar, c cVar, m5.c cVar2, Map<String, v> map, Set<String> set, boolean z10, boolean z11) {
        this(eVar, cVar, cVar.E(), cVar2, map, set, z10, z11);
    }

    public h(h hVar) {
        this(hVar, hVar.f10142f0);
    }

    public h(h hVar, s sVar) {
        super((d) hVar, sVar);
        this.f10163o0 = hVar.f10163o0;
        this.f10164p0 = hVar.f10164p0;
    }

    public h(h hVar, Set<String> set) {
        super((d) hVar, set);
        this.f10163o0 = hVar.f10163o0;
        this.f10164p0 = hVar.f10164p0;
    }

    public h(h hVar, m5.c cVar) {
        super((d) hVar, cVar);
        this.f10163o0 = hVar.f10163o0;
        this.f10164p0 = hVar.f10164p0;
    }

    public h(h hVar, m5.s sVar) {
        super((d) hVar, sVar);
        this.f10163o0 = hVar.f10163o0;
        this.f10164p0 = hVar.f10164p0;
    }

    public h(h hVar, boolean z10) {
        super((d) hVar, z10);
        this.f10163o0 = hVar.f10163o0;
        this.f10164p0 = hVar.f10164p0;
    }

    public Object A1(l lVar, g gVar) throws IOException {
        v vVar = this.Y;
        y h10 = vVar.h(lVar, gVar, this.f10148l0);
        b0 b0Var = new b0(lVar, gVar);
        b0Var.V2();
        p Z0 = lVar.Z0();
        while (Z0 == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            v f10 = vVar.f(X0);
            if (f10 != null) {
                if (h10.b(f10, f10.s(lVar, gVar))) {
                    lVar.D2();
                    try {
                        Object a10 = vVar.a(gVar, h10);
                        return a10.getClass() != this.T.g() ? j1(lVar, gVar, a10, b0Var) : E1(lVar, gVar, a10, b0Var);
                    } catch (Exception e10) {
                        w1(e10, this.T.g(), X0, gVar);
                    }
                } else {
                    continue;
                }
            } else if (!h10.l(X0)) {
                v s10 = this.f10138b0.s(X0);
                if (s10 != null) {
                    h10.e(s10, s10.s(lVar, gVar));
                } else {
                    Set<String> set = this.f10141e0;
                    if (set == null || !set.contains(X0)) {
                        b0Var.i2(X0);
                        b0Var.P(lVar);
                        u uVar = this.f10140d0;
                        if (uVar != null) {
                            h10.c(uVar, X0, uVar.b(lVar, gVar));
                        }
                    } else {
                        i1(lVar, gVar, r(), X0);
                    }
                }
            }
            Z0 = lVar.D2();
        }
        b0Var.g2();
        try {
            return this.f10146j0.b(lVar, gVar, vVar.a(gVar, h10), b0Var);
        } catch (Exception e11) {
            return x1(e11, gVar);
        }
    }

    public Object B1(l lVar, g gVar) throws IOException {
        return this.Y != null ? z1(lVar, gVar) : C1(lVar, gVar, this.V.t(gVar));
    }

    public Object C(l lVar, g gVar) throws IOException {
        k<Object> kVar = this.X;
        if (kVar != null || (kVar = this.W) != null) {
            Object s10 = this.V.s(gVar, kVar.f(lVar, gVar));
            if (this.f10139c0 != null) {
                o1(gVar, s10);
            }
            return G1(gVar, s10);
        } else if (gVar.v0(i5.h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            p D2 = lVar.D2();
            p pVar = p.END_ARRAY;
            if (D2 == pVar && gVar.v0(i5.h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return null;
            }
            Object f10 = f(lVar, gVar);
            if (lVar.D2() != pVar) {
                z0(lVar, gVar);
            }
            return f10;
        } else if (!gVar.v0(i5.h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            return gVar.g0(y0(gVar), lVar);
        } else {
            if (lVar.D2() == p.END_ARRAY) {
                return null;
            }
            return gVar.h0(y0(gVar), p.START_ARRAY, lVar, (String) null, new Object[0]);
        }
    }

    public Object C1(l lVar, g gVar, Object obj) throws IOException {
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        m5.g i10 = this.f10147k0.i();
        p Z0 = lVar.Z0();
        while (Z0 == p.FIELD_NAME) {
            String X0 = lVar.X0();
            p D2 = lVar.D2();
            v s10 = this.f10138b0.s(X0);
            if (s10 != null) {
                if (D2.k()) {
                    i10.h(lVar, gVar, X0, obj);
                }
                if (n10 == null || s10.R(n10)) {
                    try {
                        obj = s10.u(lVar, gVar, obj);
                    } catch (Exception e10) {
                        w1(e10, obj, X0, gVar);
                    }
                } else {
                    lVar.Z2();
                }
            } else {
                Set<String> set = this.f10141e0;
                if (set != null && set.contains(X0)) {
                    i1(lVar, gVar, obj, X0);
                } else if (!i10.g(lVar, gVar, X0, obj)) {
                    u uVar = this.f10140d0;
                    if (uVar != null) {
                        uVar.c(lVar, gVar, obj, X0);
                    } else {
                        A0(lVar, gVar, obj, X0);
                    }
                }
            }
            Z0 = lVar.D2();
        }
        return i10.e(lVar, gVar, obj);
    }

    public Object D1(l lVar, g gVar) throws IOException {
        k<Object> kVar = this.W;
        if (kVar != null) {
            return this.V.u(gVar, kVar.f(lVar, gVar));
        }
        if (this.Y != null) {
            return A1(lVar, gVar);
        }
        b0 b0Var = new b0(lVar, gVar);
        b0Var.V2();
        Object t10 = this.V.t(gVar);
        if (this.f10139c0 != null) {
            o1(gVar, t10);
        }
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        while (lVar.Z0() == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            v s10 = this.f10138b0.s(X0);
            if (s10 == null) {
                Set<String> set = this.f10141e0;
                if (set == null || !set.contains(X0)) {
                    b0Var.i2(X0);
                    b0Var.P(lVar);
                    u uVar = this.f10140d0;
                    if (uVar != null) {
                        uVar.c(lVar, gVar, t10, X0);
                    }
                } else {
                    i1(lVar, gVar, t10, X0);
                }
            } else if (n10 == null || s10.R(n10)) {
                try {
                    t10 = s10.u(lVar, gVar, t10);
                } catch (Exception e10) {
                    w1(e10, t10, X0, gVar);
                }
            } else {
                lVar.Z2();
            }
            lVar.D2();
        }
        b0Var.g2();
        return this.f10146j0.b(lVar, gVar, t10, b0Var);
    }

    public Object E1(l lVar, g gVar, Object obj, b0 b0Var) throws IOException {
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        p Z0 = lVar.Z0();
        while (Z0 == p.FIELD_NAME) {
            String X0 = lVar.X0();
            v s10 = this.f10138b0.s(X0);
            lVar.D2();
            if (s10 == null) {
                Set<String> set = this.f10141e0;
                if (set == null || !set.contains(X0)) {
                    b0Var.i2(X0);
                    b0Var.P(lVar);
                    u uVar = this.f10140d0;
                    if (uVar != null) {
                        uVar.c(lVar, gVar, obj, X0);
                    }
                } else {
                    i1(lVar, gVar, obj, X0);
                }
            } else if (n10 == null || s10.R(n10)) {
                try {
                    obj = s10.u(lVar, gVar, obj);
                } catch (Exception e10) {
                    w1(e10, obj, X0, gVar);
                }
            } else {
                lVar.Z2();
            }
            Z0 = lVar.D2();
        }
        b0Var.g2();
        return this.f10146j0.b(lVar, gVar, obj, b0Var);
    }

    public final Object F1(l lVar, g gVar, Object obj, Class<?> cls) throws IOException {
        p Z0 = lVar.Z0();
        while (Z0 == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            v s10 = this.f10138b0.s(X0);
            if (s10 == null) {
                l1(lVar, gVar, obj, X0);
            } else if (!s10.R(cls)) {
                lVar.Z2();
            } else {
                try {
                    obj = s10.u(lVar, gVar, obj);
                } catch (Exception e10) {
                    w1(e10, obj, X0, gVar);
                }
            }
            Z0 = lVar.D2();
        }
        return obj;
    }

    public Object G0(l lVar, g gVar) throws IOException {
        Object obj;
        v vVar = this.Y;
        y h10 = vVar.h(lVar, gVar, this.f10148l0);
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        p Z0 = lVar.Z0();
        b0 b0Var = null;
        while (Z0 == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            v f10 = vVar.f(X0);
            if (f10 != null) {
                if (n10 != null && !f10.R(n10)) {
                    lVar.Z2();
                } else if (h10.b(f10, f10.s(lVar, gVar))) {
                    lVar.D2();
                    try {
                        Object a10 = vVar.a(gVar, h10);
                        if (a10.getClass() != this.T.g()) {
                            return j1(lVar, gVar, a10, b0Var);
                        }
                        if (b0Var != null) {
                            a10 = k1(gVar, a10, b0Var);
                        }
                        return y1(lVar, gVar, a10);
                    } catch (Exception e10) {
                        w1(e10, this.T.g(), X0, gVar);
                    }
                } else {
                    continue;
                }
            } else if (!h10.l(X0)) {
                v s10 = this.f10138b0.s(X0);
                if (s10 != null) {
                    h10.e(s10, s10.s(lVar, gVar));
                } else {
                    Set<String> set = this.f10141e0;
                    if (set == null || !set.contains(X0)) {
                        u uVar = this.f10140d0;
                        if (uVar != null) {
                            h10.c(uVar, X0, uVar.b(lVar, gVar));
                        } else {
                            if (b0Var == null) {
                                b0Var = new b0(lVar, gVar);
                            }
                            b0Var.i2(X0);
                            b0Var.P(lVar);
                        }
                    } else {
                        i1(lVar, gVar, r(), X0);
                    }
                }
            }
            Z0 = lVar.D2();
        }
        try {
            obj = vVar.a(gVar, h10);
        } catch (Exception e11) {
            obj = x1(e11, gVar);
        }
        return b0Var != null ? obj.getClass() != this.T.g() ? j1((l) null, gVar, obj, b0Var) : k1(gVar, obj, b0Var) : obj;
    }

    public Object G1(g gVar, Object obj) throws IOException {
        i iVar = this.f10163o0;
        if (iVar == null) {
            return obj;
        }
        try {
            return iVar.p().invoke(obj, (Object[]) null);
        } catch (Exception e10) {
            return x1(e10, gVar);
        }
    }

    public final Object H1(l lVar, g gVar, p pVar) throws IOException {
        Object t10 = this.V.t(gVar);
        while (lVar.Z0() == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            v s10 = this.f10138b0.s(X0);
            if (s10 != null) {
                try {
                    t10 = s10.u(lVar, gVar, t10);
                } catch (Exception e10) {
                    w1(e10, t10, X0, gVar);
                }
            } else {
                l1(lVar, gVar, t10, X0);
            }
            lVar.D2();
        }
        return t10;
    }

    public d Q0() {
        return new a(this, this.f10164p0, this.f10138b0.v(), this.f10163o0);
    }

    public Object X0(l lVar, g gVar) throws IOException {
        Class<?> n10;
        if (this.Z) {
            return this.f10146j0 != null ? D1(lVar, gVar) : this.f10147k0 != null ? B1(lVar, gVar) : Z0(lVar, gVar);
        }
        Object t10 = this.V.t(gVar);
        if (this.f10139c0 != null) {
            o1(gVar, t10);
        }
        if (this.f10143g0 && (n10 = gVar.n()) != null) {
            return F1(lVar, gVar, t10, n10);
        }
        while (lVar.Z0() == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            v s10 = this.f10138b0.s(X0);
            if (s10 != null) {
                try {
                    t10 = s10.u(lVar, gVar, t10);
                } catch (Exception e10) {
                    w1(e10, t10, X0, gVar);
                }
            } else {
                l1(lVar, gVar, t10, X0);
            }
            lVar.D2();
        }
        return t10;
    }

    public Object f(l lVar, g gVar) throws IOException {
        if (lVar.v2()) {
            return this.f10137a0 ? G1(gVar, H1(lVar, gVar, lVar.D2())) : G1(gVar, X0(lVar, gVar));
        }
        switch (lVar.f1()) {
            case 2:
            case 5:
                return G1(gVar, X0(lVar, gVar));
            case 3:
                return C(lVar, gVar);
            case 6:
                return G1(gVar, a1(lVar, gVar));
            case 7:
                return G1(gVar, W0(lVar, gVar));
            case 8:
                return G1(gVar, U0(lVar, gVar));
            case 9:
            case 10:
                return G1(gVar, T0(lVar, gVar));
            case 12:
                return lVar.p1();
            default:
                return gVar.g0(y0(gVar), lVar);
        }
    }

    public Object g(l lVar, g gVar, Object obj) throws IOException {
        String format;
        j jVar = this.f10164p0;
        Class<?> r10 = r();
        Class<?> cls = obj.getClass();
        if (r10.isAssignableFrom(cls)) {
            format = String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", new Object[]{jVar, r10.getName()});
        } else {
            format = String.format("Deserialization of %s by passing existing instance (of %s) not supported", new Object[]{jVar, cls.getName()});
        }
        return gVar.z(jVar, format);
    }

    public d s1(m5.c cVar) {
        return new h(this, cVar);
    }

    public d t1(Set<String> set) {
        return new h(this, set);
    }

    public Boolean u(f fVar) {
        return Boolean.FALSE;
    }

    public d u1(boolean z10) {
        return new h(this, z10);
    }

    public k<Object> v(s sVar) {
        return new h(this, sVar);
    }

    public d v1(m5.s sVar) {
        return new h(this, sVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r0 == w4.p.START_OBJECT) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y1(w4.l r3, i5.g r4, java.lang.Object r5) throws java.io.IOException {
        /*
            r2 = this;
            m5.d0[] r0 = r2.f10139c0
            if (r0 == 0) goto L_0x0007
            r2.o1(r4, r5)
        L_0x0007:
            m5.c0 r0 = r2.f10146j0
            if (r0 == 0) goto L_0x0023
            w4.p r0 = w4.p.START_OBJECT
            boolean r0 = r3.q2(r0)
            if (r0 == 0) goto L_0x0016
            r3.D2()
        L_0x0016:
            a6.b0 r0 = new a6.b0
            r0.<init>((w4.l) r3, (i5.g) r4)
            r0.V2()
            java.lang.Object r3 = r2.E1(r3, r4, r5, r0)
            return r3
        L_0x0023:
            m5.g r0 = r2.f10147k0
            if (r0 == 0) goto L_0x002c
            java.lang.Object r3 = r2.C1(r3, r4, r5)
            return r3
        L_0x002c:
            boolean r0 = r2.f10143g0
            if (r0 == 0) goto L_0x003b
            java.lang.Class r0 = r4.n()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = r2.F1(r3, r4, r5, r0)
            return r3
        L_0x003b:
            w4.p r0 = r3.Z0()
            w4.p r1 = w4.p.START_OBJECT
            if (r0 != r1) goto L_0x0047
        L_0x0043:
            w4.p r0 = r3.D2()
        L_0x0047:
            w4.p r1 = w4.p.FIELD_NAME
            if (r0 != r1) goto L_0x0068
            java.lang.String r0 = r3.X0()
            r3.D2()
            m5.c r1 = r2.f10138b0
            l5.v r1 = r1.s(r0)
            if (r1 == 0) goto L_0x0064
            java.lang.Object r5 = r1.u(r3, r4, r5)     // Catch:{ Exception -> 0x005f }
            goto L_0x0043
        L_0x005f:
            r1 = move-exception
            r2.w1(r1, r5, r0, r4)
            goto L_0x0043
        L_0x0064:
            r2.l1(r3, r4, r5, r0)
            goto L_0x0043
        L_0x0068:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.h.y1(w4.l, i5.g, java.lang.Object):java.lang.Object");
    }

    public Object z1(l lVar, g gVar) throws IOException {
        j jVar = this.f10164p0;
        return gVar.z(jVar, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", new Object[]{jVar}));
    }
}
