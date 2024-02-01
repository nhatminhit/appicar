package be;

import fh.g;
import java.util.Iterator;
import ye.a;

public abstract class s implements Iterator<Byte>, a {
    @g
    public final Byte a() {
        return Byte.valueOf(b());
    }

    public abstract byte b();

    public /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
