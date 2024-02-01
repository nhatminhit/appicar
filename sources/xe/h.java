package xe;

import fh.g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ye.a;

public final class h<T> implements Iterator<T>, a {
    @g
    public final T[] O;
    public int P;

    public h(@g T[] tArr) {
        l0.p(tArr, "array");
        this.O = tArr;
    }

    @g
    public final T[] a() {
        return this.O;
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }

    public T next() {
        try {
            T[] tArr = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.P--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
