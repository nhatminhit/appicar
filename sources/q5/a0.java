package q5;

import a6.e;
import i5.b;
import i5.j;
import i5.q;
import i5.y;
import i5.z;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import k5.i;
import v4.d;
import v4.k;
import v4.x;

public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final i<?> f11904a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11905b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11906c;

    /* renamed from: d  reason: collision with root package name */
    public final j f11907d;

    /* renamed from: e  reason: collision with root package name */
    public final b f11908e;

    /* renamed from: f  reason: collision with root package name */
    public final f0<?> f11909f;

    /* renamed from: g  reason: collision with root package name */
    public final b f11910g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11911h;

    /* renamed from: i  reason: collision with root package name */
    public final String f11912i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11913j;

    /* renamed from: k  reason: collision with root package name */
    public LinkedHashMap<String, b0> f11914k;

    /* renamed from: l  reason: collision with root package name */
    public LinkedList<b0> f11915l;

    /* renamed from: m  reason: collision with root package name */
    public Map<y, y> f11916m;

    /* renamed from: n  reason: collision with root package name */
    public LinkedList<h> f11917n;

    /* renamed from: o  reason: collision with root package name */
    public LinkedList<i> f11918o;

    /* renamed from: p  reason: collision with root package name */
    public LinkedList<h> f11919p;

    /* renamed from: q  reason: collision with root package name */
    public LinkedList<h> f11920q;

    /* renamed from: r  reason: collision with root package name */
    public HashSet<String> f11921r;

    /* renamed from: s  reason: collision with root package name */
    public LinkedHashMap<Object, h> f11922s;

    public a0(i<?> iVar, boolean z10, j jVar, b bVar, String str) {
        b bVar2;
        this.f11904a = iVar;
        this.f11906c = iVar.T(q.USE_STD_BEAN_NAMING);
        this.f11905b = z10;
        this.f11907d = jVar;
        this.f11908e = bVar;
        this.f11912i = str == null ? "set" : str;
        if (iVar.S()) {
            this.f11911h = true;
            bVar2 = iVar.m();
        } else {
            this.f11911h = false;
            bVar2 = b.G0();
        }
        this.f11910g = bVar2;
        this.f11909f = iVar.F(jVar.g(), bVar);
    }

    public h A() {
        if (!this.f11913j) {
            w();
        }
        LinkedList<h> linkedList = this.f11919p;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            M("Multiple 'any-setter' fields defined (%s vs %s)", this.f11919p.get(0), this.f11919p.get(1));
        }
        return this.f11919p.getFirst();
    }

    public i B() {
        if (!this.f11913j) {
            w();
        }
        LinkedList<i> linkedList = this.f11918o;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            M("Multiple 'any-setter' methods defined (%s vs %s)", this.f11918o.get(0), this.f11918o.get(1));
        }
        return this.f11918o.getFirst();
    }

    public b C() {
        return this.f11908e;
    }

    public i<?> D() {
        return this.f11904a;
    }

    public Set<String> E() {
        return this.f11921r;
    }

    public Map<Object, h> F() {
        if (!this.f11913j) {
            w();
        }
        return this.f11922s;
    }

    public h G() {
        if (!this.f11913j) {
            w();
        }
        LinkedList<h> linkedList = this.f11920q;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            M("Multiple 'as-value' properties defined (%s vs %s)", this.f11920q.get(0), this.f11920q.get(1));
        }
        return this.f11920q.get(0);
    }

    @Deprecated
    public i H() {
        h G = G();
        if (G instanceof i) {
            return (i) G;
        }
        return null;
    }

    public z I() {
        z J = this.f11910g.J(this.f11908e);
        return J != null ? this.f11910g.K(this.f11908e, J) : J;
    }

    public List<s> J() {
        return new ArrayList(K().values());
    }

    public Map<String, b0> K() {
        if (!this.f11913j) {
            w();
        }
        return this.f11914k;
    }

    public j L() {
        return this.f11907d;
    }

    public void M(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.f11908e + ": " + str);
    }

    public void a(Map<String, b0> map, l lVar) {
        k.a k10;
        String z10 = this.f11910g.z(lVar);
        if (z10 == null) {
            z10 = "";
        }
        y F = this.f11910g.F(lVar);
        boolean z11 = F != null && !F.i();
        if (!z11) {
            if (!z10.isEmpty() && (k10 = this.f11910g.k(this.f11904a, lVar.v())) != null && k10 != k.a.DISABLED) {
                F = y.a(z10);
            } else {
                return;
            }
        }
        y yVar = F;
        String i10 = i(z10);
        b0 o10 = (!z11 || !i10.isEmpty()) ? o(map, i10) : n(map, yVar);
        o10.p0(lVar, yVar, z11, true, false);
        this.f11915l.add(o10);
    }

    public void b(Map<String, b0> map) {
        if (this.f11911h) {
            Iterator<d> it = this.f11908e.w().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (this.f11915l == null) {
                    this.f11915l = new LinkedList<>();
                }
                int C = next.C();
                for (int i10 = 0; i10 < C; i10++) {
                    a(map, next.A(i10));
                }
            }
            for (i next2 : this.f11908e.y()) {
                if (this.f11915l == null) {
                    this.f11915l = new LinkedList<>();
                }
                int C2 = next2.C();
                for (int i11 = 0; i11 < C2; i11++) {
                    a(map, next2.A(i11));
                }
            }
        }
    }

    public void c(Map<String, b0> map) {
        boolean z10;
        y yVar;
        boolean z11;
        boolean z12;
        LinkedList<h> linkedList;
        b bVar = this.f11910g;
        boolean z13 = !this.f11905b && !this.f11904a.T(q.ALLOW_FINAL_FIELDS_AS_MUTATORS);
        boolean T = this.f11904a.T(q.PROPAGATE_TRANSIENT_MARKER);
        for (f next : this.f11908e.s()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(bVar.y0(next))) {
                if (this.f11920q == null) {
                    this.f11920q = new LinkedList<>();
                }
                linkedList = this.f11920q;
            } else if (bool.equals(bVar.w0(next))) {
                if (this.f11919p == null) {
                    this.f11919p = new LinkedList<>();
                }
                linkedList = this.f11919p;
            } else {
                String z14 = bVar.z(next);
                if (z14 == null) {
                    z14 = next.f();
                }
                y m10 = m(z14);
                y Z = bVar.Z(this.f11904a, next, m10);
                if (Z != null && !Z.equals(m10)) {
                    if (this.f11916m == null) {
                        this.f11916m = new HashMap();
                    }
                    this.f11916m.put(Z, m10);
                }
                y G = this.f11905b ? bVar.G(next) : bVar.F(next);
                boolean z15 = G != null;
                if (!z15 || !G.i()) {
                    yVar = G;
                    z10 = z15;
                } else {
                    z10 = false;
                    yVar = m(z14);
                }
                boolean z16 = yVar != null;
                if (!z16) {
                    z16 = this.f11909f.k(next);
                }
                boolean B0 = bVar.B0(next);
                if (!next.w() || z15) {
                    z11 = B0;
                    z12 = z16;
                } else {
                    z11 = T ? true : B0;
                    z12 = false;
                }
                if (!z13 || yVar != null || z11 || !Modifier.isFinal(next.e())) {
                    o(map, z14).q0(next, yVar, z10, z12, z11);
                }
            }
            linkedList.add(next);
        }
    }

    public void d(Map<String, b0> map, i iVar, b bVar) {
        boolean z10;
        boolean z11;
        y yVar;
        String str;
        boolean z12;
        if (iVar.N()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(bVar.u0(iVar))) {
                if (this.f11917n == null) {
                    this.f11917n = new LinkedList<>();
                }
                this.f11917n.add(iVar);
            } else if (bool.equals(bVar.y0(iVar))) {
                if (this.f11920q == null) {
                    this.f11920q = new LinkedList<>();
                }
                this.f11920q.add(iVar);
            } else {
                y G = bVar.G(iVar);
                boolean z13 = false;
                boolean z14 = G != null;
                if (!z14) {
                    str = bVar.z(iVar);
                    if (str == null) {
                        str = e.i(iVar, iVar.f(), this.f11906c);
                    }
                    if (str == null) {
                        str = e.g(iVar, iVar.f(), this.f11906c);
                        if (str != null) {
                            z12 = this.f11909f.a(iVar);
                        } else {
                            return;
                        }
                    } else {
                        z12 = this.f11909f.g(iVar);
                    }
                    yVar = G;
                    z10 = z12;
                    z11 = z14;
                } else {
                    String z15 = bVar.z(iVar);
                    if (z15 == null) {
                        z15 = e.f(iVar, this.f11906c);
                    }
                    if (z15 == null) {
                        z15 = iVar.f();
                    }
                    if (G.i()) {
                        G = m(z15);
                    } else {
                        z13 = z14;
                    }
                    yVar = G;
                    z10 = true;
                    z11 = z13;
                    str = z15;
                }
                o(map, i(str)).r0(iVar, yVar, z11, z10, bVar.B0(iVar));
            }
        }
    }

    public void e(Map<String, b0> map) {
        b bVar = this.f11910g;
        for (f next : this.f11908e.s()) {
            k(bVar.A(next), next);
        }
        for (i next2 : this.f11908e.E()) {
            if (next2.C() == 1) {
                k(bVar.A(next2), next2);
            }
        }
    }

    public void f(Map<String, b0> map) {
        b bVar = this.f11910g;
        for (i next : this.f11908e.E()) {
            int C = next.C();
            if (C == 0) {
                d(map, next, bVar);
            } else if (C == 1) {
                g(map, next, bVar);
            } else if (C == 2 && bVar != null && Boolean.TRUE.equals(bVar.w0(next))) {
                if (this.f11918o == null) {
                    this.f11918o = new LinkedList<>();
                }
                this.f11918o.add(next);
            }
        }
    }

    public void g(Map<String, b0> map, i iVar, b bVar) {
        String str = null;
        y F = bVar == null ? null : bVar.F(iVar);
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = F != null;
        if (!z12) {
            if (bVar != null) {
                str = bVar.z(iVar);
            }
            if (str == null) {
                str = e.h(iVar, this.f11912i, this.f11906c);
            }
            if (str != null) {
                z10 = this.f11909f.e(iVar);
            } else {
                return;
            }
        } else {
            if (bVar != null) {
                str = bVar.z(iVar);
            }
            if (str == null) {
                str = e.h(iVar, this.f11912i, this.f11906c);
            }
            if (str == null) {
                str = iVar.f();
            }
            if (F.i()) {
                F = m(str);
                z12 = false;
            }
        }
        y yVar = F;
        boolean z13 = z10;
        boolean z14 = z12;
        String i10 = i(str);
        if (bVar != null) {
            z11 = bVar.B0(iVar);
        }
        o(map, i10).s0(iVar, yVar, z14, z13, z11);
    }

    public final boolean h(Collection<b0> collection) {
        for (b0 d10 : collection) {
            if (d10.d().k()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.get(m(r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String i(java.lang.String r3) {
        /*
            r2 = this;
            java.util.Map<i5.y, i5.y> r0 = r2.f11916m
            if (r0 == 0) goto L_0x0014
            i5.y r1 = r2.m(r3)
            java.lang.Object r0 = r0.get(r1)
            i5.y r0 = (i5.y) r0
            if (r0 == 0) goto L_0x0014
            java.lang.String r3 = r0.d()
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.a0.i(java.lang.String):java.lang.String");
    }

    public final void j(String str) {
        if (!this.f11905b) {
            if (this.f11921r == null) {
                this.f11921r = new HashSet<>();
            }
            this.f11921r.add(str);
        }
    }

    public void k(d.a aVar, h hVar) {
        if (aVar != null) {
            Object g10 = aVar.g();
            if (this.f11922s == null) {
                this.f11922s = new LinkedHashMap<>();
            }
            h put = this.f11922s.put(g10, hVar);
            if (put != null && put.getClass() == hVar.getClass()) {
                String name = g10.getClass().getName();
                throw new IllegalArgumentException("Duplicate injectable value with id '" + String.valueOf(g10) + "' (of type " + name + ")");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r1 = r1.e(r4.f11904a, r4.f11908e, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i5.z l() {
        /*
            r4 = this;
            i5.b r0 = r4.f11910g
            q5.b r1 = r4.f11908e
            java.lang.Object r0 = r0.H(r1)
            if (r0 != 0) goto L_0x0011
            k5.i<?> r0 = r4.f11904a
            i5.z r0 = r0.J()
            return r0
        L_0x0011:
            boolean r1 = r0 instanceof i5.z
            if (r1 == 0) goto L_0x0018
            i5.z r0 = (i5.z) r0
            return r0
        L_0x0018:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L_0x006c
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<i5.z> r1 = i5.z.class
            if (r0 != r1) goto L_0x0024
            r0 = 0
            return r0
        L_0x0024:
            java.lang.Class<i5.z> r1 = i5.z.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto L_0x004c
            k5.i<?> r1 = r4.f11904a
            k5.g r1 = r1.G()
            if (r1 == 0) goto L_0x003f
            k5.i<?> r2 = r4.f11904a
            q5.b r3 = r4.f11908e
            i5.z r1 = r1.e(r2, r3, r0)
            if (r1 == 0) goto L_0x003f
            return r1
        L_0x003f:
            k5.i<?> r1 = r4.f11904a
            boolean r1 = r1.c()
            java.lang.Object r0 = a6.h.l(r0, r1)
            i5.z r0 = (i5.z) r0
            return r0
        L_0x004c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AnnotationIntrospector returned Class "
            r2.append(r3)
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = "; expected Class<PropertyNamingStrategy>"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AnnotationIntrospector returned PropertyNamingStrategy definition of type "
            r2.append(r3)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.a0.l():i5.z");
    }

    public final y m(String str) {
        return y.b(str, (String) null);
    }

    public b0 n(Map<String, b0> map, y yVar) {
        String d10 = yVar.d();
        b0 b0Var = map.get(d10);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this.f11904a, this.f11910g, this.f11905b, yVar);
        map.put(d10, b0Var2);
        return b0Var2;
    }

    public b0 o(Map<String, b0> map, String str) {
        b0 b0Var = map.get(str);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this.f11904a, this.f11910g, this.f11905b, y.a(str));
        map.put(str, b0Var2);
        return b0Var2;
    }

    public void p(Map<String, b0> map) {
        boolean T = this.f11904a.T(q.INFER_PROPERTY_MUTATORS);
        for (b0 next : map.values()) {
            if (next.G0(T) == x.a.READ_ONLY) {
                j(next.getName());
            }
        }
    }

    public void q(Map<String, b0> map) {
        Iterator<b0> it = map.values().iterator();
        while (it.hasNext()) {
            b0 next = it.next();
            if (!next.u0()) {
                it.remove();
            } else if (next.t0()) {
                if (!next.P()) {
                    it.remove();
                } else {
                    next.F0();
                    if (next.r()) {
                    }
                }
                j(next.getName());
            }
        }
    }

    public void r(Map<String, b0> map) {
        Iterator<Map.Entry<String, b0>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next().getValue();
            Set<y> y02 = b0Var.y0();
            if (!y02.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (y02.size() == 1) {
                    linkedList.add(b0Var.S(y02.iterator().next()));
                } else {
                    linkedList.addAll(b0Var.w0(y02));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                b0 b0Var2 = (b0) it2.next();
                String name = b0Var2.getName();
                b0 b0Var3 = map.get(name);
                if (b0Var3 == null) {
                    map.put(name, b0Var2);
                } else {
                    b0Var3.o0(b0Var2);
                }
                v(b0Var2, this.f11915l);
                HashSet<String> hashSet = this.f11921r;
                if (hashSet != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r3.L() != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
        if (r3.M() != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(java.util.Map<java.lang.String, q5.b0> r9, i5.z r10) {
        /*
            r8 = this;
            java.util.Collection r0 = r9.values()
            int r1 = r9.size()
            q5.b0[] r1 = new q5.b0[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            q5.b0[] r0 = (q5.b0[]) r0
            r9.clear()
            int r1 = r0.length
            r2 = 0
        L_0x0015:
            if (r2 >= r1) goto L_0x00bd
            r3 = r0[r2]
            i5.y r4 = r3.a()
            r5 = 0
            boolean r6 = r3.Q()
            if (r6 == 0) goto L_0x002e
            k5.i<?> r6 = r8.f11904a
            i5.q r7 = i5.q.ALLOW_EXPLICIT_PROPERTY_RENAMING
            boolean r6 = r6.T(r7)
            if (r6 == 0) goto L_0x0094
        L_0x002e:
            boolean r6 = r8.f11905b
            if (r6 == 0) goto L_0x005c
            boolean r6 = r3.M()
            if (r6 == 0) goto L_0x0047
        L_0x0038:
            k5.i<?> r5 = r8.f11904a
            q5.i r6 = r3.C()
            java.lang.String r7 = r4.d()
            java.lang.String r5 = r10.c(r5, r6, r7)
            goto L_0x0094
        L_0x0047:
            boolean r6 = r3.L()
            if (r6 == 0) goto L_0x0094
        L_0x004d:
            k5.i<?> r5 = r8.f11904a
            q5.f r6 = r3.B()
            java.lang.String r7 = r4.d()
            java.lang.String r5 = r10.b(r5, r6, r7)
            goto L_0x0094
        L_0x005c:
            boolean r6 = r3.O()
            if (r6 == 0) goto L_0x0071
            k5.i<?> r5 = r8.f11904a
            q5.i r6 = r3.J()
            java.lang.String r7 = r4.d()
            java.lang.String r5 = r10.d(r5, r6, r7)
            goto L_0x0094
        L_0x0071:
            boolean r6 = r3.K()
            if (r6 == 0) goto L_0x0086
            k5.i<?> r5 = r8.f11904a
            q5.l r6 = r3.z()
            java.lang.String r7 = r4.d()
            java.lang.String r5 = r10.a(r5, r6, r7)
            goto L_0x0094
        L_0x0086:
            boolean r6 = r3.L()
            if (r6 == 0) goto L_0x008d
            goto L_0x004d
        L_0x008d:
            boolean r6 = r3.M()
            if (r6 == 0) goto L_0x0094
            goto L_0x0038
        L_0x0094:
            if (r5 == 0) goto L_0x00a1
            boolean r6 = r4.g(r5)
            if (r6 != 0) goto L_0x00a1
            q5.b0 r3 = r3.T(r5)
            goto L_0x00a5
        L_0x00a1:
            java.lang.String r5 = r4.d()
        L_0x00a5:
            java.lang.Object r4 = r9.get(r5)
            q5.b0 r4 = (q5.b0) r4
            if (r4 != 0) goto L_0x00b1
            r9.put(r5, r3)
            goto L_0x00b4
        L_0x00b1:
            r4.o0(r3)
        L_0x00b4:
            java.util.LinkedList<q5.b0> r4 = r8.f11915l
            r8.v(r3, r4)
            int r2 = r2 + 1
            goto L_0x0015
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.a0.s(java.util.Map, i5.z):void");
    }

    public void t(Map<String, b0> map) {
        y t02;
        Iterator<Map.Entry<String, b0>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next().getValue();
            h G = b0Var.G();
            if (G != null && (t02 = this.f11910g.t0(G)) != null && t02.f() && !t02.equals(b0Var.a())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(b0Var.S(t02));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                b0 b0Var2 = (b0) it2.next();
                String name = b0Var2.getName();
                b0 b0Var3 = map.get(name);
                if (b0Var3 == null) {
                    map.put(name, b0Var2);
                } else {
                    b0Var3.o0(b0Var2);
                }
            }
        }
    }

    public void u(Map<String, b0> map) {
        b bVar = this.f11910g;
        Boolean i02 = bVar.i0(this.f11908e);
        boolean U = i02 == null ? this.f11904a.U() : i02.booleanValue();
        boolean h10 = h(map.values());
        String[] h02 = bVar.h0(this.f11908e);
        if (U || h10 || this.f11915l != null || h02 != null) {
            int size = map.size();
            Map treeMap = U ? new TreeMap() : new LinkedHashMap(size + size);
            for (b0 next : map.values()) {
                treeMap.put(next.getName(), next);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
            if (h02 != null) {
                for (String str : h02) {
                    b0 b0Var = (b0) treeMap.remove(str);
                    if (b0Var == null) {
                        Iterator<b0> it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            b0 next2 = it.next();
                            if (str.equals(next2.D())) {
                                str = next2.getName();
                                b0Var = next2;
                                break;
                            }
                        }
                    }
                    if (b0Var != null) {
                        linkedHashMap.put(str, b0Var);
                    }
                }
            }
            if (h10) {
                TreeMap treeMap2 = new TreeMap();
                Iterator it2 = treeMap.entrySet().iterator();
                while (it2.hasNext()) {
                    b0 b0Var2 = (b0) ((Map.Entry) it2.next()).getValue();
                    Integer f10 = b0Var2.d().f();
                    if (f10 != null) {
                        treeMap2.put(f10, b0Var2);
                        it2.remove();
                    }
                }
                for (b0 b0Var3 : treeMap2.values()) {
                    linkedHashMap.put(b0Var3.getName(), b0Var3);
                }
            }
            Collection<b0> collection = this.f11915l;
            if (collection != null) {
                if (U) {
                    TreeMap treeMap3 = new TreeMap();
                    Iterator<b0> it3 = this.f11915l.iterator();
                    while (it3.hasNext()) {
                        b0 next3 = it3.next();
                        treeMap3.put(next3.getName(), next3);
                    }
                    collection = treeMap3.values();
                }
                for (b0 b0Var4 : collection) {
                    String name = b0Var4.getName();
                    if (treeMap.containsKey(name)) {
                        linkedHashMap.put(name, b0Var4);
                    }
                }
            }
            linkedHashMap.putAll(treeMap);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    public void v(b0 b0Var, List<b0> list) {
        if (list != null) {
            String D = b0Var.D();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (list.get(i10).D().equals(D)) {
                    list.set(i10, b0Var);
                    return;
                }
            }
        }
    }

    public void w() {
        LinkedHashMap<String, b0> linkedHashMap = new LinkedHashMap<>();
        c(linkedHashMap);
        f(linkedHashMap);
        if (!this.f11908e.D()) {
            b(linkedHashMap);
        }
        q(linkedHashMap);
        p(linkedHashMap);
        r(linkedHashMap);
        e(linkedHashMap);
        for (b0 D0 : linkedHashMap.values()) {
            D0.D0(this.f11905b);
        }
        z l10 = l();
        if (l10 != null) {
            s(linkedHashMap, l10);
        }
        for (b0 H0 : linkedHashMap.values()) {
            H0.H0();
        }
        if (this.f11904a.T(q.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            t(linkedHashMap);
        }
        u(linkedHashMap);
        this.f11914k = linkedHashMap;
        this.f11913j = true;
    }

    @Deprecated
    public Class<?> x() {
        return this.f11910g.L(this.f11908e);
    }

    public b y() {
        return this.f11910g;
    }

    public h z() {
        if (!this.f11913j) {
            w();
        }
        LinkedList<h> linkedList = this.f11917n;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            M("Multiple 'any-getters' defined (%s vs %s)", this.f11917n.get(0), this.f11917n.get(1));
        }
        return this.f11917n.getFirst();
    }
}
