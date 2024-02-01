package m5;

import i5.g;
import i5.k;
import i5.l;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import u5.f;

public final class b0 extends k<Object> implements Serializable {
    public static final long Q = 1;
    public final f O;
    public final k<Object> P;

    public b0(f fVar, k<?> kVar) {
        this.O = fVar;
        this.P = kVar;
    }

    public Object d(g gVar) throws l {
        return this.P.d(gVar);
    }

    public Object f(w4.l lVar, g gVar) throws IOException {
        return this.P.h(lVar, gVar, this.O);
    }

    public Object g(w4.l lVar, g gVar, Object obj) throws IOException {
        return this.P.g(lVar, gVar, obj);
    }

    public Object h(w4.l lVar, g gVar, f fVar) throws IOException {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    public k<?> k() {
        return this.P.k();
    }

    public Object n(g gVar) throws l {
        return this.P.n(gVar);
    }

    public Collection<Object> o() {
        return this.P.o();
    }

    public Class<?> r() {
        return this.P.r();
    }

    public Boolean u(i5.f fVar) {
        return this.P.u(fVar);
    }
}
