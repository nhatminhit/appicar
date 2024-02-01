package x8;

import android.os.Process;

public final class d implements Runnable {
    public final Runnable O;

    public d(Runnable runnable, int i10) {
        this.O = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.O.run();
    }
}
