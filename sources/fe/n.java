package fe;

import fh.g;
import oe.f;
import xe.l0;
import zd.b2;
import zd.f2;
import zd.h1;
import zd.k2;
import zd.p2;
import zd.q2;
import zd.t;
import zd.y2;

public class n {
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final short a(short s10, short s11) {
        return l0.t(s10 & p2.R, 65535 & s11) >= 0 ? s10 : s11;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int b(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) >= 0 ? i10 : i11;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final byte c(byte b10, byte b11) {
        return l0.t(b10 & 255, b11 & 255) >= 0 ? b10 : b11;
    }

    @h1(version = "1.4")
    @t
    public static final int d(int i10, @g int... iArr) {
        l0.p(iArr, "other");
        int r10 = f2.r(iArr);
        for (int i11 = 0; i11 < r10; i11++) {
            i10 = b(i10, f2.p(iArr, i11));
        }
        return i10;
    }

    @h1(version = "1.4")
    @t
    public static final long e(long j10, @g long... jArr) {
        l0.p(jArr, "other");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            j10 = j(j10, k2.p(jArr, i10));
        }
        return j10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final short f(short s10, short s11, short s12) {
        return a(s10, a(s11, s12));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final int g(int i10, int i11, int i12) {
        return b(i10, b(i11, i12));
    }

    @h1(version = "1.4")
    @t
    public static final byte h(byte b10, @g byte... bArr) {
        l0.p(bArr, "other");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b10 = c(b10, b2.p(bArr, i10));
        }
        return b10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final byte i(byte b10, byte b11, byte b12) {
        return c(b10, c(b11, b12));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long j(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j10 : j11;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final long k(long j10, long j11, long j12) {
        return j(j10, j(j11, j12));
    }

    @h1(version = "1.4")
    @t
    public static final short l(short s10, @g short... sArr) {
        l0.p(sArr, "other");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            s10 = a(s10, q2.p(sArr, i10));
        }
        return s10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final short m(short s10, short s11) {
        return l0.t(s10 & p2.R, 65535 & s11) <= 0 ? s10 : s11;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int n(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) <= 0 ? i10 : i11;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final byte o(byte b10, byte b11) {
        return l0.t(b10 & 255, b11 & 255) <= 0 ? b10 : b11;
    }

    @h1(version = "1.4")
    @t
    public static final int p(int i10, @g int... iArr) {
        l0.p(iArr, "other");
        int r10 = f2.r(iArr);
        for (int i11 = 0; i11 < r10; i11++) {
            i10 = n(i10, f2.p(iArr, i11));
        }
        return i10;
    }

    @h1(version = "1.4")
    @t
    public static final long q(long j10, @g long... jArr) {
        l0.p(jArr, "other");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            j10 = v(j10, k2.p(jArr, i10));
        }
        return j10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final short r(short s10, short s11, short s12) {
        return m(s10, m(s11, s12));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final int s(int i10, int i11, int i12) {
        return n(i10, n(i11, i12));
    }

    @h1(version = "1.4")
    @t
    public static final byte t(byte b10, @g byte... bArr) {
        l0.p(bArr, "other");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b10 = o(b10, b2.p(bArr, i10));
        }
        return b10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final byte u(byte b10, byte b11, byte b12) {
        return o(b10, o(b11, b12));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long v(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j10 : j11;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final long w(long j10, long j11, long j12) {
        return v(j10, v(j11, j12));
    }

    @h1(version = "1.4")
    @t
    public static final short x(short s10, @g short... sArr) {
        l0.p(sArr, "other");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            s10 = m(s10, q2.p(sArr, i10));
        }
        return s10;
    }
}
