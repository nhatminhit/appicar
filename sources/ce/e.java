package ce;

import fh.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import xe.l0;

public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {
    @g
    public final d<K, V> O;

    public e(@g d<K, V> dVar) {
        l0.p(dVar, "backing");
        this.O = dVar;
    }

    public boolean addAll(@g Collection<? extends Map.Entry<K, V>> collection) {
        l0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.O.size();
    }

    public void clear() {
        this.O.clear();
    }

    public boolean containsAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        return this.O.q(collection);
    }

    public boolean e(@g Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "element");
        return this.O.r(entry);
    }

    public boolean f(@g Map.Entry entry) {
        l0.p(entry, "element");
        return this.O.L(entry);
    }

    /* renamed from: h */
    public boolean add(@g Map.Entry<K, V> entry) {
        l0.p(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return this.O.isEmpty();
    }

    @g
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.O.v();
    }

    @g
    public final d<K, V> l() {
        return this.O;
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
