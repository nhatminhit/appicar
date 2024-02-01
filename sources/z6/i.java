package z6;

import java.io.IOException;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ l O;
    public final /* synthetic */ IOException P;

    public /* synthetic */ i(l lVar, IOException iOException) {
        this.O = lVar;
        this.P = iOException;
    }

    public final void run() {
        this.O.E(this.P);
    }
}
