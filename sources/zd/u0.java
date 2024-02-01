package zd;

import fh.g;
import fh.h;
import java.io.Serializable;
import xe.l0;

public final class u0<A, B> implements Serializable {
    public final A O;
    public final B P;

    public u0(A a10, B b10) {
        this.O = a10;
        this.P = b10;
    }

    public static /* synthetic */ u0 d(u0 u0Var, A a10, B b10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a10 = u0Var.O;
        }
        if ((i10 & 2) != 0) {
            b10 = u0Var.P;
        }
        return u0Var.c(a10, b10);
    }

    public final A a() {
        return this.O;
    }

    public final B b() {
        return this.P;
    }

    @g
    public final u0<A, B> c(A a10, B b10) {
        return new u0<>(a10, b10);
    }

    public final A e() {
        return this.O;
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return l0.g(this.O, u0Var.O) && l0.g(this.P, u0Var.P);
    }

    public final B f() {
        return this.P;
    }

    public int hashCode() {
        A a10 = this.O;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.P;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    @g
    public String toString() {
        return '(' + this.O + ", " + this.P + ')';
    }
}
