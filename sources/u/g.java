package u;

import java.util.Arrays;

public class g {

    /* renamed from: g  reason: collision with root package name */
    public static String f13328g = "Oscillator";

    /* renamed from: h  reason: collision with root package name */
    public static final int f13329h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f13330i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f13331j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f13332k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f13333l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f13334m = 5;

    /* renamed from: n  reason: collision with root package name */
    public static final int f13335n = 6;

    /* renamed from: a  reason: collision with root package name */
    public float[] f13336a = new float[0];

    /* renamed from: b  reason: collision with root package name */
    public double[] f13337b = new double[0];

    /* renamed from: c  reason: collision with root package name */
    public double[] f13338c;

    /* renamed from: d  reason: collision with root package name */
    public int f13339d;

    /* renamed from: e  reason: collision with root package name */
    public double f13340e = 6.283185307179586d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13341f = false;

    public void a(double d10, float f10) {
        int length = this.f13336a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f13337b, d10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f13337b = Arrays.copyOf(this.f13337b, length);
        this.f13336a = Arrays.copyOf(this.f13336a, length);
        this.f13338c = new double[length];
        double[] dArr = this.f13337b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f13337b[binarySearch] = d10;
        this.f13336a[binarySearch] = f10;
        this.f13341f = false;
    }

    public double b(double d10) {
        if (d10 <= 0.0d) {
            d10 = 1.0E-5d;
        } else if (d10 >= 1.0d) {
            d10 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f13337b, d10);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i10 = (-binarySearch) - 1;
        float[] fArr = this.f13336a;
        float f10 = fArr[i10];
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        double d11 = (double) (f10 - f11);
        double[] dArr = this.f13337b;
        double d12 = dArr[i10];
        double d13 = dArr[i11];
        double d14 = d11 / (d12 - d13);
        return (((double) f11) - (d14 * d13)) + (d10 * d14);
    }

    public double c(double d10) {
        if (d10 < 0.0d) {
            d10 = 0.0d;
        } else if (d10 > 1.0d) {
            d10 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f13337b, d10);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i10 = (-binarySearch) - 1;
        float[] fArr = this.f13336a;
        float f10 = fArr[i10];
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        double d11 = (double) (f10 - f11);
        double[] dArr = this.f13337b;
        double d12 = dArr[i10];
        double d13 = dArr[i11];
        double d14 = d11 / (d12 - d13);
        return this.f13338c[i11] + ((((double) f11) - (d14 * d13)) * (d10 - d13)) + ((d14 * ((d10 * d10) - (d13 * d13))) / 2.0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        return r10 * 2.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        return r0 * r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        return r5 * r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double d(double r10) {
        /*
            r9 = this;
            int r0 = r9.f13339d
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r0) {
                case 1: goto L_0x0060;
                case 2: goto L_0x004c;
                case 3: goto L_0x0047;
                case 4: goto L_0x0040;
                case 5: goto L_0x002c;
                case 6: goto L_0x001d;
                default: goto L_0x0009;
            }
        L_0x0009:
            double r0 = r9.f13340e
            double r2 = r9.b(r10)
            double r0 = r0 * r2
            double r2 = r9.f13340e
            double r10 = r9.c(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.cos(r2)
        L_0x001b:
            double r0 = r0 * r10
            return r0
        L_0x001d:
            double r5 = r9.b(r10)
            double r5 = r5 * r3
            double r10 = r9.c(r10)
            double r10 = r10 * r3
            double r10 = r10 + r1
            double r10 = r10 % r3
            double r10 = r10 - r1
        L_0x002a:
            double r5 = r5 * r10
            return r5
        L_0x002c:
            double r0 = r9.f13340e
            double r0 = -r0
            double r2 = r9.b(r10)
            double r0 = r0 * r2
            double r2 = r9.f13340e
            double r10 = r9.c(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.sin(r2)
            goto L_0x001b
        L_0x0040:
            double r10 = r9.b(r10)
            double r10 = -r10
        L_0x0045:
            double r10 = r10 * r1
            return r10
        L_0x0047:
            double r10 = r9.b(r10)
            goto L_0x0045
        L_0x004c:
            double r5 = r9.b(r10)
            double r5 = r5 * r3
            double r10 = r9.c(r10)
            double r10 = r10 * r3
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r10 = r10 + r7
            double r10 = r10 % r3
            double r10 = r10 - r1
            double r10 = java.lang.Math.signum(r10)
            goto L_0x002a
        L_0x0060:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u.g.d(double):double");
    }

    public double e(double d10) {
        double abs;
        switch (this.f13339d) {
            case 1:
                return Math.signum(0.5d - (c(d10) % 1.0d));
            case 2:
                abs = Math.abs((((c(d10) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c(d10) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c(d10) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f13340e * c(d10));
            case 6:
                double abs2 = 1.0d - Math.abs(((c(d10) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(this.f13340e * c(d10));
        }
        return 1.0d - abs;
    }

    public void f() {
        int i10 = 0;
        double d10 = 0.0d;
        while (true) {
            float[] fArr = this.f13336a;
            if (i10 >= fArr.length) {
                break;
            }
            d10 += (double) fArr[i10];
            i10++;
        }
        double d11 = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr2 = this.f13336a;
            if (i11 >= fArr2.length) {
                break;
            }
            int i12 = i11 - 1;
            double[] dArr = this.f13337b;
            d11 += (dArr[i11] - dArr[i12]) * ((double) ((fArr2[i12] + fArr2[i11]) / 2.0f));
            i11++;
        }
        int i13 = 0;
        while (true) {
            float[] fArr3 = this.f13336a;
            if (i13 >= fArr3.length) {
                break;
            }
            fArr3[i13] = (float) (((double) fArr3[i13]) * (d10 / d11));
            i13++;
        }
        this.f13338c[0] = 0.0d;
        int i14 = 1;
        while (true) {
            float[] fArr4 = this.f13336a;
            if (i14 < fArr4.length) {
                int i15 = i14 - 1;
                double[] dArr2 = this.f13337b;
                double d12 = dArr2[i14] - dArr2[i15];
                double[] dArr3 = this.f13338c;
                dArr3[i14] = dArr3[i15] + (d12 * ((double) ((fArr4[i15] + fArr4[i14]) / 2.0f)));
                i14++;
            } else {
                this.f13341f = true;
                return;
            }
        }
    }

    public void g(int i10) {
        this.f13339d = i10;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f13337b) + " period=" + Arrays.toString(this.f13336a);
    }
}
