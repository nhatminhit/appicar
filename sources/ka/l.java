package ka;

import ha.e;
import ha.i;
import ha.j;
import ha.k;
import ha.o;
import ha.r;
import ha.s;
import ha.y;
import ha.z;
import ja.n;
import java.io.IOException;
import java.lang.reflect.Type;
import pa.d;

public final class l<T> extends y<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s<T> f20042a;

    /* renamed from: b  reason: collision with root package name */
    public final j<T> f20043b;

    /* renamed from: c  reason: collision with root package name */
    public final e f20044c;

    /* renamed from: d  reason: collision with root package name */
    public final oa.a<T> f20045d;

    /* renamed from: e  reason: collision with root package name */
    public final z f20046e;

    /* renamed from: f  reason: collision with root package name */
    public final l<T>.b f20047f = new b();

    /* renamed from: g  reason: collision with root package name */
    public y<T> f20048g;

    public final class b implements r, i {
        public b() {
        }

        public <R> R a(k kVar, Type type) throws o {
            return l.this.f20044c.j(kVar, type);
        }

        public k b(Object obj, Type type) {
            return l.this.f20044c.H(obj, type);
        }

        public k c(Object obj) {
            return l.this.f20044c.G(obj);
        }
    }

    public static final class c implements z {
        public final oa.a<?> O;
        public final boolean P;
        public final Class<?> Q;
        public final s<?> R;
        public final j<?> S;

        public c(Object obj, oa.a<?> aVar, boolean z10, Class<?> cls) {
            j<?> jVar = null;
            s<?> sVar = obj instanceof s ? (s) obj : null;
            this.R = sVar;
            jVar = obj instanceof j ? (j) obj : jVar;
            this.S = jVar;
            ja.a.a((sVar == null && jVar == null) ? false : true);
            this.O = aVar;
            this.P = z10;
            this.Q = cls;
        }

        public <T> y<T> a(e eVar, oa.a<T> aVar) {
            oa.a<?> aVar2 = this.O;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.P && this.O.h() == aVar.f()) : this.Q.isAssignableFrom(aVar.f())) {
                return new l(this.R, this.S, eVar, aVar, this);
            }
            return null;
        }
    }

    public l(s<T> sVar, j<T> jVar, e eVar, oa.a<T> aVar, z zVar) {
        this.f20042a = sVar;
        this.f20043b = jVar;
        this.f20044c = eVar;
        this.f20045d = aVar;
        this.f20046e = zVar;
    }

    public static z k(oa.a<?> aVar, Object obj) {
        return new c(obj, aVar, false, (Class<?>) null);
    }

    public static z l(oa.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.h() == aVar.f(), (Class<?>) null);
    }

    public static z m(Class<?> cls, Object obj) {
        return new c(obj, (oa.a<?>) null, false, cls);
    }

    public T e(pa.a aVar) throws IOException {
        if (this.f20043b == null) {
            return j().e(aVar);
        }
        k a10 = n.a(aVar);
        if (a10.w()) {
            return null;
        }
        return this.f20043b.a(a10, this.f20045d.h(), this.f20047f);
    }

    public void i(d dVar, T t10) throws IOException {
        s<T> sVar = this.f20042a;
        if (sVar == null) {
            j().i(dVar, t10);
        } else if (t10 == null) {
            dVar.N();
        } else {
            n.b(sVar.a(t10, this.f20045d.h(), this.f20047f), dVar);
        }
    }

    public final y<T> j() {
        y<T> yVar = this.f20048g;
        if (yVar != null) {
            return yVar;
        }
        y<T> r10 = this.f20044c.r(this.f20046e, this.f20045d);
        this.f20048g = r10;
        return r10;
    }
}
