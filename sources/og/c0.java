package og;

import ch.c;
import com.google.android.material.badge.BadgeDrawable;
import gc.t;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import pg.e;

public final class c0 {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f21470j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: k  reason: collision with root package name */
    public static final String f21471k = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: l  reason: collision with root package name */
    public static final String f21472l = " \"':;<=>@[]^`{}|/\\?#";

    /* renamed from: m  reason: collision with root package name */
    public static final String f21473m = " \"<>^`{}|/\\?#";

    /* renamed from: n  reason: collision with root package name */
    public static final String f21474n = "[]";

    /* renamed from: o  reason: collision with root package name */
    public static final String f21475o = " \"'<>#";

    /* renamed from: p  reason: collision with root package name */
    public static final String f21476p = " \"'<>#&=";

    /* renamed from: q  reason: collision with root package name */
    public static final String f21477q = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* renamed from: r  reason: collision with root package name */
    public static final String f21478r = "\\^`{|}";

    /* renamed from: s  reason: collision with root package name */
    public static final String f21479s = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* renamed from: t  reason: collision with root package name */
    public static final String f21480t = "";

    /* renamed from: u  reason: collision with root package name */
    public static final String f21481u = " \"#<>\\^`{|}";

    /* renamed from: a  reason: collision with root package name */
    public final String f21482a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21483b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21484c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21485d;

    /* renamed from: e  reason: collision with root package name */
    public final int f21486e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f21487f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f21488g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f21489h;

    /* renamed from: i  reason: collision with root package name */
    public final String f21490i;

    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final String f21491i = "Invalid URL host";
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public String f21492a;

        /* renamed from: b  reason: collision with root package name */
        public String f21493b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f21494c = "";
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f21495d;

