package qa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import lb.p;
import ra.b;
import ub.a;

public final class k implements p {

    /* renamed from: c  reason: collision with root package name */
    public static final p[] f22174c = new p[0];

    /* renamed from: a  reason: collision with root package name */
    public Map<e, ?> f22175a;

    /* renamed from: b  reason: collision with root package name */
    public p[] f22176b;

    public r a(c cVar, Map<e, ?> map) throws m {
        e(map);
        return c(cVar);
    }

    public r b(c cVar) throws m {
        e((Map<e, ?>) null);
        return c(cVar);
    }

    public final r c(c cVar) throws m {
        p[] pVarArr = this.f22176b;
        if (pVarArr != null) {
            int length = pVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                try {
                    return pVarArr[i10].a(cVar, this.f22175a);
                } catch (q unused) {
                    i10++;
                }
            }
        }
        throw m.a();
    }

    public r d(c cVar) throws m {
        if (this.f22176b == null) {
            e((Map<e, ?>) null);
        }
        return c(cVar);
    }

    public void e(Map<e, ?> map) {
        this.f22175a = map;
        boolean z10 = true;
        boolean z11 = map != null && map.containsKey(e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(a.UPC_A) && !collection.contains(a.UPC_E) && !collection.contains(a.EAN_13) && !collection.contains(a.EAN_8) && !collection.contains(a.CODABAR) && !collection.contains(a.CODE_39) && !collection.contains(a.CODE_93) && !collection.contains(a.CODE_128) && !collection.contains(a.ITF) && !collection.contains(a.RSS_14) && !collection.contains(a.RSS_EXPANDED)) {
                z10 = false;
            }
            if (z10 && !z11) {
                arrayList.add(new p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new bb.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new pb.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new gb.a());
            }
            if (z10 && z11) {
                arrayList.add(new p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new p(map));
            }
            arrayList.add(new a());
            arrayList.add(new bb.a());
            arrayList.add(new b());
            arrayList.add(new pb.b());
            arrayList.add(new gb.a());
            if (z11) {
                arrayList.add(new p(map));
            }
        }
        this.f22176b = (p[]) arrayList.toArray(f22174c);
    }

    public void reset() {
        p[] pVarArr = this.f22176b;
        if (pVarArr != null) {
            for (p reset : pVarArr) {
                reset.reset();
            }
        }
    }
}
