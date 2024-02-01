package xd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;

public class a extends Thread {
    public static final Logger O = Logger.getLogger(a.class.getName());
    public static final ThreadFactory P = new C0487a();
    public static a Q;
    public static ExecutorService R;
    public static int S = 0;

    /* renamed from: xd.a$a  reason: collision with other inner class name */
    public static class C0487a implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            a unused = a.Q = new a(runnable, (C0487a) null);
            a.Q.setName("EventThread");
            a.Q.setDaemon(Thread.currentThread().isDaemon());
            return a.Q;
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ Runnable O;

        public b(Runnable runnable) {
            this.O = runnable;
        }

        public void run() {
            try {
                this.O.run();
                synchronized (a.class) {
                    a.e();
                    if (a.S == 0) {
                        a.R.shutdown();
                        ExecutorService unused = a.R = null;
                        a unused2 = a.Q = null;
                    }
                }
            } catch (Throwable th2) {
                synchronized (a.class) {
                    a.e();
                    if (a.S == 0) {
                        a.R.shutdown();
                        ExecutorService unused3 = a.R = null;
                        a unused4 = a.Q = null;
                    }
                    throw th2;
                }
            }
        }
    }

    public a(Runnable runnable) {
        super(runnable);
    }

    public /* synthetic */ a(Runnable runnable, C0487a aVar) {
        this(runnable);
    }

    public static /* synthetic */ int e() {
        int i10 = S;
        S = i10 - 1;
        return i10;
    }

    public static void h(Runnable runnable) {
        if (i()) {
            runnable.run();
        } else {
            j(runnable);
        }
    }

    public static boolean i() {
        return Thread.currentThread() == Q;
    }

    public static void j(Runnable runnable) {
        ExecutorService executorService;
        synchronized (a.class) {
            S++;
            if (R == null) {
                R = Executors.newSingleThreadExecutor(P);
            }
            executorService = R;
        }
        executorService.execute(new b(runnable));
    }
}
