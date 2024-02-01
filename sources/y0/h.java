package y0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import d.g1;
import d.x0;
import d.z;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
@Deprecated
public class h {

    /* renamed from: i  reason: collision with root package name */
    public static final int f15300i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f15301j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Object f15302a = new Object();
    @z("mLock")

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f15303b;
    @z("mLock")

    /* renamed from: c  reason: collision with root package name */
    public Handler f15304c;
    @z("mLock")

    /* renamed from: d  reason: collision with root package name */
    public int f15305d;

    /* renamed from: e  reason: collision with root package name */
    public Handler.Callback f15306e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f15307f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15308g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15309h;

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                h.this.c();
                return true;
            } else if (i10 != 1) {
                return true;
            } else {
                h.this.d((Runnable) message.obj);
                return true;
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Callable O;
        public final /* synthetic */ Handler P;
        public final /* synthetic */ d Q;

        public class a implements Runnable {
            public final /* synthetic */ Object O;

            public a(Object obj) {
                this.O = obj;
            }

            public void run() {
                b.this.Q.a(this.O);
            }
        }

        public b(Callable callable, Handler handler, d dVar) {
            this.O = callable;
            this.P = handler;
            this.Q = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.O.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.P.post(new a(obj));
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ AtomicReference O;
        public final /* synthetic */ Callable P;
        public final /* synthetic */ ReentrantLock Q;
        public final /* synthetic */ AtomicBoolean R;
        public final /* synthetic */ Condition S;

        public c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.O = atomicReference;
            this.P = callable;
            this.Q = reentrantLock;
            this.R = atomicBoolean;
            this.S = condition;
        }

        public void run() {
            try {
                this.O.set(this.P.call());
            } catch (Exception unused) {
            }
            this.Q.lock();
            try {
                this.R.set(false);
                this.S.signal();
            } finally {
                this.Q.unlock();
            }
        }
    }

    public interface d<T> {
        void a(T t10);
    }

    public h(String str, int i10, int i11) {
        this.f15309h = str;
        this.f15308g = i10;
        this.f15307f = i11;
        this.f15305d = 0;
    }

    @g1
    public int a() {
        int i10;
        synchronized (this.f15302a) {
            i10 = this.f15305d;
        }
        return i10;
    }

    @g1
    public boolean b() {
        boolean z10;
        synchronized (this.f15302a) {
            z10 = this.f15303b != null;
        }
        return z10;
    }

    public void c() {
        synchronized (this.f15302a) {
            if (!this.f15304c.hasMessages(1)) {
                this.f15303b.quit();
                this.f15303b = null;
                this.f15304c = null;
            }
        }
    }

    public void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f15302a) {
            this.f15304c.removeMessages(0);
            Handler handler = this.f15304c;
            handler.sendMessageDelayed(handler.obtainMessage(0), (long) this.f15307f);
        }
    }

    public final void e(Runnable runnable) {
        synchronized (this.f15302a) {
            if (this.f15303b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f15309h, this.f15308g);
                this.f15303b = handlerThread;
                handlerThread.start();
                this.f15304c = new Handler(this.f15303b.getLooper(), this.f15306e);
                this.f15305d++;
            }
            this.f15304c.removeMessages(0);
            Handler handler = this.f15304c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, b.a(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T g(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            y0.h$c r11 = new y0.h$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.e(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.h.g(java.util.concurrent.Callable, int):java.lang.Object");
    }
}
