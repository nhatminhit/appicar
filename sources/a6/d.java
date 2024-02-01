package a6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class d<T> implements Iterator<T>, Iterable<T> {
    public final T[] O;
    public int P = 0;

    public d(T[] tArr) {
        this.O = tArr;
    }

    public boolean hasNext() {
        return this.P < this.O.length;
    }

    public Iterator<T> iterator() {
        return this;
    }

    public T next() {
        int i10 = this.P;
        T[] tArr = this.O;
        if (i10 < tArr.length) {
            this.P = i10 + 1;
            return tArr[i10];
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
