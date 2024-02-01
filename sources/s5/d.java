package s5;

import java.util.HashMap;
import java.util.Map;
import v4.i0;
import v4.k;

public enum d {
    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    OBJECT,
    ARRAY,
    NULL,
    ANY;
    
    public static final Map<String, d> W = null;

    /* access modifiers changed from: public */
    static {
        int i10;
        W = new HashMap();
        for (d dVar : values()) {
            W.put(dVar.name().toLowerCase(), dVar);
        }
    }

    @k
    public static d a(String str) {
        return W.get(str);
    }

    @i0
    public String b() {
        return name().toLowerCase();
    }
}
