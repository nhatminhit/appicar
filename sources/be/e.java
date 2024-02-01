package be;

import java.util.AbstractCollection;
import java.util.Collection;
import ye.b;
import zd.h1;

@h1(version = "1.1")
public abstract class e<E> extends AbstractCollection<E> implements Collection<E>, b {
    public abstract boolean add(E e10);

    public abstract int b();

    public final /* bridge */ int size() {
        return b();
    }
}
