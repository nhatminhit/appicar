package h1;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class b {
    public static Interpolator a(float f10, float f11) {
        return new PathInterpolator(f10, f11);
    }

    public static Interpolator b(float f10, float f11, float f12, float f13) {
        return new PathInterpolator(f10, f11, f12, f13);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
