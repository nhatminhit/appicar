package i8;

import d.m0;
import e8.a;
import j8.s;
import java.util.NoSuchElementException;

@a
public class k<T> extends c<T> {
    public Object Q;

    public k(@m0 b bVar) {
        super(bVar);
    }

    @m0
    public final Object next() {
        if (hasNext()) {
            int i10 = this.P + 1;
            this.P = i10;
            if (i10 == 0) {
                Object l10 = s.l(this.O.get(0));
                this.Q = l10;
                if (!(l10 instanceof f)) {
                    String valueOf = String.valueOf(l10.getClass());
                    throw new IllegalStateException("DataBuffer reference of type " + valueOf + " is not movable");
                }
            } else {
                ((f) s.l(this.Q)).n(this.P);
            }
            return this.Q;
        }
        int i11 = this.P;
        throw new NoSuchElementException("Cannot advance the iterator beyond " + i11);
    }
}
