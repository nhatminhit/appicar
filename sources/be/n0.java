package be;

import fh.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import oe.f;
import we.l;
import xe.k1;
import xe.l0;
import xe.u1;
import zd.a1;
import zd.h1;

public class n0 {
    @g
    @h1(version = "1.1")
    public static final <T, K> Map<K, Integer> a(@g l0<T, ? extends K> l0Var) {
        l0.p(l0Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b10 = l0Var.b();
        while (b10.hasNext()) {
            Object a10 = l0Var.a(b10.next());
            Object obj = linkedHashMap.get(a10);
            if (obj == null && !linkedHashMap.containsKey(a10)) {
                obj = new k1.f();
            }
            k1.f fVar = (k1.f) obj;
            fVar.O++;
            linkedHashMap.put(a10, fVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            l0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            u1.m(entry).setValue(Integer.valueOf(((k1.f) entry.getValue()).O));
        }
        return u1.k(linkedHashMap);
    }

    @f
    @a1
    public static final <K, V, R> Map<K, R> b(Map<K, V> map, l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, u3.f.A);
        for (Map.Entry entry : map.entrySet()) {
            l0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            u1.m(entry).setValue(lVar.A(entry));
        }
        return u1.k(map);
    }
}
