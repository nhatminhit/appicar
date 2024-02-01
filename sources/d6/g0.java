package d6;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b6.c0;
import b6.l0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.c;
import d.o0;
import d6.t;
import d6.u;
import g6.e;
import g6.f;
import g6.h;
import g6.i;
import h6.l;
import h6.m;
import java.util.List;
import w7.k0;
import w7.q0;
import w7.r;
import w7.s;

public abstract class g0 extends b6.b implements r {

    /* renamed from: v0  reason: collision with root package name */
    public static final int f6317v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f6318w0 = 1;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f6319x0 = 2;
    public final l<m> X;
    public final boolean Y;
    public final t.a Z;

    /* renamed from: a0  reason: collision with root package name */
    public final u f6320a0;

    /* renamed from: b0  reason: collision with root package name */
    public final c0 f6321b0;

    /* renamed from: c0  reason: collision with root package name */
    public final f f6322c0;

    /* renamed from: d0  reason: collision with root package name */
    public e f6323d0;

    /* renamed from: e0  reason: collision with root package name */
    public Format f6324e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f6325f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f6326g0;

    /* renamed from: h0  reason: collision with root package name */
    public h<f, ? extends i, ? extends f> f6327h0;

    /* renamed from: i0  reason: collision with root package name */
    public f f6328i0;

    /* renamed from: j0  reason: collision with root package name */
    public i f6329j0;
    @o0

    /* renamed from: k0  reason: collision with root package name */
    public c<m> f6330k0;
    @o0

    /* renamed from: l0  reason: collision with root package name */
    public c<m> f6331l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f6332m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6333n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f6334o0;

    /* renamed from: p0  reason: collision with root package name */
    public long f6335p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f6336q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f6337r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f6338s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f6339t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f6340u0;

    public final class b implements u.c {
        public b() {
        }

        public void a(int i10) {
            g0.this.Z.g(i10);
            g0.this.S(i10);
        }

        public void b(int i10, long j10, long j11) {
            g0.this.Z.h(i10, j10, j11);
            g0.this.U(i10, j10, j11);
        }

        public void c() {
            g0.this.T();
            boolean unused = g0.this.f6337r0 = true;
        }
    }

    public g0() {
        this((Handler) null, (t) null, new l[0]);
    }

    public g0(@o0 Handler handler, @o0 t tVar, @o0 d dVar) {
        this(handler, tVar, dVar, (l<m>) null, false, new l[0]);
    }

    public g0(@o0 Handler handler, @o0 t tVar, @o0 d dVar, @o0 l<m> lVar, boolean z10, l... lVarArr) {
        this(handler, tVar, lVar, z10, new a0(dVar, lVarArr));
    }

    public g0(@o0 Handler handler, @o0 t tVar, @o0 l<m> lVar, boolean z10, u uVar) {
        super(1);
        this.X = lVar;
        this.Y = z10;
        this.Z = new t.a(handler, tVar);
        this.f6320a0 = uVar;
        uVar.r(new b());
        this.f6321b0 = new c0();
        this.f6322c0 = f.v();
        this.f6332m0 = 0;
        this.f6334o0 = true;
    }

    public g0(@o0 Handler handler, @o0 t tVar, l... lVarArr) {
        this(handler, tVar, (d) null, (l<m>) null, false, lVarArr);
    }

    public void A() {
        this.f6324e0 = null;
        this.f6334o0 = true;
        this.f6340u0 = false;
        try {
            b0((c<m>) null);
            Y();
            this.f6320a0.reset();
        } finally {
            this.Z.j(this.f6323d0);
        }
    }

    public void B(boolean z10) throws b6.i {
        e eVar = new e();
        this.f6323d0 = eVar;
        this.Z.k(eVar);
        int i10 = w().f4469a;
        if (i10 != 0) {
            this.f6320a0.q(i10);
        } else {
            this.f6320a0.n();
        }
    }

    public void C(long j10, boolean z10) throws b6.i {
        this.f6320a0.flush();
        this.f6335p0 = j10;
        this.f6336q0 = true;
        this.f6337r0 = true;
        this.f6338s0 = false;
        this.f6339t0 = false;
        if (this.f6327h0 != null) {
            P();
        }
    }

    public void E() {
        this.f6320a0.f();
    }

    public void F() {
        f0();
        this.f6320a0.pause();
    }

    public abstract h<f, ? extends i, ? extends f> M(Format format, m mVar) throws f;

