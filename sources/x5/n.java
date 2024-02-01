package x5;

import com.fasterxml.jackson.databind.ser.c;
import com.fasterxml.jackson.databind.ser.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class n extends l implements Serializable {
    public static final long R = 1;
    public final Map<String, com.fasterxml.jackson.databind.ser.n> O;
    public com.fasterxml.jackson.databind.ser.n P;
    public boolean Q;

    public n() {
        this(new HashMap());
    }

    public n(Map<String, ?> map) {
        this.Q = true;
        for (Object obj : map.values()) {
            if (!(obj instanceof com.fasterxml.jackson.databind.ser.n)) {
                this.O = d(map);
                return;
            }
        }
        this.O = map;
    }

    public static final com.fasterxml.jackson.databind.ser.n c(c cVar) {
        return m.j(cVar);
    }

    public static final Map<String, com.fasterxml.jackson.databind.ser.n> d(Map<String, ?> map) {
        Object key;
        com.fasterxml.jackson.databind.ser.n c10;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            if (value instanceof com.fasterxml.jackson.databind.ser.n) {
                key = next.getKey();
                c10 = (com.fasterxml.jackson.databind.ser.n) value;
            } else if (value instanceof c) {
                key = next.getKey();
                c10 = c((c) value);
            } else {
                throw new IllegalArgumentException("Unrecognized filter type (" + value.getClass().getName() + ")");
            }
            hashMap.put(key, c10);
        }
        return hashMap;
    }

    @Deprecated
    public c a(Object obj) {
        throw new UnsupportedOperationException("Access to deprecated filters not supported");
    }

    public com.fasterxml.jackson.databind.ser.n b(Object obj, Object obj2) {
        com.fasterxml.jackson.databind.ser.n nVar = this.O.get(obj);
        if (nVar != null || (nVar = this.P) != null || !this.Q) {
            return nVar;
        }
        throw new IllegalArgumentException("No filter configured with id '" + obj + "' (type " + obj.getClass().getName() + ")");
    }

    @Deprecated
    public n e(String str, c cVar) {
        this.O.put(str, c(cVar));
        return this;
    }

    public n f(String str, com.fasterxml.jackson.databind.ser.n nVar) {
        this.O.put(str, nVar);
        return this;
    }

    public n g(String str, m mVar) {
        this.O.put(str, mVar);
        return this;
    }

    public com.fasterxml.jackson.databind.ser.n h() {
        return this.P;
    }

    public com.fasterxml.jackson.databind.ser.n i(String str) {
        return this.O.remove(str);
    }

    @Deprecated
    public n j(c cVar) {
        this.P = m.j(cVar);
        return this;
    }

    public n k(com.fasterxml.jackson.databind.ser.n nVar) {
        this.P = nVar;
        return this;
    }

    public n l(m mVar) {
        this.P = mVar;
        return this;
    }

    public n m(boolean z10) {
        this.Q = z10;
        return this;
    }

    public boolean n() {
        return this.Q;
    }
}
