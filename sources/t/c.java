package t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import d.o0;
import t.g;

public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f12728a = new RectF();

    public class a implements g.a {
        public a() {
        }

        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f11 = 2.0f * f10;
            float width = (rectF.width() - f11) - 1.0f;
            float height = (rectF.height() - f11) - 1.0f;
            if (f10 >= 1.0f) {
                float f12 = f10 + 0.5f;
                float f13 = -f12;
                c.this.f12728a.set(f13, f13, f12, f12);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f12, rectF2.top + f12);
                Paint paint2 = paint;
                canvas.drawArc(c.this.f12728a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.f12728a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.f12728a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(c.this.f12728a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f14 = rectF2.top;
                canvas.drawRect((rectF2.left + f12) - 1.0f, f14, (rectF2.right - f12) + 1.0f, f14 + f12, paint2);
                float f15 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f12) - 1.0f, f15 - f12, (rectF2.right - f12) + 1.0f, f15, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f10, rectF2.right, rectF2.bottom - f10, paint);
        }
    }

    public void a(d dVar, float f10) {
        q(dVar).q(f10);
        n(dVar);
    }

    public float b(d dVar) {
        return q(dVar).j();
    }

    public void c(d dVar, @o0 ColorStateList colorStateList) {
        q(dVar).o(colorStateList);
    }

    public float d(d dVar) {
        return q(dVar).l();
    }

    public void e(d dVar) {
        q(dVar).m(dVar.d());
        n(dVar);
    }

    public void f(d dVar, float f10) {
        q(dVar).p(f10);
        n(dVar);
    }

    public float g(d dVar) {
        return q(dVar).i();
    }

    public void h(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        g p10 = p(context, colorStateList, f10, f11, f12);
        p10.m(dVar.d());
        dVar.c(p10);
        n(dVar);
    }

    public float i(d dVar) {
        return q(dVar).k();
    }

    public float j(d dVar) {
        return q(dVar).g();
    }

    public void k() {
        g.f12743s = new a();
    }

    public void l(d dVar, float f10) {
        q(dVar).r(f10);
    }

    public ColorStateList m(d dVar) {
        return q(dVar).f();
    }

    public void n(d dVar) {
        Rect rect = new Rect();
        q(dVar).h(rect);
        dVar.b((int) Math.ceil((double) i(dVar)), (int) Math.ceil((double) b(dVar)));
        dVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void o(d dVar) {
    }

    public final g p(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new g(context.getResources(), colorStateList, f10, f11, f12);
    }

    public final g q(d dVar) {
        return (g) dVar.f();
    }
}
