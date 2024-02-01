package ih;

import hh.d;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import p7.f;
import y3.q;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f19802a = {"", " ", q.a.R, "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b  reason: collision with root package name */
    public static final Stack<StringBuilder> f19803b = new Stack<>();

    /* renamed from: c  reason: collision with root package name */
    public static final int f19804c = 8192;

    /* renamed from: d  reason: collision with root package name */
    public static final int f19805d = 8;

    public static void a(StringBuilder sb2, String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (e(codePointAt)) {
                if ((!z10 || z11) && !z12) {
                    sb2.append(f.f11698i);
                    z12 = true;
                }
            } else if (!g(codePointAt)) {
                sb2.appendCodePoint(codePointAt);
                z12 = false;
                z11 = true;
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static StringBuilder b() {
        StringBuilder sb2;
        Stack<StringBuilder> stack = f19803b;
        synchronized (stack) {
            sb2 = stack.empty() ? new StringBuilder(8192) : stack.pop();
        }
        return sb2;
    }

    public static boolean c(String str, String... strArr) {
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean e(int i10) {
        return i10 == 32 || i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 160;
    }

    public static boolean f(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                if (!i(str.codePointAt(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean g(int i10) {
        return i10 == 8203 || i10 == 173;
    }

    public static boolean h(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(str.codePointAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(int i10) {
        return i10 == 32 || i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13;
    }

    public static String j(Collection collection, String str) {
        return k(collection.iterator(), str);
    }

    public static String k(Iterator it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder b10 = b();
        b10.append(obj);
        while (it.hasNext()) {
            b10.append(str);
            b10.append(it.next());
        }
        return o(b10);
    }

    public static String l(String[] strArr, String str) {
        return j(Arrays.asList(strArr), str);
    }

    public static String m(String str) {
        StringBuilder b10 = b();
        a(b10, str, false);
        return o(b10);
    }

    public static String n(int i10) {
        if (i10 >= 0) {
            String[] strArr = f19802a;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
            char[] cArr = new char[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cArr[i11] = f.f11698i;
            }
            return String.valueOf(cArr);
        }
        throw new IllegalArgumentException("width must be > 0");
    }

    public static String o(StringBuilder sb2) {
        d.j(sb2);
        String sb3 = sb2.toString();
        if (sb2.length() > 8192) {
            sb2 = new StringBuilder(8192);
        } else {
            sb2.delete(0, sb2.length());
        }
        Stack<StringBuilder> stack = f19803b;
        synchronized (stack) {
            stack.push(sb2);
            while (true) {
                Stack<StringBuilder> stack2 = f19803b;
                if (stack2.size() > 8) {
                    stack2.pop();
                }
            }
        }
        return sb3;
    }

    public static String p(String str, String str2) {
        try {
            try {
                return q(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                return "";
            }
        } catch (MalformedURLException unused2) {
            return new URL(str2).toExternalForm();
        }
    }

    public static URL q(URL url, String str) throws MalformedURLException {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        if (str.indexOf(46) == 0 && url.getFile().indexOf(47) != 0) {
            url = new URL(url.getProtocol(), url.getHost(), url.getPort(), "/" + url.getFile());
        }
        return new URL(url, str);
    }
}
