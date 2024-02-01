package gf;

import be.t;
import fh.g;
import fh.h;
import oe.n;
import xe.l0;
import xe.w;

public class a implements Iterable<Character>, ye.a {
    @g
    public static final C0313a R = new C0313a((w) null);
    public final char O;
    public final char P;
    public final int Q;

    /* renamed from: gf.a$a  reason: collision with other inner class name */
    public static final class C0313a {
        public C0313a() {
        }

        public /* synthetic */ C0313a(w wVar) {
            this();
        }

        @g
        public final a a(char c10, char c11, int i10) {
            return new a(c10, c11, i10);
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i10 != Integer.MIN_VALUE) {
            this.O = c10;
            this.P = (char) n.c(c10, c11, i10);
            this.Q = i10;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.O == aVar.O && this.P == aVar.P && this.Q == aVar.Q)) {
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
            if (l0.t(this.O, this.P) > 0) {
                return true;
            }
        } else if (l0.t(this.O, this.P) < 0) {
            return true;
        }
        return false;
    }

    public final char l() {
        return this.O;
    }

    public final char m() {
        return this.P;
    }

    public final int n() {
        return this.Q;
    }

    @g
    /* renamed from: o */
    public t iterator() {
        return new b(this.O, this.P, this.Q);
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
