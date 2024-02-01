package xa;

import java.util.ArrayList;
import p7.f;
import qa.r;

public final class e extends a {
    public static String s(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + f.f11698i + str2;
    }

    public static String[] t(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    /* renamed from: u */
    public d k(r rVar) {
        String c10 = u.c(rVar);
        if (!c10.startsWith("BIZCARD:")) {
            return null;
        }
        String s10 = s(a.r("N:", c10, true), a.r("X:", c10, true));
        String r10 = a.r("T:", c10, true);
        String r11 = a.r("C:", c10, true);
        return new d(u.j(s10), (String[]) null, (String) null, t(a.r("B:", c10, true), a.r("M:", c10, true), a.r("F:", c10, true)), (String[]) null, u.j(a.r("E:", c10, true)), (String[]) null, (String) null, (String) null, a.q("A:", c10), (String[]) null, r11, (String) null, r10, (String[]) null, (String[]) null);
    }
}
