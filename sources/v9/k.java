package v9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import d.l;
import d.m0;
import d.v;
import o9.a;

public final class k extends h<n> {

    /* renamed from: c  reason: collision with root package name */
    public float f23487c = 300.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f23488d;

    /* renamed from: e  reason: collision with root package name */
    public float f23489e;

    public k(@m0 n nVar) {
        super(nVar);
    }

    public static void h(Canvas canvas, Paint paint, float f10, float f11, float f12, boolean z10, RectF rectF) {
        Canvas canvas2 = canvas;
        float f13 = f10;
        float f14 = f11;
        canvas.save();
        float f15 = f12;
        canvas.translate(f12, 0.0f);
        if (!z10) {
            canvas.rotate(180.0f);
        }
        float f16 = ((-f13) / 2.0f) + f14;
        float f17 = (f13 / 2.0f) - f14;
        Canvas canvas3 = canvas;
        Paint paint2 = paint;
        canvas3.drawRect(-f14, f16, 0.0f, f17, paint2);
        canvas.save();
        canvas.translate(0.0f, f16);
        RectF rectF2 = rectF;
        canvas3.drawArc(rectF2, 180.0f, 90.0f, true, paint2);
        canvas.restore();
        canvas.translate(0.0f, f17);
        canvas3.drawArc(rectF2, 180.0f, -90.0f, true, paint2);
        canvas.restore();
    }

    public void a(@m0 Canvas canvas, @v(from = 0.0d, to = 1.0d) float f10) {
        Rect clipBounds = canvas.getClipBounds();
        this.f23487c = (float) clipBounds.width();
        float f11 = (float) ((n) this.f23480a).f23428a;
        canvas.translate(((float) clipBounds.width()) / 2.0f, (((float) clipBounds.height()) / 2.0f) + Math.max(0.0f, ((float) (clipBounds.height() - ((n) this.f23480a).f23428a)) / 2.0f));
        if (((n) this.f23480a).f23515i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f23481b.m() && ((n) this.f23480a).f23432e == 1) || (this.f23481b.l() && ((n) this.f23480a).f23433f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f23481b.m() || this.f23481b.l()) {
            canvas.translate(0.0f, (((float) ((n) this.f23480a).f23428a) * (f10 - 1.0f)) / 2.0f);
        }
        float f12 = this.f23487c;
        canvas.clipRect((-f12) / 2.0f, (-f11) / 2.0f, f12 / 2.0f, f11 / 2.0f);
        S s10 = this.f23480a;
        this.f23488d = ((float) ((n) s10).f23428a) * f10;
        this.f23489e = ((float) ((n) s10).f23429b) * f10;
    }

    public void b(@m0 Canvas canvas, @m0 Paint paint, @v(from = 0.0d, to = 1.0d) float f10, @v(from = 0.0d, to = 1.0d) float f11, @l int i10) {
        Paint paint2 = paint;
        if (f10 != f11) {
            float f12 = this.f23487c;
            float f13 = this.f23489e;
            float f14 = ((-f12) / 2.0f) + f13 + ((f12 - (f13 * 2.0f)) * f10);
            float f15 = ((-f12) / 2.0f) + f13 + ((f12 - (f13 * 2.0f)) * f11);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i10);
            float f16 = this.f23488d;
            canvas.drawRect(f14, (-f16) / 2.0f, f15, f16 / 2.0f, paint);
            float f17 = this.f23489e;
            RectF rectF = new RectF(-f17, -f17, f17, f17);
            Canvas canvas2 = canvas;
            Paint paint3 = paint;
            float f18 = f14;
            RectF rectF2 = rectF;
            h(canvas2, paint3, this.f23488d, this.f23489e, f18, true, rectF2);
            h(canvas2, paint3, this.f23488d, this.f23489e, f15, false, rectF2);
        }
    }

    public void c(@m0 Canvas canvas, @m0 Paint paint) {
        int a10 = a.a(((n) this.f23480a).f23431d, this.f23481b.getAlpha());
        float f10 = ((-this.f23487c) / 2.0f) + this.f23489e;
        float f11 = -f10;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a10);
        float f12 = this.f23488d;
        canvas.drawRect(f10, (-f12) / 2.0f, f11, f12 / 2.0f, paint);
        float f13 = this.f23489e;
        RectF rectF = new RectF(-f13, -f13, f13, f13);
        h(canvas, paint, this.f23488d, this.f23489e, f10, true, rectF);
        h(canvas, paint, this.f23488d, this.f23489e, f11, false, rectF);
    }

    public int d() {
        return ((n) this.f23480a).f23428a;
    }

    public int e() {
        return -1;
    }
}
