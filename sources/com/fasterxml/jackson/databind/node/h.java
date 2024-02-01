package com.fasterxml.jackson.databind.node;

import c5.j;
import i5.e0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.i;
import w4.l;
import w4.p;

public class h extends t {
    public final double R;

    public h(double d10) {
        this.R = d10;
    }

    public static h u1(double d10) {
        return new h(d10);
    }

    public float E0() {
        return (float) this.R;
    }

    public int M0() {
        return (int) this.R;
    }

    public boolean R0() {
        return true;
    }

    public boolean T0() {
        return true;
    }

    public long c1() {
        return (long) this.R;
    }

    public Number d1() {
        return Double.valueOf(this.R);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        return Double.compare(this.R, ((h) obj).R) == 0;
    }

    public String g0() {
        return j.u(this.R);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.R);
        return ((int) (doubleToLongBits >> 32)) ^ ((int) doubleToLongBits);
    }

    public BigInteger k0() {
        return p0().toBigInteger();
    }

    public short m1() {
        return (short) ((int) this.R);
    }

    public boolean n0() {
        double d10 = this.R;
        return d10 >= -2.147483648E9d && d10 <= 2.147483647E9d;
    }

    public boolean o0() {
        double d10 = this.R;
        return d10 >= -9.223372036854776E18d && d10 <= 9.223372036854776E18d;
    }

    public BigDecimal p0() {
        return BigDecimal.valueOf(this.R);
    }

    public l.b q() {
        return l.b.DOUBLE;
    }

    public final void r(i iVar, e0 e0Var) throws IOException {
        iVar.m2(this.R);
    }

    public double r0() {
        return this.R;
    }

    public boolean t1() {
        return Double.isNaN(this.R) || Double.isInfinite(this.R);
    }

    public p w() {
        return p.VALUE_NUMBER_FLOAT;
    }
}
