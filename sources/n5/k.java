package n5;

import a6.h;
import i5.d;
import i5.g;
import i5.j;
import i5.l;
import i5.p;
import i5.q;
import java.io.IOException;
import java.util.EnumMap;
import l5.i;
import l5.s;
import l5.t;
import l5.y;
import m5.v;
import u5.f;

public class k extends g<EnumMap<?, ?>> implements i, t {

    /* renamed from: e0  reason: collision with root package name */
    public static final long f10843e0 = 1;
    public final Class<?> X;
    public p Y;
    public i5.k<Object> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final f f10844a0;

    /* renamed from: b0  reason: collision with root package name */
    public final y f10845b0;

    /* renamed from: c0  reason: collision with root package name */
    public i5.k<Object> f10846c0;

    /* renamed from: d0  reason: collision with root package name */
    public v f10847d0;

    @Deprecated
    public k(j jVar, p pVar, i5.k<?> kVar, f fVar) {
        this(jVar, (y) null, pVar, kVar, fVar, (s) null);
    }

    public k(j jVar, y yVar, p pVar, i5.k<?> kVar, f fVar, s sVar) {
        super(jVar, sVar, (Boolean) null);
        this.X = jVar.e().g();
        this.Y = pVar;
        this.Z = kVar;
        this.f10844a0 = fVar;
        this.f10845b0 = yVar;
    }

    public k(k kVar, p pVar, i5.k<?> kVar2, f fVar, s sVar) {
        super((g<?>) kVar, sVar, kVar.W);
        this.X = kVar.X;
        this.Y = pVar;
        this.Z = kVar2;
        this.f10844a0 = fVar;
        this.f10845b0 = kVar.f10845b0;
        this.f10846c0 = kVar.f10846c0;
        this.f10847d0 = kVar.f10847d0;
    }

