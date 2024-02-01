package n5;

import a6.h;
import i5.g;
import i5.j;
import i5.k;
import i5.q;
import java.io.IOException;
import l5.i;
import l5.v;
import l5.y;
import m5.s;
import u5.f;
import w4.l;
import w4.n;
import w4.p;

public class m extends a0<Object> implements i {

    /* renamed from: a0  reason: collision with root package name */
    public static final long f10848a0 = 1;
    public final j T;
    public final boolean U;
    public final q5.i V;
    public final k<?> W;
    public final y X;
    public final v[] Y;
    public transient m5.v Z;

    public m(Class<?> cls, q5.i iVar) {
        super(cls);
        this.V = iVar;
        this.U = false;
        this.T = null;
        this.W = null;
        this.X = null;
        this.Y = null;
    }

    public m(Class<?> cls, q5.i iVar, j jVar, y yVar, v[] vVarArr) {
        super(cls);
        this.V = iVar;
        this.U = true;
        this.T = jVar.j(String.class) ? null : jVar;
        this.W = null;
        this.X = yVar;
        this.Y = vVarArr;
    }

    public m(m mVar, k<?> kVar) {
        super(mVar.O);
        this.T = mVar.T;
        this.V = mVar.V;
        this.U = mVar.U;
        this.X = mVar.X;
        this.Y = mVar.Y;
        this.W = kVar;
    }

    public final Object E0(l lVar, g gVar, v vVar) throws IOException {
        try {
            return vVar.s(lVar, gVar);
        } catch (Exception e10) {
            return H0(e10, r(), vVar.getName(), gVar);
        }
    }

    public Object F0(l lVar, g gVar, m5.v vVar) throws IOException {
        m5.y h10 = vVar.h(lVar, gVar, (s) null);
        p P = lVar.P();
        while (P == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            v f10 = vVar.f(X0);
            if (f10 != null) {
                h10.b(f10, E0(lVar, gVar, f10));
            } else {
                h10.l(X0);
            }
            P = lVar.D2();
        }
        return vVar.a(gVar, h10);
    }

    public final Throwable G0(Throwable th2, g gVar) throws IOException {
        Throwable M = h.M(th2);
        h.o0(M);
        boolean z10 = gVar == null || gVar.v0(i5.h.WRAP_EXCEPTIONS);
        if (M instanceof IOException) {
            if (!z10 || !(M instanceof n)) {
                throw ((IOException) M);
            }
        } else if (!z10) {
            h.q0(M);
        }
        return M;
    }

    public Object H0(Throwable th2, Object obj, String str, g gVar) throws IOException {
        throw i5.l.y(G0(th2, gVar), obj, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.T;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.k<?> a(i5.g r3, i5.d r4) throws i5.l {
        /*
            r2 = this;
            i5.k<?> r0 = r2.W
            if (r0 != 0) goto L_0x0016
            i5.j r0 = r2.T
            if (r0 == 0) goto L_0x0016
            l5.v[] r1 = r2.Y
            if (r1 != 0) goto L_0x0016
            n5.m r1 = new n5.m
            i5.k r3 = r3.L(r0, r4)
            r1.<init>((n5.m) r2, (i5.k<?>) r3)
            return r1
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.m.a(i5.g, i5.d):i5.k");
    }

    public Object f(l lVar, g gVar) throws IOException {
        Object obj;
        k<?> kVar = this.W;
        if (kVar != null) {
            obj = kVar.f(lVar, gVar);
        } else if (this.U) {
            p P = lVar.P();
            if (this.Y != null) {
                if (!lVar.v2()) {
                    j y02 = y0(gVar);
                    gVar.N0(y02, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", h.N(y02), this.V, lVar.P());
                }
                if (this.Z == null) {
                    this.Z = m5.v.d(gVar, this.X, this.Y, gVar.w(q.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                lVar.D2();
                return F0(lVar, gVar, this.Z);
            }
            obj = (P == p.VALUE_STRING || P == p.FIELD_NAME) ? lVar.Y1() : P == p.VALUE_NUMBER_INT ? lVar.S1() : lVar.m2();
        } else {
            lVar.Z2();
            try {
                return this.V.v();
            } catch (Exception e10) {
                return gVar.b0(this.O, (Object) null, h.r0(e10));
            }
        }
        try {
            return this.V.H(this.O, obj);
        } catch (Exception e11) {
            Throwable r02 = h.r0(e11);
            if (!gVar.v0(i5.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL) || !(r02 instanceof IllegalArgumentException)) {
                return gVar.b0(this.O, obj, r02);
            }
            return null;
        }
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return this.W == null ? f(lVar, gVar) : fVar.c(lVar, gVar);
    }

    public boolean s() {
        return true;
    }

    public Boolean u(i5.f fVar) {
        return Boolean.FALSE;
    }
}
