package bh;

import bh.d;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import og.g;
import og.g0;
import og.h;
import og.h0;
import og.j0;
import og.l0;
import og.p0;
import og.q0;
import og.x;

public final class b implements p0, d.a {
    public static final /* synthetic */ boolean A = false;

    /* renamed from: x  reason: collision with root package name */
    public static final List<h0> f16255x = Collections.singletonList(h0.HTTP_1_1);

    /* renamed from: y  reason: collision with root package name */
    public static final long f16256y = 16777216;

    /* renamed from: z  reason: collision with root package name */
    public static final long f16257z = 60000;

    /* renamed from: a  reason: collision with root package name */
    public final j0 f16258a;

    /* renamed from: b  reason: collision with root package name */
    public final q0 f16259b;

    /* renamed from: c  reason: collision with root package name */
    public final Random f16260c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16261d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16262e;

    /* renamed from: f  reason: collision with root package name */
    public g f16263f;

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f16264g;

    /* renamed from: h  reason: collision with root package name */
    public d f16265h;

    /* renamed from: i  reason: collision with root package name */
    public e f16266i;

    /* renamed from: j  reason: collision with root package name */
    public ScheduledExecutorService f16267j;

    /* renamed from: k  reason: collision with root package name */
    public f f16268k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayDeque<ch.f> f16269l = new ArrayDeque<>();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayDeque<Object> f16270m = new ArrayDeque<>();

    /* renamed from: n  reason: collision with root package name */
    public long f16271n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16272o;

    /* renamed from: p  reason: collision with root package name */
    public ScheduledFuture<?> f16273p;

    /* renamed from: q  reason: collision with root package name */
    public int f16274q = -1;

    /* renamed from: r  reason: collision with root package name */
    public String f16275r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f16276s;

    /* renamed from: t  reason: collision with root package name */
    public int f16277t;

    /* renamed from: u  reason: collision with root package name */
    public int f16278u;

    /* renamed from: v  reason: collision with root package name */
    public int f16279v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f16280w;

    public class a implements h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j0 f16281a;

        public a(j0 j0Var) {
            this.f16281a = j0Var;
        }

        public void a(g gVar, l0 l0Var) {
            tg.c f10 = pg.a.f22062a.f(l0Var);
            try {
                b.this.m(l0Var, f10);
                f i10 = f10.i();
                try {
                    b.this.q("OkHttp WebSocket " + this.f16281a.k().N(), i10);
                    b bVar = b.this;
                    bVar.f16259b.f(bVar, l0Var);
                    b.this.s();
                } catch (Exception e10) {
                    b.this.p(e10, (l0) null);
                }
            } catch (IOException e11) {
                if (f10 != null) {
                    f10.s();
                }
                b.this.p(e11, l0Var);
                pg.e.g(l0Var);
            }
        }

