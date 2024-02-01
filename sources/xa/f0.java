package xa;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p7.f;
import p7.g;
import qa.r;
import w7.l;

public final class f0 extends u {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f24394g = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f24395h = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f24396i = Pattern.compile("\r\n[ \t]");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f24397j = Pattern.compile("\\\\[nN]");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f24398k = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f24399l = Pattern.compile(l.f14755k);

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f24400m = Pattern.compile(";");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f24401n = Pattern.compile("(?<!\\\\);+");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f24402o = Pattern.compile(",");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f24403p = Pattern.compile("[;,]");

    public static String[] A(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List next : collection) {
            String str2 = (String) next.get(0);
            if (str2 != null && !str2.isEmpty()) {
                int i10 = 1;
                while (true) {
                    if (i10 >= next.size()) {
                        str = null;
                        break;
                    }
                    str = (String) next.get(i10);
                    int indexOf = str.indexOf(61);
                    if (indexOf < 0) {
                        break;
                    } else if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                        str = str.substring(indexOf + 1);
                        break;
                    } else {
                        i10++;
                    }
                }
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(u.f24476f);
    }

    public static String q(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < length) {
            char charAt2 = charSequence.charAt(i10);
            if (!(charAt2 == 10 || charAt2 == 13)) {
                if (charAt2 != '=') {
                    w(byteArrayOutputStream, str, sb2);
                    sb2.append(charAt2);
                } else if (!(i10 >= length - 2 || (charAt = charSequence.charAt(i10 + 1)) == 13 || charAt == 10)) {
                    i10 += 2;
                    char charAt3 = charSequence.charAt(i10);
                    int l10 = u.l(charAt);
                    int l11 = u.l(charAt3);
                    if (l10 >= 0 && l11 >= 0) {
                        byteArrayOutputStream.write((l10 << 4) + l11);
                    }
                }
            }
            i10++;
        }
        w(byteArrayOutputStream, str, sb2);
        return sb2.toString();
    }

    public static void r(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List next : iterable) {
                String str = (String) next.get(0);
                String[] strArr = new String[5];
                int i10 = 0;
                int i11 = 0;
                while (i10 < 4 && (indexOf = str.indexOf(59, i11)) >= 0) {
                    strArr[i10] = str.substring(i11, indexOf);
                    i10++;
                    i11 = indexOf + 1;
                }
                strArr[i10] = str.substring(i11);
                StringBuilder sb2 = new StringBuilder(100);
                v(strArr, 3, sb2);
                v(strArr, 1, sb2);
                v(strArr, 2, sb2);
                v(strArr, 0, sb2);
                v(strArr, 4, sb2);
                next.set(0, sb2.toString().trim());
            }
        }
    }

    public static boolean s(CharSequence charSequence) {
        return charSequence == null || f24395h.matcher(charSequence).matches();
    }

    public static List<String> t(CharSequence charSequence, String str, boolean z10, boolean z11) {
        List<List<String>> u10 = u(charSequence, str, z10, z11);
        if (u10 == null || u10.isEmpty()) {
            return null;
        }
        return u10.get(0);
    }

    public static List<List<String>> u(CharSequence charSequence, String str, boolean z10, boolean z11) {
        String str2;
        String str3;
        int i10;
        ArrayList arrayList;
        int indexOf;
        int i11;
        String str4;
        String str5 = str;
        int length = str.length();
        int i12 = 0;
        int i13 = 0;
        ArrayList arrayList2 = null;
        while (i13 < length) {
            int i14 = 2;
            Matcher matcher = Pattern.compile("(?:^|\n)" + charSequence + "(?:;([^:]*))?:", 2).matcher(str5);
            if (i13 > 0) {
                i13--;
            }
            if (!matcher.find(i13)) {
                break;
            }
            int end = matcher.end(i12);
            String group = matcher.group(1);
            if (group != null) {
                String[] split = f24400m.split(group);
                int length2 = split.length;
                int i15 = i12;
                i10 = i15;
                arrayList = null;
                str3 = null;
                str2 = null;
                while (i15 < length2) {
                    String str6 = split[i15];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str6);
                    String[] split2 = f24399l.split(str6, i14);
                    if (split2.length > 1) {
                        String str7 = split2[0];
                        String str8 = split2[1];
                        if ("ENCODING".equalsIgnoreCase(str7) && "QUOTED-PRINTABLE".equalsIgnoreCase(str8)) {
                            i10 = 1;
                        } else if ("CHARSET".equalsIgnoreCase(str7)) {
                            str3 = str8;
                        } else if ("VALUE".equalsIgnoreCase(str7)) {
                            str2 = str8;
                        }
                    }
                    i15++;
                    i14 = 2;
                }
            } else {
                arrayList = null;
                i10 = 0;
                str3 = null;
                str2 = null;
            }
            int i16 = end;
            while (true) {
                indexOf = str5.indexOf(10, i16);
                if (indexOf < 0) {
                    break;
                }
                if (indexOf < str.length() - 1) {
                    int i17 = indexOf + 1;
                    if (str5.charAt(i17) == ' ' || str5.charAt(i17) == 9) {
                        i16 = indexOf + 2;
                    }
                }
                if (i10 == 0) {
                    break;
                }
                if (indexOf <= 0 || str5.charAt(indexOf - 1) != '=') {
                    if (indexOf >= 2) {
                        if (str5.charAt(indexOf - 2) != '=') {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i16 = indexOf + 1;
            }
            if (indexOf < 0) {
                i13 = length;
                i12 = 0;
            } else {
                if (indexOf > end) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                    }
                    if (indexOf > 0 && str5.charAt(indexOf - 1) == 13) {
                        indexOf--;
                    }
                    String substring = str5.substring(end, indexOf);
                    if (z10) {
                        substring = substring.trim();
                    }
                    if (i10 != 0) {
                        str4 = q(substring, str3);
                        if (z11) {
                            str4 = f24401n.matcher(str4).replaceAll("\n").trim();
                        }
                    } else {
                        if (z11) {
                            substring = f24401n.matcher(substring).replaceAll("\n").trim();
                        }
                        str4 = f24398k.matcher(f24397j.matcher(f24396i.matcher(substring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                    }
                    if ("uri".equals(str2)) {
                        try {
                            str4 = URI.create(str4).getSchemeSpecificPart();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(str4);
                        arrayList2.add(arrayList3);
                    } else {
                        i11 = 0;
                        arrayList.add(0, str4);
                        arrayList2.add(arrayList);
                        i12 = i11;
                        i13 = indexOf + 1;
                    }
                }
                i11 = 0;
                i12 = i11;
                i13 = indexOf + 1;
            }
        }
        return arrayList2;
    }

    public static void v(String[] strArr, int i10, StringBuilder sb2) {
        String str = strArr[i10];
        if (str != null && !str.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append(f.f11698i);
            }
            sb2.append(strArr[i10]);
        }
    }

    public static void w(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb2) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb2.append(str2);
        }
    }

    public static String y(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String[] z(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = (String) list.get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(u.f24476f);
    }

    /* renamed from: x */
    public d k(r rVar) {
        String c10 = u.c(rVar);
        Matcher matcher = f24394g.matcher(c10);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> u10 = u("FN", c10, true, false);
        if (u10 == null) {
            u10 = u("N", c10, true, false);
            r(u10);
        }
        List<String> t10 = t("NICKNAME", c10, true, false);
        String[] split = t10 == null ? null : f24402o.split(t10.get(0));
        List<List<String>> u11 = u("TEL", c10, true, false);
        List<List<String>> u12 = u("EMAIL", c10, true, false);
        List<String> t11 = t(g.f11723y, c10, false, false);
        List<List<String>> u13 = u("ADR", c10, true, true);
        List<String> t12 = t("ORG", c10, true, true);
        List<String> t13 = t("BDAY", c10, true, false);
        List<String> list = (t13 == null || s(t13.get(0))) ? t13 : null;
        List<String> t14 = t("TITLE", c10, true, false);
        List<List<String>> u14 = u("URL", c10, true, false);
        List<String> t15 = t("IMPP", c10, true, false);
        List<String> t16 = t("GEO", c10, true, false);
        String[] split2 = t16 == null ? null : f24403p.split(t16.get(0));
        return new d(z(u10), split, (String) null, z(u11), A(u11), z(u12), A(u12), y(t15), y(t11), z(u13), A(u13), y(t12), y(list), y(t14), z(u14), (split2 == null || split2.length == 2) ? split2 : null);
    }
}
