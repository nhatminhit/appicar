package p4;

import android.graphics.drawable.Drawable;
import d.g1;
import d.m0;
import d.o0;
import d.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q4.o;
import q4.p;
import t4.m;
import y3.q;

public class f<R> implements c<R>, g<R> {
    public static final a Y = new a();
    public final int O;
    public final int P;
    public final boolean Q;
    public final a R;
    @o0
    @z("this")
    public R S;
    @o0
    @z("this")
    public d T;
    @z("this")
    public boolean U;
    @z("this")
    public boolean V;
    @z("this")
    public boolean W;
    @o0
    @z("this")
    public q X;

    @g1
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j10) throws InterruptedException {
            obj.wait(j10);
        }
    }

    public f(int i10, int i11) {
        this(i10, i11, true, Y);
    }

    public f(int i10, int i11, boolean z10, a aVar) {
        this.O = i10;
        this.P = i11;
        this.Q = z10;
        this.R = aVar;
    }

    public void a() {
    }

    public void b() {
    }

    public synchronized boolean c(@o0 q qVar, Object obj, p<R> pVar, boolean z10) {
        this.W = true;
        this.X = qVar;
        this.R.a(this);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return r3
        L_0x000a:
            r0 = 1
            r2.U = r0     // Catch:{ all -> 0x0021 }
            p4.f$a r1 = r2.R     // Catch:{ all -> 0x0021 }
            r1.a(r2)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x001a
            p4.d r3 = r2.T     // Catch:{ all -> 0x0021 }
            r2.T = r1     // Catch:{ all -> 0x0021 }
            r1 = r3
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0020
            r1.clear()
        L_0x0020:
            return r0
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.f.cancel(boolean):boolean");
    }

    public synchronized boolean d(R r10, Object obj, p<R> pVar, v3.a aVar, boolean z10) {
        this.V = true;
        this.S = r10;
        this.R.a(this);
        return false;
    }

    public void e(@m0 o oVar) {
    }

    public synchronized void f(@o0 Drawable drawable) {
    }

    public final synchronized R g(Long l10) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.Q && !isDone()) {
            m.a();
        }
        if (this.U) {
            throw new CancellationException();
        } else if (this.W) {
            throw new ExecutionException(this.X);
        } else if (this.V) {
            return this.S;
        } else {
            if (l10 == null) {
                this.R.b(this, 0);
            } else if (l10.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l10.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.R.b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.W) {
                throw new ExecutionException(this.X);
            } else if (this.U) {
                throw new CancellationException();
            } else if (this.V) {
                return this.S;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return g((Long) null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    public R get(long j10, @m0 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return g(Long.valueOf(timeUnit.toMillis(j10)));
    }

    public synchronized void h(@o0 d dVar) {
        this.T = dVar;
    }

    public synchronized boolean isCancelled() {
        return this.U;
    }

    public synchronized boolean isDone() {
        return this.U || this.V || this.W;
    }

    public void l(@o0 Drawable drawable) {
    }

    public void o(@m0 o oVar) {
        oVar.d(this.O, this.P);
    }

    public void onDestroy() {
    }

    @o0
    public synchronized d q() {
        return this.T;
    }

    public void r(@o0 Drawable drawable) {
    }

    public synchronized void s(@m0 R r10, @o0 r4.f<? super R> fVar) {
    }
}
