package xa;

import w0.d;

public final class h extends q {

    /* renamed from: b  reason: collision with root package name */
    public final String[] f24418b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f24419c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f24420d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24421e;

    /* renamed from: f  reason: collision with root package name */
    public final String f24422f;

    public h(String str) {
        this(new String[]{str}, (String[]) null, (String[]) null, (String) null, (String) null);
    }

    public h(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(r.EMAIL_ADDRESS);
        this.f24418b = strArr;
        this.f24419c = strArr2;
        this.f24420d = strArr3;
        this.f24421e = str;
        this.f24422f = str2;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(30);
        q.d(this.f24418b, sb2);
        q.d(this.f24419c, sb2);
        q.d(this.f24420d, sb2);
        q.c(this.f24421e, sb2);
        q.c(this.f24422f, sb2);
        return sb2.toString();
    }

    public String[] e() {
        return this.f24420d;
    }

    public String f() {
        return this.f24422f;
    }

    public String[] g() {
        return this.f24419c;
    }

    @Deprecated
    public String h() {
        String[] strArr = this.f24418b;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @Deprecated
    public String i() {
        return d.f14357b;
    }

    public String j() {
        return this.f24421e;
    }

    public String[] k() {
        return this.f24418b;
    }
}
