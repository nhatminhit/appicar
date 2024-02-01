package ef;

import fh.g;
import gf.b0;
import gf.y;
import xe.l0;
import zd.b2;
import zd.e2;
import zd.h1;
import zd.j2;
import zd.t;
import zd.y2;

public final class h {
    public static final void a(int i10, int i11) {
        if (!(Integer.compare(i11 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) > 0)) {
            throw new IllegalArgumentException(g.c(e2.b(i10), e2.b(i11)).toString());
        }
    }

    public static final void b(long j10, long j11) {
        if (!(Long.compare(j11 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) > 0)) {
            throw new IllegalArgumentException(g.c(j2.b(j10), j2.b(j11)).toString());
        }
    }

    @g
    @h1(version = "1.3")
    @t
    public static final byte[] c(@g f fVar, int i10) {
        l0.p(fVar, "<this>");
        return b2.f(fVar.d(i10));
    }

    @g
    @h1(version = "1.3")
    @t
    public static final byte[] d(@g f fVar, @g byte[] bArr) {
        l0.p(fVar, "$this$nextUBytes");
        l0.p(bArr, "array");
        fVar.e(bArr);
        return bArr;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final byte[] e(@g f fVar, @g byte[] bArr, int i10, int i11) {
        l0.p(fVar, "$this$nextUBytes");
        l0.p(bArr, "array");
        fVar.f(bArr, i10, i11);
        return bArr;
    }

    public static /* synthetic */ byte[] f(f fVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = b2.r(bArr);
        }
        return e(fVar, bArr, i10, i11);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int g(@g f fVar) {
        l0.p(fVar, "<this>");
        return e2.l(fVar.l());
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int h(@g f fVar, @g y yVar) {
        l0.p(fVar, "<this>");
        l0.p(yVar, "range");
        if (!yVar.isEmpty()) {
            return Integer.compare(yVar.m() ^ Integer.MIN_VALUE, -1 ^ Integer.MIN_VALUE) < 0 ? i(fVar, yVar.l(), e2.l(yVar.m() + 1)) : Integer.compare(yVar.l() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0 ? e2.l(i(fVar, e2.l(yVar.l() - 1), yVar.m()) + 1) : g(fVar);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + yVar);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int i(@g f fVar, int i10, int i11) {
        l0.p(fVar, "$this$nextUInt");
        a(i10, i11);
        return e2.l(fVar.n(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int j(@g f fVar, int i10) {
        l0.p(fVar, "$this$nextUInt");
        return i(fVar, 0, i10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long k(@g f fVar) {
        l0.p(fVar, "<this>");
        return j2.l(fVar.o());
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long l(@g f fVar, @g b0 b0Var) {
        l0.p(fVar, "<this>");
        l0.p(b0Var, "range");
        if (!b0Var.isEmpty()) {
            int a10 = Long.compare(b0Var.m() ^ Long.MIN_VALUE, -1 ^ Long.MIN_VALUE);
            long l10 = b0Var.l();
            if (a10 < 0) {
                return n(fVar, l10, j2.l(b0Var.m() + j2.l(((long) 1) & 4294967295L)));
            }
            if (Long.compare(l10 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
                return k(fVar);
            }
            long j10 = ((long) 1) & 4294967295L;
            return j2.l(n(fVar, j2.l(b0Var.l() - j2.l(j10)), b0Var.m()) + j2.l(j10));
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + b0Var);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long m(@g f fVar, long j10) {
        l0.p(fVar, "$this$nextULong");
        return n(fVar, 0, j10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long n(@g f fVar, long j10, long j11) {
        l0.p(fVar, "$this$nextULong");
        b(j10, j11);
        return j2.l(fVar.q(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
