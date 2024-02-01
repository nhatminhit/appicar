package rg;

import ch.a0;
import ch.b0;
import ch.c;
import ch.d;
import ch.e;
import ch.p;
import ch.z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import og.b0;
import og.d0;
import og.h0;
import og.j0;
import og.l0;
import og.m0;
import rg.c;
import ug.f;
import ug.h;

public final class a implements d0 {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final f f22550a;

    /* renamed from: rg.a$a  reason: collision with other inner class name */
    public class C0412a implements a0 {
        public boolean O;
        public final /* synthetic */ e P;
        public final /* synthetic */ b Q;
        public final /* synthetic */ d R;

        public C0412a(e eVar, b bVar, d dVar) {
            this.P = eVar;
            this.Q = bVar;
            this.R = dVar;
        }

        public long C0(c cVar, long j10) throws IOException {
            try {
                long C0 = this.P.C0(cVar, j10);
                if (C0 == -1) {
                    if (!this.O) {
                        this.O = true;
                        this.R.close();
                    }
                    return -1;
                }
                cVar.m(this.R.j(), cVar.size() - C0, C0);
                this.R.i0();
                return C0;
            } catch (IOException e10) {
                if (!this.O) {
                    this.O = true;
                    this.Q.abort();
                }
                throw e10;
            }
        }

        public b0 b() {
            return this.P.b();
        }

        public void close() throws IOException {
            if (!this.O && !pg.e.q(this, 100, TimeUnit.MILLISECONDS)) {
                this.O = true;
                this.Q.abort();
            }
            this.P.close();
        }
    }

    public a(@Nullable f fVar) {
        this.f22550a = fVar;
    }

    public static og.b0 c(og.b0 b0Var, og.b0 b0Var2) {
        b0.a aVar = new b0.a();
        int m10 = b0Var.m();
        for (int i10 = 0; i10 < m10; i10++) {
            String h10 = b0Var.h(i10);
            String o10 = b0Var.o(i10);
            if ((!"Warning".equalsIgnoreCase(h10) || !o10.startsWith("1")) && (d(h10) || !e(h10) || b0Var2.d(h10) == null)) {
                pg.a.f22062a.b(aVar, h10, o10);
            }
        }
        int m11 = b0Var2.m();
        for (int i11 = 0; i11 < m11; i11++) {
            String h11 = b0Var2.h(i11);
            if (!d(h11) && e(h11)) {
                pg.a.f22062a.b(aVar, h11, b0Var2.o(i11));
            }
        }
        return aVar.i();
    }

    public static boolean d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || hh.c.f19570c.equalsIgnoreCase(str) || hh.c.f19573f.equalsIgnoreCase(str);
    }

    public static boolean e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static l0 f(l0 l0Var) {
        return (l0Var == null || l0Var.c() == null) ? l0Var : l0Var.P().b((m0) null).c();
    }

    public l0 a(d0.a aVar) throws IOException {
        f fVar = this.f22550a;
        l0 b10 = fVar != null ? fVar.b(aVar.c()) : null;
        c c10 = new c.a(System.currentTimeMillis(), aVar.c(), b10).c();
        j0 j0Var = c10.f22551a;
        l0 l0Var = c10.f22552b;
        f fVar2 = this.f22550a;
        if (fVar2 != null) {
            fVar2.d(c10);
        }
        if (b10 != null && l0Var == null) {
            pg.e.g(b10.c());
        }
        if (j0Var == null && l0Var == null) {
            return new l0.a().r(aVar.c()).o(h0.HTTP_1_1).g(dg.a.A0).l("Unsatisfiable Request (only-if-cached)").b(pg.e.f22068d).s(-1).p(System.currentTimeMillis()).c();
        }
        if (j0Var == null) {
            return l0Var.P().d(f(l0Var)).c();
        }
        try {
            l0 h10 = aVar.h(j0Var);
            if (h10 == null && b10 != null) {
            }
            if (l0Var != null) {
                if (h10.i() == 304) {
                    l0 c11 = l0Var.P().j(c(l0Var.q(), h10.q())).s(h10.k0()).p(h10.c0()).d(f(l0Var)).m(f(h10)).c();
                    h10.c().close();
                    this.f22550a.a();
                    this.f22550a.e(l0Var, c11);
                    return c11;
                }
                pg.e.g(l0Var.c());
            }
            l0 c12 = h10.P().d(f(l0Var)).m(f(h10)).c();
            if (this.f22550a != null) {
                if (ug.e.c(c12) && c.a(c12, j0Var)) {
                    return b(this.f22550a.f(c12), c12);
                }
                if (f.a(j0Var.g())) {
                    try {
                        this.f22550a.c(j0Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return c12;
        } finally {
            if (b10 != null) {
                pg.e.g(b10.c());
            }
        }
    }

    public final l0 b(b bVar, l0 l0Var) throws IOException {
        z e10;
        if (bVar == null || (e10 = bVar.e()) == null) {
            return l0Var;
        }
        C0412a aVar = new C0412a(l0Var.c().w(), bVar, p.c(e10));
        return l0Var.P().b(new h(l0Var.l(hh.c.f19573f), l0Var.c().k(), p.d(aVar))).c();
    }
}
