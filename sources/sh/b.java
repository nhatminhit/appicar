package sh;

import ch.c;
import ha.e;
import ha.y;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import og.e0;
import og.k0;
import pa.d;
import rh.f;

public final class b<T> implements f<T, k0> {

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f23020c = e0.c("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f23021d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final e f23022a;

    /* renamed from: b  reason: collision with root package name */
    public final y<T> f23023b;

    public b(e eVar, y<T> yVar) {
        this.f23022a = eVar;
        this.f23023b = yVar;
    }

    /* renamed from: b */
    public k0 a(T t10) throws IOException {
        c cVar = new c();
        d w10 = this.f23022a.w(new OutputStreamWriter(cVar.J1(), f23021d));
        this.f23023b.i(w10, t10);
        w10.close();
        return k0.c(f23020c, cVar.Q0());
    }
}
