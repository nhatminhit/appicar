package pf;

import fh.g;
import fh.h;
import ie.g;
import kotlin.Metadata;
import pf.n2;
import we.p;
import zd.i0;
import zd.k;
import zd.m;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lpf/c0;", "Lpf/n2;", "", "k", "", "exception", "l", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface c0 extends n2 {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <R> R b(@g c0 c0Var, R r10, @g p<? super R, ? super g.b, ? extends R> pVar) {
            return n2.a.d(c0Var, r10, pVar);
        }

        @h
        public static <E extends g.b> E c(@fh.g c0 c0Var, @fh.g g.c<E> cVar) {
            return n2.a.e(c0Var, cVar);
        }

        @fh.g
        public static ie.g d(@fh.g c0 c0Var, @fh.g g.c<?> cVar) {
            return n2.a.g(c0Var, cVar);
        }

        @fh.g
        public static ie.g e(@fh.g c0 c0Var, @fh.g ie.g gVar) {
            return n2.a.h(c0Var, gVar);
        }

        @fh.g
        @k(level = m.P, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static n2 f(@fh.g c0 c0Var, @fh.g n2 n2Var) {
            return n2.a.i(c0Var, n2Var);
        }
    }

    boolean k();

    boolean l(@fh.g Throwable th2);
}
