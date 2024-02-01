package androidx.collection;

import d.m0;
import d.o0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends i<K, V> implements Map<K, V> {
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public h<K, V> f1515a0;

    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    public class C0024a extends h<K, V> {
        public C0024a() {
        }

        public void a() {
            a.this.clear();
        }

        public Object b(int i10, int i11) {
            return a.this.P[(i10 << 1) + i11];
        }

        public Map<K, V> c() {
            return a.this;
        }

        public int d() {
            return a.this.Q;
        }

        public int e(Object obj) {
            return a.this.h(obj);
        }

        public int f(Object obj) {
            return a.this.l(obj);
        }

        public void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        public void h(int i10) {
            a.this.o(i10);
        }

        public V i(int i10, V v10) {
            return a.this.p(i10, v10);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(i iVar) {
        super(iVar);
    }

    private h<K, V> s() {
        if (this.f1515a0 == null) {
            this.f1515a0 = new C0024a();
        }
        return this.f1515a0;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return s().l();
    }

    public Set<K> keySet() {
        return s().m();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        e(this.Q + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public boolean r(@m0 Collection<?> collection) {
        return h.j(this, collection);
    }

    public boolean t(@m0 Collection<?> collection) {
        return h.o(this, collection);
    }

    public boolean u(@m0 Collection<?> collection) {
        return h.p(this, collection);
    }

    public Collection<V> values() {
        return s().n();
    }
}
