package n5;

import a6.b;
import i5.g;
import i5.x;
import l5.k;
import l5.v;
import l5.y;
import q5.l;
import u5.f;
import v4.d;
import w4.j;

public class p extends y.a {
    public static final long Q = 1;

    public p() {
        super((Class<?>) j.class);
    }

    public static final int F(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }

    public static final long G(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).longValue();
    }

    public static k H(String str, i5.j jVar, int i10) {
        return k.Y(i5.y.a(str), jVar, (i5.y) null, (f) null, (b) null, (l) null, i10, (d.a) null, x.W);
    }

    public v[] A(i5.f fVar) {
        i5.j h10 = fVar.h(Integer.TYPE);
        i5.j h11 = fVar.h(Long.TYPE);
        return new v[]{H("sourceRef", fVar.h(Object.class), 0), H("byteOffset", h11, 1), H("charOffset", h11, 2), H("lineNr", h10, 3), H("columnNr", h10, 4)};
    }

    public boolean f() {
        return true;
    }

    public Object p(g gVar, Object[] objArr) {
        return new j(objArr[0], G(objArr[1]), G(objArr[2]), F(objArr[3]), F(objArr[4]));
    }
}
