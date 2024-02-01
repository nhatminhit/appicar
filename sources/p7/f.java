package p7;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import d.m0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p7.e;
import w7.p;
import w7.q0;
import w7.w;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f11691b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f11692c = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: d  reason: collision with root package name */
    public static final char f11693d = '<';

    /* renamed from: e  reason: collision with root package name */
    public static final char f11694e = '>';

    /* renamed from: f  reason: collision with root package name */
    public static final char f11695f = '/';

    /* renamed from: g  reason: collision with root package name */
    public static final char f11696g = '&';

    /* renamed from: h  reason: collision with root package name */
    public static final char f11697h = ';';

    /* renamed from: i  reason: collision with root package name */
    public static final char f11698i = ' ';

    /* renamed from: j  reason: collision with root package name */
    public static final String f11699j = "lt";

    /* renamed from: k  reason: collision with root package name */
    public static final String f11700k = "gt";

    /* renamed from: l  reason: collision with root package name */
    public static final String f11701l = "amp";

    /* renamed from: m  reason: collision with root package name */
    public static final String f11702m = "nbsp";

    /* renamed from: n  reason: collision with root package name */
    public static final String f11703n = "b";

    /* renamed from: o  reason: collision with root package name */
    public static final String f11704o = "i";

    /* renamed from: p  reason: collision with root package name */
    public static final String f11705p = "u";

    /* renamed from: q  reason: collision with root package name */
    public static final String f11706q = "c";

    /* renamed from: r  reason: collision with root package name */
    public static final String f11707r = "v";

    /* renamed from: s  reason: collision with root package name */
    public static final String f11708s = "lang";

    /* renamed from: t  reason: collision with root package name */
    public static final int f11709t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f11710u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final String f11711v = "WebvttCueParser";

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f11712a = new StringBuilder();

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final String[] f11713e = new String[0];

        /* renamed from: a  reason: collision with root package name */
        public final String f11714a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11715b;

        /* renamed from: c  reason: collision with root package name */
        public final String f11716c;

        /* renamed from: d  reason: collision with root package name */
        public final String[] f11717d;

        public a(String str, int i10, String str2, String[] strArr) {
            this.f11715b = i10;
            this.f11714a = str;
            this.f11716c = str2;
            this.f11717d = strArr;
        }

        public static a a(String str, int i10) {
            String str2;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] R0 = q0.R0(trim, "\\.");
            return new a(R0[0], i10, str2, R0.length > 1 ? (String[]) Arrays.copyOfRange(R0, 1, R0.length) : f11713e);
        }

        public static a b() {
            return new a("", 0, "", new String[0]);
        }
    }

    public static final class b implements Comparable<b> {
        public final int O;
        public final d P;

        public b(int i10, d dVar) {
            this.O = i10;
            this.P = dVar;
        }

        /* renamed from: a */
        public int compareTo(@m0 b bVar) {
            return this.O - bVar.O;
        }
    }

    public static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        char c10;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals(f11700k)) {
                    c11 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals(f11699j)) {
                    c11 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals(f11701l)) {
                    c11 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals(f11702m)) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                c10 = '>';
                break;
            case 1:
                c10 = '<';
                break;
            case 2:
                c10 = '&';
                break;
            case 3:
                c10 = f11698i;
                break;
            default:
                p.l(f11711v, "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089 A[LOOP:0: B:31:0x0087->B:32:0x0089, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.String r8, p7.f.a r9, android.text.SpannableStringBuilder r10, java.util.List<p7.d> r11, java.util.List<p7.f.b> r12) {
        /*
            int r0 = r9.f11715b
            int r1 = r10.length()
            java.lang.String r2 = r9.f11714a
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = -1
            switch(r3) {
                case 0: goto L_0x0059;
                case 98: goto L_0x004e;
                case 99: goto L_0x0043;
                case 105: goto L_0x0038;
                case 117: goto L_0x002d;
                case 118: goto L_0x0022;
                case 3314158: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0063
        L_0x0017:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0020
            goto L_0x0063
        L_0x0020:
            r7 = 6
            goto L_0x0063
        L_0x0022:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x002b
            goto L_0x0063
        L_0x002b:
            r7 = 5
            goto L_0x0063
        L_0x002d:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0036
            goto L_0x0063
        L_0x0036:
            r7 = 4
            goto L_0x0063
        L_0x0038:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0041
            goto L_0x0063
        L_0x0041:
            r7 = 3
            goto L_0x0063
        L_0x0043:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004c
            goto L_0x0063
        L_0x004c:
            r7 = r4
            goto L_0x0063
        L_0x004e:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0057
            goto L_0x0063
        L_0x0057:
            r7 = r6
            goto L_0x0063
        L_0x0059:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r7 = r5
        L_0x0063:
            r2 = 33
            switch(r7) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0075;
                case 2: goto L_0x007d;
                case 3: goto L_0x006f;
                case 4: goto L_0x0069;
                case 5: goto L_0x007d;
                case 6: goto L_0x007d;
                default: goto L_0x0068;
            }
        L_0x0068:
            return
        L_0x0069:
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            goto L_0x007a
        L_0x006f:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r4)
            goto L_0x007a
        L_0x0075:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r6)
        L_0x007a:
            r10.setSpan(r3, r0, r1, r2)
        L_0x007d:
            r12.clear()
            e(r11, r8, r9, r12)
            int r8 = r12.size()
        L_0x0087:
            if (r5 >= r8) goto L_0x0097
            java.lang.Object r9 = r12.get(r5)
            p7.f$b r9 = (p7.f.b) r9
            p7.d r9 = r9.P
            c(r10, r9, r0, r1)
            int r5 = r5 + 1
            goto L_0x0087
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.f.b(java.lang.String, p7.f$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, d dVar, int i10, int i11) {
        Object obj;
        if (dVar != null) {
            if (dVar.h() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(dVar.h()), i10, i11, 33);
            }
            if (dVar.l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
            if (dVar.m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (dVar.k()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.c()), i10, i11, 33);
            }
            if (dVar.j()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.b()), i10, i11, 33);
            }
            if (dVar.d() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(dVar.d()), i10, i11, 33);
            }
            if (dVar.i() != null) {
                spannableStringBuilder.setSpan(new AlignmentSpan.Standard(dVar.i()), i10, i11, 33);
            }
            int f10 = dVar.f();
            if (f10 == 1) {
                obj = new AbsoluteSizeSpan((int) dVar.e(), true);
            } else if (f10 == 2) {
                obj = new RelativeSizeSpan(dVar.e());
            } else if (f10 == 3) {
                obj = new RelativeSizeSpan(dVar.e() / 100.0f);
            } else {
                return;
            }
            spannableStringBuilder.setSpan(obj, i10, i11, 33);
        }
    }

    public static int d(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    public static void e(List<d> list, String str, a aVar, List<b> list2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = list.get(i10);
            int g10 = dVar.g(str, aVar.f11714a, aVar.f11717d, aVar.f11716c);
            if (g10 > 0) {
                list2.add(new b(g10, dVar));
            }
        }
        Collections.sort(list2);
    }

    public static String f(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return q0.S0(trim, "[ \\.]")[0];
    }

    public static boolean g(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals(f11703n)) {
                    c10 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals(f11706q)) {
                    c10 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c10 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals(f11705p)) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals(f11707r)) {
                    c10 = 4;
                    break;
                }
                break;
            case 3314158:
                if (str.equals(f11708s)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    public static boolean h(String str, Matcher matcher, w wVar, e.b bVar, StringBuilder sb2, List<d> list) {
        try {
            bVar.j(h.d(matcher.group(1))).d(h.d(matcher.group(2)));
            j(matcher.group(3), bVar);
            sb2.setLength(0);
            while (true) {
                String n10 = wVar.n();
                if (!TextUtils.isEmpty(n10)) {
                    if (sb2.length() > 0) {
                        sb2.append("\n");
                    }
                    sb2.append(n10.trim());
                } else {
                    k(str, sb2.toString(), bVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            p.l(f11711v, "Skipping cue with bad header: " + matcher.group());
            return false;
        }
    }

    public static void j(String str, e.b bVar) {
        Matcher matcher = f11692c.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    l(group2, bVar);
                } else if ("align".equals(group)) {
                    bVar.l(o(group2));
                } else if ("position".equals(group)) {
                    n(group2, bVar);
                } else if ("size".equals(group)) {
                    bVar.m(h.c(group2));
                } else {
                    p.l(f11711v, "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                p.l(f11711v, "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static void k(String str, String str2, e.b bVar, List<d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    a(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    int i12 = 1;
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = d(str2, i11);
                    int i13 = i11 - 2;
                    boolean z11 = str2.charAt(i13) == '/';
                    if (z10) {
                        i12 = 2;
                    }
                    int i14 = i10 + i12;
                    if (!z11) {
                        i13 = i11 - 1;
                    }
                    String substring = str2.substring(i14, i13);
                    String f10 = f(substring);
                    if (f10 != null && g(f10)) {
                        if (z10) {
                            while (!arrayDeque.isEmpty()) {
                                a aVar = (a) arrayDeque.pop();
                                b(str, aVar, spannableStringBuilder, list, arrayList);
                                if (aVar.f11714a.equals(f10)) {
                                    break;
                                }
                            }
                        } else if (!z11) {
                            arrayDeque.push(a.a(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            b(str, (a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        b(str, a.b(), spannableStringBuilder, list, arrayList);
        bVar.k(spannableStringBuilder);
    }

    public static void l(String str, e.b bVar) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.f(m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.f(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            bVar.e(h.c(str)).g(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        bVar.e((float) parseInt).g(1);
    }

    public static int m(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(n7.b.V)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(n7.b.X)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                p.l(f11711v, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void n(String str, e.b bVar) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.i(m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.i(Integer.MIN_VALUE);
        }
        bVar.h(h.c(str));
    }

    public static Layout.Alignment o(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(n7.b.V)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(n7.b.U)) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(n7.b.W)) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(n7.b.X)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return Layout.Alignment.ALIGN_CENTER;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 3:
            case 5:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                p.l(f11711v, "Invalid alignment value: " + str);
                return null;
        }
    }

    public boolean i(w wVar, e.b bVar, List<d> list) {
        String n10 = wVar.n();
        if (n10 == null) {
            return false;
        }
        Pattern pattern = f11691b;
        Matcher matcher = pattern.matcher(n10);
        if (matcher.matches()) {
            return h((String) null, matcher, wVar, bVar, this.f11712a, list);
        }
        String n11 = wVar.n();
        if (n11 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(n11);
        if (!matcher2.matches()) {
            return false;
        }
        return h(n10.trim(), matcher2, wVar, bVar, this.f11712a, list);
    }
}
