package xe;

import fh.g;

public final class y extends c1<double[]> {
    @g

    /* renamed from: d  reason: collision with root package name */
    public final double[] f24578d;

    public y(int i10) {
        super(i10);
        this.f24578d = new double[i10];
    }

    public final void h(double d10) {
        double[] dArr = this.f24578d;
        int b10 = b();
        e(b10 + 1);
        dArr[b10] = d10;
    }

    /* renamed from: i */
    public int c(@g double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr.length;
    }

    @g
    public final double[] j() {
        return (double[]) g(this.f24578d, new double[f()]);
    }
}
