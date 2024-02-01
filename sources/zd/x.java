package zd;

import fh.g;
import java.io.Serializable;

public final class x<T> implements d0<T>, Serializable {
    public final T O;

    public x(T t10) {
        this.O = t10;
    }

    public boolean a() {
        return true;
    }

    public T getValue() {
        return this.O;
    }

    @g
    public String toString() {
        return String.valueOf(getValue());
    }
}
