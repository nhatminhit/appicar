package he;

import fh.g;
import fh.h;
import oe.b;
import zd.h1;
import zd.v;

@h1(version = "1.3")
@b
@f
public interface c {

    public static final class a {
        public static /* synthetic */ a a(c cVar, v vVar, g gVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    gVar = g.UNKNOWN;
                }
                return cVar.a(vVar, gVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
        }
    }

    @g
    @b
    <R> a a(@g v<? extends R> vVar, @g g gVar);

    @g
    @b
    h b();

    @g
    @b
    h c(@h Object obj);

    @g
    @b
    i d();
}
