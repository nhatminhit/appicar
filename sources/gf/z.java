package gf;

import fh.g;
import fh.h;
import java.util.Iterator;
import oe.r;
import xe.w;
import zd.h1;
import zd.j2;
import zd.t;
import zd.y2;

@h1(version = "1.5")
@y2(markerClass = {t.class})
public class z implements Iterable<j2>, ye.a {
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
        public final z a(long j10, long j11, long j12) {
            return new z(j10, j11, j12, (w) null);
        }
    }

    public z(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j12 != Long.MIN_VALUE) {
            this.O = j10;
            this.P = r.c(j10, j11, j12);
            this.Q = j12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public /* synthetic */ z(long j10, long j11, long j12, w wVar) {
        this(j10, j11, j12);
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof z) {
            if (!isEmpty() || !((z) obj).isEmpty()) {
                z zVar = (z) obj;
                if (!(this.O == zVar.O && this.P == zVar.P && this.Q == zVar.Q)) {
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
        long j10 = this.O;
        long j11 = this.P;
        long j12 = this.Q;
        return (((((int) j2.l(j10 ^ j2.l(j10 >>> 32))) * 31) + ((int) j2.l(j11 ^ j2.l(j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public boolean isEmpty() {
        int i10 = (this.Q > 0 ? 1 : (this.Q == 0 ? 0 : -1));
        long j10 = this.O;
        long j11 = this.P;
        if (i10 > 0) {
            if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0) {
                return true;
            }
        } else if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0) {
            return true;
        }
        return false;
    }

    @g
    public final Iterator<j2> iterator() {
        return new a0(this.O, this.P, this.Q, (w) null);
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
    public String toString() {
        long j10;
        StringBuilder sb2;
        if (this.Q > 0) {
            sb2 = new StringBuilder();
            sb2.append(j2.g0(this.O));
            sb2.append("..");
            sb2.append(j2.g0(this.P));
            sb2.append(" step ");
            j10 = this.Q;
        } else {
            sb2 = new StringBuilder();
            sb2.append(j2.g0(this.O));
            sb2.append(" downTo ");
            sb2.append(j2.g0(this.P));
            sb2.append(" step ");
            j10 = -this.Q;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
