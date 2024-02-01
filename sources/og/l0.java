package og;

import ch.e;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import og.b0;
import tg.c;

public final class l0 implements Closeable {
    public final j0 O;
    public final h0 P;
    public final int Q;
    public final String R;
    @Nullable
    public final z S;
    public final b0 T;
    @Nullable
    public final m0 U;
    @Nullable
    public final l0 V;
    @Nullable
    public final l0 W;
    @Nullable
    public final l0 X;
    public final long Y;
    public final long Z;
    @Nullable

    /* renamed from: a0  reason: collision with root package name */
    public final c f21712a0;
    @Nullable

    /* renamed from: b0  reason: collision with root package name */
    public volatile f f21713b0;

    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public j0 f21714a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public h0 f21715b;

        /* renamed from: c  reason: collision with root package name */
        public int f21716c;

        /* renamed from: d  reason: collision with root package name */
        public String f21717d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public z f21718e;

        /* renamed from: f  reason: collision with root package name */
        public b0.a f21719f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public m0 f21720g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public l0 f21721h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        public l0 f21722i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public l0 f21723j;

        /* renamed from: k  reason: collision with root package name */
        public long f21724k;

        /* renamed from: l  reason: collision with root package name */
        public long f21725l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public c f21726m;

        public a() {
            this.f21716c = -1;
            this.f21719f = new b0.a();
        }

        public a(l0 l0Var) {
            this.f21716c = -1;
            this.f21714a = l0Var.O;
            this.f21715b = l0Var.P;
            this.f21716c = l0Var.Q;
            this.f21717d = l0Var.R;
            this.f21718e = l0Var.S;
            this.f21719f = l0Var.T.j();
            this.f21720g = l0Var.U;
            this.f21721h = l0Var.V;
            this.f21722i = l0Var.W;
            this.f21723j = l0Var.X;
            this.f21724k = l0Var.Y;
            this.f21725l = l0Var.Z;
            this.f21726m = l0Var.f21712a0;
        }

        public a a(String str, String str2) {
            this.f21719f.b(str, str2);
            return this;
        }

        public a b(@Nullable m0 m0Var) {
            this.f21720g = m0Var;
            return this;
        }

        public l0 c() {
            if (this.f21714a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f21715b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f21716c < 0) {
                throw new IllegalStateException("code < 0: " + this.f21716c);
            } else if (this.f21717d != null) {
                return new l0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public a d(@Nullable l0 l0Var) {
            if (l0Var != null) {
                f("cacheResponse", l0Var);
            }
            this.f21722i = l0Var;
            return this;
        }

        public final void e(l0 l0Var) {
            if (l0Var.U != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final void f(String str, l0 l0Var) {
            if (l0Var.U != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (l0Var.V != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (l0Var.W != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (l0Var.X != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public a g(int i10) {
            this.f21716c = i10;
            return this;
        }

        public a h(@Nullable z zVar) {
            this.f21718e = zVar;
            return this;
        }

        public a i(String str, String str2) {
            this.f21719f.l(str, str2);
            return this;
        }

        public a j(b0 b0Var) {
            this.f21719f = b0Var.j();
            return this;
        }

        public void k(c cVar) {
            this.f21726m = cVar;
        }

        public a l(String str) {
            this.f21717d = str;
            return this;
        }

        public a m(@Nullable l0 l0Var) {
            if (l0Var != null) {
                f("networkResponse", l0Var);
            }
            this.f21721h = l0Var;
            return this;
        }

        public a n(@Nullable l0 l0Var) {
            if (l0Var != null) {
                e(l0Var);
            }
            this.f21723j = l0Var;
            return this;
        }

        public a o(h0 h0Var) {
            this.f21715b = h0Var;
            return this;
        }

        public a p(long j10) {
            this.f21725l = j10;
            return this;
        }

        public a q(String str) {
            this.f21719f.k(str);
            return this;
        }

        public a r(j0 j0Var) {
            this.f21714a = j0Var;
            return this;
        }

        public a s(long j10) {
            this.f21724k = j10;
            return this;
        }
    }

    public l0(a aVar) {
        this.O = aVar.f21714a;
        this.P = aVar.f21715b;
        this.Q = aVar.f21716c;
        this.R = aVar.f21717d;
        this.S = aVar.f21718e;
        this.T = aVar.f21719f.i();
        this.U = aVar.f21720g;
        this.V = aVar.f21721h;
        this.W = aVar.f21722i;
        this.X = aVar.f21723j;
        this.Y = aVar.f21724k;
        this.Z = aVar.f21725l;
        this.f21712a0 = aVar.f21726m;
    }

    public String A() {
        return this.R;
    }

    @Nullable
    public l0 N() {
        return this.V;
    }

    public a P() {
        return new a(this);
    }

    public m0 Q(long j10) throws IOException {
        e peek = this.U.w().peek();
        ch.c cVar = new ch.c();
        peek.U0(j10);
        cVar.t0(peek, Math.min(j10, peek.V().size()));
        return m0.m(this.U.l(), cVar.size(), cVar);
    }

    @Nullable
    public l0 Y() {
        return this.X;
    }

    public h0 a0() {
        return this.P;
    }

    @Nullable
    public m0 c() {
        return this.U;
    }

    public long c0() {
        return this.Z;
    }

    public void close() {
        m0 m0Var = this.U;
        if (m0Var != null) {
            m0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public j0 e0() {
        return this.O;
    }

    public f f() {
        f fVar = this.f21713b0;
        if (fVar != null) {
            return fVar;
        }
        f m10 = f.m(this.T);
        this.f21713b0 = m10;
        return m10;
    }

    @Nullable
    public l0 g() {
        return this.W;
    }

    public List<j> h() {
        String str;
        int i10 = this.Q;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return ug.e.g(q(), str);
    }

    public int i() {
        return this.Q;
    }

    @Nullable
    public z k() {
        return this.S;
    }

    public long k0() {
        return this.Y;
    }

    @Nullable
    public String l(String str) {
        return m(str, (String) null);
    }

    @Nullable
    public String m(String str, @Nullable String str2) {
        String d10 = this.T.d(str);
        return d10 != null ? d10 : str2;
    }

    public b0 m0() throws IOException {
        c cVar = this.f21712a0;
        if (cVar != null) {
            return cVar.r();
        }
        throw new IllegalStateException("trailers not available");
    }

    public List<String> o(String str) {
        return this.T.p(str);
    }

    public b0 q() {
        return this.T;
    }

    public boolean t() {
        int i10 = this.Q;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case dg.a.lm:
            case dg.a.nm:
                return true;
            default:
                return false;
        }
    }

    public String toString() {
        return "Response{protocol=" + this.P + ", code=" + this.Q + ", message=" + this.R + ", url=" + this.O.k() + '}';
    }

    public boolean w() {
        int i10 = this.Q;
        return i10 >= 200 && i10 < 300;
    }
}
