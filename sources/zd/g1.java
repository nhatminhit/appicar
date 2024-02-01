package zd;

import fh.g;
import fh.h;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xe.l0;
import xe.w;

public final class g1<T> implements d0<T>, Serializable {
    @g
    public static final a R = new a((w) null);
    public static final AtomicReferenceFieldUpdater<g1<?>, Object> S = AtomicReferenceFieldUpdater.newUpdater(g1.class, Object.class, "P");
    @h
    public volatile we.a<? extends T> O;
    @h
    public volatile Object P;
    @g
    public final Object Q;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public g1(@g we.a<? extends T> aVar) {
        l0.p(aVar, "initializer");
        this.O = aVar;
        n2 n2Var = n2.f25115a;
        this.P = n2Var;
        this.Q = n2Var;
    }

    public boolean a() {
        return this.P != n2.f25115a;
    }

    public final Object b() {
        return new x(getValue());
    }

    public T getValue() {
        T t10 = this.P;
        T t11 = n2.f25115a;
        if (t10 != t11) {
            return t10;
        }
        we.a<? extends T> aVar = this.O;
        if (aVar != null) {
            T n10 = aVar.n();
            if (f1.a(S, this, t11, n10)) {
                this.O = null;
                return n10;
            }
        }
        return this.P;
    }

    @g
    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
