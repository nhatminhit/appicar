package r6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.k;
import j6.s;
import java.util.Collections;
import r6.h0;
import w7.t;
import w7.w;
import w7.x;
import xe.o;

public final class p implements m {

    /* renamed from: o  reason: collision with root package name */
    public static final String f12416o = "H265Reader";

    /* renamed from: p  reason: collision with root package name */
    public static final int f12417p = 9;

    /* renamed from: q  reason: collision with root package name */
    public static final int f12418q = 16;

    /* renamed from: r  reason: collision with root package name */
    public static final int f12419r = 21;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12420s = 32;

    /* renamed from: t  reason: collision with root package name */
    public static final int f12421t = 33;

    /* renamed from: u  reason: collision with root package name */
    public static final int f12422u = 34;

    /* renamed from: v  reason: collision with root package name */
    public static final int f12423v = 39;

    /* renamed from: w  reason: collision with root package name */
    public static final int f12424w = 40;

    /* renamed from: a  reason: collision with root package name */
    public final b0 f12425a;

    /* renamed from: b  reason: collision with root package name */
    public String f12426b;

    /* renamed from: c  reason: collision with root package name */
    public s f12427c;

    /* renamed from: d  reason: collision with root package name */
    public a f12428d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12429e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f12430f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final t f12431g = new t(32, 128);

    /* renamed from: h  reason: collision with root package name */
    public final t f12432h = new t(33, 128);

    /* renamed from: i  reason: collision with root package name */
    public final t f12433i = new t(34, 128);

    /* renamed from: j  reason: collision with root package name */
    public final t f12434j = new t(39, 128);

    /* renamed from: k  reason: collision with root package name */
    public final t f12435k = new t(40, 128);

    /* renamed from: l  reason: collision with root package name */
    public long f12436l;

    /* renamed from: m  reason: collision with root package name */
    public long f12437m;

    /* renamed from: n  reason: collision with root package name */
    public final w f12438n = new w();

    public static final class a {

        /* renamed from: n  reason: collision with root package name */
        public static final int f12439n = 2;

        /* renamed from: a  reason: collision with root package name */
        public final s f12440a;

        /* renamed from: b  reason: collision with root package name */
        public long f12441b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12442c;

        /* renamed from: d  reason: collision with root package name */
        public int f12443d;

        /* renamed from: e  reason: collision with root package name */
        public long f12444e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f12445f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f12446g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f12447h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f12448i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f12449j;

        /* renamed from: k  reason: collision with root package name */
        public long f12450k;

        /* renamed from: l  reason: collision with root package name */
        public long f12451l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f12452m;

        public a(s sVar) {
            this.f12440a = sVar;
        }

        public void a(long j10, int i10) {
            if (this.f12449j && this.f12446g) {
                this.f12452m = this.f12442c;
                this.f12449j = false;
            } else if (this.f12447h || this.f12446g) {
                if (this.f12448i) {
                    b(i10 + ((int) (j10 - this.f12441b)));
                }
                this.f12450k = this.f12441b;
                this.f12451l = this.f12444e;
                this.f12448i = true;
                this.f12452m = this.f12442c;
            }
        }

        public final void b(int i10) {
            boolean z10 = this.f12452m;
            int i11 = (int) (this.f12441b - this.f12450k);
            this.f12440a.c(this.f12451l, z10 ? 1 : 0, i11, i10, (s.a) null);
        }

        public void c(byte[] bArr, int i10, int i11) {
            if (this.f12445f) {
                int i12 = this.f12443d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f12446g = (bArr[i13] & o.f24535b) != 0;
                    this.f12445f = false;
                    return;
                }
                this.f12443d = i12 + (i11 - i10);
            }
        }

        public void d() {
            this.f12445f = false;
            this.f12446g = false;
            this.f12447h = false;
            this.f12448i = false;
            this.f12449j = false;
        }

