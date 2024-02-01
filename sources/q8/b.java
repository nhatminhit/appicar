package q8;

import com.google.android.gms.internal.common.s;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import q8.a;

public final class b implements a.C0204a {
    public final ScheduledExecutorService a() {
        s.a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
