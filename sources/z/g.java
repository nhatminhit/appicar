package z;

import java.util.ArrayList;
import java.util.HashMap;
import z.e;

public class g extends m {

    /* renamed from: c2  reason: collision with root package name */
    public static final int f15707c2 = 0;

    /* renamed from: d2  reason: collision with root package name */
    public static final int f15708d2 = 1;

    /* renamed from: e2  reason: collision with root package name */
    public static final int f15709e2 = 2;

    /* renamed from: f2  reason: collision with root package name */
    public static final int f15710f2 = 0;

    /* renamed from: g2  reason: collision with root package name */
    public static final int f15711g2 = 1;

    /* renamed from: h2  reason: collision with root package name */
    public static final int f15712h2 = 2;

    /* renamed from: i2  reason: collision with root package name */
    public static final int f15713i2 = 3;

    /* renamed from: j2  reason: collision with root package name */
    public static final int f15714j2 = 0;

    /* renamed from: k2  reason: collision with root package name */
    public static final int f15715k2 = 1;

    /* renamed from: l2  reason: collision with root package name */
    public static final int f15716l2 = 2;
    public int D1 = -1;
    public int E1 = -1;
    public int F1 = -1;
    public int G1 = -1;
    public int H1 = -1;
    public int I1 = -1;
    public float J1 = 0.5f;
    public float K1 = 0.5f;
    public float L1 = 0.5f;
    public float M1 = 0.5f;
    public float N1 = 0.5f;
    public float O1 = 0.5f;
    public int P1 = 0;
    public int Q1 = 0;
    public int R1 = 2;
    public int S1 = 2;
    public int T1 = 0;
    public int U1 = -1;
    public int V1 = 0;
    public ArrayList<a> W1 = new ArrayList<>();
    public e[] X1 = null;
    public e[] Y1 = null;
    public int[] Z1 = null;

    /* renamed from: a2  reason: collision with root package name */
    public e[] f15717a2;

    /* renamed from: b2  reason: collision with root package name */
    public int f15718b2 = 0;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f15719a;

        /* renamed from: b  reason: collision with root package name */
        public e f15720b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f15721c = 0;

        /* renamed from: d  reason: collision with root package name */
        public d f15722d;

        /* renamed from: e  reason: collision with root package name */
        public d f15723e;

        /* renamed from: f  reason: collision with root package name */
        public d f15724f;

        /* renamed from: g  reason: collision with root package name */
        public d f15725g;