        public void e(long j10, int i10, int i11, long j11) {
            boolean z10 = false;
            this.f12446g = false;
            this.f12447h = false;
            this.f12444e = j11;
            this.f12443d = 0;
            this.f12441b = j10;
            if (i11 >= 32) {
                if (!this.f12449j && this.f12448i) {
                    b(i10);
                    this.f12448i = false;
                }
                if (i11 <= 34) {
                    this.f12447h = !this.f12449j;
                    this.f12449j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f12442c = z11;
            if (z11 || i11 <= 9) {
                z10 = true;
            }
            this.f12445f = z10;
        }
    }

    public p(b0 b0Var) {
        this.f12425a = b0Var;
    }

    public static Format h(String str, t tVar, t tVar2, t tVar3) {
        float f10;
        t tVar4 = tVar;
        t tVar5 = tVar2;
        t tVar6 = tVar3;
        int i10 = tVar4.f12507e;
        byte[] bArr = new byte[(tVar5.f12507e + i10 + tVar6.f12507e)];
        System.arraycopy(tVar4.f12506d, 0, bArr, 0, i10);
        System.arraycopy(tVar5.f12506d, 0, bArr, tVar4.f12507e, tVar5.f12507e);
        System.arraycopy(tVar6.f12506d, 0, bArr, tVar4.f12507e + tVar5.f12507e, tVar6.f12507e);
        x xVar = new x(tVar5.f12506d, 0, tVar5.f12507e);
        xVar.l(44);
        int e10 = xVar.e(3);
        xVar.k();
        xVar.l(88);
        xVar.l(8);
        int i11 = 0;
        for (int i12 = 0; i12 < e10; i12++) {
            if (xVar.d()) {
                i11 += 89;
            }
            if (xVar.d()) {
                i11 += 8;
            }
        }
        xVar.l(i11);
        if (e10 > 0) {
            xVar.l((8 - e10) * 2);
        }
        xVar.h();
        int h10 = xVar.h();
        if (h10 == 3) {
            xVar.k();
        }
        int h11 = xVar.h();
        int h12 = xVar.h();
        if (xVar.d()) {
            int h13 = xVar.h();
            int h14 = xVar.h();
            int h15 = xVar.h();
            int h16 = xVar.h();
            h11 -= ((h10 == 1 || h10 == 2) ? 2 : 1) * (h13 + h14);
            h12 -= (h10 == 1 ? 2 : 1) * (h15 + h16);
        }
        int i13 = h11;
        int i14 = h12;
        xVar.h();
        xVar.h();
        int h17 = xVar.h();
        int i15 = xVar.d() ? 0 : e10;
        while (true) {
            xVar.h();
            xVar.h();
            xVar.h();
            if (i15 > e10) {
                break;
            }
            i15++;
        }
        xVar.h();
        xVar.h();
        xVar.h();
        if (xVar.d() && xVar.d()) {
            i(xVar);
        }
        xVar.l(2);
        if (xVar.d()) {
            xVar.l(8);
            xVar.h();
            xVar.h();
            xVar.k();
        }
        j(xVar);
        if (xVar.d()) {
            for (int i16 = 0; i16 < xVar.h(); i16++) {
                xVar.l(h17 + 4 + 1);
            }
        }
        xVar.l(2);
        float f11 = 1.0f;
        if (xVar.d() && xVar.d()) {
            int e11 = xVar.e(8);
            if (e11 == 255) {
                int e12 = xVar.e(16);
                int e13 = xVar.e(16);
                if (!(e12 == 0 || e13 == 0)) {
                    f11 = ((float) e12) / ((float) e13);
                }
            } else {
                float[] fArr = t.f14848d;
                if (e11 < fArr.length) {
                    f10 = fArr[e11];
                    return Format.G(str, w7.s.f14815i, (String) null, -1, -1, i13, i14, -1.0f, Collections.singletonList(bArr), -1, f10, (DrmInitData) null);
                }
                w7.p.l(f12416o, "Unexpected aspect_ratio_idc value: " + e11);
            }
        }
        f10 = f11;
        return Format.G(str, w7.s.f14815i, (String) null, -1, -1, i13, i14, -1.0f, Collections.singletonList(bArr), -1, f10, (DrmInitData) null);
    }

    public static void i(x xVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!xVar.d()) {
                    xVar.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        xVar.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        xVar.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void j(x xVar) {
        int h10 = xVar.h();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            if (i11 != 0) {
                z10 = xVar.d();
            }
            if (z10) {
                xVar.k();
                xVar.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (xVar.d()) {
                        xVar.k();
                    }
                }
            } else {
                int h11 = xVar.h();
                int h12 = xVar.h();
                int i13 = h11 + h12;
                for (int i14 = 0; i14 < h11; i14++) {
                    xVar.h();
                    xVar.k();
                }
                for (int i15 = 0; i15 < h12; i15++) {
                    xVar.h();
                    xVar.k();
                }
                i10 = i13;
            }
        }
    }

