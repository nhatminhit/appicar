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

public class h extends p implements Serializable {
    public static final long X = 1;

    public h(j jVar, g gVar, String str, boolean z10, j jVar2) {
        super(jVar, gVar, str, z10, jVar2);
    }

    public h(h hVar, d dVar) {
        super(hVar, dVar);
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
        return dVar == this.Q ? this : new h(this, dVar);
    }

    public f0.a k() {
        return f0.a.WRAPPER_OBJECT;
    }

    public Object t(l lVar, i5.g gVar) throws IOException {
        Object d22;
        if (lVar.q() && (d22 = lVar.d2()) != null) {
            return m(lVar, gVar, d22);
        }
        p P = lVar.P();
        p pVar = p.START_OBJECT;
        if (P == pVar) {
            p D2 = lVar.D2();
            p pVar2 = p.FIELD_NAME;
            if (D2 != pVar2) {
                j r10 = r();
                gVar.X0(r10, pVar2, "need JSON String that contains type id (for subtype of " + s() + ")", new Object[0]);
            }
        } else if (P != p.FIELD_NAME) {
            j r11 = r();
            gVar.X0(r11, pVar, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + s(), new Object[0]);
        }
        String Y1 = lVar.Y1();
        k<Object> o10 = o(gVar, Y1);
        lVar.D2();
        if (this.T && lVar.q2(pVar)) {
            b0 b0Var = new b0((s) null, false);
            b0Var.V2();
            b0Var.i2(this.S);
            b0Var.Z2(Y1);
            lVar.w();
            lVar = h5.j.e3(false, b0Var.u3(lVar), lVar);
            lVar.D2();
        }
        Object f10 = o10.f(lVar, gVar);
        p D22 = lVar.D2();
        p pVar3 = p.END_OBJECT;
        if (D22 != pVar3) {
            gVar.X0(r(), pVar3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return f10;
    }
}