        /* renamed from: h  reason: collision with root package name */
        public int f15726h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f15727i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f15728j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f15729k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f15730l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f15731m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f15732n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f15733o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f15734p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f15735q = 0;

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f15719a = i10;
            this.f15722d = dVar;
            this.f15723e = dVar2;
            this.f15724f = dVar3;
            this.f15725g = dVar4;
            this.f15726h = g.this.V1();
            this.f15727i = g.this.X1();
            this.f15728j = g.this.W1();
            this.f15729k = g.this.U1();
            this.f15735q = i11;
        }

        public void b(e eVar) {
            int i10 = 0;
            if (this.f15719a == 0) {
                int x22 = g.this.H2(eVar, this.f15735q);
                if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                    this.f15734p++;
                    x22 = 0;
                }
                int l22 = g.this.P1;
                if (eVar.i0() != 8) {
                    i10 = l22;
                }
                this.f15730l += x22 + i10;
                int y22 = g.this.G2(eVar, this.f15735q);
                if (this.f15720b == null || this.f15721c < y22) {
                    this.f15720b = eVar;
                    this.f15721c = y22;
                    this.f15731m = y22;
                }
            } else {
                int x23 = g.this.H2(eVar, this.f15735q);
                int y23 = g.this.G2(eVar, this.f15735q);
                if (eVar.g0() == e.b.MATCH_CONSTRAINT) {
                    this.f15734p++;
                    y23 = 0;
                }
                int m22 = g.this.Q1;
                if (eVar.i0() != 8) {
                    i10 = m22;
                }
                this.f15731m += y23 + i10;
                if (this.f15720b == null || this.f15721c < x23) {
                    this.f15720b = eVar;
                    this.f15721c = x23;
                    this.f15730l = x23;
                }
            }
            this.f15733o++;
        }

        public void c() {
            this.f15721c = 0;
            this.f15720b = null;
            this.f15730l = 0;
            this.f15731m = 0;
            this.f15732n = 0;
            this.f15733o = 0;
            this.f15734p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:125:0x023f  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f15733o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f15732n
                int r4 = r4 + r3
                z.g r5 = z.g.this
                int r5 = r5.f15718b2
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                z.g r4 = z.g.this
                z.e[] r4 = r4.f15717a2
                int r5 = r0.f15732n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.I0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x032b
                z.e r3 = r0.f15720b
                if (r3 != 0) goto L_0x002f
                goto L_0x032b
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = r2
            L_0x0036:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x003a:
                if (r6 >= r1) goto L_0x0067
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f15732n
                int r10 = r10 + r9
                z.g r11 = z.g.this
                int r11 = r11.f15718b2
                if (r10 < r11) goto L_0x004f
                goto L_0x0067
            L_0x004f:
                z.g r10 = z.g.this
                z.e[] r10 = r10.f15717a2
                int r11 = r0.f15732n
                int r11 = r11 + r9
                r9 = r10[r11]
                int r9 = r9.i0()
                if (r9 != 0) goto L_0x0064
                if (r7 != r5) goto L_0x0063
                r7 = r6
            L_0x0063:
                r8 = r6
            L_0x0064:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0067:
                r6 = 0
                int r9 = r0.f15719a
                if (r9 != 0) goto L_0x01db
                z.e r9 = r0.f15720b
                z.g r10 = z.g.this
                int r10 = r10.E1
                r9.B1(r10)
                int r10 = r0.f15727i
                if (r18 <= 0) goto L_0x0082
                z.g r11 = z.g.this
                int r11 = r11.Q1
                int r10 = r10 + r11
            L_0x0082:
                z.d r11 = r9.K
                z.d r12 = r0.f15723e
                r11.a(r12, r10)
                if (r19 == 0) goto L_0x0094
                z.d r10 = r9.M
                z.d r11 = r0.f15725g
                int r12 = r0.f15729k
                r10.a(r11, r12)
            L_0x0094:
                if (r18 <= 0) goto L_0x00a1
                z.d r10 = r0.f15723e
                z.e r10 = r10.f15621d
                z.d r10 = r10.M
                z.d r11 = r9.K
                r10.a(r11, r2)
            L_0x00a1:
                z.g r10 = z.g.this
                int r10 = r10.S1
                r11 = 3
                if (r10 != r11) goto L_0x00db
                boolean r10 = r9.m0()
                if (r10 != 0) goto L_0x00db
                r10 = r2
            L_0x00b1:
                if (r10 >= r1) goto L_0x00db
                if (r17 == 0) goto L_0x00b9
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00ba
            L_0x00b9:
                r12 = r10
            L_0x00ba:
                int r13 = r0.f15732n
                int r13 = r13 + r12
                z.g r14 = z.g.this
                int r14 = r14.f15718b2
                if (r13 < r14) goto L_0x00c6
                goto L_0x00db
            L_0x00c6:
                z.g r13 = z.g.this
                z.e[] r13 = r13.f15717a2
                int r14 = r0.f15732n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.m0()
                if (r13 == 0) goto L_0x00d8
                goto L_0x00dc
            L_0x00d8:
                int r10 = r10 + 1
                goto L_0x00b1
            L_0x00db:
                r12 = r9
            L_0x00dc:
                r10 = r2
            L_0x00dd:
                if (r10 >= r1) goto L_0x032b
                if (r17 == 0) goto L_0x00e5
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e6
            L_0x00e5:
                r13 = r10
            L_0x00e6:
                int r14 = r0.f15732n
                int r14 = r14 + r13
                z.g r15 = z.g.this
                int r15 = r15.f15718b2
                if (r14 < r15) goto L_0x00f3
                goto L_0x032b
            L_0x00f3:
                z.g r14 = z.g.this
                z.e[] r14 = r14.f15717a2
                int r15 = r0.f15732n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r10 != 0) goto L_0x0109
                z.d r15 = r14.J
                z.d r11 = r0.f15722d
                int r3 = r0.f15726h
                r14.l(r15, r11, r3)
            L_0x0109:
                if (r13 != 0) goto L_0x014c
                z.g r3 = z.g.this
                int r3 = r3.D1
                z.g r11 = z.g.this
                float r11 = r11.J1
                int r13 = r0.f15732n
                if (r13 != 0) goto L_0x0130
                z.g r13 = z.g.this
                int r13 = r13.F1
                if (r13 == r5) goto L_0x0130
                z.g r3 = z.g.this
                int r3 = r3.F1
                z.g r11 = z.g.this
                float r11 = r11.L1
                goto L_0x0146
            L_0x0130:
                if (r19 == 0) goto L_0x0146
                z.g r13 = z.g.this
                int r13 = r13.H1
                if (r13 == r5) goto L_0x0146
                z.g r3 = z.g.this
                int r3 = r3.H1
                z.g r11 = z.g.this
                float r11 = r11.N1
            L_0x0146:
                r14.g1(r3)
                r14.f1(r11)
            L_0x014c:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x0159
                z.d r3 = r14.L
                z.d r11 = r0.f15724f
                int r13 = r0.f15728j
                r14.l(r3, r11, r13)
            L_0x0159:
                if (r6 == 0) goto L_0x0184
                z.d r3 = r14.J
                z.d r11 = r6.L
                z.g r13 = z.g.this
                int r13 = r13.P1
                r3.a(r11, r13)
                if (r10 != r7) goto L_0x0171
                z.d r3 = r14.J
                int r11 = r0.f15726h
                r3.B(r11)
            L_0x0171:
                z.d r3 = r6.L
                z.d r11 = r14.J
                r3.a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x0184
                z.d r3 = r6.L
                int r6 = r0.f15728j
                r3.B(r6)
            L_0x0184:
                if (r14 == r9) goto L_0x01d4
                z.g r3 = z.g.this
                int r3 = r3.S1
                r6 = 3
                if (r3 != r6) goto L_0x01a2
                boolean r3 = r12.m0()
                if (r3 == 0) goto L_0x01a2
                if (r14 == r12) goto L_0x01a2
                boolean r3 = r14.m0()
                if (r3 == 0) goto L_0x01a2
                z.d r3 = r14.N
                z.d r11 = r12.N
                goto L_0x01d0
            L_0x01a2:
                z.g r3 = z.g.this
                int r3 = r3.S1
                if (r3 == 0) goto L_0x01cc
                r11 = 1
                if (r3 == r11) goto L_0x01c7
                z.d r3 = r14.K
                if (r4 == 0) goto L_0x01c2
                z.d r11 = r0.f15723e
                int r13 = r0.f15727i
                r3.a(r11, r13)
                z.d r3 = r14.M
                z.d r11 = r0.f15725g
                int r13 = r0.f15729k
                r3.a(r11, r13)
                goto L_0x01d5
            L_0x01c2:
                z.d r11 = r9.K
                r3.a(r11, r2)
            L_0x01c7:
                z.d r3 = r14.M
                z.d r11 = r9.M
                goto L_0x01d0
            L_0x01cc:
                z.d r3 = r14.K
                z.d r11 = r9.K
            L_0x01d0:
                r3.a(r11, r2)
                goto L_0x01d5
            L_0x01d4:
                r6 = 3
            L_0x01d5:
                int r10 = r10 + 1
                r11 = r6
                r6 = r14
                goto L_0x00dd
            L_0x01db:
                z.e r3 = r0.f15720b
                z.g r9 = z.g.this
                int r9 = r9.D1
                r3.g1(r9)
                int r9 = r0.f15726h
                if (r18 <= 0) goto L_0x01f1
                z.g r10 = z.g.this
                int r10 = r10.P1
                int r9 = r9 + r10
            L_0x01f1:
                if (r17 == 0) goto L_0x0210
                z.d r10 = r3.L
                z.d r11 = r0.f15724f
                r10.a(r11, r9)
                if (r19 == 0) goto L_0x0205
                z.d r9 = r3.J
                z.d r10 = r0.f15722d
                int r11 = r0.f15728j
                r9.a(r10, r11)
            L_0x0205:
                if (r18 <= 0) goto L_0x022f
                z.d r9 = r0.f15724f
                z.e r9 = r9.f15621d
                z.d r9 = r9.J
                z.d r10 = r3.L
                goto L_0x022c
            L_0x0210:
                z.d r10 = r3.J
                z.d r11 = r0.f15722d
                r10.a(r11, r9)
                if (r19 == 0) goto L_0x0222
                z.d r9 = r3.L
                z.d r10 = r0.f15724f
                int r11 = r0.f15728j
                r9.a(r10, r11)
            L_0x0222:
                if (r18 <= 0) goto L_0x022f
                z.d r9 = r0.f15722d
                z.e r9 = r9.f15621d
                z.d r9 = r9.L
                z.d r10 = r3.J
            L_0x022c:
                r9.a(r10, r2)
            L_0x022f:
                r9 = r2
            L_0x0230:
                if (r9 >= r1) goto L_0x032b
                int r10 = r0.f15732n
                int r10 = r10 + r9
                z.g r11 = z.g.this
                int r11 = r11.f15718b2
                if (r10 < r11) goto L_0x023f
                goto L_0x032b
            L_0x023f:
                z.g r10 = z.g.this
                z.e[] r10 = r10.f15717a2
                int r11 = r0.f15732n
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r9 != 0) goto L_0x0296
                z.d r11 = r10.K
                z.d r12 = r0.f15723e
                int r13 = r0.f15727i
                r10.l(r11, r12, r13)
                z.g r11 = z.g.this
                int r11 = r11.E1
                z.g r12 = z.g.this
                float r12 = r12.K1
                int r13 = r0.f15732n
                if (r13 != 0) goto L_0x027a
                z.g r13 = z.g.this
                int r13 = r13.G1
                if (r13 == r5) goto L_0x027a
                z.g r11 = z.g.this
                int r11 = r11.G1
                z.g r12 = z.g.this
                float r12 = r12.M1
                goto L_0x0290
            L_0x027a:
                if (r19 == 0) goto L_0x0290
                z.g r13 = z.g.this
                int r13 = r13.I1
                if (r13 == r5) goto L_0x0290
                z.g r11 = z.g.this
                int r11 = r11.I1
                z.g r12 = z.g.this
                float r12 = r12.O1
            L_0x0290:
                r10.B1(r11)
                r10.A1(r12)
            L_0x0296:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02a3
                z.d r11 = r10.M
                z.d r12 = r0.f15725g
                int r13 = r0.f15729k
                r10.l(r11, r12, r13)
            L_0x02a3:
                if (r6 == 0) goto L_0x02ce
                z.d r11 = r10.K
                z.d r12 = r6.M
                z.g r13 = z.g.this
                int r13 = r13.Q1
                r11.a(r12, r13)
                if (r9 != r7) goto L_0x02bb
                z.d r11 = r10.K
                int r12 = r0.f15727i
                r11.B(r12)
            L_0x02bb:
                z.d r11 = r6.M
                z.d r12 = r10.K
                r11.a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x02ce
                z.d r6 = r6.M
                int r11 = r0.f15729k
                r6.B(r11)
            L_0x02ce:
                if (r10 == r3) goto L_0x0325
                r6 = 2
                z.g r11 = z.g.this
                int r11 = r11.R1
                if (r17 == 0) goto L_0x02f6
                if (r11 == 0) goto L_0x02ee
                r12 = 1
                if (r11 == r12) goto L_0x02e9
                if (r11 == r6) goto L_0x02e1
                goto L_0x0325
            L_0x02e1:
                z.d r6 = r10.J
                z.d r11 = r3.J
                r6.a(r11, r2)
                goto L_0x02ee
            L_0x02e9:
                z.d r6 = r10.J
                z.d r11 = r3.J
                goto L_0x02f2
            L_0x02ee:
                z.d r6 = r10.L
                z.d r11 = r3.L
            L_0x02f2:
                r6.a(r11, r2)
                goto L_0x0325
            L_0x02f6:
                r12 = 1
                if (r11 == 0) goto L_0x031d
                if (r11 == r12) goto L_0x0318
                if (r11 == r6) goto L_0x02fe
                goto L_0x0326
            L_0x02fe:
                z.d r6 = r10.J
                if (r4 == 0) goto L_0x0313
                z.d r11 = r0.f15722d
                int r13 = r0.f15726h
                r6.a(r11, r13)
                z.d r6 = r10.L
                z.d r11 = r0.f15724f
                int r13 = r0.f15728j
                r6.a(r11, r13)
                goto L_0x0326
            L_0x0313:
                z.d r11 = r3.J
                r6.a(r11, r2)
            L_0x0318:
                z.d r6 = r10.L
                z.d r11 = r3.L
                goto L_0x0321
            L_0x031d:
                z.d r6 = r10.J
                z.d r11 = r3.J
            L_0x0321:
                r6.a(r11, r2)
                goto L_0x0326
            L_0x0325:
                r12 = 1
            L_0x0326:
                int r9 = r9 + 1
                r6 = r10
                goto L_0x0230
            L_0x032b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z.g.a.d(boolean, int, boolean):void");
        }

        public int e() {
            return this.f15719a == 1 ? this.f15731m - g.this.Q1 : this.f15731m;
        }

        public int f() {
            return this.f15719a == 0 ? this.f15730l - g.this.P1 : this.f15730l;
        }

        public void g(int i10) {
            int i11;
            e.b bVar;
            int i12;
            e.b bVar2;
            g gVar;
            int i13 = this.f15734p;
            if (i13 != 0) {
                int i14 = this.f15733o;
                int i15 = i10 / i13;
                int i16 = 0;
                while (i16 < i14 && this.f15732n + i16 < g.this.f15718b2) {
                    e eVar = g.this.f15717a2[this.f15732n + i16];
                    if (this.f15719a == 0) {
                        if (eVar != null && eVar.H() == e.b.MATCH_CONSTRAINT && eVar.f15672p == 0) {
                            gVar = g.this;
                            bVar2 = e.b.FIXED;
                            bVar = eVar.g0();
                            i11 = eVar.D();
                            i12 = i15;
                        }
                        i16++;
                    } else {
                        if (eVar != null && eVar.g0() == e.b.MATCH_CONSTRAINT && eVar.f15674q == 0) {
                            gVar = g.this;
                            bVar2 = eVar.H();
                            i12 = eVar.j0();
                            bVar = e.b.FIXED;
                            i11 = i15;
                        }
                        i16++;
                    }
                    gVar.Z1(eVar, bVar2, i12, bVar, i11);
                    i16++;
                }
                h();
            }
        }

        public final void h() {
            this.f15730l = 0;
            this.f15731m = 0;
            this.f15720b = null;
            this.f15721c = 0;
            int i10 = this.f15733o;
            int i11 = 0;
            while (i11 < i10 && this.f15732n + i11 < g.this.f15718b2) {
                e eVar = g.this.f15717a2[this.f15732n + i11];
                if (this.f15719a == 0) {
                    int j02 = eVar.j0();
                    int l22 = g.this.P1;
                    if (eVar.i0() == 8) {
                        l22 = 0;
                    }
                    this.f15730l += j02 + l22;
                    int y22 = g.this.G2(eVar, this.f15735q);
                    if (this.f15720b == null || this.f15721c < y22) {
                        this.f15720b = eVar;
                        this.f15721c = y22;
                        this.f15731m = y22;
                    }
                } else {
                    int x22 = g.this.H2(eVar, this.f15735q);
                    int y23 = g.this.G2(eVar, this.f15735q);
                    int m22 = g.this.Q1;
                    if (eVar.i0() == 8) {
                        m22 = 0;
                    }
                    this.f15731m += y23 + m22;
                    if (this.f15720b == null || this.f15721c < x22) {
                        this.f15720b = eVar;
                        this.f15721c = x22;
                        this.f15730l = x22;
                    }
                }
                i11++;
            }
        }

        public void i(int i10) {
            this.f15732n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f15719a = i10;
            this.f15722d = dVar;
            this.f15723e = dVar2;
            this.f15724f = dVar3;
            this.f15725g = dVar4;
            this.f15726h = i11;
            this.f15727i = i12;
            this.f15728j = i13;
            this.f15729k = i14;
            this.f15735q = i15;
        }
    }

    public final void F2(boolean z10) {
        e eVar;
        if (this.Z1 != null && this.Y1 != null && this.X1 != null) {
            for (int i10 = 0; i10 < this.f15718b2; i10++) {
                this.f15717a2[i10].I0();
            }
            int[] iArr = this.Z1;
            int i11 = iArr[0];
            int i12 = iArr[1];
            e eVar2 = null;
            for (int i13 = 0; i13 < i11; i13++) {
                e eVar3 = this.Y1[z10 ? (i11 - i13) - 1 : i13];
                if (!(eVar3 == null || eVar3.i0() == 8)) {
                    if (i13 == 0) {
                        eVar3.l(eVar3.J, this.J, V1());
                        eVar3.g1(this.D1);
                        eVar3.f1(this.J1);
                    }
                    if (i13 == i11 - 1) {
                        eVar3.l(eVar3.L, this.L, W1());
                    }
                    if (i13 > 0) {
                        eVar3.l(eVar3.J, eVar2.L, this.P1);
                        eVar2.l(eVar2.L, eVar3.J, 0);
                    }
                    eVar2 = eVar3;
                }
            }
            for (int i14 = 0; i14 < i12; i14++) {
                e eVar4 = this.X1[i14];
                if (!(eVar4 == null || eVar4.i0() == 8)) {
                    if (i14 == 0) {
                        eVar4.l(eVar4.K, this.K, X1());
                        eVar4.B1(this.E1);
                        eVar4.A1(this.K1);
                    }
                    if (i14 == i12 - 1) {
                        eVar4.l(eVar4.M, this.M, U1());
                    }
                    if (i14 > 0) {
                        eVar4.l(eVar4.K, eVar2.M, this.Q1);
                        eVar2.l(eVar2.M, eVar4.K, 0);
                    }
                    eVar2 = eVar4;
                }
            }
            for (int i15 = 0; i15 < i11; i15++) {
                for (int i16 = 0; i16 < i12; i16++) {
                    int i17 = (i16 * i11) + i15;
                    if (this.V1 == 1) {
                        i17 = (i15 * i12) + i16;
                    }
                    e[] eVarArr = this.f15717a2;
                    if (!(i17 >= eVarArr.length || (eVar = eVarArr[i17]) == null || eVar.i0() == 8)) {
                        e eVar5 = this.Y1[i15];
                        e eVar6 = this.X1[i16];
                        if (eVar != eVar5) {
                            eVar.l(eVar.J, eVar5.J, 0);
                            eVar.l(eVar.L, eVar5.L, 0);
                        }
                        if (eVar != eVar6) {
                            eVar.l(eVar.K, eVar6.K, 0);
                            eVar.l(eVar.M, eVar6.M, 0);
                        }
                    }
                }
            }
        }
    }

    public final int G2(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.g0() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f15674q;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f15688x * ((float) i10));
                if (i12 != eVar.D()) {
                    eVar.s1(true);
                    Z1(eVar, eVar.H(), eVar.j0(), e.b.FIXED, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.D();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) eVar.j0()) * eVar.Y) + 0.5f);
                }
            }
        }
        return eVar.D();
    }

    public final int H2(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.H() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f15672p;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f15682u * ((float) i10));
                if (i12 != eVar.j0()) {
                    eVar.s1(true);
                    Z1(eVar, e.b.FIXED, i12, eVar.g0(), eVar.D());
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.j0();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) eVar.D()) * eVar.Y) + 0.5f);
                }
            }
        }
        return eVar.j0();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x011b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005c  */
    public final void I2(z.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            r10 = this;
            r0 = 0
            int r1 = r10.U1
            if (r13 != 0) goto L_0x0026
            if (r1 > 0) goto L_0x0023
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x000a:
            if (r2 >= r12) goto L_0x0023
            if (r2 <= 0) goto L_0x0011
            int r4 = r10.P1
            int r3 = r3 + r4
        L_0x0011:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            int r4 = r10.H2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r1 + 1
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0023:
            r2 = r1
            r1 = r0
            goto L_0x0045
        L_0x0026:
            if (r1 > 0) goto L_0x0044
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x002b:
            if (r2 >= r12) goto L_0x0044
            if (r2 <= 0) goto L_0x0032
            int r4 = r10.Q1
            int r3 = r3 + r4
        L_0x0032:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            int r4 = r10.G2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
        L_0x0041:
            int r2 = r2 + 1
            goto L_0x002b
        L_0x0044:
            r2 = r0
        L_0x0045:
            int[] r3 = r10.Z1
            if (r3 != 0) goto L_0x004e
            r3 = 2
            int[] r3 = new int[r3]
            r10.Z1 = r3
        L_0x004e:
            r3 = 1
            if (r1 != 0) goto L_0x0053
            if (r13 == r3) goto L_0x0057
        L_0x0053:
            if (r2 != 0) goto L_0x0059
            if (r13 != 0) goto L_0x0059
        L_0x0057:
            r4 = r3
            goto L_0x005a
        L_0x0059:
            r4 = r0
        L_0x005a:
            if (r4 != 0) goto L_0x011b
            if (r13 != 0) goto L_0x0068
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L_0x0071
        L_0x0068:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L_0x0071:
            z.e[] r5 = r10.Y1
            r6 = 0
            if (r5 == 0) goto L_0x007e
            int r7 = r5.length
            if (r7 >= r2) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0082
        L_0x007e:
            z.e[] r5 = new z.e[r2]
            r10.Y1 = r5
        L_0x0082:
            z.e[] r5 = r10.X1
            if (r5 == 0) goto L_0x008e
            int r7 = r5.length
            if (r7 >= r1) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0092
        L_0x008e:
            z.e[] r5 = new z.e[r1]
            r10.X1 = r5
        L_0x0092:
            r5 = r0
        L_0x0093:
            if (r5 >= r2) goto L_0x00d7
            r6 = r0
        L_0x0096:
            if (r6 >= r1) goto L_0x00d4
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto L_0x00a0
            int r7 = r5 * r1
            int r7 = r7 + r6
        L_0x00a0:
            int r8 = r11.length
            if (r7 < r8) goto L_0x00a4
            goto L_0x00d1
        L_0x00a4:
            r7 = r11[r7]
            if (r7 != 0) goto L_0x00a9
            goto L_0x00d1
        L_0x00a9:
            int r8 = r10.H2(r7, r14)
            z.e[] r9 = r10.Y1
            r9 = r9[r5]
            if (r9 == 0) goto L_0x00b9
            int r9 = r9.j0()
            if (r9 >= r8) goto L_0x00bd
        L_0x00b9:
            z.e[] r8 = r10.Y1
            r8[r5] = r7
        L_0x00bd:
            int r8 = r10.G2(r7, r14)
            z.e[] r9 = r10.X1
            r9 = r9[r6]
            if (r9 == 0) goto L_0x00cd
            int r9 = r9.D()
            if (r9 >= r8) goto L_0x00d1
        L_0x00cd:
            z.e[] r8 = r10.X1
            r8[r6] = r7
        L_0x00d1:
            int r6 = r6 + 1
            goto L_0x0096
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x00d7:
            r5 = r0
            r6 = r5
        L_0x00d9:
            if (r5 >= r2) goto L_0x00ee
            z.e[] r7 = r10.Y1
            r7 = r7[r5]
            if (r7 == 0) goto L_0x00eb
            if (r5 <= 0) goto L_0x00e6
            int r8 = r10.P1
            int r6 = r6 + r8
        L_0x00e6:
            int r7 = r10.H2(r7, r14)
            int r6 = r6 + r7
        L_0x00eb:
            int r5 = r5 + 1
            goto L_0x00d9
        L_0x00ee:
            r5 = r0
            r7 = r5
        L_0x00f0:
            if (r5 >= r1) goto L_0x0105
            z.e[] r8 = r10.X1
            r8 = r8[r5]
            if (r8 == 0) goto L_0x0102
            if (r5 <= 0) goto L_0x00fd
            int r9 = r10.Q1
            int r7 = r7 + r9
        L_0x00fd:
            int r8 = r10.G2(r8, r14)
            int r7 = r7 + r8
        L_0x0102:
            int r5 = r5 + 1
            goto L_0x00f0
        L_0x0105:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L_0x0113
            if (r6 <= r14) goto L_0x0057
            if (r2 <= r3) goto L_0x0057
            int r2 = r2 + -1
            goto L_0x005a
        L_0x0113:
            if (r7 <= r14) goto L_0x0057
            if (r1 <= r3) goto L_0x0057
            int r1 = r1 + -1
            goto L_0x005a
        L_0x011b:
            int[] r11 = r10.Z1
            r11[r0] = r2
            r11[r3] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.g.I2(z.e[], int, int, int, int[]):void");
    }

    public final void J2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        d dVar;
        int i13;
        int i14;
        int i15;
        d dVar2;
        int i16;
        int i17;
        int i18;
        int i19 = i10;
        int i20 = i12;
        if (i19 != 0) {
            this.W1.clear();
            a aVar = new a(i11, this.J, this.K, this.L, this.M, i12);
            this.W1.add(aVar);
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            if (i11 == 0) {
                while (i23 < i19) {
                    e eVar = eVarArr[i23];
                    int H2 = H2(eVar, i20);
                    if (eVar.H() == e.b.MATCH_CONSTRAINT) {
                        i21++;
                    }
                    int i24 = i21;
                    boolean z10 = (i22 == i20 || (this.P1 + i22) + H2 > i20) && aVar.f15720b != null;
                    if (!z10 && i23 > 0 && (i18 = this.U1) > 0 && i23 % i18 == 0) {
                        z10 = true;
                    }
                    if (z10) {
                        aVar = new a(i11, this.J, this.K, this.L, this.M, i12);
                        aVar.i(i23);
                        this.W1.add(aVar);
                    } else if (i23 > 0) {
                        i22 += this.P1 + H2;
                        aVar.b(eVar);
                        i23++;
                        i21 = i24;
                    }
                    i22 = H2;
                    aVar.b(eVar);
                    i23++;
                    i21 = i24;
                }
            } else {
                while (i23 < i19) {
                    e eVar2 = eVarArr[i23];
                    int G2 = G2(eVar2, i20);
                    if (eVar2.g0() == e.b.MATCH_CONSTRAINT) {
                        i21++;
                    }
                    int i25 = i21;
                    boolean z11 = (i22 == i20 || (this.Q1 + i22) + G2 > i20) && aVar.f15720b != null;
                    if (!z11 && i23 > 0 && (i17 = this.U1) > 0 && i23 % i17 == 0) {
                        z11 = true;
                    }
                    if (z11) {
                        aVar = new a(i11, this.J, this.K, this.L, this.M, i12);
                        aVar.i(i23);
                        this.W1.add(aVar);
                    } else if (i23 > 0) {
                        i16 = i22 + this.Q1 + G2;
                        aVar.b(eVar2);
                        i23++;
                        i21 = i25;
                    }
                    i16 = G2;
                    aVar.b(eVar2);
                    i23++;
                    i21 = i25;
                }
            }
            int size = this.W1.size();
            d dVar3 = this.J;
            d dVar4 = this.K;
            d dVar5 = this.L;
            d dVar6 = this.M;
            int V12 = V1();
            int X12 = X1();
            int W12 = W1();
            int U12 = U1();
            e.b H = H();
            e.b bVar = e.b.WRAP_CONTENT;
            boolean z12 = H == bVar || g0() == bVar;
            if (i21 > 0 && z12) {
                for (int i26 = 0; i26 < size; i26++) {
                    a aVar2 = this.W1.get(i26);
                    aVar2.g(i20 - (i11 == 0 ? aVar2.f() : aVar2.e()));
                }
            }
            int i27 = X12;
            int i28 = W12;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = V12;
            d dVar7 = dVar4;
            d dVar8 = dVar3;
            int i33 = U12;
            while (i31 < size) {
                a aVar3 = this.W1.get(i31);
                if (i11 == 0) {
                    if (i31 < size - 1) {
                        dVar2 = this.W1.get(i31 + 1).f15720b.K;
                        i15 = 0;
                    } else {
                        dVar2 = this.M;
                        i15 = U1();
                    }
                    d dVar9 = aVar3.f15720b.M;
                    d dVar10 = dVar8;
                    d dVar11 = dVar8;
                    int i34 = i29;
                    d dVar12 = dVar7;
                    int i35 = i30;
                    d dVar13 = dVar5;
                    d dVar14 = dVar5;
                    i13 = i31;
                    aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i32, i27, i28, i15, i12);
                    int max = Math.max(i35, aVar3.f());
                    i29 = i34 + aVar3.e();
                    if (i13 > 0) {
                        i29 += this.Q1;
                    }
                    dVar8 = dVar11;
                    i30 = max;
                    i27 = 0;
                    dVar7 = dVar9;
                    dVar = dVar14;
                    int i36 = i15;
                    dVar6 = dVar2;
                    i33 = i36;
                } else {
                    d dVar15 = dVar8;
                    int i37 = i29;
                    int i38 = i30;
                    i13 = i31;
                    if (i13 < size - 1) {
                        dVar = this.W1.get(i13 + 1).f15720b.J;
                        i14 = 0;
                    } else {
                        dVar = this.L;
                        i14 = W1();
                    }
                    d dVar16 = aVar3.f15720b.L;
                    aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i32, i27, i14, i33, i12);
                    i30 = i38 + aVar3.f();
                    int max2 = Math.max(i37, aVar3.e());
                    if (i13 > 0) {
                        i30 += this.P1;
                    }
                    i29 = max2;
                    i32 = 0;
                    i28 = i14;
                    dVar8 = dVar16;
                }
                i31 = i13 + 1;
                int i39 = i12;
                dVar5 = dVar;
            }
            iArr[0] = i30;
            iArr[1] = i29;
        }
    }

    public final void K2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        int i13 = i10;
        if (i13 != 0) {
            if (this.W1.size() == 0) {
                aVar = new a(i11, this.J, this.K, this.L, this.M, i12);
                this.W1.add(aVar);
            } else {
                a aVar2 = this.W1.get(0);
                aVar2.c();
                aVar = aVar2;
                aVar.j(i11, this.J, this.K, this.L, this.M, V1(), X1(), W1(), U1(), i12);
            }
            for (int i14 = 0; i14 < i13; i14++) {
                aVar.b(eVarArr[i14]);
            }
            iArr[0] = aVar.f();
            iArr[1] = aVar.e();
        }
    }

    public void L2(float f10) {
        this.L1 = f10;
    }

    public void M2(int i10) {
        this.F1 = i10;
    }

    public void N2(float f10) {
        this.M1 = f10;
    }

    public void O2(int i10) {
        this.G1 = i10;
    }

    public void P2(int i10) {
        this.R1 = i10;
    }

    public void Q2(float f10) {
        this.J1 = f10;
    }

    public void R2(int i10) {
        this.P1 = i10;
    }

    public void S2(int i10) {
        this.D1 = i10;
    }

    public void T2(float f10) {
        this.N1 = f10;
    }

    public void U2(int i10) {
        this.H1 = i10;
    }

    public void V2(float f10) {
        this.O1 = f10;
    }

    public void W2(int i10) {
        this.I1 = i10;
    }

    public void X2(int i10) {
        this.U1 = i10;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r6.E1 == -1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r6.E1 == -1) goto L_0x0054;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Y1(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.f15751p1
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.a2()
            if (r0 != 0) goto L_0x001c
            r6.d2(r11, r11)
            r6.c2(r11)
            return
        L_0x001c:
            int r12 = r18.V1()
            int r13 = r18.W1()
            int r14 = r18.X1()
            int r15 = r18.U1()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.V1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004a
            int r2 = r6.D1
            if (r2 != r1) goto L_0x0045
            r6.D1 = r11
        L_0x0045:
            int r2 = r6.E1
            if (r2 != r1) goto L_0x0056
            goto L_0x0054
        L_0x004a:
            int r2 = r6.D1
            if (r2 != r1) goto L_0x0050
            r6.D1 = r11
        L_0x0050:
            int r2 = r6.E1
            if (r2 != r1) goto L_0x0056
        L_0x0054:
            r6.E1 = r11
        L_0x0056:
            z.e[] r1 = r6.f15750o1
            r2 = r11
            r3 = r2
        L_0x005a:
            int r11 = r6.f15751p1
            r0 = 8
            if (r2 >= r11) goto L_0x0070
            z.e[] r11 = r6.f15750o1
            r11 = r11[r2]
            int r11 = r11.i0()
            if (r11 != r0) goto L_0x006c
            int r3 = r3 + 1
        L_0x006c:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005a
        L_0x0070:
            if (r3 <= 0) goto L_0x008f
            int r11 = r11 - r3
            z.e[] r1 = new z.e[r11]
            r2 = 0
            r3 = 0
        L_0x0077:
            int r11 = r6.f15751p1
            if (r2 >= r11) goto L_0x008d
            z.e[] r11 = r6.f15750o1
            r11 = r11[r2]
            int r4 = r11.i0()
            if (r4 == r0) goto L_0x0089
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x0089:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0077
        L_0x008d:
            r2 = r3
            goto L_0x0090
        L_0x008f:
            r2 = r11
        L_0x0090:
            r6.f15717a2 = r1
            r6.f15718b2 = r2
            int r0 = r6.T1
            if (r0 == 0) goto L_0x00bd
            r4 = 1
            if (r0 == r4) goto L_0x00b0
            r3 = 2
            if (r0 == r3) goto L_0x00a3
            r11 = r4
            r17 = r5
        L_0x00a1:
            r0 = 0
            goto L_0x00ca
        L_0x00a3:
            int r3 = r6.V1
            r0 = r18
            r11 = r4
            r4 = r16
            r17 = r5
            r0.I2(r1, r2, r3, r4, r5)
            goto L_0x00a1
        L_0x00b0:
            r11 = r4
            r17 = r5
            int r3 = r6.V1
            r0 = r18
            r4 = r16
            r0.J2(r1, r2, r3, r4, r5)
            goto L_0x00a1
        L_0x00bd:
            r17 = r5
            r11 = 1
            int r3 = r6.V1
            r0 = r18
            r4 = r16
            r0.K2(r1, r2, r3, r4, r5)
            goto L_0x00a1
        L_0x00ca:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00da
            r1 = r8
            goto L_0x00e5
        L_0x00da:
            if (r7 != r3) goto L_0x00e1
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00e5
        L_0x00e1:
            if (r7 != 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r1 = r0
        L_0x00e5:
            if (r9 != r4) goto L_0x00e9
            r2 = r10
            goto L_0x00f4
        L_0x00e9:
            if (r9 != r3) goto L_0x00f0
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x00f4
        L_0x00f0:
            if (r9 != 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r2 = r0
        L_0x00f4:
            r6.d2(r1, r2)
            r6.H1(r1)
            r6.d1(r2)
            int r1 = r6.f15751p1
            if (r1 <= 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r11 = r0
        L_0x0103:
            r6.c2(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.g.Y1(int, int, int, int):void");
    }

    public void Y2(int i10) {
        this.V1 = i10;
    }

    public void Z2(int i10) {
        this.S1 = i10;
    }

    public void a3(float f10) {
        this.K1 = f10;
    }

    public void b3(int i10) {
        this.Q1 = i10;
    }

    public void c3(int i10) {
        this.E1 = i10;
    }

    public void d3(int i10) {
        this.T1 = i10;
    }

    public void g(w.e eVar, boolean z10) {
        super.g(eVar, z10);
        boolean s22 = U() != null ? ((f) U()).s2() : false;
        int i10 = this.T1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.W1.size();
                int i11 = 0;
                while (i11 < size) {
                    this.W1.get(i11).d(s22, i11, i11 == size + -1);
                    i11++;
                }
            } else if (i10 == 2) {
                F2(s22);
            }
        } else if (this.W1.size() > 0) {
            this.W1.get(0).d(s22, 0, true);
        }
        c2(false);
    }

    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        g gVar = (g) eVar;
        this.D1 = gVar.D1;
        this.E1 = gVar.E1;
        this.F1 = gVar.F1;
        this.G1 = gVar.G1;
        this.H1 = gVar.H1;
        this.I1 = gVar.I1;
        this.J1 = gVar.J1;
        this.K1 = gVar.K1;
        this.L1 = gVar.L1;
        this.M1 = gVar.M1;
        this.N1 = gVar.N1;
        this.O1 = gVar.O1;
        this.P1 = gVar.P1;
        this.Q1 = gVar.Q1;
        this.R1 = gVar.R1;
        this.S1 = gVar.S1;
        this.T1 = gVar.T1;
        this.U1 = gVar.U1;
        this.V1 = gVar.V1;
    }
}
