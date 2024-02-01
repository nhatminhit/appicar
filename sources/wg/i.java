package wg;

import ch.a0;
import ch.e;
import ch.z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import og.b0;

public final class i {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ boolean f24254m = false;

    /* renamed from: a  reason: collision with root package name */
    public long f24255a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f24256b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24257c;

    /* renamed from: d  reason: collision with root package name */
    public final f f24258d;

    /* renamed from: e  reason: collision with root package name */
    public final Deque<b0> f24259e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f24260f;

    /* renamed from: g  reason: collision with root package name */
    public final b f24261g;

    /* renamed from: h  reason: collision with root package name */
    public final a f24262h;

    /* renamed from: i  reason: collision with root package name */
    public final c f24263i;

    /* renamed from: j  reason: collision with root package name */
    public final c f24264j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public b f24265k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public IOException f24266l;

    public final class a implements z {
        public static final long T = 16384;
        public static final /* synthetic */ boolean U = false;
        public final ch.c O = new ch.c();
        public b0 P;
        public boolean Q;
        public boolean R;

        public a() {
        }

        public ch.b0 b() {
            return i.this.f24264j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r8.O.size() <= 0) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r8.P == null) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
            if (r3 == false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
            if (r8.O.size() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
            f(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
            r0 = r8.S;
            r0.f24258d.F1(r0.f24257c, true, pg.e.K(r8.P));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
            if (r0 == false) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            if (r8.O.size() <= 0) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            f(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
            r0 = r8.S;
            r0.f24258d.A1(r0.f24257c, true, (ch.c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            r2 = r8.S;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r8.Q = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
            r8.S.f24258d.flush();
            r8.S.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.S.f24262h.R != false) goto L_0x0067;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                wg.i r0 = wg.i.this
                monitor-enter(r0)
                boolean r1 = r8.Q     // Catch:{ all -> 0x007d }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                wg.i r0 = wg.i.this
                wg.i$a r0 = r0.f24262h
                boolean r0 = r0.R
                r1 = 1
                if (r0 != 0) goto L_0x0067
                ch.c r0 = r8.O
                long r2 = r0.size()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r2 = 0
                if (r0 <= 0) goto L_0x0022
                r0 = r1
                goto L_0x0023
            L_0x0022:
                r0 = r2
            L_0x0023:
                og.b0 r3 = r8.P
                if (r3 == 0) goto L_0x0029
                r3 = r1
                goto L_0x002a
            L_0x0029:
                r3 = r2
            L_0x002a:
                if (r3 == 0) goto L_0x004a
            L_0x002c:
                ch.c r0 = r8.O
                long r6 = r0.size()
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.f(r2)
                goto L_0x002c
            L_0x003a:
                wg.i r0 = wg.i.this
                wg.f r2 = r0.f24258d
                int r0 = r0.f24257c
                og.b0 r3 = r8.P
                java.util.List r3 = pg.e.K(r3)
                r2.F1(r0, r1, r3)
                goto L_0x0067
            L_0x004a:
                if (r0 == 0) goto L_0x005a
            L_0x004c:
                ch.c r0 = r8.O
                long r2 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0067
                r8.f(r1)
                goto L_0x004c
            L_0x005a:
                wg.i r0 = wg.i.this
                wg.f r2 = r0.f24258d
                int r3 = r0.f24257c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.A1(r3, r4, r5, r6)
            L_0x0067:
                wg.i r2 = wg.i.this
                monitor-enter(r2)
                r8.Q = r1     // Catch:{ all -> 0x007a }
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                wg.i r0 = wg.i.this
                wg.f r0 = r0.f24258d
                r0.flush()
                wg.i r0 = wg.i.this
                r0.b()
                return
            L_0x007a:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                throw r0
            L_0x007d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wg.i.a.close():void");
        }

        public void d1(ch.c cVar, long j10) throws IOException {
            this.O.d1(cVar, j10);
            while (this.O.size() >= 16384) {
                f(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f24264j.x();
            r11.S.c();
            r9 = java.lang.Math.min(r11.S.f24256b, r11.O.size());
            r1 = r11.S;
            r1.f24256b -= r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                wg.i r0 = wg.i.this
                monitor-enter(r0)
                wg.i r1 = wg.i.this     // Catch:{ all -> 0x007f }
                wg.i$c r1 = r1.f24264j     // Catch:{ all -> 0x007f }
                r1.n()     // Catch:{ all -> 0x007f }
            L_0x000a:
                wg.i r1 = wg.i.this     // Catch:{ all -> 0x0076 }
                long r2 = r1.f24256b     // Catch:{ all -> 0x0076 }
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L_0x0024
                boolean r2 = r11.R     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.Q     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                wg.b r2 = r1.f24265k     // Catch:{ all -> 0x0076 }
                if (r2 != 0) goto L_0x0024
                r1.u()     // Catch:{ all -> 0x0076 }
                goto L_0x000a
            L_0x0024:
                wg.i$c r1 = r1.f24264j     // Catch:{ all -> 0x007f }
                r1.x()     // Catch:{ all -> 0x007f }
                wg.i r1 = wg.i.this     // Catch:{ all -> 0x007f }
                r1.c()     // Catch:{ all -> 0x007f }
                wg.i r1 = wg.i.this     // Catch:{ all -> 0x007f }
                long r1 = r1.f24256b     // Catch:{ all -> 0x007f }
                ch.c r3 = r11.O     // Catch:{ all -> 0x007f }
                long r3 = r3.size()     // Catch:{ all -> 0x007f }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007f }
                wg.i r1 = wg.i.this     // Catch:{ all -> 0x007f }
                long r2 = r1.f24256b     // Catch:{ all -> 0x007f }
                long r2 = r2 - r9
                r1.f24256b = r2     // Catch:{ all -> 0x007f }
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                wg.i$c r0 = r1.f24264j
                r0.n()
                if (r12 == 0) goto L_0x0059
                ch.c r12 = r11.O     // Catch:{ all -> 0x0057 }
                long r0 = r12.size()     // Catch:{ all -> 0x0057 }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x0059
                r12 = 1
                goto L_0x005a
            L_0x0057:
                r12 = move-exception
                goto L_0x006e
            L_0x0059:
                r12 = 0
            L_0x005a:
                r7 = r12
                wg.i r12 = wg.i.this     // Catch:{ all -> 0x0057 }
                wg.f r5 = r12.f24258d     // Catch:{ all -> 0x0057 }
                int r6 = r12.f24257c     // Catch:{ all -> 0x0057 }
                ch.c r8 = r11.O     // Catch:{ all -> 0x0057 }
                r5.A1(r6, r7, r8, r9)     // Catch:{ all -> 0x0057 }
                wg.i r12 = wg.i.this
                wg.i$c r12 = r12.f24264j
                r12.x()
                return
            L_0x006e:
                wg.i r0 = wg.i.this
                wg.i$c r0 = r0.f24264j
                r0.x()
                throw r12
            L_0x0076:
                r12 = move-exception
                wg.i r1 = wg.i.this     // Catch:{ all -> 0x007f }
                wg.i$c r1 = r1.f24264j     // Catch:{ all -> 0x007f }
                r1.x()     // Catch:{ all -> 0x007f }
                throw r12     // Catch:{ all -> 0x007f }
            L_0x007f:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007f }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: wg.i.a.f(boolean):void");
        }

        public void flush() throws IOException {
            synchronized (i.this) {
                i.this.c();
            }
            while (this.O.size() > 0) {
                f(false);
                i.this.f24258d.flush();
            }
        }
    }

    public final class b implements a0 {
        public static final /* synthetic */ boolean V = false;
        public final ch.c O = new ch.c();
        public final ch.c P = new ch.c();
        public final long Q;
        public b0 R;
        public boolean S;
        public boolean T;

        public b(long j10) {
            this.Q = j10;
        }

        public long C0(ch.c cVar, long j10) throws IOException {
            Throwable th2;
            long C0;
            if (j10 >= 0) {
                while (true) {
                    th2 = null;
                    synchronized (i.this) {
                        i.this.f24263i.n();
                        try {
                            i iVar = i.this;
                            if (iVar.f24265k != null) {
                                th2 = iVar.f24266l;
                                if (th2 == null) {
                                    th2 = new n(i.this.f24265k);
                                }
                            }
                            if (this.S) {
                                throw new IOException("stream closed");
                            } else if (this.P.size() > 0) {
                                ch.c cVar2 = this.P;
                                C0 = cVar2.C0(cVar, Math.min(j10, cVar2.size()));
                                i iVar2 = i.this;
                                long j11 = iVar2.f24255a + C0;
                                iVar2.f24255a = j11;
                                if (th2 == null && j11 >= ((long) (iVar2.f24258d.f24223h0.e() / 2))) {
                                    i iVar3 = i.this;
                                    iVar3.f24258d.R1(iVar3.f24257c, iVar3.f24255a);
                                    i.this.f24255a = 0;
                                }
                            } else if (this.T || th2 != null) {
                                C0 = -1;
                            } else {
                                i.this.u();
                            }
                        } finally {
                            i.this.f24263i.x();
                        }
                    }
                }
                i.this.f24263i.x();
                if (C0 != -1) {
                    k(C0);
                    return C0;
                } else if (th2 == null) {
                    return -1;
                } else {
                    throw th2;
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
        }

        public ch.b0 b() {
            return i.this.f24263i;
        }

        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                this.S = true;
                size = this.P.size();
                this.P.g();
                i.this.notifyAll();
            }
            if (size > 0) {
                k(size);
            }
            i.this.b();
        }

        public void i(e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.T;
                    z11 = true;
                    z12 = this.P.size() + j10 > this.Q;
                }
                if (z12) {
                    eVar.skip(j10);
                    i.this.f(b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z10) {
                    eVar.skip(j10);
                    return;
                } else {
                    long C0 = eVar.C0(this.O, j10);
                    if (C0 != -1) {
                        j10 -= C0;
                        synchronized (i.this) {
                            if (this.S) {
                                j11 = this.O.size();
                                this.O.g();
                            } else {
                                if (this.P.size() != 0) {
                                    z11 = false;
                                }
                                this.P.V0(this.O);
                                if (z11) {
                                    i.this.notifyAll();
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 > 0) {
                            k(j11);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public final void k(long j10) {
            i.this.f24258d.r1(j10);
        }
    }

    public class c extends ch.a {
        public c() {
        }

        public IOException r(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void w() {
            i.this.f(b.CANCEL);
            i.this.f24258d.f1();
        }

        public void x() throws IOException {
            if (q()) {
                throw r((IOException) null);
            }
        }
    }

    public i(int i10, f fVar, boolean z10, boolean z11, @Nullable b0 b0Var) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f24259e = arrayDeque;
        this.f24263i = new c();
        this.f24264j = new c();
        if (fVar != null) {
            this.f24257c = i10;
            this.f24258d = fVar;
            this.f24256b = (long) fVar.f24224i0.e();
            b bVar = new b((long) fVar.f24223h0.e());
            this.f24261g = bVar;
            a aVar = new a();
            this.f24262h = aVar;
            bVar.T = z11;
            aVar.R = z10;
            if (b0Var != null) {
                arrayDeque.add(b0Var);
            }
            if (m() && b0Var != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!m() && b0Var == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public void a(long j10) {
        this.f24256b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public void b() throws IOException {
        boolean z10;
        boolean n10;
        synchronized (this) {
            b bVar = this.f24261g;
            if (!bVar.T && bVar.S) {
                a aVar = this.f24262h;
                if (aVar.R || aVar.Q) {
                    z10 = true;
                    n10 = n();
                }
            }
            z10 = false;
            n10 = n();
        }
        if (z10) {
            d(b.CANCEL, (IOException) null);
        } else if (!n10) {
            this.f24258d.Z0(this.f24257c);
        }
    }

    public void c() throws IOException {
        a aVar = this.f24262h;
        if (aVar.Q) {
            throw new IOException("stream closed");
        } else if (aVar.R) {
            throw new IOException("stream finished");
        } else if (this.f24265k != null) {
            Throwable th2 = this.f24266l;
            if (th2 == null) {
                th2 = new n(this.f24265k);
            }
            throw th2;
        }
    }

    public void d(b bVar, @Nullable IOException iOException) throws IOException {
        if (e(bVar, iOException)) {
            this.f24258d.P1(this.f24257c, bVar);
        }
    }

    public final boolean e(b bVar, @Nullable IOException iOException) {
        synchronized (this) {
            if (this.f24265k != null) {
                return false;
            }
            if (this.f24261g.T && this.f24262h.R) {
                return false;
            }
            this.f24265k = bVar;
            this.f24266l = iOException;
            notifyAll();
            this.f24258d.Z0(this.f24257c);
            return true;
        }
    }

    public void f(b bVar) {
        if (e(bVar, (IOException) null)) {
            this.f24258d.Q1(this.f24257c, bVar);
        }
    }

    public void g(b0 b0Var) {
        synchronized (this) {
            if (this.f24262h.R) {
                throw new IllegalStateException("already finished");
            } else if (b0Var.m() != 0) {
                b0 unused = this.f24262h.P = b0Var;
            } else {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
        }
    }

    public f h() {
        return this.f24258d;
    }

    public synchronized b i() {
        return this.f24265k;
    }

    public int j() {
        return this.f24257c;
    }

    public z k() {
        synchronized (this) {
            if (!this.f24260f) {
                if (!m()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f24262h;
    }

    public a0 l() {
        return this.f24261g;
    }

    public boolean m() {
        return this.f24258d.O == ((this.f24257c & 1) == 1);
    }

    public synchronized boolean n() {
        if (this.f24265k != null) {
            return false;
        }
        b bVar = this.f24261g;
        if (bVar.T || bVar.S) {
            a aVar = this.f24262h;
            if ((aVar.R || aVar.Q) && this.f24260f) {
                return false;
            }
        }
        return true;
    }

    public ch.b0 o() {
        return this.f24263i;
    }

    public void p(e eVar, int i10) throws IOException {
        this.f24261g.i(eVar, (long) i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(og.b0 r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f24260f     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            wg.i$b r0 = r2.f24261g     // Catch:{ all -> 0x002e }
            og.b0 unused = r0.R = r3     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x000f:
            r2.f24260f = r1     // Catch:{ all -> 0x002e }
            java.util.Deque<og.b0> r0 = r2.f24259e     // Catch:{ all -> 0x002e }
            r0.add(r3)     // Catch:{ all -> 0x002e }
        L_0x0016:
            if (r4 == 0) goto L_0x001c
            wg.i$b r3 = r2.f24261g     // Catch:{ all -> 0x002e }
            r3.T = r1     // Catch:{ all -> 0x002e }
        L_0x001c:
            boolean r3 = r2.n()     // Catch:{ all -> 0x002e }
            r2.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002d
            wg.f r3 = r2.f24258d
            int r4 = r2.f24257c
            r3.Z0(r4)
        L_0x002d:
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.i.q(og.b0, boolean):void");
    }

    public synchronized void r(b bVar) {
        if (this.f24265k == null) {
            this.f24265k = bVar;
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r2.f24263i.x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized og.b0 s() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            wg.i$c r0 = r2.f24263i     // Catch:{ all -> 0x0041 }
            r0.n()     // Catch:{ all -> 0x0041 }
        L_0x0006:
            java.util.Deque<og.b0> r0 = r2.f24259e     // Catch:{ all -> 0x003a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0016
            wg.b r0 = r2.f24265k     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0016
            r2.u()     // Catch:{ all -> 0x003a }
            goto L_0x0006
        L_0x0016:
            wg.i$c r0 = r2.f24263i     // Catch:{ all -> 0x0041 }
            r0.x()     // Catch:{ all -> 0x0041 }
            java.util.Deque<og.b0> r0 = r2.f24259e     // Catch:{ all -> 0x0041 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<og.b0> r0 = r2.f24259e     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x0041 }
            og.b0 r0 = (og.b0) r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r2)
            return r0
        L_0x002d:
            java.io.IOException r0 = r2.f24266l     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0032
            goto L_0x0039
        L_0x0032:
            wg.n r0 = new wg.n     // Catch:{ all -> 0x0041 }
            wg.b r1 = r2.f24265k     // Catch:{ all -> 0x0041 }
            r0.<init>(r1)     // Catch:{ all -> 0x0041 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x003a:
            r0 = move-exception
            wg.i$c r1 = r2.f24263i     // Catch:{ all -> 0x0041 }
            r1.x()     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.i.s():og.b0");
    }

    public synchronized b0 t() throws IOException {
        if (this.f24265k != null) {
            Throwable th2 = this.f24266l;
            if (th2 == null) {
                th2 = new n(this.f24265k);
            }
            throw th2;
        }
        b bVar = this.f24261g;
        if (!bVar.T || !bVar.O.X() || !this.f24261g.P.X()) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return this.f24261g.R != null ? this.f24261g.R : pg.e.f22067c;
    }

    public void u() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public void v(List<c> list, boolean z10, boolean z11) throws IOException {
        if (list != null) {
            synchronized (this) {
                this.f24260f = true;
                if (z10) {
                    this.f24262h.R = true;
                }
            }
            if (!z11) {
                synchronized (this.f24258d) {
                    z11 = this.f24258d.f24222g0 == 0;
                }
            }
            this.f24258d.F1(this.f24257c, z10, list);
            if (z11) {
                this.f24258d.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public ch.b0 w() {
        return this.f24264j;
    }
}
