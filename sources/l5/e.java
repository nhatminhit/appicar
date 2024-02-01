package l5;

import i5.b;
import i5.c;
import i5.f;
import i5.g;
import i5.j;
import i5.k;
import i5.q;
import i5.x;
import i5.y;
import j5.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m5.d0;
import m5.s;
import m5.u;
import q5.h;
import q5.i;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f10149a;

    /* renamed from: b  reason: collision with root package name */
    public final g f10150b;

    /* renamed from: c  reason: collision with root package name */
    public final c f10151c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, v> f10152d;

    /* renamed from: e  reason: collision with root package name */
    public List<d0> f10153e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap<String, v> f10154f;

    /* renamed from: g  reason: collision with root package name */
    public HashSet<String> f10155g;

    /* renamed from: h  reason: collision with root package name */
    public y f10156h;

    /* renamed from: i  reason: collision with root package name */
    public s f10157i;

    /* renamed from: j  reason: collision with root package name */
    public u f10158j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10159k;

    /* renamed from: l  reason: collision with root package name */
    public i f10160l;

    /* renamed from: m  reason: collision with root package name */
    public e.a f10161m;

    public e(c cVar, g gVar) {
        this.f10152d = new LinkedHashMap();
        this.f10151c = cVar;
        this.f10150b = gVar;
        this.f10149a = gVar.q();
    }

    public e(e eVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10152d = linkedHashMap;
        this.f10151c = eVar.f10151c;
        this.f10150b = eVar.f10150b;
        this.f10149a = eVar.f10149a;
        linkedHashMap.putAll(eVar.f10152d);
        this.f10153e = c(eVar.f10153e);
        this.f10154f = b(eVar.f10154f);
        this.f10155g = eVar.f10155g;
        this.f10156h = eVar.f10156h;
        this.f10157i = eVar.f10157i;
        this.f10158j = eVar.f10158j;
        this.f10159k = eVar.f10159k;
        this.f10160l = eVar.f10160l;
        this.f10161m = eVar.f10161m;
    }

    public static HashMap<String, v> b(HashMap<String, v> hashMap) {
        if (hashMap == null) {
            return null;
        }
        return new HashMap<>(hashMap);
    }

    public static <T> List<T> c(List<T> list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public void A(boolean z10) {
        this.f10159k = z10;
    }

    public void B(s sVar) {
        this.f10157i = sVar;
    }

    public void C(i iVar, e.a aVar) {
        this.f10160l = iVar;
        this.f10161m = aVar;
    }

    public void D(y yVar) {
        this.f10156h = yVar;
    }

    public Map<String, List<y>> a(Collection<v> collection) {
        b m10 = this.f10149a.m();
        HashMap hashMap = null;
        if (m10 != null) {
            for (v next : collection) {
                List<y> Q = m10.Q(next.i());
                if (Q != null && !Q.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(next.getName(), Q);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }

    public void d(Collection<v> collection) {
        if (this.f10149a.c()) {
            for (v w10 : collection) {
                w10.w(this.f10149a);
            }
        }
        u uVar = this.f10158j;
        if (uVar != null) {
            uVar.d(this.f10149a);
        }
        i iVar = this.f10160l;
        if (iVar != null) {
            iVar.l(this.f10149a.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
    }

    public void e(String str, v vVar) {
        if (this.f10154f == null) {
            this.f10154f = new HashMap<>(4);
        }
        if (this.f10149a.c()) {
            vVar.w(this.f10149a);
        }
        this.f10154f.put(str, vVar);
    }

    public void f(v vVar) {
        j(vVar);
    }

    public void g(String str) {
        if (this.f10155g == null) {
            this.f10155g = new HashSet<>();
        }
        this.f10155g.add(str);
    }

    public void h(y yVar, j jVar, a6.b bVar, h hVar, Object obj) {
        if (this.f10153e == null) {
            this.f10153e = new ArrayList();
        }
        if (this.f10149a.c()) {
            hVar.l(this.f10149a.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        this.f10153e.add(new d0(yVar, jVar, hVar, obj));
    }

    public void i(v vVar, boolean z10) {
        this.f10152d.put(vVar.getName(), vVar);
    }

    public void j(v vVar) {
        v put = this.f10152d.put(vVar.getName(), vVar);
        if (put != null && put != vVar) {
            throw new IllegalArgumentException("Duplicate property '" + vVar.getName() + "' for " + this.f10151c.E());
        }
    }

    public k<?> k() {
        boolean z10;
        Collection<v> values = this.f10152d.values();
        d(values);
        m5.c q10 = m5.c.q(this.f10149a, values, a(values));
        q10.n();
        boolean z11 = !this.f10149a.T(q.DEFAULT_VIEW_INCLUSION);
        if (!z11) {
            Iterator<v> it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().I()) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = z11;
        if (this.f10157i != null) {
            q10 = q10.F(new u(this.f10157i, x.W));
        }
        return new c(this, this.f10151c, q10, this.f10154f, this.f10155g, this.f10159k, z10);
    }

    public a l() {
        return new a(this, this.f10151c, this.f10154f, this.f10152d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.k<?> m(i5.j r8, java.lang.String r9) throws i5.l {
        /*
            r7 = this;
            q5.i r0 = r7.f10160l
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L_0x002f
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x006f
            i5.g r0 = r7.f10150b
            i5.c r4 = r7.f10151c
            i5.j r4 = r4.E()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            i5.c r5 = r7.f10151c
            java.lang.Class r5 = r5.x()
            java.lang.String r5 = r5.getName()
            r2[r1] = r5
            r2[r3] = r9
            java.lang.String r9 = "Builder class %s does not have build method (name: '%s')"
            java.lang.String r9 = java.lang.String.format(r9, r2)
        L_0x002b:
            r0.z(r4, r9)
            goto L_0x006f
        L_0x002f:
            java.lang.Class r9 = r0.M()
            java.lang.Class r0 = r8.g()
            if (r9 == r0) goto L_0x006f
            boolean r4 = r9.isAssignableFrom(r0)
            if (r4 != 0) goto L_0x006f
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 != 0) goto L_0x006f
            i5.g r0 = r7.f10150b
            i5.c r4 = r7.f10151c
            i5.j r4 = r4.E()
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            q5.i r6 = r7.f10160l
            java.lang.String r6 = r6.o()
            r5[r1] = r6
            java.lang.String r9 = r9.getName()
            r5[r3] = r9
            java.lang.Class r9 = r8.g()
            java.lang.String r9 = r9.getName()
            r5[r2] = r9
            java.lang.String r9 = "Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)"
            java.lang.String r9 = java.lang.String.format(r9, r5)
            goto L_0x002b
        L_0x006f:
            java.util.Map<java.lang.String, l5.v> r9 = r7.f10152d
            java.util.Collection r9 = r9.values()
            r7.d(r9)
            i5.f r0 = r7.f10149a
            java.util.Map r1 = r7.a(r9)
            m5.c r0 = m5.c.q(r0, r9, r1)
            r0.n()
            i5.f r1 = r7.f10149a
            i5.q r2 = i5.q.DEFAULT_VIEW_INCLUSION
            boolean r1 = r1.T(r2)
            r1 = r1 ^ r3
            if (r1 != 0) goto L_0x00a7
            java.util.Iterator r9 = r9.iterator()
        L_0x0094:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r9.next()
            l5.v r2 = (l5.v) r2
            boolean r2 = r2.I()
            if (r2 == 0) goto L_0x0094
            goto L_0x00a8
        L_0x00a7:
            r3 = r1
        L_0x00a8:
            m5.s r9 = r7.f10157i
            if (r9 == 0) goto L_0x00b9
            m5.u r9 = new m5.u
            m5.s r1 = r7.f10157i
            i5.x r2 = i5.x.W
            r9.<init>((m5.s) r1, (i5.x) r2)
            m5.c r0 = r0.F(r9)
        L_0x00b9:
            i5.k r8 = r7.n(r8, r0, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.e.m(i5.j, java.lang.String):i5.k");
    }

    public k<?> n(j jVar, m5.c cVar, boolean z10) {
        return new h(this, this.f10151c, jVar, cVar, this.f10154f, this.f10155g, this.f10159k, z10);
    }

    public v o(y yVar) {
        return this.f10152d.get(yVar.d());
    }

    public u p() {
        return this.f10158j;
    }

    public i q() {
        return this.f10160l;
    }

    public e.a r() {
        return this.f10161m;
    }

    public List<d0> s() {
        return this.f10153e;
    }

    public s t() {
        return this.f10157i;
    }

    public Iterator<v> u() {
        return this.f10152d.values().iterator();
    }

    public y v() {
        return this.f10156h;
    }

    public boolean w(String str) {
        HashSet<String> hashSet = this.f10155g;
        return hashSet != null && hashSet.contains(str);
    }

    public boolean x(y yVar) {
        return o(yVar) != null;
    }

    public v y(y yVar) {
        return this.f10152d.remove(yVar.d());
    }

    public void z(u uVar) {
        if (this.f10158j == null || uVar == null) {
            this.f10158j = uVar;
            return;
        }
        throw new IllegalStateException("_anySetter already set to non-null");
    }
}