    public final boolean N() throws b6.i, f, u.a, u.b, u.d {
        if (this.f6329j0 == null) {
            i iVar = (i) this.f6327h0.c();
            this.f6329j0 = iVar;
            if (iVar == null) {
                return false;
            }
            int i10 = iVar.Q;
            if (i10 > 0) {
                this.f6323d0.f8064f += i10;
                this.f6320a0.o();
            }
        }
        if (this.f6329j0.n()) {
            if (this.f6332m0 == 2) {
                Y();
                R();
                this.f6334o0 = true;
            } else {
                this.f6329j0.q();
                this.f6329j0 = null;
                X();
            }
            return false;
        }
        if (this.f6334o0) {
            Format Q = Q();
            this.f6320a0.i(Q.f5079l0, Q.f5077j0, Q.f5078k0, 0, (int[]) null, this.f6325f0, this.f6326g0);
            this.f6334o0 = false;
        }
        u uVar = this.f6320a0;
        i iVar2 = this.f6329j0;
        if (!uVar.p(iVar2.S, iVar2.P)) {
            return false;
        }
        this.f6323d0.f8063e++;
        this.f6329j0.q();
        this.f6329j0 = null;
        return true;
    }

    public final boolean O() throws f, b6.i {
        h<f, ? extends i, ? extends f> hVar = this.f6327h0;
        if (hVar == null || this.f6332m0 == 2 || this.f6338s0) {
            return false;
        }
        if (this.f6328i0 == null) {
            f m10 = hVar.d();
            this.f6328i0 = m10;
            if (m10 == null) {
                return false;
            }
        }
        if (this.f6332m0 == 1) {
            this.f6328i0.p(4);
            this.f6327h0.e(this.f6328i0);
            this.f6328i0 = null;
            this.f6332m0 = 2;
            return false;
        }
        int H = this.f6340u0 ? -4 : H(this.f6321b0, this.f6328i0, false);
        if (H == -3) {
            return false;
        }
        if (H == -5) {
            V(this.f6321b0.f4302c);
            return true;
        } else if (this.f6328i0.n()) {
            this.f6338s0 = true;
            this.f6327h0.e(this.f6328i0);
            this.f6328i0 = null;
            return false;
        } else {
            boolean c02 = c0(this.f6328i0.t());
            this.f6340u0 = c02;
            if (c02) {
                return false;
            }
            this.f6328i0.s();
            W(this.f6328i0);
            this.f6327h0.e(this.f6328i0);
            this.f6333n0 = true;
            this.f6323d0.f8061c++;
            this.f6328i0 = null;
            return true;
        }
    }

    public final void P() throws b6.i {
        this.f6340u0 = false;
        if (this.f6332m0 != 0) {
            Y();
            R();
            return;
        }
        this.f6328i0 = null;
        i iVar = this.f6329j0;
        if (iVar != null) {
            iVar.q();
            this.f6329j0 = null;
        }
        this.f6327h0.flush();
        this.f6333n0 = false;
    }

    public Format Q() {
        Format format = this.f6324e0;
        return Format.q((String) null, s.f14841z, (String) null, -1, -1, format.f5077j0, format.f5078k0, 2, (List<byte[]>) null, (DrmInitData) null, 0, (String) null);
    }

