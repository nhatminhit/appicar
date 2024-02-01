package xa;

import qa.r;

public final class a0 extends u {
    /* renamed from: q */
    public z k(r rVar) {
        String str;
        String c10 = u.c(rVar);
        if (!c10.startsWith("tel:") && !c10.startsWith("TEL:")) {
            return null;
        }
        if (c10.startsWith("TEL:")) {
            str = "tel:" + c10.substring(4);
        } else {
            str = c10;
        }
        int indexOf = c10.indexOf(63, 4);
        return new z(indexOf < 0 ? c10.substring(4) : c10.substring(4, indexOf), str, (String) null);
    }
}
