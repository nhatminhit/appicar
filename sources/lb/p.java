package lb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import nb.d;
import qa.a;
import qa.e;
import qa.m;
import qa.q;
import qa.r;

public final class p extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final r[] f20488b = new r[0];

    /* renamed from: a  reason: collision with root package name */
    public final r[] f20489a;

    public p(Map<e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        boolean z10 = (map == null || map.get(e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.EAN_13) || collection.contains(a.UPC_A) || collection.contains(a.EAN_8) || collection.contains(a.UPC_E)) {
                arrayList.add(new q(map));
            }
            if (collection.contains(a.CODE_39)) {
                arrayList.add(new e(z10));
            }
            if (collection.contains(a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(a.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(a.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.RSS_14)) {
                arrayList.add(new mb.e());
            }
            if (collection.contains(a.RSS_EXPANDED)) {
                arrayList.add(new d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(map));
            arrayList.add(new e());
            arrayList.add(new a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new n());
            arrayList.add(new mb.e());
            arrayList.add(new d());
        }
        this.f20489a = (r[]) arrayList.toArray(f20488b);
    }

    public r c(int i10, ya.a aVar, Map<e, ?> map) throws m {
        r[] rVarArr = this.f20489a;
        int i11 = 0;
        while (i11 < rVarArr.length) {
            try {
                return rVarArr[i11].c(i10, aVar, map);
            } catch (q unused) {
                i11++;
            }
        }
        throw m.a();
    }

    public void reset() {
        for (r reset : this.f20489a) {
            reset.reset();
        }
    }
}
