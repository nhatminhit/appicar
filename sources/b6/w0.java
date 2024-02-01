package b6;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import b6.j;
import b6.n0;
import b6.p0;
import b7.y;
import c6.a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import d6.c;
import d6.i;
import d6.k;
import d6.t;
import d6.x;
import g6.e;
import h6.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import q7.m;
import q7.n;
import t7.d;
import w7.p;
import w7.q0;
import w7.z;
import x7.h;
import x7.q;

public class w0 extends a implements j, n0.a, n0.i, n0.g, n0.e {
    public static final String Y = "SimpleExoPlayer";
    public final d A;
    public final c6.a B;
    public final i C;
    @o0
    public Format D;
    @o0
    public Format E;
    @o0
    public Surface F;
    public boolean G;
    public int H;
    @o0
    public SurfaceHolder I;
    @o0
    public TextureView J;
    public int K;
    public int L;
    @o0
    public e M;
    @o0
    public e N;
    public int O;
    public d6.c P;
    public float Q;
    @o0
    public y R;
    public List<h7.b> S;
    @o0
    public x7.e T;
    @o0
    public y7.a U;
    public boolean V;
    @o0
    public z W;
    public boolean X;

    /* renamed from: q  reason: collision with root package name */
    public final r0[] f4480q;

    /* renamed from: r  reason: collision with root package name */
    public final s f4481r;

    /* renamed from: s  reason: collision with root package name */
    public final Handler f4482s;

    /* renamed from: t  reason: collision with root package name */
    public final b f4483t;

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArraySet<h> f4484u;

    /* renamed from: v  reason: collision with root package name */
    public final CopyOnWriteArraySet<k> f4485v;

    /* renamed from: w  reason: collision with root package name */
    public final CopyOnWriteArraySet<h7.k> f4486w;

    /* renamed from: x  reason: collision with root package name */
    public final CopyOnWriteArraySet<u6.d> f4487x;

    /* renamed from: y  reason: collision with root package name */
    public final CopyOnWriteArraySet<q> f4488y;

    /* renamed from: z  reason: collision with root package name */
    public final CopyOnWriteArraySet<t> f4489z;

    public final class b implements q, t, h7.k, u6.d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, i.d, n0.d {
        public b() {
        }

        public /* synthetic */ void A(boolean z10, int i10) {
            o0.d(this, z10, i10);
        }

        public void B(e eVar) {
            Iterator it = w0.this.f4489z.iterator();
            while (it.hasNext()) {
                ((t) it.next()).B(eVar);
            }
            Format unused = w0.this.E = null;
            e unused2 = w0.this.N = null;
            int unused3 = w0.this.O = 0;
        }

        public /* synthetic */ void C(int i10) {
            o0.f(this, i10);
        }

        public void D(e eVar) {
            e unused = w0.this.N = eVar;
            Iterator it = w0.this.f4489z.iterator();
            while (it.hasNext()) {
                ((t) it.next()).D(eVar);
            }
        }

        public void G(Format format) {
            Format unused = w0.this.D = format;
            Iterator it = w0.this.f4488y.iterator();
            while (it.hasNext()) {
                ((q) it.next()).G(format);
            }
        }

        public void H(Format format) {
            Format unused = w0.this.E = format;
            Iterator it = w0.this.f4489z.iterator();
            while (it.hasNext()) {
                ((t) it.next()).H(format);
            }
        }

        public void I(e eVar) {
            e unused = w0.this.M = eVar;
            Iterator it = w0.this.f4488y.iterator();
            while (it.hasNext()) {
                ((q) it.next()).I(eVar);
            }
        }

        public void J(int i10, long j10, long j11) {
            Iterator it = w0.this.f4489z.iterator();
            while (it.hasNext()) {
                ((t) it.next()).J(i10, j10, j11);
            }
        }

        public /* synthetic */ void K(TrackGroupArray trackGroupArray, m mVar) {
            o0.j(this, trackGroupArray, mVar);
        }

        public /* synthetic */ void N(i iVar) {
            o0.c(this, iVar);
        }

