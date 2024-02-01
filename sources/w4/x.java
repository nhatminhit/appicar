package w4;

import c5.e;
import c5.k;
import d5.g;
import w4.f;
import w4.i;
import w4.l;
import w4.x;

public abstract class x<F extends f, B extends x<F, B>> {

    /* renamed from: f  reason: collision with root package name */
    public static final int f14675f = f.a.a();

    /* renamed from: g  reason: collision with root package name */
    public static final int f14676g = l.a.a();

    /* renamed from: h  reason: collision with root package name */
    public static final int f14677h = i.b.a();

    /* renamed from: a  reason: collision with root package name */
    public int f14678a;

    /* renamed from: b  reason: collision with root package name */
    public int f14679b;

    /* renamed from: c  reason: collision with root package name */
    public int f14680c;

    /* renamed from: d  reason: collision with root package name */
    public e f14681d;

    /* renamed from: e  reason: collision with root package name */
    public k f14682e;

    public x() {
        this.f14678a = f14675f;
        this.f14679b = f14676g;
        this.f14680c = f14677h;
        this.f14681d = null;
        this.f14682e = null;
    }

    public x(int i10, int i11, int i12) {
        this.f14678a = i10;
        this.f14679b = i11;
        this.f14680c = i12;
    }

    public x(f fVar) {
        this(fVar.R, fVar.S, fVar.T);
    }

    public B A(v vVar) {
        this.f14679b = vVar.i().e() | this.f14679b;
        return f();
    }

    public B B(v vVar, v... vVarArr) {
        this.f14679b = vVar.i().e() | this.f14679b;
        for (v i10 : vVarArr) {
            this.f14679b = i10.i().e() | this.f14679b;
        }
        return f();
    }

    public B C(w wVar) {
        this.f14680c = wVar.i().e() | this.f14680c;
        return f();
    }

    public B D(w wVar, w... wVarArr) {
        this.f14680c = wVar.i().e() | this.f14680c;
        for (w i10 : wVarArr) {
            this.f14680c = i10.i().e() | this.f14680c;
        }
        return f();
    }

    public int E() {
        return this.f14678a;
    }

    public e F() {
        return this.f14681d;
    }

    public B G(e eVar) {
        this.f14681d = eVar;
        return f();
    }

    public k H() {
        return this.f14682e;
    }

    public B I(k kVar) {
        this.f14682e = kVar;
        return f();
    }

    public int J() {
        return this.f14679b;
    }

    public int K() {
        return this.f14680c;
    }

    public final B a(Object obj) {
        throw new IllegalArgumentException("Feature " + obj.getClass().getName() + "#" + obj.toString() + " not supported for non-JSON backend");
    }

    public void b(i.b bVar) {
        if (bVar != null) {
            this.f14680c = (~bVar.e()) & this.f14680c;
        }
    }

    public void c(l.a aVar) {
        if (aVar != null) {
            this.f14679b = (~aVar.e()) & this.f14679b;
        }
    }

    public void d(i.b bVar) {
        if (bVar != null) {
            this.f14680c = bVar.e() | this.f14680c;
        }
    }

    public void e(l.a aVar) {
        if (aVar != null) {
            this.f14679b = aVar.e() | this.f14679b;
        }
    }

    public final B f() {
        return this;
    }

    public abstract F g();

    public B h(d5.e eVar, boolean z10) {
        return a(eVar);
    }

    public B i(g gVar, boolean z10) {
        return a(gVar);
    }

    public B j(f.a aVar, boolean z10) {
        return z10 ? z(aVar) : q(aVar);
    }

    public B k(v vVar, boolean z10) {
        return z10 ? A(vVar) : r(vVar);
    }

    public B l(w wVar, boolean z10) {
        return z10 ? C(wVar) : t(wVar);
    }

    public B m(d5.e eVar) {
        return a(eVar);
    }

    public B n(d5.e eVar, d5.e... eVarArr) {
        return a(eVar);
    }

    public B o(g gVar) {
        return a(gVar);
    }

    public B p(g gVar, g... gVarArr) {
        return a(gVar);
    }

    public B q(f.a aVar) {
        this.f14678a = (~aVar.e()) & this.f14678a;
        return f();
    }

    public B r(v vVar) {
        this.f14679b = (~vVar.i().e()) & this.f14679b;
        return f();
    }

    public B s(v vVar, v... vVarArr) {
        this.f14679b = (~vVar.i().e()) & this.f14679b;
        for (v i10 : vVarArr) {
            this.f14679b = (~i10.i().e()) & this.f14679b;
        }
        return f();
    }

    public B t(w wVar) {
        this.f14680c = (~wVar.i().e()) & this.f14680c;
        return f();
    }

    public B u(w wVar, w... wVarArr) {
        this.f14680c = (~wVar.i().e()) & this.f14680c;
        for (w i10 : wVarArr) {
            this.f14680c = (~i10.i().e()) & this.f14680c;
        }
        return f();
    }

    public B v(d5.e eVar) {
        return a(eVar);
    }

    public B w(d5.e eVar, d5.e... eVarArr) {
        return a(eVar);
    }

    public B x(g gVar) {
        return a(gVar);
    }

    public B y(g gVar, g... gVarArr) {
        return a(gVar);
    }

    public B z(f.a aVar) {
        this.f14678a = aVar.e() | this.f14678a;
        return f();
    }
}
