package gf;

import fh.g;
import fh.h;

public final class r implements s<Float> {
    public final float O;
    public final float P;

    public r(float f10, float f11) {
        this.O = f10;
        this.P = f11;
    }

    public boolean a(float f10) {
        return f10 >= this.O && f10 < this.P;
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    @g
    /* renamed from: d */
    public Float f() {
        return Float.valueOf(this.P);
    }

    @g
    /* renamed from: e */
    public Float c() {
        return Float.valueOf(this.O);
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof r) {
            if (isEmpty() && ((r) obj).isEmpty()) {
                return true;
            }
            r rVar = (r) obj;
            if (this.O == rVar.O) {
                if (this.P == rVar.P) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(float f10, float f11) {
        return f10 <= f11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.O) * 31) + Float.floatToIntBits(this.P);
    }

    public boolean isEmpty() {
        return this.O >= this.P;
    }

    @g
    public String toString() {
        return this.O + "..<" + this.P;
    }
}
