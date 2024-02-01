package nf;

import nf.e;

public final class m {
    public static final long a(long j10, long j11, long j12) {
        if (!e.d0(j11) || (j10 ^ j12) >= 0) {
            return j10;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    public static final boolean b(long j10) {
        return ((j10 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long c(long j10, long j11) {
        long O = e.O(j11);
        boolean z10 = true;
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            return a(j10, j11, O);
        }
        if ((1 | (O - 1)) != Long.MAX_VALUE) {
            z10 = false;
        }
        if (z10) {
            return d(j10, j11);
        }
        long j12 = j10 + O;
        return ((j10 ^ j12) & (O ^ j12)) < 0 ? j10 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j12;
    }

    public static final long d(long j10, long j11) {
        long p10 = e.p(j11, 2);
        return (((e.O(p10) - 1) | 1) > Long.MAX_VALUE ? 1 : (((e.O(p10) - 1) | 1) == Long.MAX_VALUE ? 0 : -1)) == 0 ? (long) (((double) j10) + e.o0(j11, h.NANOSECONDS)) : c(c(j10, p10), e.g0(j11, p10));
    }

    public static final long e(long j10, long j11) {
        return ((1 | (j11 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j11 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? e.x0(g.n0(j11, h.DAYS)) : f(j10, j11);
    }

    public static final long f(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) < 0) {
            long j13 = (long) 1000000;
            long j14 = (j10 % j13) - (j11 % j13);
            e.a aVar = e.P;
            return e.h0(g.n0((j10 / j13) - (j11 / j13), h.MILLISECONDS), g.n0(j14, h.NANOSECONDS));
        }
        e.a aVar2 = e.P;
        return g.n0(j12, h.NANOSECONDS);
    }

    public static final long g(long j10, long j11) {
        boolean z10 = true;
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            return j10 == j11 ? e.P.W() : e.x0(g.n0(j11, h.DAYS));
        }
        if ((1 | (j10 - 1)) != Long.MAX_VALUE) {
            z10 = false;
        }
        return z10 ? g.n0(j10, h.DAYS) : f(j10, j11);
    }
}
