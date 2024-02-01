package xa;

public final class m extends q {

    /* renamed from: b  reason: collision with root package name */
    public final double f24461b;

    /* renamed from: c  reason: collision with root package name */
    public final double f24462c;

    /* renamed from: d  reason: collision with root package name */
    public final double f24463d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24464e;

    public m(double d10, double d11, double d12, String str) {
        super(r.GEO);
        this.f24461b = d10;
        this.f24462c = d11;
        this.f24463d = d12;
        this.f24464e = str;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(this.f24461b);
        sb2.append(", ");
        sb2.append(this.f24462c);
        if (this.f24463d > 0.0d) {
            sb2.append(", ");
            sb2.append(this.f24463d);
            sb2.append('m');
        }
        if (this.f24464e != null) {
            sb2.append(" (");
            sb2.append(this.f24464e);
            sb2.append(')');
        }
        return sb2.toString();
    }

    public double e() {
        return this.f24463d;
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("geo:");
        sb2.append(this.f24461b);
        sb2.append(',');
        sb2.append(this.f24462c);
        if (this.f24463d > 0.0d) {
            sb2.append(',');
            sb2.append(this.f24463d);
        }
        if (this.f24464e != null) {
            sb2.append('?');
            sb2.append(this.f24464e);
        }
        return sb2.toString();
    }

    public double g() {
        return this.f24461b;
    }

    public double h() {
        return this.f24462c;
    }

    public String i() {
        return this.f24464e;
    }
}
