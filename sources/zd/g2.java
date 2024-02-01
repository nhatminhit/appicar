package zd;

import oe.f;
import we.l;
import xe.l0;

public final class g2 {
    @h1(version = "1.3")
    @t
    @f
    public static final int[] a(int i10, l<? super Integer, e2> lVar) {
        l0.p(lVar, "init");
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = lVar.A(Integer.valueOf(i11)).l0();
        }
        return f2.f(iArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] b(int... iArr) {
        l0.p(iArr, "elements");
        return iArr;
    }
}
