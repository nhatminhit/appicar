package ub;

import java.util.List;
import java.util.Map;
import qa.c;
import qa.d;
import qa.h;
import qa.m;
import qa.p;
import qa.r;
import qa.s;
import qa.t;
import vb.e;
import vb.i;
import ya.b;
import ya.g;

public class a implements p {

    /* renamed from: b  reason: collision with root package name */
    public static final t[] f23342b = new t[0];

    /* renamed from: a  reason: collision with root package name */
    public final e f23343a = new e();

    public static b e(b bVar) throws m {
        int[] r10 = bVar.r();
        int[] k10 = bVar.k();
        if (r10 == null || k10 == null) {
            throw m.a();
        }
        float g10 = g(r10, bVar);
        int i10 = r10[1];
        int i11 = k10[1];
        int i12 = r10[0];
        int i13 = k10[0];
        if (i12 >= i13 || i10 >= i11) {
            throw m.a();
        }
        int i14 = i11 - i10;
        if (i14 == i13 - i12 || (i13 = i12 + i14) < bVar.s()) {
            int round = Math.round(((float) ((i13 - i12) + 1)) / g10);
            int round2 = Math.round(((float) (i14 + 1)) / g10);
            if (round <= 0 || round2 <= 0) {
                throw m.a();
            } else if (round2 == round) {
                int i15 = (int) (g10 / 2.0f);
                int i16 = i10 + i15;
                int i17 = i12 + i15;
                int i18 = (((int) (((float) (round - 1)) * g10)) + i17) - i13;
                if (i18 > 0) {
                    if (i18 <= i15) {
                        i17 -= i18;
                    } else {
                        throw m.a();
                    }
                }
                int i19 = (((int) (((float) (round2 - 1)) * g10)) + i16) - i11;
                if (i19 > 0) {
                    if (i19 <= i15) {
                        i16 -= i19;
                    } else {
                        throw m.a();
                    }
                }
                b bVar2 = new b(round, round2);
                for (int i20 = 0; i20 < round2; i20++) {
                    int i21 = ((int) (((float) i20) * g10)) + i16;
                    for (int i22 = 0; i22 < round; i22++) {
                        if (bVar.j(((int) (((float) i22) * g10)) + i17, i21)) {
                            bVar2.w(i22, i20);
                        }
                    }
                }
                return bVar2;
            } else {
                throw m.a();
            }
        } else {
            throw m.a();
        }
    }

    public static float g(int[] iArr, b bVar) throws m {
        int n10 = bVar.n();
        int s10 = bVar.s();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < s10 && i11 < n10) {
            if (z10 != bVar.j(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 != s10 && i11 != n10) {
            return ((float) (i10 - iArr[0])) / 7.0f;
        }
        throw m.a();
    }

    public final r a(c cVar, Map<qa.e, ?> map) throws m, d, h {
        t[] tVarArr;
        ya.e eVar;
        if (map == null || !map.containsKey(qa.e.PURE_BARCODE)) {
            g f10 = new wb.c(cVar.b()).f(map);
            ya.e d10 = this.f23343a.d(f10.a(), map);
            tVarArr = f10.b();
            eVar = d10;
        } else {
            eVar = this.f23343a.d(e(cVar.b()), map);
            tVarArr = f23342b;
        }
        if (eVar.f() instanceof i) {
            ((i) eVar.f()).a(tVarArr);
        }
        r rVar = new r(eVar.j(), eVar.g(), tVarArr, qa.a.QR_CODE);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            rVar.j(s.BYTE_SEGMENTS, a10);
        }
        String b10 = eVar.b();
        if (b10 != null) {
            rVar.j(s.ERROR_CORRECTION_LEVEL, b10);
        }
        if (eVar.k()) {
            rVar.j(s.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.i()));
            rVar.j(s.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.h()));
        }
        return rVar;
    }

    public r b(c cVar) throws m, d, h {
        return a(cVar, (Map<qa.e, ?>) null);
    }

    public final e f() {
        return this.f23343a;
    }

    public void reset() {
    }
}
