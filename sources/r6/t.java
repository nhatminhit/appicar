package r6;

import java.util.Arrays;
import w7.a;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f12503a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12504b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12505c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f12506d;

    /* renamed from: e  reason: collision with root package name */
    public int f12507e;

    public t(int i10, int i11) {
        this.f12503a = i10;
        byte[] bArr = new byte[(i11 + 3)];
        this.f12506d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f12504b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f12506d;
            int length = bArr2.length;
            int i13 = this.f12507e;
            if (length < i13 + i12) {
                this.f12506d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f12506d, this.f12507e, i12);
            this.f12507e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f12504b) {
            return false;
        }
        this.f12507e -= i10;
        this.f12504b = false;
        this.f12505c = true;
        return true;
    }

    public boolean c() {
        return this.f12505c;
    }

    public void d() {
        this.f12504b = false;
        this.f12505c = false;
    }

    public void e(int i10) {
        boolean z10 = true;
        a.i(!this.f12504b);
        if (i10 != this.f12503a) {
            z10 = false;
        }
        this.f12504b = z10;
        if (z10) {
            this.f12507e = 3;
            this.f12505c = false;
        }
    }
}
