package b7;

import android.net.Uri;
import android.os.Handler;
import b6.c0;
import b6.j0;
import b6.v0;
import b7.i0;
import b7.q0;
import b7.t;
import b7.w;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import j6.i;
import j6.j;
import j6.k;
import j6.p;
import j6.q;
import j6.s;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import t7.g0;
import t7.h0;
import t7.l;
import t7.o;
import t7.p0;
import w7.s;

public final class n0 implements w, k, h0.b<a>, h0.f, q0.b {

    /* renamed from: y0  reason: collision with root package name */
    public static final long f4582y0 = 10000;

    /* renamed from: z0  reason: collision with root package name */
    public static final Format f4583z0 = Format.v("icy", s.f14830p0, Long.MAX_VALUE);
    public final Uri O;
    public final l P;
    public final g0 Q;
    public final i0.a R;
    public final c S;
    public final t7.b T;
    @o0
    public final String U;
    public final long V;
    public final h0 W = new h0("Loader:ProgressiveMediaPeriod");
    public final b X;
    public final w7.f Y;
    public final Runnable Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Runnable f4584a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Handler f4585b0;
    @o0

    /* renamed from: c0  reason: collision with root package name */
    public w.a f4586c0;
    @o0

    /* renamed from: d0  reason: collision with root package name */
    public q f4587d0;
    @o0

    /* renamed from: e0  reason: collision with root package name */
    public IcyHeaders f4588e0;

    /* renamed from: f0  reason: collision with root package name */
    public q0[] f4589f0;

    /* renamed from: g0  reason: collision with root package name */
    public f[] f4590g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4591h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f4592i0;
    @o0

    /* renamed from: j0  reason: collision with root package name */
    public d f4593j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f4594k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f4595l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f4596m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f4597n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f4598o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f4599p0;

    /* renamed from: q0  reason: collision with root package name */
    public long f4600q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f4601r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f4602s0;

    /* renamed from: t0  reason: collision with root package name */
    public long f4603t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f4604u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f4605v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f4606w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f4607x0;

    public final class a implements h0.e, t.a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f4608a;

        /* renamed from: b  reason: collision with root package name */
        public final p0 f4609b;

        /* renamed from: c  reason: collision with root package name */
        public final b f4610c;

        /* renamed from: d  reason: collision with root package name */
        public final k f4611d;

        /* renamed from: e  reason: collision with root package name */
        public final w7.f f4612e;

        /* renamed from: f  reason: collision with root package name */
        public final p f4613f = new p();

        /* renamed from: g  reason: collision with root package name */
        public volatile boolean f4614g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4615h = true;

        /* renamed from: i  reason: collision with root package name */
        public long f4616i;

        /* renamed from: j  reason: collision with root package name */
        public o f4617j = i(0);

        /* renamed from: k  reason: collision with root package name */
        public long f4618k = -1;
        @o0

        /* renamed from: l  reason: collision with root package name */
        public j6.s f4619l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4620m;

        public a(Uri uri, l lVar, b bVar, k kVar, w7.f fVar) {
            this.f4608a = uri;
            this.f4609b = new p0(lVar);
            this.f4610c = bVar;
            this.f4611d = kVar;
            this.f4612e = fVar;
        }

        public void a(w7.w wVar) {
            long max = !this.f4620m ? this.f4616i : Math.max(n0.this.I(), this.f4616i);
            int a10 = wVar.a();
            j6.s sVar = (j6.s) w7.a.g(this.f4619l);
            sVar.a(wVar, a10);
            sVar.c(max, 1, a10, 0, (s.a) null);
            this.f4620m = true;
        }

