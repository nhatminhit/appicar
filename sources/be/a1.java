package be;

import androidx.lifecycle.n0;
import fh.g;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oe.f;
import p000if.m;
import ve.h;
import we.a;
import we.l;
import xe.l0;
import xe.u1;
import zd.b;
import zd.h1;
import zd.r;
import zd.u0;
import zd.u2;
import zd.y2;

public class a1 extends z0 {
    @g
    public static final <K, V> Map<K, V> A(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (lVar.A(next).booleanValue()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    @f
    public static final <K, V> void A0(Map<K, V> map, K k10, V v10) {
        l0.p(map, "<this>");
        map.put(k10, v10);
    }

    @g
    public static final <K, V> Map<K, V> B(@g Map<? extends K, ? extends V> map, @g l<? super K, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (lVar.A(next.getKey()).booleanValue()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    @g
    public static final <K, V> Map<K, V> B0(@g m<? extends u0<? extends K, ? extends V>> mVar) {
        l0.p(mVar, "<this>");
        return k0(C0(mVar, new LinkedHashMap()));
    }

    @g
    public static final <K, V> Map<K, V> C(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (!lVar.A(next).booleanValue()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    @g
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@g m<? extends u0<? extends K, ? extends V>> mVar, @g M m10) {
        l0.p(mVar, "<this>");
        l0.p(m10, "destination");
        w0(m10, mVar);
        return m10;
    }

    @g
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@g Map<? extends K, ? extends V> map, @g M m10, @g l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "predicate");
        for (Map.Entry next : map.entrySet()) {
            if (!lVar.A(next).booleanValue()) {
                m10.put(next.getKey(), next.getValue());
            }
        }
        return m10;
    }

    @g
    public static final <K, V> Map<K, V> D0(@g Iterable<? extends u0<? extends K, ? extends V>> iterable) {
        l0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k0(E0(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z();
        }
        if (size != 1) {
            return E0(iterable, new LinkedHashMap(z0.j(collection.size())));
        }
        return z0.k((u0) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    @g
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@g Map<? extends K, ? extends V> map, @g M m10, @g l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "predicate");
        for (Map.Entry next : map.entrySet()) {
            if (lVar.A(next).booleanValue()) {
                m10.put(next.getKey(), next.getValue());
            }
        }
        return m10;
    }

    @g
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@g Iterable<? extends u0<? extends K, ? extends V>> iterable, @g M m10) {
        l0.p(iterable, "<this>");
        l0.p(m10, "destination");
        x0(m10, iterable);
        return m10;
    }

    @g
    public static final <K, V> Map<K, V> F(@g Map<? extends K, ? extends V> map, @g l<? super V, Boolean> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (lVar.A(next.getValue()).booleanValue()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    @g
    @h1(version = "1.1")
    public static final <K, V> Map<K, V> F0(@g Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? J0(map) : z0.o(map) : z();
    }

    @f
    public static final <K, V> V G(Map<? extends K, ? extends V> map, K k10) {
        l0.p(map, "<this>");
        return map.get(k10);
    }

    @g
    @h1(version = "1.1")
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@g Map<? extends K, ? extends V> map, @g M m10) {
        l0.p(map, "<this>");
        l0.p(m10, "destination");
        m10.putAll(map);
        return m10;
    }

    @f
    public static final <K, V> V H(Map<K, ? extends V> map, K k10, a<? extends V> aVar) {
        l0.p(map, "<this>");
        l0.p(aVar, "defaultValue");
        V v10 = map.get(k10);
        return v10 == null ? aVar.n() : v10;
    }

    @g
    public static final <K, V> Map<K, V> H0(@g u0<? extends K, ? extends V>[] u0VarArr) {
        l0.p(u0VarArr, "<this>");
        int length = u0VarArr.length;
        return length != 0 ? length != 1 ? I0(u0VarArr, new LinkedHashMap(z0.j(u0VarArr.length))) : z0.k(u0VarArr[0]) : z();
    }

    public static final <K, V> V I(@g Map<K, ? extends V> map, K k10, @g a<? extends V> aVar) {
        l0.p(map, "<this>");
        l0.p(aVar, "defaultValue");
        V v10 = map.get(k10);
        return (v10 != null || map.containsKey(k10)) ? v10 : aVar.n();
    }

    @g
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@g u0<? extends K, ? extends V>[] u0VarArr, @g M m10) {
        l0.p(u0VarArr, "<this>");
        l0.p(m10, "destination");
        y0(m10, u0VarArr);
        return m10;
    }

    public static final <K, V> V J(@g Map<K, V> map, K k10, @g a<? extends V> aVar) {
        l0.p(map, "<this>");
        l0.p(aVar, "defaultValue");
        V v10 = map.get(k10);
        if (v10 != null) {
            return v10;
        }
        V n10 = aVar.n();
        map.put(k10, n10);
        return n10;
    }

    @g
    @h1(version = "1.1")
    public static final <K, V> Map<K, V> J0(@g Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    @h1(version = "1.1")
    public static final <K, V> V K(@g Map<K, ? extends V> map, K k10) {
        l0.p(map, "<this>");
        return y0.a(map, k10);
    }

    @f
    public static final <K, V> u0<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "<this>");
        return new u0<>(entry.getKey(), entry.getValue());
    }

    @h1(version = "1.1")
    @f
    public static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @g
    public static final <K, V> HashMap<K, V> M(@g u0<? extends K, ? extends V>... u0VarArr) {
        l0.p(u0VarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(z0.j(u0VarArr.length));
        y0(hashMap, u0VarArr);
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, java.util.Map, M] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends java.util.Map<?, ?> & R, R> R N(M r1, we.a<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            xe.l0.p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = r2.n()
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.a1.N(java.util.Map, we.a):java.lang.Object");
    }

    @f
    public static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        return !map.isEmpty();
    }

    @h1(version = "1.3")
    @f
    public static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @f
    public static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        l0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @h1(version = "1.1")
    @f
    public static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @g
    public static final <K, V> LinkedHashMap<K, V> S(@g u0<? extends K, ? extends V>... u0VarArr) {
        l0.p(u0VarArr, "pairs");
        return (LinkedHashMap) I0(u0VarArr, new LinkedHashMap(z0.j(u0VarArr.length)));
    }

    @g
    public static final <K, V, R> Map<R, V> T(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(z0.j(map.size()));
        for (T next : map.entrySet()) {
            linkedHashMap.put(lVar.A(next), ((Map.Entry) next).getValue());
        }
        return linkedHashMap;
    }

    @g
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@g Map<? extends K, ? extends V> map, @g M m10, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (T next : map.entrySet()) {
            m10.put(lVar.A(next), ((Map.Entry) next).getValue());
        }
        return m10;
    }

    @f
    public static final <K, V> Map<K, V> V() {
        return z();
    }

    @g
    public static final <K, V> Map<K, V> W(@g u0<? extends K, ? extends V>... u0VarArr) {
        l0.p(u0VarArr, "pairs");
        return u0VarArr.length > 0 ? I0(u0VarArr, new LinkedHashMap(z0.j(u0VarArr.length))) : z();
    }

    @g
    public static final <K, V, R> Map<K, R> X(@g Map<? extends K, ? extends V> map, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(z0.j(map.size()));
        for (T next : map.entrySet()) {
            linkedHashMap.put(((Map.Entry) next).getKey(), lVar.A(next));
        }
        return linkedHashMap;
    }

    @g
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@g Map<? extends K, ? extends V> map, @g M m10, @g l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        l0.p(map, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (T next : map.entrySet()) {
            m10.put(((Map.Entry) next).getKey(), lVar.A(next));
        }
        return m10;
    }

    @g
    @h1(version = "1.1")
    public static final <K, V> Map<K, V> Z(@g Map<? extends K, ? extends V> map, @g m<? extends K> mVar) {
        l0.p(map, "<this>");
        l0.p(mVar, n0.f2814h);
        Map<? extends K, ? extends V> J0 = J0(map);
        b0.E0(J0.keySet(), mVar);
        return k0(J0);
    }

    @g
    @h1(version = "1.1")
    public static final <K, V> Map<K, V> a0(@g Map<? extends K, ? extends V> map, @g Iterable<? extends K> iterable) {
        l0.p(map, "<this>");
        l0.p(iterable, n0.f2814h);
        Map<? extends K, ? extends V> J0 = J0(map);
        b0.F0(J0.keySet(), iterable);
        return k0(J0);
    }

    @g
    @h1(version = "1.1")
    public static final <K, V> Map<K, V> b0(@g Map<? extends K, ? extends V> map, K k10) {
        l0.p(map, "<this>");
        Map<? extends K, ? extends V> J0 = J0(map);
        J0.remove(k10);
        return k0(J0);
    }

    @g
    @h1(version = "1.1")
    public static final <K, V> Map<K, V> c0(@g Map<? extends K, ? extends V> map, @g K[] kArr) {
        l0.p(map, "<this>");
        l0.p(kArr, n0.f2814h);
        Map<? extends K, ? extends V> J0 = J0(map);
        b0.H0(J0.keySet(), kArr);
        return k0(J0);
    }

    @h1(version = "1.1")
    @f
    public static final <K, V> void d0(Map<K, V> map, m<? extends K> mVar) {
        l0.p(map, "<this>");
        l0.p(mVar, n0.f2814h);
        b0.E0(map.keySet(), mVar);
    }

    @h1(version = "1.1")
    @f
    public static final <K, V> void e0(Map<K, V> map, Iterable<? extends K> iterable) {
        l0.p(map, "<this>");
        l0.p(iterable, n0.f2814h);
        b0.F0(map.keySet(), iterable);
    }

    @h1(version = "1.1")
    @f
    public static final <K, V> void f0(Map<K, V> map, K k10) {
        l0.p(map, "<this>");
        map.remove(k10);
    }

    @h1(version = "1.1")
    @f
    public static final <K, V> void g0(Map<K, V> map, K[] kArr) {
        l0.p(map, "<this>");
        l0.p(kArr, n0.f2814h);
        b0.H0(map.keySet(), kArr);
    }

    @f
    @h(name = "mutableIterator")
    public static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        l0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @h1(version = "1.1")
    @f
    public static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @g
    public static final <K, V> Map<K, V> j0(@g u0<? extends K, ? extends V>... u0VarArr) {
        l0.p(u0VarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(z0.j(u0VarArr.length));
        y0(linkedHashMap, u0VarArr);
        return linkedHashMap;
    }

    @g
    public static final <K, V> Map<K, V> k0(@g Map<K, ? extends V> map) {
        l0.p(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : z0.o(map) : z();
    }

    @f
    public static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        return map == null ? z() : map;
    }

    @g
    public static final <K, V> Map<K, V> m0(@g Map<? extends K, ? extends V> map, @g m<? extends u0<? extends K, ? extends V>> mVar) {
        l0.p(map, "<this>");
        l0.p(mVar, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, mVar);
        return k0(linkedHashMap);
    }

    @g
    public static final <K, V> Map<K, V> n0(@g Map<? extends K, ? extends V> map, @g Iterable<? extends u0<? extends K, ? extends V>> iterable) {
        l0.p(map, "<this>");
        l0.p(iterable, "pairs");
        if (map.isEmpty()) {
            return D0(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @g
    public static final <K, V> Map<K, V> o0(@g Map<? extends K, ? extends V> map, @g Map<? extends K, ? extends V> map2) {
        l0.p(map, "<this>");
        l0.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @g
    public static final <K, V> Map<K, V> p0(@g Map<? extends K, ? extends V> map, @g u0<? extends K, ? extends V> u0Var) {
        l0.p(map, "<this>");
        l0.p(u0Var, "pair");
        if (map.isEmpty()) {
            return z0.k(u0Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(u0Var.e(), u0Var.f());
        return linkedHashMap;
    }

    @g
    public static final <K, V> Map<K, V> q0(@g Map<? extends K, ? extends V> map, @g u0<? extends K, ? extends V>[] u0VarArr) {
        l0.p(map, "<this>");
        l0.p(u0VarArr, "pairs");
        if (map.isEmpty()) {
            return H0(u0VarArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, u0VarArr);
        return linkedHashMap;
    }

    @f
    public static final <K, V> void r0(Map<? super K, ? super V> map, m<? extends u0<? extends K, ? extends V>> mVar) {
        l0.p(map, "<this>");
        l0.p(mVar, "pairs");
        w0(map, mVar);
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    @f
    public static final <K, V> Map<K, V> s(int i10, @b l<? super Map<K, V>, u2> lVar) {
        l0.p(lVar, "builderAction");
        Map h10 = z0.h(i10);
        lVar.A(h10);
        return z0.d(h10);
    }

    @f
    public static final <K, V> void s0(Map<? super K, ? super V> map, Iterable<? extends u0<? extends K, ? extends V>> iterable) {
        l0.p(map, "<this>");
        l0.p(iterable, "pairs");
        x0(map, iterable);
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    @f
    public static final <K, V> Map<K, V> t(@b l<? super Map<K, V>, u2> lVar) {
        l0.p(lVar, "builderAction");
        Map g10 = z0.g();
        lVar.A(g10);
        return z0.d(g10);
    }

    @f
    public static final <K, V> void t0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        l0.p(map, "<this>");
        l0.p(map2, "map");
        map.putAll(map2);
    }

    @f
    public static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "<this>");
        return entry.getKey();
    }

    @f
    public static final <K, V> void u0(Map<? super K, ? super V> map, u0<? extends K, ? extends V> u0Var) {
        l0.p(map, "<this>");
        l0.p(u0Var, "pair");
        map.put(u0Var.e(), u0Var.f());
    }

    @f
    public static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "<this>");
        return entry.getValue();
    }

    @f
    public static final <K, V> void v0(Map<? super K, ? super V> map, u0<? extends K, ? extends V>[] u0VarArr) {
        l0.p(map, "<this>");
        l0.p(u0VarArr, "pairs");
        y0(map, u0VarArr);
    }

    @f
    public static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k10) {
        l0.p(map, "<this>");
        return map.containsKey(k10);
    }

    public static final <K, V> void w0(@g Map<? super K, ? super V> map, @g m<? extends u0<? extends K, ? extends V>> mVar) {
        l0.p(map, "<this>");
        l0.p(mVar, "pairs");
        for (u0 u0Var : mVar) {
            map.put(u0Var.a(), u0Var.b());
        }
    }

    @f
    public static final <K> boolean x(Map<? extends K, ?> map, K k10) {
        l0.p(map, "<this>");
        return map.containsKey(k10);
    }

    public static final <K, V> void x0(@g Map<? super K, ? super V> map, @g Iterable<? extends u0<? extends K, ? extends V>> iterable) {
        l0.p(map, "<this>");
        l0.p(iterable, "pairs");
        for (u0 u0Var : iterable) {
            map.put(u0Var.a(), u0Var.b());
        }
    }

    @f
    public static final <K, V> boolean y(Map<K, ? extends V> map, V v10) {
        l0.p(map, "<this>");
        return map.containsValue(v10);
    }

    public static final <K, V> void y0(@g Map<? super K, ? super V> map, @g u0<? extends K, ? extends V>[] u0VarArr) {
        l0.p(map, "<this>");
        l0.p(u0VarArr, "pairs");
        for (u0<? extends K, ? extends V> u0Var : u0VarArr) {
            map.put(u0Var.a(), u0Var.b());
        }
    }

    @g
    public static final <K, V> Map<K, V> z() {
        i0 i0Var = i0.O;
        l0.n(i0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return i0Var;
    }

    @f
    public static final <K, V> V z0(Map<? extends K, V> map, K k10) {
        l0.p(map, "<this>");
        return u1.k(map).remove(k10);
    }
}
