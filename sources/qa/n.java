package qa;

import dg.a;

public final class n extends j {

    /* renamed from: h  reason: collision with root package name */
    public static final int f22178h = 2;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f22179c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22180d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22181e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22182f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22183g;

    public n(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f22179c = bArr;
        this.f22180d = i10;
        this.f22181e = i11;
        this.f22182f = i12;
        this.f22183g = i13;
        if (z10) {
            n(i14, i15);
        }
    }

    public j a(int i10, int i11, int i12, int i13) {
        return new n(this.f22179c, this.f22180d, this.f22181e, this.f22182f + i10, this.f22183g + i11, i12, i13, false);
    }

    public byte[] c() {
        int e10 = e();
        int b10 = b();
        int i10 = this.f22180d;
        if (e10 == i10 && b10 == this.f22181e) {
            return this.f22179c;
        }
        int i11 = e10 * b10;
        byte[] bArr = new byte[i11];
        int i12 = (this.f22183g * i10) + this.f22182f;
        if (e10 == i10) {
            System.arraycopy(this.f22179c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < b10; i13++) {
            System.arraycopy(this.f22179c, i12, bArr, i13 * e10, e10);
            i12 += this.f22180d;
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
        System.arraycopy(this.f22179c, ((i10 + this.f22183g) * this.f22180d) + this.f22182f, bArr, 0, e10);
        return bArr;
    }

    public boolean g() {
        return true;
    }

    public int k() {
        return b() / 2;
    }

    public int l() {
        return e() / 2;
    }

    public int[] m() {
        int e10 = e() / 2;
        int b10 = b() / 2;
        int[] iArr = new int[(e10 * b10)];
        byte[] bArr = this.f22179c;
        int i10 = (this.f22183g * this.f22180d) + this.f22182f;
        for (int i11 = 0; i11 < b10; i11++) {
            int i12 = i11 * e10;
            for (int i13 = 0; i13 < e10; i13++) {
                iArr[i12 + i13] = ((bArr[(i13 << 1) + i10] & 255) * a.Th) | -16777216;
            }
            i10 += this.f22180d << 1;
        }
        return iArr;
    }

    public final void n(int i10, int i11) {
        byte[] bArr = this.f22179c;
        int i12 = (this.f22183g * this.f22180d) + this.f22182f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f22180d;
        }
    }
}
