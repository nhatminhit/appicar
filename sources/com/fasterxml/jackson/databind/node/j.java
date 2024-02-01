package com.fasterxml.jackson.databind.node;

import i5.e0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.i;
import w4.l;
import w4.n;
import w4.p;

public class j extends t {
    public static final int S = -1;
    public static final int T = 10;
    public static final j[] U = new j[12];
    public final int R;

    static {
        for (int i10 = 0; i10 < 12; i10++) {
            U[i10] = new j(i10 - 1);
        }
    }

    public j(int i10) {
        this.R = i10;
    }

    public static j u1(int i10) {
        return (i10 > 10 || i10 < -1) ? new j(i10) : U[i10 - -1];
    }

    public float E0() {
        return (float) this.R;
    }

    public int M0() {
        return this.R;
    }

    public boolean U0() {
        return true;
    }

    public boolean V0() {
        return true;
    }

    public boolean Y(boolean z10) {
        return this.R != 0;
    }

    public long c1() {
        return (long) this.R;
    }

    public Number d1() {
        return Integer.valueOf(this.R);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof j)) {
            return ((j) obj).R == this.R;
        }
        return false;
    }

    public String g0() {
        return c5.j.w(this.R);
    }

    public int hashCode() {
        return this.R;
    }

    public BigInteger k0() {
        return BigInteger.valueOf((long) this.R);
    }

    public short m1() {
        return (short) this.R;
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
        iVar.o2(this.R);
    }

    public double r0() {
        return (double) this.R;
    }

    public p w() {
        return p.VALUE_NUMBER_INT;
    }
}
