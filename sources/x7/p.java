package x7;

import x7.q;

public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ q.a O;
    public final /* synthetic */ String P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ long R;

    public /* synthetic */ p(q.a aVar, String str, long j10, long j11) {
        this.O = aVar;
        this.P = str;
        this.Q = j10;
        this.R = j11;
    }

    public final void run() {
        this.O.m(this.P, this.Q, this.R);
    }
}
