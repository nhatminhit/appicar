package zd;

import fh.g;
import lf.d;
import ve.h;
import xe.l0;

@h(name = "UnsignedKt")
public final class x2 {
    @a1
    public static final int a(double d10) {
        if (Double.isNaN(d10) || d10 <= f(0)) {
            return 0;
        }
        if (d10 >= f(-1)) {
            return -1;
        }
        return e2.l(d10 <= 2.147483647E9d ? (int) d10 : e2.l((int) (d10 - ((double) Integer.MAX_VALUE))) + e2.l(Integer.MAX_VALUE));
    }

    @a1
    public static final long b(double d10) {
        if (Double.isNaN(d10) || d10 <= j(0)) {
            return 0;
        }
        if (d10 >= j(-1)) {
            return -1;
        }
        return j2.l(d10 < 9.223372036854776E18d ? (long) d10 : j2.l((long) (d10 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @a1
    public static final int c(int i10, int i11) {
        return l0.t(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    @a1
    public static final int d(int i10, int i11) {
        return e2.l((int) ((((long) i10) & 4294967295L) / (((long) i11) & 4294967295L)));
    }

    @a1
    public static final int e(int i10, int i11) {
        return e2.l((int) ((((long) i10) & 4294967295L) % (((long) i11) & 4294967295L)));
    }

    @a1
    public static final double f(int i10) {
        return ((double) (Integer.MAX_VALUE & i10)) + (((double) ((i10 >>> 31) << 30)) * ((double) 2));
    }

    @a1
    public static final int g(long j10, long j11) {
        return l0.u(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    @a1
    public static final long h(long j10, long j11) {
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j2.l(0) : j2.l(1);
        }
        if (j10 >= 0) {
            return j2.l(j10 / j11);
        }
        int i10 = 1;
        long j12 = ((j10 >>> 1) / j11) << 1;
        if (Long.compare(j2.l(j10 - (j12 * j11)) ^ Long.MIN_VALUE, j2.l(j11) ^ Long.MIN_VALUE) < 0) {
            i10 = 0;
        }
        return j2.l(j12 + ((long) i10));
    }

    @a1
    public static final long i(long j10, long j11) {
        long j12;
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j10 : j2.l(j10 - j11);
        }
        if (j10 >= 0) {
            j12 = j10 % j11;
        } else {
            long j13 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
            if (Long.compare(j2.l(j13) ^ Long.MIN_VALUE, j2.l(j11) ^ Long.MIN_VALUE) < 0) {
                j11 = 0;
            }
            j12 = j13 - j11;
        }
        return j2.l(j12);
    }

    @a1
    public static final double j(long j10) {
        return (((double) (j10 >>> 11)) * ((double) 2048)) + ((double) (j10 & 2047));
    }

    @g
    public static final String k(long j10) {
        return l(j10, 10);
    }

    @g
    public static final String l(long j10, int i10) {
        if (j10 >= 0) {
            String l10 = Long.toString(j10, d.a(i10));
            l0.o(l10, "toString(this, checkRadix(radix))");
            return l10;
        }
        long j11 = (long) i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l11 = Long.toString(j12, d.a(i10));
        l0.o(l11, "toString(this, checkRadix(radix))");
        sb2.append(l11);
        String l12 = Long.toString(j13, d.a(i10));
        l0.o(l12, "toString(this, checkRadix(radix))");
        sb2.append(l12);
        return sb2.toString();
    }
}
