package v9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import d.m0;
import d.o0;
import j3.b;
import u1.d;
import u1.g;
import u1.h;
import v9.b;

public final class f<S extends b> extends g {

    /* renamed from: k0  reason: collision with root package name */
    public static final int f23465k0 = 10000;

    /* renamed from: l0  reason: collision with root package name */
    public static final float f23466l0 = 50.0f;

    /* renamed from: m0  reason: collision with root package name */
    public static final d<f> f23467m0 = new a("indicatorLevel");

    /* renamed from: f0  reason: collision with root package name */
    public h<S> f23468f0;

    /* renamed from: g0  reason: collision with root package name */
    public final h f23469g0;

    /* renamed from: h0  reason: collision with root package name */
    public final g f23470h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f23471i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f23472j0 = false;

    public static class a extends d<f> {
        public a(String str) {
            super(str);
        }

        /* renamed from: d */
        public float b(f fVar) {
            return fVar.B() * 10000.0f;
        }

        /* renamed from: e */
        public void c(f fVar, float f10) {
            fVar.D(f10 / 10000.0f);
        }
    }

    public f(@m0 Context context, @m0 b bVar, @m0 h<S> hVar) {
        super(context, bVar);
        C(hVar);
        h hVar2 = new h();
        this.f23469g0 = hVar2;
        hVar2.g(1.0f);
        hVar2.i(50.0f);
        g gVar = new g(this, f23467m0);
        this.f23470h0 = gVar;
        gVar.D(hVar2);
        o(1.0f);
    }

    @m0
    public static f<e> y(@m0 Context context, @m0 e eVar) {
        return new f<>(context, eVar, new c(eVar));
    }

    @m0
    public static f<n> z(@m0 Context context, @m0 n nVar) {
        return new f<>(context, nVar, new k(nVar));
    }

    @m0
    public h<S> A() {
        return this.f23468f0;
    }

    public final float B() {
        return this.f23471i0;
    }

    public void C(@m0 h<S> hVar) {
        this.f23468f0 = hVar;
        hVar.f(this);
    }

    public final void D(float f10) {
        this.f23471i0 = f10;
        invalidateSelf();
    }

    public void E(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    public /* bridge */ /* synthetic */ void b(@m0 b.a aVar) {
        super.b(aVar);
    }

    public /* bridge */ /* synthetic */ boolean c(@m0 b.a aVar) {
        return super.c(aVar);
    }

    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    public void draw(@m0 Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f23468f0.g(canvas, i());
            this.f23468f0.c(canvas, this.f23476a0);
            Canvas canvas2 = canvas;
            this.f23468f0.b(canvas2, this.f23476a0, 0.0f, B(), o9.a.a(this.P.f23430c[0], getAlpha()));
            canvas.restore();
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f23468f0.d();
    }

    public int getIntrinsicWidth() {
        return this.f23468f0.e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    public void jumpToCurrentState() {
        this.f23470h0.d();
        D(((float) getLevel()) / 10000.0f);
    }

    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    public boolean onLevelChange(int i10) {
        if (this.f23472j0) {
            this.f23470h0.d();
            D(((float) i10) / 10000.0f);
            return true;
        }
        this.f23470h0.t(B() * 10000.0f);
        this.f23470h0.z((float) i10);
        return true;
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(@o0 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public /* bridge */ /* synthetic */ boolean u(boolean z10, boolean z11, boolean z12) {
        return super.u(z10, z11, z12);
    }

    public boolean v(boolean z10, boolean z11, boolean z12) {
        boolean v10 = super.v(z10, z11, z12);
        float a10 = this.Q.a(this.O.getContentResolver());
        if (a10 == 0.0f) {
            this.f23472j0 = true;
        } else {
            this.f23472j0 = false;
            this.f23469g0.i(50.0f / a10);
        }
        return v10;
    }
}
