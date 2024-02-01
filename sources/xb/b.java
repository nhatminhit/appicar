package xb;

import java.lang.reflect.Array;
import java.util.Arrays;
import y3.q;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final byte[][] f24486a;

    /* renamed from: b  reason: collision with root package name */
    public final int f24487b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24488c;

    public b(int i10, int i11) {
        int[] iArr = new int[2];
        iArr[1] = i10;
        iArr[0] = i11;
        this.f24486a = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        this.f24487b = i10;
        this.f24488c = i11;
    }

    public void a(byte b10) {
        for (byte[] fill : this.f24486a) {
            Arrays.fill(fill, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f24486a[i11][i10];
    }

    public byte[][] c() {
        return this.f24486a;
    }

    public int d() {
        return this.f24488c;
    }

    public int e() {
        return this.f24487b;
    }

    public void f(int i10, int i11, byte b10) {
        this.f24486a[i11][i10] = b10;
    }

    public void g(int i10, int i11, int i12) {
        this.f24486a[i11][i10] = (byte) i12;
    }

    public void h(int i10, int i11, boolean z10) {
        this.f24486a[i11][i10] = z10 ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f24487b * 2 * this.f24488c) + 2);
        for (int i10 = 0; i10 < this.f24488c; i10++) {
            byte[] bArr = this.f24486a[i10];
            for (int i11 = 0; i11 < this.f24487b; i11++) {
                byte b10 = bArr[i11];
                sb2.append(b10 != 0 ? b10 != 1 ? q.a.R : " 1" : " 0");
            }
            sb2.append(10);
        }
        return sb2.toString();
    }
}
