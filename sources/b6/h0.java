package b6;

import android.util.Pair;
import b6.x0;
import b7.w;
import b7.y;
import d.o0;
import w7.a;

public final class h0 {

    /* renamed from: m  reason: collision with root package name */
    public static final int f4370m = 100;

    /* renamed from: a  reason: collision with root package name */
    public final x0.b f4371a = new x0.b();

    /* renamed from: b  reason: collision with root package name */
    public final x0.c f4372b = new x0.c();

    /* renamed from: c  reason: collision with root package name */
    public long f4373c;

    /* renamed from: d  reason: collision with root package name */
    public x0 f4374d = x0.f4491a;

    /* renamed from: e  reason: collision with root package name */
    public int f4375e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4376f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public f0 f4377g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public f0 f4378h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public f0 f4379i;

    /* renamed from: j  reason: collision with root package name */
    public int f4380j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public Object f4381k;

    /* renamed from: l  reason: collision with root package name */
    public long f4382l;

    public void A(x0 x0Var) {
        this.f4374d = x0Var;
    }

    public boolean B() {
        f0 f0Var = this.f4379i;
        return f0Var == null || (!f0Var.f4341f.f4356g && f0Var.q() && this.f4379i.f4341f.f4354e != c.f4201b && this.f4380j < 100);
    }

    public final boolean C() {
        f0 i10 = i();
        if (i10 == null) {
            return true;
        }
        int b10 = this.f4374d.b(i10.f4337b);
        while (true) {
            b10 = this.f4374d.d(b10, this.f4371a, this.f4372b, this.f4375e, this.f4376f);
            while (i10.j() != null && !i10.f4341f.f4355f) {
                i10 = i10.j();
            }
            f0 j10 = i10.j();
            if (b10 == -1 || j10 == null || this.f4374d.b(j10.f4337b) != b10) {
                boolean w10 = w(i10);
                i10.f4341f = q(i10.f4341f);
            } else {
                i10 = j10;
            }
        }
        boolean w102 = w(i10);
        i10.f4341f = q(i10.f4341f);
        return !w102 || !r();
    }

