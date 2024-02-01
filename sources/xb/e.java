package xb;

import dg.a;
import qa.w;
import vb.f;
import vb.j;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int[][] f24496a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b  reason: collision with root package name */
    public static final int[][] f24497b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c  reason: collision with root package name */
    public static final int[][] f24498c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, a.f18075ld}, new int[]{6, 26, 54, 82, 110, 138, a.f18329xd}, new int[]{6, 30, 58, 86, 114, 142, a.Jd}};

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f24499d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: e  reason: collision with root package name */
    public static final int f24500e = 7973;

    /* renamed from: f  reason: collision with root package name */
    public static final int f24501f = 1335;

    /* renamed from: g  reason: collision with root package name */
    public static final int f24502g = 21522;

    public static void a(ya.a aVar, f fVar, j jVar, int i10, b bVar) throws w {
        c(bVar);
        d(jVar, bVar);
        l(fVar, i10, bVar);
        s(jVar, bVar);
        f(aVar, i10, bVar);
    }

    public static int b(int i10, int i11) {
        if (i11 != 0) {
            int n10 = n(i11);
            int i12 = i10 << (n10 - 1);
            while (n(i12) >= n10) {
                i12 ^= i11 << (n(i12) - n10);
            }
            return i12;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void c(b bVar) {
        bVar.a((byte) -1);
    }

    public static void d(j jVar, b bVar) throws w {
        j(bVar);
        e(bVar);
        r(jVar, bVar);
        k(bVar);
    }

    public static void e(b bVar) throws w {
        if (bVar.b(8, bVar.d() - 8) != 0) {
            bVar.g(8, bVar.d() - 8, 1);
            return;
        }
        throw new w();
    }

    public static void f(ya.a aVar, int i10, b bVar) throws w {
        boolean z10;
        int e10 = bVar.e() - 1;
        int d10 = bVar.d() - 1;
        int i11 = -1;
        int i12 = 0;
        while (e10 > 0) {
            if (e10 == 6) {
                e10--;
            }
            while (d10 >= 0 && d10 < bVar.d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = e10 - i13;
                    if (o(bVar.b(i14, d10))) {
                        if (i12 < aVar.s()) {
                            z10 = aVar.n(i12);
                            i12++;
                        } else {
                            z10 = false;
                        }
                        if (i10 != -1 && d.f(i10, i14, d10)) {
                            z10 = !z10;
                        }
                        bVar.h(i14, d10, z10);
                    }
                }
                d10 += i11;
            }
            i11 = -i11;
            d10 += i11;
            e10 -= 2;
        }
        if (i12 != aVar.s()) {
            throw new w("Not all bits consumed: " + i12 + '/' + aVar.s());
        }
    }

    public static void g(int i10, int i11, b bVar) throws w {
        int i12 = 0;
        while (i12 < 8) {
            int i13 = i10 + i12;
            if (o(bVar.b(i13, i11))) {
                bVar.g(i13, i11, 0);
                i12++;
            } else {
                throw new w();
            }
        }
    }

    public static void h(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = f24497b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                bVar.g(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void i(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f24496a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.g(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void j(b bVar) throws w {
        int length = f24496a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m((bVar.d() - 7) - 1, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    public static void k(b bVar) {
        int i10 = 8;
        while (i10 < bVar.e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (o(bVar.b(i10, 6))) {
                bVar.g(i10, 6, i12);
            }
            if (o(bVar.b(6, i10))) {
                bVar.g(6, i10, i12);
            }
            i10 = i11;
        }
    }

    public static void l(f fVar, int i10, b bVar) throws w {
        int i11;
        ya.a aVar = new ya.a();
        p(fVar, i10, aVar);
        for (int i12 = 0; i12 < aVar.s(); i12++) {
            boolean n10 = aVar.n((aVar.s() - 1) - i12);
            int[] iArr = f24499d[i12];
            bVar.h(iArr[0], iArr[1], n10);
            int i13 = 8;
            if (i12 < 8) {
                i11 = 8;
                i13 = (bVar.e() - i12) - 1;
            } else {
                i11 = (bVar.d() - 7) + (i12 - 8);
            }
            bVar.h(i13, i11, n10);
        }
    }

    public static void m(int i10, int i11, b bVar) throws w {
        int i12 = 0;
        while (i12 < 7) {
            int i13 = i11 + i12;
            if (o(bVar.b(i10, i13))) {
                bVar.g(i10, i13, 0);
                i12++;
            } else {
                throw new w();
            }
        }
    }

    public static int n(int i10) {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    public static boolean o(int i10) {
        return i10 == -1;
    }

    public static void p(f fVar, int i10, ya.a aVar) throws w {
        if (f.f(i10)) {
            int b10 = (fVar.b() << 3) | i10;
            aVar.g(b10, 5);
            aVar.g(b(b10, f24501f), 10);
            ya.a aVar2 = new ya.a();
            aVar2.g(21522, 15);
            aVar.B(aVar2);
            if (aVar.s() != 15) {
                throw new w("should not happen but we got: " + aVar.s());
            }
            return;
        }
        throw new w("Invalid mask pattern");
    }

    public static void q(j jVar, ya.a aVar) throws w {
        aVar.g(jVar.j(), 6);
        aVar.g(b(jVar.j(), f24500e), 12);
        if (aVar.s() != 18) {
            throw new w("should not happen but we got: " + aVar.s());
        }
    }

    public static void r(j jVar, b bVar) {
        if (jVar.j() >= 2) {
            int[] iArr = f24498c[jVar.j() - 1];
            for (int i10 : iArr) {
                if (i10 >= 0) {
                    for (int i11 : iArr) {
                        if (i11 >= 0 && o(bVar.b(i11, i10))) {
                            h(i11 - 2, i10 - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    public static void s(j jVar, b bVar) throws w {
        if (jVar.j() >= 7) {
            ya.a aVar = new ya.a();
            q(jVar, aVar);
            int i10 = 17;
            for (int i11 = 0; i11 < 6; i11++) {
                for (int i12 = 0; i12 < 3; i12++) {
                    boolean n10 = aVar.n(i10);
                    i10--;
                    bVar.h(i11, (bVar.d() - 11) + i12, n10);
                    bVar.h((bVar.d() - 11) + i12, i11, n10);
                }
            }
        }
    }
}
