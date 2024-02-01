package k5;

import a6.x;
import i5.q;
import i5.y;
import i5.z;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import k5.b;
import k5.j;
import q5.c0;
import q5.f0;
import q5.t;
import u5.e;
import v4.c0;
import v4.h;
import v4.n;
import v4.s;
import v4.u;
import w4.a;
import z5.n;

public abstract class j<CFG extends b, T extends j<CFG, T>> extends i<T> implements Serializable {

    /* renamed from: a0  reason: collision with root package name */
    public static final c f10017a0 = c.a();

    /* renamed from: b0  reason: collision with root package name */
    public static final int f10018b0 = i.d(q.class);

    /* renamed from: c0  reason: collision with root package name */
    public static final int f10019c0 = ((((q.AUTO_DETECT_FIELDS.a() | q.AUTO_DETECT_GETTERS.a()) | q.AUTO_DETECT_IS_GETTERS.a()) | q.AUTO_DETECT_SETTERS.a()) | q.AUTO_DETECT_CREATORS.a());
    public final c0 T;
    public final e U;
    public final y V;
    public final Class<?> W;
    public final e X;
    public final x Y;
    public final d Z;

    public j(a aVar, e eVar, c0 c0Var, x xVar, d dVar) {
        super(aVar, f10018b0);
        this.T = c0Var;
        this.U = eVar;
        this.Y = xVar;
        this.V = null;
        this.W = null;
        this.X = e.b();
        this.Z = dVar;
    }

    public j(j<CFG, T> jVar) {
        super(jVar);
        this.T = jVar.T;
        this.U = jVar.U;
        this.Y = jVar.Y;
        this.V = jVar.V;
        this.W = jVar.W;
        this.X = jVar.X;
        this.Z = jVar.Z;
    }

    public j(j<CFG, T> jVar, int i10) {
        super(jVar, i10);
        this.T = jVar.T;
        this.U = jVar.U;
        this.Y = jVar.Y;
        this.V = jVar.V;
        this.W = jVar.W;
        this.X = jVar.X;
        this.Z = jVar.Z;
    }

    public j(j<CFG, T> jVar, y yVar) {
        super(jVar);
        this.T = jVar.T;
        this.U = jVar.U;
        this.Y = jVar.Y;
        this.V = yVar;
        this.W = jVar.W;
        this.X = jVar.X;
        this.Z = jVar.Z;
    }

    public j(j<CFG, T> jVar, Class<?> cls) {
        super(jVar);
        this.T = jVar.T;
        this.U = jVar.U;
        this.Y = jVar.Y;
        this.V = jVar.V;
        this.W = cls;
        this.X = jVar.X;
        this.Z = jVar.Z;
    }

    public j(j<CFG, T> jVar, a aVar) {
        super(jVar, aVar);
        this.T = jVar.T;
        this.U = jVar.U;
        this.Y = jVar.Y;
        this.V = jVar.V;
        this.W = jVar.W;
        this.X = jVar.X;
        this.Z = jVar.Z;
    }

    public j(j<CFG, T> jVar, e eVar) {
        super(jVar);
        this.T = jVar.T;
        this.U = jVar.U;
        this.Y = jVar.Y;
        this.V = jVar.V;
        this.W = jVar.W;
        this.X = eVar;
        this.Z = jVar.Z;
    }

    public j(j<CFG, T> jVar, c0 c0Var) {
        super(jVar);
        this.T = c0Var;
        this.U = jVar.U;
        this.Y = jVar.Y;
        this.V = jVar.V;
        this.W = jVar.W;
        this.X = jVar.X;
        this.Z = jVar.Z;
    }

    public j(j<CFG, T> jVar, c0 c0Var, x xVar, d dVar) {
        super(jVar, jVar.P.b());
        this.T = c0Var;
        this.U = jVar.U;
        this.Y = xVar;
        this.V = jVar.V;
        this.W = jVar.W;
        this.X = jVar.X;
        this.Z = dVar;
    }

    public j(j<CFG, T> jVar, e eVar) {
        super(jVar);
        this.T = jVar.T;
        this.U = eVar;
        this.Y = jVar.Y;
        this.V = jVar.V;
        this.W = jVar.W;
        this.X = jVar.X;
        this.Z = jVar.Z;
    }

    public final u.b A(Class<?> cls) {
        u.b d10 = q(cls).d();
        u.b z10 = z();
        return z10 == null ? d10 : z10.o(d10);
    }

    public abstract T A0(Class<?> cls);

    /* renamed from: B0 */
    public final T a0(q... qVarArr) {
        int i10 = this.O;
        for (q a10 : qVarArr) {
            i10 &= ~a10.a();
        }
        return i10 == this.O ? this : c0(i10);
    }

    public final c0.a C() {
        return this.Z.i();
    }

    public T C0(Object obj) {
        return m0(n().f(obj));
    }

