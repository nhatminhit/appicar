package ka;

import ha.e;
import ha.y;
import ha.z;
import ja.c;
import ja.k;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import pa.d;

public final class b implements z {
    public final c O;

    public static final class a<E> extends y<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final y<E> f20006a;

        /* renamed from: b  reason: collision with root package name */
        public final k<? extends Collection<E>> f20007b;

        public a(e eVar, Type type, y<E> yVar, k<? extends Collection<E>> kVar) {
            this.f20006a = new m(eVar, yVar, type);
            this.f20007b = kVar;
        }

        /* renamed from: j */
        public Collection<E> e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            Collection<E> collection = (Collection) this.f20007b.a();
            aVar.c();
            while (aVar.o()) {
                collection.add(this.f20006a.e(aVar));
            }
            aVar.k();
            return collection;
        }

        /* renamed from: k */
        public void i(d dVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                dVar.N();
                return;
            }
            dVar.g();
            for (E i10 : collection) {
                this.f20006a.i(dVar, i10);
            }
            dVar.k();
        }
    }

    public b(c cVar) {
        this.O = cVar;
    }

    public <T> y<T> a(e eVar, oa.a<T> aVar) {
        Type h10 = aVar.h();
        Class<? super T> f10 = aVar.f();
        if (!Collection.class.isAssignableFrom(f10)) {
            return null;
        }
        Type h11 = ja.b.h(h10, f10);
        return new a(eVar, h11, eVar.q(oa.a.c(h11)), this.O.a(aVar));
    }
}
