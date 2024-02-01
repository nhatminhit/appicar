package n5;

import a6.a;
import i5.g;
import i5.j;
import java.io.IOException;
import u5.f;
import w4.l;

public abstract class e0<T> extends a0<T> {
    public static final long T = 1;

    public e0(j jVar) {
        super(jVar);
    }

    public e0(Class<?> cls) {
        super(cls);
    }

    public e0(e0<?> e0Var) {
        super((a0<?>) e0Var);
    }

    public a c() {
        return a.ALWAYS_NULL;
    }

    public T g(l lVar, g gVar, T t10) throws IOException {
        gVar.a0(this);
        return f(lVar, gVar);
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return fVar.f(lVar, gVar);
    }

    public a l() {
        return a.CONSTANT;
    }

    public Boolean u(i5.f fVar) {
        return Boolean.FALSE;
    }
}
