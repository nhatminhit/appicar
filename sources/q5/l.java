package q5;

import a6.h;
import i5.j;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class l extends h {
    public static final long U = 1;
    public final m R;
    public final j S;
    public final int T;

    public l(m mVar, j jVar, d0 d0Var, p pVar, int i10) {
        super(d0Var, pVar);
        this.R = mVar;
        this.S = jVar;
        this.T = i10;
    }

    public AnnotatedElement c() {
        return null;
    }

    public int e() {
        return this.R.e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!h.O(obj, l.class)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.R.equals(this.R) && lVar.T == this.T;
    }

    public String f() {
        return "";
    }

    public Class<?> g() {
        return this.S.g();
    }

    public j h() {
        return this.S;
    }

    public int hashCode() {
        return this.R.hashCode() + this.T;
    }

    public Class<?> n() {
        return this.R.n();
    }

    public Member p() {
        return this.R.p();
    }

    public Object r(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + n().getName());
    }

    public void s(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + n().getName());
    }

    public String toString() {
        return "[parameter #" + u() + ", annotations: " + this.P + "]";
    }

    public int u() {
        return this.T;
    }

    public m v() {
        return this.R;
    }

    public Type w() {
        return this.S;
    }

    /* renamed from: x */
    public l t(p pVar) {
        return pVar == this.P ? this : this.R.F(this.T, pVar);
    }
}
