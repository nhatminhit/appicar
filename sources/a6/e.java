package a6;

import i5.j;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import q5.i;
import v4.u;

public class e {
    public static Object a(j jVar) {
        Class<?> g10 = jVar.g();
        Class<?> i02 = h.i0(g10);
        if (i02 != null) {
            return h.m(i02);
        }
        if (jVar.o() || jVar.v()) {
            return u.a.NON_EMPTY;
        }
        if (g10 == String.class) {
            return "";
        }
        if (jVar.Y(Date.class)) {
            return new Date(0);
        }
        if (!jVar.Y(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0);
        return gregorianCalendar;
    }

    public static boolean b(i iVar) {
        String L;
        Class<?> g10 = iVar.g();
        if (!g10.isArray() || (L = h.L(g10.getComponentType())) == null || !L.contains(".cglib")) {
            return false;
        }
        return L.startsWith("net.sf.cglib") || L.startsWith("org.hibernate.repackage.cglib") || L.startsWith("org.springframework.cglib");
    }

    public static boolean c(i iVar) {
        String L = h.L(iVar.g());
        return L != null && L.startsWith("groovy.lang");
    }

    public static boolean d(i iVar) {
        String L = h.L(iVar.E(0));
        return L != null && L.startsWith("groovy.lang");
    }

    public static String e(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char charAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        while (true) {
            i10++;
            if (i10 >= length) {
                break;
            }
            char charAt2 = str.charAt(i10);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb2.append(str, i10, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    public static String f(i iVar, boolean z10) {
        String f10 = iVar.f();
        String g10 = g(iVar, f10, z10);
        return g10 == null ? i(iVar, f10, z10) : g10;
    }

    public static String g(i iVar, String str, boolean z10) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> g10 = iVar.g();
        if (g10 == Boolean.class || g10 == Boolean.TYPE) {
            return z10 ? k(str, 2) : e(str, 2);
        }
        return null;
    }

    public static String h(i iVar, String str, boolean z10) {
        String f10 = iVar.f();
        if (!f10.startsWith(str)) {
            return null;
        }
        int length = str.length();
        return z10 ? k(f10, length) : e(f10, length);
    }

    public static String i(i iVar, String str, boolean z10) {
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (b(iVar)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && c(iVar)) {
            return null;
        }
        return z10 ? k(str, 3) : e(str, 3);
    }

    @Deprecated
    public static String j(i iVar, boolean z10) {
        String h10 = h(iVar, "set", z10);
        if (h10 == null) {
            return null;
        }
        if (!"metaClass".equals(h10) || !d(iVar)) {
            return h10;
        }
        return null;
    }

    public static String k(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char charAt = str.charAt(i10);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i10);
        }
        int i11 = i10 + 1;
        if (i11 < length && Character.isUpperCase(str.charAt(i11))) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        sb2.append(str, i11, length);
        return sb2.toString();
    }
}
