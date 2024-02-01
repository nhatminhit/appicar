package be;

import fh.g;
import java.util.Iterator;
import xe.l0;
import ye.a;

public final class r0<T> implements Iterator<p0<? extends T>>, a {
    @g
    public final Iterator<T> O;
    public int P;

    public r0(@g Iterator<? extends T> it) {
        l0.p(it, "iterator");
        this.O = it;
    }

    @g
    /* renamed from: a */
    public final p0<T> next() {
        int i10 = this.P;
        this.P = i10 + 1;
        if (i10 < 0) {
            w.W();
        }
        return new p0<>(i10, this.O.next());
    }

    public final boolean hasNext() {
        return this.O.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
