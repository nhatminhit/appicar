package d6;

import d6.t;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ t.a O;
    public final /* synthetic */ int P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ long R;

    public /* synthetic */ o(t.a aVar, int i10, long j10, long j11) {
        this.O = aVar;
        this.P = i10;
        this.Q = j10;
        this.R = j11;
    }

    public final void run() {
        this.O.n(this.P, this.Q, this.R);
    }
}
