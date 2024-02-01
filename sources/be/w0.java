package be;

import bc.p;
import fh.g;
import fh.h;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import we.l;
import xe.l0;

public final class w0<K, V> implements v0<K, V> {
    @g
    public final Map<K, V> O;
    @g
    public final l<K, V> P;

    public w0(@g Map<K, ? extends V> map, @g l<? super K, ? extends V> lVar) {
        l0.p(map, "map");
        l0.p(lVar, p.f16197p);
        this.O = map;
        this.P = lVar;
    }

    @g
    public Set<Map.Entry<K, V>> b() {
        return i().entrySet();
    }

    @g
    public Set<K> c() {
        return i().keySet();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return i().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return i().containsValue(obj);
    }

    public int e() {
        return i().size();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    public boolean equals(@h Object obj) {
        return i().equals(obj);
    }

    @g
    public Collection<V> f() {
        return i().values();
    }

    @h
    public V get(Object obj) {
        return i().get(obj);
    }

    public int hashCode() {
        return i().hashCode();
    }

    @g
    public Map<K, V> i() {
        return this.O;
    }

    public boolean isEmpty() {
        return i().isEmpty();
    }

    public V j(K k10) {
        Map i10 = i();
        V v10 = i10.get(k10);
        return (v10 != null || i10.containsKey(k10)) ? v10 : this.P.A(k10);
    }

    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    @g
    public String toString() {
        return i().toString();
    }

    public final /* bridge */ Collection<V> values() {
        return f();
    }
}
