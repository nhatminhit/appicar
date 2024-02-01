package be;

import androidx.lifecycle.n0;
import fh.g;
import java.util.Collection;
import java.util.Iterator;
import xe.i;
import xe.l0;
import xe.v;
import ye.a;

public final class j<T> implements Collection<T>, a {
    @g
    public final T[] O;
    public final boolean P;

    public j(@g T[] tArr, boolean z10) {
        l0.p(tArr, n0.f2813g);
        this.O = tArr;
        this.P = z10;
    }

    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.O.length;
    }

    @g
    public final T[] c() {
        return this.O;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return p.T8(this.O, obj);
    }

    public boolean containsAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean e() {
        return this.P;
    }

    public boolean isEmpty() {
        return this.O.length == 0;
    }

    @g
    public Iterator<T> iterator() {
        return i.a(this.O);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return b();
    }

    @g
    public final Object[] toArray() {
        return v.h(this.O, this.P);
    }

    public <T> T[] toArray(T[] tArr) {
        l0.p(tArr, "array");
        return v.b(this, tArr);
    }
}
