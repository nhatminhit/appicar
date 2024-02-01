package xa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qa.r;

public final class d0 extends u {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f24390g = Pattern.compile("[-._~:/?#\\[\\]@!$&'()*+,;=%A-Za-z0-9]+");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f24391h = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f24392i = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f24393j = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    public static boolean q(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = f24392i.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f24393j.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    public static boolean r(String str) {
        return !f24390g.matcher(str).matches() || f24391h.matcher(str).find();
    }

    /* renamed from: s */
    public c0 k(r rVar) {
        String c10 = u.c(rVar);
        if (c10.startsWith("URL:") || c10.startsWith("URI:")) {
            return new c0(c10.substring(4).trim(), (String) null);
        }
        String trim = c10.trim();
        if (!q(trim) || r(trim)) {
            return null;
        }
        return new c0(trim, (String) null);
    }
}
