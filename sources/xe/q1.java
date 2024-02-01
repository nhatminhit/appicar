package xe;

import fh.g;

public final class q1 extends c1<short[]> {
    @g

    /* renamed from: d  reason: collision with root package name */
    public final short[] f24550d;

    public q1(int i10) {
        super(i10);
        this.f24550d = new short[i10];
    }

    public final void h(short s10) {
        short[] sArr = this.f24550d;
        int b10 = b();
        e(b10 + 1);
        sArr[b10] = s10;
    }

    /* renamed from: i */
    public int c(@g short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr.length;
    }

    @g
    public final short[] j() {
        return (short[]) g(this.f24550d, new short[f()]);
    }
}
