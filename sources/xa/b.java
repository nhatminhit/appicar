package xa;

import java.util.ArrayList;
import qa.r;

public final class b extends u {
    public static String[] q(String str, String str2) {
        ArrayList arrayList = null;
        for (int i10 = 1; i10 <= 3; i10++) {
            String g10 = u.g(str + i10 + ':', str2, 13, true);
            if (g10 == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(3);
            }
            arrayList.add(g10);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(u.f24476f);
    }

    /* renamed from: r */
    public d k(r rVar) {
        String c10 = u.c(rVar);
        String[] strArr = null;
        if (!c10.contains("MEMORY") || !c10.contains("\r\n")) {
            return null;
        }
        String g10 = u.g("NAME1:", c10, 13, true);
        String g11 = u.g("NAME2:", c10, 13, true);
        String[] q10 = q("TEL", c10);
        String[] q11 = q("MAIL", c10);
        String g12 = u.g("MEMORY:", c10, 13, false);
        String g13 = u.g("ADD:", c10, 13, true);
        if (g13 != null) {
            strArr = new String[]{g13};
        }
        return new d(u.j(g10), (String[]) null, g11, q10, (String[]) null, q11, (String[]) null, (String) null, g12, strArr, (String[]) null, (String) null, (String) null, (String) null, (String[]) null, (String[]) null);
    }
}
