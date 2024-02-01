package xa;

import p7.f;

public final class h0 extends q {

    /* renamed from: b  reason: collision with root package name */
    public final String f24423b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24424c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24425d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24426e;

    /* renamed from: f  reason: collision with root package name */
    public final String f24427f;

    /* renamed from: g  reason: collision with root package name */
    public final String f24428g;

    /* renamed from: h  reason: collision with root package name */
    public final int f24429h;

    /* renamed from: i  reason: collision with root package name */
    public final char f24430i;

    /* renamed from: j  reason: collision with root package name */
    public final String f24431j;

    public h0(String str, String str2, String str3, String str4, String str5, String str6, int i10, char c10, String str7) {
        super(r.VIN);
        this.f24423b = str;
        this.f24424c = str2;
        this.f24425d = str3;
        this.f24426e = str4;
        this.f24427f = str5;
        this.f24428g = str6;
        this.f24429h = i10;
        this.f24430i = c10;
        this.f24431j = str7;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(this.f24424c);
        sb2.append(f.f11698i);
        sb2.append(this.f24425d);
        sb2.append(f.f11698i);
        sb2.append(this.f24426e);
        sb2.append(10);
        String str = this.f24427f;
        if (str != null) {
            sb2.append(str);
            sb2.append(f.f11698i);
        }
        sb2.append(this.f24429h);
        sb2.append(f.f11698i);
        sb2.append(this.f24430i);
        sb2.append(f.f11698i);
        sb2.append(this.f24431j);
        sb2.append(10);
        return sb2.toString();
    }

    public String e() {
        return this.f24427f;
    }

    public int f() {
        return this.f24429h;
    }

    public char g() {
        return this.f24430i;
    }

    public String h() {
        return this.f24431j;
    }

    public String i() {
        return this.f24423b;
    }

    public String j() {
        return this.f24428g;
    }

    public String k() {
        return this.f24425d;
    }

    public String l() {
        return this.f24426e;
    }

    public String m() {
        return this.f24424c;
    }
}
