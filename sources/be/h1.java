package be;

import fh.g;
import java.util.List;
import xe.l0;

public class h1<T> extends c<T> {
    @g
    public final List<T> P;

    public h1(@g List<? extends T> list) {
        l0.p(list, "delegate");
        this.P = list;
    }

    public int b() {
        return this.P.size();
    }

    public T get(int i10) {
        return this.P.get(c0.Y0(this, i10));
    }
}
