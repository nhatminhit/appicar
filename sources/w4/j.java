package w4;

import java.io.Serializable;

public class j implements Serializable {
    public static final long T = 1;
    public static final int U = 500;
    public static final j V = new j((Object) null, -1, -1, -1, -1);
    public final long O;
    public final long P;
    public final int Q;
    public final int R;
    public final transient Object S;

    public j(Object obj, long j10, int i10, int i11) {
        this(obj, -1, j10, i10, i11);
    }

    public j(Object obj, long j10, long j11, int i10, int i11) {
        this.S = obj;
        this.O = j10;
        this.P = j11;
        this.Q = i10;
        this.R = i11;
    }

    public final int a(StringBuilder sb2, String str) {
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return str.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StringBuilder b(java.lang.StringBuilder r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.S
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "UNKNOWN"
            r7.append(r0)
            return r7
        L_0x000a:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0012
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            goto L_0x0016
        L_0x0012:
            java.lang.Class r1 = r0.getClass()
        L_0x0016:
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "java."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0027
            java.lang.String r2 = r1.getSimpleName()
            goto L_0x0034
        L_0x0027:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "byte[]"
            goto L_0x0034
        L_0x002e:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L_0x0034
            java.lang.String r2 = "char[]"
        L_0x0034:
            r1 = 40
            r7.append(r1)
            r7.append(r2)
            r1 = 41
            r7.append(r1)
            boolean r1 = r0 instanceof java.lang.CharSequence
            r2 = 500(0x1f4, float:7.0E-43)
            r3 = 0
            java.lang.String r4 = " chars"
            if (r1 == 0) goto L_0x0063
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r0.length()
            int r2 = java.lang.Math.min(r1, r2)
            java.lang.CharSequence r0 = r0.subSequence(r3, r2)
            java.lang.String r0 = r0.toString()
            int r0 = r6.a(r7, r0)
        L_0x0060:
            int r3 = r1 - r0
            goto L_0x0096
        L_0x0063:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L_0x0078
            char[] r0 = (char[]) r0
            int r1 = r0.length
            java.lang.String r5 = new java.lang.String
            int r2 = java.lang.Math.min(r1, r2)
            r5.<init>(r0, r3, r2)
            int r0 = r6.a(r7, r5)
            goto L_0x0060
        L_0x0078:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L_0x0096
            byte[] r0 = (byte[]) r0
            int r1 = r0.length
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r2.<init>(r0, r3, r1, r4)
            r6.a(r7, r2)
            int r0 = r0.length
            int r3 = r0 - r1
            java.lang.String r4 = " bytes"
        L_0x0096:
            if (r3 <= 0) goto L_0x00a8
            java.lang.String r0 = "[truncated "
            r7.append(r0)
            r7.append(r3)
            r7.append(r4)
            r0 = 93
            r7.append(r0)
        L_0x00a8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.j.b(java.lang.StringBuilder):java.lang.StringBuilder");
    }

    public long c() {
        return this.O;
    }

    public long d() {
        return this.P;
    }

    public int e() {
        return this.R;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        Object obj2 = this.S;
        if (obj2 == null) {
            if (jVar.S != null) {
                return false;
            }
        } else if (!obj2.equals(jVar.S)) {
            return false;
        }
        return this.Q == jVar.Q && this.R == jVar.R && this.P == jVar.P && c() == jVar.c();
    }

    public int f() {
        return this.Q;
    }

    public Object g() {
        return this.S;
    }

    public String h() {
        return b(new StringBuilder(100)).toString();
    }

    public int hashCode() {
        Object obj = this.S;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.Q) + this.R) ^ ((int) this.P)) + ((int) this.O);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append("[Source: ");
        b(sb2);
        sb2.append("; line: ");
        sb2.append(this.Q);
        sb2.append(", column: ");
        sb2.append(this.R);
        sb2.append(']');
        return sb2.toString();
    }
}
