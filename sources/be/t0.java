package be;

import fh.g;
import java.util.Iterator;
import ye.a;

public abstract class t0 implements Iterator<Long>, a {
    @g
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
