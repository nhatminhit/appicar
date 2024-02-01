package q5;

import a6.h;
import a6.j;
import a6.q;
import i5.b;
import i5.j;
import i5.k;
import i5.l;
import i5.o;
import i5.p;
import i5.y;
import j5.b;
import j5.c;
import j5.e;
import j5.f;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p5.g;
import v4.a0;
import v4.b0;
import v4.c0;
import v4.d;
import v4.d0;
import v4.e0;
import v4.f0;
import v4.g0;
import v4.h0;
import v4.i;
import v4.i0;
import v4.j0;
import v4.k;
import v4.m;
import v4.m0;
import v4.n;
import v4.r;
import v4.s;
import v4.t;
import v4.u;
import v4.v;
import v4.x;
import v4.z;

public class w extends b implements Serializable {
    public static final long Q = 1;
    public static final Class<? extends Annotation>[] R = {f.class, j0.class, n.class, f0.class, a0.class, h0.class, i.class, v.class};
    public static final Class<? extends Annotation>[] S = {c.class, j0.class, n.class, f0.class, h0.class, i.class, v.class, v4.w.class};
    public static final g T;
    public transient q<Class<?>, Boolean> O = new q<>(48, 48);
    public boolean P = true;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11992a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                j5.f$a[] r0 = j5.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11992a = r0
                j5.f$a r1 = j5.f.a.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x001d }
                j5.f$a r1 = j5.f.a.NON_NULL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j5.f$a r1 = j5.f.a.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x0033 }
                j5.f$a r1 = j5.f.a.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x003e }
                j5.f$a r1 = j5.f.a.DEFAULT_INCLUSION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.w.a.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Class<? extends java.lang.annotation.Annotation>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<? extends java.lang.annotation.Annotation>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 8
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<j5.f> r2 = j5.f.class
            r3 = 0
            r1[r3] = r2
            java.lang.Class<v4.j0> r2 = v4.j0.class
            r4 = 1
            r1[r4] = r2
            java.lang.Class<v4.n> r2 = v4.n.class
            r5 = 2
            r1[r5] = r2
            java.lang.Class<v4.f0> r2 = v4.f0.class
            r6 = 3
            r1[r6] = r2
            java.lang.Class<v4.a0> r2 = v4.a0.class
            r7 = 4
            r1[r7] = r2
            java.lang.Class<v4.h0> r2 = v4.h0.class
            r8 = 5
            r1[r8] = r2
            java.lang.Class<v4.i> r2 = v4.i.class
            r9 = 6
            r1[r9] = r2
            java.lang.Class<v4.v> r2 = v4.v.class
            r10 = 7
            r1[r10] = r2
            R = r1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<j5.c> r1 = j5.c.class
            r0[r3] = r1
            java.lang.Class<v4.j0> r1 = v4.j0.class
            r0[r4] = r1
            java.lang.Class<v4.n> r1 = v4.n.class
            r0[r5] = r1
            java.lang.Class<v4.f0> r1 = v4.f0.class
            r0[r6] = r1
            java.lang.Class<v4.h0> r1 = v4.h0.class
            r0[r7] = r1
            java.lang.Class<v4.i> r1 = v4.i.class
            r0[r8] = r1
            java.lang.Class<v4.v> r1 = v4.v.class
            r0[r9] = r1
            java.lang.Class<v4.w> r1 = v4.w.class
            r0[r10] = r1
            S = r0
            p5.g r0 = p5.g.d()     // Catch:{ all -> 0x0057 }
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.w.<clinit>():void");
    }

    public d.a A(h hVar) {
        Class<?> E;
        d dVar = (d) a(hVar, d.class);
        if (dVar == null) {
            return null;
        }
        d.a f10 = d.a.f(dVar);
        if (f10.i()) {
            return f10;
        }
        if (hVar instanceof i) {
            i iVar = (i) hVar;
            if (iVar.C() != 0) {
                E = iVar.E(0);
                return f10.k(E.getName());
            }
        }
        E = hVar.g();
        return f10.k(E.getName());
    }

    @Deprecated
    public boolean A0(a aVar) {
        g gVar;
        Boolean c10;
        k kVar = (k) a(aVar, k.class);
        if (kVar != null) {
            return kVar.mode() != k.a.DISABLED;
        }
        if (!this.P || !(aVar instanceof d) || (gVar = T) == null || (c10 = gVar.c(aVar)) == null) {
            return false;
        }
        return c10.booleanValue();
    }

    @Deprecated
    public Object B(h hVar) {
        d.a A = A(hVar);
        if (A == null) {
            return null;
        }
        return A.g();
    }

    public boolean B0(h hVar) {
        return U0(hVar);
    }

    public Object C(a aVar) {
        Class<? extends p> keyUsing;
        c cVar = (c) a(aVar, c.class);
        if (cVar == null || (keyUsing = cVar.keyUsing()) == p.a.class) {
            return null;
        }
        return keyUsing;
    }

    public Boolean C0(h hVar) {
        x xVar = (x) a(hVar, x.class);
        if (xVar != null) {
            return Boolean.valueOf(xVar.required());
        }
        return null;
    }

    public Object D(a aVar) {
        Class<? extends o> keyUsing;
        f fVar = (f) a(aVar, f.class);
        if (fVar == null || (keyUsing = fVar.keyUsing()) == o.a.class) {
            return null;
        }
        return keyUsing;
    }

    public boolean D0(Annotation annotation) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Boolean b10 = this.O.b(annotationType);
        if (b10 == null) {
            b10 = Boolean.valueOf(annotationType.getAnnotation(v4.c.class) != null);
            this.O.d(annotationType, b10);
        }
        return b10.booleanValue();
    }

    public Boolean E(a aVar) {
        v4.w wVar = (v4.w) a(aVar, v4.w.class);
        if (wVar == null) {
            return null;
        }
        return wVar.value().a();
    }

    public Boolean E0(b bVar) {
        t tVar = (t) a(bVar, t.class);
        if (tVar == null) {
            return null;
        }
        return Boolean.valueOf(tVar.value());
    }

    public y F(a aVar) {
        boolean z10;
        c0 c0Var = (c0) a(aVar, c0.class);
        if (c0Var != null) {
            String value = c0Var.value();
            if (!value.isEmpty()) {
                return y.a(value);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        x xVar = (x) a(aVar, x.class);
        if (xVar != null) {
            return y.a(xVar.value());
        }
        if (z10 || c(aVar, S)) {
            return y.U;
        }
        return null;
    }

    public Boolean F0(h hVar) {
        return Boolean.valueOf(b(hVar, e0.class));
    }

    public y G(a aVar) {
        boolean z10;
        v4.o oVar = (v4.o) a(aVar, v4.o.class);
        if (oVar != null) {
            String value = oVar.value();
            if (!value.isEmpty()) {
                return y.a(value);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        x xVar = (x) a(aVar, x.class);
        if (xVar != null) {
            return y.a(xVar.value());
        }
        if (z10 || c(aVar, R)) {
            return y.U;
        }
        return null;
    }

    public Object H(b bVar) {
        j5.d dVar = (j5.d) a(bVar, j5.d.class);
        if (dVar == null) {
            return null;
        }
        return dVar.value();
    }

    public Object I(a aVar) {
        Class<? extends o> nullsUsing;
        f fVar = (f) a(aVar, f.class);
        if (fVar == null || (nullsUsing = fVar.nullsUsing()) == o.a.class) {
            return null;
        }
        return nullsUsing;
    }

    public j I0(k5.i<?> iVar, a aVar, j jVar) throws l {
        z5.n M = iVar.M();
        c cVar = (c) a(aVar, c.class);
        Class<?> L0 = cVar == null ? null : L0(cVar.as());
        if (L0 != null && !jVar.j(L0) && !V0(jVar, L0)) {
            try {
                jVar = M.V(jVar, L0);
            } catch (IllegalArgumentException e10) {
                throw new l((Closeable) null, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", new Object[]{jVar, L0.getName(), aVar.f(), e10.getMessage()}), (Throwable) e10);
            }
        }
        if (jVar.t()) {
            j O2 = jVar.e();
            Class<?> L02 = cVar == null ? null : L0(cVar.keyAs());
            if (L02 != null && !V0(O2, L02)) {
                try {
                    jVar = ((z5.f) jVar).r0(M.V(O2, L02));
                } catch (IllegalArgumentException e11) {
                    throw new l((Closeable) null, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{jVar, L02.getName(), aVar.f(), e11.getMessage()}), (Throwable) e11);
                }
            }
        }
        j G = jVar.d();
        if (G == null) {
            return jVar;
        }
        Class<?> L03 = cVar == null ? null : L0(cVar.contentAs());
        if (L03 == null || V0(G, L03)) {
            return jVar;
        }
        try {
            return jVar.c0(M.V(G, L03));
        } catch (IllegalArgumentException e12) {
            throw new l((Closeable) null, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{jVar, L03.getName(), aVar.f(), e12.getMessage()}), (Throwable) e12);
        }
    }

    public z J(a aVar) {
        v4.p pVar = (v4.p) a(aVar, v4.p.class);
        if (pVar == null || pVar.generator() == m0.c.class) {
            return null;
        }
        return new z(y.a(pVar.property()), pVar.scope(), pVar.generator(), pVar.resolver());
    }

    public j J0(k5.i<?> iVar, a aVar, j jVar) throws l {
        j jVar2;
        j jVar3;
        z5.n M = iVar.M();
        f fVar = (f) a(aVar, f.class);
        Class<?> L0 = fVar == null ? null : L0(fVar.as());
        if (L0 != null) {
            if (jVar.j(L0)) {
                jVar = jVar.g0();
            } else {
                Class<?> g10 = jVar.g();
                try {
                    if (L0.isAssignableFrom(g10)) {
                        jVar = M.F(jVar, L0);
                    } else if (g10.isAssignableFrom(L0)) {
                        jVar = M.V(jVar, L0);
                    } else if (W0(g10, L0)) {
                        jVar = jVar.g0();
                    } else {
                        throw new l((Closeable) null, String.format("Cannot refine serialization type %s into %s; types not related", new Object[]{jVar, L0.getName()}));
                    }
                } catch (IllegalArgumentException e10) {
                    throw new l((Closeable) null, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", new Object[]{jVar, L0.getName(), aVar.f(), e10.getMessage()}), (Throwable) e10);
                }
            }
        }
        if (jVar.t()) {
            j O2 = jVar.e();
            Class<?> L02 = fVar == null ? null : L0(fVar.keyAs());
            if (L02 != null) {
                if (O2.j(L02)) {
                    jVar3 = O2.g0();
                } else {
                    Class<?> g11 = O2.g();
                    try {
                        if (L02.isAssignableFrom(g11)) {
                            jVar3 = M.F(O2, L02);
                        } else if (g11.isAssignableFrom(L02)) {
                            jVar3 = M.V(O2, L02);
                        } else if (W0(g11, L02)) {
                            jVar3 = O2.g0();
                        } else {
                            throw new l((Closeable) null, String.format("Cannot refine serialization key type %s into %s; types not related", new Object[]{O2, L02.getName()}));
                        }
                    } catch (IllegalArgumentException e11) {
                        throw new l((Closeable) null, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{jVar, L02.getName(), aVar.f(), e11.getMessage()}), (Throwable) e11);
                    }
                }
                jVar = ((z5.f) jVar).r0(jVar3);
            }
        }
        j G = jVar.d();
        if (G == null) {
            return jVar;
        }
        Class<?> L03 = fVar == null ? null : L0(fVar.contentAs());
        if (L03 == null) {
            return jVar;
        }
        if (G.j(L03)) {
            jVar2 = G.g0();
        } else {
            Class<?> g12 = G.g();
            try {
                if (L03.isAssignableFrom(g12)) {
                    jVar2 = M.F(G, L03);
                } else if (g12.isAssignableFrom(L03)) {
                    jVar2 = M.V(G, L03);
                } else if (W0(g12, L03)) {
                    jVar2 = G.g0();
                } else {
                    throw new l((Closeable) null, String.format("Cannot refine serialization content type %s into %s; types not related", new Object[]{G, L03.getName()}));
                }
            } catch (IllegalArgumentException e12) {
                throw new l((Closeable) null, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[]{jVar, L03.getName(), aVar.f(), e12.getMessage()}), (Throwable) e12);
            }
        }
        return jVar.c0(jVar2);
    }

    public z K(a aVar, z zVar) {
        v4.q qVar = (v4.q) a(aVar, v4.q.class);
        if (qVar == null) {
            return zVar;
        }
        if (zVar == null) {
            zVar = z.a();
        }
        return zVar.g(qVar.alwaysAsId());
    }

    public i K0(k5.i<?> iVar, i iVar2, i iVar3) {
        Class<String> cls = String.class;
        Class<?> E = iVar2.E(0);
        Class<?> E2 = iVar3.E(0);
        if (E.isPrimitive()) {
            if (!E2.isPrimitive()) {
                return iVar2;
            }
        } else if (E2.isPrimitive()) {
            return iVar3;
        }
        if (E == cls) {
            if (E2 != cls) {
                return iVar2;
            }
            return null;
        } else if (E2 == cls) {
            return iVar3;
        } else {
            return null;
        }
    }

    public Class<?> L(b bVar) {
        c cVar = (c) a(bVar, c.class);
        if (cVar == null) {
            return null;
        }
        return L0(cVar.builder());
    }

    public Class<?> L0(Class<?> cls) {
        if (cls == null || h.R(cls)) {
            return null;
        }
        return cls;
    }

    public e.a M(b bVar) {
        e eVar = (e) a(bVar, e.class);
        if (eVar == null) {
            return null;
        }
        return new e.a(eVar);
    }

    public Class<?> M0(Class<?> cls, Class<?> cls2) {
        Class<?> L0 = L0(cls);
        if (L0 == null || L0 == cls2) {
            return null;
        }
        return L0;
    }

    public v5.n N0() {
        return v5.n.q();
    }

    public v5.n O0() {
        return new v5.n();
    }

    public x.a P(a aVar) {
        x xVar = (x) a(aVar, x.class);
        if (xVar != null) {
            return xVar.access();
        }
        return null;
    }

    public com.fasterxml.jackson.databind.ser.d P0(b.a aVar, k5.i<?> iVar, b bVar, j jVar) {
        i5.x xVar = aVar.required() ? i5.x.W : i5.x.X;
        String value = aVar.value();
        y X0 = X0(aVar.propName(), aVar.propNamespace());
        if (!X0.f()) {
            X0 = y.a(value);
        }
        return x5.a.a0(value, a6.y.W(iVar, new e0(bVar, bVar.g(), value, jVar), X0, xVar, aVar.include()), bVar.v(), jVar);
    }

    public List<y> Q(a aVar) {
        v4.e eVar = (v4.e) a(aVar, v4.e.class);
        if (eVar == null) {
            return null;
        }
        if (r0 == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (String a10 : eVar.value()) {
            arrayList.add(y.a(a10));
        }
        return arrayList;
    }

    public com.fasterxml.jackson.databind.ser.d Q0(b.C0161b bVar, k5.i<?> iVar, b bVar2) {
        i5.x xVar = bVar.required() ? i5.x.W : i5.x.X;
        y X0 = X0(bVar.name(), bVar.namespace());
        j h10 = iVar.h(bVar.type());
        a6.y W = a6.y.W(iVar, new e0(bVar2, bVar2.g(), X0.d(), h10), X0, xVar, bVar.include());
        Class<? extends com.fasterxml.jackson.databind.ser.t> value = bVar.value();
        k5.g G = iVar.G();
        com.fasterxml.jackson.databind.ser.t l10 = G == null ? null : G.l(iVar, value);
        if (l10 == null) {
            l10 = (com.fasterxml.jackson.databind.ser.t) h.l(value, iVar.c());
        }
        return l10.Z(iVar, bVar2, W, h10);
    }

    public u5.h<?> R(k5.i<?> iVar, h hVar, j jVar) {
        if (jVar.d() != null) {
            return T0(iVar, hVar, jVar);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + jVar + ")");
    }

    public y R0(a aVar) {
        g gVar;
        y a10;
        if (!(aVar instanceof l)) {
            return null;
        }
        l lVar = (l) aVar;
        if (lVar.v() == null || (gVar = T) == null || (a10 = gVar.a(lVar)) == null) {
            return null;
        }
        return a10;
    }

    public String S(a aVar) {
        x xVar = (x) a(aVar, x.class);
        if (xVar == null) {
            return null;
        }
        String defaultValue = xVar.defaultValue();
        if (defaultValue.isEmpty()) {
            return null;
        }
        return defaultValue;
    }

    public final Boolean S0(a aVar) {
        z zVar = (z) a(aVar, z.class);
        if (zVar == null || !zVar.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    public String T(a aVar) {
        v4.y yVar = (v4.y) a(aVar, v4.y.class);
        if (yVar == null) {
            return null;
        }
        return yVar.value();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [k5.i<?>, k5.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u5.h<?> T0(k5.i<?> r5, q5.a r6, i5.j r7) {
        /*
            r4 = this;
            java.lang.Class<v4.f0> r0 = v4.f0.class
            java.lang.annotation.Annotation r0 = r4.a(r6, r0)
            v4.f0 r0 = (v4.f0) r0
            java.lang.Class<j5.h> r1 = j5.h.class
            java.lang.annotation.Annotation r1 = r4.a(r6, r1)
            j5.h r1 = (j5.h) r1
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r0 != 0) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.Class r1 = r1.value()
            u5.h r1 = r5.W(r6, r1)
            goto L_0x0033
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            return r2
        L_0x0022:
            v4.f0$b r1 = r0.use()
            v4.f0$b r3 = v4.f0.b.NONE
            if (r1 != r3) goto L_0x002f
            v5.n r5 = r4.N0()
            return r5
        L_0x002f:
            v5.n r1 = r4.O0()
        L_0x0033:
            java.lang.Class<j5.g> r3 = j5.g.class
            java.lang.annotation.Annotation r3 = r4.a(r6, r3)
            j5.g r3 = (j5.g) r3
            if (r3 != 0) goto L_0x003e
            goto L_0x0046
        L_0x003e:
            java.lang.Class r2 = r3.value()
            u5.g r2 = r5.V(r6, r2)
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.e(r7)
        L_0x004b:
            v4.f0$b r5 = r0.use()
            u5.h r5 = r1.e(r5, r2)
            v4.f0$a r7 = r0.include()
            v4.f0$a r1 = v4.f0.a.EXTERNAL_PROPERTY
            if (r7 != r1) goto L_0x0061
            boolean r6 = r6 instanceof q5.b
            if (r6 == 0) goto L_0x0061
            v4.f0$a r7 = v4.f0.a.PROPERTY
        L_0x0061:
            u5.h r5 = r5.f(r7)
            java.lang.String r6 = r0.property()
            u5.h r5 = r5.b(r6)
            java.lang.Class r6 = r0.defaultImpl()
            java.lang.Class<v4.f0$c> r7 = v4.f0.c.class
            if (r6 == r7) goto L_0x007f
            boolean r7 = r6.isAnnotation()
            if (r7 != 0) goto L_0x007f
            u5.h r5 = r5.d(r6)
        L_0x007f:
            boolean r6 = r0.visible()
            u5.h r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.w.T0(k5.i, q5.a, i5.j):u5.h");
    }

    public s.a U(a aVar) {
        s sVar = (s) a(aVar, s.class);
        return sVar == null ? s.a.g() : s.a.m(sVar);
    }

    public boolean U0(a aVar) {
        Boolean b10;
        r rVar = (r) a(aVar, r.class);
        if (rVar != null) {
            return rVar.value();
        }
        g gVar = T;
        if (gVar == null || (b10 = gVar.b(aVar)) == null) {
            return false;
        }
        return b10.booleanValue();
    }

    public u.b V(a aVar) {
        u uVar = (u) a(aVar, u.class);
        u.b d10 = uVar == null ? u.b.d() : u.b.e(uVar);
        return d10.i() == u.a.USE_DEFAULTS ? Y0(aVar, d10) : d10;
    }

    public final boolean V0(j jVar, Class<?> cls) {
        return jVar.u() ? jVar.j(h.i0(cls)) : cls.isPrimitive() && cls == h.i0(jVar.g());
    }

    public Integer W(a aVar) {
        int index;
        x xVar = (x) a(aVar, x.class);
        if (xVar == null || (index = xVar.index()) == -1) {
            return null;
        }
        return Integer.valueOf(index);
    }

    public final boolean W0(Class<?> cls, Class<?> cls2) {
        if (cls.isPrimitive()) {
            return cls == h.i0(cls2);
        }
        if (cls2.isPrimitive()) {
            return cls2 == h.i0(cls);
        }
        return false;
    }

    public u5.h<?> X(k5.i<?> iVar, h hVar, j jVar) {
        if (jVar.o() || jVar.v()) {
            return null;
        }
        return T0(iVar, hVar, jVar);
    }

    public y X0(String str, String str2) {
        return str.isEmpty() ? y.U : (str2 == null || str2.isEmpty()) ? y.a(str) : y.b(str, str2);
    }

    public b.a Y(h hVar) {
        v vVar = (v) a(hVar, v.class);
        if (vVar != null) {
            return b.a.f(vVar.value());
        }
        i iVar = (i) a(hVar, i.class);
        if (iVar != null) {
            return b.a.a(iVar.value());
        }
        return null;
    }

    public final u.b Y0(a aVar, u.b bVar) {
        u.a aVar2;
        f fVar = (f) a(aVar, f.class);
        if (fVar != null) {
            int i10 = a.f11992a[fVar.include().ordinal()];
            if (i10 == 1) {
                aVar2 = u.a.ALWAYS;
            } else if (i10 == 2) {
                aVar2 = u.a.NON_NULL;
            } else if (i10 == 3) {
                aVar2 = u.a.NON_DEFAULT;
            } else if (i10 == 4) {
                aVar2 = u.a.NON_EMPTY;
            }
            return bVar.q(aVar2);
        }
        return bVar;
    }

    public y Z(k5.i<?> iVar, f fVar, y yVar) {
        return null;
    }

    public Object Z0() {
        if (this.O == null) {
            this.O = new q<>(48, 48);
        }
        return this;
    }

    public y a0(b bVar) {
        b0 b0Var = (b0) a(bVar, b0.class);
        String str = null;
        if (b0Var == null) {
            return null;
        }
        String namespace = b0Var.namespace();
        if (namespace == null || namespace.length() != 0) {
            str = namespace;
        }
        return y.b(b0Var.value(), str);
    }

    public w a1(boolean z10) {
        this.P = z10;
        return this;
    }

    public Object b0(h hVar) {
        f fVar = (f) a(hVar, f.class);
        if (fVar == null) {
            return null;
        }
        return M0(fVar.contentConverter(), j.a.class);
    }

    @Deprecated
    public Class<?> c0(a aVar, i5.j jVar) {
        return null;
    }

    public Object d0(a aVar) {
        f fVar = (f) a(aVar, f.class);
        if (fVar == null) {
            return null;
        }
        return M0(fVar.converter(), j.a.class);
    }

    public void f(k5.i<?> iVar, b bVar, List<com.fasterxml.jackson.databind.ser.d> list) {
        j5.b bVar2 = (j5.b) a(bVar, j5.b.class);
        if (bVar2 != null) {
            boolean prepend = bVar2.prepend();
            i5.j jVar = null;
            b.a[] attrs = bVar2.attrs();
            int length = attrs.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (jVar == null) {
                    jVar = iVar.h(Object.class);
                }
                com.fasterxml.jackson.databind.ser.d P0 = P0(attrs[i10], iVar, bVar, jVar);
                if (prepend) {
                    list.add(i10, P0);
                } else {
                    list.add(P0);
                }
            }
            b.C0161b[] props = bVar2.props();
            int length2 = props.length;
            for (int i11 = 0; i11 < length2; i11++) {
                com.fasterxml.jackson.databind.ser.d Q0 = Q0(props[i11], iVar, bVar);
                if (prepend) {
                    list.add(i11, Q0);
                } else {
                    list.add(Q0);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [q5.f0<?>, q5.f0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q5.f0<?> g(q5.b r2, q5.f0<?> r3) {
        /*
            r1 = this;
            java.lang.Class<v4.h> r0 = v4.h.class
            java.lang.annotation.Annotation r2 = r1.a(r2, r0)
            v4.h r2 = (v4.h) r2
            if (r2 != 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            q5.f0 r3 = r3.l(r2)
        L_0x000f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.w.g(q5.b, q5.f0):q5.f0");
    }

    @Deprecated
    public Class<?> g0(a aVar, i5.j jVar) {
        return null;
    }

    public String h(b bVar) {
        v4.j jVar = (v4.j) a(bVar, v4.j.class);
        if (jVar == null) {
            return null;
        }
        return jVar.value();
    }

    public String[] h0(b bVar) {
        z zVar = (z) a(bVar, z.class);
        if (zVar == null) {
            return null;
        }
        return zVar.value();
    }

    public Object i(a aVar) {
        Class<? extends i5.k> contentUsing;
        c cVar = (c) a(aVar, c.class);
        if (cVar == null || (contentUsing = cVar.contentUsing()) == k.a.class) {
            return null;
        }
        return contentUsing;
    }

    public Boolean i0(a aVar) {
        return S0(aVar);
    }

    public Object j(a aVar) {
        Class<? extends o> contentUsing;
        f fVar = (f) a(aVar, f.class);
        if (fVar == null || (contentUsing = fVar.contentUsing()) == o.a.class) {
            return null;
        }
        return contentUsing;
    }

    @Deprecated
    public Class<?> j0(a aVar) {
        return null;
    }

    public k.a k(k5.i<?> iVar, a aVar) {
        g gVar;
        Boolean c10;
        v4.k kVar = (v4.k) a(aVar, v4.k.class);
        if (kVar != null) {
            return kVar.mode();
        }
        if (!this.P || !iVar.T(i5.q.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) || !(aVar instanceof d) || (gVar = T) == null || (c10 = gVar.c(aVar)) == null || !c10.booleanValue()) {
            return null;
        }
        return k.a.PROPERTIES;
    }

    public f.b k0(a aVar) {
        f fVar = (f) a(aVar, f.class);
        if (fVar == null) {
            return null;
        }
        return fVar.typing();
    }

    @Deprecated
    public k.a l(a aVar) {
        v4.k kVar = (v4.k) a(aVar, v4.k.class);
        if (kVar == null) {
            return null;
        }
        return kVar.mode();
    }

    public Object l0(a aVar) {
        Class<? extends o> using;
        f fVar = (f) a(aVar, f.class);
        if (fVar != null && (using = fVar.using()) != o.a.class) {
            return using;
        }
        a0 a0Var = (a0) a(aVar, a0.class);
        if (a0Var == null || !a0Var.value()) {
            return null;
        }
        return new y5.a0(aVar.g());
    }

    public Enum<?> m(Class<Enum<?>> cls) {
        return h.v(cls, v4.l.class);
    }

    public c0.a m0(a aVar) {
        return c0.a.h((c0) a(aVar, c0.class));
    }

    public Object n(h hVar) {
        c cVar = (c) a(hVar, c.class);
        if (cVar == null) {
            return null;
        }
        return M0(cVar.contentConverter(), j.a.class);
    }

    public List<u5.c> n0(a aVar) {
        d0 d0Var = (d0) a(aVar, d0.class);
        if (d0Var == null) {
            return null;
        }
        d0.a[] value = d0Var.value();
        ArrayList arrayList = new ArrayList(value.length);
        for (d0.a aVar2 : value) {
            arrayList.add(new u5.c(aVar2.value(), aVar2.name()));
        }
        return arrayList;
    }

    @Deprecated
    public Class<?> o(a aVar, i5.j jVar) {
        return null;
    }

    public String o0(b bVar) {
        g0 g0Var = (g0) a(bVar, g0.class);
        if (g0Var == null) {
            return null;
        }
        return g0Var.value();
    }

    public Object p(a aVar) {
        c cVar = (c) a(aVar, c.class);
        if (cVar == null) {
            return null;
        }
        return M0(cVar.converter(), j.a.class);
    }

    public u5.h<?> p0(k5.i<?> iVar, b bVar, i5.j jVar) {
        return T0(iVar, bVar, jVar);
    }

    @Deprecated
    public Class<?> q(a aVar, i5.j jVar) {
        return null;
    }

    public a6.s q0(h hVar) {
        h0 h0Var = (h0) a(hVar, h0.class);
        if (h0Var == null || !h0Var.enabled()) {
            return null;
        }
        return a6.s.c(h0Var.prefix(), h0Var.suffix());
    }

    @Deprecated
    public Class<?> r(a aVar, i5.j jVar) {
        return null;
    }

    public Object r0(b bVar) {
        j5.i iVar = (j5.i) a(bVar, j5.i.class);
        if (iVar == null) {
            return null;
        }
        return iVar.value();
    }

    public Object s(a aVar) {
        Class<? extends i5.k> using;
        c cVar = (c) a(aVar, c.class);
        if (cVar == null || (using = cVar.using()) == k.a.class) {
            return null;
        }
        return using;
    }

    public Class<?>[] s0(a aVar) {
        j0 j0Var = (j0) a(aVar, j0.class);
        if (j0Var == null) {
            return null;
        }
        return j0Var.value();
    }

    public void t(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        v4.e eVar;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (eVar = (v4.e) field.getAnnotation(v4.e.class)) != null) {
                String[] value = eVar.value();
                if (value.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (name.equals(enumArr[i10].name())) {
                            strArr[i10] = value;
                        }
                    }
                }
            }
        }
    }

    @Deprecated
    public String u(Enum<?> enumR) {
        x xVar;
        String value;
        try {
            Field field = enumR.getClass().getField(enumR.name());
            if (!(field == null || (xVar = (x) field.getAnnotation(x.class)) == null || (value = xVar.value()) == null || value.isEmpty())) {
                return value;
            }
        } catch (NoSuchFieldException | SecurityException unused) {
        }
        return enumR.name();
    }

    public Boolean u0(a aVar) {
        v4.f fVar = (v4.f) a(aVar, v4.f.class);
        if (fVar == null) {
            return null;
        }
        return Boolean.valueOf(fVar.enabled());
    }

    public String[] v(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        x xVar;
        HashMap hashMap = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (xVar = (x) field.getAnnotation(x.class)) != null) {
                String value = xVar.value();
                if (!value.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(field.getName(), value);
                }
            }
        }
        if (hashMap != null) {
            int length = enumArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = (String) hashMap.get(enumArr[i10].name());
                if (str != null) {
                    strArr[i10] = str;
                }
            }
        }
        return strArr;
    }

    @Deprecated
    public boolean v0(i iVar) {
        return b(iVar, v4.f.class);
    }

    public w4.b0 version() {
        return k5.l.O;
    }

    public Object w(a aVar) {
        m mVar = (m) a(aVar, m.class);
        if (mVar == null) {
            return null;
        }
        String value = mVar.value();
        if (value.length() > 0) {
            return value;
        }
        return null;
    }

    public Boolean w0(a aVar) {
        v4.g gVar = (v4.g) a(aVar, v4.g.class);
        if (gVar == null) {
            return null;
        }
        return Boolean.valueOf(gVar.enabled());
    }

    public n.d x(a aVar) {
        n nVar = (n) a(aVar, n.class);
        if (nVar == null) {
            return null;
        }
        return n.d.g(nVar);
    }

    @Deprecated
    public boolean x0(i iVar) {
        return b(iVar, v4.g.class);
    }

    public Boolean y0(a aVar) {
        i0 i0Var = (i0) a(aVar, i0.class);
        if (i0Var == null) {
            return null;
        }
        return Boolean.valueOf(i0Var.value());
    }

    public String z(h hVar) {
        y R0 = R0(hVar);
        if (R0 == null) {
            return null;
        }
        return R0.d();
    }

    @Deprecated
    public boolean z0(i iVar) {
        i0 i0Var = (i0) a(iVar, i0.class);
        return i0Var != null && i0Var.value();
    }
}
