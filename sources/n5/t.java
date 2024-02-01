package n5;

import i5.g;
import java.io.IOException;
import u5.f;
import w4.l;
import w4.p;

public class t extends a0<Object> {
    public static final long T = 1;
    public static final t U = new t();

    public t() {
        super((Class<?>) Object.class);
    }

    public Object f(l lVar, g gVar) throws IOException {
        if (lVar.q2(p.FIELD_NAME)) {
            while (true) {
                p D2 = lVar.D2();
                if (D2 == null || D2 == p.END_OBJECT) {
                    return null;
                }
                lVar.Z2();
            }
        } else {
            lVar.Z2();
            return null;
        }
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        int Q = lVar.Q();
        if (Q == 1 || Q == 3 || Q == 5) {
            return fVar.c(lVar, gVar);
        }
        return null;
    }

    public Boolean u(i5.f fVar) {
        return Boolean.FALSE;
    }
}
