package nf;

import fh.g;
import xe.w;
import zd.h1;

@h1(version = "1.3")
@l
public interface r {

    public static final class a {
        public static boolean a(@g r rVar) {
            return e.e0(rVar.b());
        }

        public static boolean b(@g r rVar) {
            return !e.e0(rVar.b());
        }

        @g
        public static r c(@g r rVar, long j10) {
            return rVar.f(e.x0(j10));
        }

        @g
        public static r d(@g r rVar, long j10) {
            return new c(rVar, j10, (w) null);
        }
    }

    boolean a();

    long b();

    @g
    r c(long j10);

    boolean d();

    @g
    r f(long j10);
}
