package be;

import fh.g;
import java.util.List;
import xe.l0;

public final class g1<T> extends f<T> {
    @g
    public final List<T> O;

    public g1(@g List<T> list) {
        l0.p(list, "delegate");
        this.O = list;
    }

    public void add(int i10, T t10) {
        this.O.add(c0.Z0(this, i10), t10);
    }

    public int b() {
        return this.O.size();
    }

    public T c(int i10) {
        return this.O.remove(c0.Y0(this, i10));
    }

    public void clear() {
        this.O.clear();
    }

    public T get(int i10) {
        return this.O.get(c0.Y0(this, i10));
    }

    public T set(int i10, T t10) {
        return this.O.set(c0.Y0(this, i10), t10);
    }
}
