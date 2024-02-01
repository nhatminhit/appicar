package x7;

import android.view.Surface;
import x7.q;

public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ q.a O;
    public final /* synthetic */ Surface P;

    public /* synthetic */ o(q.a aVar, Surface surface) {
        this.O = aVar;
        this.P = surface;
    }

    public final void run() {
        this.O.r(this.P);
    }
}