        public void b() throws IOException, InterruptedException {
            int i10 = 0;
            while (i10 == 0 && !this.f4614g) {
                j6.e eVar = null;
                try {
                    long j10 = this.f4613f.f9610a;
                    o i11 = i(j10);
                    this.f4617j = i11;
                    long a10 = this.f4609b.a(i11);
                    this.f4618k = a10;
                    if (a10 != -1) {
                        this.f4618k = a10 + j10;
                    }
                    Uri uri = (Uri) w7.a.g(this.f4609b.g());
                    IcyHeaders unused = n0.this.f4588e0 = IcyHeaders.a(this.f4609b.b());
                    l lVar = this.f4609b;
                    if (!(n0.this.f4588e0 == null || n0.this.f4588e0.T == -1)) {
                        lVar = new t(this.f4609b, n0.this.f4588e0.T, this);
                        j6.s K = n0.this.K();
                        this.f4619l = K;
                        K.d(n0.f4583z0);
                    }
                    j6.e eVar2 = new j6.e(lVar, j10, this.f4618k);
                    try {
                        i b10 = this.f4610c.b(eVar2, this.f4611d, uri);
                        if (this.f4615h) {
                            b10.h(j10, this.f4616i);
                            this.f4615h = false;
                        }
                        while (i10 == 0 && !this.f4614g) {
                            this.f4612e.a();
                            i10 = b10.f(eVar2, this.f4613f);
                            if (eVar2.getPosition() > n0.this.V + j10) {
                                j10 = eVar2.getPosition();
                                this.f4612e.c();
                                n0.this.f4585b0.post(n0.this.f4584a0);
                            }
                        }
                        if (i10 == 1) {
                            i10 = 0;
                        } else {
                            this.f4613f.f9610a = eVar2.getPosition();
                        }
                        w7.q0.r(this.f4609b);
                    } catch (Throwable th2) {
                        th = th2;
                        eVar = eVar2;
                        if (!(i10 == 1 || eVar == null)) {
                            this.f4613f.f9610a = eVar.getPosition();
                        }
                        w7.q0.r(this.f4609b);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    this.f4613f.f9610a = eVar.getPosition();
                    w7.q0.r(this.f4609b);
                    throw th;
                }
            }
        }

        public void c() {
            this.f4614g = true;
        }

        public final o i(long j10) {
            return new o(this.f4608a, j10, -1, n0.this.U, 22);
        }

        public final void j(long j10, long j11) {
            this.f4613f.f9610a = j10;
            this.f4616i = j11;
            this.f4615h = true;
            this.f4620m = false;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final i[] f4622a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public i f4623b;

        public b(i[] iVarArr) {
            this.f4622a = iVarArr;
        }

        public void a() {
            i iVar = this.f4623b;
            if (iVar != null) {
                iVar.a();
                this.f4623b = null;
            }
        }

        public i b(j jVar, k kVar, Uri uri) throws IOException, InterruptedException {
            i iVar = this.f4623b;
            if (iVar != null) {
                return iVar;
            }
            i[] iVarArr = this.f4622a;
            int length = iVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                i iVar2 = iVarArr[i10];
                try {
                    if (iVar2.c(jVar)) {
                        this.f4623b = iVar2;
                        jVar.h();
                        break;
                    }
                    jVar.h();
                    i10++;
                } catch (EOFException unused) {
                } catch (Throwable th2) {
                    jVar.h();
                    throw th2;
                }
            }
            i iVar3 = this.f4623b;
            if (iVar3 != null) {
                iVar3.g(kVar);
                return this.f4623b;
            }
            throw new y0("None of the available extractors (" + w7.q0.M(this.f4622a) + ") could read the stream.", uri);
        }
    }

    public interface c {
        void d(long j10, boolean z10);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final q f4624a;

        /* renamed from: b  reason: collision with root package name */
        public final TrackGroupArray f4625b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f4626c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f4627d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean[] f4628e;

        public d(q qVar, TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f4624a = qVar;
            this.f4625b = trackGroupArray;
            this.f4626c = zArr;
            int i10 = trackGroupArray.O;
            this.f4627d = new boolean[i10];
            this.f4628e = new boolean[i10];
        }
    }

    public final class e implements r0 {
        public final int O;

        public e(int i10) {
            this.O = i10;
        }

        public void a() throws IOException {
            n0.this.R();
        }

        public boolean isReady() {
            return n0.this.M(this.O);
        }

        public int l(long j10) {
            return n0.this.Z(this.O, j10);
        }

