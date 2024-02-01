package g3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import k0.l;
import org.xmlpull.v1.XmlPullParser;

public class b extends z {

    /* renamed from: g  reason: collision with root package name */
    public static final float f7647g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public static final float f7648h = 70.0f;

    /* renamed from: i  reason: collision with root package name */
    public static final float f7649i = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a  reason: collision with root package name */
    public float f7650a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f7651b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f7652c = 70.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f7653d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f7654e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f7655f = f7649i;

    public b() {
    }

    @SuppressLint({"RestrictedApi"})
    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f7718j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        g(l.j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        f(l.j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        e(l.j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    public static float h(float f10) {
        if (f10 >= 0.0f && f10 <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f10 / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public Path a(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Path path = new Path();
        path.moveTo(f10, f11);
        float f19 = f12 - f10;
        float f20 = f13 - f11;
        float f21 = (f19 * f19) + (f20 * f20);
        float f22 = (f10 + f12) / 2.0f;
        float f23 = (f11 + f13) / 2.0f;
        float f24 = 0.25f * f21;
        boolean z10 = f11 > f13;
        if (Math.abs(f19) < Math.abs(f20)) {
            float abs = Math.abs(f21 / (f20 * 2.0f));
            if (z10) {
                f16 = abs + f13;
                f15 = f12;
            } else {
                f16 = abs + f11;
                f15 = f10;
            }
            f14 = this.f7654e;
        } else {
            float f25 = f21 / (f19 * 2.0f);
            if (z10) {
                f18 = f11;
                f17 = f25 + f10;
            } else {
                f17 = f12 - f25;
                f18 = f13;
            }
            f14 = this.f7653d;
        }
        float f26 = f24 * f14 * f14;
        float f27 = f22 - f15;
        float f28 = f23 - f16;
        float f29 = (f27 * f27) + (f28 * f28);
        float f30 = this.f7655f;
        float f31 = f24 * f30 * f30;
        if (f29 >= f26) {
            f26 = f29 > f31 ? f31 : 0.0f;
        }
        if (f26 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f26 / f29));
            f15 = ((f15 - f22) * sqrt) + f22;
            f16 = f23 + (sqrt * (f16 - f23));
        }
        path.cubicTo((f10 + f15) / 2.0f, (f11 + f16) / 2.0f, (f15 + f12) / 2.0f, (f16 + f13) / 2.0f, f12, f13);
        return path;
    }

    public float b() {
        return this.f7652c;
    }

    public float c() {
        return this.f7650a;
    }

    public float d() {
        return this.f7651b;
    }

    public void e(float f10) {
        this.f7652c = f10;
        this.f7655f = h(f10);
    }

    public void f(float f10) {
        this.f7650a = f10;
        this.f7653d = h(f10);
    }

    public void g(float f10) {
        this.f7651b = f10;
        this.f7654e = h(f10);
    }
}
