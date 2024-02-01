package ug;

import ch.l;
import hh.c;
import java.io.IOException;
import java.util.List;
import og.d0;
import og.e0;
import og.j0;
import og.k0;
import og.l0;
import og.p;
import og.q;
import pg.e;
import pg.f;
import t2.z;

public final class a implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final q f23371a;

    public a(q qVar) {
        this.f23371a = qVar;
    }

    public l0 a(d0.a aVar) throws IOException {
        j0 c10 = aVar.c();
        j0.a h10 = c10.h();
        k0 a10 = c10.a();
        if (a10 != null) {
            e0 b10 = a10.b();
            if (b10 != null) {
                h10.h(c.f19573f, b10.toString());
            }
            long a11 = a10.a();
            if (a11 != -1) {
                h10.h("Content-Length", Long.toString(a11));
                h10.n("Transfer-Encoding");
            } else {
                h10.h("Transfer-Encoding", "chunked");
                h10.n("Content-Length");
            }
        }
        boolean z10 = false;
        if (c10.c("Host") == null) {
            h10.h("Host", e.t(c10.k(), false));
        }
        if (c10.c("Connection") == null) {
            h10.h("Connection", "Keep-Alive");
        }
        if (c10.c("Accept-Encoding") == null && c10.c(z.f12901f) == null) {
            z10 = true;
            h10.h("Accept-Encoding", "gzip");
        }
        List<p> a12 = this.f23371a.a(c10.k());
        if (!a12.isEmpty()) {
            h10.h("Cookie", b(a12));
        }
        if (c10.c("User-Agent") == null) {
            h10.h("User-Agent", f.a());
        }
        l0 h11 = aVar.h(h10.b());
        e.k(this.f23371a, c10.k(), h11.q());
        l0.a r10 = h11.P().r(c10);
        if (z10 && "gzip".equalsIgnoreCase(h11.l(c.f19570c)) && e.c(h11)) {
            l lVar = new l(h11.c().w());
            r10.j(h11.q().j().k(c.f19570c).k("Content-Length").i());
            r10.b(new h(h11.l(c.f19573f), -1, ch.p.d(lVar)));
        }
        return r10.c();
    }

    public final String b(List<p> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append("; ");
            }
            p pVar = list.get(i10);
            sb2.append(pVar.h());
            sb2.append('=');
            sb2.append(pVar.t());
        }
        return sb2.toString();
    }
}
