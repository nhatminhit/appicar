package g7;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b7.i0;
import d.o0;
import e7.f;
import g7.e;
import g7.f;
import g7.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import t7.g0;
import t7.h0;
import t7.j0;
import t7.o;

public final class c implements j, h0.b<j0<g>> {

    /* renamed from: e0  reason: collision with root package name */
    public static final j.a f8081e0 = new b();

    /* renamed from: f0  reason: collision with root package name */
    public static final double f8082f0 = 3.5d;
    public final f O;
    public final i P;
    public final g0 Q;
    public final HashMap<Uri, a> R;
    public final List<j.b> S;
    public final double T;
    @o0
    public j0.a<g> U;
    @o0
    public i0.a V;
    @o0
    public h0 W;
    @o0
    public Handler X;
    @o0
    public j.e Y;
    @o0
    public e Z;
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public Uri f8083a0;
    @o0

    /* renamed from: b0  reason: collision with root package name */
    public f f8084b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f8085c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f8086d0;

    public final class a implements h0.b<j0<g>>, Runnable {
        public final Uri O;
        public final h0 P = new h0("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final j0<g> Q;
        public f R;
        public long S;
        public long T;
        public long U;
        public long V;
        public boolean W;
        public IOException X;

        public a(Uri uri) {
            this.O = uri;
            this.Q = new j0<>(c.this.O.a(4), uri, 4, c.this.U);
        }

        public final boolean d(long j10) {
            this.V = SystemClock.elapsedRealtime() + j10;
            return this.O.equals(c.this.f8083a0) && !c.this.F();
        }

        public f e() {
            return this.R;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
            r0 = r0.f8116d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean f() {
            /*
                r10 = this;
                g7.f r0 = r10.R
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                long r2 = android.os.SystemClock.elapsedRealtime()
                r4 = 30000(0x7530, double:1.4822E-319)
                g7.f r0 = r10.R
                long r6 = r0.f8128p
                long r6 = b6.c.c(r6)
                long r4 = java.lang.Math.max(r4, r6)
                g7.f r0 = r10.R
                boolean r6 = r0.f8124l
                r7 = 1
                if (r6 != 0) goto L_0x002d
                int r0 = r0.f8116d
                r6 = 2
                if (r0 == r6) goto L_0x002d
                if (r0 == r7) goto L_0x002d
                long r8 = r10.S
                long r8 = r8 + r4
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x002e
            L_0x002d:
                r1 = r7
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g7.c.a.f():boolean");
        }

        public void h() {
            this.V = 0;
            if (!this.W && !this.P.i()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.U) {
                    this.W = true;
                    c.this.X.postDelayed(this, this.U - elapsedRealtime);
                    return;
                }
                i();
            }
        }

        public final void i() {
            long l10 = this.P.l(this.Q, this, c.this.Q.c(this.Q.f13101b));
            i0.a v10 = c.this.V;
            j0<g> j0Var = this.Q;
            v10.H(j0Var.f13100a, j0Var.f13101b, l10);
        }

        public void l() throws IOException {
            this.P.a();
            IOException iOException = this.X;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: m */
        public void k(j0<g> j0Var, long j10, long j11, boolean z10) {
            c.this.V.y(j0Var.f13100a, j0Var.f(), j0Var.d(), 4, j10, j11, j0Var.a());
        }

        /* renamed from: n */
        public void g(j0<g> j0Var, long j10, long j11) {
            g e10 = j0Var.e();
            if (e10 instanceof f) {
                long j12 = j11;
                p((f) e10, j12);
                c.this.V.B(j0Var.f13100a, j0Var.f(), j0Var.d(), 4, j10, j12, j0Var.a());
                return;
            }
            this.X = new b6.j0("Loaded playlist has unexpected type.");
        }

        /* renamed from: o */
        public h0.c j(j0<g> j0Var, long j10, long j11, IOException iOException, int i10) {
            h0.c cVar;
            j0<g> j0Var2 = j0Var;
            long b10 = c.this.Q.b(j0Var2.f13101b, j11, iOException, i10);
            boolean z10 = b10 != b6.c.f4201b;
            boolean z11 = c.this.H(this.O, b10) || !z10;
            if (z10) {
                z11 |= d(b10);
            }
            if (z11) {
                long a10 = c.this.Q.a(j0Var2.f13101b, j11, iOException, i10);
                cVar = a10 != b6.c.f4201b ? h0.h(false, a10) : h0.f13085k;
            } else {
                cVar = h0.f13084j;
            }
            c.this.V.E(j0Var2.f13100a, j0Var.f(), j0Var.d(), 4, j10, j11, j0Var.a(), iOException, !cVar.c());
            return cVar;
        }

        public final void p(f fVar, long j10) {
            f fVar2 = this.R;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.S = elapsedRealtime;
            f y10 = c.this.B(fVar2, fVar);
            this.R = y10;
            if (y10 != fVar2) {
                this.X = null;
                this.T = elapsedRealtime;
                c.this.L(this.O, y10);
            } else if (!y10.f8124l) {
                f fVar3 = this.R;
                if (fVar.f8121i + ((long) fVar.f8127o.size()) < fVar3.f8121i) {
                    this.X = new j.c(this.O);
                    boolean unused = c.this.H(this.O, b6.c.f4201b);
                } else if (((double) (elapsedRealtime - this.T)) > ((double) b6.c.c(fVar3.f8123k)) * c.this.T) {
                    this.X = new j.d(this.O);
                    long b10 = c.this.Q.b(4, j10, this.X, 1);
                    boolean unused2 = c.this.H(this.O, b10);
                    if (b10 != b6.c.f4201b) {
                        d(b10);
                    }
                }
            }
            f fVar4 = this.R;
            this.U = elapsedRealtime + b6.c.c(fVar4 != fVar2 ? fVar4.f8123k : fVar4.f8123k / 2);
            if (this.O.equals(c.this.f8083a0) && !this.R.f8124l) {
                h();
            }
        }

        public void q() {
            this.P.j();
        }

        public void run() {
            this.W = false;
            i();
        }
    }

    public c(f fVar, g0 g0Var, i iVar) {
        this(fVar, g0Var, iVar, 3.5d);
    }

    public c(f fVar, g0 g0Var, i iVar, double d10) {
        this.O = fVar;
        this.P = iVar;
        this.Q = g0Var;
        this.T = d10;
        this.S = new ArrayList();
        this.R = new HashMap<>();
        this.f8086d0 = b6.c.f4201b;
    }

    public static f.b A(f fVar, f fVar2) {
        int i10 = (int) (fVar2.f8121i - fVar.f8121i);
        List<f.b> list = fVar.f8127o;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    public final f B(f fVar, f fVar2) {
        return !fVar2.f(fVar) ? fVar2.f8124l ? fVar.d() : fVar : fVar2.c(D(fVar, fVar2), C(fVar, fVar2));
    }

    public final int C(f fVar, f fVar2) {
        f.b A;
        if (fVar2.f8119g) {
            return fVar2.f8120h;
        }
        f fVar3 = this.f8084b0;
        int i10 = fVar3 != null ? fVar3.f8120h : 0;
        return (fVar == null || (A = A(fVar, fVar2)) == null) ? i10 : (fVar.f8120h + A.S) - fVar2.f8127o.get(0).S;
    }

    public final long D(f fVar, f fVar2) {
        if (fVar2.f8125m) {
            return fVar2.f8118f;
        }
        f fVar3 = this.f8084b0;
        long j10 = fVar3 != null ? fVar3.f8118f : 0;
        if (fVar == null) {
            return j10;
        }
        int size = fVar.f8127o.size();
        f.b A = A(fVar, fVar2);
        return A != null ? fVar.f8118f + A.T : ((long) size) == fVar2.f8121i - fVar.f8121i ? fVar.e() : j10;
    }

    public final boolean E(Uri uri) {
        List<e.b> list = this.Z.f8094e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f8107a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        List<e.b> list = this.Z.f8094e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = this.R.get(list.get(i10).f8107a);
            if (elapsedRealtime > aVar.V) {
                this.f8083a0 = aVar.O;
                aVar.h();
                return true;
            }
        }
        return false;
    }

    public final void G(Uri uri) {
        if (!uri.equals(this.f8083a0) && E(uri)) {
            f fVar = this.f8084b0;
            if (fVar == null || !fVar.f8124l) {
                this.f8083a0 = uri;
                this.R.get(uri).h();
            }
        }
    }

    public final boolean H(Uri uri, long j10) {
        int size = this.S.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 |= !this.S.get(i10).j(uri, j10);
        }
        return z10;
    }

    /* renamed from: I */
    public void k(j0<g> j0Var, long j10, long j11, boolean z10) {
        i0.a aVar = this.V;
        o oVar = j0Var.f13100a;
        Uri f10 = j0Var.f();
        aVar.y(oVar, f10, j0Var.d(), 4, j10, j11, j0Var.a());
    }

    /* renamed from: J */
    public void g(j0<g> j0Var, long j10, long j11) {
        g e10 = j0Var.e();
        boolean z10 = e10 instanceof f;
        e e11 = z10 ? e.e(e10.f8129a) : (e) e10;
        this.Z = e11;
        this.U = this.P.a(e11);
        this.f8083a0 = e11.f8094e.get(0).f8107a;
        z(e11.f8093d);
        a aVar = this.R.get(this.f8083a0);
        if (z10) {
            aVar.p((f) e10, j11);
        } else {
            long j12 = j11;
            aVar.h();
        }
        this.V.B(j0Var.f13100a, j0Var.f(), j0Var.d(), 4, j10, j11, j0Var.a());
    }

    /* renamed from: K */
    public h0.c j(j0<g> j0Var, long j10, long j11, IOException iOException, int i10) {
        j0<g> j0Var2 = j0Var;
        long a10 = this.Q.a(j0Var2.f13101b, j11, iOException, i10);
        boolean z10 = a10 == b6.c.f4201b;
        this.V.E(j0Var2.f13100a, j0Var.f(), j0Var.d(), 4, j10, j11, j0Var.a(), iOException, z10);
        return z10 ? h0.f13085k : h0.h(false, a10);
    }

    public final void L(Uri uri, f fVar) {
        if (uri.equals(this.f8083a0)) {
            if (this.f8084b0 == null) {
                this.f8085c0 = !fVar.f8124l;
                this.f8086d0 = fVar.f8118f;
            }
            this.f8084b0 = fVar;
            this.Y.a(fVar);
        }
        int size = this.S.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.S.get(i10).g();
        }
    }

