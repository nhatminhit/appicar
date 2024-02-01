package l5;

import a6.b0;
import a6.h;
import i5.c;
import i5.d;
import i5.g;
import i5.j;
import i5.k;
import i5.l;
import i5.p;
import i5.x;
import i5.y;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import k5.f;
import m5.e;
import n5.c0;
import n5.g0;
import n5.h0;
import n5.i0;
import n5.m0;
import n5.o;
import n5.u;
import n5.v;
import n5.w;
import q5.f0;
import q5.i;
import q5.m;
import q5.q;
import q5.s;
import v4.c0;
import v4.d;
import v4.k0;
import z5.n;

public abstract class b extends p implements Serializable {
    public static final Class<?> Q = Object.class;
    public static final Class<?> R = String.class;
    public static final Class<?> S = CharSequence.class;
    public static final Class<?> T = Iterable.class;
    public static final Class<?> U = Map.Entry.class;
    public static final Class<?> V = Serializable.class;
    public static final y W = new y("@JsonUnwrapped");
    public final f P;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10125a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                v4.k$a[] r0 = v4.k.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10125a = r0
                v4.k$a r1 = v4.k.a.DELEGATING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10125a     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.k$a r1 = v4.k.a.PROPERTIES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10125a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.k$a r1 = v4.k.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l5.b.a.<clinit>():void");
        }
    }

    /* renamed from: l5.b$b  reason: collision with other inner class name */
    public static class C0174b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Class<? extends Collection>> f10126a;

        /* renamed from: b  reason: collision with root package name */
        public static final HashMap<String, Class<? extends Map>> f10127b;

        static {
            HashMap<String, Class<? extends Collection>> hashMap = new HashMap<>();
            Class<ArrayList> cls = ArrayList.class;
            Class<HashSet> cls2 = HashSet.class;
            hashMap.put(Collection.class.getName(), cls);
            hashMap.put(List.class.getName(), cls);
            hashMap.put(Set.class.getName(), cls2);
            hashMap.put(SortedSet.class.getName(), TreeSet.class);
            hashMap.put(Queue.class.getName(), LinkedList.class);
            hashMap.put(AbstractList.class.getName(), cls);
            hashMap.put(AbstractSet.class.getName(), cls2);
            hashMap.put(Deque.class.getName(), LinkedList.class);
            hashMap.put(NavigableSet.class.getName(), TreeSet.class);
            f10126a = hashMap;
            HashMap<String, Class<? extends Map>> hashMap2 = new HashMap<>();
            Class<LinkedHashMap> cls3 = LinkedHashMap.class;
            hashMap2.put(Map.class.getName(), cls3);
            hashMap2.put(AbstractMap.class.getName(), cls3);
            hashMap2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            hashMap2.put(SortedMap.class.getName(), TreeMap.class);
            hashMap2.put(NavigableMap.class.getName(), TreeMap.class);
            hashMap2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            f10127b = hashMap2;
        }

        public static Class<?> a(j jVar) {
            return f10126a.get(jVar.g().getName());
        }

        public static Class<?> b(j jVar) {
            return f10127b.get(jVar.g().getName());
        }
    }

    public b(f fVar) {
        this.P = fVar;
    }

    public final void A(g gVar, c cVar, f0<?> f0Var, i5.b bVar, e eVar, List<m> list) throws l {
        int i10;
        Iterator<m> it = list.iterator();
        m mVar = null;
        m mVar2 = null;
        v[] vVarArr = null;
        while (true) {
            if (!it.hasNext()) {
                mVar = mVar2;
                break;
            }
            m next = it.next();
            if (f0Var.c(next)) {
                int C = next.C();
                v[] vVarArr2 = new v[C];
                int i11 = 0;
                while (true) {
                    if (i11 < C) {
                        q5.l A = next.A(i11);
                        y O = O(A, bVar);
                        if (O == null || O.i()) {
                            break;
                        }
                        vVarArr2[i11] = Y(gVar, cVar, O, A.u(), A, (d.a) null);
                        i11++;
                    } else if (mVar2 != null) {
                        break;
                    } else {
                        mVar2 = next;
                        vVarArr = vVarArr2;
                    }
                }
            }
        }
        if (mVar != null) {
            eVar.i(mVar, false, vVarArr);
            q qVar = (q) cVar;
            for (v vVar : vVarArr) {
                y a10 = vVar.a();
                if (!qVar.S(a10)) {
                    qVar.N(a6.y.V(gVar.q(), vVar.i(), a10));
                }
            }
        }
    }

    public y B(g gVar, c cVar) throws l {
        e eVar = new e(cVar, gVar.q());
        i5.b o10 = gVar.o();
        f0<?> F = gVar.q().F(cVar.x(), cVar.z());
        Map<m, s[]> D = D(gVar, cVar);
        v(gVar, cVar, F, o10, eVar, D);
        if (cVar.E().n()) {
            u(gVar, cVar, F, o10, eVar, D);
        }
        return eVar.k(gVar);
    }

    public final p C(g gVar, j jVar) throws l {
        i5.f T2 = gVar.q();
        Class<?> g10 = jVar.g();
        c P0 = T2.P0(jVar);
        p d02 = d0(gVar, P0.z());
        if (d02 != null) {
            return d02;
        }
        k<?> I = I(g10, T2, P0);
        if (I != null) {
            return c0.b(T2, jVar, I);
        }
        k<Object> c02 = c0(gVar, P0.z());
        if (c02 != null) {
            return c0.b(T2, jVar, c02);
        }
        a6.k Z = Z(g10, T2, P0.o());
        for (i next : P0.B()) {
            if (S(gVar, next)) {
                if (next.C() != 1 || !next.M().isAssignableFrom(g10)) {
                    throw new IllegalArgumentException("Unsuitable method (" + next + ") decorated with @JsonCreator (for Enum type " + g10.getName() + ")");
                } else if (next.E(0) == String.class) {
                    if (T2.c()) {
                        h.g(next.p(), gVar.w(i5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return c0.d(Z, next);
                }
            }
        }
        return c0.c(Z);
    }

    public Map<m, s[]> D(g gVar, c cVar) throws l {
        Map<m, s[]> emptyMap = Collections.emptyMap();
        for (s next : cVar.t()) {
            Iterator<q5.l> A = next.A();
            while (A.hasNext()) {
                q5.l next2 = A.next();
                m v10 = next2.v();
                s[] sVarArr = emptyMap.get(v10);
                int u10 = next2.u();
                if (sVarArr == null) {
                    if (emptyMap.isEmpty()) {
                        emptyMap = new LinkedHashMap<>();
                    }
                    sVarArr = new s[v10.C()];
                    emptyMap.put(v10, sVarArr);
                } else if (sVarArr[u10] != null) {
                    gVar.L0(cVar, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(u10), v10, sVarArr[u10], next);
                }
                sVarArr[u10] = next;
            }
        }
        return emptyMap;
    }

    public k<?> E(z5.a aVar, i5.f fVar, c cVar, u5.f fVar2, k<?> kVar) throws l {
        for (q a10 : this.P.c()) {
            k<?> a11 = a10.a(aVar, fVar, cVar, fVar2, kVar);
            if (a11 != null) {
                return a11;
            }
        }
        return null;
    }

    public k<Object> F(j jVar, i5.f fVar, c cVar) throws l {
        for (q f10 : this.P.c()) {
            k<?> f11 = f10.f(jVar, fVar, cVar);
            if (f11 != null) {
                return f11;
            }
        }
        return null;
    }

    public k<?> G(z5.e eVar, i5.f fVar, c cVar, u5.f fVar2, k<?> kVar) throws l {
        for (q b10 : this.P.c()) {
            k<?> b11 = b10.b(eVar, fVar, cVar, fVar2, kVar);
            if (b11 != null) {
                return b11;
            }
        }
        return null;
    }

    public k<?> H(z5.d dVar, i5.f fVar, c cVar, u5.f fVar2, k<?> kVar) throws l {
        for (q g10 : this.P.c()) {
            k<?> g11 = g10.g(dVar, fVar, cVar, fVar2, kVar);
            if (g11 != null) {
                return g11;
            }
        }
        return null;
    }

    public k<?> I(Class<?> cls, i5.f fVar, c cVar) throws l {
        for (q e10 : this.P.c()) {
            k<?> e11 = e10.e(cls, fVar, cVar);
            if (e11 != null) {
                return e11;
            }
        }
        return null;
    }

    public k<?> J(z5.g gVar, i5.f fVar, c cVar, p pVar, u5.f fVar2, k<?> kVar) throws l {
        for (q c10 : this.P.c()) {
            k<?> c11 = c10.c(gVar, fVar, cVar, pVar, fVar2, kVar);
            if (c11 != null) {
                return c11;
            }
        }
        return null;
    }

    public k<?> K(z5.f fVar, i5.f fVar2, c cVar, p pVar, u5.f fVar3, k<?> kVar) throws l {
        for (q d10 : this.P.c()) {
            k<?> d11 = d10.d(fVar, fVar2, cVar, pVar, fVar3, kVar);
            if (d11 != null) {
                return d11;
            }
        }
        return null;
    }

    public k<?> L(z5.i iVar, i5.f fVar, c cVar, u5.f fVar2, k<?> kVar) throws l {
        for (q i10 : this.P.c()) {
            k<?> i11 = i10.i(iVar, fVar, cVar, fVar2, kVar);
            if (i11 != null) {
                return i11;
            }
        }
        return null;
    }

    public k<?> M(Class<? extends i5.m> cls, i5.f fVar, c cVar) throws l {
        for (q h10 : this.P.c()) {
            k<?> h11 = h10.h(cls, fVar, cVar);
            if (h11 != null) {
                return h11;
            }
        }
        return null;
    }

    @Deprecated
    public i N(i5.f fVar, j jVar) {
        if (jVar == null) {
            return null;
        }
        return fVar.P0(jVar).p();
    }

    public final y O(q5.l lVar, i5.b bVar) {
        if (lVar == null || bVar == null) {
            return null;
        }
        y F = bVar.F(lVar);
        if (F != null) {
            return F;
        }
        String z10 = bVar.z(lVar);
        if (z10 == null || z10.isEmpty()) {
            return null;
        }
        return y.a(z10);
    }

    public j P(i5.f fVar, Class<?> cls) throws l {
        j o10 = o(fVar, fVar.h(cls));
        if (o10 == null || o10.j(cls)) {
            return null;
        }
        return o10;
    }

    public x Q(g gVar, i5.d dVar, x xVar) {
        k0 k0Var;
        c0.a m02;
        i5.b o10 = gVar.o();
        i5.f T2 = gVar.q();
        q5.h i10 = dVar.i();
        k0 k0Var2 = null;
        if (i10 != null) {
            if (o10 == null || (m02 = o10.m0(i10)) == null) {
                k0Var = null;
            } else {
                k0Var2 = m02.m();
                k0Var = m02.l();
            }
            c0.a h10 = T2.q(dVar.e().g()).h();
            if (h10 != null) {
                if (k0Var2 == null) {
                    k0Var2 = h10.m();
                }
                if (k0Var == null) {
                    k0Var = h10.l();
                }
            }
        } else {
            k0Var = null;
        }
        c0.a C = T2.C();
        if (k0Var2 == null) {
            k0Var2 = C.m();
        }
        if (k0Var == null) {
            k0Var = C.l();
        }
        return (k0Var2 == null && k0Var == null) ? xVar : xVar.r(k0Var2, k0Var);
    }

    public boolean R(e eVar, m mVar, boolean z10, boolean z11) {
        Class<?> E = mVar.E(0);
        if (E == String.class || E == S) {
            if (z10 || z11) {
                eVar.j(mVar, z10);
            }
            return true;
        } else if (E == Integer.TYPE || E == Integer.class) {
            if (z10 || z11) {
                eVar.g(mVar, z10);
            }
            return true;
        } else if (E == Long.TYPE || E == Long.class) {
            if (z10 || z11) {
                eVar.h(mVar, z10);
            }
            return true;
        } else if (E == Double.TYPE || E == Double.class) {
            if (z10 || z11) {
                eVar.f(mVar, z10);
            }
            return true;
        } else if (E == Boolean.TYPE || E == Boolean.class) {
            if (z10 || z11) {
                eVar.d(mVar, z10);
            }
            return true;
        } else if (!z10) {
            return false;
        } else {
            eVar.e(mVar, z10, (v[]) null, 0);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = r0.k(r3.q(), r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean S(i5.g r3, q5.a r4) {
        /*
            r2 = this;
            i5.b r0 = r3.o()
            r1 = 0
            if (r0 == 0) goto L_0x0016
            i5.f r3 = r3.q()
            v4.k$a r3 = r0.k(r3, r4)
            if (r3 == 0) goto L_0x0016
            v4.k$a r4 = v4.k.a.DISABLED
            if (r3 == r4) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.S(i5.g, q5.a):boolean");
    }

    public z5.e T(j jVar, i5.f fVar) {
        Class<?> a10 = C0174b.a(jVar);
        if (a10 != null) {
            return (z5.e) fVar.M().W(jVar, a10, true);
        }
        return null;
    }

    public z5.g U(j jVar, i5.f fVar) {
        Class<?> b10 = C0174b.b(jVar);
        if (b10 != null) {
            return (z5.g) fVar.M().W(jVar, b10, true);
        }
        return null;
    }

    public final j V(i5.f fVar, j jVar) throws l {
        Class<?> g10 = jVar.g();
        if (!this.P.d()) {
            return null;
        }
        for (i5.a a10 : this.P.a()) {
            j a11 = a10.a(fVar, jVar);
            if (a11 != null && !a11.j(g10)) {
                return a11;
            }
        }
        return null;
    }

    public void W(g gVar, c cVar, q5.l lVar) throws l {
        gVar.z(cVar.E(), String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", new Object[]{Integer.valueOf(lVar.u())}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r4 = r0.k(r3, r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l5.y X(i5.f r3, q5.a r4, java.lang.Object r5) throws i5.l {
        /*
            r2 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof l5.y
            if (r1 == 0) goto L_0x000b
            l5.y r5 = (l5.y) r5
            return r5
        L_0x000b:
            boolean r1 = r5 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0058
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r1 = a6.h.R(r5)
            if (r1 == 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.Class<l5.y> r0 = l5.y.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L_0x0038
            k5.g r0 = r3.G()
            if (r0 == 0) goto L_0x002d
            l5.y r4 = r0.k(r3, r4, r5)
            if (r4 == 0) goto L_0x002d
            return r4
        L_0x002d:
            boolean r3 = r3.c()
            java.lang.Object r3 = a6.h.l(r5, r3)
            l5.y r3 = (l5.y) r3
            return r3
        L_0x0038:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            r4.append(r0)
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            java.lang.String r5 = "; expected Class<ValueInstantiator>"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0058:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "AnnotationIntrospector returned key deserializer definition of type "
            r4.append(r0)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            java.lang.String r5 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.X(i5.f, q5.a, java.lang.Object):l5.y");
    }

    public v Y(g gVar, c cVar, y yVar, int i10, q5.l lVar, d.a aVar) throws l {
        g gVar2 = gVar;
        q5.l lVar2 = lVar;
        i5.f T2 = gVar.q();
        i5.b o10 = gVar.o();
        x a10 = o10 == null ? x.Y : x.a(o10.C0(lVar2), o10.T(lVar2), o10.W(lVar2), o10.S(lVar2));
        j j02 = j0(gVar, lVar2, lVar.h());
        d.b bVar = new d.b(yVar, j02, o10.t0(lVar2), lVar, a10);
        u5.f fVar = (u5.f) j02.R();
        if (fVar == null) {
            fVar = l(T2, j02);
        }
        k Y = k.Y(yVar, j02, bVar.o(), fVar, cVar.y(), lVar, i10, aVar, Q(gVar, bVar, a10));
        k<Object> c02 = c0(gVar, lVar2);
        if (c02 == null) {
            c02 = (k) j02.S();
        }
        return c02 != null ? Y.V(gVar.e0(c02, Y, j02)) : Y;
    }

    public a6.k Z(Class<?> cls, i5.f fVar, q5.h hVar) {
        if (hVar == null) {
            return a6.k.c(cls, fVar.m());
        }
        if (fVar.c()) {
            h.g(hVar.p(), fVar.T(i5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return a6.k.d(cls, hVar, fVar.m());
    }

    public k<?> a(g gVar, z5.a aVar, c cVar) throws l {
        i5.f T2 = gVar.q();
        j G = aVar.d();
        k kVar = (k) G.S();
        u5.f fVar = (u5.f) G.R();
        if (fVar == null) {
            fVar = l(T2, G);
        }
        u5.f fVar2 = fVar;
        k<?> E = E(aVar, T2, cVar, fVar2, kVar);
        if (E == null) {
            if (kVar == null) {
                Class<?> g10 = G.g();
                if (G.u()) {
                    return w.H0(g10);
                }
                if (g10 == String.class) {
                    return g0.Z;
                }
            }
            E = new v(aVar, kVar, fVar2);
        }
        if (this.P.e()) {
            for (g a10 : this.P.b()) {
                E = a10.a(T2, aVar, cVar, E);
            }
        }
        return E;
    }

    public k<Object> a0(g gVar, q5.a aVar) throws l {
        Object i10;
        i5.b o10 = gVar.o();
        if (o10 == null || (i10 = o10.i(aVar)) == null) {
            return null;
        }
        return gVar.I(aVar, i10);
    }

    public k<?> b0(g gVar, j jVar, c cVar) throws l {
        j jVar2;
        j jVar3;
        Class<?> g10 = jVar.g();
        if (g10 == Q || g10 == V) {
            i5.f T2 = gVar.q();
            if (this.P.d()) {
                jVar2 = P(T2, List.class);
                jVar3 = P(T2, Map.class);
            } else {
                jVar2 = null;
                jVar3 = null;
            }
            return new m0(jVar2, jVar3);
        } else if (g10 == R || g10 == S) {
            return i0.V;
        } else {
            Class<?> cls = T;
            if (g10 == cls) {
                n u10 = gVar.u();
                j[] e02 = u10.e0(jVar, cls);
                return d(gVar, u10.C(Collection.class, (e02 == null || e02.length != 1) ? n.l0() : e02[0]), cVar);
            } else if (g10 == U) {
                j B = jVar.B(0);
                j B2 = jVar.B(1);
                u5.f fVar = (u5.f) B2.R();
                if (fVar == null) {
                    fVar = l(gVar.q(), B2);
                }
                return new n5.s(jVar, (p) B.S(), (k<Object>) (k) B2.S(), fVar);
            } else {
                String name = g10.getName();
                if (g10.isPrimitive() || name.startsWith("java.")) {
                    k<?> a10 = u.a(g10, name);
                    if (a10 == null) {
                        a10 = n5.h.a(g10, name);
                    }
                    if (a10 != null) {
                        return a10;
                    }
                }
                if (g10 == b0.class) {
                    return new n5.k0();
                }
                k<?> e03 = e0(gVar, jVar, cVar);
                return e03 != null ? e03 : o.a(g10, name);
            }
        }
    }

    public k<Object> c0(g gVar, q5.a aVar) throws l {
        Object s10;
        i5.b o10 = gVar.o();
        if (o10 == null || (s10 = o10.s(aVar)) == null) {
            return null;
        }
        return gVar.I(aVar, s10);
    }

    public k<?> d(g gVar, z5.e eVar, c cVar) throws l {
        j G = eVar.d();
        k kVar = (k) G.S();
        i5.f T2 = gVar.q();
        u5.f fVar = (u5.f) G.R();
        if (fVar == null) {
            fVar = l(T2, G);
        }
        u5.f fVar2 = fVar;
        k<?> G2 = G(eVar, T2, cVar, fVar2, kVar);
        if (G2 == null) {
            Class<?> g10 = eVar.g();
            if (kVar == null && EnumSet.class.isAssignableFrom(g10)) {
                G2 = new n5.l(G, (k<?>) null);
            }
        }
        if (G2 == null) {
            if (eVar.s() || eVar.k()) {
                z5.e T3 = T(eVar, T2);
                if (T3 != null) {
                    cVar = T2.R0(T3);
                    eVar = T3;
                } else if (eVar.R() != null) {
                    G2 = a.y(cVar);
                } else {
                    throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + eVar);
                }
            }
            if (G2 == null) {
                y m10 = m(gVar, cVar);
                if (!m10.i()) {
                    if (eVar.j(ArrayBlockingQueue.class)) {
                        return new n5.a(eVar, kVar, fVar2, m10);
                    }
                    k<?> b10 = m5.l.b(gVar, eVar);
                    if (b10 != null) {
                        return b10;
                    }
                }
                G2 = G.j(String.class) ? new h0(eVar, kVar, m10) : new n5.f(eVar, kVar, fVar2, m10);
            }
        }
        if (this.P.e()) {
            for (g b11 : this.P.b()) {
                G2 = b11.b(T2, eVar, cVar, G2);
            }
        }
        return G2;
    }

    public p d0(g gVar, q5.a aVar) throws l {
        Object C;
        i5.b o10 = gVar.o();
        if (o10 == null || (C = o10.C(aVar)) == null) {
            return null;
        }
        return gVar.w0(aVar, C);
    }

    public k<?> e(g gVar, z5.d dVar, c cVar) throws l {
        j G = dVar.d();
        k kVar = (k) G.S();
        i5.f T2 = gVar.q();
        u5.f fVar = (u5.f) G.R();
        k<?> H = H(dVar, T2, cVar, fVar == null ? l(T2, G) : fVar, kVar);
        if (H != null && this.P.e()) {
            for (g c10 : this.P.b()) {
                H = c10.c(T2, dVar, cVar, H);
            }
        }
        return H;
    }

    public k<?> e0(g gVar, j jVar, c cVar) throws l {
        return p5.k.Y.a(jVar, gVar.q(), cVar);
    }

    public k<?> f(g gVar, j jVar, c cVar) throws l {
        i5.f T2 = gVar.q();
        Class<?> g10 = jVar.g();
        k<?> I = I(g10, T2, cVar);
        if (I == null) {
            if (g10 == Enum.class) {
                return a.y(cVar);
            }
            y B = B(gVar, cVar);
            v[] A = B == null ? null : B.A(gVar.q());
            Iterator<i> it = cVar.B().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i next = it.next();
                if (S(gVar, next)) {
                    if (next.C() == 0) {
                        I = n5.j.K0(T2, g10, next);
                    } else {
                        if (!next.M().isAssignableFrom(g10)) {
                            gVar.z(jVar, String.format("Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type", new Object[]{next.toString()}));
                        }
                        I = n5.j.J0(T2, g10, next, B, A);
                    }
                }
            }
            if (I == null) {
                I = new n5.j(Z(g10, T2, cVar.o()), Boolean.valueOf(T2.T(i5.q.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this.P.e()) {
            for (g e10 : this.P.b()) {
                I = e10.e(T2, jVar, cVar, I);
            }
        }
        return I;
    }

    public u5.f f0(i5.f fVar, j jVar, q5.h hVar) throws l {
        u5.h<?> R2 = fVar.m().R(fVar, hVar, jVar);
        j G = jVar.d();
        return R2 == null ? l(fVar, G) : R2.c(fVar, G, fVar.K().f(fVar, hVar, G));
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001b A[LOOP:0: B:3:0x001b->B:6:0x002b, LOOP_START, PHI: r2 
      PHI: (r2v9 i5.p) = (r2v0 i5.p), (r2v12 i5.p) binds: [B:2:0x000d, B:6:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.p g(i5.g r6, i5.j r7) throws i5.l {
        /*
            r5 = this;
            i5.f r0 = r6.q()
            k5.f r1 = r5.P
            boolean r1 = r1.g()
            r2 = 0
            if (r1 == 0) goto L_0x002e
            i5.c r1 = r0.O(r7)
            k5.f r3 = r5.P
            java.lang.Iterable r3 = r3.i()
            java.util.Iterator r3 = r3.iterator()
        L_0x001b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r2 = r3.next()
            l5.r r2 = (l5.r) r2
            i5.p r2 = r2.a(r7, r0, r1)
            if (r2 == 0) goto L_0x001b
            goto L_0x002f
        L_0x002e:
            r1 = r2
        L_0x002f:
            if (r2 != 0) goto L_0x0054
            if (r1 != 0) goto L_0x003b
            java.lang.Class r1 = r7.g()
            i5.c r1 = r0.P(r1)
        L_0x003b:
            q5.b r1 = r1.z()
            i5.p r2 = r5.d0(r6, r1)
            if (r2 != 0) goto L_0x0054
            boolean r1 = r7.p()
            if (r1 == 0) goto L_0x0050
            i5.p r2 = r5.C(r6, r7)
            goto L_0x0054
        L_0x0050:
            i5.p r2 = n5.c0.e(r0, r7)
        L_0x0054:
            if (r2 == 0) goto L_0x0079
            k5.f r6 = r5.P
            boolean r6 = r6.e()
            if (r6 == 0) goto L_0x0079
            k5.f r6 = r5.P
            java.lang.Iterable r6 = r6.b()
            java.util.Iterator r6 = r6.iterator()
        L_0x0068:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r6.next()
            l5.g r1 = (l5.g) r1
            i5.p r2 = r1.f(r0, r7, r2)
            goto L_0x0068
        L_0x0079:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.g(i5.g, i5.j):i5.p");
    }

    public u5.f g0(i5.f fVar, j jVar, q5.h hVar) throws l {
        u5.h<?> X = fVar.m().X(fVar, hVar, jVar);
        if (X == null) {
            return l(fVar, jVar);
        }
        try {
            return X.c(fVar, jVar, fVar.K().f(fVar, hVar, jVar));
        } catch (IllegalArgumentException e10) {
            o5.b C = o5.b.C((w4.l) null, h.o(e10), jVar);
            C.initCause(e10);
            throw C;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: i5.k<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: i5.k<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: i5.k<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: n5.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: n5.r} */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.k<?> h(i5.g r20, z5.g r21, i5.c r22) throws i5.l {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            i5.f r10 = r20.q()
            i5.j r11 = r21.e()
            i5.j r0 = r21.d()
            java.lang.Object r1 = r0.S()
            r16 = r1
            i5.k r16 = (i5.k) r16
            java.lang.Object r1 = r11.S()
            r15 = r1
            i5.p r15 = (i5.p) r15
            java.lang.Object r1 = r0.R()
            u5.f r1 = (u5.f) r1
            if (r1 != 0) goto L_0x0030
            u5.f r0 = r7.l(r10, r0)
            r17 = r0
            goto L_0x0032
        L_0x0030:
            r17 = r1
        L_0x0032:
            r0 = r19
            r1 = r21
            r2 = r10
            r3 = r22
            r4 = r15
            r5 = r17
            r6 = r16
            i5.k r0 = r0.J(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00f2
            java.lang.Class r1 = r21.g()
            java.lang.Class<java.util.EnumMap> r2 = java.util.EnumMap.class
            boolean r2 = r2.isAssignableFrom(r1)
            r18 = 0
            if (r2 == 0) goto L_0x007d
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            r12 = r22
            if (r1 != r0) goto L_0x005b
            r2 = r18
            goto L_0x0060
        L_0x005b:
            l5.y r0 = r7.m(r8, r12)
            r2 = r0
        L_0x0060:
            boolean r0 = r11.W()
            if (r0 == 0) goto L_0x0075
            n5.k r11 = new n5.k
            r3 = 0
            r6 = 0
            r0 = r11
            r1 = r21
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x007f
        L_0x0075:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot construct EnumMap; generic (key) type not available"
            r0.<init>(r1)
            throw r0
        L_0x007d:
            r12 = r22
        L_0x007f:
            if (r0 != 0) goto L_0x00f4
            boolean r1 = r21.s()
            if (r1 != 0) goto L_0x0099
            boolean r1 = r21.k()
            if (r1 == 0) goto L_0x008e
            goto L_0x0099
        L_0x008e:
            i5.k r0 = m5.l.c(r20, r21)
            if (r0 == 0) goto L_0x0095
            return r0
        L_0x0095:
            r2 = r0
            r1 = r9
        L_0x0097:
            r0 = r12
            goto L_0x00b5
        L_0x0099:
            z5.g r1 = r7.U(r9, r10)
            if (r1 == 0) goto L_0x00a8
            r1.g()
            i5.c r2 = r10.R0(r1)
            r12 = r2
            goto L_0x00b3
        L_0x00a8:
            java.lang.Object r0 = r21.R()
            if (r0 == 0) goto L_0x00db
            l5.a r0 = l5.a.y(r22)
            r1 = r9
        L_0x00b3:
            r2 = r0
            goto L_0x0097
        L_0x00b5:
            if (r2 != 0) goto L_0x00d8
            l5.y r14 = r7.m(r8, r0)
            n5.r r2 = new n5.r
            r12 = r2
            r13 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            q5.b r4 = r0.z()
            v4.s$a r3 = r10.y(r3, r4)
            if (r3 != 0) goto L_0x00cf
            goto L_0x00d3
        L_0x00cf:
            java.util.Set r18 = r3.h()
        L_0x00d3:
            r3 = r18
            r2.R0(r3)
        L_0x00d8:
            r12 = r0
            r0 = r2
            goto L_0x00f5
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find a deserializer for non-concrete Map type "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            r12 = r22
        L_0x00f4:
            r1 = r9
        L_0x00f5:
            k5.f r2 = r7.P
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0118
            k5.f r2 = r7.P
            java.lang.Iterable r2 = r2.b()
            java.util.Iterator r2 = r2.iterator()
        L_0x0107:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0118
            java.lang.Object r3 = r2.next()
            l5.g r3 = (l5.g) r3
            i5.k r0 = r3.g(r10, r1, r12, r0)
            goto L_0x0107
        L_0x0118:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.h(i5.g, z5.g, i5.c):i5.k");
    }

    public f h0() {
        return this.P;
    }

    public k<?> i(g gVar, z5.f fVar, c cVar) throws l {
        j O = fVar.e();
        j G = fVar.d();
        i5.f T2 = gVar.q();
        k kVar = (k) G.S();
        p pVar = (p) O.S();
        u5.f fVar2 = (u5.f) G.R();
        if (fVar2 == null) {
            fVar2 = l(T2, G);
        }
        k<?> K = K(fVar, T2, cVar, pVar, fVar2, kVar);
        if (K != null && this.P.e()) {
            for (g h10 : this.P.b()) {
                K = h10.h(T2, fVar, cVar, K);
            }
        }
        return K;
    }

    @Deprecated
    public j i0(g gVar, q5.a aVar, j jVar) throws l {
        i5.b o10 = gVar.o();
        return o10 == null ? jVar : o10.I0(gVar.q(), aVar, jVar);
    }

    public k<?> j(g gVar, z5.i iVar, c cVar) throws l {
        j G = iVar.d();
        k kVar = (k) G.S();
        i5.f T2 = gVar.q();
        u5.f fVar = (u5.f) G.R();
        if (fVar == null) {
            fVar = l(T2, G);
        }
        u5.f fVar2 = fVar;
        k<?> L = L(iVar, T2, cVar, fVar2, kVar);
        if (L != null || !iVar.Y(AtomicReference.class)) {
            if (L != null && this.P.e()) {
                for (g i10 : this.P.b()) {
                    L = i10.i(T2, iVar, cVar, L);
                }
            }
            return L;
        }
        return new n5.c(iVar, iVar.g() == AtomicReference.class ? null : m(gVar, cVar), fVar2, kVar);
    }

    public j j0(g gVar, q5.h hVar, j jVar) throws l {
        p w02;
        i5.b o10 = gVar.o();
        if (o10 == null) {
            return jVar;
        }
        if (!(!jVar.t() || jVar.e() == null || (w02 = gVar.w0(hVar, o10.C(hVar))) == null)) {
            jVar = ((z5.f) jVar).t0(w02);
            jVar.e();
        }
        if (jVar.T()) {
            k<Object> I = gVar.I(hVar, o10.i(hVar));
            if (I != null) {
                jVar = jVar.e0(I);
            }
            u5.f f02 = f0(gVar.q(), jVar, hVar);
            if (f02 != null) {
                jVar = jVar.d0(f02);
            }
        }
        u5.f g02 = g0(gVar.q(), jVar, hVar);
        if (g02 != null) {
            jVar = jVar.h0(g02);
        }
        return o10.I0(gVar.q(), hVar, jVar);
    }

    public k<?> k(i5.f fVar, j jVar, c cVar) throws l {
        Class<?> g10 = jVar.g();
        k<?> M = M(g10, fVar, cVar);
        return M != null ? M : n5.q.P0(g10);
    }

    @Deprecated
    public j k0(g gVar, c cVar, j jVar, q5.h hVar) throws l {
        return j0(gVar, hVar, jVar);
    }

    public u5.f l(i5.f fVar, j jVar) throws l {
        Collection<u5.c> collection;
        j o10;
        q5.b z10 = fVar.P(jVar.g()).z();
        u5.h p02 = fVar.m().p0(fVar, z10, jVar);
        if (p02 == null) {
            p02 = fVar.D(jVar);
            if (p02 == null) {
                return null;
            }
            collection = null;
        } else {
            collection = fVar.K().e(fVar, z10);
        }
        if (p02.g() == null && jVar.k() && (o10 = o(fVar, jVar)) != null && !o10.j(jVar.g())) {
            p02 = p02.d(o10.g());
        }
        try {
            return p02.c(fVar, jVar, collection);
        } catch (IllegalArgumentException e10) {
            o5.b C = o5.b.C((w4.l) null, h.o(e10), jVar);
            C.initCause(e10);
            throw C;
        }
    }

    public abstract p l0(f fVar);

    public y m(g gVar, c cVar) throws l {
        i5.f T2 = gVar.q();
        q5.b z10 = cVar.z();
        Object r02 = gVar.o().r0(z10);
        y X = r02 != null ? X(T2, z10, r02) : null;
        if (X == null && (X = m5.k.a(T2, cVar.x())) == null) {
            X = B(gVar, cVar);
        }
        if (this.P.h()) {
            for (z next : this.P.j()) {
                X = next.a(T2, cVar, X);
                if (X == null) {
                    gVar.L0(cVar, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", next.getClass().getName());
                }
            }
        }
        if (X.B() == null) {
            return X;
        }
        q5.l B = X.B();
        m v10 = B.v();
        throw new IllegalArgumentException("Argument #" + B.u() + " of constructor " + v10 + " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
    }

    public boolean n(i5.f fVar, Class<?> cls) {
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return true;
        }
        String name = cls.getName();
        if (!name.startsWith("java.")) {
            return name.startsWith("com.fasterxml.") ? i5.m.class.isAssignableFrom(cls) || cls == b0.class : p5.k.Y.c(cls);
        }
        if (!Collection.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
            return Number.class.isAssignableFrom(cls) ? u.a(cls, name) != null : o.b(cls) || cls == R || cls == Boolean.class || cls == EnumMap.class || cls == AtomicReference.class || n5.h.b(cls);
        }
        return true;
    }

    public j o(i5.f fVar, j jVar) throws l {
        j V2;
        while (true) {
            V2 = V(fVar, jVar);
            if (V2 == null) {
                return jVar;
            }
            Class<?> g10 = jVar.g();
            Class<?> g11 = V2.g();
            if (g10 == g11 || !g10.isAssignableFrom(g11)) {
            } else {
                jVar = V2;
            }
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + jVar + " to " + V2 + ": latter is not a subtype of former");
    }

    public final p p(i5.a aVar) {
        return l0(this.P.k(aVar));
    }

    public final p q(q qVar) {
        return l0(this.P.l(qVar));
    }

    public final p r(r rVar) {
        return l0(this.P.m(rVar));
    }

    public final p s(g gVar) {
        return l0(this.P.n(gVar));
    }

    public final p t(z zVar) {
        return l0(this.P.o(zVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(i5.g r27, i5.c r28, q5.f0<?> r29, i5.b r30, m5.e r31, java.util.Map<q5.m, q5.s[]> r32) throws i5.l {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r0 = r32
            boolean r1 = r28.H()
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            q5.d r1 = r28.i()
            if (r1 == 0) goto L_0x002a
            boolean r2 = r31.l()
            if (r2 == 0) goto L_0x0027
            boolean r2 = r7.S(r8, r1)
            if (r2 == 0) goto L_0x002a
        L_0x0027:
            r12.o(r1)
        L_0x002a:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.List r2 = r28.A()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x0038:
            boolean r4 = r2.hasNext()
            r14 = 2
            r15 = 0
            r6 = 1
            if (r4 == 0) goto L_0x009c
            java.lang.Object r4 = r2.next()
            q5.d r4 = (q5.d) r4
            i5.f r5 = r27.q()
            v4.k$a r5 = r11.k(r5, r4)
            v4.k$a r13 = v4.k.a.DISABLED
            if (r13 != r5) goto L_0x0054
            goto L_0x0038
        L_0x0054:
            if (r5 != 0) goto L_0x006a
            boolean r5 = r10.c(r4)
            if (r5 == 0) goto L_0x0038
            java.lang.Object r5 = r0.get(r4)
            q5.s[] r5 = (q5.s[]) r5
            m5.d r4 = m5.d.a(r11, r4, r5)
            r1.add(r4)
            goto L_0x0038
        L_0x006a:
            int[] r13 = l5.b.a.f10125a
            int r5 = r5.ordinal()
            r5 = r13[r5]
            if (r5 == r6) goto L_0x0092
            if (r5 == r14) goto L_0x0084
            java.lang.Object r5 = r0.get(r4)
            q5.s[] r5 = (q5.s[]) r5
            m5.d r4 = m5.d.a(r11, r4, r5)
            r7.w(r8, r9, r12, r4)
            goto L_0x0099
        L_0x0084:
            java.lang.Object r5 = r0.get(r4)
            q5.s[] r5 = (q5.s[]) r5
            m5.d r4 = m5.d.a(r11, r4, r5)
            r7.y(r8, r9, r12, r4)
            goto L_0x0099
        L_0x0092:
            m5.d r4 = m5.d.a(r11, r4, r15)
            r7.x(r8, r9, r12, r4)
        L_0x0099:
            int r3 = r3 + 1
            goto L_0x0038
        L_0x009c:
            if (r3 <= 0) goto L_0x009f
            return
        L_0x009f:
            java.util.Iterator r13 = r1.iterator()
            r17 = r15
        L_0x00a5:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0202
            java.lang.Object r0 = r13.next()
            r5 = r0
            m5.d r5 = (m5.d) r5
            int r4 = r5.g()
            q5.m r3 = r5.b()
            if (r4 != r6) goto L_0x010b
            r2 = 0
            q5.s r0 = r5.j(r2)
            boolean r1 = r7.z(r11, r3, r0)
            if (r1 == 0) goto L_0x00f5
            l5.v[] r4 = new l5.v[r6]
            i5.y r16 = r5.h(r2)
            r18 = 0
            q5.l r19 = r5.i(r2)
            v4.d$a r20 = r5.f(r2)
            r0 = r26
            r1 = r27
            r5 = r2
            r2 = r28
            r15 = r3
            r3 = r16
            r14 = r4
            r4 = r18
            r5 = r19
            r18 = r6
            r6 = r20
            l5.v r0 = r0.Y(r1, r2, r3, r4, r5, r6)
            r1 = 0
            r14[r1] = r0
            r12.i(r15, r1, r14)
            goto L_0x0107
        L_0x00f5:
            r1 = r2
            r15 = r3
            r18 = r6
            boolean r2 = r10.c(r15)
            r7.R(r12, r15, r1, r2)
            if (r0 == 0) goto L_0x0107
            q5.b0 r0 = (q5.b0) r0
            r0.E0()
        L_0x0107:
            r24 = r13
            goto L_0x01bc
        L_0x010b:
            r15 = r3
            r18 = r6
            r0 = -1
            l5.v[] r14 = new l5.v[r4]
            r6 = r0
            r3 = 0
            r19 = 0
            r20 = 0
        L_0x0117:
            if (r3 >= r4) goto L_0x0199
            q5.l r2 = r15.A(r3)
            q5.s r0 = r5.j(r3)
            v4.d$a r21 = r11.A(r2)
            if (r0 != 0) goto L_0x012a
            r22 = 0
            goto L_0x0130
        L_0x012a:
            i5.y r1 = r0.a()
            r22 = r1
        L_0x0130:
            if (r0 == 0) goto L_0x015a
            boolean r0 = r0.Q()
            if (r0 == 0) goto L_0x015a
            int r19 = r19 + 1
            r0 = r26
            r1 = r27
            r32 = r2
            r2 = r28
            r23 = r3
            r3 = r22
            r10 = r4
            r4 = r23
            r24 = r13
            r13 = r5
            r5 = r32
            r25 = r13
            r13 = r6
            r6 = r21
            l5.v r0 = r0.Y(r1, r2, r3, r4, r5, r6)
            r14[r23] = r0
            goto L_0x017c
        L_0x015a:
            r32 = r2
            r23 = r3
            r10 = r4
            r25 = r5
            r24 = r13
            r13 = r6
            if (r21 == 0) goto L_0x017e
            int r20 = r20 + 1
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r22
            r4 = r23
            r5 = r32
            r6 = r21
            l5.v r0 = r0.Y(r1, r2, r3, r4, r5, r6)
            r14[r23] = r0
        L_0x017c:
            r6 = r13
            goto L_0x018e
        L_0x017e:
            r0 = r32
            a6.s r1 = r11.q0(r0)
            if (r1 == 0) goto L_0x018a
            r7.W(r8, r9, r0)
            goto L_0x017c
        L_0x018a:
            if (r13 >= 0) goto L_0x017c
            r6 = r23
        L_0x018e:
            int r3 = r23 + 1
            r4 = r10
            r13 = r24
            r5 = r25
            r10 = r29
            goto L_0x0117
        L_0x0199:
            r10 = r4
            r25 = r5
            r24 = r13
            r13 = r6
            int r0 = r19 + 0
            if (r19 > 0) goto L_0x01a9
            if (r20 <= 0) goto L_0x01a6
            goto L_0x01a9
        L_0x01a6:
            r0 = 2
            r3 = 0
            goto L_0x01e5
        L_0x01a9:
            int r0 = r0 + r20
            if (r0 != r10) goto L_0x01b2
            r0 = 0
            r12.i(r15, r0, r14)
            goto L_0x01bc
        L_0x01b2:
            r0 = 0
            if (r19 != 0) goto L_0x01c6
            int r1 = r20 + 1
            if (r1 != r10) goto L_0x01c6
            r12.e(r15, r0, r14, r0)
        L_0x01bc:
            r10 = r29
            r6 = r18
            r13 = r24
            r14 = 2
        L_0x01c3:
            r15 = 0
            goto L_0x00a5
        L_0x01c6:
            r0 = r25
            i5.y r0 = r0.d(r13)
            if (r0 == 0) goto L_0x01d4
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x01a6
        L_0x01d4:
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r3 = 0
            r1[r3] = r2
            r1[r18] = r15
            java.lang.String r2 = "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.L0(r9, r2, r1)
        L_0x01e5:
            boolean r1 = r31.l()
            if (r1 != 0) goto L_0x01fa
            if (r17 != 0) goto L_0x01f3
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            goto L_0x01f5
        L_0x01f3:
            r1 = r17
        L_0x01f5:
            r1.add(r15)
            r17 = r1
        L_0x01fa:
            r10 = r29
            r14 = r0
            r6 = r18
            r13 = r24
            goto L_0x01c3
        L_0x0202:
            if (r17 == 0) goto L_0x0221
            boolean r0 = r31.m()
            if (r0 != 0) goto L_0x0221
            boolean r0 = r31.n()
            if (r0 != 0) goto L_0x0221
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r17
            r0.A(r1, r2, r3, r4, r5, r6)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.u(i5.g, i5.c, q5.f0, i5.b, m5.e, java.util.Map):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: q5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: q5.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: q5.s[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: q5.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: q5.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: q5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: q5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: q5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: i5.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: q5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: q5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: q5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: q5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: i5.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: q5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: q5.s} */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(i5.g r27, i5.c r28, q5.f0<?> r29, i5.b r30, m5.e r31, java.util.Map<q5.m, q5.s[]> r32) throws i5.l {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.List r1 = r28.B()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x001c:
            boolean r3 = r1.hasNext()
            r15 = 2
            r6 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0087
            java.lang.Object r3 = r1.next()
            q5.i r3 = (q5.i) r3
            i5.f r4 = r27.q()
            v4.k$a r4 = r11.k(r4, r3)
            int r14 = r3.C()
            if (r4 != 0) goto L_0x0049
            if (r14 != r5) goto L_0x001c
            boolean r4 = r10.c(r3)
            if (r4 == 0) goto L_0x001c
            m5.d r3 = m5.d.a(r11, r3, r6)
            r0.add(r3)
            goto L_0x001c
        L_0x0049:
            v4.k$a r6 = v4.k.a.DISABLED
            if (r4 != r6) goto L_0x004e
            goto L_0x001c
        L_0x004e:
            if (r14 != 0) goto L_0x0054
            r12.o(r3)
            goto L_0x001c
        L_0x0054:
            int[] r6 = l5.b.a.f10125a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r5) goto L_0x007c
            if (r4 == r15) goto L_0x006e
            java.lang.Object r4 = r13.get(r3)
            q5.s[] r4 = (q5.s[]) r4
            m5.d r3 = m5.d.a(r11, r3, r4)
            r7.w(r8, r9, r12, r3)
            goto L_0x0084
        L_0x006e:
            java.lang.Object r4 = r13.get(r3)
            q5.s[] r4 = (q5.s[]) r4
            m5.d r3 = m5.d.a(r11, r3, r4)
            r7.y(r8, r9, r12, r3)
            goto L_0x0084
        L_0x007c:
            r6 = 0
            m5.d r3 = m5.d.a(r11, r3, r6)
            r7.x(r8, r9, r12, r3)
        L_0x0084:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0087:
            if (r2 <= 0) goto L_0x008a
            return
        L_0x008a:
            java.util.Iterator r14 = r0.iterator()
        L_0x008e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x019c
            java.lang.Object r0 = r14.next()
            m5.d r0 = (m5.d) r0
            int r4 = r0.g()
            q5.m r3 = r0.b()
            java.lang.Object r1 = r13.get(r3)
            r16 = r1
            q5.s[] r16 = (q5.s[]) r16
            if (r4 == r5) goto L_0x00ad
            goto L_0x008e
        L_0x00ad:
            r1 = 0
            q5.s r0 = r0.j(r1)
            boolean r2 = r7.z(r11, r3, r0)
            if (r2 != 0) goto L_0x00c7
            boolean r2 = r10.c(r3)
            r7.R(r12, r3, r1, r2)
            if (r0 == 0) goto L_0x008e
            q5.b0 r0 = (q5.b0) r0
            r0.E0()
            goto L_0x008e
        L_0x00c7:
            l5.v[] r2 = new l5.v[r4]
            r19 = r6
            r1 = 0
            r17 = 0
            r18 = 0
        L_0x00d0:
            if (r1 >= r4) goto L_0x0158
            q5.l r0 = r3.A(r1)
            if (r16 != 0) goto L_0x00db
            r20 = r6
            goto L_0x00dd
        L_0x00db:
            r20 = r16[r1]
        L_0x00dd:
            v4.d$a r21 = r11.A(r0)
            if (r20 != 0) goto L_0x00e6
            r22 = r6
            goto L_0x00ea
        L_0x00e6:
            i5.y r22 = r20.a()
        L_0x00ea:
            if (r20 == 0) goto L_0x0114
            boolean r20 = r20.Q()
            if (r20 == 0) goto L_0x0114
            int r17 = r17 + 1
            r20 = r0
            r0 = r26
            r23 = r1
            r1 = r27
            r15 = r2
            r2 = r28
            r10 = r3
            r3 = r22
            r13 = r4
            r4 = r23
            r24 = r5
            r5 = r20
            r25 = r6
            r6 = r21
            l5.v r0 = r0.Y(r1, r2, r3, r4, r5, r6)
            r15[r23] = r0
            goto L_0x0148
        L_0x0114:
            r20 = r0
            r23 = r1
            r15 = r2
            r10 = r3
            r13 = r4
            r24 = r5
            r25 = r6
            if (r21 == 0) goto L_0x0138
            int r18 = r18 + 1
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r22
            r4 = r23
            r5 = r20
            r6 = r21
            l5.v r0 = r0.Y(r1, r2, r3, r4, r5, r6)
            r15[r23] = r0
            goto L_0x0148
        L_0x0138:
            r0 = r20
            a6.s r1 = r11.q0(r0)
            if (r1 == 0) goto L_0x0144
            r7.W(r8, r9, r0)
            goto L_0x0148
        L_0x0144:
            if (r19 != 0) goto L_0x0148
            r19 = r0
        L_0x0148:
            int r1 = r23 + 1
            r3 = r10
            r4 = r13
            r2 = r15
            r5 = r24
            r6 = r25
            r15 = 2
            r10 = r29
            r13 = r32
            goto L_0x00d0
        L_0x0158:
            r15 = r2
            r10 = r3
            r13 = r4
            r24 = r5
            r25 = r6
            int r0 = r17 + 0
            if (r17 > 0) goto L_0x0169
            if (r18 <= 0) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r0 = 0
        L_0x0167:
            r1 = 2
            goto L_0x0191
        L_0x0169:
            int r0 = r0 + r18
            if (r0 != r13) goto L_0x0172
            r0 = 0
            r12.i(r10, r0, r15)
            goto L_0x0167
        L_0x0172:
            r0 = 0
            if (r17 != 0) goto L_0x017d
            int r1 = r18 + 1
            if (r1 != r13) goto L_0x017d
            r12.e(r10, r0, r15, r0)
            goto L_0x0167
        L_0x017d:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r19.u()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            r2[r24] = r10
            java.lang.String r3 = "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator"
            r8.L0(r9, r3, r2)
        L_0x0191:
            r10 = r29
            r13 = r32
            r15 = r1
            r5 = r24
            r6 = r25
            goto L_0x008e
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.v(i5.g, i5.c, q5.f0, i5.b, m5.e, java.util.Map):void");
    }

    public void w(g gVar, c cVar, e eVar, m5.d dVar) throws l {
        if (1 != dVar.g()) {
            int e10 = dVar.e();
            if (e10 < 0 || dVar.h(e10) != null) {
                y(gVar, cVar, eVar, dVar);
            } else {
                x(gVar, cVar, eVar, dVar);
            }
        } else {
            q5.l i10 = dVar.i(0);
            d.a f10 = dVar.f(0);
            y c10 = dVar.c(0);
            s j10 = dVar.j(0);
            boolean z10 = (c10 == null && f10 == null) ? false : true;
            if (!z10 && j10 != null) {
                c10 = dVar.h(0);
                z10 = c10 != null && j10.s();
            }
            y yVar = c10;
            if (z10) {
                eVar.i(dVar.b(), true, new v[]{Y(gVar, cVar, yVar, 0, i10, f10)});
                return;
            }
            R(eVar, dVar.b(), true, true);
            if (j10 != null) {
                ((q5.b0) j10).E0();
            }
        }
    }

    public void x(g gVar, c cVar, e eVar, m5.d dVar) throws l {
        g gVar2 = gVar;
        c cVar2 = cVar;
        e eVar2 = eVar;
        m5.d dVar2 = dVar;
        int g10 = dVar.g();
        v[] vVarArr = new v[g10];
        int i10 = -1;
        for (int i11 = 0; i11 < g10; i11++) {
            q5.l i12 = dVar2.i(i11);
            d.a f10 = dVar2.f(i11);
            if (f10 != null) {
                vVarArr[i11] = Y(gVar, cVar, (y) null, i11, i12, f10);
            } else if (i10 < 0) {
                i10 = i11;
            } else {
                gVar2.L0(cVar2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i10), Integer.valueOf(i11), dVar2);
            }
        }
        if (i10 < 0) {
            gVar2.L0(cVar2, "No argument left as delegating for Creator %s: exactly one required", dVar2);
        }
        if (g10 == 1) {
            R(eVar2, dVar.b(), true, true);
            s j10 = dVar2.j(0);
            if (j10 != null) {
                ((q5.b0) j10).E0();
                return;
            }
            return;
        }
        eVar2.e(dVar.b(), true, vVarArr, i10);
    }

    public void y(g gVar, c cVar, e eVar, m5.d dVar) throws l {
        int g10 = dVar.g();
        v[] vVarArr = new v[g10];
        for (int i10 = 0; i10 < g10; i10++) {
            d.a f10 = dVar.f(i10);
            q5.l i11 = dVar.i(i10);
            y h10 = dVar.h(i10);
            if (h10 == null) {
                if (gVar.o().q0(i11) != null) {
                    W(gVar, cVar, i11);
                }
                h10 = dVar.d(i10);
                if (h10 == null && f10 == null) {
                    gVar.L0(cVar, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i10), dVar);
                }
            }
            vVarArr[i10] = Y(gVar, cVar, h10, i10, i11, f10);
        }
        eVar.i(dVar.b(), true, vVarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r5.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean z(i5.b r3, q5.m r4, q5.s r5) {
        /*
            r2 = this;
            r0 = 1
            if (r5 == 0) goto L_0x0009
            boolean r1 = r5.Q()
            if (r1 != 0) goto L_0x0014
        L_0x0009:
            r1 = 0
            q5.l r4 = r4.A(r1)
            v4.d$a r3 = r3.A(r4)
            if (r3 == 0) goto L_0x0015
        L_0x0014:
            return r0
        L_0x0015:
            if (r5 == 0) goto L_0x002a
            java.lang.String r3 = r5.getName()
            if (r3 == 0) goto L_0x002a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002a
            boolean r3 = r5.s()
            if (r3 == 0) goto L_0x002a
            return r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.b.z(i5.b, q5.m, q5.s):boolean");
    }
}
