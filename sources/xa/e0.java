package xa;

import qa.r;

public final class e0 extends u {
    /* renamed from: q */
    public c0 k(r rVar) {
        int indexOf;
        String c10 = u.c(rVar);
        String str = null;
        if ((!c10.startsWith("urlto:") && !c10.startsWith("URLTO:")) || (indexOf = c10.indexOf(58, 6)) < 0) {
            return null;
        }
        if (indexOf > 6) {
            str = c10.substring(6, indexOf);
        }
        return new c0(c10.substring(indexOf + 1), str);
    }
}
