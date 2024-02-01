package u2;

import a3.h;
import d.x0;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public abstract class t0<T> extends u2 {
    public t0(n2 n2Var) {
        super(n2Var);
    }

    public abstract String d();

    public abstract void g(h hVar, T t10);

    public final int h(T t10) {
        h a10 = a();
        try {
            g(a10, t10);
            return a10.K();
        } finally {
            f(a10);
        }
    }

    public final int i(Iterable<? extends T> iterable) {
        h a10 = a();
        int i10 = 0;
        try {
            for (Object g10 : iterable) {
                g(a10, g10);
                i10 += a10.K();
            }
            return i10;
        } finally {
            f(a10);
        }
    }

    public final int j(T[] tArr) {
        h a10 = a();
        try {
            int i10 = 0;
            for (T g10 : tArr) {
                g(a10, g10);
                i10 += a10.K();
            }
            return i10;
        } finally {
            f(a10);
        }
    }
}
