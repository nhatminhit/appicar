package q5;

import a6.h;
import a6.j;
import i5.b;
import i5.c;
import i5.j;
import i5.y;
import j5.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k5.g;
import k5.i;
import v4.n;
import v4.u;
import z5.m;

public class q extends c {

    /* renamed from: j  reason: collision with root package name */
    public static final Class<?>[] f11980j = new Class[0];

    /* renamed from: b  reason: collision with root package name */
    public final a0 f11981b;

    /* renamed from: c  reason: collision with root package name */
    public final i<?> f11982c;

    /* renamed from: d  reason: collision with root package name */
    public final b f11983d;

    /* renamed from: e  reason: collision with root package name */
    public final b f11984e;

    /* renamed from: f  reason: collision with root package name */
    public Class<?>[] f11985f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11986g;

    /* renamed from: h  reason: collision with root package name */
    public List<s> f11987h;

    /* renamed from: i  reason: collision with root package name */
    public z f11988i;

    public q(i<?> iVar, j jVar, b bVar, List<s> list) {
        super(jVar);
        this.f11981b = null;
        this.f11982c = iVar;
        if (iVar == null) {
            this.f11983d = null;
        } else {
            this.f11983d = iVar.m();
        }
        this.f11984e = bVar;
        this.f11987h = list;
    }

    public q(a0 a0Var) {
        this(a0Var, a0Var.L(), a0Var.C());
        this.f11988i = a0Var.I();
    }

    public q(a0 a0Var, j jVar, b bVar) {
        super(jVar);
        this.f11981b = a0Var;
        i<?> D = a0Var.D();
        this.f11982c = D;
        this.f11983d = D == null ? null : D.m();
        this.f11984e = bVar;
    }

    public static q P(a0 a0Var) {
        return new q(a0Var);
    }

    public static q Q(i<?> iVar, j jVar, b bVar) {
        return new q(iVar, jVar, bVar, Collections.emptyList());
    }

    public static q R(a0 a0Var) {
        return new q(a0Var);
    }

    public List<d> A() {
        return this.f11984e.w();
    }

