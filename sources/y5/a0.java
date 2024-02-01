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

public class a0<T> extends m0<T> {
    public a0(Class<?> cls) {
        super(cls, false);
    }

    public m a(e0 e0Var, Type type) {
        return u("string", true);
    }

    public void e(g gVar, j jVar) throws l {
        I(gVar, jVar);
    }

    public void m(T t10, i iVar, e0 e0Var) throws IOException {
        iVar.N2(t10.toString());
    }

    public void n(T t10, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.g(t10, p.VALUE_EMBEDDED_OBJECT));
        m(t10, iVar, e0Var);
        iVar2.v(iVar, o10);
    }
}