        public int q(c0 c0Var, g6.f fVar, boolean z10) {
            return n0.this.W(this.O, c0Var, fVar, z10);
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f4629a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4630b;

        public f(int i10, boolean z10) {
            this.f4629a = i10;
            this.f4630b = z10;
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f4629a == fVar.f4629a && this.f4630b == fVar.f4630b;
        }

        public int hashCode() {
            return (this.f4629a * 31) + (this.f4630b ? 1 : 0);
        }
    }

    public n0(Uri uri, l lVar, i[] iVarArr, g0 g0Var, i0.a aVar, c cVar, t7.b bVar, @o0 String str, int i10) {
        this.O = uri;
        this.P = lVar;
        this.Q = g0Var;
        this.R = aVar;
        this.S = cVar;
        this.T = bVar;
        this.U = str;
        this.V = (long) i10;
        this.X = new b(iVarArr);
        this.Y = new w7.f();
        this.Z = new l0(this);
        this.f4584a0 = new m0(this);
        this.f4585b0 = new Handler();
        this.f4590g0 = new f[0];
        this.f4589f0 = new q0[0];
        this.f4603t0 = b6.c.f4201b;
        this.f4601r0 = -1;
        this.f4600q0 = b6.c.f4201b;
        this.f4595l0 = 1;
        aVar.I();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        if (!this.f4607x0) {
            ((w.a) w7.a.g(this.f4586c0)).k(this);
        }
    }

    public final boolean F(a aVar, int i10) {
        q qVar;
        if (this.f4601r0 == -1 && ((qVar = this.f4587d0) == null || qVar.j() == b6.c.f4201b)) {
            if (!this.f4592i0 || b0()) {
                this.f4597n0 = this.f4592i0;
                this.f4602s0 = 0;
                this.f4605v0 = 0;
                for (q0 D : this.f4589f0) {
                    D.D();
                }
                aVar.j(0, 0);
                return true;
            }
            this.f4604u0 = true;
            return false;
        }
        this.f4605v0 = i10;
        return true;
    }

    public final void G(a aVar) {
        if (this.f4601r0 == -1) {
            this.f4601r0 = aVar.f4618k;
        }
    }

    public final int H() {
        int i10 = 0;
        for (q0 t10 : this.f4589f0) {
            i10 += t10.t();
        }
        return i10;
    }

    public final long I() {
        long j10 = Long.MIN_VALUE;
        for (q0 q10 : this.f4589f0) {
            j10 = Math.max(j10, q10.q());
        }
        return j10;
    }

    public final d J() {
        return (d) w7.a.g(this.f4593j0);
    }

    public j6.s K() {
        return V(new f(0, true));
    }

    public final boolean L() {
        return this.f4603t0 != b6.c.f4201b;
    }

    public boolean M(int i10) {
        return !b0() && (this.f4606w0 || this.f4589f0[i10].u());
    }

    public final void O() {
        int i10;
        q qVar = this.f4587d0;
        if (!this.f4607x0 && !this.f4592i0 && this.f4591h0 && qVar != null) {
            q0[] q0VarArr = this.f4589f0;
            int length = q0VarArr.length;
            int i11 = 0;
            while (i11 < length) {
                if (q0VarArr[i11].s() != null) {
                    i11++;
                } else {
                    return;
                }
            }
            this.Y.c();
            int length2 = this.f4589f0.length;
            TrackGroup[] trackGroupArr = new TrackGroup[length2];
            boolean[] zArr = new boolean[length2];
            this.f4600q0 = qVar.j();
            for (int i12 = 0; i12 < length2; i12++) {
                Format s10 = this.f4589f0[i12].s();
                String str = s10.W;
                boolean l10 = w7.s.l(str);
                boolean z10 = l10 || w7.s.n(str);
                zArr[i12] = z10;
                this.f4594k0 = z10 | this.f4594k0;
                IcyHeaders icyHeaders = this.f4588e0;
                if (icyHeaders != null) {
                    if (l10 || this.f4590g0[i12].f4630b) {
                        Metadata metadata = s10.U;
                        s10 = s10.h(metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders));
                    }
                    if (l10 && s10.S == -1 && (i10 = icyHeaders.O) != -1) {
                        s10 = s10.a(i10);
                    }
                }
                trackGroupArr[i12] = new TrackGroup(s10);
            }
            this.f4595l0 = (this.f4601r0 == -1 && qVar.j() == b6.c.f4201b) ? 7 : 1;
            this.f4593j0 = new d(qVar, new TrackGroupArray(trackGroupArr), zArr);
            this.f4592i0 = true;
            this.S.d(this.f4600q0, qVar.d());
            ((w.a) w7.a.g(this.f4586c0)).i(this);
        }
    }

