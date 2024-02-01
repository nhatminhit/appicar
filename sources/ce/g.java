package ce;

import be.e;
import java.util.Collection;
import java.util.Iterator;
import xe.l0;
import ye.b;

public final class g<V> extends e<V> implements Collection<V>, b {
    @fh.g
    public final d<?, V> O;

    public g(@fh.g d<?, V> dVar) {
        l0.p(dVar, "backing");
        this.O = dVar;
    }

    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(@fh.g Collection<? extends V> collection) {
        l0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.O.size();
    }

    @fh.g
    public final d<?, V> c() {
        return this.O;
    }

    public void clear() {
        this.O.clear();
    }

    public boolean contains(Object obj) {
        return this.O.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.O.isEmpty();
    }

    @fh.g
    public Iterator<V> iterator() {
        return this.O.Q();
    }

    public boolean remove(Object obj) {
        return this.O.P(obj);
    }

    public boolean removeAll(@fh.g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.O.o();
        return super.removeAll(collection);
    }

    public boolean retainAll(@fh.g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        this.O.o();
        return super.retainAll(collection);
    }
}
