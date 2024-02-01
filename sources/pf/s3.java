package pf;

import fh.h;
import ie.g;
import kotlin.Metadata;
import we.p;
import zd.i0;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpf/s3;", "S", "Lie/g$b;", "Lie/g;", "context", "z0", "(Lie/g;)Ljava/lang/Object;", "oldState", "Lzd/u2;", "Z0", "(Lie/g;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface s3<S> extends g.b {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(@fh.g s3<S> s3Var, R r10, @fh.g p<? super R, ? super g.b, ? extends R> pVar) {
            return g.b.a.a(s3Var, r10, pVar);
        }

        @h
        public static <S, E extends g.b> E b(@fh.g s3<S> s3Var, @fh.g g.c<E> cVar) {
            return g.b.a.b(s3Var, cVar);
        }

        @fh.g
        public static <S> g c(@fh.g s3<S> s3Var, @fh.g g.c<?> cVar) {
            return g.b.a.c(s3Var, cVar);
        }

        @fh.g
        public static <S> g d(@fh.g s3<S> s3Var, @fh.g g gVar) {
            return g.b.a.d(s3Var, gVar);
        }
    }

    void Z0(@fh.g g gVar, S s10);

    S z0(@fh.g g gVar);
}
