package ua;

import ya.a;

public abstract class g {

    /* renamed from: b  reason: collision with root package name */
    public static final g f23340b = new e((g) null, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final g f23341a;

    public g(g gVar) {
        this.f23341a = gVar;
    }

    public final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    public final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    public abstract void c(a aVar, byte[] bArr);

    public final g d() {
        return this.f23341a;
    }
}
