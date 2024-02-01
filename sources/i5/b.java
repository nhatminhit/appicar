package i5;

import j5.e;
import j5.f;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k5.i;
import q5.f;
import q5.f0;
import q5.h;
import q5.o;
import q5.y;
import q5.z;
import u5.c;
import v4.c0;
import v4.d;
import v4.k;
import v4.n;
import v4.s;
import v4.u;
import v4.x;
import w4.b0;
import w4.c0;

public abstract class b implements c0, Serializable {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final C0153a f9031a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9032b;

        /* renamed from: i5.b$a$a  reason: collision with other inner class name */
        public enum C0153a {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public a(C0153a aVar, String str) {
            this.f9031a = aVar;
            this.f9032b = str;
        }

        public static a a(String str) {
            return new a(C0153a.BACK_REFERENCE, str);
        }

        public static a f(String str) {
            return new a(C0153a.MANAGED_REFERENCE, str);
        }

        public String b() {
            return this.f9032b;
        }

        public C0153a c() {
            return this.f9031a;
        }

        public boolean d() {
            return this.f9031a == C0153a.BACK_REFERENCE;
        }

        public boolean e() {
            return this.f9031a == C0153a.MANAGED_REFERENCE;
        }
    }

    public static b G0() {
        return y.P;
    }

    public static b H0(b bVar, b bVar2) {
        return new o(bVar, bVar2);
    }

    public d.a A(h hVar) {
        Object B = B(hVar);
        if (B != null) {
            return d.a.e(B);
        }
        return null;
    }

    @Deprecated
    public boolean A0(q5.a aVar) {
        return false;
    }

    @Deprecated
    public Object B(h hVar) {
        return null;
    }

    public boolean B0(h hVar) {
        return false;
    }

    public Object C(q5.a aVar) {
        return null;
    }

    public Boolean C0(h hVar) {
        return null;
    }

    public Object D(q5.a aVar) {
        return null;
    }

    public boolean D0(Annotation annotation) {
        return false;
    }

    public Boolean E(q5.a aVar) {
        return null;
    }

    public Boolean E0(q5.b bVar) {
        return null;
    }

    public y F(q5.a aVar) {
        return null;
    }

    public Boolean F0(h hVar) {
        return null;
    }

    public y G(q5.a aVar) {
        return null;
    }

    public Object H(q5.b bVar) {
        return null;
    }

    public Object I(q5.a aVar) {
        return null;
    }

    public j I0(i<?> iVar, q5.a aVar, j jVar) throws l {
        return jVar;
    }

    public z J(q5.a aVar) {
        return null;
    }

    public j J0(i<?> iVar, q5.a aVar, j jVar) throws l {
        return jVar;
    }

    public z K(q5.a aVar, z zVar) {
        return zVar;
    }

    public q5.i K0(i<?> iVar, q5.i iVar2, q5.i iVar3) {
        return null;
    }

    public Class<?> L(q5.b bVar) {
        return null;
    }

    public e.a M(q5.b bVar) {
        return null;
    }

    @Deprecated
    public String[] N(q5.a aVar) {
        return null;
    }

    @Deprecated
    public String[] O(q5.a aVar, boolean z10) {
        return null;
    }

    public x.a P(q5.a aVar) {
        return null;
    }

    public List<y> Q(q5.a aVar) {
        return null;
    }

    public u5.h<?> R(i<?> iVar, h hVar, j jVar) {
        return null;
    }

    public String S(q5.a aVar) {
        return null;
    }

    public String T(q5.a aVar) {
        return null;
    }

    public s.a U(q5.a aVar) {
        return s.a.g();
    }

    public u.b V(q5.a aVar) {
        return u.b.d();
    }

    public Integer W(q5.a aVar) {
        return null;
    }

    public u5.h<?> X(i<?> iVar, h hVar, j jVar) {
        return null;
    }

    public a Y(h hVar) {
        return null;
    }

    public y Z(i<?> iVar, f fVar, y yVar) {
        return null;
    }

    public <A extends Annotation> A a(q5.a aVar, Class<A> cls) {
        return aVar.d(cls);
    }

    public y a0(q5.b bVar) {
        return null;
    }

    public boolean b(q5.a aVar, Class<? extends Annotation> cls) {
        return aVar.i(cls);
    }

