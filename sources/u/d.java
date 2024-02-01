package u;

import java.lang.reflect.Array;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public int f13308a;

    /* renamed from: b  reason: collision with root package name */
    public a[][] f13309b;

    /* renamed from: c  reason: collision with root package name */
    public int f13310c;

    /* renamed from: d  reason: collision with root package name */
    public double[] f13311d;

    /* renamed from: e  reason: collision with root package name */
    public double f13312e;

    /* renamed from: f  reason: collision with root package name */
    public double[][] f13313f;

    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final double f13314e = 0.3333333333333333d;

        /* renamed from: f  reason: collision with root package name */
        public static final double f13315f = 0.5d;

        /* renamed from: a  reason: collision with root package name */
        public double f13316a;

        /* renamed from: b  reason: collision with root package name */
        public double f13317b;

        /* renamed from: c  reason: collision with root package name */
        public double f13318c;

        /* renamed from: d  reason: collision with root package name */
        public double f13319d;

        public a(double d10, double d11, double d12, double d13) {
            this.f13316a = d10;
            this.f13317b = d11;
            this.f13318c = d12;
            this.f13319d = d13;
        }

        public double a(double d10) {
            return (((((this.f13319d * d10) + this.f13318c) * d10) + this.f13317b) * d10) + this.f13316a;
        }

        public double b(double d10) {
            return (((this.f13319d * 0.3333333333333333d * d10) + (this.f13318c * 0.5d)) * d10) + this.f13317b;
        }
    }

    public d() {
    }

    public d(double[][] dArr) {
        g(dArr);
    }

    public static a[] b(int i10, double[] dArr) {
        int i11 = i10;
        double[] dArr2 = new double[i11];
        double[] dArr3 = new double[i11];
        double[] dArr4 = new double[i11];
        int i12 = i11 - 1;
        int i13 = 0;
        dArr2[0] = 0.5d;
        int i14 = 1;
        for (int i15 = 1; i15 < i12; i15++) {
            dArr2[i15] = 1.0d / (4.0d - dArr2[i15 - 1]);
        }
        int i16 = i12 - 1;
        dArr2[i12] = 1.0d / (2.0d - dArr2[i16]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i14 < i12) {
            int i17 = i14 + 1;
            int i18 = i14 - 1;
            dArr3[i14] = (((dArr[i17] - dArr[i18]) * 3.0d) - dArr3[i18]) * dArr2[i14];
            i14 = i17;
        }
        double d10 = (((dArr[i12] - dArr[i16]) * 3.0d) - dArr3[i16]) * dArr2[i12];
        dArr3[i12] = d10;
        dArr4[i12] = d10;
        while (i16 >= 0) {
            dArr4[i16] = dArr3[i16] - (dArr2[i16] * dArr4[i16 + 1]);
            i16--;
        }
        a[] aVarArr = new a[i12];
        while (i13 < i12) {
            double d11 = dArr[i13];
            double d12 = dArr4[i13];
            int i19 = i13 + 1;
            double d13 = dArr[i19];
            double d14 = dArr4[i19];
            aVarArr[i13] = new a((double) ((float) d11), d12, (((d13 - d11) * 3.0d) - (d12 * 2.0d)) - d14, ((d11 - d13) * 2.0d) + d12 + d14);
            i13 = i19;
        }
        return aVarArr;
    }

    public double a(a[] aVarArr) {
        int i10;
        a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        double[] dArr = new double[aVarArr2.length];
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        while (true) {
            i10 = 0;
            if (d11 >= 1.0d) {
                break;
            }
            double d13 = 0.0d;
            while (i10 < aVarArr2.length) {
                double d14 = dArr[i10];
                double a10 = aVarArr2[i10].a(d11);
                dArr[i10] = a10;
                double d15 = d14 - a10;
                d13 += d15 * d15;
                i10++;
            }
            if (d11 > 0.0d) {
                d12 += Math.sqrt(d13);
            }
            d11 += 0.1d;
        }
        while (i10 < aVarArr2.length) {
            double d16 = dArr[i10];
            double a11 = aVarArr2[i10].a(1.0d);
            dArr[i10] = a11;
            double d17 = d16 - a11;
            d10 += d17 * d17;
            i10++;
        }
        return d12 + Math.sqrt(d10);
    }

    public double c(double d10, int i10) {
        double[] dArr;
        double d11 = d10 * this.f13312e;
        int i11 = 0;
        while (true) {
            dArr = this.f13311d;
            if (i11 >= dArr.length - 1) {
                break;
            }
            double d12 = dArr[i11];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i11++;
        }
        return this.f13309b[i10][i11].a(d11 / dArr[i11]);
    }

    public void d(double d10, double[] dArr) {
        double d11 = d10 * this.f13312e;
        int i10 = 0;
        while (true) {
            double[] dArr2 = this.f13311d;
            if (i10 >= dArr2.length - 1) {
                break;
            }
            double d12 = dArr2[i10];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i10++;
        }
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr[i11] = this.f13309b[i11][i10].a(d11 / this.f13311d[i10]);
        }
    }

    public void e(double d10, float[] fArr) {
        double d11 = d10 * this.f13312e;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f13311d;
            if (i10 >= dArr.length - 1) {
                break;
            }
            double d12 = dArr[i10];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i10++;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = (float) this.f13309b[i11][i10].a(d11 / this.f13311d[i10]);
        }
    }

    public void f(double d10, double[] dArr) {
        double d11 = d10 * this.f13312e;
        int i10 = 0;
        while (true) {
            double[] dArr2 = this.f13311d;
            if (i10 >= dArr2.length - 1) {
                break;
            }
            double d12 = dArr2[i10];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i10++;
        }
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr[i11] = this.f13309b[i11][i10].b(d11 / this.f13311d[i10]);
        }
    }

    public void g(double[][] dArr) {
        int i10;
        int length = dArr[0].length;
        this.f13310c = length;
        int length2 = dArr.length;
        this.f13308a = length2;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = length;
        this.f13313f = (double[][]) Array.newInstance(Double.TYPE, iArr);
        this.f13309b = new a[this.f13310c][];
        for (int i11 = 0; i11 < this.f13310c; i11++) {
            for (int i12 = 0; i12 < this.f13308a; i12++) {
                this.f13313f[i11][i12] = dArr[i12][i11];
            }
        }
        int i13 = 0;
        while (true) {
            i10 = this.f13310c;
            if (i13 >= i10) {
                break;
            }
            a[][] aVarArr = this.f13309b;
            double[] dArr2 = this.f13313f[i13];
            aVarArr[i13] = b(dArr2.length, dArr2);
            i13++;
        }
        this.f13311d = new double[(this.f13308a - 1)];
        this.f13312e = 0.0d;
        a[] aVarArr2 = new a[i10];
        for (int i14 = 0; i14 < this.f13311d.length; i14++) {
            for (int i15 = 0; i15 < this.f13310c; i15++) {
                aVarArr2[i15] = this.f13309b[i15][i14];
            }
            double d10 = this.f13312e;
            double[] dArr3 = this.f13311d;
            double a10 = a(aVarArr2);
            dArr3[i14] = a10;
            this.f13312e = d10 + a10;
        }
    }
}
