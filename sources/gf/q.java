package gf;

import fh.g;
import fh.h;

public final class q implements s<Double> {
    public final double O;
    public final double P;

    public q(double d10, double d11) {
        this.O = d10;
        this.P = d11;
    }

    public boolean a(double d10) {
        return d10 >= this.O && d10 < this.P;
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    @g
    /* renamed from: d */
    public Double f() {
        return Double.valueOf(this.P);
    }

    @g
    /* renamed from: e */
    public Double c() {
        return Double.valueOf(this.O);
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof q) {
            if (isEmpty() && ((q) obj).isEmpty()) {
                return true;
            }
            q qVar = (q) obj;
            if (this.O == qVar.O) {
                if (this.P == qVar.P) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(double d10, double d11) {
        return d10 <= d11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.doubleToLongBits(this.O) * 31) + Double.doubleToLongBits(this.P);
    }

    public boolean isEmpty() {
        return this.O >= this.P;
    }

    @g
    public String toString() {
        return this.O + "..<" + this.P;
    }
}