    public Object b0(h hVar) {
        return null;
    }

    public boolean c(q5.a aVar, Class<? extends Annotation>[] clsArr) {
        return aVar.j(clsArr);
    }

    @Deprecated
    public Class<?> c0(q5.a aVar, j jVar) {
        return null;
    }

    public Collection<b> d() {
        return Collections.singletonList(this);
    }

    public Object d0(q5.a aVar) {
        return null;
    }

    public Collection<b> e(Collection<b> collection) {
        collection.add(this);
        return collection;
    }

    @Deprecated
    public u.a e0(q5.a aVar, u.a aVar2) {
        return aVar2;
    }

    public void f(i<?> iVar, q5.b bVar, List<com.fasterxml.jackson.databind.ser.d> list) {
    }

    @Deprecated
    public u.a f0(q5.a aVar, u.a aVar2) {
        return aVar2;
    }

    public f0<?> g(q5.b bVar, f0<?> f0Var) {
        return f0Var;
    }

    @Deprecated
    public Class<?> g0(q5.a aVar, j jVar) {
        return null;
    }

    public String h(q5.b bVar) {
        return null;
    }

    public String[] h0(q5.b bVar) {
        return null;
    }

    public Object i(q5.a aVar) {
        return null;
    }

    public Boolean i0(q5.a aVar) {
        return null;
    }

    public Object j(q5.a aVar) {
        return null;
    }

    @Deprecated
    public Class<?> j0(q5.a aVar) {
        return null;
    }

    public k.a k(i<?> iVar, q5.a aVar) {
        if (!A0(aVar)) {
            return null;
        }
        k.a l10 = l(aVar);
        return l10 == null ? k.a.DEFAULT : l10;
    }

    public f.b k0(q5.a aVar) {
        return null;
    }

    @Deprecated
    public k.a l(q5.a aVar) {
        return null;
    }

    public Object l0(q5.a aVar) {
        return null;
    }

    public Enum<?> m(Class<Enum<?>> cls) {
        return null;
    }

    public c0.a m0(q5.a aVar) {
        return c0.a.d();
    }

    public Object n(h hVar) {
        return null;
    }

    public List<c> n0(q5.a aVar) {
        return null;
    }

    @Deprecated
    public Class<?> o(q5.a aVar, j jVar) {
        return null;
    }

    public String o0(q5.b bVar) {
        return null;
    }

    public Object p(q5.a aVar) {
        return null;
    }

    public u5.h<?> p0(i<?> iVar, q5.b bVar, j jVar) {
        return null;
    }

    @Deprecated
    public Class<?> q(q5.a aVar, j jVar) {
        return null;
    }

    public a6.s q0(h hVar) {
        return null;
    }

    @Deprecated
    public Class<?> r(q5.a aVar, j jVar) {
        return null;
    }

    public Object r0(q5.b bVar) {
        return null;
    }

    public Object s(q5.a aVar) {
        return null;
    }

    public Class<?>[] s0(q5.a aVar) {
        return null;
    }

    public void t(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    public y t0(q5.a aVar) {
        return null;
    }

    @Deprecated
    public String u(Enum<?> enumR) {
        return enumR.name();
    }

    public Boolean u0(q5.a aVar) {
        if (!(aVar instanceof q5.i) || !v0((q5.i) aVar)) {
            return null;
        }
        return Boolean.TRUE;
    }

    public String[] v(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    @Deprecated
    public boolean v0(q5.i iVar) {
        return false;
    }

    public abstract b0 version();

    public Object w(q5.a aVar) {
        return null;
    }

    public Boolean w0(q5.a aVar) {
        return null;
    }

    public n.d x(q5.a aVar) {
        return n.d.c();
    }

    @Deprecated
    public boolean x0(q5.i iVar) {
        return false;
    }

    @Deprecated
    public Boolean y(q5.b bVar) {
        return null;
    }

    public Boolean y0(q5.a aVar) {
        if (!(aVar instanceof q5.i) || !z0((q5.i) aVar)) {
            return null;
        }
        return Boolean.TRUE;
    }

    public String z(h hVar) {
        return null;
    }

    @Deprecated
    public boolean z0(q5.i iVar) {
        return false;
    }
}
