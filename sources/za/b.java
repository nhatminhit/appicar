package za;

import qa.m;
import qa.t;

@Deprecated
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final int f25010b = 32;

    /* renamed from: a  reason: collision with root package name */
    public final ya.b f25011a;

    public b(ya.b bVar) {
        this.f25011a = bVar;
    }

    public final int[] a(int i10, int i11, int i12, int i13, boolean z10) {
        int i14 = (i12 + i13) / 2;
        int i15 = i14;
        while (i15 >= i12) {
            ya.b bVar = this.f25011a;
            if (!z10 ? !bVar.j(i10, i15) : !bVar.j(i15, i10)) {
                int i16 = i15;
                while (true) {
                    i16--;
                    if (i16 < i12) {
                        break;
                    }
                    ya.b bVar2 = this.f25011a;
                    if (z10) {
                        if (bVar2.j(i16, i10)) {
                            break;
                        }
                    } else if (bVar2.j(i10, i16)) {
                        break;
                    }
                }
                int i17 = i15 - i16;
                if (i16 < i12 || i17 > i11) {
                    break;
                }
                i15 = i16;
            } else {
                i15--;
            }
        }
        int i18 = i15 + 1;
        while (i14 < i13) {
            ya.b bVar3 = this.f25011a;
            if (!z10 ? !bVar3.j(i10, i14) : !bVar3.j(i14, i10)) {
                int i19 = i14;
                while (true) {
                    i19++;
                    if (i19 >= i13) {
                        break;
                    }
                    ya.b bVar4 = this.f25011a;
                    if (z10) {
                        if (bVar4.j(i19, i10)) {
                            break;
                        }
                    } else if (bVar4.j(i10, i19)) {
                        break;
                    }
                }
                int i20 = i19 - i14;
                if (i19 >= i13 || i20 > i11) {
                    break;
                }
                i14 = i19;
            } else {
                i14++;
            }
        }
        int i21 = i14 - 1;
        if (i21 <= i18) {
            return null;
        }
        return new int[]{i18, i21};
    }

    public t[] b() throws m {
        int n10 = this.f25011a.n();
        int s10 = this.f25011a.s();
        int i10 = n10 / 2;
        int i11 = s10 / 2;
        int max = Math.max(1, n10 / 256);
        int i12 = -max;
        int i13 = i11 / 2;
        int i14 = i11;
        int i15 = s10;
        int i16 = i10;
        int i17 = i12;
        int i18 = n10;
        int i19 = max;
        int max2 = Math.max(1, s10 / 256);
        int i20 = -max2;
        int d10 = ((int) c(i14, 0, 0, i15, i16, i12, 0, i18, i13).d()) - 1;
        int i21 = max2;
        int i22 = i10 / 2;
        t c10 = c(i14, i20, 0, i15, i16, 0, d10, i18, i22);
        int c11 = ((int) c10.c()) - 1;
        t c12 = c(i14, i21, c11, i15, i16, 0, d10, i18, i22);
        int c13 = ((int) c12.c()) + 1;
        t c14 = c(i14, 0, c11, c13, i16, i19, d10, i18, i13);
        return new t[]{c(i14, 0, c11, c13, i16, i17, d10, ((int) c14.d()) + 1, i11 / 4), c10, c12, c14};
    }

    public final t c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) throws m {
        boolean z10;
        int i19;
        int i20;
        int i21;
        int i22;
        b bVar;
        int i23 = i10;
        int i24 = i14;
        int[] iArr = null;
        int i25 = i17;
        int i26 = i23;
        int i27 = i24;
        while (i27 < i25 && i27 >= i16 && i26 < i13 && i26 >= i12) {
            if (i11 == 0) {
                z10 = true;
                bVar = this;
                i22 = i27;
                i21 = i18;
                i20 = i12;
                i19 = i13;
            } else {
                z10 = false;
                bVar = this;
                i22 = i26;
                i21 = i18;
                i20 = i16;
                i19 = i17;
            }
            int[] a10 = bVar.a(i22, i21, i20, i19, z10);
            if (a10 != null) {
                i27 += i15;
                i26 += i11;
                iArr = a10;
            } else if (iArr != null) {
                char c10 = 0;
                if (i11 == 0) {
                    int i28 = i27 - i15;
                    int i29 = iArr[0];
                    if (i29 >= i23) {
                        return new t((float) iArr[1], (float) i28);
                    }
                    if (iArr[1] <= i23) {
                        return new t((float) i29, (float) i28);
                    }
                    if (i15 <= 0) {
                        c10 = 1;
                    }
                    return new t((float) iArr[c10], (float) i28);
                }
                int i30 = i26 - i11;
                int i31 = iArr[0];
                if (i31 >= i24) {
                    return new t((float) i30, (float) iArr[1]);
                }
                if (iArr[1] <= i24) {
                    return new t((float) i30, (float) i31);
                }
                float f10 = (float) i30;
                if (i11 >= 0) {
                    c10 = 1;
                }
                return new t(f10, (float) iArr[c10]);
            } else {
                throw m.a();
            }
        }
        throw m.a();
    }
}
