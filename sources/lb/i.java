package lb;

import qa.m;
import ya.a;

public final class i extends y {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f20466l = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k  reason: collision with root package name */
    public final int[] f20467k = new int[4];

    public static void s(StringBuilder sb2, int i10) throws m {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f20466l[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw m.a();
    }

    public int l(a aVar, int[] iArr, StringBuilder sb2) throws m {
        int[] iArr2 = this.f20467k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int s10 = aVar.s();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < s10; i12++) {
            int j10 = y.j(aVar, iArr2, i10, y.f20509j);
            sb2.append((char) ((j10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (j10 >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        s(sb2, i11);
        int i14 = y.n(aVar, i10, true, y.f20506g)[1];
        for (int i15 = 0; i15 < 6 && i14 < s10; i15++) {
            sb2.append((char) (y.j(aVar, iArr2, i14, y.f20508i) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        return i14;
    }

    public qa.a q() {
        return qa.a.EAN_13;
    }
}
