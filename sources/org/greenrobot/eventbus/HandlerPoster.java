package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import dh.c;
import dh.d;
import dh.e;
import dh.g;

public class HandlerPoster extends Handler implements e {
    public final d O = new d();
    public final int P;
    public final EventBus Q;
    public boolean R;

    public HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.Q = eventBus;
        this.P = i10;
    }

    public void enqueue(g gVar, Object obj) {
        c a10 = c.a(gVar, obj);
        synchronized (this) {
            this.O.a(a10);
            if (!this.R) {
                this.R = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                c b10 = this.O.b();
                if (b10 == null) {
                    synchronized (this) {
                        b10 = this.O.b();
                        if (b10 == null) {
                            this.R = false;
                            return;
                        }
                    }
                }
                this.Q.e(b10);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.P));
            if (sendMessage(obtainMessage())) {
                this.R = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th2) {
            this.R = false;
            throw th2;
        }
    }
}
