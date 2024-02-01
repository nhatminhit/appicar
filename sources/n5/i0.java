package n5;

import i5.g;
import j5.a;
import java.io.IOException;
import u5.f;
import w4.l;
import w4.p;

@a
public class i0 extends e0<String> {
    public static final long U = 1;
    public static final i0 V = new i0();

    public i0() {
        super((Class<?>) String.class);
    }

    /* renamed from: E0 */
    public String f(l lVar, g gVar) throws IOException {
        String m22;
        if (lVar.q2(p.VALUE_STRING)) {
            return lVar.Y1();
        }
        p P = lVar.P();
        if (P == p.START_ARRAY) {
            return (String) C(lVar, gVar);
        }
        if (P != p.VALUE_EMBEDDED_OBJECT) {
            return (!P.k() || (m22 = lVar.m2()) == null) ? (String) gVar.i0(this.O, lVar) : m22;
        }
        Object p12 = lVar.p1();
        if (p12 == null) {
            return null;
        }
        return p12 instanceof byte[] ? gVar.S().i((byte[]) p12, false) : p12.toString();
    }

    /* renamed from: F0 */
    public String h(l lVar, g gVar, f fVar) throws IOException {
        return f(lVar, gVar);
    }

    public Object n(g gVar) throws i5.l {
        return "";
    }

    public boolean s() {
        return true;
    }
}
