package g3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import k0.l;
import n0.n0;
import org.xmlpull.v1.XmlPullParser;

public class b0 extends z {

    /* renamed from: a  reason: collision with root package name */
    public Path f7656a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f7657b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f7658c;

    public b0() {
        Path path = new Path();
        this.f7657b = path;
        this.f7658c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f7656a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public b0(Context context, AttributeSet attributeSet) {
        this.f7657b = new Path();
        this.f7658c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f7719k);
        try {
            String m10 = l.m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m10 != null) {
                d(n0.e(m10));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public b0(Path path) {
        this.f7657b = new Path();
        this.f7658c = new Matrix();
        d(path);
    }

    public static float b(float f10, float f11) {
        return (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
    }

    public Path a(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float b10 = b(f14, f15);
        double atan2 = Math.atan2((double) f15, (double) f14);
        this.f7658c.setScale(b10, b10);
        this.f7658c.postRotate((float) Math.toDegrees(atan2));
        this.f7658c.postTranslate(f10, f11);
        Path path = new Path();
        this.f7657b.transform(this.f7658c, path);
        return path;
    }

    public Path c() {
        return this.f7656a;
    }

    public void d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, (float[]) null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f7658c.setTranslate(-f12, -f13);
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float b10 = 1.0f / b(f14, f15);
        this.f7658c.postScale(b10, b10);
        this.f7658c.postRotate((float) Math.toDegrees(-Math.atan2((double) f15, (double) f14)));
        path.transform(this.f7658c, this.f7657b);
        this.f7656a = path;
    }
}
