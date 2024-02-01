package i5;

import a6.c;
import a6.h;
import a6.r;
import a6.u;
import com.fasterxml.jackson.databind.node.m;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import k5.e;
import l5.i;
import l5.j;
import l5.n;
import l5.o;
import l5.p;
import l5.w;
import l5.y;
import m5.b0;
import m5.z;
import o5.b;
import o5.f;
import q5.a;
import q5.s;
import v4.l0;
import v4.n;
import v4.n0;
import w4.l;

public abstract class g extends e implements Serializable {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f9074b0 = 1;
    public final o P;
    public final p Q;
    public final f R;
    public final int S;
    public final Class<?> T;
    public transient l U;
    public final i V;
    public transient c W;
    public transient u X;
    public transient DateFormat Y;
    public transient e Z;

    /* renamed from: a0  reason: collision with root package name */
    public r<j> f9075a0;

    public g(g gVar) {
        this.P = new o();
        this.Q = gVar.Q;
        this.R = gVar.R;
        this.S = gVar.S;
        this.T = gVar.T;
        this.V = null;
    }

    public g(g gVar, f fVar, l lVar, i iVar) {
        this.P = gVar.P;
        this.Q = gVar.Q;
        this.R = fVar;
        this.S = fVar.J0();
        this.T = fVar.l();
        this.U = lVar;
        this.V = iVar;
        this.Z = fVar.n();
    }

    public g(g gVar, p pVar) {
        this.P = gVar.P;
        this.Q = pVar;
        this.R = gVar.R;
        this.S = gVar.S;
        this.T = gVar.T;
        this.U = gVar.U;
        this.V = gVar.V;
        this.Z = gVar.Z;
    }

    public g(p pVar) {
        this(pVar, (o) null);
    }

    public g(p pVar, o oVar) {
        if (pVar != null) {
            this.Q = pVar;
            this.P = oVar == null ? new o() : oVar;
            this.S = 0;
            this.R = null;
            this.V = null;
            this.T = null;
            this.Z = null;
            return;
        }
        throw new NullPointerException("Cannot pass null DeserializerFactory");
    }

    @Deprecated
    public l A0(String str) {
        return l.n(Z(), str);
    }

    @Deprecated
    public l B0(String str, Object... objArr) {
        return l.n(Z(), c(str, objArr));
    }

    public l C0(j jVar, String str) {
        return o5.e.E(this.U, a(String.format("Missing type id when trying to resolve subtype of %s", new Object[]{jVar}), str), jVar, (String) null);
    }

