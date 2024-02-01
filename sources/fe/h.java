package fe;

import fh.g;
import oe.f;
import xe.l0;
import zd.h1;

public class h extends g {
    @h1(version = "1.1")
    @f
    public static final byte I(byte b10, byte b11) {
        return (byte) Math.max(b10, b11);
    }

    @h1(version = "1.1")
    @f
    public static final byte J(byte b10, byte b11, byte b12) {
        return (byte) Math.max(b10, Math.max(b11, b12));
    }

    @h1(version = "1.4")
    public static final byte K(byte b10, @g byte... bArr) {
        l0.p(bArr, "other");
        for (byte max : bArr) {
            b10 = (byte) Math.max(b10, max);
        }
        return b10;
    }

    @h1(version = "1.1")
    @f
    public static final double L(double d10, double d11) {
        return Math.max(d10, d11);
    }

    @h1(version = "1.1")
    @f
    public static final double M(double d10, double d11, double d12) {
        return Math.max(d10, Math.max(d11, d12));
    }

    @h1(version = "1.4")
    public static final double N(double d10, @g double... dArr) {
        l0.p(dArr, "other");
        for (double max : dArr) {
            d10 = Math.max(d10, max);
        }
        return d10;
    }

    @h1(version = "1.1")
    @f
    public static final float O(float f10, float f11) {
        return Math.max(f10, f11);
    }

    @h1(version = "1.1")
    @f
    public static final float P(float f10, float f11, float f12) {
        return Math.max(f10, Math.max(f11, f12));
    }

    @h1(version = "1.4")
    public static final float Q(float f10, @g float... fArr) {
        l0.p(fArr, "other");
        for (float max : fArr) {
            f10 = Math.max(f10, max);
        }
        return f10;
    }

    @h1(version = "1.1")
    @f
    public static final int R(int i10, int i11) {
        return Math.max(i10, i11);
    }

    @h1(version = "1.1")
    @f
    public static final int S(int i10, int i11, int i12) {
        return Math.max(i10, Math.max(i11, i12));
    }

    @h1(version = "1.4")
    public static final int T(int i10, @g int... iArr) {
        l0.p(iArr, "other");
        for (int max : iArr) {
            i10 = Math.max(i10, max);
        }
        return i10;
    }

    @h1(version = "1.1")
    @f
    public static final long U(long j10, long j11) {
        return Math.max(j10, j11);
    }

    @h1(version = "1.1")
    @f
    public static final long V(long j10, long j11, long j12) {
        return Math.max(j10, Math.max(j11, j12));
    }

    @h1(version = "1.4")
    public static final long W(long j10, @g long... jArr) {
        l0.p(jArr, "other");
        for (long max : jArr) {
            j10 = Math.max(j10, max);
        }
        return j10;
    }

    @g
    @h1(version = "1.1")
    public static final <T extends Comparable<? super T>> T X(@g T t10, @g T t11) {
        l0.p(t10, "a");
        l0.p(t11, p7.f.f11703n);
        return t10.compareTo(t11) >= 0 ? t10 : t11;
    }

    @g
    @h1(version = "1.1")
    public static final <T extends Comparable<? super T>> T Y(@g T t10, @g T t11, @g T t12) {
        l0.p(t10, "a");
        l0.p(t11, p7.f.f11703n);
        l0.p(t12, p7.f.f11706q);
        return X(t10, X(t11, t12));
    }

    @g
    @h1(version = "1.4")
    public static final <T extends Comparable<? super T>> T Z(@g T t10, @g T... tArr) {
        l0.p(t10, "a");
        l0.p(tArr, "other");
        for (T X : tArr) {
            t10 = X(t10, X);
        }
        return t10;
    }

    @h1(version = "1.1")
    @f
    public static final short a0(short s10, short s11) {
        return (short) Math.max(s10, s11);
    }

    @h1(version = "1.1")
    @f
    public static final short b0(short s10, short s11, short s12) {
        return (short) Math.max(s10, Math.max(s11, s12));
    }

    @h1(version = "1.4")
    public static final short c0(short s10, @g short... sArr) {
        l0.p(sArr, "other");
        for (short max : sArr) {
            s10 = (short) Math.max(s10, max);
        }
        return s10;
    }

