package zd;

import fh.g;
import fh.h;
import java.io.Serializable;
import we.a;
import xe.l0;
import xe.w;

public final class o1<T> implements d0<T>, Serializable {
    @h
    public a<? extends T> O;
    @h
    public volatile Object P;
    @g
    public final Object Q;

    public o1(@g a<? extends T> aVar, @h Object obj) {
        l0.p(aVar, "initializer");
        this.O = aVar;
        this.P = n2.f25115a;
        this.Q = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(a aVar, Object obj, int i10, w wVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.P != n2.f25115a;
    }

    public final Object b() {
        return new x(getValue());
    }

    public T getValue() {
        T t10;
        T t11 = this.P;
        T t12 = n2.f25115a;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this.Q) {
            t10 = this.P;
            if (t10 == t12) {
                a aVar = this.O;
                l0.m(aVar);
                t10 = aVar.n();
                this.P = t10;
                this.O = null;
            }
        }
        return t10;
    }

    @g
    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
