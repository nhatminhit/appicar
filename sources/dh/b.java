package dh;

import java.util.logging.Level;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Logger;

public final class b implements Runnable, e {
    public final d O = new d();
    public final EventBus P;
    public volatile boolean Q;

    public b(EventBus eventBus) {
        this.P = eventBus;
    }

    public void enqueue(g gVar, Object obj) {
        c a10 = c.a(gVar, obj);
        synchronized (this) {
            this.O.a(a10);
            if (!this.Q) {
                this.Q = true;
                this.P.c().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                c c10 = this.O.c(1000);
                if (c10 == null) {
                    synchronized (this) {
                        c10 = this.O.b();
                        if (c10 == null) {
                            this.Q = false;
                            this.Q = false;
                            return;
                        }
                    }
                }
                this.P.e(c10);
            } catch (InterruptedException e10) {
                try {
                    Logger logger = this.P.getLogger();
                    Level level = Level.WARNING;
                    logger.log(level, Thread.currentThread().getName() + " was interruppted", e10);
                    return;
                } finally {
                    this.Q = false;
                }
            }
        }
    }
}
