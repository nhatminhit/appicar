package t;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import d.o0;
import s.a;

public class g extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    public static final double f12741q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: collision with root package name */
    public static final float f12742r = 1.5f;

    /* renamed from: s  reason: collision with root package name */
    public static a f12743s;

    /* renamed from: a  reason: collision with root package name */
    public final int f12744a;

    /* renamed from: b  reason: collision with root package name */
    public Paint f12745b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f12746c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f12747d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f12748e;

    /* renamed from: f  reason: collision with root package name */
    public float f12749f;

    /* renamed from: g  reason: collision with root package name */
    public Path f12750g;

    /* renamed from: h  reason: collision with root package name */
    public float f12751h;

    /* renamed from: i  reason: collision with root package name */
    public float f12752i;

    /* renamed from: j  reason: collision with root package name */
    public float f12753j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f12754k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12755l = true;

    /* renamed from: m  reason: collision with root package name */
    public final int f12756m;

    /* renamed from: n  reason: collision with root package name */
    public final int f12757n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12758o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12759p = false;

    public interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    public g(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f12756m = resources.getColor(a.b.cardview_shadow_start_color);
        this.f12757n = resources.getColor(a.b.cardview_shadow_end_color);
        this.f12744a = resources.getDimensionPixelSize(a.c.cardview_compat_inset_shadow);
        this.f12745b = new Paint(5);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f12746c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f12749f = (float) ((int) (f10 + 0.5f));
        this.f12748e = new RectF();
        Paint paint2 = new Paint(this.f12746c);
        this.f12747d = paint2;
        paint2.setAntiAlias(false);
        s(f11, f12);
    }

    public static float c(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f12741q) * ((double) f11))) : f10;
    }

    public static float d(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        return z10 ? (float) (((double) f12) + ((1.0d - f12741q) * ((double) f11))) : f12;
    }

    public final void a(Rect rect) {
        float f10 = this.f12751h;
        float f11 = 1.5f * f10;
        this.f12748e.set(((float) rect.left) + f10, ((float) rect.top) + f11, ((float) rect.right) - f10, ((float) rect.bottom) - f11);
        b();
    }

    public final void b() {
        float f10 = this.f12749f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f12752i;
        rectF2.inset(-f11, -f11);
        Path path = this.f12750g;
        if (path == null) {
            this.f12750g = new Path();
        } else {
            path.reset();
        }
        this.f12750g.setFillType(Path.FillType.EVEN_ODD);
        this.f12750g.moveTo(-this.f12749f, 0.0f);
        this.f12750g.rLineTo(-this.f12752i, 0.0f);
        this.f12750g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f12750g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f12750g.close();
        float f12 = this.f12749f;
        float f13 = f12 / (this.f12752i + f12);
        Paint paint = this.f12746c;
        float f14 = this.f12749f + this.f12752i;
        int i10 = this.f12756m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f12757n}, new float[]{0.0f, f13, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f12747d;
        float f15 = this.f12749f;
        float f16 = this.f12752i;
        int i11 = this.f12756m;
        paint2.setShader(new LinearGradient(0.0f, (-f15) + f16, 0.0f, (-f15) - f16, new int[]{i11, i11, this.f12757n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f12747d.setAntiAlias(false);
    }

    public void draw(Canvas canvas) {
        if (this.f12755l) {
            a(getBounds());
            this.f12755l = false;
        }
        canvas.translate(0.0f, this.f12753j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f12753j) / 2.0f);
        f12743s.a(canvas, this.f12748e, this.f12749f, this.f12745b);
    }

    public final void e(Canvas canvas) {
        float f10 = this.f12749f;
        float f11 = (-f10) - this.f12752i;
        float f12 = f10 + ((float) this.f12744a) + (this.f12753j / 2.0f);
        float f13 = f12 * 2.0f;
        boolean z10 = this.f12748e.width() - f13 > 0.0f;
        boolean z11 = this.f12748e.height() - f13 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f12748e;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f12750g, this.f12746c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f12748e.width() - f13, -this.f12749f, this.f12747d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f12748e;
        canvas.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f12750g, this.f12746c);
        if (z10) {
            canvas.drawRect(0.0f, f11, this.f12748e.width() - f13, (-this.f12749f) + this.f12752i, this.f12747d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f12748e;
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f12750g, this.f12746c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f12748e.height() - f13, -this.f12749f, this.f12747d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f12748e;
        canvas.translate(rectF4.right - f12, rectF4.top + f12);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f12750g, this.f12746c);
        if (z11) {
            canvas.drawRect(0.0f, f11, this.f12748e.height() - f13, -this.f12749f, this.f12747d);
        }
        canvas.restoreToCount(save4);
    }

    public ColorStateList f() {
        return this.f12754k;
    }

    public float g() {
        return this.f12749f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) d(this.f12751h, this.f12749f, this.f12758o));
        int ceil2 = (int) Math.ceil((double) c(this.f12751h, this.f12749f, this.f12758o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.f12751h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f12754k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f10 = this.f12751h;
        return (Math.max(f10, this.f12749f + ((float) this.f12744a) + ((f10 * 1.5f) / 2.0f)) * 2.0f) + (((this.f12751h * 1.5f) + ((float) this.f12744a)) * 2.0f);
    }

    public float k() {
        float f10 = this.f12751h;
        return (Math.max(f10, this.f12749f + ((float) this.f12744a) + (f10 / 2.0f)) * 2.0f) + ((this.f12751h + ((float) this.f12744a)) * 2.0f);
    }

    public float l() {
        return this.f12753j;
    }

    public void m(boolean z10) {
        this.f12758o = z10;
        invalidateSelf();
    }

    public final void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f12754k = colorStateList;
        this.f12745b.setColor(colorStateList.getColorForState(getState(), this.f12754k.getDefaultColor()));
    }

    public void o(@o0 ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12755l = true;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f12754k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f12745b.getColor() == colorForState) {
            return false;
        }
        this.f12745b.setColor(colorForState);
        this.f12755l = true;
        invalidateSelf();
        return true;
    }

    public void p(float f10) {
        if (f10 >= 0.0f) {
            float f11 = (float) ((int) (f10 + 0.5f));
            if (this.f12749f != f11) {
                this.f12749f = f11;
                this.f12755l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
    }

    public void q(float f10) {
        s(this.f12753j, f10);
    }

    public void r(float f10) {
        s(f10, this.f12751h);
    }

    public final void s(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        } else if (f11 >= 0.0f) {
            float t10 = (float) t(f10);
            float t11 = (float) t(f11);
            if (t10 > t11) {
                if (!this.f12759p) {
                    this.f12759p = true;
                }
                t10 = t11;
            }
            if (this.f12753j != t10 || this.f12751h != t11) {
                this.f12753j = t10;
                this.f12751h = t11;
                this.f12752i = (float) ((int) ((t10 * 1.5f) + ((float) this.f12744a) + 0.5f));
                this.f12755l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
    }

    public void setAlpha(int i10) {
        this.f12745b.setAlpha(i10);
        this.f12746c.setAlpha(i10);
        this.f12747d.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12745b.setColorFilter(colorFilter);
    }

    public final int t(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }
}
