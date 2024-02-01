package com.fasterxml.jackson.databind.node;

import i5.e0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.i;
import w4.l;
import w4.n;
import w4.p;
import y4.c;

public class g extends t {
    public static final g S = new g(BigDecimal.ZERO);
    public static final BigDecimal T = BigDecimal.valueOf(c.L0);
    public static final BigDecimal U = BigDecimal.valueOf(c.M0);
    public static final BigDecimal V = BigDecimal.valueOf(Long.MIN_VALUE);
    public static final BigDecimal W = BigDecimal.valueOf(Long.MAX_VALUE);
    public final BigDecimal R;

    public g(BigDecimal bigDecimal) {
        this.R = bigDecimal;
    }

    public static g u1(BigDecimal bigDecimal) {
        return new g(bigDecimal);
    }

    public float E0() {
        return this.R.floatValue();
    }

    public int M0() {
        return this.R.intValue();
    }

    public boolean N0() {
        return true;
    }

    public boolean T0() {
        return true;
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
        if (obj != null && (obj instanceof g)) {
            return ((g) obj).R.compareTo(this.R) == 0;
        }
        return false;
    }

    public String g0() {
        return this.R.toString();
    }

    public int hashCode() {
        return Double.valueOf(r0()).hashCode();
    }

    public BigInteger k0() {
        return this.R.toBigInteger();
    }

    public short m1() {
        return this.R.shortValue();
    }

    public boolean n0() {
        return this.R.compareTo(T) >= 0 && this.R.compareTo(U) <= 0;
    }

    public boolean o0() {
        return this.R.compareTo(V) >= 0 && this.R.compareTo(W) <= 0;
    }

    public BigDecimal p0() {
        return this.R;
    }

    public l.b q() {
        return l.b.BIG_DECIMAL;
    }

    public final void r(i iVar, e0 e0Var) throws IOException, n {
        iVar.r2(this.R);
    }

    public double r0() {
        return this.R.doubleValue();
    }

    public p w() {
        return p.VALUE_NUMBER_FLOAT;
    }
}
