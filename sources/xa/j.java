package xa;

import java.util.regex.Pattern;
import qa.r;

public final class j extends a {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f24435g = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    public static boolean s(String str) {
        return str != null && f24435g.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    /* renamed from: t */
    public h k(r rVar) {
        String[] q10;
        String c10 = u.c(rVar);
        if (!c10.startsWith("MATMSG:") || (q10 = a.q("TO:", c10)) == null) {
            return null;
        }
        for (String s10 : q10) {
            if (!s(s10)) {
                return null;
            }
        }
        return new h(q10, (String[]) null, (String[]) null, a.r("SUB:", c10, false), a.r("BODY:", c10, false));
    }
}
