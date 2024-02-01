package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public final class j extends ScheduledThreadPoolExecutor {

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j f22133a = new j();
    }

    public j() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    public static j a() {
        return b.f22133a;
    }
}
