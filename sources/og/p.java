package og;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import pg.e;
import ug.d;

public final class p {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f21745j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f21746k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f21747l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f21748m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f21749a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21750b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21751c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21752d;

    /* renamed from: e  reason: collision with root package name */
    public final String f21753e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f21754f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21755g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f21756h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f21757i;

    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public String f21758a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String f21759b;

        /* renamed from: c  reason: collision with root package name */
        public long f21760c = d.f23374a;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f21761d;

        /* renamed from: e  reason: collision with root package name */
        public String f21762e = "/";

        /* renamed from: f  reason: collision with root package name */
        public boolean f21763f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f21764g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f21765h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f21766i;

        public p a() {
            return new p(this);
        }

        public a b(String str) {
            return c(str, false);
        }

        public final a c(String str, boolean z10) {
            if (str != null) {
                String d10 = e.d(str);
                if (d10 != null) {
                    this.f21761d = d10;
                    this.f21766i = z10;
                    return this;
                }
                throw new IllegalArgumentException("unexpected domain: " + str);
            }
            throw new NullPointerException("domain == null");
        }

        public a d(long j10) {
            if (j10 <= 0) {
                j10 = Long.MIN_VALUE;
            }
            if (j10 > d.f23374a) {
                j10 = 253402300799999L;
            }
            this.f21760c = j10;
            this.f21765h = true;
            return this;
        }

        public a e(String str) {
            return c(str, true);
        }

