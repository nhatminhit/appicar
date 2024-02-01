package t9;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import d.e0;
import d.l;
import d.m0;
import d.o0;
import d.q;
import d.x0;
import n0.f0;
import z9.o;
import z9.p;

@x0({x0.a.LIBRARY_GROUP})
public class c extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    public static final float f23102q = 1.3333f;

    /* renamed from: a  reason: collision with root package name */
    public final p f23103a = p.k();
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Paint f23104b;

    /* renamed from: c  reason: collision with root package name */
    public final Path f23105c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f23106d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f23107e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f23108f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final b f23109g = new b();
    @q

    /* renamed from: h  reason: collision with root package name */
    public float f23110h;
    @l

    /* renamed from: i  reason: collision with root package name */
    public int f23111i;
    @l

    /* renamed from: j  reason: collision with root package name */
    public int f23112j;
    @l

    /* renamed from: k  reason: collision with root package name */
    public int f23113k;
    @l

    /* renamed from: l  reason: collision with root package name */
    public int f23114l;
    @l

    /* renamed from: m  reason: collision with root package name */
    public int f23115m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f23116n = true;

    /* renamed from: o  reason: collision with root package name */
    public o f23117o;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f23118p;

    public class b extends Drawable.ConstantState {
        public b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @m0
        public Drawable newDrawable() {
            return c.this;
        }
    }

    public c(o oVar) {
        this.f23117o = oVar;
        Paint paint = new Paint(1);
        this.f23104b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @m0
    public final Shader a() {
        Rect rect = this.f23106d;
        copyBounds(rect);
        float height = this.f23110h / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{f0.t(this.f23111i, this.f23115m), f0.t(this.f23112j, this.f23115m), f0.t(f0.B(this.f23112j, 0), this.f23115m), f0.t(f0.B(this.f23114l, 0), this.f23115m), f0.t(this.f23114l, this.f23115m), f0.t(this.f23113k, this.f23115m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @m0
    public RectF b() {
        this.f23108f.set(getBounds());
        return this.f23108f;
    }

    public o c() {
        return this.f23117o;
    }

    public void d(@o0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f23115m = colorStateList.getColorForState(getState(), this.f23115m);
        }
        this.f23118p = colorStateList;
        this.f23116n = true;
        invalidateSelf();
    }

    public void draw(@m0 Canvas canvas) {
        if (this.f23116n) {
            this.f23104b.setShader(a());
            this.f23116n = false;
        }
        float strokeWidth = this.f23104b.getStrokeWidth() / 2.0f;
        copyBounds(this.f23106d);
        this.f23107e.set(this.f23106d);
        float min = Math.min(this.f23117o.r().a(b()), this.f23107e.width() / 2.0f);
        if (this.f23117o.u(b())) {
            this.f23107e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f23107e, min, min, this.f23104b);
        }
    }

    public void e(@q float f10) {
        if (this.f23110h != f10) {
            this.f23110h = f10;
            this.f23104b.setStrokeWidth(f10 * 1.3333f);
            this.f23116n = true;
            invalidateSelf();
        }
    }

    public void f(@l int i10, @l int i11, @l int i12, @l int i13) {
        this.f23111i = i10;
        this.f23112j = i11;
        this.f23113k = i12;
        this.f23114l = i13;
    }

    public void g(o oVar) {
        this.f23117o = oVar;
        invalidateSelf();
    }

    @o0
    public Drawable.ConstantState getConstantState() {
        return this.f23109g;
    }

    public int getOpacity() {
        return this.f23110h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(@m0 Outline outline) {
        if (this.f23117o.u(b())) {
            outline.setRoundRect(getBounds(), this.f23117o.r().a(b()));
            return;
        }
        copyBounds(this.f23106d);
        this.f23107e.set(this.f23106d);
        this.f23103a.d(this.f23117o, 1.0f, this.f23107e, this.f23105c);
        if (this.f23105c.isConvex()) {
            outline.setConvexPath(this.f23105c);
        }
    }

    public boolean getPadding(@m0 Rect rect) {
        if (!this.f23117o.u(b())) {
            return true;
        }
        int round = Math.round(this.f23110h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f23118p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        this.f23116n = true;
    }

    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f23118p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f23115m)) == this.f23115m)) {
            this.f23116n = true;
            this.f23115m = colorForState;
        }
        if (this.f23116n) {
            invalidateSelf();
        }
        return this.f23116n;
    }

    public void setAlpha(@e0(from = 0, to = 255) int i10) {
        this.f23104b.setAlpha(i10);
        invalidateSelf();
    }

    public void setColorFilter(@o0 ColorFilter colorFilter) {
        this.f23104b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
