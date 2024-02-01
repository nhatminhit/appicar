package lf;

import fh.g;
import ve.h;
import xe.l0;
import zd.a2;
import zd.e2;
import zd.h1;
import zd.j2;
import zd.p2;
import zd.t;
import zd.v1;
import zd.x2;
import zd.y;
import zd.y2;
import zd.z1;

@h(name = "UStringsKt")
public final class i0 {
    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final String a(long j10, int i10) {
        return x2.l(j10, d.a(i10));
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final String b(byte b10, int i10) {
        String num = Integer.toString(b10 & 255, d.a(i10));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final String c(int i10, int i11) {
        String l10 = Long.toString(((long) i10) & 4294967295L, d.a(i11));
        l0.o(l10, "toString(this, checkRadix(radix))");
        return l10;
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final String d(short s10, int i10) {
        String num = Integer.toString(s10 & p2.R, d.a(i10));
        l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final byte e(@g String str) {
        l0.p(str, "<this>");
        a2 g10 = g(str);
        if (g10 != null) {
            return g10.j0();
        }
        a0.V0(str);
        throw new y();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final byte f(@g String str, int i10) {
        l0.p(str, "<this>");
        a2 h10 = h(str, i10);
        if (h10 != null) {
            return h10.j0();
        }
        a0.V0(str);
        throw new y();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @fh.h
    public static final a2 g(@g String str) {
        l0.p(str, "<this>");
        return h(str, 10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @fh.h
    public static final a2 h(@g String str, int i10) {
        l0.p(str, "<this>");
        e2 l10 = l(str, i10);
        if (l10 == null) {
            return null;
        }
        int l02 = l10.l0();
        if (Integer.compare(l02 ^ Integer.MIN_VALUE, e2.l(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return a2.b(a2.l((byte) l02));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int i(@g String str) {
        l0.p(str, "<this>");
        e2 k10 = k(str);
        if (k10 != null) {
            return k10.l0();
        }
        a0.V0(str);
        throw new y();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int j(@g String str, int i10) {
        l0.p(str, "<this>");
        e2 l10 = l(str, i10);
        if (l10 != null) {
            return l10.l0();
        }
        a0.V0(str);
        throw new y();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @fh.h
    public static final e2 k(@g String str) {
        l0.p(str, "<this>");
        return l(str, 10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @fh.h
    public static final e2 l(@g String str, int i10) {
        l0.p(str, "<this>");
        d.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = 1;
        if (l0.t(charAt, 48) >= 0) {
            i12 = 0;
        } else if (length == 1 || charAt != '+') {
            return null;
        }
        int l10 = e2.l(i10);
        int i13 = 119304647;
        while (i12 < length) {
            int b10 = d.b(str.charAt(i12), i10);
            if (b10 < 0) {
                return null;
            }
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) > 0) {
                if (i13 == 119304647) {
                    i13 = v1.a(-1, l10);
                    if (Integer.compare(i11 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int l11 = e2.l(i11 * l10);
            int l12 = e2.l(e2.l(b10) + l11);
            if (Integer.compare(l12 ^ Integer.MIN_VALUE, l11 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            i11 = l12;
        }
        return e2.b(i11);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long m(@g String str) {
        l0.p(str, "<this>");
        j2 o10 = o(str);
        if (o10 != null) {
            return o10.l0();
        }
        a0.V0(str);
        throw new y();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long n(@g String str, int i10) {
        l0.p(str, "<this>");
        j2 p10 = p(str, i10);
        if (p10 != null) {
            return p10.l0();
        }
        a0.V0(str);
        throw new y();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @fh.h
    public static final j2 o(@g String str) {
        l0.p(str, "<this>");
        return p(str, 10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @fh.h
    public static final j2 p(@g String str, int i10) {
        String str2 = str;
        int i11 = i10;
        l0.p(str2, "<this>");
        d.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j10 = -1;
        int i12 = 0;
        char charAt = str2.charAt(0);
        if (l0.t(charAt, 48) < 0) {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i12 = 1;
        }
        long l10 = j2.l((long) i11);
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i12 < length) {
            int b10 = d.b(str2.charAt(i12), i11);
            if (b10 < 0) {
                return null;
            }
            if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) > 0) {
                if (j12 == 512409557603043100L) {
                    j12 = z1.a(j10, l10);
                    if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long l11 = j2.l(j11 * l10);
            long l12 = j2.l(j2.l(((long) e2.l(b10)) & 4294967295L) + l11);
            if (Long.compare(l12 ^ Long.MIN_VALUE, l11 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            j11 = l12;
            j10 = -1;
        }
        return j2.b(j11);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final short q(@g String str) {
        l0.p(str, "<this>");
        p2 s10 = s(str);
        if (s10 != null) {
            return s10.j0();
        }
        a0.V0(str);
        throw new y();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final short r(@g String str, int i10) {
        l0.p(str, "<this>");
        p2 t10 = t(str, i10);
        if (t10 != null) {
            return t10.j0();
        }
        a0.V0(str);
        throw new y();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @fh.h
    public static final p2 s(@g String str) {
        l0.p(str, "<this>");
        return t(str, 10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @fh.h
    public static final p2 t(@g String str, int i10) {
        l0.p(str, "<this>");
        e2 l10 = l(str, i10);
        if (l10 == null) {
            return null;
        }
        int l02 = l10.l0();
        if (Integer.compare(l02 ^ Integer.MIN_VALUE, e2.l(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return p2.b(p2.l((short) l02));
    }
}
