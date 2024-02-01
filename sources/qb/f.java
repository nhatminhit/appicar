package qb;

public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final int f22246e = 2;

    /* renamed from: a  reason: collision with root package name */
    public final a f22247a;

    /* renamed from: b  reason: collision with root package name */
    public final g[] f22248b;

    /* renamed from: c  reason: collision with root package name */
    public c f22249c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22250d;

    public f(a aVar, c cVar) {
        this.f22247a = aVar;
        int a10 = aVar.a();
        this.f22250d = a10;
        this.f22249c = cVar;
        this.f22248b = new g[(a10 + 2)];
    }

    public static boolean b(d dVar, d dVar2) {
        if (dVar2 == null || !dVar2.g() || dVar2.a() != dVar.a()) {
            return false;
        }
        dVar.i(dVar2.c());
        return true;
    }

    public static int c(int i10, int i11, d dVar) {
        if (dVar == null || dVar.g()) {
            return i11;
        }
        if (!dVar.h(i10)) {
            return i11 + 1;
        }
        dVar.i(i10);
        return 0;
    }

    public final void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f22247a);
        }
    }

    public final int d() {
        int f10 = f();
        if (f10 == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f22250d + 1; i10++) {
            d[] d10 = this.f22248b[i10].d();
            for (int i11 = 0; i11 < d10.length; i11++) {
                d dVar = d10[i11];
                if (dVar != null && !dVar.g()) {
                    e(i10, i11, d10);
                }
            }
        }
        return f10;
    }

    public final void e(int i10, int i11, d[] dVarArr) {
        d dVar = dVarArr[i11];
        d[] d10 = this.f22248b[i10 - 1].d();
        g gVar = this.f22248b[i10 + 1];
        d[] d11 = gVar != null ? gVar.d() : d10;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = d10[i11];
        dVarArr2[3] = d11[i11];
        int i12 = 0;
        if (i11 > 0) {
            int i13 = i11 - 1;
            dVarArr2[0] = dVarArr[i13];
            dVarArr2[4] = d10[i13];
            dVarArr2[5] = d11[i13];
        }
        if (i11 > 1) {
            int i14 = i11 - 2;
            dVarArr2[8] = dVarArr[i14];
            dVarArr2[10] = d10[i14];
            dVarArr2[11] = d11[i14];
        }
        if (i11 < dVarArr.length - 1) {
            int i15 = i11 + 1;
            dVarArr2[1] = dVarArr[i15];
            dVarArr2[6] = d10[i15];
            dVarArr2[7] = d11[i15];
        }
        if (i11 < dVarArr.length - 2) {
            int i16 = i11 + 2;
            dVarArr2[9] = dVarArr[i16];
            dVarArr2[12] = d10[i16];
            dVarArr2[13] = d11[i16];
        }
        while (i12 < 14 && !b(dVar, dVarArr2[i12])) {
            i12++;
        }
    }

    public final int f() {
        g();
        return h() + i();
    }

    public final void g() {
        g[] gVarArr = this.f22248b;
        g gVar = gVarArr[0];
        if (gVar != null && gVarArr[this.f22250d + 1] != null) {
            d[] d10 = gVar.d();
            d[] d11 = this.f22248b[this.f22250d + 1].d();
            for (int i10 = 0; i10 < d10.length; i10++) {
                d dVar = d10[i10];
                if (!(dVar == null || d11[i10] == null || dVar.c() != d11[i10].c())) {
                    for (int i11 = 1; i11 <= this.f22250d; i11++) {
                        d dVar2 = this.f22248b[i11].d()[i10];
                        if (dVar2 != null) {
                            dVar2.i(d10[i10].c());
                            if (!dVar2.g()) {
                                this.f22248b[i11].d()[i10] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int h() {
        g gVar = this.f22248b[0];
        if (gVar == null) {
            return 0;
        }
        d[] d10 = gVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10.length; i11++) {
            d dVar = d10[i11];
            if (dVar != null) {
                int c10 = dVar.c();
                int i12 = 0;
                for (int i13 = 1; i13 < this.f22250d + 1 && i12 < 2; i13++) {
                    d dVar2 = this.f22248b[i13].d()[i11];
                    if (dVar2 != null) {
                        i12 = c(c10, i12, dVar2);
                        if (!dVar2.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    public final int i() {
        g[] gVarArr = this.f22248b;
        int i10 = this.f22250d;
        if (gVarArr[i10 + 1] == null) {
            return 0;
        }
        d[] d10 = gVarArr[i10 + 1].d();
        int i11 = 0;
        for (int i12 = 0; i12 < d10.length; i12++) {
            d dVar = d10[i12];
            if (dVar != null) {
                int c10 = dVar.c();
                int i13 = 0;
                for (int i14 = this.f22250d + 1; i14 > 0 && i13 < 2; i14--) {
                    d dVar2 = this.f22248b[i14].d()[i12];
                    if (dVar2 != null) {
                        i13 = c(c10, i13, dVar2);
                        if (!dVar2.g()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    public int j() {
        return this.f22250d;
    }

    public int k() {
        return this.f22247a.b();
    }

    public int l() {
        return this.f22247a.c();
    }

    public c m() {
        return this.f22249c;
    }

    public g n(int i10) {
        return this.f22248b[i10];
    }

    public g[] o() {
        a(this.f22248b[0]);
        a(this.f22248b[this.f22250d + 1]);
        int i10 = 928;
        while (true) {
            int d10 = d();
            if (d10 > 0 && d10 < i10) {
                i10 = d10;
            }
        }
        return this.f22248b;
    }

    public void p(c cVar) {
        this.f22249c = cVar;
    }

    public void q(int i10, g gVar) {
        this.f22248b[i10] = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            qb.g[] r0 = r10.f22248b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f22250d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = r1
        L_0x0013:
            qb.d[] r5 = r2.d()     // Catch:{ all -> 0x007a }
            int r5 = r5.length     // Catch:{ all -> 0x007a }
            if (r4 >= r5) goto L_0x0072
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007a }
            r6[r1] = r7     // Catch:{ all -> 0x007a }
            r0.format(r5, r6)     // Catch:{ all -> 0x007a }
            r5 = r1
        L_0x0028:
            int r6 = r10.f22250d     // Catch:{ all -> 0x007a }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x0068
            qb.g[] r6 = r10.f22248b     // Catch:{ all -> 0x007a }
            r6 = r6[r5]     // Catch:{ all -> 0x007a }
            java.lang.String r8 = "    |   "
            if (r6 != 0) goto L_0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r8, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0065
        L_0x003c:
            qb.d[] r6 = r6.d()     // Catch:{ all -> 0x007a }
            r6 = r6[r4]     // Catch:{ all -> 0x007a }
            if (r6 != 0) goto L_0x004a
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r8, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0065
        L_0x004a:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007a }
            int r9 = r6.c()     // Catch:{ all -> 0x007a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007a }
            r7[r1] = r9     // Catch:{ all -> 0x007a }
            int r6 = r6.e()     // Catch:{ all -> 0x007a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007a }
            r7[r3] = r6     // Catch:{ all -> 0x007a }
            r0.format(r8, r7)     // Catch:{ all -> 0x007a }
        L_0x0065:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0068:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r5, r6)     // Catch:{ all -> 0x007a }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0072:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x007a }
            r0.close()
            return r1
        L_0x007a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0085:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.f.toString():java.lang.String");
    }
}
