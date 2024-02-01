package zd;

import oe.f;
import we.l;
import xe.l0;

public final class r2 {
    @h1(version = "1.3")
    @t
    @f
    public static final short[] a(int i10, l<? super Integer, p2> lVar) {
        l0.p(lVar, "init");
        short[] sArr = new short[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            sArr[i11] = lVar.A(Integer.valueOf(i11)).j0();
        }
        return q2.f(sArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] b(short... sArr) {
        l0.p(sArr, "elements");
        return sArr;
    }
}
