package m2;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import d.x0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d<Params, Progress, Result> {
    public static final String T = "AsyncTask";
    public static final int U = 5;
    public static final int V = 128;
    public static final int W = 1;
    public static final ThreadFactory X;
    public static final BlockingQueue<Runnable> Y;
    public static final Executor Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f10335a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f10336b0 = 2;

    /* renamed from: c0  reason: collision with root package name */
    public static f f10337c0;

    /* renamed from: d0  reason: collision with root package name */
    public static volatile Executor f10338d0;
    public final h<Params, Result> O;
    public final FutureTask<Result> P;
    public volatile g Q = g.PENDING;
    public final AtomicBoolean R = new AtomicBoolean();
    public final AtomicBoolean S = new AtomicBoolean();

    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f10339a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f10339a.getAndIncrement());
        }
    }

    public class b extends h<Params, Result> {
        public b() {
        }

        public Result call() throws Exception {
            d.this.S.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = d.this.b(this.f10344a);
                Binder.flushPendingCommands();
                d.this.q(result);
                return result;
            } catch (Throwable th2) {
                d.this.q(result);
                throw th2;
            }
        }
    }

    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        public void done() {
            try {
                d.this.r(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e10) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e10.getCause());
            } catch (CancellationException unused2) {
                d.this.r(null);
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: m2.d$d  reason: collision with other inner class name */
    public static /* synthetic */ class C0181d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10341a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                m2.d$g[] r0 = m2.d.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10341a = r0
                m2.d$g r1 = m2.d.g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10341a     // Catch:{ NoSuchFieldError -> 0x001d }
                m2.d$g r1 = m2.d.g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.d.C0181d.<clinit>():void");
        }
    }

    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d f10342a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f10343b;

        public e(d dVar, Data... dataArr) {
            this.f10342a = dVar;
            this.f10343b = dataArr;
        }
    }

    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f10342a.f(eVar.f10343b[0]);
            } else if (i10 == 2) {
                eVar.f10342a.p(eVar.f10343b);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        public Params[] f10344a;
    }

    static {
        a aVar = new a();
        X = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        Y = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        Z = threadPoolExecutor;
        f10338d0 = threadPoolExecutor;
    }

    public d() {
        b bVar = new b();
        this.O = bVar;
        this.P = new c(bVar);
    }

    public static void d(Runnable runnable) {
        f10338d0.execute(runnable);
    }

    public static Handler i() {
        f fVar;
        synchronized (d.class) {
            if (f10337c0 == null) {
                f10337c0 = new f();
            }
            fVar = f10337c0;
        }
        return fVar;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public static void t(Executor executor) {
        f10338d0 = executor;
    }

    public final boolean a(boolean z10) {
        this.R.set(true);
        return this.P.cancel(z10);
    }

    public abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Params... paramsArr) {
        return e(f10338d0, paramsArr);
    }

    public final d<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.Q != g.PENDING) {
            int i10 = C0181d.f10341a[this.Q.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i10 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.Q = g.RUNNING;
            o();
            this.O.f10344a = paramsArr;
            executor.execute(this.P);
            return this;
        }
    }

    public void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.Q = g.FINISHED;
    }

    public final Result g() throws InterruptedException, ExecutionException {
        return this.P.get();
    }

    public final Result h(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.P.get(j10, timeUnit);
    }

    public final g j() {
        return this.Q;
    }

    public final boolean k() {
        return this.R.get();
    }

    public void l() {
    }

    public void m(Result result) {
        l();
    }

    public void n(Result result) {
    }

    public void o() {
    }

    public void p(Progress... progressArr) {
    }

    public Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void r(Result result) {
        if (!this.S.get()) {
            q(result);
        }
    }

    public final void s(Progress... progressArr) {
        if (!k()) {
            i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
        }
    }
}
