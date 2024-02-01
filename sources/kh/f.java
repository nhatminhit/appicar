package kh;

import ih.b;

public class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f20292c = new f(false, false);

    /* renamed from: d  reason: collision with root package name */
    public static final f f20293d = new f(true, true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20294a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20295b;

    public f(boolean z10, boolean z11) {
        this.f20294a = z10;
        this.f20295b = z11;
    }

    public String a(String str) {
        String trim = str.trim();
        return !this.f20295b ? b.a(trim) : trim;
    }

    public jh.b b(jh.b bVar) {
        if (bVar != null && !this.f20295b) {
            bVar.L();
        }
        return bVar;
    }

    public String c(String str) {
        String trim = str.trim();
        return !this.f20294a ? b.a(trim) : trim;
    }

    public boolean d() {
        return this.f20295b;
    }

    public boolean e() {
        return this.f20294a;
    }
}
