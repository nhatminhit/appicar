package be;

import fh.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import we.p;
import we.q;
import we.r;
import xe.l0;
import zd.h1;

public class o0 extends n0 {
    @g
    @h1(version = "1.1")
    public static final <T, K, R> Map<K, R> c(@g l0<T, ? extends K> l0Var, @g r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        l0.p(l0Var, "<this>");
        l0.p(rVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b10 = l0Var.b();
        while (b10.hasNext()) {
            T next = b10.next();
            Object a10 = l0Var.a(next);
            Object obj = linkedHashMap.get(a10);
            linkedHashMap.put(a10, rVar.M(a10, obj, next, Boolean.valueOf(obj == null && !linkedHashMap.containsKey(a10))));
        }
        return linkedHashMap;
    }

    @g
    @h1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M d(@g l0<T, ? extends K> l0Var, @g M m10, @g r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> rVar) {
        l0.p(l0Var, "<this>");
        l0.p(m10, "destination");
        l0.p(rVar, "operation");
        Iterator<T> b10 = l0Var.b();
        while (b10.hasNext()) {
            T next = b10.next();
            Object a10 = l0Var.a(next);
            Object obj = m10.get(a10);
            m10.put(a10, rVar.M(a10, obj, next, Boolean.valueOf(obj == null && !m10.containsKey(a10))));
        }
        return m10;
    }

    @g
    @h1(version = "1.1")
    public static final <T, K, M extends Map<? super K, Integer>> M e(@g l0<T, ? extends K> l0Var, @g M m10) {
        l0.p(l0Var, "<this>");
        l0.p(m10, "destination");
        Iterator<T> b10 = l0Var.b();
        while (b10.hasNext()) {
            Object a10 = l0Var.a(b10.next());
            Object obj = m10.get(a10);
            if (obj == null && !m10.containsKey(a10)) {
                obj = 0;
            }
            m10.put(a10, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m10;
    }

    @g
    @h1(version = "1.1")
    public static final <T, K, R> Map<K, R> f(@g l0<T, ? extends K> l0Var, R r10, @g p<? super R, ? super T, ? extends R> pVar) {
        l0.p(l0Var, "<this>");
        l0.p(pVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b10 = l0Var.b();
        while (b10.hasNext()) {
            T next = b10.next();
            Object a10 = l0Var.a(next);
            R r11 = linkedHashMap.get(a10);
            if (r11 == null && !linkedHashMap.containsKey(a10)) {
                r11 = r10;
            }
            linkedHashMap.put(a10, pVar.g0(r11, next));
        }
        return linkedHashMap;
    }

    @g
    @h1(version = "1.1")
    public static final <T, K, R> Map<K, R> g(@g l0<T, ? extends K> l0Var, @g p<? super K, ? super T, ? extends R> pVar, @g q<? super K, ? super R, ? super T, ? extends R> qVar) {
        l0.p(l0Var, "<this>");
        l0.p(pVar, "initialValueSelector");
        l0.p(qVar, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b10 = l0Var.b();
        while (b10.hasNext()) {
            T next = b10.next();
            Object a10 = l0Var.a(next);
            Object obj = linkedHashMap.get(a10);
            if (obj == null && !linkedHashMap.containsKey(a10)) {
                obj = pVar.g0(a10, next);
            }
            linkedHashMap.put(a10, qVar.y(a10, obj, next));
        }
        return linkedHashMap;
    }

    @g
    @h1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M h(@g l0<T, ? extends K> l0Var, @g M m10, R r10, @g p<? super R, ? super T, ? extends R> pVar) {
        l0.p(l0Var, "<this>");
        l0.p(m10, "destination");
        l0.p(pVar, "operation");
        Iterator<T> b10 = l0Var.b();
        while (b10.hasNext()) {
            T next = b10.next();
            Object a10 = l0Var.a(next);
            R r11 = m10.get(a10);
            if (r11 == null && !m10.containsKey(a10)) {
                r11 = r10;
            }
            m10.put(a10, pVar.g0(r11, next));
        }
        return m10;
    }

    @g
    @h1(version = "1.1")
    public static final <T, K, R, M extends Map<? super K, R>> M i(@g l0<T, ? extends K> l0Var, @g M m10, @g p<? super K, ? super T, ? extends R> pVar, @g q<? super K, ? super R, ? super T, ? extends R> qVar) {
        l0.p(l0Var, "<this>");
        l0.p(m10, "destination");
        l0.p(pVar, "initialValueSelector");
        l0.p(qVar, "operation");
        Iterator<T> b10 = l0Var.b();
        while (b10.hasNext()) {
            T next = b10.next();
            Object a10 = l0Var.a(next);
            Object obj = m10.get(a10);
            if (obj == null && !m10.containsKey(a10)) {
                obj = pVar.g0(a10, next);
            }
            m10.put(a10, qVar.y(a10, obj, next));
        }
        return m10;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super K, ? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.1")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S, K> java.util.Map<K, S> j(@fh.g be.l0<T, ? extends K> r6, @fh.g we.q<? super K, ? super S, ? super T, ? extends S> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.b()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.a(r2)
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L_0x002f
            boolean r5 = r0.containsKey(r3)
            if (r5 != 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            java.lang.Object r2 = r7.y(r3, r4, r2)
        L_0x0037:
            r0.put(r3, r2)
            goto L_0x0013
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.o0.j(be.l0, we.q):java.util.Map");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super K, ? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.1")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S, K, M extends java.util.Map<? super K, S>> M k(@fh.g be.l0<T, ? extends K> r5, @fh.g M r6, @fh.g we.q<? super K, ? super S, ? super T, ? extends S> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "destination"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            java.util.Iterator r0 = r5.b()
        L_0x0013:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r5.a(r1)
            java.lang.Object r3 = r6.get(r2)
            if (r3 != 0) goto L_0x002f
            boolean r4 = r6.containsKey(r2)
            if (r4 != 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            java.lang.Object r1 = r7.y(r2, r3, r1)
        L_0x0037:
            r6.put(r2, r1)
            goto L_0x0013
        L_0x003b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.o0.k(be.l0, java.util.Map, we.q):java.util.Map");
    }
}
