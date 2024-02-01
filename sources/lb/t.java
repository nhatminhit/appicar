package lb;

import java.util.Map;
import qa.a;
import qa.c;
import qa.d;
import qa.e;
import qa.h;
import qa.m;
import qa.r;

public final class t extends y {

    /* renamed from: k  reason: collision with root package name */
    public final y f20493k = new i();

    public static r s(r rVar) throws h {
        String g10 = rVar.g();
        if (g10.charAt(0) == '0') {
            r rVar2 = new r(g10.substring(1), (byte[]) null, rVar.f(), a.UPC_A);
            if (rVar.e() != null) {
                rVar2.i(rVar.e());
            }
            return rVar2;
        }
        throw h.a();
    }

    public r a(c cVar, Map<e, ?> map) throws m, h {
        return s(this.f20493k.a(cVar, map));
    }

    public r b(c cVar) throws m, h {
        return s(this.f20493k.b(cVar));
    }

    public r c(int i10, ya.a aVar, Map<e, ?> map) throws m, h, d {
        return s(this.f20493k.c(i10, aVar, map));
    }

    public int l(ya.a aVar, int[] iArr, StringBuilder sb2) throws m {
        return this.f20493k.l(aVar, iArr, sb2);
    }

    public r m(int i10, ya.a aVar, int[] iArr, Map<e, ?> map) throws m, h, d {
        return s(this.f20493k.m(i10, aVar, iArr, map));
    }

    public a q() {
        return a.UPC_A;
    }
}
