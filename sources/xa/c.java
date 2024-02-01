package xa;

import p7.f;
import qa.r;

public final class c extends a {
    public static String t(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1) + f.f11698i + str.substring(0, indexOf);
    }

    /* renamed from: s */
    public d k(r rVar) {
        String[] q10;
        String c10 = u.c(rVar);
        if (!c10.startsWith("MECARD:") || (q10 = a.q("N:", c10)) == null) {
            return null;
        }
        String t10 = t(q10[0]);
        String r10 = a.r("SOUND:", c10, true);
        String[] q11 = a.q("TEL:", c10);
        String[] q12 = a.q("EMAIL:", c10);
        String r11 = a.r("NOTE:", c10, false);
        String[] q13 = a.q("ADR:", c10);
        String r12 = a.r("BDAY:", c10, true);
        return new d(u.j(t10), (String[]) null, r10, q11, (String[]) null, q12, (String[]) null, (String) null, r11, q13, (String[]) null, a.r("ORG:", c10, true), !u.d(r12, 8) ? null : r12, (String) null, a.q("URL:", c10), (String[]) null);
    }
}
