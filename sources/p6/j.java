package p6;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f11595a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11596b;

    /* renamed from: c  reason: collision with root package name */
    public int f11597c;

    /* renamed from: d  reason: collision with root package name */
    public int f11598d;

    public j(byte[] bArr) {
        this.f11595a = bArr;
        this.f11596b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f11596b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r2 = this;
            int r0 = r2.f11597c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f11596b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f11598d
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
        throw new UnsupportedOperationException("Method not decompiled: p6.j.a():void");
    }

    public int b() {
        return ((this.f11596b - this.f11597c) * 8) - this.f11598d;
    }

    public int c() {
        return (this.f11597c * 8) + this.f11598d;
    }

    public boolean d() {
        boolean z10 = (((this.f11595a[this.f11597c] & 255) >> this.f11598d) & 1) == 1;
        h(1);
        return z10;
    }

    public int e(int i10) {
        int i11 = this.f11597c;
        int min = Math.min(i10, 8 - this.f11598d);
        int i12 = i11 + 1;
        int i13 = ((this.f11595a[i11] & 255) >> this.f11598d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f11595a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & (-1 >>> (32 - i10));
        h(i10);
        return i14;
    }

    public void f() {
        this.f11597c = 0;
        this.f11598d = 0;
    }

    public void g(int i10) {
        int i11 = i10 / 8;
        this.f11597c = i11;
        this.f11598d = i10 - (i11 * 8);
        a();
    }

    public void h(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f11597c + i11;
        this.f11597c = i12;
        int i13 = this.f11598d + (i10 - (i11 * 8));
        this.f11598d = i13;
        if (i13 > 7) {
            this.f11597c = i12 + 1;
            this.f11598d = i13 - 8;
        }
        a();
    }
}
