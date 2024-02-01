package r6;

import android.util.SparseArray;
import b6.c;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.q;
import java.io.IOException;
import w7.j0;
import w7.v;
import w7.w;

public final class y implements i {
    public static final int A = 240;

    /* renamed from: o  reason: collision with root package name */
    public static final l f12542o = new x();

    /* renamed from: p  reason: collision with root package name */
    public static final int f12543p = 442;

    /* renamed from: q  reason: collision with root package name */
    public static final int f12544q = 443;

    /* renamed from: r  reason: collision with root package name */
    public static final int f12545r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12546s = 441;

    /* renamed from: t  reason: collision with root package name */
    public static final int f12547t = 256;

    /* renamed from: u  reason: collision with root package name */
    public static final long f12548u = 1048576;

    /* renamed from: v  reason: collision with root package name */
    public static final long f12549v = 8192;

    /* renamed from: w  reason: collision with root package name */
    public static final int f12550w = 189;

    /* renamed from: x  reason: collision with root package name */
    public static final int f12551x = 192;

    /* renamed from: y  reason: collision with root package name */
    public static final int f12552y = 224;

    /* renamed from: z  reason: collision with root package name */
    public static final int f12553z = 224;

    /* renamed from: d  reason: collision with root package name */
    public final j0 f12554d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<a> f12555e;

    /* renamed from: f  reason: collision with root package name */
    public final w f12556f;

    /* renamed from: g  reason: collision with root package name */
    public final w f12557g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12558h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12559i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12560j;

    /* renamed from: k  reason: collision with root package name */
    public long f12561k;

    /* renamed from: l  reason: collision with root package name */
    public v f12562l;

    /* renamed from: m  reason: collision with root package name */
    public k f12563m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12564n;

    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final int f12565i = 64;

        /* renamed from: a  reason: collision with root package name */
        public final m f12566a;

        /* renamed from: b  reason: collision with root package name */
        public final j0 f12567b;

        /* renamed from: c  reason: collision with root package name */
        public final v f12568c = new v(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        public boolean f12569d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f12570e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f12571f;

        /* renamed from: g  reason: collision with root package name */
        public int f12572g;

        /* renamed from: h  reason: collision with root package name */
        public long f12573h;

        public a(m mVar, j0 j0Var) {
            this.f12566a = mVar;
            this.f12567b = j0Var;
        }

        public void a(w wVar) throws b6.j0 {
            wVar.i(this.f12568c.f14876a, 0, 3);
            this.f12568c.n(0);
            b();
            wVar.i(this.f12568c.f14876a, 0, this.f12572g);
            this.f12568c.n(0);
            c();
            this.f12566a.f(this.f12573h, 4);
            this.f12566a.b(wVar);
            this.f12566a.d();
        }

        public final void b() {
            this.f12568c.p(8);
            this.f12569d = this.f12568c.g();
            this.f12570e = this.f12568c.g();
            this.f12568c.p(6);
            this.f12572g = this.f12568c.h(8);
        }

        public final void c() {
            this.f12573h = 0;
            if (this.f12569d) {
                this.f12568c.p(4);
                this.f12568c.p(1);
                this.f12568c.p(1);
                long h10 = (((long) this.f12568c.h(3)) << 30) | ((long) (this.f12568c.h(15) << 15)) | ((long) this.f12568c.h(15));
                this.f12568c.p(1);
                if (!this.f12571f && this.f12570e) {
                    this.f12568c.p(4);
                    this.f12568c.p(1);
                    this.f12568c.p(1);
                    this.f12568c.p(1);
                    this.f12567b.b((((long) this.f12568c.h(3)) << 30) | ((long) (this.f12568c.h(15) << 15)) | ((long) this.f12568c.h(15)));
                    this.f12571f = true;
                }
                this.f12573h = this.f12567b.b(h10);
            }
        }

        public void d() {
            this.f12571f = false;
            this.f12566a.c();
        }
    }

    public y() {
        this(new j0(0));
    }

    public y(j0 j0Var) {
        this.f12554d = j0Var;
        this.f12556f = new w(4096);
        this.f12555e = new SparseArray<>();
        this.f12557g = new w();
    }

