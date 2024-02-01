package rh;

import ch.a0;
import ch.b0;
import ch.e;
import ch.i;
import ch.p;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import og.e0;
import og.g;
import og.h;
import og.j0;
import og.l0;
import og.m0;

public final class n<T> implements b<T> {
    public final t O;
    public final Object[] P;
    public final g.a Q;
    public final f<m0, T> R;
    public volatile boolean S;
    @GuardedBy("this")
    @Nullable
    public g T;
    @GuardedBy("this")
    @Nullable
    public Throwable U;
    @GuardedBy("this")
    public boolean V;

    public class a implements h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f22629a;

        public a(d dVar) {
            this.f22629a = dVar;
        }

        public void a(g gVar, l0 l0Var) {
            try {
                try {
                    this.f22629a.a(n.this, n.this.i(l0Var));
                } catch (Throwable th2) {
                    z.s(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                z.s(th3);
                c(th3);
            }
        }

        public void b(g gVar, IOException iOException) {
            c(iOException);
        }

        public final void c(Throwable th2) {
            try {
                this.f22629a.b(n.this, th2);
            } catch (Throwable th3) {
                z.s(th3);
                th3.printStackTrace();
            }
        }
    }

    public static final class b extends m0 {
        public final m0 P;
        public final e Q;
        @Nullable
        public IOException R;

        public class a extends i {
            public a(a0 a0Var) {
                super(a0Var);
            }

            public long C0(ch.c cVar, long j10) throws IOException {
                try {
                    return super.C0(cVar, j10);
                } catch (IOException e10) {
                    b.this.R = e10;
                    throw e10;
                }
            }
        }

        public b(m0 m0Var) {
            this.P = m0Var;
            this.Q = p.d(new a(m0Var.w()));
        }

        public void N() throws IOException {
            IOException iOException = this.R;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void close() {
            this.P.close();
        }

        public long k() {
            return this.P.k();
        }

        public e0 l() {
            return this.P.l();
        }

        public e w() {
            return this.Q;
        }
    }

    public static final class c extends m0 {
        @Nullable
        public final e0 P;
        public final long Q;

        public c(@Nullable e0 e0Var, long j10) {
            this.P = e0Var;
            this.Q = j10;
        }

        public long k() {
            return this.Q;
        }

        public e0 l() {
            return this.P;
        }

        public e w() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public n(t tVar, Object[] objArr, g.a aVar, f<m0, T> fVar) {
        this.O = tVar;
        this.P = objArr;
        this.Q = aVar;
        this.R = fVar;
    }

    /* renamed from: a */
    public n<T> clone() {
        return new n<>(this.O, this.P, this.Q, this.R);
    }

    public synchronized b0 b() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create call.", e10);
        }
        return g().b();
    }

    public synchronized j0 c() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return g().c();
    }

    public void cancel() {
        g gVar;
        this.S = true;
        synchronized (this) {
            gVar = this.T;
        }
        if (gVar != null) {
            gVar.cancel();
        }
    }

    public final g d() throws IOException {
        g a10 = this.Q.a(this.O.a(this.P));
        if (a10 != null) {
            return a10;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public u<T> e() throws IOException {
        g g10;
        synchronized (this) {
            if (!this.V) {
                this.V = true;
                g10 = g();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.S) {
            g10.cancel();
        }
        return i(g10.e());
    }

    public synchronized boolean f() {
        return this.V;
    }

    @GuardedBy("this")
    public final g g() throws IOException {
        g gVar = this.T;
        if (gVar != null) {
            return gVar;
        }
        Throwable th2 = this.U;
        if (th2 == null) {
            try {
                g d10 = d();
                this.T = d10;
                return d10;
            } catch (IOException | Error | RuntimeException e10) {
                z.s(e10);
                this.U = e10;
                throw e10;
            }
        } else if (th2 instanceof IOException) {
            throw ((IOException) th2);
        } else if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        } else {
            throw ((Error) th2);
        }
    }

    public boolean h() {
        boolean z10 = true;
        if (this.S) {
            return true;
        }
        synchronized (this) {
            g gVar = this.T;
            if (gVar == null || !gVar.h()) {
                z10 = false;
            }
        }
        return z10;
    }

    public u<T> i(l0 l0Var) throws IOException {
        m0 c10 = l0Var.c();
        l0 c11 = l0Var.P().b(new c(c10.l(), c10.k())).c();
        int i10 = c11.i();
        if (i10 < 200 || i10 >= 300) {
            try {
                return u.d(z.a(c10), c11);
            } finally {
                c10.close();
            }
        } else if (i10 == 204 || i10 == 205) {
            c10.close();
            return u.m(null, c11);
        } else {
            b bVar = new b(c10);
            try {
                return u.m(this.R.a(bVar), c11);
            } catch (RuntimeException e10) {
                bVar.N();
                throw e10;
            }
        }
    }

    public void l(d<T> dVar) {
        g gVar;
        Throwable th2;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            if (!this.V) {
                this.V = true;
                gVar = this.T;
                th2 = this.U;
                if (gVar == null && th2 == null) {
                    try {
                        g d10 = d();
                        this.T = d10;
                        gVar = d10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        z.s(th2);
                        this.U = th2;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th2 != null) {
            dVar.b(this, th2);
            return;
        }
        if (this.S) {
            gVar.cancel();
        }
        gVar.o(new a(dVar));
    }
}
