package wg;

import ch.p;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import wg.h;

public final class f implements Closeable {

    /* renamed from: n0  reason: collision with root package name */
    public static final int f24209n0 = 16777216;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f24210o0 = 1;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f24211p0 = 2;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f24212q0 = 3;

    /* renamed from: r0  reason: collision with root package name */
    public static final long f24213r0 = 1000000000;

    /* renamed from: s0  reason: collision with root package name */
    public static final ExecutorService f24214s0 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), pg.e.J("OkHttp Http2Connection", true));

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ boolean f24215t0 = false;
    public final boolean O;
    public final j P;
    public final Map<Integer, i> Q = new LinkedHashMap();
    public final String R;
    public int S;
    public int T;
    public boolean U;
    public final ScheduledExecutorService V;
    public final ExecutorService W;
    public final l X;
    public long Y = 0;
    public long Z = 0;

    /* renamed from: a0  reason: collision with root package name */
    public long f24216a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public long f24217b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public long f24218c0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public long f24219d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public long f24220e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public long f24221f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public long f24222g0;

    /* renamed from: h0  reason: collision with root package name */
    public m f24223h0 = new m();

    /* renamed from: i0  reason: collision with root package name */
    public final m f24224i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Socket f24225j0;

    /* renamed from: k0  reason: collision with root package name */
    public final j f24226k0;

    /* renamed from: l0  reason: collision with root package name */
    public final l f24227l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Set<Integer> f24228m0;

    public class a extends pg.b {
        public final /* synthetic */ int P;
        public final /* synthetic */ b Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i10, b bVar) {
            super(str, objArr);
            this.P = i10;
            this.Q = bVar;
        }

        public void l() {
            try {
                f.this.P1(this.P, this.Q);
            } catch (IOException e10) {
                f.this.N(e10);
            }
        }
    }

    public class b extends pg.b {
        public final /* synthetic */ int P;
        public final /* synthetic */ long Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.P = i10;
            this.Q = j10;
        }

        public void l() {
            try {
                f.this.f24226k0.A(this.P, this.Q);
            } catch (IOException e10) {
                f.this.N(e10);
            }
        }
    }

    public class c extends pg.b {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        public void l() {
            f.this.N1(false, 2, 0);
        }
    }

    public class d extends pg.b {
        public final /* synthetic */ int P;
        public final /* synthetic */ List Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.P = i10;
            this.Q = list;
        }

        public void l() {
            if (f.this.X.c(this.P, this.Q)) {
                try {
                    f.this.f24226k0.t(this.P, b.CANCEL);
                    synchronized (f.this) {
                        f.this.f24228m0.remove(Integer.valueOf(this.P));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    public class e extends pg.b {
        public final /* synthetic */ int P;
        public final /* synthetic */ List Q;
        public final /* synthetic */ boolean R;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.P = i10;
            this.Q = list;
            this.R = z10;
        }

        public void l() {
            boolean d10 = f.this.X.d(this.P, this.Q, this.R);
            if (d10) {
                try {
                    f.this.f24226k0.t(this.P, b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (d10 || this.R) {
                synchronized (f.this) {
                    f.this.f24228m0.remove(Integer.valueOf(this.P));
                }
            }
        }
    }

    /* renamed from: wg.f$f  reason: collision with other inner class name */
    public class C0480f extends pg.b {
        public final /* synthetic */ int P;
        public final /* synthetic */ ch.c Q;
        public final /* synthetic */ int R;
        public final /* synthetic */ boolean S;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0480f(String str, Object[] objArr, int i10, ch.c cVar, int i11, boolean z10) {
            super(str, objArr);
            this.P = i10;
            this.Q = cVar;
            this.R = i11;
            this.S = z10;
        }

        public void l() {
            try {
                boolean a10 = f.this.X.a(this.P, this.Q, this.R, this.S);
                if (a10) {
                    f.this.f24226k0.t(this.P, b.CANCEL);
                }
                if (a10 || this.S) {
                    synchronized (f.this) {
                        f.this.f24228m0.remove(Integer.valueOf(this.P));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public class g extends pg.b {
        public final /* synthetic */ int P;
        public final /* synthetic */ b Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, int i10, b bVar) {
            super(str, objArr);
            this.P = i10;
            this.Q = bVar;
        }

        public void l() {
            f.this.X.b(this.P, this.Q);
            synchronized (f.this) {
                f.this.f24228m0.remove(Integer.valueOf(this.P));
            }
        }
    }

    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public Socket f24229a;

        /* renamed from: b  reason: collision with root package name */
        public String f24230b;

        /* renamed from: c  reason: collision with root package name */
        public ch.e f24231c;

        /* renamed from: d  reason: collision with root package name */
        public ch.d f24232d;

        /* renamed from: e  reason: collision with root package name */
        public j f24233e = j.f24237a;

        /* renamed from: f  reason: collision with root package name */
        public l f24234f = l.f24275a;

        /* renamed from: g  reason: collision with root package name */
        public boolean f24235g;

        /* renamed from: h  reason: collision with root package name */
        public int f24236h;

        public h(boolean z10) {
            this.f24235g = z10;
        }

        public f a() {
            return new f(this);
        }

        public h b(j jVar) {
            this.f24233e = jVar;
            return this;
        }

        public h c(int i10) {
            this.f24236h = i10;
            return this;
        }

        public h d(l lVar) {
            this.f24234f = lVar;
            return this;
        }

        public h e(Socket socket) throws IOException {
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            return f(socket, remoteSocketAddress instanceof InetSocketAddress ? ((InetSocketAddress) remoteSocketAddress).getHostName() : remoteSocketAddress.toString(), p.d(p.n(socket)), p.c(p.i(socket)));
        }

        public h f(Socket socket, String str, ch.e eVar, ch.d dVar) {
            this.f24229a = socket;
            this.f24230b = str;
            this.f24231c = eVar;
            this.f24232d = dVar;
            return this;
        }
    }

    public final class i extends pg.b {
        public i() {
            super("OkHttp %s ping", f.this.R);
        }

        public void l() {
            boolean z10;
            synchronized (f.this) {
                if (f.this.Z < f.this.Y) {
                    z10 = true;
                } else {
                    f.i(f.this);
                    z10 = false;
                }
            }
            f fVar = f.this;
            if (z10) {
                fVar.N((IOException) null);
            } else {
                fVar.N1(false, 1, 0);
            }
        }
    }

    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public static final j f24237a = new a();

        public class a extends j {
            public void f(i iVar) throws IOException {
                iVar.d(b.REFUSED_STREAM, (IOException) null);
            }
        }

        public void e(f fVar) {
        }

        public abstract void f(i iVar) throws IOException;
    }

    public final class k extends pg.b {
        public final boolean P;
        public final int Q;
        public final int R;

        public k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", f.this.R, Integer.valueOf(i10), Integer.valueOf(i11));
            this.P = z10;
            this.Q = i10;
            this.R = i11;
        }

        public void l() {
            f.this.N1(this.P, this.Q, this.R);
        }
    }

    public class l extends pg.b implements h.b {
        public final h P;

        public class a extends pg.b {
            public final /* synthetic */ i P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, i iVar) {
                super(str, objArr);
                this.P = iVar;
            }

            public void l() {
                try {
                    f.this.P.f(this.P);
                } catch (IOException e10) {
                    yg.h m10 = yg.h.m();
                    m10.u(4, "Http2Connection.Listener failure for " + f.this.R, e10);
                    try {
                        this.P.d(b.PROTOCOL_ERROR, e10);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public class b extends pg.b {
            public final /* synthetic */ boolean P;
            public final /* synthetic */ m Q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z10, m mVar) {
                super(str, objArr);
                this.P = z10;
                this.Q = mVar;
            }

            public void l() {
                l.this.m(this.P, this.Q);
            }
        }

        public class c extends pg.b {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            public void l() {
                f fVar = f.this;
                fVar.P.e(fVar);
            }
        }

        public l(h hVar) {
            super("OkHttp %s", f.this.R);
            this.P = hVar;
        }

        public void a() {
        }

        public void b(boolean z10, int i10, ch.e eVar, int i11) throws IOException {
            if (f.this.X0(i10)) {
                f.this.k0(i10, eVar, i11, z10);
                return;
            }
            i P2 = f.this.P(i10);
            if (P2 == null) {
                f.this.Q1(i10, b.PROTOCOL_ERROR);
                long j10 = (long) i11;
                f.this.r1(j10);
                eVar.skip(j10);
                return;
            }
            P2.p(eVar, i11);
            if (z10) {
                P2.q(pg.e.f22067c, true);
            }
        }

        public void c(boolean z10, int i10, int i11, List<c> list) {
            if (f.this.X0(i10)) {
                f.this.z0(i10, list, z10);
                return;
            }
            synchronized (f.this) {
                i P2 = f.this.P(i10);
                if (P2 != null) {
                    P2.q(pg.e.L(list), z10);
                } else if (!f.this.U) {
                    f fVar = f.this;
                    if (i10 > fVar.S) {
                        if (i10 % 2 != fVar.T % 2) {
                            int i12 = i10;
                            i iVar = new i(i12, f.this, false, z10, pg.e.L(list));
                            f fVar2 = f.this;
                            fVar2.S = i10;
                            fVar2.Q.put(Integer.valueOf(i10), iVar);
                            f.f24214s0.execute(new a("OkHttp %s stream %d", new Object[]{f.this.R, Integer.valueOf(i10)}, iVar));
                        }
                    }
                }
            }
        }

        public void d(int i10, long j10) {
            f fVar = f.this;
            if (i10 == 0) {
                synchronized (fVar) {
                    f fVar2 = f.this;
                    fVar2.f24222g0 += j10;
                    fVar2.notifyAll();
                }
                return;
            }
            i P2 = fVar.P(i10);
            if (P2 != null) {
                synchronized (P2) {
                    P2.a(j10);
                }
            }
        }

        public void e(int i10, String str, ch.f fVar, String str2, int i11, long j10) {
        }

        public void f(boolean z10, m mVar) {
            try {
                f.this.V.execute(new b("OkHttp %s ACK Settings", new Object[]{f.this.R}, z10, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void g(int i10, b bVar) {
            if (f.this.X0(i10)) {
                f.this.T0(i10, bVar);
                return;
            }
            i Z0 = f.this.Z0(i10);
            if (Z0 != null) {
                Z0.r(bVar);
            }
        }

        public void h(boolean z10, int i10, int i11) {
            if (z10) {
                synchronized (f.this) {
                    if (i10 == 1) {
                        try {
                            f.g(f.this);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else if (i10 == 2) {
                        f.q(f.this);
                    } else if (i10 == 3) {
                        f.t(f.this);
                        f.this.notifyAll();
                    }
                }
                return;
            }
            try {
                f.this.V.execute(new k(true, i10, i11));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void i(int i10, int i11, int i12, boolean z10) {
        }

        public void j(int i10, b bVar, ch.f fVar) {
            i[] iVarArr;
            fVar.R();
            synchronized (f.this) {
                iVarArr = (i[]) f.this.Q.values().toArray(new i[f.this.Q.size()]);
                boolean unused = f.this.U = true;
            }
            for (i iVar : iVarArr) {
                if (iVar.j() > i10 && iVar.m()) {
                    iVar.r(b.REFUSED_STREAM);
                    f.this.Z0(iVar.j());
                }
            }
        }

        public void k(int i10, int i11, List<c> list) {
            f.this.H0(i11, list);
        }

        public void l() {
            b bVar;
            b bVar2 = b.INTERNAL_ERROR;
            e = null;
            try {
                this.P.g(this);
                while (this.P.f(false, this)) {
                }
                bVar = b.NO_ERROR;
                try {
                    f.this.A(bVar, b.CANCEL, (IOException) null);
                } catch (IOException e10) {
                    e = e10;
                    try {
                        b bVar3 = b.PROTOCOL_ERROR;
                        f.this.A(bVar3, bVar3, e);
                        pg.e.g(this.P);
                    } catch (Throwable th2) {
                        th = th2;
                        f.this.A(bVar, bVar2, e);
                        pg.e.g(this.P);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                bVar = bVar2;
                b bVar32 = b.PROTOCOL_ERROR;
                f.this.A(bVar32, bVar32, e);
                pg.e.g(this.P);
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                f.this.A(bVar, bVar2, e);
                pg.e.g(this.P);
                throw th;
            }
            pg.e.g(this.P);
        }

        public void m(boolean z10, m mVar) {
            i[] iVarArr;
            long j10;
            synchronized (f.this.f24226k0) {
                synchronized (f.this) {
                    int e10 = f.this.f24224i0.e();
                    if (z10) {
                        f.this.f24224i0.a();
                    }
                    f.this.f24224i0.j(mVar);
                    int e11 = f.this.f24224i0.e();
                    iVarArr = null;
                    if (e11 == -1 || e11 == e10) {
                        j10 = 0;
                    } else {
                        j10 = (long) (e11 - e10);
                        if (!f.this.Q.isEmpty()) {
                            iVarArr = (i[]) f.this.Q.values().toArray(new i[f.this.Q.size()]);
                        }
                    }
                }
                try {
                    f fVar = f.this;
                    fVar.f24226k0.c(fVar.f24224i0);
                } catch (IOException e12) {
                    f.this.N(e12);
                }
            }
            if (iVarArr != null) {
                for (i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j10);
                    }
                }
            }
            f.f24214s0.execute(new c("OkHttp %s settings", f.this.R));
        }
    }

    static {
        Class<f> cls = f.class;
    }

    public f(h hVar) {
        h hVar2 = hVar;
        m mVar = new m();
        this.f24224i0 = mVar;
        this.f24228m0 = new LinkedHashSet();
        this.X = hVar2.f24234f;
        boolean z10 = hVar2.f24235g;
        this.O = z10;
        this.P = hVar2.f24233e;
        int i10 = z10 ? 1 : 2;
        this.T = i10;
        if (z10) {
            this.T = i10 + 2;
        }
        if (z10) {
            this.f24223h0.k(7, 16777216);
        }
        String str = hVar2.f24230b;
        this.R = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, pg.e.J(pg.e.r("OkHttp %s Writer", str), false));
        this.V = scheduledThreadPoolExecutor;
        if (hVar2.f24236h != 0) {
            i iVar = new i();
            int i11 = hVar2.f24236h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, (long) i11, (long) i11, TimeUnit.MILLISECONDS);
        }
        this.W = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), pg.e.J(pg.e.r("OkHttp %s Push Observer", str), true));
        mVar.k(7, 65535);
        mVar.k(5, 16384);
        this.f24222g0 = (long) mVar.e();
        this.f24225j0 = hVar2.f24229a;
        this.f24226k0 = new j(hVar2.f24232d, z10);
        this.f24227l0 = new l(new h(hVar2.f24231c, z10));
    }

    public static /* synthetic */ long g(f fVar) {
        long j10 = fVar.Z;
        fVar.Z = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long i(f fVar) {
        long j10 = fVar.Y;
        fVar.Y = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long q(f fVar) {
        long j10 = fVar.f24217b0;
        fVar.f24217b0 = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long t(f fVar) {
        long j10 = fVar.f24219d0;
        fVar.f24219d0 = 1 + j10;
        return j10;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A(wg.b r4, wg.b r5, @javax.annotation.Nullable java.io.IOException r6) {
        /*
            r3 = this;
            r3.h1(r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, wg.i> r0 = r3.Q     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0026
            java.util.Map<java.lang.Integer, wg.i> r4 = r3.Q     // Catch:{ all -> 0x004a }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, wg.i> r0 = r3.Q     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            wg.i[] r0 = new wg.i[r0]     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004a }
            wg.i[] r4 = (wg.i[]) r4     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, wg.i> r0 = r3.Q     // Catch:{ all -> 0x004a }
            r0.clear()     // Catch:{ all -> 0x004a }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.d(r5, r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            wg.j r4 = r3.f24226k0     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.f24225j0     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.util.concurrent.ScheduledExecutorService r4 = r3.V
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.W
            r4.shutdown()
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.f.A(wg.b, wg.b, java.io.IOException):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f24226k0.m());
        r6 = (long) r2;
        r8.f24222g0 -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1(int r9, boolean r10, ch.c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            wg.j r12 = r8.f24226k0
            r12.g(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f24222g0     // Catch:{ InterruptedException -> 0x0058 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, wg.i> r2 = r8.Q     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r2 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0056 }
            int r2 = (int) r4     // Catch:{ all -> 0x0056 }
            wg.j r4 = r8.f24226k0     // Catch:{ all -> 0x0056 }
            int r4 = r4.m()     // Catch:{ all -> 0x0056 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f24222g0     // Catch:{ all -> 0x0056 }
            long r6 = (long) r2     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f24222g0 = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            wg.j r4 = r8.f24226k0
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = r3
        L_0x0052:
            r4.g(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.f.A1(int, boolean, ch.c, long):void");
    }

    public void F1(int i10, boolean z10, List<c> list) throws IOException {
        this.f24226k0.l(z10, i10, list);
    }

    public void H0(int i10, List<c> list) {
        synchronized (this) {
            if (this.f24228m0.contains(Integer.valueOf(i10))) {
                Q1(i10, b.PROTOCOL_ERROR);
                return;
            }
            this.f24228m0.add(Integer.valueOf(i10));
            try {
                m0(new d("OkHttp %s Push Request[%s]", new Object[]{this.R, Integer.valueOf(i10)}, i10, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void L1() {
        synchronized (this) {
            this.f24218c0++;
        }
        N1(false, 3, 1330343787);
    }

    public final void N(@Nullable IOException iOException) {
        b bVar = b.PROTOCOL_ERROR;
        A(bVar, bVar, iOException);
    }

    public void N1(boolean z10, int i10, int i11) {
        try {
            this.f24226k0.o(z10, i10, i11);
        } catch (IOException e10) {
            N(e10);
        }
    }

    public void O1() throws InterruptedException {
        L1();
        w();
    }

    public synchronized i P(int i10) {
        return this.Q.get(Integer.valueOf(i10));
    }

    public void P1(int i10, b bVar) throws IOException {
        this.f24226k0.t(i10, bVar);
    }

    public synchronized boolean Q(long j10) {
        if (this.U) {
            return false;
        }
        return this.f24217b0 >= this.f24216a0 || j10 < this.f24220e0;
    }

    public void Q1(int i10, b bVar) {
        try {
            this.V.execute(new a("OkHttp %s stream %d", new Object[]{this.R, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void R1(int i10, long j10) {
        try {
            this.V.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.R, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void T0(int i10, b bVar) {
        m0(new g("OkHttp %s Push Reset[%s]", new Object[]{this.R, Integer.valueOf(i10)}, i10, bVar));
    }

    public i W0(int i10, List<c> list, boolean z10) throws IOException {
        if (!this.O) {
            return a0(i10, list, z10);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public boolean X0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public synchronized int Y() {
        return this.f24224i0.f(Integer.MAX_VALUE);
    }

    public synchronized i Z0(int i10) {
        i remove;
        remove = this.Q.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final wg.i a0(int r11, java.util.List<wg.c> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            wg.j r7 = r10.f24226k0
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0076 }
            int r0 = r10.T     // Catch:{ all -> 0x0073 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            wg.b r0 = wg.b.REFUSED_STREAM     // Catch:{ all -> 0x0073 }
            r10.h1(r0)     // Catch:{ all -> 0x0073 }
        L_0x0013:
            boolean r0 = r10.U     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006d
            int r8 = r10.T     // Catch:{ all -> 0x0073 }
            int r0 = r8 + 2
            r10.T = r0     // Catch:{ all -> 0x0073 }
            wg.i r9 = new wg.i     // Catch:{ all -> 0x0073 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0073 }
            if (r13 == 0) goto L_0x003a
            long r0 = r10.f24222g0     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003a
            long r0 = r9.f24256b     // Catch:{ all -> 0x0073 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r13 = 0
            goto L_0x003b
        L_0x003a:
            r13 = 1
        L_0x003b:
            boolean r0 = r9.n()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.Integer, wg.i> r0 = r10.Q     // Catch:{ all -> 0x0073 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0073 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            if (r11 != 0) goto L_0x0053
            wg.j r11 = r10.f24226k0     // Catch:{ all -> 0x0076 }
            r11.l(r6, r8, r12)     // Catch:{ all -> 0x0076 }
            goto L_0x005c
        L_0x0053:
            boolean r0 = r10.O     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0065
            wg.j r0 = r10.f24226k0     // Catch:{ all -> 0x0076 }
            r0.q(r11, r8, r12)     // Catch:{ all -> 0x0076 }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            if (r13 == 0) goto L_0x0064
            wg.j r11 = r10.f24226k0
            r11.flush()
        L_0x0064:
            return r9
        L_0x0065:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0076 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x006d:
            wg.a r11 = new wg.a     // Catch:{ all -> 0x0073 }
            r11.<init>()     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.f.a0(int, java.util.List, boolean):wg.i");
    }

    public i c0(List<c> list, boolean z10) throws IOException {
        return a0(0, list, z10);
    }

    public void close() {
        A(b.NO_ERROR, b.CANCEL, (IOException) null);
    }

    public synchronized int e0() {
        return this.Q.size();
    }

    public void f1() {
        synchronized (this) {
            long j10 = this.f24217b0;
            long j11 = this.f24216a0;
            if (j10 >= j11) {
                this.f24216a0 = j11 + 1;
                this.f24220e0 = System.nanoTime() + 1000000000;
                try {
                    this.V.execute(new c("OkHttp %s ping", this.R));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public void flush() throws IOException {
        this.f24226k0.flush();
    }

    public void g1(m mVar) throws IOException {
        synchronized (this.f24226k0) {
            synchronized (this) {
                if (!this.U) {
                    this.f24223h0.j(mVar);
                } else {
                    throw new a();
                }
            }
            this.f24226k0.w(mVar);
        }
    }

    public void h1(b bVar) throws IOException {
        synchronized (this.f24226k0) {
            synchronized (this) {
                if (!this.U) {
                    this.U = true;
                    int i10 = this.S;
                    this.f24226k0.k(i10, bVar, pg.e.f22065a);
                }
            }
        }
    }

    public void k0(int i10, ch.e eVar, int i11, boolean z10) throws IOException {
        ch.c cVar = new ch.c();
        long j10 = (long) i11;
        eVar.E1(j10);
        eVar.C0(cVar, j10);
        if (cVar.size() == j10) {
            m0(new C0480f("OkHttp %s Push Data[%s]", new Object[]{this.R, Integer.valueOf(i10)}, i10, cVar, i11, z10));
            return;
        }
        throw new IOException(cVar.size() + " != " + i11);
    }

    public final synchronized void m0(pg.b bVar) {
        if (!this.U) {
            this.W.execute(bVar);
        }
    }

    public void m1() throws IOException {
        p1(true);
    }

    public void p1(boolean z10) throws IOException {
        if (z10) {
            this.f24226k0.f();
            this.f24226k0.w(this.f24223h0);
            int e10 = this.f24223h0.e();
            if (e10 != 65535) {
                this.f24226k0.A(0, (long) (e10 - 65535));
            }
        }
        new Thread(this.f24227l0).start();
    }

    public synchronized void r1(long j10) {
        long j11 = this.f24221f0 + j10;
        this.f24221f0 = j11;
        if (j11 >= ((long) (this.f24223h0.e() / 2))) {
            R1(0, this.f24221f0);
            this.f24221f0 = 0;
        }
    }

    public synchronized void w() throws InterruptedException {
        while (this.f24219d0 < this.f24218c0) {
            wait();
        }
    }

    public void z0(int i10, List<c> list, boolean z10) {
        try {
            m0(new e("OkHttp %s Push Headers[%s]", new Object[]{this.R, Integer.valueOf(i10)}, i10, list, z10));
        } catch (RejectedExecutionException unused) {
        }
    }
}
