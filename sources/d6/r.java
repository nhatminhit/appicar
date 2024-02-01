package d6;

import d6.t;

public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ t.a O;
    public final /* synthetic */ String P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ long R;

    public /* synthetic */ r(t.a aVar, String str, long j10, long j11) {
        this.O = aVar;
        this.P = str;
        this.Q = j10;
        this.R = j11;
    }

    public final void run() {
        this.O.o(this.P, this.Q, this.R);
    }
}
