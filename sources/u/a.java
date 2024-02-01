package u;

import java.util.Arrays;

public class a extends b {

    /* renamed from: f  reason: collision with root package name */
    public static final int f13256f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f13257g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f13258h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f13259i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f13260j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f13261k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f13262l = 3;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f13263d;

    /* renamed from: e  reason: collision with root package name */
    public C0220a[] f13264e;

    /* renamed from: u.a$a  reason: collision with other inner class name */
    public static class C0220a {

        /* renamed from: s  reason: collision with root package name */
        public static final String f13265s = "Arc";

        /* renamed from: t  reason: collision with root package name */
        public static double[] f13266t = new double[91];

        /* renamed from: u  reason: collision with root package name */
        public static final double f13267u = 0.001d;

        /* renamed from: a  reason: collision with root package name */
        public double[] f13268a;

        /* renamed from: b  reason: collision with root package name */
        public double f13269b;

        /* renamed from: c  reason: collision with root package name */
        public double f13270c;

        /* renamed from: d  reason: collision with root package name */
        public double f13271d;

        /* renamed from: e  reason: collision with root package name */
        public double f13272e;

        /* renamed from: f  reason: collision with root package name */
        public double f13273f;

        /* renamed from: g  reason: collision with root package name */
        public double f13274g;

        /* renamed from: h  reason: collision with root package name */
        public double f13275h;

        /* renamed from: i  reason: collision with root package name */
        public double f13276i;

        /* renamed from: j  reason: collision with root package name */
        public double f13277j;

        /* renamed from: k  reason: collision with root package name */
        public double f13278k;

        /* renamed from: l  reason: collision with root package name */
        public double f13279l;

        /* renamed from: m  reason: collision with root package name */
        public double f13280m;

        /* renamed from: n  reason: collision with root package name */
        public double f13281n;

        /* renamed from: o  reason: collision with root package name */
        public double f13282o;

        /* renamed from: p  reason: collision with root package name */
        public double f13283p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f13284q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f13285r = false;

        public C0220a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            int i11 = i10;
            double d16 = d10;
            double d17 = d11;
            double d18 = d12;
            double d19 = d13;
            double d20 = d14;
            double d21 = d15;
            boolean z10 = false;
            int i12 = 1;
            this.f13284q = i11 == 1 ? true : z10;
            this.f13270c = d16;
            this.f13271d = d17;
            this.f13276i = 1.0d / (d17 - d16);
            if (3 == i11) {
                this.f13285r = true;
            }
            double d22 = d20 - d18;
            double d23 = d21 - d19;
            if (this.f13285r || Math.abs(d22) < 0.001d || Math.abs(d23) < 0.001d) {
                this.f13285r = true;
                this.f13272e = d18;
                this.f13273f = d20;
                this.f13274g = d19;
                this.f13275h = d15;
                double hypot = Math.hypot(d23, d22);
                this.f13269b = hypot;
                this.f13281n = hypot * this.f13276i;
                double d24 = this.f13271d;
                double d25 = this.f13270c;
                this.f13279l = d22 / (d24 - d25);
                this.f13280m = d23 / (d24 - d25);
                return;
            }
            this.f13268a = new double[101];
            boolean z11 = this.f13284q;
            this.f13277j = d22 * ((double) (z11 ? -1 : 1));
            this.f13278k = d23 * ((double) (!z11 ? -1 : i12));
            this.f13279l = z11 ? d20 : d18;
            this.f13280m = z11 ? d19 : d15;
            a(d12, d13, d14, d15);
            this.f13281n = this.f13269b * this.f13276i;
        }

