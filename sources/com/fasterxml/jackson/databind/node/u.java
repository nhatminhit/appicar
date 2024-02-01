package com.fasterxml.jackson.databind.node;

import a6.w;
import g5.c;
import i5.d0;
import i5.e0;
import i5.m;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w4.i;
import w4.p;

public class u extends f<u> implements Serializable {
    public static final long S = 1;
    public final Map<String, m> R;

    public u(m mVar) {
        super(mVar);
        this.R = new LinkedHashMap();
    }

    public u(m mVar, Map<String, m> map) {
        super(mVar);
        this.R = map;
    }

    public List<m> B0(String str, List<m> list) {
        for (Map.Entry next : this.R.entrySet()) {
            if (str.equals(next.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(next.getValue());
            } else {
                list = ((m) next.getValue()).B0(str, list);
            }
        }
        return list;
    }

    public List<String> D0(String str, List<String> list) {
        for (Map.Entry next : this.R.entrySet()) {
            if (str.equals(next.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(((m) next.getValue()).g0());
            } else {
                list = ((m) next.getValue()).D0(str, list);
            }
        }
        return list;
    }

    /* renamed from: F0 */
    public m get(int i10) {
        return null;
    }

    public boolean F1(u uVar) {
        return this.R.equals(uVar.R);
    }

    /* renamed from: G0 */
    public m g(String str) {
        return this.R.get(str);
    }

    public u G1(String str, m mVar) {
        this.R.put(str, mVar);
        return this;
    }

    public n H0() {
        return n.OBJECT;
    }

    /* renamed from: H1 */
    public u q0() {
        u uVar = new u(this.P);
        for (Map.Entry next : this.R.entrySet()) {
            uVar.R.put(next.getKey(), ((m) next.getValue()).q0());
        }
        return uVar;
    }

    /* renamed from: I1 */
    public u v0(String str) {
        for (Map.Entry next : this.R.entrySet()) {
            if (str.equals(next.getKey())) {
                return this;
            }
            m v02 = ((m) next.getValue()).v0(str);
            if (v02 != null) {
                return (u) v02;
            }
        }
        return null;
    }

    public u J1(String str, double d10) {
        return G1(str, L(d10));
    }

    public u K1(String str, float f10) {
        return G1(str, H(f10));
    }

    public u L1(String str, int i10) {
        return G1(str, I(i10));
    }

    public u M1(String str, long j10) {
        return G1(str, M(j10));
    }

    public u N1(String str, Boolean bool) {
        return G1(str, bool == null ? b() : C(bool.booleanValue()));
    }

    public final boolean O() {
        return true;
    }

    public u O1(String str, Double d10) {
        return G1(str, d10 == null ? b() : L(d10.doubleValue()));
    }

    public u P1(String str, Float f10) {
        return G1(str, f10 == null ? b() : H(f10.floatValue()));
    }

    public u Q1(String str, Integer num) {
        return G1(str, num == null ? b() : I(num.intValue()));
    }

    public u R1(String str, Long l10) {
        return G1(str, l10 == null ? b() : M(l10.longValue()));
    }

    public u S1(String str, Short sh2) {
        return G1(str, sh2 == null ? b() : Q(sh2.shortValue()));
    }

    public boolean T(e0 e0Var) {
        return this.R.isEmpty();
    }

    public u T1(String str, String str2) {
        return G1(str, str2 == null ? b() : c(str2));
    }

    public m U(w4.m mVar) {
        return g(mVar.n());
    }

    public u U1(String str, BigDecimal bigDecimal) {
        return G1(str, bigDecimal == null ? b() : j(bigDecimal));
    }

    public u V1(String str, BigInteger bigInteger) {
        return G1(str, bigInteger == null ? b() : f(bigInteger));
    }

    public u W1(String str, short s10) {
        return G1(str, Q(s10));
    }

    public u X1(String str, boolean z10) {
        return G1(str, C(z10));
    }

    public u Y1(String str, byte[] bArr) {
        return G1(str, bArr == null ? b() : s(bArr));
    }

    @Deprecated
    public m Z1(String str, m mVar) {
        if (mVar == null) {
            mVar = b();
        }
        return this.R.put(str, mVar);
    }

    @Deprecated
    public m a2(u uVar) {
        return o2(uVar);
    }

    @Deprecated
    public m b2(Map<String, ? extends m> map) {
        return p2(map);
    }

    public a c2(String str) {
        a z10 = z();
        G1(str, z10);
        return z10;
    }

    public u d2(String str) {
        this.R.put(str, b());
        return this;
    }

    public Iterator<String> e() {
        return this.R.keySet().iterator();
    }

    /* renamed from: e1 */
    public m l(int i10) {
        return p.t1();
    }

    public u e2(String str) {
        u A = A();
        G1(str, A);
        return A;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof u)) {
            return F1((u) obj);
        }
        return false;
    }

    /* renamed from: f1 */
    public m u(String str) {
        m mVar = this.R.get(str);
        return mVar != null ? mVar : p.t1();
    }

    public u f2(String str, Object obj) {
        return G1(str, o(obj));
    }

    public u g2(String str, w wVar) {
        return G1(str, n(wVar));
    }

