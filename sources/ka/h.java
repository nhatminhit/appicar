package ka;

import ha.e;
import ha.q;
import ha.u;
import ha.y;
import ha.z;
import ja.b;
import ja.c;
import ja.g;
import ja.k;
import ja.n;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import pa.d;

public final class h implements z {
    public final c O;
    public final boolean P;

    public final class a<K, V> extends y<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final y<K> f20019a;

        /* renamed from: b  reason: collision with root package name */
        public final y<V> f20020b;

        /* renamed from: c  reason: collision with root package name */
        public final k<? extends Map<K, V>> f20021c;

        public a(e eVar, Type type, y<K> yVar, Type type2, y<V> yVar2, k<? extends Map<K, V>> kVar) {
            this.f20019a = new m(eVar, yVar, type);
            this.f20020b = new m(eVar, yVar2, type2);
            this.f20021c = kVar;
        }

        public final String j(ha.k kVar) {
            if (kVar.y()) {
                q q10 = kVar.q();
                if (q10.C()) {
                    return String.valueOf(q10.s());
                }
                if (q10.A()) {
                    return Boolean.toString(q10.f());
                }
                if (q10.D()) {
                    return q10.u();
                }
                throw new AssertionError();
            } else if (kVar.w()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: k */
        public Map<K, V> e(pa.a aVar) throws IOException {
            pa.c z02 = aVar.z0();
            if (z02 == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            Map<K, V> map = (Map) this.f20021c.a();
            if (z02 == pa.c.BEGIN_ARRAY) {
                aVar.c();
                while (aVar.o()) {
                    aVar.c();
                    K e10 = this.f20019a.e(aVar);
                    if (map.put(e10, this.f20020b.e(aVar)) == null) {
                        aVar.k();
                    } else {
                        throw new u("duplicate key: " + e10);
                    }
                }
                aVar.k();
            } else {
                aVar.f();
                while (aVar.o()) {
                    g.f19886a.a(aVar);
                    K e11 = this.f20019a.e(aVar);
                    if (map.put(e11, this.f20020b.e(aVar)) != null) {
                        throw new u("duplicate key: " + e11);
                    }
                }
                aVar.l();
            }
            return map;
        }

        /* renamed from: l */
        public void i(d dVar, Map<K, V> map) throws IOException {
            if (map == null) {
                dVar.N();
            } else if (!h.this.P) {
                dVar.h();
                for (Map.Entry next : map.entrySet()) {
                    dVar.w(String.valueOf(next.getKey()));
                    this.f20020b.i(dVar, next.getValue());
                }
                dVar.l();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry next2 : map.entrySet()) {
                    ha.k h10 = this.f20019a.h(next2.getKey());
                    arrayList.add(h10);
                    arrayList2.add(next2.getValue());
                    z10 |= h10.v() || h10.x();
                }
                if (z10) {
                    dVar.g();
                    int size = arrayList.size();
                    while (i10 < size) {
                        dVar.g();
                        n.b((ha.k) arrayList.get(i10), dVar);
                        this.f20020b.i(dVar, arrayList2.get(i10));
                        dVar.k();
                        i10++;
                    }
                    dVar.k();
                    return;
                }
                dVar.h();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    dVar.w(j((ha.k) arrayList.get(i10)));
                    this.f20020b.i(dVar, arrayList2.get(i10));
                    i10++;
                }
                dVar.l();
            }
        }
    }

    public h(c cVar, boolean z10) {
        this.O = cVar;
        this.P = z10;
    }

    public <T> y<T> a(e eVar, oa.a<T> aVar) {
        Type h10 = aVar.h();
        if (!Map.class.isAssignableFrom(aVar.f())) {
            return null;
        }
        Type[] j10 = b.j(h10, b.k(h10));
        return new a(eVar, j10[0], b(eVar, j10[0]), j10[1], eVar.q(oa.a.c(j10[1])), this.O.a(aVar));
    }

    public final y<?> b(e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f20058f : eVar.q(oa.a.c(type));
    }
}
