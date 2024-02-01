package og;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class e0 {

    /* renamed from: e  reason: collision with root package name */
    public static final String f21519e = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* renamed from: f  reason: collision with root package name */
    public static final String f21520f = "\"([^\"]*)\"";

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f21521g = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f21522h = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f21523a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21524b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21525c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f21526d;

    public e0(String str, String str2, String str3, @Nullable String str4) {
        this.f21523a = str;
        this.f21524b = str2;
        this.f21525c = str3;
        this.f21526d = str4;
    }

    public static e0 c(String str) {
        Matcher matcher = f21521g.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f21522h.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new e0(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    @Nullable
    public static e0 d(String str) {
        try {
            return c(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public Charset a() {
        return b((Charset) null);
    }

    @Nullable
    public Charset b(@Nullable Charset charset) {
        try {
            String str = this.f21526d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public String e() {
        return this.f21525c;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof e0) && ((e0) obj).f21523a.equals(this.f21523a);
    }

    public String f() {
        return this.f21524b;
    }

    public int hashCode() {
        return this.f21523a.hashCode();
    }

    public String toString() {
        return this.f21523a;
    }
}
