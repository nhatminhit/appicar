package w5;

import i5.c;
import i5.f;
import i5.j;
import i5.k;
import i5.l;
import i5.m;
import i5.p;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import l5.q;
import z5.a;
import z5.d;
import z5.e;
import z5.g;
import z5.i;

public class b extends q.a implements Serializable {
    public static final long Q = 1;
    public HashMap<z5.b, k<?>> O = null;
    public boolean P = false;

    public b() {
    }

    public b(Map<Class<?>, k<?>> map) {
        m(map);
    }

    public k<?> a(a aVar, f fVar, c cVar, u5.f fVar2, k<?> kVar) throws l {
        return k(aVar);
    }

    public k<?> b(e eVar, f fVar, c cVar, u5.f fVar2, k<?> kVar) throws l {
        return k(eVar);
    }

    public k<?> c(g gVar, f fVar, c cVar, p pVar, u5.f fVar2, k<?> kVar) throws l {
        return k(gVar);
    }

    public k<?> d(z5.f fVar, f fVar2, c cVar, p pVar, u5.f fVar3, k<?> kVar) throws l {
        return k(fVar);
    }

    public k<?> e(Class<?> cls, f fVar, c cVar) throws l {
        HashMap<z5.b, k<?>> hashMap = this.O;
        if (hashMap == null) {
            return null;
        }
        k<?> kVar = hashMap.get(new z5.b(cls));
        return (kVar != null || !this.P || !cls.isEnum()) ? kVar : this.O.get(new z5.b(Enum.class));
    }

    public k<?> f(j jVar, f fVar, c cVar) throws l {
        return k(jVar);
    }

    public k<?> g(d dVar, f fVar, c cVar, u5.f fVar2, k<?> kVar) throws l {
        return k(dVar);
    }

    public k<?> h(Class<? extends m> cls, f fVar, c cVar) throws l {
        HashMap<z5.b, k<?>> hashMap = this.O;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(new z5.b(cls));
    }

    public k<?> i(i iVar, f fVar, c cVar, u5.f fVar2, k<?> kVar) throws l {
        return k(iVar);
    }

    public boolean j(f fVar, Class<?> cls) {
        HashMap<z5.b, k<?>> hashMap = this.O;
        return hashMap != null && hashMap.containsKey(new z5.b(cls));
    }

    public final k<?> k(j jVar) {
        HashMap<z5.b, k<?>> hashMap = this.O;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(new z5.b(jVar.g()));
    }

    public <T> void l(Class<T> cls, k<? extends T> kVar) {
        z5.b bVar = new z5.b(cls);
        if (this.O == null) {
            this.O = new HashMap<>();
        }
        this.O.put(bVar, kVar);
        if (cls == Enum.class) {
            this.P = true;
        }
    }

    public void m(Map<Class<?>, k<?>> map) {
        for (Map.Entry next : map.entrySet()) {
            l((Class) next.getKey(), (k) next.getValue());
        }
    }
}
