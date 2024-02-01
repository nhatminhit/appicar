package r6;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.k;
import j6.s;
import java.util.ArrayList;
import java.util.Arrays;
import r6.h0;
import w7.d;
import w7.t;
import w7.w;
import w7.x;

public final class o implements m {

    /* renamed from: p  reason: collision with root package name */
    public static final int f12357p = 6;

    /* renamed from: q  reason: collision with root package name */
    public static final int f12358q = 7;

    /* renamed from: r  reason: collision with root package name */
    public static final int f12359r = 8;

    /* renamed from: a  reason: collision with root package name */
    public final b0 f12360a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12361b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12362c;

    /* renamed from: d  reason: collision with root package name */
    public final t f12363d = new t(7, 128);

    /* renamed from: e  reason: collision with root package name */
    public final t f12364e = new t(8, 128);

    /* renamed from: f  reason: collision with root package name */
    public final t f12365f = new t(6, 128);

    /* renamed from: g  reason: collision with root package name */
    public long f12366g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f12367h = new boolean[3];

    /* renamed from: i  reason: collision with root package name */
    public String f12368i;

    /* renamed from: j  reason: collision with root package name */
    public s f12369j;

    /* renamed from: k  reason: collision with root package name */
    public b f12370k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12371l;

    /* renamed from: m  reason: collision with root package name */
    public long f12372m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12373n;

    /* renamed from: o  reason: collision with root package name */
    public final w f12374o = new w();

    public static final class b {

        /* renamed from: s  reason: collision with root package name */
        public static final int f12375s = 128;

        /* renamed from: t  reason: collision with root package name */
        public static final int f12376t = 1;

        /* renamed from: u  reason: collision with root package name */
        public static final int f12377u = 2;

        /* renamed from: v  reason: collision with root package name */
        public static final int f12378v = 5;

        /* renamed from: w  reason: collision with root package name */
        public static final int f12379w = 9;

        /* renamed from: a  reason: collision with root package name */
        public final s f12380a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12381b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f12382c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<t.b> f12383d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<t.a> f12384e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final x f12385f;

        /* renamed from: g  reason: collision with root package name */
        public byte[] f12386g;

        /* renamed from: h  reason: collision with root package name */
        public int f12387h;

        /* renamed from: i  reason: collision with root package name */
        public int f12388i;

        /* renamed from: j  reason: collision with root package name */
        public long f12389j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f12390k;

        /* renamed from: l  reason: collision with root package name */
        public long f12391l;

        /* renamed from: m  reason: collision with root package name */
        public a f12392m = new a();

        /* renamed from: n  reason: collision with root package name */
        public a f12393n = new a();

        /* renamed from: o  reason: collision with root package name */
        public boolean f12394o;

        /* renamed from: p  reason: collision with root package name */
        public long f12395p;

        /* renamed from: q  reason: collision with root package name */
        public long f12396q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f12397r;

        public static final class a {

            /* renamed from: q  reason: collision with root package name */
            public static final int f12398q = 2;

            /* renamed from: r  reason: collision with root package name */
            public static final int f12399r = 7;

            /* renamed from: a  reason: collision with root package name */
            public boolean f12400a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f12401b;

            /* renamed from: c  reason: collision with root package name */
            public t.b f12402c;

            /* renamed from: d  reason: collision with root package name */
            public int f12403d;

            /* renamed from: e  reason: collision with root package name */
            public int f12404e;

            /* renamed from: f  reason: collision with root package name */
            public int f12405f;

            /* renamed from: g  reason: collision with root package name */
            public int f12406g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f12407h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f12408i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f12409j;

            /* renamed from: k  reason: collision with root package name */
            public boolean f12410k;

            /* renamed from: l  reason: collision with root package name */
            public int f12411l;

            /* renamed from: m  reason: collision with root package name */
            public int f12412m;

            /* renamed from: n  reason: collision with root package name */
            public int f12413n;

            /* renamed from: o  reason: collision with root package name */
            public int f12414o;

            /* renamed from: p  reason: collision with root package name */
            public int f12415p;

            public a() {
            }

            public void b() {
                this.f12401b = false;
                this.f12400a = false;
            }

