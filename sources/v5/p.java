package v5;

import a6.h;
import i5.d;
import i5.j;
import i5.k;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n5.t;
import u5.f;
import u5.g;
import v4.f0;
import w4.l;

public abstract class p extends f implements Serializable {
    public static final long W = 1;
    public final g O;
    public final j P;
    public final d Q;
    public final j R;
    public final String S;
    public final boolean T;
    public final Map<String, k<Object>> U;
    public k<Object> V;

    public p(j jVar, g gVar, String str, boolean z10, j jVar2) {
        this.P = jVar;
        this.O = gVar;
        this.S = h.g0(str);
        this.T = z10;
        this.U = new ConcurrentHashMap(16, 0.75f, 2);
        this.R = jVar2;
        this.Q = null;
    }

    public p(p pVar, d dVar) {
        this.P = pVar.P;
        this.O = pVar.O;
        this.S = pVar.S;
        this.T = pVar.T;
        this.U = pVar.U;
        this.R = pVar.R;
        this.V = pVar.V;
        this.Q = dVar;
    }

    public abstract f g(d dVar);

    public Class<?> h() {
        return h.k0(this.R);
    }

    public final String i() {
        return this.S;
    }

    public g j() {
        return this.O;
    }

    public abstract f0.a k();

    @Deprecated
    public Object l(l lVar, i5.g gVar) throws IOException {
        return m(lVar, gVar, lVar.d2());
    }

    public Object m(l lVar, i5.g gVar, Object obj) throws IOException {
        k<Object> kVar;
        if (obj == null) {
            kVar = n(gVar);
            if (kVar == null) {
                return gVar.N0(r(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
            }
        } else {
            kVar = o(gVar, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return kVar.f(lVar, gVar);
    }

    public final k<Object> n(i5.g gVar) throws IOException {
        k<Object> kVar;
        j jVar = this.R;
        if (jVar == null) {
            if (!gVar.v0(i5.h.FAIL_ON_INVALID_SUBTYPE)) {
                return t.U;
            }
            return null;
        } else if (h.R(jVar.g())) {
            return t.U;
        } else {
            synchronized (this.R) {
                if (this.V == null) {
                    this.V = gVar.L(this.R, this.Q);
                }
                kVar = this.V;
            }
            return kVar;
        }
    }

    public final k<Object> o(i5.g gVar, String str) throws IOException {
        k<Object> kVar = this.U.get(str);
        if (kVar == null) {
            j g10 = this.O.g(gVar, str);
            if (g10 == null) {
                kVar = n(gVar);
                if (kVar == null) {
                    g10 = q(gVar, str);
                    if (g10 == null) {
                        return t.U;
                    }
                }
                this.U.put(str, kVar);
            } else {
                j jVar = this.P;
                if (jVar != null && jVar.getClass() == g10.getClass() && !g10.i()) {
                    try {
                        g10 = gVar.k(this.P, g10.g());
                    } catch (IllegalArgumentException e10) {
                        throw gVar.v(this.P, str, e10.getMessage());
                    }
                }
            }
            kVar = gVar.L(g10, this.Q);
            this.U.put(str, kVar);
        }
        return kVar;
    }

    public j p(i5.g gVar, String str) throws IOException {
        return gVar.d0(this.P, this.O, str);
    }

    public j q(i5.g gVar, String str) throws IOException {
        String str2;
        String b10 = this.O.b();
        if (b10 == null) {
            str2 = "type ids are not statically known";
        } else {
            str2 = "known type ids = " + b10;
        }
        d dVar = this.Q;
        if (dVar != null) {
            str2 = String.format("%s (for POJO property '%s')", new Object[]{str2, dVar.getName()});
        }
        return gVar.l0(this.P, str, this.O, str2);
    }

    public j r() {
        return this.P;
    }

    public String s() {
        return this.P.g().getName();
    }

    public String toString() {
        return '[' + getClass().getName() + "; base-type:" + this.P + "; id-resolver: " + this.O + ']';
    }
}
