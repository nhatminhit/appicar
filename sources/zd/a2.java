package zd;

import fh.g;
import gf.d0;
import gf.y;
import ve.f;
import xe.l0;
import xe.w;

@f
@h1(version = "1.5")
@y2(markerClass = {t.class})
public final class a2 implements Comparable<a2> {
    @g
    public static final a P = new a((w) null);
    public static final byte Q = 0;
    public static final byte R = -1;
    public static final int S = 1;
    public static final int T = 8;
    public final byte O;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @oe.g
    @a1
    public /* synthetic */ a2(byte b10) {
        this.O = b10;
    }

    @oe.f
    public static final byte A(byte b10) {
        return l((byte) (~b10));
    }

    @oe.f
    public static final int B(byte b10, byte b11) {
        return e2.l(e2.l(b10 & 255) - e2.l(b11 & 255));
    }

    @oe.f
    public static final long C(byte b10, long j10) {
        return j2.l(j2.l(((long) b10) & 255) - j10);
    }

    @oe.f
    public static final int D(byte b10, int i10) {
        return e2.l(e2.l(b10 & 255) - i10);
    }

    @oe.f
    public static final int E(byte b10, short s10) {
        return e2.l(e2.l(b10 & 255) - e2.l(s10 & p2.R));
    }

    @oe.f
    public static final byte F(byte b10, byte b11) {
        return l((byte) u1.a(e2.l(b10 & 255), e2.l(b11 & 255)));
    }

    @oe.f
    public static final long G(byte b10, long j10) {
        return x1.a(j2.l(((long) b10) & 255), j10);
    }

    @oe.f
    public static final int H(byte b10, int i10) {
        return u1.a(e2.l(b10 & 255), i10);
    }

    @oe.f
    public static final short I(byte b10, short s10) {
        return p2.l((short) u1.a(e2.l(b10 & 255), e2.l(s10 & p2.R)));
    }

    @oe.f
    public static final byte J(byte b10, byte b11) {
        return l((byte) (b10 | b11));
    }

    @oe.f
    public static final int K(byte b10, byte b11) {
        return e2.l(e2.l(b10 & 255) + e2.l(b11 & 255));
    }

    @oe.f
    public static final long L(byte b10, long j10) {
        return j2.l(j2.l(((long) b10) & 255) + j10);
    }

    @oe.f
    public static final int M(byte b10, int i10) {
        return e2.l(e2.l(b10 & 255) + i10);
    }

    @oe.f
    public static final int N(byte b10, short s10) {
        return e2.l(e2.l(b10 & 255) + e2.l(s10 & p2.R));
    }

    @oe.f
    public static final y O(byte b10, byte b11) {
        return new y(e2.l(b10 & 255), e2.l(b11 & 255), (w) null);
    }

    @h1(version = "1.7")
    @oe.f
    @r
    public static final y P(byte b10, byte b11) {
        return d0.V(e2.l(b10 & 255), e2.l(b11 & 255));
    }

    @oe.f
    public static final int Q(byte b10, byte b11) {
        return u1.a(e2.l(b10 & 255), e2.l(b11 & 255));
    }

    @oe.f
    public static final long R(byte b10, long j10) {
        return x1.a(j2.l(((long) b10) & 255), j10);
    }

    @oe.f
    public static final int S(byte b10, int i10) {
        return u1.a(e2.l(b10 & 255), i10);
    }

    @oe.f
    public static final int T(byte b10, short s10) {
        return u1.a(e2.l(b10 & 255), e2.l(s10 & p2.R));
    }

    @oe.f
    public static final int U(byte b10, byte b11) {
        return e2.l(e2.l(b10 & 255) * e2.l(b11 & 255));
    }

    @oe.f
    public static final long V(byte b10, long j10) {
        return j2.l(j2.l(((long) b10) & 255) * j10);
    }

    @oe.f
    public static final int W(byte b10, int i10) {
        return e2.l(e2.l(b10 & 255) * i10);
    }

    @oe.f
    public static final int X(byte b10, short s10) {
        return e2.l(e2.l(b10 & 255) * e2.l(s10 & p2.R));
    }