    public List<i> B() {
        List<i> y10 = this.f11984e.y();
        if (y10.isEmpty()) {
            return y10;
        }
        ArrayList arrayList = null;
        for (i next : y10) {
            if (T(next)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public Set<String> C() {
        a0 a0Var = this.f11981b;
        Set<String> E = a0Var == null ? null : a0Var.E();
        return E == null ? Collections.emptySet() : E;
    }

    public z D() {
        return this.f11988i;
    }

    public boolean F() {
        return this.f11984e.C();
    }

    public Object G(boolean z10) {
        d x10 = this.f11984e.x();
        if (x10 == null) {
            return null;
        }
        if (z10) {
            x10.l(this.f11982c.T(i5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return x10.c().newInstance(new Object[0]);
        } catch (Exception e10) {
            e = e10;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            h.o0(e);
            h.q0(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.f11984e.c().getName() + ": (" + e.getClass().getName() + ") " + h.o(e), e);
        }
    }

    @Deprecated
    public j I(Type type) {
        if (type == null) {
            return null;
        }
        return this.f11982c.M().b0(type, this.f9033a.F());
    }

    public a6.j<Object, Object> J(Object obj) {
        a6.j<?, ?> jVar = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof a6.j) {
            return (a6.j) obj;
        }
        if (obj instanceof Class) {
            Class<j.a> cls = (Class) obj;
            if (cls == j.a.class || h.R(cls)) {
                return null;
            }
            if (a6.j.class.isAssignableFrom(cls)) {
                g G = this.f11982c.G();
                if (G != null) {
                    jVar = G.a(this.f11982c, this.f11984e, cls);
                }
                return jVar == null ? (a6.j) h.l(cls, this.f11982c.c()) : jVar;
            }
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r3 = r2.f11983d.z(r3);
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.y K(q5.l r3) {
        /*
            r2 = this;
            i5.b r0 = r2.f11983d
            i5.y r0 = r0.F(r3)
            if (r0 == 0) goto L_0x000e
            boolean r1 = r0.i()
            if (r1 == 0) goto L_0x0020
        L_0x000e:
            i5.b r1 = r2.f11983d
            java.lang.String r3 = r1.z(r3)
            if (r3 == 0) goto L_0x0020
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0020
            i5.y r0 = i5.y.a(r3)
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.q.K(q5.l):i5.y");
    }

    @Deprecated
    public LinkedHashMap<String, f> L(Collection<String> collection, boolean z10) {
        LinkedHashMap<String, f> linkedHashMap = new LinkedHashMap<>();
        for (s next : M()) {
            f B = next.B();
            if (B != null) {
                String name = next.getName();
                if (collection == null || !collection.contains(name)) {
                    linkedHashMap.put(name, B);
                }
            }
        }
        return linkedHashMap;
    }

    public List<s> M() {
        if (this.f11987h == null) {
            this.f11987h = this.f11981b.J();
        }
        return this.f11987h;
    }

    public boolean N(s sVar) {
        if (S(sVar.a())) {
            return false;
        }
        M().add(sVar);
        return true;
    }

    public s O(y yVar) {
        for (s next : M()) {
            if (next.N(yVar)) {
                return next;
            }
        }
        return null;
    }

    public boolean S(y yVar) {
        return O(yVar) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r5 = r5.E(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean T(q5.i r5) {
        /*
            r4 = this;
            java.lang.Class r0 = r5.M()
            java.lang.Class r1 = r4.x()
            boolean r0 = r1.isAssignableFrom(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            i5.b r0 = r4.f11983d
            k5.i<?> r2 = r4.f11982c
            v4.k$a r0 = r0.k(r2, r5)
            r2 = 1
            if (r0 == 0) goto L_0x0020
            v4.k$a r3 = v4.k.a.DISABLED
            if (r0 == r3) goto L_0x0020
            return r2
        L_0x0020:
            java.lang.String r0 = r5.f()
            java.lang.String r3 = "valueOf"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0033
            int r3 = r5.C()
            if (r3 != r2) goto L_0x0033
            return r2
        L_0x0033:
            java.lang.String r3 = "fromString"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0052
            int r0 = r5.C()
            if (r0 != r2) goto L_0x0052
            java.lang.Class r5 = r5.E(r1)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r5 == r0) goto L_0x0051
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            boolean r5 = r0.isAssignableFrom(r5)
            if (r5 == 0) goto L_0x0052
        L_0x0051:
            return r2
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.q.T(q5.i):boolean");
    }

    public boolean U(String str) {
        Iterator<s> it = M().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public m a() {
        return this.f9033a.F();
    }

    public h b() throws IllegalArgumentException {
        a0 a0Var = this.f11981b;
        h z10 = a0Var == null ? null : a0Var.z();
        if (z10 != null) {
            if (!Map.class.isAssignableFrom(z10.g())) {
                throw new IllegalArgumentException("Invalid 'any-getter' annotation on method " + z10.f() + "(): return type is not instance of java.util.Map");
            }
        }
        return z10;
    }

    public h d() throws IllegalArgumentException {
        a0 a0Var = this.f11981b;
        if (a0Var == null) {
            return null;
        }
        i B = a0Var.B();
        if (B != null) {
            Class<?> E = B.E(0);
            if (E == String.class || E == Object.class) {
                return B;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", new Object[]{B.f(), E.getName()}));
        }
        h A = this.f11981b.A();
        if (A == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(A.g())) {
            return A;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", new Object[]{A.f()}));
    }

    @Deprecated
    public Map<String, h> f() {
        List<s> g10 = g();
        if (g10 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (s next : g10) {
            hashMap.put(next.getName(), next.E());
        }
        return hashMap;
    }

    public List<s> g() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (s next : M()) {
            b.a w10 = next.w();
            if (w10 != null && w10.d()) {
                String b10 = w10.b();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(b10);
                } else if (!hashSet.add(b10)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name '" + b10 + "'");
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String h() {
        b bVar = this.f11983d;
        if (bVar == null) {
            return null;
        }
        return bVar.h(this.f11984e);
    }

    public d i() {
        return this.f11984e.x();
    }

    public Class<?>[] j() {
        if (!this.f11986g) {
            this.f11986g = true;
            b bVar = this.f11983d;
            Class<?>[] s02 = bVar == null ? null : bVar.s0(this.f11984e);
            if (s02 == null && !this.f11982c.T(i5.q.DEFAULT_VIEW_INCLUSION)) {
                s02 = f11980j;
            }
            this.f11985f = s02;
        }
        return this.f11985f;
    }

    public a6.j<Object, Object> k() {
        b bVar = this.f11983d;
        if (bVar == null) {
            return null;
        }
        return J(bVar.p(this.f11984e));
    }

    public n.d l(n.d dVar) {
        n.d x10;
        b bVar = this.f11983d;
        if (!(bVar == null || (x10 = bVar.x(this.f11984e)) == null)) {
            dVar = dVar == null ? x10 : dVar.A(x10);
        }
        n.d w10 = this.f11982c.w(this.f11984e.g());
        return w10 != null ? dVar == null ? w10 : dVar.A(w10) : dVar;
    }

    public Method m(Class<?>... clsArr) {
        for (i next : this.f11984e.y()) {
            if (T(next) && next.C() == 1) {
                Class<?> E = next.E(0);
                for (Class<?> isAssignableFrom : clsArr) {
                    if (E.isAssignableFrom(isAssignableFrom)) {
                        return next.c();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public Map<Object, h> n() {
        a0 a0Var = this.f11981b;
        return a0Var != null ? a0Var.F() : Collections.emptyMap();
    }

    public h o() {
        a0 a0Var = this.f11981b;
        if (a0Var == null) {
            return null;
        }
        return a0Var.G();
    }

    @Deprecated
    public i p() {
        a0 a0Var = this.f11981b;
        if (a0Var == null) {
            return null;
        }
        return a0Var.H();
    }

    public i q(String str, Class<?>[] clsArr) {
        return this.f11984e.t(str, clsArr);
    }

    public Class<?> r() {
        b bVar = this.f11983d;
        if (bVar == null) {
            return null;
        }
        return bVar.L(this.f11984e);
    }

    public e.a s() {
        b bVar = this.f11983d;
        if (bVar == null) {
            return null;
        }
        return bVar.M(this.f11984e);
    }

    public List<s> t() {
        return M();
    }

    public u.b u(u.b bVar) {
        u.b V;
        b bVar2 = this.f11983d;
        return (bVar2 == null || (V = bVar2.V(this.f11984e)) == null) ? bVar : bVar == null ? V : bVar.o(V);
    }

    public a6.j<Object, Object> v() {
        b bVar = this.f11983d;
        if (bVar == null) {
            return null;
        }
        return J(bVar.d0(this.f11984e));
    }

    public Constructor<?> w(Class<?>... clsArr) {
        for (d next : this.f11984e.w()) {
            if (next.C() == 1) {
                Class<?> E = next.E(0);
                for (Class<?> cls : clsArr) {
                    if (cls == E) {
                        return next.c();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public a6.b y() {
        return this.f11984e.v();
    }

    public b z() {
        return this.f11984e;
    }
}
