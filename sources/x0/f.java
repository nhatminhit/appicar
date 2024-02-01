package x0;

import android.os.Handler;
import d.m0;
import e1.n;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class f {

    public static class a implements Executor {
        public final Handler O;

        public a(@m0 Handler handler) {
            this.O = (Handler) n.g(handler);
        }

        public void execute(@m0 Runnable runnable) {
            if (!this.O.post((Runnable) n.g(runnable))) {
                throw new RejectedExecutionException(this.O + " is shutting down");
            }
        }
    }

    @m0
    public static Executor a(@m0 Handler handler) {
        return new a(handler);
    }
}
