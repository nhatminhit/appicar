package n0;

import android.graphics.Color;
import d.e0;
import d.g1;
import d.l;
import d.m0;
import d.t0;
import d.v;
import f1.w1;
import java.util.Objects;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final double f10711a = 95.047d;

    /* renamed from: b  reason: collision with root package name */
    public static final double f10712b = 100.0d;

    /* renamed from: c  reason: collision with root package name */
    public static final double f10713c = 108.883d;

    /* renamed from: d  reason: collision with root package name */
    public static final double f10714d = 0.008856d;

    /* renamed from: e  reason: collision with root package name */
    public static final double f10715e = 903.3d;

    /* renamed from: f  reason: collision with root package name */
    public static final int f10716f = 10;

    /* renamed from: g  reason: collision with root package name */
    public static final int f10717g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final ThreadLocal<double[]> f10718h = new ThreadLocal<>();

    public static double A(double d10) {
        return d10 > 0.008856d ? Math.pow(d10, 0.3333333333333333d) : ((d10 * 903.3d) + 16.0d) / 116.0d;
    }

    @l
    public static int B(@l int i10, @e0(from = 0, to = 255) int i11) {
        if (i11 >= 0 && i11 <= 255) {
            return (i10 & w1.f7299s) | (i11 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008c, code lost:
        r6 = java.lang.Math.round(r6 * 255.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a3, code lost:
        return android.graphics.Color.rgb(x(r1, 0, 255), x(r3, 0, 255), x(r6, 0, 255));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
        r6 = java.lang.Math.round((r4 + r6) * 255.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006c, code lost:
        r6 = java.lang.Math.round((r5 + r6) * 255.0f);
     */
    @d.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(@d.m0 float[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r2 = r6[r2]
            r3 = 2
            r6 = r6[r3]
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r6 * r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            float r4 = r5 - r4
            float r4 = r4 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r4
            float r6 = r6 - r2
            r2 = 1114636288(0x42700000, float:60.0)
            float r2 = r1 / r2
            float r2 = r2 % r3
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r5 = r5 - r2
            float r5 = r5 * r4
            int r1 = (int) r1
            int r1 = r1 / 60
            r2 = 1132396544(0x437f0000, float:255.0)
            switch(r1) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0073;
                case 2: goto L_0x0060;
                case 3: goto L_0x004d;
                case 4: goto L_0x0040;
                case 5: goto L_0x0033;
                case 6: goto L_0x0033;
                default: goto L_0x002f;
            }
        L_0x002f:
            r6 = r0
            r1 = r6
            r3 = r1
            goto L_0x0091
        L_0x0033:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            goto L_0x006c
        L_0x0040:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            goto L_0x0059
        L_0x004d:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
        L_0x0059:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r6 = java.lang.Math.round(r4)
            goto L_0x0091
        L_0x0060:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
        L_0x006c:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r6 = java.lang.Math.round(r5)
            goto L_0x0091
        L_0x0073:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            goto L_0x008c
        L_0x0080:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
        L_0x008c:
            float r6 = r6 * r2
            int r6 = java.lang.Math.round(r6)
        L_0x0091:
            r2 = 255(0xff, float:3.57E-43)
            int r1 = x(r1, r0, r2)
            int r3 = x(r3, r0, r2)
            int r6 = x(r6, r0, r2)
            int r6 = android.graphics.Color.rgb(r1, r3, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.f0.a(float[]):int");
    }

    @l
    public static int b(@v(from = 0.0d, to = 100.0d) double d10, @v(from = -128.0d, to = 127.0d) double d11, @v(from = -128.0d, to = 127.0d) double d12) {
        double[] z10 = z();
        c(d10, d11, d12, z10);
        return g(z10[0], z10[1], z10[2]);
    }

    public static void c(@v(from = 0.0d, to = 100.0d) double d10, @v(from = -128.0d, to = 127.0d) double d11, @v(from = -128.0d, to = 127.0d) double d12, @m0 double[] dArr) {
        double d13 = (d10 + 16.0d) / 116.0d;
        double d14 = (d11 / 500.0d) + d13;
        double d15 = d13 - (d12 / 200.0d);
        double pow = Math.pow(d14, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d14 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d10 > 7.9996247999999985d ? Math.pow(d13, 3.0d) : d10 / 903.3d;
        double pow3 = Math.pow(d15, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d15 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = pow * 95.047d;
        dArr[1] = pow2 * 100.0d;
        dArr[2] = pow3 * 108.883d;
    }

    public static void d(@e0(from = 0, to = 255) int i10, @e0(from = 0, to = 255) int i11, @e0(from = 0, to = 255) int i12, @m0 float[] fArr) {
        float f10;
        float f11;
        float f12 = ((float) i10) / 255.0f;
        float f13 = ((float) i11) / 255.0f;
        float f14 = ((float) i12) / 255.0f;
        float max = Math.max(f12, Math.max(f13, f14));
        float min = Math.min(f12, Math.min(f13, f14));
        float f15 = max - min;
        float f16 = (max + min) / 2.0f;
        if (max == min) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            f10 = max == f12 ? ((f13 - f14) / f15) % 6.0f : max == f13 ? ((f14 - f12) / f15) + 2.0f : 4.0f + ((f12 - f13) / f15);
            f11 = f15 / (1.0f - Math.abs((2.0f * f16) - 1.0f));
        }
        float f17 = (f10 * 60.0f) % 360.0f;
        if (f17 < 0.0f) {
            f17 += 360.0f;
        }
        fArr[0] = w(f17, 0.0f, 360.0f);
        fArr[1] = w(f11, 0.0f, 1.0f);
        fArr[2] = w(f16, 0.0f, 1.0f);
    }

    public static void e(@e0(from = 0, to = 255) int i10, @e0(from = 0, to = 255) int i11, @e0(from = 0, to = 255) int i12, @m0 double[] dArr) {
        f(i10, i11, i12, dArr);
        h(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void f(@e0(from = 0, to = 255) int i10, @e0(from = 0, to = 255) int i11, @e0(from = 0, to = 255) int i12, @m0 double[] dArr) {
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d10 = ((double) i10) / 255.0d;
            double pow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            double d11 = ((double) i11) / 255.0d;
            double pow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            double d12 = ((double) i12) / 255.0d;
            double pow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
            dArr2[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr2[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr2[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    @l
    public static int g(@v(from = 0.0d, to = 95.047d) double d10, @v(from = 0.0d, to = 100.0d) double d11, @v(from = 0.0d, to = 108.883d) double d12) {
        double d13 = (((3.2406d * d10) + (-1.5372d * d11)) + (-0.4986d * d12)) / 100.0d;
        double d14 = (((-0.9689d * d10) + (1.8758d * d11)) + (0.0415d * d12)) / 100.0d;
        double d15 = (((0.0557d * d10) + (-0.204d * d11)) + (1.057d * d12)) / 100.0d;
        return Color.rgb(x((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d), 0, 255));
    }

    public static void h(@v(from = 0.0d, to = 95.047d) double d10, @v(from = 0.0d, to = 100.0d) double d11, @v(from = 0.0d, to = 108.883d) double d12, @m0 double[] dArr) {
        if (dArr.length == 3) {
            double A = A(d10 / 95.047d);
            double A2 = A(d11 / 100.0d);
            double A3 = A(d12 / 108.883d);
            dArr[0] = Math.max(0.0d, (116.0d * A2) - 16.0d);
            dArr[1] = (A - A2) * 500.0d;
            dArr[2] = (A2 - A3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    @l
    public static int i(@l int i10, @l int i11, @v(from = 0.0d, to = 1.0d) float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((((float) Color.alpha(i10)) * f11) + (((float) Color.alpha(i11)) * f10)), (int) ((((float) Color.red(i10)) * f11) + (((float) Color.red(i11)) * f10)), (int) ((((float) Color.green(i10)) * f11) + (((float) Color.green(i11)) * f10)), (int) ((((float) Color.blue(i10)) * f11) + (((float) Color.blue(i11)) * f10)));
    }

    public static void j(@m0 float[] fArr, @m0 float[] fArr2, @v(from = 0.0d, to = 1.0d) float f10, @m0 float[] fArr3) {
        if (fArr3.length == 3) {
            float f11 = 1.0f - f10;
            fArr3[0] = o(fArr[0], fArr2[0], f10);
            fArr3[1] = (fArr[1] * f11) + (fArr2[1] * f10);
            fArr3[2] = (fArr[2] * f11) + (fArr2[2] * f10);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    public static void k(@m0 double[] dArr, @m0 double[] dArr2, @v(from = 0.0d, to = 1.0d) double d10, @m0 double[] dArr3) {
        if (dArr3.length == 3) {
            double d11 = 1.0d - d10;
            dArr3[0] = (dArr[0] * d11) + (dArr2[0] * d10);
            dArr3[1] = (dArr[1] * d11) + (dArr2[1] * d10);
            dArr3[2] = (dArr[2] * d11) + (dArr2[2] * d10);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    public static double l(@l int i10, @l int i11) {
        if (Color.alpha(i11) == 255) {
            if (Color.alpha(i10) < 255) {
                i10 = t(i10, i11);
            }
            double m10 = m(i10) + 0.05d;
            double m11 = m(i11) + 0.05d;
            return Math.max(m10, m11) / Math.min(m10, m11);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
    }

    @v(from = 0.0d, to = 1.0d)
    public static double m(@l int i10) {
        double[] z10 = z();
        r(i10, z10);
        return z10[1] / 100.0d;
    }

    public static int n(@l int i10, @l int i11, float f10) {
        int i12 = 255;
        if (Color.alpha(i11) == 255) {
            double d10 = (double) f10;
            if (l(B(i10, 255), i11) < d10) {
                return -1;
            }
            int i13 = 0;
            for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
                int i15 = (i13 + i12) / 2;
                if (l(B(i10, i15), i11) < d10) {
                    i13 = i15;
                } else {
                    i12 = i15;
                }
            }
            return i12;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i11));
    }

    @g1
    public static float o(float f10, float f11, float f12) {
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > f10) {
                f10 += 360.0f;
            } else {
                f11 += 360.0f;
            }
        }
        return (f10 + ((f11 - f10) * f12)) % 360.0f;
    }

    public static void p(@l int i10, @m0 float[] fArr) {
        d(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    public static void q(@l int i10, @m0 double[] dArr) {
        e(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static void r(@l int i10, @m0 double[] dArr) {
        f(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static int s(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    public static int t(@l int i10, @l int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int s10 = s(alpha2, alpha);
        return Color.argb(s10, v(Color.red(i10), alpha2, Color.red(i11), alpha, s10), v(Color.green(i10), alpha2, Color.green(i11), alpha, s10), v(Color.blue(i10), alpha2, Color.blue(i11), alpha, s10));
    }

    @t0(26)
    @m0
    public static Color u(@m0 Color color, @m0 Color color2) {
        if (Objects.equals(color.getModel(), color2.getModel())) {
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] a10 = color.getComponents();
            float[] a11 = color2.getComponents();
            float a12 = color.alpha();
            float a13 = color2.alpha() * (1.0f - a12);
            int a14 = color2.getComponentCount() - 1;
            float f10 = a12 + a13;
            a11[a14] = f10;
            if (f10 > 0.0f) {
                a12 /= f10;
                a13 /= f10;
            }
            for (int i10 = 0; i10 < a14; i10++) {
                a11[i10] = (a10[i10] * a12) + (a11[i10] * a13);
            }
            return Color.valueOf(a11, color2.getColorSpace());
        }
        throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
    }

    public static int v(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    public static float w(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    public static int x(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static double y(@m0 double[] dArr, @m0 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    public static double[] z() {
        ThreadLocal<double[]> threadLocal = f10718h;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }
}
