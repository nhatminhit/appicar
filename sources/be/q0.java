package be;

import fh.g;
import java.util.Iterator;
import xe.l0;
import ye.a;

public final class q0<T> implements Iterable<p0<? extends T>>, a {
    @g
    public final we.a<Iterator<T>> O;

    public q0(@g we.a<? extends Iterator<? extends T>> aVar) {
        l0.p(aVar, "iteratorFactory");
        this.O = aVar;
    }

    @g
    public Iterator<p0<T>> iterator() {
        return new r0(this.O.n());
    }
}
