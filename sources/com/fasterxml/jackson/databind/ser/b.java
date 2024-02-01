package com.fasterxml.jackson.databind.ser;

import a6.b0;
import i5.c;
import i5.c0;
import i5.d;
import i5.d0;
import i5.e0;
import i5.j;
import i5.l;
import i5.o;
import i5.q;
import j5.f;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import k5.m;
import v4.n;
import v4.u;
import y5.e;
import y5.g;
import y5.h;
import y5.h0;
import y5.i0;
import y5.k;
import y5.n0;
import y5.o0;
import y5.p;
import y5.p0;
import y5.r;
import y5.r0;
import y5.s;
import y5.u;
import y5.x;
import y5.y;
import z5.i;
import z5.n;

public abstract class b extends r implements Serializable {
    public static final HashMap<String, o<?>> P;
    public static final HashMap<String, Class<? extends o<?>>> Q;
    public final m O;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5027a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f5028b;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        static {
            /*
                v4.u$a[] r0 = v4.u.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5028b = r0
                r1 = 1
                v4.u$a r2 = v4.u.a.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5028b     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.u$a r3 = v4.u.a.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5028b     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.u$a r4 = v4.u.a.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f5028b     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.u$a r4 = v4.u.a.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f5028b     // Catch:{ NoSuchFieldError -> 0x003e }
                v4.u$a r4 = v4.u.a.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f5028b     // Catch:{ NoSuchFieldError -> 0x0049 }
                v4.u$a r4 = v4.u.a.USE_DEFAULTS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                v4.n$c[] r3 = v4.n.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f5027a = r3
                v4.n$c r4 = v4.n.c.STRING     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f5027a     // Catch:{ NoSuchFieldError -> 0x0064 }
                v4.n$c r3 = v4.n.c.OBJECT     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = f5027a     // Catch:{ NoSuchFieldError -> 0x006e }
                v4.n$c r1 = v4.n.c.ARRAY     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.b.a.<clinit>():void");
        }
    }

    static {
        HashMap<String, Class<? extends o<?>>> hashMap = new HashMap<>();
        HashMap<String, o<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new n0());
        p0 p0Var = p0.R;
        hashMap2.put(StringBuffer.class.getName(), p0Var);
        hashMap2.put(StringBuilder.class.getName(), p0Var);
        hashMap2.put(Character.class.getName(), p0Var);
        hashMap2.put(Character.TYPE.getName(), p0Var);
        y.a(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new e(true));
        hashMap2.put(Boolean.class.getName(), new e(false));
        hashMap2.put(BigInteger.class.getName(), new x(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new x(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), h.U);
        hashMap2.put(Date.class.getName(), k.U);
        for (Map.Entry next : i0.a()) {
            Object value = next.getValue();
            if (value instanceof o) {
                hashMap2.put(((Class) next.getKey()).getName(), (o) value);
            } else {
                hashMap.put(((Class) next.getKey()).getName(), (Class) value);
            }
        }
        hashMap.put(b0.class.getName(), r0.class);
        P = hashMap2;
        Q = hashMap;
    }

    public b(m mVar) {
        this.O = mVar == null ? new m() : mVar;
    }

    public Object A(c0 c0Var, c cVar) {
        return c0Var.m().w(cVar.z());
    }

    public o<?> B(e0 e0Var, j jVar, c cVar, boolean z10) throws l {
        return p5.k.Y.b(e0Var.q(), jVar, cVar);
    }

    public o<?> C(e0 e0Var, i iVar, c cVar, boolean z10) throws l {
        j G = iVar.d();
        u5.i iVar2 = (u5.i) G.R();
        c0 j02 = e0Var.q();
        if (iVar2 == null) {
            iVar2 = d(j02, G);
        }
        u5.i iVar3 = iVar2;
        o oVar = (o) G.S();
        for (s c10 : x()) {
            o<?> c11 = c10.c(j02, iVar, cVar, iVar3, oVar);
            if (c11 != null) {
                return c11;
            }
        }
        if (iVar.Y(AtomicReference.class)) {
            return m(e0Var, iVar, cVar, z10, iVar3, oVar);
        }
        return null;
    }

    public final o<?> D(c0 c0Var, j jVar, c cVar, boolean z10) throws l {
        Class<?> g10 = jVar.g();
        if (Iterator.class.isAssignableFrom(g10)) {
            j[] e02 = c0Var.M().e0(jVar, Iterator.class);
            return u(c0Var, jVar, cVar, z10, (e02 == null || e02.length != 1) ? n.l0() : e02[0]);
        } else if (Iterable.class.isAssignableFrom(g10)) {
            j[] e03 = c0Var.M().e0(jVar, Iterable.class);
            return t(c0Var, jVar, cVar, z10, (e03 == null || e03.length != 1) ? n.l0() : e03[0]);
        } else if (CharSequence.class.isAssignableFrom(g10)) {
            return p0.R;
        } else {
            return null;
        }
    }

    public final o<?> E(e0 e0Var, j jVar, c cVar) throws l {
        if (i5.n.class.isAssignableFrom(jVar.g())) {
            return y5.c0.R;
        }
        q5.h o10 = cVar.o();
        if (o10 == null) {
            return null;
        }
        if (e0Var.j()) {
            a6.h.g(o10.p(), e0Var.w(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new s(o10, H(e0Var, o10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = Q.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i5.o<?> F(i5.j r1, i5.c0 r2, i5.c r3, boolean r4) {
        /*
            r0 = this;
            java.lang.Class r1 = r1.g()
            java.lang.String r1 = r1.getName()
            java.util.HashMap<java.lang.String, i5.o<?>> r2 = P
            java.lang.Object r2 = r2.get(r1)
            i5.o r2 = (i5.o) r2
            if (r2 != 0) goto L_0x0024
            java.util.HashMap<java.lang.String, java.lang.Class<? extends i5.o<?>>> r3 = Q
            java.lang.Object r1 = r3.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L_0x0024
            r2 = 0
            java.lang.Object r1 = a6.h.l(r1, r2)
            i5.o r1 = (i5.o) r1
            return r1
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.b.F(i5.j, i5.c0, i5.c, boolean):i5.o");
    }

    public final o<?> G(e0 e0Var, j jVar, c cVar, boolean z10) throws l {
        if (jVar.p()) {
            return q(e0Var.q(), jVar, cVar);
        }
        Class<?> g10 = jVar.g();
        o<?> B = B(e0Var, jVar, cVar, z10);
        if (B != null) {
            return B;
        }
        if (Calendar.class.isAssignableFrom(g10)) {
            return h.U;
        }
        if (Date.class.isAssignableFrom(g10)) {
            return k.U;
        }
        if (Map.Entry.class.isAssignableFrom(g10)) {
            j C = jVar.C(Map.Entry.class);
            return v(e0Var, jVar, cVar, z10, C.B(0), C.B(1));
        } else if (ByteBuffer.class.isAssignableFrom(g10)) {
            return new g();
        } else {
            if (InetAddress.class.isAssignableFrom(g10)) {
                return new p();
            }
            if (InetSocketAddress.class.isAssignableFrom(g10)) {
                return new y5.q();
            }
            if (TimeZone.class.isAssignableFrom(g10)) {
                return new o0();
            }
            if (Charset.class.isAssignableFrom(g10)) {
                return p0.R;
            }
            if (!Number.class.isAssignableFrom(g10)) {
                return null;
            }
            n.d l10 = cVar.l((n.d) null);
            if (l10 != null) {
                int i10 = a.f5027a[l10.m().ordinal()];
                if (i10 == 1) {
                    return p0.R;
                }
                if (i10 == 2 || i10 == 3) {
                    return null;
                }
            }
            return x.S;
        }
    }

    public o<Object> H(e0 e0Var, q5.a aVar) throws l {
        Object l02 = e0Var.o().l0(aVar);
        if (l02 == null) {
            return null;
        }
        return z(e0Var, aVar, e0Var.G0(aVar, l02));
    }

    public m I() {
        return this.O;
    }

    public boolean J(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public boolean K(c0 c0Var, c cVar, u5.i iVar) {
        if (iVar != null) {
            return false;
        }
        f.b k02 = c0Var.m().k0(cVar.z());
        return (k02 == null || k02 == f.b.DEFAULT_TYPING) ? c0Var.T(q.USE_STATIC_TYPING) : k02 == f.b.STATIC;
    }

    public abstract r L(m mVar);

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0017 A[LOOP:0: B:3:0x0017->B:6:0x0027, LOOP_START, PHI: r2 
      PHI: (r2v10 i5.o<?>) = (r2v0 i5.o<?>), (r2v13 i5.o<?>) binds: [B:2:0x000d, B:6:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<java.lang.Object> a(i5.c0 r5, i5.j r6, i5.o<java.lang.Object> r7) {
        /*
            r4 = this;
            i5.c r0 = r5.O0(r6)
            k5.m r1 = r4.O
            boolean r1 = r1.a()
            r2 = 0
            if (r1 == 0) goto L_0x0029
            k5.m r1 = r4.O
            java.lang.Iterable r1 = r1.d()
            java.util.Iterator r1 = r1.iterator()
        L_0x0017:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0029
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.s r2 = (com.fasterxml.jackson.databind.ser.s) r2
            i5.o r2 = r2.a(r5, r6, r0)
            if (r2 == 0) goto L_0x0017
        L_0x0029:
            if (r2 != 0) goto L_0x0069
            if (r7 != 0) goto L_0x006a
            java.lang.Class r7 = r6.g()
            r1 = 0
            i5.o r7 = y5.k0.c(r5, r7, r1)
            if (r7 != 0) goto L_0x006a
            q5.h r7 = r0.o()
            if (r7 == 0) goto L_0x0060
            java.lang.Class r1 = r7.g()
            r2 = 1
            i5.o r1 = y5.k0.c(r5, r1, r2)
            boolean r2 = r5.c()
            if (r2 == 0) goto L_0x005a
            java.lang.reflect.Member r2 = r7.p()
            i5.q r3 = i5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r3 = r5.T(r3)
            a6.h.g(r2, r3)
        L_0x005a:
            y5.s r2 = new y5.s
            r2.<init>(r7, r1)
            goto L_0x0069
        L_0x0060:
            java.lang.Class r7 = r6.g()
            i5.o r7 = y5.k0.b(r5, r7)
            goto L_0x006a
        L_0x0069:
            r7 = r2
        L_0x006a:
            k5.m r1 = r4.O
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x008d
            k5.m r1 = r4.O
            java.lang.Iterable r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
        L_0x007c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.h r2 = (com.fasterxml.jackson.databind.ser.h) r2
            i5.o r7 = r2.f(r5, r6, r0, r7)
            goto L_0x007c
        L_0x008d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.b.a(i5.c0, i5.j, i5.o):i5.o");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x001b A[LOOP:0: B:3:0x001b->B:6:0x002b, LOOP_START, PHI: r3 
      PHI: (r3v4 i5.o<?>) = (r3v0 i5.o<?>), (r3v7 i5.o<?>) binds: [B:2:0x0011, B:6:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<java.lang.Object> b(i5.e0 r6, i5.j r7, i5.o<java.lang.Object> r8) throws i5.l {
        /*
            r5 = this;
            i5.c0 r0 = r6.q()
            i5.c r1 = r0.O0(r7)
            k5.m r2 = r5.O
            boolean r2 = r2.a()
            r3 = 0
            if (r2 == 0) goto L_0x002d
            k5.m r2 = r5.O
            java.lang.Iterable r2 = r2.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x001b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x002d
            java.lang.Object r3 = r2.next()
            com.fasterxml.jackson.databind.ser.s r3 = (com.fasterxml.jackson.databind.ser.s) r3
            i5.o r3 = r3.a(r0, r7, r1)
            if (r3 == 0) goto L_0x001b
        L_0x002d:
            if (r3 != 0) goto L_0x007a
            q5.b r2 = r1.z()
            i5.o r6 = r5.k(r6, r2)
            if (r6 != 0) goto L_0x0078
            if (r8 != 0) goto L_0x007b
            java.lang.Class r6 = r7.g()
            r8 = 0
            i5.o r8 = y5.k0.c(r0, r6, r8)
            if (r8 != 0) goto L_0x007b
            q5.h r6 = r1.o()
            if (r6 == 0) goto L_0x006f
            java.lang.Class r8 = r6.g()
            r2 = 1
            i5.o r8 = y5.k0.c(r0, r8, r2)
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0068
            java.lang.reflect.Member r2 = r6.p()
            i5.q r3 = i5.q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r3 = r0.T(r3)
            a6.h.g(r2, r3)
        L_0x0068:
            y5.s r2 = new y5.s
            r2.<init>(r6, r8)
            r8 = r2
            goto L_0x007b
        L_0x006f:
            java.lang.Class r6 = r7.g()
            i5.o r8 = y5.k0.b(r0, r6)
            goto L_0x007b
        L_0x0078:
            r8 = r6
            goto L_0x007b
        L_0x007a:
            r8 = r3
        L_0x007b:
            k5.m r6 = r5.O
            boolean r6 = r6.b()
            if (r6 == 0) goto L_0x009e
            k5.m r6 = r5.O
            java.lang.Iterable r6 = r6.e()
            java.util.Iterator r6 = r6.iterator()
        L_0x008d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x009e
            java.lang.Object r2 = r6.next()
            com.fasterxml.jackson.databind.ser.h r2 = (com.fasterxml.jackson.databind.ser.h) r2
            i5.o r8 = r2.f(r0, r7, r1, r8)
            goto L_0x008d
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.b.b(i5.e0, i5.j, i5.o):i5.o");
    }

    public abstract o<Object> c(e0 e0Var, j jVar) throws l;

    public u5.i d(c0 c0Var, j jVar) {
        Collection<u5.c> collection;
        q5.b z10 = c0Var.P(jVar.g()).z();
        u5.h<?> p02 = c0Var.m().p0(c0Var, z10, jVar);
        if (p02 == null) {
            p02 = c0Var.D(jVar);
            collection = null;
        } else {
            collection = c0Var.K().c(c0Var, z10);
        }
        if (p02 == null) {
            return null;
        }
        return p02.h(c0Var, jVar, collection);
    }

    public final r e(s sVar) {
        return L(this.O.g(sVar));
    }

    public final r f(s sVar) {
        return L(this.O.h(sVar));
    }

    public final r g(h hVar) {
        return L(this.O.i(hVar));
    }

    public u h(e0 e0Var, c cVar, u uVar) throws l {
        j O2 = uVar.O();
        u.b j10 = j(e0Var, cVar, O2, Map.class);
        u.a g10 = j10 == null ? u.a.USE_DEFAULTS : j10.g();
        boolean z10 = true;
        Object obj = null;
        if (g10 == u.a.USE_DEFAULTS || g10 == u.a.ALWAYS) {
            return !e0Var.w0(d0.WRITE_NULL_MAP_VALUES) ? uVar.q0((Object) null, true) : uVar;
        }
        int i10 = a.f5028b[g10.ordinal()];
        if (i10 == 1) {
            obj = a6.e.a(O2);
            if (obj != null && obj.getClass().isArray()) {
                obj = a6.c.b(obj);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                obj = y5.u.f15529g0;
            } else if (i10 == 4 && (obj = e0Var.u0((q5.s) null, j10.f())) != null) {
                z10 = e0Var.v0(obj);
            }
        } else if (O2.v()) {
            obj = y5.u.f15529g0;
        }
        return uVar.q0(obj, z10);
    }

    public o<Object> i(e0 e0Var, q5.a aVar) throws l {
        Object j10 = e0Var.o().j(aVar);
        if (j10 != null) {
            return e0Var.G0(aVar, j10);
        }
        return null;
    }

    public u.b j(e0 e0Var, c cVar, j jVar, Class<?> cls) throws l {
        c0 j02 = e0Var.q();
        u.b B = j02.B(cls, cVar.u(j02.z()));
        u.b B2 = j02.B(jVar.g(), (u.b) null);
        if (B2 == null) {
            return B;
        }
        int i10 = a.f5028b[B2.i().ordinal()];
        return i10 != 4 ? i10 != 6 ? B.n(B2.i()) : B : B.m(B2.f());
    }

    public o<Object> k(e0 e0Var, q5.a aVar) throws l {
        Object D = e0Var.o().D(aVar);
        if (D != null) {
            return e0Var.G0(aVar, D);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000d A[LOOP:0: B:1:0x000d->B:4:0x0022, LOOP_START, PHI: r0 
      PHI: (r0v2 i5.o<?>) = (r0v1 i5.o<?>), (r0v15 i5.o<?>) binds: [B:0:0x0000, B:4:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> l(i5.e0 r8, z5.a r9, i5.c r10, boolean r11, u5.i r12, i5.o<java.lang.Object> r13) throws i5.l {
        /*
            r7 = this;
            i5.c0 r8 = r8.q()
            java.lang.Iterable r0 = r7.x()
            java.util.Iterator r6 = r0.iterator()
            r0 = 0
        L_0x000d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r0 = r6.next()
            com.fasterxml.jackson.databind.ser.s r0 = (com.fasterxml.jackson.databind.ser.s) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            i5.o r0 = r0.f(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x000d
        L_0x0024:
            if (r0 != 0) goto L_0x0048
            java.lang.Class r1 = r9.g()
            if (r13 == 0) goto L_0x0032
            boolean r2 = a6.h.Y(r13)
            if (r2 == 0) goto L_0x003d
        L_0x0032:
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            if (r0 != r1) goto L_0x0039
            x5.o r0 = x5.o.V
            goto L_0x003d
        L_0x0039:
            i5.o r0 = y5.g0.a(r1)
        L_0x003d:
            if (r0 != 0) goto L_0x0048
            y5.z r0 = new y5.z
            i5.j r1 = r9.d()
            r0.<init>(r1, r11, r12, r13)
        L_0x0048:
            k5.m r11 = r7.O
            boolean r11 = r11.b()
            if (r11 == 0) goto L_0x006b
            k5.m r11 = r7.O
            java.lang.Iterable r11 = r11.e()
            java.util.Iterator r11 = r11.iterator()
        L_0x005a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x006b
            java.lang.Object r12 = r11.next()
            com.fasterxml.jackson.databind.ser.h r12 = (com.fasterxml.jackson.databind.ser.h) r12
            i5.o r0 = r12.b(r8, r9, r10, r0)
            goto L_0x005a
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.b.l(i5.e0, z5.a, i5.c, boolean, u5.i, i5.o):i5.o");
    }

    public o<?> m(e0 e0Var, i iVar, c cVar, boolean z10, u5.i iVar2, o<Object> oVar) throws l {
        j P2 = iVar.h();
        u.b j10 = j(e0Var, cVar, P2, AtomicReference.class);
        u.a g10 = j10 == null ? u.a.USE_DEFAULTS : j10.g();
        boolean z11 = true;
        Object obj = null;
        if (g10 == u.a.USE_DEFAULTS || g10 == u.a.ALWAYS) {
            z11 = false;
        } else {
            int i10 = a.f5028b[g10.ordinal()];
            if (i10 == 1) {
                obj = a6.e.a(P2);
                if (obj != null && obj.getClass().isArray()) {
                    obj = a6.c.b(obj);
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    obj = y5.u.f15529g0;
                } else if (i10 == 4 && (obj = e0Var.u0((q5.s) null, j10.f())) != null) {
                    z11 = e0Var.v0(obj);
                }
            } else if (P2.v()) {
                obj = y5.u.f15529g0;
            }
        }
        return new y5.c(iVar, z10, iVar2, oVar).T(obj, z11);
    }

    public i<?> n(j jVar, boolean z10, u5.i iVar, o<Object> oVar) {
        return new y5.j(jVar, z10, iVar, oVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0019 A[LOOP:0: B:1:0x0019->B:4:0x0032, LOOP_START, PHI: r1 
      PHI: (r1v2 i5.o<?>) = (r1v1 i5.o<?>), (r1v20 i5.o<?>) binds: [B:0:0x0000, B:4:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> o(i5.e0 r16, z5.e r17, i5.c r18, boolean r19, u5.i r20, i5.o<java.lang.Object> r21) throws i5.l {
        /*
            r15 = this;
            r0 = r15
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            i5.c0 r12 = r16.q()
            java.lang.Iterable r1 = r15.x()
            java.util.Iterator r13 = r1.iterator()
            r14 = 0
            r1 = r14
        L_0x0019:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0034
            java.lang.Object r1 = r13.next()
            com.fasterxml.jackson.databind.ser.s r1 = (com.fasterxml.jackson.databind.ser.s) r1
            r2 = r12
            r3 = r17
            r4 = r18
            r5 = r20
            r6 = r21
            i5.o r1 = r1.d(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0019
        L_0x0034:
            if (r1 != 0) goto L_0x009e
            i5.o r1 = r15.E(r16, r17, r18)
            if (r1 != 0) goto L_0x009e
            v4.n$d r2 = r7.l(r14)
            if (r2 == 0) goto L_0x004b
            v4.n$c r2 = r2.m()
            v4.n$c r3 = v4.n.c.OBJECT
            if (r2 != r3) goto L_0x004b
            return r14
        L_0x004b:
            java.lang.Class r2 = r17.g()
            java.lang.Class<java.util.EnumSet> r3 = java.util.EnumSet.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L_0x0068
            i5.j r1 = r17.d()
            boolean r2 = r1.W()
            if (r2 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r14 = r1
        L_0x0063:
            i5.o r1 = r15.r(r14)
            goto L_0x009e
        L_0x0068:
            i5.j r3 = r17.d()
            java.lang.Class r3 = r3.g()
            boolean r2 = r15.J(r2)
            if (r2 == 0) goto L_0x008a
            if (r3 != r11) goto L_0x0081
            boolean r2 = a6.h.Y(r21)
            if (r2 == 0) goto L_0x0094
            x5.f r1 = x5.f.T
            goto L_0x0094
        L_0x0081:
            i5.j r1 = r17.d()
            com.fasterxml.jackson.databind.ser.i r1 = r15.s(r1, r8, r9, r10)
            goto L_0x0094
        L_0x008a:
            if (r3 != r11) goto L_0x0094
            boolean r2 = a6.h.Y(r21)
            if (r2 == 0) goto L_0x0094
            x5.p r1 = x5.p.S
        L_0x0094:
            if (r1 != 0) goto L_0x009e
            i5.j r1 = r17.d()
            com.fasterxml.jackson.databind.ser.i r1 = r15.n(r1, r8, r9, r10)
        L_0x009e:
            k5.m r2 = r0.O
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x00c3
            k5.m r2 = r0.O
            java.lang.Iterable r2 = r2.e()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c3
            java.lang.Object r3 = r2.next()
            com.fasterxml.jackson.databind.ser.h r3 = (com.fasterxml.jackson.databind.ser.h) r3
            r4 = r17
            i5.o r1 = r3.d(r12, r4, r7, r1)
            goto L_0x00b0
        L_0x00c3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.b.o(i5.e0, z5.e, i5.c, boolean, u5.i, i5.o):i5.o");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c A[LOOP:0: B:20:0x006c->B:23:0x0086, LOOP_START, PHI: r3 
      PHI: (r3v13 i5.o<?>) = (r3v1 i5.o<?>), (r3v21 i5.o<?>) binds: [B:19:0x0064, B:23:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> p(i5.e0 r19, i5.j r20, i5.c r21, boolean r22) throws i5.l {
        /*
            r18 = this;
            r8 = r18
            r1 = r19
            r7 = r21
            i5.c0 r0 = r19.q()
            if (r22 != 0) goto L_0x0024
            boolean r2 = r20.b0()
            if (r2 == 0) goto L_0x0024
            boolean r2 = r20.o()
            if (r2 == 0) goto L_0x0022
            i5.j r2 = r20.d()
            boolean r2 = r2.X()
            if (r2 != 0) goto L_0x0024
        L_0x0022:
            r2 = 1
            goto L_0x0026
        L_0x0024:
            r2 = r22
        L_0x0026:
            i5.j r3 = r20.d()
            u5.i r16 = r8.d(r0, r3)
            if (r16 == 0) goto L_0x0031
            r2 = 0
        L_0x0031:
            r4 = r2
            q5.b r2 = r21.z()
            i5.o r17 = r8.i(r1, r2)
            boolean r2 = r20.t()
            r3 = 0
            if (r2 == 0) goto L_0x00b4
            r2 = r20
            z5.f r2 = (z5.f) r2
            q5.b r5 = r21.z()
            i5.o r5 = r8.k(r1, r5)
            boolean r6 = r2.n0()
            if (r6 == 0) goto L_0x0064
            z5.g r2 = (z5.g) r2
            r0 = r18
            r1 = r19
            r3 = r21
            r6 = r16
            r7 = r17
            i5.o r0 = r0.w(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L_0x0064:
            java.lang.Iterable r4 = r18.x()
            java.util.Iterator r4 = r4.iterator()
        L_0x006c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0088
            java.lang.Object r3 = r4.next()
            r9 = r3
            com.fasterxml.jackson.databind.ser.s r9 = (com.fasterxml.jackson.databind.ser.s) r9
            r10 = r0
            r11 = r2
            r12 = r21
            r13 = r5
            r14 = r16
            r15 = r17
            i5.o r3 = r9.g(r10, r11, r12, r13, r14, r15)
            if (r3 == 0) goto L_0x006c
        L_0x0088:
            if (r3 != 0) goto L_0x008e
            i5.o r3 = r18.E(r19, r20, r21)
        L_0x008e:
            if (r3 == 0) goto L_0x00b3
            k5.m r1 = r8.O
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00b3
            k5.m r1 = r8.O
            java.lang.Iterable r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r1.next()
            com.fasterxml.jackson.databind.ser.h r4 = (com.fasterxml.jackson.databind.ser.h) r4
            i5.o r3 = r4.g(r0, r2, r7, r3)
            goto L_0x00a2
        L_0x00b3:
            return r3
        L_0x00b4:
            boolean r2 = r20.m()
            if (r2 == 0) goto L_0x0129
            r9 = r20
            z5.d r9 = (z5.d) r9
            boolean r2 = r9.o0()
            if (r2 == 0) goto L_0x00d6
            r2 = r9
            z5.e r2 = (z5.e) r2
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r16
            r6 = r17
            i5.o r0 = r0.o(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x00d6:
            java.lang.Iterable r2 = r18.x()
            java.util.Iterator r10 = r2.iterator()
        L_0x00de:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00fc
            java.lang.Object r2 = r10.next()
            com.fasterxml.jackson.databind.ser.s r2 = (com.fasterxml.jackson.databind.ser.s) r2
            r3 = r0
            r4 = r9
            r5 = r21
            r6 = r16
            r11 = r7
            r7 = r17
            i5.o r3 = r2.b(r3, r4, r5, r6, r7)
            if (r3 == 0) goto L_0x00fa
            goto L_0x00fd
        L_0x00fa:
            r7 = r11
            goto L_0x00de
        L_0x00fc:
            r11 = r7
        L_0x00fd:
            if (r3 != 0) goto L_0x0103
            i5.o r3 = r18.E(r19, r20, r21)
        L_0x0103:
            if (r3 == 0) goto L_0x0128
            k5.m r1 = r8.O
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0128
            k5.m r1 = r8.O
            java.lang.Iterable r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
        L_0x0117:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0128
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.ser.h r2 = (com.fasterxml.jackson.databind.ser.h) r2
            i5.o r3 = r2.c(r0, r9, r11, r3)
            goto L_0x0117
        L_0x0128:
            return r3
        L_0x0129:
            r11 = r7
            boolean r0 = r20.l()
            if (r0 == 0) goto L_0x0143
            r2 = r20
            z5.a r2 = (z5.a) r2
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r16
            r6 = r17
            i5.o r0 = r0.l(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0143:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.b.p(i5.e0, i5.j, i5.c, boolean):i5.o");
    }

    public o<?> q(c0 c0Var, j jVar, c cVar) throws l {
        n.d l10 = cVar.l((n.d) null);
        if (l10 == null || l10.m() != n.c.OBJECT) {
            o<?> O2 = y5.m.O(jVar.g(), c0Var, cVar, l10);
            if (this.O.b()) {
                for (h e10 : this.O.e()) {
                    O2 = e10.e(c0Var, jVar, cVar, O2);
                }
            }
            return O2;
        }
        ((q5.q) cVar).U("declaringClass");
        return null;
    }

    public o<?> r(j jVar) {
        return new y5.n(jVar);
    }

    public i<?> s(j jVar, boolean z10, u5.i iVar, o<Object> oVar) {
        return new x5.e(jVar, z10, iVar, oVar);
    }

    public o<?> t(c0 c0Var, j jVar, c cVar, boolean z10, j jVar2) throws l {
        return new r(jVar2, z10, d(c0Var, jVar2));
    }

    public o<?> u(c0 c0Var, j jVar, c cVar, boolean z10, j jVar2) throws l {
        return new x5.g(jVar2, z10, d(c0Var, jVar2));
    }

    public o<?> v(e0 e0Var, j jVar, c cVar, boolean z10, j jVar2, j jVar3) throws l {
        Object obj = null;
        if (n.d.u(cVar.l((n.d) null), e0Var.r(Map.Entry.class)).m() == n.c.OBJECT) {
            return null;
        }
        x5.h hVar = new x5.h(jVar3, jVar2, jVar3, z10, d(e0Var.q(), jVar3), (d) null);
        j O2 = hVar.O();
        u.b j10 = j(e0Var, cVar, O2, Map.Entry.class);
        u.a g10 = j10 == null ? u.a.USE_DEFAULTS : j10.g();
        if (g10 == u.a.USE_DEFAULTS || g10 == u.a.ALWAYS) {
            return hVar;
        }
        int i10 = a.f5028b[g10.ordinal()];
        boolean z11 = true;
        if (i10 == 1) {
            obj = a6.e.a(O2);
            if (obj != null && obj.getClass().isArray()) {
                obj = a6.c.b(obj);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                obj = y5.u.f15529g0;
            } else if (i10 == 4 && (obj = e0Var.u0((q5.s) null, j10.f())) != null) {
                z11 = e0Var.v0(obj);
            }
        } else if (O2.v()) {
            obj = y5.u.f15529g0;
        }
        return hVar.Z(obj, z11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0021 A[LOOP:0: B:6:0x0021->B:9:0x003c, LOOP_START, PHI: r1 
      PHI: (r1v3 i5.o<?>) = (r1v2 i5.o<?>), (r1v16 i5.o<?>) binds: [B:5:0x0014, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> w(i5.e0 r19, z5.g r20, i5.c r21, boolean r22, i5.o<java.lang.Object> r23, u5.i r24, i5.o<java.lang.Object> r25) throws i5.l {
        /*
            r18 = this;
            r0 = r18
            r8 = r21
            r9 = 0
            v4.n$d r1 = r8.l(r9)
            if (r1 == 0) goto L_0x0014
            v4.n$c r1 = r1.m()
            v4.n$c r2 = v4.n.c.OBJECT
            if (r1 != r2) goto L_0x0014
            return r9
        L_0x0014:
            i5.c0 r10 = r19.q()
            java.lang.Iterable r1 = r18.x()
            java.util.Iterator r11 = r1.iterator()
            r1 = r9
        L_0x0021:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x003e
            java.lang.Object r1 = r11.next()
            com.fasterxml.jackson.databind.ser.s r1 = (com.fasterxml.jackson.databind.ser.s) r1
            r2 = r10
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r7 = r25
            i5.o r1 = r1.e(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0021
        L_0x003e:
            if (r1 != 0) goto L_0x0070
            i5.o r1 = r18.E(r19, r20, r21)
            if (r1 != 0) goto L_0x0070
            java.lang.Object r17 = r0.A(r10, r8)
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            q5.b r2 = r21.z()
            v4.s$a r1 = r10.y(r1, r2)
            if (r1 != 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            java.util.Set r9 = r1.i()
        L_0x005b:
            r11 = r9
            r12 = r20
            r13 = r22
            r14 = r24
            r15 = r23
            r16 = r25
            y5.u r1 = y5.u.b0(r11, r12, r13, r14, r15, r16, r17)
            r2 = r19
            y5.u r1 = r0.h(r2, r8, r1)
        L_0x0070:
            k5.m r2 = r0.O
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0095
            k5.m r2 = r0.O
            java.lang.Iterable r2 = r2.e()
            java.util.Iterator r2 = r2.iterator()
        L_0x0082:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r2.next()
            com.fasterxml.jackson.databind.ser.h r3 = (com.fasterxml.jackson.databind.ser.h) r3
            r4 = r20
            i5.o r1 = r3.h(r10, r4, r8, r1)
            goto L_0x0082
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.b.w(i5.e0, z5.g, i5.c, boolean, i5.o, u5.i, i5.o):i5.o");
    }

    public abstract Iterable<s> x();

    public a6.j<Object, Object> y(e0 e0Var, q5.a aVar) throws l {
        Object d02 = e0Var.o().d0(aVar);
        if (d02 == null) {
            return null;
        }
        return e0Var.m(aVar, d02);
    }

    public o<?> z(e0 e0Var, q5.a aVar, o<?> oVar) throws l {
        a6.j<Object, Object> y10 = y(e0Var, aVar);
        return y10 == null ? oVar : new h0(y10, y10.c(e0Var.u()), oVar);
    }
}
