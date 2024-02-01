package tg;

import bh.b;
import ch.a0;
import ch.h;
import ch.i;
import ch.p;
import ch.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import javax.annotation.Nullable;
import og.b0;
import og.g;
import og.j0;
import og.l0;
import og.m0;
import og.x;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final k f23226a;

    /* renamed from: b  reason: collision with root package name */
    public final g f23227b;

    /* renamed from: c  reason: collision with root package name */
    public final x f23228c;

    /* renamed from: d  reason: collision with root package name */
    public final d f23229d;

    /* renamed from: e  reason: collision with root package name */
    public final ug.c f23230e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23231f;

    public final class a extends h {
        public boolean P;
        public long Q;
        public long R;
        public boolean S;

        public a(z zVar, long j10) {
            super(zVar);
            this.Q = j10;
        }

        public void close() throws IOException {
            if (!this.S) {
                this.S = true;
                long j10 = this.Q;
                if (j10 == -1 || this.R == j10) {
                    try {
                        super.close();
                        f((IOException) null);
                    } catch (IOException e10) {
                        throw f(e10);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void d1(ch.c cVar, long j10) throws IOException {
            if (!this.S) {
                long j11 = this.Q;
                if (j11 == -1 || this.R + j10 <= j11) {
                    try {
                        super.d1(cVar, j10);
                        this.R += j10;
                    } catch (IOException e10) {
                        throw f(e10);
                    }
                } else {
                    throw new ProtocolException("expected " + this.Q + " bytes but received " + (this.R + j10));
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        @Nullable
        public final IOException f(@Nullable IOException iOException) {
            if (this.P) {
                return iOException;
            }
            this.P = true;
            return c.this.a(this.R, false, true, iOException);
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw f(e10);
            }
        }
    }

    public final class b extends i {
        public final long P;
        public long Q;
        public boolean R;
        public boolean S;

        public b(a0 a0Var, long j10) {
            super(a0Var);
            this.P = j10;
            if (j10 == 0) {
                f((IOException) null);
            }
        }

        public long C0(ch.c cVar, long j10) throws IOException {
            if (!this.S) {
                try {
                    long C0 = c().C0(cVar, j10);
                    if (C0 == -1) {
                        f((IOException) null);
                        return -1;
                    }
                    long j11 = this.Q + C0;
                    long j12 = this.P;
                    if (j12 != -1) {
                        if (j11 > j12) {
                            throw new ProtocolException("expected " + this.P + " bytes but received " + j11);
                        }
                    }
                    this.Q = j11;
                    if (j11 == j12) {
                        f((IOException) null);
                    }
                    return C0;
                } catch (IOException e10) {
                    throw f(e10);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.S) {
                this.S = true;
                try {
                    super.close();
                    f((IOException) null);
                } catch (IOException e10) {
                    throw f(e10);
                }
            }
        }

        @Nullable
        public IOException f(@Nullable IOException iOException) {
            if (this.R) {
                return iOException;
            }
            this.R = true;
            return c.this.a(this.Q, true, false, iOException);
        }
    }

    public c(k kVar, g gVar, x xVar, d dVar, ug.c cVar) {
        this.f23226a = kVar;
        this.f23227b = gVar;
        this.f23228c = xVar;
        this.f23229d = dVar;
        this.f23230e = cVar;
    }

    @Nullable
    public IOException a(long j10, boolean z10, boolean z11, @Nullable IOException iOException) {
        if (iOException != null) {
            q(iOException);
        }
        if (z11) {
            x xVar = this.f23228c;
            g gVar = this.f23227b;
            if (iOException != null) {
                xVar.p(gVar, iOException);
            } else {
                xVar.n(gVar, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f23228c.u(this.f23227b, iOException);
            } else {
                this.f23228c.s(this.f23227b, j10);
            }
        }
        return this.f23226a.g(this, z11, z10, iOException);
    }

    public void b() {
        this.f23230e.cancel();
    }

    public e c() {
        return this.f23230e.a();
    }

    public z d(j0 j0Var, boolean z10) throws IOException {
        this.f23231f = z10;
        long a10 = j0Var.a().a();
        this.f23228c.o(this.f23227b);
        return new a(this.f23230e.e(j0Var, a10), a10);
    }

    public void e() {
        this.f23230e.cancel();
        this.f23226a.g(this, true, true, (IOException) null);
    }

    public void f() throws IOException {
        try {
            this.f23230e.b();
        } catch (IOException e10) {
            this.f23228c.p(this.f23227b, e10);
            q(e10);
            throw e10;
        }
    }

    public void g() throws IOException {
        try {
            this.f23230e.g();
        } catch (IOException e10) {
            this.f23228c.p(this.f23227b, e10);
            q(e10);
            throw e10;
        }
    }

    public boolean h() {
        return this.f23231f;
    }

    public b.f i() throws SocketException {
        this.f23226a.p();
        return this.f23230e.a().s(this);
    }

    public void j() {
        this.f23230e.a().t();
    }

    public void k() {
        this.f23226a.g(this, true, false, (IOException) null);
    }

    public m0 l(l0 l0Var) throws IOException {
        try {
            this.f23228c.t(this.f23227b);
            String l10 = l0Var.l(hh.c.f19573f);
            long c10 = this.f23230e.c(l0Var);
            return new ug.h(l10, c10, p.d(new b(this.f23230e.d(l0Var), c10)));
        } catch (IOException e10) {
            this.f23228c.u(this.f23227b, e10);
            q(e10);
            throw e10;
        }
    }

    @Nullable
    public l0.a m(boolean z10) throws IOException {
        try {
            l0.a f10 = this.f23230e.f(z10);
            if (f10 != null) {
                pg.a.f22062a.g(f10, this);
            }
            return f10;
        } catch (IOException e10) {
            this.f23228c.u(this.f23227b, e10);
            q(e10);
            throw e10;
        }
    }

    public void n(l0 l0Var) {
        this.f23228c.v(this.f23227b, l0Var);
    }

    public void o() {
        this.f23228c.w(this.f23227b);
    }

    public void p() {
        this.f23226a.p();
    }

    public void q(IOException iOException) {
        this.f23229d.h();
        this.f23230e.a().y(iOException);
    }

    public b0 r() throws IOException {
        return this.f23230e.i();
    }

    public void s() {
        a(-1, true, true, (IOException) null);
    }

    public void t(j0 j0Var) throws IOException {
        try {
            this.f23228c.r(this.f23227b);
            this.f23230e.h(j0Var);
            this.f23228c.q(this.f23227b, j0Var);
        } catch (IOException e10) {
            this.f23228c.p(this.f23227b, e10);
            q(e10);
            throw e10;
        }
    }
}
