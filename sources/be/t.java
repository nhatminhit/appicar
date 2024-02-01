package be;

import fh.g;
import java.util.Iterator;
import ye.a;

public abstract class t implements Iterator<Character>, a {
    @g
    public final Character a() {
        return Character.valueOf(b());
    }

    public abstract char b();

    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
