package a6;

import d5.d;
import w4.j;
import w4.n;
import w4.o;

public class c0 extends o {

    /* renamed from: f  reason: collision with root package name */
    public final o f236f;

    /* renamed from: g  reason: collision with root package name */
    public final j f237g;

    /* renamed from: h  reason: collision with root package name */
    public String f238h;

    /* renamed from: i  reason: collision with root package name */
    public Object f239i;

    public c0() {
        super(0, -1);
        this.f236f = null;
        this.f237g = j.V;
    }

    public c0(c0 c0Var, int i10, int i11) {
        super(i10, i11);
        this.f236f = c0Var;
        this.f237g = c0Var.f237g;
    }

    public c0(o oVar, Object obj) {
        super(oVar);
        this.f236f = oVar.e();
        this.f238h = oVar.b();
        this.f239i = oVar.c();
        this.f237g = oVar instanceof d ? ((d) oVar).f(obj) : j.V;
    }

    public c0(o oVar, j jVar) {
        super(oVar);
        this.f236f = oVar.e();
        this.f238h = oVar.b();
        this.f239i = oVar.c();
        this.f237g = jVar;
    }

    public static c0 t(o oVar) {
        return oVar == null ? new c0() : new c0(oVar, (j) null);
    }

    public String b() {
        return this.f238h;
    }

    public Object c() {
        return this.f239i;
    }

    public o e() {
        return this.f236f;
    }

    public boolean i() {
        return this.f238h != null;
    }

    public void p(Object obj) {
        this.f239i = obj;
    }

    public c0 r() {
        this.f14649b++;
        return new c0(this, 1, -1);
    }

    public c0 s() {
        this.f14649b++;
        return new c0(this, 2, -1);
    }

    public c0 u() {
        o oVar = this.f236f;
        return oVar instanceof c0 ? (c0) oVar : oVar == null ? new c0() : new c0(oVar, this.f237g);
    }

    public void v(String str) throws n {
        this.f238h = str;
    }

    public void w() {
        this.f14649b++;
    }
}
