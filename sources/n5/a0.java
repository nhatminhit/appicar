package n5;

import a6.a;
import c5.i;
import i5.b;
import i5.d;
import i5.g;
import i5.h;
import i5.j;
import i5.k;
import i5.x;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import l5.s;
import l5.v;
import m5.q;
import m5.r;
import u5.f;
import v4.k0;
import v4.n;
import w4.l;
import w4.p;
import y4.c;

public abstract class a0<T> extends k<T> implements Serializable {
    public static final long Q = 1;
    public static final int R = (h.USE_BIG_INTEGER_FOR_INTS.a() | h.USE_LONG_FOR_INTS.a());
    public static final int S = (h.UNWRAP_SINGLE_VALUE_ARRAYS.a() | h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.a());
    public final Class<?> O;
    public final j P;

    public a0(j jVar) {
        this.O = jVar == null ? Object.class : jVar.g();
        this.P = jVar;
    }

    public a0(Class<?> cls) {
        this.O = cls;
        this.P = null;
    }

    public a0(a0<?> a0Var) {
        this.O = a0Var.O;
        this.P = a0Var.P;
    }

    public static final double D0(String str) throws NumberFormatException {
        if (i.f4857a.equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }

    public static final boolean O(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: i5.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: i5.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: i5.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: i5.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A(i5.g r3, boolean r4) throws i5.l {
        /*
            r2 = this;
            i5.q r0 = i5.q.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r3.w(r0)
            if (r1 != 0) goto L_0x000a
            r4 = 1
            goto L_0x0015
        L_0x000a:
            if (r4 == 0) goto L_0x001c
            i5.h r0 = i5.h.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r4 = r3.v0(r0)
            if (r4 == 0) goto L_0x001c
            r4 = 0
        L_0x0015:
            java.lang.String r1 = "String \"null\""
            r2.h0(r3, r4, r0, r1)
            r3 = 0
            return r3
        L_0x001c:
            java.lang.Object r3 = r2.d(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a0.A(i5.g, boolean):java.lang.Object");
    }

    public void A0(l lVar, g gVar, Object obj, String str) throws IOException {
        if (obj == null) {
            obj = r();
        }
        if (!gVar.k0(lVar, this, obj, str)) {
            lVar.Z2();
        }
    }

    public String B() {
        String str;
        StringBuilder sb2;
        String str2;
        j x02 = x0();
        boolean z10 = false;
        if (x02 == null || x02.u()) {
            Class<?> r10 = r();
            if (r10.isArray() || Collection.class.isAssignableFrom(r10) || Map.class.isAssignableFrom(r10)) {
                z10 = true;
            }
            str = a6.h.e0(r10);
        } else {
            if (x02.o() || x02.v()) {
                z10 = true;
            }
            str = "'" + x02.toString() + "'";
        }
        if (z10) {
            sb2 = new StringBuilder();
            str2 = "as content of type ";
        } else {
            sb2 = new StringBuilder();
            str2 = "for type ";
        }
        sb2.append(str2);
        sb2.append(str);
        return sb2.toString();
    }

    public boolean B0(k<?> kVar) {
        return a6.h.Y(kVar);
    }

    public T C(l lVar, g gVar) throws IOException {
        if (gVar.r0(S)) {
            p D2 = lVar.D2();
            p pVar = p.END_ARRAY;
            if (D2 == pVar && gVar.v0(h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return d(gVar);
            }
            if (gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                T f10 = f(lVar, gVar);
                if (lVar.D2() != pVar) {
                    z0(lVar, gVar);
                }
                return f10;
            }
        } else {
            lVar.Z0();
        }
        return gVar.h0(y0(gVar), lVar.Z0(), lVar, (String) null, new Object[0]);
    }

    public boolean C0(i5.p pVar) {
        return a6.h.Y(pVar);
    }

    public T D(l lVar, g gVar) throws IOException {
        p Z0 = lVar.Z0();
        if (Z0 == p.START_ARRAY) {
            if (gVar.v0(h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) && lVar.D2() == p.END_ARRAY) {
                return null;
            }
        } else if (Z0 == p.VALUE_STRING && gVar.v0(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && lVar.Y1().trim().isEmpty()) {
            return null;
        }
        return gVar.i0(r(), lVar);
    }

    public T E(l lVar, g gVar) throws IOException {
        p pVar = p.START_ARRAY;
        if (!lVar.q2(pVar)) {
            return f(lVar, gVar);
        }
        return gVar.h0(y0(gVar), lVar.Z0(), lVar, String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", new Object[]{a6.h.e0(this.O), pVar, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"}), new Object[0]);
    }

    public void F(l lVar, g gVar, String str) throws IOException {
        gVar.P0(r(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", lVar.m2(), str);
    }

    public final s G(g gVar, d dVar, k0 k0Var, k<?> kVar) throws i5.l {
        if (k0Var == k0.FAIL) {
            return dVar == null ? r.e(gVar.H(kVar.r())) : r.a(dVar);
        }
        if (k0Var == k0.AS_EMPTY) {
            if (kVar == null) {
                return null;
            }
            if ((kVar instanceof l5.d) && !((l5.d) kVar).e().i()) {
                j e10 = dVar.e();
                gVar.z(e10, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{e10}));
            }
            a l10 = kVar.l();
            return l10 == a.ALWAYS_NULL ? q.f() : l10 == a.CONSTANT ? q.a(kVar.n(gVar)) : new m5.p(kVar);
        } else if (k0Var == k0.SKIP) {
            return q.g();
        } else {
            return null;
        }
    }

    public boolean H(String str) {
        return "null".equals(str);
    }

    public final boolean I(long j10) {
        return j10 < c.L0 || j10 > c.M0;
    }

    public boolean J(String str) {
        return str.isEmpty() || "null".equals(str);
    }

    public final boolean K(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char charAt = str.charAt(0);
        for (int i10 = (charAt == '-' || charAt == '+') ? 1 : 0; i10 < length; i10++) {
            char charAt2 = str.charAt(i10);
            if (charAt2 > '9' || charAt2 < '0') {
                return false;
            }
        }
        return true;
    }

    public final boolean L(String str) {
        return "NaN".equals(str);
    }

    public final boolean M(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public final boolean N(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public Number P(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }

    public boolean Q(l lVar, g gVar) throws IOException {
        n0(gVar, lVar);
        return !"0".equals(lVar.Y1());
    }

    public final boolean R(g gVar, l lVar, Class<?> cls) throws IOException {
        p Z0 = lVar.Z0();
        if (Z0 == p.VALUE_TRUE) {
            return true;
        }
        if (Z0 == p.VALUE_FALSE) {
            return false;
        }
        if (Z0 == p.VALUE_NULL) {
            k0(gVar);
            return false;
        } else if (Z0 == p.VALUE_NUMBER_INT) {
            return Q(lVar, gVar);
        } else {
            if (Z0 == p.VALUE_STRING) {
                String trim = lVar.Y1().trim();
                if ("true".equals(trim) || "True".equals(trim)) {
                    return true;
                }
                if ("false".equals(trim) || "False".equals(trim)) {
                    return false;
                }
                if (J(trim)) {
                    l0(gVar, trim);
                    return false;
                }
                return Boolean.TRUE.equals((Boolean) gVar.p0(cls, trim, "only \"true\" or \"false\" recognized", new Object[0]));
            } else if (Z0 != p.START_ARRAY || !gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return ((Boolean) gVar.i0(cls, lVar)).booleanValue();
            } else {
                lVar.D2();
                boolean R2 = R(gVar, lVar, cls);
                j0(lVar, gVar);
                return R2;
            }
        }
    }

    @Deprecated
    public final boolean S(l lVar, g gVar) throws IOException {
        return R(gVar, lVar, Boolean.TYPE);
    }

    public final byte T(l lVar, g gVar) throws IOException {
        int c02 = c0(lVar, gVar);
        return w(c02) ? P((Number) gVar.p0(this.O, String.valueOf(c02), "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue() : (byte) c02;
    }

    public Date U(String str, g gVar) throws IOException {
        try {
            return J(str) ? (Date) d(gVar) : gVar.D0(str);
        } catch (IllegalArgumentException e10) {
            return (Date) gVar.p0(this.O, str, "not a valid representation (error: %s)", a6.h.o(e10));
        }
    }

    public Date V(l lVar, g gVar) throws IOException {
        long j10;
        int f12 = lVar.f1();
        if (f12 == 3) {
            return W(lVar, gVar);
        }
        if (f12 == 11) {
            return (Date) d(gVar);
        }
        if (f12 == 6) {
            return U(lVar.Y1().trim(), gVar);
        }
        if (f12 != 7) {
            return (Date) gVar.i0(this.O, lVar);
        }
        try {
            j10 = lVar.P1();
        } catch (w4.k | z4.a unused) {
            j10 = ((Number) gVar.o0(this.O, lVar.S1(), "not a valid 64-bit long for creating `java.util.Date`", new Object[0])).longValue();
        }
        return new Date(j10);
    }

    public Date W(l lVar, g gVar) throws IOException {
        p pVar;
        Object j02;
        if (gVar.r0(S)) {
            pVar = lVar.D2();
            if (pVar != p.END_ARRAY || !gVar.v0(h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                if (gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                    Date V = V(lVar, gVar);
                    j0(lVar, gVar);
                    return V;
                }
                g gVar2 = gVar;
                j02 = gVar2.j0(this.O, pVar, lVar, (String) null, new Object[0]);
            } else {
                j02 = d(gVar);
            }
        } else {
            pVar = lVar.Z0();
            g gVar22 = gVar;
            j02 = gVar22.j0(this.O, pVar, lVar, (String) null, new Object[0]);
        }
        return (Date) j02;
    }

    public final double X(g gVar, String str) throws IOException {
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt == 'N' && L(str)) {
                    return Double.NaN;
                }
            } else if (N(str)) {
                return Double.POSITIVE_INFINITY;
            }
        } else if (M(str)) {
            return Double.NEGATIVE_INFINITY;
        }
        try {
            return D0(str);
        } catch (IllegalArgumentException unused) {
            return P((Number) gVar.p0(this.O, str, "not a valid double value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    public final double Y(l lVar, g gVar) throws IOException {
        if (lVar.q2(p.VALUE_NUMBER_FLOAT)) {
            return lVar.m1();
        }
        int f12 = lVar.f1();
        if (f12 != 3) {
            if (f12 == 11) {
                k0(gVar);
                return 0.0d;
            } else if (f12 == 6) {
                String trim = lVar.Y1().trim();
                if (!J(trim)) {
                    return X(gVar, trim);
                }
                l0(gVar, trim);
                return 0.0d;
            } else if (f12 == 7) {
                return lVar.m1();
            }
        } else if (gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            lVar.D2();
            double Y = Y(lVar, gVar);
            j0(lVar, gVar);
            return Y;
        }
        return ((Number) gVar.i0(this.O, lVar)).doubleValue();
    }

    public final float Z(g gVar, String str) throws IOException {
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt == 'N' && L(str)) {
                    return Float.NaN;
                }
            } else if (N(str)) {
                return Float.POSITIVE_INFINITY;
            }
        } else if (M(str)) {
            return Float.NEGATIVE_INFINITY;
        }
        try {
            return Float.parseFloat(str);
        } catch (IllegalArgumentException unused) {
            return P((Number) gVar.p0(this.O, str, "not a valid float value", new Object[0])).floatValue();
        }
    }

    public final float a0(l lVar, g gVar) throws IOException {
        if (lVar.q2(p.VALUE_NUMBER_FLOAT)) {
            return lVar.A1();
        }
        int f12 = lVar.f1();
        if (f12 != 3) {
            if (f12 == 11) {
                k0(gVar);
                return 0.0f;
            } else if (f12 == 6) {
                String trim = lVar.Y1().trim();
                if (!J(trim)) {
                    return Z(gVar, trim);
                }
                l0(gVar, trim);
                return 0.0f;
            } else if (f12 == 7) {
                return lVar.A1();
            }
        } else if (gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            lVar.D2();
            float a02 = a0(lVar, gVar);
            j0(lVar, gVar);
            return a02;
        }
        return ((Number) gVar.i0(this.O, lVar)).floatValue();
    }

    public final int b0(g gVar, String str) throws IOException {
        try {
            if (str.length() <= 9) {
                return i.k(str);
            }
            long parseLong = Long.parseLong(str);
            if (!I(parseLong)) {
                return (int) parseLong;
            }
            return P((Number) gVar.p0(this.O, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE)).intValue();
        } catch (IllegalArgumentException unused) {
            return P((Number) gVar.p0(this.O, str, "not a valid int value", new Object[0])).intValue();
        }
    }

    public final int c0(l lVar, g gVar) throws IOException {
        if (lVar.q2(p.VALUE_NUMBER_INT)) {
            return lVar.N1();
        }
        int f12 = lVar.f1();
        if (f12 != 3) {
            if (f12 == 6) {
                String trim = lVar.Y1().trim();
                if (!J(trim)) {
                    return b0(gVar, trim);
                }
                l0(gVar, trim);
                return 0;
            } else if (f12 == 8) {
                if (!gVar.v0(h.ACCEPT_FLOAT_AS_INT)) {
                    F(lVar, gVar, "int");
                }
                return lVar.i2();
            } else if (f12 == 11) {
                k0(gVar);
                return 0;
            }
        } else if (gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            lVar.D2();
            int c02 = c0(lVar, gVar);
            j0(lVar, gVar);
            return c02;
        }
        return ((Number) gVar.i0(this.O, lVar)).intValue();
    }

    public final long d0(g gVar, String str) throws IOException {
        try {
            return i.m(str);
        } catch (IllegalArgumentException unused) {
            return P((Number) gVar.p0(this.O, str, "not a valid long value", new Object[0])).longValue();
        }
    }

    public final long e0(l lVar, g gVar) throws IOException {
        if (lVar.q2(p.VALUE_NUMBER_INT)) {
            return lVar.P1();
        }
        int f12 = lVar.f1();
        if (f12 != 3) {
            if (f12 == 6) {
                String trim = lVar.Y1().trim();
                if (!J(trim)) {
                    return d0(gVar, trim);
                }
                l0(gVar, trim);
                return 0;
            } else if (f12 == 8) {
                if (!gVar.v0(h.ACCEPT_FLOAT_AS_INT)) {
                    F(lVar, gVar, "long");
                }
                return lVar.k2();
            } else if (f12 == 11) {
                k0(gVar);
                return 0;
            }
        } else if (gVar.v0(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            lVar.D2();
            long e02 = e0(lVar, gVar);
            j0(lVar, gVar);
            return e02;
        }
        return ((Number) gVar.i0(this.O, lVar)).longValue();
    }

    public final short f0(l lVar, g gVar) throws IOException {
        int c02 = c0(lVar, gVar);
        return i0(c02) ? P((Number) gVar.p0(this.O, String.valueOf(c02), "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue() : (short) c02;
    }

    public final String g0(l lVar, g gVar) throws IOException {
        p Z0 = lVar.Z0();
        if (Z0 == p.VALUE_STRING) {
            return lVar.Y1();
        }
        if (Z0 == p.VALUE_EMBEDDED_OBJECT) {
            Object p12 = lVar.p1();
            if (p12 instanceof byte[]) {
                return gVar.S().i((byte[]) p12, false);
            }
            if (p12 == null) {
                return null;
            }
            return p12.toString();
        }
        String m22 = lVar.m2();
        return m22 != null ? m22 : (String) gVar.i0(String.class, lVar);
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return fVar.c(lVar, gVar);
    }

    public void h0(g gVar, boolean z10, Enum<?> enumR, String str) throws i5.l {
        gVar.O0(this, "Cannot coerce %s to Null value %s (%s `%s.%s` to allow)", str, B(), z10 ? "enable" : "disable", enumR.getClass().getSimpleName(), enumR.name());
    }

    public final boolean i0(int i10) {
        return i10 < -32768 || i10 > 32767;
    }

    public void j0(l lVar, g gVar) throws IOException {
        if (lVar.D2() != p.END_ARRAY) {
            z0(lVar, gVar);
        }
    }

    public final void k0(g gVar) throws i5.l {
        if (gVar.v0(h.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            gVar.O0(this, "Cannot coerce `null` %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", B());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: i5.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: i5.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: i5.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: i5.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l0(i5.g r6, java.lang.String r7) throws i5.l {
        /*
            r5 = this;
            i5.q r0 = i5.q.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r6.w(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x000c
            r1 = r3
            goto L_0x0015
        L_0x000c:
            i5.h r0 = i5.h.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r1 = r6.v0(r0)
            if (r1 == 0) goto L_0x002b
            r1 = r2
        L_0x0015:
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x001e
            java.lang.String r7 = "empty String (\"\")"
            goto L_0x0028
        L_0x001e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            java.lang.String r7 = "String \"%s\""
            java.lang.String r7 = java.lang.String.format(r7, r3)
        L_0x0028:
            r5.h0(r6, r1, r0, r7)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a0.l0(i5.g, java.lang.String):void");
    }

    public final void m0(g gVar, String str) throws i5.l {
        String str2;
        i5.q qVar = i5.q.ALLOW_COERCION_OF_SCALARS;
        if (!gVar.w(qVar)) {
            if (str.isEmpty()) {
                str2 = "empty String (\"\")";
            } else {
                str2 = String.format("String \"%s\"", new Object[]{str});
            }
            h0(gVar, true, qVar, str2);
        }
    }

    public void n0(g gVar, l lVar) throws IOException {
        i5.q qVar = i5.q.ALLOW_COERCION_OF_SCALARS;
        if (!gVar.w(qVar)) {
            gVar.O0(this, "Cannot coerce Number (%s) %s (enable `%s.%s` to allow)", lVar.Y1(), B(), qVar.getClass().getSimpleName(), qVar.name());
        }
    }

    public void o0(g gVar, String str) throws i5.l {
        i5.q qVar = i5.q.ALLOW_COERCION_OF_SCALARS;
        if (!gVar.w(qVar)) {
            gVar.O0(this, "Cannot coerce String \"%s\" %s (enable `%s.%s` to allow)", str, B(), qVar.getClass().getSimpleName(), qVar.name());
        }
    }

    public s p0(g gVar, d dVar, k<?> kVar) throws i5.l {
        k0 q02 = q0(gVar, dVar);
        if (q02 == k0.SKIP) {
            return q.g();
        }
        if (q02 != k0.FAIL) {
            s G = G(gVar, dVar, q02, kVar);
            return G != null ? G : kVar;
        } else if (dVar != null) {
            return r.b(dVar, dVar.e().d());
        } else {
            j H = gVar.H(kVar.r());
            if (H.o()) {
                H = H.d();
            }
            return r.e(H);
        }
    }

    public k0 q0(g gVar, d dVar) throws i5.l {
        if (dVar != null) {
            return dVar.d().c();
        }
        return null;
    }

    public Class<?> r() {
        return this.O;
    }

    public k<?> r0(g gVar, d dVar, k<?> kVar) throws i5.l {
        q5.h i10;
        Object n10;
        b o10 = gVar.o();
        if (!O(o10, dVar) || (i10 = dVar.i()) == null || (n10 = o10.n(i10)) == null) {
            return kVar;
        }
        a6.j<Object, Object> m10 = gVar.m(dVar.i(), n10);
        j b10 = m10.b(gVar.u());
        k<Object> kVar2 = kVar;
        if (kVar == null) {
            kVar2 = gVar.L(b10, dVar);
        }
        return new z(m10, b10, kVar2);
    }

    public k<Object> s0(g gVar, j jVar, d dVar) throws i5.l {
        return gVar.L(jVar, dVar);
    }

    public Boolean t0(g gVar, d dVar, Class<?> cls, n.a aVar) {
        n.d u02 = u0(gVar, dVar, cls);
        if (u02 != null) {
            return u02.h(aVar);
        }
        return null;
    }

    public n.d u0(g gVar, d dVar, Class<?> cls) {
        return dVar != null ? dVar.q(gVar.q(), cls) : gVar.r(cls);
    }

    public final s v0(g gVar, v vVar, x xVar) throws i5.l {
        if (vVar != null) {
            return G(gVar, vVar, xVar.i(), vVar.E());
        }
        return null;
    }

    public final boolean w(int i10) {
        return i10 < -128 || i10 > 255;
    }

    @Deprecated
    public final Class<?> w0() {
        return this.O;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: i5.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: i5.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: i5.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: i5.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object x(i5.g r3, boolean r4) throws i5.l {
        /*
            r2 = this;
            i5.q r0 = i5.q.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r3.w(r0)
            if (r1 != 0) goto L_0x000a
            r4 = 1
            goto L_0x0015
        L_0x000a:
            if (r4 == 0) goto L_0x001c
            i5.h r0 = i5.h.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r4 = r3.v0(r0)
            if (r4 == 0) goto L_0x001c
            r4 = 0
        L_0x0015:
            java.lang.String r1 = "empty String (\"\")"
            r2.h0(r3, r4, r0, r1)
            r3 = 0
            return r3
        L_0x001c:
            java.lang.Object r3 = r2.d(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a0.x(i5.g, boolean):java.lang.Object");
    }

    public j x0() {
        return this.P;
    }

    public Object y(l lVar, g gVar) throws IOException {
        int W = gVar.W();
        return h.USE_BIG_INTEGER_FOR_INTS.d(W) ? lVar.e0() : h.USE_LONG_FOR_INTS.d(W) ? Long.valueOf(lVar.P1()) : lVar.e0();
    }

    public j y0(g gVar) {
        j jVar = this.P;
        return jVar != null ? jVar : gVar.H(this.O);
    }

    public Object z(g gVar, boolean z10) throws i5.l {
        if (z10) {
            k0(gVar);
        }
        return d(gVar);
    }

    public void z0(l lVar, g gVar) throws IOException {
        gVar.Y0(this, p.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", r().getName());
    }
}
