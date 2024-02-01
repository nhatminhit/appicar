package tg;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import og.a;
import og.n0;
import pg.e;
import tg.k;
import yg.h;

public final class g {

    /* renamed from: g  reason: collision with root package name */
    public static final Executor f23262g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.J("OkHttp ConnectionPool", true));

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ boolean f23263h = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f23264a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23265b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f23266c = new f(this);

    /* renamed from: d  reason: collision with root package name */
    public final Deque<e> f23267d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final h f23268e = new h();

    /* renamed from: f  reason: collision with root package name */
    public boolean f23269f;

    public g(int i10, long j10, TimeUnit timeUnit) {
        this.f23264a = i10;
        this.f23265b = timeUnit.toNanos(j10);
        if (j10 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void h() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = java.lang.System.nanoTime()
            long r0 = r6.b(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x000f
            return
        L_0x000f:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0000
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            monitor-enter(r6)
            int r0 = (int) r0
            r6.wait(r4, r0)     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x0024
        L_0x0022:
            r0 = move-exception
            goto L_0x0026
        L_0x0024:
            monitor-exit(r6)     // Catch:{ all -> 0x0022 }
            goto L_0x0000
        L_0x0026:
            monitor-exit(r6)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.g.h():void");
    }

    public long b(long j10) {
        synchronized (this) {
            e eVar = null;
            long j11 = Long.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            for (e next : this.f23267d) {
                if (i(next, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j12 = j10 - next.f23261q;
                    if (j12 > j11) {
                        eVar = next;
                        j11 = j12;
                    }
                }
            }
            long j13 = this.f23265b;
            if (j11 < j13) {
                if (i10 <= this.f23264a) {
                    if (i10 > 0) {
                        long j14 = j13 - j11;
                        return j14;
                    } else if (i11 > 0) {
                        return j13;
                    } else {
                        this.f23269f = false;
                        return -1;
                    }
                }
            }
            this.f23267d.remove(eVar);
            e.i(eVar.d());
            return 0;
        }
    }

    public void c(n0 n0Var, IOException iOException) {
        if (n0Var.b().type() != Proxy.Type.DIRECT) {
            a a10 = n0Var.a();
            a10.i().connectFailed(a10.l().R(), n0Var.b().address(), iOException);
        }
        this.f23268e.b(n0Var);
    }

    public boolean d(e eVar) {
        if (eVar.f23255k || this.f23264a == 0) {
            this.f23267d.remove(eVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public synchronized int e() {
        return this.f23267d.size();
    }

    public void f() {
        ArrayList<e> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<e> it = this.f23267d.iterator();
            while (it.hasNext()) {
                e next = it.next();
                if (next.f23260p.isEmpty()) {
                    next.f23255k = true;
                    arrayList.add(next);
                    it.remove();
                }
            }
        }
        for (e d10 : arrayList) {
            e.i(d10.d());
        }
    }

    public synchronized int g() {
        int i10;
        i10 = 0;
        for (e eVar : this.f23267d) {
            if (eVar.f23260p.isEmpty()) {
                i10++;
            }
        }
        return i10;
    }

    public final int i(e eVar, long j10) {
        List<Reference<k>> list = eVar.f23260p;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                h.m().v("A connection to " + eVar.b().a().l() + " was leaked. Did you forget to close a response body?", ((k.b) reference).f23298a);
                list.remove(i10);
                eVar.f23255k = true;
                if (list.isEmpty()) {
                    eVar.f23261q = j10 - this.f23265b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public void j(e eVar) {
        if (!this.f23269f) {
            this.f23269f = true;
            f23262g.execute(this.f23266c);
        }
        this.f23267d.add(eVar);
    }

    public boolean k(a aVar, k kVar, @Nullable List<n0> list, boolean z10) {
        for (e next : this.f23267d) {
            if ((!z10 || next.q()) && next.o(aVar, list)) {
                kVar.a(next);
                return true;
            }
        }
        return false;
    }
}
