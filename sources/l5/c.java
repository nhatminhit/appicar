package l5;

import a6.b0;
import a6.s;
import i5.g;
import i5.h;
import i5.j;
import i5.k;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m5.v;
import m5.y;
import m5.z;
import w4.l;
import w4.p;

public class c extends d implements Serializable {

    /* renamed from: q0  reason: collision with root package name */
    public static final long f10128q0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public transient Exception f10129o0;

    /* renamed from: p0  reason: collision with root package name */
    public volatile transient s f10130p0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10131a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                w4.p[] r0 = w4.p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10131a = r0
                w4.p r1 = w4.p.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10131a     // Catch:{ NoSuchFieldError -> 0x001d }
                w4.p r1 = w4.p.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10131a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w4.p r1 = w4.p.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10131a     // Catch:{ NoSuchFieldError -> 0x0033 }
                w4.p r1 = w4.p.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10131a     // Catch:{ NoSuchFieldError -> 0x003e }
                w4.p r1 = w4.p.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10131a     // Catch:{ NoSuchFieldError -> 0x0049 }
                w4.p r1 = w4.p.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f10131a     // Catch:{ NoSuchFieldError -> 0x0054 }
                w4.p r1 = w4.p.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f10131a     // Catch:{ NoSuchFieldError -> 0x0060 }
                w4.p r1 = w4.p.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f10131a     // Catch:{ NoSuchFieldError -> 0x006c }
                w4.p r1 = w4.p.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f10131a     // Catch:{ NoSuchFieldError -> 0x0078 }
                w4.p r1 = w4.p.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l5.c.a.<clinit>():void");
        }
    }

    public static class b extends z.a {

        /* renamed from: c  reason: collision with root package name */
        public final g f10132c;

        /* renamed from: d  reason: collision with root package name */
        public final v f10133d;

        /* renamed from: e  reason: collision with root package name */
        public Object f10134e;

        public b(g gVar, w wVar, j jVar, y yVar, v vVar) {
            super(wVar, jVar);
            this.f10132c = gVar;
            this.f10133d = vVar;
        }

        public void c(Object obj, Object obj2) throws IOException {
            if (this.f10134e == null) {
                g gVar = this.f10132c;
                v vVar = this.f10133d;
                gVar.M0(vVar, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", vVar.getName(), this.f10133d.y().getName());
            }
            this.f10133d.M(this.f10134e, obj2);
        }

        public void e(Object obj) {
            this.f10134e = obj;
        }
    }

    public c(d dVar) {
        super(dVar, dVar.f10142f0);
    }

    public c(d dVar, s sVar) {
        super(dVar, sVar);
    }

    public c(d dVar, Set<String> set) {
        super(dVar, set);
    }

    public c(d dVar, m5.c cVar) {
        super(dVar, cVar);
    }

    public c(d dVar, m5.s sVar) {
        super(dVar, sVar);
    }

    public c(d dVar, boolean z10) {
        super(dVar, z10);
    }

    public c(e eVar, i5.c cVar, m5.c cVar2, Map<String, v> map, HashSet<String> hashSet, boolean z10, boolean z11) {
        super(eVar, cVar, cVar2, map, hashSet, z10, z11);
    }

    public final Object A1(l lVar, g gVar, v vVar) throws IOException {
        try {
            return vVar.s(lVar, gVar);
        } catch (Exception e10) {
            w1(e10, this.T.g(), vVar.getName(), gVar);
            return null;
        }
    }

    @Deprecated
    public Object B1(l lVar, g gVar) throws IOException {
        throw gVar.J(r());
    }

    public Object C(l lVar, g gVar) throws IOException {
        k<Object> kVar = this.X;
        if (kVar != null || (kVar = this.W) != null) {
            Object s10 = this.V.s(gVar, kVar.f(lVar, gVar));
            if (this.f10139c0 != null) {
                o1(gVar, s10);
            }
            return s10;
        } else if (gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            p D2 = lVar.D2();
            p pVar = p.END_ARRAY;
            if (D2 == pVar && gVar.v0(h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return null;
            }
            Object f10 = f(lVar, gVar);
            if (lVar.D2() != pVar) {
                z0(lVar, gVar);
            }
            return f10;
        } else if (!gVar.v0(h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            return gVar.g0(y0(gVar), lVar);
        } else {
            if (lVar.D2() == p.END_ARRAY) {
                return null;
            }
            return gVar.h0(y0(gVar), p.START_ARRAY, lVar, (String) null, new Object[0]);
        }
    }

    public Object C1(l lVar, g gVar) throws IOException {
        if (!lVar.R2()) {
            return gVar.g0(y0(gVar), lVar);
        }
        b0 b0Var = new b0(lVar, gVar);
        b0Var.g2();
        l u32 = b0Var.u3(lVar);
        u32.D2();
        Object L1 = this.f10137a0 ? L1(u32, gVar, p.END_OBJECT) : X0(u32, gVar);
        u32.close();
        return L1;
    }

    public Object D1(l lVar, g gVar) throws IOException {
        m5.g i10 = this.f10147k0.i();
        v vVar = this.Y;
        y h10 = vVar.h(lVar, gVar, this.f10148l0);
        b0 b0Var = new b0(lVar, gVar);
        b0Var.V2();
        p Z0 = lVar.Z0();
        while (Z0 == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            v f10 = vVar.f(X0);
            if (f10 != null) {
                if (!i10.g(lVar, gVar, X0, (Object) null) && h10.b(f10, A1(lVar, gVar, f10))) {
                    p D2 = lVar.D2();
                    try {
                        Object a10 = vVar.a(gVar, h10);
                        while (D2 == p.FIELD_NAME) {
                            lVar.D2();
                            b0Var.P(lVar);
                            D2 = lVar.D2();
                        }
                        if (a10.getClass() == this.T.g()) {
                            return i10.e(lVar, gVar, a10);
                        }
                        j jVar = this.T;
                        return gVar.z(jVar, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", new Object[]{jVar, a10.getClass()}));
                    } catch (Exception e10) {
                        w1(e10, this.T.g(), X0, gVar);
                    }
                }
            } else if (!h10.l(X0)) {
                v s10 = this.f10138b0.s(X0);
                if (s10 != null) {
                    h10.e(s10, s10.s(lVar, gVar));
                } else if (!i10.g(lVar, gVar, X0, (Object) null)) {
                    Set<String> set = this.f10141e0;
                    if (set == null || !set.contains(X0)) {
                        u uVar = this.f10140d0;
                        if (uVar != null) {
                            h10.c(uVar, X0, uVar.b(lVar, gVar));
                        } else {
                            A0(lVar, gVar, this.O, X0);
                        }
                    } else {
                        i1(lVar, gVar, r(), X0);
                    }
                }
            }
            Z0 = lVar.D2();
        }
        b0Var.g2();
        try {
            return i10.f(lVar, gVar, h10, vVar);
        } catch (Exception e11) {
            return x1(e11, gVar);
        }
    }

    public Object E1(l lVar, g gVar) throws IOException {
        Object a10;
        v vVar = this.Y;
        y h10 = vVar.h(lVar, gVar, this.f10148l0);
        b0 b0Var = new b0(lVar, gVar);
        b0Var.V2();
        p Z0 = lVar.Z0();
        while (true) {
            if (Z0 == p.FIELD_NAME) {
                String X0 = lVar.X0();
                lVar.D2();
                v f10 = vVar.f(X0);
                if (f10 != null) {
                    if (h10.b(f10, A1(lVar, gVar, f10))) {
                        p D2 = lVar.D2();
                        try {
                            a10 = vVar.a(gVar, h10);
                        } catch (Exception e10) {
                            a10 = x1(e10, gVar);
                        }
                        lVar.T2(a10);
                        while (D2 == p.FIELD_NAME) {
                            b0Var.P(lVar);
                            D2 = lVar.D2();
                        }
                        p pVar = p.END_OBJECT;
                        if (D2 != pVar) {
                            gVar.Y0(this, pVar, "Attempted to unwrap '%s' value", r().getName());
                        }
                        b0Var.g2();
                        if (a10.getClass() != this.T.g()) {
                            gVar.M0(f10, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                            return null;
                        }
                    }
                } else if (!h10.l(X0)) {
                    v s10 = this.f10138b0.s(X0);
                    if (s10 != null) {
                        h10.e(s10, A1(lVar, gVar, s10));
                    } else {
                        Set<String> set = this.f10141e0;
                        if (set != null && set.contains(X0)) {
                            i1(lVar, gVar, r(), X0);
                        } else if (this.f10140d0 == null) {
                            b0Var.i2(X0);
                            b0Var.P(lVar);
                        } else {
                            b0 s32 = b0.s3(lVar);
                            b0Var.i2(X0);
                            b0Var.r3(s32);
                            try {
                                u uVar = this.f10140d0;
                                h10.c(uVar, X0, uVar.b(s32.w3(), gVar));
                            } catch (Exception e11) {
                                w1(e11, this.T.g(), X0, gVar);
                            }
                        }
                    }
                }
                Z0 = lVar.D2();
            } else {
                try {
                    a10 = vVar.a(gVar, h10);
                    break;
                } catch (Exception e12) {
                    x1(e12, gVar);
                    return null;
                }
            }
        }
        return this.f10146j0.b(lVar, gVar, a10, b0Var);
    }

    public Object F1(l lVar, g gVar) throws IOException {
        if (this.Y != null) {
            return D1(lVar, gVar);
        }
        k<Object> kVar = this.W;
        return kVar != null ? this.V.u(gVar, kVar.f(lVar, gVar)) : G1(lVar, gVar, this.V.t(gVar));
    }

    public Object G0(l lVar, g gVar) throws IOException {
        Object obj;
        Object obj2;
        v vVar = this.Y;
        y h10 = vVar.h(lVar, gVar, this.f10148l0);
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        p Z0 = lVar.Z0();
        ArrayList<b> arrayList = null;
        b0 b0Var = null;
        while (Z0 == p.FIELD_NAME) {
            String X0 = lVar.X0();
            lVar.D2();
            if (!h10.l(X0)) {
                v f10 = vVar.f(X0);
                if (f10 == null) {
                    v s10 = this.f10138b0.s(X0);
                    if (s10 != null) {
                        try {
                            h10.e(s10, A1(lVar, gVar, s10));
                        } catch (w e10) {
                            b K1 = K1(gVar, s10, h10, e10);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            arrayList.add(K1);
                        }
                    } else {
                        Set<String> set = this.f10141e0;
                        if (set == null || !set.contains(X0)) {
                            u uVar = this.f10140d0;
                            if (uVar != null) {
                                try {
                                    h10.c(uVar, X0, uVar.b(lVar, gVar));
                                } catch (Exception e11) {
                                    w1(e11, this.T.g(), X0, gVar);
                                }
                            } else {
                                if (b0Var == null) {
                                    b0Var = new b0(lVar, gVar);
                                }
                                b0Var.i2(X0);
                                b0Var.P(lVar);
                            }
                        } else {
                            i1(lVar, gVar, r(), X0);
                        }
                    }
                } else if (n10 != null && !f10.R(n10)) {
                    lVar.Z2();
                } else if (h10.b(f10, A1(lVar, gVar, f10))) {
                    lVar.D2();
                    try {
                        obj2 = vVar.a(gVar, h10);
                    } catch (Exception e12) {
                        obj2 = x1(e12, gVar);
                    }
                    if (obj2 == null) {
                        return gVar.b0(r(), (Object) null, y1());
                    }
                    lVar.T2(obj2);
                    if (obj2.getClass() != this.T.g()) {
                        return j1(lVar, gVar, obj2, b0Var);
                    }
                    if (b0Var != null) {
                        obj2 = k1(gVar, obj2, b0Var);
                    }
                    return g(lVar, gVar, obj2);
                }
            }
            Z0 = lVar.D2();
        }
        try {
            obj = vVar.a(gVar, h10);
        } catch (Exception e13) {
            x1(e13, gVar);
            obj = null;
        }
        if (this.f10139c0 != null) {
            o1(gVar, obj);
        }
        if (arrayList != null) {
            for (b e14 : arrayList) {
                e14.e(obj);
            }
        }
        return b0Var != null ? obj.getClass() != this.T.g() ? j1((l) null, gVar, obj, b0Var) : k1(gVar, obj, b0Var) : obj;
    }

    public Object G1(l lVar, g gVar, Object obj) throws IOException {
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        m5.g i10 = this.f10147k0.i();
        p Z0 = lVar.Z0();
        while (Z0 == p.FIELD_NAME) {
            String X0 = lVar.X0();
            p D2 = lVar.D2();
            v s10 = this.f10138b0.s(X0);
            if (s10 != null) {
                if (D2.k()) {
                    i10.h(lVar, gVar, X0, obj);
                }
                if (n10 == null || s10.R(n10)) {
                    try {
                        s10.t(lVar, gVar, obj);
                    } catch (Exception e10) {
                        w1(e10, obj, X0, gVar);
                    }
                } else {
                    lVar.Z2();
                }
            } else {
                Set<String> set = this.f10141e0;
                if (set != null && set.contains(X0)) {
                    i1(lVar, gVar, obj, X0);
                } else if (!i10.g(lVar, gVar, X0, obj)) {
                    u uVar = this.f10140d0;
                    if (uVar != null) {
                        uVar.c(lVar, gVar, obj, X0);
                    } else {
                        A0(lVar, gVar, obj, X0);
                    }
                }
            }
            Z0 = lVar.D2();
        }
        return i10.e(lVar, gVar, obj);
    }

    public Object H1(l lVar, g gVar) throws IOException {
        k<Object> kVar = this.W;
        if (kVar != null) {
            return this.V.u(gVar, kVar.f(lVar, gVar));
        }
        if (this.Y != null) {
            return E1(lVar, gVar);
        }
        b0 b0Var = new b0(lVar, gVar);
        b0Var.V2();
        Object t10 = this.V.t(gVar);
        lVar.T2(t10);
        if (this.f10139c0 != null) {
            o1(gVar, t10);
        }
        String str = null;
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        if (lVar.r2(5)) {
            str = lVar.X0();
        }
        while (str != null) {
            lVar.D2();
            v s10 = this.f10138b0.s(str);
            if (s10 == null) {
                Set<String> set = this.f10141e0;
                if (set != null && set.contains(str)) {
                    i1(lVar, gVar, t10, str);
                } else if (this.f10140d0 == null) {
                    b0Var.i2(str);
                    b0Var.P(lVar);
                } else {
                    b0 s32 = b0.s3(lVar);
                    b0Var.i2(str);
                    b0Var.r3(s32);
                    this.f10140d0.c(s32.w3(), gVar, t10, str);
                }
            } else if (n10 == null || s10.R(n10)) {
                try {
                    s10.t(lVar, gVar, t10);
                } catch (Exception e10) {
                    w1(e10, t10, str, gVar);
                }
            } else {
                lVar.Z2();
            }
            str = lVar.y2();
        }
        b0Var.g2();
        this.f10146j0.b(lVar, gVar, t10, b0Var);
        return t10;
    }

    public Object I1(l lVar, g gVar, Object obj) throws IOException {
        p Z0 = lVar.Z0();
        if (Z0 == p.START_OBJECT) {
            Z0 = lVar.D2();
        }
        b0 b0Var = new b0(lVar, gVar);
        b0Var.V2();
        Class<?> n10 = this.f10143g0 ? gVar.n() : null;
        while (Z0 == p.FIELD_NAME) {
            String X0 = lVar.X0();
            v s10 = this.f10138b0.s(X0);
            lVar.D2();
            if (s10 == null) {
                Set<String> set = this.f10141e0;
                if (set != null && set.contains(X0)) {
                    i1(lVar, gVar, obj, X0);
                } else if (this.f10140d0 == null) {
                    b0Var.i2(X0);
                    b0Var.P(lVar);
                } else {
                    b0 s32 = b0.s3(lVar);
                    b0Var.i2(X0);
                    b0Var.r3(s32);
                    this.f10140d0.c(s32.w3(), gVar, obj, X0);
                }
            } else if (n10 == null || s10.R(n10)) {
                try {
                    s10.t(lVar, gVar, obj);
                } catch (Exception e10) {
                    w1(e10, obj, X0, gVar);
                }
            } else {
                lVar.Z2();
            }
            Z0 = lVar.D2();
        }
        b0Var.g2();
        this.f10146j0.b(lVar, gVar, obj, b0Var);
        return obj;
    }

    public final Object J1(l lVar, g gVar, Object obj, Class<?> cls) throws IOException {
        if (lVar.r2(5)) {
            String X0 = lVar.X0();
            do {
                lVar.D2();
                v s10 = this.f10138b0.s(X0);
                if (s10 == null) {
                    l1(lVar, gVar, obj, X0);
                } else if (!s10.R(cls)) {
                    lVar.Z2();
                } else {
                    try {
                        s10.t(lVar, gVar, obj);
                    } catch (Exception e10) {
                        w1(e10, obj, X0, gVar);
                    }
                }
                X0 = lVar.y2();
            } while (X0 != null);
        }
        return obj;
    }

    public final b K1(g gVar, v vVar, y yVar, w wVar) throws i5.l {
        b bVar = new b(gVar, wVar, vVar.e(), yVar, vVar);
        wVar.A().a(bVar);
        return bVar;
    }

    public final Object L1(l lVar, g gVar, p pVar) throws IOException {
        Object t10 = this.V.t(gVar);
        lVar.T2(t10);
        if (lVar.r2(5)) {
            String X0 = lVar.X0();
            do {
                lVar.D2();
                v s10 = this.f10138b0.s(X0);
                if (s10 != null) {
                    try {
                        s10.t(lVar, gVar, t10);
                    } catch (Exception e10) {
                        w1(e10, t10, X0, gVar);
                    }
                } else {
                    l1(lVar, gVar, t10, X0);
                }
                X0 = lVar.y2();
            } while (X0 != null);
        }
        return t10;
    }

    /* renamed from: M1 */
    public c t1(Set<String> set) {
        return new c((d) this, set);
    }

    /* renamed from: N1 */
    public c v1(m5.s sVar) {
        return new c((d) this, sVar);
    }

    public d Q0() {
        return new m5.b(this, this.f10138b0.v());
    }

    public Object X0(l lVar, g gVar) throws IOException {
        Class<?> n10;
        Object T1;
        m5.s sVar = this.f10148l0;
        if (sVar != null && sVar.e() && lVar.r2(5) && this.f10148l0.d(lVar.X0(), lVar)) {
            return Y0(lVar, gVar);
        }
        if (this.Z) {
            return this.f10146j0 != null ? H1(lVar, gVar) : this.f10147k0 != null ? F1(lVar, gVar) : Z0(lVar, gVar);
        }
        Object t10 = this.V.t(gVar);
        lVar.T2(t10);
        if (lVar.o() && (T1 = lVar.T1()) != null) {
            K0(lVar, gVar, t10, T1);
        }
        if (this.f10139c0 != null) {
            o1(gVar, t10);
        }
        if (this.f10143g0 && (n10 = gVar.n()) != null) {
            return J1(lVar, gVar, t10, n10);
        }
        if (lVar.r2(5)) {
            String X0 = lVar.X0();
            do {
                lVar.D2();
                v s10 = this.f10138b0.s(X0);
                if (s10 != null) {
                    try {
                        s10.t(lVar, gVar, t10);
                    } catch (Exception e10) {
                        w1(e10, t10, X0, gVar);
                    }
                } else {
                    l1(lVar, gVar, t10, X0);
                }
                X0 = lVar.y2();
            } while (X0 != null);
        }
        return t10;
    }

    public Object f(l lVar, g gVar) throws IOException {
        if (!lVar.v2()) {
            return z1(lVar, gVar, lVar.Z0());
        }
        if (this.f10137a0) {
            return L1(lVar, gVar, lVar.D2());
        }
        lVar.D2();
        return this.f10148l0 != null ? b1(lVar, gVar) : X0(lVar, gVar);
    }

    public Object g(l lVar, g gVar, Object obj) throws IOException {
        String str;
        Class<?> n10;
        lVar.T2(obj);
        if (this.f10139c0 != null) {
            o1(gVar, obj);
        }
        if (this.f10146j0 != null) {
            return I1(lVar, gVar, obj);
        }
        if (this.f10147k0 != null) {
            return G1(lVar, gVar, obj);
        }
        if (lVar.v2()) {
            str = lVar.y2();
            if (str == null) {
                return obj;
            }
        } else if (!lVar.r2(5)) {
            return obj;
        } else {
            str = lVar.X0();
        }
        if (this.f10143g0 && (n10 = gVar.n()) != null) {
            return J1(lVar, gVar, obj, n10);
        }
        do {
            lVar.D2();
            v s10 = this.f10138b0.s(str);
            if (s10 != null) {
                try {
                    s10.t(lVar, gVar, obj);
                } catch (Exception e10) {
                    w1(e10, obj, str, gVar);
                }
            } else {
                l1(lVar, gVar, obj, str);
            }
            str = lVar.y2();
        } while (str != null);
        return obj;
    }

    public d s1(m5.c cVar) {
        return new c((d) this, cVar);
    }

    public d u1(boolean z10) {
        return new c((d) this, z10);
    }

    public k<Object> v(s sVar) {
        if (getClass() != c.class || this.f10130p0 == sVar) {
            return this;
        }
        this.f10130p0 = sVar;
        try {
            return new c((d) this, sVar);
        } finally {
            this.f10130p0 = null;
        }
    }

    public Exception y1() {
        if (this.f10129o0 == null) {
            this.f10129o0 = new NullPointerException("JSON Creator returned null");
        }
        return this.f10129o0;
    }

    public final Object z1(l lVar, g gVar, p pVar) throws IOException {
        if (pVar != null) {
            switch (a.f10131a[pVar.ordinal()]) {
                case 1:
                    return a1(lVar, gVar);
                case 2:
                    return W0(lVar, gVar);
                case 3:
                    return U0(lVar, gVar);
                case 4:
                    return V0(lVar, gVar);
                case 5:
                case 6:
                    return T0(lVar, gVar);
                case 7:
                    return C1(lVar, gVar);
                case 8:
                    return C(lVar, gVar);
                case 9:
                case 10:
                    return this.f10137a0 ? L1(lVar, gVar, pVar) : this.f10148l0 != null ? b1(lVar, gVar) : X0(lVar, gVar);
            }
        }
        return gVar.g0(y0(gVar), lVar);
    }
}
