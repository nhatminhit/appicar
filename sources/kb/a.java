package kb;

import java.util.ArrayList;
import java.util.Map;
import qa.e;
import qa.m;
import qa.q;
import qa.u;
import wb.c;
import ya.b;
import ya.g;

public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final g[] f20092c = new g[0];

    public a(b bVar) {
        super(bVar);
    }

    public g[] n(Map<e, ?> map) throws m {
        wb.g[] u10 = new b(h(), map == null ? null : (u) map.get(e.NEED_RESULT_POINT_CALLBACK)).u(map);
        if (u10.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (wb.g j10 : u10) {
                try {
                    arrayList.add(j(j10));
                } catch (q unused) {
                }
            }
            return arrayList.isEmpty() ? f20092c : (g[]) arrayList.toArray(f20092c);
        }
        throw m.a();
    }
}
