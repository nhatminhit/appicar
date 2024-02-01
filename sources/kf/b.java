package kf;

import fh.g;
import ve.h;
import we.a;
import xe.l0;
import zd.u2;

@h(name = "TimingKt")
public final class b {
    public static final long a(@g a<u2> aVar) {
        l0.p(aVar, "block");
        long nanoTime = System.nanoTime();
        aVar.n();
        return System.nanoTime() - nanoTime;
    }

    public static final long b(@g a<u2> aVar) {
        l0.p(aVar, "block");
        long currentTimeMillis = System.currentTimeMillis();
        aVar.n();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
