package q8;

import d.m0;
import java.util.concurrent.ScheduledExecutorService;

@e8.a
@Deprecated
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static C0204a f12043a;

    /* renamed from: q8.a$a  reason: collision with other inner class name */
    public interface C0204a {
        @e8.a
        @Deprecated
        @m0
        ScheduledExecutorService a();
    }

    @e8.a
    @Deprecated
    @m0
    public static synchronized C0204a a() {
        C0204a aVar;
        synchronized (a.class) {
            if (f12043a == null) {
                f12043a = new b();
            }
            aVar = f12043a;
        }
        return aVar;
    }
}
