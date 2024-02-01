package y0;

import android.os.Handler;
import android.os.Process;
import d.e0;
import d.m0;
import e1.n;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class g {

    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public String f15298a;

        /* renamed from: b  reason: collision with root package name */
        public int f15299b;

        /* renamed from: y0.g$a$a  reason: collision with other inner class name */
        public static class C0243a extends Thread {
            public final int O;

            public C0243a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.O = i10;
            }

            public void run() {
                Process.setThreadPriority(this.O);
                super.run();
            }
        }

        public a(@m0 String str, int i10) {
            this.f15298a = str;
            this.f15299b = i10;
        }

        public Thread newThread(Runnable runnable) {
            return new C0243a(runnable, this.f15298a, this.f15299b);
        }
    }

    public static class b implements Executor {
        public final Handler O;

        public b(@m0 Handler handler) {
            this.O = (Handler) n.g(handler);
        }

        public void execute(@m0 Runnable runnable) {
            if (!this.O.post((Runnable) n.g(runnable))) {
                throw new RejectedExecutionException(this.O + " is shutting down");
            }
        }
    }

    public static class c<T> implements Runnable {
        @m0
        public Callable<T> O;
        @m0
        public e1.c<T> P;
        @m0
        public Handler Q;

        public class a implements Runnable {
            public final /* synthetic */ e1.c O;
            public final /* synthetic */ Object P;

            public a(e1.c cVar, Object obj) {
                this.O = cVar;
                this.P = obj;
            }

            public void run() {
                this.O.accept(this.P);
            }
        }

        public c(@m0 Handler handler, @m0 Callable<T> callable, @m0 e1.c<T> cVar) {
            this.O = callable;
            this.P = cVar;
            this.Q = handler;
        }

        public void run() {
            T t10;
            try {
                t10 = this.O.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.Q.post(new a(this.P, t10));
        }
    }

    public static ThreadPoolExecutor a(@m0 String str, int i10, @e0(from = 0) int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(@m0 Handler handler) {
        return new b(handler);
    }

    public static <T> void c(@m0 Executor executor, @m0 Callable<T> callable, @m0 e1.c<T> cVar) {
        executor.execute(new c(b.a(), callable, cVar));
    }

    public static <T> T d(@m0 ExecutorService executorService, @m0 Callable<T> callable, @e0(from = 0) int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i10, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
