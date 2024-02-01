package q5;

import a6.h;
import i5.b;
import i5.j;
import i5.k;
import i5.l;
import i5.o;
import i5.p;
import i5.y;
import j5.e;
import j5.f;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k5.i;
import u5.c;
import v4.c0;
import v4.d;
import v4.k;
import v4.n;
import v4.s;
import v4.u;
import v4.x;
import w4.b0;

public class o extends b implements Serializable {
    public static final long Q = 1;
    public final b O;
    public final b P;

    public o(b bVar, b bVar2) {
        this.O = bVar;
        this.P = bVar2;
    }

    public static b N0(b bVar, b bVar2) {
        return bVar == null ? bVar2 : bVar2 == null ? bVar : new o(bVar, bVar2);
    }

    public d.a A(h hVar) {
        d.a A = this.O.A(hVar);
        return A == null ? this.P.A(hVar) : A;
    }

    @Deprecated
    public boolean A0(a aVar) {
        return this.O.A0(aVar) || this.P.A0(aVar);
    }

    @Deprecated
    public Object B(h hVar) {
        Object B = this.O.B(hVar);
        return B == null ? this.P.B(hVar) : B;
    }

    public boolean B0(h hVar) {
        return this.O.B0(hVar) || this.P.B0(hVar);
    }

    public Object C(a aVar) {
        Class<p.a> cls = p.a.class;
        Object C = this.O.C(aVar);
        return M0(C, cls) ? C : L0(this.P.C(aVar), cls);
    }

    public Boolean C0(h hVar) {
        Boolean C0 = this.O.C0(hVar);
        return C0 == null ? this.P.C0(hVar) : C0;
    }

    public Object D(a aVar) {
        Class<o.a> cls = o.a.class;
        Object D = this.O.D(aVar);
        return M0(D, cls) ? D : L0(this.P.D(aVar), cls);
    }

    public boolean D0(Annotation annotation) {
        return this.O.D0(annotation) || this.P.D0(annotation);
    }

    public Boolean E(a aVar) {
        Boolean E = this.O.E(aVar);
        return E == null ? this.P.E(aVar) : E;
    }

