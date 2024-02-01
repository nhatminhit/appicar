package y3;

import d.g1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v3.f;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<f, l<?>> f15449a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<f, l<?>> f15450b = new HashMap();

    public l<?> a(f fVar, boolean z10) {
        return c(z10).get(fVar);
    }

    @g1
    public Map<f, l<?>> b() {
        return Collections.unmodifiableMap(this.f15449a);
    }

    public final Map<f, l<?>> c(boolean z10) {
        return z10 ? this.f15450b : this.f15449a;
    }

    public void d(f fVar, l<?> lVar) {
        c(lVar.q()).put(fVar, lVar);
    }

    public void e(f fVar, l<?> lVar) {
        Map<f, l<?>> c10 = c(lVar.q());
        if (lVar.equals(c10.get(fVar))) {
            c10.remove(fVar);
        }
    }
}
