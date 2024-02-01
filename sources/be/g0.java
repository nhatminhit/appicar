package be;

import fh.g;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import ye.a;

public final class g0 implements ListIterator, a {
    @g
    public static final g0 O = new g0();

    public void a(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @g
    /* renamed from: b */
    public Void next() {
        throw new NoSuchElementException();
    }

    @g
    /* renamed from: c */
    public Void previous() {
        throw new NoSuchElementException();
    }

    public void d(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
