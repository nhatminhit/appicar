package v3;

import androidx.collection.a;
import d.m0;
import d.o0;
import java.security.MessageDigest;
import t4.b;

public final class i implements f {

    /* renamed from: c  reason: collision with root package name */
    public final a<h<?>, Object> f14166c = new b();

    public static <T> void f(@m0 h<T> hVar, @m0 Object obj, @m0 MessageDigest messageDigest) {
        hVar.h(obj, messageDigest);
    }

    public void a(@m0 MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f14166c.size(); i10++) {
            f(this.f14166c.m(i10), this.f14166c.q(i10), messageDigest);
        }
    }

    @o0
    public <T> T c(@m0 h<T> hVar) {
        return this.f14166c.containsKey(hVar) ? this.f14166c.get(hVar) : hVar.d();
    }

    public void d(@m0 i iVar) {
        this.f14166c.n(iVar.f14166c);
    }

    @m0
    public <T> i e(@m0 h<T> hVar, @m0 T t10) {
        this.f14166c.put(hVar, t10);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f14166c.equals(((i) obj).f14166c);
        }
        return false;
    }

    public int hashCode() {
        return this.f14166c.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f14166c + '}';
    }
}