    @h1(version = "1.1")
    @f
    public static final byte d0(byte b10, byte b11) {
        return (byte) Math.min(b10, b11);
    }

    @h1(version = "1.1")
    @f
    public static final byte e0(byte b10, byte b11, byte b12) {
        return (byte) Math.min(b10, Math.min(b11, b12));
    }

    @h1(version = "1.4")
    public static final byte f0(byte b10, @g byte... bArr) {
        l0.p(bArr, "other");
        for (byte min : bArr) {
            b10 = (byte) Math.min(b10, min);
        }
        return b10;
    }

    @h1(version = "1.1")
    @f
    public static final double g0(double d10, double d11) {
        return Math.min(d10, d11);
    }

    @h1(version = "1.1")
    @f
    public static final double h0(double d10, double d11, double d12) {
        return Math.min(d10, Math.min(d11, d12));
    }

    @h1(version = "1.4")
    public static final double i0(double d10, @g double... dArr) {
        l0.p(dArr, "other");
        for (double min : dArr) {
            d10 = Math.min(d10, min);
        }
        return d10;
    }

    @h1(version = "1.1")
    @f
    public static final float j0(float f10, float f11) {
        return Math.min(f10, f11);
    }

    @h1(version = "1.1")
    @f
    public static final float k0(float f10, float f11, float f12) {
        return Math.min(f10, Math.min(f11, f12));
    }

    @h1(version = "1.4")
    public static final float l0(float f10, @g float... fArr) {
        l0.p(fArr, "other");
        for (float min : fArr) {
            f10 = Math.min(f10, min);
        }
        return f10;
    }

    @h1(version = "1.1")
    @f
    public static final int m0(int i10, int i11) {
        return Math.min(i10, i11);
    }

    @h1(version = "1.1")
    @f
    public static final int n0(int i10, int i11, int i12) {
        return Math.min(i10, Math.min(i11, i12));
    }

    @h1(version = "1.4")
    public static final int o0(int i10, @g int... iArr) {
        l0.p(iArr, "other");
        for (int min : iArr) {
            i10 = Math.min(i10, min);
        }
        return i10;
    }

    @h1(version = "1.1")
    @f
    public static final long p0(long j10, long j11) {
        return Math.min(j10, j11);
    }

    @h1(version = "1.1")
    @f
    public static final long q0(long j10, long j11, long j12) {
        return Math.min(j10, Math.min(j11, j12));
    }

    @h1(version = "1.4")
    public static final long r0(long j10, @g long... jArr) {
        l0.p(jArr, "other");
        for (long min : jArr) {
            j10 = Math.min(j10, min);
        }
        return j10;
    }

    @g
    @h1(version = "1.1")
    public static final <T extends Comparable<? super T>> T s0(@g T t10, @g T t11) {
        l0.p(t10, "a");
        l0.p(t11, p7.f.f11703n);
        return t10.compareTo(t11) <= 0 ? t10 : t11;
    }

    @g
    @h1(version = "1.1")
    public static final <T extends Comparable<? super T>> T t0(@g T t10, @g T t11, @g T t12) {
        l0.p(t10, "a");
        l0.p(t11, p7.f.f11703n);
        l0.p(t12, p7.f.f11706q);
        return s0(t10, s0(t11, t12));
    }

    @g
    @h1(version = "1.4")
    public static final <T extends Comparable<? super T>> T u0(@g T t10, @g T... tArr) {
        l0.p(t10, "a");
        l0.p(tArr, "other");
        for (T s02 : tArr) {
            t10 = s0(t10, s02);
        }
        return t10;
    }

    @h1(version = "1.1")
    @f
    public static final short v0(short s10, short s11) {
        return (short) Math.min(s10, s11);
    }

    @h1(version = "1.1")
    @f
    public static final short w0(short s10, short s11, short s12) {
        return (short) Math.min(s10, Math.min(s11, s12));
    }

    @h1(version = "1.4")
    public static final short x0(short s10, @g short... sArr) {
        l0.p(sArr, "other");
        for (short min : sArr) {
            s10 = (short) Math.min(s10, min);
        }
        return s10;
    }
}
