package cb;

import ab.a;
import ab.c;
import ab.e;
import qa.h;
import ya.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final c f16358a = new c(a.f16034m);

    public final void a(byte[] bArr, int i10) throws qa.d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f16358a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (e unused) {
            throw qa.d.a();
        }
    }

    public ya.e b(b bVar) throws h, qa.d {
        a aVar = new a(bVar);
        b[] b10 = b.b(aVar.c(), aVar.b());
        int i10 = 0;
        for (b c10 : b10) {
            i10 += c10.c();
        }
        byte[] bArr = new byte[i10];
        int length = b10.length;
        for (int i11 = 0; i11 < length; i11++) {
            b bVar2 = b10[i11];
            byte[] a10 = bVar2.a();
            int c11 = bVar2.c();
            a(a10, c11);
            for (int i12 = 0; i12 < c11; i12++) {
                bArr[(i12 * length) + i11] = a10[i12];
            }
        }
        return c.a(bArr);
    }

    public ya.e c(boolean[][] zArr) throws h, qa.d {
        return b(b.u(zArr));
    }
}
