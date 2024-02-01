package ef;

import gf.m;
import gf.p;
import xe.l0;
import zd.h1;

public final class g {
    @fh.g
    @h1(version = "1.3")
    public static final f a(int i10) {
        return new i(i10, i10 >> 31);
    }

    @fh.g
    @h1(version = "1.3")
    public static final f b(long j10) {
        return new i((int) j10, (int) (j10 >> 32));
    }

    @fh.g
    public static final String c(@fh.g Object obj, @fh.g Object obj2) {
        l0.p(obj, "from");
        l0.p(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void d(double d10, double d11) {
        if (!(d11 > d10)) {
            throw new IllegalArgumentException(c(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }

    public static final void e(int i10, int i11) {
        if (!(i11 > i10)) {
            throw new IllegalArgumentException(c(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void f(long j10, long j11) {
        if (!(j11 > j10)) {
            throw new IllegalArgumentException(c(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int g(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    @h1(version = "1.3")
    public static final int h(@fh.g f fVar, @fh.g m mVar) {
        l0.p(fVar, "<this>");
        l0.p(mVar, "range");
        if (!mVar.isEmpty()) {
            return mVar.m() < Integer.MAX_VALUE ? fVar.n(mVar.l(), mVar.m() + 1) : mVar.l() > Integer.MIN_VALUE ? fVar.n(mVar.l() - 1, mVar.m()) + 1 : fVar.l();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + mVar);
    }

    @h1(version = "1.3")
    public static final long i(@fh.g f fVar, @fh.g p pVar) {
        l0.p(fVar, "<this>");
        l0.p(pVar, "range");
        if (!pVar.isEmpty()) {
            int i10 = (pVar.m() > Long.MAX_VALUE ? 1 : (pVar.m() == Long.MAX_VALUE ? 0 : -1));
            long l10 = pVar.l();
            return i10 < 0 ? fVar.q(l10, pVar.m() + 1) : l10 > Long.MIN_VALUE ? fVar.q(pVar.l() - 1, pVar.m()) + 1 : fVar.o();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + pVar);
    }

    public static final int j(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
