package lf;

import fh.g;
import gf.m;
import java.util.Locale;
import oe.f;
import xe.l0;
import zd.a1;
import zd.b1;
import zd.h1;
import zd.k;
import zd.l;
import zd.r;
import zd.y2;

public class d {
    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final String A(char c10) {
        String valueOf = String.valueOf(c10);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    public static final String B(char c10, @g Locale locale) {
        l0.p(locale, "locale");
        String valueOf = String.valueOf(c10);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final char C(char c10) {
        return Character.toUpperCase(c10);
    }

    @a1
    public static final int a(int i10) {
        if (new m(2, 36).q(i10)) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new m(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit(c10, i10);
    }

    @g
    public static final a c(char c10) {
        return a.Q.a(Character.getType(c10));
    }

    @g
    public static final b d(char c10) {
        return b.P.b(Character.getDirectionality(c10));
    }

    @f
    public static final boolean e(char c10) {
        return Character.isDefined(c10);
    }

    @f
    public static final boolean f(char c10) {
        return Character.isDigit(c10);
    }

    @f
    public static final boolean g(char c10) {
        return Character.isHighSurrogate(c10);
    }

    @f
    public static final boolean h(char c10) {
        return Character.isISOControl(c10);
    }

    @f
    public static final boolean i(char c10) {
        return Character.isIdentifierIgnorable(c10);
    }

    @f
    public static final boolean j(char c10) {
        return Character.isJavaIdentifierPart(c10);
    }

    @f
    public static final boolean k(char c10) {
        return Character.isJavaIdentifierStart(c10);
    }

    @f
    public static final boolean l(char c10) {
        return Character.isLetter(c10);
    }

    @f
    public static final boolean m(char c10) {
        return Character.isLetterOrDigit(c10);
    }

    @f
    public static final boolean n(char c10) {
        return Character.isLowSurrogate(c10);
    }

    @f
    public static final boolean o(char c10) {
        return Character.isLowerCase(c10);
    }

    @f
    public static final boolean p(char c10) {
        return Character.isTitleCase(c10);
    }

    @f
    public static final boolean q(char c10) {
        return Character.isUpperCase(c10);
    }

    public static final boolean r(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final String s(char c10) {
        String valueOf = String.valueOf(c10);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    public static final String t(char c10, @g Locale locale) {
        l0.p(locale, "locale");
        String valueOf = String.valueOf(c10);
        l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final char u(char c10) {
        return Character.toLowerCase(c10);
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    public static final String v(char c10, @g Locale locale) {
        l0.p(locale, "locale");
        String B = B(c10, locale);
        if (B.length() <= 1) {
            String valueOf = String.valueOf(c10);
            l0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !l0.g(B, upperCase) ? B : String.valueOf(Character.toTitleCase(c10));
        } else if (c10 == 329) {
            return B;
        } else {
            char charAt = B.charAt(0);
            l0.n(B, "null cannot be cast to non-null type java.lang.String");
            String substring = B.substring(1);
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final char w(char c10) {
        return Character.toTitleCase(c10);
    }

    @l(warningSince = "1.5")
    @f
    @k(message = "Use lowercaseChar() instead.", replaceWith = @b1(expression = "lowercaseChar()", imports = {}))
    public static final char x(char c10) {
        return Character.toLowerCase(c10);
    }

    @l(warningSince = "1.5")
    @f
    @k(message = "Use titlecaseChar() instead.", replaceWith = @b1(expression = "titlecaseChar()", imports = {}))
    public static final char y(char c10) {
        return Character.toTitleCase(c10);
    }

    @l(warningSince = "1.5")
    @f
    @k(message = "Use uppercaseChar() instead.", replaceWith = @b1(expression = "uppercaseChar()", imports = {}))
    public static final char z(char c10) {
        return Character.toUpperCase(c10);
    }
}
