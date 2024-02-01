package n5;

import a6.h;
import i5.c;
import i5.f;
import i5.j;
import i5.k;
import i5.l;
import i5.p;
import i5.q;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l5.r;
import n5.b0;
import q5.i;

public class c0 implements r, Serializable {
    public static final long O = 1;

    public static p b(f fVar, j jVar, k<?> kVar) {
        return new b0.a(jVar.g(), kVar);
    }

    public static p c(a6.k kVar) {
        return new b0.b(kVar, (i) null);
    }

    public static p d(a6.k kVar, i iVar) {
        return new b0.b(kVar, iVar);
    }

    public static p e(f fVar, j jVar) {
        Class<String> cls = String.class;
        c P0 = fVar.P0(jVar);
        Constructor<?> w10 = P0.w(cls);
        if (w10 != null) {
            if (fVar.c()) {
                h.g(w10, fVar.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new b0.c(w10);
        }
        Method m10 = P0.m(cls);
        if (m10 == null) {
            return null;
        }
        if (fVar.c()) {
            h.g(m10, fVar.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new b0.d(m10);
    }

    public p a(j jVar, f fVar, c cVar) throws l {
        Class<?> g10 = jVar.g();
        if (g10.isPrimitive()) {
            g10 = h.v0(g10);
        }
        return b0.g(g10);
    }
}
