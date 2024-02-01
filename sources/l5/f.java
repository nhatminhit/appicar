package l5;

import a6.h;
import i5.a;
import i5.c;
import i5.d;
import i5.g;
import i5.j;
import i5.k;
import i5.l;
import i5.p;
import i5.q;
import i5.x;
import i5.y;
import j5.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m5.a0;
import m5.w;
import n5.j0;
import o5.b;
import q5.i;
import q5.s;
import q5.z;
import v4.l0;
import v4.m0;
import v4.n0;
import v5.o;

public class f extends b implements Serializable {
    public static final long X = 1;
    public static final Class<?>[] Y = {Throwable.class};
    public static final f Z = new f(new k5.f());

    public f(k5.f fVar) {
        super(fVar);
    }

    public List<s> A0(g gVar, c cVar, e eVar, List<s> list, Set<String> set) throws l {
        Class<?> I;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap hashMap = new HashMap();
        for (s next : list) {
            String name = next.getName();
            if (!set.contains(name)) {
                if (next.K() || (I = next.I()) == null || !C0(gVar.q(), next, I, hashMap)) {
                    arrayList.add(next);
                } else {
                    eVar.g(name);
                }
            }
        }
        return arrayList;
    }

    public k<?> B0(g gVar, j jVar, c cVar) throws l {
        k<?> b02 = b0(gVar, jVar, cVar);
        if (b02 != null && this.P.e()) {
            for (g d10 : this.P.b()) {
                b02 = d10.d(gVar.q(), cVar, b02);
            }
        }
        return b02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r2 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean C0(i5.f r1, q5.s r2, java.lang.Class<?> r3, java.util.Map<java.lang.Class<?>, java.lang.Boolean> r4) {
        /*
            r0 = this;
            java.lang.Object r2 = r4.get(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x000d
            boolean r1 = r2.booleanValue()
            return r1
        L_0x000d:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r3 == r2) goto L_0x0034
            boolean r2 = r3.isPrimitive()
            if (r2 == 0) goto L_0x0018
            goto L_0x0034
        L_0x0018:
            k5.c r2 = r1.q(r3)
            java.lang.Boolean r2 = r2.f()
            if (r2 != 0) goto L_0x0036
            i5.c r2 = r1.P(r3)
            i5.b r1 = r1.m()
            q5.b r2 = r2.z()
            java.lang.Boolean r2 = r1.E0(r2)
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L_0x0036:
            r4.put(r3, r2)
            boolean r1 = r2.booleanValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.f.C0(i5.f, q5.s, java.lang.Class, java.util.Map):boolean");
    }

    public boolean D0(Class<?> cls) {
        String e10 = h.e(cls);
        if (e10 != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + e10 + ") as a Bean");
        } else if (!h.c0(cls)) {
            String Z2 = h.Z(cls, true);
            if (Z2 == null) {
                return true;
            }
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + Z2 + ") as a Bean");
        } else {
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + cls.getName() + " as a Bean");
        }
    }

    public j E0(g gVar, j jVar, c cVar) throws l {
        for (a b10 : this.P.a()) {
            j b11 = b10.b(gVar.q(), cVar);
            if (b11 != null) {
                return b11;
            }
        }
        return null;
    }

    public k<Object> b(g gVar, j jVar, c cVar) throws l {
        j E0;
        i5.f T = gVar.q();
        k F = F(jVar, T, cVar);
        if (F != null) {
            if (this.P.e()) {
                for (g d10 : this.P.b()) {
                    F = d10.d(gVar.q(), cVar, F);
                }
            }
            return F;
        } else if (jVar.w()) {
            return v0(gVar, jVar, cVar);
        } else {
            if (jVar.k() && !jVar.u() && !jVar.p() && (E0 = E0(gVar, jVar, cVar)) != null) {
                return t0(gVar, E0, T.P0(E0));
            }
            k<?> B0 = B0(gVar, jVar, cVar);
            if (B0 != null) {
                return B0;
            }
            if (!D0(jVar.g())) {
                return null;
            }
            n0(gVar, jVar, cVar);
            return t0(gVar, jVar, cVar);
        }
    }

    public k<Object> c(g gVar, j jVar, c cVar, Class<?> cls) throws l {
        return u0(gVar, jVar, gVar.q().Q0(gVar.H(cls)));
    }

    public p l0(k5.f fVar) {
        if (this.P == fVar) {
            return this;
        }
        h.u0(f.class, this, "withConfig");
        return new f(fVar);
    }

    public final boolean m0(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public void n0(g gVar, j jVar, c cVar) throws l {
        o.a().b(gVar, jVar, cVar);
    }

    public void o0(g gVar, c cVar, e eVar) throws l {
        List<s> g10 = cVar.g();
        if (g10 != null) {
            for (s next : g10) {
                eVar.e(next.v(), y0(gVar, cVar, next, next.H()));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [l5.v[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p0(i5.g r17, i5.c r18, l5.e r19) throws i5.l {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            i5.j r0 = r18.E()
            boolean r0 = r0.k()
            r10 = 1
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x0022
            l5.y r0 = r19.v()
            i5.f r1 = r17.q()
            l5.v[] r0 = r0.A(r1)
            r12 = r0
            goto L_0x0023
        L_0x0022:
            r12 = 0
        L_0x0023:
            r13 = 0
            if (r12 == 0) goto L_0x0028
            r14 = r10
            goto L_0x0029
        L_0x0028:
            r14 = r13
        L_0x0029:
            i5.f r0 = r17.q()
            java.lang.Class r1 = r18.x()
            q5.b r2 = r18.z()
            v4.s$a r0 = r0.y(r1, r2)
            if (r0 == 0) goto L_0x005a
            boolean r1 = r0.p()
            r9.A(r1)
            java.util.Set r0 = r0.h()
            java.util.Iterator r1 = r0.iterator()
        L_0x004a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r9.g(r2)
            goto L_0x004a
        L_0x005a:
            java.util.Set r0 = java.util.Collections.emptySet()
        L_0x005e:
            r5 = r0
            q5.h r0 = r18.d()
            if (r0 == 0) goto L_0x006d
            l5.u r0 = r6.w0(r7, r8, r0)
            r9.z(r0)
            goto L_0x0087
        L_0x006d:
            java.util.Set r0 = r18.C()
            if (r0 == 0) goto L_0x0087
            java.util.Iterator r0 = r0.iterator()
        L_0x0077:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0087
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r9.g(r1)
            goto L_0x0077
        L_0x0087:
            i5.q r0 = i5.q.USE_GETTERS_AS_SETTERS
            boolean r0 = r7.w(r0)
            if (r0 == 0) goto L_0x0099
            i5.q r0 = i5.q.AUTO_DETECT_GETTERS
            boolean r0 = r7.w(r0)
            if (r0 == 0) goto L_0x0099
            r15 = r10
            goto L_0x009a
        L_0x0099:
            r15 = r13
        L_0x009a:
            java.util.List r4 = r18.t()
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.util.List r0 = r0.A0(r1, r2, r3, r4, r5)
            k5.f r1 = r6.P
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x00d1
            k5.f r1 = r6.P
            java.lang.Iterable r1 = r1.b()
            java.util.Iterator r1 = r1.iterator()
        L_0x00bc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d1
            java.lang.Object r2 = r1.next()
            l5.g r2 = (l5.g) r2
            i5.f r3 = r17.q()
            java.util.List r0 = r2.k(r3, r8, r0)
            goto L_0x00bc
        L_0x00d1:
            java.util.Iterator r0 = r0.iterator()
        L_0x00d5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b2
            java.lang.Object r1 = r0.next()
            q5.s r1 = (q5.s) r1
            boolean r2 = r1.O()
            if (r2 == 0) goto L_0x00f4
            q5.i r2 = r1.J()
            i5.j r2 = r2.D(r13)
        L_0x00ef:
            l5.v r2 = r6.y0(r7, r8, r1, r2)
            goto L_0x0136
        L_0x00f4:
            boolean r2 = r1.L()
            if (r2 == 0) goto L_0x0103
            q5.f r2 = r1.B()
            i5.j r2 = r2.h()
            goto L_0x00ef
        L_0x0103:
            q5.i r2 = r1.C()
            if (r2 == 0) goto L_0x0135
            if (r15 == 0) goto L_0x0120
            java.lang.Class r2 = r2.g()
            boolean r2 = r6.m0(r2)
            if (r2 == 0) goto L_0x0120
            java.lang.String r2 = r1.getName()
            boolean r2 = r9.w(r2)
            if (r2 == 0) goto L_0x0130
            goto L_0x0135
        L_0x0120:
            boolean r2 = r1.K()
            if (r2 != 0) goto L_0x0135
            i5.x r2 = r1.d()
            i5.x$a r2 = r2.g()
            if (r2 == 0) goto L_0x0135
        L_0x0130:
            l5.v r2 = r6.z0(r7, r8, r1)
            goto L_0x0136
        L_0x0135:
            r2 = 0
        L_0x0136:
            if (r14 == 0) goto L_0x019c
            boolean r3 = r1.K()
            if (r3 == 0) goto L_0x019c
            java.lang.String r3 = r1.getName()
            if (r12 == 0) goto L_0x015f
            int r4 = r12.length
            r5 = r13
        L_0x0146:
            if (r5 >= r4) goto L_0x015f
            r11 = r12[r5]
            java.lang.String r10 = r11.getName()
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L_0x015b
            boolean r10 = r11 instanceof l5.k
            if (r10 == 0) goto L_0x015b
            l5.k r11 = (l5.k) r11
            goto L_0x0160
        L_0x015b:
            int r5 = r5 + 1
            r10 = 1
            goto L_0x0146
        L_0x015f:
            r11 = 0
        L_0x0160:
            if (r11 != 0) goto L_0x0185
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r12.length
            r5 = r13
        L_0x0169:
            if (r5 >= r4) goto L_0x0177
            r10 = r12[r5]
            java.lang.String r10 = r10.getName()
            r2.add(r10)
            int r5 = r5 + 1
            goto L_0x0169
        L_0x0177:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r13] = r3
            r3 = 1
            r4[r3] = r2
            java.lang.String r2 = "Could not find creator property with name '%s' (known Creator properties: %s)"
            r7.K0(r8, r1, r2, r4)
            goto L_0x01af
        L_0x0185:
            r3 = 1
            if (r2 == 0) goto L_0x018b
            r11.b0(r2)
        L_0x018b:
            java.lang.Class[] r1 = r1.x()
            if (r1 != 0) goto L_0x0195
            java.lang.Class[] r1 = r18.j()
        L_0x0195:
            r11.Q(r1)
            r9.f(r11)
            goto L_0x01af
        L_0x019c:
            r3 = r10
            if (r2 == 0) goto L_0x01af
            java.lang.Class[] r1 = r1.x()
            if (r1 != 0) goto L_0x01a9
            java.lang.Class[] r1 = r18.j()
        L_0x01a9:
            r2.Q(r1)
            r9.j(r2)
        L_0x01af:
            r10 = r3
            goto L_0x00d5
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.f.p0(i5.g, i5.c, l5.e):void");
    }

    public void q0(g gVar, c cVar, e eVar) throws l {
        Map<Object, q5.h> n10 = cVar.n();
        if (n10 != null) {
            for (Map.Entry next : n10.entrySet()) {
                q5.h hVar = (q5.h) next.getValue();
                eVar.h(y.a(hVar.f()), hVar.h(), cVar.y(), hVar, next.getKey());
            }
        }
    }

    public void r0(g gVar, c cVar, e eVar) throws l {
        w wVar;
        j jVar;
        v vVar;
        z D = cVar.D();
        if (D != null) {
            Class<? extends l0<?>> c10 = D.c();
            n0 y10 = gVar.y(cVar.z(), D);
            if (c10 == m0.d.class) {
                y d10 = D.d();
                vVar = eVar.o(d10);
                if (vVar != null) {
                    j e10 = vVar.e();
                    jVar = e10;
                    wVar = new w(D.f());
                } else {
                    throw new IllegalArgumentException("Invalid Object Id definition for " + cVar.x().getName() + ": cannot find property with name '" + d10 + "'");
                }
            } else {
                j jVar2 = gVar.u().e0(gVar.H(c10), l0.class)[0];
                vVar = null;
                wVar = gVar.x(cVar.z(), D);
                jVar = jVar2;
            }
            k<Object> Q = gVar.Q(jVar);
            eVar.B(m5.s.a(jVar, D.d(), wVar, Q, vVar, y10));
        }
    }

    @Deprecated
    public void s0(g gVar, c cVar, e eVar) throws l {
        o0(gVar, cVar, eVar);
    }

    public k<Object> t0(g gVar, j jVar, c cVar) throws l {
        try {
            y m10 = m(gVar, cVar);
            e x02 = x0(gVar, cVar);
            x02.D(m10);
            p0(gVar, cVar, x02);
            r0(gVar, cVar, x02);
            o0(gVar, cVar, x02);
            q0(gVar, cVar, x02);
            i5.f T = gVar.q();
            if (this.P.e()) {
                for (g j10 : this.P.b()) {
                    x02 = j10.j(T, cVar, x02);
                }
            }
            k<?> k10 = (!jVar.k() || m10.k()) ? x02.k() : x02.l();
            if (this.P.e()) {
                for (g d10 : this.P.b()) {
                    k10 = d10.d(T, cVar, k10);
                }
            }
            return k10;
        } catch (NoClassDefFoundError e10) {
            return new m5.f(e10);
        } catch (IllegalArgumentException e11) {
            throw b.B(gVar.Z(), h.o(e11), cVar, (s) null);
        }
    }

    public k<Object> u0(g gVar, j jVar, c cVar) throws l {
        try {
            y m10 = m(gVar, cVar);
            i5.f T = gVar.q();
            e x02 = x0(gVar, cVar);
            x02.D(m10);
            p0(gVar, cVar, x02);
            r0(gVar, cVar, x02);
            o0(gVar, cVar, x02);
            q0(gVar, cVar, x02);
            e.a s10 = cVar.s();
            String str = s10 == null ? e.K : s10.f9522a;
            i q10 = cVar.q(str, (Class<?>[]) null);
            if (q10 != null && T.c()) {
                h.g(q10.p(), T.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            x02.C(q10, s10);
            if (this.P.e()) {
                for (g j10 : this.P.b()) {
                    x02 = j10.j(T, cVar, x02);
                }
            }
            k<?> m11 = x02.m(jVar, str);
            if (this.P.e()) {
                for (g d10 : this.P.b()) {
                    m11 = d10.d(T, cVar, m11);
                }
            }
            return m11;
        } catch (NoClassDefFoundError e10) {
            return new m5.f(e10);
        } catch (IllegalArgumentException e11) {
            throw b.B(gVar.Z(), h.o(e11), cVar, (s) null);
        }
    }

    public k<Object> v0(g gVar, j jVar, c cVar) throws l {
        v y02;
        i5.f T = gVar.q();
        e x02 = x0(gVar, cVar);
        x02.D(m(gVar, cVar));
        p0(gVar, cVar, x02);
        i q10 = cVar.q("initCause", Y);
        if (!(q10 == null || (y02 = y0(gVar, cVar, a6.y.V(gVar.q(), q10, new y("cause")), q10.D(0))) == null)) {
            x02.i(y02, true);
        }
        x02.g("localizedMessage");
        x02.g("suppressed");
        if (this.P.e()) {
            for (g j10 : this.P.b()) {
                x02 = j10.j(T, cVar, x02);
            }
        }
        k<?> k10 = x02.k();
        if (k10 instanceof c) {
            k10 = new j0((c) k10);
        }
        if (this.P.e()) {
            for (g d10 : this.P.b()) {
                k10 = d10.d(T, cVar, k10);
            }
        }
        return k10;
    }

    public u w0(g gVar, c cVar, q5.h hVar) throws l {
        j jVar;
        j jVar2;
        d.b bVar;
        if (hVar instanceof i) {
            i iVar = (i) hVar;
            jVar = iVar.D(0);
            jVar2 = j0(gVar, hVar, iVar.D(1));
            bVar = new d.b(y.a(hVar.f()), jVar2, (y) null, hVar, x.X);
        } else if (hVar instanceof q5.f) {
            j j02 = j0(gVar, hVar, ((q5.f) hVar).h());
            jVar = j02.e();
            j G = j02.d();
            bVar = new d.b(y.a(hVar.f()), j02, (y) null, hVar, x.X);
            jVar2 = G;
        } else {
            return (u) gVar.z(cVar.E(), String.format("Unrecognized mutator type for any setter: %s", new Object[]{hVar.getClass()}));
        }
        p d02 = d0(gVar, hVar);
        if (d02 == null) {
            d02 = (p) jVar.S();
        }
        if (d02 == null) {
            d02 = gVar.N(jVar, bVar);
        } else if (d02 instanceof j) {
            d02 = ((j) d02).a(gVar, bVar);
        }
        p pVar = d02;
        k<Object> a02 = a0(gVar, hVar);
        if (a02 == null) {
            a02 = (k) jVar2.S();
        }
        return new u(bVar, hVar, jVar2, pVar, a02 != null ? gVar.e0(a02, bVar, jVar2) : a02, (u5.f) jVar2.R());
    }

    public e x0(g gVar, c cVar) {
        return new e(cVar, gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: l5.v} */
    /* JADX WARNING: type inference failed for: r1v2, types: [l5.v, i5.d] */
    /* JADX WARNING: type inference failed for: r1v3, types: [l5.v] */
    /* JADX WARNING: type inference failed for: r3v2, types: [m5.i] */
    /* JADX WARNING: type inference failed for: r3v3, types: [m5.o] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l5.v y0(i5.g r10, i5.c r11, q5.s r12, i5.j r13) throws i5.l {
        /*
            r9 = this;
            q5.h r0 = r12.F()
            if (r0 != 0) goto L_0x000e
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No non-constructor mutator available"
            r10.K0(r11, r12, r2, r1)
        L_0x000e:
            i5.j r13 = r9.j0(r10, r0, r13)
            java.lang.Object r1 = r13.R()
            r6 = r1
            u5.f r6 = (u5.f) r6
            boolean r1 = r0 instanceof q5.i
            if (r1 == 0) goto L_0x002d
            m5.o r1 = new m5.o
            a6.b r7 = r11.y()
            r8 = r0
            q5.i r8 = (q5.i) r8
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x003c
        L_0x002d:
            m5.i r1 = new m5.i
            a6.b r7 = r11.y()
            r8 = r0
            q5.f r8 = (q5.f) r8
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x003c:
            i5.k r11 = r9.c0(r10, r0)
            if (r11 != 0) goto L_0x0048
            java.lang.Object r11 = r13.S()
            i5.k r11 = (i5.k) r11
        L_0x0048:
            if (r11 == 0) goto L_0x0052
            i5.k r10 = r10.e0(r11, r1, r13)
            l5.v r1 = r1.V(r10)
        L_0x0052:
            i5.b$a r10 = r12.w()
            if (r10 == 0) goto L_0x0065
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0065
            java.lang.String r10 = r10.b()
            r1.O(r10)
        L_0x0065:
            q5.z r10 = r12.u()
            if (r10 == 0) goto L_0x006e
            r1.P(r10)
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.f.y0(i5.g, i5.c, q5.s, i5.j):l5.v");
    }

    public v z0(g gVar, c cVar, s sVar) throws l {
        i C = sVar.C();
        j j02 = j0(gVar, C, C.h());
        a0 a0Var = new a0(sVar, j02, (u5.f) j02.R(), cVar.y(), C);
        k<Object> c02 = c0(gVar, C);
        if (c02 == null) {
            c02 = (k) j02.S();
        }
        return c02 != null ? a0Var.V(gVar.e0(c02, a0Var, j02)) : a0Var;
    }
}
