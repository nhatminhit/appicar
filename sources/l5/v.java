package l5;

import a6.b;
import a6.e0;
import i5.g;
import i5.j;
import i5.k;
import i5.x;
import i5.y;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import m5.h;
import m5.q;
import q5.s;
import q5.z;
import u5.f;
import w4.l;
import w4.p;

public abstract class v extends q5.v implements Serializable {

    /* renamed from: c0  reason: collision with root package name */
    public static final k<Object> f10191c0 = new h("No _valueDeserializer assigned");
    public final y R;
    public final j S;
    public final y T;
    public final transient b U;
    public final k<Object> V;
    public final f W;
    public final s X;
    public String Y;
    public z Z;

    /* renamed from: a0  reason: collision with root package name */
    public e0 f10192a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f10193b0;

    public static abstract class a extends v {

        /* renamed from: d0  reason: collision with root package name */
        public final v f10194d0;

        public a(v vVar) {
            super(vVar);
            this.f10194d0 = vVar;
        }

        public String A() {
            return this.f10194d0.A();
        }

        public z C() {
            return this.f10194d0.C();
        }

        public int D() {
            return this.f10194d0.D();
        }

        public k<Object> E() {
            return this.f10194d0.E();
        }

        public f F() {
            return this.f10194d0.F();
        }

        public boolean G() {
            return this.f10194d0.G();
        }

        public boolean H() {
            return this.f10194d0.H();
        }

        public boolean I() {
            return this.f10194d0.I();
        }

        public boolean K() {
            return this.f10194d0.K();
        }

        public void M(Object obj, Object obj2) throws IOException {
            this.f10194d0.M(obj, obj2);
        }

        public Object N(Object obj, Object obj2) throws IOException {
            return this.f10194d0.N(obj, obj2);
        }

        public boolean R(Class<?> cls) {
            return this.f10194d0.R(cls);
        }

        public v S(y yVar) {
            return W(this.f10194d0.S(yVar));
        }

        public v T(s sVar) {
            return W(this.f10194d0.T(sVar));
        }

        public v V(k<?> kVar) {
            return W(this.f10194d0.V(kVar));
        }

        public v W(v vVar) {
            return vVar == this.f10194d0 ? this : Y(vVar);
        }

        public v X() {
            return this.f10194d0;
        }

        public abstract v Y(v vVar);

        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return this.f10194d0.getAnnotation(cls);
        }

        public q5.h i() {
            return this.f10194d0.i();
        }

        public void r(int i10) {
            this.f10194d0.r(i10);
        }

        public void t(l lVar, g gVar, Object obj) throws IOException {
            this.f10194d0.t(lVar, gVar, obj);
        }

        public Object u(l lVar, g gVar, Object obj) throws IOException {
            return this.f10194d0.u(lVar, gVar, obj);
        }

        public void w(i5.f fVar) {
            this.f10194d0.w(fVar);
        }

        public int x() {
            return this.f10194d0.x();
        }

        public Class<?> y() {
            return this.f10194d0.y();
        }

