package oe;

import zd.a1;
import zd.e2;
import zd.h1;
import zd.j2;
import zd.u1;
import zd.x1;

public final class r {
    public static final int a(int i10, int i11, int i12) {
        int a10 = u1.a(i10, i12);
        int a11 = u1.a(i11, i12);
        int a12 = Integer.compare(a10 ^ Integer.MIN_VALUE, a11 ^ Integer.MIN_VALUE);
        int l10 = e2.l(a10 - a11);
        return a12 >= 0 ? l10 : e2.l(l10 + i12);
    }

    public static final long b(long j10, long j11, long j12) {
        long a10 = x1.a(j10, j12);
        long a11 = x1.a(j11, j12);
        int a12 = Long.compare(a10 ^ Long.MIN_VALUE, a11 ^ Long.MIN_VALUE);
        long l10 = j2.l(a10 - a11);
        return a12 >= 0 ? l10 : j2.l(l10 + j12);
    }

    @h1(version = "1.3")
    @a1
    public static final long c(long j10, long j11, long j12) {
        long b10;
        int i10 = (j12 > 0 ? 1 : (j12 == 0 ? 0 : -1));
        if (i10 > 0) {
            if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0) {
                return j11;
            }
            b10 = j11 - b(j11, j10, j2.l(j12));
        } else if (i10 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0) {
            return j11;
        } else {
            b10 = j11 + b(j10, j11, j2.l(-j12));
        }
        return j2.l(b10);
    }

    @h1(version = "1.3")
    @a1
    public static final int d(int i10, int i11, int i12) {
        int a10;
        if (i12 > 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) >= 0) {
                return i11;
            }
            a10 = i11 - a(i11, i10, e2.l(i12));
        } else if (i12 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) <= 0) {
            return i11;
        } else {
            a10 = i11 + a(i10, i11, e2.l(-i12));
        }
        return e2.l(a10);
    }
}
