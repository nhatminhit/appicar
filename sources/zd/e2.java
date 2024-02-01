package zd;

import fh.g;
import gf.d0;
import gf.y;
import ve.f;
import xe.w;

@f
@h1(version = "1.5")
@y2(markerClass = {t.class})
public final class e2 implements Comparable<e2> {
    @g
    public static final a P = new a((w) null);
    public static final int Q = 0;
    public static final int R = -1;
    public static final int S = 4;
    public static final int T = 32;
    public final int O;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @oe.g
    @a1
    public /* synthetic */ e2(int i10) {
        this.O = i10;
    }

    @oe.f
    public static final int A(int i10) {
        return l(~i10);
    }

    @oe.f
    public static final int B(int i10, byte b10) {
        return l(i10 - l(b10 & 255));
    }

    @oe.f
    public static final long C(int i10, long j10) {
        return j2.l(j2.l(((long) i10) & 4294967295L) - j10);
    }

    @oe.f
    public static final int D(int i10, int i11) {
        return l(i10 - i11);
    }

    @oe.f
    public static final int E(int i10, short s10) {
        return l(i10 - l(s10 & p2.R));
    }

    @oe.f
    public static final byte F(int i10, byte b10) {
        return a2.l((byte) u1.a(i10, l(b10 & 255)));
    }

    @oe.f
    public static final long G(int i10, long j10) {
        return x1.a(j2.l(((long) i10) & 4294967295L), j10);
    }

    @oe.f
    public static final int H(int i10, int i11) {
        return u1.a(i10, i11);
    }

    @oe.f
    public static final short I(int i10, short s10) {
        return p2.l((short) u1.a(i10, l(s10 & p2.R)));
    }

    @oe.f
    public static final int J(int i10, int i11) {
        return l(i10 | i11);
    }

    @oe.f
    public static final int K(int i10, byte b10) {
        return l(i10 + l(b10 & 255));
    }

    @oe.f
    public static final long L(int i10, long j10) {
        return j2.l(j2.l(((long) i10) & 4294967295L) + j10);
    }

    @oe.f
    public static final int M(int i10, int i11) {
        return l(i10 + i11);
    }

    @oe.f
    public static final int N(int i10, short s10) {
        return l(i10 + l(s10 & p2.R));
    }

    @oe.f
    public static final y O(int i10, int i11) {
        return new y(i10, i11, (w) null);
    }

    @h1(version = "1.7")
    @oe.f
    @r
    public static final y P(int i10, int i11) {
        return d0.V(i10, i11);
    }

    @oe.f
    public static final int Q(int i10, byte b10) {
        return u1.a(i10, l(b10 & 255));
    }

    @oe.f
    public static final long R(int i10, long j10) {
        return x1.a(j2.l(((long) i10) & 4294967295L), j10);
    }

    @oe.f
    public static final int S(int i10, int i11) {
        return x2.e(i10, i11);
    }

    @oe.f
    public static final int T(int i10, short s10) {
        return u1.a(i10, l(s10 & p2.R));
    }

    @oe.f
    public static final int U(int i10, int i11) {
        return l(i10 << i11);
    }

    @oe.f
    public static final int V(int i10, int i11) {
        return l(i10 >>> i11);
    }

    @oe.f
    public static final int W(int i10, byte b10) {
        return l(i10 * l(b10 & 255));
    }

    @oe.f
    public static final long X(int i10, long j10) {
        return j2.l(j2.l(((long) i10) & 4294967295L) * j10);
    }

    @oe.f
    public static final int Y(int i10, int i11) {
        return l(i10 * i11);
    }

    @oe.f
    public static final int Z(int i10, short s10) {
        return l(i10 * l(s10 & p2.R));
    }

    @oe.f
    public static final int a(int i10, int i11) {
        return l(i10 & i11);
    }

    @oe.f
    public static final byte a0(int i10) {
        return (byte) i10;
    }

    public static final /* synthetic */ e2 b(int i10) {
        return new e2(i10);
    }

    @oe.f
    public static final double b0(int i10) {
        return x2.f(i10);
    }

    @oe.f
    public static final float c0(int i10) {
        return (float) x2.f(i10);
    }

    @oe.f
    public static final int d(int i10, byte b10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, l(b10 & 255) ^ Integer.MIN_VALUE);
    }

    @oe.f
    public static final int d0(int i10) {
        return i10;
    }

    @oe.f
    public static final int e(int i10, long j10) {
        return Long.compare(j2.l(((long) i10) & 4294967295L) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @oe.f
    public static final long e0(int i10) {
        return ((long) i10) & 4294967295L;
    }

    @oe.f
    public static final short f0(int i10) {
        return (short) i10;
    }

    @g
    public static String g0(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @oe.f
    public static final byte h0(int i10) {
        return a2.l((byte) i10);
    }

    @oe.f
    public static final int i0(int i10) {
        return i10;
    }

    @oe.f
    public static int j(int i10, int i11) {
        return x2.c(i10, i11);
    }

    @oe.f
    public static final long j0(int i10) {
        return j2.l(((long) i10) & 4294967295L);
    }

    @oe.f
    public static final int k(int i10, short s10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, l(s10 & p2.R) ^ Integer.MIN_VALUE);
    }

    @oe.f
    public static final short k0(int i10) {
        return p2.l((short) i10);
    }

    @oe.g
    @a1
    public static int l(int i10) {
        return i10;
    }

    @oe.f
    public static final int m(int i10) {
        return l(i10 - 1);
    }

    @oe.f
    public static final int m0(int i10, int i11) {
        return l(i10 ^ i11);
    }

    @oe.f
    public static final int n(int i10, byte b10) {
        return v1.a(i10, l(b10 & 255));
    }

    @oe.f
    public static final long o(int i10, long j10) {
        return z1.a(j2.l(((long) i10) & 4294967295L), j10);
    }

    @oe.f
    public static final int p(int i10, int i11) {
        return x2.d(i10, i11);
    }

    @oe.f
    public static final int q(int i10, short s10) {
        return v1.a(i10, l(s10 & p2.R));
    }

    public static boolean r(int i10, Object obj) {
        return (obj instanceof e2) && i10 == ((e2) obj).l0();
    }

    public static final boolean s(int i10, int i11) {
        return i10 == i11;
    }

    @oe.f
    public static final int t(int i10, byte b10) {
        return v1.a(i10, l(b10 & 255));
    }

    @oe.f
    public static final long u(int i10, long j10) {
        return z1.a(j2.l(((long) i10) & 4294967295L), j10);
    }

    @oe.f
    public static final int v(int i10, int i11) {
        return v1.a(i10, i11);
    }

    @oe.f
    public static final int w(int i10, short s10) {
        return v1.a(i10, l(s10 & p2.R));
    }

    @a1
    public static /* synthetic */ void x() {
    }

    public static int y(int i10) {
        return i10;
    }

    @oe.f
    public static final int z(int i10) {
        return l(i10 + 1);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return x2.c(l0(), ((e2) obj).l0());
    }

    public boolean equals(Object obj) {
        return r(this.O, obj);
    }

    public int hashCode() {
        return y(this.O);
    }

    @oe.f
    public final int i(int i10) {
        return x2.c(l0(), i10);
    }

    public final /* synthetic */ int l0() {
        return this.O;
    }

    @g
    public String toString() {
        return g0(this.O);
    }
}
