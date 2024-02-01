package ie;

import fh.g;
import fh.h;
import ie.g;
import java.io.Serializable;
import we.p;
import xe.l0;
import zd.h1;

@h1(version = "1.3")
public final class i implements g, Serializable {
    @g
    public static final i O = new i();
    public static final long P = 0;

    public final Object a() {
        return O;
    }

    @h
    public <E extends g.b> E g(@fh.g g.c<E> cVar) {
        l0.p(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @fh.g
    public g i(@fh.g g.c<?> cVar) {
        l0.p(cVar, "key");
        return this;
    }

    @fh.g
    public g m1(@fh.g g gVar) {
        l0.p(gVar, "context");
        return gVar;
    }

    public <R> R o(R r10, @fh.g p<? super R, ? super g.b, ? extends R> pVar) {
        l0.p(pVar, "operation");
        return r10;
    }

    @fh.g
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
