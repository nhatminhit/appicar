package xa;

import lb.a0;
import qa.a;
import qa.r;

public final class t extends u {
    /* renamed from: q */
    public s k(r rVar) {
        a b10 = rVar.b();
        if (b10 != a.UPC_A && b10 != a.UPC_E && b10 != a.EAN_8 && b10 != a.EAN_13) {
            return null;
        }
        String c10 = u.c(rVar);
        if (!u.d(c10, c10.length())) {
            return null;
        }
        return new s(c10, (b10 == a.UPC_E && c10.length() == 8) ? a0.s(c10) : c10);
    }
}
