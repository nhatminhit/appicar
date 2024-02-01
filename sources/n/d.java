package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class d extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10665a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f10666b = Executors.newFixedThreadPool(4, new a());
    @o0

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f10667c;

    public class a implements ThreadFactory {

        /* renamed from: c  reason: collision with root package name */
        public static final String f10668c = "arch_disk_io_";

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f10669a = new AtomicInteger(0);

        public a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(f10668c + this.f10669a.getAndIncrement());
            return thread;
        }
    }

    @t0(28)
    public static class b {
        @m0
        public static Handler a(@m0 Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @m0
    public static Handler e(@m0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public void a(@m0 Runnable runnable) {
        this.f10666b.execute(runnable);
    }

    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void d(@m0 Runnable runnable) {
        if (this.f10667c == null) {
            synchronized (this.f10665a) {
                if (this.f10667c == null) {
                    this.f10667c = e(Looper.getMainLooper());
                }
            }
        }
        this.f10667c.post(runnable);
    }
}
