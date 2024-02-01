package e3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import d.m0;
import d.x0;
import e1.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class b extends Drawable implements Animatable {
    public static final Interpolator U = new LinearInterpolator();
    public static final Interpolator V = new z1.b();
    public static final int W = 0;
    public static final float X = 11.0f;
    public static final float Y = 3.0f;
    public static final int Z = 12;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f6769a0 = 6;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f6770b0 = 1;

    /* renamed from: c0  reason: collision with root package name */
    public static final float f6771c0 = 7.5f;

    /* renamed from: d0  reason: collision with root package name */
    public static final float f6772d0 = 2.5f;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f6773e0 = 10;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f6774f0 = 5;

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f6775g0 = {-16777216};

    /* renamed from: h0  reason: collision with root package name */
    public static final float f6776h0 = 0.75f;

    /* renamed from: i0  reason: collision with root package name */
    public static final float f6777i0 = 0.5f;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f6778j0 = 1332;

    /* renamed from: k0  reason: collision with root package name */
    public static final float f6779k0 = 216.0f;

    /* renamed from: l0  reason: collision with root package name */
    public static final float f6780l0 = 0.8f;

    /* renamed from: m0  reason: collision with root package name */
    public static final float f6781m0 = 0.01f;

    /* renamed from: n0  reason: collision with root package name */
    public static final float f6782n0 = 0.20999998f;
    public final d O;
    public float P;
    public Resources Q;
    public Animator R;
    public float S;
    public boolean T;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f6783a;

        public a(d dVar) {
            this.f6783a = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.G(floatValue, this.f6783a);
            b.this.d(floatValue, this.f6783a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: e3.b$b  reason: collision with other inner class name */
    public class C0112b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f6785a;

        public C0112b(d dVar) {
            this.f6785a = dVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            b.this.d(1.0f, this.f6785a, true);
            this.f6785a.M();
            this.f6785a.v();
            b bVar = b.this;
            if (bVar.T) {
                bVar.T = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f6785a.I(false);
                return;
            }
            bVar.S += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            b.this.S = 0.0f;
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f6787a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public final Paint f6788b;

        /* renamed from: c  reason: collision with root package name */
        public final Paint f6789c;

        /* renamed from: d  reason: collision with root package name */
        public final Paint f6790d;

        /* renamed from: e  reason: collision with root package name */
        public float f6791e;

        /* renamed from: f  reason: collision with root package name */
        public float f6792f;

        /* renamed from: g  reason: collision with root package name */
        public float f6793g;

        /* renamed from: h  reason: collision with root package name */
        public float f6794h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f6795i;

        /* renamed from: j  reason: collision with root package name */
        public int f6796j;

        /* renamed from: k  reason: collision with root package name */
        public float f6797k;

        /* renamed from: l  reason: collision with root package name */
        public float f6798l;

        /* renamed from: m  reason: collision with root package name */
        public float f6799m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f6800n;

        /* renamed from: o  reason: collision with root package name */
        public Path f6801o;

        /* renamed from: p  reason: collision with root package name */
        public float f6802p;

        /* renamed from: q  reason: collision with root package name */
        public float f6803q;

        /* renamed from: r  reason: collision with root package name */
        public int f6804r;

        /* renamed from: s  reason: collision with root package name */
        public int f6805s;

        /* renamed from: t  reason: collision with root package name */
        public int f6806t;

        /* renamed from: u  reason: collision with root package name */
        public int f6807u;

        public d() {
            Paint paint = new Paint();
            this.f6788b = paint;
            Paint paint2 = new Paint();
            this.f6789c = paint2;
            Paint paint3 = new Paint();
            this.f6790d = paint3;
            this.f6791e = 0.0f;
            this.f6792f = 0.0f;
            this.f6793g = 0.0f;
            this.f6794h = 5.0f;
            this.f6802p = 1.0f;
            this.f6806t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A(int i10) {
            this.f6790d.setColor(i10);
        }

        public void B(float f10) {
            this.f6803q = f10;
        }

        public void C(int i10) {
            this.f6807u = i10;
        }

        public void D(ColorFilter colorFilter) {
            this.f6788b.setColorFilter(colorFilter);
        }

        public void E(int i10) {
            this.f6796j = i10;
            this.f6807u = this.f6795i[i10];
        }

        public void F(@m0 int[] iArr) {
            this.f6795i = iArr;
            E(0);
        }

        public void G(float f10) {
            this.f6792f = f10;
        }

        public void H(float f10) {
            this.f6793g = f10;
        }

        public void I(boolean z10) {
            if (this.f6800n != z10) {
                this.f6800n = z10;
            }
        }

        public void J(float f10) {
            this.f6791e = f10;
        }

        public void K(Paint.Cap cap) {
            this.f6788b.setStrokeCap(cap);
        }

        public void L(float f10) {
            this.f6794h = f10;
            this.f6788b.setStrokeWidth(f10);
        }

        public void M() {
            this.f6797k = this.f6791e;
            this.f6798l = this.f6792f;
            this.f6799m = this.f6793g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f6787a;
            float f10 = this.f6803q;
            float f11 = (this.f6794h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f6804r) * this.f6802p) / 2.0f, this.f6794h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f11, ((float) rect.centerY()) - f11, ((float) rect.centerX()) + f11, ((float) rect.centerY()) + f11);
            float f12 = this.f6791e;
            float f13 = this.f6793g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f6792f + f13) * 360.0f) - f14;
            this.f6788b.setColor(this.f6807u);
            this.f6788b.setAlpha(this.f6806t);
            float f16 = this.f6794h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f6790d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f6788b);
            b(canvas, f14, f15, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f6800n) {
                Path path = this.f6801o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f6801o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f6801o.moveTo(0.0f, 0.0f);
                this.f6801o.lineTo(((float) this.f6804r) * this.f6802p, 0.0f);
                Path path3 = this.f6801o;
                float f12 = this.f6802p;
                path3.lineTo((((float) this.f6804r) * f12) / 2.0f, ((float) this.f6805s) * f12);
                this.f6801o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f6804r) * this.f6802p) / 2.0f), rectF.centerY() + (this.f6794h / 2.0f));
                this.f6801o.close();
                this.f6789c.setColor(this.f6807u);
                this.f6789c.setAlpha(this.f6806t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f6801o, this.f6789c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f6806t;
        }

        public float d() {
            return (float) this.f6805s;
        }

        public float e() {
            return this.f6802p;
        }

        public float f() {
            return (float) this.f6804r;
        }

        public int g() {
            return this.f6790d.getColor();
        }

        public float h() {
            return this.f6803q;
        }

        public int[] i() {
            return this.f6795i;
        }

        public float j() {
            return this.f6792f;
        }

        public int k() {
            return this.f6795i[l()];
        }

        public int l() {
            return (this.f6796j + 1) % this.f6795i.length;
        }

        public float m() {
            return this.f6793g;
        }

        public boolean n() {
            return this.f6800n;
        }

        public float o() {
            return this.f6791e;
        }

        public int p() {
            return this.f6795i[this.f6796j];
        }

        public float q() {
            return this.f6798l;
        }

        public float r() {
            return this.f6799m;
        }

        public float s() {
            return this.f6797k;
        }

        public Paint.Cap t() {
            return this.f6788b.getStrokeCap();
        }

        public float u() {
            return this.f6794h;
        }

        public void v() {
            E(l());
        }

        public void w() {
            this.f6797k = 0.0f;
            this.f6798l = 0.0f;
            this.f6799m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        public void x(int i10) {
            this.f6806t = i10;
        }

        public void y(float f10, float f11) {
            this.f6804r = (int) f10;
            this.f6805s = (int) f11;
        }

        public void z(float f10) {
            if (f10 != this.f6802p) {
                this.f6802p = f10;
            }
        }
    }

    public b(@m0 Context context) {
        this.Q = ((Context) n.g(context)).getResources();
        d dVar = new d();
        this.O = dVar;
        dVar.F(f6775g0);
        D(2.5f);
        F();
    }

    public final void A(float f10, float f11, float f12, float f13) {
        d dVar = this.O;
        float f14 = this.Q.getDisplayMetrics().density;
        dVar.L(f11 * f14);
        dVar.B(f10 * f14);
        dVar.E(0);
        dVar.y(f12 * f14, f13 * f14);
    }

    public void B(float f10, float f11) {
        this.O.J(f10);
        this.O.G(f11);
        invalidateSelf();
    }

    public void C(@m0 Paint.Cap cap) {
        this.O.K(cap);
        invalidateSelf();
    }

    public void D(float f10) {
        this.O.L(f10);
        invalidateSelf();
    }

    public void E(int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (i10 == 0) {
            f10 = 11.0f;
            f13 = 3.0f;
            f12 = 12.0f;
            f11 = 6.0f;
        } else {
            f10 = 7.5f;
            f13 = 2.5f;
            f12 = 10.0f;
            f11 = 5.0f;
        }
        A(f10, f13, f12, f11);
        invalidateSelf();
    }

    public final void F() {
        d dVar = this.O;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new a(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(U);
        ofFloat.addListener(new C0112b(dVar));
        this.R = ofFloat;
    }

    public void G(float f10, d dVar) {
        dVar.C(f10 > 0.75f ? e((f10 - 0.75f) / 0.25f, dVar.p(), dVar.k()) : dVar.p());
    }

    public final void a(float f10, d dVar) {
        G(f10, dVar);
        dVar.J(dVar.s() + (((dVar.q() - 0.01f) - dVar.s()) * f10));
        dVar.G(dVar.q());
        dVar.H(dVar.r() + ((((float) (Math.floor((double) (dVar.r() / 0.8f)) + 1.0d)) - dVar.r()) * f10));
    }

    public void d(float f10, d dVar, boolean z10) {
        float f11;
        float f12;
        if (this.T) {
            a(f10, dVar);
        } else if (f10 != 1.0f || z10) {
            float r10 = dVar.r();
            if (f10 < 0.5f) {
                f11 = dVar.s();
                f12 = (V.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + f11;
            } else {
                float s10 = dVar.s() + 0.79f;
                float f13 = s10;
                f11 = s10 - (((1.0f - V.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = f13;
            }
            dVar.J(f11);
            dVar.G(f12);
            dVar.H(r10 + (0.20999998f * f10));
            z((f10 + this.S) * 216.0f);
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.P, bounds.exactCenterX(), bounds.exactCenterY());
        this.O.a(canvas, bounds);
        canvas.restore();
    }

    public final int e(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) (((float) (((i11 >> 24) & 255) - i12)) * f10))) << 24) | ((i13 + ((int) (((float) (((i11 >> 16) & 255) - i13)) * f10))) << 16) | ((i14 + ((int) (((float) (((i11 >> 8) & 255) - i14)) * f10))) << 8) | (i15 + ((int) (f10 * ((float) ((i11 & 255) - i15)))));
    }

    public boolean f() {
        return this.O.n();
    }

    public float g() {
        return this.O.d();
    }

    public int getAlpha() {
        return this.O.c();
    }

    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.O.e();
    }

    public float i() {
        return this.O.f();
    }

    public boolean isRunning() {
        return this.R.isRunning();
    }

    public int j() {
        return this.O.g();
    }

    public float k() {
        return this.O.h();
    }

    @m0
    public int[] l() {
        return this.O.i();
    }

    public float m() {
        return this.O.j();
    }

    public float n() {
        return this.O.m();
    }

    public final float o() {
        return this.P;
    }

    public float p() {
        return this.O.o();
    }

    @m0
    public Paint.Cap q() {
        return this.O.t();
    }

    public float r() {
        return this.O.u();
    }

    public void s(float f10, float f11) {
        this.O.y(f10, f11);
        invalidateSelf();
    }

    public void setAlpha(int i10) {
        this.O.x(i10);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.O.D(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j10;
        Animator animator;
        this.R.cancel();
        this.O.M();
        if (this.O.j() != this.O.o()) {
            this.T = true;
            animator = this.R;
            j10 = 666;
        } else {
            this.O.E(0);
            this.O.w();
            animator = this.R;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.R.start();
    }

    public void stop() {
        this.R.cancel();
        z(0.0f);
        this.O.I(false);
        this.O.E(0);
        this.O.w();
        invalidateSelf();
    }

    public void t(boolean z10) {
        this.O.I(z10);
        invalidateSelf();
    }

    public void u(float f10) {
        this.O.z(f10);
        invalidateSelf();
    }

    public void v(int i10) {
        this.O.A(i10);
        invalidateSelf();
    }

    public void w(float f10) {
        this.O.B(f10);
        invalidateSelf();
    }

    public void x(@m0 int... iArr) {
        this.O.F(iArr);
        this.O.E(0);
        invalidateSelf();
    }

    public void y(float f10) {
        this.O.H(f10);
        invalidateSelf();
    }

    public final void z(float f10) {
        this.P = f10;
    }
}
