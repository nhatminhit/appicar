package qa;

import dg.a;

public final class o extends j {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f22184c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22185d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22186e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22187f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22188g;

    public o(int i10, int i11, int[] iArr) {
        super(i10, i11);
        this.f22185d = i10;
        this.f22186e = i11;
        this.f22187f = 0;
        this.f22188g = 0;
        int i12 = i10 * i11;
        this.f22184c = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            this.f22184c[i13] = (byte) (((((i14 >> 16) & 255) + ((i14 >> 7) & a.G0)) + (i14 & 255)) / 4);
        }
    }

    public o(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i14, i15);
        if (i14 + i12 > i10 || i15 + i13 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f22184c = bArr;
        this.f22185d = i10;
        this.f22186e = i11;
        this.f22187f = i12;
        this.f22188g = i13;
    }

    public j a(int i10, int i11, int i12, int i13) {
        return new o(this.f22184c, this.f22185d, this.f22186e, this.f22187f + i10, this.f22188g + i11, i12, i13);
    }

    public byte[] c() {
        int e10 = e();
        int b10 = b();
        int i10 = this.f22185d;
        if (e10 == i10 && b10 == this.f22186e) {
            return this.f22184c;
        }
        int i11 = e10 * b10;
        byte[] bArr = new byte[i11];
        int i12 = (this.f22188g * i10) + this.f22187f;
        if (e10 == i10) {
            System.arraycopy(this.f22184c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < b10; i13++) {
            System.arraycopy(this.f22184c, i12, bArr, i13 * e10, e10);
            i12 += this.f22185d;
        }
        return bArr;
    }

    public byte[] d(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= b()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i10)));
        }
        int e10 = e();
        if (bArr == null || bArr.length < e10) {
            bArr = new byte[e10];
        }
        System.arraycopy(this.f22184c, ((i10 + this.f22188g) * this.f22185d) + this.f22187f, bArr, 0, e10);
        return bArr;
    }

    public boolean g() {
        return true;
    }
}
