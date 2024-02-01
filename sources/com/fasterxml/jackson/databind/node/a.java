package com.fasterxml.jackson.databind.node;

import a6.w;
import g5.c;
import i5.e0;
import i5.m;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import w4.i;
import w4.p;

public class a extends f<a> implements Serializable {
    public static final long S = 1;
    public final List<m> R;

    public a(m mVar) {
        super(mVar);
        this.R = new ArrayList();
    }

    public a(m mVar, int i10) {
        super(mVar);
        this.R = new ArrayList(i10);
    }

    public a(m mVar, List<m> list) {
        super(mVar);
        this.R = list;
    }

    /* renamed from: A2 */
    public a D1() {
        this.R.clear();
        return this;
    }

    public List<m> B0(String str, List<m> list) {
        for (m B0 : this.R) {
            list = B0.B0(str, list);
        }
        return list;
    }

    public m B2(int i10, m mVar) {
        if (mVar == null) {
            mVar = b();
        }
        if (i10 >= 0 && i10 < this.R.size()) {
            return this.R.set(i10, mVar);
        }
        throw new IndexOutOfBoundsException("Illegal index " + i10 + ", array size " + size());
    }

    public List<String> D0(String str, List<String> list) {
        for (m D0 : this.R) {
            list = D0.D0(str, list);
        }
        return list;
    }

    /* renamed from: F0 */
    public m get(int i10) {
        if (i10 < 0 || i10 >= this.R.size()) {
            return null;
        }
        return this.R.get(i10);
    }

    public a F1(m mVar) {
        this.R.add(mVar);
        return this;
    }

    /* renamed from: G0 */
    public m g(String str) {
        return null;
    }

    public boolean G1(a aVar) {
        return this.R.equals(aVar.R);
    }

    public n H0() {
        return n.ARRAY;
    }

    public a H1(int i10, m mVar) {
        if (i10 < 0) {
            this.R.add(0, mVar);
        } else if (i10 >= this.R.size()) {
            this.R.add(mVar);
        } else {
            this.R.add(i10, mVar);
        }
        return this;
    }

    public a I1(double d10) {
        return F1(L(d10));
    }

    public a J1(float f10) {
        return F1(H(f10));
    }

    public a K1(int i10) {
        F1(I(i10));
        return this;
    }

    public a L1(long j10) {
        return F1(M(j10));
    }

    public a M1(m mVar) {
        if (mVar == null) {
            mVar = b();
        }
        F1(mVar);
        return this;
    }

    public a N1(Boolean bool) {
        return bool == null ? a2() : F1(C(bool.booleanValue()));
    }

    public a O1(Double d10) {
        return d10 == null ? a2() : F1(L(d10.doubleValue()));
    }

    public boolean P() {
        return true;
    }

    public a P1(Float f10) {
        return f10 == null ? a2() : F1(H(f10.floatValue()));
    }

    public a Q1(Integer num) {
        return num == null ? a2() : F1(I(num.intValue()));
    }

    public a R1(Long l10) {
        return l10 == null ? a2() : F1(M(l10.longValue()));
    }

    public a S1(String str) {
        return str == null ? a2() : F1(c(str));
    }

    public boolean T(e0 e0Var) {
        return this.R.isEmpty();
    }

    public a T1(BigDecimal bigDecimal) {
        return bigDecimal == null ? a2() : F1(j(bigDecimal));
    }

    public m U(w4.m mVar) {
        return get(mVar.m());
    }

    public a U1(BigInteger bigInteger) {
        return bigInteger == null ? a2() : F1(f(bigInteger));
    }

    public a V1(boolean z10) {
        return F1(C(z10));
    }

    public a W1(byte[] bArr) {
        return bArr == null ? a2() : F1(s(bArr));
    }

    public a X1(a aVar) {
        this.R.addAll(aVar.R);
        return this;
    }

    public a Y1(Collection<? extends m> collection) {
        for (m M1 : collection) {
            M1(M1);
        }
        return this;
    }

    public a Z1() {
        a z10 = z();
        F1(z10);
        return z10;
    }

    public a a2() {
        F1(b());
        return this;
    }

    public u b2() {
        u A = A();
        F1(A);
        return A;
    }

    public a c2(Object obj) {
        if (obj == null) {
            a2();
        } else {
            F1(o(obj));
        }
        return this;
    }

    public a d2(w wVar) {
        if (wVar == null) {
            a2();
        } else {
            F1(n(wVar));
        }
        return this;
    }

    /* renamed from: e1 */
    public m l(int i10) {
        return (i10 < 0 || i10 >= this.R.size()) ? p.t1() : this.R.get(i10);
    }

