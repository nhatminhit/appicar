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
import y4.c;

public class o extends t {
    public final long R;

    public o(long j10) {
        this.R = j10;
    }

    public static o u1(long j10) {
        return new o(j10);
    }

    public float E0() {
        return (float) this.R;
    }

    public int M0() {
        return (int) this.R;
    }

    public boolean V0() {
        return true;
    }

    public boolean W0() {
        return true;
    }

    public boolean Y(boolean z10) {
        return this.R != 0;
    }

    public long c1() {
        return this.R;
    }

    public Number d1() {
        return Long.valueOf(this.R);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof o)) {
            return ((o) obj).R == this.R;
        }
        return false;
    }

    public String g0() {
        return j.x(this.R);
    }

    public int hashCode() {
        long j10 = this.R;
        return ((int) (j10 >> 32)) ^ ((int) j10);
    }

    public BigInteger k0() {
        return BigInteger.valueOf(this.R);
    }

    public short m1() {
        return (short) ((int) this.R);
    }

    public boolean n0() {
        long j10 = this.R;
        return j10 >= c.L0 && j10 <= c.M0;
    }

    public boolean o0() {
        return true;
    }

    public BigDecimal p0() {
        return BigDecimal.valueOf(this.R);
    }

    public l.b q() {
        return l.b.LONG;
    }

    public final void r(i iVar, e0 e0Var) throws IOException, n {
        iVar.p2(this.R);
    }

    public double r0() {
        return (double) this.R;
    }

    public p w() {
        return p.VALUE_NUMBER_INT;
    }
}
