package be;

import fh.g;
import java.util.Iterator;
import ye.a;

public abstract class n1 implements Iterator<Short>, a {
    @g
    public final Short a() {
        return Short.valueOf(b());
    }

    public abstract short b();

    public /* bridge */ /* synthetic */ Object next() {
        return Short.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
