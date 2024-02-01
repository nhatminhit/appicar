package xa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qa.r;

public final class n extends u {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f24465g = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    /* renamed from: q */
    public m k(r rVar) {
        Matcher matcher = f24465g.matcher(u.c(rVar));
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d) {
                if (parseDouble >= -90.0d) {
                    double parseDouble2 = Double.parseDouble(matcher.group(2));
                    if (parseDouble2 <= 180.0d) {
                        if (parseDouble2 >= -180.0d) {
                            double d10 = 0.0d;
                            if (matcher.group(3) != null) {
                                double parseDouble3 = Double.parseDouble(matcher.group(3));
                                if (parseDouble3 < 0.0d) {
                                    return null;
                                }
                                d10 = parseDouble3;
                            }
                            return new m(parseDouble, parseDouble2, d10, group);
                        }
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
