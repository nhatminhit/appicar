package i5;

import a6.h;
import com.fasterxml.jackson.databind.ser.j;
import com.fasterxml.jackson.databind.ser.p;
import com.fasterxml.jackson.databind.ser.q;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import k5.e;
import o5.b;
import q5.a;
import q5.s;
import v4.l0;
import v4.n;
import v4.u;
import w4.i;
import x5.c;
import x5.l;
import x5.r;
import x5.u;
import y5.w;

public abstract class e0 extends e {

    /* renamed from: b0  reason: collision with root package name */
    public static final boolean f9061b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public static final o<Object> f9062c0 = new c("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");

    /* renamed from: d0  reason: collision with root package name */
    public static final o<Object> f9063d0 = new r();
    public final c0 P;
    public final Class<?> Q;
    public final com.fasterxml.jackson.databind.ser.r R;
    public final q S;
    public transient e T;
    public o<Object> U;
    public o<Object> V;
    public o<Object> W;
    public o<Object> X;
    public final l Y;
    public DateFormat Z;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f9064a0;

    public e0() {
        this.U = f9063d0;
        this.W = w.R;
        this.X = f9062c0;
        this.P = null;
        this.R = null;
        this.S = new q();
        this.Y = null;
        this.Q = null;
        this.T = null;
        this.f9064a0 = true;
    }

    public e0(e0 e0Var) {
        this.U = f9063d0;
        this.W = w.R;
        this.X = f9062c0;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.Y = null;
        this.S = new q();
        this.U = e0Var.U;
        this.V = e0Var.V;
        this.W = e0Var.W;
        this.X = e0Var.X;
        this.f9064a0 = e0Var.f9064a0;
    }

    public e0(e0 e0Var, c0 c0Var, com.fasterxml.jackson.databind.ser.r rVar) {
        this.U = f9063d0;
        this.W = w.R;
        o<Object> oVar = f9062c0;
        this.X = oVar;
        this.R = rVar;
        this.P = c0Var;
        q qVar = e0Var.S;
        this.S = qVar;
        this.U = e0Var.U;
        this.V = e0Var.V;
        o<Object> oVar2 = e0Var.W;
        this.W = oVar2;
        this.X = e0Var.X;
        this.f9064a0 = oVar2 == oVar;
        this.Q = c0Var.l();
        this.T = c0Var.n();
        this.Y = qVar.h();
    }

    public <T> T A0(j jVar, String str, Throwable th2) throws l {
        b A = b.A(o0(), str, jVar);
        A.initCause(th2);
        throw A;
    }

    public <T> T B0(Class<?> cls, String str, Throwable th2) throws l {
        b A = b.A(o0(), str, l(cls));
        A.initCause(th2);
        throw A;
    }

    public <T> T C0(c cVar, s sVar, String str, Object... objArr) throws l {
        String c10 = c(str, objArr);
        String str2 = "N/A";
        String d10 = sVar != null ? d(sVar.getName()) : str2;
        if (cVar != null) {
            str2 = h.e0(cVar.x());
        }
        throw b.z(o0(), String.format("Invalid definition for property %s (of type %s): %s", new Object[]{d10, str2, c10}), cVar, sVar);
    }

    public <T> T D0(c cVar, String str, Object... objArr) throws l {
        throw b.z(o0(), String.format("Invalid type definition for type %s: %s", new Object[]{cVar != null ? h.e0(cVar.x()) : "N/A", c(str, objArr)}), cVar, (s) null);
    }

    public o<Object> E(j jVar) throws l {
        o<Object> oVar;
        try {
            oVar = G(jVar);
        } catch (IllegalArgumentException e10) {
            F0(e10, h.o(e10), new Object[0]);
            oVar = null;
        }
        if (oVar != null) {
            this.S.b(jVar, oVar, this);
        }
        return oVar;
    }

    public void E0(String str, Object... objArr) throws l {
        throw y0(str, objArr);
    }

    public o<Object> F(Class<?> cls) throws l {
        o<Object> oVar;
        j h10 = this.P.h(cls);
        try {
            oVar = G(h10);
        } catch (IllegalArgumentException e10) {
            F0(e10, h.o(e10), new Object[0]);
            oVar = null;
        }
        if (oVar != null) {
            this.S.c(cls, h10, oVar, this);
        }
        return oVar;
    }

    public void F0(Throwable th2, String str, Object... objArr) throws l {
        throw l.m(o0(), c(str, objArr), th2);
    }

    public o<Object> G(j jVar) throws l {
        return this.R.c(this, jVar);
    }

    public abstract o<Object> G0(a aVar, Object obj) throws l;

    public final DateFormat H() {
        DateFormat dateFormat = this.Z;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.P.r().clone();
        this.Z = dateFormat2;
        return dateFormat2;
    }

