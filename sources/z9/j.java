package z9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import d.b1;
import d.e0;
import d.f;
import d.l;
import d.m0;
import d.o0;
import d.x0;
import e1.i;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import o0.p;
import z9.o;
import z9.p;
import z9.q;

public class j extends Drawable implements p, s {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f24884k0 = j.class.getSimpleName();

    /* renamed from: l0  reason: collision with root package name */
    public static final float f24885l0 = 0.75f;

    /* renamed from: m0  reason: collision with root package name */
    public static final float f24886m0 = 0.25f;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f24887n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f24888o0 = 1;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f24889p0 = 2;

    /* renamed from: q0  reason: collision with root package name */
    public static final Paint f24890q0 = new Paint(1);
    public d O;
    public final q.i[] P;
    public final q.i[] Q;
    public final BitSet R;
    public boolean S;
    public final Matrix T;
    public final Path U;
    public final Path V;
    public final RectF W;
    public final RectF X;
    public final Region Y;
    public final Region Z;

    /* renamed from: a0  reason: collision with root package name */
    public o f24891a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Paint f24892b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Paint f24893c0;

    /* renamed from: d0  reason: collision with root package name */
    public final y9.b f24894d0;
    @m0

    /* renamed from: e0  reason: collision with root package name */
    public final p.b f24895e0;

    /* renamed from: f0  reason: collision with root package name */
    public final p f24896f0;
    @o0

    /* renamed from: g0  reason: collision with root package name */
    public PorterDuffColorFilter f24897g0;
    @o0

    /* renamed from: h0  reason: collision with root package name */
    public PorterDuffColorFilter f24898h0;
    @m0

    /* renamed from: i0  reason: collision with root package name */
    public final RectF f24899i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f24900j0;

    public class a implements p.b {
        public a() {
        }

        public void a(@m0 q qVar, Matrix matrix, int i10) {
            j.this.R.set(i10, qVar.e());
            j.this.P[i10] = qVar.f(matrix);
        }

        public void b(@m0 q qVar, Matrix matrix, int i10) {
            j.this.R.set(i10 + 4, qVar.e());
            j.this.Q[i10] = qVar.f(matrix);
        }
    }

    public class b implements o.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f24902a;

        public b(float f10) {
            this.f24902a = f10;
        }

