package gf;

import fh.g;
import fh.h;

public final class e implements g<Double> {
    public final double O;
    public final double P;

    public e(double d10, double d11) {
        this.O = d10;
        this.P = d11;
    }

    public boolean a(double d10) {
        return d10 >= this.O && d10 <= this.P;
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    @g
    /* renamed from: d */
    public Double h() {
        return Double.valueOf(this.P);
    }

    public /* bridge */ /* synthetic */ boolean e(Comparable comparable, Comparable comparable2) {
        return g(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof e) {
            if (isEmpty() && ((e) obj).isEmpty()) {
                return true;
            }
            e eVar = (e) obj;
            if (this.O == eVar.O) {
                if (this.P == eVar.P) {
                    return true;
                }
            }
        }
        return false;
    }

    @g
    /* renamed from: f */
    public Double c() {
        return Double.valueOf(this.O);
    }

    public boolean g(double d10, double d11) {
        return d10 <= d11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.doubleToLongBits(this.O) * 31) + Double.doubleToLongBits(this.P);
    }

    public boolean isEmpty() {
        return this.O > this.P;
    }

    @g
    public String toString() {
        return this.O + ".." + this.P;
    }
}
