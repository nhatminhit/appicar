package com.fasterxml.jackson.databind.node;

import i5.e0;
import i5.m;
import java.io.IOException;
import w4.i;
import w4.p;

public class s extends z {
    public static final long Q = 1;
    public static final s R = new s();

    public static s t1() {
        return R;
    }

    public n H0() {
        return n.NULL;
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof s);
    }

    public String g0() {
        return "null";
    }

    public String h0(String str) {
        return str;
    }

    public m h1() {
        return (m) V("requireNonNull() called on `NullNode`", new Object[0]);
    }

    public int hashCode() {
        return n.NULL.ordinal();
    }

    public final void r(i iVar, e0 e0Var) throws IOException {
        e0Var.R(iVar);
    }

    public Object u1() {
        return R;
    }

    public p w() {
        return p.VALUE_NULL;
    }
}
