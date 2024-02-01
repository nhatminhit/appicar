package xa;

public final class d extends q {

    /* renamed from: b  reason: collision with root package name */
    public final String[] f24374b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f24375c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24376d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f24377e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f24378f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f24379g;

    /* renamed from: h  reason: collision with root package name */
    public final String[] f24380h;

    /* renamed from: i  reason: collision with root package name */
    public final String f24381i;

    /* renamed from: j  reason: collision with root package name */
    public final String f24382j;

    /* renamed from: k  reason: collision with root package name */
    public final String[] f24383k;

    /* renamed from: l  reason: collision with root package name */
    public final String[] f24384l;

    /* renamed from: m  reason: collision with root package name */
    public final String f24385m;

    /* renamed from: n  reason: collision with root package name */
    public final String f24386n;

    /* renamed from: o  reason: collision with root package name */
    public final String f24387o;

    /* renamed from: p  reason: collision with root package name */
    public final String[] f24388p;

    /* renamed from: q  reason: collision with root package name */
    public final String[] f24389q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(r.ADDRESSBOOK);
        String[] strArr11 = strArr3;
        String[] strArr12 = strArr4;
        String[] strArr13 = strArr5;
        String[] strArr14 = strArr6;
        String[] strArr15 = strArr7;
        String[] strArr16 = strArr8;
        if (strArr11 != null && strArr12 != null && strArr11.length != strArr12.length) {
            throw new IllegalArgumentException("Phone numbers and types lengths differ");
        } else if (strArr13 != null && strArr14 != null && strArr13.length != strArr14.length) {
            throw new IllegalArgumentException("Emails and types lengths differ");
        } else if (strArr15 == null || strArr16 == null || strArr15.length == strArr16.length) {
            this.f24374b = strArr;
            this.f24375c = strArr2;
            this.f24376d = str;
            this.f24377e = strArr11;
            this.f24378f = strArr12;
            this.f24379g = strArr13;
            this.f24380h = strArr14;
            this.f24381i = str2;
            this.f24382j = str3;
            this.f24383k = strArr15;
            this.f24384l = strArr16;
            this.f24385m = str4;
            this.f24386n = str5;
            this.f24387o = str6;
            this.f24388p = strArr9;
            this.f24389q = strArr10;
        } else {
            throw new IllegalArgumentException("Addresses and types lengths differ");
        }
    }

    public d(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, (String[]) null, (String) null, strArr2, strArr3, strArr4, strArr5, (String) null, (String) null, strArr6, strArr7, (String) null, (String) null, (String) null, (String[]) null, (String[]) null);
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(100);
        q.d(this.f24374b, sb2);
        q.d(this.f24375c, sb2);
        q.c(this.f24376d, sb2);
        q.c(this.f24387o, sb2);
        q.c(this.f24385m, sb2);
        q.d(this.f24383k, sb2);
        q.d(this.f24377e, sb2);
        q.d(this.f24379g, sb2);
        q.c(this.f24381i, sb2);
        q.d(this.f24388p, sb2);
        q.c(this.f24386n, sb2);
        q.d(this.f24389q, sb2);
        q.c(this.f24382j, sb2);
        return sb2.toString();
    }

    public String[] e() {
        return this.f24384l;
    }

    public String[] f() {
        return this.f24383k;
    }

    public String g() {
        return this.f24386n;
    }

    public String[] h() {
        return this.f24380h;
    }

    public String[] i() {
        return this.f24379g;
    }

    public String[] j() {
        return this.f24389q;
    }

    public String k() {
        return this.f24381i;
    }

    public String[] l() {
        return this.f24374b;
    }

    public String[] m() {
        return this.f24375c;
    }

    public String n() {
        return this.f24382j;
    }

    public String o() {
        return this.f24385m;
    }

    public String[] p() {
        return this.f24377e;
    }

    public String[] q() {
        return this.f24378f;
    }

    public String r() {
        return this.f24376d;
    }

    public String s() {
        return this.f24387o;
    }

    public String[] t() {
        return this.f24388p;
    }
}
