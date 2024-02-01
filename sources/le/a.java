package le;

import fh.g;
import fh.h;
import ie.d;
import java.io.Serializable;
import xe.l0;
import zd.d1;
import zd.e1;
import zd.h1;
import zd.u2;

@h1(version = "1.3")
public abstract class a implements d<Object>, e, Serializable {
    @h
    public final d<Object> O;

    public a(@h d<Object> dVar) {
        this.O = dVar;
    }

    @g
    public d<u2> G(@g d<?> dVar) {
        l0.p(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @g
    public d<u2> H(@h Object obj, @g d<?> dVar) {
        l0.p(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @h
    public final d<Object> J() {
        return this.O;
    }

    @h
    public abstract Object K(@g Object obj);

    public void L() {
    }

    @h
    public StackTraceElement R() {
        return g.e(this);
    }

    @g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object R = R();
        if (R == null) {
            R = getClass().getName();
        }
        sb2.append(R);
        return sb2.toString();
    }

    @h
    public e u() {
        d<Object> dVar = this.O;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final void x(@g Object obj) {
        d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            d dVar2 = aVar.O;
            l0.m(dVar2);
            try {
                Object K = aVar.K(obj);
                if (K != ke.d.h()) {
                    d1.a aVar2 = d1.P;
                    obj = d1.b(K);
                    aVar.L();
                    if (dVar2 instanceof a) {
                        dVar = dVar2;
                    } else {
                        dVar2.x(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                d1.a aVar3 = d1.P;
                obj = d1.b(e1.a(th2));
            }
        }
    }
}
