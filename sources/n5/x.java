package n5;

import a6.a;
import i5.d;
import i5.g;
import i5.j;
import i5.k;
import i5.l;
import java.io.IOException;
import l5.i;
import l5.y;
import u5.f;
import w4.p;

public abstract class x<T> extends a0<T> implements i {
    public static final long X = 2;
    public final j T;
    public final y U;
    public final f V;
    public final k<Object> W;

    public x(j jVar, y yVar, f fVar, k<?> kVar) {
        super(jVar);
        this.U = yVar;
        this.T = jVar;
        this.W = kVar;
        this.V = fVar;
    }

    @Deprecated
    public x(j jVar, f fVar, k<?> kVar) {
        this(jVar, (y) null, fVar, kVar);
    }

    public abstract Object E0(T t10);

    public abstract T F0(Object obj);

    public abstract T G0(T t10, Object obj);

    public abstract x<T> H0(f fVar, k<?> kVar);

    public k<?> a(g gVar, d dVar) throws l {
        k kVar = this.W;
        k L = kVar == null ? gVar.L(this.T.h(), dVar) : gVar.f0(kVar, dVar, this.T.h());
        f fVar = this.V;
        if (fVar != null) {
            fVar = fVar.g(dVar);
        }
        return (L == this.W && fVar == this.V) ? this : H0(fVar, L);
    }

    public a c() {
        return a.DYNAMIC;
    }

    public abstract T d(g gVar) throws l;

    public T f(w4.l lVar, g gVar) throws IOException {
        y yVar = this.U;
        if (yVar != null) {
            return g(lVar, gVar, yVar.t(gVar));
        }
        f fVar = this.V;
        return F0(fVar == null ? this.W.f(lVar, gVar) : this.W.h(lVar, gVar, fVar));
    }

    public T g(w4.l lVar, g gVar, T t10) throws IOException {
        Object obj;
        if (this.W.u(gVar.q()).equals(Boolean.FALSE) || this.V != null) {
            f fVar = this.V;
            obj = fVar == null ? this.W.f(lVar, gVar) : this.W.h(lVar, gVar, fVar);
        } else {
            Object E0 = E0(t10);
            if (E0 == null) {
                f fVar2 = this.V;
                return F0(fVar2 == null ? this.W.f(lVar, gVar) : this.W.h(lVar, gVar, fVar2));
            }
            obj = this.W.g(lVar, gVar, E0);
        }
        return G0(t10, obj);
    }

    public Object h(w4.l lVar, g gVar, f fVar) throws IOException {
        if (lVar.q2(p.VALUE_NULL)) {
            return d(gVar);
        }
        f fVar2 = this.V;
        return fVar2 == null ? f(lVar, gVar) : F0(fVar2.c(lVar, gVar));
    }

    public a l() {
        return a.DYNAMIC;
    }

    public Object n(g gVar) throws l {
        return d(gVar);
    }

    public Boolean u(i5.f fVar) {
        k<Object> kVar = this.W;
        if (kVar == null) {
            return null;
        }
        return kVar.u(fVar);
    }

    public j x0() {
        return this.T;
    }
}
