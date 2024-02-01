package k5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import q5.f0;
import v4.c0;
import v4.n;
import v4.u;

public class d implements Serializable {
    public static final long U = 1;
    public Map<Class<?>, k> O;
    public u.b P;
    public c0.a Q;
    public f0<?> R;
    public Boolean S;
    public Boolean T;

    public d() {
        this((Map<Class<?>, k>) null, u.b.d(), c0.a.d(), f0.b.w(), (Boolean) null, (Boolean) null);
    }

    @Deprecated
    public d(Map<Class<?>, k> map, u.b bVar, c0.a aVar, f0<?> f0Var, Boolean bool) {
        this(map, bVar, aVar, f0Var, bool, (Boolean) null);
    }

    public d(Map<Class<?>, k> map, u.b bVar, c0.a aVar, f0<?> f0Var, Boolean bool, Boolean bool2) {
        this.O = map;
        this.P = bVar;
        this.Q = aVar;
        this.R = f0Var;
        this.S = bool;
        this.T = bool2;
    }

    public Map<Class<?>, k> a() {
        return new HashMap();
    }

    public d b() {
        Map<Class<?>, k> a10;
        if (this.O == null) {
            a10 = null;
        } else {
            a10 = a();
            for (Map.Entry next : this.O.entrySet()) {
                a10.put(next.getKey(), ((k) next.getValue()).j());
            }
        }
        return new d(a10, this.P, this.Q, this.R, this.S, this.T);
    }

    public n.d c(Class<?> cls) {
        c cVar;
        n.d b10;
        Map<Class<?>, k> map = this.O;
        if (map != null && (cVar = map.get(cls)) != null && (b10 = cVar.b()) != null) {
            return !b10.o() ? b10.y(this.T) : b10;
        }
        Boolean bool = this.T;
        return bool == null ? n.d.c() : n.d.d(bool.booleanValue());
    }

    public k d(Class<?> cls) {
        if (this.O == null) {
            this.O = a();
        }
        k kVar = this.O.get(cls);
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k();
        this.O.put(cls, kVar2);
        return kVar2;
    }

    public c e(Class<?> cls) {
        Map<Class<?>, k> map = this.O;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public u.b f() {
        return this.P;
    }

    public Boolean g() {
        return this.T;
    }

    public Boolean h() {
        return this.S;
    }

    public c0.a i() {
        return this.Q;
    }

    public f0<?> j() {
        return this.R;
    }

    public void k(u.b bVar) {
        this.P = bVar;
    }

    public void l(Boolean bool) {
        this.T = bool;
    }

    public void m(Boolean bool) {
        this.S = bool;
    }

    public void n(c0.a aVar) {
        this.Q = aVar;
    }

    public void o(f0<?> f0Var) {
        this.R = f0Var;
    }
}
