package y5;

import g5.c;
import i5.e0;
import java.io.IOException;
import java.util.TimeZone;
import w4.i;
import w4.p;

public class o0 extends l0<TimeZone> {
    public o0() {
        super(TimeZone.class);
    }

    /* renamed from: M */
    public void m(TimeZone timeZone, i iVar, e0 e0Var) throws IOException {
        iVar.Z2(timeZone.getID());
    }

    /* renamed from: N */
    public void n(TimeZone timeZone, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.f(timeZone, TimeZone.class, p.VALUE_STRING));
        m(timeZone, iVar, e0Var);
        iVar2.v(iVar, o10);
    }
}
