package w7;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f14876a;

    /* renamed from: b  reason: collision with root package name */
    public int f14877b;

    /* renamed from: c  reason: collision with root package name */
    public int f14878c;

    /* renamed from: d  reason: collision with root package name */
    public int f14879d;

    public v() {
        this.f14876a = q0.f14791f;
    }

    public v(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public v(byte[] bArr, int i10) {
        this.f14876a = bArr;
        this.f14879d = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f14879d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r2 = this;
            int r0 = r2.f14877b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f14879d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f14878c
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            w7.a.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.v.a():void");
    }

    public int b() {
        return ((this.f14879d - this.f14877b) * 8) - this.f14878c;
    }

    public void c() {
        if (this.f14878c != 0) {
            this.f14878c = 0;
            this.f14877b++;
            a();
        }
    }

    public int d() {
        a.i(this.f14878c == 0);
        return this.f14877b;
    }

    public int e() {
        return (this.f14877b * 8) + this.f14878c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f14878c, i11);
        int i12 = this.f14878c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f14876a;
        int i14 = this.f14877b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - min;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f14876a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f14876a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        p(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f14876a[this.f14877b] & (128 >> this.f14878c)) != 0;
        o();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f14878c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f14878c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f14878c = i13;
            byte[] bArr = this.f14876a;
            int i14 = this.f14877b;
            this.f14877b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f14876a;
        int i15 = this.f14877b;
        int i16 = (-1 >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f14878c = 0;
            this.f14877b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f14876a;
            int i13 = this.f14877b;
            int i14 = i13 + 1;
            this.f14877b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f14878c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 != 0) {
            byte b12 = (byte) (bArr[i12] & (255 >> i16));
            bArr[i12] = b12;
            int i17 = this.f14878c;
            if (i17 + i16 > 8) {
                byte[] bArr3 = this.f14876a;
                int i18 = this.f14877b;
                this.f14877b = i18 + 1;
                bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
                this.f14878c = i17 - 8;
            }
            int i19 = this.f14878c + i16;
            this.f14878c = i19;
            byte[] bArr4 = this.f14876a;
            int i20 = this.f14877b;
            bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
            if (i19 == 8) {
                this.f14878c = 0;
                this.f14877b = i20 + 1;
            }
            a();
        }
    }

    public void j(byte[] bArr, int i10, int i11) {
        a.i(this.f14878c == 0);
        System.arraycopy(this.f14876a, this.f14877b, bArr, i10, i11);
        this.f14877b += i11;
        a();
    }

    public void k(w wVar) {
        m(wVar.f14880a, wVar.d());
        n(wVar.c() * 8);
    }

    public void l(byte[] bArr) {
        m(bArr, bArr.length);
    }

    public void m(byte[] bArr, int i10) {
        this.f14876a = bArr;
        this.f14877b = 0;
        this.f14878c = 0;
        this.f14879d = i10;
    }

    public void n(int i10) {
        int i11 = i10 / 8;
        this.f14877b = i11;
        this.f14878c = i10 - (i11 * 8);
        a();
    }

    public void o() {
        int i10 = this.f14878c + 1;
        this.f14878c = i10;
        if (i10 == 8) {
            this.f14878c = 0;
            this.f14877b++;
        }
        a();
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f14877b + i11;
        this.f14877b = i12;
        int i13 = this.f14878c + (i10 - (i11 * 8));
        this.f14878c = i13;
        if (i13 > 7) {
            this.f14877b = i12 + 1;
            this.f14878c = i13 - 8;
        }
        a();
    }

    public void q(int i10) {
        a.i(this.f14878c == 0);
        this.f14877b += i10;
        a();
    }
}
