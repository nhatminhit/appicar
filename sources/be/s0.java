package be;

import fh.g;
import java.util.Iterator;
import ye.a;

public abstract class s0 implements Iterator<Integer>, a {
    @g
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
