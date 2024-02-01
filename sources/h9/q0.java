package h9;

import android.os.Handler;
import android.os.Looper;
import c9.a;
import d.m0;
import java.util.concurrent.Executor;

public final class q0 implements Executor {
    public final Handler O = new a(Looper.getMainLooper());

    public final void execute(@m0 Runnable runnable) {
        this.O.post(runnable);
    }
}
