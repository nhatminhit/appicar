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

public abstract class l0<T> extends m0<T> {
    public l0(Class<T> cls) {
        super(cls);
    }

    public l0(Class<?> cls, boolean z10) {
        super(cls);
    }

    public m a(e0 e0Var, Type type) throws l {
        return u("string", true);
    }

    public void e(g gVar, j jVar) throws l {
        I(gVar, jVar);
    }

    public void n(T t10, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.g(t10, p.VALUE_STRING));
        m(t10, iVar, e0Var);
        iVar2.v(iVar, o10);
    }
}
