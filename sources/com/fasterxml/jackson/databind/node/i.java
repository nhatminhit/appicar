package com.fasterxml.jackson.databind.node;

import c5.j;
import i5.e0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.l;
import w4.p;

public class i extends t {
    public final float R;

    public i(float f10) {
        this.R = f10;
    }

    public static i u1(float f10) {
        return new i(f10);
    }

    public float E0() {
        return this.R;
    }

    public int M0() {
        return (int) this.R;
    }

    public boolean S0() {
        return true;
    }

    public boolean T0() {
        return true;
    }

    public long c1() {
        return (long) this.R;
    }

    public Number d1() {
        return Float.valueOf(this.R);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        return Float.compare(this.R, ((i) obj).R) == 0;
    }

    public String g0() {
        return j.v(this.R);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.R);
    }

    public BigInteger k0() {
        return p0().toBigInteger();
    }

    public short m1() {
        return (short) ((int) this.R);
    }

    public boolean n0() {
        float f10 = this.R;
        return f10 >= -2.14748365E9f && f10 <= 2.14748365E9f;
    }

    public boolean o0() {
        float f10 = this.R;
        return f10 >= -9.223372E18f && f10 <= 9.223372E18f;
    }

    public BigDecimal p0() {
        return BigDecimal.valueOf((double) this.R);
    }

    public l.b q() {
        return l.b.FLOAT;
    }

    public final void r(w4.i iVar, e0 e0Var) throws IOException {
        iVar.n2(this.R);
    }

    public double r0() {
        return (double) this.R;
    }

    public boolean t1() {
        return Float.isNaN(this.R) || Float.isInfinite(this.R);
    }

    public p w() {
        return p.VALUE_NUMBER_FLOAT;
    }
}
