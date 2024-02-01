package ya;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f24633a;

    /* renamed from: b  reason: collision with root package name */
    public int f24634b;

    /* renamed from: c  reason: collision with root package name */
    public int f24635c;

    public c(byte[] bArr) {
        this.f24633a = bArr;
    }

    public int a() {
        return ((this.f24633a.length - this.f24634b) * 8) - this.f24635c;
    }

    public int b() {
        return this.f24635c;
    }

    public int c() {
        return this.f24634b;
    }

    public int d(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f24635c;
        byte b10 = 0;
        if (i11 > 0) {
            int i12 = 8 - i11;
            int min = Math.min(i10, i12);
            int i13 = i12 - min;
            byte[] bArr = this.f24633a;
            int i14 = this.f24634b;
            int i15 = (((255 >> (8 - min)) << i13) & bArr[i14]) >> i13;
            i10 -= min;
            int i16 = this.f24635c + min;
            this.f24635c = i16;
            if (i16 == 8) {
                this.f24635c = 0;
                this.f24634b = i14 + 1;
            }
            b10 = i15;
        }
        if (i10 <= 0) {
            return b10;
        }
        while (i10 >= 8) {
            int i17 = b10 << 8;
            byte[] bArr2 = this.f24633a;
            int i18 = this.f24634b;
            b10 = (bArr2[i18] & 255) | i17;
            this.f24634b = i18 + 1;
            i10 -= 8;
        }
        if (i10 <= 0) {
            return b10;
        }
        int i19 = 8 - i10;
        int i20 = (b10 << i10) | ((((255 >> i19) << i19) & this.f24633a[this.f24634b]) >> i19);
        this.f24635c += i10;
        return i20;
    }
}
