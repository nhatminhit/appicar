package x5;

import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.e0;
import i5.l;
import i5.o;
import java.io.IOException;
import u5.i;

public final class q extends o<Object> implements j {
    public final i O;
    public final o<Object> P;

    public q(i iVar, o<?> oVar) {
        this.O = iVar;
        this.P = oVar;
    }

    public o<?> d(e0 e0Var, d dVar) throws l {
        o oVar = this.P;
        if (oVar instanceof j) {
            oVar = e0Var.s0(oVar, dVar);
        }
        return oVar == this.P ? this : new q(this.O, oVar);
    }

    public Class<Object> g() {
        return Object.class;
    }

    public void m(Object obj, w4.i iVar, e0 e0Var) throws IOException {
        this.P.n(obj, iVar, e0Var, this.O);
    }

    public void n(Object obj, w4.i iVar, e0 e0Var, i iVar2) throws IOException {
        this.P.n(obj, iVar, e0Var, iVar2);
    }

    public i r() {
        return this.O;
    }

    public o<Object> s() {
        return this.P;
    }
}
