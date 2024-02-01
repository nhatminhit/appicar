package ie;

import fh.h;
import ie.e;
import we.p;
import xe.l0;
import xe.n0;
import zd.h1;

@h1(version = "1.3")
public interface g {

    public static final class a {

        /* renamed from: ie.g$a$a  reason: collision with other inner class name */
        public static final class C0327a extends n0 implements p<g, b, g> {
            public static final C0327a P = new C0327a();

            public C0327a() {
                super(2);
            }

            @fh.g
            /* renamed from: c */
            public final g g0(@fh.g g gVar, @fh.g b bVar) {
                c cVar;
                l0.p(gVar, "acc");
                l0.p(bVar, "element");
                g i10 = gVar.i(bVar.getKey());
                i iVar = i.O;
                if (i10 == iVar) {
                    return bVar;
                }
                e.b bVar2 = e.B;
                e eVar = (e) i10.g(bVar2);
                if (eVar == null) {
                    cVar = new c(i10, bVar);
                } else {
                    g i11 = i10.i(bVar2);
                    if (i11 == iVar) {
                        return new c(bVar, eVar);
                    }
                    cVar = new c(new c(i11, bVar), eVar);
                }
                return cVar;
            }
        }

        @fh.g
        public static g a(@fh.g g gVar, @fh.g g gVar2) {
            l0.p(gVar2, "context");
            return gVar2 == i.O ? gVar : (g) gVar2.o(gVar, C0327a.P);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R a(@fh.g b bVar, R r10, @fh.g p<? super R, ? super b, ? extends R> pVar) {
                l0.p(pVar, "operation");
                return pVar.g0(r10, bVar);
            }

            @h
            public static <E extends b> E b(@fh.g b bVar, @fh.g c<E> cVar) {
                l0.p(cVar, "key");
                if (!l0.g(bVar.getKey(), cVar)) {
                    return null;
                }
                l0.n(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            @fh.g
            public static g c(@fh.g b bVar, @fh.g c<?> cVar) {
                l0.p(cVar, "key");
                return l0.g(bVar.getKey(), cVar) ? i.O : bVar;
            }

            @fh.g
            public static g d(@fh.g b bVar, @fh.g g gVar) {
                l0.p(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @h
        <E extends b> E g(@fh.g c<E> cVar);

        @fh.g
        c<?> getKey();

        @fh.g
        g i(@fh.g c<?> cVar);

        <R> R o(R r10, @fh.g p<? super R, ? super b, ? extends R> pVar);
    }

    public interface c<E extends b> {
    }

    @h
    <E extends b> E g(@fh.g c<E> cVar);

    @fh.g
    g i(@fh.g c<?> cVar);

    @fh.g
    g m1(@fh.g g gVar);

    <R> R o(R r10, @fh.g p<? super R, ? super b, ? extends R> pVar);
}
