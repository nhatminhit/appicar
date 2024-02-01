package v5;

import a6.b0;
import i5.d;
import i5.j;
import i5.k;
import java.io.IOException;
import java.io.Serializable;
import u5.f;
import u5.g;
import v4.f0;
import w4.l;
import w4.p;
import w4.s;

public class a extends p implements Serializable {
    public static final long X = 1;

    public a(j jVar, g gVar, String str, boolean z10, j jVar2) {
        super(jVar, gVar, str, z10, jVar2);
    }

    public a(a aVar, d dVar) {
        super(aVar, dVar);
    }

    public Object c(l lVar, i5.g gVar) throws IOException {
        return t(lVar, gVar);
    }

    public Object d(l lVar, i5.g gVar) throws IOException {
        return t(lVar, gVar);
    }

    public Object e(l lVar, i5.g gVar) throws IOException {
        return t(lVar, gVar);
    }

    public Object f(l lVar, i5.g gVar) throws IOException {
        return t(lVar, gVar);
    }

    public f g(d dVar) {
        return dVar == this.Q ? this : new a(this, dVar);
    }

    public f0.a k() {
        return f0.a.WRAPPER_ARRAY;
    }

    public Object t(l lVar, i5.g gVar) throws IOException {
        p pVar;
        Object d22;
        if (lVar.q() && (d22 = lVar.d2()) != null) {
            return m(lVar, gVar, d22);
        }
        boolean u22 = lVar.u2();
        String u10 = u(lVar, gVar);
        k<Object> o10 = o(gVar, u10);
        if (this.T && !v() && lVar.q2(p.START_OBJECT)) {
            b0 b0Var = new b0((s) null, false);
            b0Var.V2();
            b0Var.i2(this.S);
            b0Var.Z2(u10);
            lVar.w();
            lVar = h5.j.e3(false, b0Var.u3(lVar), lVar);
            lVar.D2();
        }
        if (u22 && lVar.P() == p.END_ARRAY) {
            return o10.d(gVar);
        }
        Object f10 = o10.f(lVar, gVar);
        if (u22 && lVar.D2() != (pVar = p.END_ARRAY)) {
            gVar.X0(r(), pVar, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
        }
        return f10;
    }

    public String u(l lVar, i5.g gVar) throws IOException {
        if (lVar.u2()) {
            p D2 = lVar.D2();
            p pVar = p.VALUE_STRING;
            if (D2 == pVar) {
                String Y1 = lVar.Y1();
                lVar.D2();
                return Y1;
            } else if (this.R == null) {
                gVar.X0(r(), pVar, "need JSON String that contains type id (for subtype of %s)", s());
                return null;
            }
        } else if (this.R == null) {
            j r10 = r();
            p pVar2 = p.START_ARRAY;
            gVar.X0(r10, pVar2, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + s(), new Object[0]);
            return null;
        }
        return this.O.d();
    }

    public boolean v() {
        return false;
    }
}
