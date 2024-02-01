package a0;

import a0.f;
import z.e;

public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f69k;

    /* renamed from: l  reason: collision with root package name */
    public g f70l = null;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                a0.p$b[] r0 = a0.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f71a = r0
                a0.p$b r1 = a0.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f71a     // Catch:{ NoSuchFieldError -> 0x001d }
                a0.p$b r1 = a0.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f71a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a0.p$b r1 = a0.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a0.n.a.<clinit>():void");
        }
    }

    public n(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f69k = fVar;
        this.f95h.f42e = f.a.TOP;
        this.f96i.f42e = f.a.BOTTOM;
        fVar.f42e = f.a.BASELINE;
        this.f93f = 1;
    }

    public void a(d dVar) {
        int i10;
        float f10;
        int i11 = a.f71a[this.f97j.ordinal()];
        if (i11 == 1) {
            s(dVar);
        } else if (i11 == 2) {
            r(dVar);
        } else if (i11 == 3) {
            e eVar = this.f89b;
            q(dVar, eVar.K, eVar.M, 1);
            return;
        }
        g gVar = this.f92e;
        if (gVar.f40c && !gVar.f47j && this.f91d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f89b;
            int i12 = eVar2.f15674q;
            if (i12 == 2) {
                e U = eVar2.U();
                if (U != null) {
                    g gVar2 = U.f15652f.f92e;
                    if (gVar2.f47j) {
                        i10 = (int) ((((float) gVar2.f44g) * this.f89b.f15688x) + 0.5f);
                    }
                }
            } else if (i12 == 3 && eVar2.f15650e.f92e.f47j) {
                int B = eVar2.B();
                if (B != -1) {
                    if (B == 0) {
                        e eVar3 = this.f89b;
                        f10 = ((float) eVar3.f15650e.f92e.f44g) * eVar3.A();
                        i10 = (int) (f10 + 0.5f);
                    } else if (B != 1) {
                        i10 = 0;
                    }
                }
                e eVar4 = this.f89b;
                f10 = ((float) eVar4.f15650e.f92e.f44g) / eVar4.A();
                i10 = (int) (f10 + 0.5f);
            }
            this.f92e.e(i10);
        }
        f fVar = this.f95h;
        if (fVar.f40c) {
            f fVar2 = this.f96i;
            if (fVar2.f40c) {
                if (!fVar.f47j || !fVar2.f47j || !this.f92e.f47j) {
                    if (!this.f92e.f47j && this.f91d == e.b.MATCH_CONSTRAINT) {
                        e eVar5 = this.f89b;
                        if (eVar5.f15672p == 0 && !eVar5.u0()) {
                            int i13 = this.f95h.f49l.get(0).f44g;
                            f fVar3 = this.f95h;
                            int i14 = i13 + fVar3.f43f;
                            int i15 = this.f96i.f49l.get(0).f44g + this.f96i.f43f;
                            fVar3.e(i14);
                            this.f96i.e(i15);
                            this.f92e.e(i15 - i14);
                            return;
                        }
                    }
                    if (!this.f92e.f47j && this.f91d == e.b.MATCH_CONSTRAINT && this.f88a == 1 && this.f95h.f49l.size() > 0 && this.f96i.f49l.size() > 0) {
                        int i16 = (this.f96i.f49l.get(0).f44g + this.f96i.f43f) - (this.f95h.f49l.get(0).f44g + this.f95h.f43f);
                        g gVar3 = this.f92e;
                        int i17 = gVar3.f50m;
                        if (i16 < i17) {
                            gVar3.e(i16);
                        } else {
                            gVar3.e(i17);
                        }
                    }
                    if (this.f92e.f47j && this.f95h.f49l.size() > 0 && this.f96i.f49l.size() > 0) {
                        f fVar4 = this.f95h.f49l.get(0);
                        f fVar5 = this.f96i.f49l.get(0);
                        int i18 = fVar4.f44g + this.f95h.f43f;
                        int i19 = fVar5.f44g + this.f96i.f43f;
                        float d02 = this.f89b.d0();
                        if (fVar4 == fVar5) {
                            i18 = fVar4.f44g;
                            i19 = fVar5.f44g;
                            d02 = 0.5f;
                        }
                        this.f95h.e((int) (((float) i18) + 0.5f + (((float) ((i19 - i18) - this.f92e.f44g)) * d02)));
                        this.f96i.e(this.f95h.f44g + this.f92e.f44g);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d9, code lost:
        if (r10.f89b.m0() != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x032e, code lost:
        if (r0.f91d == r1) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x035e, code lost:
        if (r10.f89b.m0() != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03d3, code lost:
        if (r0.f91d == r1) goto L_0x03d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r10 = this;
            z.e r0 = r10.f89b
            boolean r1 = r0.f15642a
            if (r1 == 0) goto L_0x000f
            a0.g r1 = r10.f92e
            int r0 = r0.D()
            r1.e(r0)
        L_0x000f:
            a0.g r0 = r10.f92e
            boolean r0 = r0.f47j
            if (r0 != 0) goto L_0x0097
            z.e r0 = r10.f89b
            z.e$b r0 = r0.g0()
            r10.f91d = r0
            z.e r0 = r10.f89b
            boolean r0 = r0.m0()
            if (r0 == 0) goto L_0x002c
            a0.a r0 = new a0.a
            r0.<init>(r10)
            r10.f70l = r0
        L_0x002c:
            z.e$b r0 = r10.f91d
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x00d1
            z.e$b r1 = z.e.b.MATCH_PARENT
            if (r0 != r1) goto L_0x0085
            z.e r0 = r10.f89b
            z.e r0 = r0.U()
            if (r0 == 0) goto L_0x0085
            z.e$b r1 = r0.g0()
            z.e$b r2 = z.e.b.FIXED
            if (r1 != r2) goto L_0x0085
            int r1 = r0.D()
            z.e r2 = r10.f89b
            z.d r2 = r2.K
            int r2 = r2.g()
            int r1 = r1 - r2
            z.e r2 = r10.f89b
            z.d r2 = r2.M
            int r2 = r2.g()
            int r1 = r1 - r2
            a0.f r2 = r10.f95h
            a0.n r3 = r0.f15652f
            a0.f r3 = r3.f95h
            z.e r4 = r10.f89b
            z.d r4 = r4.K
            int r4 = r4.g()
            r10.b(r2, r3, r4)
            a0.f r2 = r10.f96i
            a0.n r0 = r0.f15652f
            a0.f r0 = r0.f96i
            z.e r3 = r10.f89b
            z.d r3 = r3.M
            int r3 = r3.g()
            int r3 = -r3
            r10.b(r2, r0, r3)
            a0.g r0 = r10.f92e
            r0.e(r1)
            return
        L_0x0085:
            z.e$b r0 = r10.f91d
            z.e$b r1 = z.e.b.FIXED
            if (r0 != r1) goto L_0x00d1
            a0.g r0 = r10.f92e
            z.e r1 = r10.f89b
            int r1 = r1.D()
            r0.e(r1)
            goto L_0x00d1
        L_0x0097:
            z.e$b r0 = r10.f91d
            z.e$b r1 = z.e.b.MATCH_PARENT
            if (r0 != r1) goto L_0x00d1
            z.e r0 = r10.f89b
            z.e r0 = r0.U()
            if (r0 == 0) goto L_0x00d1
            z.e$b r1 = r0.g0()
            z.e$b r2 = z.e.b.FIXED
            if (r1 != r2) goto L_0x00d1
            a0.f r1 = r10.f95h
            a0.n r2 = r0.f15652f
            a0.f r2 = r2.f95h
            z.e r3 = r10.f89b
            z.d r3 = r3.K
            int r3 = r3.g()
            r10.b(r1, r2, r3)
            a0.f r1 = r10.f96i
            a0.n r0 = r0.f15652f
            a0.f r0 = r0.f96i
            z.e r2 = r10.f89b
            z.d r2 = r2.M
            int r2 = r2.g()
            int r2 = -r2
            r10.b(r1, r0, r2)
            return
        L_0x00d1:
            a0.g r0 = r10.f92e
            boolean r1 = r0.f47j
            r2 = 0
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = 3
            if (r1 == 0) goto L_0x022f
            z.e r7 = r10.f89b
            boolean r8 = r7.f15642a
            if (r8 == 0) goto L_0x022f
            z.d[] r0 = r7.R
            r1 = r0[r4]
            z.d r8 = r1.f15623f
            if (r8 == 0) goto L_0x016a
            r9 = r0[r6]
            z.d r9 = r9.f15623f
            if (r9 == 0) goto L_0x016a
            boolean r0 = r7.u0()
            if (r0 == 0) goto L_0x0114
            a0.f r0 = r10.f95h
            z.e r1 = r10.f89b
            z.d[] r1 = r1.R
            r1 = r1[r4]
            int r1 = r1.g()
            r0.f43f = r1
            a0.f r0 = r10.f96i
            z.e r1 = r10.f89b
            z.d[] r1 = r1.R
            r1 = r1[r6]
            int r1 = r1.g()
            int r1 = -r1
            r0.f43f = r1
            goto L_0x0153
        L_0x0114:
            z.e r0 = r10.f89b
            z.d[] r0 = r0.R
            r0 = r0[r4]
            a0.f r0 = r10.h(r0)
            if (r0 == 0) goto L_0x012f
            a0.f r1 = r10.f95h
            z.e r2 = r10.f89b
            z.d[] r2 = r2.R
            r2 = r2[r4]
            int r2 = r2.g()
            r10.b(r1, r0, r2)
        L_0x012f:
            z.e r0 = r10.f89b
            z.d[] r0 = r0.R
            r0 = r0[r6]
            a0.f r0 = r10.h(r0)
            if (r0 == 0) goto L_0x014b
            a0.f r1 = r10.f96i
            z.e r2 = r10.f89b
            z.d[] r2 = r2.R
            r2 = r2[r6]
            int r2 = r2.g()
            int r2 = -r2
            r10.b(r1, r0, r2)
        L_0x014b:
            a0.f r0 = r10.f95h
            r0.f39b = r5
            a0.f r0 = r10.f96i
            r0.f39b = r5
        L_0x0153:
            z.e r0 = r10.f89b
            boolean r0 = r0.m0()
            if (r0 == 0) goto L_0x03fd
        L_0x015b:
            a0.f r0 = r10.f69k
            a0.f r1 = r10.f95h
            z.e r2 = r10.f89b
            int r2 = r2.t()
        L_0x0165:
            r10.b(r0, r1, r2)
            goto L_0x03fd
        L_0x016a:
            if (r8 == 0) goto L_0x0195
            a0.f r0 = r10.h(r1)
            if (r0 == 0) goto L_0x03fd
            a0.f r1 = r10.f95h
            z.e r2 = r10.f89b
            z.d[] r2 = r2.R
            r2 = r2[r4]
            int r2 = r2.g()
            r10.b(r1, r0, r2)
            a0.f r0 = r10.f96i
            a0.f r1 = r10.f95h
            a0.g r2 = r10.f92e
            int r2 = r2.f44g
            r10.b(r0, r1, r2)
            z.e r0 = r10.f89b
            boolean r0 = r0.m0()
            if (r0 == 0) goto L_0x03fd
            goto L_0x015b
        L_0x0195:
            r1 = r0[r6]
            z.d r4 = r1.f15623f
            if (r4 == 0) goto L_0x01c6
            a0.f r0 = r10.h(r1)
            if (r0 == 0) goto L_0x01bd
            a0.f r1 = r10.f96i
            z.e r2 = r10.f89b
            z.d[] r2 = r2.R
            r2 = r2[r6]
            int r2 = r2.g()
            int r2 = -r2
            r10.b(r1, r0, r2)
            a0.f r0 = r10.f95h
            a0.f r1 = r10.f96i
            a0.g r2 = r10.f92e
            int r2 = r2.f44g
            int r2 = -r2
            r10.b(r0, r1, r2)
        L_0x01bd:
            z.e r0 = r10.f89b
            boolean r0 = r0.m0()
            if (r0 == 0) goto L_0x03fd
            goto L_0x015b
        L_0x01c6:
            r0 = r0[r3]
            z.d r1 = r0.f15623f
            if (r1 == 0) goto L_0x01ef
            a0.f r0 = r10.h(r0)
            if (r0 == 0) goto L_0x03fd
            a0.f r1 = r10.f69k
            r10.b(r1, r0, r2)
            a0.f r0 = r10.f95h
            a0.f r1 = r10.f69k
            z.e r2 = r10.f89b
            int r2 = r2.t()
            int r2 = -r2
            r10.b(r0, r1, r2)
            a0.f r0 = r10.f96i
            a0.f r1 = r10.f95h
            a0.g r2 = r10.f92e
            int r2 = r2.f44g
            goto L_0x0165
        L_0x01ef:
            boolean r0 = r7 instanceof z.i
            if (r0 != 0) goto L_0x03fd
            z.e r0 = r7.U()
            if (r0 == 0) goto L_0x03fd
            z.e r0 = r10.f89b
            z.d$b r1 = z.d.b.CENTER
            z.d r0 = r0.r(r1)
            z.d r0 = r0.f15623f
            if (r0 != 0) goto L_0x03fd
            z.e r0 = r10.f89b
            z.e r0 = r0.U()
            a0.n r0 = r0.f15652f
            a0.f r0 = r0.f95h
            a0.f r1 = r10.f95h
            z.e r2 = r10.f89b
            int r2 = r2.l0()
            r10.b(r1, r0, r2)
            a0.f r0 = r10.f96i
            a0.f r1 = r10.f95h
            a0.g r2 = r10.f92e
            int r2 = r2.f44g
            r10.b(r0, r1, r2)
            z.e r0 = r10.f89b
            boolean r0 = r0.m0()
            if (r0 == 0) goto L_0x03fd
            goto L_0x015b
        L_0x022f:
            if (r1 != 0) goto L_0x027e
            z.e$b r1 = r10.f91d
            z.e$b r7 = z.e.b.MATCH_CONSTRAINT
            if (r1 != r7) goto L_0x027e
            z.e r0 = r10.f89b
            int r1 = r0.f15674q
            if (r1 == r4) goto L_0x0250
            if (r1 == r6) goto L_0x0240
            goto L_0x0281
        L_0x0240:
            boolean r0 = r0.u0()
            if (r0 != 0) goto L_0x0281
            z.e r0 = r10.f89b
            int r1 = r0.f15672p
            if (r1 != r6) goto L_0x024d
            goto L_0x0281
        L_0x024d:
            a0.l r0 = r0.f15650e
            goto L_0x0259
        L_0x0250:
            z.e r0 = r0.U()
            if (r0 != 0) goto L_0x0257
            goto L_0x0281
        L_0x0257:
            a0.n r0 = r0.f15652f
        L_0x0259:
            a0.g r0 = r0.f92e
            a0.g r1 = r10.f92e
            java.util.List<a0.f> r1 = r1.f49l
            r1.add(r0)
            java.util.List<a0.d> r0 = r0.f48k
            a0.g r1 = r10.f92e
            r0.add(r1)
            a0.g r0 = r10.f92e
            r0.f39b = r5
            java.util.List<a0.d> r0 = r0.f48k
            a0.f r1 = r10.f95h
            r0.add(r1)
            a0.g r0 = r10.f92e
            java.util.List<a0.d> r0 = r0.f48k
            a0.f r1 = r10.f96i
            r0.add(r1)
            goto L_0x0281
        L_0x027e:
            r0.b(r10)
        L_0x0281:
            z.e r0 = r10.f89b
            z.d[] r1 = r0.R
            r7 = r1[r4]
            z.d r8 = r7.f15623f
            if (r8 == 0) goto L_0x02e6
            r9 = r1[r6]
            z.d r9 = r9.f15623f
            if (r9 == 0) goto L_0x02e6
            boolean r0 = r0.u0()
            if (r0 == 0) goto L_0x02b5
            a0.f r0 = r10.f95h
            z.e r1 = r10.f89b
            z.d[] r1 = r1.R
            r1 = r1[r4]
            int r1 = r1.g()
            r0.f43f = r1
            a0.f r0 = r10.f96i
            z.e r1 = r10.f89b
            z.d[] r1 = r1.R
            r1 = r1[r6]
            int r1 = r1.g()
            int r1 = -r1
            r0.f43f = r1
            goto L_0x02d3
        L_0x02b5:
            z.e r0 = r10.f89b
            z.d[] r0 = r0.R
            r0 = r0[r4]
            a0.f r0 = r10.h(r0)
            z.e r1 = r10.f89b
            z.d[] r1 = r1.R
            r1 = r1[r6]
            a0.f r1 = r10.h(r1)
            r0.b(r10)
            r1.b(r10)
            a0.p$b r0 = a0.p.b.CENTER
            r10.f97j = r0
        L_0x02d3:
            z.e r0 = r10.f89b
            boolean r0 = r0.m0()
            if (r0 == 0) goto L_0x03ef
        L_0x02db:
            a0.f r0 = r10.f69k
            a0.f r1 = r10.f95h
            a0.g r2 = r10.f70l
        L_0x02e1:
            r10.c(r0, r1, r5, r2)
            goto L_0x03ef
        L_0x02e6:
            r9 = 0
            if (r8 == 0) goto L_0x0332
            a0.f r0 = r10.h(r7)
            if (r0 == 0) goto L_0x03ef
            a0.f r1 = r10.f95h
            z.e r2 = r10.f89b
            z.d[] r2 = r2.R
            r2 = r2[r4]
            int r2 = r2.g()
            r10.b(r1, r0, r2)
            a0.f r0 = r10.f96i
            a0.f r1 = r10.f95h
            a0.g r2 = r10.f92e
            r10.c(r0, r1, r5, r2)
            z.e r0 = r10.f89b
            boolean r0 = r0.m0()
            if (r0 == 0) goto L_0x0318
            a0.f r0 = r10.f69k
            a0.f r1 = r10.f95h
            a0.g r2 = r10.f70l
            r10.c(r0, r1, r5, r2)
        L_0x0318:
            z.e$b r0 = r10.f91d
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ef
            z.e r0 = r10.f89b
            float r0 = r0.A()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ef
            z.e r0 = r10.f89b
            a0.l r0 = r0.f15650e
            z.e$b r2 = r0.f91d
            if (r2 != r1) goto L_0x03ef
            goto L_0x03d5
        L_0x0332:
            r4 = r1[r6]
            z.d r7 = r4.f15623f
            r8 = -1
            if (r7 == 0) goto L_0x0362
            a0.f r0 = r10.h(r4)
            if (r0 == 0) goto L_0x03ef
            a0.f r1 = r10.f96i
            z.e r2 = r10.f89b
            z.d[] r2 = r2.R
            r2 = r2[r6]
            int r2 = r2.g()
            int r2 = -r2
            r10.b(r1, r0, r2)
            a0.f r0 = r10.f95h
            a0.f r1 = r10.f96i
            a0.g r2 = r10.f92e
            r10.c(r0, r1, r8, r2)
            z.e r0 = r10.f89b
            boolean r0 = r0.m0()
            if (r0 == 0) goto L_0x03ef
            goto L_0x02db
        L_0x0362:
            r1 = r1[r3]
            z.d r3 = r1.f15623f
            if (r3 == 0) goto L_0x0384
            a0.f r0 = r10.h(r1)
            if (r0 == 0) goto L_0x03ef
            a0.f r1 = r10.f69k
            r10.b(r1, r0, r2)
            a0.f r0 = r10.f95h
            a0.f r1 = r10.f69k
            a0.g r2 = r10.f70l
            r10.c(r0, r1, r8, r2)
            a0.f r0 = r10.f96i
            a0.f r1 = r10.f95h
            a0.g r2 = r10.f92e
            goto L_0x02e1
        L_0x0384:
            boolean r1 = r0 instanceof z.i
            if (r1 != 0) goto L_0x03ef
            z.e r0 = r0.U()
            if (r0 == 0) goto L_0x03ef
            z.e r0 = r10.f89b
            z.e r0 = r0.U()
            a0.n r0 = r0.f15652f
            a0.f r0 = r0.f95h
            a0.f r1 = r10.f95h
            z.e r2 = r10.f89b
            int r2 = r2.l0()
            r10.b(r1, r0, r2)
            a0.f r0 = r10.f96i
            a0.f r1 = r10.f95h
            a0.g r2 = r10.f92e
            r10.c(r0, r1, r5, r2)
            z.e r0 = r10.f89b
            boolean r0 = r0.m0()
            if (r0 == 0) goto L_0x03bd
            a0.f r0 = r10.f69k
            a0.f r1 = r10.f95h
            a0.g r2 = r10.f70l
            r10.c(r0, r1, r5, r2)
        L_0x03bd:
            z.e$b r0 = r10.f91d
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ef
            z.e r0 = r10.f89b
            float r0 = r0.A()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ef
            z.e r0 = r10.f89b
            a0.l r0 = r0.f15650e
            z.e$b r2 = r0.f91d
            if (r2 != r1) goto L_0x03ef
        L_0x03d5:
            a0.g r0 = r0.f92e
            java.util.List<a0.d> r0 = r0.f48k
            a0.g r1 = r10.f92e
            r0.add(r1)
            a0.g r0 = r10.f92e
            java.util.List<a0.f> r0 = r0.f49l
            z.e r1 = r10.f89b
            a0.l r1 = r1.f15650e
            a0.g r1 = r1.f92e
            r0.add(r1)
            a0.g r0 = r10.f92e
            r0.f38a = r10
        L_0x03ef:
            a0.g r0 = r10.f92e
            java.util.List<a0.f> r0 = r0.f49l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x03fd
            a0.g r0 = r10.f92e
            r0.f40c = r5
        L_0x03fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.n.d():void");
    }

    public void e() {
        f fVar = this.f95h;
        if (fVar.f47j) {
            this.f89b.K1(fVar.f44g);
        }
    }

    public void f() {
        this.f90c = null;
        this.f95h.c();
        this.f96i.c();
        this.f69k.c();
        this.f92e.c();
        this.f94g = false;
    }

    public void n() {
        this.f94g = false;
        this.f95h.c();
        this.f95h.f47j = false;
        this.f96i.c();
        this.f96i.f47j = false;
        this.f69k.c();
        this.f69k.f47j = false;
        this.f92e.f47j = false;
    }

    public boolean p() {
        return this.f91d != e.b.MATCH_CONSTRAINT || this.f89b.f15674q == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f89b.y();
    }
}
