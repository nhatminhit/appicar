package w4;

import java.io.Serializable;

public class b0 implements Comparable<b0>, Serializable {
    public static final long U = 1;
    public static final b0 V = new b0(0, 0, 0, (String) null, (String) null, (String) null);
    public final int O;
    public final int P;
    public final int Q;
    public final String R;
    public final String S;
    public final String T;

    @Deprecated
    public b0(int i10, int i11, int i12, String str) {
        this(i10, i11, i12, str, (String) null, (String) null);
    }

    public b0(int i10, int i11, int i12, String str, String str2, String str3) {
        this.O = i10;
        this.P = i11;
        this.Q = i12;
        this.T = str;
        this.R = str2 == null ? "" : str2;
        this.S = str3 == null ? "" : str3;
    }

    public static b0 o() {
        return V;
    }

    /* renamed from: a */
    public int compareTo(b0 b0Var) {
        if (b0Var == this) {
            return 0;
        }
        int compareTo = this.R.compareTo(b0Var.R);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.S.compareTo(b0Var.S);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        int i10 = this.O - b0Var.O;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.P - b0Var.P;
        return i11 == 0 ? this.Q - b0Var.Q : i11;
    }

    public String b() {
        return this.S;
    }

    public String d() {
        return this.R;
    }

    public int e() {
        return this.O;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return b0Var.O == this.O && b0Var.P == this.P && b0Var.Q == this.Q && b0Var.S.equals(this.S) && b0Var.R.equals(this.R);
    }

    public int hashCode() {
        return this.S.hashCode() ^ (((this.R.hashCode() + this.O) - this.P) + this.Q);
    }

    public int i() {
        return this.P;
    }

    public int j() {
        return this.Q;
    }

    public boolean k() {
        String str = this.T;
        return str != null && str.length() > 0;
    }

    @Deprecated
    public boolean l() {
        return m();
    }

    public boolean m() {
        return this == V;
    }

    public String n() {
        return this.R + '/' + this.S + '/' + toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.O);
        sb2.append('.');
        sb2.append(this.P);
        sb2.append('.');
        sb2.append(this.Q);
        if (k()) {
            sb2.append('-');
            sb2.append(this.T);
        }
        return sb2.toString();
    }
}
