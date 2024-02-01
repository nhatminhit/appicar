package z9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import d.m0;
import d.t0;
import java.util.ArrayList;
import java.util.List;

public class q {

    /* renamed from: j  reason: collision with root package name */
    public static final float f24971j = 270.0f;

    /* renamed from: k  reason: collision with root package name */
    public static final float f24972k = 180.0f;
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f24973a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f24974b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f24975c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f24976d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f24977e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f24978f;

    /* renamed from: g  reason: collision with root package name */
    public final List<g> f24979g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<i> f24980h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f24981i;

    public class a extends i {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List f24982b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Matrix f24983c;

        public a(List list, Matrix matrix) {
            this.f24982b = list;
            this.f24983c = matrix;
        }

        public void a(Matrix matrix, y9.b bVar, int i10, Canvas canvas) {
            for (i a10 : this.f24982b) {
                a10.a(this.f24983c, bVar, i10, canvas);
            }
        }
    }

    public static class b extends i {

        /* renamed from: b  reason: collision with root package name */
        public final d f24985b;

        public b(d dVar) {
            this.f24985b = dVar;
        }

        public void a(Matrix matrix, @m0 y9.b bVar, int i10, @m0 Canvas canvas) {
            float h10 = this.f24985b.m();
            float i11 = this.f24985b.n();
            bVar.a(canvas, matrix, new RectF(this.f24985b.k(), this.f24985b.o(), this.f24985b.l(), this.f24985b.j()), i10, h10, i11);
        }
    }

    public static class c extends i {

        /* renamed from: b  reason: collision with root package name */
        public final f f24986b;

        /* renamed from: c  reason: collision with root package name */
        public final float f24987c;

        /* renamed from: d  reason: collision with root package name */
        public final float f24988d;

        public c(f fVar, float f10, float f11) {
            this.f24986b = fVar;
            this.f24987c = f10;
            this.f24988d = f11;
        }

