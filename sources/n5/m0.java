package n5;

import a6.u;
import i5.d;
import i5.g;
import i5.h;
import i5.j;
import i5.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l5.i;
import l5.t;
import u5.f;
import w4.l;
import w4.p;
import z5.n;

@j5.a
public class m0 extends a0<Object> implements t, i {

    /* renamed from: a0  reason: collision with root package name */
    public static final long f10849a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public static final Object[] f10850b0 = new Object[0];
    public k<Object> T;
    public k<Object> U;
    public k<Object> V;
    public k<Object> W;
    public j X;
    public j Y;
    public final boolean Z;

    @j5.a
    public static class a extends a0<Object> {
        public static final long U = 1;
        public static final a V = new a();
        public final boolean T;

        public a() {
            this(false);
        }

        public a(boolean z10) {
            super((Class<?>) Object.class);
            this.T = z10;
        }

        public static a E0(boolean z10) {
            return z10 ? new a(true) : V;
        }

        public Object F0(l lVar, g gVar) throws IOException {
            Object f10 = f(lVar, gVar);
            p D2 = lVar.D2();
            p pVar = p.END_ARRAY;
            int i10 = 2;
            if (D2 == pVar) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(f10);
                return arrayList;
            }
            Object f11 = f(lVar, gVar);
            if (lVar.D2() == pVar) {
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(f10);
                arrayList2.add(f11);
                return arrayList2;
            }
            u x02 = gVar.x0();
            Object[] i11 = x02.i();
            i11[0] = f10;
            i11[1] = f11;
            int i12 = 2;
            while (true) {
                Object f12 = f(lVar, gVar);
                i10++;
                if (i12 >= i11.length) {
                    i11 = x02.c(i11);
                    i12 = 0;
                }
                int i13 = i12 + 1;
                i11[i12] = f12;
                if (lVar.D2() == p.END_ARRAY) {
                    ArrayList arrayList3 = new ArrayList(i10);
                    x02.e(i11, i13, arrayList3);
                    return arrayList3;
                }
                i12 = i13;
            }
        }

        public Object[] G0(l lVar, g gVar) throws IOException {
            u x02 = gVar.x0();
            Object[] i10 = x02.i();
            int i11 = 0;
            while (true) {
                Object f10 = f(lVar, gVar);
                if (i11 >= i10.length) {
                    i10 = x02.c(i10);
                    i11 = 0;
                }
                int i12 = i11 + 1;
                i10[i11] = f10;
                if (lVar.D2() == p.END_ARRAY) {
                    return x02.f(i10, i12);
                }
                i11 = i12;
            }
        }