    public Date D0(String str) throws IllegalArgumentException {
        try {
            return V().parse(str);
        } catch (ParseException e10) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", new Object[]{str, h.o(e10)}));
        }
    }

    public boolean E(Class<?> cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        return cls.isPrimitive() && h.v0(cls).isInstance(obj);
    }

    public <T> T E0(l lVar, d dVar, j jVar) throws IOException {
        k<Object> L = L(jVar, dVar);
        if (L != null) {
            return L.f(lVar, this);
        }
        return z(jVar, String.format("Could not find JsonDeserializer for type %s (via property %s)", new Object[]{h.N(jVar), h.d0(dVar)}));
    }

    public abstract void F() throws w;

    public <T> T F0(l lVar, d dVar, Class<T> cls) throws IOException {
        return E0(lVar, dVar, u().Y(cls));
    }

    public Calendar G(Date date) {
        Calendar instance = Calendar.getInstance(t());
        instance.setTime(date);
        return instance;
    }

    public m G0(l lVar) throws IOException {
        w4.p P2 = lVar.P();
        return (P2 == null && (P2 = lVar.D2()) == null) ? Y().h() : P2 == w4.p.VALUE_NULL ? Y().b() : (m) Q(this.R.h(m.class)).f(lVar, this);
    }

    public final j H(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this.R.h(cls);
    }

    public <T> T H0(l lVar, j jVar) throws IOException {
        k<Object> Q2 = Q(jVar);
        if (Q2 == null) {
            z(jVar, "Could not find JsonDeserializer for type " + h.N(jVar));
        }
        return Q2.f(lVar, this);
    }

    public abstract k<Object> I(a aVar, Object obj) throws l;

    public <T> T I0(l lVar, Class<T> cls) throws IOException {
        return H0(lVar, u().Y(cls));
    }

    @Deprecated
    public l J(Class<?> cls) {
        l lVar = this.U;
        return f.A(lVar, cls, "Unexpected end-of-input when trying to deserialize a " + cls.getName());
    }

    @Deprecated
    public <T> T J0(k<?> kVar) throws l {
        a0(kVar);
        return null;
    }

    public Class<?> K(String str) throws ClassNotFoundException {
        return u().d0(str);
    }

    public <T> T K0(c cVar, s sVar, String str, Object... objArr) throws l {
        String c10 = c(str, objArr);
        throw b.B(this.U, String.format("Invalid definition for property %s (of type %s): %s", new Object[]{h.d0(sVar), h.e0(cVar.x()), c10}), cVar, sVar);
    }

    public final k<Object> L(j jVar, d dVar) throws l {
        k<Object> o10 = this.P.o(this, this.Q, jVar);
        return o10 != null ? f0(o10, dVar, jVar) : o10;
    }

    public <T> T L0(c cVar, String str, Object... objArr) throws l {
        throw b.B(this.U, String.format("Invalid type definition for type %s: %s", new Object[]{h.e0(cVar.x()), c(str, objArr)}), cVar, (s) null);
    }

    public final Object M(Object obj, d dVar, Object obj2) throws l {
        if (this.V == null) {
            A(h.i(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", new Object[]{obj}));
        }
        return this.V.a(obj, this, dVar, obj2);
    }

    public <T> T M0(d dVar, String str, Object... objArr) throws l {
        q5.h i10;
        f z10 = f.z(Z(), dVar == null ? null : dVar.e(), c(str, objArr));
        if (!(dVar == null || (i10 = dVar.i()) == null)) {
            z10.v(i10.n(), dVar.getName());
        }
        throw z10;
    }

    public final p N(j jVar, d dVar) throws l {
        p n10 = this.P.n(this, this.Q, jVar);
        return n10 instanceof j ? ((j) n10).a(this, dVar) : n10;
    }

    public <T> T N0(j jVar, String str, Object... objArr) throws l {
        throw f.z(Z(), jVar, c(str, objArr));
    }

    public final k<Object> O(j jVar) throws l {
        return this.P.o(this, this.Q, jVar);
    }

    public <T> T O0(k<?> kVar, String str, Object... objArr) throws l {
        throw f.A(Z(), kVar.r(), c(str, objArr));
    }

    public abstract z P(Object obj, l0<?> l0Var, n0 n0Var);

    public <T> T P0(Class<?> cls, String str, Object... objArr) throws l {
        throw f.A(Z(), cls, c(str, objArr));
    }

    public final k<Object> Q(j jVar) throws l {
        k<Object> o10 = this.P.o(this, this.Q, jVar);
        if (o10 == null) {
            return null;
        }
        k<?> f02 = f0(o10, (d) null, jVar);
        u5.f l10 = this.Q.l(this.R, jVar);
        return l10 != null ? new b0(l10.g((d) null), f02) : f02;
    }

    @Deprecated
    public void Q0(String str, Object... objArr) throws l {
        throw l.n(Z(), c(str, objArr));
    }

    public final c R() {
        if (this.W == null) {
            this.W = new c();
        }
        return this.W;
    }

    @Deprecated
    public void R0(String str, Object... objArr) throws l {
        throw f.z(Z(), (j) null, "No content to map due to end-of-input");
    }

    public final w4.a S() {
        return this.R.o();
    }

    public <T> T S0(j jVar, String str, String str2, Object... objArr) throws l {
        return T0(jVar.g(), str, str2, objArr);
    }

    /* renamed from: T */
    public f q() {
        return this.R;
    }

    public <T> T T0(Class<?> cls, String str, String str2, Object... objArr) throws l {
        f A = f.A(Z(), cls, c(str2, objArr));
        if (str != null) {
            A.v(cls, str);
        }
        throw A;
    }

    public j U() {
        r<j> rVar = this.f9075a0;
        if (rVar == null) {
            return null;
        }
        return rVar.d();
    }

    public <T> T U0(Class<?> cls, l lVar, w4.p pVar) throws l {
        throw f.A(lVar, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", new Object[]{pVar, h.e0(cls)}));
    }

    public DateFormat V() {
        DateFormat dateFormat = this.Y;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.R.r().clone();
        this.Y = dateFormat2;
        return dateFormat2;
    }

    @Deprecated
    public void V0(Object obj, String str, k<?> kVar) throws l {
        if (v0(h.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw o5.h.H(this.U, obj, str, kVar == null ? null : kVar.o());
        }
    }

    public final int W() {
        return this.S;
    }

    public <T> T W0(m5.s sVar, Object obj) throws l {
        return M0(sVar.T, String.format("No Object Id found for an instance of %s, to assign to property '%s'", new Object[]{h.h(obj), sVar.P}), new Object[0]);
    }

    public p X() {
        return this.Q;
    }

    public void X0(j jVar, w4.p pVar, String str, Object... objArr) throws l {
        throw i1(Z(), jVar, pVar, c(str, objArr));
    }

    public final m Y() {
        return this.R.K0();
    }

    public void Y0(k<?> kVar, w4.p pVar, String str, Object... objArr) throws l {
        throw j1(Z(), kVar.r(), pVar, c(str, objArr));
    }

    public final l Z() {
        return this.U;
    }

    public void Z0(Class<?> cls, w4.p pVar, String str, Object... objArr) throws l {
        throw j1(Z(), cls, pVar, c(str, objArr));
    }

    public void a0(k<?> kVar) throws l {
        if (!w(q.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            j H = H(kVar.r());
            throw b.C(Z(), String.format("Invalid configuration: values of type %s cannot be merged", new Object[]{h.N(H)}), H);
        }
    }

    @Deprecated
    public void a1(l lVar, w4.p pVar, String str, Object... objArr) throws l {
        throw k1(lVar, pVar, c(str, objArr));
    }

    public Object b0(Class<?> cls, Object obj, Throwable th2) throws IOException {
        for (r<n> L0 = this.R.L0(); L0 != null; L0 = L0.c()) {
            Object a10 = L0.d().a(this, cls, obj, th2);
            if (a10 != n.f10187a) {
                if (E(cls, a10)) {
                    return a10;
                }
                z(H(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", new Object[]{h.B(cls), h.h(a10)}));
            }
        }
        h.p0(th2);
        if (!v0(h.WRAP_EXCEPTIONS)) {
            h.q0(th2);
        }
        throw u0(cls, th2);
    }

    public final void b1(u uVar) {
        if (this.X == null || uVar.h() >= this.X.h()) {
            this.X = uVar;
        }
    }

    public Object c0(Class<?> cls, y yVar, l lVar, String str, Object... objArr) throws IOException {
        if (lVar == null) {
            lVar = Z();
        }
        String c10 = c(str, objArr);
        for (r<n> L0 = this.R.L0(); L0 != null; L0 = L0.c()) {
            Object b10 = L0.d().b(this, cls, yVar, lVar, c10);
            if (b10 != n.f10187a) {
                if (E(cls, b10)) {
                    return b10;
                }
                z(H(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", new Object[]{h.B(cls), h.B(b10)}));
            }
        }
        if (yVar == null) {
            return A(cls, String.format("Cannot construct instance of %s: %s", new Object[]{h.e0(cls), c10}));
        } else if (!yVar.k()) {
            return A(cls, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", new Object[]{h.e0(cls), c10}));
        } else {
            return P0(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", new Object[]{h.e0(cls), c10}), new Object[0]);
        }
    }

    /* renamed from: c1 */
    public g D(Object obj, Object obj2) {
        this.Z = this.Z.c(obj, obj2);
        return this;
    }

    public j d0(j jVar, u5.g gVar, String str) throws IOException {
        r<n> L0 = this.R.L0();
        while (L0 != null) {
            j d10 = L0.d().d(this, jVar, gVar, str);
            if (d10 == null) {
                L0 = L0.c();
            } else if (d10.j(Void.class)) {
                return null;
            } else {
                if (d10.Y(jVar.g())) {
                    return d10;
                }
                throw v(jVar, (String) null, "problem handler tried to resolve into non-subtype: " + h.N(d10));
            }
        }
        throw C0(jVar, str);
    }

    @Deprecated
    public l d1(j jVar, String str, String str2) {
        return f.z(this.U, jVar, a(String.format("Could not resolve type id '%s' into a subtype of %s", new Object[]{str, h.N(jVar)}), str2));
    }

    public k<?> e0(k<?> kVar, d dVar, j jVar) throws l {
        if (kVar instanceof i) {
            this.f9075a0 = new r<>(jVar, this.f9075a0);
            try {
                kVar = ((i) kVar).a(this, dVar);
            } finally {
                this.f9075a0 = this.f9075a0.c();
            }
        }
        return kVar;
    }

    public l e1(Class<?> cls, String str, String str2) {
        return o5.c.E(this.U, String.format("Cannot deserialize Map key of type %s from String %s: %s", new Object[]{h.e0(cls), d(str), str2}), str, cls);
    }

    public k<?> f0(k<?> kVar, d dVar, j jVar) throws l {
        if (kVar instanceof i) {
            this.f9075a0 = new r<>(jVar, this.f9075a0);
            try {
                kVar = ((i) kVar).a(this, dVar);
            } finally {
                this.f9075a0 = this.f9075a0.c();
            }
        }
        return kVar;
    }

    public l f1(Object obj, Class<?> cls) {
        return o5.c.E(this.U, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", new Object[]{h.e0(cls), h.h(obj)}), obj, cls);
    }

    public Object g0(j jVar, l lVar) throws IOException {
        return h0(jVar, lVar.Z0(), lVar, (String) null, new Object[0]);
    }

    public l g1(Number number, Class<?> cls, String str) {
        return o5.c.E(this.U, String.format("Cannot deserialize value of type %s from number %s: %s", new Object[]{h.e0(cls), String.valueOf(number), str}), number, cls);
    }

    public Object h0(j jVar, w4.p pVar, l lVar, String str, Object... objArr) throws IOException {
        String c10 = c(str, objArr);
        for (r<n> L0 = this.R.L0(); L0 != null; L0 = L0.c()) {
            Object e10 = L0.d().e(this, jVar, pVar, lVar, c10);
            if (e10 != n.f10187a) {
                if (E(jVar.g(), e10)) {
                    return e10;
                }
                z(jVar, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", new Object[]{h.B(jVar), h.h(e10)}));
            }
        }
        if (c10 == null) {
            if (pVar == null) {
                c10 = String.format("Unexpected end-of-input when binding data into %s", new Object[]{h.N(jVar)});
            } else {
                c10 = String.format("Cannot deserialize instance of %s out of %s token", new Object[]{h.N(jVar), pVar});
            }
        }
        if (pVar != null && pVar.k()) {
            lVar.Y1();
        }
        N0(jVar, c10, new Object[0]);
        return null;
    }

    public l h1(String str, Class<?> cls, String str2) {
        return o5.c.E(this.U, String.format("Cannot deserialize value of type %s from String %s: %s", new Object[]{h.e0(cls), d(str), str2}), str, cls);
    }

    public Object i0(Class<?> cls, l lVar) throws IOException {
        return h0(H(cls), lVar.Z0(), lVar, (String) null, new Object[0]);
    }

    public l i1(l lVar, j jVar, w4.p pVar, String str) {
        return f.z(lVar, jVar, a(String.format("Unexpected token (%s), expected %s", new Object[]{lVar.Z0(), pVar}), str));
    }

    public final boolean j() {
        return this.R.c();
    }

    public Object j0(Class<?> cls, w4.p pVar, l lVar, String str, Object... objArr) throws IOException {
        return h0(H(cls), pVar, lVar, str, objArr);
    }

    public l j1(l lVar, Class<?> cls, w4.p pVar, String str) {
        return f.A(lVar, cls, a(String.format("Unexpected token (%s), expected %s", new Object[]{lVar.Z0(), pVar}), str));
    }

    public j k(j jVar, Class<?> cls) throws IllegalArgumentException {
        return jVar.j(cls) ? jVar : q().M().W(jVar, cls, false);
    }

    public boolean k0(l lVar, k<?> kVar, Object obj, String str) throws IOException {
        for (r<n> L0 = this.R.L0(); L0 != null; L0 = L0.c()) {
            if (L0.d().g(this, lVar, kVar, obj, str)) {
                return true;
            }
        }
        if (!v0(h.FAIL_ON_UNKNOWN_PROPERTIES)) {
            lVar.Z2();
            return true;
        }
        throw o5.h.H(this.U, obj, str, kVar == null ? null : kVar.o());
    }

    @Deprecated
    public l k1(l lVar, w4.p pVar, String str) {
        return i1(lVar, (j) null, pVar, str);
    }

    public j l0(j jVar, String str, u5.g gVar, String str2) throws IOException {
        r<n> L0 = this.R.L0();
        while (L0 != null) {
            j h10 = L0.d().h(this, jVar, str, gVar, str2);
            if (h10 == null) {
                L0 = L0.c();
            } else if (h10.j(Void.class)) {
                return null;
            } else {
                if (h10.Y(jVar.g())) {
                    return h10;
                }
                throw v(jVar, str, "problem handler tried to resolve into non-subtype: " + h.N(h10));
            }
        }
        if (!v0(h.FAIL_ON_INVALID_SUBTYPE)) {
            return null;
        }
        throw v(jVar, str, str2);
    }

    public Object m0(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String c10 = c(str2, objArr);
        r<n> L0 = this.R.L0();
        while (L0 != null) {
            Object i10 = L0.d().i(this, cls, str, c10);
            if (i10 == n.f10187a) {
                L0 = L0.c();
            } else if (i10 == null || cls.isInstance(i10)) {
                return i10;
            } else {
                throw h1(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[]{h.B(cls), h.B(i10)}));
            }
        }
        throw e1(cls, str, c10);
    }

    public final Class<?> n() {
        return this.T;
    }

    public Object n0(j jVar, Object obj, l lVar) throws IOException {
        r<n> L0 = this.R.L0();
        Class<?> g10 = jVar.g();
        while (L0 != null) {
            Object j10 = L0.d().j(this, jVar, obj, lVar);
            if (j10 == n.f10187a) {
                L0 = L0.c();
            } else if (j10 == null || g10.isInstance(j10)) {
                return j10;
            } else {
                throw l.n(lVar, c("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", h.B(jVar), h.B(j10)));
            }
        }
        throw f1(obj, g10);
    }

    public final b o() {
        return this.R.m();
    }

    public Object o0(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String c10 = c(str, objArr);
        r<n> L0 = this.R.L0();
        while (L0 != null) {
            Object k10 = L0.d().k(this, cls, number, c10);
            if (k10 == n.f10187a) {
                L0 = L0.c();
            } else if (E(cls, k10)) {
                return k10;
            } else {
                throw g1(number, cls, c("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", h.B(cls), h.B(k10)));
            }
        }
        throw g1(number, cls, c10);
    }

    public Object p(Object obj) {
        return this.Z.a(obj);
    }

    public Object p0(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String c10 = c(str2, objArr);
        r<n> L0 = this.R.L0();
        while (L0 != null) {
            Object l10 = L0.d().l(this, cls, str, c10);
            if (l10 == n.f10187a) {
                L0 = L0.c();
            } else if (E(cls, l10)) {
                return l10;
            } else {
                throw h1(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[]{h.B(cls), h.B(l10)}));
            }
        }
        throw h1(str, cls, c10);
    }

    public final boolean q0(int i10) {
        return (this.S & i10) == i10;
    }

    public final n.d r(Class<?> cls) {
        return this.R.w(cls);
    }

    public final boolean r0(int i10) {
        return (i10 & this.S) != 0;
    }

    public Locale s() {
        return this.R.H();
    }

    public boolean s0(j jVar, AtomicReference<Throwable> atomicReference) {
        try {
            return this.P.q(this, this.Q, jVar);
        } catch (l e10) {
            e = e10;
            if (atomicReference == null) {
                return false;
            }
            atomicReference.set(e);
            return false;
        } catch (RuntimeException e11) {
            e = e11;
            if (atomicReference == null) {
                throw e;
            }
            atomicReference.set(e);
            return false;
        }
    }

    public TimeZone t() {
        return this.R.L();
    }

    public l t0(Class<?> cls, String str) {
        return o5.i.z(this.U, String.format("Cannot construct instance of %s: %s", new Object[]{h.e0(cls), str}), H(cls));
    }

    public final z5.n u() {
        return this.R.M();
    }

    public l u0(Class<?> cls, Throwable th2) {
        String str;
        if (th2 == null) {
            str = "N/A";
        } else {
            str = h.o(th2);
            if (str == null) {
                str = h.e0(th2.getClass());
            }
        }
        return o5.i.A(this.U, String.format("Cannot construct instance of %s, problem: %s", new Object[]{h.e0(cls), str}), H(cls), th2);
    }

    public l v(j jVar, String str, String str2) {
        return o5.e.E(this.U, a(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, h.N(jVar)}), str2), jVar, str);
    }

    public final boolean v0(h hVar) {
        return (hVar.a() & this.S) != 0;
    }

    public final boolean w(q qVar) {
        return this.R.T(qVar);
    }

    public abstract p w0(a aVar, Object obj) throws l;

    public final u x0() {
        u uVar = this.X;
        if (uVar == null) {
            return new u();
        }
        this.X = null;
        return uVar;
    }

    @Deprecated
    public l y0(Class<?> cls) {
        return z0(cls, this.U.Z0());
    }

    public <T> T z(j jVar, String str) throws l {
        throw b.C(this.U, str, jVar);
    }

    @Deprecated
    public l z0(Class<?> cls, w4.p pVar) {
        return l.n(this.U, String.format("Cannot deserialize instance of %s out of %s token", new Object[]{h.e0(cls), pVar}));
    }
}
