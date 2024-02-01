package xe;

import fh.g;

public final class n extends c1<boolean[]> {
    @g

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f24533d;

    public n(int i10) {
        super(i10);
        this.f24533d = new boolean[i10];
    }

    public final void h(boolean z10) {
        boolean[] zArr = this.f24533d;
        int b10 = b();
        e(b10 + 1);
        zArr[b10] = z10;
    }

    /* renamed from: i */
    public int c(@g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr.length;
    }

    @g
    public final boolean[] j() {
        return (boolean[]) g(this.f24533d, new boolean[f()]);
    }
}
