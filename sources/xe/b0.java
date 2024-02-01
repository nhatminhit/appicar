package xe;

import fh.g;

public final class b0 extends c1<float[]> {
    @g

    /* renamed from: d  reason: collision with root package name */
    public final float[] f24518d;

    public b0(int i10) {
        super(i10);
        this.f24518d = new float[i10];
    }

    public final void h(float f10) {
        float[] fArr = this.f24518d;
        int b10 = b();
        e(b10 + 1);
        fArr[b10] = f10;
    }

    /* renamed from: i */
    public int c(@g float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr.length;
    }

    @g
    public final float[] j() {
        return (float[]) g(this.f24518d, new float[f()]);
    }
}
