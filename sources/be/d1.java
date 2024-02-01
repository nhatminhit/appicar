package be;

import dc.a;
import fh.g;
import java.util.List;
import java.util.RandomAccess;
import xe.l0;

public final class d1<E> extends c<E> implements RandomAccess {
    @g
    public final List<E> P;
    public int Q;
    public int R;

    public d1(@g List<? extends E> list) {
        l0.p(list, a.C0292a.f17822o);
        this.P = list;
    }

    public int b() {
        return this.R;
    }

    public final void c(int i10, int i11) {
        c.O.d(i10, i11, this.P.size());
        this.Q = i10;
        this.R = i11 - i10;
    }

    public E get(int i10) {
        c.O.b(i10, this.R);
        return this.P.get(this.Q + i10);
    }
}