    public final void P(int i10) {
        d J = J();
        boolean[] zArr = J.f4628e;
        if (!zArr[i10]) {
            Format a10 = J.f4625b.a(i10).a(0);
            this.R.l(w7.s.g(a10.W), a10, 0, (Object) null, this.f4602s0);
            zArr[i10] = true;
        }
    }

    public final void Q(int i10) {
        boolean[] zArr = J().f4626c;
        if (this.f4604u0 && zArr[i10] && !this.f4589f0[i10].u()) {
            this.f4603t0 = 0;
            this.f4604u0 = false;
            this.f4597n0 = true;
            this.f4602s0 = 0;
            this.f4605v0 = 0;
            for (q0 D : this.f4589f0) {
                D.D();
            }
            ((w.a) w7.a.g(this.f4586c0)).k(this);
        }
    }

    public void R() throws IOException {
        this.W.b(this.Q.c(this.f4595l0));
    }

    /* renamed from: S */
    public void k(a aVar, long j10, long j11, boolean z10) {
        this.R.x(aVar.f4617j, aVar.f4609b.i(), aVar.f4609b.j(), 1, -1, (Format) null, 0, (Object) null, aVar.f4616i, this.f4600q0, j10, j11, aVar.f4609b.h());
        if (!z10) {
            G(aVar);
            for (q0 D : this.f4589f0) {
                D.D();
            }
            if (this.f4599p0 > 0) {
                ((w.a) w7.a.g(this.f4586c0)).k(this);
            }
        }
    }

    /* renamed from: T */
    public void g(a aVar, long j10, long j11) {
        q qVar;
        if (this.f4600q0 == b6.c.f4201b && (qVar = this.f4587d0) != null) {
            boolean d10 = qVar.d();
            long I = I();
            long j12 = I == Long.MIN_VALUE ? 0 : I + 10000;
            this.f4600q0 = j12;
            this.S.d(j12, d10);
        }
        this.R.A(aVar.f4617j, aVar.f4609b.i(), aVar.f4609b.j(), 1, -1, (Format) null, 0, (Object) null, aVar.f4616i, this.f4600q0, j10, j11, aVar.f4609b.h());
        G(aVar);
        this.f4606w0 = true;
        ((w.a) w7.a.g(this.f4586c0)).k(this);
    }

    /* renamed from: U */
    public h0.c j(a aVar, long j10, long j11, IOException iOException, int i10) {
        h0.c cVar;
        a aVar2;
        boolean z10;
        G(aVar);
        long a10 = this.Q.a(this.f4595l0, j11, iOException, i10);
        if (a10 == b6.c.f4201b) {
            cVar = h0.f13085k;
            a aVar3 = aVar;
        } else {
            int H = H();
            if (H > this.f4605v0) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            cVar = F(aVar2, H) ? h0.h(z10, a10) : h0.f13084j;
        }
        this.R.D(aVar.f4617j, aVar.f4609b.i(), aVar.f4609b.j(), 1, -1, (Format) null, 0, (Object) null, aVar.f4616i, this.f4600q0, j10, j11, aVar.f4609b.h(), iOException, !cVar.c());
        return cVar;
    }

