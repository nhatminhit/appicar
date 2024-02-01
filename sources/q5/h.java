package q5;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

public abstract class h extends a implements Serializable {
    public static final long Q = 1;
    public final transient d0 O;
    public final transient p P;

    public h(d0 d0Var, p pVar) {
        this.O = d0Var;
        this.P = pVar;
    }

    public h(h hVar) {
        this.O = hVar.O;
        this.P = hVar.P;
    }

    @Deprecated
    public Iterable<Annotation> b() {
        p pVar = this.P;
        return pVar == null ? Collections.emptyList() : pVar.g();
    }

    public final <A extends Annotation> A d(Class<A> cls) {
        p pVar = this.P;
        if (pVar == null) {
            return null;
        }
        return pVar.a(cls);
    }

    public final boolean i(Class<?> cls) {
        p pVar = this.P;
        if (pVar == null) {
            return false;
        }
        return pVar.b(cls);
    }

    public boolean j(Class<? extends Annotation>[] clsArr) {
        p pVar = this.P;
        if (pVar == null) {
            return false;
        }
        return pVar.c(clsArr);
    }

    public final void l(boolean z10) {
        Member p10 = p();
        if (p10 != null) {
            a6.h.g(p10, z10);
        }
    }

    public p m() {
        return this.P;
    }

    public abstract Class<?> n();

    public String o() {
        return n().getName() + "#" + f();
    }

    public abstract Member p();

    @Deprecated
    public d0 q() {
        return this.O;
    }

    public abstract Object r(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract void s(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract a t(p pVar);
}