    public i5.k<Object> E0() {
        return this.Z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b1 A[SYNTHETIC, Splitter:B:42:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.EnumMap<?, ?> H0(w4.l r8, i5.g r9) throws java.io.IOException {
        /*
            r7 = this;
            m5.v r0 = r7.f10847d0
            r1 = 0
            m5.y r2 = r0.h(r8, r9, r1)
            boolean r3 = r8.v2()
            if (r3 == 0) goto L_0x0012
        L_0x000d:
            java.lang.String r3 = r8.y2()
            goto L_0x0020
        L_0x0012:
            w4.p r3 = w4.p.FIELD_NAME
            boolean r3 = r8.q2(r3)
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = r8.X0()
            goto L_0x0020
        L_0x001f:
            r3 = r1
        L_0x0020:
            if (r3 == 0) goto L_0x00b1
            w4.p r4 = r8.D2()
            l5.v r5 = r0.f(r3)
            if (r5 == 0) goto L_0x0052
            java.lang.Object r4 = r5.s(r8, r9)
            boolean r4 = r2.b(r5, r4)
            if (r4 == 0) goto L_0x000d
            r8.D2()
            java.lang.Object r0 = r0.a(r9, r2)     // Catch:{ Exception -> 0x0044 }
            java.util.EnumMap r0 = (java.util.EnumMap) r0     // Catch:{ Exception -> 0x0044 }
            java.util.EnumMap r8 = r7.g(r8, r9, r0)
            return r8
        L_0x0044:
            r8 = move-exception
            i5.j r9 = r7.T
            java.lang.Class r9 = r9.g()
            java.lang.Object r8 = r7.G0(r8, r9, r3)
        L_0x004f:
            java.util.EnumMap r8 = (java.util.EnumMap) r8
            return r8
        L_0x0052:
            i5.p r5 = r7.Y
            java.lang.Object r5 = r5.a(r3, r9)
            java.lang.Enum r5 = (java.lang.Enum) r5
            if (r5 != 0) goto L_0x0080
            i5.h r4 = i5.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r4 = r9.v0(r4)
            if (r4 != 0) goto L_0x0079
            java.lang.Class<?> r8 = r7.X
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            i5.j r2 = r7.T
            i5.j r2 = r2.e()
            r0[r1] = r2
            java.lang.String r1 = "value not one of declared Enum instance names for %s"
            java.lang.Object r8 = r9.p0(r8, r3, r1, r0)
            goto L_0x004f
        L_0x0079:
            r8.D2()
            r8.Z2()
            goto L_0x000d
        L_0x0080:
            w4.p r6 = w4.p.VALUE_NULL     // Catch:{ Exception -> 0x00a6 }
            if (r4 != r6) goto L_0x0090
            boolean r4 = r7.V     // Catch:{ Exception -> 0x00a6 }
            if (r4 == 0) goto L_0x0089
            goto L_0x000d
        L_0x0089:
            l5.s r4 = r7.U     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r3 = r4.d(r9)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00a1
        L_0x0090:
            u5.f r4 = r7.f10844a0     // Catch:{ Exception -> 0x00a6 }
            if (r4 != 0) goto L_0x009b
            i5.k<java.lang.Object> r4 = r7.Z     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r3 = r4.f(r8, r9)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00a1
        L_0x009b:
            i5.k<java.lang.Object> r6 = r7.Z     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r3 = r6.h(r8, r9, r4)     // Catch:{ Exception -> 0x00a6 }
        L_0x00a1:
            r2.d(r5, r3)
            goto L_0x000d
        L_0x00a6:
            r8 = move-exception
            i5.j r9 = r7.T
            java.lang.Class r9 = r9.g()
            r7.G0(r8, r9, r3)
            return r1
        L_0x00b1:
            java.lang.Object r8 = r0.a(r9, r2)     // Catch:{ Exception -> 0x00a6 }
            java.util.EnumMap r8 = (java.util.EnumMap) r8     // Catch:{ Exception -> 0x00a6 }
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.k.H0(w4.l, i5.g):java.util.EnumMap");
    }

    public EnumMap<?, ?> I0(g gVar) throws l {
        y yVar = this.f10845b0;
        if (yVar == null) {
            return new EnumMap<>(this.X);
        }
        try {
            if (yVar.i()) {
                return (EnumMap) this.f10845b0.t(gVar);
            }
            return (EnumMap) gVar.c0(r(), e(), (w4.l) null, "no default constructor found", new Object[0]);
        } catch (IOException e10) {
            return (EnumMap) h.n0(gVar, e10);
        }
    }

    /* renamed from: J0 */
    public EnumMap<?, ?> f(w4.l lVar, g gVar) throws IOException {
        if (this.f10847d0 != null) {
            return H0(lVar, gVar);
        }
        i5.k<Object> kVar = this.f10846c0;
        if (kVar != null) {
            return (EnumMap) this.f10845b0.u(gVar, kVar.f(lVar, gVar));
        }
        int Q = lVar.Q();
        if (!(Q == 1 || Q == 2)) {
            if (Q == 3) {
                w4.p D2 = lVar.D2();
                w4.p pVar = w4.p.END_ARRAY;
                if (D2 == pVar) {
                    if (gVar.v0(i5.h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                        return null;
                    }
                } else if (gVar.v0(i5.h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                    EnumMap<?, ?> J0 = f(lVar, gVar);
                    if (lVar.D2() != pVar) {
                        z0(lVar, gVar);
                    }
                    return J0;
                }
                return (EnumMap) gVar.h0(y0(gVar), w4.p.START_ARRAY, lVar, (String) null, new Object[0]);
            } else if (Q != 5) {
                return Q != 6 ? (EnumMap) D(lVar, gVar) : (EnumMap) this.f10845b0.r(gVar, lVar.Y1());
            }
        }
        return g(lVar, gVar, I0(gVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.EnumMap<?, ?> g(w4.l r8, i5.g r9, java.util.EnumMap r10) throws java.io.IOException {
        /*
            r7 = this;
            r8.T2(r10)
            i5.k<java.lang.Object> r0 = r7.Z
            u5.f r1 = r7.f10844a0
            boolean r2 = r8.v2()
            r3 = 0
            if (r2 == 0) goto L_0x0013
        L_0x000e:
            java.lang.String r2 = r8.y2()
            goto L_0x002a
        L_0x0013:
            w4.p r2 = r8.P()
            w4.p r4 = w4.p.FIELD_NAME
            if (r2 == r4) goto L_0x0026
            w4.p r5 = w4.p.END_OBJECT
            if (r2 != r5) goto L_0x0020
            return r10
        L_0x0020:
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r9.Y0(r7, r4, r2, r5)
        L_0x0026:
            java.lang.String r2 = r8.X0()
        L_0x002a:
            if (r2 == 0) goto L_0x0081
            i5.p r4 = r7.Y
            java.lang.Object r4 = r4.a(r2, r9)
            java.lang.Enum r4 = (java.lang.Enum) r4
            w4.p r5 = r8.D2()
            if (r4 != 0) goto L_0x005c
            i5.h r4 = i5.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r4 = r9.v0(r4)
            if (r4 != 0) goto L_0x0058
            java.lang.Class<?> r8 = r7.X
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            i5.j r0 = r7.T
            i5.j r0 = r0.e()
            r10[r3] = r0
            java.lang.String r0 = "value not one of declared Enum instance names for %s"
            java.lang.Object r8 = r9.p0(r8, r2, r0, r10)
        L_0x0055:
            java.util.EnumMap r8 = (java.util.EnumMap) r8
            return r8
        L_0x0058:
            r8.Z2()
            goto L_0x000e
        L_0x005c:
            w4.p r6 = w4.p.VALUE_NULL     // Catch:{ Exception -> 0x007b }
            if (r5 != r6) goto L_0x006c
            boolean r5 = r7.V     // Catch:{ Exception -> 0x007b }
            if (r5 == 0) goto L_0x0065
            goto L_0x000e
        L_0x0065:
            l5.s r5 = r7.U     // Catch:{ Exception -> 0x007b }
            java.lang.Object r2 = r5.d(r9)     // Catch:{ Exception -> 0x007b }
            goto L_0x0077
        L_0x006c:
            if (r1 != 0) goto L_0x0073
            java.lang.Object r2 = r0.f(r8, r9)     // Catch:{ Exception -> 0x007b }
            goto L_0x0077
        L_0x0073:
            java.lang.Object r2 = r0.h(r8, r9, r1)     // Catch:{ Exception -> 0x007b }
        L_0x0077:
            r10.put(r4, r2)
            goto L_0x000e
        L_0x007b:
            r8 = move-exception
            java.lang.Object r8 = r7.G0(r8, r10, r2)
            goto L_0x0055
        L_0x0081:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.k.g(w4.l, i5.g, java.util.EnumMap):java.util.EnumMap");
    }

    public k L0(p pVar, i5.k<?> kVar, f fVar, s sVar) {
        return (pVar == this.Y && sVar == this.U && kVar == this.Z && fVar == this.f10844a0) ? this : new k(this, pVar, kVar, fVar, sVar);
    }

    public i5.k<?> a(g gVar, d dVar) throws l {
        p pVar = this.Y;
        if (pVar == null) {
            pVar = gVar.N(this.T.e(), dVar);
        }
        i5.k kVar = this.Z;
        j G = this.T.d();
        i5.k L = kVar == null ? gVar.L(G, dVar) : gVar.f0(kVar, dVar, G);
        f fVar = this.f10844a0;
        if (fVar != null) {
            fVar = fVar.g(dVar);
        }
        return L0(pVar, L, fVar, p0(gVar, dVar, L));
    }

    public void b(g gVar) throws l {
        j w10;
        j jVar;
        String format;
        y yVar = this.f10845b0;
        if (yVar != null) {
            if (yVar.j()) {
                w10 = this.f10845b0.z(gVar.q());
                if (w10 == null) {
                    jVar = this.T;
                    format = String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{jVar, this.f10845b0.getClass().getName()});
                }
                this.f10846c0 = s0(gVar, w10, (d) null);
            } else if (this.f10845b0.h()) {
                w10 = this.f10845b0.w(gVar.q());
                if (w10 == null) {
                    jVar = this.T;
                    format = String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{jVar, this.f10845b0.getClass().getName()});
                }
                this.f10846c0 = s0(gVar, w10, (d) null);
            } else if (this.f10845b0.f()) {
                this.f10847d0 = v.d(gVar, this.f10845b0, this.f10845b0.A(gVar.q()), gVar.w(q.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                return;
            } else {
                return;
            }
            gVar.z(jVar, format);
            this.f10846c0 = s0(gVar, w10, (d) null);
        }
    }

    public Object h(w4.l lVar, g gVar, f fVar) throws IOException {
        return fVar.e(lVar, gVar);
    }

    public Object n(g gVar) throws l {
        return I0(gVar);
    }

    public boolean s() {
        return this.Z == null && this.Y == null && this.f10844a0 == null;
    }
}
