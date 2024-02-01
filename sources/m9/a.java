package m9;

import android.graphics.Canvas;
import android.graphics.RectF;
import d.m0;
import d.o0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public class a {
    public static int a(@m0 Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    public static int b(@m0 Canvas canvas, @o0 RectF rectF, int i10) {
        return canvas.saveLayerAlpha(rectF, i10);
    }
}
