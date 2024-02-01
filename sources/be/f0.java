package be;

import fh.g;
import java.util.Iterator;
import ye.a;

public abstract class f0 implements Iterator<Double>, a {
    @g
    public final Double next() {
        return Double.valueOf(nextDouble());
    }

    public abstract double nextDouble();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
