package y5;

import i5.e0;
import i5.j;
import i5.l;
import i5.m;
import j5.a;
import java.io.IOException;
import java.lang.reflect.Type;
import s5.g;
import w4.i;

@a
public final class n0 extends l0<Object> {
    public static final long R = 1;

    public n0() {
        super(String.class, false);
    }

    public m a(e0 e0Var, Type type) {
        return u("string", true);
    }

    public void e(g gVar, j jVar) throws l {
        I(gVar, jVar);
    }

    public boolean h(e0 e0Var, Object obj) {
        return ((String) obj).length() == 0;
    }

    public void m(Object obj, i iVar, e0 e0Var) throws IOException {
        iVar.Z2((String) obj);
    }

    public final void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        iVar.Z2((String) obj);
    }
}