    public final void a(long j10, int i10, int i11, long j11) {
        if (this.f12429e) {
            this.f12428d.a(j10, i10);
        } else {
            this.f12431g.b(i11);
            this.f12432h.b(i11);
            this.f12433i.b(i11);
            if (this.f12431g.c() && this.f12432h.c() && this.f12433i.c()) {
                this.f12427c.d(h(this.f12426b, this.f12431g, this.f12432h, this.f12433i));
                this.f12429e = true;
            }
        }
        if (this.f12434j.b(i11)) {
            t tVar = this.f12434j;
            this.f12438n.O(this.f12434j.f12506d, t.k(tVar.f12506d, tVar.f12507e));
            this.f12438n.R(5);
            this.f12425a.a(j11, this.f12438n);
        }
        if (this.f12435k.b(i11)) {
            t tVar2 = this.f12435k;
            this.f12438n.O(this.f12435k.f12506d, t.k(tVar2.f12506d, tVar2.f12507e));
            this.f12438n.R(5);
            this.f12425a.a(j11, this.f12438n);
        }
    }

    public void b(w wVar) {
        w wVar2 = wVar;
        while (wVar.a() > 0) {
            int c10 = wVar.c();
            int d10 = wVar.d();
            byte[] bArr = wVar2.f14880a;
            this.f12436l += (long) wVar.a();
            this.f12427c.a(wVar2, wVar.a());
            while (true) {
                if (c10 < d10) {
                    int c11 = t.c(bArr, c10, d10, this.f12430f);
                    if (c11 == d10) {
                        g(bArr, c10, d10);
                        return;
                    }
                    int e10 = t.e(bArr, c11);
                    int i10 = c11 - c10;
                    if (i10 > 0) {
                        g(bArr, c10, c11);
                    }
                    int i11 = d10 - c11;
                    long j10 = this.f12436l - ((long) i11);
                    int i12 = i10 < 0 ? -i10 : 0;
                    long j11 = j10;
                    int i13 = i11;
                    a(j11, i13, i12, this.f12437m);
                    k(j11, i13, e10, this.f12437m);
                    c10 = c11 + 3;
                }
            }
        }
    }

    public void c() {
        t.a(this.f12430f);
        this.f12431g.d();
        this.f12432h.d();
        this.f12433i.d();
        this.f12434j.d();
        this.f12435k.d();
        this.f12428d.d();
        this.f12436l = 0;
    }

    public void d() {
    }

    public void e(k kVar, h0.e eVar) {
        eVar.a();
        this.f12426b = eVar.b();
        s a10 = kVar.a(eVar.c(), 2);
        this.f12427c = a10;
        this.f12428d = new a(a10);
        this.f12425a.b(kVar, eVar);
    }

    public void f(long j10, int i10) {
        this.f12437m = j10;
    }

    public final void g(byte[] bArr, int i10, int i11) {
        if (this.f12429e) {
            this.f12428d.c(bArr, i10, i11);
        } else {
            this.f12431g.a(bArr, i10, i11);
            this.f12432h.a(bArr, i10, i11);
            this.f12433i.a(bArr, i10, i11);
        }
        this.f12434j.a(bArr, i10, i11);
        this.f12435k.a(bArr, i10, i11);
    }

    public final void k(long j10, int i10, int i11, long j11) {
        if (this.f12429e) {
            this.f12428d.e(j10, i10, i11, j11);
        } else {
            this.f12431g.e(i11);
            this.f12432h.e(i11);
            this.f12433i.e(i11);
        }
        this.f12434j.e(i11);
        this.f12435k.e(i11);
    }
}
