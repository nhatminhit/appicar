package n5;

import i5.g;
import i5.h;
import i5.j;
import i5.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l5.i;
import l5.s;
import l5.w;
import l5.y;
import m5.z;
import w4.l;
import w4.p;

@j5.a
public class f extends g<Collection<Object>> implements i {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f10826b0 = -1;
    public final k<Object> X;
    public final u5.f Y;
    public final y Z;

    /* renamed from: a0  reason: collision with root package name */
    public final k<Object> f10827a0;

    public static final class a extends z.a {

        /* renamed from: c  reason: collision with root package name */
        public final b f10828c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Object> f10829d = new ArrayList();

        public a(b bVar, w wVar, Class<?> cls) {
            super(wVar, cls);
            this.f10828c = bVar;
        }

        public void c(Object obj, Object obj2) throws IOException {
            this.f10828c.c(obj, obj2);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f10830a;

        /* renamed from: b  reason: collision with root package name */
        public final Collection<Object> f10831b;

        /* renamed from: c  reason: collision with root package name */
        public List<a> f10832c = new ArrayList();

        public b(Class<?> cls, Collection<Object> collection) {
            this.f10830a = cls;
            this.f10831b = collection;
        }

        public void a(Object obj) {
            if (this.f10832c.isEmpty()) {
                this.f10831b.add(obj);
                return;
            }
            List<a> list = this.f10832c;
            list.get(list.size() - 1).f10829d.add(obj);
        }

        public z.a b(w wVar) {
            a aVar = new a(this, wVar, this.f10830a);
            this.f10832c.add(aVar);
            return aVar;
        }

        public void c(Object obj, Object obj2) throws IOException {
            Iterator<a> it = this.f10832c.iterator();
            Collection collection = this.f10831b;
            while (it.hasNext()) {
                a next = it.next();
                if (next.d(obj)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.f10829d);
                    return;
                }
                collection = next.f10829d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public f(j jVar, k<Object> kVar, u5.f fVar, y yVar) {
        this(jVar, kVar, fVar, yVar, (k<Object>) null, (s) null, (Boolean) null);
    }

    public f(j jVar, k<Object> kVar, u5.f fVar, y yVar, k<Object> kVar2, s sVar, Boolean bool) {
        super(jVar, sVar, bool);
        this.X = kVar;
        this.Y = fVar;
        this.Z = yVar;
        this.f10827a0 = kVar2;
    }

    public f(f fVar) {
        super((g<?>) fVar);
        this.X = fVar.X;
        this.Y = fVar.Y;
        this.Z = fVar.Z;
        this.f10827a0 = fVar.f10827a0;
    }

    public k<Object> E0() {
        return this.X;
    }

    public Collection<Object> H0(l lVar, g gVar, Collection<Object> collection) throws IOException {
        Object obj;
        if (!lVar.u2()) {
            return M0(lVar, gVar, collection);
        }
        lVar.T2(collection);
        k<Object> kVar = this.X;
        u5.f fVar = this.Y;
        b bVar = new b(this.T.d().g(), collection);
        while (true) {
            p D2 = lVar.D2();
            if (D2 == p.END_ARRAY) {
                return collection;
            }
            try {
                if (D2 != p.VALUE_NULL) {
                    obj = fVar == null ? kVar.f(lVar, gVar) : kVar.h(lVar, gVar, fVar);
                } else if (!this.V) {
                    obj = this.U.d(gVar);
                }
                bVar.a(obj);
            } catch (w e10) {
                e10.A().a(bVar.b(e10));
            } catch (Exception e11) {
                if (!(gVar == null || gVar.v0(h.WRAP_EXCEPTIONS))) {
                    a6.h.q0(e11);
                }
                throw i5.l.x(e11, collection, collection.size());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n5.f a(i5.g r8, i5.d r9) throws i5.l {
        /*
            r7 = this;
            l5.y r0 = r7.Z
            if (r0 == 0) goto L_0x0066
            boolean r0 = r0.j()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L_0x0039
            l5.y r0 = r7.Z
            i5.f r4 = r8.q()
            i5.j r0 = r0.z(r4)
            if (r0 != 0) goto L_0x0034
            i5.j r4 = r7.T
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            l5.y r2 = r7.Z
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r3[r1] = r2
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
        L_0x0031:
            r8.z(r4, r1)
        L_0x0034:
            i5.k r0 = r7.s0(r8, r0, r9)
            goto L_0x0067
        L_0x0039:
            l5.y r0 = r7.Z
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0066
            l5.y r0 = r7.Z
            i5.f r4 = r8.q()
            i5.j r0 = r0.w(r4)
            if (r0 != 0) goto L_0x0034
            i5.j r4 = r7.T
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            l5.y r2 = r7.Z
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r3[r1] = r2
            java.lang.String r1 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            goto L_0x0031
        L_0x0066:
            r0 = 0
        L_0x0067:
            r2 = r0
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            v4.n$a r1 = v4.n.a.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r6 = r7.t0(r8, r9, r0, r1)
            i5.k<java.lang.Object> r0 = r7.X
            i5.k r0 = r7.r0(r8, r9, r0)
            i5.j r1 = r7.T
            i5.j r1 = r1.d()
            if (r0 != 0) goto L_0x0083
            i5.k r0 = r8.L(r1, r9)
            goto L_0x0087
        L_0x0083:
            i5.k r0 = r8.f0(r0, r9, r1)
        L_0x0087:
            r3 = r0
            u5.f r0 = r7.Y
            if (r0 == 0) goto L_0x0090
            u5.f r0 = r0.g(r9)
        L_0x0090:
            r4 = r0
            l5.s r5 = r7.p0(r8, r9, r3)
            java.lang.Boolean r8 = r7.W
            if (r6 != r8) goto L_0x00ab
            l5.s r8 = r7.U
            if (r5 != r8) goto L_0x00ab
            i5.k<java.lang.Object> r8 = r7.f10827a0
            if (r2 != r8) goto L_0x00ab
            i5.k<java.lang.Object> r8 = r7.X
            if (r3 != r8) goto L_0x00ab
            u5.f r8 = r7.Y
            if (r4 == r8) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            return r7
        L_0x00ab:
            r1 = r7
            n5.f r8 = r1.N0(r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.f.a(i5.g, i5.d):n5.f");
    }

    public Collection<Object> J0(g gVar) throws IOException {
        return (Collection) this.Z.t(gVar);
    }

    /* renamed from: K0 */
    public Collection<Object> f(l lVar, g gVar) throws IOException {
        k<Object> kVar = this.f10827a0;
        if (kVar != null) {
            return (Collection) this.Z.u(gVar, kVar.f(lVar, gVar));
        }
        if (lVar.q2(p.VALUE_STRING)) {
            String Y1 = lVar.Y1();
            if (Y1.length() == 0) {
                return (Collection) this.Z.r(gVar, Y1);
            }
        }
        return g(lVar, gVar, J0(gVar));
    }

    /* renamed from: L0 */
    public Collection<Object> g(l lVar, g gVar, Collection<Object> collection) throws IOException {
        Object obj;
        if (!lVar.u2()) {
            return M0(lVar, gVar, collection);
        }
        lVar.T2(collection);
        k<Object> kVar = this.X;
        if (kVar.q() != null) {
            return H0(lVar, gVar, collection);
        }
        u5.f fVar = this.Y;
        while (true) {
            p D2 = lVar.D2();
            if (D2 == p.END_ARRAY) {
                return collection;
            }
            try {
                if (D2 != p.VALUE_NULL) {
                    obj = fVar == null ? kVar.f(lVar, gVar) : kVar.h(lVar, gVar, fVar);
                } else if (!this.V) {
                    obj = this.U.d(gVar);
                }
                collection.add(obj);
            } catch (Exception e10) {
                if (!(gVar == null || gVar.v0(h.WRAP_EXCEPTIONS))) {
                    a6.h.q0(e10);
                }
                throw i5.l.x(e10, collection, collection.size());
            }
        }
    }

    public final Collection<Object> M0(l lVar, g gVar, Collection<Object> collection) throws IOException {
        Object obj;
        Boolean bool = this.W;
        boolean z10 = false;
        if (!(bool == Boolean.TRUE || (bool == null && gVar.v0(h.ACCEPT_SINGLE_VALUE_AS_ARRAY)))) {
            return (Collection) gVar.g0(this.T, lVar);
        }
        k<Object> kVar = this.X;
        u5.f fVar = this.Y;
        try {
            if (!lVar.q2(p.VALUE_NULL)) {
                obj = fVar == null ? kVar.f(lVar, gVar) : kVar.h(lVar, gVar, fVar);
            } else if (this.V) {
                return collection;
            } else {
                obj = this.U.d(gVar);
            }
            collection.add(obj);
            return collection;
        } catch (Exception e10) {
            if (gVar == null || gVar.v0(h.WRAP_EXCEPTIONS)) {
                z10 = true;
            }
            if (!z10) {
                a6.h.q0(e10);
            }
            throw i5.l.x(e10, Object.class, collection.size());
        }
    }

    public f N0(k<?> kVar, k<?> kVar2, u5.f fVar, s sVar, Boolean bool) {
        return new f(this.T, kVar2, fVar, this.Z, kVar, sVar, bool);
    }

    public y e() {
        return this.Z;
    }

    public Object h(l lVar, g gVar, u5.f fVar) throws IOException {
        return fVar.d(lVar, gVar);
    }

    public boolean s() {
        return this.X == null && this.Y == null && this.f10827a0 == null;
    }
}
