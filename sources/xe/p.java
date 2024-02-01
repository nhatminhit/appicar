package xe;

import fh.g;

public final class p extends c1<byte[]> {
    @g

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f24539d;

    public p(int i10) {
        super(i10);
        this.f24539d = new byte[i10];
    }

    public final void h(byte b10) {
        byte[] bArr = this.f24539d;
        int b11 = b();
        e(b11 + 1);
        bArr[b11] = b10;
    }

    /* renamed from: i */
    public int c(@g byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr.length;
    }

    @g
    public final byte[] j() {
        return (byte[]) g(this.f24539d, new byte[f()]);
    }
}
