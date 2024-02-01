package lf;

import fh.g;
import fh.h;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import oe.f;
import we.l;
import xe.l0;
import zd.h1;

public class z extends y {
    @h1(version = "1.2")
    @f
    public static final BigInteger A0(String str, int i10) {
        l0.p(str, "<this>");
        return new BigInteger(str, d.a(i10));
    }

    @h1(version = "1.2")
    @h
    public static final BigInteger B0(@g String str) {
        l0.p(str, "<this>");
        return C0(str, 10);
    }

    @h1(version = "1.2")
    @h
    public static final BigInteger C0(@g String str, int i10) {
        l0.p(str, "<this>");
        d.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i11 = 1;
            }
            while (i11 < length) {
                if (d.b(str.charAt(i11), i10) < 0) {
                    return null;
                }
                i11++;
            }
        } else if (d.b(str.charAt(0), i10) < 0) {
            return null;
        }
        return new BigInteger(str, d.a(i10));
    }

    @h1(version = "1.4")
    @f
    @ve.h(name = "toBooleanNullable")
    public static final boolean E0(String str) {
        return Boolean.parseBoolean(str);
    }

    @f
    public static final byte F0(String str) {
        l0.p(str, "<this>");
        return Byte.parseByte(str);
    }

    @h1(version = "1.1")
    @f
    public static final byte G0(String str, int i10) {
        l0.p(str, "<this>");
        return Byte.parseByte(str, d.a(i10));
    }

    @f
    public static final double H0(String str) {
        l0.p(str, "<this>");
        return Double.parseDouble(str);
    }

    @h1(version = "1.1")
    @h
    public static final Double I0(@g String str) {
        l0.p(str, "<this>");
        try {
            if (r.f20841b.k(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @f
    public static final float J0(String str) {
        l0.p(str, "<this>");
        return Float.parseFloat(str);
    }

    @h1(version = "1.1")
    @h
    public static final Float K0(@g String str) {
        l0.p(str, "<this>");
        try {
            if (r.f20841b.k(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @f
    public static final int L0(String str) {
        l0.p(str, "<this>");
        return Integer.parseInt(str);
    }

    @h1(version = "1.1")
    @f
    public static final int M0(String str, int i10) {
        l0.p(str, "<this>");
        return Integer.parseInt(str, d.a(i10));
    }

    @f
    public static final long N0(String str) {
        l0.p(str, "<this>");
        return Long.parseLong(str);
    }

    @h1(version = "1.1")
    @f
    public static final long O0(String str, int i10) {
        l0.p(str, "<this>");
        return Long.parseLong(str, d.a(i10));
    }

    @f
    public static final short P0(String str) {
        l0.p(str, "<this>");
        return Short.parseShort(str);
    }

    @h1(version = "1.1")
    @f
    public static final short Q0(String str, int i10) {
        l0.p(str, "<this>");
        return Short.parseShort(str, d.a(i10));
    }

    @h1(version = "1.1")
    @f
    public static final String R0(byte b10, int i10) {
        String num = Integer.toString(b10, d.a(d.a(i10)));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @h1(version = "1.1")
    @f
    public static final String S0(int i10, int i11) {
        String num = Integer.toString(i10, d.a(i11));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @h1(version = "1.1")
    @f
    public static final String T0(long j10, int i10) {
        String l10 = Long.toString(j10, d.a(i10));
        l0.o(l10, "toString(this, checkRadix(radix))");
        return l10;
    }

    @h1(version = "1.1")
    @f
    public static final String U0(short s10, int i10) {
        String num = Integer.toString(s10, d.a(d.a(i10)));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    public static final <T> T u0(String str, l<? super String, ? extends T> lVar) {
        try {
            if (r.f20841b.k(str)) {
                return lVar.A(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal v0(String str) {
        l0.p(str, "<this>");
        return new BigDecimal(str);
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal w0(String str, MathContext mathContext) {
        l0.p(str, "<this>");
        l0.p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @h1(version = "1.2")
    @h
    public static final BigDecimal x0(@g String str) {
        l0.p(str, "<this>");
        try {
            if (r.f20841b.k(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @h1(version = "1.2")
    @h
    public static final BigDecimal y0(@g String str, @g MathContext mathContext) {
        l0.p(str, "<this>");
        l0.p(mathContext, "mathContext");
        try {
            if (r.f20841b.k(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger z0(String str) {
        l0.p(str, "<this>");
        return new BigInteger(str);
    }
}
