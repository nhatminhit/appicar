package n5;

import a6.a;
import i5.d;
import i5.g;
import i5.k;
import i5.l;
import java.io.IOException;
import java.util.Collection;
import l5.t;
import l5.v;
import m5.s;
import u5.f;

public abstract class i extends a0<Object> implements l5.i, t {
    public static final long U = 1;
    public final k<?> T;

    public i(k<?> kVar) {
        super(kVar.r());
        this.T = kVar;
    }

    public abstract k<?> E0(k<?> kVar);

    public k<?> a(g gVar, d dVar) throws l {
        k<?> f02 = gVar.f0(this.T, dVar, gVar.H(this.T.r()));
        return f02 == this.T ? this : E0(f02);
    }

    public void b(g gVar) throws l {
        k<?> kVar = this.T;
        if (kVar instanceof t) {
            ((t) kVar).b(gVar);
        }
    }

    public a c() {
        return this.T.c();
    }

    public Object d(g gVar) throws l {
        return this.T.d(gVar);
    }

    public Object f(w4.l lVar, g gVar) throws IOException {
        return this.T.f(lVar, gVar);
    }

    public Object g(w4.l lVar, g gVar, Object obj) throws IOException {
        return this.T.g(lVar, gVar, obj);
    }

    public Object h(w4.l lVar, g gVar, f fVar) throws IOException {
        return this.T.h(lVar, gVar, fVar);
    }

    public v j(String str) {
        return this.T.j(str);
    }

    public k<?> k() {
        return this.T;
    }

    public Object n(g gVar) throws l {
        return this.T.n(gVar);
    }

    public Collection<Object> o() {
        return this.T.o();
    }

    public s q() {
        return this.T.q();
    }

    public boolean s() {
        return this.T.s();
    }

    public k<?> t(k<?> kVar) {
        return kVar == this.T ? this : E0(kVar);
    }

    public Boolean u(i5.f fVar) {
        return this.T.u(fVar);
    }
}
