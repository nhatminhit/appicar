package w5;

import i5.f;
import i5.j;
import i5.p;
import java.io.Serializable;
import java.util.HashMap;
import l5.r;
import z5.b;

public class c implements r, Serializable {
    public static final long P = 1;
    public HashMap<b, p> O = null;

    public p a(j jVar, f fVar, i5.c cVar) {
        HashMap<b, p> hashMap = this.O;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(new b(jVar.g()));
    }

    public c b(Class<?> cls, p pVar) {
        if (this.O == null) {
            this.O = new HashMap<>();
        }
        this.O.put(new b(cls), pVar);
        return this;
    }
}
