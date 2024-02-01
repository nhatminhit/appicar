package be;

import hf.o;
import java.util.Map;
import oe.f;
import ve.h;
import xe.l0;

@h(name = "MapAccessorsKt")
public final class u0 {
    @f
    public static final <V, V1 extends V> V1 a(Map<? super String, ? extends V> map, Object obj, o<?> oVar) {
        l0.p(map, "<this>");
        l0.p(oVar, "property");
        return y0.a(map, oVar.getName());
    }

    @f
    @h(name = "getVar")
    public static final <V, V1 extends V> V1 b(Map<? super String, ? extends V> map, Object obj, o<?> oVar) {
        l0.p(map, "<this>");
        l0.p(oVar, "property");
        return y0.a(map, oVar.getName());
    }

    @f
    public static final <V> void c(Map<? super String, ? super V> map, Object obj, o<?> oVar, V v10) {
        l0.p(map, "<this>");
        l0.p(oVar, "property");
        map.put(oVar.getName(), v10);
    }
}
