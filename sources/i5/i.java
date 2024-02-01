package i5;

import a6.h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class i {

    public static class a extends i implements Serializable {
        public static final long P = 1;
        public final Map<String, Object> O;

        public a() {
            this(new HashMap());
        }

        public a(Map<String, Object> map) {
            this.O = map;
        }

        public Object a(Object obj, g gVar, d dVar, Object obj2) throws l {
            if (!(obj instanceof String)) {
                gVar.A(h.i(obj), String.format("Unrecognized inject value id type (%s), expecting String", new Object[]{h.h(obj)}));
            }
            String str = (String) obj;
            Object obj3 = this.O.get(str);
            if (obj3 != null || this.O.containsKey(str)) {
                return obj3;
            }
            throw new IllegalArgumentException("No injectable id with value '" + str + "' found (for property '" + dVar.getName() + "')");
        }

        public a b(Class<?> cls, Object obj) {
            this.O.put(cls.getName(), obj);
            return this;
        }

        public a c(String str, Object obj) {
            this.O.put(str, obj);
            return this;
        }
    }

    public abstract Object a(Object obj, g gVar, d dVar, Object obj2) throws l;
}
