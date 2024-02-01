package le;

import fh.h;
import ie.e;
import ie.g;
import xe.l0;
import zd.h1;

@h1(version = "1.3")
public abstract class d extends a {
    @h
    public final g P;
    @h
    public transient ie.d<Object> Q;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(@h ie.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.e() : null);
    }

    public d(@h ie.d<Object> dVar, @h g gVar) {
        super(dVar);
        this.P = gVar;
    }

    public void L() {
        ie.d<Object> dVar = this.Q;
        if (!(dVar == null || dVar == this)) {
            g.b g10 = e().g(e.B);
            l0.m(g10);
            ((e) g10).t(dVar);
        }
        this.Q = c.O;
    }

    @fh.g
    public final ie.d<Object> N() {
        ie.d<Object> dVar = this.Q;
        if (dVar == null) {
            e eVar = (e) e().g(e.B);
            if (eVar == null || (dVar = eVar.Y(this)) == null) {
                dVar = this;
            }
            this.Q = dVar;
        }
        return dVar;
    }

    @fh.g
    public g e() {
        g gVar = this.P;
        l0.m(gVar);
        return gVar;
    }
}
