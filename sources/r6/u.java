package r6;

import b6.c;
import j6.k;
import r6.h0;
import w7.j0;
import w7.p;
import w7.v;
import w7.w;

public final class u implements h0 {

    /* renamed from: p  reason: collision with root package name */
    public static final String f12508p = "PesReader";

    /* renamed from: q  reason: collision with root package name */
    public static final int f12509q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f12510r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12511s = 2;

    /* renamed from: t  reason: collision with root package name */
    public static final int f12512t = 3;

    /* renamed from: u  reason: collision with root package name */
    public static final int f12513u = 9;

    /* renamed from: v  reason: collision with root package name */
    public static final int f12514v = 10;

    /* renamed from: w  reason: collision with root package name */
    public static final int f12515w = 10;

    /* renamed from: d  reason: collision with root package name */
    public final m f12516d;

    /* renamed from: e  reason: collision with root package name */
    public final v f12517e = new v(new byte[10]);

    /* renamed from: f  reason: collision with root package name */
    public int f12518f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f12519g;

    /* renamed from: h  reason: collision with root package name */
    public j0 f12520h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12521i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12522j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12523k;

    /* renamed from: l  reason: collision with root package name */
    public int f12524l;

    /* renamed from: m  reason: collision with root package name */
    public int f12525m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12526n;

    /* renamed from: o  reason: collision with root package name */
    public long f12527o;

    public u(m mVar) {
        this.f12516d = mVar;
    }

    public void a(j0 j0Var, k kVar, h0.e eVar) {
        this.f12520h = j0Var;
        this.f12516d.e(kVar, eVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d3 A[SYNTHETIC] */
    public final void b(w7.w r8, int r9) throws b6.j0 {
        /*
            r7 = this;
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0042
            int r0 = r7.f12518f
            if (r0 == 0) goto L_0x003f
            if (r0 == r4) goto L_0x003f
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L_0x003a
            if (r0 != r2) goto L_0x0034
            int r0 = r7.f12525m
            if (r0 == r1) goto L_0x0077
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unexpected start indicator: expected "
            r0.append(r6)
            int r6 = r7.f12525m
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            w7.p.l(r5, r0)
            goto L_0x0077
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x003a:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            w7.p.l(r5, r0)
        L_0x003f:
            r7.g(r4)
        L_0x0042:
            int r0 = r8.a()
            if (r0 <= 0) goto L_0x00d3
            int r0 = r7.f12518f
            if (r0 == 0) goto L_0x00ca
            r5 = 0
            if (r0 == r4) goto L_0x00b2
            if (r0 == r3) goto L_0x0083
            if (r0 != r2) goto L_0x007d
            int r0 = r8.a()
            int r6 = r7.f12525m
            if (r6 != r1) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            int r5 = r0 - r6
        L_0x005e:
            if (r5 <= 0) goto L_0x0069
            int r0 = r0 - r5
            int r5 = r8.c()
            int r5 = r5 + r0
            r8.P(r5)
        L_0x0069:
            r6.m r5 = r7.f12516d
            r5.b(r8)
            int r5 = r7.f12525m
            if (r5 == r1) goto L_0x0042
            int r5 = r5 - r0
            r7.f12525m = r5
            if (r5 != 0) goto L_0x0042
        L_0x0077:
            r6.m r0 = r7.f12516d
            r0.d()
            goto L_0x003f
        L_0x007d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0083:
            r0 = 10
            int r6 = r7.f12524l
            int r0 = java.lang.Math.min(r0, r6)
            w7.v r6 = r7.f12517e
            byte[] r6 = r6.f14876a
            boolean r0 = r7.d(r8, r6, r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            int r6 = r7.f12524l
            boolean r0 = r7.d(r8, r0, r6)
            if (r0 == 0) goto L_0x0042
            r7.f()
            boolean r0 = r7.f12526n
            if (r0 == 0) goto L_0x00a6
            r5 = 4
        L_0x00a6:
            r9 = r9 | r5
            r6.m r0 = r7.f12516d
            long r5 = r7.f12527o
            r0.f(r5, r9)
            r7.g(r2)
            goto L_0x0042
        L_0x00b2:
            w7.v r0 = r7.f12517e
            byte[] r0 = r0.f14876a
            r6 = 9
            boolean r0 = r7.d(r8, r0, r6)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r7.e()
            if (r0 == 0) goto L_0x00c5
            r5 = r3
        L_0x00c5:
            r7.g(r5)
            goto L_0x0042
        L_0x00ca:
            int r0 = r8.a()
            r8.R(r0)
            goto L_0x0042
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.u.b(w7.w, int):void");
    }

    public final void c() {
        this.f12518f = 0;
        this.f12519g = 0;
        this.f12523k = false;
        this.f12516d.c();
    }

    public final boolean d(w wVar, byte[] bArr, int i10) {
        int min = Math.min(wVar.a(), i10 - this.f12519g);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            wVar.R(min);
        } else {
            wVar.i(bArr, this.f12519g, min);
        }
        int i11 = this.f12519g + min;
        this.f12519g = i11;
        return i11 == i10;
    }

    public final boolean e() {
        this.f12517e.n(0);
        int h10 = this.f12517e.h(24);
        if (h10 != 1) {
            p.l(f12508p, "Unexpected start code prefix: " + h10);
            this.f12525m = -1;
            return false;
        }
        this.f12517e.p(8);
        int h11 = this.f12517e.h(16);
        this.f12517e.p(5);
        this.f12526n = this.f12517e.g();
        this.f12517e.p(2);
        this.f12521i = this.f12517e.g();
        this.f12522j = this.f12517e.g();
        this.f12517e.p(6);
        int h12 = this.f12517e.h(8);
        this.f12524l = h12;
        if (h11 == 0) {
            this.f12525m = -1;
        } else {
            this.f12525m = ((h11 + 6) - 9) - h12;
        }
        return true;
    }

    public final void f() {
        this.f12517e.n(0);
        this.f12527o = c.f4201b;
        if (this.f12521i) {
            this.f12517e.p(4);
            this.f12517e.p(1);
            this.f12517e.p(1);
            long h10 = (((long) this.f12517e.h(3)) << 30) | ((long) (this.f12517e.h(15) << 15)) | ((long) this.f12517e.h(15));
            this.f12517e.p(1);
            if (!this.f12523k && this.f12522j) {
                this.f12517e.p(4);
                this.f12517e.p(1);
                this.f12517e.p(1);
                this.f12517e.p(1);
                this.f12520h.b((((long) this.f12517e.h(3)) << 30) | ((long) (this.f12517e.h(15) << 15)) | ((long) this.f12517e.h(15)));
                this.f12523k = true;
            }
            this.f12527o = this.f12520h.b(h10);
        }
    }

    public final void g(int i10) {
        this.f12518f = i10;
        this.f12519g = 0;
    }
}
