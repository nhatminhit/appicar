package q5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import q5.t;
import z5.b;

public class c0 implements t.a, Serializable {
    public static final long Q = 1;
    public final t.a O;
    public Map<b, Class<?>> P;

    public c0(t.a aVar) {
        this.O = aVar;
    }

    public c0(t.a aVar, Map<b, Class<?>> map) {
        this.O = aVar;
        this.P = map;
    }

    public Class<?> b(Class<?> cls) {
        Map<b, Class<?>> map;
        t.a aVar = this.O;
        Class<?> b10 = aVar == null ? null : aVar.b(cls);
        return (b10 != null || (map = this.P) == null) ? b10 : map.get(new b(cls));
    }

    public void c(Class<?> cls, Class<?> cls2) {
        if (this.P == null) {
            this.P = new HashMap();
        }
        this.P.put(new b(cls), cls2);
    }

    /* renamed from: d */
    public c0 a() {
        t.a aVar = this.O;
        HashMap hashMap = null;
        t.a a10 = aVar == null ? null : aVar.a();
        if (this.P != null) {
            hashMap = new HashMap(this.P);
        }
        return new c0(a10, hashMap);
    }

    public boolean e() {
        if (this.P != null) {
            return true;
        }
        t.a aVar = this.O;
        if (aVar == null) {
            return false;
        }
        if (aVar instanceof c0) {
            return ((c0) aVar).e();
        }
        return true;
    }

    public int f() {
        Map<b, Class<?>> map = this.P;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void g(Map<Class<?>, Class<?>> map) {
        if (map == null || map.isEmpty()) {
            this.P = null;
            return;
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry next : map.entrySet()) {
            hashMap.put(new b((Class) next.getKey()), next.getValue());
        }
        this.P = hashMap;
    }

    public c0 h(t.a aVar) {
        return new c0(aVar, this.P);
    }

    public c0 i() {
        return new c0(this.O, (Map<b, Class<?>>) null);
    }
}
