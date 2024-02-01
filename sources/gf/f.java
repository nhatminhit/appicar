package gf;

import fh.g;
import fh.h;

public final class f implements g<Float> {
    public final float O;
    public final float P;

    public f(float f10, float f11) {
        this.O = f10;
        this.P = f11;
    }

    public boolean a(float f10) {
        return f10 >= this.O && f10 <= this.P;
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    @g
    /* renamed from: d */
    public Float h() {
        return Float.valueOf(this.P);
    }

    public /* bridge */ /* synthetic */ boolean e(Comparable comparable, Comparable comparable2) {
        return g(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof f) {
            if (isEmpty() && ((f) obj).isEmpty()) {
                return true;
            }
            f fVar = (f) obj;
            if (this.O == fVar.O) {
                if (this.P == fVar.P) {
                    return true;
                }
            }
        }
        return false;
    }

    @g
    /* renamed from: f */
    public Float c() {
        return Float.valueOf(this.O);
    }

    public boolean g(float f10, float f11) {
        return f10 <= f11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.O) * 31) + Float.floatToIntBits(this.P);
    }

    public boolean isEmpty() {
        return this.O > this.P;
    }

    @g
    public String toString() {
        return this.O + ".." + this.P;
    }
}
