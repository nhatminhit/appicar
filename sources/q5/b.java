package q5;

import a6.h;
import i5.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import k5.i;
import q5.n;
import q5.t;
import z5.m;
import z5.n;

public final class b extends a implements d0 {

    /* renamed from: c0  reason: collision with root package name */
    public static final a f11923c0 = new a((d) null, Collections.emptyList(), Collections.emptyList());
    public final j O;
    public final Class<?> P;
    public final m Q;
    public final List<j> R;
    public final i5.b S;
    public final n T;
    public final t.a U;
    public final Class<?> V;
    public final boolean W;
    public final a6.b X;
    public a Y;
    public k Z;

    /* renamed from: a0  reason: collision with root package name */
    public List<f> f11924a0;

    /* renamed from: b0  reason: collision with root package name */
    public transient Boolean f11925b0;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f11926a;

        /* renamed from: b  reason: collision with root package name */
        public final List<d> f11927b;

        /* renamed from: c  reason: collision with root package name */
        public final List<i> f11928c;

        public a(d dVar, List<d> list, List<i> list2) {
            this.f11926a = dVar;
            this.f11927b = list;
            this.f11928c = list2;
        }
    }

    @Deprecated
    public b(j jVar, Class<?> cls, List<j> list, Class<?> cls2, a6.b bVar, m mVar, i5.b bVar2, t.a aVar, n nVar) {
        this(jVar, cls, list, cls2, bVar, mVar, bVar2, aVar, nVar, true);
    }

    public b(j jVar, Class<?> cls, List<j> list, Class<?> cls2, a6.b bVar, m mVar, i5.b bVar2, t.a aVar, n nVar, boolean z10) {
        this.O = jVar;
        this.P = cls;
        this.R = list;
        this.V = cls2;
        this.X = bVar;
        this.Q = mVar;
        this.S = bVar2;
        this.U = aVar;
        this.T = nVar;
        this.W = z10;
    }

    public b(Class<?> cls) {
        this.O = null;
        this.P = cls;
        this.R = Collections.emptyList();
        this.V = null;
        this.X = n.d();
        this.Q = m.h();
        this.S = null;
        this.U = null;
        this.T = null;
        this.W = false;
    }

    @Deprecated
    public static b o(j jVar, i<?> iVar) {
        return p(jVar, iVar, iVar);
    }

    @Deprecated
    public static b p(j jVar, i<?> iVar, t.a aVar) {
        return c.i(iVar, jVar, aVar);
    }

    @Deprecated
    public static b q(Class<?> cls, i<?> iVar) {
        return r(cls, iVar, iVar);
    }

    @Deprecated
    public static b r(Class<?> cls, i<?> iVar, t.a aVar) {
        return c.o(iVar, cls, aVar);
    }

    public int A() {
        return n().size();
    }

    @Deprecated
    public List<i> B() {
        return y();
    }

    public boolean C() {
        return this.X.size() > 0;
    }

    public boolean D() {
        Boolean bool = this.f11925b0;
        if (bool == null) {
            bool = Boolean.valueOf(h.a0(this.P));
            this.f11925b0 = bool;
        }
        return bool.booleanValue();
    }

    public Iterable<i> E() {
        return n();
    }

    public j a(Type type) {
        return this.T.b0(type, this.Q);
    }

    @Deprecated
    public Iterable<Annotation> b() {
        a6.b bVar = this.X;
        if (bVar instanceof p) {
            return ((p) bVar).g();
        }
        if (!(bVar instanceof n.d) && !(bVar instanceof n.f)) {
            return Collections.emptyList();
        }
        throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
    }

    public <A extends Annotation> A d(Class<A> cls) {
        return this.X.a(cls);
    }

    public int e() {
        return this.P.getModifiers();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!h.O(obj, b.class)) {
            return false;
        }
        return ((b) obj).P == this.P;
    }

    public String f() {
        return this.P.getName();
    }

    public Class<?> g() {
        return this.P;
    }

    public j h() {
        return this.O;
    }

    public int hashCode() {
        return this.P.getName().hashCode();
    }

    public boolean i(Class<?> cls) {
        return this.X.b(cls);
    }

    public boolean j(Class<? extends Annotation>[] clsArr) {
        return this.X.c(clsArr);
    }

    public final a l() {
        a aVar = this.Y;
        if (aVar == null) {
            j jVar = this.O;
            aVar = jVar == null ? f11923c0 : e.o(this.S, this, jVar, this.V, this.W);
            this.Y = aVar;
        }
        return aVar;
    }

    public final List<f> m() {
        List<f> list = this.f11924a0;
        if (list == null) {
            j jVar = this.O;
            if (jVar == null) {
                list = Collections.emptyList();
            } else {
                list = g.m(this.S, this, this.U, this.T, jVar, this.W);
            }
            this.f11924a0 = list;
        }
        return list;
    }

    public final k n() {
        k kVar = this.Z;
        if (kVar == null) {
            j jVar = this.O;
            if (jVar == null) {
                kVar = new k();
            } else {
                kVar = j.m(this.S, this, this.U, this.T, jVar, this.R, this.V, this.W);
            }
            this.Z = kVar;
        }
        return kVar;
    }

    public Iterable<f> s() {
        return m();
    }

    public i t(String str, Class<?>[] clsArr) {
        return n().b(str, clsArr);
    }

    public String toString() {
        return "[AnnotedClass " + this.P.getName() + "]";
    }

    /* renamed from: u */
    public Class<?> c() {
        return this.P;
    }

    public a6.b v() {
        return this.X;
    }

    public List<d> w() {
        return l().f11927b;
    }

    public d x() {
        return l().f11926a;
    }

    public List<i> y() {
        return l().f11928c;
    }

    public int z() {
        return m().size();
    }
}
