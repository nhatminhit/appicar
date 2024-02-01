package t7;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import d.o0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import w7.k0;
import w7.p;
import w7.q0;

public final class h0 implements i0 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f13078d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f13079e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f13080f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f13081g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final c f13082h = h(false, b6.c.f4201b);

    /* renamed from: i  reason: collision with root package name */
    public static final c f13083i = h(true, b6.c.f4201b);

    /* renamed from: j  reason: collision with root package name */
    public static final c f13084j = new c(2, b6.c.f4201b);

    /* renamed from: k  reason: collision with root package name */
    public static final c f13085k = new c(3, b6.c.f4201b);

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f13086a;

    /* renamed from: b  reason: collision with root package name */
    public d<? extends e> f13087b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f13088c;

    public interface b<T extends e> {
        void g(T t10, long j10, long j11);

        c j(T t10, long j10, long j11, IOException iOException, int i10);

        void k(T t10, long j10, long j11, boolean z10);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f13089a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13090b;

        public c(int i10, long j10) {
            this.f13089a = i10;
            this.f13090b = j10;
        }

        public boolean c() {
            int i10 = this.f13089a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {
        public static final String Y = "LoadTask";
        public static final int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public static final int f13091a0 = 1;

        /* renamed from: b0  reason: collision with root package name */
        public static final int f13092b0 = 2;

        /* renamed from: c0  reason: collision with root package name */
        public static final int f13093c0 = 3;

        /* renamed from: d0  reason: collision with root package name */
        public static final int f13094d0 = 4;
        public final int O;
        public final T P;
        public final long Q;
        @o0
        public b<T> R;
        public IOException S;
        public int T;
        public volatile Thread U;
        public volatile boolean V;
        public volatile boolean W;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.P = t10;
            this.R = bVar;
            this.O = i10;
            this.Q = j10;
        }

        public void a(boolean z10) {
            this.W = z10;
            this.S = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                this.V = true;
                this.P.c();
                if (this.U != null) {
                    this.U.interrupt();
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.R.k(this.P, elapsedRealtime, elapsedRealtime - this.Q, true);
                this.R = null;
            }
        }

        public final void b() {
            this.S = null;
            h0.this.f13086a.execute(h0.this.f13087b);
        }

        public final void c() {
            d unused = h0.this.f13087b = null;
        }

        public final long d() {
            return (long) Math.min((this.T - 1) * 1000, 5000);
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.S;
            if (iOException != null && this.T > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            w7.a.i(h0.this.f13087b == null);
            d unused = h0.this.f13087b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        public void handleMessage(Message message) {
            if (!this.W) {
                int i10 = message.what;
                if (i10 == 0) {
                    b();
                } else if (i10 != 4) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = elapsedRealtime - this.Q;
                    if (this.V) {
                        this.R.k(this.P, elapsedRealtime, j10, false);
                        return;
                    }
                    int i11 = message.what;
                    if (i11 == 1) {
                        this.R.k(this.P, elapsedRealtime, j10, false);
                    } else if (i11 == 2) {
                        try {
                            this.R.g(this.P, elapsedRealtime, j10);
                        } catch (RuntimeException e10) {
                            p.e(Y, "Unexpected exception handling load completed", e10);
                            IOException unused = h0.this.f13088c = new h(e10);
                        }
                    } else if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.S = iOException;
                        int i12 = this.T + 1;
                        this.T = i12;
                        c j11 = this.R.j(this.P, elapsedRealtime, j10, iOException, i12);
                        if (j11.f13089a == 3) {
                            IOException unused2 = h0.this.f13088c = this.S;
                        } else if (j11.f13089a != 2) {
                            if (j11.f13089a == 1) {
                                this.T = 1;
                            }
                            f(j11.f13090b != b6.c.f4201b ? j11.f13090b : d());
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            try {
                this.U = Thread.currentThread();
                if (!this.V) {
                    k0.a("load:" + this.P.getClass().getSimpleName());
                    this.P.b();
                    k0.c();
                }
                if (!this.W) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e10) {
                e = e10;
                if (this.W) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (InterruptedException unused) {
                w7.a.i(this.V);
                if (!this.W) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e11) {
                p.e(Y, "Unexpected exception loading stream", e11);
                if (!this.W) {
                    e = new h(e11);
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (OutOfMemoryError e12) {
                p.e(Y, "OutOfMemory error loading stream", e12);
                if (!this.W) {
                    e = new h(e12);
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (Error e13) {
                p.e(Y, "Unexpected error loading stream", e13);
                if (!this.W) {
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            } catch (Throwable th2) {
                k0.c();
                throw th2;
            }
        }
    }

    public interface e {
        void b() throws IOException, InterruptedException;

        void c();
    }

    public interface f {
        void i();
    }

    public static final class g implements Runnable {
        public final f O;

        public g(f fVar) {
            this.O = fVar;
        }

        public void run() {
            this.O.i();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public h0(String str) {
        this.f13086a = q0.A0(str);
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void a() throws IOException {
        b(Integer.MIN_VALUE);
    }

    public void b(int i10) throws IOException {
        IOException iOException = this.f13088c;
        if (iOException == null) {
            d<? extends e> dVar = this.f13087b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.O;
                }
                dVar.e(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void g() {
        this.f13087b.a(false);
    }

    public boolean i() {
        return this.f13087b != null;
    }

    public void j() {
        k((f) null);
    }

    public void k(@o0 f fVar) {
        d<? extends e> dVar = this.f13087b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f13086a.execute(new g(fVar));
        }
        this.f13086a.shutdown();
    }

    public <T extends e> long l(T t10, b<T> bVar, int i10) {
        Looper myLooper = Looper.myLooper();
        w7.a.i(myLooper != null);
        this.f13088c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(myLooper, t10, bVar, i10, elapsedRealtime).f(0);
        return elapsedRealtime;
    }
}
