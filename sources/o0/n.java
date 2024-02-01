package o0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import d.m0;
import d.o0;

public abstract class n extends Drawable {

    /* renamed from: n  reason: collision with root package name */
    public static final int f11013n = 3;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f11014a;

    /* renamed from: b  reason: collision with root package name */
    public int f11015b = 160;

    /* renamed from: c  reason: collision with root package name */
    public int f11016c = 119;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f11017d = new Paint(3);

    /* renamed from: e  reason: collision with root package name */
    public final BitmapShader f11018e;

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f11019f = new Matrix();

    /* renamed from: g  reason: collision with root package name */
    public float f11020g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f11021h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public final RectF f11022i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    public boolean f11023j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11024k;

    /* renamed from: l  reason: collision with root package name */
    public int f11025l;

    /* renamed from: m  reason: collision with root package name */
    public int f11026m;

    public n(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        if (resources != null) {
            this.f11015b = resources.getDisplayMetrics().densityDpi;
        }
        this.f11014a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f11026m = -1;
            this.f11025l = -1;
            bitmapShader = null;
        }
        this.f11018e = bitmapShader;
    }

    public static boolean j(float f10) {
        return f10 > 0.05f;
    }

    public final void a() {
        this.f11025l = this.f11014a.getScaledWidth(this.f11015b);
        this.f11026m = this.f11014a.getScaledHeight(this.f11015b);
    }

    @o0
    public final Bitmap b() {
        return this.f11014a;
    }

    public float c() {
        return this.f11020g;
    }

    public int d() {
        return this.f11016c;
    }

    public void draw(@m0 Canvas canvas) {
        Bitmap bitmap = this.f11014a;
        if (bitmap != null) {
            t();
            if (this.f11017d.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f11021h, this.f11017d);
                return;
            }
            RectF rectF = this.f11022i;
            float f10 = this.f11020g;
            canvas.drawRoundRect(rectF, f10, f10, this.f11017d);
        }
    }

    @m0
    public final Paint e() {
        return this.f11017d;
    }

    public void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f11017d.isAntiAlias();
    }

    public int getAlpha() {
        return this.f11017d.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f11017d.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f11026m;
    }

    public int getIntrinsicWidth() {
        return this.f11025l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r3.f11014a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getOpacity() {
        /*
            r3 = this;
            int r0 = r3.f11016c
            r1 = -3
            r2 = 119(0x77, float:1.67E-43)
            if (r0 != r2) goto L_0x002a
            boolean r0 = r3.f11024k
            if (r0 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            android.graphics.Bitmap r0 = r3.f11014a
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.hasAlpha()
            if (r0 != 0) goto L_0x002a
            android.graphics.Paint r0 = r3.f11017d
            int r0 = r0.getAlpha()
            r2 = 255(0xff, float:3.57E-43)
            if (r0 < r2) goto L_0x002a
            float r0 = r3.f11020g
            boolean r0 = j(r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = -1
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.n.getOpacity():int");
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f11024k;
    }

    public void k(boolean z10) {
        this.f11017d.setAntiAlias(z10);
        invalidateSelf();
    }

    public void l(boolean z10) {
        this.f11024k = z10;
        this.f11023j = true;
        if (z10) {
            s();
            this.f11017d.setShader(this.f11018e);
            invalidateSelf();
            return;
        }
        m(0.0f);
    }

    public void m(float f10) {
        BitmapShader bitmapShader;
        Paint paint;
        if (this.f11020g != f10) {
            this.f11024k = false;
            if (j(f10)) {
                paint = this.f11017d;
                bitmapShader = this.f11018e;
            } else {
                paint = this.f11017d;
                bitmapShader = null;
            }
            paint.setShader(bitmapShader);
            this.f11020g = f10;
            invalidateSelf();
        }
    }

    public void n(int i10) {
        if (this.f11016c != i10) {
            this.f11016c = i10;
            this.f11023j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f11024k) {
            s();
        }
        this.f11023j = true;
    }

    public void p(int i10) {
        if (this.f11015b != i10) {
            if (i10 == 0) {
                i10 = 160;
            }
            this.f11015b = i10;
            if (this.f11014a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@m0 Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@m0 DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    public final void s() {
        this.f11020g = (float) (Math.min(this.f11026m, this.f11025l) / 2);
    }

    public void setAlpha(int i10) {
        if (i10 != this.f11017d.getAlpha()) {
            this.f11017d.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11017d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z10) {
        this.f11017d.setDither(z10);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z10) {
        this.f11017d.setFilterBitmap(z10);
        invalidateSelf();
    }

    public void t() {
        if (this.f11023j) {
            if (this.f11024k) {
                int min = Math.min(this.f11025l, this.f11026m);
                f(this.f11016c, min, min, getBounds(), this.f11021h);
                int min2 = Math.min(this.f11021h.width(), this.f11021h.height());
                this.f11021h.inset(Math.max(0, (this.f11021h.width() - min2) / 2), Math.max(0, (this.f11021h.height() - min2) / 2));
                this.f11020g = ((float) min2) * 0.5f;
            } else {
                f(this.f11016c, this.f11025l, this.f11026m, getBounds(), this.f11021h);
            }
            this.f11022i.set(this.f11021h);
            if (this.f11018e != null) {
                Matrix matrix = this.f11019f;
                RectF rectF = this.f11022i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f11019f.preScale(this.f11022i.width() / ((float) this.f11014a.getWidth()), this.f11022i.height() / ((float) this.f11014a.getHeight()));
                this.f11018e.setLocalMatrix(this.f11019f);
                this.f11017d.setShader(this.f11018e);
            }
            this.f11023j = false;
        }
    }
}
