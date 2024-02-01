package v9;

import android.graphics.Canvas;
import android.graphics.Paint;
import d.l;
import d.m0;
import d.v;
import v9.b;

public abstract class h<S extends b> {

    /* renamed from: a  reason: collision with root package name */
    public S f23480a;

    /* renamed from: b  reason: collision with root package name */
    public g f23481b;

    public h(S s10) {
        this.f23480a = s10;
    }

    public abstract void a(@m0 Canvas canvas, @v(from = 0.0d, to = 1.0d) float f10);

    public abstract void b(@m0 Canvas canvas, @m0 Paint paint, @v(from = 0.0d, to = 1.0d) float f10, @v(from = 0.0d, to = 1.0d) float f11, @l int i10);

    public abstract void c(@m0 Canvas canvas, @m0 Paint paint);

    public abstract int d();

    public abstract int e();

    public void f(@m0 g gVar) {
        this.f23481b = gVar;
    }

    public void g(@m0 Canvas canvas, @v(from = 0.0d, to = 1.0d) float f10) {
        this.f23480a.e();
        a(canvas, f10);
    }
}
