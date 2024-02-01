package be;

import fh.h;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import zd.h1;

@h1(version = "1.1")
public abstract class g<K, V> extends AbstractMap<K, V> implements Map<K, V>, ye.g {
    public abstract Set b();

    public /* bridge */ Set<Object> c() {
        return super.keySet();
    }

    public /* bridge */ int e() {
        return super.size();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    public /* bridge */ Collection<Object> f() {
        return super.values();
    }

    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    @h
    public abstract V put(K k10, V v10);

    public final /* bridge */ int size() {
        return e();
    }

    public final /* bridge */ Collection<V> values() {
        return f();
    }
}
