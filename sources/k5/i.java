package k5;

import c5.m;
import i5.c;
import i5.j;
import i5.q;
import i5.y;
import i5.z;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import k5.i;
import q5.b;
import q5.f0;
import q5.t;
import u5.d;
import u5.e;
import u5.h;
import v4.c0;
import v4.n;
import v4.s;
import v4.u;
import v5.k;
import w4.a;

public abstract class i<T extends i<T>> implements t.a, Serializable {
    public static final long Q = 2;
    public static final u.b R = u.b.d();
    public static final n.d S = n.d.c();
    public final int O;
    public final a P;

    public i(a aVar, int i10) {
        this.P = aVar;
        this.O = i10;
    }

    public i(i<T> iVar) {
        this.P = iVar.P;
        this.O = iVar.O;
    }

    public i(i<T> iVar, int i10) {
        this.P = iVar.P;
        this.O = i10;
    }

    public i(i<T> iVar, a aVar) {
        this.P = aVar;
        this.O = iVar.O;
    }

    public static <F extends Enum<F> & b> int d(Class<F> cls) {
        int i10 = 0;
        for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
            b bVar = (b) enumR;
            if (bVar.b()) {
                i10 |= bVar.a();
            }
        }
        return i10;
    }

    public abstract u.b A(Class<?> cls);

    public u.b B(Class<?> cls, u.b bVar) {
        u.b d10 = q(cls).d();
        return d10 != null ? d10 : bVar;
    }

    public abstract c0.a C();

    public final h<?> D(j jVar) {
        return this.P.m();
    }

    public abstract f0<?> E();

    public abstract f0<?> F(Class<?> cls, b bVar);

    public final g G() {
        return this.P.g();
    }

    public final Locale H() {
        return this.P.h();
    }

    public d I() {
        d i10 = this.P.i();
        return (i10 != k.R || !T(q.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? i10 : new u5.b();
    }

    public final z J() {
        return this.P.j();
    }

    public abstract e K();

    public final TimeZone L() {
        return this.P.k();
    }

    public final z5.n M() {
        return this.P.l();
    }

    public final boolean N(int i10) {
        return (this.O & i10) == i10;
    }

    public c O(j jVar) {
        return p().b(this, jVar, this);
    }

    public c P(Class<?> cls) {
        return O(h(cls));
    }

    public final c Q(j jVar) {
        return p().f(this, jVar, this);
    }

    public c R(Class<?> cls) {
        return Q(h(cls));
    }

    public final boolean S() {
        return T(q.USE_ANNOTATIONS);
    }

    public final boolean T(q qVar) {
        return qVar.d(this.O);
    }

    public final boolean U() {
        return T(q.SORT_PROPERTIES_ALPHABETICALLY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r0.i(r1, r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u5.g V(q5.a r2, java.lang.Class<? extends u5.g> r3) {
        /*
            r1 = this;
            k5.g r0 = r1.G()
            if (r0 == 0) goto L_0x000d
            u5.g r2 = r0.i(r1, r2, r3)
            if (r2 == 0) goto L_0x000d
            return r2
        L_0x000d:
            boolean r2 = r1.c()
            java.lang.Object r2 = a6.h.l(r3, r2)
            u5.g r2 = (u5.g) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.V(q5.a, java.lang.Class):u5.g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r0.j(r1, r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u5.h<?> W(q5.a r2, java.lang.Class<? extends u5.h<?>> r3) {
        /*
            r1 = this;
            k5.g r0 = r1.G()
            if (r0 == 0) goto L_0x000d
            u5.h r2 = r0.j(r1, r2, r3)
            if (r2 == 0) goto L_0x000d
            return r2
        L_0x000d:
            boolean r2 = r1.c()
            java.lang.Object r2 = a6.h.l(r3, r2)
            u5.h r2 = (u5.h) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.W(q5.a, java.lang.Class):u5.h");
    }

    public abstract boolean X();

    public abstract T Y(q qVar, boolean z10);

    public abstract T Z(q... qVarArr);

    public abstract T a0(q... qVarArr);

    public final boolean c() {
        return T(q.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public w4.u e(String str) {
        return new m(str);
    }

    public j f(j jVar, Class<?> cls) {
        return M().W(jVar, cls, true);
    }

    public final j g(g5.b<?> bVar) {
        return M().Y(bVar.b());
    }

    public final j h(Class<?> cls) {
        return M().Y(cls);
    }

    public abstract c i(Class<?> cls);

    public abstract y j(j jVar);

    public abstract y k(Class<?> cls);

    public abstract Class<?> l();

    public i5.b m() {
        return T(q.USE_ANNOTATIONS) ? this.P.c() : q5.y.P;
    }

    public abstract e n();

    public a o() {
        return this.P.d();
    }

    public t p() {
        return this.P.e();
    }

    public abstract c q(Class<?> cls);

    public final DateFormat r() {
        return this.P.f();
    }

    public abstract u.b s(Class<?> cls, Class<?> cls2);

    public u.b t(Class<?> cls, Class<?> cls2, u.b bVar) {
        return u.b.k(bVar, q(cls).d(), q(cls2).e());
    }

    public abstract Boolean u();

    public abstract Boolean v(Class<?> cls);

    public abstract n.d w(Class<?> cls);

    public abstract s.a x(Class<?> cls);

    public abstract s.a y(Class<?> cls, b bVar);

    public abstract u.b z();
}
