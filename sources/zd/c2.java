package zd;

import oe.f;
import we.l;
import xe.l0;

public final class c2 {
    @h1(version = "1.3")
    @t
    @f
    public static final byte[] a(int i10, l<? super Integer, a2> lVar) {
        l0.p(lVar, "init");
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = lVar.A(Integer.valueOf(i11)).j0();
        }
        return b2.f(bArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] b(byte... bArr) {
        l0.p(bArr, "elements");
        return bArr;
    }
}
