package rf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import pf.e3;
import pf.u0;
import rf.i0;
import zd.b1;
import zd.i0;
import zd.k;
import zd.m;
import zf.d;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lrf/f;", "E", "Lpf/u0;", "Lrf/i0;", "Lrf/n;", "a", "()Lrf/n;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@e3
public interface f<E> extends u0, i0<E> {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @g
        public static <E> d<E> b(@g f<E> fVar) {
            return i0.a.d(fVar);
        }

        @h
        @k(level = m.P, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E c(@g f<E> fVar) {
            return i0.a.h(fVar);
        }

        @h
        @oe.h
        @k(level = m.P, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object d(@g f<E> fVar, @g ie.d<? super E> dVar) {
            return i0.a.i(fVar, dVar);
        }
    }

    @g
    n<E> a();
}
