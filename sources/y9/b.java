package y9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import d.m0;
import d.o0;
import d.x0;
import n0.f0;

@x0({x0.a.LIBRARY_GROUP})
public class b {

    /* renamed from: i  reason: collision with root package name */
    public static final int f24618i = 68;

    /* renamed from: j  reason: collision with root package name */
    public static final int f24619j = 20;

    /* renamed from: k  reason: collision with root package name */
    public static final int f24620k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f24621l = new int[3];

    /* renamed from: m  reason: collision with root package name */
    public static final float[] f24622m = {0.0f, 0.5f, 1.0f};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f24623n = new int[4];

    /* renamed from: o  reason: collision with root package name */
    public static final float[] f24624o = {0.0f, 0.0f, 0.5f, 1.0f};
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final Paint f24625a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Paint f24626b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final Paint f24627c;

    /* renamed from: d  reason: collision with root package name */
    public int f24628d;

    /* renamed from: e  reason: collision with root package name */
    public int f24629e;

    /* renamed from: f  reason: collision with root package name */
    public int f24630f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f24631g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f24632h;

    public b() {
        this(-16777216);
    }

    public b(int i10) {
        this.f24631g = new Path();
        this.f24632h = new Paint();
        this.f24625a = new Paint();
        d(i10);
        this.f24632h.setColor(0);
        Paint paint = new Paint(4);
        this.f24626b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f24627c = new Paint(paint);
    }

    public void a(@m0 Canvas canvas, @o0 Matrix matrix, @m0 RectF rectF, int i10, float f10, float f11) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i11 = i10;
        float f12 = f11;
        boolean z10 = f12 < 0.0f;
        Path path = this.f24631g;
        if (z10) {
            int[] iArr = f24623n;
            iArr[0] = 0;
            iArr[1] = this.f24630f;
            iArr[2] = this.f24629e;
            iArr[3] = this.f24628d;
            float f13 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f10, f12);
            path.close();
            float f14 = (float) (-i11);
            rectF2.inset(f14, f14);
            int[] iArr2 = f24623n;
            iArr2[0] = 0;
            iArr2[1] = this.f24628d;
            iArr2[2] = this.f24629e;
            iArr2[3] = this.f24630f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f15 = 1.0f - (((float) i11) / width);
            float[] fArr = f24624o;
            fArr[1] = f15;
            fArr[2] = ((1.0f - f15) / 2.0f) + f15;
            this.f24626b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f24623n, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z10) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f24632h);
            }
            canvas.drawArc(rectF, f10, f11, true, this.f24626b);
            canvas.restore();
        }
    }

    public void b(@m0 Canvas canvas, @o0 Matrix matrix, @m0 RectF rectF, int i10) {
        rectF.bottom += (float) i10;
        rectF.offset(0.0f, (float) (-i10));
        int[] iArr = f24621l;
        iArr[0] = this.f24630f;
        iArr[1] = this.f24629e;
        iArr[2] = this.f24628d;
        Paint paint = this.f24627c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f24622m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f24627c);
        canvas.restore();
    }

    @m0
    public Paint c() {
        return this.f24625a;
    }

    public void d(int i10) {
        this.f24628d = f0.B(i10, 68);
        this.f24629e = f0.B(i10, 20);
        this.f24630f = f0.B(i10, 0);
        this.f24625a.setColor(this.f24628d);
    }
}
