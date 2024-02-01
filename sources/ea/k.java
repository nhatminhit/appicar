package ea;

import android.graphics.Path;
import android.graphics.PointF;
import d.m0;
import g3.z;

public final class k extends z {
    public static PointF b(float f10, float f11, float f12, float f13) {
        return f11 > f13 ? new PointF(f12, f11) : new PointF(f10, f13);
    }

    @m0
    public Path a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        PointF b10 = b(f10, f11, f12, f13);
        path.quadTo(b10.x, b10.y, f12, f13);
        return path;
    }
}
