package com.fasterxml.jackson.databind.ser;

import a6.h;
import i5.c0;
import i5.d;
import i5.d0;
import i5.e0;
import i5.j;
import i5.l;
import i5.m;
import i5.o;
import i5.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import q5.s;
import s5.g;
import t5.c;
import v4.l0;
import w4.i;
import x5.u;

public abstract class k extends e0 implements Serializable {

    /* renamed from: h0  reason: collision with root package name */
    public static final long f5050h0 = 1;

    /* renamed from: e0  reason: collision with root package name */
    public transient Map<Object, u> f5051e0;

    /* renamed from: f0  reason: collision with root package name */
    public transient ArrayList<l0<?>> f5052f0;

    /* renamed from: g0  reason: collision with root package name */
    public transient i f5053g0;

    public static final class a extends k {

        /* renamed from: i0  reason: collision with root package name */
        public static final long f5054i0 = 1;

        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        public a(e0 e0Var, c0 c0Var, r rVar) {
            super(e0Var, c0Var, rVar);
        }

        public k S0() {
            return a.class != a.class ? k.super.S0() : new a(this);
        }

        /* renamed from: b1 */
        public a T0(c0 c0Var, r rVar) {
            return new a(this, c0Var, rVar);
        }
    }

    public k() {
    }

    public k(k kVar) {
        super(kVar);
    }

