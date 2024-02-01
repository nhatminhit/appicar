package v9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import d.l;
import d.m0;
import d.v;
import o9.a;

public final class c extends h<e> {

    /* renamed from: c  reason: collision with root package name */
    public int f23434c = 1;

    /* renamed from: d  reason: collision with root package name */
    public float f23435d;

    /* renamed from: e  reason: collision with root package name */
    public float f23436e;

    /* renamed from: f  reason: collision with root package name */
    public float f23437f;

    public c(@m0 e eVar) {
        super(eVar);
    }

    public void a(@m0 Canvas canvas, @v(from = 0.0d, to = 1.0d) float f10) {
        float f11;
        S s10 = this.f23480a;
        float f12 = (((float) ((e) s10).f23462g) / 2.0f) + ((float) ((e) s10).f23463h);
        canvas.translate(f12, f12);
        canvas.rotate(-90.0f);
        float f13 = -f12;
        canvas.clipRect(f13, f13, f12, f12);
        S s11 = this.f23480a;
        this.f23434c = ((e) s11).f23464i == 0 ? 1 : -1;
        this.f23435d = ((float) ((e) s11).f23428a) * f10;
        this.f23436e = ((float) ((e) s11).f23429b) * f10;
        this.f23437f = ((float) (((e) s11).f23462g - ((e) s11).f23428a)) / 2.0f;
        if ((this.f23481b.m() && ((e) this.f23480a).f23432e == 2) || (this.f23481b.l() && ((e) this.f23480a).f23433f == 1)) {
            f11 = this.f23437f + (((1.0f - f10) * ((float) ((e) this.f23480a).f23428a)) / 2.0f);
        } else if ((this.f23481b.m() && ((e) this.f23480a).f23432e == 1) || (this.f23481b.l() && ((e) this.f23480a).f23433f == 2)) {
            f11 = this.f23437f - (((1.0f - f10) * ((float) ((e) this.f23480a).f23428a)) / 2.0f);
        } else {
            return;
        }
        this.f23437f = f11;
    }

    public void b(@m0 Canvas canvas, @m0 Paint paint, @v(from = 0.0d, to = 1.0d) float f10, @v(from = 0.0d, to = 1.0d) float f11, @l int i10) {
        Paint paint2 = paint;
        if (f10 != f11) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i10);
            paint.setStrokeWidth(this.f23435d);
            int i11 = this.f23434c;
            float f12 = f10 * 360.0f * ((float) i11);
            float f13 = (f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10) * 360.0f * ((float) i11);
            float f14 = this.f23437f;
            canvas.drawArc(new RectF(-f14, -f14, f14, f14), f12, f13, false, paint);
            if (this.f23436e > 0.0f && Math.abs(f13) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f15 = this.f23436e;
                RectF rectF = new RectF(-f15, -f15, f15, f15);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                RectF rectF2 = rectF;
                h(canvas2, paint3, this.f23435d, this.f23436e, f12, true, rectF2);
                h(canvas2, paint3, this.f23435d, this.f23436e, f12 + f13, false, rectF2);
            }
        }
    }

    public void c(@m0 Canvas canvas, @m0 Paint paint) {
        int a10 = a.a(((e) this.f23480a).f23431d, this.f23481b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a10);
        paint.setStrokeWidth(this.f23435d);
        float f10 = this.f23437f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    public int d() {
        return i();
    }

    public int e() {
        return i();
    }

    public final void h(Canvas canvas, Paint paint, float f10, float f11, float f12, boolean z10, RectF rectF) {
        Canvas canvas2 = canvas;
        float f13 = z10 ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f12);
        float f14 = f10 / 2.0f;
        float f15 = f13 * f11;
        Paint paint2 = paint;
        canvas.drawRect((this.f23437f - f14) + f11, Math.min(0.0f, ((float) this.f23434c) * f15), (this.f23437f + f14) - f11, Math.max(0.0f, f15 * ((float) this.f23434c)), paint2);
        canvas.translate((this.f23437f - f14) + f11, 0.0f);
        RectF rectF2 = rectF;
        canvas.drawArc(rectF2, 180.0f, (-f13) * 90.0f * ((float) this.f23434c), true, paint2);
        canvas.translate(f10 - (f11 * 2.0f), 0.0f);
        canvas.drawArc(rectF2, 0.0f, f13 * 90.0f * ((float) this.f23434c), true, paint2);
        canvas.restore();
    }

    public final int i() {
        S s10 = this.f23480a;
        return ((e) s10).f23462g + (((e) s10).f23463h * 2);
    }
}
