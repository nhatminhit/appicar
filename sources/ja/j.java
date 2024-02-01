package ja;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import w7.l;

public final class j<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> V = new a();
    public static final /* synthetic */ boolean W = false;
    public Comparator<? super K> O;
    public e<K, V> P;
    public int Q;
    public int R;
    public final e<K, V> S;
    public j<K, V>.b T;
    public j<K, V>.c U;

    public class a implements Comparator<Comparable> {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends j<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public b() {
        }

        public void clear() {
            j.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && j.this.e((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            e e10;
            if (!(obj instanceof Map.Entry) || (e10 = j.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            j.this.k(e10, true);
            return true;
        }

        public int size() {
            return j.this.Q;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends j<K, V>.d<K> {
            public a() {
                super();
            }

            public K next() {
                return a().T;
            }
        }

        public c() {
        }

        public void clear() {
            j.this.clear();
        }

        public boolean contains(Object obj) {
            return j.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            return j.this.l(obj) != null;
        }

        public int size() {
            return j.this.Q;
        }
    }

    public abstract class d<T> implements Iterator<T> {
        public e<K, V> O;
        public e<K, V> P = null;
        public int Q;

        public d() {
            this.O = j.this.S.R;
            this.Q = j.this.R;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.O;
            j jVar = j.this;
            if (eVar == jVar.S) {
                throw new NoSuchElementException();
            } else if (jVar.R == this.Q) {
                this.O = eVar.R;
                this.P = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.O != j.this.S;
        }

        public final void remove() {
            e<K, V> eVar = this.P;
            if (eVar != null) {
                j.this.k(eVar, true);
                this.P = null;
                this.Q = j.this.R;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> O;
        public e<K, V> P;
        public e<K, V> Q;
        public e<K, V> R;
        public e<K, V> S;
        public final K T;
        public V U;
        public int V;

        public e() {
            this.T = null;
            this.S = this;
            this.R = this;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.O = eVar;
            this.T = k10;
            this.V = 1;
            this.R = eVar2;
            this.S = eVar3;
            eVar3.R = this;
            eVar2.S = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.P; eVar2 != null; eVar2 = eVar2.P) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.Q; eVar2 != null; eVar2 = eVar2.Q) {
                eVar = eVar2;
            }
            return eVar;
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
                V r0 = r3.U
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
            throw new UnsupportedOperationException("Method not decompiled: ja.j.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.T;
        }

        public V getValue() {
            return this.U;
        }

        public int hashCode() {
            K k10 = this.T;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.U;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            V v11 = this.U;
            this.U = v10;
            return v11;
        }

        public String toString() {
            return this.T + l.f14755k + this.U;
        }
    }

    static {
        Class<j> cls = j.class;
    }

    public j() {
        this(V);
    }

    public j(Comparator<? super K> comparator) {
        this.Q = 0;
        this.R = 0;
        this.S = new e<>();
        this.O = comparator == null ? V : comparator;
    }

    public final boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public e<K, V> c(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.O;
        e<K, V> eVar2 = this.P;
        if (eVar2 != null) {
            Comparable comparable = comparator == V ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.T;
                i10 = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.P : eVar2.Q;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.S;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.S);
            if (i10 < 0) {
                eVar2.P = eVar;
            } else {
                eVar2.Q = eVar;
            }
            h(eVar2, true);
        } else if (comparator != V || (k10 instanceof Comparable)) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.S);
            this.P = eVar;
        } else {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        }
        this.Q++;
        this.R++;
        return eVar;
    }

    public void clear() {
        this.P = null;
        this.Q = 0;
        this.R++;
        e<K, V> eVar = this.S;
        eVar.S = eVar;
        eVar.R = eVar;
    }

    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    public e<K, V> e(Map.Entry<?, ?> entry) {
        e<K, V> f10 = f(entry.getKey());
        if (f10 != null && b(f10.U, entry.getValue())) {
            return f10;
        }
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        j<K, V>.b bVar = this.T;
        if (bVar != null) {
            return bVar;
        }
        j<K, V>.b bVar2 = new b();
        this.T = bVar2;
        return bVar2;
    }

    public e<K, V> f(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return c(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void g(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    public V get(Object obj) {
        e f10 = f(obj);
        if (f10 != null) {
            return f10.U;
        }
        return null;
    }

    public final void h(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.P;
            e<K, V> eVar3 = eVar.Q;
            int i10 = 0;
            int i11 = eVar2 != null ? eVar2.V : 0;
            int i12 = eVar3 != null ? eVar3.V : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.P;
                e<K, V> eVar5 = eVar3.Q;
                int i14 = eVar5 != null ? eVar5.V : 0;
                if (eVar4 != null) {
                    i10 = eVar4.V;
                }
                int i15 = i10 - i14;
                if (i15 != -1 && (i15 != 0 || z10)) {
                    o(eVar3);
                }
                n(eVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.P;
                e<K, V> eVar7 = eVar2.Q;
                int i16 = eVar7 != null ? eVar7.V : 0;
                if (eVar6 != null) {
                    i10 = eVar6.V;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    n(eVar2);
                }
                o(eVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.V = i11 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.V = Math.max(i11, i12) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.O;
        }
    }

    public void k(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.S;
            eVar2.R = eVar.R;
            eVar.R.S = eVar2;
        }
        e<K, V> eVar3 = eVar.P;
        e<K, V> eVar4 = eVar.Q;
        e<K, V> eVar5 = eVar.O;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m(eVar, eVar3);
                eVar.P = null;
            } else if (eVar4 != null) {
                m(eVar, eVar4);
                eVar.Q = null;
            } else {
                m(eVar, (e<K, V>) null);
            }
            h(eVar5, false);
            this.Q--;
            this.R++;
            return;
        }
        e<K, V> b10 = eVar3.V > eVar4.V ? eVar3.b() : eVar4.a();
        k(b10, false);
        e<K, V> eVar6 = eVar.P;
        if (eVar6 != null) {
            i10 = eVar6.V;
            b10.P = eVar6;
            eVar6.O = b10;
            eVar.P = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.Q;
        if (eVar7 != null) {
            i11 = eVar7.V;
            b10.Q = eVar7;
            eVar7.O = b10;
            eVar.Q = null;
        }
        b10.V = Math.max(i10, i11) + 1;
        m(eVar, b10);
    }

    public Set<K> keySet() {
        j<K, V>.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        j<K, V>.c cVar2 = new c();
        this.U = cVar2;
        return cVar2;
    }

    public e<K, V> l(Object obj) {
        e<K, V> f10 = f(obj);
        if (f10 != null) {
            k(f10, true);
        }
        return f10;
    }

    public final void m(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.O;
        eVar.O = null;
        if (eVar2 != null) {
            eVar2.O = eVar3;
        }
        if (eVar3 == null) {
            this.P = eVar2;
        } else if (eVar3.P == eVar) {
            eVar3.P = eVar2;
        } else {
            eVar3.Q = eVar2;
        }
    }

    public final void n(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.P;
        e<K, V> eVar3 = eVar.Q;
        e<K, V> eVar4 = eVar3.P;
        e<K, V> eVar5 = eVar3.Q;
        eVar.Q = eVar4;
        if (eVar4 != null) {
            eVar4.O = eVar;
        }
        m(eVar, eVar3);
        eVar3.P = eVar;
        eVar.O = eVar3;
        int i10 = 0;
        int max = Math.max(eVar2 != null ? eVar2.V : 0, eVar4 != null ? eVar4.V : 0) + 1;
        eVar.V = max;
        if (eVar5 != null) {
            i10 = eVar5.V;
        }
        eVar3.V = Math.max(max, i10) + 1;
    }

    public final void o(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.P;
        e<K, V> eVar3 = eVar.Q;
        e<K, V> eVar4 = eVar2.P;
        e<K, V> eVar5 = eVar2.Q;
        eVar.P = eVar5;
        if (eVar5 != null) {
            eVar5.O = eVar;
        }
        m(eVar, eVar2);
        eVar2.Q = eVar;
        eVar.O = eVar2;
        int i10 = 0;
        int max = Math.max(eVar3 != null ? eVar3.V : 0, eVar5 != null ? eVar5.V : 0) + 1;
        eVar.V = max;
        if (eVar4 != null) {
            i10 = eVar4.V;
        }
        eVar2.V = Math.max(max, i10) + 1;
    }

    public final Object p() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public V put(K k10, V v10) {
        if (k10 != null) {
            e c10 = c(k10, true);
            V v11 = c10.U;
            c10.U = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        e l10 = l(obj);
        if (l10 != null) {
            return l10.U;
        }
        return null;
    }

    public int size() {
        return this.Q;
    }
}
