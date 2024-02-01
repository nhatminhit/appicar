package qa;

import ya.a;
import ya.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f22164a;

    /* renamed from: b  reason: collision with root package name */
    public b f22165b;

    public c(b bVar) {
        if (bVar != null) {
            this.f22164a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public c a(int i10, int i11, int i12, int i13) {
        return new c(this.f22164a.a(this.f22164a.e().a(i10, i11, i12, i13)));
    }

    public b b() throws m {
        if (this.f22165b == null) {
            this.f22165b = this.f22164a.b();
        }
        return this.f22165b;
    }

    public a c(int i10, a aVar) throws m {
        return this.f22164a.c(i10, aVar);
    }

    public int d() {
        return this.f22164a.d();
    }

    public int e() {
        return this.f22164a.f();
    }

    public boolean f() {
        return this.f22164a.e().g();
    }

    public boolean g() {
        return this.f22164a.e().h();
    }

    public c h() {
        return new c(this.f22164a.a(this.f22164a.e().i()));
    }

    public c i() {
        return new c(this.f22164a.a(this.f22164a.e().j()));
    }

    public String toString() {
        try {
            return b().toString();
        } catch (m unused) {
            return "";
        }
    }
}
