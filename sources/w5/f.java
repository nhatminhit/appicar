package w5;

import i5.c;
import java.io.Serializable;
import java.util.HashMap;
import l5.y;
import l5.z;
import z5.b;

public class f extends z.a implements Serializable {
    public static final long P = -8929386427526115130L;
    public HashMap<b, y> O = new HashMap<>();

    public y a(i5.f fVar, c cVar, y yVar) {
        y yVar2 = this.O.get(new b(cVar.x()));
        return yVar2 == null ? yVar : yVar2;
    }

    public f b(Class<?> cls, y yVar) {
        this.O.put(new b(cls), yVar);
        return this;
    }
}
