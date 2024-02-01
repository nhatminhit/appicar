package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import d.m0;
import d.o0;
import f8.k;
import f8.o;
import f8.q;
import f8.u;
import f8.v;
import f8.x;
import f8.y;
import g8.g2;
import g8.h2;
import g8.s2;
import g8.t2;
import g8.u2;
import j8.l;
import j8.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import w8.d0;

@e8.a
@KeepName
public abstract class BasePendingResult<R extends u> extends o<R> {

    /* renamed from: p  reason: collision with root package name */
    public static final ThreadLocal f5630p = new s2();

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f5631q = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5632a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final a f5633b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f5634c;

    /* renamed from: d  reason: collision with root package name */
    public final CountDownLatch f5635d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f5636e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public v f5637f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference f5638g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public u f5639h;

    /* renamed from: i  reason: collision with root package name */
    public Status f5640i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f5641j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5642k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5643l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public l f5644m;
    @KeepName
    private u2 mResultGuardian;

    /* renamed from: n  reason: collision with root package name */
    public volatile g2 f5645n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5646o;

    @d0
    public static class a<R extends u> extends b9.u {
        public a() {
            super(Looper.getMainLooper());
        }

        public a(@m0 Looper looper) {
            super(looper);
        }

        public final void a(@m0 v vVar, @m0 u uVar) {
            int i10 = BasePendingResult.f5631q;
            sendMessage(obtainMessage(1, new Pair((v) s.l(vVar), uVar)));
        }

