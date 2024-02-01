package le;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import xe.l0;
import zd.d1;
import zd.e1;
import zd.u2;

public final class l implements d<u2> {
    @h
    public d1<u2> O;

    public final void a() {
        synchronized (this) {
            while (true) {
                d1<u2> d1Var = this.O;
                if (d1Var == null) {
                    l0.n(this, "null cannot be cast to non-null type java.lang.Object");
                    wait();
                } else {
                    e1.n(d1Var.l());
                }
            }
        }
    }

    @h
    public final d1<u2> b() {
        return this.O;
    }

    public final void d(@h d1<u2> d1Var) {
        this.O = d1Var;
    }

    @g
    public ie.g e() {
        return i.O;
    }

    public void x(@g Object obj) {
        synchronized (this) {
            this.O = d1.a(obj);
            l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            u2 u2Var = u2.f25116a;
        }
    }
}
