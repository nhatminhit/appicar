package xa;

import qa.a;
import qa.r;

public final class p extends u {
    /* renamed from: q */
    public o k(r rVar) {
        if (rVar.b() != a.EAN_13) {
            return null;
        }
        String c10 = u.c(rVar);
        if (c10.length() != 13) {
            return null;
        }
        if (c10.startsWith("978") || c10.startsWith("979")) {
            return new o(c10);
        }
        return null;
    }
}
