package i5;

import a6.h;
import c5.m;
import h5.g;
import java.io.Serializable;
import k5.i;
import p7.a;
import w4.u;

public class y implements Serializable {
    public static final long R = 1;
    public static final String S = "";
    public static final String T = "";
    public static final y U = new y("", (String) null);
    public static final y V = new y(new String(""), (String) null);
    public final String O;
    public final String P;
    public u Q;

    public y(String str) {
        this(str, (String) null);
    }

    public y(String str, String str2) {
        this.O = h.g0(str);
        this.P = str2;
    }

    public static y a(String str) {
        return (str == null || str.length() == 0) ? U : new y(g.R.b(str), (String) null);
    }

    public static y b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.length() == 0) ? U : new y(g.R.b(str), str2);
    }

    public String c() {
        return this.P;
    }

    public String d() {
        return this.O;
    }

    public boolean e() {
        return this.P != null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        y yVar = (y) obj;
        String str = this.O;
        if (str == null) {
            if (yVar.O != null) {
                return false;
            }
        } else if (!str.equals(yVar.O)) {
            return false;
        }
        String str2 = this.P;
        String str3 = yVar.P;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public boolean f() {
        return this.O.length() > 0;
    }

    public boolean g(String str) {
        return this.O.equals(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = h5.g.R.b(r3.O);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.y h() {
        /*
            r3 = this;
            java.lang.String r0 = r3.O
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0009
            return r3
        L_0x0009:
            h5.g r0 = h5.g.R
            java.lang.String r1 = r3.O
            java.lang.String r0 = r0.b(r1)
            java.lang.String r1 = r3.O
            if (r0 != r1) goto L_0x0016
            return r3
        L_0x0016:
            i5.y r1 = new i5.y
            java.lang.String r2 = r3.P
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.y.h():i5.y");
    }

    public int hashCode() {
        String str = this.P;
        return str == null ? this.O.hashCode() : str.hashCode() ^ this.O.hashCode();
    }

    public boolean i() {
        return this.P == null && this.O.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.O;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object j() {
        /*
            r2 = this;
            java.lang.String r0 = r2.P
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = r2.O
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
        L_0x0010:
            i5.y r0 = U
            return r0
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.y.j():java.lang.Object");
    }

    public u k(i<?> iVar) {
        u uVar = this.Q;
        if (uVar != null) {
            return uVar;
        }
        u mVar = iVar == null ? new m(this.O) : iVar.e(this.O);
        this.Q = mVar;
        return mVar;
    }

    public y l(String str) {
        String str2 = this.P;
        if (str == null) {
            if (str2 == null) {
                return this;
            }
        } else if (str.equals(str2)) {
            return this;
        }
        return new y(this.O, str);
    }

    public y m(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this.O) ? this : new y(str, this.P);
    }

    public String toString() {
        if (this.P == null) {
            return this.O;
        }
        return a.f11638i + this.P + a.f11639j + this.O;
    }
}
