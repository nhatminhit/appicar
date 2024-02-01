package bb;

import eb.e;
import eb.i;
import eb.j;
import eb.k;
import eb.l;
import java.util.Map;
import qa.a;
import qa.f;
import qa.g;
import qa.v;

public final class b implements v {
    public static ya.b c(xb.b bVar, int i10, int i11) {
        ya.b bVar2;
        int e10 = bVar.e();
        int d10 = bVar.d();
        int max = Math.max(i10, e10);
        int max2 = Math.max(i11, d10);
        int min = Math.min(max / e10, max2 / d10);
        int i12 = (max - (e10 * min)) / 2;
        int i13 = (max2 - (d10 * min)) / 2;
        if (i11 < d10 || i10 < e10) {
            bVar2 = new ya.b(e10, d10);
            i12 = 0;
            i13 = 0;
        } else {
            bVar2 = new ya.b(i10, i11);
        }
        bVar2.d();
        int i14 = 0;
        while (i14 < d10) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < e10) {
                if (bVar.b(i16, i14) == 1) {
                    bVar2.x(i15, i13, min, min);
                }
                i16++;
                i15 += min;
            }
            i14++;
            i13 += min;
        }
        return bVar2;
    }

    public static ya.b d(e eVar, k kVar, int i10, int i11) {
        int i12 = kVar.i();
        int h10 = kVar.h();
        xb.b bVar = new xb.b(kVar.k(), kVar.j());
        int i13 = 0;
        for (int i14 = 0; i14 < h10; i14++) {
            if (i14 % kVar.f18581e == 0) {
                int i15 = 0;
                for (int i16 = 0; i16 < kVar.k(); i16++) {
                    bVar.h(i15, i13, i16 % 2 == 0);
                    i15++;
                }
                i13++;
            }
            int i17 = 0;
            for (int i18 = 0; i18 < i12; i18++) {
                if (i18 % kVar.f18580d == 0) {
                    bVar.h(i17, i13, true);
                    i17++;
                }
                bVar.h(i17, i13, eVar.e(i18, i14));
                i17++;
                int i19 = kVar.f18580d;
                if (i18 % i19 == i19 - 1) {
                    bVar.h(i17, i13, i14 % 2 == 0);
                    i17++;
                }
            }
            i13++;
            int i20 = kVar.f18581e;
            if (i14 % i20 == i20 - 1) {
                int i21 = 0;
                for (int i22 = 0; i22 < kVar.k(); i22++) {
                    bVar.h(i21, i13, true);
                    i21++;
                }
                i13++;
            }
        }
        return c(bVar, i10, i11);
    }

    public ya.b a(String str, a aVar, int i10, int i11) {
        return b(str, aVar, i10, i11, (Map<g, ?>) null);
    }

    public ya.b b(String str, a aVar, int i10, int i11, Map<g, ?> map) {
        f fVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        } else if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i10 + 'x' + i11);
        } else {
            l lVar = l.FORCE_NONE;
            f fVar2 = null;
            if (map != null) {
                l lVar2 = (l) map.get(g.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                f fVar3 = (f) map.get(g.MIN_SIZE);
                if (fVar3 == null) {
                    fVar3 = null;
                }
                fVar = (f) map.get(g.MAX_SIZE);
                if (fVar == null) {
                    fVar = null;
                }
                fVar2 = fVar3;
            } else {
                fVar = null;
            }
            String c10 = j.c(str, lVar, fVar2, fVar);
            k o10 = k.o(c10.length(), lVar, fVar2, fVar, true);
            e eVar = new e(i.b(c10, o10), o10.i(), o10.h());
            eVar.k();
            return d(eVar, o10, i10, i11);
        }
    }
}
