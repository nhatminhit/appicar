package zd;

import fh.g;
import fh.h;
import java.io.Serializable;
import we.a;
import xe.l0;

public final class v2<T> implements d0<T>, Serializable {
    @h
    public a<? extends T> O;
    @h
    public Object P = n2.f25115a;

    public v2(@g a<? extends T> aVar) {
        l0.p(aVar, "initializer");
        this.O = aVar;
    }

    public boolean a() {
        return this.P != n2.f25115a;
    }

    public final Object b() {
        return new x(getValue());
    }

    public T getValue() {
        if (this.P == n2.f25115a) {
            a<? extends T> aVar = this.O;
            l0.m(aVar);
            this.P = aVar.n();
            this.O = null;
        }
        return this.P;
    }

    @g
    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