        public Object H0(l lVar, g gVar) throws IOException {
            String Y1 = lVar.Y1();
            lVar.D2();
            Object f10 = f(lVar, gVar);
            String y22 = lVar.y2();
            if (y22 == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(Y1, f10);
                return linkedHashMap;
            }
            lVar.D2();
            Object f11 = f(lVar, gVar);
            String y23 = lVar.y2();
            if (y23 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                linkedHashMap2.put(Y1, f10);
                linkedHashMap2.put(y22, f11);
                return linkedHashMap2;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(Y1, f10);
            linkedHashMap3.put(y22, f11);
            do {
                lVar.D2();
                linkedHashMap3.put(y23, f(lVar, gVar));
                y23 = lVar.y2();
            } while (y23 != null);
            return linkedHashMap3;
        }

        public Object f(l lVar, g gVar) throws IOException {
            switch (lVar.f1()) {
                case 1:
                    if (lVar.D2() == p.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    return lVar.D2() == p.END_ARRAY ? gVar.v0(h.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? m0.f10850b0 : new ArrayList(2) : gVar.v0(h.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? G0(lVar, gVar) : F0(lVar, gVar);
                case 5:
                    break;
                case 6:
                    return lVar.Y1();
                case 7:
                    return gVar.r0(a0.R) ? y(lVar, gVar) : lVar.S1();
                case 8:
                    return gVar.v0(h.USE_BIG_DECIMAL_FOR_FLOATS) ? lVar.h1() : lVar.S1();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return lVar.p1();
                default:
                    return gVar.i0(Object.class, lVar);
            }
            return H0(lVar, gVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
            if (r0 != 5) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object g(w4.l r5, i5.g r6, java.lang.Object r7) throws java.io.IOException {
            /*
                r4 = this;
                boolean r0 = r4.T
                if (r0 == 0) goto L_0x0009
                java.lang.Object r5 = r4.f(r5, r6)
                return r5
            L_0x0009:
                int r0 = r5.f1()
                r1 = 1
                if (r0 == r1) goto L_0x003d
                r1 = 2
                if (r0 == r1) goto L_0x003c
                r1 = 3
                if (r0 == r1) goto L_0x001d
                r1 = 4
                if (r0 == r1) goto L_0x003c
                r1 = 5
                if (r0 == r1) goto L_0x0046
                goto L_0x006f
            L_0x001d:
                w4.p r0 = r5.D2()
                w4.p r1 = w4.p.END_ARRAY
                if (r0 != r1) goto L_0x0026
                return r7
            L_0x0026:
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L_0x006f
                r0 = r7
                java.util.Collection r0 = (java.util.Collection) r0
            L_0x002d:
                java.lang.Object r1 = r4.f(r5, r6)
                r0.add(r1)
                w4.p r1 = r5.D2()
                w4.p r2 = w4.p.END_ARRAY
                if (r1 != r2) goto L_0x002d
            L_0x003c:
                return r7
            L_0x003d:
                w4.p r0 = r5.D2()
                w4.p r1 = w4.p.END_OBJECT
                if (r0 != r1) goto L_0x0046
                return r7
            L_0x0046:
                boolean r0 = r7 instanceof java.util.Map
                if (r0 == 0) goto L_0x006f
                r0 = r7
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = r5.X0()
            L_0x0051:
                r5.D2()
                java.lang.Object r2 = r0.get(r1)
                if (r2 == 0) goto L_0x005f
                java.lang.Object r3 = r4.g(r5, r6, r2)
                goto L_0x0063
            L_0x005f:
                java.lang.Object r3 = r4.f(r5, r6)
            L_0x0063:
                if (r3 == r2) goto L_0x0068
                r0.put(r1, r3)
            L_0x0068:
                java.lang.String r1 = r5.y2()
                if (r1 != 0) goto L_0x0051
                return r7
            L_0x006f:
                java.lang.Object r5 = r4.f(r5, r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.m0.a.g(w4.l, i5.g, java.lang.Object):java.lang.Object");
        }

        public Object h(l lVar, g gVar, f fVar) throws IOException {
            int f12 = lVar.f1();
            if (!(f12 == 1 || f12 == 3)) {
                switch (f12) {
                    case 5:
                        break;
                    case 6:
                        return lVar.Y1();
                    case 7:
                        return gVar.v0(h.USE_BIG_INTEGER_FOR_INTS) ? lVar.e0() : lVar.S1();
                    case 8:
                        return gVar.v0(h.USE_BIG_DECIMAL_FOR_FLOATS) ? lVar.h1() : lVar.S1();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return lVar.p1();
                    default:
                        return gVar.i0(Object.class, lVar);
                }
            }
            return fVar.c(lVar, gVar);
        }

        public Boolean u(i5.f fVar) {
            if (this.T) {
                return Boolean.FALSE;
            }
            return null;
        }
    }

    @Deprecated
    public m0() {
        this((j) null, (j) null);
    }

    public m0(j jVar, j jVar2) {
        super((Class<?>) Object.class);
        this.X = jVar;
        this.Y = jVar2;
        this.Z = false;
    }

    public m0(m0 m0Var, k<?> kVar, k<?> kVar2, k<?> kVar3, k<?> kVar4) {
        super((Class<?>) Object.class);
        this.T = kVar;
        this.U = kVar2;
        this.V = kVar3;
        this.W = kVar4;
        this.X = m0Var.X;
        this.Y = m0Var.Y;
        this.Z = m0Var.Z;
    }

    public m0(m0 m0Var, boolean z10) {
        super((Class<?>) Object.class);
        this.T = m0Var.T;
        this.U = m0Var.U;
        this.V = m0Var.V;
        this.W = m0Var.W;
        this.X = m0Var.X;
        this.Y = m0Var.Y;
        this.Z = z10;
    }

    public k<Object> E0(k<Object> kVar) {
        if (a6.h.Y(kVar)) {
            return null;
        }
        return kVar;
    }

    public k<Object> F0(g gVar, j jVar) throws i5.l {
        return gVar.O(jVar);
    }

    public Object G0(l lVar, g gVar) throws IOException {
        p D2 = lVar.D2();
        p pVar = p.END_ARRAY;
        int i10 = 2;
        if (D2 == pVar) {
            return new ArrayList(2);
        }
        Object f10 = f(lVar, gVar);
        if (lVar.D2() == pVar) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(f10);
            return arrayList;
        }
        Object f11 = f(lVar, gVar);
        if (lVar.D2() == pVar) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(f10);
            arrayList2.add(f11);
            return arrayList2;
        }
        u x02 = gVar.x0();
        Object[] i11 = x02.i();
        i11[0] = f10;
        i11[1] = f11;
        int i12 = 2;
        while (true) {
            Object f12 = f(lVar, gVar);
            i10++;
            if (i12 >= i11.length) {
                i11 = x02.c(i11);
                i12 = 0;
            }
            int i13 = i12 + 1;
            i11[i12] = f12;
            if (lVar.D2() == p.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i10);
                x02.e(i11, i13, arrayList3);
                return arrayList3;
            }
            i12 = i13;
        }
    }

    public Object H0(l lVar, g gVar, Collection<Object> collection) throws IOException {
        while (lVar.D2() != p.END_ARRAY) {
            collection.add(f(lVar, gVar));
        }
        return collection;
    }

    public Object[] I0(l lVar, g gVar) throws IOException {
        if (lVar.D2() == p.END_ARRAY) {
            return f10850b0;
        }
        u x02 = gVar.x0();
        Object[] i10 = x02.i();
        int i11 = 0;
        while (true) {
            Object f10 = f(lVar, gVar);
            if (i11 >= i10.length) {
                i10 = x02.c(i10);
                i11 = 0;
            }
            int i12 = i11 + 1;
            i10[i11] = f10;
            if (lVar.D2() == p.END_ARRAY) {
                return x02.f(i10, i12);
            }
            i11 = i12;
        }
    }

    public Object J0(l lVar, g gVar) throws IOException {
        String str;
        p Z0 = lVar.Z0();
        if (Z0 == p.START_OBJECT) {
            str = lVar.y2();
        } else if (Z0 == p.FIELD_NAME) {
            str = lVar.X0();
        } else if (Z0 != p.END_OBJECT) {
            return gVar.i0(r(), lVar);
        } else {
            str = null;
        }
        if (str == null) {
            return new LinkedHashMap(2);
        }
        lVar.D2();
        Object f10 = f(lVar, gVar);
        String y22 = lVar.y2();
        if (y22 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str, f10);
            return linkedHashMap;
        }
        lVar.D2();
        Object f11 = f(lVar, gVar);
        String y23 = lVar.y2();
        if (y23 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str, f10);
            linkedHashMap2.put(y22, f11);
            return linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str, f10);
        linkedHashMap3.put(y22, f11);
        do {
            lVar.D2();
            linkedHashMap3.put(y23, f(lVar, gVar));
            y23 = lVar.y2();
        } while (y23 != null);
        return linkedHashMap3;
    }

    public Object K0(l lVar, g gVar, Map<Object, Object> map) throws IOException {
        p Z0 = lVar.Z0();
        if (Z0 == p.START_OBJECT) {
            Z0 = lVar.D2();
        }
        if (Z0 == p.END_OBJECT) {
            return map;
        }
        String X0 = lVar.X0();
        do {
            lVar.D2();
            Object obj = map.get(X0);
            Object g10 = obj != null ? g(lVar, gVar, obj) : f(lVar, gVar);
            if (g10 != obj) {
                map.put(X0, g10);
            }
            X0 = lVar.y2();
        } while (X0 != null);
        return map;
    }

    public k<?> a(g gVar, d dVar) throws i5.l {
        boolean z10 = dVar == null && Boolean.FALSE.equals(gVar.q().v(Object.class));
        return (this.V == null && this.W == null && this.T == null && this.U == null && getClass() == m0.class) ? a.E0(z10) : z10 != this.Z ? new m0(this, z10) : this;
    }

    public void b(g gVar) throws i5.l {
        j H = gVar.H(Object.class);
        j H2 = gVar.H(String.class);
        n u10 = gVar.u();
        j jVar = this.X;
        this.U = jVar == null ? E0(F0(gVar, u10.C(List.class, H))) : F0(gVar, jVar);
        j jVar2 = this.Y;
        this.T = jVar2 == null ? E0(F0(gVar, u10.I(Map.class, H2, H))) : F0(gVar, jVar2);
        this.V = E0(F0(gVar, H2));
        this.W = E0(F0(gVar, u10.Y(Number.class)));
        j l02 = n.l0();
        this.T = gVar.f0(this.T, (d) null, l02);
        this.U = gVar.f0(this.U, (d) null, l02);
        this.V = gVar.f0(this.V, (d) null, l02);
        this.W = gVar.f0(this.W, (d) null, l02);
    }

    public Object f(l lVar, g gVar) throws IOException {
        switch (lVar.f1()) {
            case 1:
            case 2:
            case 5:
                k<Object> kVar = this.T;
                return kVar != null ? kVar.f(lVar, gVar) : J0(lVar, gVar);
            case 3:
                if (gVar.v0(h.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return I0(lVar, gVar);
                }
                k<Object> kVar2 = this.U;
                return kVar2 != null ? kVar2.f(lVar, gVar) : G0(lVar, gVar);
            case 6:
                k<Object> kVar3 = this.V;
                return kVar3 != null ? kVar3.f(lVar, gVar) : lVar.Y1();
            case 7:
                k<Object> kVar4 = this.W;
                return kVar4 != null ? kVar4.f(lVar, gVar) : gVar.r0(a0.R) ? y(lVar, gVar) : lVar.S1();
            case 8:
                k<Object> kVar5 = this.W;
                return kVar5 != null ? kVar5.f(lVar, gVar) : gVar.v0(h.USE_BIG_DECIMAL_FOR_FLOATS) ? lVar.h1() : lVar.S1();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return lVar.p1();
            default:
                return gVar.i0(Object.class, lVar);
        }
    }

    public Object g(l lVar, g gVar, Object obj) throws IOException {
        if (this.Z) {
            return f(lVar, gVar);
        }
        switch (lVar.f1()) {
            case 1:
            case 2:
            case 5:
                k<Object> kVar = this.T;
                return kVar != null ? kVar.g(lVar, gVar, obj) : obj instanceof Map ? K0(lVar, gVar, (Map) obj) : J0(lVar, gVar);
            case 3:
                k<Object> kVar2 = this.U;
                return kVar2 != null ? kVar2.g(lVar, gVar, obj) : obj instanceof Collection ? H0(lVar, gVar, (Collection) obj) : gVar.v0(h.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? I0(lVar, gVar) : G0(lVar, gVar);
            case 6:
                k<Object> kVar3 = this.V;
                return kVar3 != null ? kVar3.g(lVar, gVar, obj) : lVar.Y1();
            case 7:
                k<Object> kVar4 = this.W;
                return kVar4 != null ? kVar4.g(lVar, gVar, obj) : gVar.r0(a0.R) ? y(lVar, gVar) : lVar.S1();
            case 8:
                k<Object> kVar5 = this.W;
                return kVar5 != null ? kVar5.g(lVar, gVar, obj) : gVar.v0(h.USE_BIG_DECIMAL_FOR_FLOATS) ? lVar.h1() : lVar.S1();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return lVar.p1();
            default:
                return f(lVar, gVar);
        }
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        int f12 = lVar.f1();
        if (!(f12 == 1 || f12 == 3)) {
            switch (f12) {
                case 5:
                    break;
                case 6:
                    k<Object> kVar = this.V;
                    return kVar != null ? kVar.f(lVar, gVar) : lVar.Y1();
                case 7:
                    k<Object> kVar2 = this.W;
                    return kVar2 != null ? kVar2.f(lVar, gVar) : gVar.r0(a0.R) ? y(lVar, gVar) : lVar.S1();
                case 8:
                    k<Object> kVar3 = this.W;
                    return kVar3 != null ? kVar3.f(lVar, gVar) : gVar.v0(h.USE_BIG_DECIMAL_FOR_FLOATS) ? lVar.h1() : lVar.S1();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return lVar.p1();
                default:
                    return gVar.i0(Object.class, lVar);
            }
        }
        return fVar.c(lVar, gVar);
    }

    public boolean s() {
        return true;
    }

    public Boolean u(i5.f fVar) {
        return null;
    }
}