    /* renamed from: e2 */
    public a q0() {
        a aVar = new a(this.P);
        for (m q02 : this.R) {
            aVar.R.add(q02.q0());
        }
        return aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            return this.R.equals(((a) obj).R);
        }
        return false;
    }

    /* renamed from: f1 */
    public m u(String str) {
        return p.t1();
    }

    /* renamed from: f2 */
    public u v0(String str) {
        for (m v02 : this.R) {
            m v03 = v02.v0(str);
            if (v03 != null) {
                return (u) v03;
            }
        }
        return null;
    }

    public a g2(int i10, double d10) {
        return H1(i10, L(d10));
    }

    public a h2(int i10, float f10) {
        return H1(i10, H(f10));
    }

    public int hashCode() {
        return this.R.hashCode();
    }

    public m i1(int i10) {
        Object V;
        if (i10 < 0 || i10 >= this.R.size()) {
            V = V("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i10), Integer.valueOf(this.R.size()));
        } else {
            V = this.R.get(i10);
        }
        return (m) V;
    }

    public a i2(int i10, int i11) {
        H1(i10, I(i11));
        return this;
    }

    public boolean isEmpty() {
        return this.R.isEmpty();
    }

    public a j2(int i10, long j10) {
        return H1(i10, M(j10));
    }

    public a k2(int i10, m mVar) {
        if (mVar == null) {
            mVar = b();
        }
        H1(i10, mVar);
        return this;
    }

    public a l2(int i10, Boolean bool) {
        return bool == null ? w2(i10) : H1(i10, C(bool.booleanValue()));
    }

    public a m2(int i10, Double d10) {
        return d10 == null ? w2(i10) : H1(i10, L(d10.doubleValue()));
    }

    public a n2(int i10, Float f10) {
        return f10 == null ? w2(i10) : H1(i10, H(f10.floatValue()));
    }

    public a o2(int i10, Integer num) {
        if (num == null) {
            w2(i10);
        } else {
            H1(i10, I(num.intValue()));
        }
        return this;
    }

    public a p2(int i10, Long l10) {
        return l10 == null ? w2(i10) : H1(i10, M(l10.longValue()));
    }

    public a q2(int i10, String str) {
        return str == null ? w2(i10) : H1(i10, c(str));
    }

    public void r(i iVar, e0 e0Var) throws IOException {
        List<m> list = this.R;
        int size = list.size();
        iVar.U2(this, size);
        for (int i10 = 0; i10 < size; i10++) {
            ((b) list.get(i10)).r(iVar, e0Var);
        }
        iVar.f2();
    }

    public a r2(int i10, BigDecimal bigDecimal) {
        return bigDecimal == null ? w2(i10) : H1(i10, j(bigDecimal));
    }

    public Iterator<m> s0() {
        return this.R.iterator();
    }

    public a s2(int i10, BigInteger bigInteger) {
        return bigInteger == null ? w2(i10) : H1(i10, f(bigInteger));
    }

    public int size() {
        return this.R.size();
    }

    public boolean t0(Comparator<m> comparator, m mVar) {
        if (!(mVar instanceof a)) {
            return false;
        }
        a aVar = (a) mVar;
        int size = this.R.size();
        if (aVar.size() != size) {
            return false;
        }
        List<m> list = this.R;
        List<m> list2 = aVar.R;
        for (int i10 = 0; i10 < size; i10++) {
            if (!list.get(i10).t0(comparator, list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public a t2(int i10, boolean z10) {
        return H1(i10, C(z10));
    }

    public a u2(int i10, byte[] bArr) {
        return bArr == null ? w2(i10) : H1(i10, s(bArr));
    }

    public a v2(int i10) {
        a z10 = z();
        H1(i10, z10);
        return z10;
    }

    public p w() {
        return p.START_ARRAY;
    }

    public a w2(int i10) {
        H1(i10, b());
        return this;
    }

    public List<m> x0(String str, List<m> list) {
        for (m x02 : this.R) {
            list = x02.x0(str, list);
        }
        return list;
    }

    public u x2(int i10) {
        u A = A();
        H1(i10, A);
        return A;
    }

    public void y(i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.g(this, p.START_ARRAY));
        Iterator<m> it = this.R.iterator();
        while (it.hasNext()) {
            ((b) it.next()).r(iVar, e0Var);
        }
        iVar2.v(iVar, o10);
    }

    public a y2(int i10, Object obj) {
        return obj == null ? w2(i10) : H1(i10, o(obj));
    }

    public m z0(String str) {
        for (m z02 : this.R) {
            m z03 = z02.z0(str);
            if (z03 != null) {
                return z03;
            }
        }
        return null;
    }

    public m z2(int i10) {
        if (i10 < 0 || i10 >= this.R.size()) {
            return null;
        }
        return this.R.remove(i10);
    }
}
