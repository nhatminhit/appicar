package n5;

import a6.a;
import i5.d;
import i5.g;
import i5.h;
import i5.j;
import i5.k;
import java.io.IOException;
import java.util.EnumSet;
import l5.i;
import l5.s;
import m5.q;
import u5.f;
import v4.n;
import w4.p;

public class l extends a0<EnumSet<?>> implements i {
    public static final long Y = 1;
    public final j T;
    public k<Enum<?>> U;
    public final s V;
    public final boolean W;
    public final Boolean X;

    public l(j jVar, k<?> kVar) {
        super((Class<?>) EnumSet.class);
        this.T = jVar;
        if (jVar.p()) {
            this.U = kVar;
            this.X = null;
            this.V = null;
            this.W = false;
            return;
        }
        throw new IllegalArgumentException("Type " + jVar + " not Java Enum type");
    }

    @Deprecated
    public l(l lVar, k<?> kVar, Boolean bool) {
        this(lVar, kVar, lVar.V, bool);
    }

    public l(l lVar, k<?> kVar, s sVar, Boolean bool) {
        super((a0<?>) lVar);
        this.T = lVar.T;
        this.U = kVar;
        this.V = sVar;
        this.W = q.e(sVar);
        this.X = bool;
    }

    public final EnumSet<?> E0(w4.l lVar, g gVar, EnumSet enumSet) throws IOException {
        Object f10;
        while (true) {
            try {
                p D2 = lVar.D2();
                if (D2 == p.END_ARRAY) {
                    return enumSet;
                }
                if (D2 != p.VALUE_NULL) {
                    f10 = this.U.f(lVar, gVar);
                } else if (!this.W) {
                    f10 = this.V.d(gVar);
                }
                Enum enumR = (Enum) f10;
                if (enumR != null) {
                    enumSet.add(enumR);
                }
            } catch (Exception e10) {
                throw i5.l.x(e10, enumSet, enumSet.size());
            }
        }
    }

    public final EnumSet F0() {
        return EnumSet.noneOf(this.T.g());
    }

    /* renamed from: G0 */
    public EnumSet<?> f(w4.l lVar, g gVar) throws IOException {
        EnumSet F0 = F0();
        return !lVar.u2() ? I0(lVar, gVar, F0) : E0(lVar, gVar, F0);
    }

    /* renamed from: H0 */
    public EnumSet<?> g(w4.l lVar, g gVar, EnumSet<?> enumSet) throws IOException {
        return !lVar.u2() ? I0(lVar, gVar, enumSet) : E0(lVar, gVar, enumSet);
    }

    public EnumSet<?> I0(w4.l lVar, g gVar, EnumSet enumSet) throws IOException {
        Object g02;
        Boolean bool = this.X;
        if (!(bool == Boolean.TRUE || (bool == null && gVar.v0(h.ACCEPT_SINGLE_VALUE_AS_ARRAY)))) {
            g02 = gVar.i0(EnumSet.class, lVar);
        } else if (lVar.q2(p.VALUE_NULL)) {
            g02 = gVar.g0(this.T, lVar);
        } else {
            try {
                Enum f10 = this.U.f(lVar, gVar);
                if (f10 != null) {
                    enumSet.add(f10);
                }
                return enumSet;
            } catch (Exception e10) {
                throw i5.l.x(e10, enumSet, enumSet.size());
            }
        }
        return (EnumSet) g02;
    }

    public l J0(k<?> kVar) {
        return this.U == kVar ? this : new l(this, kVar, this.V, this.X);
    }

    @Deprecated
    public l K0(k<?> kVar, Boolean bool) {
        return L0(kVar, this.V, bool);
    }

    public l L0(k<?> kVar, s sVar, Boolean bool) {
        return (this.X == bool && this.U == kVar && this.V == kVar) ? this : new l(this, kVar, sVar, bool);
    }

    public k<?> a(g gVar, d dVar) throws i5.l {
        Boolean t02 = t0(gVar, dVar, EnumSet.class, n.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        k kVar = this.U;
        k L = kVar == null ? gVar.L(this.T, dVar) : gVar.f0(kVar, dVar, this.T);
        return L0(L, p0(gVar, dVar, L), t02);
    }

    public Object h(w4.l lVar, g gVar, f fVar) throws IOException, w4.n {
        return fVar.d(lVar, gVar);
    }

    public a l() {
        return a.DYNAMIC;
    }

    public Object n(g gVar) throws i5.l {
        return F0();
    }

    public boolean s() {
        return this.T.S() == null;
    }

    public Boolean u(i5.f fVar) {
        return Boolean.TRUE;
    }
}
