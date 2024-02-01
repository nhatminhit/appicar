package zd;

import bh.c;
import fh.g;
import gf.d0;
import gf.y;
import ve.f;
import xe.l0;
import xe.w;

@f
@h1(version = "1.5")
@y2(markerClass = {t.class})
public final class p2 implements Comparable<p2> {
    @g
    public static final a P = new a((w) null);
    public static final short Q = 0;
    public static final short R = -1;
    public static final int S = 2;
    public static final int T = 16;
    public final short O;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @oe.g
    @a1
    public /* synthetic */ p2(short s10) {
        this.O = s10;
    }

    @oe.f
    public static final short A(short s10) {
        return l((short) (~s10));
    }

    @oe.f
    public static final int B(short s10, byte b10) {
        return e2.l(e2.l(s10 & R) - e2.l(b10 & 255));
    }

    @oe.f
    public static final long C(short s10, long j10) {
        return j2.l(j2.l(((long) s10) & c.f16306s) - j10);
    }

    @oe.f
    public static final int D(short s10, int i10) {
        return e2.l(e2.l(s10 & R) - i10);
    }

    @oe.f
    public static final int E(short s10, short s11) {
        return e2.l(e2.l(s10 & R) - e2.l(s11 & R));
    }

    @oe.f
    public static final byte F(short s10, byte b10) {
        return a2.l((byte) u1.a(e2.l(s10 & R), e2.l(b10 & 255)));
    }

    @oe.f
    public static final long G(short s10, long j10) {
        return x1.a(j2.l(((long) s10) & c.f16306s), j10);
    }

    @oe.f
    public static final int H(short s10, int i10) {
        return u1.a(e2.l(s10 & R), i10);
    }

    @oe.f
    public static final short I(short s10, short s11) {
        return l((short) u1.a(e2.l(s10 & R), e2.l(s11 & R)));
    }

    @oe.f
    public static final short J(short s10, short s11) {
        return l((short) (s10 | s11));
    }

    @oe.f
    public static final int K(short s10, byte b10) {
        return e2.l(e2.l(s10 & R) + e2.l(b10 & 255));
    }

    @oe.f
    public static final long L(short s10, long j10) {
        return j2.l(j2.l(((long) s10) & c.f16306s) + j10);
    }

    @oe.f
    public static final int M(short s10, int i10) {
        return e2.l(e2.l(s10 & R) + i10);
    }

    @oe.f
    public static final int N(short s10, short s11) {
        return e2.l(e2.l(s10 & R) + e2.l(s11 & R));
    }

    @oe.f
    public static final y O(short s10, short s11) {
        return new y(e2.l(s10 & R), e2.l(s11 & R), (w) null);
    }

    @h1(version = "1.7")
    @oe.f
    @r
    public static final y P(short s10, short s11) {
        return d0.V(e2.l(s10 & R), e2.l(s11 & R));
    }

    @oe.f
    public static final int Q(short s10, byte b10) {
        return u1.a(e2.l(s10 & R), e2.l(b10 & 255));
    }

    @oe.f
    public static final long R(short s10, long j10) {
        return x1.a(j2.l(((long) s10) & c.f16306s), j10);
    }

    @oe.f
    public static final int S(short s10, int i10) {
        return u1.a(e2.l(s10 & R), i10);
    }

    @oe.f
    public static final int T(short s10, short s11) {
        return u1.a(e2.l(s10 & R), e2.l(s11 & R));
    }

    @oe.f
    public static final int U(short s10, byte b10) {
        return e2.l(e2.l(s10 & R) * e2.l(b10 & 255));
    }

    @oe.f
    public static final long V(short s10, long j10) {
        return j2.l(j2.l(((long) s10) & c.f16306s) * j10);
    }

    @oe.f
    public static final int W(short s10, int i10) {
        return e2.l(e2.l(s10 & R) * i10);
    }

    @oe.f
    public static final int X(short s10, short s11) {
        return e2.l(e2.l(s10 & R) * e2.l(s11 & R));
    }