            public final boolean c(a aVar) {
                boolean z10;
                boolean z11;
                if (this.f12400a) {
                    if (!aVar.f12400a || this.f12405f != aVar.f12405f || this.f12406g != aVar.f12406g || this.f12407h != aVar.f12407h) {
                        return true;
                    }
                    if (this.f12408i && aVar.f12408i && this.f12409j != aVar.f12409j) {
                        return true;
                    }
                    int i10 = this.f12403d;
                    int i11 = aVar.f12403d;
                    if (i10 != i11 && (i10 == 0 || i11 == 0)) {
                        return true;
                    }
                    int i12 = this.f12402c.f14867k;
                    if (i12 == 0 && aVar.f12402c.f14867k == 0 && (this.f12412m != aVar.f12412m || this.f12413n != aVar.f12413n)) {
                        return true;
                    }
                    if ((i12 != 1 || aVar.f12402c.f14867k != 1 || (this.f12414o == aVar.f12414o && this.f12415p == aVar.f12415p)) && (z10 = this.f12410k) == (z11 = aVar.f12410k)) {
                        return z10 && z11 && this.f12411l != aVar.f12411l;
                    }
                    return true;
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f12404e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean d() {
                /*
                    r2 = this;
                    boolean r0 = r2.f12401b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f12404e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: r6.o.b.a.d():boolean");
            }

            public void e(t.b bVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f12402c = bVar;
                this.f12403d = i10;
                this.f12404e = i11;
                this.f12405f = i12;
                this.f12406g = i13;
                this.f12407h = z10;
                this.f12408i = z11;
                this.f12409j = z12;
                this.f12410k = z13;
                this.f12411l = i14;
                this.f12412m = i15;
                this.f12413n = i16;
                this.f12414o = i17;
                this.f12415p = i18;
                this.f12400a = true;
                this.f12401b = true;
            }

            public void f(int i10) {
                this.f12404e = i10;
                this.f12401b = true;
            }
        }

        public b(s sVar, boolean z10, boolean z11) {
            this.f12380a = sVar;
            this.f12381b = z10;
            this.f12382c = z11;
            byte[] bArr = new byte[128];
            this.f12386g = bArr;
            this.f12385f = new x(bArr, 0, 0);
            g();
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0152  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f12390k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f12386g
                int r4 = r3.length
                int r5 = r0.f12387h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001d
                int r5 = r5 + r2
                int r5 = r5 * r7
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f12386g = r3
            L_0x001d:
                byte[] r3 = r0.f12386g
                int r4 = r0.f12387h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f12387h
                int r1 = r1 + r2
                r0.f12387h = r1
                w7.x r2 = r0.f12385f
                byte[] r3 = r0.f12386g
                r4 = 0
                r2.i(r3, r4, r1)
                w7.x r1 = r0.f12385f
                r2 = 8
                boolean r1 = r1.b(r2)
                if (r1 != 0) goto L_0x003e
                return
            L_0x003e:
                w7.x r1 = r0.f12385f
                r1.k()
                w7.x r1 = r0.f12385f
                int r10 = r1.e(r7)
                w7.x r1 = r0.f12385f
                r2 = 5
                r1.l(r2)
                w7.x r1 = r0.f12385f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0058
                return
            L_0x0058:
                w7.x r1 = r0.f12385f
                r1.h()
                w7.x r1 = r0.f12385f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0066
                return
            L_0x0066:
                w7.x r1 = r0.f12385f
                int r11 = r1.h()
                boolean r1 = r0.f12382c
                if (r1 != 0) goto L_0x0078
                r0.f12390k = r4
                r6.o$b$a r1 = r0.f12393n
                r1.f(r11)
                return
            L_0x0078:
                w7.x r1 = r0.f12385f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0081
                return
            L_0x0081:
                w7.x r1 = r0.f12385f
                int r13 = r1.h()
                android.util.SparseArray<w7.t$a> r1 = r0.f12384e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0092
                r0.f12390k = r4
                return
            L_0x0092:
                android.util.SparseArray<w7.t$a> r1 = r0.f12384e
                java.lang.Object r1 = r1.get(r13)
                w7.t$a r1 = (w7.t.a) r1
                android.util.SparseArray<w7.t$b> r3 = r0.f12383d
                int r5 = r1.f14855b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                w7.t$b r9 = (w7.t.b) r9
                boolean r3 = r9.f14864h
                if (r3 == 0) goto L_0x00b7
                w7.x r3 = r0.f12385f
                boolean r3 = r3.b(r7)
                if (r3 != 0) goto L_0x00b2
                return
            L_0x00b2:
                w7.x r3 = r0.f12385f
                r3.l(r7)
            L_0x00b7:
                w7.x r3 = r0.f12385f
                int r5 = r9.f14866j
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00c2
                return
            L_0x00c2:
                w7.x r3 = r0.f12385f
                int r5 = r9.f14866j
                int r12 = r3.e(r5)
                boolean r3 = r9.f14865i
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                w7.x r3 = r0.f12385f
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00d8
                return
            L_0x00d8:
                w7.x r3 = r0.f12385f
                boolean r3 = r3.d()
                if (r3 == 0) goto L_0x00f4
                w7.x r6 = r0.f12385f
                boolean r6 = r6.b(r5)
                if (r6 != 0) goto L_0x00e9
                return
            L_0x00e9:
                w7.x r6 = r0.f12385f
                boolean r6 = r6.d()
                r14 = r3
                r15 = r5
                r16 = r6
                goto L_0x00fb
            L_0x00f4:
                r14 = r3
                r15 = r4
                goto L_0x00f9
            L_0x00f7:
                r14 = r4
                r15 = r14
            L_0x00f9:
                r16 = r15
            L_0x00fb:
                int r3 = r0.f12388i
                if (r3 != r2) goto L_0x0102
                r17 = r5
                goto L_0x0104
            L_0x0102:
                r17 = r4
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                w7.x r2 = r0.f12385f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                w7.x r2 = r0.f12385f
                int r2 = r2.h()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = r4
            L_0x011a:
                int r2 = r9.f14867k
                if (r2 != 0) goto L_0x0152
                w7.x r2 = r0.f12385f
                int r3 = r9.f14868l
                boolean r2 = r2.b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                w7.x r2 = r0.f12385f
                int r3 = r9.f14868l
                int r2 = r2.e(r3)
                boolean r1 = r1.f14856c
                if (r1 == 0) goto L_0x014d
                if (r14 != 0) goto L_0x014d
                w7.x r1 = r0.f12385f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                w7.x r1 = r0.f12385f
                int r1 = r1.g()
                r20 = r1
                r19 = r2
                r21 = r4
                goto L_0x0194
            L_0x014d:
                r19 = r2
                r20 = r4
                goto L_0x0192
            L_0x0152:
                if (r2 != r5) goto L_0x018e
                boolean r2 = r9.f14869m
                if (r2 != 0) goto L_0x018e
                w7.x r2 = r0.f12385f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x0161
                return
            L_0x0161:
                w7.x r2 = r0.f12385f
                int r2 = r2.g()
                boolean r1 = r1.f14856c
                if (r1 == 0) goto L_0x0185
                if (r14 != 0) goto L_0x0185
                w7.x r1 = r0.f12385f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0176
                return
            L_0x0176:
                w7.x r1 = r0.f12385f
                int r1 = r1.g()
                r22 = r1
                r21 = r2
                r19 = r4
                r20 = r19
                goto L_0x0196
            L_0x0185:
                r21 = r2
                r19 = r4
                r20 = r19
                r22 = r20
                goto L_0x0196
            L_0x018e:
                r19 = r4
                r20 = r19
            L_0x0192:
                r21 = r20
            L_0x0194:
                r22 = r21
            L_0x0196:
                r6.o$b$a r8 = r0.f12393n
                r8.e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f12390k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r6.o.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f12388i == 9 || (this.f12382c && this.f12393n.c(this.f12392m))) {
                if (z10 && this.f12394o) {
                    d(i10 + ((int) (j10 - this.f12389j)));
                }
                this.f12395p = this.f12389j;
                this.f12396q = this.f12391l;
                this.f12397r = false;
                this.f12394o = true;
            }
            if (this.f12381b) {
                z11 = this.f12393n.d();
            }
            boolean z13 = this.f12397r;
            int i11 = this.f12388i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f12397r = z14;
            return z14;
        }

        public boolean c() {
            return this.f12382c;
        }

        public final void d(int i10) {
            boolean z10 = this.f12397r;
            int i11 = (int) (this.f12389j - this.f12395p);
            this.f12380a.c(this.f12396q, z10 ? 1 : 0, i11, i10, (s.a) null);
        }

        public void e(t.a aVar) {
            this.f12384e.append(aVar.f14854a, aVar);
        }

        public void f(t.b bVar) {
            this.f12383d.append(bVar.f14860d, bVar);
        }

        public void g() {
            this.f12390k = false;
            this.f12394o = false;
            this.f12393n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f12388i = i10;
            this.f12391l = j11;
            this.f12389j = j10;
            if (!this.f12381b || i10 != 1) {
                if (!this.f12382c) {
                    return;
                }
                if (!(i10 == 5 || i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            a aVar = this.f12392m;
            this.f12392m = this.f12393n;
            this.f12393n = aVar;
            aVar.b();
            this.f12387h = 0;
            this.f12390k = true;
        }
    }

    public o(b0 b0Var, boolean z10, boolean z11) {
        this.f12360a = b0Var;
        this.f12361b = z10;
        this.f12362c = z11;
    }

    public final void a(long j10, int i10, int i11, long j11) {
        t tVar;
        int i12 = i11;
        if (!this.f12371l || this.f12370k.c()) {
            this.f12363d.b(i12);
            this.f12364e.b(i12);
            if (!this.f12371l) {
                if (this.f12363d.c() && this.f12364e.c()) {
                    ArrayList arrayList = new ArrayList();
                    t tVar2 = this.f12363d;
                    arrayList.add(Arrays.copyOf(tVar2.f12506d, tVar2.f12507e));
                    t tVar3 = this.f12364e;
                    arrayList.add(Arrays.copyOf(tVar3.f12506d, tVar3.f12507e));
                    t tVar4 = this.f12363d;
                    t.b i13 = t.i(tVar4.f12506d, 3, tVar4.f12507e);
                    t tVar5 = this.f12364e;
                    t.a h10 = t.h(tVar5.f12506d, 3, tVar5.f12507e);
                    this.f12369j.d(Format.G(this.f12368i, w7.s.f14813h, d.c(i13.f14857a, i13.f14858b, i13.f14859c), -1, -1, i13.f14861e, i13.f14862f, -1.0f, arrayList, -1, i13.f14863g, (DrmInitData) null));
                    this.f12371l = true;
                    this.f12370k.f(i13);
                    this.f12370k.e(h10);
                    this.f12363d.d();
                    tVar = this.f12364e;
                }
            } else if (this.f12363d.c()) {
                t tVar6 = this.f12363d;
                this.f12370k.f(t.i(tVar6.f12506d, 3, tVar6.f12507e));
                tVar = this.f12363d;
            } else if (this.f12364e.c()) {
                t tVar7 = this.f12364e;
                this.f12370k.e(t.h(tVar7.f12506d, 3, tVar7.f12507e));
                tVar = this.f12364e;
            }
            tVar.d();
        }
        if (this.f12365f.b(i11)) {
            t tVar8 = this.f12365f;
            this.f12374o.O(this.f12365f.f12506d, t.k(tVar8.f12506d, tVar8.f12507e));
            this.f12374o.Q(4);
            this.f12360a.a(j11, this.f12374o);
        }
        if (this.f12370k.b(j10, i10, this.f12371l, this.f12373n)) {
            this.f12373n = false;
        }
    }

    public void b(w wVar) {
        int c10 = wVar.c();
        int d10 = wVar.d();
        byte[] bArr = wVar.f14880a;
        this.f12366g += (long) wVar.a();
        this.f12369j.a(wVar, wVar.a());
        while (true) {
            int c11 = t.c(bArr, c10, d10, this.f12367h);
            if (c11 == d10) {
                g(bArr, c10, d10);
                return;
            }
            int f10 = t.f(bArr, c11);
            int i10 = c11 - c10;
            if (i10 > 0) {
                g(bArr, c10, c11);
            }
            int i11 = d10 - c11;
            long j10 = this.f12366g - ((long) i11);
            a(j10, i11, i10 < 0 ? -i10 : 0, this.f12372m);
            h(j10, f10, this.f12372m);
            c10 = c11 + 3;
        }
    }

    public void c() {
        t.a(this.f12367h);
        this.f12363d.d();
        this.f12364e.d();
        this.f12365f.d();
        this.f12370k.g();
        this.f12366g = 0;
        this.f12373n = false;
    }

    public void d() {
    }

    public void e(k kVar, h0.e eVar) {
        eVar.a();
        this.f12368i = eVar.b();
        s a10 = kVar.a(eVar.c(), 2);
        this.f12369j = a10;
        this.f12370k = new b(a10, this.f12361b, this.f12362c);
        this.f12360a.b(kVar, eVar);
    }

    public void f(long j10, int i10) {
        this.f12372m = j10;
        this.f12373n |= (i10 & 2) != 0;
    }

    public final void g(byte[] bArr, int i10, int i11) {
        if (!this.f12371l || this.f12370k.c()) {
            this.f12363d.a(bArr, i10, i11);
            this.f12364e.a(bArr, i10, i11);
        }
        this.f12365f.a(bArr, i10, i11);
        this.f12370k.a(bArr, i10, i11);
    }

    public final void h(long j10, int i10, long j11) {
        if (!this.f12371l || this.f12370k.c()) {
            this.f12363d.e(i10);
            this.f12364e.e(i10);
        }
        this.f12365f.e(i10);
        this.f12370k.h(j10, i10, j11);
    }
}
