package fe;

import fh.g;
import java.util.Comparator;
import xe.l0;

public final class l<T> implements Comparator<T> {
    @g
    public final Comparator<T> O;

    public l(@g Comparator<T> comparator) {
        l0.p(comparator, "comparator");
        this.O = comparator;
    }

    @g
    public final Comparator<T> a() {
        return this.O;
    }

    public int compare(T t10, T t11) {
        return this.O.compare(t11, t10);
    }

    @g
    public final Comparator<T> reversed() {
        return this.O;
    }
}
