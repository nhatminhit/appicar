package mh;

import hh.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import jh.h;

public class i {

    public static class a extends IllegalStateException {
        public a(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    public static c a(Collection<h> collection, Collection<h> collection2) {
        c cVar = new c();
        for (h next : collection) {
            boolean z10 = false;
            Iterator<h> it = collection2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (next.equals(it.next())) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z10) {
                cVar.add(next);
            }
        }
        return cVar;
    }

    public static c b(String str, Iterable<h> iterable) {
        d.h(str);
        d.j(iterable);
        d t10 = h.t(str);
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (h d10 : iterable) {
            Iterator it = d(t10, d10).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (!identityHashMap.containsKey(hVar)) {
                    arrayList.add(hVar);
                    identityHashMap.put(hVar, Boolean.TRUE);
                }
            }
        }
        return new c((List<h>) arrayList);
    }

    public static c c(String str, h hVar) {
        d.h(str);
        return d(h.t(str), hVar);
    }

    public static c d(d dVar, h hVar) {
        d.j(dVar);
        d.j(hVar);
        return a.a(dVar, hVar);
    }

    public static h e(String str, h hVar) {
        d.h(str);
        return a.b(h.t(str), hVar);
    }
}
