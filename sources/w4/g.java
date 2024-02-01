package w4;

import c5.b;
import c5.m;
import d5.e;
import w4.i;

public class g extends x<f, g> {

    /* renamed from: i  reason: collision with root package name */
    public b f14626i;

    /* renamed from: j  reason: collision with root package name */
    public u f14627j;

    /* renamed from: k  reason: collision with root package name */
    public int f14628k;

    /* renamed from: l  reason: collision with root package name */
    public char f14629l;

    public g() {
        this.f14629l = '\"';
        this.f14627j = f.f14623g0;
        this.f14628k = 0;
    }

    public g(f fVar) {
        super(fVar);
        this.f14629l = '\"';
        this.f14626i = fVar.v0();
        this.f14627j = fVar.Y;
        this.f14628k = fVar.Z;
    }

    public b L() {
        return this.f14626i;
    }

    public g M(b bVar) {
        this.f14626i = bVar;
        return this;
    }

    /* renamed from: N */
    public g h(e eVar, boolean z10) {
        return z10 ? v(eVar) : m(eVar);
    }

    /* renamed from: O */
    public g i(d5.g gVar, boolean z10) {
        return z10 ? x(gVar) : o(gVar);
    }

    /* renamed from: P */
    public g m(e eVar) {
        c(eVar.i());
        return this;
    }

    /* renamed from: Q */
    public g n(e eVar, e... eVarArr) {
        c(eVar.i());
        for (e i10 : eVarArr) {
            e(i10.i());
        }
        return this;
    }

    /* renamed from: R */
    public g o(d5.g gVar) {
        b(gVar.i());
        return this;
    }

    /* renamed from: S */
    public g p(d5.g gVar, d5.g... gVarArr) {
        b(gVar.i());
        for (d5.g i10 : gVarArr) {
            b(i10.i());
        }
        return this;
    }

    /* renamed from: T */
    public g v(e eVar) {
        e(eVar.i());
        return this;
    }

    /* renamed from: U */
    public g w(e eVar, e... eVarArr) {
        e(eVar.i());
        v(eVar);
        for (e i10 : eVarArr) {
            e(i10.i());
        }
        return this;
    }

    /* renamed from: V */
    public g x(d5.g gVar) {
        i.b i10 = gVar.i();
        if (i10 != null) {
            d(i10);
        }
        return this;
    }

    /* renamed from: W */
    public g y(d5.g gVar, d5.g... gVarArr) {
        d(gVar.i());
        for (d5.g i10 : gVarArr) {
            d(i10.i());
        }
        return this;
    }

    public int X() {
        return this.f14628k;
    }

    public g Y(int i10) {
        this.f14628k = i10 <= 0 ? 0 : Math.max(127, i10);
        return this;
    }

    public char Z() {
        return this.f14629l;
    }

    public g a0(char c10) {
        if (c10 <= 127) {
            this.f14629l = c10;
            return this;
        }
        throw new IllegalArgumentException("Can only use Unicode characters up to 0x7F as quote characters");
    }

    public g b0(String str) {
        this.f14627j = str == null ? null : new m(str);
        return this;
    }

    public g c0(u uVar) {
        this.f14627j = uVar;
        return this;
    }

    public u d0() {
        return this.f14627j;
    }

    public f g() {
        return new f(this);
    }
}
