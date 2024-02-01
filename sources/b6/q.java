package b6;

import b6.a;
import java.util.concurrent.CopyOnWriteArrayList;

public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ CopyOnWriteArrayList O;
    public final /* synthetic */ a.b P;

    public /* synthetic */ q(CopyOnWriteArrayList copyOnWriteArrayList, a.b bVar) {
        this.O = copyOnWriteArrayList;
        this.P = bVar;
    }

    public final void run() {
        s.T0(this.O, this.P);
    }
}