        public void b(g gVar, IOException iOException) {
            b.this.p(iOException, (l0) null);
        }
    }

    /* renamed from: bh.b$b  reason: collision with other inner class name */
    public final class C0263b implements Runnable {
        public C0263b() {
        }

        public void run() {
            b.this.cancel();
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f16283a;

        /* renamed from: b  reason: collision with root package name */
        public final ch.f f16284b;

        /* renamed from: c  reason: collision with root package name */
        public final long f16285c;

        public c(int i10, ch.f fVar, long j10) {
            this.f16283a = i10;
            this.f16284b = fVar;
            this.f16285c = j10;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f16286a;

        /* renamed from: b  reason: collision with root package name */
        public final ch.f f16287b;

        public d(int i10, ch.f fVar) {
            this.f16286a = i10;
            this.f16287b = fVar;
        }
    }

    public final class e implements Runnable {
        public e() {
        }

        public void run() {
            b.this.C();
        }
    }

    public static abstract class f implements Closeable {
        public final boolean O;
        public final ch.e P;
        public final ch.d Q;

        public f(boolean z10, ch.e eVar, ch.d dVar) {
            this.O = z10;
            this.P = eVar;
            this.Q = dVar;
        }
    }

    public b(j0 j0Var, q0 q0Var, Random random, long j10) {
        if ("GET".equals(j0Var.g())) {
            this.f16258a = j0Var;
            this.f16259b = q0Var;
            this.f16260c = random;
            this.f16261d = j10;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f16262e = ch.f.I(bArr).b();
            this.f16264g = new a(this);
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + j0Var.g());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r() {
        do {
            try {
            } catch (IOException e10) {
                p(e10, (l0) null);
                return;
            }
        } while (B());
    }

    public void A() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.f16273p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f16267j.shutdown();
        this.f16267j.awaitTermination(10, TimeUnit.SECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r2 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if ((r4 instanceof bh.b.d) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r2 = ((bh.b.d) r4).f16287b;
        r0 = ch.p.c(r0.a(((bh.b.d) r4).f16286a, (long) r2.R()));
        r0.T(r2);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r12.f16271n -= (long) r2.R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if ((r4 instanceof bh.b.c) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        r4 = (bh.b.c) r4;
        r0.b(r4.f16283a, r4.f16284b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        if (r1 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        r12.f16259b.a(r12, r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
        pg.e.g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ac, code lost:
        pg.e.g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00af, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean B() throws java.io.IOException {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f16276s     // Catch:{ all -> 0x00b0 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r12)     // Catch:{ all -> 0x00b0 }
            return r1
        L_0x0008:
            bh.e r0 = r12.f16266i     // Catch:{ all -> 0x00b0 }
            java.util.ArrayDeque<ch.f> r2 = r12.f16269l     // Catch:{ all -> 0x00b0 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00b0 }
            ch.f r2 = (ch.f) r2     // Catch:{ all -> 0x00b0 }
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x0053
            java.util.ArrayDeque<java.lang.Object> r5 = r12.f16270m     // Catch:{ all -> 0x00b0 }
            java.lang.Object r5 = r5.poll()     // Catch:{ all -> 0x00b0 }
            boolean r6 = r5 instanceof bh.b.c     // Catch:{ all -> 0x00b0 }
            if (r6 == 0) goto L_0x004b
            int r1 = r12.f16274q     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = r12.f16275r     // Catch:{ all -> 0x00b0 }
            if (r1 == r3) goto L_0x0034
            bh.b$f r3 = r12.f16268k     // Catch:{ all -> 0x00b0 }
            r12.f16268k = r4     // Catch:{ all -> 0x00b0 }
            java.util.concurrent.ScheduledExecutorService r4 = r12.f16267j     // Catch:{ all -> 0x00b0 }
            r4.shutdown()     // Catch:{ all -> 0x00b0 }
            r4 = r5
            r11 = r3
            r3 = r1
            r1 = r11
            goto L_0x0055
        L_0x0034:
            java.util.concurrent.ScheduledExecutorService r3 = r12.f16267j     // Catch:{ all -> 0x00b0 }
            bh.b$b r7 = new bh.b$b     // Catch:{ all -> 0x00b0 }
            r7.<init>()     // Catch:{ all -> 0x00b0 }
            r8 = r5
            bh.b$c r8 = (bh.b.c) r8     // Catch:{ all -> 0x00b0 }
            long r8 = r8.f16285c     // Catch:{ all -> 0x00b0 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00b0 }
            java.util.concurrent.ScheduledFuture r3 = r3.schedule(r7, r8, r10)     // Catch:{ all -> 0x00b0 }
            r12.f16273p = r3     // Catch:{ all -> 0x00b0 }
            r3 = r1
            r1 = r4
            goto L_0x0051
        L_0x004b:
            if (r5 != 0) goto L_0x004f
            monitor-exit(r12)     // Catch:{ all -> 0x00b0 }
            return r1
        L_0x004f:
            r1 = r4
            r6 = r1
        L_0x0051:
            r4 = r5
            goto L_0x0055
        L_0x0053:
            r1 = r4
            r6 = r1
        L_0x0055:
            monitor-exit(r12)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x005c
            r0.f(r2)     // Catch:{ all -> 0x00ab }
            goto L_0x00a0
        L_0x005c:
            boolean r2 = r4 instanceof bh.b.d     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x008c
            r2 = r4
            bh.b$d r2 = (bh.b.d) r2     // Catch:{ all -> 0x00ab }
            ch.f r2 = r2.f16287b     // Catch:{ all -> 0x00ab }
            bh.b$d r4 = (bh.b.d) r4     // Catch:{ all -> 0x00ab }
            int r3 = r4.f16286a     // Catch:{ all -> 0x00ab }
            int r4 = r2.R()     // Catch:{ all -> 0x00ab }
            long r4 = (long) r4     // Catch:{ all -> 0x00ab }
            ch.z r0 = r0.a(r3, r4)     // Catch:{ all -> 0x00ab }
            ch.d r0 = ch.p.c(r0)     // Catch:{ all -> 0x00ab }
            r0.T(r2)     // Catch:{ all -> 0x00ab }
            r0.close()     // Catch:{ all -> 0x00ab }
            monitor-enter(r12)     // Catch:{ all -> 0x00ab }
            long r3 = r12.f16271n     // Catch:{ all -> 0x0089 }
            int r0 = r2.R()     // Catch:{ all -> 0x0089 }
            long r5 = (long) r0     // Catch:{ all -> 0x0089 }
            long r3 = r3 - r5
            r12.f16271n = r3     // Catch:{ all -> 0x0089 }
            monitor-exit(r12)     // Catch:{ all -> 0x0089 }
            goto L_0x00a0
        L_0x0089:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x008c:
            boolean r2 = r4 instanceof bh.b.c     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x00a5
            bh.b$c r4 = (bh.b.c) r4     // Catch:{ all -> 0x00ab }
            int r2 = r4.f16283a     // Catch:{ all -> 0x00ab }
            ch.f r4 = r4.f16284b     // Catch:{ all -> 0x00ab }
            r0.b(r2, r4)     // Catch:{ all -> 0x00ab }
            if (r1 == 0) goto L_0x00a0
            og.q0 r0 = r12.f16259b     // Catch:{ all -> 0x00ab }
            r0.a(r12, r3, r6)     // Catch:{ all -> 0x00ab }
        L_0x00a0:
            r0 = 1
            pg.e.g(r1)
            return r0
        L_0x00a5:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            pg.e.g(r1)
            throw r0
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00b0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.b.B():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        p(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.f16261d + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (og.l0) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.e(ch.f.T);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        p(r0, (og.l0) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f16276s     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            return
        L_0x0007:
            bh.e r0 = r7.f16266i     // Catch:{ all -> 0x0053 }
            boolean r1 = r7.f16280w     // Catch:{ all -> 0x0053 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r7.f16277t     // Catch:{ all -> 0x0053 }
            goto L_0x0012
        L_0x0011:
            r1 = r2
        L_0x0012:
            int r3 = r7.f16277t     // Catch:{ all -> 0x0053 }
            r4 = 1
            int r3 = r3 + r4
            r7.f16277t = r3     // Catch:{ all -> 0x0053 }
            r7.f16280w = r4     // Catch:{ all -> 0x0053 }
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r1 == r2) goto L_0x0048
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.f16261d
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.p(r0, r3)
            return
        L_0x0048:
            ch.f r1 = ch.f.T     // Catch:{ IOException -> 0x004e }
            r0.e(r1)     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r7.p(r0, r3)
        L_0x0052:
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.b.C():void");
    }

    public void a(ch.f fVar) throws IOException {
        this.f16259b.d(this, fVar);
    }

    public boolean b(String str) {
        if (str != null) {
            return y(ch.f.o(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public j0 c() {
        return this.f16258a;
    }

    public void cancel() {
        this.f16263f.cancel();
    }

    public void d(String str) throws IOException {
        this.f16259b.e(this, str);
    }

    public synchronized void e(ch.f fVar) {
        this.f16279v++;
        this.f16280w = false;
    }

    public boolean f(int i10, String str) {
        return n(i10, str, 60000);
    }

    public synchronized long g() {
        return this.f16271n;
    }

    public boolean h(ch.f fVar) {
        if (fVar != null) {
            return y(fVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    public void i(int i10, String str) {
        f fVar;
        if (i10 != -1) {
            synchronized (this) {
                if (this.f16274q == -1) {
                    this.f16274q = i10;
                    this.f16275r = str;
                    fVar = null;
                    if (this.f16272o && this.f16270m.isEmpty()) {
                        f fVar2 = this.f16268k;
                        this.f16268k = fVar;
                        ScheduledFuture<?> scheduledFuture = this.f16273p;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f16267j.shutdown();
                        fVar = fVar2;
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.f16259b.b(this, i10, str);
                if (fVar != null) {
                    this.f16259b.a(this, i10, str);
                }
            } finally {
                pg.e.g(fVar);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void j(ch.f r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f16276s     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.f16272o     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.f16270m     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<ch.f> r0 = r1.f16269l     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.x()     // Catch:{ all -> 0x0024 }
            int r2 = r1.f16278u     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.f16278u = r2     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.b.j(ch.f):void");
    }

    public void l(int i10, TimeUnit timeUnit) throws InterruptedException {
        this.f16267j.awaitTermination((long) i10, timeUnit);
    }

    public void m(l0 l0Var, @Nullable tg.c cVar) throws IOException {
        if (l0Var.i() == 101) {
            String l10 = l0Var.l("Connection");
            if ("Upgrade".equalsIgnoreCase(l10)) {
                String l11 = l0Var.l("Upgrade");
                if (rd.c.f22474x.equalsIgnoreCase(l11)) {
                    String l12 = l0Var.l("Sec-WebSocket-Accept");
                    String b10 = ch.f.o(this.f16262e + c.f16288a).O().b();
                    if (!b10.equals(l12)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + b10 + "' but was '" + l12 + "'");
                    } else if (cVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + l11 + "'");
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + l10 + "'");
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + l0Var.i() + " " + l0Var.A() + "'");
        }
    }

    public synchronized boolean n(int i10, String str, long j10) {
        c.d(i10);
        ch.f fVar = null;
        if (str != null) {
            fVar = ch.f.o(str);
            if (((long) fVar.R()) > 123) {
                throw new IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.f16276s) {
            if (!this.f16272o) {
                this.f16272o = true;
                this.f16270m.add(new c(i10, fVar, j10));
                x();
                return true;
            }
        }
        return false;
    }

    public void o(g0 g0Var) {
        g0 d10 = g0Var.A().p(x.f21778a).y(f16255x).d();
        j0 b10 = this.f16258a.h().h("Upgrade", rd.c.f22474x).h("Connection", "Upgrade").h("Sec-WebSocket-Key", this.f16262e).h("Sec-WebSocket-Version", "13").b();
        g i10 = pg.a.f22062a.i(d10, b10);
        this.f16263f = i10;
        i10.o(new a(b10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.f16259b.c(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        pg.e.g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(java.lang.Exception r4, @javax.annotation.Nullable og.l0 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f16276s     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            return
        L_0x0007:
            r0 = 1
            r3.f16276s = r0     // Catch:{ all -> 0x002d }
            bh.b$f r0 = r3.f16268k     // Catch:{ all -> 0x002d }
            r1 = 0
            r3.f16268k = r1     // Catch:{ all -> 0x002d }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f16273p     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0017
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x002d }
        L_0x0017:
            java.util.concurrent.ScheduledExecutorService r1 = r3.f16267j     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x001e
            r1.shutdown()     // Catch:{ all -> 0x002d }
        L_0x001e:
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            og.q0 r1 = r3.f16259b     // Catch:{ all -> 0x0028 }
            r1.c(r3, r4, r5)     // Catch:{ all -> 0x0028 }
            pg.e.g(r0)
            return
        L_0x0028:
            r4 = move-exception
            pg.e.g(r0)
            throw r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.b.p(java.lang.Exception, og.l0):void");
    }

    public void q(String str, f fVar) throws IOException {
        synchronized (this) {
            this.f16268k = fVar;
            this.f16266i = new e(fVar.O, fVar.Q, this.f16260c);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, pg.e.J(str, false));
            this.f16267j = scheduledThreadPoolExecutor;
            if (this.f16261d != 0) {
                e eVar = new e();
                long j10 = this.f16261d;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar, j10, j10, TimeUnit.MILLISECONDS);
            }
            if (!this.f16270m.isEmpty()) {
                x();
            }
        }
        this.f16265h = new d(fVar.O, fVar.P, this);
    }

    public void s() throws IOException {
        while (this.f16274q == -1) {
            this.f16265h.a();
        }
    }

    public synchronized boolean t(ch.f fVar) {
        boolean z10;
        if (!this.f16276s) {
            if (!this.f16272o || !this.f16270m.isEmpty()) {
                this.f16269l.add(fVar);
                x();
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    public boolean u() throws IOException {
        try {
            this.f16265h.a();
            return this.f16274q == -1;
        } catch (Exception e10) {
            p(e10, (l0) null);
            return false;
        }
    }

    public synchronized int v() {
        return this.f16278u;
    }

    public synchronized int w() {
        return this.f16279v;
    }

    public final void x() {
        ScheduledExecutorService scheduledExecutorService = this.f16267j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f16264g);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean y(ch.f r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f16276s     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.f16272o     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.f16271n     // Catch:{ all -> 0x003e }
            int r0 = r7.R()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.f(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.f16271n     // Catch:{ all -> 0x003e }
            int r2 = r7.R()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.f16271n = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.f16270m     // Catch:{ all -> 0x003e }
            bh.b$d r1 = new bh.b$d     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.x()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.b.y(ch.f, int):boolean");
    }

    public synchronized int z() {
        return this.f16277t;
    }
}
