package bb;

import cb.d;
import java.util.List;
import java.util.Map;
import qa.c;
import qa.e;
import qa.h;
import qa.m;
import qa.p;
import qa.r;
import qa.s;
import qa.t;
import ya.b;
import ya.g;

public final class a implements p {

    /* renamed from: b  reason: collision with root package name */
    public static final t[] f16181b = new t[0];

    /* renamed from: a  reason: collision with root package name */
    public final d f16182a = new d();

    public static b c(b bVar) throws m {
        int[] r10 = bVar.r();
        int[] k10 = bVar.k();
        if (r10 == null || k10 == null) {
            throw m.a();
        }
        int d10 = d(r10, bVar);
        int i10 = r10[1];
        int i11 = k10[1];
        int i12 = r10[0];
        int i13 = ((k10[0] - i12) + 1) / d10;
        int i14 = ((i11 - i10) + 1) / d10;
        if (i13 <= 0 || i14 <= 0) {
            throw m.a();
        }
        int i15 = d10 / 2;
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        b bVar2 = new b(i13, i14);
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i18 * d10) + i16;
            for (int i20 = 0; i20 < i13; i20++) {
                if (bVar.j((i20 * d10) + i17, i19)) {
                    bVar2.w(i20, i18);
                }
            }
        }
        return bVar2;
    }

    public static int d(int[] iArr, b bVar) throws m {
        int s10 = bVar.s();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < s10 && bVar.j(i10, i11)) {
            i10++;
        }
        if (i10 != s10) {
            int i12 = i10 - iArr[0];
            if (i12 != 0) {
                return i12;
            }
            throw m.a();
        }
        throw m.a();
    }

    public r a(c cVar, Map<e, ?> map) throws m, qa.d, h {
        t[] tVarArr;
        ya.e eVar;
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            g b10 = new db.a(cVar.b()).b();
            ya.e b11 = this.f16182a.b(b10.a());
            tVarArr = b10.b();
            eVar = b11;
        } else {
            eVar = this.f16182a.b(c(cVar.b()));
            tVarArr = f16181b;
        }
        r rVar = new r(eVar.j(), eVar.g(), tVarArr, qa.a.DATA_MATRIX);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            rVar.j(s.BYTE_SEGMENTS, a10);
        }
        String b12 = eVar.b();
        if (b12 != null) {
            rVar.j(s.ERROR_CORRECTION_LEVEL, b12);
        }
        return rVar;
    }

    public r b(c cVar) throws m, qa.d, h {
        return a(cVar, (Map<e, ?>) null);
    }

    public void reset() {
    }
}
