package pb;

import ib.c;
import java.util.ArrayList;
import java.util.Map;
import qa.d;
import qa.e;
import qa.h;
import qa.m;
import qa.p;
import qa.r;
import qa.s;
import qa.t;
import qb.j;
import sb.a;

public final class b implements p, c {

    /* renamed from: a  reason: collision with root package name */
    public static final r[] f21963a = new r[0];

    public static r[] e(qa.c cVar, Map<e, ?> map, boolean z10) throws m, h, d {
        ArrayList arrayList = new ArrayList();
        sb.b c10 = a.c(cVar, map, z10);
        for (t[] next : c10.b()) {
            ya.e i10 = j.i(c10.a(), next[4], next[5], next[6], next[7], h(next), f(next));
            r rVar = new r(i10.j(), i10.g(), next, qa.a.PDF_417);
            rVar.j(s.ERROR_CORRECTION_LEVEL, i10.b());
            c cVar2 = (c) i10.f();
            if (cVar2 != null) {
                rVar.j(s.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(rVar);
        }
        return (r[]) arrayList.toArray(f21963a);
    }

    public static int f(t[] tVarArr) {
        return Math.max(Math.max(g(tVarArr[0], tVarArr[4]), (g(tVarArr[6], tVarArr[2]) * 17) / 18), Math.max(g(tVarArr[1], tVarArr[5]), (g(tVarArr[7], tVarArr[3]) * 17) / 18));
    }

    public static int g(t tVar, t tVar2) {
        if (tVar == null || tVar2 == null) {
            return 0;
        }
        return (int) Math.abs(tVar.c() - tVar2.c());
    }

    public static int h(t[] tVarArr) {
        return Math.min(Math.min(i(tVarArr[0], tVarArr[4]), (i(tVarArr[6], tVarArr[2]) * 17) / 18), Math.min(i(tVarArr[1], tVarArr[5]), (i(tVarArr[7], tVarArr[3]) * 17) / 18));
    }

    public static int i(t tVar, t tVar2) {
        if (tVar == null || tVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(tVar.c() - tVar2.c());
    }

    public r a(qa.c cVar, Map<e, ?> map) throws m, h, d {
        r rVar;
        r[] e10 = e(cVar, map, false);
        if (e10.length != 0 && (rVar = e10[0]) != null) {
            return rVar;
        }
        throw m.a();
    }

    public r b(qa.c cVar) throws m, h, d {
        return a(cVar, (Map<e, ?>) null);
    }

    public r[] c(qa.c cVar, Map<e, ?> map) throws m {
        try {
            return e(cVar, map, true);
        } catch (d | h unused) {
            throw m.a();
        }
    }

    public r[] d(qa.c cVar) throws m {
        return c(cVar, (Map<e, ?>) null);
    }

    public void reset() {
    }
}
