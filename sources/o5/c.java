package o5;

import w4.j;
import w4.l;

public class c extends f {
    public static final long W = 1;
    public final Object V;

    @Deprecated
    public c(String str, Object obj, Class<?> cls) {
        super((l) null, str);
        this.V = obj;
        this.U = cls;
    }

    @Deprecated
    public c(String str, j jVar, Object obj, Class<?> cls) {
        super((l) null, str, jVar);
        this.V = obj;
        this.U = cls;
    }

    public c(l lVar, String str, Object obj, Class<?> cls) {
        super(lVar, str, cls);
        this.V = obj;
    }

    public static c E(l lVar, String str, Object obj, Class<?> cls) {
        return new c(lVar, str, obj, cls);
    }

    public Object F() {
        return this.V;
    }
}
