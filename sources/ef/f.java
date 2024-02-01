package ef;

import fh.g;
import java.io.Serializable;
import oe.m;
import xe.l0;
import xe.w;
import zd.h1;

@h1(version = "1.3")
public abstract class f {
    @g
    public static final a O = new a((w) null);
    @g
    public static final f P = m.f21456a.b();

    public static final class a extends f implements Serializable {

        /* renamed from: ef.f$a$a  reason: collision with other inner class name */
        public static final class C0300a implements Serializable {
            @g
            public static final C0300a O = new C0300a();
            public static final long P = 0;

            public final Object a() {
                return f.O;
            }
        }

        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public int b(int i10) {
            return f.P.b(i10);
        }

        public boolean c() {
            return f.P.c();
        }

        @g
        public byte[] d(int i10) {
            return f.P.d(i10);
        }

        @g
        public byte[] e(@g byte[] bArr) {
            l0.p(bArr, "array");
            return f.P.e(bArr);
        }

        @g
        public byte[] f(@g byte[] bArr, int i10, int i11) {
            l0.p(bArr, "array");
            return f.P.f(bArr, i10, i11);
        }

        public double h() {
            return f.P.h();
        }

        public double i(double d10) {
            return f.P.i(d10);
        }

        public double j(double d10, double d11) {
            return f.P.j(d10, d11);
        }

        public float k() {
            return f.P.k();
        }

        public int l() {
            return f.P.l();
        }

        public int m(int i10) {
            return f.P.m(i10);
        }

        public int n(int i10, int i11) {
            return f.P.n(i10, i11);
        }

        public long o() {
            return f.P.o();
        }

        public long p(long j10) {
            return f.P.p(j10);
        }

        public long q(long j10, long j11) {
            return f.P.q(j10, j11);
        }

        public final Object r() {
            return C0300a.O;
        }
    }

    public static /* synthetic */ byte[] g(f fVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return fVar.f(bArr, i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int b(int i10);

    public boolean c() {
        return b(1) != 0;
    }

    @g
    public byte[] d(int i10) {
        return e(new byte[i10]);
    }

    @g
    public byte[] e(@g byte[] bArr) {
        l0.p(bArr, "array");
        return f(bArr, 0, bArr.length);
    }

    @g
    public byte[] f(@g byte[] bArr, int i10, int i11) {
        l0.p(bArr, "array");
        boolean z10 = true;
        if (new gf.m(0, bArr.length).q(i10) && new gf.m(0, bArr.length).q(i11)) {
            if (i10 > i11) {
                z10 = false;
            }
            if (z10) {
                int i12 = (i11 - i10) / 4;
                for (int i13 = 0; i13 < i12; i13++) {
                    int l10 = l();
                    bArr[i10] = (byte) l10;
                    bArr[i10 + 1] = (byte) (l10 >>> 8);
                    bArr[i10 + 2] = (byte) (l10 >>> 16);
                    bArr[i10 + 3] = (byte) (l10 >>> 24);
                    i10 += 4;
                }
                int i14 = i11 - i10;
                int b10 = b(i14 * 8);
                for (int i15 = 0; i15 < i14; i15++) {
                    bArr[i10 + i15] = (byte) (b10 >>> (i15 * 8));
                }
                return bArr;
            }
            throw new IllegalArgumentException(("fromIndex (" + i10 + ") must be not greater than toIndex (" + i11 + ").").toString());
        }
        throw new IllegalArgumentException(("fromIndex (" + i10 + ") or toIndex (" + i11 + ") are out of range: 0.." + bArr.length + '.').toString());
    }

    public double h() {
        return e.d(b(26), b(27));
    }

    public double i(double d10) {
        return j(0.0d, d10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double j(double r7, double r9) {
        /*
            r6 = this;
            ef.g.d(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L_0x003d
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L_0x001b
            r2 = r3
            goto L_0x001c
        L_0x001b:
            r2 = r4
        L_0x001c:
            if (r2 == 0) goto L_0x003d
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L_0x002b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r3 = r4
        L_0x002c:
            if (r3 == 0) goto L_0x003d
            double r0 = r6.h()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L_0x0043
        L_0x003d:
            double r2 = r6.h()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L_0x0043:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L_0x004d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.f.j(double, double):double");
    }

    public float k() {
        return ((float) b(24)) / 1.6777216E7f;
    }

    public int l() {
        return b(32);
    }

    public int m(int i10) {
        return n(0, i10);
    }

    public int n(int i10, int i11) {
        int i12;
        int l10;
        int i13;
        int l11;
        boolean z10;
        g.e(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i12 = b(g.g(i14));
            } else {
                do {
                    l10 = l() >>> 1;
                    i13 = l10 % i14;
                } while ((l10 - i13) + (i14 - 1) < 0);
                i12 = i13;
            }
            return i10 + i12;
        }
        do {
            l11 = l();
            z10 = false;
            if (i10 <= l11 && l11 < i11) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return l11;
    }

    public long o() {
        return (((long) l()) << 32) + ((long) l());
    }

    public long p(long j10) {
        return q(0, j10);
    }

    public long q(long j10, long j11) {
        long o10;
        boolean z10;
        long j12;
        long o11;
        long j13;
        int l10;
        g.f(j10, j11);
        long j14 = j11 - j10;
        if (j14 > 0) {
            if (((-j14) & j14) == j14) {
                int i10 = (int) j14;
                int i11 = (int) (j14 >>> 32);
                if (i10 != 0) {
                    l10 = b(g.g(i10));
                } else if (i11 == 1) {
                    l10 = l();
                } else {
                    j12 = (((long) b(g.g(i11))) << 32) + (((long) l()) & 4294967295L);
                }
                j12 = ((long) l10) & 4294967295L;
            } else {
                do {
                    o11 = o() >>> 1;
                    j13 = o11 % j14;
                } while ((o11 - j13) + (j14 - 1) < 0);
                j12 = j13;
            }
            return j10 + j12;
        }
        do {
            o10 = o();
            z10 = false;
            if (j10 <= o10 && o10 < j11) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return o10;
    }
}
