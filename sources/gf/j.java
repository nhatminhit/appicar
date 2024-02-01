package gf;

import fh.g;
import gf.h;
import java.lang.Comparable;
import n7.b;
import xe.l0;

public class j<T extends Comparable<? super T>> implements h<T> {
    @g
    public final T O;
    @g
    public final T P;

    public j(@g T t10, @g T t11) {
        l0.p(t10, b.X);
        l0.p(t11, "endInclusive");
        this.O = t10;
        this.P = t11;
    }

    public boolean b(@g T t10) {
        return h.a.a(this, t10);
    }

    @g
    public T c() {
        return this.O;
    }

    public boolean equals(@fh.h Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (!l0.g(c(), jVar.c()) || !l0.g(h(), jVar.h())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @g
    public T h() {
        return this.P;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c().hashCode() * 31) + h().hashCode();
    }

    public boolean isEmpty() {
        return h.a.b(this);
    }

    @g
    public String toString() {
        return c() + ".." + h();
    }
}
