package com.fasterxml.jackson.databind.node;

import i5.e0;
import java.io.IOException;
import w4.i;
import w4.p;

public class e extends z {
    public static final long R = 2;
    public static final e S = new e(true);
    public static final e T = new e(false);
    public final boolean Q;

    public e(boolean z10) {
        this.Q = z10;
    }

    public static e t1() {
        return T;
    }

    public static e u1() {
        return S;
    }

    public static e w1(boolean z10) {
        return z10 ? S : T;
    }

    public n H0() {
        return n.BOOLEAN;
    }

    public boolean X() {
        return this.Q;
    }

    public boolean Y(boolean z10) {
        return this.Q;
    }

    public double a0(double d10) {
        return this.Q ? 1.0d : 0.0d;
    }

    public int c0(int i10) {
        return this.Q ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof e)) {
            return this.Q == ((e) obj).Q;
        }
        return false;
    }

    public long f0(long j10) {
        return this.Q ? 1 : 0;
    }

    public String g0() {
        return this.Q ? "true" : "false";
    }

    public int hashCode() {
        return this.Q ? 3 : 1;
    }

    public boolean m0() {
        return this.Q;
    }

    public final void r(i iVar, e0 e0Var) throws IOException {
        iVar.c2(this.Q);
    }

    public Object v1() {
        return this.Q ? S : T;
    }

    public p w() {
        return this.Q ? p.VALUE_TRUE : p.VALUE_FALSE;
    }
}
