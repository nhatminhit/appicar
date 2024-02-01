package ea;

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
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.internal.v;
import d.b0;
import d.b1;
import d.m0;
import d.o0;
import d.x0;
import e1.n;
import ea.u;
import f1.w1;
import g3.j0;
import g3.r0;
import g3.z;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import z9.j;
import z9.o;
import z9.s;

public final class l extends j0 {

    /* renamed from: h1  reason: collision with root package name */
    public static final int f18447h1 = 0;

    /* renamed from: i1  reason: collision with root package name */
    public static final int f18448i1 = 1;

    /* renamed from: j1  reason: collision with root package name */
    public static final int f18449j1 = 2;

    /* renamed from: k1  reason: collision with root package name */
    public static final int f18450k1 = 0;

    /* renamed from: l1  reason: collision with root package name */
    public static final int f18451l1 = 1;

    /* renamed from: m1  reason: collision with root package name */
    public static final int f18452m1 = 2;

    /* renamed from: n1  reason: collision with root package name */
    public static final int f18453n1 = 3;

    /* renamed from: o1  reason: collision with root package name */
    public static final int f18454o1 = 0;

    /* renamed from: p1  reason: collision with root package name */
    public static final int f18455p1 = 1;

    /* renamed from: q1  reason: collision with root package name */
    public static final int f18456q1 = 2;

    /* renamed from: r1  reason: collision with root package name */
    public static final String f18457r1 = l.class.getSimpleName();

    /* renamed from: s1  reason: collision with root package name */
    public static final String f18458s1 = "materialContainerTransition:bounds";

    /* renamed from: t1  reason: collision with root package name */
    public static final String f18459t1 = "materialContainerTransition:shapeAppearance";

