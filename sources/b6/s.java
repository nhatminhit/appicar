package b6;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import b6.a;
import b6.j;
import b6.n0;
import b6.p0;
import b6.x0;
import b7.y;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q7.m;
import q7.n;
import q7.o;
import t7.d;
import w7.c;
import w7.p;
import w7.q0;

public final class s extends a implements j {
    public static final String P = "ExoPlayerImpl";
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public l0 I;
    public v0 J;
    @o0
    public i K;
    public k0 L;
    public int M;
    public int N;
    public long O;

    /* renamed from: q  reason: collision with root package name */
    public final o f4443q;

    /* renamed from: r  reason: collision with root package name */
    public final r0[] f4444r;

    /* renamed from: s  reason: collision with root package name */
    public final n f4445s;

    /* renamed from: t  reason: collision with root package name */
    public final Handler f4446t;

    /* renamed from: u  reason: collision with root package name */
    public final a0 f4447u;

    /* renamed from: v  reason: collision with root package name */
    public final Handler f4448v;

    /* renamed from: w  reason: collision with root package name */
    public final CopyOnWriteArrayList<a.C0066a> f4449w;

    /* renamed from: x  reason: collision with root package name */
    public final x0.b f4450x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayDeque<Runnable> f4451y;

    /* renamed from: z  reason: collision with root package name */
    public y f4452z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            s.this.R0(message);
        }
    }

    public static final class b implements Runnable {
        public final k0 O;
        public final CopyOnWriteArrayList<a.C0066a> P;
        public final n Q;
        public final boolean R;
        public final int S;
        public final int T;
        public final boolean U;
        public final boolean V;
        public final boolean W;
        public final boolean X;
        public final boolean Y;
        public final boolean Z;

        public b(k0 k0Var, k0 k0Var2, CopyOnWriteArrayList<a.C0066a> copyOnWriteArrayList, n nVar, boolean z10, int i10, int i11, boolean z11, boolean z12) {
            this.O = k0Var;
            this.P = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.Q = nVar;
            this.R = z10;
            this.S = i10;
            this.T = i11;
            this.U = z11;
            this.Z = z12;
            boolean z13 = true;
            this.V = k0Var2.f4393f != k0Var.f4393f;
            this.W = (k0Var2.f4388a == k0Var.f4388a && k0Var2.f4389b == k0Var.f4389b) ? false : true;
            this.X = k0Var2.f4394g != k0Var.f4394g;
            this.Y = k0Var2.f4396i == k0Var.f4396i ? false : z13;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(n0.d dVar) {
            k0 k0Var = this.O;
            dVar.k(k0Var.f4388a, k0Var.f4389b, this.T);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g(n0.d dVar) {
            dVar.e(this.S);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void h(n0.d dVar) {
            k0 k0Var = this.O;
            dVar.K(k0Var.f4395h, k0Var.f4396i.f12038c);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void i(n0.d dVar) {
            dVar.d(this.O.f4394g);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void j(n0.d dVar) {
            dVar.A(this.Z, this.O.f4393f);
        }

        public void run() {
            if (this.W || this.T == 0) {
                s.T0(this.P, new t(this));
            }
            if (this.R) {
                s.T0(this.P, new u(this));
            }
            if (this.Y) {
                this.Q.d(this.O.f4396i.f12039d);
                s.T0(this.P, new v(this));
            }
            if (this.X) {
                s.T0(this.P, new w(this));
            }
            if (this.V) {
                s.T0(this.P, new x(this));
            }
            if (this.U) {
                s.T0(this.P, new y());
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public s(r0[] r0VarArr, n nVar, e0 e0Var, d dVar, c cVar, Looper looper) {
        r0[] r0VarArr2 = r0VarArr;
        p.h(P, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + b0.f4190c + "] [" + q0.f14790e + "]");
        w7.a.i(r0VarArr2.length > 0);
        this.f4444r = (r0[]) w7.a.g(r0VarArr);
        this.f4445s = (n) w7.a.g(nVar);
        this.A = false;
        this.C = 0;
        this.D = false;
        this.f4449w = new CopyOnWriteArrayList<>();
        o oVar = new o(new t0[r0VarArr2.length], new f[r0VarArr2.length], (Object) null);
        this.f4443q = oVar;
        this.f4450x = new x0.b();
        this.I = l0.f4401e;
        this.J = v0.f4476g;
        a aVar = new a(looper);
        this.f4446t = aVar;
        this.L = k0.g(0, oVar);
        this.f4451y = new ArrayDeque<>();
        a0 a0Var = new a0(r0VarArr, nVar, oVar, e0Var, dVar, this.A, this.C, this.D, aVar, cVar);
        this.f4447u = a0Var;
        this.f4448v = new Handler(a0Var.s());
    }

    public static void T0(CopyOnWriteArrayList<a.C0066a> copyOnWriteArrayList, a.b bVar) {
        Iterator<a.C0066a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    public long A0() {
        if (f1()) {
            return this.O;
        }
        k0 k0Var = this.L;
        if (k0Var.f4397j.f4736d != k0Var.f4390c.f4736d) {
            return k0Var.f4388a.n(Q(), this.f4149p).c();
        }
        long j10 = k0Var.f4398k;
        if (this.L.f4397j.b()) {
            k0 k0Var2 = this.L;
            x0.b h10 = k0Var2.f4388a.h(k0Var2.f4397j.f4733a, this.f4450x);
            long f10 = h10.f(this.L.f4397j.f4734b);
            j10 = f10 == Long.MIN_VALUE ? h10.f4495d : f10;
        }
        return d1(this.L.f4397j, j10);
    }

    public int B() {
        if (f1()) {
            return this.N;
        }
        k0 k0Var = this.L;
        return k0Var.f4388a.b(k0Var.f4390c.f4733a);
    }

    public m C0() {
        return this.L.f4396i.f12038c;
    }

    public int D0(int i10) {
        return this.f4444r[i10].f();
    }

    public void F(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.f4447u.g0(z10);
        }
    }

    public int G() {
        if (m()) {
            return this.L.f4390c.f4735c;
        }
        return -1;
    }

    @o0
    public n0.g G0() {
        return null;
    }

    public void J(n0.d dVar) {
        Iterator<a.C0066a> it = this.f4449w.iterator();
        while (it.hasNext()) {
            a.C0066a next = it.next();
            if (next.f4150a.equals(dVar)) {
                next.b();
                this.f4449w.remove(next);
            }
        }
    }

    public void P(n0.d dVar) {
        this.f4449w.addIfAbsent(new a.C0066a(dVar));
    }

    public int Q() {
        if (f1()) {
            return this.M;
        }
        k0 k0Var = this.L;
        return k0Var.f4388a.h(k0Var.f4390c.f4733a, this.f4450x).f4494c;
    }

    public final k0 Q0(boolean z10, boolean z11, int i10) {
        long j10 = 0;
        boolean z12 = false;
        if (z10) {
            this.M = 0;
            this.N = 0;
            this.O = 0;
        } else {
            this.M = Q();
            this.N = B();
            this.O = getCurrentPosition();
        }
        if (z10 || z11) {
            z12 = true;
        }
        k0 k0Var = this.L;
        y.a h10 = z12 ? k0Var.h(this.D, this.f4149p) : k0Var.f4390c;
        if (!z12) {
            j10 = this.L.f4400m;
        }
        long j11 = j10;
        return new k0(z11 ? x0.f4491a : this.L.f4388a, z11 ? null : this.L.f4389b, h10, j11, z12 ? c.f4201b : this.L.f4392e, i10, false, z11 ? TrackGroupArray.R : this.L.f4395h, z11 ? this.f4443q : this.L.f4396i, h10, j11, 0, j11);
    }

    @o0
    public n0.a R() {
        return null;
    }

    public void R0(Message message) {
        a.b mVar;
        int i10 = message.what;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                l0 l0Var = (l0) message.obj;
                if (!this.I.equals(l0Var)) {
                    this.I = l0Var;
                    mVar = new m(l0Var);
                } else {
                    return;
                }
            } else if (i10 == 2) {
                i iVar = (i) message.obj;
                this.K = iVar;
                mVar = new n(iVar);
            } else {
                throw new IllegalStateException();
            }
            b1(mVar);
            return;
        }
        k0 k0Var = (k0) message.obj;
        int i11 = message.arg1;
        int i12 = message.arg2;
        if (i12 == -1) {
            z10 = false;
        }
        S0(k0Var, i11, z10, i12);
    }

    public final void S0(k0 k0Var, int i10, boolean z10, int i11) {
        int i12 = this.E - i10;
        this.E = i12;
        if (i12 == 0) {
            if (k0Var.f4391d == c.f4201b) {
                k0Var = k0Var.i(k0Var.f4390c, 0, k0Var.f4392e);
            }
            k0 k0Var2 = k0Var;
            if (!this.L.f4388a.r() && k0Var2.f4388a.r()) {
                this.N = 0;
                this.M = 0;
                this.O = 0;
            }
            int i13 = this.F ? 0 : 2;
            boolean z11 = this.G;
            this.F = false;
            this.G = false;
            g1(k0Var2, z10, i11, i13, z11);
        }
    }

    @Deprecated
    public void T(j.b... bVarArr) {
        for (j.b bVar : bVarArr) {
            b0(bVar.f4383a).s(bVar.f4384b).p(bVar.f4385c).m();
        }
    }

    public void U(y yVar) {
        g0(yVar, true, true);
    }

    public void V(boolean z10) {
        e1(z10, false);
    }

    @o0
    public n0.i W() {
        return null;
    }

    public boolean Y() {
        return this.L.f4394g;
    }

    public void a() {
        p.h(P, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + b0.f4190c + "] [" + q0.f14790e + "] [" + b0.b() + "]");
        this.f4452z = null;
        this.f4447u.N();
        this.f4446t.removeCallbacksAndMessages((Object) null);
        this.L = Q0(false, false, 1);
    }

    public long a0() {
        if (!m()) {
            return getCurrentPosition();
        }
        k0 k0Var = this.L;
        k0Var.f4388a.h(k0Var.f4390c.f4733a, this.f4450x);
        k0 k0Var2 = this.L;
        return k0Var2.f4392e == c.f4201b ? k0Var2.f4388a.n(Q(), this.f4149p).a() : this.f4450x.l() + c.c(this.L.f4392e);
    }

    public p0 b0(p0.b bVar) {
        return new p0(this.f4447u, bVar, this.L.f4388a, Q(), this.f4448v);
    }

    public final void b1(a.b bVar) {
        c1(new q(new CopyOnWriteArrayList(this.f4449w), bVar));
    }

    public void c(@o0 l0 l0Var) {
        if (l0Var == null) {
            l0Var = l0.f4401e;
        }
        this.f4447u.l0(l0Var);
    }

    public final void c1(Runnable runnable) {
        boolean z10 = !this.f4451y.isEmpty();
        this.f4451y.addLast(runnable);
        if (!z10) {
            while (!this.f4451y.isEmpty()) {
                this.f4451y.peekFirst().run();
                this.f4451y.removeFirst();
            }
        }
    }

    public l0 d() {
        return this.I;
    }

    public Object d0() {
        return this.L.f4389b;
    }

    public final long d1(y.a aVar, long j10) {
        long c10 = c.c(j10);
        this.L.f4388a.h(aVar.f4733a, this.f4450x);
        return c10 + this.f4450x.l();
    }

    public int e() {
        return this.L.f4393f;
    }

    public long e0() {
        if (!m()) {
            return A0();
        }
        k0 k0Var = this.L;
        return k0Var.f4397j.equals(k0Var.f4390c) ? c.c(this.L.f4398k) : getDuration();
    }

    public void e1(boolean z10, boolean z11) {
        boolean z12 = z10 && !z11;
        if (this.B != z12) {
            this.B = z12;
            this.f4447u.j0(z12);
        }
        if (this.A != z10) {
            this.A = z10;
            b1(new o(z10, this.L.f4393f));
        }
    }

    public final boolean f1() {
        return this.L.f4388a.r() || this.E > 0;
    }

    public void g0(y yVar, boolean z10, boolean z11) {
        this.K = null;
        this.f4452z = yVar;
        k0 Q0 = Q0(z10, z11, 2);
        this.F = true;
        this.E++;
        this.f4447u.L(yVar, z10, z11);
        g1(Q0, false, 4, 1, false);
    }

    public final void g1(k0 k0Var, boolean z10, int i10, int i11, boolean z11) {
        k0 k0Var2 = this.L;
        k0 k0Var3 = k0Var;
        this.L = k0Var3;
        c1(new b(k0Var3, k0Var2, this.f4449w, this.f4445s, z10, i10, i11, z11, this.A));
    }

    public long getCurrentPosition() {
        if (f1()) {
            return this.O;
        }
        if (this.L.f4390c.b()) {
            return c.c(this.L.f4400m);
        }
        k0 k0Var = this.L;
        return d1(k0Var.f4390c, k0Var.f4400m);
    }

    public long getDuration() {
        if (!m()) {
            return A();
        }
        k0 k0Var = this.L;
        y.a aVar = k0Var.f4390c;
        k0Var.f4388a.h(aVar.f4733a, this.f4450x);
        return c.c(this.f4450x.b(aVar.f4734b, aVar.f4735c));
    }

    public void i(int i10) {
        if (this.C != i10) {
            this.C = i10;
            this.f4447u.n0(i10);
            b1(new r(i10));
        }
    }

    public int k() {
        return this.C;
    }

    public Looper k0() {
        return this.f4447u.s();
    }

    public boolean m() {
        return !f1() && this.L.f4390c.b();
    }

    public int m0() {
        if (m()) {
            return this.L.f4390c.f4734b;
        }
        return -1;
    }

    public void n() {
        y yVar = this.f4452z;
        if (yVar == null) {
            return;
        }
        if (this.K != null || this.L.f4393f == 1) {
            g0(yVar, false, false);
        }
    }

    public long o() {
        return c.c(this.L.f4399l);
    }

    public v0 o0() {
        return this.J;
    }

    public void p(int i10, long j10) {
        x0 x0Var = this.L.f4388a;
        if (i10 < 0 || (!x0Var.r() && i10 >= x0Var.q())) {
            throw new d0(x0Var, i10, j10);
        }
        this.G = true;
        this.E++;
        if (m()) {
            p.l(P, "seekTo ignored because an ad is playing");
            this.f4446t.obtainMessage(0, 1, -1, this.L).sendToTarget();
            return;
        }
        this.M = i10;
        if (x0Var.r()) {
            this.O = j10 == c.f4201b ? 0 : j10;
            this.N = 0;
        } else {
            long b10 = j10 == c.f4201b ? x0Var.n(i10, this.f4149p).b() : c.b(j10);
            Pair<Object, Long> j11 = x0Var.j(this.f4149p, this.f4450x, i10, b10);
            this.O = c.c(b10);
            this.N = x0Var.b(j11.first);
        }
        this.f4447u.Y(x0Var, i10, c.b(j10));
        b1(new l());
    }

    public boolean q() {
        return this.A;
    }

    public void q0(@o0 v0 v0Var) {
        if (v0Var == null) {
            v0Var = v0.f4476g;
        }
        if (!this.J.equals(v0Var)) {
            this.J = v0Var;
            this.f4447u.p0(v0Var);
        }
    }

    @o0
    public n0.e r0() {
        return null;
    }

    public void s(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            this.f4447u.r0(z10);
            b1(new p(z10));
        }
    }

    public TrackGroupArray s0() {
        return this.L.f4395h;
    }

    public void t(boolean z10) {
        if (z10) {
            this.K = null;
            this.f4452z = null;
        }
        k0 Q0 = Q0(z10, z10, 1);
        this.E++;
        this.f4447u.w0(z10);
        g1(Q0, false, 4, 1, false);
    }

    public x0 t0() {
        return this.L.f4388a;
    }

    @Deprecated
    public void u(j.b... bVarArr) {
        ArrayList<p0> arrayList = new ArrayList<>();
        for (j.b bVar : bVarArr) {
            arrayList.add(b0(bVar.f4383a).s(bVar.f4384b).p(bVar.f4385c).m());
        }
        boolean z10 = false;
        for (p0 p0Var : arrayList) {
            boolean z11 = true;
            while (z11) {
                try {
                    p0Var.a();
                    z11 = false;
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public Looper u0() {
        return this.f4446t.getLooper();
    }

    public int w() {
        return this.f4444r.length;
    }

    @o0
    public i y() {
        return this.K;
    }

    public boolean z0() {
        return this.D;
    }
}
