package xe;

import fh.g;

public final class k0 extends c1<int[]> {
    @g

    /* renamed from: d  reason: collision with root package name */
    public final int[] f24527d;

    public k0(int i10) {
        super(i10);
        this.f24527d = new int[i10];
    }

    public final void h(int i10) {
        int[] iArr = this.f24527d;
        int b10 = b();
        e(b10 + 1);
        iArr[b10] = i10;
    }

    /* renamed from: i */
    public int c(@g int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr.length;
    }

    @g
    public final int[] j() {
        return (int[]) g(this.f24527d, new int[f()]);
    }
}
