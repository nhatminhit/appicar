package k5;

import com.fasterxml.jackson.databind.node.m;
import com.fasterxml.jackson.databind.ser.r;
import i5.b;
import i5.d0;
import i5.q;
import i5.t;
import i5.u;
import i5.z;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.TimeZone;
import k5.h;
import l5.n;
import u5.c;
import u5.d;
import u5.e;
import v4.c0;
import v4.f0;
import v4.h;
import v4.p0;
import v4.u;
import w4.i;
import w4.l;
import w4.v;
import w4.w;
import w4.y;

public abstract class h<M extends u, B extends h<M, B>> {

    /* renamed from: a  reason: collision with root package name */
    public final M f10014a;

    public static class a implements PrivilegedAction<ServiceLoader<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClassLoader f10015a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Class f10016b;

        public a(ClassLoader classLoader, Class cls) {
            this.f10015a = classLoader;
            this.f10016b = cls;
        }

        /* renamed from: a */
        public ServiceLoader<T> run() {
            ClassLoader classLoader = this.f10015a;
            return classLoader == null ? ServiceLoader.load(this.f10016b) : ServiceLoader.load(this.f10016b, classLoader);
        }
    }

    public h(M m10) {
        this.f10014a = m10;
    }

    public static List<t> U() {
        return V((ClassLoader) null);
    }

    public static List<t> V(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator<t> it = j0(t.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> ServiceLoader<T> j0(Class<T> cls, ClassLoader classLoader) {
        return System.getSecurityManager() == null ? classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader) : (ServiceLoader) AccessController.doPrivileged(new a(classLoader, cls));
    }

    public B A(w4.t tVar) {
        this.f10014a.W2(tVar);
        return a();
    }

    public B B(u.b bVar) {
        this.f10014a.Y2(bVar);
        return a();
    }

    public B C(c0.a aVar) {
        this.f10014a.Z2(aVar);
        return a();
    }

    public B D(TimeZone timeZone) {
        this.f10014a.s3(timeZone);
        return a();
    }

    public B E(i5.h... hVarArr) {
        for (i5.h H0 : hVarArr) {
            this.f10014a.H0(H0);
        }
        return a();
    }

    public B F(q... qVarArr) {
        this.f10014a.L0(qVarArr);
        return a();
    }

    public B G(d0... d0VarArr) {
        for (d0 J0 : d0VarArr) {
            this.f10014a.J0(J0);
        }
        return a();
    }

    public B H(i.b... bVarArr) {
        this.f10014a.M0(bVarArr);
        return a();
    }

    public B I(l.a... aVarArr) {
        this.f10014a.N0(aVarArr);
        return a();
    }

    public B J(v... vVarArr) {
        for (v i10 : vVarArr) {
            this.f10014a.N0(i10.i());
        }
        return a();
    }

    public B K(w... wVarArr) {
        for (w i10 : wVarArr) {
            this.f10014a.M0(i10.i());
        }
        return a();
    }

    public B L(i5.h... hVarArr) {
        for (i5.h P0 : hVarArr) {
            this.f10014a.P0(P0);
        }
        return a();
    }

    public B M(q... qVarArr) {
        this.f10014a.T0(qVarArr);
        return a();
    }

    public B N(d0... d0VarArr) {
        for (d0 R0 : d0VarArr) {
            this.f10014a.R0(R0);
        }
        return a();
    }

    public B O(i.b... bVarArr) {
        this.f10014a.U0(bVarArr);
        return a();
    }

    public B P(l.a... aVarArr) {
        this.f10014a.V0(aVarArr);
        return a();
    }

    public B Q(v... vVarArr) {
        for (v i10 : vVarArr) {
            this.f10014a.V0(i10.i());
        }
        return a();
    }

    public B R(w... wVarArr) {
        for (w i10 : wVarArr) {
            this.f10014a.U0(i10.i());
        }
        return a();
    }

    public B S(com.fasterxml.jackson.databind.ser.l lVar) {
        this.f10014a.c3(lVar);
        return a();
    }

    public B T() {
        return i(U());
    }

    public B W(g gVar) {
        this.f10014a.e3(gVar);
        return a();
    }

    public B X(i5.i iVar) {
        this.f10014a.f3(iVar);
        return a();
    }

    public boolean Y(i5.h hVar) {
        return this.f10014a.u1(hVar);
    }

    public boolean Z(q qVar) {
        return this.f10014a.v1(qVar);
    }

    public final B a() {
        return this;
    }

    public boolean a0(d0 d0Var) {
        return this.f10014a.w1(d0Var);
    }

    public B b(d dVar) {
        this.f10014a.P(dVar);
        return a();
    }

    public boolean b0(i.b bVar) {
        return this.f10014a.y1(bVar);
    }

    public B c(d dVar, u.e eVar) {
        this.f10014a.Q(dVar, eVar);
        return a();
    }

    public boolean c0(l.a aVar) {
        return this.f10014a.z1(aVar);
    }

    public B d(d dVar, u.e eVar, f0.a aVar) {
        this.f10014a.R(dVar, eVar, aVar);
        return a();
    }

    public B d0(m mVar) {
        this.f10014a.k3(mVar);
        return a();
    }

    public B e(d dVar, u.e eVar, String str) {
        this.f10014a.S(dVar, eVar, str);
        return a();
    }

    public B e0(d dVar) {
        this.f10014a.l3(dVar);
        return a();
    }

    public B f(n nVar) {
        this.f10014a.T(nVar);
        return a();
    }

    public B f0(z zVar) {
        this.f10014a.n3(zVar);
        return a();
    }

    public B g(Class<?> cls, Class<?> cls2) {
        this.f10014a.U(cls, cls2);
        return a();
    }

    public B g0(Collection<Class<?>> collection) {
        this.f10014a.K2(collection);
        return a();
    }

    public B h(t tVar) {
        this.f10014a.H2(tVar);
        return a();
    }

    public B h0(Class<?>... clsArr) {
        this.f10014a.L2(clsArr);
        return a();
    }

    public B i(Iterable<? extends t> iterable) {
        for (t h10 : iterable) {
            h(h10);
        }
        return a();
    }

    public B i0(c... cVarArr) {
        this.f10014a.M2(cVarArr);
        return a();
    }

    public B j(t... tVarArr) {
        for (t h10 : tVarArr) {
            h(h10);
        }
        return a();
    }

    public B k(b bVar) {
        this.f10014a.O2(bVar);
        return a();
    }

    public B k0(u.a aVar) {
        this.f10014a.o3(aVar);
        return a();
    }

    public M l() {
        return this.f10014a;
    }

    public B l0(r rVar) {
        this.f10014a.p3(rVar);
        return a();
    }

    public B m() {
        this.f10014a.a0();
        return a();
    }

    public B m0(u5.h<?> hVar) {
        this.f10014a.a3(hVar);
        return a();
    }

    public B n(i5.h hVar, boolean z10) {
        this.f10014a.c0(hVar, z10);
        return a();
    }

    public y n0() {
        return this.f10014a.x3();
    }

    public B o(q qVar, boolean z10) {
        this.f10014a.d0(qVar, z10);
        return a();
    }

    public B o0(e eVar) {
        this.f10014a.r3(eVar);
        return a();
    }

    public B p(d0 d0Var, boolean z10) {
        this.f10014a.e0(d0Var, z10);
        return a();
    }

    public B p0(z5.n nVar) {
        this.f10014a.t3(nVar);
        return a();
    }

    public B q(i.b bVar, boolean z10) {
        this.f10014a.f0(bVar, z10);
        return a();
    }

    public B q0(q5.f0<?> f0Var) {
        this.f10014a.u3(f0Var);
        return a();
    }

    public B r(l.a aVar, boolean z10) {
        this.f10014a.g0(aVar, z10);
        return a();
    }

    public B r0(p0 p0Var, h.c cVar) {
        this.f10014a.v3(p0Var, cVar);
        return a();
    }

    public B s(v vVar, boolean z10) {
        this.f10014a.g0(vVar.i(), z10);
        return a();
    }

    public B t(w wVar, boolean z10) {
        this.f10014a.f0(wVar.i(), z10);
        return a();
    }

    public B u() {
        this.f10014a.F0();
        return a();
    }

    public B v(w4.a aVar) {
        this.f10014a.Q2(aVar);
        return a();
    }

    public B w(DateFormat dateFormat) {
        this.f10014a.T2(dateFormat);
        return a();
    }

    public B x(Boolean bool) {
        this.f10014a.U2(bool);
        return a();
    }

    public B y(Locale locale) {
        this.f10014a.g3(locale);
        return a();
    }

    public B z(Boolean bool) {
        this.f10014a.V2(bool);
        return a();
    }
}
