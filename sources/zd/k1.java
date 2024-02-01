package zd;

import oe.f;
import we.a;
import xe.i0;
import xe.l0;

public class k1 extends j1 {
    @f
    public static final <R> R l(Object obj, a<? extends R> aVar) {
        R n10;
        l0.p(obj, "lock");
        l0.p(aVar, "block");
        synchronized (obj) {
            try {
                n10 = aVar.n();
                i0.d(1);
            } catch (Throwable th2) {
                i0.d(1);
                i0.c(1);
                throw th2;
            }
        }
        i0.c(1);
        return n10;
    }
}
