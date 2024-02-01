package com.fasterxml.jackson.databind.node;

import i5.e0;
import i5.m;
import java.io.IOException;
import w4.i;
import w4.n;

public final class p extends z {
    public static final long Q = 1;
    public static final p R = new p();

    public static p t1() {
        return R;
    }

    public n H0() {
        return n.MISSING;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public String g0() {
        return "";
    }

    public m g1() {
        return (m) V("require() called on `MissingNode`", new Object[0]);
    }

    public boolean h() {
        return true;
    }

    public String h0(String str) {
        return str;
    }

    public m h1() {
        return (m) V("requireNonNull() called on `MissingNode`", new Object[0]);
    }

    public int hashCode() {
        return n.MISSING.ordinal();
    }

    public String o1() {
        return "";
    }

    public <T extends m> T q0() {
        return this;
    }

    public final void r(i iVar, e0 e0Var) throws IOException, n {
        iVar.k2();
    }

    public String toString() {
        return "";
    }

    public Object u1() {
        return R;
    }

    public w4.p w() {
        return w4.p.NOT_AVAILABLE;
    }

    public void y(i iVar, e0 e0Var, u5.i iVar2) throws IOException, n {
        iVar.k2();
    }
}
