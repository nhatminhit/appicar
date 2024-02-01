package xa;

public final class c0 extends q {

    /* renamed from: b  reason: collision with root package name */
    public final String f24372b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24373c;

    public c0(String str, String str2) {
        super(r.URI);
        this.f24372b = i(str);
        this.f24373c = str2;
    }

    public static boolean g(String str, int i10) {
        int i11 = i10 + 1;
        int indexOf = str.indexOf(47, i11);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return u.e(str, i11, indexOf - i11);
    }

    public static String i(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        return (indexOf < 0 || g(trim, indexOf)) ? "http://".concat(trim) : trim;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(30);
        q.c(this.f24373c, sb2);
        q.c(this.f24372b, sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f24373c;
    }

    public String f() {
        return this.f24372b;
    }

    @Deprecated
    public boolean h() {
        return d0.r(this.f24372b);
    }
}
