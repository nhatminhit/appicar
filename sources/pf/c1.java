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
import zf.d;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lpf/c1;", "T", "Lpf/n2;", "a0", "(Lie/d;)Ljava/lang/Object;", "w", "()Ljava/lang/Object;", "", "Q", "Lzf/d;", "N", "()Lzf/d;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface c1<T> extends n2 {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <T, R> R b(@g c1<? extends T> c1Var, R r10, @g p<? super R, ? super g.b, ? extends R> pVar) {
            return n2.a.d(c1Var, r10, pVar);
        }

        @h
        public static <T, E extends g.b> E c(@fh.g c1<? extends T> c1Var, @fh.g g.c<E> cVar) {
            return n2.a.e(c1Var, cVar);
        }

        @fh.g
        public static <T> ie.g d(@fh.g c1<? extends T> c1Var, @fh.g g.c<?> cVar) {
            return n2.a.g(c1Var, cVar);
        }

        @fh.g
        public static <T> ie.g e(@fh.g c1<? extends T> c1Var, @fh.g ie.g gVar) {
            return n2.a.h(c1Var, gVar);
        }

        @fh.g
        @k(level = m.P, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> n2 f(@fh.g c1<? extends T> c1Var, @fh.g n2 n2Var) {
            return n2.a.i(c1Var, n2Var);
        }
    }

    @fh.g
    d<T> N();

    @c2
    @h
    Throwable Q();

    @h
    Object a0(@fh.g ie.d<? super T> dVar);

    @c2
    T w();
}
