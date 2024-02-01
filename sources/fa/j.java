package fa;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import d.t0;
import fa.l;
import z9.o;
import z9.p;

@t0(21)
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f18747a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f18748b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f18749c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final p f18750d = p.k();

    /* renamed from: e  reason: collision with root package name */
    public o f18751e;

    public void a(Canvas canvas) {
        canvas.clipPath(this.f18747a);
    }

    public void b(float f10, o oVar, o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        o o10 = v.o(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f10);
        this.f18751e = o10;
        this.f18750d.d(o10, 1.0f, rectF2, this.f18748b);
        this.f18750d.d(this.f18751e, 1.0f, rectF3, this.f18749c);
        this.f18747a.op(this.f18748b, this.f18749c, Path.Op.UNION);
    }

    public o c() {
        return this.f18751e;
    }

    public Path d() {
        return this.f18747a;
    }
}
