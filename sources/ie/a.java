package ie;

import fh.h;
import ie.g;
import we.p;
import xe.l0;
import zd.h1;

@h1(version = "1.3")
public abstract class a implements g.b {
    @fh.g
    public final g.c<?> O;

    public a(@fh.g g.c<?> cVar) {
        l0.p(cVar, "key");
        this.O = cVar;
    }

    @h
    public <E extends g.b> E g(@fh.g g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    @fh.g
    public g.c<?> getKey() {
        return this.O;
    }

    @fh.g
    public g i(@fh.g g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @fh.g
    public g m1(@fh.g g gVar) {
        return g.b.a.d(this, gVar);
    }

    public <R> R o(R r10, @fh.g p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r10, pVar);
    }
}
