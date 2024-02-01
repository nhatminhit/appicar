package lb;

import java.util.Collection;
import java.util.Collections;
import qa.a;

public final class f extends s {
    public static void i(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    public static String j(String str) {
        String str2;
        int i10;
        int i11;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        str2 = "%V";
                    } else if (charAt == '`') {
                        str2 = "%W";
                    } else if (!(charAt == '-' || charAt == '.')) {
                        if (charAt <= 26) {
                            sb2.append('$');
                            i10 = charAt - 1;
                        } else if (charAt < ' ') {
                            sb2.append('%');
                            i10 = charAt - 27;
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb2.append('/');
                            i10 = charAt - '!';
                        } else {
                            if (charAt <= '9') {
                                i11 = (charAt - '0') + 48;
                            } else if (charAt <= '?') {
                                sb2.append('%');
                                i11 = (charAt - ';') + 70;
                            } else if (charAt <= 'Z') {
                                i10 = charAt - 'A';
                            } else if (charAt <= '_') {
                                sb2.append('%');
                                i11 = (charAt - '[') + 75;
                            } else if (charAt <= 'z') {
                                sb2.append('+');
                                i10 = charAt - 'a';
                            } else if (charAt <= 127) {
                                sb2.append('%');
                                i11 = (charAt - '{') + 80;
                            } else {
                                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i12) + "'");
                            }
                            charAt = (char) i11;
                        }
                        i11 = i10 + 65;
                        charAt = (char) i11;
                    }
                }
                sb2.append(charAt);
            } else {
                str2 = "%U";
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    public boolean[] e(String str) {
        int length = str.length();
        if (length <= 80) {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (e.f20453e.indexOf(str.charAt(i10)) < 0) {
                    str = j(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i10++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[((length * 13) + 25)];
            i(148, iArr);
            int c10 = s.c(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int c11 = c10 + s.c(zArr, c10, iArr2, false);
            for (int i11 = 0; i11 < length; i11++) {
                i(e.f20454f[e.f20453e.indexOf(str.charAt(i11))], iArr);
                int c12 = c11 + s.c(zArr, c11, iArr, true);
                c11 = c12 + s.c(zArr, c12, iArr2, false);
            }
            i(148, iArr);
            s.c(zArr, c11, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }

    public Collection<a> g() {
        return Collections.singleton(a.CODE_39);
    }
}
