package zd;

import hf.k;
import hf.l;
import hf.o;
import hf.p;
import hf.q;
import oe.f;
import xe.l0;

public final class z0 {
    @h1(version = "1.4")
    @f
    public static final <V> V a(p<? extends V> pVar, Object obj, o<?> oVar) {
        l0.p(pVar, "<this>");
        l0.p(oVar, "property");
        return pVar.get();
    }

    @h1(version = "1.4")
    @f
    public static final <T, V> V b(q<T, ? extends V> qVar, T t10, o<?> oVar) {
        l0.p(qVar, "<this>");
        l0.p(oVar, "property");
        return qVar.get(t10);
    }

    @h1(version = "1.4")
    @f
    public static final <V> void c(k<V> kVar, Object obj, o<?> oVar, V v10) {
        l0.p(kVar, "<this>");
        l0.p(oVar, "property");
        kVar.set(v10);
    }

    @h1(version = "1.4")
    @f
    public static final <T, V> void d(l<T, V> lVar, T t10, o<?> oVar, V v10) {
        l0.p(lVar, "<this>");
        l0.p(oVar, "property");
        lVar.a0(t10, v10);
    }
}
