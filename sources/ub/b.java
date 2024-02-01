package ub;

import java.util.Map;
import qa.a;
import qa.g;
import qa.v;
import qa.w;
import xb.c;
import xb.f;

public final class b implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23344a = 4;

    public static ya.b c(f fVar, int i10, int i11, int i12) {
        xb.b c10 = fVar.c();
        if (c10 != null) {
            int e10 = c10.e();
            int d10 = c10.d();
            int i13 = i12 << 1;
            int i14 = e10 + i13;
            int i15 = i13 + d10;
            int max = Math.max(i10, i14);
            int max2 = Math.max(i11, i15);
            int min = Math.min(max / i14, max2 / i15);
            int i16 = (max - (e10 * min)) / 2;
            int i17 = (max2 - (d10 * min)) / 2;
            ya.b bVar = new ya.b(max, max2);
            int i18 = 0;
            while (i18 < d10) {
                int i19 = 0;
                int i20 = i16;
                while (i19 < e10) {
                    if (c10.b(i19, i18) == 1) {
                        bVar.x(i20, i17, min, min);
                    }
                    i19++;
                    i20 += min;
                }
                i18++;
                i17 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public ya.b a(String str, a aVar, int i10, int i11) throws w {
        return b(str, aVar, i10, i11, (Map<g, ?>) null);
    }

    public ya.b b(String str, a aVar, int i10, int i11, Map<g, ?> map) throws w {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        } else if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        } else {
            vb.f fVar = vb.f.L;
            int i12 = 4;
            if (map != null) {
                g gVar = g.ERROR_CORRECTION;
                if (map.containsKey(gVar)) {
                    fVar = vb.f.valueOf(map.get(gVar).toString());
                }
                g gVar2 = g.MARGIN;
                if (map.containsKey(gVar2)) {
                    i12 = Integer.parseInt(map.get(gVar2).toString());
                }
            }
            return c(c.p(str, fVar, map), i10, i11, i12);
        }
    }
}
