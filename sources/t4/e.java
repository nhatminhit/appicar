package t4;

import android.os.Handler;
import android.os.Looper;
import d.g1;
import d.m0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f12943a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f12944b = new b();

    public class a implements Executor {
        public final Handler O = new Handler(Looper.getMainLooper());

        public void execute(@m0 Runnable runnable) {
            this.O.post(runnable);
        }
    }

    public class b implements Executor {
        public void execute(@m0 Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f12944b;
    }

    public static Executor b() {
        return f12943a;
    }

    @g1
    public static void c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5, timeUnit)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        } catch (InterruptedException e10) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e10);
        }
    }
}