        public Object z() {
            return this.f10194d0.z();
        }
    }

    public v(y yVar, j jVar, x xVar, k<Object> kVar) {
        super(xVar);
        this.f10193b0 = -1;
        this.R = yVar == null ? y.V : yVar.h();
        this.S = jVar;
        this.T = null;
        this.U = null;
        this.f10192a0 = null;
        this.W = null;
        this.V = kVar;
        this.X = kVar;
    }

    public v(y yVar, j jVar, y yVar2, f fVar, b bVar, x xVar) {
        super(xVar);
        this.f10193b0 = -1;
        this.R = yVar == null ? y.V : yVar.h();
        this.S = jVar;
        this.T = yVar2;
        this.U = bVar;
        this.f10192a0 = null;
        this.W = fVar != null ? fVar.g(this) : fVar;
        k<Object> kVar = f10191c0;
        this.V = kVar;
        this.X = kVar;
    }

    public v(v vVar) {
        super((q5.v) vVar);
        this.f10193b0 = -1;
        this.R = vVar.R;
        this.S = vVar.S;
        this.T = vVar.T;
        this.U = vVar.U;
        this.V = vVar.V;
        this.W = vVar.W;
        this.Y = vVar.Y;
        this.f10193b0 = vVar.f10193b0;
        this.f10192a0 = vVar.f10192a0;
        this.X = vVar.X;
    }

    public v(v vVar, k<?> kVar, s sVar) {
        super((q5.v) vVar);
        this.f10193b0 = -1;
        this.R = vVar.R;
        this.S = vVar.S;
        this.T = vVar.T;
        this.U = vVar.U;
        this.W = vVar.W;
        this.Y = vVar.Y;
        this.f10193b0 = vVar.f10193b0;
        this.V = kVar == null ? f10191c0 : kVar;
        this.f10192a0 = vVar.f10192a0;
        this.X = sVar == f10191c0 ? this.V : sVar;
    }

    public v(v vVar, y yVar) {
        super((q5.v) vVar);
        this.f10193b0 = -1;
        this.R = yVar;
        this.S = vVar.S;
        this.T = vVar.T;
        this.U = vVar.U;
        this.V = vVar.V;
        this.W = vVar.W;
        this.Y = vVar.Y;
        this.f10193b0 = vVar.f10193b0;
        this.f10192a0 = vVar.f10192a0;
        this.X = vVar.X;
    }

    public v(s sVar, j jVar, f fVar, b bVar) {
        this(sVar.a(), jVar, sVar.o(), fVar, bVar, sVar.d());
    }

    public String A() {
        return this.Y;
    }

    public s B() {
        return this.X;
    }

    public z C() {
        return this.Z;
    }

    public int D() {
        return this.f10193b0;
    }

    public k<Object> E() {
        k<Object> kVar = this.V;
        if (kVar == f10191c0) {
            return null;
        }
        return kVar;
    }

    public f F() {
        return this.W;
    }

    public boolean G() {
        k<Object> kVar = this.V;
        return (kVar == null || kVar == f10191c0) ? false : true;
    }

    public boolean H() {
        return this.W != null;
    }

    public boolean I() {
        return this.f10192a0 != null;
    }

    public boolean J() {
        return false;
    }

    public boolean K() {
        return false;
    }

    public void L() {
    }

    public abstract void M(Object obj, Object obj2) throws IOException;

    public abstract Object N(Object obj, Object obj2) throws IOException;

    public void O(String str) {
        this.Y = str;
    }

    public void P(z zVar) {
        this.Z = zVar;
    }

    public void Q(Class<?>[] clsArr) {
        this.f10192a0 = clsArr == null ? null : e0.a(clsArr);
    }

    public boolean R(Class<?> cls) {
        e0 e0Var = this.f10192a0;
        return e0Var == null || e0Var.b(cls);
    }

    public abstract v S(y yVar);

    public abstract v T(s sVar);

    public v U(String str) {
        y yVar = this.R;
        y yVar2 = yVar == null ? new y(str) : yVar.m(str);
        return yVar2 == this.R ? this : S(yVar2);
    }

    public abstract v V(k<?> kVar);

    public y a() {
        return this.R;
    }

    public void b(s5.l lVar, i5.e0 e0Var) throws i5.l {
        if (m()) {
            lVar.p(this);
        } else {
            lVar.o(this);
        }
    }

    @Deprecated
    public IOException c(Exception exc) throws IOException {
        return f((l) null, exc);
    }

    public j e() {
        return this.S;
    }

    public IOException f(l lVar, Exception exc) throws IOException {
        a6.h.p0(exc);
        a6.h.q0(exc);
        Throwable M = a6.h.M(exc);
        throw i5.l.o(lVar, a6.h.o(M), M);
    }

    public void g(Exception exc, Object obj) throws IOException {
        h((l) null, exc, obj);
    }

    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    public final String getName() {
        return this.R.d();
    }

    public void h(l lVar, Exception exc, Object obj) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String h10 = a6.h.h(obj);
            StringBuilder sb2 = new StringBuilder("Problem deserializing property '");
            sb2.append(getName());
            sb2.append("' (expected type: ");
            sb2.append(e());
            sb2.append("; actual type: ");
            sb2.append(h10);
            sb2.append(")");
            String o10 = a6.h.o(exc);
            if (o10 != null) {
                sb2.append(", problem: ");
            } else {
                o10 = " (no error message provided)";
            }
            sb2.append(o10);
            throw i5.l.o(lVar, sb2.toString(), exc);
        }
        f(lVar, exc);
    }

    public abstract q5.h i();

    public <A extends Annotation> A l(Class<A> cls) {
        return this.U.a(cls);
    }

    public y o() {
        return this.T;
    }

    public void r(int i10) {
        if (this.f10193b0 == -1) {
            this.f10193b0 = i10;
            return;
        }
        throw new IllegalStateException("Property '" + getName() + "' already had index (" + this.f10193b0 + "), trying to assign " + i10);
    }

    public final Object s(l lVar, g gVar) throws IOException {
        if (lVar.q2(p.VALUE_NULL)) {
            return this.X.d(gVar);
        }
        f fVar = this.W;
        if (fVar != null) {
            return this.V.h(lVar, gVar, fVar);
        }
        Object f10 = this.V.f(lVar, gVar);
        return f10 == null ? this.X.d(gVar) : f10;
    }

    public abstract void t(l lVar, g gVar, Object obj) throws IOException;

    public String toString() {
        return "[property '" + getName() + "']";
    }

    public abstract Object u(l lVar, g gVar, Object obj) throws IOException;

    public final Object v(l lVar, g gVar, Object obj) throws IOException {
        if (lVar.q2(p.VALUE_NULL)) {
            return q.e(this.X) ? obj : this.X.d(gVar);
        }
        if (this.W != null) {
            gVar.z(e(), String.format("Cannot merge polymorphic property '%s'", new Object[]{getName()}));
        }
        Object g10 = this.V.g(lVar, gVar, obj);
        return g10 == null ? q.e(this.X) ? obj : this.X.d(gVar) : g10;
    }

    public void w(i5.f fVar) {
    }

    public int x() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", new Object[]{getName(), getClass().getName()}));
    }

    public Class<?> y() {
        return i().n();
    }

    public Object z() {
        return null;
    }
}
