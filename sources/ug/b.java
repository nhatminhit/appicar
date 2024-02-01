package ug;

import ch.d;
import ch.p;
import java.io.IOException;
import java.net.ProtocolException;
import og.d0;
import og.j0;
import og.l0;
import og.m0;
import pg.e;
import tg.c;

public final class b implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23372a;

    public b(boolean z10) {
        this.f23372a = z10;
    }

    public l0 a(d0.a aVar) throws IOException {
        boolean z10;
        l0.a aVar2;
        m0 m0Var;
        g gVar = (g) aVar;
        c j10 = gVar.j();
        j0 c10 = gVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        j10.t(c10);
        l0.a aVar3 = null;
        if (!f.b(c10.g()) || c10.a() == null) {
            j10.k();
            z10 = false;
        } else {
            if ("100-continue".equalsIgnoreCase(c10.c("Expect"))) {
                j10.g();
                j10.o();
                aVar3 = j10.m(true);
                z10 = true;
            } else {
                z10 = false;
            }
            if (aVar3 != null) {
                j10.k();
                if (!j10.c().q()) {
                    j10.j();
                }
            } else if (c10.a().h()) {
                j10.g();
                c10.a().j(p.c(j10.d(c10, true)));
            } else {
                d c11 = p.c(j10.d(c10, false));
                c10.a().j(c11);
                c11.close();
            }
        }
        if (c10.a() == null || !c10.a().h()) {
            j10.f();
        }
        if (!z10) {
            j10.o();
        }
        if (aVar3 == null) {
            aVar3 = j10.m(false);
        }
        l0 c12 = aVar3.r(c10).h(j10.c().c()).s(currentTimeMillis).p(System.currentTimeMillis()).c();
        int i10 = c12.i();
        if (i10 == 100) {
            c12 = j10.m(false).r(c10).h(j10.c().c()).s(currentTimeMillis).p(System.currentTimeMillis()).c();
            i10 = c12.i();
        }
        j10.n(c12);
        if (!this.f23372a || i10 != 101) {
            aVar2 = c12.P();
            m0Var = j10.l(c12);
        } else {
            aVar2 = c12.P();
            m0Var = e.f22068d;
        }
        l0 c13 = aVar2.b(m0Var).c();
        if ("close".equalsIgnoreCase(c13.e0().c("Connection")) || "close".equalsIgnoreCase(c13.l("Connection"))) {
            j10.j();
        }
        if ((i10 != 204 && i10 != 205) || c13.c().k() <= 0) {
            return c13;
        }
        throw new ProtocolException("HTTP " + i10 + " had non-zero Content-Length: " + c13.c().k());
    }
}
