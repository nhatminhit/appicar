package lb;

import qa.m;
import ya.a;

public final class k extends y {

    /* renamed from: k  reason: collision with root package name */
    public final int[] f20469k = new int[4];

    public int l(a aVar, int[] iArr, StringBuilder sb2) throws m {
        int[] iArr2 = this.f20469k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int s10 = aVar.s();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < s10; i11++) {
            sb2.append((char) (y.j(aVar, iArr2, i10, y.f20508i) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = y.n(aVar, i10, true, y.f20506g)[1];
        for (int i14 = 0; i14 < 4 && i13 < s10; i14++) {
            sb2.append((char) (y.j(aVar, iArr2, i13, y.f20508i) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    public qa.a q() {
        return qa.a.EAN_8;
    }
}
