package ie;

import ie.g;
import xe.l0;
import zd.h1;
import zd.r;

public final class h {
    @h1(version = "1.3")
    @fh.h
    @r
    public static final <E extends g.b> E a(@fh.g g.b bVar, @fh.g g.c<E> cVar) {
        l0.p(bVar, "<this>");
        l0.p(cVar, "key");
        if (cVar instanceof b) {
            b bVar2 = (b) cVar;
            if (!bVar2.a(bVar.getKey())) {
                return null;
            }
            E b10 = bVar2.b(bVar);
            if (b10 instanceof g.b) {
                return b10;
            }
            return null;
        } else if (bVar.getKey() == cVar) {
            return bVar;
        } else {
            return null;
        }
    }

    @h1(version = "1.3")
    @fh.g
    @r
    public static final g b(@fh.g g.b bVar, @fh.g g.c<?> cVar) {
        l0.p(bVar, "<this>");
        l0.p(cVar, "key");
        if (!(cVar instanceof b)) {
            return bVar.getKey() == cVar ? i.O : bVar;
        }
        b bVar2 = (b) cVar;
        return (!bVar2.a(bVar.getKey()) || bVar2.b(bVar) == null) ? bVar : i.O;
    }
}
