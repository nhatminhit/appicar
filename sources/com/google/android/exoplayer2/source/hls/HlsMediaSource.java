package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import b6.b0;
import b7.c;
import b7.i0;
import b7.m;
import b7.v0;
import b7.w;
import b7.y;
import c7.f;
import com.google.android.exoplayer2.offline.StreamKey;
import d.o0;
import e7.f;
import e7.g;
import e7.h;
import g7.d;
import g7.f;
import g7.i;
import g7.j;
import java.io.IOException;
import java.util.List;
import t7.b;
import t7.g0;
import t7.l;
import t7.r0;
import t7.x;

public final class HlsMediaSource extends c implements j.e {
    public final g T;
    public final Uri U;
    public final f V;
    public final b7.j W;
    public final g0 X;
    public final boolean Y;
    public final boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public final j f5286a0;
    @o0

    /* renamed from: b0  reason: collision with root package name */
    public final Object f5287b0;
    @o0

    /* renamed from: c0  reason: collision with root package name */
    public r0 f5288c0;

    public static final class Factory implements f.d {

        /* renamed from: a  reason: collision with root package name */
        public final e7.f f5289a;

        /* renamed from: b  reason: collision with root package name */
        public g f5290b;

        /* renamed from: c  reason: collision with root package name */
        public i f5291c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public List<StreamKey> f5292d;

        /* renamed from: e  reason: collision with root package name */
        public j.a f5293e;

        /* renamed from: f  reason: collision with root package name */
        public b7.j f5294f;

        /* renamed from: g  reason: collision with root package name */
        public g0 f5295g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5296h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5297i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5298j;
        @o0

        /* renamed from: k  reason: collision with root package name */
        public Object f5299k;

        public Factory(e7.f fVar) {
            this.f5289a = (e7.f) w7.a.g(fVar);
            this.f5291c = new g7.a();
            this.f5293e = g7.c.f8081e0;
            this.f5290b = g.f6915a;
            this.f5295g = new x();
            this.f5294f = new m();
        }

        public Factory(l.a aVar) {
            this((e7.f) new e7.c(aVar));
        }

        public int[] a() {
            return new int[]{2};
        }

        @Deprecated
        public HlsMediaSource c(Uri uri, @o0 Handler handler, @o0 i0 i0Var) {
            HlsMediaSource createMediaSource = b(uri);
            if (!(handler == null || i0Var == null)) {
                createMediaSource.f(handler, i0Var);
            }
            return createMediaSource;
        }

        /* renamed from: createMediaSource */
        public HlsMediaSource b(Uri uri) {
            this.f5298j = true;
            List<StreamKey> list = this.f5292d;
            if (list != null) {
                this.f5291c = new d(this.f5291c, list);
            }
            e7.f fVar = this.f5289a;
            g gVar = this.f5290b;
            b7.j jVar = this.f5294f;
            g0 g0Var = this.f5295g;
            return new HlsMediaSource(uri, fVar, gVar, jVar, g0Var, this.f5293e.a(fVar, g0Var, this.f5291c), this.f5296h, this.f5297i, this.f5299k);
        }

        public Factory d(boolean z10) {
            w7.a.i(!this.f5298j);
            this.f5296h = z10;
            return this;
        }

        public Factory e(b7.j jVar) {
            w7.a.i(!this.f5298j);
            this.f5294f = (b7.j) w7.a.g(jVar);
            return this;
        }

        public Factory f(g gVar) {
            w7.a.i(!this.f5298j);
            this.f5290b = (g) w7.a.g(gVar);
            return this;
        }

        public Factory g(g0 g0Var) {
            w7.a.i(!this.f5298j);
            this.f5295g = g0Var;
            return this;
        }

        @Deprecated
        public Factory h(int i10) {
            w7.a.i(!this.f5298j);
            this.f5295g = new x(i10);
            return this;
        }

        public Factory i(i iVar) {
            w7.a.i(!this.f5298j);
            this.f5291c = (i) w7.a.g(iVar);
            return this;
        }

        public Factory j(j.a aVar) {
            w7.a.i(!this.f5298j);
            this.f5293e = (j.a) w7.a.g(aVar);
            return this;
        }

        public Factory k(Object obj) {
            w7.a.i(!this.f5298j);
            this.f5299k = obj;
            return this;
        }

        public Factory l(boolean z10) {
            this.f5297i = z10;
            return this;
        }

        public Factory setStreamKeys(List<StreamKey> list) {
            w7.a.i(!this.f5298j);
            this.f5292d = list;
            return this;
        }
    }

    static {
        b0.a("goog.exo.hls");
    }

    public HlsMediaSource(Uri uri, e7.f fVar, g gVar, b7.j jVar, g0 g0Var, j jVar2, boolean z10, boolean z11, @o0 Object obj) {
        this.U = uri;
        this.V = fVar;
        this.T = gVar;
        this.W = jVar;
        this.X = g0Var;
        this.f5286a0 = jVar2;
        this.Y = z10;
        this.Z = z11;
        this.f5287b0 = obj;
    }

    public void a(g7.f fVar) {
        v0 v0Var;
        long j10;
        g7.f fVar2 = fVar;
        long c10 = fVar2.f8125m ? b6.c.c(fVar2.f8118f) : -9223372036854775807L;
        int i10 = fVar2.f8116d;
        long j11 = (i10 == 2 || i10 == 1) ? c10 : -9223372036854775807L;
        long j12 = fVar2.f8117e;
        if (this.f5286a0.f()) {
            long e10 = fVar2.f8118f - this.f5286a0.e();
            long j13 = fVar2.f8124l ? e10 + fVar2.f8128p : -9223372036854775807L;
            List<f.b> list = fVar2.f8127o;
            if (j12 == b6.c.f4201b) {
                j10 = list.isEmpty() ? 0 : list.get(Math.max(0, list.size() - 3)).T;
            } else {
                j10 = j12;
            }
            v0Var = new v0(j11, c10, j13, fVar2.f8128p, e10, j10, true, !fVar2.f8124l, this.f5287b0);
        } else {
            long j14 = j12 == b6.c.f4201b ? 0 : j12;
            long j15 = fVar2.f8128p;
            v0Var = new v0(j11, c10, j15, j15, 0, j14, true, false, this.f5287b0);
        }
        p(v0Var, new h(this.f5286a0.h(), fVar2));
    }

    public w c(y.a aVar, b bVar, long j10) {
        return new e7.j(this.T, this.f5286a0, this.V, this.f5288c0, this.X, m(aVar), bVar, this.W, this.Y, this.Z);
    }

    @o0
    public Object g() {
        return this.f5287b0;
    }

    public void h() throws IOException {
        this.f5286a0.i();
    }

    public void i(w wVar) {
        ((e7.j) wVar).B();
    }

    public void o(@o0 r0 r0Var) {
        this.f5288c0 = r0Var;
        this.f5286a0.d(this.U, m((y.a) null), this);
    }

    public void q() {
        this.f5286a0.stop();
    }
}
