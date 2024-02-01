package x5;

import i5.d0;
import i5.e0;
import i5.j;
import i5.l;
import i5.m;
import java.io.IOException;
import java.lang.reflect.Type;
import s5.g;
import w4.i;
import w4.p;
import y5.m0;

public class r extends m0<Object> {
    public r() {
        super(Object.class);
    }

    public r(Class<?> cls) {
        super(cls, false);
    }

    public void M(e0 e0Var, Object obj) throws l {
        e0Var.A(g(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", new Object[]{obj.getClass().getName()}));
    }

    public m a(e0 e0Var, Type type) throws l {
        return null;
    }

    public void e(g gVar, j jVar) throws l {
        gVar.q(jVar);
    }

    public boolean h(e0 e0Var, Object obj) {
        return true;
    }

    public void m(Object obj, i iVar, e0 e0Var) throws IOException {
        if (e0Var.w0(d0.FAIL_ON_EMPTY_BEANS)) {
            M(e0Var, obj);
        }
        iVar.X2(obj, 0);
        iVar.g2();
    }

    public final void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        if (e0Var.w0(d0.FAIL_ON_EMPTY_BEANS)) {
            M(e0Var, obj);
        }
        iVar2.v(iVar, iVar2.o(iVar, iVar2.g(obj, p.START_OBJECT)));
    }
}
