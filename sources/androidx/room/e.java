package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.c;
import d.j0;
import d.m0;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import u2.d1;
import u2.n2;

public class e<T> extends LiveData<T> {

    /* renamed from: m  reason: collision with root package name */
    public final n2 f3791m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f3792n;

    /* renamed from: o  reason: collision with root package name */
    public final Callable<T> f3793o;

    /* renamed from: p  reason: collision with root package name */
    public final d1 f3794p;

    /* renamed from: q  reason: collision with root package name */
    public final c.C0053c f3795q;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicBoolean f3796r = new AtomicBoolean(true);

    /* renamed from: s  reason: collision with root package name */
    public final AtomicBoolean f3797s = new AtomicBoolean(false);

    /* renamed from: t  reason: collision with root package name */
    public final AtomicBoolean f3798t = new AtomicBoolean(false);

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f3799u = new a();

    /* renamed from: v  reason: collision with root package name */
    public final Runnable f3800v = new b();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0025  */
        @d.h1
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.e r0 = androidx.room.e.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3798t
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x001b
                androidx.room.e r0 = androidx.room.e.this
                u2.n2 r0 = r0.f3791m
                androidx.room.c r0 = r0.n()
                androidx.room.e r3 = androidx.room.e.this
                androidx.room.c$c r3 = r3.f3795q
                r0.b(r3)
            L_0x001b:
                androidx.room.e r0 = androidx.room.e.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3797s
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x005c
                r0 = 0
                r3 = r1
            L_0x0027:
                androidx.room.e r4 = androidx.room.e.this     // Catch:{ all -> 0x0053 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f3796r     // Catch:{ all -> 0x0053 }
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0053 }
                if (r4 == 0) goto L_0x0044
                androidx.room.e r0 = androidx.room.e.this     // Catch:{ Exception -> 0x003b }
                java.util.concurrent.Callable<T> r0 = r0.f3793o     // Catch:{ Exception -> 0x003b }
                java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x003b }
                r3 = r2
                goto L_0x0027
            L_0x003b:
                r0 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "Exception while computing database live data."
                r2.<init>(r3, r0)     // Catch:{ all -> 0x0053 }
                throw r2     // Catch:{ all -> 0x0053 }
            L_0x0044:
                if (r3 == 0) goto L_0x004b
                androidx.room.e r4 = androidx.room.e.this     // Catch:{ all -> 0x0053 }
                r4.o(r0)     // Catch:{ all -> 0x0053 }
            L_0x004b:
                androidx.room.e r0 = androidx.room.e.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3797s
                r0.set(r1)
                goto L_0x005d
            L_0x0053:
                r0 = move-exception
                androidx.room.e r2 = androidx.room.e.this
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f3797s
                r2.set(r1)
                throw r0
            L_0x005c:
                r3 = r1
            L_0x005d:
                if (r3 == 0) goto L_0x0069
                androidx.room.e r0 = androidx.room.e.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3796r
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x001b
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.e.a.run():void");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @j0
        public void run() {
            boolean h10 = e.this.h();
            if (e.this.f3796r.compareAndSet(false, true) && h10) {
                e.this.t().execute(e.this.f3799u);
            }
        }
    }

    public class c extends c.C0053c {
        public c(String[] strArr) {
            super(strArr);
        }

        public void b(@m0 Set<String> set) {
            n.c.h().b(e.this.f3800v);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public e(n2 n2Var, d1 d1Var, boolean z10, Callable<T> callable, String[] strArr) {
        this.f3791m = n2Var;
        this.f3792n = z10;
        this.f3793o = callable;
        this.f3794p = d1Var;
        this.f3795q = new c(strArr);
    }

    public void m() {
        super.m();
        this.f3794p.b(this);
        t().execute(this.f3799u);
    }

    public void n() {
        super.n();
        this.f3794p.c(this);
    }

    public Executor t() {
        return this.f3792n ? this.f3791m.s() : this.f3791m.p();
    }
}
