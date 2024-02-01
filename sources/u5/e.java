package u5;

import i5.j;
import java.util.Collection;
import k5.i;
import q5.b;
import q5.h;

public abstract class e {
    @Deprecated
    public Collection<c> a(b bVar, i<?> iVar, i5.b bVar2) {
        return c(iVar, bVar);
    }

    @Deprecated
    public Collection<c> b(h hVar, i<?> iVar, i5.b bVar, j jVar) {
        return d(iVar, hVar, jVar);
    }

    public Collection<c> c(i<?> iVar, b bVar) {
        return a(bVar, iVar, iVar.m());
    }

    public Collection<c> d(i<?> iVar, h hVar, j jVar) {
        return b(hVar, iVar, iVar.m(), jVar);
    }

    public Collection<c> e(i<?> iVar, b bVar) {
        return a(bVar, iVar, iVar.m());
    }

    public Collection<c> f(i<?> iVar, h hVar, j jVar) {
        return b(hVar, iVar, iVar.m(), jVar);
    }

    public e g() {
        return this;
    }

    public abstract void h(Collection<Class<?>> collection);

    public abstract void i(Class<?>... clsArr);

    public abstract void j(c... cVarArr);
}
