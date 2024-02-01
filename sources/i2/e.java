package i2;

import fh.g;
import fh.h;
import i2.a;
import xe.l0;
import xe.w;

public final class e extends a {
    public e() {
        this((a) null, 1, (w) null);
    }

    public e(@g a aVar) {
        l0.p(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(a aVar, int i10, w wVar) {
        this((i10 & 1) != 0 ? a.C0151a.f9017b : aVar);
    }

    @h
    public <T> T a(@g a.b<T> bVar) {
        l0.p(bVar, "key");
        return b().get(bVar);
    }

    public final <T> void c(@g a.b<T> bVar, T t10) {
        l0.p(bVar, "key");
        b().put(bVar, t10);
    }
}
