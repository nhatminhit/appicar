package ce;

import be.h;
import fh.g;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xe.l0;

public final class j<E> extends h<E> implements Set<E>, Serializable, ye.h {
    @g
    public final d<E, ?> O;

    public j() {
        this(new d());
    }

    public j(int i10) {
        this(new d(i10));
    }

    public j(@g d<E, ?> dVar) {
        l0.p(dVar, "backing");
        this.O = dVar;
    }

    public boolean add(E e10) {
        return this.O.l(e10) >= 0;
    }

    public boolean addAll(@g Collection<? extends E> collection) {
        l0.p(collection, "elements");
        this.O.o();
        return super.addAll(collection);
    }

    public int b() {
        return this.O.size();
    }

    @g
    public final Set<E> c() {
        this.O.n();
        return this;
    }

    public void clear() {
        this.O.clear();
    }

    public boolean contains(Object obj) {
        return this.O.containsKey(obj);
    }

    public final Object e() {
        if (this.O.F()) {
            return new h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
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
