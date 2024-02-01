package dh;

import org.greenrobot.eventbus.EventBus;

public class a implements Runnable, e {
    public final d O = new d();
    public final EventBus P;

    public a(EventBus eventBus) {
        this.P = eventBus;
    }

    public void enqueue(g gVar, Object obj) {
        this.O.a(c.a(gVar, obj));
        this.P.c().execute(this);
    }

    public void run() {
        c b10 = this.O.b();
        if (b10 != null) {
            this.P.e(b10);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
