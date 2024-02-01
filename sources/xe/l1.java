package xe;

import be.p;
import hf.d;
import hf.g;
import hf.h;
import hf.i;
import hf.k;
import hf.l;
import hf.m;
import hf.q;
import hf.r;
import hf.s;
import hf.t;
import hf.u;
import hf.v;
import java.util.Arrays;
import java.util.Collections;
import zd.h1;

public class l1 {

    /* renamed from: a  reason: collision with root package name */
    public static final m1 f24528a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f24529b = " (Kotlin reflection is not available)";

    /* renamed from: c  reason: collision with root package name */
    public static final d[] f24530c = new d[0];

    static {
        m1 m1Var = null;
        try {
            m1Var = (m1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (m1Var == null) {
            m1Var = new m1();
        }
        f24528a = m1Var;
    }

    @h1(version = "1.4")
    public static s A(g gVar) {
        return f24528a.s(gVar, Collections.emptyList(), false);
    }

    @h1(version = "1.4")
    public static s B(Class cls) {
        return f24528a.s(d(cls), Collections.emptyList(), false);
    }

    @h1(version = "1.4")
    public static s C(Class cls, u uVar) {
        return f24528a.s(d(cls), Collections.singletonList(uVar), false);
    }

    @h1(version = "1.4")
    public static s D(Class cls, u uVar, u uVar2) {
        return f24528a.s(d(cls), Arrays.asList(new u[]{uVar, uVar2}), false);
    }

    @h1(version = "1.4")
    public static s E(Class cls, u... uVarArr) {
        return f24528a.s(d(cls), p.kz(uVarArr), false);
    }

    @h1(version = "1.4")
    public static t F(Object obj, String str, v vVar, boolean z10) {
        return f24528a.t(obj, str, vVar, z10);
    }

    public static d a(Class cls) {
        return f24528a.a(cls);
    }

    public static d b(Class cls, String str) {
        return f24528a.b(cls, str);
    }

    public static i c(g0 g0Var) {
        return f24528a.c(g0Var);
    }

    public static d d(Class cls) {
        return f24528a.d(cls);
    }

    public static d e(Class cls, String str) {
        return f24528a.e(cls, str);
    }

    public static d[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f24530c;
        }
        d[] dVarArr = new d[length];
        for (int i10 = 0; i10 < length; i10++) {
            dVarArr[i10] = d(clsArr[i10]);
        }
        return dVarArr;
    }

    @h1(version = "1.4")
    public static h g(Class cls) {
        return f24528a.f(cls, "");
    }

    public static h h(Class cls, String str) {
        return f24528a.f(cls, str);
    }

    @h1(version = "1.6")
    public static s i(s sVar) {
        return f24528a.g(sVar);
    }

    public static k j(u0 u0Var) {
        return f24528a.h(u0Var);
    }

    public static l k(w0 w0Var) {
        return f24528a.i(w0Var);
    }

    public static m l(y0 y0Var) {
        return f24528a.j(y0Var);
    }

    @h1(version = "1.6")
    public static s m(s sVar) {
        return f24528a.k(sVar);
    }

    @h1(version = "1.4")
    public static s n(g gVar) {
        return f24528a.s(gVar, Collections.emptyList(), true);
    }

    @h1(version = "1.4")
    public static s o(Class cls) {
        return f24528a.s(d(cls), Collections.emptyList(), true);
    }

    @h1(version = "1.4")
    public static s p(Class cls, u uVar) {
        return f24528a.s(d(cls), Collections.singletonList(uVar), true);
    }

    @h1(version = "1.4")
    public static s q(Class cls, u uVar, u uVar2) {
        return f24528a.s(d(cls), Arrays.asList(new u[]{uVar, uVar2}), true);
    }

    @h1(version = "1.4")
    public static s r(Class cls, u... uVarArr) {
        return f24528a.s(d(cls), p.kz(uVarArr), true);
    }

    @h1(version = "1.6")
    public static s s(s sVar, s sVar2) {
        return f24528a.l(sVar, sVar2);
    }

    public static hf.p t(d1 d1Var) {
        return f24528a.m(d1Var);
    }

    public static q u(f1 f1Var) {
        return f24528a.n(f1Var);
    }

    public static r v(h1 h1Var) {
        return f24528a.o(h1Var);
    }

    @h1(version = "1.3")
    public static String w(e0 e0Var) {
        return f24528a.p(e0Var);
    }

    @h1(version = "1.1")
    public static String x(n0 n0Var) {
        return f24528a.q(n0Var);
    }

    @h1(version = "1.4")
    public static void y(t tVar, s sVar) {
        f24528a.r(tVar, Collections.singletonList(sVar));
    }

    @h1(version = "1.4")
    public static void z(t tVar, s... sVarArr) {
        f24528a.r(tVar, p.kz(sVarArr));
    }
}
