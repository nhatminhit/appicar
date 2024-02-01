package be;

import fh.g;
import xe.l0;
import zd.b2;
import zd.f2;
import zd.k2;
import zd.p2;
import zd.q2;
import zd.t;

public final class r1 {
    @t
    public static final int a(long[] jArr, int i10, int i11) {
        long p10 = k2.p(jArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Long.compare(k2.p(jArr, i10) ^ Long.MIN_VALUE, p10 ^ Long.MIN_VALUE) < 0) {
                i10++;
            }
            while (Long.compare(k2.p(jArr, i11) ^ Long.MIN_VALUE, p10 ^ Long.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long p11 = k2.p(jArr, i10);
                k2.w(jArr, i10, k2.p(jArr, i11));
                k2.w(jArr, i11, p11);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @t
    public static final int b(byte[] bArr, int i10, int i11) {
        byte b10;
        byte p10 = b2.p(bArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                b10 = p10 & 255;
                if (l0.t(b2.p(bArr, i10) & 255, b10) >= 0) {
                    break;
                }
                i10++;
            }
            while (l0.t(b2.p(bArr, i11) & 255, b10) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte p11 = b2.p(bArr, i10);
                b2.w(bArr, i10, b2.p(bArr, i11));
                b2.w(bArr, i11, p11);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @t
    public static final int c(short[] sArr, int i10, int i11) {
        short s10;
        short p10 = q2.p(sArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                short p11 = q2.p(sArr, i10) & p2.R;
                s10 = p10 & p2.R;
                if (l0.t(p11, s10) >= 0) {
                    break;
                }
                i10++;
            }
            while (l0.t(q2.p(sArr, i11) & p2.R, s10) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short p12 = q2.p(sArr, i10);
                q2.w(sArr, i10, q2.p(sArr, i11));
                q2.w(sArr, i11, p12);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @t
    public static final int d(int[] iArr, int i10, int i11) {
        int p10 = f2.p(iArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Integer.compare(f2.p(iArr, i10) ^ Integer.MIN_VALUE, p10 ^ Integer.MIN_VALUE) < 0) {
                i10++;
            }
            while (Integer.compare(f2.p(iArr, i11) ^ Integer.MIN_VALUE, p10 ^ Integer.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int p11 = f2.p(iArr, i10);
                f2.w(iArr, i10, f2.p(iArr, i11));
                f2.w(iArr, i11, p11);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @t
    public static final void e(long[] jArr, int i10, int i11) {
        int a10 = a(jArr, i10, i11);
        int i12 = a10 - 1;
        if (i10 < i12) {
            e(jArr, i10, i12);
        }
        if (a10 < i11) {
            e(jArr, a10, i11);
        }
    }

    @t
    public static final void f(byte[] bArr, int i10, int i11) {
        int b10 = b(bArr, i10, i11);
        int i12 = b10 - 1;
        if (i10 < i12) {
            f(bArr, i10, i12);
        }
        if (b10 < i11) {
            f(bArr, b10, i11);
        }
    }

    @t
    public static final void g(short[] sArr, int i10, int i11) {
        int c10 = c(sArr, i10, i11);
        int i12 = c10 - 1;
        if (i10 < i12) {
            g(sArr, i10, i12);
        }
        if (c10 < i11) {
            g(sArr, c10, i11);
        }
    }

    @t
    public static final void h(int[] iArr, int i10, int i11) {
        int d10 = d(iArr, i10, i11);
        int i12 = d10 - 1;
        if (i10 < i12) {
            h(iArr, i10, i12);
        }
        if (d10 < i11) {
            h(iArr, d10, i11);
        }
    }

    @t
    public static final void i(@g long[] jArr, int i10, int i11) {
        l0.p(jArr, "array");
        e(jArr, i10, i11 - 1);
    }

    @t
    public static final void j(@g byte[] bArr, int i10, int i11) {
        l0.p(bArr, "array");
        f(bArr, i10, i11 - 1);
    }

    @t
    public static final void k(@g short[] sArr, int i10, int i11) {
        l0.p(sArr, "array");
        g(sArr, i10, i11 - 1);
    }

    @t
    public static final void l(@g int[] iArr, int i10, int i11) {
        l0.p(iArr, "array");
        h(iArr, i10, i11 - 1);
    }
}
