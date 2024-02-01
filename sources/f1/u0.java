package f1;

import android.view.ScaleGestureDetector;

public final class u0 {
    public static boolean a(ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a((ScaleGestureDetector) obj);
    }

    public static void c(ScaleGestureDetector scaleGestureDetector, boolean z10) {
        scaleGestureDetector.setQuickScaleEnabled(z10);
    }

    @Deprecated
    public static void d(Object obj, boolean z10) {
        c((ScaleGestureDetector) obj, z10);
    }
}
