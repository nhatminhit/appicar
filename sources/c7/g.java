package c7;

import c7.f;
import java.io.IOException;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ f.b O;
    public final /* synthetic */ IOException P;

    public /* synthetic */ g(f.b bVar, IOException iOException) {
        this.O = bVar;
        this.P = iOException;
    }

    public final void run() {
        this.O.c(this.P);
    }
}
