package i5;

import java.io.Serializable;
import k5.i;
import q5.l;

public class z implements Serializable {
    public static final z O;
    public static final z P;
    public static final z Q = new z();
    public static final z R = new b();
    public static final z S = new a();
    public static final z T = new d();
    @Deprecated
    public static final z U;
    @Deprecated
    public static final z V;

    public static class a extends f {
        public String e(String str) {
            return f.f(str, '-');
        }
    }

    public static class b extends f {
        public String e(String str) {
            return str.toLowerCase();
        }
    }

    @Deprecated
    public static class c extends g {
    }

    public static class d extends f {
        public String e(String str) {
            return f.f(str, '.');
        }
    }

    @Deprecated
    public static class e extends h {
    }

    public static abstract class f extends z {
        public static String f(String str, char c10) {
            int length;
            if (str == null || (length = str.length()) == 0) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder((length >> 1) + length);
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                char lowerCase = Character.toLowerCase(charAt);
                if (lowerCase == charAt) {
                    if (i10 > 1) {
                        sb2.insert(sb2.length() - 1, c10);
                    }
                    i10 = 0;
                } else {
                    if (i10 == 0 && i11 > 0) {
                        sb2.append(c10);
                    }
                    i10++;
                }
                sb2.append(lowerCase);
            }
            return sb2.toString();
        }

        public String a(i<?> iVar, l lVar, String str) {
            return e(str);
        }

        public String b(i<?> iVar, q5.f fVar, String str) {
            return e(str);
        }

        public String c(i<?> iVar, q5.i iVar2, String str) {
            return e(str);
        }

        public String d(i<?> iVar, q5.i iVar2, String str) {
            return e(str);
        }

        public abstract String e(String str);
    }

    public static class g extends f {
        public String e(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length * 2);
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (i11 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z10 && i10 > 0 && sb2.charAt(i10 - 1) != '_') {
                            sb2.append('_');
                            i10++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sb2.append(charAt);
                    i10++;
                }
            }
            return i10 > 0 ? sb2.toString() : str;
        }
    }

    public static class h extends f {
        public String e(String str) {
            char charAt;
            char upperCase;
            if (str == null || str.length() == 0 || (charAt = str.charAt(0)) == (upperCase = Character.toUpperCase(charAt))) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(str);
            sb2.setCharAt(0, upperCase);
            return sb2.toString();
        }
    }

    static {
        g gVar = new g();
        O = gVar;
        h hVar = new h();
        P = hVar;
        U = gVar;
        V = hVar;
    }

    public String a(i<?> iVar, l lVar, String str) {
        return str;
    }

    public String b(i<?> iVar, q5.f fVar, String str) {
        return str;
    }

    public String c(i<?> iVar, q5.i iVar2, String str) {
        return str;
    }

    public String d(i<?> iVar, q5.i iVar2, String str) {
        return str;
    }
}
