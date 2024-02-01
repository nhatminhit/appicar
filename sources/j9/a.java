package j9;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import d.v;
import d.x0;
import z1.b;
import z1.c;

@x0({x0.a.LIBRARY_GROUP})
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f19828a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f19829b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f19830c = new z1.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f19831d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f19832e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static float b(float f10, float f11, @v(from = 0.0d, to = 1.0d) float f12, @v(from = 0.0d, to = 1.0d) float f13, @v(from = 0.0d, to = 1.0d) float f14) {
        return f14 < f12 ? f10 : f14 > f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * ((float) (i11 - i10)));
    }
}