        /* renamed from: e  reason: collision with root package name */
        public int f21496e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f21497f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public List<String> f21498g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public String f21499h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f21497f = arrayList;
            arrayList.add("");
        }

        public static int I(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i10;
                        }
                    }
                }
            }
            return -1;
        }

        public static int N(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        @Nullable
        public static String i(String str, int i10, int i11) {
            return e.d(c0.z(str, i10, i11, false));
        }

        public static int u(String str, int i10, int i11) {
            try {
                int parseInt = Integer.parseInt(c0.a(str, i10, i11, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        public static int y(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt == '[') {
                    do {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                    } while (str.charAt(i10) == ']');
                }
                i10++;
            }
            return i11;
        }

        public a A(@Nullable String str) {
            this.f21498g = str != null ? c0.M(c0.b(str, c0.f21475o, false, false, true, true)) : null;
            return this;
        }

        public a B() {
            int size = this.f21497f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f21497f.set(i10, c0.b(this.f21497f.get(i10), c0.f21474n, true, true, false, true));
            }
            List<String> list = this.f21498g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f21498g.get(i11);
                    if (str != null) {
                        this.f21498g.set(i11, c0.b(str, c0.f21478r, true, true, true, true));
                    }
                }
            }
            String str2 = this.f21499h;
            if (str2 != null) {
                this.f21499h = c0.b(str2, c0.f21481u, true, true, false, false);
            }
            return this;
        }

        public final void C(String str) {
            for (int size = this.f21498g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f21498g.get(size))) {
                    this.f21498g.remove(size + 1);
                    this.f21498g.remove(size);
                    if (this.f21498g.isEmpty()) {
                        this.f21498g = null;
                        return;
                    }
                }
            }
        }

        public a D(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            } else if (this.f21498g == null) {
                return this;
            } else {
                C(c0.b(str, c0.f21476p, true, false, true, true));
                return this;
            }
        }

        public a E(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (this.f21498g == null) {
                return this;
            } else {
                C(c0.b(str, c0.f21477q, false, false, true, true));
                return this;
            }
        }

        public a F(int i10) {
            this.f21497f.remove(i10);
            if (this.f21497f.isEmpty()) {
                this.f21497f.add("");
            }
            return this;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        public final void G(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f21497f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f21497f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f21497f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = pg.e.p(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = r3
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.z(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: og.c0.a.G(java.lang.String, int, int):void");
        }

        public a H(String str) {
            if (str != null) {
                String str2 = t.f19110d;
                if (!str.equalsIgnoreCase(str2)) {
                    str2 = t.f19111e;
                    if (!str.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                }
                this.f21492a = str2;
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public a J(int i10, String str) {
            if (str != null) {
                String a10 = c0.a(str, 0, str.length(), c0.f21473m, true, false, false, true, (Charset) null);
                this.f21497f.set(i10, a10);
                if (!r(a10) && !s(a10)) {
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: " + str);
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public a K(String str, @Nullable String str2) {
            D(str);
            c(str, str2);
            return this;
        }

        public a L(int i10, String str) {
            if (str != null) {
                String a10 = c0.a(str, 0, str.length(), c0.f21473m, false, false, false, true, (Charset) null);
                if (r(a10) || s(a10)) {
                    throw new IllegalArgumentException("unexpected path segment: " + str);
                }
                this.f21497f.set(i10, a10);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        public a M(String str, @Nullable String str2) {
            E(str);
            g(str, str2);
            return this;
        }

        public a O(String str) {
            if (str != null) {
                this.f21493b = c0.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public a a(String str) {
            if (str != null) {
                z(str, 0, str.length(), false, true);
                return this;
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public a b(String str) {
            if (str != null) {
                return f(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public a c(String str, @Nullable String str2) {
            if (str != null) {
                if (this.f21498g == null) {
                    this.f21498g = new ArrayList();
                }
                this.f21498g.add(c0.b(str, c0.f21476p, true, false, true, true));
                this.f21498g.add(str2 != null ? c0.b(str2, c0.f21476p, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public a d(String str) {
            if (str != null) {
                z(str, 0, str.length(), false, false);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        public a e(String str) {
            if (str != null) {
                return f(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        public final a f(String str, boolean z10) {
            int i10 = 0;
            do {
                int p10 = e.p(str, i10, str.length(), "/\\");
                z(str, i10, p10, p10 < str.length(), z10);
                i10 = p10 + 1;
            } while (i10 <= str.length());
            return this;
        }

        public a g(String str, @Nullable String str2) {
            if (str != null) {
                if (this.f21498g == null) {
                    this.f21498g = new ArrayList();
                }
                this.f21498g.add(c0.b(str, c0.f21477q, false, false, true, true));
                this.f21498g.add(str2 != null ? c0.b(str2, c0.f21477q, false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public c0 h() {
            if (this.f21492a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f21495d != null) {
                return new c0(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public int j() {
            int i10 = this.f21496e;
            return i10 != -1 ? i10 : c0.e(this.f21492a);
        }

        public a k(@Nullable String str) {
            this.f21499h = str != null ? c0.b(str, "", true, false, false, false) : null;
            return this;
        }

        public a l(String str) {
            if (str != null) {
                this.f21494c = c0.b(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedPassword == null");
        }

        public a m(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            } else if (str.startsWith("/")) {
                G(str, 0, str.length());
                return this;
            } else {
                throw new IllegalArgumentException("unexpected encodedPath: " + str);
            }
        }

        public a n(@Nullable String str) {
            this.f21498g = str != null ? c0.M(c0.b(str, c0.f21475o, true, false, true, true)) : null;
            return this;
        }

        public a o(String str) {
            if (str != null) {
                this.f21493b = c0.b(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedUsername == null");
        }

        public a p(@Nullable String str) {
            this.f21499h = str != null ? c0.b(str, "", false, false, false, false) : null;
            return this;
        }

        public a q(String str) {
            if (str != null) {
                String i10 = i(str, 0, str.length());
                if (i10 != null) {
                    this.f21495d = i10;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        public final boolean r(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public final boolean s(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public a t(@Nullable c0 c0Var, String str) {
            int p10;
            int i10;
            c0 c0Var2 = c0Var;
            String str2 = str;
            int H = e.H(str2, 0, str.length());
            int I = e.I(str2, H, str.length());
            int I2 = I(str2, H, I);
            if (I2 != -1) {
                if (str.regionMatches(true, H, "https:", 0, 6)) {
                    this.f21492a = t.f19111e;
                    H += 6;
                } else if (str.regionMatches(true, H, "http:", 0, 5)) {
                    this.f21492a = t.f19110d;
                    H += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, I2) + "'");
                }
            } else if (c0Var2 != null) {
                this.f21492a = c0Var2.f21482a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int N = N(str2, H, I);
            char c10 = '?';
            char c11 = '#';
            if (N >= 2 || c0Var2 == null || !c0Var2.f21482a.equals(this.f21492a)) {
                boolean z10 = false;
                boolean z11 = false;
                int i11 = H + N;
                while (true) {
                    p10 = e.p(str2, i11, I, "@/\\?#");
                    char charAt = p10 != I ? str2.charAt(p10) : 65535;
                    if (charAt == 65535 || charAt == c11 || charAt == '/' || charAt == '\\' || charAt == c10) {
                        int i12 = p10;
                        int y10 = y(str2, i11, i12);
                        int i13 = y10 + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z10) {
                                int o10 = e.o(str2, i11, p10, ':');
                                int i14 = o10;
                                String str3 = "%40";
                                i10 = p10;
                                String a10 = c0.a(str, i11, o10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z11) {
                                    a10 = this.f21493b + str3 + a10;
                                }
                                this.f21493b = a10;
                                if (i14 != i10) {
                                    this.f21494c = c0.a(str, i14 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z10 = true;
                                }
                                z11 = true;
                            } else {
                                i10 = p10;
                                this.f21494c += "%40" + c0.a(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i11 = i10 + 1;
                        }
                        c10 = '?';
                        c11 = '#';
                    }
                }
                int i122 = p10;
                int y102 = y(str2, i11, i122);
                int i132 = y102 + 1;
                if (i132 < i122) {
                    this.f21495d = i(str2, i11, y102);
                    int u10 = u(str2, i132, i122);
                    this.f21496e = u10;
                    if (u10 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i132, i122) + '\"');
                    }
                } else {
                    this.f21495d = i(str2, i11, y102);
                    this.f21496e = c0.e(this.f21492a);
                }
                if (this.f21495d != null) {
                    H = i122;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i11, y102) + '\"');
                }
            } else {
                this.f21493b = c0Var.k();
                this.f21494c = c0Var.g();
                this.f21495d = c0Var2.f21485d;
                this.f21496e = c0Var2.f21486e;
                this.f21497f.clear();
                this.f21497f.addAll(c0Var.i());
                if (H == I || str2.charAt(H) == '#') {
                    n(c0Var.j());
                }
            }
            int p11 = e.p(str2, H, I, "?#");
            G(str2, H, p11);
            if (p11 < I && str2.charAt(p11) == '?') {
                int o11 = e.o(str2, p11, I, '#');
                this.f21498g = c0.M(c0.a(str, p11 + 1, o11, c0.f21475o, true, false, true, true, (Charset) null));
                p11 = o11;
            }
            if (p11 < I && str2.charAt(p11) == '#') {
                this.f21499h = c0.a(str, 1 + p11, I, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            String str2 = this.f21492a;
            if (str2 != null) {
                sb2.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb2.append(str);
            if (!this.f21493b.isEmpty() || !this.f21494c.isEmpty()) {
                sb2.append(this.f21493b);
                if (!this.f21494c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f21494c);
                }
                sb2.append('@');
            }
            String str3 = this.f21495d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f21495d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f21495d);
                }
            }
            if (!(this.f21496e == -1 && this.f21492a == null)) {
                int j10 = j();
                String str4 = this.f21492a;
                if (str4 == null || j10 != c0.e(str4)) {
                    sb2.append(':');
                    sb2.append(j10);
                }
            }
            c0.x(sb2, this.f21497f);
            if (this.f21498g != null) {
                sb2.append('?');
                c0.r(sb2, this.f21498g);
            }
            if (this.f21499h != null) {
                sb2.append('#');
                sb2.append(this.f21499h);
            }
            return sb2.toString();
        }

        public a v(String str) {
            if (str != null) {
                this.f21494c = c0.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public final void w() {
            List<String> list = this.f21497f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f21497f.isEmpty()) {
                this.f21497f.add("");
                return;
            }
            List<String> list2 = this.f21497f;
            list2.set(list2.size() - 1, "");
        }

        public a x(int i10) {
            if (i10 <= 0 || i10 > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i10);
            }
            this.f21496e = i10;
            return this;
        }

        public final void z(String str, int i10, int i11, boolean z10, boolean z11) {
            String a10 = c0.a(str, i10, i11, c0.f21473m, z11, false, false, true, (Charset) null);
            if (!r(a10)) {
                if (s(a10)) {
                    w();
                    return;
                }
                List<String> list = this.f21497f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f21497f;
                    list2.set(list2.size() - 1, a10);
                } else {
                    this.f21497f.add(a10);
                }
                if (z10) {
                    this.f21497f.add("");
                }
            }
        }
    }

    public c0(a aVar) {
        this.f21482a = aVar.f21492a;
        this.f21483b = A(aVar.f21493b, false);
        this.f21484c = A(aVar.f21494c, false);
        this.f21485d = aVar.f21495d;
        this.f21486e = aVar.j();
        this.f21487f = B(aVar.f21497f, false);
        List<String> list = aVar.f21498g;
        String str = null;
        this.f21488g = list != null ? B(list, true) : null;
        String str2 = aVar.f21499h;
        this.f21489h = str2 != null ? A(str2, false) : str;
        this.f21490i = aVar.toString();
    }

    public static String A(String str, boolean z10) {
        return z(str, 0, str.length(), z10);
    }

    public static void C(c cVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int l10 = e.l(str.charAt(i10 + 1));
                int l11 = e.l(str.charAt(i12));
                if (!(l10 == -1 || l11 == -1)) {
                    cVar.writeByte((l10 << 4) + l11);
                    i10 = i12;
                    i10 += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z10) {
                cVar.writeByte(32);
                i10 += Character.charCount(codePointAt);
            }
            cVar.J(codePointAt);
            i10 += Character.charCount(codePointAt);
        }
    }

    public static boolean D(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && e.l(str.charAt(i10 + 1)) != -1 && e.l(str.charAt(i12)) != -1;
    }

    public static List<String> M(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i10, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i10, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) {
        String str3 = str;
        int i12 = i11;
        int i13 = i10;
        while (i13 < i12) {
            int codePointAt = str.codePointAt(i13);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z13)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z10 && (!z11 || D(str, i13, i11)))) && (codePointAt != 43 || !z12))) {
                    i13 += Character.charCount(codePointAt);
                }
            }
            c cVar = new c();
            int i14 = i10;
            cVar.O0(str, i10, i13);
            d(cVar, str, i13, i11, str2, z10, z11, z12, z13, charset);
            return cVar.o1();
        }
        int i15 = i10;
        return str.substring(i10, i11);
    }

    public static String b(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, (Charset) null);
    }

    public static String c(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, charset);
    }

    public static void d(c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) {
        c cVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z12) {
                    cVar.D0(z10 ? BadgeDrawable.f16655n0 : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z13) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z10 || (z11 && !D(str, i10, i11)))))) {
                    if (cVar2 == null) {
                        cVar2 = new c();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        cVar2.J(codePointAt);
                    } else {
                        cVar2.D1(str, i10, Character.charCount(codePointAt) + i10, charset);
                    }
                    while (!cVar2.X()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        char[] cArr = f21470j;
                        cVar.writeByte(cArr[(readByte >> 4) & 15]);
                        cVar.writeByte(cArr[readByte & 15]);
                    }
                } else {
                    cVar.J(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static int e(String str) {
        if (str.equals(t.f19110d)) {
            return 80;
        }
        return str.equals(t.f19111e) ? 443 : -1;
    }

    public static c0 m(String str) {
        return new a().t((c0) null, str).h();
    }

    @Nullable
    public static c0 n(URI uri) {
        return u(uri.toString());
    }

    @Nullable
    public static c0 o(URL url) {
        return u(url.toString());
    }

    public static void r(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    @Nullable
    public static c0 u(String str) {
        try {
            return m(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void x(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static String z(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                c cVar = new c();
                cVar.O0(str, i10, i12);
                C(cVar, str, i12, i11, z10);
                return cVar.o1();
            }
        }
        return str.substring(i10, i11);
    }

    public final List<String> B(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? A(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int E() {
        return this.f21486e;
    }

    @Nullable
    public String F() {
        if (this.f21488g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        r(sb2, this.f21488g);
        return sb2.toString();
    }

    @Nullable
    public String G(String str) {
        List<String> list = this.f21488g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            if (str.equals(this.f21488g.get(i10))) {
                return this.f21488g.get(i10 + 1);
            }
        }
        return null;
    }

    public String H(int i10) {
        List<String> list = this.f21488g;
        if (list != null) {
            return list.get(i10 * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public Set<String> I() {
        if (this.f21488g == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f21488g.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            linkedHashSet.add(this.f21488g.get(i10));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public String J(int i10) {
        List<String> list = this.f21488g;
        if (list != null) {
            return list.get((i10 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public List<String> K(String str) {
        if (this.f21488g == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f21488g.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            if (str.equals(this.f21488g.get(i10))) {
                arrayList.add(this.f21488g.get(i10 + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int L() {
        List<String> list = this.f21488g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public String N() {
        return t("/...").O("").v("").h().toString();
    }

    @Nullable
    public c0 O(String str) {
        a t10 = t(str);
        if (t10 != null) {
            return t10.h();
        }
        return null;
    }

    public String P() {
        return this.f21482a;
    }

    @Nullable
    public String Q() {
        if (e.N(this.f21485d)) {
            return null;
        }
        return PublicSuffixDatabase.c().d(this.f21485d);
    }

    public URI R() {
        String aVar = s().B().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public URL S() {
        try {
            return new URL(this.f21490i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String T() {
        return this.f21483b;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof c0) && ((c0) obj).f21490i.equals(this.f21490i);
    }

    @Nullable
    public String f() {
        if (this.f21489h == null) {
            return null;
        }
        return this.f21490i.substring(this.f21490i.indexOf(35) + 1);
    }

    public String g() {
        if (this.f21484c.isEmpty()) {
            return "";
        }
        int indexOf = this.f21490i.indexOf(64);
        return this.f21490i.substring(this.f21490i.indexOf(58, this.f21482a.length() + 3) + 1, indexOf);
    }

    public String h() {
        int indexOf = this.f21490i.indexOf(47, this.f21482a.length() + 3);
        String str = this.f21490i;
        return this.f21490i.substring(indexOf, e.p(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f21490i.hashCode();
    }

    public List<String> i() {
        int indexOf = this.f21490i.indexOf(47, this.f21482a.length() + 3);
        String str = this.f21490i;
        int p10 = e.p(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < p10) {
            int i10 = indexOf + 1;
            int o10 = e.o(this.f21490i, i10, p10, '/');
            arrayList.add(this.f21490i.substring(i10, o10));
            indexOf = o10;
        }
        return arrayList;
    }

    @Nullable
    public String j() {
        if (this.f21488g == null) {
            return null;
        }
        int indexOf = this.f21490i.indexOf(63) + 1;
        String str = this.f21490i;
        return this.f21490i.substring(indexOf, e.o(str, indexOf, str.length(), '#'));
    }

    public String k() {
        if (this.f21483b.isEmpty()) {
            return "";
        }
        int length = this.f21482a.length() + 3;
        String str = this.f21490i;
        return this.f21490i.substring(length, e.p(str, length, str.length(), ":@"));
    }

    @Nullable
    public String l() {
        return this.f21489h;
    }

    public String p() {
        return this.f21485d;
    }

    public boolean q() {
        return this.f21482a.equals(t.f19111e);
    }

    public a s() {
        a aVar = new a();
        aVar.f21492a = this.f21482a;
        aVar.f21493b = k();
        aVar.f21494c = g();
        aVar.f21495d = this.f21485d;
        aVar.f21496e = this.f21486e != e(this.f21482a) ? this.f21486e : -1;
        aVar.f21497f.clear();
        aVar.f21497f.addAll(i());
        aVar.n(j());
        aVar.f21499h = f();
        return aVar;
    }

    @Nullable
    public a t(String str) {
        try {
            return new a().t(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f21490i;
    }

    public String v() {
        return this.f21484c;
    }

    public List<String> w() {
        return this.f21487f;
    }

    public int y() {
        return this.f21487f.size();
    }
}
