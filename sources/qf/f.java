package qf;

import android.view.Choreographer;
import pf.q;

public final /* synthetic */ class f implements Choreographer.FrameCallback {
    public final /* synthetic */ q O;

    public /* synthetic */ f(q qVar) {
        this.O = qVar;
    }

    public final void doFrame(long j10) {
        g.k(this.O, j10);
    }
}