        public a f() {
            this.f21764g = true;
            return this;
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.trim().equals(str)) {
                this.f21758a = str;
                return this;
            } else {
                throw new IllegalArgumentException("name is not trimmed");
            }
        }

        public a h(String str) {
            if (str.startsWith("/")) {
                this.f21762e = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public a i() {
            this.f21763f = true;
            return this;
        }

        public a j(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            } else if (str.trim().equals(str)) {
                this.f21759b = str;
                return this;
            } else {
                throw new IllegalArgumentException("value is not trimmed");
            }
        }
    }

    public p(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21749a = str;
        this.f21750b = str2;
        this.f21751c = j10;
        this.f21752d = str3;
        this.f21753e = str4;
        this.f21754f = z10;
        this.f21755g = z11;
        this.f21757i = z12;
        this.f21756h = z13;
    }

    public p(a aVar) {
        String str = aVar.f21758a;
        if (str != null) {
            String str2 = aVar.f21759b;
            if (str2 != null) {
                String str3 = aVar.f21761d;
                if (str3 != null) {
                    this.f21749a = str;
                    this.f21750b = str2;
                    this.f21751c = aVar.f21760c;
                    this.f21752d = str3;
                    this.f21753e = aVar.f21762e;
                    this.f21754f = aVar.f21763f;
                    this.f21755g = aVar.f21764g;
                    this.f21756h = aVar.f21765h;
                    this.f21757i = aVar.f21766i;
                    return;
                }
                throw new NullPointerException("builder.domain == null");
            }
            throw new NullPointerException("builder.value == null");
        }
        throw new NullPointerException("builder.name == null");
    }

    public static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean c(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !e.N(str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static og.p i(long r23, og.c0 r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 0
            r3 = 59
            int r4 = pg.e.o(r0, r2, r1, r3)
            r5 = 61
            int r6 = pg.e.o(r0, r2, r4, r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = pg.e.M(r0, r2, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0135
            int r8 = pg.e.y(r9)
            r10 = -1
            if (r8 == r10) goto L_0x002a
            goto L_0x0135
        L_0x002a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = pg.e.M(r0, r6, r4)
            int r11 = pg.e.y(r6)
            if (r11 == r10) goto L_0x0037
            return r7
        L_0x0037:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r15 = r2
            r16 = r15
            r18 = r16
            r14 = r7
            r17 = r8
            r19 = r10
            r21 = r12
            r8 = r14
        L_0x004c:
            if (r4 >= r1) goto L_0x00ba
            int r7 = pg.e.o(r0, r4, r1, r3)
            int r3 = pg.e.o(r0, r4, r7, r5)
            java.lang.String r4 = pg.e.M(r0, r4, r3)
            if (r3 >= r7) goto L_0x0063
            int r3 = r3 + 1
            java.lang.String r3 = pg.e.M(r0, r3, r7)
            goto L_0x0065
        L_0x0063:
            java.lang.String r3 = ""
        L_0x0065:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0076
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            long r21 = m(r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            goto L_0x0082
        L_0x0076:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            long r19 = n(r3)     // Catch:{  }
        L_0x0082:
            r18 = 1
            goto L_0x00b2
        L_0x0085:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0094
            java.lang.String r14 = l(r3)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r17 = r2
            goto L_0x00b2
        L_0x0094:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x009e
            r8 = r3
            goto L_0x00b2
        L_0x009e:
            java.lang.String r3 = "secure"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00a8
            r15 = 1
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r3 = "httponly"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00b2
            r16 = 1
        L_0x00b2:
            int r4 = r7 + 1
            r3 = 59
            r5 = 61
            r7 = 0
            goto L_0x004c
        L_0x00ba:
            r0 = -9223372036854775808
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            r11 = r0
            goto L_0x00e7
        L_0x00c2:
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00d4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00d9
        L_0x00d4:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d9:
            long r0 = r23 + r19
            int r3 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x00e3
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c0
        L_0x00e3:
            r11 = r12
            goto L_0x00e7
        L_0x00e5:
            r11 = r21
        L_0x00e7:
            java.lang.String r0 = r25.p()
            if (r14 != 0) goto L_0x00f0
            r13 = r0
            r1 = 0
            goto L_0x00fa
        L_0x00f0:
            boolean r1 = c(r0, r14)
            if (r1 != 0) goto L_0x00f8
            r1 = 0
            return r1
        L_0x00f8:
            r1 = 0
            r13 = r14
        L_0x00fa:
            int r0 = r0.length()
            int r3 = r13.length()
            if (r0 == r3) goto L_0x010f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.c()
            java.lang.String r0 = r0.d(r13)
            if (r0 != 0) goto L_0x010f
            return r1
        L_0x010f:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L_0x011c
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r14 = r8
            goto L_0x012d
        L_0x011c:
            java.lang.String r1 = r25.h()
            r3 = 47
            int r3 = r1.lastIndexOf(r3)
            if (r3 == 0) goto L_0x012c
            java.lang.String r0 = r1.substring(r2, r3)
        L_0x012c:
            r14 = r0
        L_0x012d:
            og.p r0 = new og.p
            r8 = r0
            r10 = r6
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0135:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: og.p.i(long, og.c0, java.lang.String):og.p");
    }

    @Nullable
    public static p j(c0 c0Var, String str) {
        return i(System.currentTimeMillis(), c0Var, str);
    }

    public static List<p> k(c0 c0Var, b0 b0Var) {
        List<String> p10 = b0Var.p("Set-Cookie");
        int size = p10.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            p j10 = j(c0Var, p10.get(i10));
            if (j10 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(j10);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public static String l(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String d10 = e.d(str);
            if (d10 != null) {
                return d10;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static long m(String str, int i10, int i11) {
        int a10 = a(str, i10, i11, false);
        Matcher matcher = f21748m.matcher(str);
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (a10 < i11) {
            int a11 = a(str, a10 + 1, i11, true);
            matcher.region(a10, a11);
            if (i13 == -1 && matcher.usePattern(f21748m).matches()) {
                i13 = Integer.parseInt(matcher.group(1));
                i16 = Integer.parseInt(matcher.group(2));
                i17 = Integer.parseInt(matcher.group(3));
            } else if (i14 != -1 || !matcher.usePattern(f21747l).matches()) {
                if (i15 == -1) {
                    Pattern pattern = f21746k;
                    if (matcher.usePattern(pattern).matches()) {
                        i15 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i12 == -1 && matcher.usePattern(f21745j).matches()) {
                    i12 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i14 = Integer.parseInt(matcher.group(1));
            }
            a10 = a(str, a11 + 1, i11, false);
        }
        if (i12 >= 70 && i12 <= 99) {
            i12 += 1900;
        }
        if (i12 >= 0 && i12 <= 69) {
            i12 += 2000;
        }
        if (i12 < 1601) {
            throw new IllegalArgumentException();
        } else if (i15 == -1) {
            throw new IllegalArgumentException();
        } else if (i14 < 1 || i14 > 31) {
            throw new IllegalArgumentException();
        } else if (i13 < 0 || i13 > 23) {
            throw new IllegalArgumentException();
        } else if (i16 < 0 || i16 > 59) {
            throw new IllegalArgumentException();
        } else if (i17 < 0 || i17 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(e.f22073i);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, i15 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i16);
            gregorianCalendar.set(13, i17);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public static long n(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e10) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e10;
        }
    }

    public static boolean p(c0 c0Var, String str) {
        String h10 = c0Var.h();
        if (h10.equals(str)) {
            return true;
        }
        if (h10.startsWith(str)) {
            return str.endsWith("/") || h10.charAt(str.length()) == '/';
        }
        return false;
    }

    public String b() {
        return this.f21752d;
    }

    public long d() {
        return this.f21751c;
    }

    public boolean e() {
        return this.f21757i;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f21749a.equals(this.f21749a) && pVar.f21750b.equals(this.f21750b) && pVar.f21752d.equals(this.f21752d) && pVar.f21753e.equals(this.f21753e) && pVar.f21751c == this.f21751c && pVar.f21754f == this.f21754f && pVar.f21755g == this.f21755g && pVar.f21756h == this.f21756h && pVar.f21757i == this.f21757i;
    }

    public boolean f() {
        return this.f21755g;
    }

    public boolean g(c0 c0Var) {
        if ((this.f21757i ? c0Var.p().equals(this.f21752d) : c(c0Var.p(), this.f21752d)) && p(c0Var, this.f21753e)) {
            return !this.f21754f || c0Var.q();
        }
        return false;
    }

    public String h() {
        return this.f21749a;
    }

    public int hashCode() {
        long j10 = this.f21751c;
        return ((((((((((((((((527 + this.f21749a.hashCode()) * 31) + this.f21750b.hashCode()) * 31) + this.f21752d.hashCode()) * 31) + this.f21753e.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f21754f ^ true ? 1 : 0)) * 31) + (this.f21755g ^ true ? 1 : 0)) * 31) + (this.f21756h ^ true ? 1 : 0)) * 31) + (this.f21757i ^ true ? 1 : 0);
    }

    public String o() {
        return this.f21753e;
    }

    public boolean q() {
        return this.f21756h;
    }

    public boolean r() {
        return this.f21754f;
    }

    public String s(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21749a);
        sb2.append('=');
        sb2.append(this.f21750b);
        if (this.f21756h) {
            if (this.f21751c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb2.append("; expires=");
                str = d.a(new Date(this.f21751c));
            }
            sb2.append(str);
        }
        if (!this.f21757i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f21752d);
        }
        sb2.append("; path=");
        sb2.append(this.f21753e);
        if (this.f21754f) {
            sb2.append("; secure");
        }
        if (this.f21755g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    public String t() {
        return this.f21750b;
    }

    public String toString() {
        return s(false);
    }
}
