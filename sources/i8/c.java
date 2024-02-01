package i8;

import d.m0;
import e8.a;
import j8.s;
import java.util.Iterator;
import java.util.NoSuchElementException;

@a
public class c<T> implements Iterator<T> {
    @m0
    public final b O;
    public int P = -1;

    public c(@m0 b bVar) {
        this.O = (b) s.l(bVar);
    }

    public final boolean hasNext() {
        return this.P < this.O.getCount() + -1;
    }

    @m0
    public Object next() {
        if (hasNext()) {
            b bVar = this.O;
            int i10 = this.P + 1;
            this.P = i10;
            return bVar.get(i10);
        }
        int i11 = this.P;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i11);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
