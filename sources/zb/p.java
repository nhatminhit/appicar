package zb;

import android.graphics.Rect;
import yb.x;

public class p extends t {

    /* renamed from: b  reason: collision with root package name */
    public static final String f25094b = "p";

    public float c(x xVar, x xVar2) {
        if (xVar.O <= 0 || xVar.P <= 0) {
            return 0.0f;
        }
        x j10 = xVar.j(xVar2);
        float f10 = (((float) j10.O) * 1.0f) / ((float) xVar.O);
        if (f10 > 1.0f) {
            f10 = (float) Math.pow((double) (1.0f / f10), 1.1d);
        }
        float f11 = ((((float) xVar2.O) * 1.0f) / ((float) j10.O)) * ((((float) xVar2.P) * 1.0f) / ((float) j10.P));
        return f10 * (((1.0f / f11) / f11) / f11);
    }

    public Rect d(x xVar, x xVar2) {
        x j10 = xVar.j(xVar2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preview: ");
        sb2.append(xVar);
        sb2.append("; Scaled: ");
        sb2.append(j10);
        sb2.append("; Want: ");
        sb2.append(xVar2);
        int i10 = (j10.O - xVar2.O) / 2;
        int i11 = (j10.P - xVar2.P) / 2;
        return new Rect(-i10, -i11, j10.O - i10, j10.P - i11);
    }
}
