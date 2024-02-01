package i5;

import a6.h;
import com.fasterxml.jackson.databind.node.p;
import i5.n;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w4.a0;

public abstract class m extends n.a implements a0, Iterable<m> {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9095a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.databind.node.n[] r0 = com.fasterxml.jackson.databind.node.n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9095a = r0
                com.fasterxml.jackson.databind.node.n r1 = com.fasterxml.jackson.databind.node.n.ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9095a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.node.n r1 = com.fasterxml.jackson.databind.node.n.OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9095a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.node.n r1 = com.fasterxml.jackson.databind.node.n.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.m.a.<clinit>():void");
        }
    }

    public final List<m> A0(String str) {
        List<m> B0 = B0(str, (List<m>) null);
        return B0 == null ? Collections.emptyList() : B0;
    }

    public abstract List<m> B0(String str, List<m> list);

    public final List<String> C0(String str) {
        List<String> D0 = D0(str, (List<String>) null);
        return D0 == null ? Collections.emptyList() : D0;
    }

    public abstract List<String> D0(String str, List<String> list);

    public float E0() {
        return 0.0f;
    }

    /* renamed from: F0 */
    public abstract m get(int i10);

    /* renamed from: G0 */
    public m g(String str) {
        return null;
    }

    public abstract com.fasterxml.jackson.databind.node.n H0();

    public boolean I0(int i10) {
        return get(i10) != null;
    }

    public boolean J0(String str) {
        return g(str) != null;
    }

    public final boolean K() {
        int i10 = a.f9095a[H0().ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? false : true;
    }

    public boolean K0(int i10) {
        m F0 = get(i10);
        return F0 != null && !F0.X0();
    }

    public boolean L0(String str) {
        m G0 = g(str);
        return G0 != null && !G0.X0();
    }

    public int M0() {
        return 0;
    }

    public boolean N0() {
        return false;
    }

    public boolean O() {
        return false;
    }

    public boolean O0() {
        return false;
    }

    public boolean P() {
        return false;
    }

    public final boolean P0() {
        return H0() == com.fasterxml.jackson.databind.node.n.BINARY;
    }

    public final boolean Q0() {
        return H0() == com.fasterxml.jackson.databind.node.n.BOOLEAN;
    }

    public boolean R0() {
        return false;
    }

    public boolean S0() {
        return false;
    }

    public boolean T0() {
        return false;
    }

    public abstract m U(w4.m mVar);

    public boolean U0() {
        return false;
    }

    public <T> T V(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public boolean V0() {
        return false;
    }

    public <T extends m> T W() {
        return this;
    }

    public boolean W0() {
        return false;
    }

    public boolean X() {
        return Y(false);
    }

    public final boolean X0() {
        return H0() == com.fasterxml.jackson.databind.node.n.NULL;
    }

    public boolean Y(boolean z10) {
        return z10;
    }

    public final boolean Y0() {
        return H0() == com.fasterxml.jackson.databind.node.n.NUMBER;
    }

    public double Z() {
        return a0(0.0d);
    }

    public final boolean Z0() {
        return H0() == com.fasterxml.jackson.databind.node.n.POJO;
    }

    public double a0(double d10) {
        return d10;
    }

    public boolean a1() {
        return false;
    }

    public int b0() {
        return c0(0);
    }

    public final boolean b1() {
        return H0() == com.fasterxml.jackson.databind.node.n.STRING;
    }

    public int c0(int i10) {
        return i10;
    }

    public long c1() {
        return 0;
    }

    public Number d1() {
        return null;
    }

    public Iterator<String> e() {
        return h.n();
    }

    public long e0() {
        return f0(0);
    }

    /* renamed from: e1 */
    public abstract m l(int i10);

    public abstract boolean equals(Object obj);

    public long f0(long j10) {
        return j10;
    }

    /* renamed from: f1 */
    public abstract m u(String str);

    public abstract String g0();

    public <T extends m> T g1() throws IllegalArgumentException {
        return W();
    }

    public boolean h() {
        return false;
    }

    public String h0(String str) {
        String g02 = g0();
        return g02 == null ? str : g02;
    }

    public <T extends m> T h1() throws IllegalArgumentException {
        return W();
    }

    /* renamed from: i0 */
    public final m t(String str) {
        return B(w4.m.j(str));
    }

    public m i1(int i10) throws IllegalArgumentException {
        return (m) V("Node of type `%s` has no indexed values", getClass().getName());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final Iterator<m> iterator() {
        return s0();
    }

    /* renamed from: j0 */
    public final m B(w4.m mVar) {
        if (mVar.s()) {
            return this;
        }
        m U = U(mVar);
        return U == null ? p.t1() : U.B(mVar.x());
    }

    public m j1(String str) throws IllegalArgumentException {
        return (m) V("Node of type `%s` has no fields", getClass().getName());
    }

    public BigInteger k0() {
        return BigInteger.ZERO;
    }

    public m k1(String str) throws IllegalArgumentException {
        return l1(w4.m.j(str));
    }

    public byte[] l0() throws IOException {
        return null;
    }

    public final m l1(w4.m mVar) throws IllegalArgumentException {
        m mVar2 = this;
        for (w4.m mVar3 = mVar; !mVar3.s(); mVar3 = mVar3.x()) {
            mVar2 = mVar2.U(mVar3);
            if (mVar2 == null) {
                V("No node at '%s' (unmatched part: '%s')", mVar, mVar3);
            }
        }
        return mVar2;
    }

    public boolean m0() {
        return false;
    }

    public short m1() {
        return 0;
    }

    public boolean n0() {
        return false;
    }

    public String n1() {
        return null;
    }

    public boolean o0() {
        return false;
    }

    public String o1() {
        return toString();
    }

    public final boolean p() {
        com.fasterxml.jackson.databind.node.n H0 = H0();
        return H0 == com.fasterxml.jackson.databind.node.n.OBJECT || H0 == com.fasterxml.jackson.databind.node.n.ARRAY;
    }

    public BigDecimal p0() {
        return BigDecimal.ZERO;
    }

    public <T extends m> T p1(String str) {
        throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), cannot call with() on it");
    }

    public abstract <T extends m> T q0();

    public <T extends m> T q1(String str) {
        throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), cannot call withArray() on it");
    }

    public double r0() {
        return 0.0d;
    }

    public Iterator<m> s0() {
        return h.n();
    }

    public int size() {
        return 0;
    }

    public boolean t0(Comparator<m> comparator, m mVar) {
        return comparator.compare(this, mVar) == 0;
    }

    public abstract String toString();

    public Iterator<Map.Entry<String, m>> u0() {
        return h.n();
    }

    public abstract m v0(String str);

    public final List<m> w0(String str) {
        List<m> x02 = x0(str, (List<m>) null);
        return x02 == null ? Collections.emptyList() : x02;
    }

    public abstract List<m> x0(String str, List<m> list);

    public abstract m y0(String str);

    public abstract m z0(String str);
}
