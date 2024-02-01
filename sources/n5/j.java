package n5;

import a6.h;
import a6.k;
import i5.d;
import i5.f;
import i5.g;
import i5.q;
import j5.a;
import java.io.IOException;
import l5.i;
import l5.v;
import l5.y;
import v4.n;
import w4.l;
import w4.p;

@a
public class j extends e0<Object> implements i {
    public static final long Z = 1;
    public Object[] U;
    public final Enum<?> V;
    public final a6.i W;
    public a6.i X;
    public final Boolean Y;

    @Deprecated
    public j(k kVar) {
        this(kVar, (Boolean) null);
    }

    public j(k kVar, Boolean bool) {
        super((Class<?>) kVar.l());
        this.W = kVar.b();
        this.U = kVar.o();
        this.V = kVar.j();
        this.Y = bool;
    }

    public j(j jVar, Boolean bool) {
        super((e0<?>) jVar);
        this.W = jVar.W;
        this.U = jVar.U;
        this.V = jVar.V;
        this.Y = bool;
    }

    @Deprecated
    public static i5.k<?> I0(f fVar, Class<?> cls, q5.i iVar) {
        return J0(fVar, cls, iVar, (y) null, (v[]) null);
    }

    public static i5.k<?> J0(f fVar, Class<?> cls, q5.i iVar, y yVar, v[] vVarArr) {
        if (fVar.c()) {
            h.g(iVar.p(), fVar.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new m(cls, iVar, iVar.D(0), yVar, vVarArr);
    }

    public static i5.k<?> K0(f fVar, Class<?> cls, q5.i iVar) {
        if (fVar.c()) {
            h.g(iVar.p(), fVar.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new m(cls, iVar);
    }

    public final Object E0(l lVar, g gVar, a6.i iVar, String str) throws IOException {
        char charAt;
        String trim = str.trim();
        if (trim.length() == 0) {
            if (gVar.v0(i5.h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return n(gVar);
            }
        } else if (Boolean.TRUE.equals(this.Y)) {
            Object d10 = iVar.d(trim);
            if (d10 != null) {
                return d10;
            }
        } else if (!gVar.v0(i5.h.FAIL_ON_NUMBERS_FOR_ENUMS) && (charAt = trim.charAt(0)) >= '0' && charAt <= '9') {
            try {
                int parseInt = Integer.parseInt(trim);
                if (!gVar.w(q.ALLOW_COERCION_OF_SCALARS)) {
                    return gVar.p0(G0(), trim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                }
                if (parseInt >= 0) {
                    Object[] objArr = this.U;
                    if (parseInt < objArr.length) {
                        return objArr[parseInt];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (this.V != null && gVar.v0(i5.h.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return this.V;
        }
        if (gVar.v0(i5.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return gVar.p0(G0(), trim, "not one of the values accepted for Enum class: %s", iVar.f());
    }

    public Object F0(l lVar, g gVar) throws IOException {
        return lVar.q2(p.START_ARRAY) ? C(lVar, gVar) : gVar.i0(G0(), lVar);
    }

    public Class<?> G0() {
        return r();
    }

    public a6.i H0(g gVar) {
        a6.i iVar = this.X;
        if (iVar == null) {
            synchronized (this) {
                iVar = k.e(G0(), gVar.o()).b();
            }
            this.X = iVar;
        }
        return iVar;
    }

    public j L0(Boolean bool) {
        return this.Y == bool ? this : new j(this, bool);
    }

    public i5.k<?> a(g gVar, d dVar) throws i5.l {
        Boolean t02 = t0(gVar, dVar, r(), n.a.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (t02 == null) {
            t02 = this.Y;
        }
        return L0(t02);
    }

    public Object f(l lVar, g gVar) throws IOException {
        p P = lVar.P();
        if (P == p.VALUE_STRING || P == p.FIELD_NAME) {
            a6.i H0 = gVar.v0(i5.h.READ_ENUMS_USING_TO_STRING) ? H0(gVar) : this.W;
            String Y1 = lVar.Y1();
            Object c10 = H0.c(Y1);
            return c10 == null ? E0(lVar, gVar, H0, Y1) : c10;
        } else if (P != p.VALUE_NUMBER_INT) {
            return F0(lVar, gVar);
        } else {
            int N1 = lVar.N1();
            if (gVar.v0(i5.h.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return gVar.o0(G0(), Integer.valueOf(N1), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            if (N1 >= 0) {
                Object[] objArr = this.U;
                if (N1 < objArr.length) {
                    return objArr[N1];
                }
            }
            if (this.V != null && gVar.v0(i5.h.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this.V;
            }
            if (gVar.v0(i5.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return gVar.o0(G0(), Integer.valueOf(N1), "index value outside legal index range [0..%s]", Integer.valueOf(this.U.length - 1));
        }
    }

    public boolean s() {
        return true;
    }
}
