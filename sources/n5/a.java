package n5;

import i5.g;
import i5.j;
import i5.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import l5.s;
import l5.y;
import u5.f;
import w4.l;

public class a extends f {

    /* renamed from: c0  reason: collision with root package name */
    public static final long f10804c0 = 1;

    public a(j jVar, k<Object> kVar, f fVar, y yVar) {
        super(jVar, kVar, fVar, yVar);
    }

    public a(j jVar, k<Object> kVar, f fVar, y yVar, k<Object> kVar2, s sVar, Boolean bool) {
        super(jVar, kVar, fVar, yVar, kVar2, sVar, bool);
    }

    public a(a aVar) {
        super(aVar);
    }

    public Collection<Object> J0(g gVar) throws IOException {
        return null;
    }

    /* renamed from: L0 */
    public Collection<Object> g(l lVar, g gVar, Collection<Object> collection) throws IOException {
        if (collection != null) {
            return super.g(lVar, gVar, collection);
        }
        if (!lVar.u2()) {
            return M0(lVar, gVar, new ArrayBlockingQueue(1));
        }
        Collection<Object> L0 = super.g(lVar, gVar, new ArrayList());
        return L0.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(L0.size(), false, L0);
    }

    /* renamed from: O0 */
    public a N0(k<?> kVar, k<?> kVar2, f fVar, s sVar, Boolean bool) {
        return new a(this.T, kVar2, fVar, this.Z, kVar, sVar, bool);
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return fVar.d(lVar, gVar);
    }
}
