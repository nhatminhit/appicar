package pf;

import fh.g;
import fh.h;
import ie.g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import pf.n2;
import we.p;
import zd.i0;
import zd.k;
import zd.m;

@i2
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¨\u0006\u0005"}, d2 = {"Lpf/f3;", "Lpf/n2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "r1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@k(level = m.P, message = "This is internal API and may be removed in the future releases")
public interface f3 extends n2 {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <R> R b(@g f3 f3Var, R r10, @g p<? super R, ? super g.b, ? extends R> pVar) {
            return n2.a.d(f3Var, r10, pVar);
        }

        @h
        public static <E extends g.b> E c(@fh.g f3 f3Var, @fh.g g.c<E> cVar) {
            return n2.a.e(f3Var, cVar);
        }

        @fh.g
        public static ie.g d(@fh.g f3 f3Var, @fh.g g.c<?> cVar) {
            return n2.a.g(f3Var, cVar);
        }

        @fh.g
        public static ie.g e(@fh.g f3 f3Var, @fh.g ie.g gVar) {
            return n2.a.h(f3Var, gVar);
        }

        @fh.g
        @k(level = m.P, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static n2 f(@fh.g f3 f3Var, @fh.g n2 n2Var) {
            return n2.a.i(f3Var, n2Var);
        }
    }

    @fh.g
    @i2
    CancellationException r1();
}