    public static /* synthetic */ i[] d() {
        return new i[]{new y()};
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        jVar.k(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        jVar.e(bArr[13] & 7);
        jVar.k(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public final void e(long j10) {
        q qVar;
        k kVar;
        if (!this.f12564n) {
            this.f12564n = true;
            if (this.f12557g.c() != c.f4201b) {
                v vVar = new v(this.f12557g.d(), this.f12557g.c(), j10);
                this.f12562l = vVar;
                kVar = this.f12563m;
                qVar = vVar.b();
            } else {
                kVar = this.f12563m;
                qVar = new q.b(this.f12557g.c());
            }
            kVar.q(qVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(j6.j r12, j6.p r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r11 = this;
            long r0 = r12.getLength()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x000e
            r7 = r5
            goto L_0x000f
        L_0x000e:
            r7 = r6
        L_0x000f:
            if (r7 == 0) goto L_0x0020
            r6.w r7 = r11.f12557g
            boolean r7 = r7.e()
            if (r7 != 0) goto L_0x0020
            r6.w r0 = r11.f12557g
            int r12 = r0.g(r12, r13)
            return r12
        L_0x0020:
            r11.e(r0)
            r6.v r7 = r11.f12562l
            r8 = 0
            if (r7 == 0) goto L_0x0035
            boolean r7 = r7.d()
            if (r7 == 0) goto L_0x0035
            r6.v r0 = r11.f12562l
            int r12 = r0.c(r12, r13, r8)
            return r12
        L_0x0035:
            r12.h()
            if (r4 == 0) goto L_0x0040
            long r9 = r12.d()
            long r0 = r0 - r9
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = -1
            if (r13 == 0) goto L_0x004d
            r3 = 4
            int r13 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x004d
            return r2
        L_0x004d:
            w7.w r13 = r11.f12556f
            byte[] r13 = r13.f14880a
            r0 = 4
            boolean r13 = r12.c(r13, r6, r0, r5)
            if (r13 != 0) goto L_0x0059
            return r2
        L_0x0059:
            w7.w r13 = r11.f12556f
            r13.Q(r6)
            w7.w r13 = r11.f12556f
            int r13 = r13.l()
            r0 = 441(0x1b9, float:6.18E-43)
            if (r13 != r0) goto L_0x0069
            return r2
        L_0x0069:
            r0 = 442(0x1ba, float:6.2E-43)
            if (r13 != r0) goto L_0x008b
            w7.w r13 = r11.f12556f
            byte[] r13 = r13.f14880a
            r0 = 10
            r12.k(r13, r6, r0)
            w7.w r13 = r11.f12556f
            r0 = 9
            r13.Q(r0)
            w7.w r13 = r11.f12556f
            int r13 = r13.D()
            r13 = r13 & 7
            int r13 = r13 + 14
        L_0x0087:
            r12.i(r13)
            return r6
        L_0x008b:
            r0 = 443(0x1bb, float:6.21E-43)
            r1 = 2
            r2 = 6
            if (r13 != r0) goto L_0x00a5
            w7.w r13 = r11.f12556f
            byte[] r13 = r13.f14880a
            r12.k(r13, r6, r1)
            w7.w r13 = r11.f12556f
            r13.Q(r6)
            w7.w r13 = r11.f12556f
            int r13 = r13.J()
            int r13 = r13 + r2
            goto L_0x0087
        L_0x00a5:
            r0 = r13 & -256(0xffffffffffffff00, float:NaN)
            int r0 = r0 >> 8
            if (r0 == r5) goto L_0x00af
            r12.i(r5)
            return r6
        L_0x00af:
            r13 = r13 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<r6.y$a> r0 = r11.f12555e
            java.lang.Object r0 = r0.get(r13)
            r6.y$a r0 = (r6.y.a) r0
            boolean r3 = r11.f12558h
            if (r3 != 0) goto L_0x0125
            if (r0 != 0) goto L_0x0105
            r3 = 189(0xbd, float:2.65E-43)
            if (r13 != r3) goto L_0x00d1
            r6.c r8 = new r6.c
            r8.<init>()
        L_0x00c8:
            r11.f12559i = r5
        L_0x00ca:
            long r3 = r12.getPosition()
            r11.f12561k = r3
            goto L_0x00eb
        L_0x00d1:
            r3 = r13 & 224(0xe0, float:3.14E-43)
            r4 = 192(0xc0, float:2.69E-43)
            if (r3 != r4) goto L_0x00dd
            r6.s r8 = new r6.s
            r8.<init>()
            goto L_0x00c8
        L_0x00dd:
            r3 = r13 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r3 != r4) goto L_0x00eb
            r6.n r8 = new r6.n
            r8.<init>()
            r11.f12560j = r5
            goto L_0x00ca
        L_0x00eb:
            if (r8 == 0) goto L_0x0105
            r6.h0$e r0 = new r6.h0$e
            r3 = 256(0x100, float:3.59E-43)
            r0.<init>(r13, r3)
            j6.k r3 = r11.f12563m
            r8.e(r3, r0)
            r6.y$a r0 = new r6.y$a
            w7.j0 r3 = r11.f12554d
            r0.<init>(r8, r3)
            android.util.SparseArray<r6.y$a> r3 = r11.f12555e
            r3.put(r13, r0)
        L_0x0105:
            boolean r13 = r11.f12559i
            if (r13 == 0) goto L_0x0113
            boolean r13 = r11.f12560j
            if (r13 == 0) goto L_0x0113
            long r3 = r11.f12561k
            r7 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 + r7
            goto L_0x0116
        L_0x0113:
            r3 = 1048576(0x100000, double:5.180654E-318)
        L_0x0116:
            long r7 = r12.getPosition()
            int r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x0125
            r11.f12558h = r5
            j6.k r13 = r11.f12563m
            r13.r()
        L_0x0125:
            w7.w r13 = r11.f12556f
            byte[] r13 = r13.f14880a
            r12.k(r13, r6, r1)
            w7.w r13 = r11.f12556f
            r13.Q(r6)
            w7.w r13 = r11.f12556f
            int r13 = r13.J()
            int r13 = r13 + r2
            if (r0 != 0) goto L_0x013e
            r12.i(r13)
            goto L_0x015d
        L_0x013e:
            w7.w r1 = r11.f12556f
            r1.M(r13)
            w7.w r1 = r11.f12556f
            byte[] r1 = r1.f14880a
            r12.readFully(r1, r6, r13)
            w7.w r12 = r11.f12556f
            r12.Q(r2)
            w7.w r12 = r11.f12556f
            r0.a(r12)
            w7.w r12 = r11.f12556f
            int r13 = r12.b()
            r12.P(r13)
        L_0x015d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.y.f(j6.j, j6.p):int");
    }

    public void g(k kVar) {
        this.f12563m = kVar;
    }

    public void h(long j10, long j11) {
        if ((this.f12554d.e() == c.f4201b) || !(this.f12554d.c() == 0 || this.f12554d.c() == j11)) {
            this.f12554d.g();
            this.f12554d.h(j11);
        }
        v vVar = this.f12562l;
        if (vVar != null) {
            vVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f12555e.size(); i10++) {
            this.f12555e.valueAt(i10).d();
        }
    }
}
