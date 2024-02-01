package pf;

import fh.g;
import fh.h;
import ie.g;
import kotlin.Metadata;
import pf.s3;
import we.p;
import zd.i0;

@g1
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lpf/l0;", "S", "Lpf/s3;", "X0", "Lie/g$b;", "overwritingElement", "Lie/g;", "g1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@c2
public interface l0<S> extends s3<S> {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(@g l0<S> l0Var, R r10, @g p<? super R, ? super g.b, ? extends R> pVar) {
            return s3.a.a(l0Var, r10, pVar);
        }

        @h
        public static <S, E extends g.b> E b(@fh.g l0<S> l0Var, @fh.g g.c<E> cVar) {
            return s3.a.b(l0Var, cVar);
        }

        @fh.g
        public static <S> ie.g c(@fh.g l0<S> l0Var, @fh.g g.c<?> cVar) {
            return s3.a.c(l0Var, cVar);
        }

        @fh.g
        public static <S> ie.g d(@fh.g l0<S> l0Var, @fh.g ie.g gVar) {
            return s3.a.d(l0Var, gVar);
        }
    }

    @fh.g
    l0<S> X0();

    @fh.g
    ie.g g1(@fh.g g.b bVar);
}
