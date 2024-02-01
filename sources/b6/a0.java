package b6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import b6.g;
import b6.p0;
import b6.x0;
import b7.r0;
import b7.w;
import b7.y;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.f;
import d.m0;
import d.o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import q7.n;
import q7.o;
import w7.p;
import w7.q0;

public final class a0 implements Handler.Callback, w.a, n.a, y.b, g.a, p0.a {
    public static final int A0 = 2;
    public static final int B0 = 3;
    public static final int C0 = 4;
    public static final int D0 = 5;
    public static final int E0 = 6;
    public static final int F0 = 7;
    public static final int G0 = 8;
    public static final int H0 = 9;
    public static final int I0 = 10;
    public static final int J0 = 11;
    public static final int K0 = 12;
    public static final int L0 = 13;
    public static final int M0 = 14;
    public static final int N0 = 15;
    public static final int O0 = 16;
    public static final int P0 = 17;
    public static final int Q0 = 10;
    public static final int R0 = 10;
    public static final int S0 = 1000;

    /* renamed from: u0  reason: collision with root package name */
    public static final String f4152u0 = "ExoPlayerImplInternal";

    /* renamed from: v0  reason: collision with root package name */
    public static final int f4153v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f4154w0 = 1;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f4155x0 = 2;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f4156y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f4157z0 = 1;
    public final r0[] O;
    public final s0[] P;
    public final n Q;
    public final o R;
    public final e0 S;
    public final t7.d T;
    public final w7.n U;
    public final HandlerThread V;
    public final Handler W;
    public final x0.c X;
    public final x0.b Y;
    public final long Z;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f4158a0;

    /* renamed from: b0  reason: collision with root package name */
    public final g f4159b0;

    /* renamed from: c0  reason: collision with root package name */
    public final d f4160c0;

    /* renamed from: d0  reason: collision with root package name */
    public final ArrayList<c> f4161d0;

    /* renamed from: e0  reason: collision with root package name */
    public final w7.c f4162e0;

    /* renamed from: f0  reason: collision with root package name */
    public final h0 f4163f0 = new h0();

    /* renamed from: g0  reason: collision with root package name */
    public v0 f4164g0;

    /* renamed from: h0  reason: collision with root package name */
    public k0 f4165h0;

    /* renamed from: i0  reason: collision with root package name */
    public y f4166i0;

    /* renamed from: j0  reason: collision with root package name */
    public r0[] f4167j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f4168k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f4169l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f4170m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f4171n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f4172o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f4173p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f4174q0;

    /* renamed from: r0  reason: collision with root package name */
    public e f4175r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f4176s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f4177t0;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final y f4178a;

        /* renamed from: b  reason: collision with root package name */
        public final x0 f4179b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f4180c;

