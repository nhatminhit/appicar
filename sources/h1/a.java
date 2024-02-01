package h1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

public class a implements Interpolator {

    /* renamed from: c  reason: collision with root package name */
    public static final float f8818c = 0.002f;

    /* renamed from: a  reason: collision with root package name */
    public final float[] f8819a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f8820b;

    public a(float f10, float f11) {
        this(b(f10, f11));
    }

    public a(float f10, float f11, float f12, float f13) {
        this(a(f10, f11, f12, f13));
    }

    public a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = ((int) (length / 0.002f)) + 1;
        this.f8819a = new float[i10];
        this.f8820b = new float[i10];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < i10; i11++) {
            pathMeasure.getPosTan((((float) i11) * length) / ((float) (i10 - 1)), fArr, (float[]) null);
            this.f8819a[i11] = fArr[0];
            this.f8820b[i11] = fArr[1];
        }
    }

    public static Path a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    public static Path b(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        return path;
    }

    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f8819a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f8819a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f8819a;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f8820b[i10];
        }
        float[] fArr2 = this.f8820b;
        float f14 = fArr2[i10];
        return f14 + (((f10 - f12) / f13) * (fArr2[length] - f14));
    }
}
