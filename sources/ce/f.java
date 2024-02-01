package ce;

import be.h;
import fh.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xe.l0;

public final class f<E> extends h<E> implements Set<E>, ye.h {
    @g
    public final d<E, ?> O;

    public f(@g d<E, ?> dVar) {
        l0.p(dVar, "backing");
        this.O = dVar;
    }

    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(@g Collection<? extends E> collection) {
        l0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.O.size();
    }

    public void clear() {
        this.O.clear();
    }

    public boolean contains(Object obj) {
        return this.O.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.O.isEmpty();
    }

    @g
    public Iterator<E> iterator() {
        return this.O.G();
    }

    public boolean remove(Object obj) {
        return this.O.N(obj) >= 0;
    }

    public boolean removeAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.O.o();
        return super.removeAll(collection);
    }

    public boolean retainAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.O.o();
        return super.retainAll(collection);
    }
}
