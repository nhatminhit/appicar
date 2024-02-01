package ya;

import qa.b;
import qa.j;
import qa.m;

public class h extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final int f24668d = 5;

    /* renamed from: e  reason: collision with root package name */
    public static final int f24669e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f24670f = 32;

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f24671g = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public byte[] f24672b = f24671g;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f24673c = new int[32];

    public h(j jVar) {
        super(jVar);
    }

    public static int g(int[] iArr) throws m {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i14 > i10) {
                i12 = i13;
                i10 = i14;
            }
            if (i14 > i11) {
                i11 = i14;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i12;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i12 <= i15) {
            int i20 = i12;
            i12 = i15;
            i15 = i20;
        }
        if (i12 - i15 > length / 16) {
            int i21 = i12 - 1;
            int i22 = -1;
            int i23 = i21;
            while (i21 > i15) {
                int i24 = i21 - i15;
                int i25 = i24 * i24 * (i12 - i21) * (i11 - iArr[i21]);
                if (i25 > i22) {
                    i23 = i21;
                    i22 = i25;
                }
                i21--;
            }
            return i23 << 3;
        }
        throw m.a();
    }

    public b a(j jVar) {
        return new h(jVar);
    }

    public b b() throws m {
        j e10 = e();
        int e11 = e10.e();
        int b10 = e10.b();
        b bVar = new b(e11, b10);
        h(e11);
        int[] iArr = this.f24673c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] d10 = e10.d((b10 * i10) / 5, this.f24672b);
            int i11 = (e11 << 2) / 5;
            for (int i12 = e11 / 5; i12 < i11; i12++) {
                int i13 = (d10[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int g10 = g(iArr);
        byte[] c10 = e10.c();
        for (int i14 = 0; i14 < b10; i14++) {
            int i15 = i14 * e11;
            for (int i16 = 0; i16 < e11; i16++) {
                if ((c10[i15 + i16] & 255) < g10) {
                    bVar.w(i16, i14);
                }
            }
        }
        return bVar;
    }

    public a c(int i10, a aVar) throws m {
        j e10 = e();
        int e11 = e10.e();
        if (aVar == null || aVar.s() < e11) {
            aVar = new a(e11);
        } else {
            aVar.i();
        }
        h(e11);
        byte[] d10 = e10.d(i10, this.f24672b);
        int[] iArr = this.f24673c;
        for (int i11 = 0; i11 < e11; i11++) {
            int i12 = (d10[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int g10 = g(iArr);
        if (e11 < 3) {
            for (int i13 = 0; i13 < e11; i13++) {
                if ((d10[i13] & 255) < g10) {
                    aVar.x(i13);
                }
            }
        } else {
            int i14 = 1;
            byte b10 = d10[1] & 255;
            byte b11 = d10[0] & 255;
            byte b12 = b10;
            while (i14 < e11 - 1) {
                int i15 = i14 + 1;
                byte b13 = d10[i15] & 255;
                if ((((b12 << 2) - b11) - b13) / 2 < g10) {
                    aVar.x(i14);
                }
                b11 = b12;
                i14 = i15;
                b12 = b13;
            }
        }
        return aVar;
    }

    public final void h(int i10) {
        if (this.f24672b.length < i10) {
            this.f24672b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f24673c[i11] = 0;
        }
    }
}