    public boolean D(long j10, long j11) {
        g0 g0Var;
        f0 i10 = i();
        f0 f0Var = null;
        while (i10 != null) {
            g0 g0Var2 = i10.f4341f;
            if (f0Var == null) {
                g0Var = q(g0Var2);
            } else {
                g0 h10 = h(f0Var, j10);
                if (h10 == null) {
                    return !w(f0Var);
                }
                if (!d(g0Var2, h10)) {
                    return !w(f0Var);
                }
                g0Var = h10;
            }
            i10.f4341f = g0Var.a(g0Var2.f4352c);
            if (!c(g0Var2.f4354e, g0Var.f4354e)) {
                long j12 = g0Var.f4354e;
                return !w(i10) && !(i10 == this.f4378h && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > c.f4201b ? 1 : (j12 == c.f4201b ? 0 : -1)) == 0 ? Long.MAX_VALUE : i10.z(j12)) ? 1 : (j11 == ((j12 > c.f4201b ? 1 : (j12 == c.f4201b ? 0 : -1)) == 0 ? Long.MAX_VALUE : i10.z(j12)) ? 0 : -1)) >= 0));
            }
            f0Var = i10;
            i10 = i10.j();
        }
        return true;
    }

    public boolean E(int i10) {
        this.f4375e = i10;
        return C();
    }

    public boolean F(boolean z10) {
        this.f4376f = z10;
        return C();
    }

    public f0 a() {
        f0 f0Var = this.f4377g;
        if (f0Var != null) {
            if (f0Var == this.f4378h) {
                this.f4378h = f0Var.j();
            }
            this.f4377g.t();
            int i10 = this.f4380j - 1;
            this.f4380j = i10;
            if (i10 == 0) {
                this.f4379i = null;
                f0 f0Var2 = this.f4377g;
                this.f4381k = f0Var2.f4337b;
                this.f4382l = f0Var2.f4341f.f4350a.f4736d;
            }
            this.f4377g = this.f4377g.j();
        } else {
            f0 f0Var3 = this.f4379i;
            this.f4377g = f0Var3;
            this.f4378h = f0Var3;
        }
        return this.f4377g;
    }

    public f0 b() {
        f0 f0Var = this.f4378h;
        a.i((f0Var == null || f0Var.j() == null) ? false : true);
        f0 j10 = this.f4378h.j();
        this.f4378h = j10;
        return j10;
    }

    public final boolean c(long j10, long j11) {
        return j10 == c.f4201b || j10 == j11;
    }

    public final boolean d(g0 g0Var, g0 g0Var2) {
        return g0Var.f4351b == g0Var2.f4351b && g0Var.f4350a.equals(g0Var2.f4350a);
    }

    public void e(boolean z10) {
        f0 i10 = i();
        if (i10 != null) {
            this.f4381k = z10 ? i10.f4337b : null;
            this.f4382l = i10.f4341f.f4350a.f4736d;
            i10.t();
            w(i10);
        } else if (!z10) {
            this.f4381k = null;
        }
        this.f4377g = null;
        this.f4379i = null;
        this.f4378h = null;
        this.f4380j = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0 != b6.c.f4201b) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b7.w f(b6.s0[] r11, q7.n r12, t7.b r13, b7.y r14, b6.g0 r15) {
        /*
            r10 = this;
            b6.f0 r0 = r10.f4379i
            if (r0 != 0) goto L_0x001b
            b7.y$a r0 = r15.f4350a
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0018
            long r0 = r15.f4352c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0018
            goto L_0x0029
        L_0x0018:
            r0 = 0
            goto L_0x0029
        L_0x001b:
            long r0 = r0.l()
            b6.f0 r2 = r10.f4379i
            b6.g0 r2 = r2.f4341f
            long r2 = r2.f4354e
            long r0 = r0 + r2
            long r2 = r15.f4351b
            long r0 = r0 - r2
        L_0x0029:
            r4 = r0
            b6.f0 r0 = new b6.f0
            r2 = r0
            r3 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r2.<init>(r3, r4, r6, r7, r8, r9)
            b6.f0 r11 = r10.f4379i
            if (r11 == 0) goto L_0x0045
            boolean r11 = r10.r()
            w7.a.i(r11)
            b6.f0 r11 = r10.f4379i
            r11.w(r0)
        L_0x0045:
            r11 = 0
            r10.f4381k = r11
            r10.f4379i = r0
            int r11 = r10.f4380j
            int r11 = r11 + 1
            r10.f4380j = r11
            b7.w r11 = r0.f4336a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.h0.f(b6.s0[], q7.n, t7.b, b7.y, b6.g0):b7.w");
    }

    public final g0 g(k0 k0Var) {
        return k(k0Var.f4390c, k0Var.f4392e, k0Var.f4391d);
    }

    @o0
    public final g0 h(f0 f0Var, long j10) {
        long j11;
        long j12;
        long j13;
        Object obj;
        long j14;
        g0 g0Var = f0Var.f4341f;
        long l10 = (f0Var.l() + g0Var.f4354e) - j10;
        long j15 = 0;
        if (g0Var.f4355f) {
            int d10 = this.f4374d.d(this.f4374d.b(g0Var.f4350a.f4733a), this.f4371a, this.f4372b, this.f4375e, this.f4376f);
            if (d10 == -1) {
                return null;
            }
            int i10 = this.f4374d.g(d10, this.f4371a, true).f4494c;
            Object obj2 = this.f4371a.f4493b;
            long j16 = g0Var.f4350a.f4736d;
            if (this.f4374d.n(i10, this.f4372b).f4503f == d10) {
                Pair<Object, Long> k10 = this.f4374d.k(this.f4372b, this.f4371a, i10, c.f4201b, Math.max(0, l10));
                if (k10 == null) {
                    return null;
                }
                Object obj3 = k10.first;
                long longValue = ((Long) k10.second).longValue();
                f0 j17 = f0Var.j();
                if (j17 == null || !j17.f4337b.equals(obj3)) {
                    j14 = this.f4373c;
                    this.f4373c = 1 + j14;
                } else {
                    j14 = j17.f4341f.f4350a.f4736d;
                }
                j12 = longValue;
                j15 = c.f4201b;
                j13 = j14;
                obj = obj3;
            } else {
                obj = obj2;
                j13 = j16;
                j12 = 0;
            }
            return k(y(obj, j12, j13), j15, j12);
        }
        y.a aVar = g0Var.f4350a;
        this.f4374d.h(aVar.f4733a, this.f4371a);
        if (aVar.b()) {
            int i11 = aVar.f4734b;
            int a10 = this.f4371a.a(i11);
            if (a10 == -1) {
                return null;
            }
            int k11 = this.f4371a.k(i11, aVar.f4735c);
            if (k11 >= a10) {
                long j18 = g0Var.f4352c;
                if (j18 == c.f4201b) {
                    x0 x0Var = this.f4374d;
                    x0.c cVar = this.f4372b;
                    x0.b bVar = this.f4371a;
                    Pair<Object, Long> k12 = x0Var.k(cVar, bVar, bVar.f4494c, c.f4201b, Math.max(0, l10));
                    if (k12 == null) {
                        return null;
                    }
                    j11 = ((Long) k12.second).longValue();
                } else {
                    j11 = j18;
                }
                return m(aVar.f4733a, j11, aVar.f4736d);
            } else if (!this.f4371a.o(i11, k11)) {
                return null;
            } else {
                return l(aVar.f4733a, i11, k11, g0Var.f4352c, aVar.f4736d);
            }
        } else {
            int e10 = this.f4371a.e(g0Var.f4353d);
            if (e10 == -1) {
                return m(aVar.f4733a, g0Var.f4354e, aVar.f4736d);
            }
            int j19 = this.f4371a.j(e10);
            if (!this.f4371a.o(e10, j19)) {
                return null;
            }
            return l(aVar.f4733a, e10, j19, g0Var.f4354e, aVar.f4736d);
        }
    }

    public f0 i() {
        return r() ? this.f4377g : this.f4379i;
    }

    public f0 j() {
        return this.f4379i;
    }

    public final g0 k(y.a aVar, long j10, long j11) {
        this.f4374d.h(aVar.f4733a, this.f4371a);
        if (!aVar.b()) {
            return m(aVar.f4733a, j11, aVar.f4736d);
        } else if (!this.f4371a.o(aVar.f4734b, aVar.f4735c)) {
            return null;
        } else {
            return l(aVar.f4733a, aVar.f4734b, aVar.f4735c, j10, aVar.f4736d);
        }
    }

    public final g0 l(Object obj, int i10, int i11, long j10, long j11) {
        y.a aVar = new y.a(obj, i10, i11, j11);
        return new g0(aVar, i11 == this.f4371a.j(i10) ? this.f4371a.g() : 0, j10, c.f4201b, this.f4374d.h(aVar.f4733a, this.f4371a).b(aVar.f4734b, aVar.f4735c), false, false);
    }

    public final g0 m(Object obj, long j10, long j11) {
        int d10 = this.f4371a.d(j10);
        Object obj2 = obj;
        y.a aVar = new y.a(obj, j11, d10);
        boolean s10 = s(aVar);
        boolean t10 = t(aVar, s10);
        long f10 = d10 != -1 ? this.f4371a.f(d10) : -9223372036854775807L;
        return new g0(aVar, j10, c.f4201b, f10, (f10 == c.f4201b || f10 == Long.MIN_VALUE) ? this.f4371a.f4495d : f10, s10, t10);
    }

    @o0
    public g0 n(long j10, k0 k0Var) {
        f0 f0Var = this.f4379i;
        return f0Var == null ? g(k0Var) : h(f0Var, j10);
    }

    public f0 o() {
        return this.f4377g;
    }

    public f0 p() {
        return this.f4378h;
    }

    public g0 q(g0 g0Var) {
        long j10;
        y.a aVar = g0Var.f4350a;
        boolean s10 = s(aVar);
        boolean t10 = t(aVar, s10);
        this.f4374d.h(g0Var.f4350a.f4733a, this.f4371a);
        if (aVar.b()) {
            j10 = this.f4371a.b(aVar.f4734b, aVar.f4735c);
        } else {
            j10 = g0Var.f4353d;
            if (j10 == c.f4201b || j10 == Long.MIN_VALUE) {
                j10 = this.f4371a.i();
            }
        }
        return new g0(aVar, g0Var.f4351b, g0Var.f4352c, g0Var.f4353d, j10, s10, t10);
    }

    public boolean r() {
        return this.f4377g != null;
    }

    public final boolean s(y.a aVar) {
        return !aVar.b() && aVar.f4737e == -1;
    }

    public final boolean t(y.a aVar, boolean z10) {
        int b10 = this.f4374d.b(aVar.f4733a);
        return !this.f4374d.n(this.f4374d.f(b10, this.f4371a).f4494c, this.f4372b).f4502e && this.f4374d.s(b10, this.f4371a, this.f4372b, this.f4375e, this.f4376f) && z10;
    }

    public boolean u(w wVar) {
        f0 f0Var = this.f4379i;
        return f0Var != null && f0Var.f4336a == wVar;
    }

    public void v(long j10) {
        f0 f0Var = this.f4379i;
        if (f0Var != null) {
            f0Var.s(j10);
        }
    }

    public boolean w(f0 f0Var) {
        boolean z10 = false;
        a.i(f0Var != null);
        this.f4379i = f0Var;
        while (f0Var.j() != null) {
            f0Var = f0Var.j();
            if (f0Var == this.f4378h) {
                this.f4378h = this.f4377g;
                z10 = true;
            }
            f0Var.t();
            this.f4380j--;
        }
        this.f4379i.w((f0) null);
        return z10;
    }

    public y.a x(Object obj, long j10) {
        return y(obj, j10, z(obj));
    }

    public final y.a y(Object obj, long j10, long j11) {
        this.f4374d.h(obj, this.f4371a);
        int e10 = this.f4371a.e(j10);
        if (e10 == -1) {
            return new y.a(obj, j11, this.f4371a.d(j10));
        }
        return new y.a(obj, e10, this.f4371a.j(e10), j11);
    }

    public final long z(Object obj) {
        int b10;
        int i10 = this.f4374d.h(obj, this.f4371a).f4494c;
        Object obj2 = this.f4381k;
        if (obj2 != null && (b10 = this.f4374d.b(obj2)) != -1 && this.f4374d.f(b10, this.f4371a).f4494c == i10) {
            return this.f4382l;
        }
        for (f0 i11 = i(); i11 != null; i11 = i11.j()) {
            if (i11.f4337b.equals(obj)) {
                return i11.f4341f.f4350a.f4736d;
            }
        }
        for (f0 i12 = i(); i12 != null; i12 = i12.j()) {
            int b11 = this.f4374d.b(i12.f4337b);
            if (b11 != -1 && this.f4374d.f(b11, this.f4371a).f4494c == i10) {
                return i12.f4341f.f4350a.f4736d;
            }
        }
        long j10 = this.f4373c;
        this.f4373c = 1 + j10;
        return j10;
    }
}
