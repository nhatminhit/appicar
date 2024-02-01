package lf;

import b6.c;
import fh.g;
import fh.h;
import xe.l0;
import zd.h1;

public class a0 extends z {
    @g
    public static final Void V0(@g String str) {
        l0.p(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    @h1(version = "1.1")
    @h
    public static final Byte W0(@g String str) {
        l0.p(str, "<this>");
        return X0(str, 10);
    }

    @h1(version = "1.1")
    @h
    public static final Byte X0(@g String str, int i10) {
        int intValue;
        l0.p(str, "<this>");
        Integer Z0 = Z0(str, i10);
        if (Z0 == null || (intValue = Z0.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @h1(version = "1.1")
    @h
    public static final Integer Y0(@g String str) {
        l0.p(str, "<this>");
        return Z0(str, 10);
    }

    @h1(version = "1.1")
    @h
    public static final Integer Z0(@g String str, int i10) {
        boolean z10;
        int i11;
        l0.p(str, "<this>");
        d.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = -2147483647;
        int i14 = 1;
        if (l0.t(charAt, 48) >= 0) {
            z10 = false;
            i14 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i13 = Integer.MIN_VALUE;
                z10 = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z10 = false;
            }
        }
        int i15 = -59652323;
        while (i14 < length) {
            int b10 = d.b(str.charAt(i14), i10);
            if (b10 < 0) {
                return null;
            }
            if ((i12 < i15 && (i15 != -59652323 || i12 < (i15 = i13 / i10))) || (i11 = i12 * i10) < i13 + b10) {
                return null;
            }
            i12 = i11 - b10;
            i14++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    @h1(version = "1.1")
    @h
    public static final Long a1(@g String str) {
        l0.p(str, "<this>");
        return b1(str, 10);
    }

    @h1(version = "1.1")
    @h
    public static final Long b1(@g String str, int i10) {
        String str2 = str;
        int i11 = i10;
        l0.p(str2, "<this>");
        d.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str2.charAt(0);
        int t10 = l0.t(charAt, 48);
        long j10 = c.f4201b;
        boolean z10 = true;
        if (t10 >= 0) {
            z10 = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j10 = Long.MIN_VALUE;
                i12 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z10 = false;
                i12 = 1;
            }
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i12 < length) {
            int b10 = d.b(str2.charAt(i12), i11);
            if (b10 < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / ((long) i11);
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * ((long) i11);
            long j15 = (long) b10;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i12++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }

    @h1(version = "1.1")
    @h
    public static final Short c1(@g String str) {
        l0.p(str, "<this>");
        return d1(str, 10);
    }

    @h1(version = "1.1")
    @h
    public static final Short d1(@g String str, int i10) {
        int intValue;
        l0.p(str, "<this>");
        Integer Z0 = Z0(str, i10);
        if (Z0 == null || (intValue = Z0.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}
