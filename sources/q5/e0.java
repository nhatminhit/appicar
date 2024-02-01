package q5;

import a6.h;
import i5.j;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class e0 extends h implements Serializable {
    public static final long U = 1;
    public final Class<?> R;
    public final j S;
    public final String T;

    public e0(d0 d0Var, Class<?> cls, String str, j jVar) {
        super(d0Var, (p) null);
        this.R = cls;
        this.S = jVar;
        this.T = str;
    }

    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!h.O(obj, getClass())) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return e0Var.R == this.R && e0Var.T.equals(this.T);
    }

    public String f() {
        return this.T;
    }

    public Class<?> g() {
        return this.S.g();
    }

    public j h() {
        return this.S;
    }

    public int hashCode() {
        return this.T.hashCode();
    }

    public Class<?> n() {
        return this.R;
    }

    public Member p() {
        return null;
    }

    public Object r(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot get virtual property '" + this.T + "'");
    }

    public void s(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot set virtual property '" + this.T + "'");
    }

    public a t(p pVar) {
        return this;
    }

    public String toString() {
        return "[virtual " + o() + "]";
    }

    /* renamed from: u */
    public Field c() {
        return null;
    }

    public int v() {
        return 0;
    }
}
