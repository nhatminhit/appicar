package ea;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import ea.l;
import z9.o;
import z9.p;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f18442a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f18443b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f18444c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final p f18445d = p.k();

    /* renamed from: e  reason: collision with root package name */
    public o f18446e;

    public void a(Canvas canvas) {
        canvas.clipPath(this.f18442a);
    }

    public void b(float f10, o oVar, o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        o o10 = u.o(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f10);
        this.f18446e = o10;
        this.f18445d.d(o10, 1.0f, rectF2, this.f18443b);
        this.f18445d.d(this.f18446e, 1.0f, rectF3, this.f18444c);
        this.f18442a.op(this.f18443b, this.f18444c, Path.Op.UNION);
    }

    public o c() {
        return this.f18446e;
    }

    public Path d() {
        return this.f18442a;
    }
}
