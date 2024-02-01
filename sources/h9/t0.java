package h9;

import java.util.concurrent.TimeoutException;

public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ n O;

    public /* synthetic */ t0(n nVar) {
        this.O = nVar;
    }

    public final void run() {
        this.O.d(new TimeoutException());
    }
}
