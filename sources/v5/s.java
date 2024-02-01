package v5;

import g5.c;
import i5.d;
import java.io.IOException;
import u5.g;
import u5.i;
import v4.f0;

public abstract class s extends i {

    /* renamed from: a  reason: collision with root package name */
    public final g f14196a;

    /* renamed from: b  reason: collision with root package name */
    public final d f14197b;

    public s(g gVar, d dVar) {
        this.f14196a = gVar;
        this.f14197b = dVar;
    }

    public void A(Object obj) {
    }

    public String B(Object obj) {
        String a10 = this.f14196a.a(obj);
        if (a10 == null) {
            A(obj);
        }
        return a10;
    }

    public String C(Object obj, Class<?> cls) {
        String c10 = this.f14196a.c(obj, cls);
        if (c10 == null) {
            A(obj);
        }
        return c10;
    }

    public String c() {
        return null;
    }

    public g d() {
        return this.f14196a;
    }

    public abstract f0.a e();

    public c o(w4.i iVar, c cVar) throws IOException {
        z(cVar);
        return iVar.f3(cVar);
    }

    public c v(w4.i iVar, c cVar) throws IOException {
        return iVar.g3(cVar);
    }

    public void z(c cVar) {
        if (cVar.f8041c == null) {
            Object obj = cVar.f8039a;
            Class<?> cls = cVar.f8040b;
            cVar.f8041c = cls == null ? B(obj) : C(obj, cls);
        }
    }
}
