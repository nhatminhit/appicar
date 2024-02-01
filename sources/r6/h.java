package r6;

import b6.c;
import b6.j0;
import d.o0;
import j6.d;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.p;
import j6.q;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import r6.h0;
import w7.q0;
import w7.v;
import w7.w;

public final class h implements i {

    /* renamed from: q  reason: collision with root package name */
    public static final l f12235q = new g();

    /* renamed from: r  reason: collision with root package name */
    public static final int f12236r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12237s = 2048;

    /* renamed from: t  reason: collision with root package name */
    public static final int f12238t = q0.T("ID3");

    /* renamed from: u  reason: collision with root package name */
    public static final int f12239u = 8192;

    /* renamed from: v  reason: collision with root package name */
    public static final int f12240v = 1000;

    /* renamed from: d  reason: collision with root package name */
    public final int f12241d;

    /* renamed from: e  reason: collision with root package name */
    public final i f12242e;

    /* renamed from: f  reason: collision with root package name */
    public final w f12243f;

    /* renamed from: g  reason: collision with root package name */
    public final w f12244g;

    /* renamed from: h  reason: collision with root package name */
    public final v f12245h;

    /* renamed from: i  reason: collision with root package name */
    public final long f12246i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public k f12247j;

    /* renamed from: k  reason: collision with root package name */
    public long f12248k;

    /* renamed from: l  reason: collision with root package name */
    public long f12249l;

    /* renamed from: m  reason: collision with root package name */
    public int f12250m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12251n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12252o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12253p;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public h() {
        this(0);
    }

    public h(long j10) {
        this(j10, 0);
    }

    public h(long j10, int i10) {
        this.f12246i = j10;
        this.f12248k = j10;
        this.f12241d = i10;
        this.f12242e = new i(true);
        this.f12243f = new w(2048);
        this.f12250m = -1;
        this.f12249l = -1;
        w wVar = new w(10);
        this.f12244g = wVar;
        this.f12245h = new v(wVar.f14880a);
    }

    public static int e(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    public static /* synthetic */ i[] j() {
        return new i[]{new h()};
    }

    public void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r9.h();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(j6.j r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            int r0 = r8.l(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = r1
            r4 = r2
        L_0x0008:
            w7.w r5 = r8.f12244g
            byte[] r5 = r5.f14880a
            r6 = 2
            r9.k(r5, r1, r6)
            w7.w r5 = r8.f12244g
            r5.Q(r1)
            w7.w r5 = r8.f12244g
            int r5 = r5.J()
            boolean r5 = r6.i.l(r5)
            if (r5 != 0) goto L_0x0031
            r9.h()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002d
            return r1
        L_0x002d:
            r9.e(r3)
            goto L_0x0006
        L_0x0031:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003b
            return r5
        L_0x003b:
            w7.w r5 = r8.f12244g
            byte[] r5 = r5.f14880a
            r9.k(r5, r1, r6)
            w7.v r5 = r8.f12245h
            r6 = 14
            r5.n(r6)
            w7.v r5 = r8.f12245h
            r6 = 13
            int r5 = r5.h(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0055
            return r1
        L_0x0055:
            int r6 = r5 + -6
            r9.e(r6)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.h.c(j6.j):boolean");
    }

    public final void d(j jVar) throws IOException, InterruptedException {
        if (!this.f12251n) {
            this.f12250m = -1;
            jVar.h();
            long j10 = 0;
            if (jVar.getPosition() == 0) {
                l(jVar);
            }
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (!jVar.c(this.f12244g.f14880a, 0, 2, true)) {
                    break;
                }
                this.f12244g.Q(0);
                if (!i.l(this.f12244g.J())) {
                    break;
                } else if (!jVar.c(this.f12244g.f14880a, 0, 4, true)) {
                    break;
                } else {
                    this.f12245h.n(14);
                    int h10 = this.f12245h.h(13);
                    if (h10 > 6) {
                        j10 += (long) h10;
                        i11++;
                        if (i11 != 1000) {
                            if (!jVar.j(h10 - 6, true)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        this.f12251n = true;
                        throw new j0("Malformed ADTS stream");
                    }
                }
            }
            i10 = i11;
            jVar.h();
            if (i10 > 0) {
                this.f12250m = (int) (j10 / ((long) i10));
            } else {
                this.f12250m = -1;
            }
            this.f12251n = true;
        }
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        long length = jVar.getLength();
        boolean z10 = ((this.f12241d & 1) == 0 || length == -1) ? false : true;
        if (z10) {
            d(jVar);
        }
        int read = jVar.read(this.f12243f.f14880a, 0, 2048);
        boolean z11 = read == -1;
        k(length, z10, z11);
        if (z11) {
            return -1;
        }
        this.f12243f.Q(0);
        this.f12243f.P(read);
        if (!this.f12252o) {
            this.f12242e.f(this.f12248k, 4);
            this.f12252o = true;
        }
        this.f12242e.b(this.f12243f);
        return 0;
    }

    public void g(k kVar) {
        this.f12247j = kVar;
        this.f12242e.e(kVar, new h0.e(0, 1));
        kVar.r();
    }

    public void h(long j10, long j11) {
        this.f12252o = false;
        this.f12242e.c();
        this.f12248k = this.f12246i + j11;
    }

    public final q i(long j10) {
        return new d(j10, this.f12249l, e(this.f12250m, this.f12242e.j()), this.f12250m);
    }

    public final void k(long j10, boolean z10, boolean z11) {
        if (!this.f12253p) {
            boolean z12 = z10 && this.f12250m > 0;
            if (!z12 || this.f12242e.j() != c.f4201b || z11) {
                ((k) w7.a.g(this.f12247j)).q((!z12 || this.f12242e.j() == c.f4201b) ? new q.b(c.f4201b) : i(j10));
                this.f12253p = true;
            }
        }
    }

    public final int l(j jVar) throws IOException, InterruptedException {
        int i10 = 0;
        while (true) {
            jVar.k(this.f12244g.f14880a, 0, 10);
            this.f12244g.Q(0);
            if (this.f12244g.G() != f12238t) {
                break;
            }
            this.f12244g.R(3);
            int C = this.f12244g.C();
            i10 += C + 10;
            jVar.e(C);
        }
        jVar.h();
        jVar.e(i10);
        if (this.f12249l == -1) {
            this.f12249l = (long) i10;
        }
        return i10;
    }
}
