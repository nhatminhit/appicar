package androidx.lifecycle;

import d.g1;
import d.h1;
import d.x0;
import fh.g;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n.c;
import ve.e;
import ve.i;
import xe.l0;
import xe.w;

@x0({x0.a.Q})
public abstract class f<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Executor f2798a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<T> f2799b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<T> f2800c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f2801d;
    @g

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f2802e;
    @g
    @e

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f2803f;
    @g
    @e

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f2804g;

    public static final class a extends LiveData<T> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ f<T> f2805m;

        public a(f<T> fVar) {
            this.f2805m = fVar;
        }

        public void m() {
            this.f2805m.e().execute(this.f2805m.f2803f);
        }
    }

    @i
    public f() {
        this((Executor) null, 1, (w) null);
    }

    @i
    public f(@g Executor executor) {
        l0.p(executor, "executor");
        this.f2798a = executor;
        a aVar = new a(this);
        this.f2799b = aVar;
        this.f2800c = aVar;
        this.f2801d = new AtomicBoolean(true);
        this.f2802e = new AtomicBoolean(false);
        this.f2803f = new d(this);
        this.f2804g = new e(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f(java.util.concurrent.Executor r1, int r2, xe.w r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L_0x000d
            java.util.concurrent.Executor r1 = n.c.g()
            java.lang.String r2 = "getIOThreadExecutor()"
            xe.l0.o(r1, r2)
        L_0x000d:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f.<init>(java.util.concurrent.Executor, int, xe.w):void");
    }

    @g1
    public static /* synthetic */ void g() {
    }

    @g1
    public static /* synthetic */ void i() {
    }

    public static final void k(f fVar) {
        l0.p(fVar, "this$0");
        boolean h10 = fVar.h().h();
        if (fVar.f2801d.compareAndSet(false, true) && h10) {
            fVar.f2798a.execute(fVar.f2803f);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(androidx.lifecycle.f r5) {
        /*
            java.lang.String r0 = "this$0"
            xe.l0.p(r5, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f2802e
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            r3 = r1
        L_0x0011:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.f2801d     // Catch:{ all -> 0x002f }
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x001f
            java.lang.Object r0 = r5.c()     // Catch:{ all -> 0x002f }
            r3 = r2
            goto L_0x0011
        L_0x001f:
            if (r3 == 0) goto L_0x0028
            androidx.lifecycle.LiveData r2 = r5.h()     // Catch:{ all -> 0x002f }
            r2.o(r0)     // Catch:{ all -> 0x002f }
        L_0x0028:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f2802e
            r0.set(r1)
            r1 = r3
            goto L_0x0036
        L_0x002f:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f2802e
            r5.set(r1)
            throw r0
        L_0x0036:
            if (r1 == 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f2801d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0005
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.f.l(androidx.lifecycle.f):void");
    }

    @h1
    public abstract T c();

    @g
    public final AtomicBoolean d() {
        return this.f2802e;
    }

    @g
    public final Executor e() {
        return this.f2798a;
    }

    @g
    public final AtomicBoolean f() {
        return this.f2801d;
    }

    @g
    public LiveData<T> h() {
        return this.f2800c;
    }

    public void j() {
        c.h().b(this.f2804g);
    }
}
