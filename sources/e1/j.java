package e1;

import d.m0;
import p7.a;

public class j<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f6732a;

    /* renamed from: b  reason: collision with root package name */
    public final S f6733b;

    public j(F f10, S s10) {
        this.f6732a = f10;
        this.f6733b = s10;
    }

    @m0
    public static <A, B> j<A, B> a(A a10, B b10) {
        return new j<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(jVar.f6732a, this.f6732a) && i.a(jVar.f6733b, this.f6733b);
    }

    public int hashCode() {
        F f10 = this.f6732a;
        int i10 = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f6733b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    @m0
    public String toString() {
        return "Pair{" + this.f6732a + " " + this.f6733b + a.f11639j;
    }
}
