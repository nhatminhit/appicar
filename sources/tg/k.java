package tg;

import ch.b0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import og.c0;
import og.d0;
import og.g;
import og.g0;
import og.i;
import og.j0;
import og.x;
import pg.e;
import yg.h;

public final class k {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ boolean f23281p = false;

    /* renamed from: a  reason: collision with root package name */
    public final g0 f23282a;

    /* renamed from: b  reason: collision with root package name */
    public final g f23283b;

    /* renamed from: c  reason: collision with root package name */
    public final g f23284c;

    /* renamed from: d  reason: collision with root package name */
    public final x f23285d;

    /* renamed from: e  reason: collision with root package name */
    public final ch.a f23286e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Object f23287f;

    /* renamed from: g  reason: collision with root package name */
    public j0 f23288g;

    /* renamed from: h  reason: collision with root package name */
    public d f23289h;

    /* renamed from: i  reason: collision with root package name */
    public e f23290i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public c f23291j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23292k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f23293l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f23294m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f23295n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f23296o;

    public class a extends ch.a {
        public a() {
        }

        public void w() {
            k.this.d();
        }
    }

    public static final class b extends WeakReference<k> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f23298a;

        public b(k kVar, Object obj) {
            super(kVar);
            this.f23298a = obj;
        }
    }

    public k(g0 g0Var, g gVar) {
        a aVar = new a();
        this.f23286e = aVar;
        this.f23282a = g0Var;
        this.f23283b = pg.a.f22062a.j(g0Var.n());
        this.f23284c = gVar;
        this.f23285d = g0Var.t().a(gVar);
        aVar.i((long) g0Var.j(), TimeUnit.MILLISECONDS);
    }

    public void a(e eVar) {
        if (this.f23290i == null) {
            this.f23290i = eVar;
            eVar.f23260p.add(new b(this, this.f23287f));
            return;
        }
        throw new IllegalStateException();
    }

    public void b() {
        this.f23287f = h.m().q("response.body().close()");
        this.f23285d.d(this.f23284c);
    }

    public boolean c() {
        return this.f23289h.f() && this.f23289h.e();
    }

    public void d() {
        c cVar;
        e a10;
        synchronized (this.f23283b) {
            this.f23294m = true;
            cVar = this.f23291j;
            d dVar = this.f23289h;
            a10 = (dVar == null || dVar.a() == null) ? this.f23290i : this.f23289h.a();
        }
        if (cVar != null) {
            cVar.b();
        } else if (a10 != null) {
            a10.g();
        }
    }

    public final og.a e(c0 c0Var) {
        i iVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (c0Var.q()) {
            SSLSocketFactory K = this.f23282a.K();
            hostnameVerifier = this.f23282a.w();
            sSLSocketFactory = K;
            iVar = this.f23282a.k();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            iVar = null;
        }
        return new og.a(c0Var.p(), c0Var.E(), this.f23282a.s(), this.f23282a.J(), sSLSocketFactory, hostnameVerifier, iVar, this.f23282a.F(), this.f23282a.E(), this.f23282a.D(), this.f23282a.p(), this.f23282a.G());
    }

    public void f() {
        synchronized (this.f23283b) {
            if (!this.f23296o) {
                this.f23291j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return j(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r7;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException g(tg.c r4, boolean r5, boolean r6, @javax.annotation.Nullable java.io.IOException r7) {
        /*
            r3 = this;
            tg.g r0 = r3.f23283b
            monitor-enter(r0)
            tg.c r1 = r3.f23291j     // Catch:{ all -> 0x003d }
            if (r4 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return r7
        L_0x0009:
            r4 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0013
            boolean r5 = r3.f23292k     // Catch:{ all -> 0x003d }
            r5 = r5 ^ r2
            r3.f23292k = r2     // Catch:{ all -> 0x003d }
            goto L_0x0014
        L_0x0013:
            r5 = r4
        L_0x0014:
            if (r6 == 0) goto L_0x001d
            boolean r6 = r3.f23293l     // Catch:{ all -> 0x003d }
            if (r6 != 0) goto L_0x001b
            r5 = r2
        L_0x001b:
            r3.f23293l = r2     // Catch:{ all -> 0x003d }
        L_0x001d:
            boolean r6 = r3.f23292k     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            boolean r6 = r3.f23293l     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            if (r5 == 0) goto L_0x0034
            tg.e r5 = r1.c()     // Catch:{ all -> 0x003d }
            int r6 = r5.f23257m     // Catch:{ all -> 0x003d }
            int r6 = r6 + r2
            r5.f23257m = r6     // Catch:{ all -> 0x003d }
            r5 = 0
            r3.f23291j = r5     // Catch:{ all -> 0x003d }
            goto L_0x0035
        L_0x0034:
            r2 = r4
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x003c
            java.io.IOException r7 = r3.j(r7, r4)
        L_0x003c:
            return r7
        L_0x003d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.k.g(tg.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f23283b) {
            z10 = this.f23291j != null;
        }
        return z10;
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f23283b) {
            z10 = this.f23294m;
        }
        return z10;
    }

    @Nullable
    public final IOException j(@Nullable IOException iOException, boolean z10) {
        e eVar;
        Socket n10;
        boolean z11;
        boolean z12;
        synchronized (this.f23283b) {
            if (z10) {
                if (this.f23291j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            eVar = this.f23290i;
            n10 = (eVar == null || this.f23291j != null || (!z10 && !this.f23296o)) ? null : n();
            if (this.f23290i != null) {
                eVar = null;
            }
            z11 = true;
            z12 = this.f23296o && this.f23291j == null;
        }
        e.i(n10);
        if (eVar != null) {
            this.f23285d.i(this.f23284c, eVar);
        }
        if (z12) {
            if (iOException == null) {
                z11 = false;
            }
            iOException = r(iOException);
            x xVar = this.f23285d;
            g gVar = this.f23284c;
            if (z11) {
                xVar.c(gVar, iOException);
            } else {
                xVar.b(gVar);
            }
        }
        return iOException;
    }

    public c k(d0.a aVar, boolean z10) {
        synchronized (this.f23283b) {
            if (this.f23296o) {
                throw new IllegalStateException("released");
            } else if (this.f23291j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        c cVar = new c(this, this.f23284c, this.f23285d, this.f23289h, this.f23289h.b(this.f23282a, aVar, z10));
        synchronized (this.f23283b) {
            this.f23291j = cVar;
            this.f23292k = false;
            this.f23293l = false;
        }
        return cVar;
    }

    @Nullable
    public IOException l(@Nullable IOException iOException) {
        synchronized (this.f23283b) {
            this.f23296o = true;
        }
        return j(iOException, false);
    }

    public void m(j0 j0Var) {
        j0 j0Var2 = this.f23288g;
        if (j0Var2 != null) {
            if (e.F(j0Var2.k(), j0Var.k()) && this.f23289h.e()) {
                return;
            }
            if (this.f23291j != null) {
                throw new IllegalStateException();
            } else if (this.f23289h != null) {
                j((IOException) null, true);
                this.f23289h = null;
            }
        }
        this.f23288g = j0Var;
        this.f23289h = new d(this, this.f23283b, e(j0Var.k()), this.f23284c, this.f23285d);
    }

    @Nullable
    public Socket n() {
        int i10 = 0;
        int size = this.f23290i.f23260p.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (this.f23290i.f23260p.get(i10).get() == this) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            e eVar = this.f23290i;
            eVar.f23260p.remove(i10);
            this.f23290i = null;
            if (!eVar.f23260p.isEmpty()) {
                return null;
            }
            eVar.f23261q = System.nanoTime();
            if (this.f23283b.d(eVar)) {
                return eVar.d();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    public b0 o() {
        return this.f23286e;
    }

    public void p() {
        if (!this.f23295n) {
            this.f23295n = true;
            this.f23286e.q();
            return;
        }
        throw new IllegalStateException();
    }

    public void q() {
        this.f23286e.n();
    }

    @Nullable
    public final IOException r(@Nullable IOException iOException) {
        if (this.f23295n || !this.f23286e.q()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
