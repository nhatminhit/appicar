package y5;

import i5.j;
import i5.l;
import i5.m;
import j5.a;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.Time;
import s5.g;
import s5.n;
import w4.i;

@a
public class e0 extends l0<Time> {
    public e0() {
        super(Time.class);
    }

    /* renamed from: M */
    public void m(Time time, i iVar, i5.e0 e0Var) throws IOException {
        iVar.Z2(time.toString());
    }

    public m a(i5.e0 e0Var, Type type) {
        return u("string", true);
    }

    public void e(g gVar, j jVar) throws l {
        J(gVar, jVar, n.DATE_TIME);
    }
}