    /* renamed from: H0 */
    public e0 D(Object obj, Object obj2) {
        this.T = this.T.c(obj, obj2);
        return this;
    }

    public o<Object> I(Class<?> cls) throws l {
        o<Object> g10 = this.Y.g(cls);
        if (g10 == null && (g10 = this.S.m(cls)) == null) {
            g10 = F(cls);
        }
        if (x0(g10)) {
            return null;
        }
        return g10;
    }

    public void I0(o<Object> oVar) {
        if (oVar != null) {
            this.V = oVar;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null JsonSerializer");
    }

    public o<Object> J(o<?> oVar, d dVar) throws l {
        if (oVar instanceof p) {
            ((p) oVar).b(this);
        }
        return s0(oVar, dVar);
    }

    public void J0(o<Object> oVar) {
        if (oVar != null) {
            this.X = oVar;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null JsonSerializer");
    }

    public o<Object> K(o<?> oVar) throws l {
        if (oVar instanceof p) {
            ((p) oVar).b(this);
        }
        return oVar;
    }

    public void K0(o<Object> oVar) {
        if (oVar != null) {
            this.W = oVar;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null JsonSerializer");
    }

    public void L(Object obj, j jVar) throws IOException {
        if (!jVar.u() || !h.v0(jVar.g()).isAssignableFrom(obj.getClass())) {
            z(jVar, String.format("Incompatible types: declared root type (%s) vs %s", new Object[]{jVar, h.h(obj)}));
        }
    }

    public void M(long j10, i iVar) throws IOException {
        iVar.i2(w0(d0.WRITE_DATE_KEYS_AS_TIMESTAMPS) ? String.valueOf(j10) : H().format(new Date(j10)));
    }

    public void N(Date date, i iVar) throws IOException {
        iVar.i2(w0(d0.WRITE_DATE_KEYS_AS_TIMESTAMPS) ? String.valueOf(date.getTime()) : H().format(date));
    }

    public final void O(long j10, i iVar) throws IOException {
        if (w0(d0.WRITE_DATES_AS_TIMESTAMPS)) {
            iVar.p2(j10);
        } else {
            iVar.Z2(H().format(new Date(j10)));
        }
    }

    public final void P(Date date, i iVar) throws IOException {
        if (w0(d0.WRITE_DATES_AS_TIMESTAMPS)) {
            iVar.p2(date.getTime());
        } else {
            iVar.Z2(H().format(date));
        }
    }

    public final void Q(String str, Object obj, i iVar) throws IOException {
        iVar.i2(str);
        if (obj != null) {
            e0(obj.getClass(), true, (d) null).m(obj, iVar, this);
        } else if (this.f9064a0) {
            iVar.k2();
        } else {
            this.W.m(null, iVar, this);
        }
    }

    public final void R(i iVar) throws IOException {
        if (this.f9064a0) {
            iVar.k2();
        } else {
            this.W.m(null, iVar, this);
        }
    }

    public final void S(Object obj, i iVar) throws IOException {
        if (obj != null) {
            e0(obj.getClass(), true, (d) null).m(obj, iVar, this);
        } else if (this.f9064a0) {
            iVar.k2();
        } else {
            this.W.m(null, iVar, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.S.l(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = E(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<java.lang.Object> T(i5.j r2, i5.d r3) throws i5.l {
        /*
            r1 = this;
            x5.l r0 = r1.Y
            i5.o r0 = r0.f(r2)
            if (r0 != 0) goto L_0x001f
            com.fasterxml.jackson.databind.ser.q r0 = r1.S
            i5.o r0 = r0.l(r2)
            if (r0 != 0) goto L_0x001f
            i5.o r0 = r1.E(r2)
            if (r0 != 0) goto L_0x001f
            java.lang.Class r2 = r2.g()
            i5.o r2 = r1.q0(r2)
            return r2
        L_0x001f:
            i5.o r2 = r1.s0(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e0.T(i5.j, i5.d):i5.o");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.S.m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r2.S.l(r2.P.h(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = F(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<java.lang.Object> U(java.lang.Class<?> r3, i5.d r4) throws i5.l {
        /*
            r2 = this;
            x5.l r0 = r2.Y
            i5.o r0 = r0.g(r3)
            if (r0 != 0) goto L_0x0029
            com.fasterxml.jackson.databind.ser.q r0 = r2.S
            i5.o r0 = r0.m(r3)
            if (r0 != 0) goto L_0x0029
            com.fasterxml.jackson.databind.ser.q r0 = r2.S
            i5.c0 r1 = r2.P
            i5.j r1 = r1.h(r3)
            i5.o r0 = r0.l(r1)
            if (r0 != 0) goto L_0x0029
            i5.o r0 = r2.F(r3)
            if (r0 != 0) goto L_0x0029
            i5.o r3 = r2.q0(r3)
            return r3
        L_0x0029:
            i5.o r3 = r2.s0(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e0.U(java.lang.Class, i5.d):i5.o");
    }

    public o<Object> V(j jVar, d dVar) throws l {
        return J(this.R.b(this, jVar, this.V), dVar);
    }

    public o<Object> W(Class<?> cls, d dVar) throws l {
        return V(this.P.h(cls), dVar);
    }

    public o<Object> X(j jVar, d dVar) throws l {
        return this.X;
    }

    public o<Object> Y(d dVar) throws l {
        return this.W;
    }

    public abstract u Z(Object obj, l0<?> l0Var);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.S.l(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = E(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<java.lang.Object> a0(i5.j r2, i5.d r3) throws i5.l {
        /*
            r1 = this;
            x5.l r0 = r1.Y
            i5.o r0 = r0.f(r2)
            if (r0 != 0) goto L_0x001f
            com.fasterxml.jackson.databind.ser.q r0 = r1.S
            i5.o r0 = r0.l(r2)
            if (r0 != 0) goto L_0x001f
            i5.o r0 = r1.E(r2)
            if (r0 != 0) goto L_0x001f
            java.lang.Class r2 = r2.g()
            i5.o r2 = r1.q0(r2)
            return r2
        L_0x001f:
            i5.o r2 = r1.r0(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e0.a0(i5.j, i5.d):i5.o");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.S.m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r2.S.l(r2.P.h(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = F(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<java.lang.Object> b0(java.lang.Class<?> r3, i5.d r4) throws i5.l {
        /*
            r2 = this;
            x5.l r0 = r2.Y
            i5.o r0 = r0.g(r3)
            if (r0 != 0) goto L_0x0029
            com.fasterxml.jackson.databind.ser.q r0 = r2.S
            i5.o r0 = r0.m(r3)
            if (r0 != 0) goto L_0x0029
            com.fasterxml.jackson.databind.ser.q r0 = r2.S
            i5.c0 r1 = r2.P
            i5.j r1 = r1.h(r3)
            i5.o r0 = r0.l(r1)
            if (r0 != 0) goto L_0x0029
            i5.o r0 = r2.F(r3)
            if (r0 != 0) goto L_0x0029
            i5.o r3 = r2.q0(r3)
            return r3
        L_0x0029:
            i5.o r3 = r2.r0(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e0.b0(java.lang.Class, i5.d):i5.o");
    }

    public u5.i c0(j jVar) throws l {
        return this.R.d(this.P, jVar);
    }

    public o<Object> d0(j jVar, boolean z10, d dVar) throws l {
        o<Object> d10 = this.Y.d(jVar);
        if (d10 != null) {
            return d10;
        }
        o<Object> j10 = this.S.j(jVar);
        if (j10 != null) {
            return j10;
        }
        o<Object> g02 = g0(jVar, dVar);
        u5.i d11 = this.R.d(this.P, jVar);
        if (d11 != null) {
            g02 = new x5.q(d11.b(dVar), g02);
        }
        if (z10) {
            this.S.e(jVar, g02);
        }
        return g02;
    }

    public o<Object> e0(Class<?> cls, boolean z10, d dVar) throws l {
        o<Object> e10 = this.Y.e(cls);
        if (e10 != null) {
            return e10;
        }
        o<Object> k10 = this.S.k(cls);
        if (k10 != null) {
            return k10;
        }
        o<Object> i02 = i0(cls, dVar);
        com.fasterxml.jackson.databind.ser.r rVar = this.R;
        c0 c0Var = this.P;
        u5.i d10 = rVar.d(c0Var, c0Var.h(cls));
        if (d10 != null) {
            i02 = new x5.q(d10.b(dVar), i02);
        }
        if (z10) {
            this.S.f(cls, i02);
        }
        return i02;
    }

    public o<Object> f0(j jVar) throws l {
        o<Object> f10 = this.Y.f(jVar);
        if (f10 != null) {
            return f10;
        }
        o<Object> l10 = this.S.l(jVar);
        if (l10 != null) {
            return l10;
        }
        o<Object> E = E(jVar);
        return E == null ? q0(jVar.g()) : E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = r2.S.l(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r0 = E(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<java.lang.Object> g0(i5.j r3, i5.d r4) throws i5.l {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Null passed for `valueType` of `findValueSerializer()`"
            r2.E0(r1, r0)
        L_0x000a:
            x5.l r0 = r2.Y
            i5.o r0 = r0.f(r3)
            if (r0 != 0) goto L_0x0029
            com.fasterxml.jackson.databind.ser.q r0 = r2.S
            i5.o r0 = r0.l(r3)
            if (r0 != 0) goto L_0x0029
            i5.o r0 = r2.E(r3)
            if (r0 != 0) goto L_0x0029
            java.lang.Class r3 = r3.g()
            i5.o r3 = r2.q0(r3)
            return r3
        L_0x0029:
            i5.o r3 = r2.s0(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e0.g0(i5.j, i5.d):i5.o");
    }

    public o<Object> h0(Class<?> cls) throws l {
        o<Object> g10 = this.Y.g(cls);
        if (g10 != null) {
            return g10;
        }
        o<Object> m10 = this.S.m(cls);
        if (m10 != null) {
            return m10;
        }
        o<Object> l10 = this.S.l(this.P.h(cls));
        if (l10 != null) {
            return l10;
        }
        o<Object> F = F(cls);
        return F == null ? q0(cls) : F;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.S.m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r2.S.l(r2.P.h(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = F(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<java.lang.Object> i0(java.lang.Class<?> r3, i5.d r4) throws i5.l {
        /*
            r2 = this;
            x5.l r0 = r2.Y
            i5.o r0 = r0.g(r3)
            if (r0 != 0) goto L_0x0029
            com.fasterxml.jackson.databind.ser.q r0 = r2.S
            i5.o r0 = r0.m(r3)
            if (r0 != 0) goto L_0x0029
            com.fasterxml.jackson.databind.ser.q r0 = r2.S
            i5.c0 r1 = r2.P
            i5.j r1 = r1.h(r3)
            i5.o r0 = r0.l(r1)
            if (r0 != 0) goto L_0x0029
            i5.o r0 = r2.F(r3)
            if (r0 != 0) goto L_0x0029
            i5.o r3 = r2.q0(r3)
            return r3
        L_0x0029:
            i5.o r3 = r2.s0(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e0.i0(java.lang.Class, i5.d):i5.o");
    }

    public final boolean j() {
        return this.P.c();
    }

    /* renamed from: j0 */
    public final c0 q() {
        return this.P;
    }

    public j k(j jVar, Class<?> cls) throws IllegalArgumentException {
        return jVar.j(cls) ? jVar : q().M().W(jVar, cls, true);
    }

    public o<Object> k0() {
        return this.X;
    }

    public o<Object> l0() {
        return this.W;
    }

    public final u.b m0(Class<?> cls) {
        return this.P.A(cls);
    }

    public final Class<?> n() {
        return this.Q;
    }

    public final com.fasterxml.jackson.databind.ser.l n0() {
        return this.P.J0();
    }

    public final b o() {
        return this.P.m();
    }

    public i o0() {
        return null;
    }

    public Object p(Object obj) {
        return this.T.a(obj);
    }

    @Deprecated
    public final Class<?> p0() {
        return this.Q;
    }

    public o<Object> q0(Class<?> cls) {
        return cls == Object.class ? this.U : new r(cls);
    }

    public final n.d r(Class<?> cls) {
        return this.P.w(cls);
    }

    public o<?> r0(o<?> oVar, d dVar) throws l {
        return (oVar == null || !(oVar instanceof j)) ? oVar : ((j) oVar).d(this, dVar);
    }

    public Locale s() {
        return this.P.H();
    }

    public o<?> s0(o<?> oVar, d dVar) throws l {
        return (oVar == null || !(oVar instanceof j)) ? oVar : ((j) oVar).d(this, dVar);
    }

    public TimeZone t() {
        return this.P.L();
    }

    public final boolean t0(int i10) {
        return this.P.M0(i10);
    }

    public final z5.n u() {
        return this.P.M();
    }

    public abstract Object u0(s sVar, Class<?> cls) throws l;

    public l v(j jVar, String str, String str2) {
        return o5.e.E((w4.l) null, a(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, h.N(jVar)}), str2), jVar, str);
    }

    public abstract boolean v0(Object obj) throws l;

    public final boolean w(q qVar) {
        return this.P.T(qVar);
    }

    public final boolean w0(d0 d0Var) {
        return this.P.P0(d0Var);
    }

    public boolean x0(o<?> oVar) {
        if (oVar == this.U || oVar == null) {
            return true;
        }
        return w0(d0.FAIL_ON_EMPTY_BEANS) && oVar.getClass() == r.class;
    }

    @Deprecated
    public l y0(String str, Object... objArr) {
        return l.l(o0(), c(str, objArr));
    }

    public <T> T z(j jVar, String str) throws l {
        throw b.A(o0(), str, jVar);
    }

    @Deprecated
    public l z0(Throwable th2, String str, Object... objArr) {
        return l.m(o0(), c(str, objArr), th2);
    }
}