    public final f0<?> E() {
        f0 j10 = this.Z.j();
        int i10 = this.O;
        int i11 = f10019c0;
        if ((i10 & i11) == i11) {
            return j10;
        }
        if (!T(q.AUTO_DETECT_FIELDS)) {
            j10 = j10.f(h.c.S);
        }
        if (!T(q.AUTO_DETECT_GETTERS)) {
            j10 = j10.r(h.c.S);
        }
        if (!T(q.AUTO_DETECT_IS_GETTERS)) {
            j10 = j10.s(h.c.S);
        }
        if (!T(q.AUTO_DETECT_SETTERS)) {
            j10 = j10.h(h.c.S);
        }
        return !T(q.AUTO_DETECT_CREATORS) ? j10.q(h.c.S) : j10;
    }

    public final f0<?> F(Class<?> cls, q5.b bVar) {
        f0 E = E();
        i5.b m10 = m();
        if (m10 != null) {
            E = m10.g(bVar, E);
        }
        c e10 = this.Z.e(cls);
        return e10 != null ? E.o(e10.i()) : E;
    }

    public final e K() {
        return this.U;
    }

    public t.a a() {
        throw new UnsupportedOperationException();
    }

    public final Class<?> b(Class<?> cls) {
        return this.T.b(cls);
    }

    public abstract T b0(a aVar);

    public abstract T c0(int i10);

    public final y d0() {
        return this.V;
    }

    @Deprecated
    public final String e0() {
        y yVar = this.V;
        if (yVar == null) {
            return null;
        }
        return yVar.d();
    }

    public final int f0() {
        return this.T.f();
    }

    public final T g0(i5.b bVar) {
        return b0(this.P.s(bVar));
    }

    /* renamed from: h0 */
    public final T Y(q qVar, boolean z10) {
        int a10 = z10 ? qVar.a() | this.O : (~qVar.a()) & this.O;
        return a10 == this.O ? this : c0(a10);
    }

    public final c i(Class<?> cls) {
        return this.Z.e(cls);
    }

    public final T i0(z zVar) {
        return b0(this.P.y(zVar));
    }

    public y j(i5.j jVar) {
        y yVar = this.V;
        return yVar != null ? yVar : this.Y.a(jVar, this);
    }

    public T j0(DateFormat dateFormat) {
        return b0(this.P.v(dateFormat));
    }

    public y k(Class<?> cls) {
        y yVar = this.V;
        return yVar != null ? yVar : this.Y.b(cls, this);
    }

    public final T k0(Locale locale) {
        return b0(this.P.o(locale));
    }

    public final Class<?> l() {
        return this.W;
    }

    public final T l0(TimeZone timeZone) {
        return b0(this.P.p(timeZone));
    }

    public abstract T m0(e eVar);

    public final e n() {
        return this.X;
    }

    public final T n0(g gVar) {
        return b0(this.P.w(gVar));
    }

    public final T o0(t tVar) {
        return b0(this.P.u(tVar));
    }

    public abstract T p0(e eVar);

    public final c q(Class<?> cls) {
        c e10 = this.Z.e(cls);
        return e10 == null ? f10017a0 : e10;
    }

    public final T q0(u5.h<?> hVar) {
        return b0(this.P.A(hVar));
    }

    public final T r0(a aVar) {
        return b0(this.P.r(aVar));
    }

    public final u.b s(Class<?> cls, Class<?> cls2) {
        u.b e10 = q(cls2).e();
        u.b A = A(cls);
        return A == null ? e10 : A.o(e10);
    }

    public final T s0(n nVar) {
        return b0(this.P.z(nVar));
    }

    /* renamed from: t0 */
    public final T Z(q... qVarArr) {
        int i10 = this.O;
        for (q a10 : qVarArr) {
            i10 |= a10.a();
        }
        return i10 == this.O ? this : c0(i10);
    }

    public Boolean u() {
        return this.Z.h();
    }

    public final T u0(i5.b bVar) {
        return b0(this.P.t(bVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean v(java.lang.Class<?> r2) {
        /*
            r1 = this;
            k5.d r0 = r1.Z
            k5.c r2 = r0.e(r2)
            if (r2 == 0) goto L_0x000f
            java.lang.Boolean r2 = r2.g()
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            k5.d r2 = r1.Z
            java.lang.Boolean r2 = r2.h()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.j.v(java.lang.Class):java.lang.Boolean");
    }

    public T v0(Object obj, Object obj2) {
        return m0(n().d(obj, obj2));
    }

    public final n.d w(Class<?> cls) {
        return this.Z.c(cls);
    }

    public T w0(Map<?, ?> map) {
        return m0(n().e(map));
    }

    public final s.a x(Class<?> cls) {
        s.a c10;
        c e10 = this.Z.e(cls);
        if (e10 == null || (c10 = e10.c()) == null) {
            return null;
        }
        return c10;
    }

    public final T x0(i5.b bVar) {
        return b0(this.P.x(bVar));
    }

    public final s.a y(Class<?> cls, q5.b bVar) {
        i5.b m10 = m();
        return s.a.s(m10 == null ? null : m10.U(bVar), x(cls));
    }

    public abstract T y0(y yVar);

    public final u.b z() {
        return this.Z.f();
    }

    public T z0(String str) {
        return y0(str == null ? null : y.a(str));
    }
}
