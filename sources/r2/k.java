package r2;

import android.view.Choreographer;

public final /* synthetic */ class k implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable O;

    public /* synthetic */ k(Runnable runnable) {
        this.O = runnable;
    }

    public final void doFrame(long j10) {
        this.O.run();
    }
}
