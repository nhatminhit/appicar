package wf;

import fh.g;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import p000if.s;
import p000if.u;
import pf.z2;
import ve.e;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lwf/e0;", "", "Lpf/z2;", "a", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lpf/z2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class e0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f24091a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f24092b = t0.e(f0.f24098a, true);
    @g
    @e

    /* renamed from: c  reason: collision with root package name */
    public static final z2 f24093c;

    static {
        e0 e0Var = new e0();
        f24091a = e0Var;
        f24093c = e0Var.a();
    }

    public final z2 a() {
        T t10;
        z2 f10;
        Class cls = d0.class;
        try {
            List<d0> d10 = f24092b ? o.f24110a.d() : u.c3(s.e(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator<T> it = d10.iterator();
            if (!it.hasNext()) {
                t10 = null;
            } else {
                t10 = it.next();
                if (it.hasNext()) {
                    int c10 = ((d0) t10).c();
                    do {
                        T next = it.next();
                        int c11 = ((d0) next).c();
                        if (c10 < c11) {
                            t10 = next;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            }
            d0 d0Var = (d0) t10;
            return (d0Var == null || (f10 = f0.f(d0Var, d10)) == null) ? f0.b((Throwable) null, (String) null, 3, (Object) null) : f10;
        } catch (Throwable th2) {
            return f0.b(th2, (String) null, 2, (Object) null);
        }
    }
}
