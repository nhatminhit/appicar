package cf;

import oe.f;
import zd.h1;
import zd.r;
import zd.y2;

public class d extends c {
    @h1(version = "1.2")
    @f
    public static final double A(double d10) {
        return Math.cos(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double A0(double d10, double d11) {
        return Math.nextAfter(d10, d11);
    }

    @h1(version = "1.2")
    @f
    public static final float B(float f10) {
        return (float) Math.cos((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final float B0(float f10, float f11) {
        return Math.nextAfter(f10, (double) f11);
    }

    @h1(version = "1.2")
    @f
    public static final double C(double d10) {
        return Math.cosh(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double C0(double d10) {
        return Math.nextUp(d10);
    }

    @h1(version = "1.2")
    @f
    public static final float D(float f10) {
        return (float) Math.cosh((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final float D0(float f10) {
        return Math.nextUp(f10);
    }

    @h1(version = "1.2")
    @f
    public static final double E(double d10) {
        return Math.exp(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double E0(double d10, double d11) {
        return Math.pow(d10, d11);
    }

    @h1(version = "1.2")
    @f
    public static final float F(float f10) {
        return (float) Math.exp((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final double F0(double d10, int i10) {
        return Math.pow(d10, (double) i10);
    }

    @h1(version = "1.2")
    @f
    public static final double G(double d10) {
        return Math.expm1(d10);
    }

    @h1(version = "1.2")
    @f
    public static final float G0(float f10, float f11) {
        return (float) Math.pow((double) f10, (double) f11);
    }

    @h1(version = "1.2")
    @f
    public static final float H(float f10) {
        return (float) Math.expm1((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final float H0(float f10, int i10) {
        return (float) Math.pow((double) f10, (double) i10);
    }

    @h1(version = "1.2")
    @f
    public static final double I(double d10) {
        return Math.floor(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double I0(double d10) {
        return Math.rint(d10);
    }

    @h1(version = "1.2")
    @f
    public static final float J(float f10) {
        return (float) Math.floor((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final float J0(float f10) {
        return (float) Math.rint((double) f10);
    }

    public static final double K(double d10) {
        return Math.abs(d10);
    }

    @h1(version = "1.2")
    public static final int K0(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d10 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d10);
        }
    }

    public static final float L(float f10) {
        return Math.abs(f10);
    }

    @h1(version = "1.2")
    public static final int L0(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final int M(int i10) {
        return Math.abs(i10);
    }

    @h1(version = "1.2")
    public static final long M0(double d10) {
        if (!Double.isNaN(d10)) {
            return Math.round(d10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final long N(long j10) {
        return Math.abs(j10);
    }

    @h1(version = "1.2")
    public static final long N0(float f10) {
        return M0((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static /* synthetic */ void O(double d10) {
    }

    @h1(version = "1.2")
    @f
    public static final double O0(double d10) {
        return Math.signum(d10);
    }

    @h1(version = "1.2")
    @f
    public static /* synthetic */ void P(float f10) {
    }

    @h1(version = "1.2")
    @f
    public static final float P0(float f10) {
        return Math.signum(f10);
    }

    @h1(version = "1.2")
    @f
    public static /* synthetic */ void Q(int i10) {
    }

    @h1(version = "1.2")
    @f
    public static final double Q0(double d10) {
        return Math.sin(d10);
    }

    @h1(version = "1.2")
    @f
    public static /* synthetic */ void R(long j10) {
    }

    @h1(version = "1.2")
    @f
    public static final float R0(float f10) {
        return (float) Math.sin((double) f10);
    }

    public static final double S(double d10) {
        return Math.signum(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double S0(double d10) {
        return Math.sinh(d10);
    }

    public static final float T(float f10) {
        return Math.signum(f10);
    }

    @h1(version = "1.2")
    @f
    public static final float T0(float f10) {
        return (float) Math.sinh((double) f10);
    }

    public static final int U(int i10) {
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    @h1(version = "1.2")
    @f
    public static final double U0(double d10) {
        return Math.sqrt(d10);
    }

    public static final int V(long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    @h1(version = "1.2")
    @f
    public static final float V0(float f10) {
        return (float) Math.sqrt((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static /* synthetic */ void W(double d10) {
    }

    @h1(version = "1.2")
    @f
    public static final double W0(double d10) {
        return Math.tan(d10);
    }

    @h1(version = "1.2")
    @f
    public static /* synthetic */ void X(float f10) {
    }

    @h1(version = "1.2")
    @f
    public static final float X0(float f10) {
        return (float) Math.tan((double) f10);
    }

    @h1(version = "1.2")
    public static /* synthetic */ void Y(int i10) {
    }

    @h1(version = "1.2")
    @f
    public static final double Y0(double d10) {
        return Math.tanh(d10);
    }

    @h1(version = "1.2")
    public static /* synthetic */ void Z(long j10) {
    }

    @h1(version = "1.2")
    @f
    public static final float Z0(float f10) {
        return (float) Math.tanh((double) f10);
    }

    public static final double a0(double d10) {
        return Math.ulp(d10);
    }

    @h1(version = "1.2")
    public static final double a1(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10)) ? d10 : d10 > 0.0d ? Math.floor(d10) : Math.ceil(d10);
    }

    public static final float b0(float f10) {
        return Math.ulp(f10);
    }

    @h1(version = "1.2")
    public static final float b1(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            return f10;
        }
        return (float) (f10 > 0.0f ? Math.floor((double) f10) : Math.ceil((double) f10));
    }

    @h1(version = "1.2")
    @f
    public static final double c(double d10, double d11) {
        return Math.IEEEremainder(d10, d11);
    }

    @h1(version = "1.2")
    @f
    public static /* synthetic */ void c0(double d10) {
    }

    @h1(version = "1.2")
    @f
    public static final double c1(double d10, double d11) {
        return Math.copySign(d10, d11);
    }

    @h1(version = "1.2")
    @f
    public static final float d(float f10, float f11) {
        return (float) Math.IEEEremainder((double) f10, (double) f11);
    }

    @h1(version = "1.2")
    @f
    public static /* synthetic */ void d0(float f10) {
    }

    @h1(version = "1.2")
    @f
    public static final double d1(double d10, int i10) {
        return Math.copySign(d10, (double) i10);
    }

    @h1(version = "1.2")
    @f
    public static final double e(double d10) {
        return Math.abs(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double e0(double d10, double d11) {
        return Math.hypot(d10, d11);
    }

    @h1(version = "1.2")
    @f
    public static final float e1(float f10, float f11) {
        return Math.copySign(f10, f11);
    }

    @h1(version = "1.2")
    @f
    public static final float f(float f10) {
        return Math.abs(f10);
    }

    @h1(version = "1.2")
    @f
    public static final float f0(float f10, float f11) {
        return (float) Math.hypot((double) f10, (double) f11);
    }

    @h1(version = "1.2")
    @f
    public static final float f1(float f10, int i10) {
        return Math.copySign(f10, (float) i10);
    }

    @h1(version = "1.2")
    @f
    public static final int g(int i10) {
        return Math.abs(i10);
    }

    @h1(version = "1.2")
    @f
    public static final double g0(double d10) {
        return Math.log(d10);
    }

    @h1(version = "1.2")
    @f
    public static final long h(long j10) {
        return Math.abs(j10);
    }

    @h1(version = "1.2")
    @f
    public static final float h0(float f10) {
        return (float) Math.log((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final double i(double d10) {
        return Math.acos(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double i0(double d10) {
        return Math.log1p(d10);
    }

    @h1(version = "1.2")
    @f
    public static final float j(float f10) {
        return (float) Math.acos((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final float j0(float f10) {
        return (float) Math.log1p((double) f10);
    }

    @h1(version = "1.2")
    public static final double k(double d10) {
        if (d10 < 1.0d) {
            return Double.NaN;
        }
        if (d10 > a.f16396f) {
            return Math.log(d10) + a.f16392b;
        }
        double d11 = (double) 1;
        double d12 = d10 - d11;
        if (d12 >= a.f16395e) {
            return Math.log(d10 + Math.sqrt((d10 * d10) - d11));
        }
        double sqrt = Math.sqrt(d12);
        if (sqrt >= a.f16394d) {
            sqrt -= ((sqrt * sqrt) * sqrt) / ((double) 12);
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @h1(version = "1.2")
    public static final double k0(double d10, double d11) {
        if (d11 <= 0.0d) {
            return Double.NaN;
        }
        if (d11 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d10) / Math.log(d11);
    }

    @h1(version = "1.2")
    @f
    public static final float l(float f10) {
        return (float) k((double) f10);
    }

    @h1(version = "1.2")
    public static final float l0(float f10, float f11) {
        if (f11 <= 0.0f) {
            return Float.NaN;
        }
        if (f11 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log((double) f10) / Math.log((double) f11));
    }

    @h1(version = "1.2")
    @f
    public static final double m(double d10) {
        return Math.asin(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double m0(double d10) {
        return Math.log10(d10);
    }

    @h1(version = "1.2")
    @f
    public static final float n(float f10) {
        return (float) Math.asin((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final float n0(float f10) {
        return (float) Math.log10((double) f10);
    }

    @h1(version = "1.2")
    public static final double o(double d10) {
        double d11;
        double d12 = a.f16395e;
        if (d10 < d12) {
            return d10 <= (-d12) ? -o(-d10) : Math.abs(d10) >= a.f16394d ? d10 - (((d10 * d10) * d10) / ((double) 6)) : d10;
        }
        if (d10 <= a.f16397g) {
            d11 = Math.sqrt((d10 * d10) + ((double) 1));
        } else if (d10 > a.f16396f) {
            return Math.log(d10) + a.f16392b;
        } else {
            d10 *= (double) 2;
            d11 = ((double) 1) / d10;
        }
        return Math.log(d10 + d11);
    }

    @h1(version = "1.2")
    public static final double o0(double d10) {
        return Math.log(d10) / a.f16392b;
    }

    @h1(version = "1.2")
    @f
    public static final float p(float f10) {
        return (float) o((double) f10);
    }

    @h1(version = "1.2")
    public static final float p0(float f10) {
        return (float) (Math.log((double) f10) / a.f16392b);
    }

    @h1(version = "1.2")
    @f
    public static final double q(double d10) {
        return Math.atan(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double q0(double d10, double d11) {
        return Math.max(d10, d11);
    }

    @h1(version = "1.2")
    @f
    public static final float r(float f10) {
        return (float) Math.atan((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final float r0(float f10, float f11) {
        return Math.max(f10, f11);
    }

    @h1(version = "1.2")
    @f
    public static final double s(double d10, double d11) {
        return Math.atan2(d10, d11);
    }

    @h1(version = "1.2")
    @f
    public static final int s0(int i10, int i11) {
        return Math.max(i10, i11);
    }

    @h1(version = "1.2")
    @f
    public static final float t(float f10, float f11) {
        return (float) Math.atan2((double) f10, (double) f11);
    }

    @h1(version = "1.2")
    @f
    public static final long t0(long j10, long j11) {
        return Math.max(j10, j11);
    }

    @h1(version = "1.2")
    public static final double u(double d10) {
        if (Math.abs(d10) < a.f16395e) {
            return Math.abs(d10) > a.f16394d ? d10 + (((d10 * d10) * d10) / ((double) 3)) : d10;
        }
        double d11 = (double) 1;
        return Math.log((d11 + d10) / (d11 - d10)) / ((double) 2);
    }

    @h1(version = "1.2")
    @f
    public static final double u0(double d10, double d11) {
        return Math.min(d10, d11);
    }

    @h1(version = "1.2")
    @f
    public static final float v(float f10) {
        return (float) u((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final float v0(float f10, float f11) {
        return Math.min(f10, f11);
    }

    @h1(version = "1.8")
    @y2(markerClass = {r.class})
    @f
    public static final double w(double d10) {
        return Math.cbrt(d10);
    }

    @h1(version = "1.2")
    @f
    public static final int w0(int i10, int i11) {
        return Math.min(i10, i11);
    }

    @h1(version = "1.8")
    @y2(markerClass = {r.class})
    @f
    public static final float x(float f10) {
        return (float) Math.cbrt((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final long x0(long j10, long j11) {
        return Math.min(j10, j11);
    }

    @h1(version = "1.2")
    @f
    public static final double y(double d10) {
        return Math.ceil(d10);
    }

    @h1(version = "1.2")
    @f
    public static final double y0(double d10) {
        return Math.nextAfter(d10, Double.NEGATIVE_INFINITY);
    }

    @h1(version = "1.2")
    @f
    public static final float z(float f10) {
        return (float) Math.ceil((double) f10);
    }

    @h1(version = "1.2")
    @f
    public static final float z0(float f10) {
        return Math.nextAfter(f10, Double.NEGATIVE_INFINITY);
    }
}
