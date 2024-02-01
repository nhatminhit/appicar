package a0;

import java.util.ArrayList;
import z.d;
import z.e;
import z.f;
import z.h;
import z.i;
import z.k;
import z.m;

public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f2d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final int f3e = 30;

    /* renamed from: f  reason: collision with root package name */
    public static final int f4f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f5g = 1073741824;

    /* renamed from: h  reason: collision with root package name */
    public static final int f6h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public static final int f7i = -1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f8j = -2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f9k = -3;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<e> f10a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f11b = new a();

    /* renamed from: c  reason: collision with root package name */
    public f f12c;

    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f13k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f14l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f15m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f16a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f17b;

        /* renamed from: c  reason: collision with root package name */
        public int f18c;

        /* renamed from: d  reason: collision with root package name */
        public int f19d;

        /* renamed from: e  reason: collision with root package name */
        public int f20e;

        /* renamed from: f  reason: collision with root package name */
        public int f21f;

        /* renamed from: g  reason: collision with root package name */
        public int f22g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f23h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f24i;

        /* renamed from: j  reason: collision with root package name */
        public int f25j;
    }

    /* renamed from: a0.b$b  reason: collision with other inner class name */
    public interface C0002b {
        void a();

        void b(e eVar, a aVar);
    }

    public b(f fVar) {
        this.f12c = fVar;
    }

    public final boolean a(C0002b bVar, e eVar, int i10) {
        this.f11b.f16a = eVar.H();
        this.f11b.f17b = eVar.g0();
        this.f11b.f18c = eVar.j0();
        this.f11b.f19d = eVar.D();
        a aVar = this.f11b;
        aVar.f24i = false;
        aVar.f25j = i10;
        e.b bVar2 = aVar.f16a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f17b == bVar3;
        boolean z12 = z10 && eVar.Y > 0.0f;
        boolean z13 = z11 && eVar.Y > 0.0f;
        if (z12 && eVar.f15676r[0] == 4) {
            aVar.f16a = e.b.FIXED;
        }
        if (z13 && eVar.f15676r[1] == 4) {
            aVar.f17b = e.b.FIXED;
        }
        bVar.b(eVar, aVar);
        eVar.H1(this.f11b.f20e);
        eVar.d1(this.f11b.f21f);
        eVar.c1(this.f11b.f23h);
        eVar.L0(this.f11b.f22g);
        a aVar2 = this.f11b;
        aVar2.f25j = a.f13k;
        return aVar2.f24i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        if (r8 != r9) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
        if (r5.Y <= 0.0f) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(z.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<z.e> r0 = r13.f15783o1
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.w2(r1)
            a0.b$b r2 = r13.k2()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r0) goto L_0x00b0
            java.util.ArrayList<z.e> r5 = r13.f15783o1
            java.lang.Object r5 = r5.get(r4)
            z.e r5 = (z.e) r5
            boolean r6 = r5 instanceof z.h
            if (r6 == 0) goto L_0x0022
            goto L_0x00ac
        L_0x0022:
            boolean r6 = r5 instanceof z.a
            if (r6 == 0) goto L_0x0028
            goto L_0x00ac
        L_0x0028:
            boolean r6 = r5.v0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00ac
        L_0x0030:
            if (r1 == 0) goto L_0x0048
            a0.l r6 = r5.f15650e
            if (r6 == 0) goto L_0x0048
            a0.n r7 = r5.f15652f
            if (r7 == 0) goto L_0x0048
            a0.g r6 = r6.f92e
            boolean r6 = r6.f47j
            if (r6 == 0) goto L_0x0048
            a0.g r6 = r7.f92e
            boolean r6 = r6.f47j
            if (r6 == 0) goto L_0x0048
            goto L_0x00ac
        L_0x0048:
            z.e$b r6 = r5.z(r3)
            r7 = 1
            z.e$b r8 = r5.z(r7)
            z.e$b r9 = z.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0061
            int r10 = r5.f15672p
            if (r10 == r7) goto L_0x0061
            if (r8 != r9) goto L_0x0061
            int r10 = r5.f15674q
            if (r10 == r7) goto L_0x0061
            r10 = r7
            goto L_0x0062
        L_0x0061:
            r10 = r3
        L_0x0062:
            if (r10 != 0) goto L_0x0098
            boolean r11 = r13.w2(r7)
            if (r11 == 0) goto L_0x0098
            boolean r11 = r5 instanceof z.m
            if (r11 != 0) goto L_0x0098
            if (r6 != r9) goto L_0x007d
            int r11 = r5.f15672p
            if (r11 != 0) goto L_0x007d
            if (r8 == r9) goto L_0x007d
            boolean r11 = r5.s0()
            if (r11 != 0) goto L_0x007d
            r10 = r7
        L_0x007d:
            if (r8 != r9) goto L_0x008c
            int r11 = r5.f15674q
            if (r11 != 0) goto L_0x008c
            if (r6 == r9) goto L_0x008c
            boolean r11 = r5.s0()
            if (r11 != 0) goto L_0x008c
            r10 = r7
        L_0x008c:
            if (r6 == r9) goto L_0x0090
            if (r8 != r9) goto L_0x0098
        L_0x0090:
            float r6 = r5.Y
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r7 = r10
        L_0x0099:
            if (r7 == 0) goto L_0x009c
            goto L_0x00ac
        L_0x009c:
            int r6 = a0.b.a.f13k
            r12.a(r2, r5, r6)
            w.f r5 = r13.f15700t1
            if (r5 == 0) goto L_0x00ac
            long r6 = r5.f14275c
            r8 = 1
            long r6 = r6 + r8
            r5.f14275c = r6
        L_0x00ac:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00b0:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b.b(z.f):void");
    }

    public final void c(f fVar, String str, int i10, int i11) {
        int Q = fVar.Q();
        int P = fVar.P();
        fVar.u1(0);
        fVar.t1(0);
        fVar.H1(i10);
        fVar.d1(i11);
        fVar.u1(Q);
        fVar.t1(P);
        this.f12c.R1();
    }

    public long d(f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        boolean z10;
        int i20;
        boolean z11;
        boolean z12;
        int i21;
        boolean z13;
        C0002b bVar;
        int i22;
        int i23;
        int i24;
        boolean z14;
        w.f fVar2;
        f fVar3 = fVar;
        int i25 = i10;
        int i26 = i13;
        int i27 = i15;
        C0002b k22 = fVar.k2();
        int size = fVar3.f15783o1.size();
        int j02 = fVar.j0();
        int D = fVar.D();
        boolean b10 = k.b(i25, 128);
        boolean z15 = b10 || k.b(i25, 64);
        if (z15) {
            int i28 = 0;
            while (true) {
                if (i28 >= size) {
                    break;
                }
                e eVar = fVar3.f15783o1.get(i28);
                e.b H = eVar.H();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z16 = (H == bVar2) && (eVar.g0() == bVar2) && eVar.A() > 0.0f;
                if ((!eVar.s0() || !z16) && ((!eVar.u0() || !z16) && !(eVar instanceof m) && !eVar.s0() && !eVar.u0())) {
                    i28++;
                }
            }
            z15 = false;
        }
        if (z15 && (fVar2 = w.e.C) != null) {
            fVar2.f14277e++;
        }
        boolean z17 = z15 & ((i26 == 1073741824 && i27 == 1073741824) || b10);
        int i29 = 2;
        if (z17) {
            int min = Math.min(fVar.O(), i14);
            int min2 = Math.min(fVar.N(), i16);
            if (i26 == 1073741824 && fVar.j0() != min) {
                fVar3.H1(min);
                fVar.p2();
            }
            if (i27 == 1073741824 && fVar.D() != min2) {
                fVar3.d1(min2);
                fVar.p2();
            }
            if (i26 == 1073741824 && i27 == 1073741824) {
                z10 = fVar3.f2(b10);
                i19 = 2;
            } else {
                boolean g22 = fVar3.g2(b10);
                if (i26 == 1073741824) {
                    g22 &= fVar3.h2(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i27 == 1073741824) {
                    z10 = fVar3.h2(b10, 1) & g22;
                    i19++;
                } else {
                    z10 = g22;
                }
            }
            if (z10) {
                fVar3.M1(i26 == 1073741824, i27 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0;
        }
        int l22 = fVar.l2();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.f10a.size();
        if (size > 0) {
            c(fVar3, "First pass", j02, D);
        }
        if (size2 > 0) {
            e.b H2 = fVar.H();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z18 = H2 == bVar3;
            boolean z19 = fVar.g0() == bVar3;
            int max = Math.max(fVar.j0(), this.f12c.Q());
            int max2 = Math.max(fVar.D(), this.f12c.P());
            int i30 = 0;
            boolean z20 = false;
            while (i30 < size2) {
                e eVar2 = this.f10a.get(i30);
                if (!(eVar2 instanceof m)) {
                    i22 = l22;
                    i24 = j02;
                    i23 = D;
                } else {
                    int j03 = eVar2.j0();
                    i22 = l22;
                    int D2 = eVar2.D();
                    i24 = j02;
                    boolean a10 = a(k22, eVar2, a.f14l) | z20;
                    w.f fVar4 = fVar3.f15700t1;
                    boolean z21 = a10;
                    i23 = D;
                    if (fVar4 != null) {
                        fVar4.f14276d++;
                    }
                    int j04 = eVar2.j0();
                    int D3 = eVar2.D();
                    if (j04 != j03) {
                        eVar2.H1(j04);
                        if (z18 && eVar2.X() > max) {
                            max = Math.max(max, eVar2.X() + eVar2.r(d.b.RIGHT).g());
                        }
                        z14 = true;
                    } else {
                        z14 = z21;
                    }
                    if (D3 != D2) {
                        eVar2.d1(D3);
                        if (z19 && eVar2.v() > max2) {
                            max2 = Math.max(max2, eVar2.v() + eVar2.r(d.b.BOTTOM).g());
                        }
                        z14 = true;
                    }
                    z20 = z14 | ((m) eVar2).b2();
                }
                i30++;
                l22 = i22;
                j02 = i24;
                D = i23;
                i29 = 2;
            }
            int i31 = l22;
            int i32 = j02;
            int i33 = D;
            int i34 = i29;
            int i35 = 0;
            while (i35 < i34) {
                int i36 = 0;
                while (i36 < size2) {
                    e eVar3 = this.f10a.get(i36);
                    if ((!(eVar3 instanceof i) || (eVar3 instanceof m)) && !(eVar3 instanceof h) && eVar3.i0() != 8 && ((!z17 || !eVar3.f15650e.f92e.f47j || !eVar3.f15652f.f92e.f47j) && !(eVar3 instanceof m))) {
                        int j05 = eVar3.j0();
                        int D4 = eVar3.D();
                        int t10 = eVar3.t();
                        int i37 = a.f14l;
                        z13 = z17;
                        if (i35 == 1) {
                            i37 = a.f15m;
                        }
                        boolean a11 = a(k22, eVar3, i37) | z20;
                        w.f fVar5 = fVar3.f15700t1;
                        i21 = size2;
                        bVar = k22;
                        if (fVar5 != null) {
                            fVar5.f14276d++;
                        }
                        int j06 = eVar3.j0();
                        int D5 = eVar3.D();
                        if (j06 != j05) {
                            eVar3.H1(j06);
                            if (z18 && eVar3.X() > max) {
                                max = Math.max(max, eVar3.X() + eVar3.r(d.b.RIGHT).g());
                            }
                            a11 = true;
                        }
                        if (D5 != D4) {
                            eVar3.d1(D5);
                            if (z19 && eVar3.v() > max2) {
                                max2 = Math.max(max2, eVar3.v() + eVar3.r(d.b.BOTTOM).g());
                            }
                            a11 = true;
                        }
                        z20 = (!eVar3.m0() || t10 == eVar3.t()) ? a11 : true;
                    } else {
                        z13 = z17;
                        i21 = size2;
                        bVar = k22;
                    }
                    i36++;
                    size2 = i21;
                    k22 = bVar;
                    z17 = z13;
                }
                boolean z22 = z17;
                int i38 = size2;
                C0002b bVar4 = k22;
                if (!z20) {
                    break;
                }
                c(fVar3, "intermediate pass", i32, i33);
                i35++;
                k22 = bVar4;
                z17 = z22;
                i34 = 2;
                z20 = false;
                size2 = i38;
            }
            int i39 = i32;
            int i40 = i33;
            if (z20) {
                c(fVar3, "2nd pass", i39, i40);
                if (fVar.j0() < max) {
                    fVar3.H1(max);
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (fVar.D() < max2) {
                    fVar3.d1(max2);
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (z12) {
                    c(fVar3, "3rd pass", i39, i40);
                }
            }
            i20 = i31;
        } else {
            i20 = l22;
        }
        fVar3.z2(i20);
        return 0;
    }

    public void e(f fVar) {
        this.f10a.clear();
        int size = fVar.f15783o1.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = fVar.f15783o1.get(i10);
            e.b H = eVar.H();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (H == bVar || eVar.g0() == bVar) {
                this.f10a.add(eVar);
            }
        }
        fVar.p2();
    }
}
