package b4;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import d.e0;
import d.g1;
import d.m0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class a implements ExecutorService {
    public static final String P = "source";
    public static final String Q = "disk-cache";
    public static final int R = 1;
    public static final String S = "GlideExecutor";
    public static final String T = "source-unlimited";
    public static final String U = "animation";
    public static final long V = TimeUnit.SECONDS.toMillis(10);
    public static final int W = 4;
    public static volatile int X;
    public final ExecutorService O;

    /* renamed from: b4.a$a  reason: collision with other inner class name */
    public static final class C0062a {

        /* renamed from: g  reason: collision with root package name */
        public static final long f4113g = 0;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4114a;

        /* renamed from: b  reason: collision with root package name */
        public int f4115b;

        /* renamed from: c  reason: collision with root package name */
        public int f4116c;
        @m0

        /* renamed from: d  reason: collision with root package name */
        public c f4117d = c.f4128d;

        /* renamed from: e  reason: collision with root package name */
        public String f4118e;

        /* renamed from: f  reason: collision with root package name */
        public long f4119f;

        public C0062a(boolean z10) {
            this.f4114a = z10;
        }

        public a a() {
            if (!TextUtils.isEmpty(this.f4118e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f4115b, this.f4116c, this.f4119f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f4118e, this.f4117d, this.f4114a));
                if (this.f4119f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f4118e);
        }

        public C0062a b(String str) {
            this.f4118e = str;
            return this;
        }

        public C0062a c(@e0(from = 1) int i10) {
            this.f4115b = i10;
            this.f4116c = i10;
            return this;
        }

        public C0062a d(long j10) {
            this.f4119f = j10;
            return this;
        }

        public C0062a e(@m0 c cVar) {
            this.f4117d = cVar;
            return this;
        }
    }

    public static final class b implements ThreadFactory {

        /* renamed from: e  reason: collision with root package name */
        public static final int f4120e = 9;

        /* renamed from: a  reason: collision with root package name */
        public final String f4121a;

        /* renamed from: b  reason: collision with root package name */
        public final c f4122b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4123c;

        /* renamed from: d  reason: collision with root package name */
        public int f4124d;

        /* renamed from: b4.a$b$a  reason: collision with other inner class name */
        public class C0063a extends Thread {
            public C0063a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f4123c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th2) {
                    b.this.f4122b.a(th2);
                }
            }
        }

        public b(String str, c cVar, boolean z10) {
            this.f4121a = str;
            this.f4122b = cVar;
            this.f4123c = z10;
        }

        public synchronized Thread newThread(@m0 Runnable runnable) {
            C0063a aVar;
            aVar = new C0063a(runnable, "glide-" + this.f4121a + "-thread-" + this.f4124d);
            this.f4124d = this.f4124d + 1;
            return aVar;
        }
    }

    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f4125a = new C0064a();

        /* renamed from: b  reason: collision with root package name */
        public static final c f4126b;

        /* renamed from: c  reason: collision with root package name */
        public static final c f4127c = new C0065c();

        /* renamed from: d  reason: collision with root package name */
        public static final c f4128d;

        /* renamed from: b4.a$c$a  reason: collision with other inner class name */
        public class C0064a implements c {
            public void a(Throwable th2) {
            }
        }

        public class b implements c {
            public void a(Throwable th2) {
                if (th2 != null) {
                    Log.isLoggable(a.S, 6);
                }
            }
        }

        /* renamed from: b4.a$c$c  reason: collision with other inner class name */
        public class C0065c implements c {
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f4126b = bVar;
            f4128d = bVar;
        }

        void a(Throwable th2);
    }

    @g1
    public a(ExecutorService executorService) {
        this.O = executorService;
    }

    public static int a() {
        if (X == 0) {
            X = Math.min(4, b.a());
        }
        return X;
    }

    public static C0062a b() {
        return new C0062a(true).c(a() >= 4 ? 2 : 1).b(U);
    }

    public static a c() {
        return b().a();
    }

    @Deprecated
    public static a d(int i10, c cVar) {
        return b().c(i10).e(cVar).a();
    }

    public static C0062a e() {
        return new C0062a(true).c(1).b(Q);
    }

    public static a f() {
        return e().a();
    }

    @Deprecated
    public static a g(int i10, String str, c cVar) {
        return e().c(i10).b(str).e(cVar).a();
    }

    @Deprecated
    public static a h(c cVar) {
        return e().e(cVar).a();
    }

    public static C0062a i() {
        return new C0062a(false).c(a()).b(P);
    }

    public static a j() {
        return i().a();
    }

    @Deprecated
    public static a k(int i10, String str, c cVar) {
        return i().c(i10).b(str).e(cVar).a();
    }

    @Deprecated
    public static a l(c cVar) {
        return i().e(cVar).a();
    }

    public static a m() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, V, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b(T, c.f4128d, false)));
    }

    public boolean awaitTermination(long j10, @m0 TimeUnit timeUnit) throws InterruptedException {
        return this.O.awaitTermination(j10, timeUnit);
    }

    public void execute(@m0 Runnable runnable) {
        this.O.execute(runnable);
    }

    @m0
    public <T> List<Future<T>> invokeAll(@m0 Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.O.invokeAll(collection);
    }

    @m0
    public <T> List<Future<T>> invokeAll(@m0 Collection<? extends Callable<T>> collection, long j10, @m0 TimeUnit timeUnit) throws InterruptedException {
        return this.O.invokeAll(collection, j10, timeUnit);
    }

    @m0
    public <T> T invokeAny(@m0 Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.O.invokeAny(collection);
    }

    public <T> T invokeAny(@m0 Collection<? extends Callable<T>> collection, long j10, @m0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.O.invokeAny(collection, j10, timeUnit);
    }

    public boolean isShutdown() {
        return this.O.isShutdown();
    }

    public boolean isTerminated() {
        return this.O.isTerminated();
    }

    public void shutdown() {
        this.O.shutdown();
    }

    @m0
    public List<Runnable> shutdownNow() {
        return this.O.shutdownNow();
    }

    @m0
    public Future<?> submit(@m0 Runnable runnable) {
        return this.O.submit(runnable);
    }

    @m0
    public <T> Future<T> submit(@m0 Runnable runnable, T t10) {
        return this.O.submit(runnable, t10);
    }

    public <T> Future<T> submit(@m0 Callable<T> callable) {
        return this.O.submit(callable);
    }

    public String toString() {
        return this.O.toString();
    }
}
