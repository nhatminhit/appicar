package be;

import fh.g;
import java.util.Map;
import java.util.NoSuchElementException;
import ve.h;
import we.l;
import xe.l0;
import zd.a1;

public class y0 {
    @a1
    @h(name = "getOrImplicitDefaultNullable")
    public static final <K, V> V a(@g Map<K, ? extends V> map, K k10) {
        l0.p(map, "<this>");
        if (map instanceof v0) {
            return ((v0) map).j(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }

    @g
    public static final <K, V> Map<K, V> b(@g Map<K, ? extends V> map, @g l<? super K, ? extends V> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "defaultValue");
        return map instanceof v0 ? b(((v0) map).i(), lVar) : new w0(map, lVar);
    }

    @g
    @h(name = "withDefaultMutable")
    public static final <K, V> Map<K, V> c(@g Map<K, V> map, @g l<? super K, ? extends V> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "defaultValue");
        return map instanceof e1 ? c(((e1) map).i(), lVar) : new f1(map, lVar);
    }
}
