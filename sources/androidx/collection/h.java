package androidx.collection;

import d.o0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import w7.l;

public abstract class h<K, V> {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public h<K, V>.b f1539a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public h<K, V>.c f1540b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public h<K, V>.e f1541c;

    public final class a<T> implements Iterator<T> {
        public final int O;
        public int P;
        public int Q;
        public boolean R = false;

        public a(int i10) {
            this.O = i10;
            this.P = h.this.d();
        }

        public boolean hasNext() {
            return this.Q < this.P;
        }

        public T next() {
            if (hasNext()) {
                T b10 = h.this.b(this.Q, this.O);
                this.Q++;
                this.R = true;
                return b10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.R) {
                int i10 = this.Q - 1;
                this.Q = i10;
                this.P--;
                this.R = false;
                h.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = h.this.d();
            for (Map.Entry entry : collection) {
                h.this.g(entry.getKey(), entry.getValue());
            }
            return d10 != h.this.d();
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = h.this.e(entry.getKey());
            if (e10 < 0) {
                return false;
            }
            return e.c(h.this.b(e10, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        public int hashCode() {
            int i10 = 0;
            for (int d10 = h.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = h.this.b(d10, 0);
                Object b11 = h.this.b(d10, 1);
                i10 += (b10 == null ? 0 : b10.hashCode()) ^ (b11 == null ? 0 : b11.hashCode());
            }
            return i10;
        }

        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return h.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object obj) {
            return h.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return h.j(h.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        public int hashCode() {
            int i10 = 0;
            for (int d10 = h.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = h.this.b(d10, 0);
                i10 += b10 == null ? 0 : b10.hashCode();
            }
            return i10;
        }

        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e10 = h.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            h.this.h(e10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return h.o(h.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return h.p(h.this.c(), collection);
        }

        public int size() {
            return h.this.d();
        }

        public Object[] toArray() {
            return h.this.q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return h.this.r(tArr, 0);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int O;
        public int P;
        public boolean Q = false;

        public d() {
            this.O = h.this.d() - 1;
            this.P = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.P++;
                this.Q = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.Q) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return e.c(entry.getKey(), h.this.b(this.P, 0)) && e.c(entry.getValue(), h.this.b(this.P, 1));
            }
        }

        public K getKey() {
            if (this.Q) {
                return h.this.b(this.P, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.Q) {
                return h.this.b(this.P, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.P < this.O;
        }

        public int hashCode() {
            if (this.Q) {
                int i10 = 0;
                Object b10 = h.this.b(this.P, 0);
                Object b11 = h.this.b(this.P, 1);
                int hashCode = b10 == null ? 0 : b10.hashCode();
                if (b11 != null) {
                    i10 = b11.hashCode();
                }
                return hashCode ^ i10;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.Q) {
                h.this.h(this.P);
                this.P--;
                this.O--;
                this.Q = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v10) {
            if (this.Q) {
                return h.this.i(this.P, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + l.f14755k + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object obj) {
            return h.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f10 = h.this.f(obj);
            if (f10 < 0) {
                return false;
            }
            h.this.h(f10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d10 = h.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (collection.contains(h.this.b(i10, 1))) {
                    h.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public boolean retainAll(Collection<?> collection) {
            int d10 = h.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (!collection.contains(h.this.b(i10, 1))) {
                    h.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public int size() {
            return h.this.d();
        }

        public Object[] toArray() {
            return h.this.q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return h.this.r(tArr, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i10, int i11);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k10, V v10);

    public abstract void h(int i10);

    public abstract V i(int i10, V v10);

    public Set<Map.Entry<K, V>> l() {
        if (this.f1539a == null) {
            this.f1539a = new b();
        }
        return this.f1539a;
    }

    public Set<K> m() {
        if (this.f1540b == null) {
            this.f1540b = new c();
        }
        return this.f1540b;
    }

    public Collection<V> n() {
        if (this.f1541c == null) {
            this.f1541c = new e();
        }
        return this.f1541c;
    }

    public Object[] q(int i10) {
        int d10 = d();
        Object[] objArr = new Object[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i10) {
        int d10 = d();
        if (tArr.length < d10) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            tArr[i11] = b(i11, i10);
        }
        if (tArr.length > d10) {
            tArr[d10] = null;
        }
        return tArr;
    }
}
