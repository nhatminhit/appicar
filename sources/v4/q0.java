package v4;

import java.util.HashMap;
import java.util.Map;
import v4.l0;

public class q0 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    public Map<l0.a, Object> f14174a;

    public void a(l0.a aVar, Object obj) {
        Map<l0.a, Object> map = this.f14174a;
        if (map == null) {
            this.f14174a = new HashMap();
        } else if (map.containsKey(aVar)) {
            throw new IllegalStateException("Already had POJO for id (" + aVar.Q.getClass().getName() + ") [" + aVar + "]");
        }
        this.f14174a.put(aVar, obj);
    }

    public Object b(l0.a aVar) {
        Map<l0.a, Object> map = this.f14174a;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public n0 c(Object obj) {
        return new q0();
    }

    public boolean d(n0 n0Var) {
        return n0Var.getClass() == getClass();
    }
}
