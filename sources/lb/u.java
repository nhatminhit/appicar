package lb;

import java.util.Map;
import qa.a;
import qa.g;
import qa.v;
import ya.b;

public final class u implements v {

    /* renamed from: a  reason: collision with root package name */
    public final j f20494a = new j();

    public b a(String str, a aVar, int i10, int i11) {
        return b(str, aVar, i10, i11, (Map<g, ?>) null);
    }

    public b b(String str, a aVar, int i10, int i11, Map<g, ?> map) {
        if (aVar == a.UPC_A) {
            return this.f20494a.b("0".concat(String.valueOf(str)), a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
