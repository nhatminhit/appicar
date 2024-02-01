package de;

import java.util.Map;
import oe.f;
import ve.h;
import xe.l0;
import xe.u1;
import zd.h1;

@h(name = "CollectionsJDK8Kt")
public final class c {
    @h1(version = "1.2")
    @f
    public static final <K, V> V a(Map<? extends K, ? extends V> map, K k10, V v10) {
        l0.p(map, "<this>");
        return map.getOrDefault(k10, v10);
    }

    @h1(version = "1.2")
    @f
    public static final <K, V> boolean b(Map<? extends K, ? extends V> map, K k10, V v10) {
        l0.p(map, "<this>");
        return u1.k(map).remove(k10, v10);
    }
}
