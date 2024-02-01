package sh;

import ha.e;
import ha.l;
import ha.y;
import java.io.IOException;
import og.m0;
import pa.a;
import rh.f;

public final class c<T> implements f<m0, T> {

    /* renamed from: a  reason: collision with root package name */
    public final e f23024a;

    /* renamed from: b  reason: collision with root package name */
    public final y<T> f23025b;

    public c(e eVar, y<T> yVar) {
        this.f23024a = eVar;
        this.f23025b = yVar;
    }

    /* renamed from: b */
    public T a(m0 m0Var) throws IOException {
        a v10 = this.f23024a.v(m0Var.h());
        try {
            T e10 = this.f23025b.e(v10);
            if (v10.z0() == pa.c.END_DOCUMENT) {
                return e10;
            }
            throw new l("JSON document was not fully consumed.");
        } finally {
            m0Var.close();
        }
    }
}
