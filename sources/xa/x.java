package xa;

import qa.r;

public final class x extends u {
    /* renamed from: q */
    public w k(r rVar) {
        String str;
        String c10 = u.c(rVar);
        if (!c10.startsWith("smsto:") && !c10.startsWith("SMSTO:") && !c10.startsWith("mmsto:") && !c10.startsWith("MMSTO:")) {
            return null;
        }
        String substring = c10.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new w(substring, (String) null, (String) null, str);
    }
}
