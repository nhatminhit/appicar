package y5;

import a6.c;
import a6.h;
import com.fasterxml.jackson.databind.ser.i;
import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.d0;
import i5.e0;
import i5.l;
import i5.m;
import i5.o;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import s5.g;
import v4.u;
import w4.p;
import x5.k;
import z5.n;

@j5.a
public class u extends i<Map<?, ?>> implements j {

    /* renamed from: e0  reason: collision with root package name */
    public static final long f15527e0 = 1;

    /* renamed from: f0  reason: collision with root package name */
    public static final i5.j f15528f0 = n.l0();

    /* renamed from: g0  reason: collision with root package name */
    public static final Object f15529g0 = u.a.NON_EMPTY;
    public final d R;
    public final boolean S;
    public final i5.j T;
    public final i5.j U;
    public o<Object> V;
    public o<Object> W;
    public final u5.i X;
    public k Y;
    public final Set<String> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Object f15530a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Object f15531b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f15532c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f15533d0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15534a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v4.u$a[] r0 = v4.u.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15534a = r0
                v4.u$a r1 = v4.u.a.NON_DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15534a     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.u$a r1 = v4.u.a.NON_ABSENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15534a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.u$a r1 = v4.u.a.NON_EMPTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15534a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.u$a r1 = v4.u.a.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15534a     // Catch:{ NoSuchFieldError -> 0x003e }
                v4.u$a r1 = v4.u.a.NON_NULL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15534a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v4.u$a r1 = v4.u.a.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.u.a.<clinit>():void");
        }
    }

    public u(Set<String> set, i5.j jVar, i5.j jVar2, boolean z10, u5.i iVar, o<?> oVar, o<?> oVar2) {
        super(Map.class, false);
        this.Z = (set == null || set.isEmpty()) ? null : set;
        this.T = jVar;
        this.U = jVar2;
        this.S = z10;
        this.X = iVar;
        this.V = oVar;
        this.W = oVar2;
        this.Y = k.c();
        this.R = null;
        this.f15530a0 = null;
        this.f15533d0 = false;
        this.f15531b0 = null;
        this.f15532c0 = false;
    }

    public u(u uVar, d dVar, o<?> oVar, o<?> oVar2, Set<String> set) {
        super(Map.class, false);
        this.Z = (set == null || set.isEmpty()) ? null : set;
        this.T = uVar.T;
        this.U = uVar.U;
        this.S = uVar.S;
        this.X = uVar.X;
        this.V = oVar;
        this.W = oVar2;
        this.Y = k.c();
        this.R = dVar;
        this.f15530a0 = uVar.f15530a0;
        this.f15533d0 = uVar.f15533d0;
        this.f15531b0 = uVar.f15531b0;
        this.f15532c0 = uVar.f15532c0;
    }

    public u(u uVar, Object obj, boolean z10) {
        super(Map.class, false);
        this.Z = uVar.Z;
        this.T = uVar.T;
        this.U = uVar.U;
        this.S = uVar.S;
        this.X = uVar.X;
        this.V = uVar.V;
        this.W = uVar.W;
        this.Y = k.c();
        this.R = uVar.R;
        this.f15530a0 = obj;
        this.f15533d0 = z10;
        this.f15531b0 = uVar.f15531b0;
        this.f15532c0 = uVar.f15532c0;
    }

    @Deprecated
    public u(u uVar, u5.i iVar, Object obj) {
        this(uVar, iVar, obj, false);
    }

    public u(u uVar, u5.i iVar, Object obj, boolean z10) {
        super(Map.class, false);
        this.Z = uVar.Z;
        this.T = uVar.T;
        this.U = uVar.U;
        this.S = uVar.S;
        this.X = iVar;
        this.V = uVar.V;
        this.W = uVar.W;
        this.Y = uVar.Y;
        this.R = uVar.R;
        this.f15530a0 = uVar.f15530a0;
        this.f15533d0 = uVar.f15533d0;
        this.f15531b0 = obj;
        this.f15532c0 = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static y5.u b0(java.util.Set<java.lang.String> r9, i5.j r10, boolean r11, u5.i r12, i5.o<java.lang.Object> r13, i5.o<java.lang.Object> r14, java.lang.Object r15) {
        /*
            if (r10 != 0) goto L_0x0007
            i5.j r10 = f15528f0
            r3 = r10
            r4 = r3
            goto L_0x001e
        L_0x0007:
            i5.j r0 = r10.e()
            java.lang.Class<java.util.Properties> r1 = java.util.Properties.class
            boolean r1 = r10.j(r1)
            if (r1 == 0) goto L_0x0018
            i5.j r10 = z5.n.l0()
            goto L_0x001c
        L_0x0018:
            i5.j r10 = r10.d()
        L_0x001c:
            r4 = r10
            r3 = r0
        L_0x001e:
            r10 = 0
            if (r11 != 0) goto L_0x002c
            if (r4 == 0) goto L_0x002a
            boolean r11 = r4.q()
            if (r11 == 0) goto L_0x002a
            r10 = 1
        L_0x002a:
            r11 = r10
            goto L_0x0036
        L_0x002c:
            java.lang.Class r0 = r4.g()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L_0x0036
            r5 = r10
            goto L_0x0037
        L_0x0036:
            r5 = r11
        L_0x0037:
            y5.u r10 = new y5.u
            r1 = r10
            r2 = r9
            r6 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            if (r15 == 0) goto L_0x0047
            y5.u r10 = r10.q(r15)
        L_0x0047:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.u.b0(java.util.Set, i5.j, boolean, u5.i, i5.o, i5.o, java.lang.Object):y5.u");
    }

    @Deprecated
    public static u c0(String[] strArr, i5.j jVar, boolean z10, u5.i iVar, o<Object> oVar, o<Object> oVar2, Object obj) {
        return b0(c.a(strArr), jVar, z10, iVar, oVar, oVar2, obj);
    }

    public o<?> N() {
        return this.W;
    }

    public i5.j O() {
        return this.U;
    }

    @Deprecated
    public void S() {
        T("N/A");
    }

    public void T(String str) {
        h.u0(u.class, this, str);
    }

    public final o<Object> U(k kVar, i5.j jVar, e0 e0Var) throws l {
        k.d k10 = kVar.k(jVar, e0Var, this.R);
        k kVar2 = k10.f15105b;
        if (kVar != kVar2) {
            this.Y = kVar2;
        }
        return k10.f15104a;
    }

    public final o<Object> V(k kVar, Class<?> cls, e0 e0Var) throws l {
        k.d l10 = kVar.l(cls, e0Var, this.R);
        k kVar2 = l10.f15105b;
        if (kVar != kVar2) {
            this.Y = kVar2;
        }
        return l10.f15104a;
    }

    public final o<Object> W(e0 e0Var, Object obj) throws l {
        Class<?> cls = obj.getClass();
        o<Object> n10 = this.Y.n(cls);
        return n10 != null ? n10 : this.U.i() ? U(this.Y, e0Var.k(this.U, cls), e0Var) : V(this.Y, cls, e0Var);
    }

    public boolean X(Map<?, ?> map) {
        return (map instanceof HashMap) && map.containsKey((Object) null);
    }

    public Map<?, ?> Y(Map<?, ?> map, w4.i iVar, e0 e0Var) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!X(map)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (key == null) {
                a0(iVar, e0Var, value);
            } else {
                treeMap.put(key, value);
            }
        }
        return treeMap;
    }

    /* renamed from: Z */
    public u M(u5.i iVar) {
        if (this.X == iVar) {
            return this;
        }
        T("_withValueTypeSerializer");
        return new u(this, iVar, this.f15531b0, this.f15532c0);
    }

    public m a(e0 e0Var, Type type) {
        return u("object", true);
    }

    public void a0(w4.i iVar, e0 e0Var, Object obj) throws IOException {
        o<Object> oVar;
        o<Object> X2 = e0Var.X(this.T, this.R);
        if (obj != null) {
            oVar = this.W;
            if (oVar == null) {
                oVar = W(e0Var, obj);
            }
            Object obj2 = this.f15531b0;
            if (obj2 == f15529g0) {
                if (oVar.h(e0Var, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (!this.f15532c0) {
            oVar = e0Var.l0();
        } else {
            return;
        }
        try {
            X2.m(null, iVar, e0Var);
            oVar.m(obj, iVar, e0Var);
        } catch (Exception e10) {
            L(e0Var, e10, obj, "");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f8, code lost:
        if (r0 != 5) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> d(i5.e0 r13, i5.d r14) throws i5.l {
        /*
            r12 = this;
            i5.b r0 = r13.o()
            r1 = 0
            if (r14 != 0) goto L_0x0009
            r2 = r1
            goto L_0x000d
        L_0x0009:
            q5.h r2 = r14.i()
        L_0x000d:
            boolean r3 = y5.m0.r(r2, r0)
            if (r3 == 0) goto L_0x002c
            java.lang.Object r3 = r0.D(r2)
            if (r3 == 0) goto L_0x001e
            i5.o r3 = r13.G0(r2, r3)
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            java.lang.Object r4 = r0.j(r2)
            if (r4 == 0) goto L_0x002a
            i5.o r4 = r13.G0(r2, r4)
            goto L_0x002e
        L_0x002a:
            r4 = r1
            goto L_0x002e
        L_0x002c:
            r3 = r1
            r4 = r3
        L_0x002e:
            if (r4 != 0) goto L_0x0032
            i5.o<java.lang.Object> r4 = r12.W
        L_0x0032:
            i5.o r4 = r12.w(r13, r14, r4)
            if (r4 != 0) goto L_0x004a
            boolean r5 = r12.S
            if (r5 == 0) goto L_0x004a
            i5.j r5 = r12.U
            boolean r5 = r5.X()
            if (r5 != 0) goto L_0x004a
            i5.j r4 = r12.U
            i5.o r4 = r13.T(r4, r14)
        L_0x004a:
            r8 = r4
            if (r3 != 0) goto L_0x004f
            i5.o<java.lang.Object> r3 = r12.V
        L_0x004f:
            if (r3 != 0) goto L_0x0058
            i5.j r3 = r12.T
            i5.o r3 = r13.V(r3, r14)
            goto L_0x005c
        L_0x0058:
            i5.o r3 = r13.s0(r3, r14)
        L_0x005c:
            r7 = r3
            java.util.Set<java.lang.String> r3 = r12.Z
            boolean r4 = y5.m0.r(r2, r0)
            r11 = 0
            if (r4 == 0) goto L_0x00a4
            v4.s$a r4 = r0.U(r2)
            if (r4 == 0) goto L_0x0098
            java.util.Set r4 = r4.i()
            boolean r5 = y5.m0.s(r4)
            if (r5 == 0) goto L_0x0098
            if (r3 != 0) goto L_0x007e
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            goto L_0x0084
        L_0x007e:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r3)
            r3 = r5
        L_0x0084:
            java.util.Iterator r4 = r4.iterator()
        L_0x0088:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0098
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r3.add(r5)
            goto L_0x0088
        L_0x0098:
            java.lang.Boolean r2 = r0.i0(r2)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r2 = r4.equals(r2)
            r9 = r3
            goto L_0x00a6
        L_0x00a4:
            r9 = r3
            r2 = r11
        L_0x00a6:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            v4.n$d r3 = r12.z(r13, r14, r3)
            if (r3 == 0) goto L_0x00ba
            v4.n$a r4 = v4.n.a.WRITE_SORTED_MAP_ENTRIES
            java.lang.Boolean r3 = r3.h(r4)
            if (r3 == 0) goto L_0x00ba
            boolean r2 = r3.booleanValue()
        L_0x00ba:
            r10 = r2
            r5 = r12
            r6 = r14
            y5.u r2 = r5.s0(r6, r7, r8, r9, r10)
            if (r14 == 0) goto L_0x00d3
            q5.h r3 = r14.i()
            if (r3 == 0) goto L_0x00d3
            java.lang.Object r0 = r0.w(r3)
            if (r0 == 0) goto L_0x00d3
            y5.u r2 = r2.q(r0)
        L_0x00d3:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            v4.u$b r14 = r12.A(r13, r14, r0)
            if (r14 == 0) goto L_0x0135
            v4.u$a r0 = r14.g()
            v4.u$a r3 = v4.u.a.USE_DEFAULTS
            if (r0 == r3) goto L_0x0135
            int[] r3 = y5.u.a.f15534a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L_0x011a
            r4 = 2
            if (r0 == r4) goto L_0x010e
            r4 = 3
            if (r0 == r4) goto L_0x010b
            r4 = 4
            if (r0 == r4) goto L_0x00fb
            r13 = 5
            if (r0 == r13) goto L_0x0130
            goto L_0x0131
        L_0x00fb:
            java.lang.Class r14 = r14.f()
            java.lang.Object r1 = r13.u0(r1, r14)
            if (r1 != 0) goto L_0x0106
            goto L_0x0130
        L_0x0106:
            boolean r11 = r13.v0(r1)
            goto L_0x0131
        L_0x010b:
            java.lang.Object r1 = f15529g0
            goto L_0x0130
        L_0x010e:
            i5.j r13 = r12.U
            boolean r13 = r13.v()
            if (r13 == 0) goto L_0x0130
            java.lang.Object r13 = f15529g0
            r1 = r13
            goto L_0x0130
        L_0x011a:
            i5.j r13 = r12.U
            java.lang.Object r1 = a6.e.a(r13)
            if (r1 == 0) goto L_0x0130
            java.lang.Class r13 = r1.getClass()
            boolean r13 = r13.isArray()
            if (r13 == 0) goto L_0x0130
            java.lang.Object r1 = a6.c.b(r1)
        L_0x0130:
            r11 = r3
        L_0x0131:
            y5.u r2 = r2.q0(r1, r11)
        L_0x0135:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.u.d(i5.e0, i5.d):i5.o");
    }

    public o<?> d0() {
        return this.V;
    }

    public void e(g gVar, i5.j jVar) throws l {
        s5.i h10 = gVar.h(jVar);
        if (h10 != null) {
            h10.l(this.V, this.T);
            o<Object> oVar = this.W;
            if (oVar == null) {
                oVar = U(this.Y, this.U, gVar.c());
            }
            h10.b(oVar, this.U);
        }
    }

    /* renamed from: e0 */
    public boolean Q(Map<?, ?> map) {
        return map.size() == 1;
    }

    /* renamed from: f0 */
    public boolean h(e0 e0Var, Map<?, ?> map) {
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this.f15531b0;
        if (obj == null && !this.f15532c0) {
            return false;
        }
        o<Object> oVar = this.W;
        boolean z10 = f15529g0 == obj;
        if (oVar != null) {
            for (Object next : map.values()) {
                if (next == null) {
                    if (!this.f15532c0) {
                        return false;
                    }
                } else if (z10) {
                    if (!oVar.h(e0Var, next)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object next2 : map.values()) {
            if (next2 != null) {
                try {
                    o<Object> W2 = W(e0Var, next2);
                    if (!z10) {
                        if (obj != null && obj.equals(map)) {
                        }
                        return false;
                    } else if (!W2.h(e0Var, next2)) {
                        return false;
                    }
                } catch (l unused) {
                }
            } else if (!this.f15532c0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g0 */
    public void m(Map<?, ?> map, w4.i iVar, e0 e0Var) throws IOException {
        iVar.W2(map);
        o0(map, iVar, e0Var);
        iVar.g2();
    }

    public void h0(Map<?, ?> map, w4.i iVar, e0 e0Var) throws IOException {
        Object obj = null;
        if (this.X != null) {
            m0(map, iVar, e0Var, (Object) null);
            return;
        }
        o<Object> oVar = this.V;
        Set<String> set = this.Z;
        try {
            Object obj2 = null;
            for (Map.Entry next : map.entrySet()) {
                try {
                    Object value = next.getValue();
                    obj2 = next.getKey();
                    if (obj2 == null) {
                        e0Var.X(this.T, this.R).m(null, iVar, e0Var);
                    } else if (set == null || !set.contains(obj2)) {
                        oVar.m(obj2, iVar, e0Var);
                    }
                    if (value == null) {
                        e0Var.R(iVar);
                    } else {
                        o<Object> oVar2 = this.W;
                        if (oVar2 == null) {
                            oVar2 = W(e0Var, value);
                        }
                        oVar2.m(value, iVar, e0Var);
                    }
                } catch (Exception e10) {
                    e = e10;
                    obj = obj2;
                    L(e0Var, e, map, String.valueOf(obj));
                }
            }
        } catch (Exception e11) {
            e = e11;
            L(e0Var, e, map, String.valueOf(obj));
        }
    }

    public void i0(Map<?, ?> map, w4.i iVar, e0 e0Var, o<Object> oVar) throws IOException {
        o<Object> oVar2 = this.V;
        Set<String> set = this.Z;
        u5.i iVar2 = this.X;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    e0Var.X(this.T, this.R).m(null, iVar, e0Var);
                } else {
                    oVar2.m(key, iVar, e0Var);
                }
                Object value = next.getValue();
                if (value == null) {
                    e0Var.R(iVar);
                } else if (iVar2 == null) {
                    try {
                        oVar.m(value, iVar, e0Var);
                    } catch (Exception e10) {
                        L(e0Var, e10, map, String.valueOf(key));
                    }
                } else {
                    oVar.n(value, iVar, e0Var, iVar2);
                }
            }
        }
    }

    public void j0(e0 e0Var, w4.i iVar, Object obj, Map<?, ?> map, com.fasterxml.jackson.databind.ser.n nVar, Object obj2) throws IOException {
        o<Object> oVar;
        Set<String> set = this.Z;
        t tVar = new t(this.X, this.R);
        boolean z10 = f15529g0 == obj2;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (set == null || !set.contains(key)) {
                o<Object> X2 = key == null ? e0Var.X(this.T, this.R) : this.V;
                Object value = next.getValue();
                if (value != null) {
                    oVar = this.W;
                    if (oVar == null) {
                        oVar = W(e0Var, value);
                    }
                    if (z10) {
                        if (oVar.h(e0Var, value)) {
                        }
                    } else if (obj2 != null && obj2.equals(value)) {
                    }
                } else if (!this.f15532c0) {
                    oVar = e0Var.l0();
                }
                tVar.v(key, value, X2, oVar);
                try {
                    nVar.b(obj, iVar, e0Var, tVar);
                } catch (Exception e10) {
                    L(e0Var, e10, map, String.valueOf(key));
                }
            }
        }
    }

    public void k0(Map<?, ?> map, w4.i iVar, e0 e0Var, com.fasterxml.jackson.databind.ser.n nVar, Object obj) throws IOException {
        o<Object> oVar;
        Set<String> set = this.Z;
        t tVar = new t(this.X, this.R);
        boolean z10 = f15529g0 == obj;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (set == null || !set.contains(key)) {
                o<Object> X2 = key == null ? e0Var.X(this.T, this.R) : this.V;
                Object value = next.getValue();
                if (value != null) {
                    oVar = this.W;
                    if (oVar == null) {
                        oVar = W(e0Var, value);
                    }
                    if (z10) {
                        if (oVar.h(e0Var, value)) {
                        }
                    } else if (obj != null && obj.equals(value)) {
                    }
                } else if (!this.f15532c0) {
                    oVar = e0Var.l0();
                }
                tVar.v(key, value, X2, oVar);
                try {
                    nVar.b(map, iVar, e0Var, tVar);
                } catch (Exception e10) {
                    L(e0Var, e10, map, String.valueOf(key));
                }
            }
        }
    }

    public void l0(Map<?, ?> map, w4.i iVar, e0 e0Var, Object obj) throws IOException {
        o<Object> oVar;
        o<Object> oVar2;
        if (this.X != null) {
            m0(map, iVar, e0Var, obj);
            return;
        }
        Set<String> set = this.Z;
        boolean z10 = f15529g0 == obj;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (key == null) {
                oVar = e0Var.X(this.T, this.R);
            } else if (set == null || !set.contains(key)) {
                oVar = this.V;
            }
            Object value = next.getValue();
            if (value != null) {
                oVar2 = this.W;
                if (oVar2 == null) {
                    oVar2 = W(e0Var, value);
                }
                if (z10) {
                    if (oVar2.h(e0Var, value)) {
                    }
                } else if (obj != null && obj.equals(value)) {
                }
            } else if (!this.f15532c0) {
                oVar2 = e0Var.l0();
            }
            try {
                oVar.m(key, iVar, e0Var);
                oVar2.m(value, iVar, e0Var);
            } catch (Exception e10) {
                L(e0Var, e10, map, String.valueOf(key));
            }
        }
    }

    public void m0(Map<?, ?> map, w4.i iVar, e0 e0Var, Object obj) throws IOException {
        o<Object> oVar;
        o<Object> oVar2;
        Set<String> set = this.Z;
        boolean z10 = f15529g0 == obj;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            if (key == null) {
                oVar = e0Var.X(this.T, this.R);
            } else if (set == null || !set.contains(key)) {
                oVar = this.V;
            }
            Object value = next.getValue();
            if (value != null) {
                oVar2 = this.W;
                if (oVar2 == null) {
                    oVar2 = W(e0Var, value);
                }
                if (z10) {
                    if (oVar2.h(e0Var, value)) {
                    }
                } else if (obj != null && obj.equals(value)) {
                }
            } else if (!this.f15532c0) {
                oVar2 = e0Var.l0();
            }
            oVar.m(key, iVar, e0Var);
            try {
                oVar2.n(value, iVar, e0Var, this.X);
            } catch (Exception e10) {
                L(e0Var, e10, map, String.valueOf(key));
            }
        }
    }

    /* renamed from: n0 */
    public void n(Map<?, ?> map, w4.i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        iVar.A1(map);
        g5.c o10 = iVar2.o(iVar, iVar2.g(map, p.START_OBJECT));
        o0(map, iVar, e0Var);
        iVar2.v(iVar, o10);
    }

    public void o0(Map<?, ?> map, w4.i iVar, e0 e0Var) throws IOException {
        com.fasterxml.jackson.databind.ser.n B;
        if (!map.isEmpty()) {
            if (this.f15533d0 || e0Var.w0(d0.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = Y(map, iVar, e0Var);
            }
            Map<?, ?> map2 = map;
            Object obj = this.f15530a0;
            if (obj == null || (B = B(e0Var, obj, map2)) == null) {
                Object obj2 = this.f15531b0;
                if (obj2 != null || this.f15532c0) {
                    l0(map2, iVar, e0Var, obj2);
                    return;
                }
                o<Object> oVar = this.W;
                if (oVar != null) {
                    i0(map2, iVar, e0Var, oVar);
                } else {
                    h0(map2, iVar, e0Var);
                }
            } else {
                k0(map2, iVar, e0Var, B, this.f15531b0);
            }
        }
    }

    @Deprecated
    public u p0(Object obj) {
        return new u(this, this.X, obj, this.f15532c0);
    }

    public u q0(Object obj, boolean z10) {
        if (obj == this.f15531b0 && z10 == this.f15532c0) {
            return this;
        }
        T("withContentInclusion");
        return new u(this, this.X, obj, z10);
    }

    /* renamed from: r0 */
    public u q(Object obj) {
        if (this.f15530a0 == obj) {
            return this;
        }
        T("withFilterId");
        return new u(this, obj, this.f15533d0);
    }

    public u s0(d dVar, o<?> oVar, o<?> oVar2, Set<String> set, boolean z10) {
        T("withResolved");
        u uVar = new u(this, dVar, oVar, oVar2, set);
        return z10 != uVar.f15533d0 ? new u(uVar, this.f15530a0, z10) : uVar;
    }
}