    public k(e0 e0Var, c0 c0Var, r rVar) {
        super(e0Var, c0Var, rVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Class<i5.o$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: i5.o<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<java.lang.Object> G0(q5.a r5, java.lang.Object r6) throws i5.l {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof i5.o
            if (r1 == 0) goto L_0x000c
            i5.o r6 = (i5.o) r6
            goto L_0x008b
        L_0x000c:
            boolean r1 = r6 instanceof java.lang.Class
            if (r1 != 0) goto L_0x0035
            i5.j r1 = r5.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AnnotationIntrospector returned serializer definition of type "
            r2.append(r3)
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = "; expected type JsonSerializer or Class<JsonSerializer> instead"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.z(r1, r2)
        L_0x0035:
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Class<i5.o$a> r1 = i5.o.a.class
            if (r6 == r1) goto L_0x0090
            boolean r1 = a6.h.R(r6)
            if (r1 == 0) goto L_0x0042
            goto L_0x0090
        L_0x0042:
            java.lang.Class<i5.o> r1 = i5.o.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 != 0) goto L_0x006b
            i5.j r1 = r5.h()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AnnotationIntrospector returned Class "
            r2.append(r3)
            java.lang.String r3 = r6.getName()
            r2.append(r3)
            java.lang.String r3 = "; expected Class<JsonSerializer>"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.z(r1, r2)
        L_0x006b:
            i5.c0 r1 = r4.P
            k5.g r1 = r1.G()
            if (r1 != 0) goto L_0x0074
            goto L_0x007a
        L_0x0074:
            i5.c0 r0 = r4.P
            i5.o r0 = r1.h(r0, r5, r6)
        L_0x007a:
            if (r0 != 0) goto L_0x008a
            i5.c0 r5 = r4.P
            boolean r5 = r5.c()
            java.lang.Object r5 = a6.h.l(r6, r5)
            r6 = r5
            i5.o r6 = (i5.o) r6
            goto L_0x008b
        L_0x008a:
            r6 = r0
        L_0x008b:
            i5.o r5 = r4.K(r6)
            return r5
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.k.G0(q5.a, java.lang.Object):i5.o");
    }

    public Map<Object, u> L0() {
        return w0(d0.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
    }

    public final void M0(i iVar, Object obj, o<Object> oVar) throws IOException {
        try {
            oVar.m(obj, iVar, this);
        } catch (Exception e10) {
            throw P0(iVar, e10);
        }
    }

    public final void N0(i iVar, Object obj, o<Object> oVar, y yVar) throws IOException {
        try {
            iVar.V2();
            iVar.j2(yVar.k(this.P));
            oVar.m(obj, iVar, this);
            iVar.g2();
        } catch (Exception e10) {
            throw P0(iVar, e10);
        }
    }

    public void O0(i iVar) throws IOException {
        try {
            l0().m(null, iVar, this);
        } catch (Exception e10) {
            throw P0(iVar, e10);
        }
    }

    public final IOException P0(i iVar, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String o10 = h.o(exc);
        if (o10 == null) {
            o10 = "[no message for " + exc.getClass().getName() + "]";
        }
        return new l((Closeable) iVar, o10, (Throwable) exc);
    }

    public void Q0(j jVar, g gVar) throws l {
        if (jVar != null) {
            gVar.a(this);
            g0(jVar, (d) null).e(gVar, jVar);
            return;
        }
        throw new IllegalArgumentException("A class must be provided");
    }

    public int R0() {
        return this.S.i();
    }

    public k S0() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    public abstract k T0(c0 c0Var, r rVar);

    public void U0() {
        this.S.g();
    }

    @Deprecated
    public t5.a V0(Class<?> cls) throws l {
        o<Object> i02 = i0(cls, (d) null);
        m a10 = i02 instanceof c ? ((c) i02).a(this, (Type) null) : t5.a.a();
        if (a10 instanceof com.fasterxml.jackson.databind.node.u) {
            return new t5.a((com.fasterxml.jackson.databind.node.u) a10);
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " would not be serialized as a JSON object and therefore has no schema");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r5 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean W0(java.lang.Class<?> r4, java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r5) {
        /*
            r3 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1 = 1
            if (r4 != r0) goto L_0x0010
            i5.c0 r0 = r3.P
            i5.d0 r2 = i5.d0.FAIL_ON_EMPTY_BEANS
            boolean r0 = r0.P0(r2)
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            r0 = 0
            i5.o r4 = r3.I(r4)     // Catch:{ l -> 0x0022, RuntimeException -> 0x001a }
            if (r4 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            return r1
        L_0x001a:
            r4 = move-exception
            if (r5 == 0) goto L_0x0021
        L_0x001d:
            r5.set(r4)
            goto L_0x0026
        L_0x0021:
            throw r4
        L_0x0022:
            r4 = move-exception
            if (r5 == 0) goto L_0x0026
            goto L_0x001d
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.k.W0(java.lang.Class, java.util.concurrent.atomic.AtomicReference):boolean");
    }

    public void X0(i iVar, Object obj, j jVar, o<Object> oVar, u5.i iVar2) throws IOException {
        boolean z10;
        this.f5053g0 = iVar;
        if (obj == null) {
            O0(iVar);
            return;
        }
        if (jVar != null && !jVar.g().isAssignableFrom(obj.getClass())) {
            L(obj, jVar);
        }
        if (oVar == null) {
            oVar = (jVar == null || !jVar.o()) ? i0(obj.getClass(), (d) null) : g0(jVar, (d) null);
        }
        y d02 = this.P.d0();
        if (d02 == null) {
            z10 = this.P.P0(d0.WRAP_ROOT_VALUE);
            if (z10) {
                iVar.V2();
                iVar.j2(this.P.k(obj.getClass()).k(this.P));
            }
        } else if (d02.i()) {
            z10 = false;
        } else {
            iVar.V2();
            iVar.i2(d02.d());
            z10 = true;
        }
        try {
            oVar.n(obj, iVar, this, iVar2);
            if (z10) {
                iVar.g2();
            }
        } catch (Exception e10) {
            throw P0(iVar, e10);
        }
    }

    public void Y0(i iVar, Object obj) throws IOException {
        this.f5053g0 = iVar;
        if (obj == null) {
            O0(iVar);
            return;
        }
        Class<?> cls = obj.getClass();
        o<Object> e02 = e0(cls, true, (d) null);
        y d02 = this.P.d0();
        if (d02 == null) {
            if (this.P.P0(d0.WRAP_ROOT_VALUE)) {
                N0(iVar, obj, e02, this.P.k(cls));
                return;
            }
        } else if (!d02.i()) {
            N0(iVar, obj, e02, d02);
            return;
        }
        M0(iVar, obj, e02);
    }

    public u Z(Object obj, l0<?> l0Var) {
        Map<Object, u> map = this.f5051e0;
        if (map == null) {
            this.f5051e0 = L0();
        } else {
            u uVar = map.get(obj);
            if (uVar != null) {
                return uVar;
            }
        }
        l0<?> l0Var2 = null;
        ArrayList<l0<?>> arrayList = this.f5052f0;
        if (arrayList != null) {
            int i10 = 0;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                }
                l0<?> l0Var3 = this.f5052f0.get(i10);
                if (l0Var3.a(l0Var)) {
                    l0Var2 = l0Var3;
                    break;
                }
                i10++;
            }
        } else {
            this.f5052f0 = new ArrayList<>(8);
        }
        if (l0Var2 == null) {
            l0Var2 = l0Var.h(this);
            this.f5052f0.add(l0Var2);
        }
        u uVar2 = new u(l0Var2);
        this.f5051e0.put(obj, uVar2);
        return uVar2;
    }

    public void Z0(i iVar, Object obj, j jVar) throws IOException {
        this.f5053g0 = iVar;
        if (obj == null) {
            O0(iVar);
            return;
        }
        if (!jVar.g().isAssignableFrom(obj.getClass())) {
            L(obj, jVar);
        }
        o<Object> d02 = d0(jVar, true, (d) null);
        y d03 = this.P.d0();
        if (d03 == null) {
            if (this.P.P0(d0.WRAP_ROOT_VALUE)) {
                N0(iVar, obj, d02, this.P.j(jVar));
                return;
            }
        } else if (!d03.i()) {
            N0(iVar, obj, d02, d03);
            return;
        }
        M0(iVar, obj, d02);
    }

    public void a1(i iVar, Object obj, j jVar, o<Object> oVar) throws IOException {
        this.f5053g0 = iVar;
        if (obj == null) {
            O0(iVar);
            return;
        }
        if (jVar != null && !jVar.g().isAssignableFrom(obj.getClass())) {
            L(obj, jVar);
        }
        if (oVar == null) {
            oVar = d0(jVar, true, (d) null);
        }
        y d02 = this.P.d0();
        if (d02 == null) {
            if (this.P.P0(d0.WRAP_ROOT_VALUE)) {
                N0(iVar, obj, oVar, jVar == null ? this.P.k(obj.getClass()) : this.P.j(jVar));
                return;
            }
        } else if (!d02.i()) {
            N0(iVar, obj, oVar, d02);
            return;
        }
        M0(iVar, obj, oVar);
    }

    public i o0() {
        return this.f5053g0;
    }

    public Object u0(s sVar, Class<?> cls) {
        Object obj = null;
        if (cls == null) {
            return null;
        }
        k5.g G = this.P.G();
        if (G != null) {
            obj = G.c(this.P, sVar, cls);
        }
        return obj == null ? h.l(cls, this.P.c()) : obj;
    }

    public boolean v0(Object obj) throws l {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals((Object) null);
        } catch (Throwable th2) {
            B0(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", new Object[]{obj.getClass().getName(), th2.getClass().getName(), h.o(th2)}), th2);
            return false;
        }
    }
}
