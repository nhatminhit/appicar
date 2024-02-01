package b7;

import b7.i0;
import java.io.IOException;

public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ i0.a O;
    public final /* synthetic */ i0 P;
    public final /* synthetic */ i0.b Q;
    public final /* synthetic */ i0.c R;
    public final /* synthetic */ IOException S;
    public final /* synthetic */ boolean T;

    public /* synthetic */ a0(i0.a aVar, i0 i0Var, i0.b bVar, i0.c cVar, IOException iOException, boolean z10) {
        this.O = aVar;
        this.P = i0Var;
        this.Q = bVar;
        this.R = cVar;
        this.S = iOException;
        this.T = z10;
    }

    public final void run() {
        this.O.q(this.P, this.Q, this.R, this.S, this.T);
    }
}
