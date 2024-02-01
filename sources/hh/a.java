package hh;

import java.util.ArrayList;
import java.util.Collection;

public abstract class a<E> extends ArrayList<E> {
    public a(int i10) {
        super(i10);
    }

    public void add(int i10, E e10) {
        i();
        super.add(i10, e10);
    }

    public boolean add(E e10) {
        i();
        return super.add(e10);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        i();
        return super.addAll(i10, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        i();
        return super.addAll(collection);
    }

    public void clear() {
        i();
        super.clear();
    }

    public abstract void i();

    public E remove(int i10) {
        i();
        return super.remove(i10);
    }

    public boolean remove(Object obj) {
        i();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        i();
        return super.removeAll(collection);
    }

    public void removeRange(int i10, int i11) {
        i();
        super.removeRange(i10, i11);
    }

    public boolean retainAll(Collection<?> collection) {
        i();
        return super.retainAll(collection);
    }

    public E set(int i10, E e10) {
        i();
        return super.set(i10, e10);
    }
}
