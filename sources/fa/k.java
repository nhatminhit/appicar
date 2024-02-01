package fa;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import d.m0;
import d.t0;

@t0(21)
public final class k extends PathMotion {
    public static PointF a(float f10, float f11, float f12, float f13) {
        return f11 > f13 ? new PointF(f12, f11) : new PointF(f10, f13);
    }

    @m0
    public Path getPath(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        PointF a10 = a(f10, f11, f12, f13);
        path.quadTo(a10.x, a10.y, f12, f13);
        return path;
    }
}
