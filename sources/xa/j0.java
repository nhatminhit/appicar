package xa;

public final class j0 extends q {

    /* renamed from: b  reason: collision with root package name */
    public final String f24436b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24437c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24438d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24439e;

    /* renamed from: f  reason: collision with root package name */
    public final String f24440f;

    /* renamed from: g  reason: collision with root package name */
    public final String f24441g;

    /* renamed from: h  reason: collision with root package name */
    public final String f24442h;

    /* renamed from: i  reason: collision with root package name */
    public final String f24443i;

    public j0(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    public j0(String str, String str2, String str3, boolean z10) {
        this(str, str2, str3, z10, (String) null, (String) null, (String) null, (String) null);
    }

    public j0(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7) {
        super(r.WIFI);
        this.f24436b = str2;
        this.f24437c = str;
        this.f24438d = str3;
        this.f24439e = z10;
        this.f24440f = str4;
        this.f24441g = str5;
        this.f24442h = str6;
        this.f24443i = str7;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(80);
        q.c(this.f24436b, sb2);
        q.c(this.f24437c, sb2);
        q.c(this.f24438d, sb2);
        q.c(Boolean.toString(this.f24439e), sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f24441g;
    }

    public String f() {
        return this.f24442h;
    }

    public String g() {
        return this.f24440f;
    }

    public String h() {
        return this.f24437c;
    }

    public String i() {
        return this.f24438d;
    }

    public String j() {
        return this.f24443i;
    }

    public String k() {
        return this.f24436b;
    }

    public boolean l() {
        return this.f24439e;
    }
}