        public b(y yVar, x0 x0Var, Object obj) {
            this.f4178a = yVar;
            this.f4179b = x0Var;
            this.f4180c = obj;
        }
    }

    public static final class c implements Comparable<c> {
        public final p0 O;
        public int P;
        public long Q;
        @o0
        public Object R;

        public c(p0 p0Var) {
            this.O = p0Var;
        }

        /* renamed from: a */
        public int compareTo(@m0 c cVar) {
            Object obj = this.R;
            if ((obj == null) != (cVar.R == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.P - cVar.P;
            return i10 != 0 ? i10 : q0.s(this.Q, cVar.Q);
        }

        public void b(int i10, long j10, Object obj) {
            this.P = i10;
            this.Q = j10;
            this.R = obj;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public k0 f4181a;

        /* renamed from: b  reason: collision with root package name */
        public int f4182b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4183c;

        /* renamed from: d  reason: collision with root package name */
        public int f4184d;

        public d() {
        }

        public boolean d(k0 k0Var) {
            return k0Var != this.f4181a || this.f4182b > 0 || this.f4183c;
        }

        public void e(int i10) {
            this.f4182b += i10;
        }

        public void f(k0 k0Var) {
            this.f4181a = k0Var;
            this.f4182b = 0;
            this.f4183c = false;
        }

        public void g(int i10) {
            boolean z10 = true;
            if (!this.f4183c || this.f4184d == 4) {
                this.f4183c = true;
                this.f4184d = i10;
                return;
            }
            if (i10 != 4) {
                z10 = false;
            }
            w7.a.a(z10);
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final x0 f4185a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4186b;

        /* renamed from: c  reason: collision with root package name */
        public final long f4187c;

        public e(x0 x0Var, int i10, long j10) {
            this.f4185a = x0Var;
            this.f4186b = i10;
            this.f4187c = j10;
        }
    }

    public a0(r0[] r0VarArr, n nVar, o oVar, e0 e0Var, t7.d dVar, boolean z10, int i10, boolean z11, Handler handler, w7.c cVar) {
        this.O = r0VarArr;
        this.Q = nVar;
        this.R = oVar;
        this.S = e0Var;
        this.T = dVar;
        this.f4169l0 = z10;
        this.f4171n0 = i10;
        this.f4172o0 = z11;
        this.W = handler;
        this.f4162e0 = cVar;
        this.Z = e0Var.c();
        this.f4158a0 = e0Var.b();
        this.f4164g0 = v0.f4476g;
        this.f4165h0 = k0.g(c.f4201b, oVar);
        this.f4160c0 = new d();
        this.P = new s0[r0VarArr.length];
        for (int i11 = 0; i11 < r0VarArr.length; i11++) {
            r0VarArr[i11].setIndex(i11);
            this.P[i11] = r0VarArr[i11].i();
        }
        this.f4159b0 = new g(this, cVar);
        this.f4161d0 = new ArrayList<>();
        this.f4167j0 = new r0[0];
        this.X = new x0.c();
        this.Y = new x0.b();
        nVar.b(this, dVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.V = handlerThread;
        handlerThread.start();
        this.U = cVar.c(handlerThread.getLooper(), this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void C(p0 p0Var) {
        try {
            f(p0Var);
        } catch (i e10) {
            p.e(f4152u0, "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    public static Format[] p(f fVar) {
        int length = fVar != null ? fVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i10 = 0; i10 < length; i10++) {
            formatArr[i10] = fVar.f(i10);
        }
        return formatArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(b6.a0.b r14) throws b6.i {
        /*
            r13 = this;
            b7.y r0 = r14.f4178a
            b7.y r1 = r13.f4166i0
            if (r0 == r1) goto L_0x0007
            return
        L_0x0007:
            b6.a0$d r0 = r13.f4160c0
            int r1 = r13.f4174q0
            r0.e(r1)
            r0 = 0
            r13.f4174q0 = r0
            b6.k0 r1 = r13.f4165h0
            b6.x0 r1 = r1.f4388a
            b6.x0 r2 = r14.f4179b
            java.lang.Object r14 = r14.f4180c
            b6.h0 r3 = r13.f4163f0
            r3.A(r2)
            b6.k0 r3 = r13.f4165h0
            b6.k0 r14 = r3.e(r2, r14)
            r13.f4165h0 = r14
            r13.U()
            b6.k0 r14 = r13.f4165h0
            b7.y$a r14 = r14.f4390c
            boolean r3 = r14.b()
            if (r3 == 0) goto L_0x0038
            b6.k0 r3 = r13.f4165h0
            long r3 = r3.f4392e
            goto L_0x003c
        L_0x0038:
            b6.k0 r3 = r13.f4165h0
            long r3 = r3.f4400m
        L_0x003c:
            b6.a0$e r5 = r13.f4175r0
            if (r5 == 0) goto L_0x0062
            r14 = 1
            android.util.Pair r14 = r13.V(r5, r14)
            r1 = 0
            r13.f4175r0 = r1
            if (r14 != 0) goto L_0x004e
            r13.z()
            return
        L_0x004e:
            java.lang.Object r1 = r14.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            b6.h0 r5 = r13.f4163f0
            java.lang.Object r14 = r14.first
            b7.y$a r14 = r5.x(r14, r1)
            r6 = r14
            r9 = r1
            goto L_0x00d0
        L_0x0062:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x009e
            boolean r7 = r2.r()
            if (r7 != 0) goto L_0x009e
            boolean r14 = r13.f4172o0
            int r14 = r2.a(r14)
            android.util.Pair r14 = r13.r(r2, r14, r5)
            b6.h0 r1 = r13.f4163f0
            java.lang.Object r2 = r14.first
            java.lang.Object r5 = r14.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            b7.y$a r1 = r1.x(r2, r5)
            boolean r2 = r1.b()
            if (r2 != 0) goto L_0x009a
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r5 = r14.longValue()
            goto L_0x009b
        L_0x009a:
            r5 = r3
        L_0x009b:
            r9 = r5
            r6 = r1
            goto L_0x00d0
        L_0x009e:
            java.lang.Object r7 = r14.f4733a
            int r7 = r2.b(r7)
            r8 = -1
            if (r7 != r8) goto L_0x00c0
            java.lang.Object r14 = r14.f4733a
            java.lang.Object r14 = r13.W(r14, r1, r2)
            if (r14 != 0) goto L_0x00b3
            r13.z()
            return
        L_0x00b3:
            b6.x0$b r1 = r13.Y
            b6.x0$b r14 = r2.h(r14, r1)
            int r14 = r14.f4494c
            android.util.Pair r14 = r13.r(r2, r14, r5)
            goto L_0x004e
        L_0x00c0:
            boolean r1 = r14.b()
            if (r1 == 0) goto L_0x00ce
            b6.h0 r1 = r13.f4163f0
            java.lang.Object r14 = r14.f4733a
            b7.y$a r14 = r1.x(r14, r3)
        L_0x00ce:
            r6 = r14
            r9 = r3
        L_0x00d0:
            b6.k0 r14 = r13.f4165h0
            b7.y$a r14 = r14.f4390c
            boolean r14 = r14.equals(r6)
            if (r14 == 0) goto L_0x00f0
            int r14 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x00f0
            b6.h0 r14 = r13.f4163f0
            long r1 = r13.f4176s0
            long r3 = r13.q()
            boolean r14 = r14.D(r1, r3)
            if (r14 != 0) goto L_0x0131
            r13.Z(r0)
            goto L_0x0131
        L_0x00f0:
            b6.h0 r14 = r13.f4163f0
            b6.f0 r14 = r14.i()
            if (r14 == 0) goto L_0x0117
        L_0x00f8:
            b6.f0 r1 = r14.j()
            if (r1 == 0) goto L_0x0117
            b6.f0 r14 = r14.j()
            b6.g0 r1 = r14.f4341f
            b7.y$a r1 = r1.f4350a
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00f8
            b6.h0 r1 = r13.f4163f0
            b6.g0 r2 = r14.f4341f
            b6.g0 r1 = r1.q(r2)
            r14.f4341f = r1
            goto L_0x00f8
        L_0x0117:
            boolean r14 = r6.b()
            if (r14 == 0) goto L_0x0120
            r1 = 0
            goto L_0x0121
        L_0x0120:
            r1 = r9
        L_0x0121:
            long r7 = r13.b0(r6, r1)
            b6.k0 r5 = r13.f4165h0
            long r11 = r13.t()
            b6.k0 r14 = r5.c(r6, r7, r9, r11)
            r13.f4165h0 = r14
        L_0x0131:
            r13.w(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a0.A(b6.a0$b):void");
    }

    public final void A0() throws i, IOException {
        y yVar = this.f4166i0;
        if (yVar != null) {
            if (this.f4174q0 > 0) {
                yVar.h();
                return;
            }
            I();
            f0 j10 = this.f4163f0.j();
            int i10 = 0;
            if (j10 == null || j10.q()) {
                i0(false);
            } else if (!this.f4165h0.f4394g) {
                D();
            }
            if (this.f4163f0.r()) {
                f0 o10 = this.f4163f0.o();
                f0 p10 = this.f4163f0.p();
                boolean z10 = false;
                while (this.f4169l0 && o10 != p10 && this.f4176s0 >= o10.j().m()) {
                    if (z10) {
                        E();
                    }
                    int i11 = o10.f4341f.f4355f ? 0 : 3;
                    f0 a10 = this.f4163f0.a();
                    C0(o10);
                    k0 k0Var = this.f4165h0;
                    g0 g0Var = a10.f4341f;
                    this.f4165h0 = k0Var.c(g0Var.f4350a, g0Var.f4351b, g0Var.f4352c, t());
                    this.f4160c0.g(i11);
                    B0();
                    z10 = true;
                    o10 = a10;
                }
                if (p10.f4341f.f4356g) {
                    while (true) {
                        r0[] r0VarArr = this.O;
                        if (i10 < r0VarArr.length) {
                            r0 r0Var = r0VarArr[i10];
                            r0 r0Var2 = p10.f4338c[i10];
                            if (r0Var2 != null && r0Var.o() == r0Var2 && r0Var.g()) {
                                r0Var.h();
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else if (p10.j() != null) {
                    int i12 = 0;
                    while (true) {
                        r0[] r0VarArr2 = this.O;
                        if (i12 < r0VarArr2.length) {
                            r0 r0Var3 = r0VarArr2[i12];
                            r0 r0Var4 = p10.f4338c[i12];
                            if (r0Var3.o() != r0Var4) {
                                return;
                            }
                            if (r0Var4 == null || r0Var3.g()) {
                                i12++;
                            } else {
                                return;
                            }
                        } else if (!p10.j().f4339d) {
                            F();
                            return;
                        } else {
                            o o11 = p10.o();
                            f0 b10 = this.f4163f0.b();
                            o o12 = b10.o();
                            boolean z11 = b10.f4336a.s() != c.f4201b;
                            int i13 = 0;
                            while (true) {
                                r0[] r0VarArr3 = this.O;
                                if (i13 < r0VarArr3.length) {
                                    r0 r0Var5 = r0VarArr3[i13];
                                    if (o11.c(i13)) {
                                        if (!z11) {
                                            if (!r0Var5.t()) {
                                                f a11 = o12.f12038c.a(i13);
                                                boolean c10 = o12.c(i13);
                                                boolean z12 = this.P[i13].f() == 6;
                                                t0 t0Var = o11.f12037b[i13];
                                                t0 t0Var2 = o12.f12037b[i13];
                                                if (c10 && t0Var2.equals(t0Var) && !z12) {
                                                    r0Var5.k(p(a11), b10.f4338c[i13], b10.l());
                                                }
                                            }
                                        }
                                        r0Var5.h();
                                    }
                                    i13++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean B() {
        f0 o10 = this.f4163f0.o();
        f0 j10 = o10.j();
        long j11 = o10.f4341f.f4354e;
        return j11 == c.f4201b || this.f4165h0.f4400m < j11 || (j10 != null && (j10.f4339d || j10.f4341f.f4350a.b()));
    }

    public final void B0() throws i {
        if (this.f4163f0.r()) {
            f0 o10 = this.f4163f0.o();
            long s10 = o10.f4336a.s();
            if (s10 != c.f4201b) {
                S(s10);
                if (s10 != this.f4165h0.f4400m) {
                    k0 k0Var = this.f4165h0;
                    this.f4165h0 = k0Var.c(k0Var.f4390c, s10, k0Var.f4392e, t());
                    this.f4160c0.g(4);
                }
            } else {
                long k10 = this.f4159b0.k();
                this.f4176s0 = k10;
                long y10 = o10.y(k10);
                H(this.f4165h0.f4400m, y10);
                this.f4165h0.f4400m = y10;
            }
            f0 j10 = this.f4163f0.j();
            this.f4165h0.f4398k = j10.i();
            this.f4165h0.f4399l = t();
        }
    }

    public final void C0(@o0 f0 f0Var) throws i {
        f0 o10 = this.f4163f0.o();
        if (o10 != null && f0Var != o10) {
            boolean[] zArr = new boolean[this.O.length];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                r0[] r0VarArr = this.O;
                if (i10 < r0VarArr.length) {
                    r0 r0Var = r0VarArr[i10];
                    zArr[i10] = r0Var.getState() != 0;
                    if (o10.o().c(i10)) {
                        i11++;
                    }
                    if (zArr[i10] && (!o10.o().c(i10) || (r0Var.t() && r0Var.o() == f0Var.f4338c[i10]))) {
                        g(r0Var);
                    }
                    i10++;
                } else {
                    this.f4165h0 = this.f4165h0.f(o10.n(), o10.o());
                    n(zArr, i11);
                    return;
                }
            }
        }
    }

    public final void D() {
        f0 j10 = this.f4163f0.j();
        long k10 = j10.k();
        if (k10 == Long.MIN_VALUE) {
            i0(false);
            return;
        }
        boolean f10 = this.S.f(u(k10), this.f4159b0.d().f4402a);
        i0(f10);
        if (f10) {
            j10.d(this.f4176s0);
        }
    }

    public final void D0(float f10) {
        f0 i10 = this.f4163f0.i();
        while (i10 != null && i10.f4339d) {
            for (f fVar : i10.o().f12038c.b()) {
                if (fVar != null) {
                    fVar.n(f10);
                }
            }
            i10 = i10.j();
        }
    }

    public final void E() {
        if (this.f4160c0.d(this.f4165h0)) {
            this.W.obtainMessage(0, this.f4160c0.f4182b, this.f4160c0.f4183c ? this.f4160c0.f4184d : -1, this.f4165h0).sendToTarget();
            this.f4160c0.f(this.f4165h0);
        }
    }

    public final void F() throws IOException {
        f0 j10 = this.f4163f0.j();
        f0 p10 = this.f4163f0.p();
        if (j10 != null && !j10.f4339d) {
            if (p10 == null || p10.j() == j10) {
                r0[] r0VarArr = this.f4167j0;
                int length = r0VarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    if (r0VarArr[i10].g()) {
                        i10++;
                    } else {
                        return;
                    }
                }
                j10.f4336a.o();
            }
        }
    }

    public final void G() throws IOException {
        if (this.f4163f0.j() != null) {
            r0[] r0VarArr = this.f4167j0;
            int length = r0VarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (r0VarArr[i10].g()) {
                    i10++;
                } else {
                    return;
                }
            }
        }
        this.f4166i0.h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r6.f4177t0 < r6.f4161d0.size()) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r1 = r6.f4161d0.get(r6.f4177t0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r1 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r1.R == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        r3 = r1.P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r3 < r0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r3 != r0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r1.Q > r7) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r1 = r6.f4177t0 + 1;
        r6.f4177t0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r1 >= r6.f4161d0.size()) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r1 == null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r1.R == null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        if (r1.P != r0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        r3 = r1.Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        if (r3 <= r7) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (r3 > r9) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        e0(r1.O);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
        r6.f4161d0.remove(r6.f4177t0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ca, code lost:
        if (r6.f4177t0 >= r6.f4161d0.size()) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cc, code lost:
        r1 = r6.f4161d0.get(r6.f4177t0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d9, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e0, code lost:
        if (r1.O.c() != false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00eb, code lost:
        r6.f4177t0++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f2, code lost:
        r6.f4161d0.remove(r6.f4177t0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f9, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(long r7, long r9) throws b6.i {
        /*
            r6 = this;
            java.util.ArrayList<b6.a0$c> r0 = r6.f4161d0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00fa
            b6.k0 r0 = r6.f4165h0
            b7.y$a r0 = r0.f4390c
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00fa
        L_0x0014:
            b6.k0 r0 = r6.f4165h0
            long r1 = r0.f4391d
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x001f
            r1 = 1
            long r7 = r7 - r1
        L_0x001f:
            b6.x0 r1 = r0.f4388a
            b7.y$a r0 = r0.f4390c
            java.lang.Object r0 = r0.f4733a
            int r0 = r1.b(r0)
            int r1 = r6.f4177t0
            r2 = 0
            if (r1 <= 0) goto L_0x0039
            java.util.ArrayList<b6.a0$c> r3 = r6.f4161d0
        L_0x0030:
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            b6.a0$c r1 = (b6.a0.c) r1
            goto L_0x003a
        L_0x0039:
            r1 = r2
        L_0x003a:
            if (r1 == 0) goto L_0x0053
            int r3 = r1.P
            if (r3 > r0) goto L_0x0048
            if (r3 != r0) goto L_0x0053
            long r3 = r1.Q
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0053
        L_0x0048:
            int r1 = r6.f4177t0
            int r1 = r1 + -1
            r6.f4177t0 = r1
            if (r1 <= 0) goto L_0x0039
            java.util.ArrayList<b6.a0$c> r3 = r6.f4161d0
            goto L_0x0030
        L_0x0053:
            int r1 = r6.f4177t0
            java.util.ArrayList<b6.a0$c> r3 = r6.f4161d0
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0068
        L_0x005d:
            java.util.ArrayList<b6.a0$c> r1 = r6.f4161d0
            int r3 = r6.f4177t0
            java.lang.Object r1 = r1.get(r3)
            b6.a0$c r1 = (b6.a0.c) r1
            goto L_0x0069
        L_0x0068:
            r1 = r2
        L_0x0069:
            if (r1 == 0) goto L_0x008a
            java.lang.Object r3 = r1.R
            if (r3 == 0) goto L_0x008a
            int r3 = r1.P
            if (r3 < r0) goto L_0x007b
            if (r3 != r0) goto L_0x008a
            long r3 = r1.Q
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x008a
        L_0x007b:
            int r1 = r6.f4177t0
            int r1 = r1 + 1
            r6.f4177t0 = r1
            java.util.ArrayList<b6.a0$c> r3 = r6.f4161d0
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0068
            goto L_0x005d
        L_0x008a:
            if (r1 == 0) goto L_0x00fa
            java.lang.Object r3 = r1.R
            if (r3 == 0) goto L_0x00fa
            int r3 = r1.P
            if (r3 != r0) goto L_0x00fa
            long r3 = r1.Q
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x00fa
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x00fa
            b6.p0 r3 = r1.O     // Catch:{ all -> 0x00d9 }
            r6.e0(r3)     // Catch:{ all -> 0x00d9 }
            b6.p0 r3 = r1.O
            boolean r3 = r3.c()
            if (r3 != 0) goto L_0x00bb
            b6.p0 r1 = r1.O
            boolean r1 = r1.k()
            if (r1 == 0) goto L_0x00b4
            goto L_0x00bb
        L_0x00b4:
            int r1 = r6.f4177t0
            int r1 = r1 + 1
            r6.f4177t0 = r1
            goto L_0x00c2
        L_0x00bb:
            java.util.ArrayList<b6.a0$c> r1 = r6.f4161d0
            int r3 = r6.f4177t0
            r1.remove(r3)
        L_0x00c2:
            int r1 = r6.f4177t0
            java.util.ArrayList<b6.a0$c> r3 = r6.f4161d0
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00d7
            java.util.ArrayList<b6.a0$c> r1 = r6.f4161d0
            int r3 = r6.f4177t0
            java.lang.Object r1 = r1.get(r3)
            b6.a0$c r1 = (b6.a0.c) r1
            goto L_0x008a
        L_0x00d7:
            r1 = r2
            goto L_0x008a
        L_0x00d9:
            r7 = move-exception
            b6.p0 r8 = r1.O
            boolean r8 = r8.c()
            if (r8 != 0) goto L_0x00f2
            b6.p0 r8 = r1.O
            boolean r8 = r8.k()
            if (r8 == 0) goto L_0x00eb
            goto L_0x00f2
        L_0x00eb:
            int r8 = r6.f4177t0
            int r8 = r8 + 1
            r6.f4177t0 = r8
            goto L_0x00f9
        L_0x00f2:
            java.util.ArrayList<b6.a0$c> r8 = r6.f4161d0
            int r9 = r6.f4177t0
            r8.remove(r9)
        L_0x00f9:
            throw r7
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a0.H(long, long):void");
    }

    public final void I() throws IOException {
        this.f4163f0.v(this.f4176s0);
        if (this.f4163f0.B()) {
            g0 n10 = this.f4163f0.n(this.f4176s0, this.f4165h0);
            if (n10 == null) {
                G();
                return;
            }
            this.f4163f0.f(this.P, this.Q, this.S.h(), this.f4166i0, n10).n(this, n10.f4351b);
            i0(true);
            w(false);
        }
    }

    public final void J() {
        for (f0 i10 = this.f4163f0.i(); i10 != null; i10 = i10.j()) {
            o o10 = i10.o();
            if (o10 != null) {
                for (f fVar : o10.f12038c.b()) {
                    if (fVar != null) {
                        fVar.q();
                    }
                }
            }
        }
    }

    /* renamed from: K */
    public void k(w wVar) {
        this.U.i(10, wVar).sendToTarget();
    }

    public void L(y yVar, boolean z10, boolean z11) {
        this.U.f(0, z10 ? 1 : 0, z11 ? 1 : 0, yVar).sendToTarget();
    }

    public final void M(y yVar, boolean z10, boolean z11) {
        this.f4174q0++;
        R(false, true, z10, z11);
        this.S.a();
        this.f4166i0 = yVar;
        t0(2);
        yVar.e(this, this.T.e());
        this.U.e(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void N() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f4168k0     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            w7.n r0 = r2.U     // Catch:{ all -> 0x0023 }
            r1 = 7
            r0.e(r1)     // Catch:{ all -> 0x0023 }
            r0 = 0
        L_0x000e:
            boolean r1 = r2.f4168k0     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0018
            r2.wait()     // Catch:{ InterruptedException -> 0x0016 }
            goto L_0x000e
        L_0x0016:
            r0 = 1
            goto L_0x000e
        L_0x0018:
            if (r0 == 0) goto L_0x0021
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0023 }
            r0.interrupt()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a0.N():void");
    }

    public final void O() {
        R(true, true, true, true);
        this.S.g();
        t0(1);
        this.V.quit();
        synchronized (this) {
            this.f4168k0 = true;
            notifyAll();
        }
    }

    public final boolean P(r0 r0Var) {
        f0 j10 = this.f4163f0.p().j();
        return j10 != null && j10.f4339d && r0Var.g();
    }

    public final void Q() throws i {
        if (this.f4163f0.r()) {
            float f10 = this.f4159b0.d().f4402a;
            f0 o10 = this.f4163f0.o();
            f0 p10 = this.f4163f0.p();
            boolean z10 = true;
            while (o10 != null && o10.f4339d) {
                o v10 = o10.v(f10, this.f4165h0.f4388a);
                if (v10 != null) {
                    if (z10) {
                        f0 o11 = this.f4163f0.o();
                        boolean w10 = this.f4163f0.w(o11);
                        boolean[] zArr = new boolean[this.O.length];
                        long b10 = o11.b(v10, this.f4165h0.f4400m, w10, zArr);
                        k0 k0Var = this.f4165h0;
                        if (!(k0Var.f4393f == 4 || b10 == k0Var.f4400m)) {
                            k0 k0Var2 = this.f4165h0;
                            this.f4165h0 = k0Var2.c(k0Var2.f4390c, b10, k0Var2.f4392e, t());
                            this.f4160c0.g(4);
                            S(b10);
                        }
                        boolean[] zArr2 = new boolean[this.O.length];
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            r0[] r0VarArr = this.O;
                            if (i10 >= r0VarArr.length) {
                                break;
                            }
                            r0 r0Var = r0VarArr[i10];
                            boolean z11 = r0Var.getState() != 0;
                            zArr2[i10] = z11;
                            r0 r0Var2 = o11.f4338c[i10];
                            if (r0Var2 != null) {
                                i11++;
                            }
                            if (z11) {
                                if (r0Var2 != r0Var.o()) {
                                    g(r0Var);
                                } else if (zArr[i10]) {
                                    r0Var.s(this.f4176s0);
                                }
                            }
                            i10++;
                        }
                        this.f4165h0 = this.f4165h0.f(o11.n(), o11.o());
                        n(zArr2, i11);
                    } else {
                        this.f4163f0.w(o10);
                        if (o10.f4339d) {
                            o10.a(v10, Math.max(o10.f4341f.f4351b, o10.y(this.f4176s0)), false);
                        }
                    }
                    w(true);
                    if (this.f4165h0.f4393f != 4) {
                        D();
                        B0();
                        this.U.e(2);
                        return;
                    }
                    return;
                }
                if (o10 == p10) {
                    z10 = false;
                }
                o10 = o10.j();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r23 = this;
            r1 = r23
            w7.n r0 = r1.U
            r2 = 2
            r0.h(r2)
            r2 = 0
            r1.f4170m0 = r2
            b6.g r0 = r1.f4159b0
            r0.i()
            r3 = 0
            r1.f4176s0 = r3
            b6.r0[] r3 = r1.f4167j0
            int r4 = r3.length
            r5 = r2
        L_0x0018:
            java.lang.String r6 = "ExoPlayerImplInternal"
            if (r5 >= r4) goto L_0x002d
            r0 = r3[r5]
            r1.g(r0)     // Catch:{ i -> 0x0024, RuntimeException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
            goto L_0x0025
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            java.lang.String r7 = "Disable failed."
            w7.p.e(r6, r7, r0)
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            if (r24 == 0) goto L_0x0045
            b6.r0[] r3 = r1.O
            int r4 = r3.length
            r5 = r2
        L_0x0033:
            if (r5 >= r4) goto L_0x0045
            r0 = r3[r5]
            r0.reset()     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            w7.p.e(r6, r0, r7)
        L_0x0042:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0045:
            b6.r0[] r0 = new b6.r0[r2]
            r1.f4167j0 = r0
            r0 = 0
            if (r26 == 0) goto L_0x004f
            r1.f4175r0 = r0
            goto L_0x0086
        L_0x004f:
            if (r27 == 0) goto L_0x0086
            b6.a0$e r3 = r1.f4175r0
            if (r3 != 0) goto L_0x0084
            b6.k0 r3 = r1.f4165h0
            b6.x0 r3 = r3.f4388a
            boolean r3 = r3.r()
            if (r3 != 0) goto L_0x0084
            b6.k0 r3 = r1.f4165h0
            b6.x0 r4 = r3.f4388a
            b7.y$a r3 = r3.f4390c
            java.lang.Object r3 = r3.f4733a
            b6.x0$b r5 = r1.Y
            r4.h(r3, r5)
            b6.k0 r3 = r1.f4165h0
            long r3 = r3.f4400m
            b6.x0$b r5 = r1.Y
            long r5 = r5.m()
            long r3 = r3 + r5
            b6.a0$e r5 = new b6.a0$e
            b6.x0 r6 = b6.x0.f4491a
            b6.x0$b r7 = r1.Y
            int r7 = r7.f4494c
            r5.<init>(r6, r7, r3)
            r1.f4175r0 = r5
        L_0x0084:
            r3 = 1
            goto L_0x0088
        L_0x0086:
            r3 = r26
        L_0x0088:
            b6.h0 r4 = r1.f4163f0
            r5 = r3 ^ 1
            r4.e(r5)
            r1.i0(r2)
            if (r27 == 0) goto L_0x00ba
            b6.h0 r4 = r1.f4163f0
            b6.x0 r5 = b6.x0.f4491a
            r4.A(r5)
            java.util.ArrayList<b6.a0$c> r4 = r1.f4161d0
            java.util.Iterator r4 = r4.iterator()
        L_0x00a1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r4.next()
            b6.a0$c r5 = (b6.a0.c) r5
            b6.p0 r5 = r5.O
            r5.l(r2)
            goto L_0x00a1
        L_0x00b3:
            java.util.ArrayList<b6.a0$c> r4 = r1.f4161d0
            r4.clear()
            r1.f4177t0 = r2
        L_0x00ba:
            b6.k0 r2 = r1.f4165h0
            if (r3 == 0) goto L_0x00c7
            boolean r4 = r1.f4172o0
            b6.x0$c r5 = r1.X
            b7.y$a r2 = r2.h(r4, r5)
            goto L_0x00c9
        L_0x00c7:
            b7.y$a r2 = r2.f4390c
        L_0x00c9:
            r16 = r2
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x00d5
            r21 = r4
            goto L_0x00db
        L_0x00d5:
            b6.k0 r2 = r1.f4165h0
            long r6 = r2.f4400m
            r21 = r6
        L_0x00db:
            if (r3 == 0) goto L_0x00df
            r10 = r4
            goto L_0x00e4
        L_0x00df:
            b6.k0 r2 = r1.f4165h0
            long r2 = r2.f4392e
            r10 = r2
        L_0x00e4:
            b6.k0 r2 = new b6.k0
            if (r27 == 0) goto L_0x00eb
            b6.x0 r3 = b6.x0.f4491a
            goto L_0x00ef
        L_0x00eb:
            b6.k0 r3 = r1.f4165h0
            b6.x0 r3 = r3.f4388a
        L_0x00ef:
            r5 = r3
            if (r27 == 0) goto L_0x00f4
            r6 = r0
            goto L_0x00f9
        L_0x00f4:
            b6.k0 r3 = r1.f4165h0
            java.lang.Object r3 = r3.f4389b
            r6 = r3
        L_0x00f9:
            b6.k0 r3 = r1.f4165h0
            int r12 = r3.f4393f
            r13 = 0
            if (r27 == 0) goto L_0x0103
            com.google.android.exoplayer2.source.TrackGroupArray r4 = com.google.android.exoplayer2.source.TrackGroupArray.R
            goto L_0x0105
        L_0x0103:
            com.google.android.exoplayer2.source.TrackGroupArray r4 = r3.f4395h
        L_0x0105:
            r14 = r4
            if (r27 == 0) goto L_0x010b
            q7.o r3 = r1.R
            goto L_0x010d
        L_0x010b:
            q7.o r3 = r3.f4396i
        L_0x010d:
            r15 = r3
            r19 = 0
            r4 = r2
            r7 = r16
            r8 = r21
            r17 = r21
            r4.<init>(r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r19, r21)
            r1.f4165h0 = r2
            if (r25 == 0) goto L_0x0127
            b7.y r2 = r1.f4166i0
            if (r2 == 0) goto L_0x0127
            r2.b(r1)
            r1.f4166i0 = r0
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a0.R(boolean, boolean, boolean, boolean):void");
    }

    public final void S(long j10) throws i {
        if (this.f4163f0.r()) {
            j10 = this.f4163f0.o().z(j10);
        }
        this.f4176s0 = j10;
        this.f4159b0.g(j10);
        for (r0 s10 : this.f4167j0) {
            s10.s(this.f4176s0);
        }
        J();
    }

    public final boolean T(c cVar) {
        Object obj = cVar.R;
        if (obj == null) {
            Pair<Object, Long> V2 = V(new e(cVar.O.h(), cVar.O.j(), c.b(cVar.O.f())), false);
            if (V2 == null) {
                return false;
            }
            cVar.b(this.f4165h0.f4388a.b(V2.first), ((Long) V2.second).longValue(), V2.first);
            return true;
        }
        int b10 = this.f4165h0.f4388a.b(obj);
        if (b10 == -1) {
            return false;
        }
        cVar.P = b10;
        return true;
    }

    public final void U() {
        for (int size = this.f4161d0.size() - 1; size >= 0; size--) {
            if (!T(this.f4161d0.get(size))) {
                this.f4161d0.get(size).O.l(false);
                this.f4161d0.remove(size);
            }
        }
        Collections.sort(this.f4161d0);
    }

    public final Pair<Object, Long> V(e eVar, boolean z10) {
        int b10;
        x0 x0Var = this.f4165h0.f4388a;
        x0 x0Var2 = eVar.f4185a;
        if (x0Var.r()) {
            return null;
        }
        if (x0Var2.r()) {
            x0Var2 = x0Var;
        }
        try {
            Pair<Object, Long> j10 = x0Var2.j(this.X, this.Y, eVar.f4186b, eVar.f4187c);
            if (x0Var == x0Var2 || (b10 = x0Var.b(j10.first)) != -1) {
                return j10;
            }
            if (z10 && W(j10.first, x0Var2, x0Var) != null) {
                return r(x0Var, x0Var.f(b10, this.Y).f4494c, c.f4201b);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @o0
    public final Object W(Object obj, x0 x0Var, x0 x0Var2) {
        int b10 = x0Var.b(obj);
        int i10 = x0Var.i();
        int i11 = b10;
        int i12 = -1;
        for (int i13 = 0; i13 < i10 && i12 == -1; i13++) {
            i11 = x0Var.d(i11, this.Y, this.X, this.f4171n0, this.f4172o0);
            if (i11 == -1) {
                break;
            }
            i12 = x0Var2.b(x0Var.m(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return x0Var2.m(i12);
    }

    public final void X(long j10, long j11) {
        this.U.h(2);
        this.U.g(2, j10 + j11);
    }

    public void Y(x0 x0Var, int i10, long j10) {
        this.U.i(3, new e(x0Var, i10, j10)).sendToTarget();
    }

    public final void Z(boolean z10) throws i {
        y.a aVar = this.f4163f0.o().f4341f.f4350a;
        long c02 = c0(aVar, this.f4165h0.f4400m, true);
        if (c02 != this.f4165h0.f4400m) {
            k0 k0Var = this.f4165h0;
            this.f4165h0 = k0Var.c(aVar, c02, k0Var.f4392e, t());
            if (z10) {
                this.f4160c0.g(4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a0(b6.a0.e r23) throws b6.i {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            b6.a0$d r2 = r1.f4160c0
            r3 = 1
            r2.e(r3)
            android.util.Pair r2 = r1.V(r0, r3)
            r4 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            if (r2 != 0) goto L_0x0028
            b6.k0 r2 = r1.f4165h0
            boolean r9 = r1.f4172o0
            b6.x0$c r10 = r1.X
            b7.y$a r2 = r2.h(r9, r10)
            r15 = r2
            r2 = r3
            r12 = r6
            r18 = r12
            goto L_0x0056
        L_0x0028:
            java.lang.Object r9 = r2.first
            java.lang.Object r10 = r2.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            b6.h0 r12 = r1.f4163f0
            b7.y$a r9 = r12.x(r9, r10)
            boolean r12 = r9.b()
            if (r12 == 0) goto L_0x0044
            r2 = r3
            r12 = r4
        L_0x0040:
            r15 = r9
            r18 = r10
            goto L_0x0056
        L_0x0044:
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r12 = r2.longValue()
            long r14 = r0.f4187c
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0054
            r2 = r3
            goto L_0x0040
        L_0x0054:
            r2 = r8
            goto L_0x0040
        L_0x0056:
            r9 = 2
            b7.y r10 = r1.f4166i0     // Catch:{ all -> 0x00dd }
            if (r10 == 0) goto L_0x00c5
            int r10 = r1.f4174q0     // Catch:{ all -> 0x00dd }
            if (r10 <= 0) goto L_0x0060
            goto L_0x00c5
        L_0x0060:
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x006c
            r0 = 4
            r1.t0(r0)     // Catch:{ all -> 0x00dd }
            r1.R(r8, r8, r3, r8)     // Catch:{ all -> 0x00dd }
            goto L_0x00c7
        L_0x006c:
            b6.k0 r0 = r1.f4165h0     // Catch:{ all -> 0x00dd }
            b7.y$a r0 = r0.f4390c     // Catch:{ all -> 0x00dd }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00b6
            b6.h0 r0 = r1.f4163f0     // Catch:{ all -> 0x00dd }
            b6.f0 r0 = r0.o()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x008b
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x008b
            b7.w r0 = r0.f4336a     // Catch:{ all -> 0x00dd }
            b6.v0 r4 = r1.f4164g0     // Catch:{ all -> 0x00dd }
            long r4 = r0.c(r12, r4)     // Catch:{ all -> 0x00dd }
            goto L_0x008c
        L_0x008b:
            r4 = r12
        L_0x008c:
            long r6 = b6.c.c(r4)     // Catch:{ all -> 0x00dd }
            b6.k0 r0 = r1.f4165h0     // Catch:{ all -> 0x00dd }
            long r10 = r0.f4400m     // Catch:{ all -> 0x00dd }
            long r10 = b6.c.c(r10)     // Catch:{ all -> 0x00dd }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00b7
            b6.k0 r0 = r1.f4165h0     // Catch:{ all -> 0x00dd }
            long r3 = r0.f4400m     // Catch:{ all -> 0x00dd }
            b6.k0 r14 = r1.f4165h0
            long r20 = r22.t()
            r16 = r3
            b6.k0 r0 = r14.c(r15, r16, r18, r20)
            r1.f4165h0 = r0
            if (r2 == 0) goto L_0x00b5
            b6.a0$d r0 = r1.f4160c0
            r0.g(r9)
        L_0x00b5:
            return
        L_0x00b6:
            r4 = r12
        L_0x00b7:
            long r4 = r1.b0(r15, r4)     // Catch:{ all -> 0x00dd }
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r3 = r8
        L_0x00c1:
            r2 = r2 | r3
            r16 = r4
            goto L_0x00c9
        L_0x00c5:
            r1.f4175r0 = r0     // Catch:{ all -> 0x00dd }
        L_0x00c7:
            r16 = r12
        L_0x00c9:
            b6.k0 r14 = r1.f4165h0
            long r20 = r22.t()
            b6.k0 r0 = r14.c(r15, r16, r18, r20)
            r1.f4165h0 = r0
            if (r2 == 0) goto L_0x00dc
            b6.a0$d r0 = r1.f4160c0
            r0.g(r9)
        L_0x00dc:
            return
        L_0x00dd:
            r0 = move-exception
            b6.k0 r14 = r1.f4165h0
            long r20 = r22.t()
            r16 = r12
            b6.k0 r3 = r14.c(r15, r16, r18, r20)
            r1.f4165h0 = r3
            if (r2 == 0) goto L_0x00f3
            b6.a0$d r2 = r1.f4160c0
            r2.g(r9)
        L_0x00f3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a0.a0(b6.a0$e):void");
    }

    public void b(l0 l0Var) {
        this.U.i(17, l0Var).sendToTarget();
    }

    public final long b0(y.a aVar, long j10) throws i {
        return c0(aVar, j10, this.f4163f0.o() != this.f4163f0.p());
    }

    public void c() {
        this.U.e(11);
    }

    public final long c0(y.a aVar, long j10, boolean z10) throws i {
        y0();
        this.f4170m0 = false;
        t0(2);
        f0 o10 = this.f4163f0.o();
        f0 f0Var = o10;
        while (true) {
            if (f0Var != null) {
                if (aVar.equals(f0Var.f4341f.f4350a) && f0Var.f4339d) {
                    this.f4163f0.w(f0Var);
                    break;
                }
                f0Var = this.f4163f0.a();
            } else {
                break;
            }
        }
        if (z10 || o10 != f0Var || (f0Var != null && f0Var.z(j10) < 0)) {
            for (r0 g10 : this.f4167j0) {
                g(g10);
            }
            this.f4167j0 = new r0[0];
            o10 = null;
            if (f0Var != null) {
                f0Var.x(0);
            }
        }
        if (f0Var != null) {
            C0(o10);
            if (f0Var.f4340e) {
                long p10 = f0Var.f4336a.p(j10);
                f0Var.f4336a.u(p10 - this.Z, this.f4158a0);
                j10 = p10;
            }
            S(j10);
            D();
        } else {
            this.f4163f0.e(true);
            this.f4165h0 = this.f4165h0.f(TrackGroupArray.R, this.R);
            S(j10);
        }
        w(false);
        this.U.e(2);
        return j10;
    }

    public synchronized void d(p0 p0Var) {
        if (this.f4168k0) {
            p.l(f4152u0, "Ignoring messages sent after release.");
            p0Var.l(false);
            return;
        }
        this.U.i(15, p0Var).sendToTarget();
    }

    public final void d0(p0 p0Var) throws i {
        if (p0Var.f() == c.f4201b) {
            e0(p0Var);
        } else if (this.f4166i0 == null || this.f4174q0 > 0) {
            this.f4161d0.add(new c(p0Var));
        } else {
            c cVar = new c(p0Var);
            if (T(cVar)) {
                this.f4161d0.add(cVar);
                Collections.sort(this.f4161d0);
                return;
            }
            p0Var.l(false);
        }
    }

    public final void e0(p0 p0Var) throws i {
        if (p0Var.d().getLooper() == this.U.k()) {
            f(p0Var);
            int i10 = this.f4165h0.f4393f;
            if (i10 == 3 || i10 == 2) {
                this.U.e(2);
                return;
            }
            return;
        }
        this.U.i(16, p0Var).sendToTarget();
    }

    public final void f(p0 p0Var) throws i {
        if (!p0Var.k()) {
            try {
                p0Var.g().n(p0Var.i(), p0Var.e());
            } finally {
                p0Var.l(true);
            }
        }
    }

    public final void f0(p0 p0Var) {
        p0Var.d().post(new z(this, p0Var));
    }

    public final void g(r0 r0Var) throws i {
        this.f4159b0.e(r0Var);
        o(r0Var);
        r0Var.e();
    }

    public synchronized void g0(boolean z10) {
        boolean z11 = false;
        if (z10) {
            this.U.a(14, 1, 0).sendToTarget();
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.U.f(14, 0, 0, atomicBoolean).sendToTarget();
            while (!atomicBoolean.get() && !this.f4168k0) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() throws b6.i, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            w7.c r1 = r0.f4162e0
            long r1 = r1.b()
            r17.A0()
            b6.h0 r3 = r0.f4163f0
            boolean r3 = r3.r()
            r4 = 10
            if (r3 != 0) goto L_0x001c
            r17.F()
            r0.X(r1, r4)
            return
        L_0x001c:
            b6.h0 r3 = r0.f4163f0
            b6.f0 r3 = r3.o()
            java.lang.String r6 = "doSomeWork"
            w7.k0.a(r6)
            r17.B0()
            long r6 = android.os.SystemClock.elapsedRealtime()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            b7.w r10 = r3.f4336a
            b6.k0 r11 = r0.f4165h0
            long r11 = r11.f4400m
            long r13 = r0.Z
            long r11 = r11 - r13
            boolean r13 = r0.f4158a0
            r10.u(r11, r13)
            b6.r0[] r10 = r0.f4167j0
            int r11 = r10.length
            r13 = 1
            r15 = r13
            r16 = r15
            r14 = 0
        L_0x0047:
            if (r14 >= r11) goto L_0x0084
            r12 = r10[r14]
            long r8 = r0.f4176s0
            r12.m(r8, r6)
            if (r16 == 0) goto L_0x005b
            boolean r8 = r12.a()
            if (r8 == 0) goto L_0x005b
            r16 = r13
            goto L_0x005d
        L_0x005b:
            r16 = 0
        L_0x005d:
            boolean r8 = r12.isReady()
            if (r8 != 0) goto L_0x0072
            boolean r8 = r12.a()
            if (r8 != 0) goto L_0x0072
            boolean r8 = r0.P(r12)
            if (r8 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r8 = 0
            goto L_0x0073
        L_0x0072:
            r8 = r13
        L_0x0073:
            if (r8 != 0) goto L_0x0078
            r12.q()
        L_0x0078:
            if (r15 == 0) goto L_0x007e
            if (r8 == 0) goto L_0x007e
            r15 = r13
            goto L_0x007f
        L_0x007e:
            r15 = 0
        L_0x007f:
            int r14 = r14 + 1
            r8 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0047
        L_0x0084:
            if (r15 != 0) goto L_0x0089
            r17.F()
        L_0x0089:
            b6.g0 r6 = r3.f4341f
            long r6 = r6.f4354e
            r8 = 4
            r9 = 3
            r10 = 2
            if (r16 == 0) goto L_0x00b0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x00a3
            b6.k0 r11 = r0.f4165h0
            long r11 = r11.f4400m
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x00b0
        L_0x00a3:
            b6.g0 r3 = r3.f4341f
            boolean r3 = r3.f4356g
            if (r3 == 0) goto L_0x00b0
            r0.t0(r8)
        L_0x00ac:
            r17.y0()
            goto L_0x00e3
        L_0x00b0:
            b6.k0 r3 = r0.f4165h0
            int r3 = r3.f4393f
            if (r3 != r10) goto L_0x00c7
            boolean r3 = r0.u0(r15)
            if (r3 == 0) goto L_0x00c7
            r0.t0(r9)
            boolean r3 = r0.f4169l0
            if (r3 == 0) goto L_0x00e3
            r17.v0()
            goto L_0x00e3
        L_0x00c7:
            b6.k0 r3 = r0.f4165h0
            int r3 = r3.f4393f
            if (r3 != r9) goto L_0x00e3
            b6.r0[] r3 = r0.f4167j0
            int r3 = r3.length
            if (r3 != 0) goto L_0x00d9
            boolean r3 = r17.B()
            if (r3 == 0) goto L_0x00db
            goto L_0x00e3
        L_0x00d9:
            if (r15 != 0) goto L_0x00e3
        L_0x00db:
            boolean r3 = r0.f4169l0
            r0.f4170m0 = r3
            r0.t0(r10)
            goto L_0x00ac
        L_0x00e3:
            b6.k0 r3 = r0.f4165h0
            int r3 = r3.f4393f
            if (r3 != r10) goto L_0x00f7
            b6.r0[] r3 = r0.f4167j0
            int r6 = r3.length
            r12 = 0
        L_0x00ed:
            if (r12 >= r6) goto L_0x00f7
            r7 = r3[r12]
            r7.q()
            int r12 = r12 + 1
            goto L_0x00ed
        L_0x00f7:
            boolean r3 = r0.f4169l0
            if (r3 == 0) goto L_0x0101
            b6.k0 r3 = r0.f4165h0
            int r3 = r3.f4393f
            if (r3 == r9) goto L_0x0107
        L_0x0101:
            b6.k0 r3 = r0.f4165h0
            int r3 = r3.f4393f
            if (r3 != r10) goto L_0x010b
        L_0x0107:
            r0.X(r1, r4)
            goto L_0x011d
        L_0x010b:
            b6.r0[] r4 = r0.f4167j0
            int r4 = r4.length
            if (r4 == 0) goto L_0x0118
            if (r3 == r8) goto L_0x0118
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.X(r1, r3)
            goto L_0x011d
        L_0x0118:
            w7.n r1 = r0.U
            r1.h(r10)
        L_0x011d:
            w7.k0.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.a0.h():void");
    }

    public final void h0(boolean z10, @o0 AtomicBoolean atomicBoolean) {
        if (this.f4173p0 != z10) {
            this.f4173p0 = z10;
            if (!z10) {
                for (r0 r0Var : this.O) {
                    if (r0Var.getState() == 0) {
                        r0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    M((y) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    k0(message.arg1 != 0);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    a0((e) message.obj);
                    break;
                case 4:
                    m0((l0) message.obj);
                    break;
                case 5:
                    q0((v0) message.obj);
                    break;
                case 6:
                    x0(false, message.arg1 != 0, true);
                    break;
                case 7:
                    O();
                    return true;
                case 8:
                    A((b) message.obj);
                    break;
                case 9:
                    x((w) message.obj);
                    break;
                case 10:
                    v((w) message.obj);
                    break;
                case 11:
                    Q();
                    break;
                case 12:
                    o0(message.arg1);
                    break;
                case 13:
                    s0(message.arg1 != 0);
                    break;
                case 14:
                    h0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 15:
                    d0((p0) message.obj);
                    break;
                case 16:
                    f0((p0) message.obj);
                    break;
                case 17:
                    y((l0) message.obj);
                    break;
                default:
                    return false;
            }
            E();
        } catch (i e10) {
            e = e10;
            p.e(f4152u0, "Playback error.", e);
            this.W.obtainMessage(2, e).sendToTarget();
            x0(true, false, false);
            E();
            return true;
        } catch (IOException e11) {
            p.e(f4152u0, "Source error.", e11);
            this.W.obtainMessage(2, i.d(e11)).sendToTarget();
            x0(false, false, false);
            E();
            return true;
        } catch (OutOfMemoryError | RuntimeException e12) {
            p.e(f4152u0, "Internal runtime error.", e12);
            e = e12 instanceof OutOfMemoryError ? i.a((OutOfMemoryError) e12) : i.e((RuntimeException) e12);
            this.W.obtainMessage(2, e).sendToTarget();
            x0(true, false, false);
            E();
            return true;
        }
        return true;
    }

    public void i(w wVar) {
        this.U.i(9, wVar).sendToTarget();
    }

    public final void i0(boolean z10) {
        k0 k0Var = this.f4165h0;
        if (k0Var.f4394g != z10) {
            this.f4165h0 = k0Var.a(z10);
        }
    }

    public void j(y yVar, x0 x0Var, Object obj) {
        this.U.i(8, new b(yVar, x0Var, obj)).sendToTarget();
    }

    public void j0(boolean z10) {
        this.U.a(1, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void k0(boolean z10) throws i {
        this.f4170m0 = false;
        this.f4169l0 = z10;
        if (!z10) {
            y0();
            B0();
            return;
        }
        int i10 = this.f4165h0.f4393f;
        if (i10 == 3) {
            v0();
        } else if (i10 != 2) {
            return;
        }
        this.U.e(2);
    }

    public void l0(l0 l0Var) {
        this.U.i(4, l0Var).sendToTarget();
    }

    public final void m(int i10, boolean z10, int i11) throws i {
        f0 o10 = this.f4163f0.o();
        r0 r0Var = this.O[i10];
        this.f4167j0[i11] = r0Var;
        if (r0Var.getState() == 0) {
            o o11 = o10.o();
            t0 t0Var = o11.f12037b[i10];
            Format[] p10 = p(o11.f12038c.a(i10));
            boolean z11 = this.f4169l0 && this.f4165h0.f4393f == 3;
            r0Var.u(t0Var, p10, o10.f4338c[i10], this.f4176s0, !z10 && z11, o10.l());
            this.f4159b0.f(r0Var);
            if (z11) {
                r0Var.start();
            }
        }
    }

    public final void m0(l0 l0Var) {
        this.f4159b0.c(l0Var);
    }

    public final void n(boolean[] zArr, int i10) throws i {
        this.f4167j0 = new r0[i10];
        o o10 = this.f4163f0.o().o();
        for (int i11 = 0; i11 < this.O.length; i11++) {
            if (!o10.c(i11)) {
                this.O[i11].reset();
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.O.length; i13++) {
            if (o10.c(i13)) {
                m(i13, zArr[i13], i12);
                i12++;
            }
        }
    }

    public void n0(int i10) {
        this.U.a(12, i10, 0).sendToTarget();
    }

    public final void o(r0 r0Var) throws i {
        if (r0Var.getState() == 2) {
            r0Var.stop();
        }
    }

    public final void o0(int i10) throws i {
        this.f4171n0 = i10;
        if (!this.f4163f0.E(i10)) {
            Z(true);
        }
        w(false);
    }

    public void p0(v0 v0Var) {
        this.U.i(5, v0Var).sendToTarget();
    }

    public final long q() {
        f0 p10 = this.f4163f0.p();
        if (p10 == null) {
            return 0;
        }
        long l10 = p10.l();
        int i10 = 0;
        while (true) {
            r0[] r0VarArr = this.O;
            if (i10 >= r0VarArr.length) {
                return l10;
            }
            if (r0VarArr[i10].getState() != 0 && this.O[i10].o() == p10.f4338c[i10]) {
                long r10 = this.O[i10].r();
                if (r10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(r10, l10);
            }
            i10++;
        }
    }

    public final void q0(v0 v0Var) {
        this.f4164g0 = v0Var;
    }

    public final Pair<Object, Long> r(x0 x0Var, int i10, long j10) {
        return x0Var.j(this.X, this.Y, i10, j10);
    }

    public void r0(boolean z10) {
        this.U.a(13, z10 ? 1 : 0, 0).sendToTarget();
    }

    public Looper s() {
        return this.V.getLooper();
    }

    public final void s0(boolean z10) throws i {
        this.f4172o0 = z10;
        if (!this.f4163f0.F(z10)) {
            Z(true);
        }
        w(false);
    }

    public final long t() {
        return u(this.f4165h0.f4398k);
    }

    public final void t0(int i10) {
        k0 k0Var = this.f4165h0;
        if (k0Var.f4393f != i10) {
            this.f4165h0 = k0Var.d(i10);
        }
    }

    public final long u(long j10) {
        f0 j11 = this.f4163f0.j();
        if (j11 == null) {
            return 0;
        }
        return Math.max(0, j10 - j11.y(this.f4176s0));
    }

    public final boolean u0(boolean z10) {
        if (this.f4167j0.length == 0) {
            return B();
        }
        if (!z10) {
            return false;
        }
        if (!this.f4165h0.f4394g) {
            return true;
        }
        f0 j10 = this.f4163f0.j();
        return (j10.q() && j10.f4341f.f4356g) || this.S.e(t(), this.f4159b0.d().f4402a, this.f4170m0);
    }

    public final void v(w wVar) {
        if (this.f4163f0.u(wVar)) {
            this.f4163f0.v(this.f4176s0);
            D();
        }
    }

    public final void v0() throws i {
        this.f4170m0 = false;
        this.f4159b0.h();
        for (r0 start : this.f4167j0) {
            start.start();
        }
    }

    public final void w(boolean z10) {
        f0 j10 = this.f4163f0.j();
        y.a aVar = j10 == null ? this.f4165h0.f4390c : j10.f4341f.f4350a;
        boolean z11 = !this.f4165h0.f4397j.equals(aVar);
        if (z11) {
            this.f4165h0 = this.f4165h0.b(aVar);
        }
        k0 k0Var = this.f4165h0;
        k0Var.f4398k = j10 == null ? k0Var.f4400m : j10.i();
        this.f4165h0.f4399l = t();
        if ((z11 || z10) && j10 != null && j10.f4339d) {
            z0(j10.n(), j10.o());
        }
    }

    public void w0(boolean z10) {
        this.U.a(6, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void x(w wVar) throws i {
        if (this.f4163f0.u(wVar)) {
            f0 j10 = this.f4163f0.j();
            j10.p(this.f4159b0.d().f4402a, this.f4165h0.f4388a);
            z0(j10.n(), j10.o());
            if (!this.f4163f0.r()) {
                S(this.f4163f0.a().f4341f.f4351b);
                C0((f0) null);
            }
            D();
        }
    }

    public final void x0(boolean z10, boolean z11, boolean z12) {
        R(z10 || !this.f4173p0, true, z11, z11);
        this.f4160c0.e(this.f4174q0 + (z12 ? 1 : 0));
        this.f4174q0 = 0;
        this.S.i();
        t0(1);
    }

    public final void y(l0 l0Var) throws i {
        this.W.obtainMessage(1, l0Var).sendToTarget();
        D0(l0Var.f4402a);
        for (r0 r0Var : this.O) {
            if (r0Var != null) {
                r0Var.p(l0Var.f4402a);
            }
        }
    }

    public final void y0() throws i {
        this.f4159b0.i();
        for (r0 o10 : this.f4167j0) {
            o(o10);
        }
    }

    public final void z() {
        t0(4);
        R(false, false, true, false);
    }

    public final void z0(TrackGroupArray trackGroupArray, o oVar) {
        this.S.d(this.O, trackGroupArray, oVar.f12038c);
    }
}
