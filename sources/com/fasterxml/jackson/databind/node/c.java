package com.fasterxml.jackson.databind.node;

import i5.e0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.i;
import w4.l;
import w4.n;
import w4.p;

public class c extends t {
    public static final BigInteger S = BigInteger.valueOf(y4.c.L0);
    public static final BigInteger T = BigInteger.valueOf(y4.c.M0);
    public static final BigInteger U = BigInteger.valueOf(Long.MIN_VALUE);
    public static final BigInteger V = BigInteger.valueOf(Long.MAX_VALUE);
    public final BigInteger R;

    public c(BigInteger bigInteger) {
        this.R = bigInteger;
    }

    public static c u1(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    public float E0() {
        return this.R.floatValue();
    }

    public int M0() {
        return this.R.intValue();
    }

    public boolean O0() {
        return true;
    }

    public boolean V0() {
        return true;
    }

    public boolean Y(boolean z10) {
        return !BigInteger.ZERO.equals(this.R);
    }

    public long c1() {
        return this.R.longValue();
    }

    public Number d1() {
        return this.R;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            return ((c) obj).R.equals(this.R);
        }
        return false;
    }

    public String g0() {
        return this.R.toString();
    }

    public int hashCode() {
        return this.R.hashCode();
    }

    public BigInteger k0() {
        return this.R;
    }

    public short m1() {
        return this.R.shortValue();
    }

    public boolean n0() {
        return this.R.compareTo(S) >= 0 && this.R.compareTo(T) <= 0;
    }

    public boolean o0() {
        return this.R.compareTo(U) >= 0 && this.R.compareTo(V) <= 0;
    }

    public BigDecimal p0() {
        return new BigDecimal(this.R);
    }

    public l.b q() {
        return l.b.BIG_INTEGER;
    }

    public final void r(i iVar, e0 e0Var) throws IOException, n {
        iVar.s2(this.R);
    }

    public double r0() {
        return this.R.doubleValue();
    }

    public p w() {
        return p.VALUE_NUMBER_INT;
    }
}
