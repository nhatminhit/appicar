package y5;

import g5.c;
import i5.e0;
import i5.j;
import i5.l;
import i5.m;
import java.io.IOException;
import java.lang.reflect.Type;
import s5.g;
import w4.i;
import w4.p;

public abstract class q0 extends m0<Object> {
    public q0(Class<?> cls) {
        super(cls, false);
    }

    public abstract String M(Object obj);

    public m a(e0 e0Var, Type type) throws l {
        return u("string", true);
    }

    public void e(g gVar, j jVar) throws l {
        I(gVar, jVar);
    }

    public boolean h(e0 e0Var, Object obj) {
        return M(obj).isEmpty();
    }

    public void m(Object obj, i iVar, e0 e0Var) throws IOException {
        iVar.Z2(M(obj));
    }

    public void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.g(obj, p.VALUE_STRING));
        m(obj, iVar, e0Var);
        iVar2.v(iVar, o10);
    }
}