    /* renamed from: u1  reason: collision with root package name */
    public static final String[] f18460u1 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: v1  reason: collision with root package name */
    public static final f f18461v1 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), (a) null);

    /* renamed from: w1  reason: collision with root package name */
    public static final f f18462w1 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), (a) null);

    /* renamed from: x1  reason: collision with root package name */
    public static final f f18463x1 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), (a) null);

    /* renamed from: y1  reason: collision with root package name */
    public static final f f18464y1 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), (a) null);

    /* renamed from: z1  reason: collision with root package name */
    public static final float f18465z1 = -1.0f;
    public boolean K0 = false;
    public boolean L0 = false;
    @b0
    public int M0 = 16908290;
    @b0
    public int N0 = -1;
    @b0
    public int O0 = -1;
    @d.l
    public int P0 = 0;
    @d.l
    public int Q0 = 0;
    @d.l
    public int R0 = 0;
    @d.l
    public int S0 = 1375731712;
    public int T0 = 0;
    public int U0 = 0;
    public int V0 = 0;
    @o0
    public View W0;
    @o0
    public View X0;
    @o0
    public o Y0;
    @o0
    public o Z0;
    @o0

    /* renamed from: a1  reason: collision with root package name */
    public e f18466a1;
    @o0

    /* renamed from: b1  reason: collision with root package name */
    public e f18467b1;
    @o0

    /* renamed from: c1  reason: collision with root package name */
    public e f18468c1;
    @o0

    /* renamed from: d1  reason: collision with root package name */
    public e f18469d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f18470e1;

    /* renamed from: f1  reason: collision with root package name */
    public float f18471f1;

    /* renamed from: g1  reason: collision with root package name */
    public float f18472g1;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f18473a;

        public a(h hVar) {
            this.f18473a = hVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f18473a.o(valueAnimator.getAnimatedFraction());
        }
    }

    public class b extends t {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18475a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f18476b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f18477c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ View f18478d;

        public b(View view, h hVar, View view2, View view3) {
            this.f18475a = view;
            this.f18476b = hVar;
            this.f18477c = view2;
            this.f18478d = view3;
        }

        public void b(@m0 j0 j0Var) {
            v.h(this.f18475a).a(this.f18476b);
            this.f18477c.setAlpha(0.0f);
            this.f18478d.setAlpha(0.0f);
        }

        public void e(@m0 j0 j0Var) {
            l.this.o0(this);
            if (!l.this.L0) {
                this.f18477c.setAlpha(1.0f);
                this.f18478d.setAlpha(1.0f);
                v.h(this.f18475a).b(this.f18476b);
            }
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
        public final float f18480a;
        @d.v(from = 0.0d, to = 1.0d)

        /* renamed from: b  reason: collision with root package name */
        public final float f18481b;

        public e(@d.v(from = 0.0d, to = 1.0d) float f10, @d.v(from = 0.0d, to = 1.0d) float f11) {
            this.f18480a = f10;
            this.f18481b = f11;
        }

        @d.v(from = 0.0d, to = 1.0d)
        public float c() {
            return this.f18481b;
        }

        @d.v(from = 0.0d, to = 1.0d)
        public float d() {
            return this.f18480a;
        }
    }

    public static class f {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final e f18482a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final e f18483b;
        @m0

        /* renamed from: c  reason: collision with root package name */
        public final e f18484c;
        @m0

        /* renamed from: d  reason: collision with root package name */
        public final e f18485d;

        public f(@m0 e eVar, @m0 e eVar2, @m0 e eVar3, @m0 e eVar4) {
            this.f18482a = eVar;
            this.f18483b = eVar2;
            this.f18484c = eVar3;
            this.f18485d = eVar4;
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
        public final View f18486a;

        /* renamed from: b  reason: collision with root package name */
        public final RectF f18487b;

        /* renamed from: c  reason: collision with root package name */
        public final o f18488c;

        /* renamed from: d  reason: collision with root package name */
        public final float f18489d;

        /* renamed from: e  reason: collision with root package name */
        public final View f18490e;

        /* renamed from: f  reason: collision with root package name */
        public final RectF f18491f;

        /* renamed from: g  reason: collision with root package name */
        public final o f18492g;

        /* renamed from: h  reason: collision with root package name */
        public final float f18493h;

        /* renamed from: i  reason: collision with root package name */
        public final Paint f18494i;

        /* renamed from: j  reason: collision with root package name */
        public final Paint f18495j;

        /* renamed from: k  reason: collision with root package name */
        public final Paint f18496k;

        /* renamed from: l  reason: collision with root package name */
        public final Paint f18497l;

        /* renamed from: m  reason: collision with root package name */
        public final Paint f18498m;

        /* renamed from: n  reason: collision with root package name */
        public final j f18499n;

        /* renamed from: o  reason: collision with root package name */
        public final PathMeasure f18500o;

        /* renamed from: p  reason: collision with root package name */
        public final float f18501p;

        /* renamed from: q  reason: collision with root package name */
        public final float[] f18502q;

        /* renamed from: r  reason: collision with root package name */
        public final boolean f18503r;

        /* renamed from: s  reason: collision with root package name */
        public final float f18504s;

        /* renamed from: t  reason: collision with root package name */
        public final float f18505t;

        /* renamed from: u  reason: collision with root package name */
        public final boolean f18506u;

        /* renamed from: v  reason: collision with root package name */
        public final j f18507v;

        /* renamed from: w  reason: collision with root package name */
        public final RectF f18508w;

        /* renamed from: x  reason: collision with root package name */
        public final RectF f18509x;

        /* renamed from: y  reason: collision with root package name */
        public final RectF f18510y;

        /* renamed from: z  reason: collision with root package name */
        public final RectF f18511z;

        public class a implements u.c {
            public a() {
            }

            public void a(Canvas canvas) {
                h.this.f18486a.draw(canvas);
            }
        }

        public class b implements u.c {
            public b() {
            }

            public void a(Canvas canvas) {
                h.this.f18490e.draw(canvas);
            }
        }

        public h(z zVar, View view, RectF rectF, o oVar, float f10, View view2, RectF rectF2, o oVar2, float f11, @d.l int i10, @d.l int i11, @d.l int i12, int i13, boolean z10, boolean z11, a aVar, f fVar, f fVar2, boolean z12) {
            RectF rectF3 = rectF;
            Paint paint = new Paint();
            this.f18494i = paint;
            Paint paint2 = new Paint();
            this.f18495j = paint2;
            Paint paint3 = new Paint();
            this.f18496k = paint3;
            this.f18497l = new Paint();
            Paint paint4 = new Paint();
            this.f18498m = paint4;
            this.f18499n = new j();
            float[] fArr = new float[2];
            this.f18502q = fArr;
            j jVar = new j();
            this.f18507v = jVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f18486a = view;
            this.f18487b = rectF3;
            this.f18488c = oVar;
            this.f18489d = f10;
            this.f18490e = view2;
            this.f18491f = rectF2;
            this.f18492g = oVar2;
            this.f18493h = f11;
            this.f18503r = z10;
            this.f18506u = z11;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z12;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f18504s = (float) displayMetrics.widthPixels;
            this.f18505t = (float) displayMetrics.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            jVar.n0(ColorStateList.valueOf(0));
            jVar.w0(2);
            jVar.t0(false);
            jVar.u0(-7829368);
            RectF rectF4 = new RectF(rectF3);
            this.f18508w = rectF4;
            this.f18509x = new RectF(rectF4);
            RectF rectF5 = new RectF(rectF4);
            this.f18510y = rectF5;
            this.f18511z = new RectF(rectF5);
            PointF m10 = m(rectF);
            PointF m11 = m(rectF2);
            z zVar2 = zVar;
            PathMeasure pathMeasure = new PathMeasure(zVar.a(m10.x, m10.y, m11.x, m11.y), false);
            this.f18500o = pathMeasure;
            this.f18501p = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF3.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(u.c(i13));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }

        public /* synthetic */ h(z zVar, View view, RectF rectF, o oVar, float f10, View view2, RectF rectF2, o oVar2, float f11, int i10, int i11, int i12, int i13, boolean z10, boolean z11, a aVar, f fVar, f fVar2, boolean z12, a aVar2) {
            this(zVar, view, rectF, oVar, f10, view2, rectF2, oVar2, f11, i10, i11, i12, i13, z10, z11, aVar, fVar, fVar2, z12);
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
            if (this.f18498m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f18498m);
            }
            int save = this.D ? canvas.save() : -1;
            if (this.f18506u && this.J > 0.0f) {
                h(canvas);
            }
            this.f18499n.a(canvas);
            n(canvas, this.f18494i);
            if (this.G.f18417c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(save);
                f(canvas, this.f18508w, this.F, -65281);
                g(canvas, this.f18509x, -256);
                g(canvas, this.f18508w, -16711936);
                g(canvas, this.f18511z, -16711681);
                g(canvas, this.f18510y, -16776961);
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
            canvas.clipPath(this.f18499n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        public final void i(Canvas canvas) {
            j jVar = this.f18507v;
            RectF rectF = this.I;
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f18507v.m0(this.J);
            this.f18507v.A0((int) this.K);
            this.f18507v.setShapeAppearanceModel(this.f18499n.c());
            this.f18507v.draw(canvas);
        }

        public final void j(Canvas canvas) {
            o c10 = this.f18499n.c();
            if (c10.u(this.I)) {
                float a10 = c10.r().a(this.I);
                canvas.drawRoundRect(this.I, a10, a10, this.f18497l);
                return;
            }
            canvas.drawPath(this.f18499n.d(), this.f18497l);
        }

        public final void k(Canvas canvas) {
            n(canvas, this.f18496k);
            Rect bounds = getBounds();
            RectF rectF = this.f18510y;
            u.s(canvas, bounds, rectF.left, rectF.top, this.H.f18437b, this.G.f18416b, new b());
        }

        public final void l(Canvas canvas) {
            n(canvas, this.f18495j);
            Rect bounds = getBounds();
            RectF rectF = this.f18508w;
            u.s(canvas, bounds, rectF.left, rectF.top, this.H.f18436a, this.G.f18415a, new a());
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
            this.f18498m.setAlpha((int) (this.f18503r ? u.k(0.0f, 255.0f, f10) : u.k(255.0f, 0.0f, f10)));
            this.f18500o.getPosTan(this.f18501p * f10, this.f18502q, (float[]) null);
            float[] fArr = this.f18502q;
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
                this.f18500o.getPosTan(this.f18501p * f12, fArr, (float[]) null);
                float[] fArr2 = this.f18502q;
                f13 += (f13 - fArr2[0]) * f11;
                f14 += (f14 - fArr2[1]) * f11;
            }
            float f15 = f13;
            float f16 = f14;
            h a10 = this.C.a(f10, ((Float) n.g(Float.valueOf(this.A.f18483b.f18480a))).floatValue(), ((Float) n.g(Float.valueOf(this.A.f18483b.f18481b))).floatValue(), this.f18487b.width(), this.f18487b.height(), this.f18491f.width(), this.f18491f.height());
            this.H = a10;
            RectF rectF = this.f18508w;
            float f17 = a10.f18438c;
            rectF.set(f15 - (f17 / 2.0f), f16, (f17 / 2.0f) + f15, a10.f18439d + f16);
            RectF rectF2 = this.f18510y;
            h hVar = this.H;
            float f18 = hVar.f18440e;
            rectF2.set(f15 - (f18 / 2.0f), f16, f15 + (f18 / 2.0f), hVar.f18441f + f16);
            this.f18509x.set(this.f18508w);
            this.f18511z.set(this.f18510y);
            float floatValue = ((Float) n.g(Float.valueOf(this.A.f18484c.f18480a))).floatValue();
            float floatValue2 = ((Float) n.g(Float.valueOf(this.A.f18484c.f18481b))).floatValue();
            boolean c10 = this.C.c(this.H);
            RectF rectF3 = c10 ? this.f18509x : this.f18511z;
            float l10 = u.l(0.0f, 1.0f, floatValue, floatValue2, f10);
            if (!c10) {
                l10 = 1.0f - l10;
            }
            this.C.b(rectF3, l10, this.H);
            this.I = new RectF(Math.min(this.f18509x.left, this.f18511z.left), Math.min(this.f18509x.top, this.f18511z.top), Math.max(this.f18509x.right, this.f18511z.right), Math.max(this.f18509x.bottom, this.f18511z.bottom));
            this.f18499n.b(f10, this.f18488c, this.f18492g, this.f18508w, this.f18509x, this.f18511z, this.A.f18485d);
            this.J = u.k(this.f18489d, this.f18493h, f10);
            float d10 = d(this.I, this.f18504s);
            float e10 = e(this.I, this.f18505t);
            float f19 = this.J;
            float f20 = (float) ((int) (e10 * f19));
            this.K = f20;
            this.f18497l.setShadowLayer(f19, (float) ((int) (d10 * f19)), f20, 754974720);
            this.G = this.B.a(f10, ((Float) n.g(Float.valueOf(this.A.f18482a.f18480a))).floatValue(), ((Float) n.g(Float.valueOf(this.A.f18482a.f18481b))).floatValue());
            if (this.f18495j.getColor() != 0) {
                this.f18495j.setAlpha(this.G.f18415a);
            }
            if (this.f18496k.getColor() != 0) {
                this.f18496k.setAlpha(this.G.f18416b);
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
        this.f18470e1 = Build.VERSION.SDK_INT >= 28 ? true : z10;
        this.f18471f1 = -1.0f;
        this.f18472g1 = -1.0f;
        z0(j9.a.f19829b);
    }

    public static RectF J0(View view, @o0 View view2, float f10, float f11) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF g10 = u.g(view2);
        g10.offset(f10, f11);
        return g10;
    }

    public static o K0(@m0 View view, @m0 RectF rectF, @o0 o oVar) {
        return u.b(a1(view, oVar), rectF);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void L0(@d.m0 g3.r0 r2, @d.o0 android.view.View r3, @d.b0 int r4, @d.o0 z9.o r5) {
        /*
            r0 = -1
            if (r4 == r0) goto L_0x000c
            android.view.View r3 = r2.f7848b
            android.view.View r3 = ea.u.f(r3, r4)
        L_0x0009:
            r2.f7848b = r3
            goto L_0x002a
        L_0x000c:
            if (r3 == 0) goto L_0x000f
            goto L_0x0009
        L_0x000f:
            android.view.View r3 = r2.f7848b
            int r4 = i9.a.h.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L_0x002a
            android.view.View r3 = r2.f7848b
            java.lang.Object r3 = r3.getTag(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.View r0 = r2.f7848b
            r1 = 0
            r0.setTag(r4, r1)
            goto L_0x0009
        L_0x002a:
            android.view.View r3 = r2.f7848b
            boolean r4 = f1.w1.T0(r3)
            if (r4 != 0) goto L_0x003e
            int r4 = r3.getWidth()
            if (r4 != 0) goto L_0x003e
            int r4 = r3.getHeight()
            if (r4 == 0) goto L_0x005f
        L_0x003e:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L_0x0049
            android.graphics.RectF r4 = ea.u.h(r3)
            goto L_0x004d
        L_0x0049:
            android.graphics.RectF r4 = ea.u.g(r3)
        L_0x004d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f7847a
            java.lang.String r1 = "materialContainerTransition:bounds"
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f7847a
            z9.o r3 = K0(r3, r4, r5)
            java.lang.String r4 = "materialContainerTransition:shapeAppearance"
            r2.put(r4, r3)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.l.L0(g3.r0, android.view.View, int, z9.o):void");
    }

    public static float O0(float f10, View view) {
        return f10 != -1.0f ? f10 : w1.P(view);
    }

    public static o a1(@m0 View view, @o0 o oVar) {
        if (oVar != null) {
            return oVar;
        }
        int i10 = a.h.mtrl_motion_snapshot_view;
        if (view.getTag(i10) instanceof o) {
            return (o) view.getTag(i10);
        }
        Context context = view.getContext();
        int j12 = j1(context);
        return j12 != -1 ? o.b(context, j12, 0).m() : view instanceof s ? ((s) view).getShapeAppearanceModel() : o.a().m();
    }

    @b1
    public static int j1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{a.c.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public void A1(int i10) {
        this.V0 = i10;
    }

    public void B1(boolean z10) {
        this.L0 = z10;
    }

    public void C1(@o0 e eVar) {
        this.f18468c1 = eVar;
    }

    public void D1(@o0 e eVar) {
        this.f18467b1 = eVar;
    }

    public void E1(@d.l int i10) {
        this.S0 = i10;
    }

    public void F1(@o0 e eVar) {
        this.f18469d1 = eVar;
    }

    public void G1(@d.l int i10) {
        this.Q0 = i10;
    }

    public void H1(float f10) {
        this.f18471f1 = f10;
    }

    public final f I0(boolean z10) {
        f fVar;
        f fVar2;
        z S = S();
        if ((S instanceof g3.b) || (S instanceof k)) {
            fVar = f18463x1;
            fVar2 = f18464y1;
        } else {
            fVar = f18461v1;
            fVar2 = f18462w1;
        }
        return h1(z10, fVar, fVar2);
    }

    public void I1(@o0 o oVar) {
        this.Y0 = oVar;
    }

    public void J1(@o0 View view) {
        this.W0 = view;
    }

    public void K1(@b0 int i10) {
        this.N0 = i10;
    }

    public void L1(int i10) {
        this.T0 = i10;
    }

    @d.l
    public int M0() {
        return this.P0;
    }

    @b0
    public int N0() {
        return this.M0;
    }

    @d.l
    public int P0() {
        return this.R0;
    }

    public float Q0() {
        return this.f18472g1;
    }

    @o0
    public o R0() {
        return this.Z0;
    }

    @o0
    public View S0() {
        return this.X0;
    }

    @b0
    public int T0() {
        return this.O0;
    }

    public int U0() {
        return this.U0;
    }

    @o0
    public e V0() {
        return this.f18466a1;
    }

    public int W0() {
        return this.V0;
    }

    @o0
    public e X0() {
        return this.f18468c1;
    }

    @o0
    public e Y0() {
        return this.f18467b1;
    }

    @d.l
    public int Z0() {
        return this.S0;
    }

    @o0
    public String[] a0() {
        return f18460u1;
    }

    @o0
    public e b1() {
        return this.f18469d1;
    }

    @d.l
    public int c1() {
        return this.Q0;
    }

    public float d1() {
        return this.f18471f1;
    }

    @o0
    public o e1() {
        return this.Y0;
    }

    @o0
    public View f1() {
        return this.W0;
    }

    @b0
    public int g1() {
        return this.N0;
    }

    public final f h1(boolean z10, f fVar, f fVar2) {
        if (!z10) {
            fVar = fVar2;
        }
        return new f((e) u.d(this.f18466a1, fVar.f18482a), (e) u.d(this.f18467b1, fVar.f18483b), (e) u.d(this.f18468c1, fVar.f18484c), (e) u.d(this.f18469d1, fVar.f18485d), (a) null);
    }

    public int i1() {
        return this.T0;
    }

    public boolean k1() {
        return this.K0;
    }

    public boolean l1() {
        return this.f18470e1;
    }

    public final boolean m1(@m0 RectF rectF, @m0 RectF rectF2) {
        int i10 = this.T0;
        if (i10 == 0) {
            return u.a(rectF2) > u.a(rectF);
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.T0);
    }

    public boolean n1() {
        return this.L0;
    }

    public void o1(@d.l int i10) {
        this.P0 = i10;
        this.Q0 = i10;
        this.R0 = i10;
    }

    public void p1(@d.l int i10) {
        this.P0 = i10;
    }

    public void q(@m0 r0 r0Var) {
        L0(r0Var, this.X0, this.O0, this.Z0);
    }

    public void q1(boolean z10) {
        this.K0 = z10;
    }

    public void r1(@b0 int i10) {
        this.M0 = i10;
    }

    public void s1(boolean z10) {
        this.f18470e1 = z10;
    }

    public void t(@m0 r0 r0Var) {
        L0(r0Var, this.W0, this.N0, this.Y0);
    }

    public void t1(@d.l int i10) {
        this.R0 = i10;
    }

    public void u1(float f10) {
        this.f18472g1 = f10;
    }

    public void v1(@o0 o oVar) {
        this.Z0 = oVar;
    }

    public void w1(@o0 View view) {
        this.X0 = view;
    }

    @o0
    public Animator x(@m0 ViewGroup viewGroup, @o0 r0 r0Var, @o0 r0 r0Var2) {
        View view;
        r0 r0Var3 = r0Var;
        r0 r0Var4 = r0Var2;
        if (!(r0Var3 == null || r0Var4 == null)) {
            RectF rectF = (RectF) r0Var3.f7847a.get("materialContainerTransition:bounds");
            o oVar = (o) r0Var3.f7847a.get("materialContainerTransition:shapeAppearance");
            if (!(rectF == null || oVar == null)) {
                RectF rectF2 = (RectF) r0Var4.f7847a.get("materialContainerTransition:bounds");
                o oVar2 = (o) r0Var4.f7847a.get("materialContainerTransition:shapeAppearance");
                if (!(rectF2 == null || oVar2 == null)) {
                    View view2 = r0Var3.f7848b;
                    View view3 = r0Var4.f7848b;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (this.M0 == view4.getId()) {
                        view = (View) view4.getParent();
                    } else {
                        view = u.e(view4, this.M0);
                        view4 = null;
                    }
                    RectF g10 = u.g(view);
                    float f10 = -g10.left;
                    float f11 = -g10.top;
                    RectF J0 = J0(view, view4, f10, f11);
                    rectF.offset(f10, f11);
                    rectF2.offset(f10, f11);
                    boolean m12 = m1(rectF, rectF2);
                    h hVar = new h(S(), view2, rectF, oVar, O0(this.f18471f1, view2), view3, rectF2, oVar2, O0(this.f18472g1, view3), this.P0, this.Q0, this.R0, this.S0, m12, this.f18470e1, b.a(this.U0, m12), g.a(this.V0, m12, rectF, rectF2), I0(m12), this.K0, (a) null);
                    hVar.setBounds(Math.round(J0.left), Math.round(J0.top), Math.round(J0.right), Math.round(J0.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new a(hVar));
                    a(new b(view, hVar, view2, view3));
                    return ofFloat;
                }
            }
        }
        return null;
    }

    public void x1(@b0 int i10) {
        this.O0 = i10;
    }

    public void y1(int i10) {
        this.U0 = i10;
    }

    public void z1(@o0 e eVar) {
        this.f18466a1 = eVar;
    }
}
