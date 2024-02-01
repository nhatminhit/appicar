package qc;

import java.util.concurrent.Callable;
import qc.c;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ c O;
    public final /* synthetic */ Callable P;
    public final /* synthetic */ c.a Q;

    public /* synthetic */ b(c cVar, Callable callable, c.a aVar) {
        this.O = cVar;
        this.P = callable;
        this.Q = aVar;
    }

    public final void run() {
        this.O.e(this.P, this.Q);
    }
}
