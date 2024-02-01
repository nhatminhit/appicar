package androidx.lifecycle;

import fh.g;
import pf.m1;
import pf.o0;
import ve.e;
import xe.l0;

public final class j0 extends o0 {
    @g
    @e
    public final j Q = new j();

    public void N1(@g ie.g gVar, @g Runnable runnable) {
        l0.p(gVar, "context");
        l0.p(runnable, "block");
        this.Q.c(gVar, runnable);
    }

    public boolean P1(@g ie.g gVar) {
        l0.p(gVar, "context");
        if (m1.e().S1().P1(gVar)) {
            return true;
        }
        return !this.Q.b();
    }
}
