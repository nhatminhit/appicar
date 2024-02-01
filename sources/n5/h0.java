package n5;

import i5.g;
import i5.h;
import i5.j;
import i5.k;
import j5.a;
import java.io.IOException;
import java.util.Collection;
import l5.i;
import l5.s;
import l5.y;
import u5.f;
import w4.l;
import w4.p;

@a
public final class h0 extends g<Collection<String>> implements i {

    /* renamed from: a0  reason: collision with root package name */
    public static final long f10840a0 = 1;
    public final k<String> X;
    public final y Y;
    public final k<Object> Z;

    public h0(j jVar, k<?> kVar, y yVar) {
        this(jVar, yVar, (k<?>) null, kVar, kVar, (Boolean) null);
    }

    public h0(j jVar, y yVar, k<?> kVar, k<?> kVar2, s sVar, Boolean bool) {
        super(jVar, sVar, bool);
        this.X = kVar2;
        this.Y = yVar;
        this.Z = kVar;
    }

    public k<Object> E0() {
        return this.X;
    }

    /* renamed from: H0 */
    public Collection<String> f(l lVar, g gVar) throws IOException {
        k<Object> kVar = this.Z;
        return kVar != null ? (Collection) this.Y.u(gVar, kVar.f(lVar, gVar)) : g(lVar, gVar, (Collection) this.Y.t(gVar));
    }

    /* renamed from: I0 */
    public Collection<String> g(l lVar, g gVar, Collection<String> collection) throws IOException {
        if (!lVar.u2()) {
            return K0(lVar, gVar, collection);
        }
        k<String> kVar = this.X;
        if (kVar != null) {
            return J0(lVar, gVar, collection, kVar);
        }
        while (true) {
            try {
                String C2 = lVar.C2();
                if (C2 == null) {
                    p Z0 = lVar.Z0();
                    if (Z0 == p.END_ARRAY) {
                        return collection;
                    }
                    if (Z0 != p.VALUE_NULL) {
                        C2 = g0(lVar, gVar);
                    } else if (!this.V) {
                        C2 = (String) this.U.d(gVar);
                    }
                }
                collection.add(C2);
            } catch (Exception e10) {
                throw i5.l.x(e10, collection, collection.size());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [i5.k, i5.k<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<java.lang.String> J0(w4.l r3, i5.g r4, java.util.Collection<java.lang.String> r5, i5.k<java.lang.String> r6) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            java.lang.String r0 = r3.C2()     // Catch:{ Exception -> 0x002f }
            if (r0 != 0) goto L_0x0026
            w4.p r0 = r3.Z0()     // Catch:{ Exception -> 0x002f }
            w4.p r1 = w4.p.END_ARRAY     // Catch:{ Exception -> 0x002f }
            if (r0 != r1) goto L_0x000f
            return r5
        L_0x000f:
            w4.p r1 = w4.p.VALUE_NULL     // Catch:{ Exception -> 0x002f }
            if (r0 != r1) goto L_0x0021
            boolean r0 = r2.V     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x0018
            goto L_0x0000
        L_0x0018:
            l5.s r0 = r2.U     // Catch:{ Exception -> 0x002f }
            java.lang.Object r0 = r0.d(r4)     // Catch:{ Exception -> 0x002f }
        L_0x001e:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x002f }
            goto L_0x002b
        L_0x0021:
            java.lang.Object r0 = r6.f(r3, r4)     // Catch:{ Exception -> 0x002f }
            goto L_0x001e
        L_0x0026:
            java.lang.Object r0 = r6.f(r3, r4)     // Catch:{ Exception -> 0x002f }
            goto L_0x001e
        L_0x002b:
            r5.add(r0)     // Catch:{ Exception -> 0x002f }
            goto L_0x0000
        L_0x002f:
            r3 = move-exception
            int r4 = r5.size()
            i5.l r3 = i5.l.x(r3, r5, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.h0.J0(w4.l, i5.g, java.util.Collection, i5.k):java.util.Collection");
    }

    public final Collection<String> K0(l lVar, g gVar, Collection<String> collection) throws IOException {
        String str;
        Boolean bool = this.W;
        if (!(bool == Boolean.TRUE || (bool == null && gVar.v0(h.ACCEPT_SINGLE_VALUE_AS_ARRAY)))) {
            return (Collection) gVar.i0(this.T.g(), lVar);
        }
        k<String> kVar = this.X;
        if (lVar.Z0() == p.VALUE_NULL) {
            if (this.V) {
                return collection;
            }
            str = (String) this.U.d(gVar);
        } else if (kVar == null) {
            try {
                str = g0(lVar, gVar);
            } catch (Exception e10) {
                throw i5.l.x(e10, collection, collection.size());
            }
        } else {
            str = kVar.f(lVar, gVar);
        }
        collection.add(str);
        return collection;
    }

    public h0 L0(k<?> kVar, k<?> kVar2, s sVar, Boolean bool) {
        return (this.W == bool && this.U == sVar && this.X == kVar2 && this.Z == kVar) ? this : new h0(this.T, this.Y, kVar, kVar2, sVar, bool);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.k<?> a(i5.g r6, i5.d r7) throws i5.l {
        /*
            r5 = this;
            l5.y r0 = r5.Y
            r1 = 0
            if (r0 == 0) goto L_0x002d
            q5.m r0 = r0.v()
            if (r0 == 0) goto L_0x001a
            l5.y r0 = r5.Y
            i5.f r2 = r6.q()
            i5.j r0 = r0.w(r2)
        L_0x0015:
            i5.k r0 = r5.s0(r6, r0, r7)
            goto L_0x002e
        L_0x001a:
            l5.y r0 = r5.Y
            q5.m r0 = r0.y()
            if (r0 == 0) goto L_0x002d
            l5.y r0 = r5.Y
            i5.f r2 = r6.q()
            i5.j r0 = r0.z(r2)
            goto L_0x0015
        L_0x002d:
            r0 = r1
        L_0x002e:
            i5.k<java.lang.String> r2 = r5.X
            i5.j r3 = r5.T
            i5.j r3 = r3.d()
            if (r2 != 0) goto L_0x0043
            i5.k r2 = r5.r0(r6, r7, r2)
            if (r2 != 0) goto L_0x0047
            i5.k r2 = r6.L(r3, r7)
            goto L_0x0047
        L_0x0043:
            i5.k r2 = r6.f0(r2, r7, r3)
        L_0x0047:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            v4.n$a r4 = v4.n.a.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r3 = r5.t0(r6, r7, r3, r4)
            l5.s r6 = r5.p0(r6, r7, r2)
            boolean r7 = r5.B0(r2)
            if (r7 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            n5.h0 r6 = r5.L0(r0, r1, r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.h0.a(i5.g, i5.d):i5.k");
    }

    public y e() {
        return this.Y;
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return fVar.d(lVar, gVar);
    }

    public boolean s() {
        return this.X == null && this.Z == null;
    }
}
