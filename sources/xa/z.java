package xa;

public final class z extends q {

    /* renamed from: b  reason: collision with root package name */
    public final String f24481b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24482c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24483d;

    public z(String str, String str2, String str3) {
        super(r.TEL);
        this.f24481b = str;
        this.f24482c = str2;
        this.f24483d = str3;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(20);
        q.c(this.f24481b, sb2);
        q.c(this.f24483d, sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f24481b;
    }

    public String f() {
        return this.f24482c;
    }

    public String g() {
        return this.f24483d;
    }
}
