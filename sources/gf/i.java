package gf;

import fh.g;
import fh.h;
import gf.s;
import java.lang.Comparable;
import n7.b;
import xe.l0;

public class i<T extends Comparable<? super T>> implements s<T> {
    @g
    public final T O;
    @g
    public final T P;

    public i(@g T t10, @g T t11) {
        l0.p(t10, b.X);
        l0.p(t11, "endExclusive");
        this.O = t10;
        this.P = t11;
    }

    public boolean b(@g T t10) {
        return s.a.a(this, t10);
    }

    @g
    public T c() {
        return this.O;
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (!l0.g(c(), iVar.c()) || !l0.g(f(), iVar.f())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @g
    public T f() {
        return this.P;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c().hashCode() * 31) + f().hashCode();
    }

    public boolean isEmpty() {
        return s.a.b(this);
    }

    @g
    public String toString() {
        return c() + "..<" + f();
    }
}
