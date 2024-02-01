package u2;

import a3.h;
import d.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public abstract class u0<T> extends u2 {
    public u0(n2 n2Var) {
        super(n2Var);
    }

    public abstract void g(h hVar, T t10);

    public final void h(Iterable<? extends T> iterable) {
        h a10 = a();
        try {
            for (Object g10 : iterable) {
                g(a10, g10);
                a10.I1();
            }
        } finally {
            f(a10);
        }
    }

    public final void i(T t10) {
        h a10 = a();
        try {
            g(a10, t10);
            a10.I1();
        } finally {
            f(a10);
        }
    }

    public final void j(T[] tArr) {
        h a10 = a();
        try {
            for (T g10 : tArr) {
                g(a10, g10);
                a10.I1();
            }
        } finally {
            f(a10);
        }
    }

    public final long k(T t10) {
        h a10 = a();
        try {
            g(a10, t10);
            return a10.I1();
        } finally {
            f(a10);
        }
    }

    public final long[] l(Collection<? extends T> collection) {
        h a10 = a();
        try {
            long[] jArr = new long[collection.size()];
            int i10 = 0;
            for (Object g10 : collection) {
                g(a10, g10);
                jArr[i10] = a10.I1();
                i10++;
            }
            return jArr;
        } finally {
            f(a10);
        }
    }

    public final long[] m(T[] tArr) {
        h a10 = a();
        try {
            long[] jArr = new long[tArr.length];
            int i10 = 0;
            for (T g10 : tArr) {
                g(a10, g10);
                jArr[i10] = a10.I1();
                i10++;
            }
            return jArr;
        } finally {
            f(a10);
        }
    }

    public final Long[] n(Collection<? extends T> collection) {
        h a10 = a();
        try {
            Long[] lArr = new Long[collection.size()];
            int i10 = 0;
            for (Object g10 : collection) {
                g(a10, g10);
                lArr[i10] = Long.valueOf(a10.I1());
                i10++;
            }
            return lArr;
        } finally {
            f(a10);
        }
    }

    public final Long[] o(T[] tArr) {
        h a10 = a();
        try {
            Long[] lArr = new Long[tArr.length];
            int i10 = 0;
            for (T g10 : tArr) {
                g(a10, g10);
                lArr[i10] = Long.valueOf(a10.I1());
                i10++;
            }
            return lArr;
        } finally {
            f(a10);
        }
    }

    public final List<Long> p(Collection<? extends T> collection) {
        h a10 = a();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i10 = 0;
            for (Object g10 : collection) {
                g(a10, g10);
                arrayList.add(i10, Long.valueOf(a10.I1()));
                i10++;
            }
            return arrayList;
        } finally {
            f(a10);
        }
    }

    public final List<Long> q(T[] tArr) {
        h a10 = a();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i10 = 0;
            for (T g10 : tArr) {
                g(a10, g10);
                arrayList.add(i10, Long.valueOf(a10.I1()));
                i10++;
            }
            return arrayList;
        } finally {
            f(a10);
        }
    }
}
