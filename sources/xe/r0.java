package xe;

import fh.g;

public final class r0 extends c1<long[]> {
    @g

    /* renamed from: d  reason: collision with root package name */
    public final long[] f24562d;

    public r0(int i10) {
        super(i10);
        this.f24562d = new long[i10];
    }

    public final void h(long j10) {
        long[] jArr = this.f24562d;
        int b10 = b();
        e(b10 + 1);
        jArr[b10] = j10;
    }

    /* renamed from: i */
    public int c(@g long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr.length;
    }

    @g
    public final long[] j() {
        return (long[]) g(this.f24562d, new long[f()]);
    }
}