    public Boolean E0(b bVar) {
        Boolean E0 = this.O.E0(bVar);
        return E0 == null ? this.P.E0(bVar) : E0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r3 = r2.P.F(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.y F(q5.a r3) {
        /*
            r2 = this;
            i5.b r0 = r2.O
            i5.y r0 = r0.F(r3)
            if (r0 != 0) goto L_0x000f
            i5.b r0 = r2.P
            i5.y r0 = r0.F(r3)
            goto L_0x001c
        L_0x000f:
            i5.y r1 = i5.y.U
            if (r0 != r1) goto L_0x001c
            i5.b r1 = r2.P
            i5.y r3 = r1.F(r3)
            if (r3 == 0) goto L_0x001c
            r0 = r3
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.o.F(q5.a):i5.y");
    }

    public Boolean F0(h hVar) {
        Boolean F0 = this.O.F0(hVar);
        return F0 == null ? this.P.F0(hVar) : F0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r3 = r2.P.G(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.y G(q5.a r3) {
        /*
            r2 = this;
            i5.b r0 = r2.O
            i5.y r0 = r0.G(r3)
            if (r0 != 0) goto L_0x000f
            i5.b r0 = r2.P
            i5.y r0 = r0.G(r3)
            goto L_0x001c
        L_0x000f:
            i5.y r1 = i5.y.U
            if (r0 != r1) goto L_0x001c
            i5.b r1 = r2.P
            i5.y r3 = r1.G(r3)
            if (r3 == 0) goto L_0x001c
            r0 = r3
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.o.G(q5.a):i5.y");
    }

    public Object H(b bVar) {
        Object H = this.O.H(bVar);
        return H == null ? this.P.H(bVar) : H;
    }

    public Object I(a aVar) {
        Class<o.a> cls = o.a.class;
        Object I = this.O.I(aVar);
        return M0(I, cls) ? I : L0(this.P.I(aVar), cls);
    }

    public j I0(i<?> iVar, a aVar, j jVar) throws l {
        return this.O.I0(iVar, aVar, this.P.I0(iVar, aVar, jVar));
    }

    public z J(a aVar) {
        z J = this.O.J(aVar);
        return J == null ? this.P.J(aVar) : J;
    }

    public j J0(i<?> iVar, a aVar, j jVar) throws l {
        return this.O.J0(iVar, aVar, this.P.J0(iVar, aVar, jVar));
    }

    public z K(a aVar, z zVar) {
        return this.O.K(aVar, this.P.K(aVar, zVar));
    }

    public i K0(i<?> iVar, i iVar2, i iVar3) {
        i K0 = this.O.K0(iVar, iVar2, iVar3);
        return K0 == null ? this.P.K0(iVar, iVar2, iVar3) : K0;
    }

    public Class<?> L(b bVar) {
        Class<?> L = this.O.L(bVar);
        return L == null ? this.P.L(bVar) : L;
    }

    public Object L0(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return null;
        }
        if (!(obj instanceof Class) || !h.R((Class) obj)) {
            return obj;
        }
        return null;
    }

    public e.a M(b bVar) {
        e.a M = this.O.M(bVar);
        return M == null ? this.P.M(bVar) : M;
    }

    public boolean M0(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return false;
        }
        if (obj instanceof Class) {
            return !h.R((Class) obj);
        }
        return true;
    }

    @Deprecated
    public String[] N(a aVar) {
        String[] N = this.O.N(aVar);
        return N == null ? this.P.N(aVar) : N;
    }

    @Deprecated
    public String[] O(a aVar, boolean z10) {
        String[] O2 = this.O.O(aVar, z10);
        return O2 == null ? this.P.O(aVar, z10) : O2;
    }

    public x.a P(a aVar) {
        x.a P2 = this.O.P(aVar);
        if (P2 != null && P2 != x.a.AUTO) {
            return P2;
        }
        x.a P3 = this.P.P(aVar);
        return P3 != null ? P3 : x.a.AUTO;
    }

    public List<y> Q(a aVar) {
        List<y> Q2 = this.O.Q(aVar);
        return Q2 == null ? this.P.Q(aVar) : Q2;
    }

    public u5.h<?> R(i<?> iVar, h hVar, j jVar) {
        u5.h<?> R = this.O.R(iVar, hVar, jVar);
        return R == null ? this.P.R(iVar, hVar, jVar) : R;
    }

    public String S(a aVar) {
        String S = this.O.S(aVar);
        return (S == null || S.isEmpty()) ? this.P.S(aVar) : S;
    }

    public String T(a aVar) {
        String T = this.O.T(aVar);
        return T == null ? this.P.T(aVar) : T;
    }

    public s.a U(a aVar) {
        s.a U = this.P.U(aVar);
        s.a U2 = this.O.U(aVar);
        return U == null ? U2 : U.B(U2);
    }

    public u.b V(a aVar) {
        u.b V = this.P.V(aVar);
        u.b V2 = this.O.V(aVar);
        return V == null ? V2 : V.o(V2);
    }

    public Integer W(a aVar) {
        Integer W = this.O.W(aVar);
        return W == null ? this.P.W(aVar) : W;
    }

    public u5.h<?> X(i<?> iVar, h hVar, j jVar) {
        u5.h<?> X = this.O.X(iVar, hVar, jVar);
        return X == null ? this.P.X(iVar, hVar, jVar) : X;
    }

    public b.a Y(h hVar) {
        b.a Y = this.O.Y(hVar);
        return Y == null ? this.P.Y(hVar) : Y;
    }

    public y Z(i<?> iVar, f fVar, y yVar) {
        y Z = this.P.Z(iVar, fVar, yVar);
        return Z == null ? this.O.Z(iVar, fVar, yVar) : Z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r3 = r2.P.a0(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.y a0(q5.b r3) {
        /*
            r2 = this;
            i5.b r0 = r2.O
            i5.y r0 = r0.a0(r3)
            if (r0 != 0) goto L_0x000f
            i5.b r0 = r2.P
            i5.y r3 = r0.a0(r3)
            return r3
        L_0x000f:
            boolean r1 = r0.f()
            if (r1 == 0) goto L_0x0016
            return r0
        L_0x0016:
            i5.b r1 = r2.P
            i5.y r3 = r1.a0(r3)
            if (r3 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = r3
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.o.a0(q5.b):i5.y");
    }

    public Object b0(h hVar) {
        Object b02 = this.O.b0(hVar);
        return b02 == null ? this.P.b0(hVar) : b02;
    }

    @Deprecated
    public Class<?> c0(a aVar, j jVar) {
        Class<?> c02 = this.O.c0(aVar, jVar);
        return c02 == null ? this.P.c0(aVar, jVar) : c02;
    }

    public Collection<b> d() {
        return e(new ArrayList());
    }

    public Object d0(a aVar) {
        Object d02 = this.O.d0(aVar);
        return d02 == null ? this.P.d0(aVar) : d02;
    }

    public Collection<b> e(Collection<b> collection) {
        this.O.e(collection);
        this.P.e(collection);
        return collection;
    }

    @Deprecated
    public u.a e0(a aVar, u.a aVar2) {
        return this.O.e0(aVar, this.P.e0(aVar, aVar2));
    }

    public void f(i<?> iVar, b bVar, List<com.fasterxml.jackson.databind.ser.d> list) {
        this.O.f(iVar, bVar, list);
        this.P.f(iVar, bVar, list);
    }

    @Deprecated
    public u.a f0(a aVar, u.a aVar2) {
        return this.O.f0(aVar, this.P.f0(aVar, aVar2));
    }

    public f0<?> g(b bVar, f0<?> f0Var) {
        return this.O.g(bVar, this.P.g(bVar, f0Var));
    }

    @Deprecated
    public Class<?> g0(a aVar, j jVar) {
        Class<?> g02 = this.O.g0(aVar, jVar);
        return g02 == null ? this.P.g0(aVar, jVar) : g02;
    }

    public String h(b bVar) {
        String h10 = this.O.h(bVar);
        return (h10 == null || h10.isEmpty()) ? this.P.h(bVar) : h10;
    }

    public String[] h0(b bVar) {
        String[] h02 = this.O.h0(bVar);
        return h02 == null ? this.P.h0(bVar) : h02;
    }

    public Object i(a aVar) {
        Class<k.a> cls = k.a.class;
        Object i10 = this.O.i(aVar);
        return M0(i10, cls) ? i10 : L0(this.P.i(aVar), cls);
    }

    public Boolean i0(a aVar) {
        Boolean i02 = this.O.i0(aVar);
        return i02 == null ? this.P.i0(aVar) : i02;
    }

    public Object j(a aVar) {
        Class<o.a> cls = o.a.class;
        Object j10 = this.O.j(aVar);
        return M0(j10, cls) ? j10 : L0(this.P.j(aVar), cls);
    }

    @Deprecated
    public Class<?> j0(a aVar) {
        Class<?> j02 = this.O.j0(aVar);
        return j02 == null ? this.P.j0(aVar) : j02;
    }

    public k.a k(i<?> iVar, a aVar) {
        k.a k10 = this.O.k(iVar, aVar);
        return k10 == null ? this.P.k(iVar, aVar) : k10;
    }

    public f.b k0(a aVar) {
        f.b k02 = this.O.k0(aVar);
        return k02 == null ? this.P.k0(aVar) : k02;
    }

    @Deprecated
    public k.a l(a aVar) {
        k.a l10 = this.O.l(aVar);
        return l10 != null ? l10 : this.P.l(aVar);
    }

    public Object l0(a aVar) {
        Class<o.a> cls = o.a.class;
        Object l02 = this.O.l0(aVar);
        return M0(l02, cls) ? l02 : L0(this.P.l0(aVar), cls);
    }

    public Enum<?> m(Class<Enum<?>> cls) {
        Enum<?> m10 = this.O.m(cls);
        return m10 == null ? this.P.m(cls) : m10;
    }

    public c0.a m0(a aVar) {
        c0.a m02 = this.P.m0(aVar);
        c0.a m03 = this.O.m0(aVar);
        return m02 == null ? m03 : m02.p(m03);
    }

    public Object n(h hVar) {
        Object n10 = this.O.n(hVar);
        return n10 == null ? this.P.n(hVar) : n10;
    }

    public List<c> n0(a aVar) {
        List<c> n02 = this.O.n0(aVar);
        List<c> n03 = this.P.n0(aVar);
        if (n02 == null || n02.isEmpty()) {
            return n03;
        }
        if (n03 == null || n03.isEmpty()) {
            return n02;
        }
        ArrayList arrayList = new ArrayList(n02.size() + n03.size());
        arrayList.addAll(n02);
        arrayList.addAll(n03);
        return arrayList;
    }

    @Deprecated
    public Class<?> o(a aVar, j jVar) {
        Class<?> o10 = this.O.o(aVar, jVar);
        return o10 == null ? this.P.o(aVar, jVar) : o10;
    }

    public String o0(b bVar) {
        String o02 = this.O.o0(bVar);
        return (o02 == null || o02.length() == 0) ? this.P.o0(bVar) : o02;
    }

    public Object p(a aVar) {
        Object p10 = this.O.p(aVar);
        return p10 == null ? this.P.p(aVar) : p10;
    }

    public u5.h<?> p0(i<?> iVar, b bVar, j jVar) {
        u5.h<?> p02 = this.O.p0(iVar, bVar, jVar);
        return p02 == null ? this.P.p0(iVar, bVar, jVar) : p02;
    }

    @Deprecated
    public Class<?> q(a aVar, j jVar) {
        Class<?> q10 = this.O.q(aVar, jVar);
        return q10 == null ? this.P.q(aVar, jVar) : q10;
    }

    public a6.s q0(h hVar) {
        a6.s q02 = this.O.q0(hVar);
        return q02 == null ? this.P.q0(hVar) : q02;
    }

    @Deprecated
    public Class<?> r(a aVar, j jVar) {
        Class<?> r10 = this.O.r(aVar, jVar);
        return r10 != null ? r10 : this.P.r(aVar, jVar);
    }

    public Object r0(b bVar) {
        Object r02 = this.O.r0(bVar);
        return r02 == null ? this.P.r0(bVar) : r02;
    }

    public Object s(a aVar) {
        Class<k.a> cls = k.a.class;
        Object s10 = this.O.s(aVar);
        return M0(s10, cls) ? s10 : L0(this.P.s(aVar), cls);
    }

    public Class<?>[] s0(a aVar) {
        Class<?>[] s02 = this.O.s0(aVar);
        return s02 == null ? this.P.s0(aVar) : s02;
    }

    public void t(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        this.P.t(cls, enumArr, strArr);
        this.O.t(cls, enumArr, strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r3 = r2.P.t0(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.y t0(q5.a r3) {
        /*
            r2 = this;
            i5.b r0 = r2.O
            i5.y r0 = r0.t0(r3)
            if (r0 != 0) goto L_0x000f
            i5.b r0 = r2.P
            i5.y r0 = r0.t0(r3)
            goto L_0x001c
        L_0x000f:
            i5.y r1 = i5.y.U
            if (r0 != r1) goto L_0x001c
            i5.b r1 = r2.P
            i5.y r3 = r1.t0(r3)
            if (r3 == 0) goto L_0x001c
            r0 = r3
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.o.t0(q5.a):i5.y");
    }

    @Deprecated
    public String u(Enum<?> enumR) {
        String u10 = this.O.u(enumR);
        return u10 == null ? this.P.u(enumR) : u10;
    }

    public Boolean u0(a aVar) {
        Boolean u02 = this.O.u0(aVar);
        return u02 == null ? this.P.u0(aVar) : u02;
    }

    public String[] v(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this.O.v(cls, enumArr, this.P.v(cls, enumArr, strArr));
    }

    @Deprecated
    public boolean v0(i iVar) {
        return this.O.v0(iVar) || this.P.v0(iVar);
    }

    public b0 version() {
        return this.O.version();
    }

    public Object w(a aVar) {
        Object w10 = this.O.w(aVar);
        return w10 == null ? this.P.w(aVar) : w10;
    }

    public Boolean w0(a aVar) {
        Boolean w02 = this.O.w0(aVar);
        return w02 == null ? this.P.w0(aVar) : w02;
    }

    public n.d x(a aVar) {
        n.d x10 = this.O.x(aVar);
        n.d x11 = this.P.x(aVar);
        return x11 == null ? x10 : x11.A(x10);
    }

    @Deprecated
    public boolean x0(i iVar) {
        return this.O.x0(iVar) || this.P.x0(iVar);
    }

    @Deprecated
    public Boolean y(b bVar) {
        Boolean y10 = this.O.y(bVar);
        return y10 == null ? this.P.y(bVar) : y10;
    }

    public Boolean y0(a aVar) {
        Boolean y02 = this.O.y0(aVar);
        return y02 == null ? this.P.y0(aVar) : y02;
    }

    public String z(h hVar) {
        String z10 = this.O.z(hVar);
        return z10 == null ? this.P.z(hVar) : z10;
    }

    @Deprecated
    public boolean z0(i iVar) {
        return this.O.z0(iVar) || this.P.z0(iVar);
    }
}