    public u h2(Collection<String> collection) {
        this.R.keySet().removeAll(collection);
        return this;
    }

    public int hashCode() {
        return this.R.hashCode();
    }

    public m i2(String str) {
        return this.R.remove(str);
    }

    public boolean isEmpty() {
        return this.R.isEmpty();
    }

    public m j1(String str) {
        m mVar = this.R.get(str);
        if (mVar != null) {
            return mVar;
        }
        return (m) V("No value for property '%s' of `ObjectNode`", str);
    }

    /* renamed from: j2 */
    public u D1() {
        this.R.clear();
        return this;
    }

    public m k2(String str, m mVar) {
        if (mVar == null) {
            mVar = b();
        }
        return this.R.put(str, mVar);
    }

    public u l2(Collection<String> collection) {
        this.R.keySet().retainAll(collection);
        return this;
    }

    public u m2(String... strArr) {
        return l2(Arrays.asList(strArr));
    }

    public <T extends m> T n2(String str, m mVar) {
        if (mVar == null) {
            mVar = b();
        }
        this.R.put(str, mVar);
        return this;
    }

    public <T extends m> T o2(u uVar) {
        this.R.putAll(uVar.R);
        return this;
    }

    public <T extends m> T p2(Map<String, ? extends m> map) {
        for (Map.Entry next : map.entrySet()) {
            Object obj = (m) next.getValue();
            if (obj == null) {
                obj = b();
            }
            this.R.put(next.getKey(), obj);
        }
        return this;
    }

    /* renamed from: q2 */
    public u p1(String str) {
        m mVar = this.R.get(str);
        if (mVar == null) {
            u A = A();
            this.R.put(str, A);
            return A;
        } else if (mVar instanceof u) {
            return (u) mVar;
        } else {
            throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ObjectNode (but " + mVar.getClass().getName() + ")");
        }
    }

    public void r(i iVar, e0 e0Var) throws IOException {
        boolean z10 = e0Var != null && !e0Var.w0(d0.f9053i0);
        iVar.W2(this);
        for (Map.Entry next : this.R.entrySet()) {
            b bVar = (b) next.getValue();
            if (!z10 || !bVar.P() || !bVar.T(e0Var)) {
                iVar.i2((String) next.getKey());
                bVar.r(iVar, e0Var);
            }
        }
        iVar.g2();
    }

    /* renamed from: r2 */
    public a q1(String str) {
        m mVar = this.R.get(str);
        if (mVar == null) {
            a z10 = z();
            this.R.put(str, z10);
            return z10;
        } else if (mVar instanceof a) {
            return (a) mVar;
        } else {
            throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ArrayNode (but " + mVar.getClass().getName() + ")");
        }
    }

    public Iterator<m> s0() {
        return this.R.values().iterator();
    }

    public <T extends m> T s2(String str) {
        this.R.remove(str);
        return this;
    }

    public int size() {
        return this.R.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean t0(java.util.Comparator<i5.m> r5, i5.m r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fasterxml.jackson.databind.node.u
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.fasterxml.jackson.databind.node.u r6 = (com.fasterxml.jackson.databind.node.u) r6
            java.util.Map<java.lang.String, i5.m> r0 = r4.R
            java.util.Map<java.lang.String, i5.m> r6 = r6.R
            int r2 = r0.size()
            int r3 = r6.size()
            if (r3 == r2) goto L_0x0017
            return r1
        L_0x0017:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r6.get(r3)
            i5.m r3 = (i5.m) r3
            if (r3 == 0) goto L_0x0043
            java.lang.Object r2 = r2.getValue()
            i5.m r2 = (i5.m) r2
            boolean r2 = r2.t0(r5, r3)
            if (r2 != 0) goto L_0x001f
        L_0x0043:
            return r1
        L_0x0044:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.u.t0(java.util.Comparator, i5.m):boolean");
    }

    public <T extends m> T t2(Collection<String> collection) {
        this.R.keySet().removeAll(collection);
        return this;
    }

    public Iterator<Map.Entry<String, m>> u0() {
        return this.R.entrySet().iterator();
    }

    public p w() {
        return p.START_OBJECT;
    }

    public List<m> x0(String str, List<m> list) {
        for (Map.Entry next : this.R.entrySet()) {
            if (str.equals(next.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(this);
            } else {
                list = ((m) next.getValue()).x0(str, list);
            }
        }
        return list;
    }

    public void y(i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        boolean z10 = e0Var != null && !e0Var.w0(d0.f9053i0);
        c o10 = iVar2.o(iVar, iVar2.g(this, p.START_OBJECT));
        for (Map.Entry next : this.R.entrySet()) {
            b bVar = (b) next.getValue();
            if (!z10 || !bVar.P() || !bVar.T(e0Var)) {
                iVar.i2((String) next.getKey());
                bVar.r(iVar, e0Var);
            }
        }
        iVar2.v(iVar, o10);
    }

    public m z0(String str) {
        for (Map.Entry next : this.R.entrySet()) {
            if (str.equals(next.getKey())) {
                return (m) next.getValue();
            }
            m z02 = ((m) next.getValue()).z0(str);
            if (z02 != null) {
                return z02;
            }
        }
        return null;
    }
}
