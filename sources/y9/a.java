package y9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import d.m0;
import h.c;
import i0.d;
import i9.a;

@Deprecated
public class a extends c {

    /* renamed from: f0  reason: collision with root package name */
    public static final double f24608f0 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: g0  reason: collision with root package name */
    public static final float f24609g0 = 1.5f;

    /* renamed from: h0  reason: collision with root package name */
    public static final float f24610h0 = 0.25f;

    /* renamed from: i0  reason: collision with root package name */
    public static final float f24611i0 = 0.5f;

    /* renamed from: j0  reason: collision with root package name */
    public static final float f24612j0 = 1.0f;
    @m0
    public final Paint P;
    @m0
    public final Paint Q;
    @m0
    public final RectF R;
    public float S;
    public Path T;
    public float U;
    public float V;
    public float W;
    public float X;
    public boolean Y = true;
    public final int Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f24613a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f24614b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f24615c0 = true;

    /* renamed from: d0  reason: collision with root package name */
    public float f24616d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f24617e0 = false;

    public a(Context context, Drawable drawable, float f10, float f11, float f12) {
        super(drawable);
        this.Z = d.f(context, a.e.design_fab_shadow_start_color);
        this.f24613a0 = d.f(context, a.e.design_fab_shadow_mid_color);
        this.f24614b0 = d.f(context, a.e.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.P = paint;
        paint.setStyle(Paint.Style.FILL);
        this.S = (float) Math.round(f10);
        this.R = new RectF();
        Paint paint2 = new Paint(paint);
        this.Q = paint2;
        paint2.setAntiAlias(false);
        r(f11, f12);
    }

    public static float e(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f24608f0) * ((double) f11))) : f10;
    }

    public static float f(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        return z10 ? (float) (((double) f12) + ((1.0d - f24608f0) * ((double) f11))) : f12;
    }

    public static int s(float f10) {
        int round = Math.round(f10);
        return round % 2 == 1 ? round - 1 : round;
    }

    public final void c(@m0 Rect rect) {
        float f10 = this.V;
        float f11 = 1.5f * f10;
        this.R.set(((float) rect.left) + f10, ((float) rect.top) + f11, ((float) rect.right) - f10, ((float) rect.bottom) - f11);
        Drawable a10 = a();
        RectF rectF = this.R;
        a10.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        d();
    }

    public final void d() {
        float f10 = this.S;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.W;
        rectF2.inset(-f11, -f11);
        Path path = this.T;
        if (path == null) {
            this.T = new Path();
        } else {
            path.reset();
        }
        this.T.setFillType(Path.FillType.EVEN_ODD);
        this.T.moveTo(-this.S, 0.0f);
        this.T.rLineTo(-this.W, 0.0f);
        this.T.arcTo(rectF2, 180.0f, 90.0f, false);
        this.T.arcTo(rectF, 270.0f, -90.0f, false);
        this.T.close();
        float f12 = -rectF2.top;
        if (f12 > 0.0f) {
            float f13 = this.S / f12;
            Paint paint = this.P;
            RadialGradient radialGradient = r8;
            float[] fArr = {0.0f, f13, ((1.0f - f13) / 2.0f) + f13, 1.0f};
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f12, new int[]{0, this.Z, this.f24613a0, this.f24614b0}, fArr, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        Paint paint2 = this.Q;
        float f14 = rectF.top;
        float f15 = rectF2.top;
        paint2.setShader(new LinearGradient(0.0f, f14, 0.0f, f15, new int[]{this.Z, this.f24613a0, this.f24614b0}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.Q.setAntiAlias(false);
    }

    public void draw(@m0 Canvas canvas) {
        if (this.Y) {
            c(getBounds());
            this.Y = false;
        }
        g(canvas);
        super.draw(canvas);
    }

    public final void g(@m0 Canvas canvas) {
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f24616d0, this.R.centerX(), this.R.centerY());
        float f14 = this.S;
        float f15 = (-f14) - this.W;
        float f16 = f14 * 2.0f;
        boolean z10 = this.R.width() - f16 > 0.0f;
        boolean z11 = this.R.height() - f16 > 0.0f;
        float f17 = this.X;
        float f18 = f14 / ((f17 - (0.5f * f17)) + f14);
        float f19 = f14 / ((f17 - (0.25f * f17)) + f14);
        float f20 = f14 / ((f17 - (f17 * 1.0f)) + f14);
        int save2 = canvas.save();
        RectF rectF = this.R;
        canvas2.translate(rectF.left + f14, rectF.top + f14);
        canvas2.scale(f18, f19);
        canvas2.drawPath(this.T, this.P);
        if (z10) {
            canvas2.scale(1.0f / f18, 1.0f);
            i11 = save2;
            f10 = f20;
            i10 = save;
            f11 = f19;
            canvas.drawRect(0.0f, f15, this.R.width() - f16, -this.S, this.Q);
        } else {
            i11 = save2;
            f10 = f20;
            i10 = save;
            f11 = f19;
        }
        canvas2.restoreToCount(i11);
        int save3 = canvas.save();
        RectF rectF2 = this.R;
        canvas2.translate(rectF2.right - f14, rectF2.bottom - f14);
        float f21 = f10;
        canvas2.scale(f18, f21);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.T, this.P);
        if (z10) {
            canvas2.scale(1.0f / f18, 1.0f);
            f12 = f11;
            f13 = f21;
            canvas.drawRect(0.0f, f15, this.R.width() - f16, (-this.S) + this.W, this.Q);
        } else {
            f12 = f11;
            f13 = f21;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.R;
        canvas2.translate(rectF3.left + f14, rectF3.bottom - f14);
        canvas2.scale(f18, f13);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.T, this.P);
        if (z11) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f15, this.R.height() - f16, -this.S, this.Q);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.R;
        canvas2.translate(rectF4.right - f14, rectF4.top + f14);
        float f22 = f12;
        canvas2.scale(f18, f22);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.T, this.P);
        if (z11) {
            canvas2.scale(1.0f / f22, 1.0f);
            canvas.drawRect(0.0f, f15, this.R.height() - f16, -this.S, this.Q);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i10);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(@m0 Rect rect) {
        int ceil = (int) Math.ceil((double) f(this.V, this.S, this.f24615c0));
        int ceil2 = (int) Math.ceil((double) e(this.V, this.S, this.f24615c0));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float h() {
        return this.S;
    }

    public float i() {
        return this.V;
    }

    public float j() {
        float f10 = this.V;
        return (Math.max(f10, this.S + ((f10 * 1.5f) / 2.0f)) * 2.0f) + (this.V * 1.5f * 2.0f);
    }

    public float k() {
        float f10 = this.V;
        return (Math.max(f10, this.S + (f10 / 2.0f)) * 2.0f) + (this.V * 2.0f);
    }

    public float l() {
        return this.X;
    }

    public void m(boolean z10) {
        this.f24615c0 = z10;
        invalidateSelf();
    }

    public void n(float f10) {
        float round = (float) Math.round(f10);
        if (this.S != round) {
            this.S = round;
            this.Y = true;
            invalidateSelf();
        }
    }

    public void o(float f10) {
        r(this.X, f10);
    }

    public void onBoundsChange(Rect rect) {
        this.Y = true;
    }

    public final void p(float f10) {
        if (this.f24616d0 != f10) {
            this.f24616d0 = f10;
            invalidateSelf();
        }
    }

    public void q(float f10) {
        r(f10, this.V);
    }

    public void r(float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float s10 = (float) s(f10);
        float s11 = (float) s(f11);
        if (s10 > s11) {
            if (!this.f24617e0) {
                this.f24617e0 = true;
            }
            s10 = s11;
        }
        if (this.X != s10 || this.V != s11) {
            this.X = s10;
            this.V = s11;
            this.W = (float) Math.round(s10 * 1.5f);
            this.U = s11;
            this.Y = true;
            invalidateSelf();
        }
    }

    public void setAlpha(int i10) {
        super.setAlpha(i10);
        this.P.setAlpha(i10);
        this.Q.setAlpha(i10);
    }
}
