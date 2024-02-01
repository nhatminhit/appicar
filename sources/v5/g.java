package v5;

import i5.d;
import v4.f0;

public class g extends b {

    /* renamed from: c  reason: collision with root package name */
    public final String f14178c;

    public g(u5.g gVar, d dVar, String str) {
        super(gVar, dVar);
        this.f14178c = str;
    }

    /* renamed from: E */
    public g b(d dVar) {
        return this.f14197b == dVar ? this : new g(this.f14196a, dVar, this.f14178c);
    }

    public String c() {
        return this.f14178c;
    }

    public f0.a e() {
        return f0.a.PROPERTY;
    }
}
