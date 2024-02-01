package og;

import ch.b0;
import h0.u0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import pg.b;
import tg.k;

public final class i0 implements g {
    public final g0 O;
    public k P;
    public final j0 Q;
    public final boolean R;
    public boolean S;

    public final class a extends b {
        public static final /* synthetic */ boolean S = false;
        public final h P;
        public volatile AtomicInteger Q = new AtomicInteger(0);

        static {
            Class<i0> cls = i0.class;
        }

        public a(h hVar) {
            super("OkHttp %s", i0.this.j());
            this.P = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0033 A[Catch:{ IOException -> 0x0056, all -> 0x0028, all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[Catch:{ IOException -> 0x0056, all -> 0x0028, all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007c A[Catch:{ IOException -> 0x0056, all -> 0x0028, all -> 0x0054 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l() {
            /*
                r6 = this;
                og.i0 r0 = og.i0.this
                tg.k r0 = r0.P
                r0.q()
                r0 = 0
                og.i0 r1 = og.i0.this     // Catch:{ IOException -> 0x0056, all -> 0x0028 }
                og.l0 r0 = r1.g()     // Catch:{ IOException -> 0x0056, all -> 0x0028 }
                r1 = 1
                og.h r2 = r6.P     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                og.i0 r3 = og.i0.this     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                r2.a(r3, r0)     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
            L_0x0018:
                og.i0 r0 = og.i0.this
                og.g0 r0 = r0.O
                og.s r0 = r0.r()
                r0.g(r6)
                goto L_0x0084
            L_0x0024:
                r0 = move-exception
                goto L_0x002c
            L_0x0026:
                r0 = move-exception
                goto L_0x005a
            L_0x0028:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
            L_0x002c:
                og.i0 r2 = og.i0.this     // Catch:{ all -> 0x0054 }
                r2.cancel()     // Catch:{ all -> 0x0054 }
                if (r1 != 0) goto L_0x0053
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0054 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
                r2.<init>()     // Catch:{ all -> 0x0054 }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x0054 }
                r2.append(r0)     // Catch:{ all -> 0x0054 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0054 }
                r1.<init>(r2)     // Catch:{ all -> 0x0054 }
                r1.addSuppressed(r0)     // Catch:{ all -> 0x0054 }
                og.h r2 = r6.P     // Catch:{ all -> 0x0054 }
                og.i0 r3 = og.i0.this     // Catch:{ all -> 0x0054 }
                r2.b(r3, r1)     // Catch:{ all -> 0x0054 }
            L_0x0053:
                throw r0     // Catch:{ all -> 0x0054 }
            L_0x0054:
                r0 = move-exception
                goto L_0x0085
            L_0x0056:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
            L_0x005a:
                if (r1 == 0) goto L_0x007c
                yg.h r1 = yg.h.m()     // Catch:{ all -> 0x0054 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
                r3.<init>()     // Catch:{ all -> 0x0054 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0054 }
                og.i0 r4 = og.i0.this     // Catch:{ all -> 0x0054 }
                java.lang.String r4 = r4.k()     // Catch:{ all -> 0x0054 }
                r3.append(r4)     // Catch:{ all -> 0x0054 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0054 }
                r1.u(r2, r3, r0)     // Catch:{ all -> 0x0054 }
                goto L_0x0018
            L_0x007c:
                og.h r1 = r6.P     // Catch:{ all -> 0x0054 }
                og.i0 r2 = og.i0.this     // Catch:{ all -> 0x0054 }
                r1.b(r2, r0)     // Catch:{ all -> 0x0054 }
                goto L_0x0018
            L_0x0084:
                return
            L_0x0085:
                og.i0 r1 = og.i0.this
                og.g0 r1 = r1.O
                og.s r1 = r1.r()
                r1.g(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: og.i0.a.l():void");
        }

        public AtomicInteger m() {
            return this.Q;
        }

        public void n(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e10) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e10);
                i0.this.P.l(interruptedIOException);
                this.P.b(i0.this, interruptedIOException);
                i0.this.O.r().g(this);
            } catch (Throwable th2) {
                i0.this.O.r().g(this);
                throw th2;
            }
        }

        public i0 o() {
            return i0.this;
        }

        public String p() {
            return i0.this.Q.k().p();
        }

        public j0 q() {
            return i0.this.Q;
        }

        public void r(a aVar) {
            this.Q = aVar.Q;
        }
    }

    public i0(g0 g0Var, j0 j0Var, boolean z10) {
        this.O = g0Var;
        this.Q = j0Var;
        this.R = z10;
    }

    public static i0 i(g0 g0Var, j0 j0Var, boolean z10) {
        i0 i0Var = new i0(g0Var, j0Var, z10);
        i0Var.P = new k(g0Var, i0Var);
        return i0Var;
    }

    public b0 b() {
        return this.P.o();
    }

    public j0 c() {
        return this.Q;
    }

    public void cancel() {
        this.P.d();
    }

    /* renamed from: d */
    public i0 clone() {
        return i(this.O, this.Q, this.R);
    }

    public l0 e() throws IOException {
        synchronized (this) {
            if (!this.S) {
                this.S = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.P.q();
        this.P.b();
        try {
            this.O.r().c(this);
            return g();
        } finally {
            this.O.r().h(this);
        }
    }

    public synchronized boolean f() {
        return this.S;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public og.l0 g() throws java.io.IOException {
        /*
            r12 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            og.g0 r0 = r12.O
            java.util.List r0 = r0.x()
            r1.addAll(r0)
            ug.j r0 = new ug.j
            og.g0 r2 = r12.O
            r0.<init>(r2)
            r1.add(r0)
            ug.a r0 = new ug.a
            og.g0 r2 = r12.O
            og.q r2 = r2.q()
            r0.<init>(r2)
            r1.add(r0)
            rg.a r0 = new rg.a
            og.g0 r2 = r12.O
            rg.f r2 = r2.y()
            r0.<init>(r2)
            r1.add(r0)
            tg.a r0 = new tg.a
            og.g0 r2 = r12.O
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r12.R
            if (r0 != 0) goto L_0x004b
            og.g0 r0 = r12.O
            java.util.List r0 = r0.z()
            r1.addAll(r0)
        L_0x004b:
            ug.b r0 = new ug.b
            boolean r2 = r12.R
            r0.<init>(r2)
            r1.add(r0)
            ug.g r10 = new ug.g
            tg.k r2 = r12.P
            r3 = 0
            r4 = 0
            og.j0 r5 = r12.Q
            og.g0 r0 = r12.O
            int r7 = r0.m()
            og.g0 r0 = r12.O
            int r8 = r0.H()
            og.g0 r0 = r12.O
            int r9 = r0.L()
            r0 = r10
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            og.j0 r2 = r12.Q     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            og.l0 r2 = r10.h(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            tg.k r3 = r12.P     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            boolean r3 = r3.i()     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            if (r3 != 0) goto L_0x008a
            tg.k r0 = r12.P
            r0.l(r1)
            return r2
        L_0x008a:
            pg.e.g(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            throw r2     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            goto L_0x00a4
        L_0x0097:
            r0 = move-exception
            r2 = 1
            tg.k r3 = r12.P     // Catch:{ all -> 0x00a0 }
            java.io.IOException r0 = r3.l(r0)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r11 = r2
            r2 = r0
            r0 = r11
        L_0x00a4:
            if (r0 != 0) goto L_0x00ab
            tg.k r0 = r12.P
            r0.l(r1)
        L_0x00ab:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: og.i0.g():og.l0");
    }

    public boolean h() {
        return this.P.i();
    }

    public String j() {
        return this.Q.k().N();
    }

    public String k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h() ? "canceled " : "");
        sb2.append(this.R ? "web socket" : u0.f8524n0);
        sb2.append(" to ");
        sb2.append(j());
        return sb2.toString();
    }

    public void o(h hVar) {
        synchronized (this) {
            if (!this.S) {
                this.S = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.P.b();
        this.O.r().b(new a(hVar));
    }
}
