package xa;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import qa.r;
import w7.l;

public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u[] f24471a = {new f(), new c(), new j(), new b(), new f0(), new e(), new g0(), new i(), new y(), new a0(), new v(), new x(), new n(), new k0(), new e0(), new d0(), new p(), new t(), new l(), new i0()};

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f24472b = Pattern.compile("\\d+");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f24473c = Pattern.compile("&");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f24474d = Pattern.compile(l.f14755k);

    /* renamed from: e  reason: collision with root package name */
    public static final String f24475e = "﻿";

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f24476f = new String[0];

    public static void a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f24474d.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], p(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static int b(CharSequence charSequence, int i10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i11 >= 0 && charSequence.charAt(i11) == '\\') {
            i12++;
            i11--;
        }
        return i12;
    }

    public static String c(r rVar) {
        String g10 = rVar.g();
        return g10.startsWith(f24475e) ? g10.substring(1) : g10;
    }

    public static boolean d(CharSequence charSequence, int i10) {
        return charSequence != null && i10 > 0 && i10 == charSequence.length() && f24472b.matcher(charSequence).matches();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = r4 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(java.lang.CharSequence r2, int r3, int r4) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x001f
            if (r4 > 0) goto L_0x0006
            goto L_0x001f
        L_0x0006:
            int r4 = r4 + r3
            int r1 = r2.length()
            if (r1 < r4) goto L_0x001f
            java.util.regex.Pattern r1 = f24472b
            java.lang.CharSequence r2 = r2.subSequence(r3, r4)
            java.util.regex.Matcher r2 = r1.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x001f
            r2 = 1
            return r2
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.u.e(java.lang.CharSequence, int, int):boolean");
    }

    public static String[] f(String str, String str2, char c10, boolean z10) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str2.indexOf(str, i10);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            boolean z11 = true;
            ArrayList arrayList2 = arrayList;
            int i11 = length2;
            while (z11) {
                int indexOf2 = str2.indexOf(c10, i11);
                if (indexOf2 < 0) {
                    i11 = str2.length();
                } else if (b(str2, indexOf2) % 2 != 0) {
                    i11 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String o10 = o(str2.substring(length2, indexOf2));
                    if (z10) {
                        o10 = o10.trim();
                    }
                    if (!o10.isEmpty()) {
                        arrayList2.add(o10);
                    }
                    i11 = indexOf2 + 1;
                }
                z11 = false;
            }
            i10 = i11;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(f24476f);
    }

    public static String g(String str, String str2, char c10, boolean z10) {
        String[] f10 = f(str, str2, c10, z10);
        if (f10 == null) {
            return null;
        }
        return f10[0];
    }

    public static void h(String str, StringBuilder sb2) {
        if (str != null) {
            sb2.append(10);
            sb2.append(str);
        }
    }

    public static void i(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String append : strArr) {
                sb2.append(10);
                sb2.append(append);
            }
        }
    }

    public static String[] j(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    public static int l(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static Map<String, String> m(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String a10 : f24473c.split(str.substring(indexOf + 1))) {
            a(a10, hashMap);
        }
        return hashMap;
    }

    public static q n(r rVar) {
        for (u k10 : f24471a) {
            q k11 = k10.k(rVar);
            if (k11 != null) {
                return k11;
            }
        }
        return new b0(rVar.g(), (String) null);
    }

    public static String o(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length - 1);
        sb2.append(str.toCharArray(), 0, indexOf);
        boolean z10 = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z10 || charAt != '\\') {
                sb2.append(charAt);
                z10 = false;
            } else {
                z10 = true;
            }
            indexOf++;
        }
        return sb2.toString();
    }

    public static String p(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public abstract q k(r rVar);
}
