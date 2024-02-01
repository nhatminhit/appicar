package n5;

import a6.h;
import a6.j;
import i5.d;
import i5.g;
import i5.k;
import java.io.IOException;
import l5.i;
import l5.t;
import u5.f;
import w4.l;

public class z<T> extends a0<T> implements i, t {
    public static final long W = 1;
    public final j<Object, T> T;
    public final i5.j U;
    public final k<Object> V;

    public z(j<?, T> jVar) {
        super((Class<?>) Object.class);
        this.T = jVar;
        this.U = null;
        this.V = null;
    }

    public z(j<Object, T> jVar, i5.j jVar2, k<?> kVar) {
        super(jVar2);
        this.T = jVar;
        this.U = jVar2;
        this.V = kVar;
    }

    public z(z<T> zVar) {
        super((a0<?>) zVar);
        this.T = zVar.T;
        this.U = zVar.U;
        this.V = zVar.V;
    }

    public Object E0(l lVar, g gVar, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), new Object[]{this.U}));
    }

    public T F0(Object obj) {
        return this.T.a(obj);
    }

    public z<T> G0(j<Object, T> jVar, i5.j jVar2, k<?> kVar) {
        h.u0(z.class, this, "withDelegate");
        return new z<>(jVar, jVar2, kVar);
    }

    public k<?> a(g gVar, d dVar) throws i5.l {
        k<Object> kVar = this.V;
        if (kVar != null) {
            k<?> f02 = gVar.f0(kVar, dVar, this.U);
            return f02 != this.V ? G0(this.T, this.U, f02) : this;
        }
        i5.j b10 = this.T.b(gVar.u());
        return G0(this.T, b10, gVar.L(b10, dVar));
    }

    public void b(g gVar) throws i5.l {
        k<Object> kVar = this.V;
        if (kVar != null && (kVar instanceof t)) {
            ((t) kVar).b(gVar);
        }
    }

    public T f(l lVar, g gVar) throws IOException {
        Object f10 = this.V.f(lVar, gVar);
        if (f10 == null) {
            return null;
        }
        return F0(f10);
    }

    public T g(l lVar, g gVar, Object obj) throws IOException {
        return this.U.g().isAssignableFrom(obj.getClass()) ? this.V.g(lVar, gVar, obj) : E0(lVar, gVar, obj);
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        Object f10 = this.V.f(lVar, gVar);
        if (f10 == null) {
            return null;
        }
        return F0(f10);
    }

    public k<?> k() {
        return this.V;
    }

    public Class<?> r() {
        return this.V.r();
    }

    public Boolean u(i5.f fVar) {
        return this.V.u(fVar);
    }
}