    public void a(j.b bVar) {
        this.S.add(bVar);
    }

    public boolean b(Uri uri) {
        return this.R.get(uri).f();
    }

    public void c(Uri uri) throws IOException {
        this.R.get(uri).l();
    }

    public void d(Uri uri, i0.a aVar, j.e eVar) {
        this.X = new Handler();
        this.V = aVar;
        this.Y = eVar;
        j0 j0Var = new j0(this.O.a(4), uri, 4, this.P.b());
        w7.a.i(this.W == null);
        h0 h0Var = new h0("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.W = h0Var;
        aVar.H(j0Var.f13100a, j0Var.f13101b, h0Var.l(j0Var, this, this.Q.c(j0Var.f13101b)));
    }

    public long e() {
        return this.f8086d0;
    }

    public boolean f() {
        return this.f8085c0;
    }

    @o0
    public e h() {
        return this.Z;
    }

    public void i() throws IOException {
        h0 h0Var = this.W;
        if (h0Var != null) {
            h0Var.a();
        }
        Uri uri = this.f8083a0;
        if (uri != null) {
            c(uri);
        }
    }

    public void l(Uri uri) {
        this.R.get(uri).h();
    }

    public f m(Uri uri, boolean z10) {
        f e10 = this.R.get(uri).e();
        if (e10 != null && z10) {
            G(uri);
        }
        return e10;
    }

    public void n(j.b bVar) {
        this.S.remove(bVar);
    }

    public void stop() {
        this.f8083a0 = null;
        this.f8084b0 = null;
        this.Z = null;
        this.f8086d0 = b6.c.f4201b;
        this.W.j();
        this.W = null;
        for (a q10 : this.R.values()) {
            q10.q();
        }
        this.X.removeCallbacksAndMessages((Object) null);
        this.X = null;
        this.R.clear();
    }

    public final void z(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.R.put(uri, new a(uri));
        }
    }
}
