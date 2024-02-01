package com.fasterxml.jackson.databind.node;

import c5.a;
import c5.i;
import h5.c;
import i5.e0;
import java.io.IOException;
import w4.b;
import w4.l;
import w4.p;

public class x extends z {
    public static final long R = 2;
    public static final x S = new x("");
    public final String Q;

    public x(String str) {
        this.Q = str;
    }

    @Deprecated
    public static void t1(StringBuilder sb2, String str) {
        sb2.append('\"');
        a.b(sb2, str);
        sb2.append('\"');
    }

    public static x v1(String str) {
        if (str == null) {
            return null;
        }
        return str.length() == 0 ? S : new x(str);
    }

    public n H0() {
        return n.STRING;
    }

    public boolean Y(boolean z10) {
        String str = this.Q;
        if (str == null) {
            return z10;
        }
        String trim = str.trim();
        if ("true".equals(trim)) {
            return true;
        }
        if ("false".equals(trim)) {
            return false;
        }
        return z10;
    }

    public double a0(double d10) {
        return i.d(this.Q, d10);
    }

    public int c0(int i10) {
        return i.e(this.Q, i10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof x)) {
            return ((x) obj).Q.equals(this.Q);
        }
        return false;
    }

    public long f0(long j10) {
        return i.f(this.Q, j10);
    }

    public String g0() {
        return this.Q;
    }

    public String h0(String str) {
        String str2 = this.Q;
        return str2 == null ? str : str2;
    }

    public int hashCode() {
        return this.Q.hashCode();
    }

    public byte[] l0() throws IOException {
        return u1(b.a());
    }

    public String n1() {
        return this.Q;
    }

    public final void r(w4.i iVar, e0 e0Var) throws IOException {
        String str = this.Q;
        if (str == null) {
            iVar.k2();
        } else {
            iVar.Z2(str);
        }
    }

    public byte[] u1(w4.a aVar) throws IOException {
        String trim = this.Q.trim();
        c cVar = new c(((trim.length() * 3) >> 2) + 4);
        try {
            aVar.c(trim, cVar);
            return cVar.P();
        } catch (IllegalArgumentException e10) {
            throw o5.c.E((l) null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", new Object[]{e10.getMessage()}), trim, byte[].class);
        }
    }

    public p w() {
        return p.VALUE_STRING;
    }
}
