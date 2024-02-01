package xa;

import p7.f;
import qa.r;

public final class k0 extends u {
    /* renamed from: q */
    public j0 k(r rVar) {
        String substring;
        String g10;
        String str;
        boolean z10;
        String c10 = u.c(rVar);
        if (!c10.startsWith("WIFI:") || (g10 = u.g("S:", substring, f.f11697h, false)) == null || g10.isEmpty()) {
            return null;
        }
        String g11 = u.g("P:", (substring = c10.substring(5)), f.f11697h, false);
        String g12 = u.g("T:", substring, f.f11697h, false);
        if (g12 == null) {
            g12 = "nopass";
        }
        String str2 = g12;
        String g13 = u.g("PH2:", substring, f.f11697h, false);
        String g14 = u.g("H:", substring, f.f11697h, false);
        if (g14 == null) {
            str = g13;
        } else if (g13 != null || "true".equalsIgnoreCase(g14) || "false".equalsIgnoreCase(g14)) {
            str = g13;
            z10 = Boolean.parseBoolean(g14);
            return new j0(str2, g10, g11, z10, u.g("I:", substring, f.f11697h, false), u.g("A:", substring, f.f11697h, false), u.g("E:", substring, f.f11697h, false), str);
        } else {
            str = g14;
        }
        z10 = false;
        return new j0(str2, g10, g11, z10, u.g("I:", substring, f.f11697h, false), u.g("A:", substring, f.f11697h, false), u.g("E:", substring, f.f11697h, false), str);
    }
}
