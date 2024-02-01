package fa;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.internal.v;
import d.b0;
import d.b1;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import e1.n;
import f1.w1;
import fa.v;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import z9.j;
import z9.o;
import z9.s;

@t0(21)
public final class l extends Transition {
    public static final f A0 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), (a) null);
    public static final f B0 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), (a) null);
    public static final f C0 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), (a) null);
    public static final float D0 = -1.0f;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f18752l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f18753m0 = 1;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f18754n0 = 2;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f18755o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f18756p0 = 1;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f18757q0 = 2;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f18758r0 = 3;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f18759s0 = 0;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f18760t0 = 1;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f18761u0 = 2;

    /* renamed from: v0  reason: collision with root package name */
    public static final String f18762v0 = l.class.getSimpleName();

    /* renamed from: w0  reason: collision with root package name */
    public static final String f18763w0 = "materialContainerTransition:bounds";

    /* renamed from: x0  reason: collision with root package name */
    public static final String f18764x0 = "materialContainerTransition:shapeAppearance";

    /* renamed from: y0  reason: collision with root package name */
    public static final String[] f18765y0 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: z0  reason: collision with root package name */
    public static final f f18766z0 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), (a) null);
    public boolean O = false;
    public boolean P = false;
    @b0
    public int Q = 16908290;
    @b0
    public int R = -1;
    @b0
    public int S = -1;
    @d.l
    public int T = 0;
    @d.l
    public int U = 0;
    @d.l
    public int V = 0;
    @d.l
    public int W = 1375731712;
    public int X = 0;
    public int Y = 0;
    public int Z = 0;
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public View f18767a0;
    @o0

    /* renamed from: b0  reason: collision with root package name */
    public View f18768b0;
    @o0

    /* renamed from: c0  reason: collision with root package name */
    public o f18769c0;
    @o0

    /* renamed from: d0  reason: collision with root package name */
    public o f18770d0;
    @o0

    /* renamed from: e0  reason: collision with root package name */
    public e f18771e0;
    @o0

    /* renamed from: f0  reason: collision with root package name */
    public e f18772f0;
    @o0

    /* renamed from: g0  reason: collision with root package name */
    public e f18773g0;
    @o0

    /* renamed from: h0  reason: collision with root package name */
    public e f18774h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f18775i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f18776j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f18777k0;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f18778a;

        public a(h hVar) {
            this.f18778a = hVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f18778a.o(valueAnimator.getAnimatedFraction());
        }
    }

    public class b extends u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18780a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f18781b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f18782c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ View f18783d;

        public b(View view, h hVar, View view2, View view3) {
            this.f18780a = view;
            this.f18781b = hVar;
            this.f18782c = view2;
            this.f18783d = view3;
        }

        public void onTransitionEnd(@m0 Transition transition) {
            l.this.removeListener(this);
            if (!l.this.P) {
                this.f18782c.setAlpha(1.0f);
                this.f18783d.setAlpha(1.0f);
                v.h(this.f18780a).b(this.f18781b);
            }
        }

        public void onTransitionStart(@m0 Transition transition) {
            v.h(this.f18780a).a(this.f18781b);
            this.f18782c.setAlpha(0.0f);
            this.f18783d.setAlpha(0.0f);
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public static class e {
        @d.v(from = 0.0d, to = 1.0d)

        /* renamed from: a  reason: collision with root package name */
        public final float f18785a;
        @d.v(from = 0.0d, to = 1.0d)

        /* renamed from: b  reason: collision with root package name */
        public final float f18786b;

        public e(@d.v(from = 0.0d, to = 1.0d) float f10, @d.v(from = 0.0d, to = 1.0d) float f11) {
            this.f18785a = f10;
            this.f18786b = f11;
        }

        @d.v(from = 0.0d, to = 1.0d)
        public float c() {
            return this.f18786b;
        }

        @d.v(from = 0.0d, to = 1.0d)
        public float d() {
            return this.f18785a;
        }
    }

    public static class f {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final e f18787a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final e f18788b;
        @m0

        /* renamed from: c  reason: collision with root package name */
        public final e f18789c;
        @m0

        /* renamed from: d  reason: collision with root package name */
        public final e f18790d;

        public f(@m0 e eVar, @m0 e eVar2, @m0 e eVar3, @m0 e eVar4) {
            this.f18787a = eVar;
            this.f18788b = eVar2;
            this.f18789c = eVar3;
            this.f18790d = eVar4;
        }

        public /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    public static final class h extends Drawable {
        public static final int M = 754974720;
        public static final int N = -7829368;
        public static final float O = 0.3f;
        public static final float P = 1.5f;
        public final f A;
        public final a B;
        public final f C;
        public final boolean D;
        public final Paint E;
        public final Path F;
        public c G;
        public h H;
        public RectF I;
        public float J;
        public float K;
        public float L;

        /* renamed from: a  reason: collision with root package name */
        public final View f18791a;

        /* renamed from: b  reason: collision with root package name */
        public final RectF f18792b;

        /* renamed from: c  reason: collision with root package name */
        public final o f18793c;

        /* renamed from: d  reason: collision with root package name */
        public final float f18794d;

        /* renamed from: e  reason: collision with root package name */
        public final View f18795e;

        /* renamed from: f  reason: collision with root package name */
        public final RectF f18796f;

        /* renamed from: g  reason: collision with root package name */
        public final o f18797g;

        /* renamed from: h  reason: collision with root package name */
        public final float f18798h;

        /* renamed from: i  reason: collision with root package name */
        public final Paint f18799i;

        /* renamed from: j  reason: collision with root package name */
        public final Paint f18800j;

        /* renamed from: k  reason: collision with root package name */
        public final Paint f18801k;

        /* renamed from: l  reason: collision with root package name */
        public final Paint f18802l;

        /* renamed from: m  reason: collision with root package name */
        public final Paint f18803m;

        /* renamed from: n  reason: collision with root package name */
        public final j f18804n;

        /* renamed from: o  reason: collision with root package name */
        public final PathMeasure f18805o;

        /* renamed from: p  reason: collision with root package name */
        public final float f18806p;

        /* renamed from: q  reason: collision with root package name */
        public final float[] f18807q;

        /* renamed from: r  reason: collision with root package name */
        public final boolean f18808r;

        /* renamed from: s  reason: collision with root package name */
        public final float f18809s;

        /* renamed from: t  reason: collision with root package name */
        public final float f18810t;

        /* renamed from: u  reason: collision with root package name */
        public final boolean f18811u;

        /* renamed from: v  reason: collision with root package name */
        public final j f18812v;

        /* renamed from: w  reason: collision with root package name */
        public final RectF f18813w;

        /* renamed from: x  reason: collision with root package name */
        public final RectF f18814x;

        /* renamed from: y  reason: collision with root package name */
        public final RectF f18815y;

        /* renamed from: z  reason: collision with root package name */
        public final RectF f18816z;

        public class a implements v.c {
            public a() {
            }

            public void a(Canvas canvas) {
                h.this.f18791a.draw(canvas);
            }
        }

        public class b implements v.c {
            public b() {
            }

            public void a(Canvas canvas) {
                h.this.f18795e.draw(canvas);
            }
        }

        public h(PathMotion pathMotion, View view, RectF rectF, o oVar, float f10, View view2, RectF rectF2, o oVar2, float f11, @d.l int i10, @d.l int i11, @d.l int i12, int i13, boolean z10, boolean z11, a aVar, f fVar, f fVar2, boolean z12) {
            RectF rectF3 = rectF;
            Paint paint = new Paint();
            this.f18799i = paint;
            Paint paint2 = new Paint();
            this.f18800j = paint2;
            Paint paint3 = new Paint();
            this.f18801k = paint3;
            this.f18802l = new Paint();
            Paint paint4 = new Paint();
            this.f18803m = paint4;
            this.f18804n = new j();
            float[] fArr = new float[2];
            this.f18807q = fArr;
            j jVar = new j();
            this.f18812v = jVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f18791a = view;
            this.f18792b = rectF3;
            this.f18793c = oVar;
            this.f18794d = f10;
            this.f18795e = view2;
            this.f18796f = rectF2;
            this.f18797g = oVar2;
            this.f18798h = f11;
            this.f18808r = z10;
            this.f18811u = z11;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z12;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f18809s = (float) displayMetrics.widthPixels;
            this.f18810t = (float) displayMetrics.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            jVar.n0(ColorStateList.valueOf(0));
            jVar.w0(2);
            jVar.t0(false);
            jVar.u0(-7829368);
            RectF rectF4 = new RectF(rectF3);
            this.f18813w = rectF4;
            this.f18814x = new RectF(rectF4);
            RectF rectF5 = new RectF(rectF4);
            this.f18815y = rectF5;
            this.f18816z = new RectF(rectF5);
            PointF m10 = m(rectF);
            PointF m11 = m(rectF2);
            PathMotion pathMotion2 = pathMotion;
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m10.x, m10.y, m11.x, m11.y), false);
            this.f18805o = pathMeasure;
            this.f18806p = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF3.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(v.c(i13));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }

        public /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, o oVar, float f10, View view2, RectF rectF2, o oVar2, float f11, int i10, int i11, int i12, int i13, boolean z10, boolean z11, a aVar, f fVar, f fVar2, boolean z12, a aVar2) {
            this(pathMotion, view, rectF, oVar, f10, view2, rectF2, oVar2, f11, i10, i11, i12, i13, z10, z11, aVar, fVar, fVar2, z12);
        }

        public static float d(RectF rectF, float f10) {
            return ((rectF.centerX() / (f10 / 2.0f)) - 1.0f) * 0.3f;
        }

        public static float e(RectF rectF, float f10) {
            return (rectF.centerY() / f10) * 1.5f;
        }

        public static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        public void draw(@m0 Canvas canvas) {
            if (this.f18803m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f18803m);
            }
            int save = this.D ? canvas.save() : -1;
            if (this.f18811u && this.J > 0.0f) {
                h(canvas);
            }
            this.f18804n.a(canvas);
            n(canvas, this.f18799i);
            if (this.G.f18722c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(save);
                f(canvas, this.f18813w, this.F, -65281);
                g(canvas, this.f18814x, -256);
                g(canvas, this.f18813w, -16711936);
                g(canvas, this.f18816z, -16711681);
                g(canvas, this.f18815y, -16776961);
            }
        }

        public final void f(Canvas canvas, RectF rectF, Path path, @d.l int i10) {
            PointF m10 = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(m10.x, m10.y);
                return;
            }
            path.lineTo(m10.x, m10.y);
            this.E.setColor(i10);
            canvas.drawPath(path, this.E);
        }

        public final void g(Canvas canvas, RectF rectF, @d.l int i10) {
            this.E.setColor(i10);
            canvas.drawRect(rectF, this.E);
        }

        public int getOpacity() {
            return -3;
        }

        public final void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f18804n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        public final void i(Canvas canvas) {
            j jVar = this.f18812v;
            RectF rectF = this.I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f18812v.m0(this.J);
            this.f18812v.A0((int) this.K);
            this.f18812v.setShapeAppearanceModel(this.f18804n.c());
            this.f18812v.draw(canvas);
        }

        public final void j(Canvas canvas) {
            o c10 = this.f18804n.c();
            if (c10.u(this.I)) {
                float a10 = c10.r().a(this.I);
                canvas.drawRoundRect(this.I, a10, a10, this.f18802l);
                return;
            }
            canvas.drawPath(this.f18804n.d(), this.f18802l);
        }

        public final void k(Canvas canvas) {
            n(canvas, this.f18801k);
            Rect bounds = getBounds();
            RectF rectF = this.f18815y;
            v.s(canvas, bounds, rectF.left, rectF.top, this.H.f18742b, this.G.f18721b, new b());
        }

        public final void l(Canvas canvas) {
            n(canvas, this.f18800j);
            Rect bounds = getBounds();
            RectF rectF = this.f18813w;
            v.s(canvas, bounds, rectF.left, rectF.top, this.H.f18741a, this.G.f18720a, new a());
        }

        public final void n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        public final void o(float f10) {
            if (this.L != f10) {
                p(f10);
            }
        }

        public final void p(float f10) {
            float f11;
            float f12;
            this.L = f10;
            this.f18803m.setAlpha((int) (this.f18808r ? v.k(0.0f, 255.0f, f10) : v.k(255.0f, 0.0f, f10)));
            this.f18805o.getPosTan(this.f18806p * f10, this.f18807q, (float[]) null);
            float[] fArr = this.f18807q;
            float f13 = fArr[0];
            float f14 = fArr[1];
            int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i10 > 0 || f10 < 0.0f) {
                if (i10 > 0) {
                    f12 = 0.99f;
                    f11 = (f10 - 1.0f) / 0.00999999f;
                } else {
                    f12 = 0.01f;
                    f11 = (f10 / 0.01f) * -1.0f;
                }
                this.f18805o.getPosTan(this.f18806p * f12, fArr, (float[]) null);
                float[] fArr2 = this.f18807q;
                f13 += (f13 - fArr2[0]) * f11;
                f14 += (f14 - fArr2[1]) * f11;
            }
            float f15 = f13;
            float f16 = f14;
            h a10 = this.C.a(f10, ((Float) n.g(Float.valueOf(this.A.f18788b.f18785a))).floatValue(), ((Float) n.g(Float.valueOf(this.A.f18788b.f18786b))).floatValue(), this.f18792b.width(), this.f18792b.height(), this.f18796f.width(), this.f18796f.height());
            this.H = a10;
            RectF rectF = this.f18813w;
            float f17 = a10.f18743c;
            rectF.set(f15 - (f17 / 2.0f), f16, (f17 / 2.0f) + f15, a10.f18744d + f16);
            RectF rectF2 = this.f18815y;
            h hVar = this.H;
            float f18 = hVar.f18745e;
            rectF2.set(f15 - (f18 / 2.0f), f16, f15 + (f18 / 2.0f), hVar.f18746f + f16);
            this.f18814x.set(this.f18813w);
            this.f18816z.set(this.f18815y);
            float floatValue = ((Float) n.g(Float.valueOf(this.A.f18789c.f18785a))).floatValue();
            float floatValue2 = ((Float) n.g(Float.valueOf(this.A.f18789c.f18786b))).floatValue();
            boolean b10 = this.C.b(this.H);
            RectF rectF3 = b10 ? this.f18814x : this.f18816z;
            float l10 = v.l(0.0f, 1.0f, floatValue, floatValue2, f10);
            if (!b10) {
                l10 = 1.0f - l10;
            }
            this.C.c(rectF3, l10, this.H);
            this.I = new RectF(Math.min(this.f18814x.left, this.f18816z.left), Math.min(this.f18814x.top, this.f18816z.top), Math.max(this.f18814x.right, this.f18816z.right), Math.max(this.f18814x.bottom, this.f18816z.bottom));
            this.f18804n.b(f10, this.f18793c, this.f18797g, this.f18813w, this.f18814x, this.f18816z, this.A.f18790d);
            this.J = v.k(this.f18794d, this.f18798h, f10);
            float d10 = d(this.I, this.f18809s);
            float e10 = e(this.I, this.f18810t);
            float f19 = this.J;
            float f20 = (float) ((int) (e10 * f19));
            this.K = f20;
            this.f18802l.setShadowLayer(f19, (float) ((int) (d10 * f19)), f20, 754974720);
            this.G = this.B.a(f10, ((Float) n.g(Float.valueOf(this.A.f18787a.f18785a))).floatValue(), ((Float) n.g(Float.valueOf(this.A.f18787a.f18786b))).floatValue());
            if (this.f18800j.getColor() != 0) {
                this.f18800j.setAlpha(this.G.f18720a);
            }
            if (this.f18801k.getColor() != 0) {
                this.f18801k.setAlpha(this.G.f18721b);
            }
            invalidateSelf();
        }

        public void setAlpha(int i10) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        public void setColorFilter(@o0 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    public l() {
        boolean z10 = false;
        this.f18775i0 = Build.VERSION.SDK_INT >= 28 ? true : z10;
        this.f18776j0 = -1.0f;
        this.f18777k0 = -1.0f;
        setInterpolator(j9.a.f19829b);
    }

    public static o A(@m0 View view, @o0 o oVar) {
        if (oVar != null) {
            return oVar;
        }
        int i10 = a.h.mtrl_motion_snapshot_view;
        if (view.getTag(i10) instanceof o) {
            return (o) view.getTag(i10);
        }
        Context context = view.getContext();
        int J = J(context);
        return J != -1 ? o.b(context, J, 0).m() : view instanceof s ? ((s) view).getShapeAppearanceModel() : o.a().m();
    }

    @b1
    public static int J(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static RectF g(View view, @o0 View view2, float f10, float f11) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF g10 = v.g(view2);
        g10.offset(f10, f11);
        return g10;
    }

    public static o i(@m0 View view, @m0 RectF rectF, @o0 o oVar) {
        return v.b(A(view, oVar), rectF);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(@d.m0 android.transition.TransitionValues r2, @d.o0 android.view.View r3, @d.b0 int r4, @d.o0 z9.o r5) {
        /*
            r0 = -1
            if (r4 == r0) goto L_0x000c
            android.view.View r3 = r2.view
            android.view.View r3 = fa.v.f(r3, r4)
        L_0x0009:
            r2.view = r3
            goto L_0x002a
        L_0x000c:
            if (r3 == 0) goto L_0x000f
            goto L_0x0009
        L_0x000f:
            android.view.View r3 = r2.view
            int r4 = i9.a.h.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L_0x002a
            android.view.View r3 = r2.view
            java.lang.Object r3 = r3.getTag(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.View r0 = r2.view
            r1 = 0
            r0.setTag(r4, r1)
            goto L_0x0009
        L_0x002a:
            android.view.View r3 = r2.view
            boolean r4 = f1.w1.T0(r3)
            if (r4 != 0) goto L_0x003e
            int r4 = r3.getWidth()
            if (r4 != 0) goto L_0x003e
            int r4 = r3.getHeight()
            if (r4 == 0) goto L_0x005f
        L_0x003e:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L_0x0049
            android.graphics.RectF r4 = fa.v.h(r3)
            goto L_0x004d
        L_0x0049:
            android.graphics.RectF r4 = fa.v.g(r3)
        L_0x004d:
            java.util.Map r0 = r2.values
            java.lang.String r1 = "materialContainerTransition:bounds"
            r0.put(r1, r4)
            java.util.Map r2 = r2.values
            z9.o r3 = i(r3, r4, r5)
            java.lang.String r4 = "materialContainerTransition:shapeAppearance"
            r2.put(r4, r3)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.l.j(android.transition.TransitionValues, android.view.View, int, z9.o):void");
    }

    public static float n(float f10, View view) {
        return f10 != -1.0f ? f10 : w1.P(view);
    }

    @o0
    public e B() {
        return this.f18774h0;
    }

    @d.l
    public int C() {
        return this.U;
    }

    public float D() {
        return this.f18776j0;
    }

    @o0
    public o E() {
        return this.f18769c0;
    }

    @o0
    public View F() {
        return this.f18767a0;
    }

    @b0
    public int G() {
        return this.R;
    }

    public final f H(boolean z10, f fVar, f fVar2) {
        if (!z10) {
            fVar = fVar2;
        }
        return new f((e) v.d(this.f18771e0, fVar.f18787a), (e) v.d(this.f18772f0, fVar.f18788b), (e) v.d(this.f18773g0, fVar.f18789c), (e) v.d(this.f18774h0, fVar.f18790d), (a) null);
    }

    public int I() {
        return this.X;
    }

    public boolean K() {
        return this.O;
    }

    public boolean L() {
        return this.f18775i0;
    }

    public final boolean M(@m0 RectF rectF, @m0 RectF rectF2) {
        int i10 = this.X;
        if (i10 == 0) {
            return v.a(rectF2) > v.a(rectF);
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.X);
    }

    public boolean N() {
        return this.P;
    }

    public void O(@d.l int i10) {
        this.T = i10;
        this.U = i10;
        this.V = i10;
    }

    public void P(@d.l int i10) {
        this.T = i10;
    }

    public void Q(boolean z10) {
        this.O = z10;
    }

    public void R(@b0 int i10) {
        this.Q = i10;
    }

    public void S(boolean z10) {
        this.f18775i0 = z10;
    }

    public void T(@d.l int i10) {
        this.V = i10;
    }

    public void U(float f10) {
        this.f18777k0 = f10;
    }

    public void V(@o0 o oVar) {
        this.f18770d0 = oVar;
    }

    public void W(@o0 View view) {
        this.f18768b0 = view;
    }

    public void X(@b0 int i10) {
        this.S = i10;
    }

    public void Y(int i10) {
        this.Y = i10;
    }

    public void Z(@o0 e eVar) {
        this.f18771e0 = eVar;
    }

    public void a0(int i10) {
        this.Z = i10;
    }

    public void b0(boolean z10) {
        this.P = z10;
    }

    public void c0(@o0 e eVar) {
        this.f18773g0 = eVar;
    }

    public void captureEndValues(@m0 TransitionValues transitionValues) {
        j(transitionValues, this.f18768b0, this.S, this.f18770d0);
    }

    public void captureStartValues(@m0 TransitionValues transitionValues) {
        j(transitionValues, this.f18767a0, this.R, this.f18769c0);
    }

    @o0
    public Animator createAnimator(@m0 ViewGroup viewGroup, @o0 TransitionValues transitionValues, @o0 TransitionValues transitionValues2) {
        View view;
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        if (!(transitionValues3 == null || transitionValues4 == null)) {
            RectF rectF = (RectF) transitionValues3.values.get("materialContainerTransition:bounds");
            o oVar = (o) transitionValues3.values.get("materialContainerTransition:shapeAppearance");
            if (!(rectF == null || oVar == null)) {
                RectF rectF2 = (RectF) transitionValues4.values.get("materialContainerTransition:bounds");
                o oVar2 = (o) transitionValues4.values.get("materialContainerTransition:shapeAppearance");
                if (!(rectF2 == null || oVar2 == null)) {
                    View view2 = transitionValues3.view;
                    View view3 = transitionValues4.view;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.Q == view4.getId()) {
                        view = (View) view4.getParent();
                    } else {
                        view = v.e(view4, this.Q);
                        view4 = null;
                    }
                    RectF g10 = v.g(view);
                    float f10 = -g10.left;
                    float f11 = -g10.top;
                    RectF g11 = g(view, view4, f10, f11);
                    rectF.offset(f10, f11);
                    rectF2.offset(f10, f11);
                    boolean M = M(rectF, rectF2);
                    h hVar = new h(getPathMotion(), view2, rectF, oVar, n(this.f18776j0, view2), view3, rectF2, oVar2, n(this.f18777k0, view3), this.T, this.U, this.V, this.W, M, this.f18775i0, b.a(this.Y, M), g.a(this.Z, M, rectF, rectF2), d(M), this.O, (a) null);
                    hVar.setBounds(Math.round(g11.left), Math.round(g11.top), Math.round(g11.right), Math.round(g11.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new a(hVar));
                    addListener(new b(view, hVar, view2, view3));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    public final f d(boolean z10) {
        f fVar;
        f fVar2;
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof k)) {
            fVar = B0;
            fVar2 = C0;
        } else {
            fVar = f18766z0;
            fVar2 = A0;
        }
        return H(z10, fVar, fVar2);
    }

    public void d0(@o0 e eVar) {
        this.f18772f0 = eVar;
    }

    public void e0(@d.l int i10) {
        this.W = i10;
    }

    public void f0(@o0 e eVar) {
        this.f18774h0 = eVar;
    }

    public void g0(@d.l int i10) {
        this.U = i10;
    }

    @o0
    public String[] getTransitionProperties() {
        return f18765y0;
    }

    public void h0(float f10) {
        this.f18776j0 = f10;
    }

    public void i0(@o0 o oVar) {
        this.f18769c0 = oVar;
    }

    public void j0(@o0 View view) {
        this.f18767a0 = view;
    }

    @d.l
    public int k() {
        return this.T;
    }

    public void k0(@b0 int i10) {
        this.R = i10;
    }

    public void l0(int i10) {
        this.X = i10;
    }

    @b0
    public int m() {
        return this.Q;
    }

    @d.l
    public int p() {
        return this.V;
    }

    public float q() {
        return this.f18777k0;
    }

    @o0
    public o r() {
        return this.f18770d0;
    }

    @o0
    public View s() {
        return this.f18768b0;
    }

    @b0
    public int t() {
        return this.S;
    }

    public int u() {
        return this.Y;
    }

    @o0
    public e v() {
        return this.f18771e0;
    }

    public int w() {
        return this.Z;
    }

    @o0
    public e x() {
        return this.f18773g0;
    }

    @o0
    public e y() {
        return this.f18772f0;
    }

    @d.l
    public int z() {
        return this.W;
    }
}
