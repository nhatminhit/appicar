package zd;

import bh.c;
import fh.g;
import gf.b0;
import gf.d0;
import ve.f;
import xe.w;

@f
@h1(version = "1.5")
@y2(markerClass = {t.class})
public final class j2 implements Comparable<j2> {
    @g
    public static final a P = new a((w) null);
    public static final long Q = 0;
    public static final long R = -1;
    public static final int S = 8;
    public static final int T = 64;
    public final long O;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @oe.g
    @a1
    public /* synthetic */ j2(long j10) {
        this.O = j10;
    }

    @oe.f
    public static final long A(long j10) {
        return l(~j10);
    }

    @oe.f
    public static final long B(long j10, byte b10) {
        return l(j10 - l(((long) b10) & 255));
    }

    @oe.f
    public static final long C(long j10, long j11) {
        return l(j10 - j11);
    }

    @oe.f
    public static final long D(long j10, int i10) {
        return l(j10 - l(((long) i10) & 4294967295L));
    }

    @oe.f
    public static final long E(long j10, short s10) {
        return l(j10 - l(((long) s10) & c.f16306s));
    }

    @oe.f
    public static final byte F(long j10, byte b10) {
        return a2.l((byte) ((int) x1.a(j10, l(((long) b10) & 255))));
    }

    @oe.f
    public static final long G(long j10, long j11) {
        return x1.a(j10, j11);
    }

    @oe.f
    public static final int H(long j10, int i10) {
        return e2.l((int) x1.a(j10, l(((long) i10) & 4294967295L)));
    }

    @oe.f
    public static final short I(long j10, short s10) {
        return p2.l((short) ((int) x1.a(j10, l(((long) s10) & c.f16306s))));
    }

    @oe.f
    public static final long J(long j10, long j11) {
        return l(j10 | j11);
    }

    @oe.f
    public static final long K(long j10, byte b10) {
        return l(j10 + l(((long) b10) & 255));
    }

    @oe.f
    public static final long L(long j10, long j11) {
        return l(j10 + j11);
    }

    @oe.f
    public static final long M(long j10, int i10) {
        return l(j10 + l(((long) i10) & 4294967295L));
    }

    @oe.f
    public static final long N(long j10, short s10) {
        return l(j10 + l(((long) s10) & c.f16306s));
    }

    @oe.f
    public static final b0 O(long j10, long j11) {
        return new b0(j10, j11, (w) null);
    }

    @h1(version = "1.7")
    @oe.f
    @r
    public static final b0 P(long j10, long j11) {
        return d0.X(j10, j11);
    }

    @oe.f
    public static final long Q(long j10, byte b10) {
        return x1.a(j10, l(((long) b10) & 255));
    }

    @oe.f
    public static final long R(long j10, long j11) {
        return x2.i(j10, j11);
    }

    @oe.f
    public static final long S(long j10, int i10) {
        return x1.a(j10, l(((long) i10) & 4294967295L));
    }

    @oe.f
    public static final long T(long j10, short s10) {
        return x1.a(j10, l(((long) s10) & c.f16306s));
    }

    @oe.f
    public static final long U(long j10, int i10) {
        return l(j10 << i10);
    }

    @oe.f
    public static final long V(long j10, int i10) {
        return l(j10 >>> i10);
    }

    @oe.f
    public static final long W(long j10, byte b10) {
        return l(j10 * l(((long) b10) & 255));
    }

    @oe.f
    public static final long X(long j10, long j11) {
        return l(j10 * j11);
    }

    @oe.f
    public static final long Y(long j10, int i10) {
        return l(j10 * l(((long) i10) & 4294967295L));
    }

    @oe.f
    public static final long Z(long j10, short s10) {
        return l(j10 * l(((long) s10) & c.f16306s));
    }

    @oe.f
    public static final long a(long j10, long j11) {
        return l(j10 & j11);
    }

    @oe.f
    public static final byte a0(long j10) {
        return (byte) ((int) j10);
    }

    public static final /* synthetic */ j2 b(long j10) {
        return new j2(j10);
    }

    @oe.f
    public static final double b0(long j10) {
        return x2.j(j10);
    }

    @oe.f
    public static final float c0(long j10) {
        return (float) x2.j(j10);
    }

    @oe.f
    public static final int d(long j10, byte b10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, l(((long) b10) & 255) ^ Long.MIN_VALUE);
    }

    @oe.f
    public static final int d0(long j10) {
        return (int) j10;
    }

    @oe.f
    public static final long e0(long j10) {
        return j10;
    }

    @oe.f
    public static final short f0(long j10) {
        return (short) ((int) j10);
    }

    @g
    public static String g0(long j10) {
        return x2.k(j10);
    }

    @oe.f
    public static final byte h0(long j10) {
        return a2.l((byte) ((int) j10));
    }

    @oe.f
    public static int i(long j10, long j11) {
        return x2.g(j10, j11);
    }

    @oe.f
    public static final int i0(long j10) {
        return e2.l((int) j10);
    }

    @oe.f
    public static final int j(long j10, int i10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, l(((long) i10) & 4294967295L) ^ Long.MIN_VALUE);
    }

    @oe.f
    public static final long j0(long j10) {
        return j10;
    }

    @oe.f
    public static final int k(long j10, short s10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, l(((long) s10) & c.f16306s) ^ Long.MIN_VALUE);
    }

    @oe.f
    public static final short k0(long j10) {
        return p2.l((short) ((int) j10));
    }

    @oe.g
    @a1
    public static long l(long j10) {
        return j10;
    }

    @oe.f
    public static final long m(long j10) {
        return l(j10 - 1);
    }

    @oe.f
    public static final long m0(long j10, long j11) {
        return l(j10 ^ j11);
    }

    @oe.f
    public static final long n(long j10, byte b10) {
        return z1.a(j10, l(((long) b10) & 255));
    }

    @oe.f
    public static final long o(long j10, long j11) {
        return x2.h(j10, j11);
    }

    @oe.f
    public static final long p(long j10, int i10) {
        return z1.a(j10, l(((long) i10) & 4294967295L));
    }

    @oe.f
    public static final long q(long j10, short s10) {
        return z1.a(j10, l(((long) s10) & c.f16306s));
    }

    public static boolean r(long j10, Object obj) {
        return (obj instanceof j2) && j10 == ((j2) obj).l0();
    }

    public static final boolean s(long j10, long j11) {
        return j10 == j11;
    }

    @oe.f
    public static final long t(long j10, byte b10) {
        return z1.a(j10, l(((long) b10) & 255));
    }

    @oe.f
    public static final long u(long j10, long j11) {
        return z1.a(j10, j11);
    }

    @oe.f
    public static final long v(long j10, int i10) {
        return z1.a(j10, l(((long) i10) & 4294967295L));
    }

    @oe.f
    public static final long w(long j10, short s10) {
        return z1.a(j10, l(((long) s10) & c.f16306s));
    }

    @a1
    public static /* synthetic */ void x() {
    }

    public static int y(long j10) {
        return i2.a(j10);
    }

    @oe.f
    public static final long z(long j10) {
        return l(j10 + 1);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return x2.g(l0(), ((j2) obj).l0());
    }

    @oe.f
    public final int e(long j10) {
        return x2.g(l0(), j10);
    }

    public boolean equals(Object obj) {
        return r(this.O, obj);
    }

    public int hashCode() {
        return y(this.O);
    }

    public final /* synthetic */ long l0() {
        return this.O;
    }

    @g
    public String toString() {
        return g0(this.O);
    }
}
