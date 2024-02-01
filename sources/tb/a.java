package tb;

import java.lang.reflect.Array;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b[] f23129a;

    /* renamed from: b  reason: collision with root package name */
    public int f23130b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23131c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23132d;

    public a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f23129a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f23129a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f23132d = i11 * 17;
        this.f23131c = i10;
        this.f23130b = -1;
    }

    public b a() {
        return this.f23129a[this.f23130b];
    }

    public byte[][] b() {
        return c(1, 1);
    }

    public byte[][] c(int i10, int i11) {
        int[] iArr = new int[2];
        iArr[1] = this.f23132d * i10;
        iArr[0] = this.f23131c * i11;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i12 = this.f23131c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f23129a[i13 / i11].b(i10);
        }
        return bArr;
    }

    public void d(int i10, int i11, byte b10) {
        this.f23129a[i11].c(i10, b10);
    }

    public void e() {
        this.f23130b++;
    }
}