        public final void handleMessage(@m0 Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                v vVar = (v) pair.first;
                u uVar = (u) pair.second;
                try {
                    vVar.a(uVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.t(uVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
            } else {
                ((BasePendingResult) message.obj).l(Status.X);
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f5632a = new Object();
        this.f5635d = new CountDownLatch(1);
        this.f5636e = new ArrayList();
        this.f5638g = new AtomicReference();
        this.f5646o = false;
        this.f5633b = new a(Looper.getMainLooper());
        this.f5634c = new WeakReference((Object) null);
    }

    @e8.a
    @Deprecated
    public BasePendingResult(@m0 Looper looper) {
        this.f5632a = new Object();
        this.f5635d = new CountDownLatch(1);
        this.f5636e = new ArrayList();
        this.f5638g = new AtomicReference();
        this.f5646o = false;
        this.f5633b = new a(looper);
        this.f5634c = new WeakReference((Object) null);
    }

    @e8.a
    @d0
    public BasePendingResult(@m0 a<R> aVar) {
        this.f5632a = new Object();
        this.f5635d = new CountDownLatch(1);
        this.f5636e = new ArrayList();
        this.f5638g = new AtomicReference();
        this.f5646o = false;
        this.f5633b = (a) s.m(aVar, "CallbackHandler must not be null");
        this.f5634c = new WeakReference((Object) null);
    }

    @e8.a
    public BasePendingResult(@o0 k kVar) {
        this.f5632a = new Object();
        this.f5635d = new CountDownLatch(1);
        this.f5636e = new ArrayList();
        this.f5638g = new AtomicReference();
        this.f5646o = false;
        this.f5633b = new a(kVar != null ? kVar.r() : Looper.getMainLooper());
        this.f5634c = new WeakReference(kVar);
    }

    public static void t(@o0 u uVar) {
        if (uVar instanceof q) {
            try {
                ((q) uVar).a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(uVar));
            }
        }
    }

    public final void c(@m0 o.a aVar) {
        s.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f5632a) {
            if (m()) {
                aVar.a(this.f5640i);
            } else {
                this.f5636e.add(aVar);
            }
        }
    }

    @m0
    public final R d() {
        s.k("await must not be called on the UI thread");
        boolean z10 = true;
        s.s(!this.f5641j, "Result has already been consumed");
        if (this.f5645n != null) {
            z10 = false;
        }
        s.s(z10, "Cannot await if then() has been called.");
        try {
            this.f5635d.await();
        } catch (InterruptedException unused) {
            l(Status.V);
        }
        s.s(m(), "Result is not ready.");
        return p();
    }

    @m0
    public final R e(long j10, @m0 TimeUnit timeUnit) {
        if (j10 > 0) {
            s.k("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z10 = true;
        s.s(!this.f5641j, "Result has already been consumed.");
        if (this.f5645n != null) {
            z10 = false;
        }
        s.s(z10, "Cannot await if then() has been called.");
        try {
            if (!this.f5635d.await(j10, timeUnit)) {
                l(Status.X);
            }
        } catch (InterruptedException unused) {
            l(Status.V);
        }
        s.s(m(), "Result is not ready.");
        return p();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    @e8.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f5632a
            monitor-enter(r0)
            boolean r1 = r2.f5642k     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f5641j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            j8.l r1 = r2.f5644m     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            f8.u r1 = r2.f5639h     // Catch:{ all -> 0x0028 }
            t(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f5642k = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.Y     // Catch:{ all -> 0x0028 }
            f8.u r1 = r2.k(r1)     // Catch:{ all -> 0x0028 }
            r2.q(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.f():void");
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f5632a) {
            z10 = this.f5642k;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return;
     */
    @e8.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(@d.o0 f8.v<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5632a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.f5637f = r5     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x000a:
            boolean r1 = r4.f5641j     // Catch:{ all -> 0x003a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            j8.s.s(r1, r3)     // Catch:{ all -> 0x003a }
            g8.g2 r1 = r4.f5645n     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            j8.s.s(r2, r1)     // Catch:{ all -> 0x003a }
            boolean r1 = r4.g()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x0026:
            boolean r1 = r4.m()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a r1 = r4.f5633b     // Catch:{ all -> 0x003a }
            f8.u r2 = r4.p()     // Catch:{ all -> 0x003a }
            r1.a(r5, r2)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0036:
            r4.f5637f = r5     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.h(f8.v):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        return;
     */
    @e8.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(@d.m0 f8.v<? super R> r5, long r6, @d.m0 java.util.concurrent.TimeUnit r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5632a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.f5637f = r5     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000a:
            boolean r1 = r4.f5641j     // Catch:{ all -> 0x0048 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            j8.s.s(r1, r3)     // Catch:{ all -> 0x0048 }
            g8.g2 r1 = r4.f5645n     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            j8.s.s(r2, r1)     // Catch:{ all -> 0x0048 }
            boolean r1 = r4.g()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0026:
            boolean r1 = r4.m()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a r6 = r4.f5633b     // Catch:{ all -> 0x0048 }
            f8.u r7 = r4.p()     // Catch:{ all -> 0x0048 }
            r6.a(r5, r7)     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0036:
            r4.f5637f = r5     // Catch:{ all -> 0x0048 }
            com.google.android.gms.common.api.internal.BasePendingResult$a r5 = r4.f5633b     // Catch:{ all -> 0x0048 }
            long r6 = r8.toMillis(r6)     // Catch:{ all -> 0x0048 }
            r8 = 2
            android.os.Message r8 = r5.obtainMessage(r8, r4)     // Catch:{ all -> 0x0048 }
            r5.sendMessageDelayed(r8, r6)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.i(f8.v, long, java.util.concurrent.TimeUnit):void");
    }

    @m0
    public final <S extends u> y<S> j(@m0 x<? super R, ? extends S> xVar) {
        y<S> c10;
        s.s(!this.f5641j, "Result has already been consumed.");
        synchronized (this.f5632a) {
            boolean z10 = false;
            s.s(this.f5645n == null, "Cannot call then() twice.");
            if (this.f5637f == null) {
                z10 = true;
            }
            s.s(z10, "Cannot call then() if callbacks are set.");
            s.s(!this.f5642k, "Cannot call then() if result was canceled.");
            this.f5646o = true;
            this.f5645n = new g2(this.f5634c);
            c10 = this.f5645n.c(xVar);
            if (m()) {
                this.f5633b.a(this.f5645n, p());
            } else {
                this.f5637f = this.f5645n;
            }
        }
        return c10;
    }

    @e8.a
    @m0
    public abstract R k(@m0 Status status);

    @e8.a
    @Deprecated
    public final void l(@m0 Status status) {
        synchronized (this.f5632a) {
            if (!m()) {
                o(k(status));
                this.f5643l = true;
            }
        }
    }

    @e8.a
    public final boolean m() {
        return this.f5635d.getCount() == 0;
    }

    @e8.a
    public final void n(@m0 l lVar) {
        synchronized (this.f5632a) {
            this.f5644m = lVar;
        }
    }

    @e8.a
    public final void o(@m0 R r10) {
        synchronized (this.f5632a) {
            if (this.f5643l || this.f5642k) {
                t(r10);
                return;
            }
            m();
            s.s(!m(), "Results have already been set");
            s.s(!this.f5641j, "Result has already been consumed");
            q(r10);
        }
    }

    public final u p() {
        u uVar;
        synchronized (this.f5632a) {
            s.s(!this.f5641j, "Result has already been consumed.");
            s.s(m(), "Result is not ready.");
            uVar = this.f5639h;
            this.f5639h = null;
            this.f5637f = null;
            this.f5641j = true;
        }
        h2 h2Var = (h2) this.f5638g.getAndSet((Object) null);
        if (h2Var != null) {
            h2Var.f8224a.f8226a.remove(this);
        }
        return (u) s.l(uVar);
    }

    public final void q(u uVar) {
        this.f5639h = uVar;
        this.f5640i = uVar.g();
        this.f5644m = null;
        this.f5635d.countDown();
        if (this.f5642k) {
            this.f5637f = null;
        } else {
            v vVar = this.f5637f;
            if (vVar != null) {
                this.f5633b.removeMessages(2);
                this.f5633b.a(vVar, p());
            } else if (this.f5639h instanceof q) {
                this.mResultGuardian = new u2(this, (t2) null);
            }
        }
        ArrayList arrayList = this.f5636e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o.a) arrayList.get(i10)).a(this.f5640i);
        }
        this.f5636e.clear();
    }

    public final void s() {
        boolean z10 = true;
        if (!this.f5646o && !((Boolean) f5630p.get()).booleanValue()) {
            z10 = false;
        }
        this.f5646o = z10;
    }

    public final boolean u() {
        boolean g10;
        synchronized (this.f5632a) {
            if (((k) this.f5634c.get()) == null || !this.f5646o) {
                f();
            }
            g10 = g();
        }
        return g10;
    }

    public final void v(@o0 h2 h2Var) {
        this.f5638g.set(h2Var);
    }
}
