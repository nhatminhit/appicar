package n0;

import android.graphics.Path;
import android.graphics.PointF;
import d.m0;
import d.t0;
import d.v;
import java.util.ArrayList;
import java.util.Collection;

public final class q0 {
    @t0(26)
    @m0
    public static Collection<o0> a(@m0 Path path) {
        return b(path, 0.5f);
    }

    @t0(26)
    @m0
    public static Collection<o0> b(@m0 Path path, @v(from = 0.0d) float f10) {
        float[] a10 = path.approximate(f10);
        int length = a10.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = i10 * 3;
            int i12 = (i10 - 1) * 3;
            float f11 = a10[i11];
            float f12 = a10[i11 + 1];
            float f13 = a10[i11 + 2];
            float f14 = a10[i12];
            float f15 = a10[i12 + 1];
            float f16 = a10[i12 + 2];
            if (!(f11 == f14 || (f12 == f15 && f13 == f16))) {
                arrayList.add(new o0(new PointF(f15, f16), f14, new PointF(f12, f13), f11));
            }
        }
        return arrayList;
    }
}
