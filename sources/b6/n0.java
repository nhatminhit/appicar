package b6;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import d6.k;
import d6.x;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q7.m;

public interface n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f4408a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f4409b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f4410c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f4411d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f4412e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f4413f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f4414g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f4415h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f4416i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f4417j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f4418k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f4419l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f4420m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f4421n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f4422o = 2;

    public interface a {
        void F0();

        @Deprecated
        void b(d6.c cVar);

        d6.c f();

        void g(float f10);

        int getAudioSessionId();

        float getVolume();

        void h(x xVar);

        void j0(k kVar);

        void l0(k kVar);

        void x0(d6.c cVar, boolean z10);
    }

    @Deprecated
    public static abstract class b implements d {
        public /* synthetic */ void A(boolean z10, int i10) {
            o0.d(this, z10, i10);
        }

        public /* synthetic */ void C(int i10) {
            o0.f(this, i10);
        }

        public /* synthetic */ void K(TrackGroupArray trackGroupArray, m mVar) {
            o0.j(this, trackGroupArray, mVar);
        }

        public /* synthetic */ void N(i iVar) {
            o0.c(this, iVar);
        }

        @Deprecated
        public void a(x0 x0Var, @o0 Object obj) {
        }

        public /* synthetic */ void b(l0 l0Var) {
            o0.b(this, l0Var);
        }

        public /* synthetic */ void d(boolean z10) {
            o0.a(this, z10);
        }

        public /* synthetic */ void e(int i10) {
            o0.e(this, i10);
        }

        public /* synthetic */ void i() {
            o0.g(this);
        }

        public void k(x0 x0Var, @o0 Object obj, int i10) {
            a(x0Var, obj);
        }

        public /* synthetic */ void t(boolean z10) {
            o0.h(this, z10);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public interface d {
        void A(boolean z10, int i10);

        void C(int i10);

        void K(TrackGroupArray trackGroupArray, m mVar);

        void N(i iVar);

        void b(l0 l0Var);

        void d(boolean z10);

        void e(int i10);

        void i();

        void k(x0 x0Var, @o0 Object obj, int i10);

        void t(boolean z10);
    }

    public interface e {
        void L(u6.d dVar);

        void z(u6.d dVar);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public interface g {
        void K(h7.k kVar);

        void v0(h7.k kVar);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    public interface i {
        void B0(TextureView textureView);

        void D(TextureView textureView);

        void E0(SurfaceHolder surfaceHolder);

        void H(SurfaceView surfaceView);

        void N(x7.e eVar);

        void O();

        void S(SurfaceHolder surfaceHolder);

        void Z(x7.h hVar);

        void f0(x7.h hVar);

        void h0(x7.e eVar);

        void i0(int i10);

        void j(y7.a aVar);

        void l(@o0 Surface surface);

        void p0(SurfaceView surfaceView);

        void r(Surface surface);

        int w0();

        void y0(y7.a aVar);
    }

    long A();

    long A0();

    int B();

    boolean C();

    m C0();

    int D0(int i10);

    void E();

    int G();

    @o0
    g G0();

    boolean I();

    void J(d dVar);

    @o0
    Object M();

    void P(d dVar);

    int Q();

    @o0
    a R();

    void V(boolean z10);

    @o0
    i W();

    void X(int i10);

    boolean Y();

    void a();

    long a0();

    void c(@o0 l0 l0Var);

    int c0();

    l0 d();

    @o0
    Object d0();

    int e();

    long e0();

    long getCurrentPosition();

    long getDuration();

    boolean hasNext();

    boolean hasPrevious();

    void i(int i10);

    int k();

    boolean m();

    int m0();

    int n0();

    void next();

    long o();

    void p(int i10, long j10);

    void previous();

    boolean q();

    @o0
    e r0();

    void s(boolean z10);

    TrackGroupArray s0();

    void stop();

    void t(boolean z10);

    x0 t0();

    Looper u0();

    int v();

    int w();

    void x(long j10);

    @o0
    i y();

    boolean z0();
}
