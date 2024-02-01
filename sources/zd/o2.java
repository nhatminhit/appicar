package zd;

import oe.f;
import ve.h;

@h(name = "UNumbersKt")
public final class o2 {
    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int A(int i10) {
        return e2.l(Integer.lowestOneBit(i10));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final short B(short s10) {
        return p2.l((short) Integer.lowestOneBit(s10 & p2.R));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int a(byte b10) {
        return Integer.numberOfLeadingZeros(b10 & 255) - 24;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int b(long j10) {
        return Long.numberOfLeadingZeros(j10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int c(int i10) {
        return Integer.numberOfLeadingZeros(i10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int d(short s10) {
        return Integer.numberOfLeadingZeros(s10 & p2.R) - 16;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int e(byte b10) {
        return Integer.bitCount(e2.l(b10 & 255));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int f(long j10) {
        return Long.bitCount(j10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int g(int i10) {
        return Integer.bitCount(i10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int h(short s10) {
        return Integer.bitCount(e2.l(s10 & p2.R));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int i(byte b10) {
        return Integer.numberOfTrailingZeros(b10 | 256);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int j(long j10) {
        return Long.numberOfTrailingZeros(j10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int k(int i10) {
        return Integer.numberOfTrailingZeros(i10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int l(short s10) {
        return Integer.numberOfTrailingZeros(s10 | 65536);
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final long m(long j10, int i10) {
        return j2.l(Long.rotateLeft(j10, i10));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final byte n(byte b10, int i10) {
        return a2.l(q0.Z0(b10, i10));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final int o(int i10, int i11) {
        return e2.l(Integer.rotateLeft(i10, i11));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final short p(short s10, int i10) {
        return p2.l(q0.a1(s10, i10));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final long q(long j10, int i10) {
        return j2.l(Long.rotateRight(j10, i10));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final byte r(byte b10, int i10) {
        return a2.l(q0.b1(b10, i10));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final int s(int i10, int i11) {
        return e2.l(Integer.rotateRight(i10, i11));
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final short t(short s10, int i10) {
        return p2.l(q0.c1(s10, i10));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final byte u(byte b10) {
        return a2.l((byte) Integer.highestOneBit(b10 & 255));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final long v(long j10) {
        return j2.l(Long.highestOneBit(j10));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final int w(int i10) {
        return e2.l(Integer.highestOneBit(i10));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final short x(short s10) {
        return p2.l((short) Integer.highestOneBit(s10 & p2.R));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final byte y(byte b10) {
        return a2.l((byte) Integer.lowestOneBit(b10 & 255));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class, r.class})
    @f
    public static final long z(long j10) {
        return j2.l(Long.lowestOneBit(j10));
    }
}
