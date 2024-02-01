package r6;

import j6.k;
import r6.h0;
import w7.j0;
import w7.w;

public final class a0 implements h0 {

    /* renamed from: j  reason: collision with root package name */
    public static final int f12118j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f12119k = 32;

    /* renamed from: l  reason: collision with root package name */
    public static final int f12120l = 4098;

    /* renamed from: d  reason: collision with root package name */
    public final z f12121d;

    /* renamed from: e  reason: collision with root package name */
    public final w f12122e = new w(32);

    /* renamed from: f  reason: collision with root package name */
    public int f12123f;

    /* renamed from: g  reason: collision with root package name */
    public int f12124g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12125h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12126i;

    public a0(z zVar) {
        this.f12121d = zVar;
    }

    public void a(j0 j0Var, k kVar, h0.e eVar) {
        this.f12121d.a(j0Var, kVar, eVar);
        this.f12126i = true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f6 A[SYNTHETIC] */
    public void b(w7.w r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            r10 = r10 & r0
            r1 = 0
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r1
        L_0x0008:
            r2 = -1
            if (r10 == 0) goto L_0x0015
            int r3 = r9.D()
            int r4 = r9.c()
            int r4 = r4 + r3
            goto L_0x0016
        L_0x0015:
            r4 = r2
        L_0x0016:
            boolean r3 = r8.f12126i
            if (r3 == 0) goto L_0x0024
            if (r10 != 0) goto L_0x001d
            return
        L_0x001d:
            r8.f12126i = r1
            r9.Q(r4)
        L_0x0022:
            r8.f12124g = r1
        L_0x0024:
            int r10 = r9.a()
            if (r10 <= 0) goto L_0x00f6
            int r10 = r8.f12124g
            r3 = 3
            if (r10 >= r3) goto L_0x00ae
            if (r10 != 0) goto L_0x0044
            int r10 = r9.D()
            int r4 = r9.c()
            int r4 = r4 - r0
            r9.Q(r4)
            r4 = 255(0xff, float:3.57E-43)
            if (r10 != r4) goto L_0x0044
            r8.f12126i = r0
            return
        L_0x0044:
            int r10 = r9.a()
            int r4 = r8.f12124g
            int r4 = 3 - r4
            int r10 = java.lang.Math.min(r10, r4)
            w7.w r4 = r8.f12122e
            byte[] r4 = r4.f14880a
            int r5 = r8.f12124g
            r9.i(r4, r5, r10)
            int r4 = r8.f12124g
            int r4 = r4 + r10
            r8.f12124g = r4
            if (r4 != r3) goto L_0x0024
            w7.w r10 = r8.f12122e
            r10.M(r3)
            w7.w r10 = r8.f12122e
            r10.R(r0)
            w7.w r10 = r8.f12122e
            int r10 = r10.D()
            w7.w r4 = r8.f12122e
            int r4 = r4.D()
            r5 = r10 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x007c
            r5 = r0
            goto L_0x007d
        L_0x007c:
            r5 = r1
        L_0x007d:
            r8.f12125h = r5
            r10 = r10 & 15
            int r10 = r10 << 8
            r10 = r10 | r4
            int r10 = r10 + r3
            r8.f12123f = r10
            w7.w r10 = r8.f12122e
            int r10 = r10.b()
            int r4 = r8.f12123f
            if (r10 >= r4) goto L_0x0024
            w7.w r10 = r8.f12122e
            byte[] r5 = r10.f14880a
            r6 = 4098(0x1002, float:5.743E-42)
            int r7 = r5.length
            int r7 = r7 * 2
            int r4 = java.lang.Math.max(r4, r7)
            int r4 = java.lang.Math.min(r6, r4)
            r10.M(r4)
            w7.w r10 = r8.f12122e
            byte[] r10 = r10.f14880a
            java.lang.System.arraycopy(r5, r1, r10, r1, r3)
            goto L_0x0024
        L_0x00ae:
            int r10 = r9.a()
            int r3 = r8.f12123f
            int r4 = r8.f12124g
            int r3 = r3 - r4
            int r10 = java.lang.Math.min(r10, r3)
            w7.w r3 = r8.f12122e
            byte[] r3 = r3.f14880a
            int r4 = r8.f12124g
            r9.i(r3, r4, r10)
            int r3 = r8.f12124g
            int r3 = r3 + r10
            r8.f12124g = r3
            int r10 = r8.f12123f
            if (r3 != r10) goto L_0x0024
            boolean r3 = r8.f12125h
            if (r3 == 0) goto L_0x00e8
            w7.w r3 = r8.f12122e
            byte[] r3 = r3.f14880a
            int r10 = w7.q0.x(r3, r1, r10, r2)
            if (r10 == 0) goto L_0x00de
            r8.f12126i = r0
            return
        L_0x00de:
            w7.w r10 = r8.f12122e
            int r3 = r8.f12123f
            int r3 = r3 + -4
            r10.M(r3)
            goto L_0x00ed
        L_0x00e8:
            w7.w r3 = r8.f12122e
            r3.M(r10)
        L_0x00ed:
            r6.z r10 = r8.f12121d
            w7.w r3 = r8.f12122e
            r10.b(r3)
            goto L_0x0022
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.a0.b(w7.w, int):void");
    }

    public void c() {
        this.f12126i = true;
    }
}
