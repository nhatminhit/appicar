package nf;

import fh.g;
import fh.h;
import nf.r;
import xe.l0;
import zd.h1;

@h1(version = "1.8")
@l
public interface d extends r, Comparable<d> {

    public static final class a {
        public static int a(@g d dVar, @g d dVar2) {
            l0.p(dVar2, "other");
            return e.l(dVar.g(dVar2), e.P.W());
        }

        public static boolean b(@g d dVar) {
            return r.a.a(dVar);
        }

        public static boolean c(@g d dVar) {
            return r.a.b(dVar);
        }

        @g
        public static d d(@g d dVar, long j10) {
            return dVar.f(e.x0(j10));
        }
    }

    @g
    d c(long j10);

    boolean equals(@h Object obj);

    @g
    d f(long j10);

    long g(@g d dVar);

    int h(@g d dVar);

    int hashCode();
}
