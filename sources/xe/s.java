package xe;

import fh.g;

public final class s extends c1<char[]> {
    @g

    /* renamed from: d  reason: collision with root package name */
    public final char[] f24563d;

    public s(int i10) {
        super(i10);
        this.f24563d = new char[i10];
    }

    public final void h(char c10) {
        char[] cArr = this.f24563d;
        int b10 = b();
        e(b10 + 1);
        cArr[b10] = c10;
    }

    /* renamed from: i */
    public int c(@g char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr.length;
    }

    @g
    public final char[] j() {
        return (char[]) g(this.f24563d, new char[f()]);
    }
}
