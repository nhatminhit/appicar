package gf;

import be.s0;
import fh.g;
import fh.h;
import oe.n;
import xe.w;

public class k implements Iterable<Integer>, ye.a {
    @g
    public static final a R = new a((w) null);
    public final int O;
    public final int P;
    public final int Q;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        public final k a(int i10, int i11, int i12) {
            return new k(i10, i11, i12);
        }
    }

    public k(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.O = i10;
            this.P = n.c(i10, i11, i12);
            this.Q = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof k) {
            if (!isEmpty() || !((k) obj).isEmpty()) {
                k kVar = (k) obj;
                if (!(this.O == kVar.O && this.P == kVar.P && this.Q == kVar.Q)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.O * 31) + this.P) * 31) + this.Q;
    }

    public boolean isEmpty() {
        if (this.Q > 0) {
            if (this.O > this.P) {
                return true;
            }
        } else if (this.O < this.P) {
            return true;
        }
        return false;
    }

    public final int l() {
        return this.O;
    }

    public final int m() {
        return this.P;
    }

    public final int n() {
        return this.Q;
    }

    @g
    /* renamed from: o */
    public s0 iterator() {
        return new l(this.O, this.P, this.Q);
    }

    @g
    public String toString() {
        int i10;
        StringBuilder sb2;
        if (this.Q > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.O);
            sb2.append("..");
            sb2.append(this.P);
            sb2.append(" step ");
            i10 = this.Q;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.O);
            sb2.append(" downTo ");
            sb2.append(this.P);
            sb2.append(" step ");
            i10 = -this.Q;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
