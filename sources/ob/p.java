package ob;

import qa.h;

public final class p extends q {

    /* renamed from: d  reason: collision with root package name */
    public static final int f21346d = 10;

    /* renamed from: b  reason: collision with root package name */
    public final int f21347b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21348c;

    public p(int i10, int i11, int i12) throws h {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw h.a();
        }
        this.f21347b = i11;
        this.f21348c = i12;
    }

    public int b() {
        return this.f21347b;
    }

    public int c() {
        return this.f21348c;
    }

    public int d() {
        return (this.f21347b * 10) + this.f21348c;
    }

    public boolean e() {
        return this.f21347b == 10;
    }

    public boolean f() {
        return this.f21348c == 10;
    }
}
