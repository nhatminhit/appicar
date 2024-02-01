package ua;

import ab.d;
import ya.a;
import ya.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23318a = 33;

    /* renamed from: b  reason: collision with root package name */
    public static final int f23319b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f23320c = 32;

    /* renamed from: d  reason: collision with root package name */
    public static final int f23321d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f23322e = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int s10 = aVar.s() / i10;
        for (int i12 = 0; i12 < s10; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= aVar.n((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    public static void b(b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 > i15) {
                    break;
                }
                bVar.w(i14, i13);
                bVar.w(i14, i15);
                bVar.w(i13, i14);
                bVar.w(i15, i14);
                i14++;
            }
        }
        int i16 = i10 - i11;
        bVar.w(i16, i16);
        int i17 = i16 + 1;
        bVar.w(i17, i16);
        bVar.w(i16, i17);
        int i18 = i10 + i11;
        bVar.w(i18, i16);
        bVar.w(i18, i17);
        bVar.w(i18, i18 - 1);
    }

    public static void c(b bVar, boolean z10, int i10, a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.n(i12)) {
                    bVar.w(i13, i11 - 5);
                }
                if (aVar.n(i12 + 7)) {
                    bVar.w(i11 + 5, i13);
                }
                if (aVar.n(20 - i12)) {
                    bVar.w(i13, i11 + 5);
                }
                if (aVar.n(27 - i12)) {
                    bVar.w(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.n(i12)) {
                bVar.w(i14, i11 - 7);
            }
            if (aVar.n(i12 + 10)) {
                bVar.w(i11 + 7, i14);
            }
            if (aVar.n(29 - i12)) {
                bVar.w(i14, i11 + 7);
            }
            if (aVar.n(39 - i12)) {
                bVar.w(i11 - 7, i14);
            }
            i12++;
        }
    }

    public static a d(byte[] bArr) {
        return e(bArr, 33, 0);
    }

    public static a e(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        a aVar;
        int i15;
        a a10 = new d(bArr).a();
        int i16 = 11;
        int s10 = ((a10.s() * i10) / 100) + 11;
        int s11 = a10.s() + s10;
        int i17 = 32;
        boolean z11 = 0;
        boolean z12 = true;
        if (i11 != 0) {
            z10 = i11 < 0;
            i13 = Math.abs(i11);
            if (z10) {
                i17 = 4;
            }
            if (i13 <= i17) {
                i14 = j(i13, z10);
                i12 = f23322e[i13];
                int i18 = i14 - (i14 % i12);
                aVar = i(a10, i12);
                if (aVar.s() + s10 > i18) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z10 && aVar.s() > (i12 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i11)}));
            }
        } else {
            a aVar2 = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 <= 32) {
                boolean z13 = i19 <= 3 ? z12 : z11;
                int i21 = z13 ? i19 + 1 : i19;
                int j10 = j(i21, z13);
                if (s11 <= j10) {
                    if (aVar2 == null || i20 != f23322e[i21]) {
                        int i22 = f23322e[i21];
                        i20 = i22;
                        aVar2 = i(a10, i22);
                    }
                    int i23 = j10 - (j10 % i20);
                    if ((!z13 || aVar2.s() <= (i20 << 6)) && aVar2.s() + s10 <= i23) {
                        aVar = aVar2;
                        i12 = i20;
                        z10 = z13;
                        i13 = i21;
                        i14 = j10;
                    }
                }
                i19++;
                z12 = z12;
                z11 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        a f10 = f(aVar, i14, i12);
        int s12 = aVar.s() / i12;
        a g10 = g(z10, i13, s12);
        if (!z10) {
            i16 = 14;
        }
        int i24 = i16 + (i13 << 2);
        int[] iArr = new int[i24];
        int i25 = 2;
        if (z10) {
            for (int i26 = z11; i26 < i24; i26++) {
                iArr[i26] = i26;
            }
            i15 = i24;
        } else {
            int i27 = i24 / 2;
            i15 = i24 + 1 + (((i27 - 1) / 15) * 2);
            int i28 = i15 / 2;
            for (int i29 = z11; i29 < i27; i29++) {
                int i30 = (i29 / 15) + i29;
                iArr[(i27 - i29) - (z12 ? 1 : 0)] = (i28 - i30) - 1;
                iArr[i27 + i29] = i30 + i28 + z12;
            }
        }
        b bVar = new b(i15);
        int i31 = z11;
        int i32 = i31;
        while (i31 < i13) {
            int i33 = ((i13 - i31) << i25) + (z10 ? 9 : 12);
            int i34 = z11;
            while (i34 < i33) {
                int i35 = i34 << 1;
                while (z11 < i25) {
                    if (f10.n(i32 + i35 + z11)) {
                        int i36 = i31 << 1;
                        bVar.w(iArr[i36 + z11], iArr[i36 + i34]);
                    }
                    if (f10.n((i33 << 1) + i32 + i35 + z11)) {
                        int i37 = i31 << 1;
                        bVar.w(iArr[i37 + i34], iArr[((i24 - 1) - i37) - z11]);
                    }
                    if (f10.n((i33 << 2) + i32 + i35 + z11)) {
                        int i38 = (i24 - 1) - (i31 << 1);
                        bVar.w(iArr[i38 - z11], iArr[i38 - i34]);
                    }
                    if (f10.n((i33 * 6) + i32 + i35 + z11)) {
                        int i39 = i31 << 1;
                        bVar.w(iArr[((i24 - 1) - i39) - i34], iArr[i39 + z11]);
                    }
                    z11++;
                    i25 = 2;
                }
                i34++;
                z11 = 0;
                i25 = 2;
            }
            i32 += i33 << 3;
            i31++;
            z11 = 0;
            i25 = 2;
        }
        c(bVar, z10, i15, g10);
        int i40 = i15 / 2;
        if (z10) {
            b(bVar, i40, 5);
        } else {
            b(bVar, i40, 7);
            int i41 = 0;
            int i42 = 0;
            while (i42 < (i24 / 2) - 1) {
                for (int i43 = i40 & 1; i43 < i15; i43 += 2) {
                    int i44 = i40 - i41;
                    bVar.w(i44, i43);
                    int i45 = i40 + i41;
                    bVar.w(i45, i43);
                    bVar.w(i43, i44);
                    bVar.w(i43, i45);
                }
                i42 += 15;
                i41 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.g(z10);
        aVar3.j(i15);
        aVar3.h(i13);
        aVar3.f(s12);
        aVar3.i(bVar);
        return aVar3;
    }

    public static a f(a aVar, int i10, int i11) {
        d dVar = new d(h(i11));
        int i12 = i10 / i11;
        int[] a10 = a(aVar, i11, i12);
        dVar.b(a10, i12 - (aVar.s() / i11));
        a aVar2 = new a();
        aVar2.g(0, i10 % i11);
        for (int g10 : a10) {
            aVar2.g(g10, i11);
        }
        return aVar2;
    }

    public static a g(boolean z10, int i10, int i11) {
        int i12;
        a aVar = new a();
        int i13 = i10 - 1;
        if (z10) {
            aVar.g(i13, 2);
            aVar.g(i11 - 1, 6);
            i12 = 28;
        } else {
            aVar.g(i13, 5);
            aVar.g(i11 - 1, 11);
            i12 = 40;
        }
        return f(aVar, i12, 4);
    }

    public static ab.a h(int i10) {
        if (i10 == 4) {
            return ab.a.f16032k;
        }
        if (i10 == 6) {
            return ab.a.f16031j;
        }
        if (i10 == 8) {
            return ab.a.f16035n;
        }
        if (i10 == 10) {
            return ab.a.f16030i;
        }
        if (i10 == 12) {
            return ab.a.f16029h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
    }

    public static a i(a aVar, int i10) {
        a aVar2 = new a();
        int s10 = aVar.s();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < s10) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= s10 || aVar.n(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 != i11) {
                if (i16 == 0) {
                    i16 = i13 | 1;
                } else {
                    aVar2.g(i13, i10);
                    i12 += i10;
                }
            }
            aVar2.g(i16, i10);
            i12--;
            i12 += i10;
        }
        return aVar2;
    }

    public static int j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }
}
