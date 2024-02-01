package j3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import d.x0;
import k0.l;
import n0.n0;
import org.xmlpull.v1.XmlPullParser;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class g implements Interpolator {

    /* renamed from: c  reason: collision with root package name */
    public static final float f9444c = 0.002f;

    /* renamed from: d  reason: collision with root package name */
    public static final int f9445d = 3000;

    /* renamed from: e  reason: collision with root package name */
    public static final double f9446e = 1.0E-5d;

    /* renamed from: a  reason: collision with root package name */
    public float[] f9447a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f9448b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s10 = l.s(resources, theme, attributeSet, a.f9407r0);
        d(s10, xmlPullParser);
        s10.recycle();
    }

    public final void a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        b(path);
    }

    public final void b(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(f9445d, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f9447a = new float[min];
            this.f9448b = new float[min];
            float[] fArr = new float[2];
            for (int i11 = 0; i11 < min; i11++) {
                pathMeasure.getPosTan((((float) i11) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f9447a[i11] = fArr[0];
                this.f9448b[i11] = fArr[1];
            }
            if (((double) Math.abs(this.f9447a[0])) <= 1.0E-5d && ((double) Math.abs(this.f9448b[0])) <= 1.0E-5d) {
                int i12 = min - 1;
                if (((double) Math.abs(this.f9447a[i12] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f9448b[i12] - 1.0f)) <= 1.0E-5d) {
                    float f10 = 0.0f;
                    int i13 = 0;
                    while (i10 < min) {
                        float[] fArr2 = this.f9447a;
                        int i14 = i13 + 1;
                        float f11 = fArr2[i13];
                        if (f11 >= f10) {
                            fArr2[i10] = f11;
                            i10++;
                            f10 = f11;
                            i13 = i14;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f11);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f9447a[0]);
            sb2.append(",");
            sb2.append(this.f9448b[0]);
            sb2.append(" end:");
            int i15 = min - 1;
            sb2.append(this.f9447a[i15]);
            sb2.append(",");
            sb2.append(this.f9448b[i15]);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    public final void c(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        b(path);
    }

    public final void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (l.r(xmlPullParser, "pathData")) {
            String m10 = l.m(typedArray, xmlPullParser, "pathData", 4);
            Path e10 = n0.e(m10);
            if (e10 != null) {
                b(e10);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m10);
        } else if (!l.r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (l.r(xmlPullParser, "controlY1")) {
            float j10 = l.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float j11 = l.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean r10 = l.r(xmlPullParser, "controlX2");
            if (r10 != l.r(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!r10) {
                c(j10, j11);
            } else {
                a(j10, j11, l.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), l.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int i10 = 0;
        int length = this.f9447a.length - 1;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.f9447a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f9447a;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f9448b[i10];
        }
        float[] fArr2 = this.f9448b;
        float f14 = fArr2[i10];
        return f14 + (((f10 - f12) / f13) * (fArr2[length] - f14));
    }
}
