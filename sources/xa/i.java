package xa;

import java.util.Map;
import java.util.regex.Pattern;
import qa.r;
import w0.d;

public final class i extends u {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f24432g = Pattern.compile(",");

    /* renamed from: q */
    public h k(r rVar) {
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str3;
        String c10 = u.c(rVar);
        String[] strArr4 = null;
        if (c10.startsWith(d.f14357b) || c10.startsWith("MAILTO:")) {
            String substring = c10.substring(7);
            int indexOf = substring.indexOf(63);
            if (indexOf >= 0) {
                substring = substring.substring(0, indexOf);
            }
            try {
                String p10 = u.p(substring);
                String[] split = !p10.isEmpty() ? f24432g.split(p10) : null;
                Map<String, String> m10 = u.m(c10);
                if (m10 != null) {
                    if (split == null && (str3 = m10.get(d.f14359d)) != null) {
                        split = f24432g.split(str3);
                    }
                    String str4 = m10.get(d.f14361f);
                    String[] split2 = str4 != null ? f24432g.split(str4) : null;
                    String str5 = m10.get(d.f14362g);
                    if (str5 != null) {
                        strArr4 = f24432g.split(str5);
                    }
                    str = m10.get("body");
                    strArr3 = split;
                    strArr = strArr4;
                    strArr2 = split2;
                    str2 = m10.get(d.f14363h);
                } else {
                    strArr3 = split;
                    strArr2 = null;
                    strArr = null;
                    str2 = null;
                    str = null;
                }
                return new h(strArr3, strArr2, strArr, str2, str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (!j.s(c10)) {
            return null;
        } else {
            return new h(c10);
        }
    }
}
