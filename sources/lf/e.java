package lf;

import fh.g;
import fh.h;
import gf.c;
import gf.m;
import oe.f;
import xe.l0;
import zd.h1;
import zd.r;
import zd.y2;

public class e extends d {
    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    public static final char D(int i10) {
        if (new m(0, 9).q(i10)) {
            return (char) (i10 + 48);
        }
        throw new IllegalArgumentException("Int " + i10 + " is not a decimal digit");
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    public static final char E(int i10, int i11) {
        if (!new m(2, 36).q(i11)) {
            throw new IllegalArgumentException("Invalid radix: " + i11 + ". Valid radix values are in range 2..36");
        } else if (i10 < 0 || i10 >= i11) {
            throw new IllegalArgumentException("Digit " + i10 + " does not represent a valid digit in radix " + i11);
        } else {
            return (char) (i10 < 10 ? i10 + 48 : ((char) (i10 + 65)) - 10);
        }
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    public static final int F(char c10) {
        int b10 = d.b(c10, 10);
        if (b10 >= 0) {
            return b10;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    public static final int G(char c10, int i10) {
        Integer I = I(c10, i10);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=" + i10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @h
    public static final Integer H(char c10) {
        Integer valueOf = Integer.valueOf(d.b(c10, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @h
    public static final Integer I(char c10, int i10) {
        d.a(i10);
        Integer valueOf = Integer.valueOf(d.b(c10, i10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean J(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean K(char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J(c10, c11, z10);
    }

    public static final boolean L(char c10) {
        return new c(55296, 57343).q(c10);
    }

    @f
    public static final String M(char c10, String str) {
        l0.p(str, "other");
        return c10 + str;
    }

    @g
    @h1(version = "1.5")
    public static final String N(char c10) {
        return j0.a(c10);
    }
}
