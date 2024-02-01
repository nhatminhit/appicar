package oh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import d.m0;
import d.v;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public float f21789a;

    /* renamed from: b  reason: collision with root package name */
    public Shader f21790b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f21791c = new RectF();

    public a(@v(from = 0.0d) float f10) {
        f(f10);
    }

    public void a(Canvas canvas, Paint paint, Bitmap bitmap) {
        if (this.f21789a == 0.0f) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f21791c, paint);
            return;
        }
        if (this.f21790b == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f21790b = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            RectF rectF = this.f21791c;
            matrix.setTranslate(rectF.left, rectF.top);
            matrix.preScale(this.f21791c.width() / ((float) bitmap.getWidth()), this.f21791c.height() / ((float) bitmap.getHeight()));
            this.f21790b.setLocalMatrix(matrix);
        }
        paint.setShader(this.f21790b);
        RectF rectF2 = this.f21791c;
        float f10 = this.f21789a;
        canvas.drawRoundRect(rectF2, f10, f10, paint);
    }

    public void b(Rect rect) {
        this.f21791c.set(rect);
        this.f21790b = null;
    }

    @m0
    public RectF c() {
        return this.f21791c;
    }

    @v(from = 0.0d)
    public float d() {
        return this.f21789a;
    }

    public void e(@v(from = 0.0d) float f10) {
        f(f10);
    }

    public final void f(@v(from = 0.0d) float f10) {
        float max = Math.max(0.0f, f10);
        if (max != this.f21789a) {
            this.f21789a = max;
            this.f21790b = null;
        }
    }
}
