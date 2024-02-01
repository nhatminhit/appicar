package a6;

import i5.j;
import i5.y;
import java.io.Serializable;
import k5.i;
import z5.b;

public class x implements Serializable {
    public static final long P = 1;
    public transient q<b, y> O = new q<>(20, 200);

    public y a(j jVar, i<?> iVar) {
        return b(jVar.g(), iVar);
    }

    public y b(Class<?> cls, i<?> iVar) {
        b bVar = new b(cls);
        y b10 = this.O.b(bVar);
        if (b10 != null) {
            return b10;
        }
        y a02 = iVar.m().a0(iVar.P(cls).z());
        if (a02 == null || !a02.f()) {
            a02 = y.a(cls.getSimpleName());
        }
        this.O.c(bVar, a02);
        return a02;
    }

    public Object c() {
        return new x();
    }
}
