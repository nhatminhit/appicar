package ch;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class a extends b0 {

    /* renamed from: h  reason: collision with root package name */
    public static final int f16498h = 65536;

    /* renamed from: i  reason: collision with root package name */
    public static final long f16499i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f16500j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public static a f16501k;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16502e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public a f16503f;

    /* renamed from: g  reason: collision with root package name */
    public long f16504g;

    /* renamed from: ch.a$a  reason: collision with other inner class name */
    public class C0270a implements z {
        public final /* synthetic */ z O;

        public C0270a(z zVar) {
            this.O = zVar;
        }

        public b0 b() {
            return a.this;
        }

        public void close() throws IOException {
            a.this.n();
            try {
                this.O.close();
                a.this.p(true);
            } catch (IOException e10) {
                throw a.this.o(e10);
            } catch (Throwable th2) {
                a.this.p(false);
                throw th2;
            }
        }

        public void d1(c cVar, long j10) throws IOException {
            d0.b(cVar.P, 0, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    w wVar = cVar.O;
                    while (true) {
                        if (j11 >= 65536) {
                            break;
                        }
                        j11 += (long) (wVar.f16531c - wVar.f16530b);
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        }
                        wVar = wVar.f16534f;
                    }
                    a.this.n();
                    try {
                        this.O.d1(cVar, j11);
                        j10 -= j11;
                        a.this.p(true);
                    } catch (IOException e10) {
                        throw a.this.o(e10);
                    } catch (Throwable th2) {
                        a.this.p(false);
                        throw th2;
                    }
                } else {
                    return;
                }
            }
        }

        public void flush() throws IOException {
            a.this.n();
            try {
                this.O.flush();
                a.this.p(true);
            } catch (IOException e10) {
                throw a.this.o(e10);
            } catch (Throwable th2) {
                a.this.p(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.O + ")";
        }
    }

    public class b implements a0 {
        public final /* synthetic */ a0 O;

        public b(a0 a0Var) {
            this.O = a0Var;
        }

        public long C0(c cVar, long j10) throws IOException {
            a.this.n();
            try {
                long C0 = this.O.C0(cVar, j10);
                a.this.p(true);
                return C0;
            } catch (IOException e10) {
                throw a.this.o(e10);
            } catch (Throwable th2) {
                a.this.p(false);
                throw th2;
            }
        }

        public b0 b() {
            return a.this;
        }

        public void close() throws IOException {
            a.this.n();
            try {
                this.O.close();
                a.this.p(true);
            } catch (IOException e10) {
                throw a.this.o(e10);
            } catch (Throwable th2) {
                a.this.p(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.O + ")";
        }
    }

    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.w();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<ch.a> r0 = ch.a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                ch.a r1 = ch.a.l()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                ch.a r2 = ch.a.f16501k     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                ch.a.f16501k = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.w()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f16499i = millis;
        f16500j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static a l() throws InterruptedException {
        Class<a> cls = a.class;
        a aVar = f16501k.f16503f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            cls.wait(f16499i);
            if (f16501k.f16503f != null || System.nanoTime() - nanoTime < f16500j) {
                return null;
            }
            return f16501k;
        }
        long s10 = aVar.s(nanoTime);
        if (s10 > 0) {
            long j10 = s10 / 1000000;
            cls.wait(j10, (int) (s10 - (1000000 * j10)));
            return null;
        }
        f16501k.f16503f = aVar.f16503f;
        aVar.f16503f = null;
        return aVar;
    }

    public static synchronized boolean m(a aVar) {
        boolean z10;
        synchronized (a.class) {
            a aVar2 = f16501k;
            while (true) {
                if (aVar2 == null) {
                    z10 = true;
                    break;
                }
                a aVar3 = aVar2.f16503f;
                if (aVar3 == aVar) {
                    aVar2.f16503f = aVar.f16503f;
                    aVar.f16503f = null;
                    z10 = false;
                    break;
                }
                aVar2 = aVar3;
            }
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0050 A[EDGE_INSN: B:33:0x0050->B:22:0x0050 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void t(ch.a r5, long r6, boolean r8) {
        /*
            java.lang.Class<ch.a> r0 = ch.a.class
            monitor-enter(r0)
            ch.a r1 = f16501k     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0016
            ch.a r1 = new ch.a     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            f16501k = r1     // Catch:{ all -> 0x0065 }
            ch.a$c r1 = new ch.a$c     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            r1.start()     // Catch:{ all -> 0x0065 }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0065 }
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002f
            long r3 = r5.d()     // Catch:{ all -> 0x0065 }
            long r3 = r3 - r1
            long r6 = java.lang.Math.min(r6, r3)     // Catch:{ all -> 0x0065 }
        L_0x002b:
            long r6 = r6 + r1
            r5.f16504g = r6     // Catch:{ all -> 0x0065 }
            goto L_0x003a
        L_0x002f:
            if (r3 == 0) goto L_0x0032
            goto L_0x002b
        L_0x0032:
            if (r8 == 0) goto L_0x005f
            long r6 = r5.d()     // Catch:{ all -> 0x0065 }
            r5.f16504g = r6     // Catch:{ all -> 0x0065 }
        L_0x003a:
            long r6 = r5.s(r1)     // Catch:{ all -> 0x0065 }
            ch.a r8 = f16501k     // Catch:{ all -> 0x0065 }
        L_0x0040:
            ch.a r3 = r8.f16503f     // Catch:{ all -> 0x0065 }
            if (r3 == 0) goto L_0x0050
            long r3 = r3.s(r1)     // Catch:{ all -> 0x0065 }
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            ch.a r8 = r8.f16503f     // Catch:{ all -> 0x0065 }
            goto L_0x0040
        L_0x0050:
            ch.a r6 = r8.f16503f     // Catch:{ all -> 0x0065 }
            r5.f16503f = r6     // Catch:{ all -> 0x0065 }
            r8.f16503f = r5     // Catch:{ all -> 0x0065 }
            ch.a r5 = f16501k     // Catch:{ all -> 0x0065 }
            if (r8 != r5) goto L_0x005d
            r0.notify()     // Catch:{ all -> 0x0065 }
        L_0x005d:
            monitor-exit(r0)
            return
        L_0x005f:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch:{ all -> 0x0065 }
            r5.<init>()     // Catch:{ all -> 0x0065 }
            throw r5     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.a.t(ch.a, long, boolean):void");
    }

    public final void n() {
        if (!this.f16502e) {
            long j10 = j();
            boolean f10 = f();
            if (j10 != 0 || f10) {
                this.f16502e = true;
                t(this, j10, f10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final IOException o(IOException iOException) throws IOException {
        return !q() ? iOException : r(iOException);
    }

    public final void p(boolean z10) throws IOException {
        if (q() && z10) {
            throw r((IOException) null);
        }
    }

    public final boolean q() {
        if (!this.f16502e) {
            return false;
        }
        this.f16502e = false;
        return m(this);
    }

    public IOException r(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long s(long j10) {
        return this.f16504g - j10;
    }

    public final z u(z zVar) {
        return new C0270a(zVar);
    }

    public final a0 v(a0 a0Var) {
        return new b(a0Var);
    }

    public void w() {
    }
}
