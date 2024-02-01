package i5;

import a6.b;
import a6.j;
import j5.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q5.d;
import q5.f;
import q5.h;
import q5.i;
import q5.s;
import q5.z;
import v4.n;
import v4.u;
import z5.m;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final j f9033a;

    public c(j jVar) {
        this.f9033a = jVar;
    }

    public abstract List<d> A();

    public abstract List<i> B();

    public abstract Set<String> C();

    public abstract z D();

    public j E() {
        return this.f9033a;
    }

    public abstract boolean F();

    public abstract Object G(boolean z10);

    public boolean H() {
        return z().D();
    }

    @Deprecated
    public abstract j I(Type type);

    @Deprecated
    public abstract m a();

    public abstract h b();

    @Deprecated
    public i c() {
        h d10 = d();
        if (d10 instanceof i) {
            return (i) d10;
        }
        return null;
    }

    public abstract h d();

    @Deprecated
    public h e() {
        h d10 = d();
        if (d10 instanceof f) {
            return d10;
        }
        return null;
    }

    @Deprecated
    public abstract Map<String, h> f();

    public abstract List<s> g();

    public String h() {
        return null;
    }

    public abstract d i();

    public abstract Class<?>[] j();

    public abstract j<Object, Object> k();

    public abstract n.d l(n.d dVar);

    public abstract Method m(Class<?>... clsArr);

    public abstract Map<Object, h> n();

    public abstract h o();

    @Deprecated
    public abstract i p();

    public abstract i q(String str, Class<?>[] clsArr);

    public abstract Class<?> r();

    public abstract e.a s();

    public abstract List<s> t();

    public abstract u.b u(u.b bVar);

    public abstract j<Object, Object> v();

    public abstract Constructor<?> w(Class<?>... clsArr);

    public Class<?> x() {
        return this.f9033a.g();
    }

    public abstract b y();

    public abstract q5.b z();
}
