package u2;

import a3.c;
import a3.d;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d.g1;
import d.m0;
import d.o0;
import d.z;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class a {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public d f13478a = null;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Handler f13479b = new Handler(Looper.getMainLooper());
    @o0

    /* renamed from: c  reason: collision with root package name */
    public Runnable f13480c = null;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final Object f13481d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final long f13482e;
    @m0

    /* renamed from: f  reason: collision with root package name */
    public final Executor f13483f;
    @z("mLock")

    /* renamed from: g  reason: collision with root package name */
    public int f13484g = 0;
    @z("mLock")

    /* renamed from: h  reason: collision with root package name */
    public long f13485h = SystemClock.uptimeMillis();
    @o0
    @z("mLock")

    /* renamed from: i  reason: collision with root package name */
    public c f13486i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13487j = false;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f13488k = new C0226a();
    @m0

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f13489l = new b();

    /* renamed from: u2.a$a  reason: collision with other inner class name */
    public class C0226a implements Runnable {
        public C0226a() {
        }

        public void run() {
            a aVar = a.this;
            aVar.f13483f.execute(aVar.f13489l);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                u2.a r0 = u2.a.this
                java.lang.Object r0 = r0.f13481d
                monitor-enter(r0)
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x004a }
                u2.a r3 = u2.a.this     // Catch:{ all -> 0x004a }
                long r4 = r3.f13485h     // Catch:{ all -> 0x004a }
                long r1 = r1 - r4
                long r4 = r3.f13482e     // Catch:{ all -> 0x004a }
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L_0x0016
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x0016:
                int r1 = r3.f13484g     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x001c:
                java.lang.Runnable r1 = r3.f13480c     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0042
                r1.run()     // Catch:{ all -> 0x004a }
                u2.a r1 = u2.a.this     // Catch:{ all -> 0x004a }
                a3.c r1 = r1.f13486i     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0040
                boolean r1 = r1.isOpen()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0040
                u2.a r1 = u2.a.this     // Catch:{ IOException -> 0x0037 }
                a3.c r1 = r1.f13486i     // Catch:{ IOException -> 0x0037 }
                r1.close()     // Catch:{ IOException -> 0x0037 }
                goto L_0x003b
            L_0x0037:
                r1 = move-exception
                x2.f.a(r1)     // Catch:{ all -> 0x004a }
            L_0x003b:
                u2.a r1 = u2.a.this     // Catch:{ all -> 0x004a }
                r2 = 0
                r1.f13486i = r2     // Catch:{ all -> 0x004a }
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x0042:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
                java.lang.String r2 = "mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568"
                r1.<init>(r2)     // Catch:{ all -> 0x004a }
                throw r1     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u2.a.b.run():void");
        }
    }

    public a(long j10, @m0 TimeUnit timeUnit, @m0 Executor executor) {
        this.f13482e = timeUnit.toMillis(j10);
        this.f13483f = executor;
    }

    public void a() throws IOException {
        synchronized (this.f13481d) {
            this.f13487j = true;
            c cVar = this.f13486i;
            if (cVar != null) {
                cVar.close();
            }
            this.f13486i = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f13481d
            monitor-enter(r0)
            int r1 = r5.f13484g     // Catch:{ all -> 0x0026 }
            if (r1 <= 0) goto L_0x001e
            int r1 = r1 + -1
            r5.f13484g = r1     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x001c
            a3.c r1 = r5.f13486i     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0013:
            android.os.Handler r1 = r5.f13479b     // Catch:{ all -> 0x0026 }
            java.lang.Runnable r2 = r5.f13488k     // Catch:{ all -> 0x0026 }
            long r3 = r5.f13482e     // Catch:{ all -> 0x0026 }
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0026 }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "ref count is 0 or lower but we're supposed to decrement"
            r1.<init>(r2)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.a.b():void");
    }

    @o0
    public <V> V c(@m0 p.a<c, V> aVar) {
        try {
            return aVar.apply(f());
        } finally {
            b();
        }
    }

    @o0
    public c d() {
        c cVar;
        synchronized (this.f13481d) {
            cVar = this.f13486i;
        }
        return cVar;
    }

    @g1
    public int e() {
        int i10;
        synchronized (this.f13481d) {
            i10 = this.f13484g;
        }
        return i10;
    }

    @m0
    public c f() {
        synchronized (this.f13481d) {
            this.f13479b.removeCallbacks(this.f13488k);
            this.f13484g++;
            if (!this.f13487j) {
                c cVar = this.f13486i;
                if (cVar == null || !cVar.isOpen()) {
                    d dVar = this.f13478a;
                    if (dVar != null) {
                        c writableDatabase = dVar.getWritableDatabase();
                        this.f13486i = writableDatabase;
                        return writableDatabase;
                    }
                    throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                c cVar2 = this.f13486i;
                return cVar2;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public void g(@m0 d dVar) {
        if (this.f13478a == null) {
            this.f13478a = dVar;
        }
    }

    public boolean h() {
        return !this.f13487j;
    }

    public void i(Runnable runnable) {
        this.f13480c = runnable;
    }
}