        public void a(int i10) {
            if (w0.this.O != i10) {
                int unused = w0.this.O = i10;
                Iterator it = w0.this.f4485v.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (!w0.this.f4489z.contains(kVar)) {
                        kVar.a(i10);
                    }
                }
                Iterator it2 = w0.this.f4489z.iterator();
                while (it2.hasNext()) {
                    ((t) it2.next()).a(i10);
                }
            }
        }

        public /* synthetic */ void b(l0 l0Var) {
            o0.b(this, l0Var);
        }

        public void c(int i10, int i11, int i12, float f10) {
            Iterator it = w0.this.f4484u.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (!w0.this.f4488y.contains(hVar)) {
                    hVar.c(i10, i11, i12, f10);
                }
            }
            Iterator it2 = w0.this.f4488y.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).c(i10, i11, i12, f10);
            }
        }

        public void d(boolean z10) {
            w0 w0Var;
            if (w0.this.W != null) {
                boolean z11 = false;
                if (z10 && !w0.this.X) {
                    w0.this.W.a(0);
                    w0Var = w0.this;
                    z11 = true;
                } else if (!z10 && w0.this.X) {
                    w0.this.W.e(0);
                    w0Var = w0.this;
                } else {
                    return;
                }
                boolean unused = w0Var.X = z11;
            }
        }

        public /* synthetic */ void e(int i10) {
            o0.e(this, i10);
        }

        public void f(float f10) {
            w0.this.u1();
        }

        public void g(String str, long j10, long j11) {
            Iterator it = w0.this.f4488y.iterator();
            while (it.hasNext()) {
                ((q) it.next()).g(str, j10, j11);
            }
        }

        public void h(int i10) {
            w0 w0Var = w0.this;
            w0Var.E1(w0Var.q(), i10);
        }

        public /* synthetic */ void i() {
            o0.g(this);
        }

        public void j(List<h7.b> list) {
            List unused = w0.this.S = list;
            Iterator it = w0.this.f4486w.iterator();
            while (it.hasNext()) {
                ((h7.k) it.next()).j(list);
            }
        }

        public /* synthetic */ void k(x0 x0Var, Object obj, int i10) {
            o0.i(this, x0Var, obj, i10);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            w0.this.D1(new Surface(surfaceTexture), true);
            w0.this.p1(i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            w0.this.D1((Surface) null, true);
            w0.this.p1(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            w0.this.p1(i10, i11);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void p(Surface surface) {
            if (w0.this.F == surface) {
                Iterator it = w0.this.f4484u.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).F();
                }
            }
            Iterator it2 = w0.this.f4488y.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).p(surface);
            }
        }

        public void s(String str, long j10, long j11) {
            Iterator it = w0.this.f4489z.iterator();
            while (it.hasNext()) {
                ((t) it.next()).s(str, j10, j11);
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            w0.this.p1(i11, i12);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            w0.this.D1(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            w0.this.D1((Surface) null, false);
            w0.this.p1(0, 0);
        }

        public /* synthetic */ void t(boolean z10) {
            o0.h(this, z10);
        }

        public void u(Metadata metadata) {
            Iterator it = w0.this.f4487x.iterator();
            while (it.hasNext()) {
                ((u6.d) it.next()).u(metadata);
            }
        }

        public void y(e eVar) {
            Iterator it = w0.this.f4488y.iterator();
            while (it.hasNext()) {
                ((q) it.next()).y(eVar);
            }
            Format unused = w0.this.D = null;
            e unused2 = w0.this.M = null;
        }

        public void z(int i10, long j10) {
            Iterator it = w0.this.f4488y.iterator();
            while (it.hasNext()) {
                ((q) it.next()).z(i10, j10);
            }
        }
    }

    @Deprecated
    public interface c extends h {
    }

    public w0(Context context, u0 u0Var, n nVar, e0 e0Var, @o0 l<h6.n> lVar, d dVar, a.C0077a aVar, Looper looper) {
        this(context, u0Var, nVar, e0Var, lVar, dVar, aVar, w7.c.f14695a, looper);
    }

    public w0(Context context, u0 u0Var, n nVar, e0 e0Var, @o0 l<h6.n> lVar, d dVar, a.C0077a aVar, w7.c cVar, Looper looper) {
        l<h6.n> lVar2 = lVar;
        d dVar2 = dVar;
        this.A = dVar2;
        b bVar = new b();
        this.f4483t = bVar;
        CopyOnWriteArraySet<h> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f4484u = copyOnWriteArraySet;
        CopyOnWriteArraySet<k> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f4485v = copyOnWriteArraySet2;
        this.f4486w = new CopyOnWriteArraySet<>();
        this.f4487x = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<q> copyOnWriteArraySet3 = new CopyOnWriteArraySet<>();
        this.f4488y = copyOnWriteArraySet3;
        CopyOnWriteArraySet<t> copyOnWriteArraySet4 = new CopyOnWriteArraySet<>();
        this.f4489z = copyOnWriteArraySet4;
        Handler handler = new Handler(looper);
        this.f4482s = handler;
        r0[] a10 = u0Var.a(handler, bVar, bVar, bVar, bVar, lVar);
        this.f4480q = a10;
        this.Q = 1.0f;
        this.O = 0;
        this.P = d6.c.f6271e;
        this.H = 1;
        this.S = Collections.emptyList();
        s sVar = r1;
        s sVar2 = new s(a10, nVar, e0Var, dVar, cVar, looper);
        this.f4481r = sVar;
        c6.a a11 = aVar.a(sVar, cVar);
        this.B = a11;
        P(a11);
        P(bVar);
        copyOnWriteArraySet3.add(a11);
        copyOnWriteArraySet.add(a11);
        copyOnWriteArraySet4.add(a11);
        copyOnWriteArraySet2.add(a11);
        z(a11);
        dVar2.b(handler, a11);
        l<h6.n> lVar3 = lVar;
        if (lVar3 instanceof com.google.android.exoplayer2.drm.b) {
            ((com.google.android.exoplayer2.drm.b) lVar3).i(handler, a11);
        }
        this.C = new i(context, bVar);
    }

    public w0(Context context, u0 u0Var, n nVar, e0 e0Var, d dVar, @o0 l<h6.n> lVar, Looper looper) {
        this(context, u0Var, nVar, e0Var, lVar, dVar, new a.C0077a(), looper);
    }

    public long A0() {
        F1();
        return this.f4481r.A0();
    }

    @Deprecated
    public void A1(h7.k kVar) {
        this.f4486w.clear();
        if (kVar != null) {
            K(kVar);
        }
    }

    public int B() {
        F1();
        return this.f4481r.B();
    }

    public void B0(TextureView textureView) {
        F1();
        s1();
        this.J = textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                p.l(Y, "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.f4483t);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                D1(new Surface(surfaceTexture), true);
                p1(textureView.getWidth(), textureView.getHeight());
                return;
            }
        }
        D1((Surface) null, true);
        p1(0, 0);
    }

    @Deprecated
    public void B1(q qVar) {
        this.f4488y.retainAll(Collections.singleton(this.B));
        if (qVar != null) {
            f1(qVar);
        }
    }

    public m C0() {
        F1();
        return this.f4481r.C0();
    }

    @Deprecated
    public void C1(c cVar) {
        this.f4484u.clear();
        if (cVar != null) {
            Z(cVar);
        }
    }

    public void D(TextureView textureView) {
        F1();
        if (textureView != null && textureView == this.J) {
            B0((TextureView) null);
        }
    }

    public int D0(int i10) {
        F1();
        return this.f4481r.D0(i10);
    }

    public final void D1(@o0 Surface surface, boolean z10) {
        ArrayList<p0> arrayList = new ArrayList<>();
        for (r0 r0Var : this.f4480q) {
            if (r0Var.f() == 2) {
                arrayList.add(this.f4481r.b0(r0Var).s(1).p(surface).m());
            }
        }
        Surface surface2 = this.F;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (p0 a10 : arrayList) {
                    a10.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.G) {
                this.F.release();
            }
        }
        this.F = surface;
        this.G = z10;
    }

    public void E0(SurfaceHolder surfaceHolder) {
        F1();
        if (surfaceHolder != null && surfaceHolder == this.I) {
            S((SurfaceHolder) null);
        }
    }

    public final void E1(boolean z10, int i10) {
        s sVar = this.f4481r;
        boolean z11 = false;
        boolean z12 = z10 && i10 != -1;
        if (i10 != 1) {
            z11 = true;
        }
        sVar.e1(z12, z11);
    }

    public void F(boolean z10) {
        this.f4481r.F(z10);
    }

    public void F0() {
        h(new x(0, 0.0f));
    }

    public final void F1() {
        if (Looper.myLooper() != u0()) {
            p.m(Y, "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.V ? null : new IllegalStateException());
            this.V = true;
        }
    }

    public int G() {
        F1();
        return this.f4481r.G();
    }

    @o0
    public n0.g G0() {
        return this;
    }

    public void H(SurfaceView surfaceView) {
        S(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void J(n0.d dVar) {
        F1();
        this.f4481r.J(dVar);
    }

    public void K(h7.k kVar) {
        if (!this.S.isEmpty()) {
            kVar.j(this.S);
        }
        this.f4486w.add(kVar);
    }

    public void L(u6.d dVar) {
        this.f4487x.remove(dVar);
    }

    public void N(x7.e eVar) {
        F1();
        this.T = eVar;
        for (r0 r0Var : this.f4480q) {
            if (r0Var.f() == 2) {
                this.f4481r.b0(r0Var).s(6).p(eVar).m();
            }
        }
    }

    public void O() {
        F1();
        l((Surface) null);
    }

    public void P(n0.d dVar) {
        F1();
        this.f4481r.P(dVar);
    }

    public int Q() {
        F1();
        return this.f4481r.Q();
    }

    @o0
    public n0.a R() {
        return this;
    }

    public void S(SurfaceHolder surfaceHolder) {
        F1();
        s1();
        this.I = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.f4483t);
            Surface surface = surfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                D1(surface, false);
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                p1(surfaceFrame.width(), surfaceFrame.height());
                return;
            }
        }
        D1((Surface) null, false);
        p1(0, 0);
    }

    @Deprecated
    public void T(j.b... bVarArr) {
        this.f4481r.T(bVarArr);
    }

    public void U(y yVar) {
        g0(yVar, true, true);
    }

    public void V(boolean z10) {
        F1();
        E1(z10, this.C.q(z10, e()));
    }

    @o0
    public n0.i W() {
        return this;
    }

    public boolean Y() {
        F1();
        return this.f4481r.Y();
    }

    public void Z(h hVar) {
        this.f4484u.add(hVar);
    }

    public void a() {
        F1();
        this.C.r();
        this.f4481r.a();
        s1();
        Surface surface = this.F;
        if (surface != null) {
            if (this.G) {
                surface.release();
            }
            this.F = null;
        }
        y yVar = this.R;
        if (yVar != null) {
            yVar.k(this.B);
            this.R = null;
        }
        if (this.X) {
            ((z) w7.a.g(this.W)).e(0);
            this.X = false;
        }
        this.A.f(this.B);
        this.S = Collections.emptyList();
    }

    public long a0() {
        F1();
        return this.f4481r.a0();
    }

    public void b(d6.c cVar) {
        x0(cVar, false);
    }

    public p0 b0(p0.b bVar) {
        F1();
        return this.f4481r.b0(bVar);
    }

    public void c(@o0 l0 l0Var) {
        F1();
        this.f4481r.c(l0Var);
    }

    public l0 d() {
        F1();
        return this.f4481r.d();
    }

    @o0
    public Object d0() {
        F1();
        return this.f4481r.d0();
    }

    public void d1(c6.c cVar) {
        F1();
        this.B.S(cVar);
    }

    public int e() {
        F1();
        return this.f4481r.e();
    }

    public long e0() {
        F1();
        return this.f4481r.e0();
    }

    @Deprecated
    public void e1(t tVar) {
        this.f4489z.add(tVar);
    }

    public d6.c f() {
        return this.P;
    }

    public void f0(h hVar) {
        this.f4484u.remove(hVar);
    }

    @Deprecated
    public void f1(q qVar) {
        this.f4488y.add(qVar);
    }

    public void g(float f10) {
        F1();
        float t10 = q0.t(f10, 0.0f, 1.0f);
        if (this.Q != t10) {
            this.Q = t10;
            u1();
            Iterator<k> it = this.f4485v.iterator();
            while (it.hasNext()) {
                it.next().m(t10);
            }
        }
    }

    public void g0(y yVar, boolean z10, boolean z11) {
        F1();
        y yVar2 = this.R;
        if (yVar2 != null) {
            yVar2.k(this.B);
            this.B.d0();
        }
        this.R = yVar;
        yVar.f(this.f4482s, this.B);
        E1(q(), this.C.p(q()));
        this.f4481r.g0(yVar, z10, z11);
    }

    @Deprecated
    public void g1(u6.d dVar) {
        L(dVar);
    }

    public int getAudioSessionId() {
        return this.O;
    }

    public long getCurrentPosition() {
        F1();
        return this.f4481r.getCurrentPosition();
    }

    public long getDuration() {
        F1();
        return this.f4481r.getDuration();
    }

    public float getVolume() {
        return this.Q;
    }

    public void h(x xVar) {
        F1();
        for (r0 r0Var : this.f4480q) {
            if (r0Var.f() == 1) {
                this.f4481r.b0(r0Var).s(5).p(xVar).m();
            }
        }
    }

    public void h0(x7.e eVar) {
        F1();
        if (this.T == eVar) {
            for (r0 r0Var : this.f4480q) {
                if (r0Var.f() == 2) {
                    this.f4481r.b0(r0Var).s(6).p((Object) null).m();
                }
            }
        }
    }

    @Deprecated
    public void h1(h7.k kVar) {
        v0(kVar);
    }

    public void i(int i10) {
        F1();
        this.f4481r.i(i10);
    }

    public void i0(int i10) {
        F1();
        this.H = i10;
        for (r0 r0Var : this.f4480q) {
            if (r0Var.f() == 2) {
                this.f4481r.b0(r0Var).s(4).p(Integer.valueOf(i10)).m();
            }
        }
    }

    @Deprecated
    public void i1(c cVar) {
        f0(cVar);
    }

    public void j(y7.a aVar) {
        F1();
        this.U = aVar;
        for (r0 r0Var : this.f4480q) {
            if (r0Var.f() == 5) {
                this.f4481r.b0(r0Var).s(7).p(aVar).m();
            }
        }
    }

    public void j0(k kVar) {
        this.f4485v.remove(kVar);
    }

    public c6.a j1() {
        return this.B;
    }

    public int k() {
        F1();
        return this.f4481r.k();
    }

    public Looper k0() {
        return this.f4481r.k0();
    }

    @o0
    public e k1() {
        return this.N;
    }

    public void l(@o0 Surface surface) {
        F1();
        s1();
        int i10 = 0;
        D1(surface, false);
        if (surface != null) {
            i10 = -1;
        }
        p1(i10, i10);
    }

    public void l0(k kVar) {
        this.f4485v.add(kVar);
    }

    @o0
    public Format l1() {
        return this.E;
    }

    public boolean m() {
        F1();
        return this.f4481r.m();
    }

    public int m0() {
        F1();
        return this.f4481r.m0();
    }

    @Deprecated
    public int m1() {
        return q0.e0(this.P.f6274c);
    }

    public void n() {
        F1();
        if (this.R == null) {
            return;
        }
        if (y() != null || e() == 1) {
            g0(this.R, false, false);
        }
    }

    @o0
    public e n1() {
        return this.M;
    }

    public long o() {
        F1();
        return this.f4481r.o();
    }

    public v0 o0() {
        F1();
        return this.f4481r.o0();
    }

    @o0
    public Format o1() {
        return this.D;
    }

    public void p(int i10, long j10) {
        F1();
        this.B.b0();
        this.f4481r.p(i10, j10);
    }

    public void p0(SurfaceView surfaceView) {
        E0(surfaceView == null ? null : surfaceView.getHolder());
    }

    public final void p1(int i10, int i11) {
        if (i10 != this.K || i11 != this.L) {
            this.K = i10;
            this.L = i11;
            Iterator<h> it = this.f4484u.iterator();
            while (it.hasNext()) {
                it.next().O(i10, i11);
            }
        }
    }

    public boolean q() {
        F1();
        return this.f4481r.q();
    }

    public void q0(@o0 v0 v0Var) {
        F1();
        this.f4481r.q0(v0Var);
    }

    public void q1(c6.c cVar) {
        F1();
        this.B.c0(cVar);
    }

    public void r(Surface surface) {
        F1();
        if (surface != null && surface == this.F) {
            l((Surface) null);
        }
    }

    @o0
    public n0.e r0() {
        return this;
    }

    @Deprecated
    public void r1(t tVar) {
        this.f4489z.remove(tVar);
    }

    public void s(boolean z10) {
        F1();
        this.f4481r.s(z10);
    }

    public TrackGroupArray s0() {
        F1();
        return this.f4481r.s0();
    }

    public final void s1() {
        TextureView textureView = this.J;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f4483t) {
                p.l(Y, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.J.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.J = null;
        }
        SurfaceHolder surfaceHolder = this.I;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f4483t);
            this.I = null;
        }
    }

    public void t(boolean z10) {
        F1();
        this.f4481r.t(z10);
        y yVar = this.R;
        if (yVar != null) {
            yVar.k(this.B);
            this.B.d0();
            if (z10) {
                this.R = null;
            }
        }
        this.C.r();
        this.S = Collections.emptyList();
    }

    public x0 t0() {
        F1();
        return this.f4481r.t0();
    }

    @Deprecated
    public void t1(q qVar) {
        this.f4488y.remove(qVar);
    }

    @Deprecated
    public void u(j.b... bVarArr) {
        this.f4481r.u(bVarArr);
    }

    public Looper u0() {
        return this.f4481r.u0();
    }

    public final void u1() {
        float n10 = this.Q * this.C.n();
        for (r0 r0Var : this.f4480q) {
            if (r0Var.f() == 1) {
                this.f4481r.b0(r0Var).s(2).p(Float.valueOf(n10)).m();
            }
        }
    }

    public void v0(h7.k kVar) {
        this.f4486w.remove(kVar);
    }

    @Deprecated
    public void v1(t tVar) {
        this.f4489z.retainAll(Collections.singleton(this.B));
        if (tVar != null) {
            e1(tVar);
        }
    }

    public int w() {
        F1();
        return this.f4481r.w();
    }

    public int w0() {
        return this.H;
    }

    @Deprecated
    public void w1(int i10) {
        int J2 = q0.J(i10);
        b(new c.b().d(J2).b(q0.H(i10)).a());
    }

    public void x0(d6.c cVar, boolean z10) {
        F1();
        if (!q0.e(this.P, cVar)) {
            this.P = cVar;
            for (r0 r0Var : this.f4480q) {
                if (r0Var.f() == 1) {
                    this.f4481r.b0(r0Var).s(3).p(cVar).m();
                }
            }
            Iterator<k> it = this.f4485v.iterator();
            while (it.hasNext()) {
                it.next().r(cVar);
            }
        }
        i iVar = this.C;
        if (!z10) {
            cVar = null;
        }
        E1(q(), iVar.v(cVar, q(), e()));
    }

    @Deprecated
    public void x1(u6.d dVar) {
        this.f4487x.retainAll(Collections.singleton(this.B));
        if (dVar != null) {
            z(dVar);
        }
    }

    @o0
    public i y() {
        F1();
        return this.f4481r.y();
    }

    public void y0(y7.a aVar) {
        F1();
        if (this.U == aVar) {
            for (r0 r0Var : this.f4480q) {
                if (r0Var.f() == 5) {
                    this.f4481r.b0(r0Var).s(7).p((Object) null).m();
                }
            }
        }
    }

    @TargetApi(23)
    @Deprecated
    public void y1(@o0 PlaybackParams playbackParams) {
        l0 l0Var;
        if (playbackParams != null) {
            playbackParams.allowDefaults();
            l0Var = new l0(playbackParams.getSpeed(), playbackParams.getPitch());
        } else {
            l0Var = null;
        }
        c(l0Var);
    }

    public void z(u6.d dVar) {
        this.f4487x.add(dVar);
    }

    public boolean z0() {
        F1();
        return this.f4481r.z0();
    }

    public void z1(@o0 z zVar) {
        F1();
        if (!q0.e(this.W, zVar)) {
            if (this.X) {
                ((z) w7.a.g(this.W)).e(0);
            }
            if (zVar == null || !Y()) {
                this.X = false;
            } else {
                zVar.a(0);
                this.X = true;
            }
            this.W = zVar;
        }
    }
}
