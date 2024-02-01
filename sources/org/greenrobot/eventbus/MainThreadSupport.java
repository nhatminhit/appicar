package org.greenrobot.eventbus;

import android.os.Looper;
import dh.e;

public interface MainThreadSupport {

    public static class AndroidHandlerMainThreadSupport implements MainThreadSupport {

        /* renamed from: a  reason: collision with root package name */
        public final Looper f21880a;

        public AndroidHandlerMainThreadSupport(Looper looper) {
            this.f21880a = looper;
        }

        public e createPoster(EventBus eventBus) {
            return new HandlerPoster(eventBus, this.f21880a, 10);
        }

        public boolean isMainThread() {
            return this.f21880a == Looper.myLooper();
        }
    }

    e createPoster(EventBus eventBus);

    boolean isMainThread();
}
