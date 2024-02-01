package be;

import ce.d;
import fh.g;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import oe.f;
import we.a;
import we.l;
import xe.l0;
import zd.a1;
import zd.h1;
import zd.u0;
import zd.u2;

public class z0 extends y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f16232a = 1073741824;

    @h1(version = "1.3")
    @a1
    @g
    public static final <K, V> Map<K, V> d(@g Map<K, V> map) {
        l0.p(map, "builder");
        return ((d) map).n();
    }

    @h1(version = "1.3")
    @a1
    @f
    public static final <K, V> Map<K, V> e(int i10, l<? super Map<K, V>, u2> lVar) {
        l0.p(lVar, "builderAction");
        Map h10 = h(i10);
        lVar.A(h10);
        return d(h10);
    }

    @h1(version = "1.3")
    @a1
    @f
    public static final <K, V> Map<K, V> f(l<? super Map<K, V>, u2> lVar) {
        l0.p(lVar, "builderAction");
        Map g10 = g();
        lVar.A(g10);
        return d(g10);
    }

    @h1(version = "1.3")
    @a1
    @g
    public static final <K, V> Map<K, V> g() {
        return new d();
    }

    @h1(version = "1.3")
    @a1
    @g
    public static final <K, V> Map<K, V> h(int i10) {
        return new d(i10);
    }

    public static final <K, V> V i(@g ConcurrentMap<K, V> concurrentMap, K k10, @g a<? extends V> aVar) {
        l0.p(concurrentMap, "<this>");
        l0.p(aVar, "defaultValue");
        V v10 = concurrentMap.get(k10);
        if (v10 != null) {
            return v10;
        }
        V n10 = aVar.n();
        V putIfAbsent = concurrentMap.putIfAbsent(k10, n10);
        return putIfAbsent == null ? n10 : putIfAbsent;
    }

    @a1
    public static final int j(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((((float) i10) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @g
    public static final <K, V> Map<K, V> k(@g u0<? extends K, ? extends V> u0Var) {
        l0.p(u0Var, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(u0Var.e(), u0Var.f());
        l0.o(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    @g
    @h1(version = "1.4")
    public static final <K, V> SortedMap<K, V> l(@g Comparator<? super K> comparator, @g u0<? extends K, ? extends V>... u0VarArr) {
        l0.p(comparator, "comparator");
        l0.p(u0VarArr, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        a1.y0(treeMap, u0VarArr);
        return treeMap;
    }

    @g
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m(@g u0<? extends K, ? extends V>... u0VarArr) {
        l0.p(u0VarArr, "pairs");
        TreeMap treeMap = new TreeMap();
        a1.y0(treeMap, u0VarArr);
        return treeMap;
    }

    @f
    public static final Properties n(Map<String, String> map) {
        l0.p(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @g
    public static final <K, V> Map<K, V> o(@g Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        l0.o(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    @f
    public static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        l0.p(map, "<this>");
        return o(map);
    }

    @g
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> q(@g Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        return new TreeMap(map);
    }

    @g
    public static final <K, V> SortedMap<K, V> r(@g Map<? extends K, ? extends V> map, @g Comparator<? super K> comparator) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
