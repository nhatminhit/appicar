package x7;

import x7.q;

public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ q.a O;
    public final /* synthetic */ int P;
    public final /* synthetic */ long Q;

    public /* synthetic */ m(q.a aVar, int i10, long j10) {
        this.O = aVar;
        this.P = i10;
        this.Q = j10;
    }

    public final void run() {
        this.O.o(this.P, this.Q);
    }
}
