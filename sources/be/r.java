package be;

import fh.g;
import java.util.Iterator;
import ye.a;

public abstract class r implements Iterator<Boolean>, a {
    @g
    public final Boolean a() {
        return Boolean.valueOf(b());
    }

    public abstract boolean b();

    public /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
