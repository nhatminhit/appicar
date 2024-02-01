package u;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f13286a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f13287b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f13288c = 2;

    public static class a extends b {

        /* renamed from: d  reason: collision with root package name */
        public double f13289d;

        /* renamed from: e  reason: collision with root package name */
        public double[] f13290e;

        public a(double d10, double[] dArr) {
            this.f13289d = d10;
            this.f13290e = dArr;
        }

        public double c(double d10, int i10) {
            return this.f13290e[i10];
        }

        public void d(double d10, double[] dArr) {
            double[] dArr2 = this.f13290e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        public void e(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f13290e;
                if (i10 < dArr.length) {
                    fArr[i10] = (float) dArr[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }

        public double f(double d10, int i10) {
            return 0.0d;
        }

        public void g(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f13290e.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        public double[] h() {
            return new double[]{this.f13289d};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        return i10 != 0 ? i10 != 2 ? new e(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new f(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new a(iArr, dArr, dArr2);
    }

    public abstract double c(double d10, int i10);

    public abstract void d(double d10, double[] dArr);

    public abstract void e(double d10, float[] fArr);

    public abstract double f(double d10, int i10);

    public abstract void g(double d10, double[] dArr);

    public abstract double[] h();
}
