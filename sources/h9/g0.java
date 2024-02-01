package h9;

import j8.s;

public final class g0 implements Runnable {
    public final /* synthetic */ m O;
    public final /* synthetic */ h0 P;

    public g0(h0 h0Var, m mVar) {
        this.P = h0Var;
        this.O = mVar;
    }

    public final void run() {
        synchronized (this.P.f8927b) {
            h0 h0Var = this.P;
            if (h0Var.f8928c != null) {
                h0Var.f8928c.c((Exception) s.l(this.O.q()));
            }
        }
    }
}
