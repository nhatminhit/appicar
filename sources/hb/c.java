package hb;

import ab.a;
import ab.e;
import java.util.Map;
import qa.d;
import qa.h;
import ya.b;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final int f19532b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f19533c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f19534d = 2;

    /* renamed from: a  reason: collision with root package name */
    public final ab.c f19535a = new ab.c(a.f16036o);

    public final void a(byte[] bArr, int i10, int i11, int i12, int i13) throws d {
        int i14 = i11 + i12;
        int i15 = i13 == 0 ? 1 : 2;
        int[] iArr = new int[(i14 / i15)];
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i15] = bArr[i16 + i10] & 255;
            }
        }
        try {
            this.f19535a.a(iArr, i12 / i15);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i15];
                }
            }
        } catch (e unused) {
            throw d.a();
        }
    }

    public ya.e b(b bVar) throws d, h {
        return c(bVar, (Map<qa.e, ?>) null);
    }

    public ya.e c(b bVar, Map<qa.e, ?> map) throws h, d {
        int i10;
        byte[] a10 = new a(bVar).a();
        a(a10, 0, 10, 10, 0);
        byte b10 = a10[0] & 15;
        if (b10 == 2 || b10 == 3 || b10 == 4) {
            byte[] bArr = a10;
            a(bArr, 20, 84, 40, 1);
            a(bArr, 20, 84, 40, 2);
            i10 = 94;
        } else if (b10 == 5) {
            byte[] bArr2 = a10;
            a(bArr2, 20, 68, 56, 1);
            a(bArr2, 20, 68, 56, 2);
            i10 = 78;
        } else {
            throw h.a();
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(a10, 0, bArr3, 0, 10);
        System.arraycopy(a10, 20, bArr3, 10, bArr3.length - 10);
        return b.a(bArr3, b10);
    }
}
