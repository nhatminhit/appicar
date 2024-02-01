package b6;

import b7.e;
import b7.q;
import b7.r0;
import b7.w;
import b7.y;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import q7.m;
import q7.n;
import q7.o;
import t7.b;
import w7.a;
import w7.p;

public final class f0 {

    /* renamed from: o  reason: collision with root package name */
    public static final String f4335o = "MediaPeriodHolder";

    /* renamed from: a  reason: collision with root package name */
    public final w f4336a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4337b;

    /* renamed from: c  reason: collision with root package name */
    public final r0[] f4338c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4339d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4340e;

    /* renamed from: f  reason: collision with root package name */
    public g0 f4341f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f4342g;

    /* renamed from: h  reason: collision with root package name */
    public final s0[] f4343h;

    /* renamed from: i  reason: collision with root package name */
    public final n f4344i;

    /* renamed from: j  reason: collision with root package name */
    public final y f4345j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public f0 f4346k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public TrackGroupArray f4347l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public o f4348m;

    /* renamed from: n  reason: collision with root package name */
    public long f4349n;

    public f0(s0[] s0VarArr, long j10, n nVar, b bVar, y yVar, g0 g0Var) {
        this.f4343h = s0VarArr;
        this.f4349n = j10;
        this.f4344i = nVar;
        this.f4345j = yVar;
        y.a aVar = g0Var.f4350a;
        this.f4337b = aVar.f4733a;
        this.f4341f = g0Var;
        this.f4338c = new r0[s0VarArr.length];
        this.f4342g = new boolean[s0VarArr.length];
        this.f4336a = e(aVar, yVar, bVar, g0Var.f4351b, g0Var.f4353d);
    }

    public static w e(y.a aVar, y yVar, b bVar, long j10, long j11) {
        w c10 = yVar.c(aVar, bVar, j10);
        return (j11 == c.f4201b || j11 == Long.MIN_VALUE) ? c10 : new e(c10, true, 0, j11);
    }

    public static void u(long j10, y yVar, w wVar) {
        if (j10 == c.f4201b || j10 == Long.MIN_VALUE) {
            yVar.i(wVar);
            return;
        }
        try {
            yVar.i(((e) wVar).O);
        } catch (RuntimeException e10) {
            p.e(f4335o, "Period release failed.", e10);
        }
    }

    public long a(o oVar, long j10, boolean z10) {
        return b(oVar, j10, z10, new boolean[this.f4343h.length]);
    }

    public long b(o oVar, long j10, boolean z10, boolean[] zArr) {
        o oVar2 = oVar;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= oVar2.f12036a) {
                break;
            }
            boolean[] zArr2 = this.f4342g;
            if (z10 || !oVar.b(this.f4348m, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f4338c);
        f();
        this.f4348m = oVar2;
        h();
        m mVar = oVar2.f12038c;
        long h10 = this.f4336a.h(mVar.b(), this.f4342g, this.f4338c, zArr, j10);
        c(this.f4338c);
        this.f4340e = false;
        int i11 = 0;
        while (true) {
            r0[] r0VarArr = this.f4338c;
            if (i11 >= r0VarArr.length) {
                return h10;
            }
            if (r0VarArr[i11] != null) {
                a.i(oVar.c(i11));
                if (this.f4343h[i11].f() != 6) {
                    this.f4340e = true;
                }
            } else {
                a.i(mVar.a(i11) == null);
            }
            i11++;
        }
    }

    public final void c(r0[] r0VarArr) {
        o oVar = (o) a.g(this.f4348m);
        int i10 = 0;
        while (true) {
            s0[] s0VarArr = this.f4343h;
            if (i10 < s0VarArr.length) {
                if (s0VarArr[i10].f() == 6 && oVar.c(i10)) {
                    r0VarArr[i10] = new q();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void d(long j10) {
        a.i(r());
        this.f4336a.d(y(j10));
    }

    public final void f() {
        o oVar = this.f4348m;
        if (r() && oVar != null) {
            for (int i10 = 0; i10 < oVar.f12036a; i10++) {
                boolean c10 = oVar.c(i10);
                f a10 = oVar.f12038c.a(i10);
                if (c10 && a10 != null) {
                    a10.e();
                }
            }
        }
    }

    public final void g(r0[] r0VarArr) {
        int i10 = 0;
        while (true) {
            s0[] s0VarArr = this.f4343h;
            if (i10 < s0VarArr.length) {
                if (s0VarArr[i10].f() == 6) {
                    r0VarArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void h() {
        o oVar = this.f4348m;
        if (r() && oVar != null) {
            for (int i10 = 0; i10 < oVar.f12036a; i10++) {
                boolean c10 = oVar.c(i10);
                f a10 = oVar.f12038c.a(i10);
                if (c10 && a10 != null) {
                    a10.g();
                }
            }
        }
    }

    public long i() {
        if (!this.f4339d) {
            return this.f4341f.f4351b;
        }
        long e10 = this.f4340e ? this.f4336a.e() : Long.MIN_VALUE;
        return e10 == Long.MIN_VALUE ? this.f4341f.f4354e : e10;
    }

    @o0
    public f0 j() {
        return this.f4346k;
    }

    public long k() {
        if (!this.f4339d) {
            return 0;
        }
        return this.f4336a.b();
    }

    public long l() {
        return this.f4349n;
    }

    public long m() {
        return this.f4341f.f4351b + this.f4349n;
    }

    public TrackGroupArray n() {
        return (TrackGroupArray) a.g(this.f4347l);
    }

    public o o() {
        return (o) a.g(this.f4348m);
    }

    public void p(float f10, x0 x0Var) throws i {
        this.f4339d = true;
        this.f4347l = this.f4336a.t();
        long a10 = a((o) a.g(v(f10, x0Var)), this.f4341f.f4351b, false);
        long j10 = this.f4349n;
        g0 g0Var = this.f4341f;
        this.f4349n = j10 + (g0Var.f4351b - a10);
        this.f4341f = g0Var.b(a10);
    }

    public boolean q() {
        return this.f4339d && (!this.f4340e || this.f4336a.e() == Long.MIN_VALUE);
    }

    public final boolean r() {
        return this.f4346k == null;
    }

    public void s(long j10) {
        a.i(r());
        if (this.f4339d) {
            this.f4336a.f(y(j10));
        }
    }

    public void t() {
        f();
        this.f4348m = null;
        u(this.f4341f.f4353d, this.f4345j, this.f4336a);
    }

    @o0
    public o v(float f10, x0 x0Var) throws i {
        o e10 = this.f4344i.e(this.f4343h, n(), this.f4341f.f4350a, x0Var);
        if (e10.a(this.f4348m)) {
            return null;
        }
        for (f fVar : e10.f12038c.b()) {
            if (fVar != null) {
                fVar.n(f10);
            }
        }
        return e10;
    }

    public void w(@o0 f0 f0Var) {
        if (f0Var != this.f4346k) {
            f();
            this.f4346k = f0Var;
            h();
        }
    }

    public void x(long j10) {
        this.f4349n = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
