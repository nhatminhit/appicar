package com.google.android.gms.internal.common;

public abstract class h0 extends u {
    public final CharSequence Q;
    public final z R;
    public final boolean S;
    public int T = 0;
    public int U;

    public h0(i0 i0Var, CharSequence charSequence) {
        this.R = i0Var.f5837a;
        this.S = i0Var.f5838b;
        this.U = Integer.MAX_VALUE;
        this.Q = charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0 >= r1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r5.Q.charAt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r0 >= r1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r5.Q.charAt(r1 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r5.S == false) goto L_0x0045;
     */
    @javax.annotation.CheckForNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r5.T
        L_0x0002:
            int r1 = r5.T
            r2 = -1
            if (r1 == r2) goto L_0x006a
            int r1 = r5.d(r1)
            if (r1 != r2) goto L_0x0017
            java.lang.CharSequence r1 = r5.Q
            int r1 = r1.length()
            r5.T = r2
            r3 = r2
            goto L_0x001d
        L_0x0017:
            int r3 = r5.c(r1)
            r5.T = r3
        L_0x001d:
            if (r3 != r0) goto L_0x002e
            int r3 = r3 + 1
            r5.T = r3
            java.lang.CharSequence r1 = r5.Q
            int r1 = r1.length()
            if (r3 <= r1) goto L_0x0002
            r5.T = r2
            goto L_0x0002
        L_0x002e:
            if (r0 >= r1) goto L_0x0035
            java.lang.CharSequence r3 = r5.Q
            r3.charAt(r0)
        L_0x0035:
            if (r0 >= r1) goto L_0x003e
            java.lang.CharSequence r3 = r5.Q
            int r4 = r1 + -1
            r3.charAt(r4)
        L_0x003e:
            boolean r3 = r5.S
            if (r3 == 0) goto L_0x0045
            if (r0 != r1) goto L_0x0045
            goto L_0x0000
        L_0x0045:
            int r3 = r5.U
            r4 = 1
            if (r3 != r4) goto L_0x005c
            java.lang.CharSequence r1 = r5.Q
            int r1 = r1.length()
            r5.T = r2
            if (r1 <= r0) goto L_0x005f
            java.lang.CharSequence r2 = r5.Q
            int r3 = r1 + -1
            r2.charAt(r3)
            goto L_0x005f
        L_0x005c:
            int r3 = r3 + r2
            r5.U = r3
        L_0x005f:
            java.lang.CharSequence r2 = r5.Q
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L_0x006e
        L_0x006a:
            r5.b()
            r0 = 0
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.common.h0.a():java.lang.Object");
    }

    public abstract int c(int i10);

    public abstract int d(int i10);
}