        @m0
        public d a(@m0 d dVar) {
            return dVar instanceof m ? dVar : new b(this.f24902a, dVar);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static final class d extends Drawable.ConstantState {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public o f24904a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public r9.a f24905b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f24906c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f24907d = null;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f24908e = null;
        @o0

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f24909f = null;
        @o0

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f24910g = null;
        @o0

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f24911h = PorterDuff.Mode.SRC_IN;
        @o0

        /* renamed from: i  reason: collision with root package name */
        public Rect f24912i = null;

        /* renamed from: j  reason: collision with root package name */
        public float f24913j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f24914k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f24915l;

        /* renamed from: m  reason: collision with root package name */
        public int f24916m = 255;

        /* renamed from: n  reason: collision with root package name */
        public float f24917n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f24918o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public float f24919p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        public int f24920q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f24921r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f24922s = 0;

        /* renamed from: t  reason: collision with root package name */
        public int f24923t = 0;

        /* renamed from: u  reason: collision with root package name */
        public boolean f24924u = false;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f24925v = Paint.Style.FILL_AND_STROKE;

        public d(@m0 d dVar) {
            this.f24904a = dVar.f24904a;
            this.f24905b = dVar.f24905b;
            this.f24915l = dVar.f24915l;
            this.f24906c = dVar.f24906c;
            this.f24907d = dVar.f24907d;
            this.f24908e = dVar.f24908e;
            this.f24911h = dVar.f24911h;
            this.f24910g = dVar.f24910g;
            this.f24916m = dVar.f24916m;
            this.f24913j = dVar.f24913j;
            this.f24922s = dVar.f24922s;
            this.f24920q = dVar.f24920q;
            this.f24924u = dVar.f24924u;
            this.f24914k = dVar.f24914k;
            this.f24917n = dVar.f24917n;
            this.f24918o = dVar.f24918o;
            this.f24919p = dVar.f24919p;
            this.f24921r = dVar.f24921r;
            this.f24923t = dVar.f24923t;
            this.f24909f = dVar.f24909f;
            this.f24925v = dVar.f24925v;
            if (dVar.f24912i != null) {
                this.f24912i = new Rect(dVar.f24912i);
            }
        }

        public d(o oVar, r9.a aVar) {
            this.f24904a = oVar;
            this.f24905b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @m0
        public Drawable newDrawable() {
            j jVar = new j(this, (a) null);
            boolean unused = jVar.S = true;
            return jVar;
        }
    }

    public j() {
        this(new o());
    }

    public j(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        this(o.e(context, attributeSet, i10, i11).m());
    }

    public j(@m0 d dVar) {
        this.P = new q.i[4];
        this.Q = new q.i[4];
        this.R = new BitSet(8);
        this.T = new Matrix();
        this.U = new Path();
        this.V = new Path();
        this.W = new RectF();
        this.X = new RectF();
        this.Y = new Region();
        this.Z = new Region();
        Paint paint = new Paint(1);
        this.f24892b0 = paint;
        Paint paint2 = new Paint(1);
        this.f24893c0 = paint2;
        this.f24894d0 = new y9.b();
        this.f24896f0 = Looper.getMainLooper().getThread() == Thread.currentThread() ? p.k() : new p();
        this.f24899i0 = new RectF();
        this.f24900j0 = true;
        this.O = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f24890q0;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        M0();
        L0(getState());
        this.f24895e0 = new a();
    }

    public /* synthetic */ j(d dVar, a aVar) {
        this(dVar);
    }

    public j(@m0 o oVar) {
        this(new d(oVar, (r9.a) null));
    }

    @Deprecated
    public j(@m0 r rVar) {
        this((o) rVar);
    }

    public static int g0(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    @m0
    public static j m(Context context) {
        return n(context, 0.0f);
    }

    @m0
    public static j n(Context context, float f10) {
        int c10 = o9.a.c(context, a.c.colorSurface, j.class.getSimpleName());
        j jVar = new j();
        jVar.Y(context);
        jVar.n0(ColorStateList.valueOf(c10));
        jVar.m0(f10);
        return jVar;
    }

    public Paint.Style A() {
        return this.O.f24925v;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void A0(int i10) {
        d dVar = this.O;
        if (dVar.f24922s != i10) {
            dVar.f24922s = i10;
            Z();
        }
    }

    public float B() {
        return this.O.f24917n;
    }

    @Deprecated
    public void B0(@m0 r rVar) {
        setShapeAppearanceModel(rVar);
    }

    @Deprecated
    public void C(int i10, int i11, @m0 Path path) {
        h(new RectF(0.0f, 0.0f, (float) i10, (float) i11), path);
    }

    public void C0(float f10, @l int i10) {
        H0(f10);
        E0(ColorStateList.valueOf(i10));
    }

    public float D() {
        return this.O.f24913j;
    }

    public void D0(float f10, @o0 ColorStateList colorStateList) {
        H0(f10);
        E0(colorStateList);
    }

    public int E() {
        return this.O.f24923t;
    }

    public void E0(@o0 ColorStateList colorStateList) {
        d dVar = this.O;
        if (dVar.f24908e != colorStateList) {
            dVar.f24908e = colorStateList;
            onStateChange(getState());
        }
    }

    public int F() {
        return this.O.f24920q;
    }

    public void F0(@l int i10) {
        G0(ColorStateList.valueOf(i10));
    }

    @Deprecated
    public int G() {
        return (int) x();
    }

    public void G0(ColorStateList colorStateList) {
        this.O.f24909f = colorStateList;
        M0();
        Z();
    }

    public int H() {
        d dVar = this.O;
        return (int) (((double) dVar.f24922s) * Math.sin(Math.toRadians((double) dVar.f24923t)));
    }

    public void H0(float f10) {
        this.O.f24915l = f10;
        invalidateSelf();
    }

    public int I() {
        d dVar = this.O;
        return (int) (((double) dVar.f24922s) * Math.cos(Math.toRadians((double) dVar.f24923t)));
    }

    public void I0(float f10) {
        d dVar = this.O;
        if (dVar.f24919p != f10) {
            dVar.f24919p = f10;
            N0();
        }
    }

    public int J() {
        return this.O.f24921r;
    }

    public void J0(boolean z10) {
        d dVar = this.O;
        if (dVar.f24924u != z10) {
            dVar.f24924u = z10;
            invalidateSelf();
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    public int K() {
        return this.O.f24922s;
    }

    public void K0(float f10) {
        I0(f10 - x());
    }

    @o0
    @Deprecated
    public r L() {
        o shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof r) {
            return (r) shapeAppearanceModel;
        }
        return null;
    }

    public final boolean L0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.O.f24907d == null || (color2 = this.f24892b0.getColor()) == (colorForState2 = this.O.f24907d.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            this.f24892b0.setColor(colorForState2);
            z10 = true;
        }
        if (this.O.f24908e == null || (color = this.f24893c0.getColor()) == (colorForState = this.O.f24908e.getColorForState(iArr, color))) {
            return z10;
        }
        this.f24893c0.setColor(colorForState);
        return true;
    }

    @o0
    public ColorStateList M() {
        return this.O.f24908e;
    }

    public final boolean M0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f24897g0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f24898h0;
        d dVar = this.O;
        this.f24897g0 = k(dVar.f24910g, dVar.f24911h, this.f24892b0, true);
        d dVar2 = this.O;
        this.f24898h0 = k(dVar2.f24909f, dVar2.f24911h, this.f24893c0, false);
        d dVar3 = this.O;
        if (dVar3.f24924u) {
            this.f24894d0.d(dVar3.f24910g.getColorForState(getState(), 0));
        }
        return !i.a(porterDuffColorFilter, this.f24897g0) || !i.a(porterDuffColorFilter2, this.f24898h0);
    }

    public final float N() {
        if (X()) {
            return this.f24893c0.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final void N0() {
        float U2 = U();
        this.O.f24921r = (int) Math.ceil((double) (0.75f * U2));
        this.O.f24922s = (int) Math.ceil((double) (U2 * 0.25f));
        M0();
        Z();
    }

    @o0
    public ColorStateList O() {
        return this.O.f24909f;
    }

    public float P() {
        return this.O.f24915l;
    }

    @o0
    public ColorStateList Q() {
        return this.O.f24910g;
    }

    public float R() {
        return this.O.f24904a.r().a(v());
    }

    public float S() {
        return this.O.f24904a.t().a(v());
    }

    public float T() {
        return this.O.f24919p;
    }

    public float U() {
        return x() + T();
    }

    public final boolean V() {
        d dVar = this.O;
        int i10 = dVar.f24920q;
        return i10 != 1 && dVar.f24921r > 0 && (i10 == 2 || i0());
    }

    public final boolean W() {
        Paint.Style style = this.O.f24925v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean X() {
        Paint.Style style = this.O.f24925v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f24893c0.getStrokeWidth() > 0.0f;
    }

    public void Y(Context context) {
        this.O.f24905b = new r9.a(context);
        N0();
    }

    public final void Z() {
        super.invalidateSelf();
    }

    public boolean a0() {
        r9.a aVar = this.O.f24905b;
        return aVar != null && aVar.l();
    }

    public boolean b0() {
        return this.O.f24905b != null;
    }

    public boolean c0(int i10, int i11) {
        return getTransparentRegion().contains(i10, i11);
    }

    @x0({x0.a.LIBRARY_GROUP})
    public boolean d0() {
        return this.O.f24904a.u(v());
    }

    public void draw(@m0 Canvas canvas) {
        this.f24892b0.setColorFilter(this.f24897g0);
        int alpha = this.f24892b0.getAlpha();
        this.f24892b0.setAlpha(g0(alpha, this.O.f24916m));
        this.f24893c0.setColorFilter(this.f24898h0);
        this.f24893c0.setStrokeWidth(this.O.f24915l);
        int alpha2 = this.f24893c0.getAlpha();
        this.f24893c0.setAlpha(g0(alpha2, this.O.f24916m));
        if (this.S) {
            i();
            g(v(), this.U);
            this.S = false;
        }
        f0(canvas);
        if (W()) {
            p(canvas);
        }
        if (X()) {
            s(canvas);
        }
        this.f24892b0.setAlpha(alpha);
        this.f24893c0.setAlpha(alpha2);
    }

    @Deprecated
    public boolean e0() {
        int i10 = this.O.f24920q;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter f(@d.m0 android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.l(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.j.f(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final void f0(@m0 Canvas canvas) {
        if (V()) {
            canvas.save();
            h0(canvas);
            if (!this.f24900j0) {
                o(canvas);
            } else {
                int width = (int) (this.f24899i0.width() - ((float) getBounds().width()));
                int height = (int) (this.f24899i0.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f24899i0.width()) + (this.O.f24921r * 2) + width, ((int) this.f24899i0.height()) + (this.O.f24921r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f10 = (float) ((getBounds().left - this.O.f24921r) - width);
                float f11 = (float) ((getBounds().top - this.O.f24921r) - height);
                canvas2.translate(-f10, -f11);
                o(canvas2);
                canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
    }

    public final void g(@m0 RectF rectF, @m0 Path path) {
        h(rectF, path);
        if (this.O.f24913j != 1.0f) {
            this.T.reset();
            Matrix matrix = this.T;
            float f10 = this.O.f24913j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.T);
        }
        path.computeBounds(this.f24899i0, true);
    }

    @o0
    public Drawable.ConstantState getConstantState() {
        return this.O;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(@m0 Outline outline) {
        if (this.O.f24920q != 2) {
            if (d0()) {
                outline.setRoundRect(getBounds(), R() * this.O.f24914k);
                return;
            }
            g(v(), this.U);
            if (this.U.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.U);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(@m0 Rect rect) {
        Rect rect2 = this.O.f24912i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @m0
    public o getShapeAppearanceModel() {
        return this.O.f24904a;
    }

    public Region getTransparentRegion() {
        this.Y.set(getBounds());
        g(v(), this.U);
        this.Z.setPath(this.U, this.Y);
        this.Y.op(this.Z, Region.Op.DIFFERENCE);
        return this.Y;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public final void h(@m0 RectF rectF, @m0 Path path) {
        p pVar = this.f24896f0;
        d dVar = this.O;
        o oVar = dVar.f24904a;
        float f10 = dVar.f24914k;
        pVar.e(oVar, f10, rectF, this.f24895e0, path);
    }

    public final void h0(@m0 Canvas canvas) {
        canvas.translate((float) H(), (float) I());
    }

    public final void i() {
        o y10 = getShapeAppearanceModel().y(new b(-N()));
        this.f24891a0 = y10;
        this.f24896f0.d(y10, this.O.f24914k, w(), this.V);
    }

    public boolean i0() {
        return !d0() && !this.U.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public void invalidateSelf() {
        this.S = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.O.f24908e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.O.f24907d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.O.f24910g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.O.f24909f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            z9.j$d r0 = r1.O
            android.content.res.ColorStateList r0 = r0.f24910g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            z9.j$d r0 = r1.O
            android.content.res.ColorStateList r0 = r0.f24909f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            z9.j$d r0 = r1.O
            android.content.res.ColorStateList r0 = r0.f24908e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            z9.j$d r0 = r1.O
            android.content.res.ColorStateList r0 = r0.f24907d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.j.isStateful():boolean");
    }

    @m0
    public final PorterDuffColorFilter j(@m0 ColorStateList colorStateList, @m0 PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void j0(float f10) {
        setShapeAppearanceModel(this.O.f24904a.w(f10));
    }

    @m0
    public final PorterDuffColorFilter k(@o0 ColorStateList colorStateList, @o0 PorterDuff.Mode mode, @m0 Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public void k0(@m0 d dVar) {
        setShapeAppearanceModel(this.O.f24904a.x(dVar));
    }

    @x0({x0.a.LIBRARY_GROUP})
    @l
    public int l(@l int i10) {
        float U2 = U() + B();
        r9.a aVar = this.O.f24905b;
        return aVar != null ? aVar.e(i10, U2) : i10;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void l0(boolean z10) {
        this.f24896f0.n(z10);
    }

    public void m0(float f10) {
        d dVar = this.O;
        if (dVar.f24918o != f10) {
            dVar.f24918o = f10;
            N0();
        }
    }

    @m0
    public Drawable mutate() {
        this.O = new d(this.O);
        return this;
    }

    public void n0(@o0 ColorStateList colorStateList) {
        d dVar = this.O;
        if (dVar.f24907d != colorStateList) {
            dVar.f24907d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(@m0 Canvas canvas) {
        this.R.cardinality();
        if (this.O.f24922s != 0) {
            canvas.drawPath(this.U, this.f24894d0.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.P[i10].b(this.f24894d0, this.O.f24921r, canvas);
            this.Q[i10].b(this.f24894d0, this.O.f24921r, canvas);
        }
        if (this.f24900j0) {
            int H = H();
            int I = I();
            canvas.translate((float) (-H), (float) (-I));
            canvas.drawPath(this.U, f24890q0);
            canvas.translate((float) H, (float) I);
        }
    }

    public void o0(float f10) {
        d dVar = this.O;
        if (dVar.f24914k != f10) {
            dVar.f24914k = f10;
            this.S = true;
            invalidateSelf();
        }
    }

    public void onBoundsChange(Rect rect) {
        this.S = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z10 = L0(iArr) || M0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(@m0 Canvas canvas) {
        r(canvas, this.f24892b0, this.U, this.O.f24904a, v());
    }

    public void p0(int i10, int i11, int i12, int i13) {
        d dVar = this.O;
        if (dVar.f24912i == null) {
            dVar.f24912i = new Rect();
        }
        this.O.f24912i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void q(@m0 Canvas canvas, @m0 Paint paint, @m0 Path path, @m0 RectF rectF) {
        r(canvas, paint, path, this.O.f24904a, rectF);
    }

    public void q0(Paint.Style style) {
        this.O.f24925v = style;
        Z();
    }

    public final void r(@m0 Canvas canvas, @m0 Paint paint, @m0 Path path, @m0 o oVar, @m0 RectF rectF) {
        if (oVar.u(rectF)) {
            float a10 = oVar.t().a(rectF) * this.O.f24914k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void r0(float f10) {
        d dVar = this.O;
        if (dVar.f24917n != f10) {
            dVar.f24917n = f10;
            N0();
        }
    }

    public final void s(@m0 Canvas canvas) {
        r(canvas, this.f24893c0, this.V, this.f24891a0, w());
    }

    public void s0(float f10) {
        d dVar = this.O;
        if (dVar.f24913j != f10) {
            dVar.f24913j = f10;
            invalidateSelf();
        }
    }

    public void setAlpha(@e0(from = 0, to = 255) int i10) {
        d dVar = this.O;
        if (dVar.f24916m != i10) {
            dVar.f24916m = i10;
            Z();
        }
    }

    public void setColorFilter(@o0 ColorFilter colorFilter) {
        this.O.f24906c = colorFilter;
        Z();
    }

    public void setShapeAppearanceModel(@m0 o oVar) {
        this.O.f24904a = oVar;
        invalidateSelf();
    }

    public void setTint(@l int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(@o0 ColorStateList colorStateList) {
        this.O.f24910g = colorStateList;
        M0();
        Z();
    }

    public void setTintMode(@o0 PorterDuff.Mode mode) {
        d dVar = this.O;
        if (dVar.f24911h != mode) {
            dVar.f24911h = mode;
            M0();
            Z();
        }
    }

    public float t() {
        return this.O.f24904a.j().a(v());
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void t0(boolean z10) {
        this.f24900j0 = z10;
    }

    public float u() {
        return this.O.f24904a.l().a(v());
    }

    public void u0(int i10) {
        this.f24894d0.d(i10);
        this.O.f24924u = false;
        Z();
    }

    @m0
    public RectF v() {
        this.W.set(getBounds());
        return this.W;
    }

    public void v0(int i10) {
        d dVar = this.O;
        if (dVar.f24923t != i10) {
            dVar.f24923t = i10;
            Z();
        }
    }

    @m0
    public final RectF w() {
        this.X.set(v());
        float N = N();
        this.X.inset(N, N);
        return this.X;
    }

    public void w0(int i10) {
        d dVar = this.O;
        if (dVar.f24920q != i10) {
            dVar.f24920q = i10;
            Z();
        }
    }

    public float x() {
        return this.O.f24918o;
    }

    @Deprecated
    public void x0(int i10) {
        m0((float) i10);
    }

    @o0
    public ColorStateList y() {
        return this.O.f24907d;
    }

    @Deprecated
    public void y0(boolean z10) {
        w0(z10 ^ true ? 1 : 0);
    }

    public float z() {
        return this.O.f24914k;
    }

    @Deprecated
    public void z0(int i10) {
        this.O.f24921r = i10;
    }
}