    @oe.f
    public static final byte Y(short s10) {
        return (byte) s10;
    }

    @oe.f
    public static final double Z(short s10) {
        return (double) (s10 & R);
    }

    @oe.f
    public static final short a(short s10, short s11) {
        return l((short) (s10 & s11));
    }

    @oe.f
    public static final float a0(short s10) {
        return (float) (s10 & R);
    }

    public static final /* synthetic */ p2 b(short s10) {
        return new p2(s10);
    }

    @oe.f
    public static final int b0(short s10) {
        return s10 & R;
    }

    @oe.f
    public static final long c0(short s10) {
        return ((long) s10) & c.f16306s;
    }

    @oe.f
    public static final int d(short s10, byte b10) {
        return l0.t(s10 & R, b10 & 255);
    }

    @oe.f
    public static final short d0(short s10) {
        return s10;
    }

    @oe.f
    public static final int e(short s10, long j10) {
        return Long.compare(j2.l(((long) s10) & c.f16306s) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @g
    public static String e0(short s10) {
        return String.valueOf(s10 & R);
    }

    @oe.f
    public static final byte f0(short s10) {
        return a2.l((byte) s10);
    }

    @oe.f
    public static final int g0(short s10) {
        return e2.l(s10 & R);
    }

    @oe.f
    public static final long h0(short s10) {
        return j2.l(((long) s10) & c.f16306s);
    }

    @oe.f
    public static final int i(short s10, int i10) {
        return Integer.compare(e2.l(s10 & R) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @oe.f
    public static final short i0(short s10) {
        return s10;
    }

    @oe.f
    public static int k(short s10, short s11) {
        return l0.t(s10 & R, s11 & R);
    }

    @oe.f
    public static final short k0(short s10, short s11) {
        return l((short) (s10 ^ s11));
    }

    @oe.g
    @a1
    public static short l(short s10) {
        return s10;
    }

    @oe.f
    public static final short m(short s10) {
        return l((short) (s10 - 1));
    }

    @oe.f
    public static final int n(short s10, byte b10) {
        return v1.a(e2.l(s10 & R), e2.l(b10 & 255));
    }

    @oe.f
    public static final long o(short s10, long j10) {
        return z1.a(j2.l(((long) s10) & c.f16306s), j10);
    }

    @oe.f
    public static final int p(short s10, int i10) {
        return v1.a(e2.l(s10 & R), i10);
    }

    @oe.f
    public static final int q(short s10, short s11) {
        return v1.a(e2.l(s10 & R), e2.l(s11 & R));
    }

    public static boolean r(short s10, Object obj) {
        return (obj instanceof p2) && s10 == ((p2) obj).j0();
    }

    public static final boolean s(short s10, short s11) {
        return s10 == s11;
    }

    @oe.f
    public static final int t(short s10, byte b10) {
        return v1.a(e2.l(s10 & R), e2.l(b10 & 255));
    }

    @oe.f
    public static final long u(short s10, long j10) {
        return z1.a(j2.l(((long) s10) & c.f16306s), j10);
    }

    @oe.f
    public static final int v(short s10, int i10) {
        return v1.a(e2.l(s10 & R), i10);
    }

    @oe.f
    public static final int w(short s10, short s11) {
        return v1.a(e2.l(s10 & R), e2.l(s11 & R));
    }

    @a1
    public static /* synthetic */ void x() {
    }

    public static int y(short s10) {
        return s10;
    }

    @oe.f
    public static final short z(short s10) {
        return l((short) (s10 + 1));
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return l0.t(j0() & R, ((p2) obj).j0() & R);
    }

    public boolean equals(Object obj) {
        return r(this.O, obj);
    }

    public int hashCode() {
        return y(this.O);
    }

    @oe.f
    public final int j(short s10) {
        return l0.t(j0() & R, s10 & R);
    }

    public final /* synthetic */ short j0() {
        return this.O;
    }

    @g
    public String toString() {
        return e0(this.O);
    }
}
