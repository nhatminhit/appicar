package zd;

import oe.f;
import we.l;
import xe.l0;

public final class l2 {
    @h1(version = "1.3")
    @t
    @f
    public static final long[] a(int i10, l<? super Integer, j2> lVar) {
        l0.p(lVar, "init");
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = lVar.A(Integer.valueOf(i11)).l0();
        }
        return k2.f(jArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] b(long... jArr) {
        l0.p(jArr, "elements");
        return jArr;
    }
}
