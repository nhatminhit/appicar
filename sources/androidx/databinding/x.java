package androidx.databinding;

import d.o0;
import java.io.Serializable;

public class x<T> extends b implements Serializable {
    public static final long Q = 1;
    public T P;

    public x() {
    }

    public x(T t10) {
        this.P = t10;
    }

    public x(u... uVarArr) {
        super(uVarArr);
    }

    @o0
    public T e() {
        return this.P;
    }

    public void f(T t10) {
        if (t10 != this.P) {
            this.P = t10;
            c();
        }
    }
}
