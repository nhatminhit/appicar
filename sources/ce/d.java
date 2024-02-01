package ce;

import be.o;
import be.s0;
import fh.h;
import gf.m;
import gf.v;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import xe.l0;
import xe.w;
import ye.g;

public final class d<K, V> implements Map<K, V>, Serializable, g {
    @fh.g

    /* renamed from: a0  reason: collision with root package name */
    public static final a f16386a0 = new a((w) null);
    @Deprecated

    /* renamed from: b0  reason: collision with root package name */
    public static final int f16387b0 = -1640531527;
    @Deprecated

    /* renamed from: c0  reason: collision with root package name */
    public static final int f16388c0 = 8;
    @Deprecated

    /* renamed from: d0  reason: collision with root package name */
    public static final int f16389d0 = 2;
    @Deprecated

    /* renamed from: e0  reason: collision with root package name */
    public static final int f16390e0 = -1;
    @fh.g
    public K[] O;
    @h
    public V[] P;
    @fh.g
    public int[] Q;
    @fh.g
    public int[] R;
    public int S;
    public int T;
    public int U;
    public int V;
    @h
    public f<K> W;
    @h
    public g<V> X;
    @h
    public e<K, V> Y;
    public boolean Z;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public final int c(int i10) {
            return Integer.highestOneBit(v.u(i10, 1) * 3);
        }

        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }
    }

    public static final class b<K, V> extends C0268d<K, V> implements Iterator<Map.Entry<K, V>>, ye.d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(@fh.g d<K, V> dVar) {
            super(dVar);
            l0.p(dVar, "map");
        }

        @fh.g
        /* renamed from: h */
        public c<K, V> next() {
            if (a() < c().T) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                c<K, V> cVar = new c<>(c(), b());
                d();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void k(@fh.g StringBuilder sb2) {
            l0.p(sb2, "sb");
            if (a() < c().T) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                Object obj = c().O[b()];
                if (l0.g(obj, c())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] h10 = c().P;
                l0.m(h10);
                Object obj2 = h10[b()];
                if (l0.g(obj2, c())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                d();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int l() {
            if (a() < c().T) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                Object obj = c().O[b()];
                int i10 = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] h10 = c().P;
                l0.m(h10);
                Object obj2 = h10[b()];
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                int i11 = hashCode ^ i10;
                d();
                return i11;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class c<K, V> implements Map.Entry<K, V>, g.a {
        @fh.g
        public final d<K, V> O;
        public final int P;

        public c(@fh.g d<K, V> dVar, int i10) {
            l0.p(dVar, "map");
            this.O = dVar;
            this.P = i10;
        }

        public boolean equals(@h Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return l0.g(entry.getKey(), getKey()) && l0.g(entry.getValue(), getValue());
            }
        }

        public K getKey() {
            return this.O.O[this.P];
        }

        public V getValue() {
            V[] h10 = this.O.P;
            l0.m(h10);
            return h10[this.P];
        }

        public int hashCode() {
            Object key = getKey();
            int i10 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i10 = value.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            this.O.o();
            V[] b10 = this.O.m();
            int i10 = this.P;
            V v11 = b10[i10];
            b10[i10] = v10;
            return v11;
        }

        @fh.g
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: ce.d$d  reason: collision with other inner class name */
    public static class C0268d<K, V> {
        @fh.g
        public final d<K, V> O;
        public int P;
        public int Q = -1;

        public C0268d(@fh.g d<K, V> dVar) {
            l0.p(dVar, "map");
            this.O = dVar;
            d();
        }

        public final int a() {
            return this.P;
        }

        public final int b() {
            return this.Q;
        }

        @fh.g
        public final d<K, V> c() {
            return this.O;
        }

        public final void d() {
            while (this.P < this.O.T) {
                int[] f10 = this.O.Q;
                int i10 = this.P;
                if (f10[i10] < 0) {
                    this.P = i10 + 1;
                } else {
                    return;
                }
            }
        }

        public final void e(int i10) {
            this.P = i10;
        }

        public final void f(int i10) {
            this.Q = i10;
        }

        public final boolean hasNext() {
            return this.P < this.O.T;
        }

        public final void remove() {
            if (this.Q != -1) {
                this.O.o();
                this.O.O(this.Q);
                this.Q = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    public static final class e<K, V> extends C0268d<K, V> implements Iterator<K>, ye.d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(@fh.g d<K, V> dVar) {
            super(dVar);
            l0.p(dVar, "map");
        }

        public K next() {
            if (a() < c().T) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                K k10 = c().O[b()];
                d();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class f<K, V> extends C0268d<K, V> implements Iterator<V>, ye.d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(@fh.g d<K, V> dVar) {
            super(dVar);
            l0.p(dVar, "map");
        }

        public V next() {
            if (a() < c().T) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                V[] h10 = c().P;
                l0.m(h10);
                V v10 = h10[b()];
                d();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(c.d(i10), (V[]) null, new int[i10], new int[f16386a0.c(i10)], 2, 0);
    }

    public d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.O = kArr;
        this.P = vArr;
        this.Q = iArr;
        this.R = iArr2;
        this.S = i10;
        this.T = i11;
        this.U = f16386a0.d(A());
    }

    public final int A() {
        return this.R.length;
    }

    @fh.g
    public Set<K> B() {
        f<K> fVar = this.W;
        if (fVar != null) {
            return fVar;
        }
        f<K> fVar2 = new f<>(this);
        this.W = fVar2;
        return fVar2;
    }

    public int C() {
        return this.V;
    }

    @fh.g
    public Collection<V> D() {
        g<V> gVar = this.X;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.X = gVar2;
        return gVar2;
    }

    public final int E(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * -1640531527) >>> this.U;
    }

    public final boolean F() {
        return this.Z;
    }

    @fh.g
    public final e<K, V> G() {
        return new e<>(this);
    }

    public final boolean H(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        u(collection.size());
        for (Map.Entry I : collection) {
            if (I(I)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean I(Map.Entry<? extends K, ? extends V> entry) {
        int l10 = l(entry.getKey());
        Object[] m10 = m();
        if (l10 >= 0) {
            m10[l10] = entry.getValue();
            return true;
        }
        int i10 = (-l10) - 1;
        if (l0.g(entry.getValue(), m10[i10])) {
            return false;
        }
        m10[i10] = entry.getValue();
        return true;
    }

    public final boolean J(int i10) {
        int E = E(this.O[i10]);
        int i11 = this.S;
        while (true) {
            int[] iArr = this.R;
            if (iArr[E] == 0) {
                iArr[E] = i10 + 1;
                this.Q[i10] = E;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            E = E == 0 ? A() - 1 : E - 1;
        }
    }

    public final void K(int i10) {
        if (this.T > size()) {
            p();
        }
        int i11 = 0;
        if (i10 != A()) {
            this.R = new int[i10];
            this.U = f16386a0.d(i10);
        } else {
            o.l2(this.R, 0, 0, A());
        }
        while (i11 < this.T) {
            int i12 = i11 + 1;
            if (J(i11)) {
                i11 = i12;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final boolean L(@fh.g Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "entry");
        o();
        int w10 = w(entry.getKey());
        if (w10 < 0) {
            return false;
        }
        V[] vArr = this.P;
        l0.m(vArr);
        if (!l0.g(vArr[w10], entry.getValue())) {
            return false;
        }
        O(w10);
        return true;
    }

    public final void M(int i10) {
        int B = v.B(this.S * 2, A() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? A() - 1 : i10 - 1;
            i11++;
            if (i11 > this.S) {
                this.R[i12] = 0;
                return;
            }
            int[] iArr = this.R;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((E(this.O[i14]) - i10) & (A() - 1)) >= i11) {
                    this.R[i12] = i13;
                    this.Q[i14] = i12;
                }
                B--;
            }
            i12 = i10;
            i11 = 0;
            B--;
        } while (B >= 0);
        this.R[i12] = -1;
    }

    public final int N(K k10) {
        o();
        int w10 = w(k10);
        if (w10 < 0) {
            return -1;
        }
        O(w10);
        return w10;
    }

    public final void O(int i10) {
        c.f(this.O, i10);
        M(this.Q[i10]);
        this.Q[i10] = -1;
        this.V = size() - 1;
    }

    public final boolean P(V v10) {
        o();
        int x10 = x(v10);
        if (x10 < 0) {
            return false;
        }
        O(x10);
        return true;
    }

    @fh.g
    public final f<K, V> Q() {
        return new f<>(this);
    }

    public final Object R() {
        if (this.Z) {
            return new i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public void clear() {
        o();
        s0 o10 = new m(0, this.T - 1).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            int[] iArr = this.Q;
            int i10 = iArr[nextInt];
            if (i10 >= 0) {
                this.R[i10] = 0;
                iArr[nextInt] = -1;
            }
        }
        c.g(this.O, 0, this.T);
        V[] vArr = this.P;
        if (vArr != null) {
            c.g(vArr, 0, this.T);
        }
        this.V = 0;
        this.T = 0;
    }

    public boolean containsKey(Object obj) {
        return w(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return x(obj) >= 0;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return z();
    }

    public boolean equals(@h Object obj) {
        return obj == this || ((obj instanceof Map) && s((Map) obj));
    }

    @h
    public V get(Object obj) {
        int w10 = w(obj);
        if (w10 < 0) {
            return null;
        }
        V[] vArr = this.P;
        l0.m(vArr);
        return vArr[w10];
    }

    public int hashCode() {
        b v10 = v();
        int i10 = 0;
        while (v10.hasNext()) {
            i10 += v10.l();
        }
        return i10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ Set<K> keySet() {
        return B();
    }

    public final int l(K k10) {
        o();
        while (true) {
            int E = E(k10);
            int B = v.B(this.S * 2, A() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.R[E];
                if (i11 <= 0) {
                    if (this.T >= y()) {
                        u(1);
                    } else {
                        int i12 = this.T;
                        int i13 = i12 + 1;
                        this.T = i13;
                        this.O[i12] = k10;
                        this.Q[i12] = E;
                        this.R[E] = i13;
                        this.V = size() + 1;
                        if (i10 > this.S) {
                            this.S = i10;
                        }
                        return i12;
                    }
                } else if (l0.g(this.O[i11 - 1], k10)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > B) {
                        K(A() * 2);
                        break;
                    }
                    E = E == 0 ? A() - 1 : E - 1;
                }
            }
        }
    }

    public final V[] m() {
        V[] vArr = this.P;
        if (vArr != null) {
            return vArr;
        }
        V[] d10 = c.d(y());
        this.P = d10;
        return d10;
    }

    @fh.g
    public final Map<K, V> n() {
        o();
        this.Z = true;
        return this;
    }

    public final void o() {
        if (this.Z) {
            throw new UnsupportedOperationException();
        }
    }

    public final void p() {
        int i10;
        V[] vArr = this.P;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.T;
            if (i11 >= i10) {
                break;
            }
            if (this.Q[i11] >= 0) {
                K[] kArr = this.O;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                i12++;
            }
            i11++;
        }
        c.g(this.O, i12, i10);
        if (vArr != null) {
            c.g(vArr, i12, this.T);
        }
        this.T = i12;
    }

    @h
    public V put(K k10, V v10) {
        o();
        int l10 = l(k10);
        V[] m10 = m();
        if (l10 < 0) {
            int i10 = (-l10) - 1;
            V v11 = m10[i10];
            m10[i10] = v10;
            return v11;
        }
        m10[l10] = v10;
        return null;
    }

    public void putAll(@fh.g Map<? extends K, ? extends V> map) {
        l0.p(map, "from");
        o();
        H(map.entrySet());
    }

    public final boolean q(@fh.g Collection<?> collection) {
        l0.p(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!r((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean r(@fh.g Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "entry");
        int w10 = w(entry.getKey());
        if (w10 < 0) {
            return false;
        }
        V[] vArr = this.P;
        l0.m(vArr);
        return l0.g(vArr[w10], entry.getValue());
    }

    @h
    public V remove(Object obj) {
        int N = N(obj);
        if (N < 0) {
            return null;
        }
        V[] vArr = this.P;
        l0.m(vArr);
        V v10 = vArr[N];
        c.f(vArr, N);
        return v10;
    }

    public final boolean s(Map<?, ?> map) {
        return size() == map.size() && q(map.entrySet());
    }

    public final /* bridge */ int size() {
        return C();
    }

    public final void t(int i10) {
        int i11;
        if (i10 >= 0) {
            if (i10 > y()) {
                int y10 = (y() * 3) / 2;
                if (i10 <= y10) {
                    i10 = y10;
                }
                this.O = c.e(this.O, i10);
                V[] vArr = this.P;
                this.P = vArr != null ? c.e(vArr, i10) : null;
                int[] copyOf = Arrays.copyOf(this.Q, i10);
                l0.o(copyOf, "copyOf(this, newSize)");
                this.Q = copyOf;
                i11 = f16386a0.c(i10);
                if (i11 <= A()) {
                    return;
                }
            } else if ((this.T + i10) - size() > y()) {
                i11 = A();
            } else {
                return;
            }
            K(i11);
            return;
        }
        throw new OutOfMemoryError();
    }

    @fh.g
    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append(p7.a.f11638i);
        b v10 = v();
        int i10 = 0;
        while (v10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            v10.k(sb2);
            i10++;
        }
        sb2.append(p7.a.f11639j);
        String sb3 = sb2.toString();
        l0.o(sb3, "sb.toString()");
        return sb3;
    }

    public final void u(int i10) {
        t(this.T + i10);
    }

    @fh.g
    public final b<K, V> v() {
        return new b<>(this);
    }

    public final /* bridge */ Collection<V> values() {
        return D();
    }

    public final int w(K k10) {
        int E = E(k10);
        int i10 = this.S;
        while (true) {
            int i11 = this.R[E];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (l0.g(this.O[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            E = E == 0 ? A() - 1 : E - 1;
        }
    }

    public final int x(V v10) {
        int i10 = this.T;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.Q[i10] >= 0) {
                V[] vArr = this.P;
                l0.m(vArr);
                if (l0.g(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    public final int y() {
        return this.O.length;
    }

    @fh.g
    public Set<Map.Entry<K, V>> z() {
        e<K, V> eVar = this.Y;
        if (eVar != null) {
            return eVar;
        }
        e<K, V> eVar2 = new e<>(this);
        this.Y = eVar2;
        return eVar2;
    }
}
