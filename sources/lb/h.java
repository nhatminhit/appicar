package lb;

import java.util.Collection;
import java.util.Collections;
import qa.a;

public class h extends s {
    @Deprecated
    public static int c(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            zArr[i10] = iArr[i11] != 0;
            i11++;
            i10 = i12;
        }
        return 9;
    }

    public static int i(boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            boolean z10 = true;
            int i13 = i10 + i12;
            if (((1 << (8 - i12)) & i11) == 0) {
                z10 = false;
            }
            zArr[i13] = z10;
        }
        return 9;
    }

    public static int j(String str, int i10) {
        int i11 = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i11 += g.f20460c.indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i10) {
                i12 = 1;
            }
        }
        return i11 % 47;
    }

    public static String k(String str) {
        int i10;
        String str2;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length << 1);
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == 0) {
                str2 = "bU";
            } else {
                if (charAt <= 26) {
                    sb2.append('a');
                    i10 = (charAt + 'A') - 1;
                } else if (charAt <= 31) {
                    sb2.append('b');
                    i10 = (charAt + 'A') - 27;
                } else {
                    if (!(charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+')) {
                        if (charAt <= ',') {
                            sb2.append('c');
                            i10 = (charAt + 'A') - 33;
                        } else if (charAt > '9') {
                            if (charAt == ':') {
                                str2 = "cZ";
                            } else if (charAt <= '?') {
                                sb2.append('b');
                                i10 = (charAt + 'F') - 59;
                            } else if (charAt == '@') {
                                str2 = "bV";
                            } else if (charAt > 'Z') {
                                if (charAt <= '_') {
                                    sb2.append('b');
                                    i10 = (charAt + 'K') - 91;
                                } else if (charAt == '`') {
                                    str2 = "bW";
                                } else if (charAt <= 'z') {
                                    sb2.append('d');
                                    i10 = (charAt + 'A') - 97;
                                } else if (charAt <= 127) {
                                    sb2.append('b');
                                    i10 = (charAt + 'P') - 123;
                                } else {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
                                }
                            }
                        }
                    }
                    sb2.append(charAt);
                }
                charAt = (char) i10;
                sb2.append(charAt);
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    public boolean[] e(String str) {
        String k10 = k(str);
        int length = k10.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[(((k10.length() + 2 + 2) * 9) + 1)];
            int i10 = i(zArr, 0, g.f20463f);
            for (int i11 = 0; i11 < length; i11++) {
                i10 += i(zArr, i10, g.f20462e[g.f20460c.indexOf(k10.charAt(i11))]);
            }
            int j10 = j(k10, 20);
            int[] iArr = g.f20462e;
            int i12 = i10 + i(zArr, i10, iArr[j10]);
            int i13 = i12 + i(zArr, i12, iArr[j(k10 + g.f20460c.charAt(j10), 15)]);
            zArr[i13 + i(zArr, i13, g.f20463f)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
    }

    public Collection<a> g() {
        return Collections.singleton(a.CODE_93);
    }
}
