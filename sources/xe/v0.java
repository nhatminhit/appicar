package xe;

import hf.d;
import hf.h;
import zd.h1;

public class v0 extends u0 {
    public v0(h hVar, String str, String str2) {
        super(q.U, ((t) hVar).o(), str, str2, (hVar instanceof d) ^ true ? 1 : 0);
    }

    @h1(version = "1.4")
    public v0(Class cls, String str, String str2, int i10) {
        super(q.U, cls, str, str2, i10);
    }

    @h1(version = "1.4")
    public v0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    public Object get() {
        return a().c(new Object[0]);
    }

    public void set(Object obj) {
        b().c(obj);
    }
}
