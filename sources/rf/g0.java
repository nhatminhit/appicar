package rf;

import fh.g;
import kotlin.Metadata;
import pf.u0;
import rf.m0;
import zd.b1;
import zd.i0;
import zd.k;
import zd.m;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrf/g0;", "E", "Lpf/u0;", "Lrf/m0;", "a", "()Lrf/m0;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface g0<E> extends u0, m0<E> {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @k(level = m.P, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@g g0<? super E> g0Var, E e10) {
            return m0.a.c(g0Var, e10);
        }
    }

    @g
    m0<E> a();
}
