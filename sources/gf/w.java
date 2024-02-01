package gf;

import fh.g;
import fh.h;
import java.util.Iterator;
import oe.r;
import zd.e2;
import zd.h1;
import zd.t;
import zd.y2;

@h1(version = "1.5")
@y2(markerClass = {t.class})
public class w implements Iterable<e2>, ye.a {
    @g
    public static final a R = new a((xe.w) null);
    public final int O;
    public final int P;
    public final int Q;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(xe.w wVar) {
            this();
        }

        @g
        public final w a(int i10, int i11, int i12) {
            return new w(i10, i11, i12, (xe.w) null);
        }
    }

    public w(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.O = i10;
            this.P = r.d(i10, i11, i12);
            this.Q = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public /* synthetic */ w(int i10, int i11, int i12, xe.w wVar) {
        this(i10, i11, i12);
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof w) {
            if (!isEmpty() || !((w) obj).isEmpty()) {
                w wVar = (w) obj;
                if (!(this.O == wVar.O && this.P == wVar.P && this.Q == wVar.Q)) {
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
            if (Integer.compare(this.O ^ Integer.MIN_VALUE, this.P ^ Integer.MIN_VALUE) > 0) {
                return true;
            }
        } else if (Integer.compare(this.O ^ Integer.MIN_VALUE, this.P ^ Integer.MIN_VALUE) < 0) {
            return true;
        }
        return false;
    }

    @g
    public final Iterator<e2> iterator() {
        return new x(this.O, this.P, this.Q, (xe.w) null);
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
    public String toString() {
        int i10;
        StringBuilder sb2;
        if (this.Q > 0) {
            sb2 = new StringBuilder();
            sb2.append(e2.g0(this.O));
            sb2.append("..");
            sb2.append(e2.g0(this.P));
            sb2.append(" step ");
            i10 = this.Q;
        } else {
            sb2 = new StringBuilder();
            sb2.append(e2.g0(this.O));
            sb2.append(" downTo ");
            sb2.append(e2.g0(this.P));
            sb2.append(" step ");
            i10 = -this.Q;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