        public void a(Matrix matrix, @m0 y9.b bVar, int i10, @m0 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f24986b.f25003c - this.f24988d), (double) (this.f24986b.f25002b - this.f24987c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f24987c, this.f24988d);
            matrix2.preRotate(c());
            bVar.b(canvas, matrix2, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f24986b.f25003c - this.f24988d) / (this.f24986b.f25002b - this.f24987c))));
        }
    }

    public static class d extends g {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f24989h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f24990b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f24991c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f24992d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f24993e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f24994f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f24995g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        public void a(@m0 Matrix matrix, @m0 Path path) {
            Matrix matrix2 = this.f25004a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f24989h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f24993e;
        }

        public final float k() {
            return this.f24990b;
        }

        public final float l() {
            return this.f24992d;
        }

        public final float m() {
            return this.f24994f;
        }

        public final float n() {
            return this.f24995g;
        }

        public final float o() {
            return this.f24991c;
        }

        public final void p(float f10) {
            this.f24993e = f10;
        }

        public final void q(float f10) {
            this.f24990b = f10;
        }

        public final void r(float f10) {
            this.f24992d = f10;
        }

        public final void s(float f10) {
            this.f24994f = f10;
        }

        public final void t(float f10) {
            this.f24995g = f10;
        }

        public final void u(float f10) {
            this.f24991c = f10;
        }
    }

    public static class e extends g {

        /* renamed from: b  reason: collision with root package name */
        public float f24996b;

        /* renamed from: c  reason: collision with root package name */
        public float f24997c;

        /* renamed from: d  reason: collision with root package name */
        public float f24998d;

        /* renamed from: e  reason: collision with root package name */
        public float f24999e;

        /* renamed from: f  reason: collision with root package name */
        public float f25000f;

        /* renamed from: g  reason: collision with root package name */
        public float f25001g;

        public e(float f10, float f11, float f12, float f13, float f14, float f15) {
            h(f10);
            j(f11);
            i(f12);
            k(f13);
            l(f14);
            m(f15);
        }

        public void a(@m0 Matrix matrix, @m0 Path path) {
            Matrix matrix2 = this.f25004a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f24996b, this.f24997c, this.f24998d, this.f24999e, this.f25000f, this.f25001g);
            path.transform(matrix);
        }

        public final float b() {
            return this.f24996b;
        }

        public final float c() {
            return this.f24998d;
        }

        public final float d() {
            return this.f24997c;
        }

        public final float e() {
            return this.f24997c;
        }

        public final float f() {
            return this.f25000f;
        }

        public final float g() {
            return this.f25001g;
        }

        public final void h(float f10) {
            this.f24996b = f10;
        }

        public final void i(float f10) {
            this.f24998d = f10;
        }

        public final void j(float f10) {
            this.f24997c = f10;
        }

        public final void k(float f10) {
            this.f24999e = f10;
        }

        public final void l(float f10) {
            this.f25000f = f10;
        }

        public final void m(float f10) {
            this.f25001g = f10;
        }
    }

    public static class f extends g {

        /* renamed from: b  reason: collision with root package name */
        public float f25002b;

        /* renamed from: c  reason: collision with root package name */
        public float f25003c;

        public void a(@m0 Matrix matrix, @m0 Path path) {
            Matrix matrix2 = this.f25004a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f25002b, this.f25003c);
            path.transform(matrix);
        }
    }

    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f25004a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static class h extends g {
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f25005b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f25006c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f25007d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f25008e;

        public void a(@m0 Matrix matrix, @m0 Path path) {
            Matrix matrix2 = this.f25004a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(f(), g(), h(), i());
            path.transform(matrix);
        }

        public final float f() {
            return this.f25005b;
        }

        public final float g() {
            return this.f25006c;
        }

        public final float h() {
            return this.f25007d;
        }

        public final float i() {
            return this.f25008e;
        }

        public final void j(float f10) {
            this.f25005b = f10;
        }

        public final void k(float f10) {
            this.f25006c = f10;
        }

        public final void l(float f10) {
            this.f25007d = f10;
        }

        public final void m(float f10) {
            this.f25008e = f10;
        }
    }

    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f25009a = new Matrix();

        public abstract void a(Matrix matrix, y9.b bVar, int i10, Canvas canvas);

        public final void b(y9.b bVar, int i10, Canvas canvas) {
            a(f25009a, bVar, i10, canvas);
        }
    }

    public q() {
        p(0.0f, 0.0f);
    }

    public q(float f10, float f11) {
        p(f10, f11);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f24979g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = (double) f16;
        t(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        u(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public final void b(float f10) {
        if (h() != f10) {
            float h10 = ((f10 - h()) + 360.0f) % 360.0f;
            if (h10 <= 180.0f) {
                d dVar = new d(j(), k(), j(), k());
                dVar.s(h());
                dVar.t(h10);
                this.f24980h.add(new b(dVar));
                r(f10);
            }
        }
    }

    public final void c(i iVar, float f10, float f11) {
        b(f10);
        this.f24980h.add(iVar);
        r(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f24979g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f24979g.get(i10).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f24981i;
    }

    @m0
    public i f(Matrix matrix) {
        b(i());
        return new a(new ArrayList(this.f24980h), new Matrix(matrix));
    }

    @t0(21)
    public void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f24979g.add(new e(f10, f11, f12, f13, f14, f15));
        this.f24981i = true;
        t(f14);
        u(f15);
    }

    public final float h() {
        return this.f24977e;
    }

    public final float i() {
        return this.f24978f;
    }

    public float j() {
        return this.f24975c;
    }

    public float k() {
        return this.f24976d;
    }

    public float l() {
        return this.f24973a;
    }

    public float m() {
        return this.f24974b;
    }

    public void n(float f10, float f11) {
        f fVar = new f();
        float unused = fVar.f25002b = f10;
        float unused2 = fVar.f25003c = f11;
        this.f24979g.add(fVar);
        c cVar = new c(fVar, j(), k());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        t(f10);
        u(f11);
    }

    @t0(21)
    public void o(float f10, float f11, float f12, float f13) {
        h hVar = new h();
        hVar.j(f10);
        hVar.k(f11);
        hVar.l(f12);
        hVar.m(f13);
        this.f24979g.add(hVar);
        this.f24981i = true;
        t(f12);
        u(f13);
    }

    public void p(float f10, float f11) {
        q(f10, f11, 270.0f, 0.0f);
    }

    public void q(float f10, float f11, float f12, float f13) {
        v(f10);
        w(f11);
        t(f10);
        u(f11);
        r(f12);
        s((f12 + f13) % 360.0f);
        this.f24979g.clear();
        this.f24980h.clear();
        this.f24981i = false;
    }

    public final void r(float f10) {
        this.f24977e = f10;
    }

    public final void s(float f10) {
        this.f24978f = f10;
    }

    public final void t(float f10) {
        this.f24975c = f10;
    }

    public final void u(float f10) {
        this.f24976d = f10;
    }

    public final void v(float f10) {
        this.f24973a = f10;
    }

    public final void w(float f10) {
        this.f24974b = f10;
    }
}
