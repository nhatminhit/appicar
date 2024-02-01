package w7;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f14883a;

    /* renamed from: b  reason: collision with root package name */
    public int f14884b;

    /* renamed from: c  reason: collision with root package name */
    public int f14885c;

    /* renamed from: d  reason: collision with root package name */
    public int f14886d;

    public x(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f14884b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r2 = this;
            int r0 = r2.f14885c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f14884b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f14886d
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
        throw new UnsupportedOperationException("Method not decompiled: w7.x.a():void");
    }

    public boolean b(int i10) {
        int i11 = this.f14885c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f14886d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f14884b) {
                int i15 = this.f14884b;
            } else if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i152 = this.f14884b;
        if (i13 >= i152) {
            return i13 == i152 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f14885c;
        int i11 = this.f14886d;
        int i12 = 0;
        while (this.f14885c < this.f14884b && !d()) {
            i12++;
        }
        boolean z10 = this.f14885c == this.f14884b;
        this.f14885c = i10;
        this.f14886d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.f14883a[this.f14885c] & (128 >> this.f14886d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        int i12;
        this.f14886d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f14886d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f14886d = i14;
            byte[] bArr = this.f14883a;
            int i15 = this.f14885c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                i12 = 1;
            }
            this.f14885c = i15 + i12;
        }
        byte[] bArr2 = this.f14883a;
        int i16 = this.f14885c;
        int i17 = (-1 >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f14886d = 0;
            if (!j(i16 + 1)) {
                i12 = 1;
            }
            this.f14885c = i16 + i12;
        }
        a();
        return i17;
    }

    public final int f() {
        int i10 = 0;
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = e(i11);
        }
        return i12 + i10;
    }

    public int g() {
        int f10 = f();
        return (f10 % 2 == 0 ? -1 : 1) * ((f10 + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f14883a = bArr;
        this.f14885c = i10;
        this.f14884b = i11;
        this.f14886d = 0;
        a();
    }

    public final boolean j(int i10) {
        if (2 <= i10 && i10 < this.f14884b) {
            byte[] bArr = this.f14883a;
            return bArr[i10] == 3 && bArr[i10 + -2] == 0 && bArr[i10 - 1] == 0;
        }
    }

    public void k() {
        int i10 = 1;
        int i11 = this.f14886d + 1;
        this.f14886d = i11;
        if (i11 == 8) {
            this.f14886d = 0;
            int i12 = this.f14885c;
            if (j(i12 + 1)) {
                i10 = 2;
            }
            this.f14885c = i12 + i10;
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f14885c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f14885c = i13;
        int i14 = this.f14886d + (i10 - (i12 * 8));
        this.f14886d = i14;
        if (i14 > 7) {
            this.f14885c = i13 + 1;
            this.f14886d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f14885c) {
                a();
                return;
            } else if (j(i11)) {
                this.f14885c++;
                i11 += 2;
            }
        }
    }
}
