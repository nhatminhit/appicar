package vg;

import ch.a0;
import ch.j;
import ch.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import og.b0;
import og.c0;
import og.g0;
import og.j0;
import og.l0;
import ug.i;
import ug.k;

public final class a implements ug.c {

    /* renamed from: i  reason: collision with root package name */
    public static final int f23634i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f23635j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f23636k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f23637l = 3;

    /* renamed from: m  reason: collision with root package name */
    public static final int f23638m = 4;

    /* renamed from: n  reason: collision with root package name */
    public static final int f23639n = 5;

    /* renamed from: o  reason: collision with root package name */
    public static final int f23640o = 6;

    /* renamed from: p  reason: collision with root package name */
    public static final int f23641p = 262144;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f23642b;

    /* renamed from: c  reason: collision with root package name */
    public final tg.e f23643c;

    /* renamed from: d  reason: collision with root package name */
    public final ch.e f23644d;

    /* renamed from: e  reason: collision with root package name */
    public final ch.d f23645e;

    /* renamed from: f  reason: collision with root package name */
    public int f23646f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f23647g = 262144;

    /* renamed from: h  reason: collision with root package name */
    public b0 f23648h;

    public abstract class b implements a0 {
        public final j O;
        public boolean P;

        public b() {
            this.O = new j(a.this.f23644d.b());
        }

        public long C0(ch.c cVar, long j10) throws IOException {
            try {
                return a.this.f23644d.C0(cVar, j10);
            } catch (IOException e10) {
                a.this.f23643c.t();
                c();
                throw e10;
            }
        }

        public ch.b0 b() {
            return this.O;
        }

        public final void c() {
            if (a.this.f23646f != 6) {
                if (a.this.f23646f == 5) {
                    a.this.t(this.O);
                    int unused = a.this.f23646f = 6;
                    return;
                }
                throw new IllegalStateException("state: " + a.this.f23646f);
            }
        }
    }

    public final class c implements z {
        public final j O;
        public boolean P;

        public c() {
            this.O = new j(a.this.f23645e.b());
        }

        public ch.b0 b() {
            return this.O;
        }

        public synchronized void close() throws IOException {
            if (!this.P) {
                this.P = true;
                a.this.f23645e.D0("0\r\n\r\n");
                a.this.t(this.O);
                int unused = a.this.f23646f = 3;
            }
        }

        public void d1(ch.c cVar, long j10) throws IOException {
            if (this.P) {
                throw new IllegalStateException("closed");
            } else if (j10 != 0) {
                a.this.f23645e.P0(j10);
                a.this.f23645e.D0("\r\n");
                a.this.f23645e.d1(cVar, j10);
                a.this.f23645e.D0("\r\n");
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.P) {
                a.this.f23645e.flush();
            }
        }
    }

    public class d extends b {
        public static final long V = -1;
        public final c0 R;
        public long S = -1;
        public boolean T = true;

        public d(c0 c0Var) {
            super();
            this.R = c0Var;
        }

        public long C0(ch.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (this.P) {
                throw new IllegalStateException("closed");
            } else if (!this.T) {
                return -1;
            } else {
                long j11 = this.S;
                if (j11 == 0 || j11 == -1) {
                    f();
                    if (!this.T) {
                        return -1;
                    }
                }
                long C0 = super.C0(cVar, Math.min(j10, this.S));
                if (C0 != -1) {
                    this.S -= C0;
                    return C0;
                }
                a.this.f23643c.t();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            }
        }

        public void close() throws IOException {
            if (!this.P) {
                if (this.T && !pg.e.q(this, 100, TimeUnit.MILLISECONDS)) {
                    a.this.f23643c.t();
                    c();
                }
                this.P = true;
            }
        }

        public final void f() throws IOException {
            if (this.S != -1) {
                a.this.f23644d.b1();
            }
            try {
                this.S = a.this.f23644d.M1();
                String trim = a.this.f23644d.b1().trim();
                if (this.S < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.S + trim + "\"");
                } else if (this.S == 0) {
                    this.T = false;
                    a aVar = a.this;
                    b0 unused = aVar.f23648h = aVar.B();
                    ug.e.k(a.this.f23642b.q(), this.R, a.this.f23648h);
                    c();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }
    }

    public class e extends b {
        public long R;

        public e(long j10) {
            super();
            this.R = j10;
            if (j10 == 0) {
                c();
            }
        }

        public long C0(ch.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (!this.P) {
                long j11 = this.R;
                if (j11 == 0) {
                    return -1;
                }
                long C0 = super.C0(cVar, Math.min(j11, j10));
                if (C0 != -1) {
                    long j12 = this.R - C0;
                    this.R = j12;
                    if (j12 == 0) {
                        c();
                    }
                    return C0;
                }
                a.this.f23643c.t();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.P) {
                if (this.R != 0 && !pg.e.q(this, 100, TimeUnit.MILLISECONDS)) {
                    a.this.f23643c.t();
                    c();
                }
                this.P = true;
            }
        }
    }

    public final class f implements z {
        public final j O;
        public boolean P;

        public f() {
            this.O = new j(a.this.f23645e.b());
        }

        public ch.b0 b() {
            return this.O;
        }

        public void close() throws IOException {
            if (!this.P) {
                this.P = true;
                a.this.t(this.O);
                int unused = a.this.f23646f = 3;
            }
        }

