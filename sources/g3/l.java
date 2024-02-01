package g3;

import android.graphics.Rect;
import android.view.ViewGroup;

public class l extends t1 {

    /* renamed from: d  reason: collision with root package name */
    public float f7804d = 3.0f;

    public static float h(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (float) Math.sqrt((double) ((f14 * f14) + (f15 * f15)));
    }

    public long c(ViewGroup viewGroup, j0 j0Var, r0 r0Var, r0 r0Var2) {
        int i10;
        int i11;
        int i12;
        if (r0Var == null && r0Var2 == null) {
            return 0;
        }
        if (r0Var2 == null || e(r0Var) == 0) {
            i10 = -1;
        } else {
            r0Var = r0Var2;
            i10 = 1;
        }
        int f10 = f(r0Var);
        int g10 = g(r0Var);
        Rect N = j0Var.N();
        if (N != null) {
            i12 = N.centerX();
            i11 = N.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i11 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i12 = round;
        }
        float h10 = h((float) f10, (float) g10, (float) i12, (float) i11) / h(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long M = j0Var.M();
        if (M < 0) {
            M = 300;
        }
        return (long) Math.round((((float) (M * ((long) i10))) / this.f7804d) * h10);
    }

    public void i(float f10) {
        if (f10 != 0.0f) {
            this.f7804d = f10;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
}
