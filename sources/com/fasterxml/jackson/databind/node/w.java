package com.fasterxml.jackson.databind.node;

import c5.j;
import i5.e0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.i;
import w4.l;
import w4.n;
import w4.p;

public class w extends t {
    public final short R;

    public w(short s10) {
        this.R = s10;
    }

    public static w u1(short s10) {
        return new w(s10);
    }

    public float E0() {
        return (float) this.R;
    }

    public int M0() {
        return this.R;
    }

    public boolean V0() {
        return true;
    }

    public boolean Y(boolean z10) {
        return this.R != 0;
    }

    public boolean a1() {
        return true;
    }

    public long c1() {
        return (long) this.R;
    }

    public Number d1() {
        return Short.valueOf(this.R);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof w)) {
            return ((w) obj).R == this.R;
        }
        return false;
    }

    public String g0() {
        return j.w(this.R);
    }

    public int hashCode() {
        return this.R;
    }

    public BigInteger k0() {
        return BigInteger.valueOf((long) this.R);
    }

    public short m1() {
        return this.R;
    }

    public boolean n0() {
        return true;
    }

    public boolean o0() {
        return true;
    }

    public BigDecimal p0() {
        return BigDecimal.valueOf((long) this.R);
    }

    public l.b q() {
        return l.b.INT;
    }

    public final void r(i iVar, e0 e0Var) throws IOException, n {
        iVar.t2(this.R);
    }

    public double r0() {
        return (double) this.R;
    }

    public p w() {
        return p.VALUE_NUMBER_INT;
    }
}
