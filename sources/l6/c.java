package l6;

import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.p;
import j6.q;
import java.io.IOException;
import w7.q0;
import w7.w;

public final class c implements i {
    public static final int A = 8;
    public static final int B = 9;
    public static final int C = 18;
    public static final int D = q0.T("FLV");

    /* renamed from: t  reason: collision with root package name */
    public static final l f10208t = new b();

    /* renamed from: u  reason: collision with root package name */
    public static final int f10209u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f10210v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f10211w = 3;

    /* renamed from: x  reason: collision with root package name */
    public static final int f10212x = 4;

    /* renamed from: y  reason: collision with root package name */
    public static final int f10213y = 9;

    /* renamed from: z  reason: collision with root package name */
    public static final int f10214z = 11;

    /* renamed from: d  reason: collision with root package name */
    public final w f10215d = new w(4);

    /* renamed from: e  reason: collision with root package name */
    public final w f10216e = new w(9);

    /* renamed from: f  reason: collision with root package name */
    public final w f10217f = new w(11);

    /* renamed from: g  reason: collision with root package name */
    public final w f10218g = new w();

    /* renamed from: h  reason: collision with root package name */
    public final d f10219h = new d();

    /* renamed from: i  reason: collision with root package name */
    public k f10220i;

    /* renamed from: j  reason: collision with root package name */
    public int f10221j = 1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10222k;

    /* renamed from: l  reason: collision with root package name */
    public long f10223l;

    /* renamed from: m  reason: collision with root package name */
    public int f10224m;

    /* renamed from: n  reason: collision with root package name */
    public int f10225n;

    /* renamed from: o  reason: collision with root package name */
    public int f10226o;

    /* renamed from: p  reason: collision with root package name */
    public long f10227p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10228q;

    /* renamed from: r  reason: collision with root package name */
    public a f10229r;

    /* renamed from: s  reason: collision with root package name */
    public f f10230s;

    public static /* synthetic */ i[] i() {
        return new i[]{new c()};
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        jVar.k(this.f10215d.f14880a, 0, 3);
        this.f10215d.Q(0);
        if (this.f10215d.G() != D) {
            return false;
        }
        jVar.k(this.f10215d.f14880a, 0, 2);
        this.f10215d.Q(0);
        if ((this.f10215d.J() & 250) != 0) {
            return false;
        }
        jVar.k(this.f10215d.f14880a, 0, 4);
        this.f10215d.Q(0);
        int l10 = this.f10215d.l();
        jVar.h();
        jVar.e(l10);
        jVar.k(this.f10215d.f14880a, 0, 4);
        this.f10215d.Q(0);
        return this.f10215d.l() == 0;
    }

    public final void d() {
        if (!this.f10228q) {
            this.f10220i.q(new q.b(b6.c.f4201b));
            this.f10228q = true;
        }
    }

    public final long e() {
        if (this.f10222k) {
            return this.f10223l + this.f10227p;
        }
        if (this.f10219h.e() == b6.c.f4201b) {
            return 0;
        }
        return this.f10227p;
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.f10221j;
            if (i10 != 1) {
                if (i10 == 2) {
                    n(jVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    } else if (l(jVar)) {
                        return 0;
                    }
                } else if (!m(jVar)) {
                    return -1;
                }
            } else if (!k(jVar)) {
                return -1;
            }
        }
    }

    public void g(k kVar) {
        this.f10220i = kVar;
    }

    public void h(long j10, long j11) {
        this.f10221j = 1;
        this.f10222k = false;
        this.f10224m = 0;
    }

    public final w j(j jVar) throws IOException, InterruptedException {
        if (this.f10226o > this.f10218g.b()) {
            w wVar = this.f10218g;
            wVar.O(new byte[Math.max(wVar.b() * 2, this.f10226o)], 0);
        } else {
            this.f10218g.Q(0);
        }
        this.f10218g.P(this.f10226o);
        jVar.readFully(this.f10218g.f14880a, 0, this.f10226o);
        return this.f10218g;
    }

    public final boolean k(j jVar) throws IOException, InterruptedException {
        boolean z10 = false;
        if (!jVar.a(this.f10216e.f14880a, 0, 9, true)) {
            return false;
        }
        this.f10216e.Q(0);
        this.f10216e.R(4);
        int D2 = this.f10216e.D();
        boolean z11 = (D2 & 4) != 0;
        if ((D2 & 1) != 0) {
            z10 = true;
        }
        if (z11 && this.f10229r == null) {
            this.f10229r = new a(this.f10220i.a(8, 1));
        }
        if (z10 && this.f10230s == null) {
            this.f10230s = new f(this.f10220i.a(9, 2));
        }
        this.f10220i.r();
        this.f10224m = (this.f10216e.l() - 9) + 4;
        this.f10221j = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(j6.j r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            long r0 = r8.e()
            int r2 = r8.f10225n
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            l6.a r7 = r8.f10229r
            if (r7 == 0) goto L_0x0024
            r8.d()
            l6.a r2 = r8.f10229r
        L_0x001a:
            w7.w r9 = r8.j(r9)
            boolean r5 = r2.a(r9, r0)
        L_0x0022:
            r9 = r6
            goto L_0x0061
        L_0x0024:
            r7 = 9
            if (r2 != r7) goto L_0x0032
            l6.f r7 = r8.f10230s
            if (r7 == 0) goto L_0x0032
            r8.d()
            l6.f r2 = r8.f10230s
            goto L_0x001a
        L_0x0032:
            r7 = 18
            if (r2 != r7) goto L_0x005b
            boolean r2 = r8.f10228q
            if (r2 != 0) goto L_0x005b
            l6.d r2 = r8.f10219h
            w7.w r9 = r8.j(r9)
            boolean r5 = r2.a(r9, r0)
            l6.d r9 = r8.f10219h
            long r0 = r9.e()
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0022
            j6.k r9 = r8.f10220i
            j6.q$b r2 = new j6.q$b
            r2.<init>(r0)
            r9.q(r2)
            r8.f10228q = r6
            goto L_0x0022
        L_0x005b:
            int r0 = r8.f10226o
            r9.i(r0)
            r9 = r5
        L_0x0061:
            boolean r0 = r8.f10222k
            if (r0 != 0) goto L_0x007b
            if (r5 == 0) goto L_0x007b
            r8.f10222k = r6
            l6.d r0 = r8.f10219h
            long r0 = r0.e()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            long r0 = r8.f10227p
            long r0 = -r0
            goto L_0x0079
        L_0x0077:
            r0 = 0
        L_0x0079:
            r8.f10223l = r0
        L_0x007b:
            r0 = 4
            r8.f10224m = r0
            r0 = 2
            r8.f10221j = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.c.l(j6.j):boolean");
    }

    public final boolean m(j jVar) throws IOException, InterruptedException {
        if (!jVar.a(this.f10217f.f14880a, 0, 11, true)) {
            return false;
        }
        this.f10217f.Q(0);
        this.f10225n = this.f10217f.D();
        this.f10226o = this.f10217f.G();
        this.f10227p = (long) this.f10217f.G();
        this.f10227p = (((long) (this.f10217f.D() << 24)) | this.f10227p) * 1000;
        this.f10217f.R(3);
        this.f10221j = 4;
        return true;
    }

    public final void n(j jVar) throws IOException, InterruptedException {
        jVar.i(this.f10224m);
        this.f10224m = 0;
        this.f10221j = 3;
    }
}
