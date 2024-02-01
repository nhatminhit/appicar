package gb;

import hb.c;
import java.util.Map;
import qa.d;
import qa.e;
import qa.h;
import qa.m;
import qa.p;
import qa.r;
import qa.s;
import qa.t;
import ya.b;

public final class a implements p {

    /* renamed from: b  reason: collision with root package name */
    public static final t[] f18941b = new t[0];

    /* renamed from: c  reason: collision with root package name */
    public static final int f18942c = 30;

    /* renamed from: d  reason: collision with root package name */
    public static final int f18943d = 33;

    /* renamed from: a  reason: collision with root package name */
    public final c f18944a = new c();

    public static b c(b bVar) throws m {
        int[] m10 = bVar.m();
        if (m10 != null) {
            int i10 = m10[0];
            int i11 = m10[1];
            int i12 = m10[2];
            int i13 = m10[3];
            b bVar2 = new b(30, 33);
            for (int i14 = 0; i14 < 33; i14++) {
                int i15 = (((i14 * i13) + (i13 / 2)) / 33) + i11;
                for (int i16 = 0; i16 < 30; i16++) {
                    if (bVar.j(((((i16 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30) + i10, i15)) {
                        bVar2.w(i16, i14);
                    }
                }
            }
            return bVar2;
        }
        throw m.a();
    }

    public r a(qa.c cVar, Map<e, ?> map) throws m, d, h {
        ya.e c10 = this.f18944a.c(c(cVar.b()), map);
        r rVar = new r(c10.j(), c10.g(), f18941b, qa.a.MAXICODE);
        String b10 = c10.b();
        if (b10 != null) {
            rVar.j(s.ERROR_CORRECTION_LEVEL, b10);
        }
        return rVar;
    }

    public r b(qa.c cVar) throws m, d, h {
        return a(cVar, (Map<e, ?>) null);
    }

    public void reset() {
    }
}
