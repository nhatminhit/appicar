package ja;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import w7.l;

public final class i<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> W = new a();
    public static final /* synthetic */ boolean X = false;
    public Comparator<? super K> O;
    public g<K, V>[] P;
    public final g<K, V> Q;
    public int R;
    public int S;
    public int T;
    public i<K, V>.d U;
    public i<K, V>.e V;

    public class a implements Comparator<Comparable> {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public g<K, V> f19887a;

        /* renamed from: b  reason: collision with root package name */
        public int f19888b;

        /* renamed from: c  reason: collision with root package name */
        public int f19889c;

        /* renamed from: d  reason: collision with root package name */
        public int f19890d;

        public void a(g<K, V> gVar) {
            gVar.Q = null;
            gVar.O = null;
            gVar.P = null;
            gVar.W = 1;
            int i10 = this.f19888b;
            if (i10 > 0) {
                int i11 = this.f19890d;
                if ((i11 & 1) == 0) {
                    this.f19890d = i11 + 1;
                    this.f19888b = i10 - 1;
                    this.f19889c++;
                }
            }
            gVar.O = this.f19887a;
            this.f19887a = gVar;
            int i12 = this.f19890d + 1;
            this.f19890d = i12;
            int i13 = this.f19888b;
            if (i13 > 0 && (i12 & 1) == 0) {
                this.f19890d = i12 + 1;
                this.f19888b = i13 - 1;
                this.f19889c++;
            }
            int i14 = 4;
            while (true) {
                int i15 = i14 - 1;
                if ((this.f19890d & i15) == i15) {
                    int i16 = this.f19889c;
                    if (i16 == 0) {
                        g<K, V> gVar2 = this.f19887a;
                        g<K, V> gVar3 = gVar2.O;
                        g<K, V> gVar4 = gVar3.O;
                        gVar3.O = gVar4.O;
                        this.f19887a = gVar3;
                        gVar3.P = gVar4;
                        gVar3.Q = gVar2;
                        gVar3.W = gVar2.W + 1;
                        gVar4.O = gVar3;
                        gVar2.O = gVar3;
                    } else {
                        if (i16 == 1) {
                            g<K, V> gVar5 = this.f19887a;
                            g<K, V> gVar6 = gVar5.O;
                            this.f19887a = gVar6;
                            gVar6.Q = gVar5;
                            gVar6.W = gVar5.W + 1;
                            gVar5.O = gVar6;
                        } else if (i16 != 2) {
                        }
                        this.f19889c = 0;
                    }
                    i14 *= 2;
                } else {
                    return;
                }
            }
        }

        public void b(int i10) {
            this.f19888b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f19890d = 0;
            this.f19889c = 0;
            this.f19887a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.f19887a;
            if (gVar.O == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    public static class c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public g<K, V> f19891a;

        public g<K, V> a() {
            g<K, V> gVar = this.f19891a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.O;
            gVar.O = null;
            g<K, V> gVar3 = gVar.Q;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.O = gVar5;
                    gVar3 = gVar2.P;
                } else {
                    this.f19891a = gVar5;
                    return gVar;
                }
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.O = gVar2;
                gVar2 = gVar;
                gVar = gVar.P;
            }
            this.f19891a = gVar2;
        }
    }

    public final class d extends AbstractSet<Map.Entry<K, V>> {

        public class a extends i<K, V>.f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public d() {
        }

        public void clear() {
            i.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && i.this.g((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            g g10;
            if (!(obj instanceof Map.Entry) || (g10 = i.this.g((Map.Entry) obj)) == null) {
                return false;
            }
            i.this.m(g10, true);
            return true;
        }

        public int size() {
            return i.this.R;
        }
    }

    public final class e extends AbstractSet<K> {

        public class a extends i<K, V>.f<K> {
            public a() {
                super();
            }

            public K next() {
                return a().T;
            }
        }

        public e() {
        }

        public void clear() {
            i.this.clear();
        }

        public boolean contains(Object obj) {
            return i.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            return i.this.n(obj) != null;
        }

        public int size() {
            return i.this.R;
        }
    }

    public abstract class f<T> implements Iterator<T> {
        public g<K, V> O;
        public g<K, V> P = null;
        public int Q;

        public f() {
            this.O = i.this.Q.R;
            this.Q = i.this.S;
        }

        public final g<K, V> a() {
            g<K, V> gVar = this.O;
            i iVar = i.this;
            if (gVar == iVar.Q) {
                throw new NoSuchElementException();
            } else if (iVar.S == this.Q) {
                this.O = gVar.R;
                this.P = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.O != i.this.Q;
        }

        public final void remove() {
            g<K, V> gVar = this.P;
            if (gVar != null) {
                i.this.m(gVar, true);
                this.P = null;
                this.Q = i.this.S;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class g<K, V> implements Map.Entry<K, V> {
        public g<K, V> O;
        public g<K, V> P;
        public g<K, V> Q;
        public g<K, V> R;
        public g<K, V> S;
        public final K T;
        public final int U;
        public V V;
        public int W;

        public g() {
            this.T = null;
            this.U = -1;
            this.S = this;
            this.R = this;
        }

        public g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.O = gVar;
            this.T = k10;
            this.U = i10;
            this.W = 1;
            this.R = gVar2;
            this.S = gVar3;
            gVar3.R = this;
            gVar2.S = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.P; gVar2 != null; gVar2 = gVar2.P) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.Q; gVar2 != null; gVar2 = gVar2.Q) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.T
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.V
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.i.g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.T;
        }

        public V getValue() {
            return this.V;
        }

        public int hashCode() {
            K k10 = this.T;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.V;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            V v11 = this.V;
            this.V = v10;
            return v11;
        }

        public String toString() {
            return this.T + l.f14755k + this.V;
        }
    }

    static {
        Class<i> cls = i.class;
    }

    public i() {
        this(W);
    }

    public i(Comparator<? super K> comparator) {
        this.R = 0;
        this.S = 0;
        this.O = comparator == null ? W : comparator;
        this.Q = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.P = gVarArr;
        this.T = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    public static <K, V> g<K, V>[] c(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[(length * 2)];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g<K, V> gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g a10 = cVar.a();
                    if (a10 == null) {
                        break;
                    } else if ((a10.U & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g a11 = cVar.a();
                    if (a11 == null) {
                        break;
                    } else if ((a11.U & length) == 0) {
                        bVar.a(a11);
                    } else {
                        bVar2.a(a11);
                    }
                }
                g<K, V> gVar2 = null;
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                int i13 = i10 + length;
                if (i12 > 0) {
                    gVar2 = bVar2.c();
                }
                gVarArr2[i13] = gVar2;
            }
        }
        return gVarArr2;
    }

    public static int r(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    public final void b() {
        g<K, V>[] c10 = c(this.P);
        this.P = c10;
        this.T = (c10.length / 2) + (c10.length / 4);
    }

    public void clear() {
        Arrays.fill(this.P, (Object) null);
        this.R = 0;
        this.S++;
        g<K, V> gVar = this.Q;
        g<K, V> gVar2 = gVar.R;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.R;
            gVar2.S = null;
            gVar2.R = null;
            gVar2 = gVar3;
        }
        gVar.S = gVar;
        gVar.R = gVar;
    }

    public boolean containsKey(Object obj) {
        return h(obj) != null;
    }

    public final boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public Set<Map.Entry<K, V>> entrySet() {
        i<K, V>.d dVar = this.U;
        if (dVar != null) {
            return dVar;
        }
        i<K, V>.d dVar2 = new d();
        this.U = dVar2;
        return dVar2;
    }

    public g<K, V> f(K k10, boolean z10) {
        int i10;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.O;
        g<K, V>[] gVarArr = this.P;
        int r10 = r(k10.hashCode());
        int length = (gVarArr.length - 1) & r10;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == W ? (Comparable) k10 : null;
            while (true) {
                K k11 = gVar2.T;
                i10 = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i10 == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = i10 < 0 ? gVar2.P : gVar2.Q;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            i10 = 0;
        }
        g<K, V> gVar4 = gVar2;
        int i11 = i10;
        if (!z10) {
            return null;
        }
        g<K, V> gVar5 = this.Q;
        if (gVar4 != null) {
            gVar = new g<>(gVar4, k10, r10, gVar5, gVar5.S);
            if (i11 < 0) {
                gVar4.P = gVar;
            } else {
                gVar4.Q = gVar;
            }
            l(gVar4, true);
        } else if (comparator != W || (k10 instanceof Comparable)) {
            gVar = new g<>(gVar4, k10, r10, gVar5, gVar5.S);
            gVarArr[length] = gVar;
        } else {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        }
        int i12 = this.R;
        this.R = i12 + 1;
        if (i12 > this.T) {
            b();
        }
        this.S++;
        return gVar;
    }

    public g<K, V> g(Map.Entry<?, ?> entry) {
        g<K, V> h10 = h(entry.getKey());
        if (h10 != null && e(h10.V, entry.getValue())) {
            return h10;
        }
        return null;
    }

    public V get(Object obj) {
        g h10 = h(obj);
        if (h10 != null) {
            return h10.V;
        }
        return null;
    }

    public g<K, V> h(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return f(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void k(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    public Set<K> keySet() {
        i<K, V>.e eVar = this.V;
        if (eVar != null) {
            return eVar;
        }
        i<K, V>.e eVar2 = new e();
        this.V = eVar2;
        return eVar2;
    }

    public final void l(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.P;
            g<K, V> gVar3 = gVar.Q;
            int i10 = 0;
            int i11 = gVar2 != null ? gVar2.W : 0;
            int i12 = gVar3 != null ? gVar3.W : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                g<K, V> gVar4 = gVar3.P;
                g<K, V> gVar5 = gVar3.Q;
                int i14 = gVar5 != null ? gVar5.W : 0;
                if (gVar4 != null) {
                    i10 = gVar4.W;
                }
                int i15 = i10 - i14;
                if (i15 != -1 && (i15 != 0 || z10)) {
                    q(gVar3);
                }
                p(gVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 2) {
                g<K, V> gVar6 = gVar2.P;
                g<K, V> gVar7 = gVar2.Q;
                int i16 = gVar7 != null ? gVar7.W : 0;
                if (gVar6 != null) {
                    i10 = gVar6.W;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    p(gVar2);
                }
                q(gVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 0) {
                gVar.W = i11 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.W = Math.max(i11, i12) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.O;
        }
    }

    public void m(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.S;
            gVar2.R = gVar.R;
            gVar.R.S = gVar2;
            gVar.S = null;
            gVar.R = null;
        }
        g<K, V> gVar3 = gVar.P;
        g<K, V> gVar4 = gVar.Q;
        g<K, V> gVar5 = gVar.O;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                o(gVar, gVar3);
                gVar.P = null;
            } else if (gVar4 != null) {
                o(gVar, gVar4);
                gVar.Q = null;
            } else {
                o(gVar, (g<K, V>) null);
            }
            l(gVar5, false);
            this.R--;
            this.S++;
            return;
        }
        g<K, V> b10 = gVar3.W > gVar4.W ? gVar3.b() : gVar4.a();
        m(b10, false);
        g<K, V> gVar6 = gVar.P;
        if (gVar6 != null) {
            i10 = gVar6.W;
            b10.P = gVar6;
            gVar6.O = b10;
            gVar.P = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.Q;
        if (gVar7 != null) {
            i11 = gVar7.W;
            b10.Q = gVar7;
            gVar7.O = b10;
            gVar.Q = null;
        }
        b10.W = Math.max(i10, i11) + 1;
        o(gVar, b10);
    }

    public g<K, V> n(Object obj) {
        g<K, V> h10 = h(obj);
        if (h10 != null) {
            m(h10, true);
        }
        return h10;
    }

    public final void o(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.O;
        gVar.O = null;
        if (gVar2 != null) {
            gVar2.O = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.U;
            g<K, V>[] gVarArr = this.P;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.P == gVar) {
            gVar3.P = gVar2;
        } else {
            gVar3.Q = gVar2;
        }
    }

    public final void p(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.P;
        g<K, V> gVar3 = gVar.Q;
        g<K, V> gVar4 = gVar3.P;
        g<K, V> gVar5 = gVar3.Q;
        gVar.Q = gVar4;
        if (gVar4 != null) {
            gVar4.O = gVar;
        }
        o(gVar, gVar3);
        gVar3.P = gVar;
        gVar.O = gVar3;
        int i10 = 0;
        int max = Math.max(gVar2 != null ? gVar2.W : 0, gVar4 != null ? gVar4.W : 0) + 1;
        gVar.W = max;
        if (gVar5 != null) {
            i10 = gVar5.W;
        }
        gVar3.W = Math.max(max, i10) + 1;
    }

    public V put(K k10, V v10) {
        if (k10 != null) {
            g f10 = f(k10, true);
            V v11 = f10.V;
            f10.V = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    public final void q(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.P;
        g<K, V> gVar3 = gVar.Q;
        g<K, V> gVar4 = gVar2.P;
        g<K, V> gVar5 = gVar2.Q;
        gVar.P = gVar5;
        if (gVar5 != null) {
            gVar5.O = gVar;
        }
        o(gVar, gVar2);
        gVar2.Q = gVar;
        gVar.O = gVar2;
        int i10 = 0;
        int max = Math.max(gVar3 != null ? gVar3.W : 0, gVar5 != null ? gVar5.W : 0) + 1;
        gVar.W = max;
        if (gVar4 != null) {
            i10 = gVar4.W;
        }
        gVar2.W = Math.max(max, i10) + 1;
    }

    public V remove(Object obj) {
        g n10 = n(obj);
        if (n10 != null) {
            return n10.V;
        }
        return null;
    }

    public final Object s() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public int size() {
        return this.R;
    }
}
