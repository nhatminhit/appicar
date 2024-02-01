package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import d.l;
import d.v;
import d.x0;
import f.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class d extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    public static final int f8336m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f8337n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f8338o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f8339p = 3;

    /* renamed from: q  reason: collision with root package name */
    public static final float f8340q = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    public final Paint f8341a;

    /* renamed from: b  reason: collision with root package name */
    public float f8342b;

    /* renamed from: c  reason: collision with root package name */
    public float f8343c;

    /* renamed from: d  reason: collision with root package name */
    public float f8344d;

    /* renamed from: e  reason: collision with root package name */
    public float f8345e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8346f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f8347g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final int f8348h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8349i = false;

    /* renamed from: j  reason: collision with root package name */
    public float f8350j;

    /* renamed from: k  reason: collision with root package name */
    public float f8351k;

    /* renamed from: l  reason: collision with root package name */
    public int f8352l = 2;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public d(Context context) {
        Paint paint = new Paint();
        this.f8341a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, a.n.DrawerArrowToggle, a.c.drawerArrowStyle, a.m.Base_Widget_AppCompat_DrawerArrowToggle);
        p(obtainStyledAttributes.getColor(a.n.DrawerArrowToggle_color, 0));
        o(obtainStyledAttributes.getDimension(a.n.DrawerArrowToggle_thickness, 0.0f));
        t(obtainStyledAttributes.getBoolean(a.n.DrawerArrowToggle_spinBars, true));
        r((float) Math.round(obtainStyledAttributes.getDimension(a.n.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f8348h = obtainStyledAttributes.getDimensionPixelSize(a.n.DrawerArrowToggle_drawableSize, 0);
        this.f8343c = (float) Math.round(obtainStyledAttributes.getDimension(a.n.DrawerArrowToggle_barLength, 0.0f));
        this.f8342b = (float) Math.round(obtainStyledAttributes.getDimension(a.n.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f8344d = obtainStyledAttributes.getDimension(a.n.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float k(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public float a() {
        return this.f8342b;
    }

    public float b() {
        return this.f8344d;
    }

    public float c() {
        return this.f8343c;
    }

    public float d() {
        return this.f8341a.getStrokeWidth();
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i10 = this.f8352l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? o0.d.f(this) == 0 : o0.d.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f8342b;
        float k10 = k(this.f8343c, (float) Math.sqrt((double) (f10 * f10 * 2.0f)), this.f8350j);
        float k11 = k(this.f8343c, this.f8344d, this.f8350j);
        float round = (float) Math.round(k(0.0f, this.f8351k, this.f8350j));
        float k12 = k(0.0f, f8340q, this.f8350j);
        double d10 = (double) k10;
        float k13 = k(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f8350j);
        double d11 = (double) k12;
        boolean z11 = z10;
        float round2 = (float) Math.round(Math.cos(d11) * d10);
        float round3 = (float) Math.round(d10 * Math.sin(d11));
        this.f8347g.rewind();
        float k14 = k(this.f8345e + this.f8341a.getStrokeWidth(), -this.f8351k, this.f8350j);
        float f11 = (-k11) / 2.0f;
        this.f8347g.moveTo(f11 + round, 0.0f);
        this.f8347g.rLineTo(k11 - (round * 2.0f), 0.0f);
        this.f8347g.moveTo(f11, k14);
        this.f8347g.rLineTo(round2, round3);
        this.f8347g.moveTo(f11, -k14);
        this.f8347g.rLineTo(round2, -round3);
        this.f8347g.close();
        canvas.save();
        float strokeWidth = this.f8341a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f12 = this.f8345e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f12))) / 4) * 2)) + (strokeWidth * 1.5f) + f12);
        if (this.f8346f) {
            canvas2.rotate(k13 * ((float) (this.f8349i ^ z11 ? -1 : 1)));
        } else if (z11) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f8347g, this.f8341a);
        canvas.restore();
    }

    @l
    public int e() {
        return this.f8341a.getColor();
    }

    public int f() {
        return this.f8352l;
    }

    public float g() {
        return this.f8345e;
    }

    public int getIntrinsicHeight() {
        return this.f8348h;
    }

    public int getIntrinsicWidth() {
        return this.f8348h;
    }

    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f8341a;
    }

    @v(from = 0.0d, to = 1.0d)
    public float i() {
        return this.f8350j;
    }

    public boolean j() {
        return this.f8346f;
    }

    public void l(float f10) {
        if (this.f8342b != f10) {
            this.f8342b = f10;
            invalidateSelf();
        }
    }

    public void m(float f10) {
        if (this.f8344d != f10) {
            this.f8344d = f10;
            invalidateSelf();
        }
    }

    public void n(float f10) {
        if (this.f8343c != f10) {
            this.f8343c = f10;
            invalidateSelf();
        }
    }

    public void o(float f10) {
        if (this.f8341a.getStrokeWidth() != f10) {
            this.f8341a.setStrokeWidth(f10);
            this.f8351k = (float) (((double) (f10 / 2.0f)) * Math.cos((double) f8340q));
            invalidateSelf();
        }
    }

    public void p(@l int i10) {
        if (i10 != this.f8341a.getColor()) {
            this.f8341a.setColor(i10);
            invalidateSelf();
        }
    }

    public void q(int i10) {
        if (i10 != this.f8352l) {
            this.f8352l = i10;
            invalidateSelf();
        }
    }

    public void r(float f10) {
        if (f10 != this.f8345e) {
            this.f8345e = f10;
            invalidateSelf();
        }
    }

    public void s(@v(from = 0.0d, to = 1.0d) float f10) {
        if (this.f8350j != f10) {
            this.f8350j = f10;
            invalidateSelf();
        }
    }

    public void setAlpha(int i10) {
        if (i10 != this.f8341a.getAlpha()) {
            this.f8341a.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8341a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t(boolean z10) {
        if (this.f8346f != z10) {
            this.f8346f = z10;
            invalidateSelf();
        }
    }

    public void u(boolean z10) {
        if (this.f8349i != z10) {
            this.f8349i = z10;
            invalidateSelf();
        }
    }
}
