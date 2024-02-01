package xa;

import qa.r;

public final class f extends a {
    /* renamed from: s */
    public c0 k(r rVar) {
        String g10 = rVar.g();
        if (!g10.startsWith("MEBKM:")) {
            return null;
        }
        String r10 = a.r("TITLE:", g10, true);
        String[] q10 = a.q("URL:", g10);
        if (q10 == null) {
            return null;
        }
        String str = q10[0];
        if (d0.q(str)) {
            return new c0(str, r10);
        }
        return null;
    }
}
