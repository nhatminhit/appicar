package w3;

import d.m0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t4.k;
import w3.e;

public class f {

    /* renamed from: b  reason: collision with root package name */
    public static final e.a<?> f14605b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, e.a<?>> f14606a = new HashMap();

    public class a implements e.a<Object> {
        @m0
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @m0
        public e<Object> b(@m0 Object obj) {
            return new b(obj);
        }
    }

    public static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f14607a;

        public b(@m0 Object obj) {
            this.f14607a = obj;
        }

        @m0
        public Object a() {
            return this.f14607a;
        }

        public void b() {
        }
    }

    @m0
    public synchronized <T> e<T> a(@m0 T t10) {
        e.a<?> aVar;
        k.d(t10);
        aVar = this.f14606a.get(t10.getClass());
        if (aVar == null) {
            Iterator<e.a<?>> it = this.f14606a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.a<?> next = it.next();
                if (next.a().isAssignableFrom(t10.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f14605b;
        }
        return aVar.b(t10);
    }

    public synchronized void b(@m0 e.a<?> aVar) {
        this.f14606a.put(aVar.a(), aVar);
    }
}
