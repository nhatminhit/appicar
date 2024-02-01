package n5;

import i5.d;
import i5.g;
import i5.j;
import i5.k;
import i5.p;
import j5.a;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import l5.i;
import u5.f;
import w4.l;

@a
public class s extends g<Map.Entry<Object, Object>> implements i {

    /* renamed from: a0  reason: collision with root package name */
    public static final long f10874a0 = 1;
    public final p X;
    public final k<Object> Y;
    public final f Z;

    public s(j jVar, p pVar, k<Object> kVar, f fVar) {
        super(jVar);
        if (jVar.b() == 2) {
            this.X = pVar;
            this.Y = kVar;
            this.Z = fVar;
            return;
        }
        throw new IllegalArgumentException("Missing generic type information for " + jVar);
    }

    public s(s sVar) {
        super((g<?>) sVar);
        this.X = sVar.X;
        this.Y = sVar.Y;
        this.Z = sVar.Z;
    }

    public s(s sVar, p pVar, k<Object> kVar, f fVar) {
        super((g<?>) sVar);
        this.X = pVar;
        this.Y = kVar;
        this.Z = fVar;
    }

    public k<Object> E0() {
        return this.Y;
    }

    public j F0() {
        return this.T.a(1);
    }

    /* renamed from: H0 */
    public Map.Entry<Object, Object> f(l lVar, g gVar) throws IOException {
        Object obj;
        w4.p P = lVar.P();
        w4.p pVar = w4.p.START_OBJECT;
        if (P != pVar && P != w4.p.FIELD_NAME && P != w4.p.END_OBJECT) {
            return (Map.Entry) D(lVar, gVar);
        }
        if (P == pVar) {
            P = lVar.D2();
        }
        if (P != w4.p.FIELD_NAME) {
            return P == w4.p.END_OBJECT ? (Map.Entry) gVar.O0(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]) : (Map.Entry) gVar.i0(r(), lVar);
        }
        p pVar2 = this.X;
        k<Object> kVar = this.Y;
        f fVar = this.Z;
        String X0 = lVar.X0();
        Object a10 = pVar2.a(X0, gVar);
        try {
            obj = lVar.D2() == w4.p.VALUE_NULL ? kVar.d(gVar) : fVar == null ? kVar.f(lVar, gVar) : kVar.h(lVar, gVar, fVar);
        } catch (Exception e10) {
            G0(e10, Map.Entry.class, X0);
            obj = null;
        }
        w4.p D2 = lVar.D2();
        if (D2 == w4.p.END_OBJECT) {
            return new AbstractMap.SimpleEntry(a10, obj);
        }
        if (D2 == w4.p.FIELD_NAME) {
            gVar.O0(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", lVar.X0());
        } else {
            gVar.O0(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + D2, new Object[0]);
        }
        return null;
    }

    /* renamed from: I0 */
    public Map.Entry<Object, Object> g(l lVar, g gVar, Map.Entry<Object, Object> entry) throws IOException {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    public s J0(p pVar, f fVar, k<?> kVar) {
        return (this.X == pVar && this.Y == kVar && this.Z == fVar) ? this : new s(this, pVar, (k<Object>) kVar, fVar);
    }

    public k<?> a(g gVar, d dVar) throws i5.l {
        p pVar = this.X;
        if (pVar == null) {
            pVar = gVar.N(this.T.a(0), dVar);
        } else if (pVar instanceof l5.j) {
            pVar = ((l5.j) pVar).a(gVar, dVar);
        }
        k r02 = r0(gVar, dVar, this.Y);
        j A = this.T.a(1);
        k L = r02 == null ? gVar.L(A, dVar) : gVar.f0(r02, dVar, A);
        f fVar = this.Z;
        if (fVar != null) {
            fVar = fVar.g(dVar);
        }
        return J0(pVar, fVar, L);
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return fVar.e(lVar, gVar);
    }
}
