package ie;

import fh.h;
import ie.g;
import ie.g.b;
import we.l;
import xe.l0;
import zd.h1;
import zd.r;

@h1(version = "1.3")
@r
public abstract class b<B extends g.b, E extends B> implements g.c<E> {
    @fh.g
    public final l<g.b, E> O;
    @fh.g
    public final g.c<?> P;

    public b(@fh.g g.c<B> cVar, @fh.g l<? super g.b, ? extends E> lVar) {
        l0.p(cVar, "baseKey");
        l0.p(lVar, "safeCast");
        this.O = lVar;
        this.P = cVar instanceof b ? ((b) cVar).P : cVar;
    }

    public final boolean a(@fh.g g.c<?> cVar) {
        l0.p(cVar, "key");
        return cVar == this || this.P == cVar;
    }

    @h
    public final E b(@fh.g g.b bVar) {
        l0.p(bVar, "element");
        return (g.b) this.O.A(bVar);
    }
}
