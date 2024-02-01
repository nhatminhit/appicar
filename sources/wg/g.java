package wg;

import ch.a0;
import ch.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import og.b0;
import og.d0;
import og.g0;
import og.h0;
import og.j0;
import og.l0;
import pg.a;
import pg.e;
import ug.c;
import ug.i;
import ug.k;

public final class g implements c {

    /* renamed from: h  reason: collision with root package name */
    public static final String f24238h = "connection";

    /* renamed from: i  reason: collision with root package name */
    public static final String f24239i = "host";

    /* renamed from: j  reason: collision with root package name */
    public static final String f24240j = "keep-alive";

    /* renamed from: k  reason: collision with root package name */
    public static final String f24241k = "proxy-connection";

    /* renamed from: l  reason: collision with root package name */
    public static final String f24242l = "transfer-encoding";

    /* renamed from: m  reason: collision with root package name */
    public static final String f24243m = "te";

    /* renamed from: n  reason: collision with root package name */
    public static final String f24244n = "encoding";

    /* renamed from: o  reason: collision with root package name */
    public static final String f24245o = "upgrade";

    /* renamed from: p  reason: collision with root package name */
    public static final List<String> f24246p = e.v(f24238h, f24239i, f24240j, f24241k, f24243m, f24242l, f24244n, "upgrade", c.f24148f, c.f24149g, c.f24150h, c.f24151i);

    /* renamed from: q  reason: collision with root package name */
    public static final List<String> f24247q = e.v(f24238h, f24239i, f24240j, f24241k, f24243m, f24242l, f24244n, "upgrade");

    /* renamed from: b  reason: collision with root package name */
    public final d0.a f24248b;

    /* renamed from: c  reason: collision with root package name */
    public final tg.e f24249c;

    /* renamed from: d  reason: collision with root package name */
    public final f f24250d;

    /* renamed from: e  reason: collision with root package name */
    public volatile i f24251e;

    /* renamed from: f  reason: collision with root package name */
    public final h0 f24252f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f24253g;

    public g(g0 g0Var, tg.e eVar, d0.a aVar, f fVar) {
        this.f24249c = eVar;
        this.f24248b = aVar;
        this.f24250d = fVar;
        List<h0> D = g0Var.D();
        h0 h0Var = h0.H2_PRIOR_KNOWLEDGE;
        this.f24252f = !D.contains(h0Var) ? h0.HTTP_2 : h0Var;
    }

    public static List<c> j(j0 j0Var) {
        b0 e10 = j0Var.e();
        ArrayList arrayList = new ArrayList(e10.m() + 4);
        arrayList.add(new c(c.f24153k, j0Var.g()));
        arrayList.add(new c(c.f24154l, i.c(j0Var.k())));
        String c10 = j0Var.c("Host");
        if (c10 != null) {
            arrayList.add(new c(c.f24156n, c10));
        }
        arrayList.add(new c(c.f24155m, j0Var.k().P()));
        int m10 = e10.m();
        for (int i10 = 0; i10 < m10; i10++) {
            String lowerCase = e10.h(i10).toLowerCase(Locale.US);
            if (!f24246p.contains(lowerCase) || (lowerCase.equals(f24243m) && e10.o(i10).equals("trailers"))) {
                arrayList.add(new c(lowerCase, e10.o(i10)));
            }
        }
        return arrayList;
    }

    public static l0.a k(b0 b0Var, h0 h0Var) throws IOException {
        b0.a aVar = new b0.a();
        int m10 = b0Var.m();
        k kVar = null;
        for (int i10 = 0; i10 < m10; i10++) {
            String h10 = b0Var.h(i10);
            String o10 = b0Var.o(i10);
            if (h10.equals(c.f24147e)) {
                kVar = k.b("HTTP/1.1 " + o10);
            } else if (!f24247q.contains(h10)) {
                a.f22062a.b(aVar, h10, o10);
            }
        }
        if (kVar != null) {
            return new l0.a().o(h0Var).g(kVar.f23396b).l(kVar.f23397c).j(aVar.i());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public tg.e a() {
        return this.f24249c;
    }

    public void b() throws IOException {
        this.f24251e.k().close();
    }

    public long c(l0 l0Var) {
        return ug.e.b(l0Var);
    }

    public void cancel() {
        this.f24253g = true;
        if (this.f24251e != null) {
            this.f24251e.f(b.CANCEL);
        }
    }

    public a0 d(l0 l0Var) {
        return this.f24251e.l();
    }

    public z e(j0 j0Var, long j10) {
        return this.f24251e.k();
    }

    public l0.a f(boolean z10) throws IOException {
        l0.a k10 = k(this.f24251e.s(), this.f24252f);
        if (!z10 || a.f22062a.d(k10) != 100) {
            return k10;
        }
        return null;
    }

    public void g() throws IOException {
        this.f24250d.flush();
    }

    public void h(j0 j0Var) throws IOException {
        if (this.f24251e == null) {
            this.f24251e = this.f24250d.c0(j(j0Var), j0Var.a() != null);
            if (!this.f24253g) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f24251e.o().i((long) this.f24248b.d(), timeUnit);
                this.f24251e.w().i((long) this.f24248b.e(), timeUnit);
                return;
            }
            this.f24251e.f(b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public b0 i() throws IOException {
        return this.f24251e.t();
    }
}