        public void d1(ch.c cVar, long j10) throws IOException {
            if (!this.P) {
                pg.e.f(cVar.size(), 0, j10);
                a.this.f23645e.d1(cVar, j10);
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void flush() throws IOException {
            if (!this.P) {
                a.this.f23645e.flush();
            }
        }
    }

    public class g extends b {
        public boolean R;

        public g() {
            super();
        }

        public long C0(ch.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (this.P) {
                throw new IllegalStateException("closed");
            } else if (this.R) {
                return -1;
            } else {
                long C0 = super.C0(cVar, j10);
                if (C0 != -1) {
                    return C0;
                }
                this.R = true;
                c();
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.P) {
                if (!this.R) {
                    c();
                }
                this.P = true;
            }
        }
    }

    public a(g0 g0Var, tg.e eVar, ch.e eVar2, ch.d dVar) {
        this.f23642b = g0Var;
        this.f23643c = eVar;
        this.f23644d = eVar2;
        this.f23645e = dVar;
    }

    public final String A() throws IOException {
        String o02 = this.f23644d.o0(this.f23647g);
        this.f23647g -= (long) o02.length();
        return o02;
    }

    public final b0 B() throws IOException {
        b0.a aVar = new b0.a();
        while (true) {
            String A = A();
            if (A.length() == 0) {
                return aVar.i();
            }
            pg.a.f22062a.a(aVar, A);
        }
    }

    public void C(l0 l0Var) throws IOException {
        long b10 = ug.e.b(l0Var);
        if (b10 != -1) {
            a0 x10 = x(b10);
            pg.e.G(x10, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            x10.close();
        }
    }

    public void D(b0 b0Var, String str) throws IOException {
        if (this.f23646f == 0) {
            this.f23645e.D0(str).D0("\r\n");
            int m10 = b0Var.m();
            for (int i10 = 0; i10 < m10; i10++) {
                this.f23645e.D0(b0Var.h(i10)).D0(": ").D0(b0Var.o(i10)).D0("\r\n");
            }
            this.f23645e.D0("\r\n");
            this.f23646f = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f23646f);
    }

    public tg.e a() {
        return this.f23643c;
    }

    public void b() throws IOException {
        this.f23645e.flush();
    }

    public long c(l0 l0Var) {
        if (!ug.e.c(l0Var)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(l0Var.l("Transfer-Encoding"))) {
            return -1;
        }
        return ug.e.b(l0Var);
    }

    public void cancel() {
        tg.e eVar = this.f23643c;
        if (eVar != null) {
            eVar.g();
        }
    }

    public a0 d(l0 l0Var) {
        if (!ug.e.c(l0Var)) {
            return x(0);
        }
        if ("chunked".equalsIgnoreCase(l0Var.l("Transfer-Encoding"))) {
            return w(l0Var.e0().k());
        }
        long b10 = ug.e.b(l0Var);
        return b10 != -1 ? x(b10) : z();
    }

    public z e(j0 j0Var, long j10) throws IOException {
        if (j0Var.a() != null && j0Var.a().h()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if ("chunked".equalsIgnoreCase(j0Var.c("Transfer-Encoding"))) {
            return v();
        } else {
            if (j10 != -1) {
                return y();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public l0.a f(boolean z10) throws IOException {
        int i10 = this.f23646f;
        if (i10 == 1 || i10 == 3) {
            try {
                k b10 = k.b(A());
                l0.a j10 = new l0.a().o(b10.f23395a).g(b10.f23396b).l(b10.f23397c).j(B());
                if (z10 && b10.f23396b == 100) {
                    return null;
                }
                if (b10.f23396b == 100) {
                    this.f23646f = 3;
                    return j10;
                }
                this.f23646f = 4;
                return j10;
            } catch (EOFException e10) {
                tg.e eVar = this.f23643c;
                String N = eVar != null ? eVar.b().a().l().N() : x0.e.f15004b;
                throw new IOException("unexpected end of stream on " + N, e10);
            }
        } else {
            throw new IllegalStateException("state: " + this.f23646f);
        }
    }

    public void g() throws IOException {
        this.f23645e.flush();
    }

    public void h(j0 j0Var) throws IOException {
        D(j0Var.e(), i.a(j0Var, this.f23643c.b().b().type()));
    }

    public b0 i() {
        if (this.f23646f == 6) {
            b0 b0Var = this.f23648h;
            return b0Var != null ? b0Var : pg.e.f22067c;
        }
        throw new IllegalStateException("too early; can't read the trailers yet");
    }

    public final void t(j jVar) {
        ch.b0 l10 = jVar.l();
        jVar.m(ch.b0.f16507d);
        l10.a();
        l10.b();
    }

    public boolean u() {
        return this.f23646f == 6;
    }

    public final z v() {
        if (this.f23646f == 1) {
            this.f23646f = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f23646f);
    }

    public final a0 w(c0 c0Var) {
        if (this.f23646f == 4) {
            this.f23646f = 5;
            return new d(c0Var);
        }
        throw new IllegalStateException("state: " + this.f23646f);
    }

    public final a0 x(long j10) {
        if (this.f23646f == 4) {
            this.f23646f = 5;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f23646f);
    }

    public final z y() {
        if (this.f23646f == 1) {
            this.f23646f = 2;
            return new f();
        }
        throw new IllegalStateException("state: " + this.f23646f);
    }

    public final a0 z() {
        if (this.f23646f == 4) {
            this.f23646f = 5;
            this.f23643c.t();
            return new g();
        }
        throw new IllegalStateException("state: " + this.f23646f);
    }
}
