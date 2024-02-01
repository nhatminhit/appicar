package zd;

import fh.g;
import fh.h;
import gf.m;
import ve.e;
import xe.l0;
import xe.w;

@h1(version = "1.1")
public final class a0 implements Comparable<a0> {
    @g
    public static final a S = new a((w) null);
    public static final int T = 255;
    @g
    @e
    public static final a0 U = b0.a();
    public final int O;
    public final int P;
    public final int Q;
    public final int R;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public a0(int i10, int i11) {
        this(i10, i11, 0);
    }

    public a0(int i10, int i11, int i12) {
        this.O = i10;
        this.P = i11;
        this.Q = i12;
        this.R = k(i10, i11, i12);
    }

    /* renamed from: a */
    public int compareTo(@g a0 a0Var) {
        l0.p(a0Var, "other");
        return this.R - a0Var.R;
    }

    public final int b() {
        return this.O;
    }

    public final int d() {
        return this.P;
    }

    public final int e() {
        return this.Q;
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        a0 a0Var = obj instanceof a0 ? (a0) obj : null;
        if (a0Var == null) {
            return false;
        }
        return this.R == a0Var.R;
    }

    public int hashCode() {
        return this.R;
    }

    public final boolean i(int i10, int i11) {
        int i12 = this.O;
        return i12 > i10 || (i12 == i10 && this.P >= i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = r1.P;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(int r2, int r3, int r4) {
        /*
            r1 = this;
            int r0 = r1.O
            if (r0 > r2) goto L_0x0013
            if (r0 != r2) goto L_0x0011
            int r2 = r1.P
            if (r2 > r3) goto L_0x0013
            if (r2 != r3) goto L_0x0011
            int r2 = r1.Q
            if (r2 < r4) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.a0.j(int, int, int):boolean");
    }

    public final int k(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new m(0, 255).q(i10) && new m(0, 255).q(i11) && new m(0, 255).q(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.O);
        sb2.append('.');
        sb2.append(this.P);
        sb2.append('.');
        sb2.append(this.Q);
        return sb2.toString();
    }
}
