package k5;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class e {

    public static class a extends e implements Serializable {
        public static final long Q = 1;
        public static final a R = new a(Collections.emptyMap());
        public static final Object S = new Object();
        public final Map<?, ?> O;
        public transient Map<Object, Object> P;

        public a(Map<?, ?> map) {
            this.O = map;
            this.P = null;
        }

        public a(Map<?, ?> map, Map<Object, Object> map2) {
            this.O = map;
            this.P = map2;
        }

        public static e b() {
            return R;
        }

        public Object a(Object obj) {
            Object obj2;
            Map<Object, Object> map = this.P;
            if (map == null || (obj2 = map.get(obj)) == null) {
                return this.O.get(obj);
            }
            if (obj2 == S) {
                return null;
            }
            return obj2;
        }

        public e c(Object obj, Object obj2) {
            if (obj2 == null) {
                if (this.O.containsKey(obj)) {
                    obj2 = S;
                } else {
                    Map<Object, Object> map = this.P;
                    if (map != null && map.containsKey(obj)) {
                        this.P.remove(obj);
                    }
                    return this;
                }
            }
            Map<Object, Object> map2 = this.P;
            if (map2 == null) {
                return h(obj, obj2);
            }
            map2.put(obj, obj2);
            return this;
        }

        public e d(Object obj, Object obj2) {
            Map<Object, Object> hashMap = this == R ? new HashMap<>(8) : g(this.O);
            hashMap.put(obj, obj2);
            return new a(hashMap);
        }

        public e e(Map<?, ?> map) {
            return new a(map);
        }

        public e f(Object obj) {
            if (this.O.isEmpty() || !this.O.containsKey(obj)) {
                return this;
            }
            if (this.O.size() == 1) {
                return R;
            }
            Map<Object, Object> g10 = g(this.O);
            g10.remove(obj);
            return new a(g10);
        }

        public final Map<Object, Object> g(Map<?, ?> map) {
            return new HashMap(map);
        }

        public e h(Object obj, Object obj2) {
            HashMap hashMap = new HashMap();
            if (obj2 == null) {
                obj2 = S;
            }
            hashMap.put(obj, obj2);
            return new a(this.O, hashMap);
        }
    }

    public static e b() {
        return a.b();
    }

    public abstract Object a(Object obj);

    public abstract e c(Object obj, Object obj2);

    public abstract e d(Object obj, Object obj2);

    public abstract e e(Map<?, ?> map);

    public abstract e f(Object obj);
}
