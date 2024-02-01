package tb;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f23133a;

    /* renamed from: b  reason: collision with root package name */
    public int f23134b = 0;

    public b(int i10) {
        this.f23133a = new byte[i10];
    }

    public void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f23134b;
            this.f23134b = i12 + 1;
            d(i12, z10);
        }
    }

    public byte[] b(int i10) {
        int length = this.f23133a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f23133a[i11 / i10];
        }
        return bArr;
    }

    public void c(int i10, byte b10) {
        this.f23133a[i10] = b10;
    }

    public final void d(int i10, boolean z10) {
        this.f23133a[i10] = z10 ? (byte) 1 : 0;
    }
}
