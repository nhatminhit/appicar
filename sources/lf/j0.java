package lf;

import fh.g;
import java.util.Locale;
import xe.l0;

public final class j0 {
    @g
    public static final String a(char c10) {
        String valueOf = String.valueOf(c10);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        l0.n(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        l0.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return charAt + lowerCase;
    }
}