    @oe.f
    public static final byte Y(byte b10) {
        return b10;
    }

    @oe.f
    public static final double Z(byte b10) {
        return (double) (b10 & 255);
    }

    @oe.f
    public static final byte a(byte b10, byte b11) {
        return l((byte) (b10 & b11));
    }

    @oe.f
    public static final float a0(byte b10) {
        return (float) (b10 & 255);
    }

    public static final /* synthetic */ a2 b(byte b10) {
        return new a2(b10);
    }

    @oe.f
    public static final int b0(byte b10) {
        return b10 & 255;
    }

    @oe.f
    public static final long c0(byte b10) {
        return ((long) b10) & 255;
    }

    @oe.f
    public static final short d0(byte b10) {
        return (short) (((short) b10) & 255);
    }

    @oe.f
    public static int e(byte b10, byte b11) {
        return l0.t(b10 & 255, b11 & 255);
    }

    @g
    public static String e0(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @oe.f
    public static final byte f0(byte b10) {
        return b10;
    }

    @oe.f
    public static final int g0(byte b10) {
        return e2.l(b10 & 255);
    }

    @oe.f
    public static final long h0(byte b10) {
        return j2.l(((long) b10) & 255);
    }

    @oe.f
    public static final int i(byte b10, long j10) {
        return Long.compare(j2.l(((long) b10) & 255) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @oe.f
    public static final short i0(byte b10) {
        return p2.l((short) (((short) b10) & 255));
    }

    @oe.f
    public static final int j(byte b10, int i10) {
        return Integer.compare(e2.l(b10 & 255) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @oe.f
    public static final int k(byte b10, short s10) {
        return l0.t(b10 & 255, s10 & p2.R);
    }

    @oe.f
    public static final byte k0(byte b10, byte b11) {
        return l((byte) (b10 ^ b11));
    }

    @oe.g
    @a1
    public static byte l(byte b10) {
        return b10;
    }

    @oe.f
    public static final byte m(byte b10) {
        return l((byte) (b10 - 1));
    }

    @oe.f
    public static final int n(byte b10, byte b11) {
        return v1.a(e2.l(b10 & 255), e2.l(b11 & 255));
    }

    @oe.f
    public static final long o(byte b10, long j10) {
        return z1.a(j2.l(((long) b10) & 255), j10);
    }

    @oe.f
    public static final int p(byte b10, int i10) {
        return v1.a(e2.l(b10 & 255), i10);
    }

    @oe.f
    public static final int q(byte b10, short s10) {
        return v1.a(e2.l(b10 & 255), e2.l(s10 & p2.R));
    }

    public static boolean r(byte b10, Object obj) {
        return (obj instanceof a2) && b10 == ((a2) obj).j0();
    }

    public static final boolean s(byte b10, byte b11) {
        return b10 == b11;
    }

    @oe.f
    public static final int t(byte b10, byte b11) {
        return v1.a(e2.l(b10 & 255), e2.l(b11 & 255));
    }

    @oe.f
    public static final long u(byte b10, long j10) {
        return z1.a(j2.l(((long) b10) & 255), j10);
    }

    @oe.f
    public static final int v(byte b10, int i10) {
        return v1.a(e2.l(b10 & 255), i10);
    }

    @oe.f
    public static final int w(byte b10, short s10) {
        return v1.a(e2.l(b10 & 255), e2.l(s10 & p2.R));
    }

    @a1
    public static /* synthetic */ void x() {
    }

    public static int y(byte b10) {
        return b10;
    }

    @oe.f
    public static final byte z(byte b10) {
        return l((byte) (b10 + 1));
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return l0.t(j0() & 255, ((a2) obj).j0() & 255);
    }

    @oe.f
    public final int d(byte b10) {
        return l0.t(j0() & 255, b10 & 255);
    }

    public boolean equals(Object obj) {
        return r(this.O, obj);
    }

    public int hashCode() {
        return y(this.O);
    }

    public final /* synthetic */ byte j0() {
        return this.O;
    }

    @g
    public String toString() {
        return e0(this.O);
    }
}
