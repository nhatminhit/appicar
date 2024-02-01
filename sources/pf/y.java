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

@i2
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Lpf/y;", "Lpf/n2;", "Lpf/f3;", "parentJob", "Lzd/u2;", "m0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@k(level = m.P, message = "This is internal API and may be removed in the future releases")
public interface y extends n2 {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <R> R b(@g y yVar, R r10, @g p<? super R, ? super g.b, ? extends R> pVar) {
            return n2.a.d(yVar, r10, pVar);
        }

        @h
        public static <E extends g.b> E c(@fh.g y yVar, @fh.g g.c<E> cVar) {
            return n2.a.e(yVar, cVar);
        }

        @fh.g
        public static ie.g d(@fh.g y yVar, @fh.g g.c<?> cVar) {
            return n2.a.g(yVar, cVar);
        }

        @fh.g
        public static ie.g e(@fh.g y yVar, @fh.g ie.g gVar) {
            return n2.a.h(yVar, gVar);
        }

        @fh.g
        @k(level = m.P, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static n2 f(@fh.g y yVar, @fh.g n2 n2Var) {
            return n2.a.i(yVar, n2Var);
        }
    }

    @i2
    void m0(@fh.g f3 f3Var);
}