        public final void a(double d10, double d11, double d12, double d13) {
            double d14;
            double d15 = d12 - d10;
            double d16 = d11 - d13;
            int i10 = 0;
            double d17 = 0.0d;
            double d18 = 0.0d;
            double d19 = 0.0d;
            while (true) {
                double[] dArr = f13266t;
                if (i10 >= dArr.length) {
                    break;
                }
                double d20 = d17;
                double radians = Math.toRadians((((double) i10) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d15;
                double cos = Math.cos(radians) * d16;
                if (i10 > 0) {
                    d14 = Math.hypot(sin - d18, cos - d19) + d20;
                    f13266t[i10] = d14;
                } else {
                    d14 = d20;
                }
                i10++;
                d19 = cos;
                double d21 = sin;
                d17 = d14;
                d18 = d21;
            }
            double d22 = d17;
            this.f13269b = d22;
            int i11 = 0;
            while (true) {
                double[] dArr2 = f13266t;
                if (i11 >= dArr2.length) {
                    break;
                }
                dArr2[i11] = dArr2[i11] / d22;
                i11++;
            }
            int i12 = 0;
            while (true) {
                double[] dArr3 = this.f13268a;
                if (i12 < dArr3.length) {
                    double length = ((double) i12) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f13266t, length);
                    if (binarySearch >= 0) {
                        this.f13268a[i12] = (double) (binarySearch / (f13266t.length - 1));
                    } else if (binarySearch == -1) {
                        this.f13268a[i12] = 0.0d;
                    } else {
                        int i13 = -binarySearch;
                        int i14 = i13 - 2;
                        double[] dArr4 = f13266t;
                        double d23 = dArr4[i14];
                        this.f13268a[i12] = (((double) i14) + ((length - d23) / (dArr4[i13 - 1] - d23))) / ((double) (dArr4.length - 1));
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }

        public double b() {
            double d10 = this.f13277j * this.f13283p;
            double hypot = this.f13281n / Math.hypot(d10, (-this.f13278k) * this.f13282o);
            if (this.f13284q) {
                d10 = -d10;
            }
            return d10 * hypot;
        }

        public double c() {
            double d10 = this.f13277j * this.f13283p;
            double d11 = (-this.f13278k) * this.f13282o;
            double hypot = this.f13281n / Math.hypot(d10, d11);
            return this.f13284q ? (-d11) * hypot : d11 * hypot;
        }

        public double d(double d10) {
            return this.f13279l;
        }

        public double e(double d10) {
            return this.f13280m;
        }

        public double f(double d10) {
            double d11 = (d10 - this.f13270c) * this.f13276i;
            double d12 = this.f13272e;
            return d12 + (d11 * (this.f13273f - d12));
        }

        public double g(double d10) {
            double d11 = (d10 - this.f13270c) * this.f13276i;
            double d12 = this.f13274g;
            return d12 + (d11 * (this.f13275h - d12));
        }

        public double h() {
            return this.f13279l + (this.f13277j * this.f13282o);
        }

        public double i() {
            return this.f13280m + (this.f13278k * this.f13283p);
        }

        public double j(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f13268a;
            double length = d10 * ((double) (dArr.length - 1));
            int i10 = (int) length;
            double d11 = length - ((double) i10);
            double d12 = dArr[i10];
            return d12 + (d11 * (dArr[i10 + 1] - d12));
        }

        public void k(double d10) {
            double j10 = j((this.f13284q ? this.f13271d - d10 : d10 - this.f13270c) * this.f13276i) * 1.5707963267948966d;
            this.f13282o = Math.sin(j10);
            this.f13283p = Math.cos(j10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r5 == 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.f13263d = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            u.a$a[] r2 = new u.a.C0220a[r2]
            r0.f13264e = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L_0x0014:
            u.a$a[] r7 = r0.f13264e
            int r8 = r7.length
            if (r4 >= r8) goto L_0x004d
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L_0x002d
            if (r8 == r3) goto L_0x002a
            if (r8 == r10) goto L_0x0028
            if (r8 == r9) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            if (r5 != r3) goto L_0x002a
        L_0x0028:
            r5 = r10
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            r6 = r5
            goto L_0x002e
        L_0x002d:
            r6 = r9
        L_0x002e:
            u.a$a r22 = new u.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L_0x0014
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.a.<init>(int[], double[], double[][]):void");
    }

    public double c(double d10, int i10) {
        C0220a[] aVarArr = this.f13264e;
        int i11 = 0;
        double d11 = aVarArr[0].f13270c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f13271d) {
            d10 = aVarArr[aVarArr.length - 1].f13271d;
        }
        while (true) {
            C0220a[] aVarArr2 = this.f13264e;
            if (i11 >= aVarArr2.length) {
                return Double.NaN;
            }
            C0220a aVar = aVarArr2[i11];
            if (d10 > aVar.f13271d) {
                i11++;
            } else if (aVar.f13285r) {
                return i10 == 0 ? aVar.f(d10) : aVar.g(d10);
            } else {
                aVar.k(d10);
                C0220a[] aVarArr3 = this.f13264e;
                return i10 == 0 ? aVarArr3[i11].h() : aVarArr3[i11].i();
            }
        }
    }

    public void d(double d10, double[] dArr) {
        C0220a[] aVarArr = this.f13264e;
        double d11 = aVarArr[0].f13270c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > aVarArr[aVarArr.length - 1].f13271d) {
            d10 = aVarArr[aVarArr.length - 1].f13271d;
        }
        int i10 = 0;
        while (true) {
            C0220a[] aVarArr2 = this.f13264e;
            if (i10 < aVarArr2.length) {
                C0220a aVar = aVarArr2[i10];
                if (d10 > aVar.f13271d) {
                    i10++;
                } else if (aVar.f13285r) {
                    dArr[0] = aVar.f(d10);
                    dArr[1] = this.f13264e[i10].g(d10);
                    return;
                } else {
                    aVar.k(d10);
                    dArr[0] = this.f13264e[i10].h();
                    dArr[1] = this.f13264e[i10].i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void e(double d10, float[] fArr) {
        C0220a[] aVarArr = this.f13264e;
        double d11 = aVarArr[0].f13270c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f13271d) {
            d10 = aVarArr[aVarArr.length - 1].f13271d;
        }
        int i10 = 0;
        while (true) {
            C0220a[] aVarArr2 = this.f13264e;
            if (i10 < aVarArr2.length) {
                C0220a aVar = aVarArr2[i10];
                if (d10 > aVar.f13271d) {
                    i10++;
                } else if (aVar.f13285r) {
                    fArr[0] = (float) aVar.f(d10);
                    fArr[1] = (float) this.f13264e[i10].g(d10);
                    return;
                } else {
                    aVar.k(d10);
                    fArr[0] = (float) this.f13264e[i10].h();
                    fArr[1] = (float) this.f13264e[i10].i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public double f(double d10, int i10) {
        C0220a[] aVarArr = this.f13264e;
        int i11 = 0;
        double d11 = aVarArr[0].f13270c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > aVarArr[aVarArr.length - 1].f13271d) {
            d10 = aVarArr[aVarArr.length - 1].f13271d;
        }
        while (true) {
            C0220a[] aVarArr2 = this.f13264e;
            if (i11 >= aVarArr2.length) {
                return Double.NaN;
            }
            C0220a aVar = aVarArr2[i11];
            if (d10 > aVar.f13271d) {
                i11++;
            } else if (aVar.f13285r) {
                return i10 == 0 ? aVar.d(d10) : aVar.e(d10);
            } else {
                aVar.k(d10);
                C0220a[] aVarArr3 = this.f13264e;
                return i10 == 0 ? aVarArr3[i11].b() : aVarArr3[i11].c();
            }
        }
    }

    public void g(double d10, double[] dArr) {
        C0220a[] aVarArr = this.f13264e;
        double d11 = aVarArr[0].f13270c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f13271d) {
            d10 = aVarArr[aVarArr.length - 1].f13271d;
        }
        int i10 = 0;
        while (true) {
            C0220a[] aVarArr2 = this.f13264e;
            if (i10 < aVarArr2.length) {
                C0220a aVar = aVarArr2[i10];
                if (d10 > aVar.f13271d) {
                    i10++;
                } else if (aVar.f13285r) {
                    dArr[0] = aVar.d(d10);
                    dArr[1] = this.f13264e[i10].e(d10);
                    return;
                } else {
                    aVar.k(d10);
                    dArr[0] = this.f13264e[i10].b();
                    dArr[1] = this.f13264e[i10].c();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public double[] h() {
        return this.f13263d;
    }
}
