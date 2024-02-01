package rh;

import rh.g;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ g.b.a O;
    public final /* synthetic */ d P;
    public final /* synthetic */ u Q;

    public /* synthetic */ h(g.b.a aVar, d dVar, u uVar) {
        this.O = aVar;
        this.P = dVar;
        this.Q = uVar;
    }

    public final void run() {
        this.O.f(this.P, this.Q);
    }
}
