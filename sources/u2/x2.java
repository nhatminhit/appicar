package u2;

import d.m0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class x2 implements Executor {
    public final Executor O;
    public final ArrayDeque<Runnable> P = new ArrayDeque<>();
    public Runnable Q;

    public class a implements Runnable {
        public final /* synthetic */ Runnable O;

        public a(Runnable runnable) {
            this.O = runnable;
        }

        public void run() {
            try {
                this.O.run();
            } finally {
                x2.this.a();
            }
        }
    }

    public x2(@m0 Executor executor) {
        this.O = executor;
    }

    public synchronized void a() {
        Runnable poll = this.P.poll();
        this.Q = poll;
        if (poll != null) {
            this.O.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.P.offer(new a(runnable));
        if (this.Q == null) {
            a();
        }
    }
}
