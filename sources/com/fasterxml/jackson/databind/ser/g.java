package com.fasterxml.jackson.databind.ser;

import i5.b;
import i5.c;
import i5.c0;
import i5.d;
import i5.e0;
import i5.j;
import i5.l;
import i5.o;
import i5.q;
import i5.x;
import i5.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k5.m;
import q5.f;
import q5.h;
import q5.s;
import q5.z;
import u5.i;
import v4.f0;
import v4.l0;
import v4.m0;
import v4.s;
import y5.h0;
import y5.u;

public class g extends b implements Serializable {
    public static final long R = 1;
    public static final g S = new g((m) null);

    public g(m mVar) {
        super(mVar);
    }

    public r L(m mVar) {
        if (this.O == mVar) {
            return this;
        }
        if (getClass() == g.class) {
            return new g(mVar);
        }
        throw new IllegalStateException("Subtype of BeanSerializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
    }

    public d M(e0 e0Var, s sVar, m mVar, boolean z10, h hVar) throws l {
        e0 e0Var2 = e0Var;
        h hVar2 = hVar;
        y a10 = sVar.a();
        j h10 = hVar.h();
        d.b bVar = new d.b(a10, h10, sVar.o(), hVar, sVar.d());
        o<Object> H = H(e0Var, hVar2);
        if (H instanceof p) {
            ((p) H).b(e0Var);
        }
        o<?> r02 = e0Var.r0(H, bVar);
        i iVar = null;
        if (h10.o() || h10.v()) {
            iVar = Y(h10, e0Var.q(), hVar2);
        }
        i iVar2 = iVar;
        return mVar.b(e0Var, sVar, h10, r02, Z(h10, e0Var.q(), hVar2), iVar2, hVar, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e A[LOOP:0: B:11:0x002e->B:14:0x003e, LOOP_START, PHI: r2 
      PHI: (r2v1 i5.o) = (r2v0 i5.o), (r2v5 i5.o) binds: [B:10:0x0026, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> N(i5.e0 r5, i5.j r6, i5.c r7, boolean r8) throws i5.l {
        /*
            r4 = this;
            i5.c0 r0 = r5.q()
            boolean r1 = r6.o()
            r2 = 0
            if (r1 == 0) goto L_0x0018
            if (r8 != 0) goto L_0x0011
            boolean r8 = r4.K(r0, r7, r2)
        L_0x0011:
            i5.o r1 = r4.p(r5, r6, r7, r8)
            if (r1 == 0) goto L_0x0047
            return r1
        L_0x0018:
            boolean r1 = r6.v()
            if (r1 == 0) goto L_0x0026
            r1 = r6
            z5.i r1 = (z5.i) r1
            i5.o r1 = r4.C(r5, r1, r7, r8)
            goto L_0x0041
        L_0x0026:
            java.lang.Iterable r1 = r4.x()
            java.util.Iterator r1 = r1.iterator()
        L_0x002e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0040
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.s r2 = (com.fasterxml.jackson.databind.ser.s) r2
            i5.o r2 = r2.a(r0, r6, r7)
            if (r2 == 0) goto L_0x002e
        L_0x0040:
            r1 = r2
        L_0x0041:
            if (r1 != 0) goto L_0x0047
            i5.o r1 = r4.E(r5, r6, r7)
        L_0x0047:
            if (r1 != 0) goto L_0x0063
            i5.o r1 = r4.F(r6, r0, r7, r8)
            if (r1 != 0) goto L_0x0063
            i5.o r1 = r4.G(r5, r6, r7, r8)
            if (r1 != 0) goto L_0x0063
            i5.o r1 = r4.V(r5, r6, r7, r8)
            if (r1 != 0) goto L_0x0063
            java.lang.Class r6 = r7.x()
            i5.o r1 = r5.q0(r6)
        L_0x0063:
            if (r1 == 0) goto L_0x0088
            k5.m r5 = r4.O
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x0088
            k5.m r5 = r4.O
            java.lang.Iterable r5 = r5.e()
            java.util.Iterator r5 = r5.iterator()
        L_0x0077:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0088
            java.lang.Object r6 = r5.next()
            com.fasterxml.jackson.databind.ser.h r6 = (com.fasterxml.jackson.databind.ser.h) r6
            i5.o r1 = r6.i(r0, r7, r1)
            goto L_0x0077
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.g.N(i5.e0, i5.j, i5.c, boolean):i5.o");
    }

    public o<Object> O(e0 e0Var, j jVar, c cVar, boolean z10) throws l {
        e0 e0Var2 = e0Var;
        c cVar2 = cVar;
        Class<Object> cls = Object.class;
        if (cVar.x() == cls) {
            return e0Var2.q0(cls);
        }
        c0 j02 = e0Var.q();
        f Q = Q(cVar2);
        Q.m(j02);
        List<d> W = W(e0Var2, cVar2, Q);
        List<d> arrayList = W == null ? new ArrayList<>() : d0(e0Var2, cVar2, Q, W);
        e0Var.o().f(j02, cVar.z(), arrayList);
        if (this.O.b()) {
            for (h a10 : this.O.e()) {
                arrayList = a10.a(j02, cVar2, arrayList);
            }
        }
        List<d> U = U(j02, cVar2, arrayList);
        if (this.O.b()) {
            for (h j10 : this.O.e()) {
                U = j10.j(j02, cVar2, U);
            }
        }
        Q.p(S(e0Var2, cVar2, U));
        Q.q(U);
        Q.n(A(j02, cVar2));
        h b10 = cVar.b();
        if (b10 != null) {
            j h10 = b10.h();
            j G = h10.d();
            i d10 = d(j02, G);
            o H = H(e0Var2, b10);
            if (H == null) {
                H = u.b0((Set<String>) null, h10, j02.T(q.USE_STATIC_TYPING), d10, (o<Object>) null, (o<Object>) null, (Object) null);
            }
            Q.l(new a(new d.b(y.a(b10.f()), G, (y) null, b10, x.X), b10, H));
        }
        b0(j02, Q);
        if (this.O.b()) {
            for (h k10 : this.O.e()) {
                Q = k10.k(j02, cVar2, Q);
            }
        }
        try {
            o<?> a11 = Q.a();
            return (a11 == null && (a11 = D(j02, jVar, cVar2, z10)) == null && cVar.F()) ? Q.b() : a11;
        } catch (RuntimeException e10) {
            RuntimeException runtimeException = e10;
            return (o) e0Var2.D0(cVar2, "Failed to construct BeanSerializer for %s: (%s) %s", cVar.E(), runtimeException.getClass().getName(), runtimeException.getMessage());
        }
    }

    @Deprecated
    public o<Object> P(e0 e0Var, c cVar) throws l {
        return O(e0Var, cVar.E(), cVar, e0Var.w(q.USE_STATIC_TYPING));
    }

    public f Q(c cVar) {
        return new f(cVar);
    }

    public d R(d dVar, Class<?>[] clsArr) {
        return x5.d.a(dVar, clsArr);
    }

    public x5.i S(e0 e0Var, c cVar, List<d> list) throws l {
        z D = cVar.D();
        if (D == null) {
            return null;
        }
        Class<? extends l0<?>> c10 = D.c();
        if (c10 == m0.d.class) {
            String d10 = D.d().d();
            int size = list.size();
            for (int i10 = 0; i10 != size; i10++) {
                d dVar = list.get(i10);
                if (d10.equals(dVar.getName())) {
                    if (i10 > 0) {
                        list.remove(i10);
                        list.add(0, dVar);
                    }
                    return x5.i.a(dVar.e(), (y) null, new x5.j(D, dVar), D.b());
                }
            }
            throw new IllegalArgumentException("Invalid Object Id definition for " + cVar.x().getName() + ": cannot find property with name '" + d10 + "'");
        }
        return x5.i.a(e0Var.u().e0(e0Var.l(c10), l0.class)[0], D.d(), e0Var.x(cVar.z(), D), D.b());
    }

    public m T(c0 c0Var, c cVar) {
        return new m(c0Var, cVar);
    }

    public List<d> U(c0 c0Var, c cVar, List<d> list) {
        s.a y10 = c0Var.y(cVar.x(), cVar.z());
        if (y10 != null) {
            Set<String> i10 = y10.i();
            if (!i10.isEmpty()) {
                Iterator<d> it = list.iterator();
                while (it.hasNext()) {
                    if (i10.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        }
        return list;
    }

    public o<Object> V(e0 e0Var, j jVar, c cVar, boolean z10) throws l {
        if (a0(jVar.g()) || a6.h.V(jVar.g())) {
            return O(e0Var, jVar, cVar, z10);
        }
        return null;
    }

    public List<d> W(e0 e0Var, c cVar, f fVar) throws l {
        List<q5.s> t10 = cVar.t();
        c0 j02 = e0Var.q();
        c0(j02, cVar, t10);
        if (j02.T(q.REQUIRE_SETTERS_FOR_GETTERS)) {
            e0(j02, cVar, t10);
        }
        if (t10.isEmpty()) {
            return null;
        }
        boolean K = K(j02, cVar, (i) null);
        m T = T(j02, cVar);
        ArrayList arrayList = new ArrayList(t10.size());
        for (q5.s next : t10) {
            h y10 = next.y();
            if (!next.R()) {
                b.a w10 = next.w();
                if (w10 == null || !w10.d()) {
                    arrayList.add(M(e0Var, next, T, K, y10 instanceof q5.i ? (q5.i) y10 : (f) y10));
                }
            } else if (y10 != null) {
                fVar.r(y10);
            }
        }
        return arrayList;
    }

    @Deprecated
    public o<Object> X(e0 e0Var, j jVar, c cVar) throws l {
        return V(e0Var, jVar, cVar, e0Var.w(q.USE_STATIC_TYPING));
    }

    public i Y(j jVar, c0 c0Var, h hVar) throws l {
        j G = jVar.d();
        u5.h<?> R2 = c0Var.m().R(c0Var, hVar, jVar);
        return R2 == null ? d(c0Var, G) : R2.h(c0Var, G, c0Var.K().d(c0Var, hVar, G));
    }

    public i Z(j jVar, c0 c0Var, h hVar) throws l {
        u5.h<?> X = c0Var.m().X(c0Var, hVar, jVar);
        return X == null ? d(c0Var, jVar) : X.h(c0Var, jVar, c0Var.K().d(c0Var, hVar, jVar));
    }

    public boolean a0(Class<?> cls) {
        return a6.h.e(cls) == null && !a6.h.c0(cls);
    }

    public void b0(c0 c0Var, f fVar) {
        List<d> i10 = fVar.i();
        boolean T = c0Var.T(q.DEFAULT_VIEW_INCLUSION);
        int size = i10.size();
        d[] dVarArr = new d[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = i10.get(i12);
            Class[] K = dVar.K();
            if (K != null && K.length != 0) {
                i11++;
                dVarArr[i12] = R(dVar, K);
            } else if (T) {
                dVarArr[i12] = dVar;
            }
        }
        if (!T || i11 != 0) {
            fVar.o(dVarArr);
        }
    }

    public o<Object> c(e0 e0Var, j jVar) throws l {
        j jVar2;
        c0 j02 = e0Var.q();
        c O0 = j02.O0(jVar);
        o H = H(e0Var, O0.z());
        if (H != null) {
            return H;
        }
        b m10 = j02.m();
        boolean z10 = false;
        if (m10 == null) {
            jVar2 = jVar;
        } else {
            try {
                jVar2 = m10.J0(j02, O0.z(), jVar);
            } catch (l e10) {
                return (o) e0Var.D0(O0, e10.getMessage(), new Object[0]);
            }
        }
        if (jVar2 != jVar) {
            if (!jVar2.j(jVar.g())) {
                O0 = j02.O0(jVar2);
            }
            z10 = true;
        }
        a6.j<Object, Object> v10 = O0.v();
        if (v10 == null) {
            return N(e0Var, jVar2, O0, z10);
        }
        j c10 = v10.c(e0Var.u());
        if (!c10.j(jVar2.g())) {
            O0 = j02.O0(c10);
            H = H(e0Var, O0.z());
        }
        if (H == null && !c10.X()) {
            H = N(e0Var, c10, O0, true);
        }
        return new h0(v10, c10, H);
    }

    public void c0(c0 c0Var, c cVar, List<q5.s> list) {
        b m10 = c0Var.m();
        HashMap hashMap = new HashMap();
        Iterator<q5.s> it = list.iterator();
        while (it.hasNext()) {
            q5.s next = it.next();
            if (next.y() != null) {
                Class<?> I = next.I();
                Boolean bool = (Boolean) hashMap.get(I);
                if (bool == null) {
                    bool = c0Var.q(I).f();
                    if (bool == null && (bool = m10.E0(c0Var.P(I).z())) == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(I, bool);
                }
                if (!bool.booleanValue()) {
                }
            }
            it.remove();
        }
    }

    public List<d> d0(e0 e0Var, c cVar, f fVar, List<d> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = list.get(i10);
            i J = dVar.J();
            if (J != null && J.e() == f0.a.EXTERNAL_PROPERTY) {
                y a10 = y.a(J.c());
                Iterator<d> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        d next = it.next();
                        if (next != dVar && next.V(a10)) {
                            dVar.z((i) null);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return list;
    }

    public void e0(c0 c0Var, c cVar, List<q5.s> list) {
        Iterator<q5.s> it = list.iterator();
        while (it.hasNext()) {
            q5.s next = it.next();
            if (!next.r() && !next.P()) {
                it.remove();
            }
        }
    }

    public Iterable<s> x() {
        return this.O.f();
    }
}
