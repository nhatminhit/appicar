package ie;

import fh.h;
import ie.g;
import we.p;
import xe.l0;
import zd.h1;

@h1(version = "1.3")
public interface e extends g.b {
    @fh.g
    public static final b B = b.O;

    public static final class a {
        public static <R> R a(@fh.g e eVar, R r10, @fh.g p<? super R, ? super g.b, ? extends R> pVar) {
            l0.p(pVar, "operation");
            return g.b.a.a(eVar, r10, pVar);
        }

        @h
        public static <E extends g.b> E b(@fh.g e eVar, @fh.g g.c<E> cVar) {
            l0.p(cVar, "key");
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                E b10 = bVar.b(eVar);
                if (b10 instanceof g.b) {
                    return b10;
                }
                return null;
            } else if (e.B != cVar) {
                return null;
            } else {
                l0.n(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        @fh.g
        public static g c(@fh.g e eVar, @fh.g g.c<?> cVar) {
            l0.p(cVar, "key");
            if (!(cVar instanceof b)) {
                return e.B == cVar ? i.O : eVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : i.O;
        }

        @fh.g
        public static g d(@fh.g e eVar, @fh.g g gVar) {
            l0.p(gVar, "context");
            return g.b.a.d(eVar, gVar);
        }

        public static void e(@fh.g e eVar, @fh.g d<?> dVar) {
            l0.p(dVar, "continuation");
        }
    }

    public static final class b implements g.c<e> {
        public static final /* synthetic */ b O = new b();
    }

    @fh.g
    <T> d<T> Y(@fh.g d<? super T> dVar);

    @h
    <E extends g.b> E g(@fh.g g.c<E> cVar);

    @fh.g
    g i(@fh.g g.c<?> cVar);

    void t(@fh.g d<?> dVar);
}
