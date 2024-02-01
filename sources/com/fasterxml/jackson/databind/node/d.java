package com.fasterxml.jackson.databind.node;

import i5.e0;
import java.io.IOException;
import java.util.Arrays;
import w4.a;
import w4.b;
import w4.i;
import w4.n;
import w4.p;

public class d extends z {
    public static final long R = 2;
    public static final d S = new d(new byte[0]);
    public final byte[] Q;

    public d(byte[] bArr) {
        this.Q = bArr;
    }

    public d(byte[] bArr, int i10, int i11) {
        if (i10 == 0 && i11 == bArr.length) {
            this.Q = bArr;
            return;
        }
        byte[] bArr2 = new byte[i11];
        this.Q = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static d t1(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? S : new d(bArr);
    }

    public static d u1(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return null;
        }
        return i11 == 0 ? S : new d(bArr, i10, i11);
    }

    public n H0() {
        return n.BINARY;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            return Arrays.equals(((d) obj).Q, this.Q);
        }
        return false;
    }

    public String g0() {
        return b.a().i(this.Q, false);
    }

    public int hashCode() {
        byte[] bArr = this.Q;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    public byte[] l0() {
        return this.Q;
    }

    public final void r(i iVar, e0 e0Var) throws IOException, n {
        a o10 = e0Var.q().o();
        byte[] bArr = this.Q;
        iVar.Y1(o10, bArr, 0, bArr.length);
    }

    public p w() {
        return p.VALUE_EMBEDDED_OBJECT;
    }
}
