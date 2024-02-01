package v9;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import d.m0;
import d.o0;
import j3.b;
import v9.b;

public final class j<S extends b> extends g {

    /* renamed from: f0  reason: collision with root package name */
    public h<S> f23485f0;

    /* renamed from: g0  reason: collision with root package name */
    public i<ObjectAnimator> f23486g0;

    public j(@m0 Context context, @m0 b bVar, @m0 h<S> hVar, @m0 i<ObjectAnimator> iVar) {
        super(context, bVar);
        B(hVar);
        A(iVar);
    }

    @m0
    public static j<e> w(@m0 Context context, @m0 e eVar) {
        return new j<>(context, eVar, new c(eVar), new d(eVar));
    }

    @m0
    public static j<n> x(@m0 Context context, @m0 n nVar) {
        return new j<>(context, nVar, new k(nVar), nVar.f23513g == 0 ? new l(nVar) : new m(context, nVar));
    }

    public void A(@m0 i<ObjectAnimator> iVar) {
        this.f23486g0 = iVar;
        iVar.e(this);
    }

    public void B(@m0 h<S> hVar) {
        this.f23485f0 = hVar;
        hVar.f(this);
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
            this.f23485f0.g(canvas, i());
            this.f23485f0.c(canvas, this.f23476a0);
            int i10 = 0;
            while (true) {
                i<ObjectAnimator> iVar = this.f23486g0;
                int[] iArr = iVar.f23484c;
                if (i10 < iArr.length) {
                    h<S> hVar = this.f23485f0;
                    Paint paint = this.f23476a0;
                    float[] fArr = iVar.f23483b;
                    int i11 = i10 * 2;
                    hVar.b(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
                    i10++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public int getIntrinsicHeight() {
        return this.f23485f0.d();
    }

    public int getIntrinsicWidth() {
        return this.f23485f0.e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
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
        if (!isRunning()) {
            this.f23486g0.a();
        }
        this.Q.a(this.O.getContentResolver());
        if (z10 && z12) {
            this.f23486g0.g();
        }
        return v10;
    }

    @m0
    public i<ObjectAnimator> y() {
        return this.f23486g0;
    }

    @m0
    public h<S> z() {
        return this.f23485f0;
    }
}
