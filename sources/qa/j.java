package qa;

import p7.f;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f22172a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22173b;

    public j(int i10, int i11) {
        this.f22172a = i10;
        this.f22173b = i11;
    }

    public j a(int i10, int i11, int i12, int i13) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int b() {
        return this.f22173b;
    }

    public abstract byte[] c();

    public abstract byte[] d(int i10, byte[] bArr);

    public final int e() {
        return this.f22172a;
    }

    public j f() {
        return new i(this);
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public j i() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public j j() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        int i10 = this.f22172a;
        byte[] bArr = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f22173b * (i10 + 1));
        for (int i11 = 0; i11 < this.f22173b; i11++) {
            bArr = d(i11, bArr);
            for (int i12 = 0; i12 < this.f22172a; i12++) {
                byte b10 = bArr[i12] & 255;
                sb2.append(b10 < 64 ? '#' : b10 < 128 ? '+' : b10 < 192 ? '.' : f.f11698i);
            }
            sb2.append(10);
        }
        return sb2.toString();
    }
}
