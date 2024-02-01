package yb;

import d.m0;

public class x implements Comparable<x> {
    public final int O;
    public final int P;

    public x(int i10, int i11) {
        this.O = i10;
        this.P = i11;
    }

    /* renamed from: a */
    public int compareTo(@m0 x xVar) {
        int i10 = this.P * this.O;
        int i11 = xVar.P * xVar.O;
        if (i11 < i10) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public boolean b(x xVar) {
        return this.O <= xVar.O && this.P <= xVar.P;
    }

    public x d() {
        return new x(this.P, this.O);
    }

    public x e(int i10, int i11) {
        return new x((this.O * i10) / i11, (this.P * i10) / i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.O == xVar.O && this.P == xVar.P;
    }

    public int hashCode() {
        return (this.O * 31) + this.P;
    }

    public x i(x xVar) {
        int i10 = this.O;
        int i11 = xVar.P;
        int i12 = i10 * i11;
        int i13 = xVar.O;
        int i14 = this.P;
        return i12 <= i13 * i14 ? new x(i13, (i14 * i13) / i10) : new x((i10 * i11) / i14, i11);
    }

    public x j(x xVar) {
        int i10 = this.O;
        int i11 = xVar.P;
        int i12 = i10 * i11;
        int i13 = xVar.O;
        int i14 = this.P;
        return i12 >= i13 * i14 ? new x(i13, (i14 * i13) / i10) : new x((i10 * i11) / i14, i11);
    }

    public String toString() {
        return this.O + "x" + this.P;
    }
}
