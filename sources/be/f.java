package be;

import java.util.AbstractList;
import java.util.List;
import ye.e;
import zd.h1;

@h1(version = "1.1")
public abstract class f<E> extends AbstractList<E> implements List<E>, e {
    public abstract void add(int i10, E e10);

    public abstract int b();

    public abstract E c(int i10);

    public final /* bridge */ E remove(int i10) {
        return c(i10);
    }

    public abstract E set(int i10, E e10);

    public final /* bridge */ int size() {
        return b();
    }
}