    public final void R() throws b6.i {
        if (this.f6327h0 == null) {
            a0(this.f6331l0);
            m mVar = null;
            c<m> cVar = this.f6330k0;
            if (cVar == null || (mVar = cVar.b()) != null || this.f6330k0.d() != null) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    k0.a("createAudioDecoder");
                    this.f6327h0 = M(this.f6324e0, mVar);
                    k0.c();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    this.Z.i(this.f6327h0.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.f6323d0.f8059a++;
                } catch (f e10) {
                    throw b6.i.c(e10, x());
                }
            }
        }
    }

    public void S(int i10) {
    }

    public void T() {
    }

    public void U(int i10, long j10, long j11) {
    }

    public final void V(Format format) throws b6.i {
        Format format2 = this.f6324e0;
        this.f6324e0 = format;
        if (!q0.e(format.Z, format2 == null ? null : format2.Z)) {
            if (this.f6324e0.Z != null) {
                l<m> lVar = this.X;
                if (lVar != null) {
                    c<m> a10 = lVar.a(Looper.myLooper(), format.Z);
                    if (a10 == this.f6330k0 || a10 == this.f6331l0) {
                        this.X.f(a10);
                    }
                    b0(a10);
                } else {
                    throw b6.i.c(new IllegalStateException("Media requires a DrmSessionManager"), x());
                }
            } else {
                b0((c<m>) null);
            }
        }
        if (this.f6333n0) {
            this.f6332m0 = 1;
        } else {
            Y();
            R();
            this.f6334o0 = true;
        }
        this.f6325f0 = format.f5080m0;
        this.f6326g0 = format.f5081n0;
        this.Z.l(format);
    }

    public final void W(f fVar) {
        if (this.f6336q0 && !fVar.m()) {
            if (Math.abs(fVar.R - this.f6335p0) > 500000) {
                this.f6335p0 = fVar.R;
            }
            this.f6336q0 = false;
        }
    }

    public final void X() throws b6.i {
        this.f6339t0 = true;
        try {
            this.f6320a0.j();
        } catch (u.d e10) {
            throw b6.i.c(e10, x());
        }
    }

    public final void Y() {
        this.f6328i0 = null;
        this.f6329j0 = null;
        this.f6332m0 = 0;
        this.f6333n0 = false;
        h<f, ? extends i, ? extends f> hVar = this.f6327h0;
        if (hVar != null) {
            hVar.a();
            this.f6327h0 = null;
            this.f6323d0.f8060b++;
        }
        a0((c<m>) null);
    }

    public final void Z(@o0 c<m> cVar) {
        if (cVar != null && cVar != this.f6330k0 && cVar != this.f6331l0) {
            this.X.f(cVar);
        }
    }

    public boolean a() {
        return this.f6339t0 && this.f6320a0.a();
    }

    public final void a0(@o0 c<m> cVar) {
        c<m> cVar2 = this.f6330k0;
        this.f6330k0 = cVar;
        Z(cVar2);
    }

    public final int b(Format format) {
        int i10 = 0;
        if (!s.l(format.W)) {
            return 0;
        }
        int d02 = d0(this.X, format);
        if (d02 <= 2) {
            return d02;
        }
        if (q0.f14786a >= 21) {
            i10 = 32;
        }
        return d02 | i10 | 8;
    }

    public final void b0(@o0 c<m> cVar) {
        c<m> cVar2 = this.f6331l0;
        this.f6331l0 = cVar;
        Z(cVar2);
    }

    public l0 c(l0 l0Var) {
        return this.f6320a0.c(l0Var);
    }

    public final boolean c0(boolean z10) throws b6.i {
        c<m> cVar = this.f6330k0;
        if (cVar == null || (!z10 && this.Y)) {
            return false;
        }
        int state = cVar.getState();
        if (state != 1) {
            return state != 4;
        }
        throw b6.i.c(this.f6330k0.d(), x());
    }

    public l0 d() {
        return this.f6320a0.d();
    }

    public abstract int d0(l<m> lVar, Format format);

    public final boolean e0(int i10, int i11) {
        return this.f6320a0.e(i10, i11);
    }

    public final void f0() {
        long m10 = this.f6320a0.m(a());
        if (m10 != Long.MIN_VALUE) {
            if (!this.f6337r0) {
                m10 = Math.max(this.f6335p0, m10);
            }
            this.f6335p0 = m10;
            this.f6337r0 = false;
        }
    }

    public boolean isReady() {
        return this.f6320a0.k() || (this.f6324e0 != null && !this.f6340u0 && (z() || this.f6329j0 != null));
    }

    public long j() {
        if (getState() == 2) {
            f0();
        }
        return this.f6335p0;
    }

    public void m(long j10, long j11) throws b6.i {
        if (this.f6339t0) {
            try {
                this.f6320a0.j();
            } catch (u.d e10) {
                throw b6.i.c(e10, x());
            }
        } else {
            if (this.f6324e0 == null) {
                this.f6322c0.j();
                int H = H(this.f6321b0, this.f6322c0, true);
                if (H == -5) {
                    V(this.f6321b0.f4302c);
                } else if (H == -4) {
                    w7.a.i(this.f6322c0.n());
                    this.f6338s0 = true;
                    X();
                    return;
                } else {
                    return;
                }
            }
            R();
            if (this.f6327h0 != null) {
                try {
                    k0.a("drainAndFeed");
                    while (N()) {
                    }
                    while (O()) {
                    }
                    k0.c();
                    this.f6323d0.a();
                } catch (f | u.a | u.b | u.d e11) {
                    throw b6.i.c(e11, x());
                }
            }
        }
    }

    public void n(int i10, @o0 Object obj) throws b6.i {
        if (i10 == 2) {
            this.f6320a0.g(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.f6320a0.b((c) obj);
        } else if (i10 != 5) {
            super.n(i10, obj);
        } else {
            this.f6320a0.h((x) obj);
        }
    }

    public r v() {
        return this;
    }
}
