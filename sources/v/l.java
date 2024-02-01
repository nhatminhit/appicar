package v;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

public abstract class l extends e {

    /* renamed from: z  reason: collision with root package name */
    public static final float f14025z = 20.0f;

    /* renamed from: y  reason: collision with root package name */
    public int f14026y = e.f13910f;

    public void b(HashSet<String> hashSet) {
    }

    public abstract void j(int i10, int i11, float f10, float f11, float f12, float f13);

    public abstract float k();

    public abstract float l();

    public abstract boolean m(int i10, int i11, RectF rectF, RectF rectF2, float f10, float f11);

    public abstract void n(View view, RectF rectF, RectF rectF2, float f10, float f11, String[] strArr, float[] fArr);
}
