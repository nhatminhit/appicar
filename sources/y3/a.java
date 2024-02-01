package y3;

import android.os.Process;
import d.g1;
import d.m0;
import d.o0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import t4.e;
import t4.k;
import v3.f;
import y3.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15322a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f15323b;
    @g1

    /* renamed from: c  reason: collision with root package name */
    public final Map<f, d> f15324c;

    /* renamed from: d  reason: collision with root package name */
    public final ReferenceQueue<p<?>> f15325d;

    /* renamed from: e  reason: collision with root package name */
    public p.a f15326e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f15327f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public volatile c f15328g;

    /* renamed from: y3.a$a  reason: collision with other inner class name */
    public class C0246a implements ThreadFactory {

        /* renamed from: y3.a$a$a  reason: collision with other inner class name */
        public class C0247a implements Runnable {
            public final /* synthetic */ Runnable O;

            public C0247a(Runnable runnable) {
                this.O = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.O.run();
            }
        }

        public Thread newThread(@m0 Runnable runnable) {
            return new Thread(new C0247a(runnable), "glide-active-resources");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a.this.b();
        }
    }

    @g1
    public interface c {
        void a();
    }

    @g1
    public static final class d extends WeakReference<p<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final f f15329a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15330b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public v<?> f15331c;

        public d(@m0 f fVar, @m0 p<?> pVar, @m0 ReferenceQueue<? super p<?>> referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f15329a = (f) k.d(fVar);
            this.f15331c = (!pVar.f() || !z10) ? null : (v) k.d(pVar.e());
            this.f15330b = pVar.f();
        }

        public void a() {
            this.f15331c = null;
            clear();
        }
    }

    public a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new C0246a()));
    }

    @g1
    public a(boolean z10, Executor executor) {
        this.f15324c = new HashMap();
        this.f15325d = new ReferenceQueue<>();
        this.f15322a = z10;
        this.f15323b = executor;
        executor.execute(new b());
    }

    public synchronized void a(f fVar, p<?> pVar) {
        d put = this.f15324c.put(fVar, new d(fVar, pVar, this.f15325d, this.f15322a));
        if (put != null) {
            put.a();
        }
    }

    public void b() {
        while (!this.f15327f) {
            try {
                c((d) this.f15325d.remove());
                c cVar = this.f15328g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(@m0 d dVar) {
        synchronized (this) {
            this.f15324c.remove(dVar.f15329a);
            if (dVar.f15330b) {
                v<?> vVar = dVar.f15331c;
                if (vVar != null) {
                    this.f15326e.c(dVar.f15329a, new p(vVar, true, false, dVar.f15329a, this.f15326e));
                }
            }
        }
    }

    public synchronized void d(f fVar) {
        d remove = this.f15324c.remove(fVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized y3.p<?> e(v3.f r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<v3.f, y3.a$d> r0 = r1.f15324c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            y3.a$d r2 = (y3.a.d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            y3.p r0 = (y3.p) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.a.e(v3.f):y3.p");
    }

    @g1
    public void f(c cVar) {
        this.f15328g = cVar;
    }

    public void g(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f15326e = aVar;
            }
        }
    }

    @g1
    public void h() {
        this.f15327f = true;
        Executor executor = this.f15323b;
        if (executor instanceof ExecutorService) {
            e.c((ExecutorService) executor);
        }
    }
}
