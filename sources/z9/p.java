package z9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d.f1;
import d.m0;
import d.o0;
import d.t0;
import d.x0;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public final q[] f24953a = new q[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f24954b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f24955c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f24956d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f24957e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f24958f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final q f24959g = new q();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f24960h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f24961i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f24962j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f24963k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f24964l = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final p f24965a = new p();
    }

    @x0({x0.a.LIBRARY_GROUP})
    public interface b {
        void a(q qVar, Matrix matrix, int i10);

        void b(q qVar, Matrix matrix, int i10);
    }

    public static final class c {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final o f24966a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final Path f24967b;
        @m0

        /* renamed from: c  reason: collision with root package name */
        public final RectF f24968c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public final b f24969d;

        /* renamed from: e  reason: collision with root package name */
        public final float f24970e;

        public c(@m0 o oVar, float f10, RectF rectF, @o0 b bVar, Path path) {
            this.f24969d = bVar;
            this.f24966a = oVar;
            this.f24970e = f10;
            this.f24968c = rectF;
            this.f24967b = path;
        }
    }

    public p() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f24953a[i10] = new q();
            this.f24954b[i10] = new Matrix();
            this.f24955c[i10] = new Matrix();
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @f1
    @m0
    public static p k() {
        return a.f24965a;
    }

    public final float a(int i10) {
        return (float) ((i10 + 1) * 90);
    }

    public final void b(@m0 c cVar, int i10) {
        this.f24960h[0] = this.f24953a[i10].l();
        this.f24960h[1] = this.f24953a[i10].m();
        this.f24954b[i10].mapPoints(this.f24960h);
        Path path = cVar.f24967b;
        float[] fArr = this.f24960h;
        if (i10 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f24953a[i10].d(this.f24954b[i10], cVar.f24967b);
        b bVar = cVar.f24969d;
        if (bVar != null) {
            bVar.a(this.f24953a[i10], this.f24954b[i10], i10);
        }
    }

    public final void c(@m0 c cVar, int i10) {
        Path path;
        Matrix matrix;
        q qVar;
        int i11 = (i10 + 1) % 4;
        this.f24960h[0] = this.f24953a[i10].j();
        this.f24960h[1] = this.f24953a[i10].k();
        this.f24954b[i10].mapPoints(this.f24960h);
        this.f24961i[0] = this.f24953a[i11].l();
        this.f24961i[1] = this.f24953a[i11].m();
        this.f24954b[i11].mapPoints(this.f24961i);
        float[] fArr = this.f24960h;
        float f10 = fArr[0];
        float[] fArr2 = this.f24961i;
        float max = Math.max(((float) Math.hypot((double) (f10 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i12 = i(cVar.f24968c, i10);
        this.f24959g.p(0.0f, 0.0f);
        g j10 = j(i10, cVar.f24966a);
        j10.d(max, i12, cVar.f24970e, this.f24959g);
        this.f24962j.reset();
        this.f24959g.d(this.f24955c[i10], this.f24962j);
        if (!this.f24964l || (!j10.a() && !l(this.f24962j, i10) && !l(this.f24962j, i11))) {
            qVar = this.f24959g;
            matrix = this.f24955c[i10];
            path = cVar.f24967b;
        } else {
            Path path2 = this.f24962j;
            path2.op(path2, this.f24958f, Path.Op.DIFFERENCE);
            this.f24960h[0] = this.f24959g.l();
            this.f24960h[1] = this.f24959g.m();
            this.f24955c[i10].mapPoints(this.f24960h);
            Path path3 = this.f24957e;
            float[] fArr3 = this.f24960h;
            path3.moveTo(fArr3[0], fArr3[1]);
            qVar = this.f24959g;
            matrix = this.f24955c[i10];
            path = this.f24957e;
        }
        qVar.d(matrix, path);
        b bVar = cVar.f24969d;
        if (bVar != null) {
            bVar.b(this.f24959g, this.f24955c[i10], i10);
        }
    }

    public void d(o oVar, float f10, RectF rectF, @m0 Path path) {
        e(oVar, f10, rectF, (b) null, path);
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void e(o oVar, float f10, RectF rectF, b bVar, @m0 Path path) {
        path.rewind();
        this.f24957e.rewind();
        this.f24958f.rewind();
        this.f24958f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(oVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            o(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f24957e.close();
        if (!this.f24957e.isEmpty()) {
            path.op(this.f24957e, Path.Op.UNION);
        }
    }

    public final void f(int i10, @m0 RectF rectF, @m0 PointF pointF) {
        float f10;
        float f11;
        float f12;
        if (i10 == 1) {
            f12 = rectF.right;
            f11 = rectF.bottom;
        } else if (i10 != 2) {
            f10 = i10 != 3 ? rectF.right : rectF.left;
            f11 = rectF.top;
        } else {
            f12 = rectF.left;
            f11 = rectF.bottom;
        }
        pointF.set(f10, f11);
    }

    public final d g(int i10, @m0 o oVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? oVar.t() : oVar.r() : oVar.j() : oVar.l();
    }

    public final e h(int i10, @m0 o oVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? oVar.s() : oVar.q() : oVar.i() : oVar.k();
    }

    public final float i(@m0 RectF rectF, int i10) {
        float centerX;
        float f10;
        float[] fArr = this.f24960h;
        q qVar = this.f24953a[i10];
        fArr[0] = qVar.f24975c;
        fArr[1] = qVar.f24976d;
        this.f24954b[i10].mapPoints(fArr);
        if (i10 == 1 || i10 == 3) {
            centerX = rectF.centerX();
            f10 = this.f24960h[0];
        } else {
            centerX = rectF.centerY();
            f10 = this.f24960h[1];
        }
        return Math.abs(centerX - f10);
    }

    public final g j(int i10, @m0 o oVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? oVar.o() : oVar.p() : oVar.n() : oVar.h();
    }

    @t0(19)
    public final boolean l(Path path, int i10) {
        this.f24963k.reset();
        this.f24953a[i10].d(this.f24954b[i10], this.f24963k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f24963k.computeBounds(rectF, true);
        path.op(this.f24963k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void m(@m0 c cVar, int i10) {
        h(i10, cVar.f24966a).c(this.f24953a[i10], 90.0f, cVar.f24970e, cVar.f24968c, g(i10, cVar.f24966a));
        float a10 = a(i10);
        this.f24954b[i10].reset();
        f(i10, cVar.f24968c, this.f24956d);
        Matrix matrix = this.f24954b[i10];
        PointF pointF = this.f24956d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f24954b[i10].preRotate(a10);
    }

    public void n(boolean z10) {
        this.f24964l = z10;
    }

    public final void o(int i10) {
        this.f24960h[0] = this.f24953a[i10].j();
        this.f24960h[1] = this.f24953a[i10].k();
        this.f24954b[i10].mapPoints(this.f24960h);
        float a10 = a(i10);
        this.f24955c[i10].reset();
        Matrix matrix = this.f24955c[i10];
        float[] fArr = this.f24960h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f24955c[i10].preRotate(a10);
    }
}
