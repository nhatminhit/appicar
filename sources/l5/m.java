package l5;

import a6.h;
import i5.f;
import i5.g;
import i5.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m5.z;
import v4.l0;
import v4.n0;
import w4.l;

public abstract class m extends g implements Serializable {

    /* renamed from: e0  reason: collision with root package name */
    public static final long f10183e0 = 1;

    /* renamed from: c0  reason: collision with root package name */
    public transient LinkedHashMap<l0.a, z> f10184c0;

    /* renamed from: d0  reason: collision with root package name */
    public List<n0> f10185d0;

    public static final class a extends m {

        /* renamed from: f0  reason: collision with root package name */
        public static final long f10186f0 = 1;

        public a(a aVar) {
            super(aVar);
        }

        public a(a aVar, f fVar, l lVar, i iVar) {
            super(aVar, fVar, lVar, iVar);
        }

        public a(a aVar, p pVar) {
            super((m) aVar, pVar);
        }

        public a(p pVar) {
            super(pVar, (o) null);
        }

        public m l1() {
            h.u0(a.class, this, "copy");
            return new a(this);
        }

        public m m1(f fVar, l lVar, i iVar) {
            return new a(this, fVar, lVar, iVar);
        }

        public m p1(p pVar) {
            return new a(this, pVar);
        }
    }

    public m(m mVar) {
        super((g) mVar);
    }

    public m(m mVar, f fVar, l lVar, i iVar) {
        super(mVar, fVar, lVar, iVar);
    }

    public m(m mVar, p pVar) {
        super((g) mVar, pVar);
    }

    public m(p pVar, o oVar) {
        super(pVar, oVar);
    }

    public void F() throws w {
        if (this.f10184c0 != null && v0(i5.h.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            w wVar = null;
            for (Map.Entry<l0.a, z> value : this.f10184c0.entrySet()) {
                z zVar = (z) value.getValue();
                if (zVar.e() && !o1(zVar)) {
                    if (wVar == null) {
                        wVar = new w(Z(), "Unresolved forward references for: ");
                    }
                    Object obj = zVar.c().Q;
                    Iterator<z.a> f10 = zVar.f();
                    while (f10.hasNext()) {
                        z.a next = f10.next();
                        wVar.z(obj, next.a(), next.b());
                    }
                }
            }
            if (wVar != null) {
                throw wVar;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Class<i5.k$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: i5.k<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.k<java.lang.Object> I(q5.a r3, java.lang.Object r4) throws i5.l {
        /*
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof i5.k
            if (r1 == 0) goto L_0x000b
            i5.k r4 = (i5.k) r4
            goto L_0x0044
        L_0x000b:
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0070
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<i5.k$a> r1 = i5.k.a.class
            if (r4 == r1) goto L_0x006f
            boolean r1 = a6.h.R(r4)
            if (r1 == 0) goto L_0x001c
            goto L_0x006f
        L_0x001c:
            java.lang.Class<i5.k> r1 = i5.k.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x004f
            i5.f r1 = r2.R
            k5.g r1 = r1.G()
            if (r1 != 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            i5.f r0 = r2.R
            i5.k r0 = r1.b(r0, r3, r4)
        L_0x0033:
            if (r0 != 0) goto L_0x0043
            i5.f r3 = r2.R
            boolean r3 = r3.c()
            java.lang.Object r3 = a6.h.l(r4, r3)
            r4 = r3
            i5.k r4 = (i5.k) r4
            goto L_0x0044
        L_0x0043:
            r4 = r0
        L_0x0044:
            boolean r3 = r4 instanceof l5.t
            if (r3 == 0) goto L_0x004e
            r3 = r4
            l5.t r3 = (l5.t) r3
            r3.b(r2)
        L_0x004e:
            return r4
        L_0x004f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AnnotationIntrospector returned Class "
            r0.append(r1)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected Class<JsonDeserializer>"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x006f:
            return r0
        L_0x0070:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AnnotationIntrospector returned deserializer definition of type "
            r0.append(r1)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected type JsonDeserializer or Class<JsonDeserializer> instead"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.m.I(q5.a, java.lang.Object):i5.k");
    }

    public z P(Object obj, l0<?> l0Var, n0 n0Var) {
        n0 n0Var2 = null;
        if (obj == null) {
            return null;
        }
        l0.a f10 = l0Var.f(obj);
        LinkedHashMap<l0.a, z> linkedHashMap = this.f10184c0;
        if (linkedHashMap == null) {
            this.f10184c0 = new LinkedHashMap<>();
        } else {
            z zVar = linkedHashMap.get(f10);
            if (zVar != null) {
                return zVar;
            }
        }
        List<n0> list = this.f10185d0;
        if (list != null) {
            Iterator<n0> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n0 next = it.next();
                if (next.d(n0Var)) {
                    n0Var2 = next;
                    break;
                }
            }
        } else {
            this.f10185d0 = new ArrayList(8);
        }
        if (n0Var2 == null) {
            n0Var2 = n0Var.c(this);
            this.f10185d0.add(n0Var2);
        }
        z n12 = n1(f10);
        n12.h(n0Var2);
        this.f10184c0.put(f10, n12);
        return n12;
    }

    public m l1() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    public abstract m m1(f fVar, l lVar, i iVar);

    public z n1(l0.a aVar) {
        return new z(aVar);
    }

    public boolean o1(z zVar) {
        return zVar.i(this);
    }

    public abstract m p1(p pVar);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Class<i5.p$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: i5.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i5.p w0(q5.a r3, java.lang.Object r4) throws i5.l {
        /*
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof i5.p
            if (r1 == 0) goto L_0x000b
            i5.p r4 = (i5.p) r4
            goto L_0x0044
        L_0x000b:
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0070
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<i5.p$a> r1 = i5.p.a.class
            if (r4 == r1) goto L_0x006f
            boolean r1 = a6.h.R(r4)
            if (r1 == 0) goto L_0x001c
            goto L_0x006f
        L_0x001c:
            java.lang.Class<i5.p> r1 = i5.p.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x004f
            i5.f r1 = r2.R
            k5.g r1 = r1.G()
            if (r1 != 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            i5.f r0 = r2.R
            i5.p r0 = r1.d(r0, r3, r4)
        L_0x0033:
            if (r0 != 0) goto L_0x0043
            i5.f r3 = r2.R
            boolean r3 = r3.c()
            java.lang.Object r3 = a6.h.l(r4, r3)
            r4 = r3
            i5.p r4 = (i5.p) r4
            goto L_0x0044
        L_0x0043:
            r4 = r0
        L_0x0044:
            boolean r3 = r4 instanceof l5.t
            if (r3 == 0) goto L_0x004e
            r3 = r4
            l5.t r3 = (l5.t) r3
            r3.b(r2)
        L_0x004e:
            return r4
        L_0x004f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AnnotationIntrospector returned Class "
            r0.append(r1)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected Class<KeyDeserializer>"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x006f:
            return r0
        L_0x0070:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AnnotationIntrospector returned key deserializer definition of type "
            r0.append(r1)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.m.w0(q5.a, java.lang.Object):i5.p");
    }
}
