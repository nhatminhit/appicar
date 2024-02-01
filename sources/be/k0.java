package be;

import fh.g;
import java.util.Iterator;
import ye.a;

public abstract class k0 implements Iterator<Float>, a {
    @g
    public final Float a() {
        return Float.valueOf(b());
    }

    public abstract float b();

    public /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
