package m5;

import a6.a;
import i5.g;
import i5.k;
import i5.l;
import java.io.Serializable;
import l5.s;

public class p implements s, Serializable {
    public static final long P = 1;
    public final k<?> O;

    public p(k<?> kVar) {
        this.O = kVar;
    }

    public a c() {
        return a.DYNAMIC;
    }

    public Object d(g gVar) throws l {
        return this.O.n(gVar);
    }
}
