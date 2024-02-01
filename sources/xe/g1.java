package xe;

import hf.d;
import hf.h;
import zd.h1;

public class g1 extends f1 {
    public g1(h hVar, String str, String str2) {
        super(q.U, ((t) hVar).o(), str, str2, (hVar instanceof d) ^ true ? 1 : 0);
    }

    @h1(version = "1.4")
    public g1(Class cls, String str, String str2, int i10) {
        super(q.U, cls, str, str2, i10);
    }

    @h1(version = "1.4")
    public g1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    public Object get(Object obj) {
        return a().c(obj);
    }
}
