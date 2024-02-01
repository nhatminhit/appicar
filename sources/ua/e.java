package ua;

import ya.a;

public final class e extends g {

    /* renamed from: c  reason: collision with root package name */
    public final short f23333c;

    /* renamed from: d  reason: collision with root package name */
    public final short f23334d;

    public e(g gVar, int i10, int i11) {
        super(gVar);
        this.f23333c = (short) i10;
        this.f23334d = (short) i11;
    }

    public void c(a aVar, byte[] bArr) {
        aVar.g(this.f23333c, this.f23334d);
    }

    public String toString() {
        short s10 = this.f23333c;
        short s11 = this.f23334d;
        short s12 = (s10 & ((1 << s11) - 1)) | (1 << s11);
        return "<" + Integer.toBinaryString(s12 | (1 << this.f23334d)).substring(1) + '>';
    }
}
