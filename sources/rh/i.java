package rh;

import rh.g;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ g.b.a O;
    public final /* synthetic */ d P;
    public final /* synthetic */ Throwable Q;

    public /* synthetic */ i(g.b.a aVar, d dVar, Throwable th2) {
        this.O = aVar;
        this.P = dVar;
        this.Q = th2;
    }

    public final void run() {
        this.O.e(this.P, this.Q);
    }
}
