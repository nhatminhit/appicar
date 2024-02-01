package b6;

import b6.x0;
import b7.y;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.j;
import d.o0;
import q7.o;

public final class k0 {

    /* renamed from: n  reason: collision with root package name */
    public static final y.a f4387n = new y.a(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final x0 f4388a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Object f4389b;

    /* renamed from: c  reason: collision with root package name */
    public final y.a f4390c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4391d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4392e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4393f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4394g;

    /* renamed from: h  reason: collision with root package name */
    public final TrackGroupArray f4395h;

    /* renamed from: i  reason: collision with root package name */
    public final o f4396i;

    /* renamed from: j  reason: collision with root package name */
    public final y.a f4397j;

    /* renamed from: k  reason: collision with root package name */
    public volatile long f4398k;

    /* renamed from: l  reason: collision with root package name */
    public volatile long f4399l;

    /* renamed from: m  reason: collision with root package name */
    public volatile long f4400m;

    public k0(x0 x0Var, @o0 Object obj, y.a aVar, long j10, long j11, int i10, boolean z10, TrackGroupArray trackGroupArray, o oVar, y.a aVar2, long j12, long j13, long j14) {
        this.f4388a = x0Var;
        this.f4389b = obj;
        this.f4390c = aVar;
        this.f4391d = j10;
        this.f4392e = j11;
        this.f4393f = i10;
        this.f4394g = z10;
        this.f4395h = trackGroupArray;
        this.f4396i = oVar;
        this.f4397j = aVar2;
        this.f4398k = j12;
        this.f4399l = j13;
        this.f4400m = j14;
    }

    public static k0 g(long j10, o oVar) {
        o oVar2 = oVar;
        x0 x0Var = x0.f4491a;
        y.a aVar = f4387n;
        return new k0(x0Var, (Object) null, aVar, j10, c.f4201b, 1, false, TrackGroupArray.R, oVar2, aVar, j10, 0, j10);
    }

    @j
    public k0 a(boolean z10) {
        x0 x0Var = this.f4388a;
        return new k0(x0Var, this.f4389b, this.f4390c, this.f4391d, this.f4392e, this.f4393f, z10, this.f4395h, this.f4396i, this.f4397j, this.f4398k, this.f4399l, this.f4400m);
    }

    @j
    public k0 b(y.a aVar) {
        x0 x0Var = this.f4388a;
        return new k0(x0Var, this.f4389b, this.f4390c, this.f4391d, this.f4392e, this.f4393f, this.f4394g, this.f4395h, this.f4396i, aVar, this.f4398k, this.f4399l, this.f4400m);
    }

    @j
    public k0 c(y.a aVar, long j10, long j11, long j12) {
        return new k0(this.f4388a, this.f4389b, aVar, j10, aVar.b() ? j11 : -9223372036854775807L, this.f4393f, this.f4394g, this.f4395h, this.f4396i, this.f4397j, this.f4398k, j12, j10);
    }

    @j
    public k0 d(int i10) {
        x0 x0Var = this.f4388a;
        return new k0(x0Var, this.f4389b, this.f4390c, this.f4391d, this.f4392e, i10, this.f4394g, this.f4395h, this.f4396i, this.f4397j, this.f4398k, this.f4399l, this.f4400m);
    }

    @j
    public k0 e(x0 x0Var, Object obj) {
        x0 x0Var2 = x0Var;
        return new k0(x0Var, obj, this.f4390c, this.f4391d, this.f4392e, this.f4393f, this.f4394g, this.f4395h, this.f4396i, this.f4397j, this.f4398k, this.f4399l, this.f4400m);
    }

    @j
    public k0 f(TrackGroupArray trackGroupArray, o oVar) {
        x0 x0Var = this.f4388a;
        return new k0(x0Var, this.f4389b, this.f4390c, this.f4391d, this.f4392e, this.f4393f, this.f4394g, trackGroupArray, oVar, this.f4397j, this.f4398k, this.f4399l, this.f4400m);
    }

    public y.a h(boolean z10, x0.c cVar) {
        if (this.f4388a.r()) {
            return f4387n;
        }
        x0 x0Var = this.f4388a;
        return new y.a(this.f4388a.m(x0Var.n(x0Var.a(z10), cVar).f4503f));
    }

    @j
    public k0 i(y.a aVar, long j10, long j11) {
        return new k0(this.f4388a, this.f4389b, aVar, j10, aVar.b() ? j11 : -9223372036854775807L, this.f4393f, this.f4394g, this.f4395h, this.f4396i, aVar, j10, 0, j10);
    }
}