    public final j6.s V(f fVar) {
        int length = this.f4589f0.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (fVar.equals(this.f4590g0[i10])) {
                return this.f4589f0[i10];
            }
        }
        q0 q0Var = new q0(this.T);
        q0Var.I(this);
        int i11 = length + 1;
        f[] fVarArr = (f[]) Arrays.copyOf(this.f4590g0, i11);
        fVarArr[length] = fVar;
        this.f4590g0 = (f[]) w7.q0.m(fVarArr);
        q0[] q0VarArr = (q0[]) Arrays.copyOf(this.f4589f0, i11);
        q0VarArr[length] = q0Var;
        this.f4589f0 = (q0[]) w7.q0.m(q0VarArr);
        return q0Var;
    }

    public int W(int i10, c0 c0Var, g6.f fVar, boolean z10) {
        if (b0()) {
            return -3;
        }
        P(i10);
        int z11 = this.f4589f0[i10].z(c0Var, fVar, z10, this.f4606w0, this.f4602s0);
        if (z11 == -3) {
            Q(i10);
        }
        return z11;
    }

    public void X() {
        if (this.f4592i0) {
            for (q0 k10 : this.f4589f0) {
                k10.k();
            }
        }
        this.W.k(this);
        this.f4585b0.removeCallbacksAndMessages((Object) null);
        this.f4586c0 = null;
        this.f4607x0 = true;
        this.R.J();
    }

    public final boolean Y(boolean[] zArr, long j10) {
        int length = this.f4589f0.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                return true;
            }
            q0 q0Var = this.f4589f0[i10];
            q0Var.F();
            if (q0Var.f(j10, true, false) == -1) {
                z10 = false;
            }
            if (z10 || (!zArr[i10] && this.f4594k0)) {
                i10++;
            }
        }
        return false;
    }

    public int Z(int i10, long j10) {
        int i11 = 0;
        if (b0()) {
            return 0;
        }
        P(i10);
        q0 q0Var = this.f4589f0[i10];
        if (!this.f4606w0 || j10 <= q0Var.q()) {
            int f10 = q0Var.f(j10, true, true);
            if (f10 != -1) {
                i11 = f10;
            }
        } else {
            i11 = q0Var.g();
        }
        if (i11 == 0) {
            Q(i10);
        }
        return i11;
    }

    public j6.s a(int i10, int i11) {
        return V(new f(i10, false));
    }

    public final void a0() {
        a aVar = new a(this.O, this.P, this.X, this, this.Y);
        if (this.f4592i0) {
            q qVar = J().f4624a;
            w7.a.i(L());
            long j10 = this.f4600q0;
            if (j10 == b6.c.f4201b || this.f4603t0 <= j10) {
                aVar.j(qVar.i(this.f4603t0).f9611a.f9617b, this.f4603t0);
                this.f4603t0 = b6.c.f4201b;
            } else {
                this.f4606w0 = true;
                this.f4603t0 = b6.c.f4201b;
                return;
            }
        }
        this.f4605v0 = H();
        this.R.G(aVar.f4617j, 1, -1, (Format) null, 0, (Object) null, aVar.f4616i, this.f4600q0, this.W.l(aVar, this, this.Q.c(this.f4595l0)));
    }

    public long b() {
        if (this.f4599p0 == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    public final boolean b0() {
        return this.f4597n0 || L();
    }

    public long c(long j10, v0 v0Var) {
        q qVar = J().f4624a;
        if (!qVar.d()) {
            return 0;
        }
        q.a i10 = qVar.i(j10);
        return w7.q0.K0(j10, v0Var, i10.f9611a.f9616a, i10.f9612b.f9616a);
    }

    public boolean d(long j10) {
        if (this.f4606w0 || this.f4604u0) {
            return false;
        }
        if (this.f4592i0 && this.f4599p0 == 0) {
            return false;
        }
        boolean d10 = this.Y.d();
        if (this.W.i()) {
            return d10;
        }
        a0();
        return true;
    }

    public long e() {
        long j10;
        boolean[] zArr = J().f4626c;
        if (this.f4606w0) {
            return Long.MIN_VALUE;
        }
        if (L()) {
            return this.f4603t0;
        }
        if (this.f4594k0) {
            int length = this.f4589f0.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f4589f0[i10].v()) {
                    j10 = Math.min(j10, this.f4589f0[i10].q());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = I();
        }
        return j10 == Long.MIN_VALUE ? this.f4602s0 : j10;
    }

    public void f(long j10) {
    }

    public long h(com.google.android.exoplayer2.trackselection.f[] fVarArr, boolean[] zArr, r0[] r0VarArr, boolean[] zArr2, long j10) {
        com.google.android.exoplayer2.trackselection.f fVar;
        d J = J();
        TrackGroupArray trackGroupArray = J.f4625b;
        boolean[] zArr3 = J.f4627d;
        int i10 = this.f4599p0;
        int i11 = 0;
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            e eVar = r0VarArr[i12];
            if (eVar != null && (fVarArr[i12] == null || !zArr[i12])) {
                int b10 = eVar.O;
                w7.a.i(zArr3[b10]);
                this.f4599p0--;
                zArr3[b10] = false;
                r0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.f4596m0 ? j10 != 0 : i10 == 0;
        for (int i13 = 0; i13 < fVarArr.length; i13++) {
            if (r0VarArr[i13] == null && (fVar = fVarArr[i13]) != null) {
                w7.a.i(fVar.length() == 1);
                w7.a.i(fVar.h(0) == 0);
                int b11 = trackGroupArray.b(fVar.a());
                w7.a.i(!zArr3[b11]);
                this.f4599p0++;
                zArr3[b11] = true;
                r0VarArr[i13] = new e(b11);
                zArr2[i13] = true;
                if (!z10) {
                    q0 q0Var = this.f4589f0[b11];
                    q0Var.F();
                    z10 = q0Var.f(j10, true, true) == -1 && q0Var.r() != 0;
                }
            }
        }
        if (this.f4599p0 == 0) {
            this.f4604u0 = false;
            this.f4597n0 = false;
            if (this.W.i()) {
                q0[] q0VarArr = this.f4589f0;
                int length = q0VarArr.length;
                while (i11 < length) {
                    q0VarArr[i11].k();
                    i11++;
                }
                this.W.g();
            } else {
                q0[] q0VarArr2 = this.f4589f0;
                int length2 = q0VarArr2.length;
                while (i11 < length2) {
                    q0VarArr2[i11].D();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = p(j10);
            while (i11 < r0VarArr.length) {
                if (r0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f4596m0 = true;
        return j10;
    }

    public void i() {
        for (q0 D : this.f4589f0) {
            D.D();
        }
        this.X.a();
    }

    public void l(Format format) {
        this.f4585b0.post(this.Z);
    }

    public /* synthetic */ List m(List list) {
        return v.a(this, list);
    }

    public void n(w.a aVar, long j10) {
        this.f4586c0 = aVar;
        this.Y.d();
        a0();
    }

    public void o() throws IOException {
        R();
        if (this.f4606w0 && !this.f4592i0) {
            throw new j0("Loading finished before preparation is complete.");
        }
    }

    public long p(long j10) {
        d J = J();
        q qVar = J.f4624a;
        boolean[] zArr = J.f4626c;
        if (!qVar.d()) {
            j10 = 0;
        }
        this.f4597n0 = false;
        this.f4602s0 = j10;
        if (L()) {
            this.f4603t0 = j10;
            return j10;
        } else if (this.f4595l0 != 7 && Y(zArr, j10)) {
            return j10;
        } else {
            this.f4604u0 = false;
            this.f4603t0 = j10;
            this.f4606w0 = false;
            if (this.W.i()) {
                this.W.g();
            } else {
                for (q0 D : this.f4589f0) {
                    D.D();
                }
            }
            return j10;
        }
    }

    public void q(q qVar) {
        if (this.f4588e0 != null) {
            qVar = new q.b(b6.c.f4201b);
        }
        this.f4587d0 = qVar;
        this.f4585b0.post(this.Z);
    }

    public void r() {
        this.f4591h0 = true;
        this.f4585b0.post(this.Z);
    }

    public long s() {
        if (!this.f4598o0) {
            this.R.L();
            this.f4598o0 = true;
        }
        if (!this.f4597n0) {
            return b6.c.f4201b;
        }
        if (!this.f4606w0 && H() <= this.f4605v0) {
            return b6.c.f4201b;
        }
        this.f4597n0 = false;
        return this.f4602s0;
    }

    public TrackGroupArray t() {
        return J().f4625b;
    }

    public void u(long j10, boolean z10) {
        if (!L()) {
            boolean[] zArr = J().f4627d;
            int length = this.f4589f0.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f4589f0[i10].j(j10, z10, zArr[i10]);
            }
        }
    }
}
