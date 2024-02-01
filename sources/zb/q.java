package zb;

import android.graphics.Rect;
import yb.x;

public class q extends t {

    /* renamed from: b  reason: collision with root package name */
    public static final String f25095b = "q";

    public static float e(float f10) {
        return f10 < 1.0f ? 1.0f / f10 : f10;
    }

    public float c(x xVar, x xVar2) {
        int i10 = xVar.O;
        if (i10 <= 0 || xVar.P <= 0) {
            return 0.0f;
        }
        float e10 = (1.0f / e((((float) i10) * 1.0f) / ((float) xVar2.O))) / e((((float) xVar.P) * 1.0f) / ((float) xVar2.P));
        float e11 = e(((((float) xVar.O) * 1.0f) / ((float) xVar.P)) / ((((float) xVar2.O) * 1.0f) / ((float) xVar2.P)));
        return e10 * (((1.0f / e11) / e11) / e11);
    }

    public Rect d(x xVar, x xVar2) {
        return new Rect(0, 0, xVar2.O, xVar2.P);
    }
}
