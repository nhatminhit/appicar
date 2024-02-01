package pf;

import fh.g;
import fh.h;
import ie.g;
import kotlin.Metadata;
import pf.c1;
import we.p;
import zd.i0;
import zd.k;
import zd.m;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lpf/z;", "T", "Lpf/c1;", "value", "", "h1", "(Ljava/lang/Object;)Z", "", "exception", "l", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface z<T> extends c1<T> {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static <T, R> R b(@g z<T> zVar, R r10, @g p<? super R, ? super g.b, ? extends R> pVar) {
            return c1.a.b(zVar, r10, pVar);
        }

        @h
        public static <T, E extends g.b> E c(@fh.g z<T> zVar, @fh.g g.c<E> cVar) {
            return c1.a.c(zVar, cVar);
        }

        @fh.g
        public static <T> ie.g d(@fh.g z<T> zVar, @fh.g g.c<?> cVar) {
            return c1.a.d(zVar, cVar);
        }

        @fh.g
        public static <T> ie.g e(@fh.g z<T> zVar, @fh.g ie.g gVar) {
            return c1.a.e(zVar, gVar);
        }

        @fh.g
        @k(level = m.P, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> n2 f(@fh.g z<T> zVar, @fh.g n2 n2Var) {
            return c1.a.f(zVar, n2Var);
        }
    }

    boolean h1(T t10);

    boolean l(@fh.g Throwable th2);
}
