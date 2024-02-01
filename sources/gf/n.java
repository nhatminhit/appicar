package gf;

import be.t0;
import fh.g;
import fh.h;
import xe.w;

public class n implements Iterable<Long>, ye.a {
    @g
    public static final a R = new a((w) null);
    public final long O;
    public final long P;
    public final long Q;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        public final n a(long j10, long j11, long j12) {
            return new n(j10, j11, j12);
        }
    }

    public n(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j12 != Long.MIN_VALUE) {
            this.O = j10;
            this.P = oe.n.d(j10, j11, j12);
            this.Q = j12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof n) {
            if (!isEmpty() || !((n) obj).isEmpty()) {
                n nVar = (n) obj;
                if (!(this.O == nVar.O && this.P == nVar.P && this.Q == nVar.Q)) {
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
        long j10 = (long) 31;
        long j11 = this.O;
        long j12 = this.P;
        long j13 = j10 * (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32)));
        long j14 = this.Q;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        int i10 = (this.Q > 0 ? 1 : (this.Q == 0 ? 0 : -1));
        long j10 = this.O;
        long j11 = this.P;
        if (i10 > 0) {
            if (j10 > j11) {
                return true;
            }
        } else if (j10 < j11) {
            return true;
        }
        return false;
    }

    public final long l() {
        return this.O;
    }

    public final long m() {
        return this.P;
    }

    public final long n() {
        return this.Q;
    }

    @g
    /* renamed from: o */
    public t0 iterator() {
        return new o(this.O, this.P, this.Q);
    }

    @g
    public String toString() {
        long j10;
        StringBuilder sb2;
        if (this.Q > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.O);
            sb2.append("..");
            sb2.append(this.P);
            sb2.append(" step ");
            j10 = this.Q;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.O);
            sb2.append(" downTo ");
            sb2.append(this.P);
            sb2.append(" step ");
            j10 = -this.Q;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
