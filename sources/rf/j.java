package rf;

import fh.g;
import kotlin.Metadata;
import pf.e3;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"E", "", "capacity", "Lrf/i;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class j {
    @g
    @e3
    public static final <E> i<E> a(int i10) {
        if (i10 == -2) {
            return new g(n.F.a());
        }
        if (i10 == -1) {
            return new z();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        } else if (i10 != Integer.MAX_VALUE) {
            return new g(i10);
        } else {
            throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
        }
    }
}
