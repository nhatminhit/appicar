package be;

import fh.g;
import java.util.Enumeration;
import java.util.Iterator;
import xe.l0;

public class y extends x {

    public static final class a implements Iterator<T>, ye.a {
        public final /* synthetic */ Enumeration<T> O;

        public a(Enumeration<T> enumeration) {
            this.O = enumeration;
        }

        public boolean hasNext() {
            return this.O.hasMoreElements();
        }

        public T next() {
            return this.O.nextElement();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @g
    public static final <T> Iterator<T> c0(@g Enumeration<T> enumeration) {
        l0.p(enumeration, "<this>");
        return new a(enumeration);
    }
}
