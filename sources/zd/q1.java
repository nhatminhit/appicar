package zd;

import fh.g;
import fh.h;
import java.io.Serializable;
import xe.l0;

public final class q1<A, B, C> implements Serializable {
    public final A O;
    public final B P;
    public final C Q;

    public q1(A a10, B b10, C c10) {
        this.O = a10;
        this.P = b10;
        this.Q = c10;
    }

    public static /* synthetic */ q1 e(q1 q1Var, A a10, B b10, C c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a10 = q1Var.O;
        }
        if ((i10 & 2) != 0) {
            b10 = q1Var.P;
        }
        if ((i10 & 4) != 0) {
            c10 = q1Var.Q;
        }
        return q1Var.d(a10, b10, c10);
    }

    public final A a() {
        return this.O;
    }

    public final B b() {
        return this.P;
    }

    public final C c() {
        return this.Q;
    }

    @g
    public final q1<A, B, C> d(A a10, B b10, C c10) {
        return new q1<>(a10, b10, c10);
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return l0.g(this.O, q1Var.O) && l0.g(this.P, q1Var.P) && l0.g(this.Q, q1Var.Q);
    }

    public final A f() {
        return this.O;
    }

    public final B g() {
        return this.P;
    }

    public final C h() {
        return this.Q;
    }

    public int hashCode() {
        A a10 = this.O;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.P;
        int hashCode2 = (hashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.Q;
        if (c10 != null) {
            i10 = c10.hashCode();
        }
        return hashCode2 + i10;
    }

    @g
    public String toString() {
        return '(' + this.O + ", " + this.P + ", " + this.Q + ')';
    }
}
