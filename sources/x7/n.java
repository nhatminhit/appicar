package x7;

import x7.q;

public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ q.a O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ float S;

    public /* synthetic */ n(q.a aVar, int i10, int i11, int i12, float f10) {
        this.O = aVar;
        this.P = i10;
        this.Q = i11;
        this.R = i12;
        this.S = f10;
    }

    public final void run() {
        this.O.s(this.P, this.Q, this.R, this.S);
    }
}
