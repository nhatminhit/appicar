package zb;

import android.graphics.Rect;
import yb.x;

public class n extends t {

    /* renamed from: b  reason: collision with root package name */
    public static final String f25088b = "n";

    public float c(x xVar, x xVar2) {
        if (xVar.O <= 0 || xVar.P <= 0) {
            return 0.0f;
        }
        x i10 = xVar.i(xVar2);
        float f10 = (((float) i10.O) * 1.0f) / ((float) xVar.O);
        if (f10 > 1.0f) {
            f10 = (float) Math.pow((double) (1.0f / f10), 1.1d);
        }
        float f11 = ((((float) i10.O) * 1.0f) / ((float) xVar2.O)) + ((((float) i10.P) * 1.0f) / ((float) xVar2.P));
        return f10 * ((1.0f / f11) / f11);
    }

    public Rect d(x xVar, x xVar2) {
        x i10 = xVar.i(xVar2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preview: ");
        sb2.append(xVar);
        sb2.append("; Scaled: ");
        sb2.append(i10);
        sb2.append("; Want: ");
        sb2.append(xVar2);
        int i11 = (i10.O - xVar2.O) / 2;
        int i12 = (i10.P - xVar2.P) / 2;
        return new Rect(-i11, -i12, i10.O - i11, i10.P - i12);
    }
}
