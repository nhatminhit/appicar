package com.fasterxml.jackson.databind.node;

import i5.e0;
import i5.n;
import java.io.IOException;
import w4.i;
import w4.p;

public class v extends z {
    public static final long R = 2;
    public final Object Q;

    public v(Object obj) {
        this.Q = obj;
    }

    public n H0() {
        return n.POJO;
    }

    public boolean Y(boolean z10) {
        Object obj = this.Q;
        return (obj == null || !(obj instanceof Boolean)) ? z10 : ((Boolean) obj).booleanValue();
    }

    public double a0(double d10) {
        Object obj = this.Q;
        return obj instanceof Number ? ((Number) obj).doubleValue() : d10;
    }

    public int c0(int i10) {
        Object obj = this.Q;
        return obj instanceof Number ? ((Number) obj).intValue() : i10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof v)) {
            return t1((v) obj);
        }
        return false;
    }

    public long f0(long j10) {
        Object obj = this.Q;
        return obj instanceof Number ? ((Number) obj).longValue() : j10;
    }

    public String g0() {
        Object obj = this.Q;
        return obj == null ? "null" : obj.toString();
    }

    public String h0(String str) {
        Object obj = this.Q;
        return obj == null ? str : obj.toString();
    }

    public int hashCode() {
        return this.Q.hashCode();
    }

    public byte[] l0() throws IOException {
        Object obj = this.Q;
        return obj instanceof byte[] ? (byte[]) obj : super.l0();
    }

    public final void r(i iVar, e0 e0Var) throws IOException {
        Object obj = this.Q;
        if (obj == null) {
            e0Var.R(iVar);
        } else if (obj instanceof n) {
            ((n) obj).r(iVar, e0Var);
        } else {
            e0Var.S(obj, iVar);
        }
    }

    public boolean t1(v vVar) {
        Object obj = this.Q;
        Object obj2 = vVar.Q;
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public Object u1() {
        return this.Q;
    }

    public p w() {
        return p.VALUE_EMBEDDED_OBJECT;
    }
}
