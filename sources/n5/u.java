package n5;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import w4.p;

public class u {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f10875a = new HashSet<>();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10876a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w4.l$b[] r0 = w4.l.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10876a = r0
                w4.l$b r1 = w4.l.b.INT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10876a     // Catch:{ NoSuchFieldError -> 0x001d }
                w4.l$b r1 = w4.l.b.LONG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10876a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w4.l$b r1 = w4.l.b.BIG_INTEGER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.u.a.<clinit>():void");
        }
    }

    @j5.a
    public static class b extends e0<BigDecimal> {
        public static final b U = new b();

        public b() {
            super((Class<?>) BigDecimal.class);
        }

        /* renamed from: E0 */
        public BigDecimal f(w4.l lVar, i5.g gVar) throws IOException {
            Object C;
            int f12 = lVar.f1();
            if (f12 == 3) {
                C = C(lVar, gVar);
            } else if (f12 == 6) {
                String trim = lVar.Y1().trim();
                if (J(trim)) {
                    m0(gVar, trim);
                    C = d(gVar);
                } else {
                    o0(gVar, trim);
                    try {
                        return new BigDecimal(trim);
                    } catch (IllegalArgumentException unused) {
                        C = gVar.p0(this.O, trim, "not a valid representation", new Object[0]);
                    }
                }
            } else if (f12 == 7 || f12 == 8) {
                return lVar.h1();
            } else {
                C = gVar.i0(this.O, lVar);
            }
            return (BigDecimal) C;
        }

        public Object n(i5.g gVar) {
            return BigDecimal.ZERO;
        }
    }

    @j5.a
    public static class c extends e0<BigInteger> {
        public static final c U = new c();

        public c() {
            super((Class<?>) BigInteger.class);
        }

        /* renamed from: E0 */
        public BigInteger f(w4.l lVar, i5.g gVar) throws IOException {
            int f12 = lVar.f1();
            if (f12 == 3) {
                return (BigInteger) C(lVar, gVar);
            }
            if (f12 != 6) {
                if (f12 == 7) {
                    int i10 = a.f10876a[lVar.R1().ordinal()];
                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                        return lVar.e0();
                    }
                } else if (f12 == 8) {
                    if (!gVar.v0(i5.h.ACCEPT_FLOAT_AS_INT)) {
                        F(lVar, gVar, "java.math.BigInteger");
                    }
                    return lVar.h1().toBigInteger();
                }
                return (BigInteger) gVar.i0(this.O, lVar);
            }
            String trim = lVar.Y1().trim();
            if (J(trim)) {
                m0(gVar, trim);
                return (BigInteger) d(gVar);
            }
            o0(gVar, trim);
            try {
                return new BigInteger(trim);
            } catch (IllegalArgumentException unused) {
                return (BigInteger) gVar.p0(this.O, trim, "not a valid representation", new Object[0]);
            }
        }

        public Object n(i5.g gVar) {
            return BigInteger.ZERO;
        }
    }

    @j5.a
    public static final class d extends l<Boolean> {
        public static final long Y = 1;
        public static final d Z = new d(Boolean.TYPE, Boolean.FALSE);

        /* renamed from: a0  reason: collision with root package name */
        public static final d f10877a0 = new d(Boolean.class, (Boolean) null);

        public d(Class<Boolean> cls, Boolean bool) {
            super(cls, bool, Boolean.FALSE);
        }

        public final Boolean E0(w4.l lVar, i5.g gVar) throws IOException {
            p Z0 = lVar.Z0();
            if (Z0 == p.VALUE_NULL) {
                return (Boolean) z(gVar, this.W);
            }
            if (Z0 == p.START_ARRAY) {
                return (Boolean) C(lVar, gVar);
            }
            if (Z0 == p.VALUE_NUMBER_INT) {
                return Boolean.valueOf(Q(lVar, gVar));
            }
            if (Z0 != p.VALUE_STRING) {
                return Z0 == p.VALUE_TRUE ? Boolean.TRUE : Z0 == p.VALUE_FALSE ? Boolean.FALSE : (Boolean) gVar.i0(this.O, lVar);
            }
            String trim = lVar.Y1().trim();
            if ("true".equals(trim) || "True".equals(trim)) {
                o0(gVar, trim);
                return Boolean.TRUE;
            } else if (!"false".equals(trim) && !"False".equals(trim)) {
                return trim.length() == 0 ? (Boolean) x(gVar, this.W) : H(trim) ? (Boolean) A(gVar, this.W) : (Boolean) gVar.p0(this.O, trim, "only \"true\" or \"false\" recognized", new Object[0]);
            } else {
                o0(gVar, trim);
                return Boolean.FALSE;
            }
        }

        /* renamed from: F0 */
        public Boolean f(w4.l lVar, i5.g gVar) throws IOException {
            p Z0 = lVar.Z0();
            return Z0 == p.VALUE_TRUE ? Boolean.TRUE : Z0 == p.VALUE_FALSE ? Boolean.FALSE : E0(lVar, gVar);
        }

        /* renamed from: G0 */
        public Boolean h(w4.l lVar, i5.g gVar, u5.f fVar) throws IOException {
            p Z0 = lVar.Z0();
            return Z0 == p.VALUE_TRUE ? Boolean.TRUE : Z0 == p.VALUE_FALSE ? Boolean.FALSE : E0(lVar, gVar);
        }

        public /* bridge */ /* synthetic */ a6.a c() {
            return super.c();
        }

        public /* bridge */ /* synthetic */ Object n(i5.g gVar) throws i5.l {
            return super.n(gVar);
        }
    }

    @j5.a
    public static class e extends l<Byte> {
        public static final long Y = 1;
        public static final e Z = new e(Byte.TYPE, (byte) 0);

        /* renamed from: a0  reason: collision with root package name */
        public static final e f10878a0 = new e(Byte.class, (Byte) null);

        public e(Class<Byte> cls, Byte b10) {
            super(cls, b10, (byte) 0);
        }

        public Byte E0(w4.l lVar, i5.g gVar) throws IOException {
            p Z0 = lVar.Z0();
            if (Z0 == p.VALUE_STRING) {
                String trim = lVar.Y1().trim();
                if (H(trim)) {
                    return (Byte) A(gVar, this.W);
                }
                if (trim.length() == 0) {
                    return (Byte) x(gVar, this.W);
                }
                o0(gVar, trim);
                try {
                    int k10 = c5.i.k(trim);
                    return w(k10) ? (Byte) gVar.p0(this.O, trim, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) k10);
                } catch (IllegalArgumentException unused) {
                    return (Byte) gVar.p0(this.O, trim, "not a valid Byte value", new Object[0]);
                }
            } else if (Z0 != p.VALUE_NUMBER_FLOAT) {
                return Z0 == p.VALUE_NULL ? (Byte) z(gVar, this.W) : Z0 == p.START_ARRAY ? (Byte) C(lVar, gVar) : Z0 == p.VALUE_NUMBER_INT ? Byte.valueOf(lVar.H0()) : (Byte) gVar.i0(this.O, lVar);
            } else {
                if (!gVar.v0(i5.h.ACCEPT_FLOAT_AS_INT)) {
                    F(lVar, gVar, "Byte");
                }
                return Byte.valueOf(lVar.H0());
            }
        }

        /* renamed from: F0 */
        public Byte f(w4.l lVar, i5.g gVar) throws IOException {
            return lVar.q2(p.VALUE_NUMBER_INT) ? Byte.valueOf(lVar.H0()) : E0(lVar, gVar);
        }

        public /* bridge */ /* synthetic */ a6.a c() {
            return super.c();
        }

        public /* bridge */ /* synthetic */ Object n(i5.g gVar) throws i5.l {
            return super.n(gVar);
        }
    }

    @j5.a
    public static class f extends l<Character> {
        public static final long Y = 1;
        public static final f Z = new f(Character.TYPE, 0);

        /* renamed from: a0  reason: collision with root package name */
        public static final f f10879a0 = new f(Character.class, (Character) null);

        public f(Class<Character> cls, Character ch2) {
            super(cls, ch2, 0);
        }

        /* renamed from: E0 */
        public Character f(w4.l lVar, i5.g gVar) throws IOException {
            int f12 = lVar.f1();
            if (f12 == 3) {
                return (Character) C(lVar, gVar);
            }
            if (f12 == 11) {
                return (Character) z(gVar, this.W);
            }
            if (f12 == 6) {
                String Y1 = lVar.Y1();
                if (Y1.length() == 1) {
                    return Character.valueOf(Y1.charAt(0));
                }
                if (Y1.length() == 0) {
                    return (Character) x(gVar, this.W);
                }
            } else if (f12 == 7) {
                n0(gVar, lVar);
                int N1 = lVar.N1();
                if (N1 >= 0 && N1 <= 65535) {
                    return Character.valueOf((char) N1);
                }
            }
            return (Character) gVar.i0(this.O, lVar);
        }

        public /* bridge */ /* synthetic */ a6.a c() {
            return super.c();
        }

        public /* bridge */ /* synthetic */ Object n(i5.g gVar) throws i5.l {
            return super.n(gVar);
        }
    }

    @j5.a
    public static class g extends l<Double> {
        public static final long Y = 1;
        public static final g Z = new g(Double.TYPE, Double.valueOf(0.0d));

        /* renamed from: a0  reason: collision with root package name */
        public static final g f10880a0 = new g(Double.class, (Double) null);

        public g(Class<Double> cls, Double d10) {
            super(cls, d10, Double.valueOf(0.0d));
        }

        public final Double E0(w4.l lVar, i5.g gVar) throws IOException {
            p Z0 = lVar.Z0();
            if (Z0 == p.VALUE_NUMBER_INT || Z0 == p.VALUE_NUMBER_FLOAT) {
                return Double.valueOf(lVar.m1());
            }
            if (Z0 != p.VALUE_STRING) {
                return Z0 == p.VALUE_NULL ? (Double) z(gVar, this.W) : Z0 == p.START_ARRAY ? (Double) C(lVar, gVar) : (Double) gVar.i0(this.O, lVar);
            }
            String trim = lVar.Y1().trim();
            if (trim.length() == 0) {
                return (Double) x(gVar, this.W);
            }
            if (H(trim)) {
                return (Double) A(gVar, this.W);
            }
            char charAt = trim.charAt(0);
            if (charAt != '-') {
                if (charAt != 'I') {
                    if (charAt == 'N' && L(trim)) {
                        return Double.valueOf(Double.NaN);
                    }
                } else if (N(trim)) {
                    return Double.valueOf(Double.POSITIVE_INFINITY);
                }
            } else if (M(trim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            o0(gVar, trim);
            try {
                return Double.valueOf(a0.D0(trim));
            } catch (IllegalArgumentException unused) {
                return (Double) gVar.p0(this.O, trim, "not a valid Double value", new Object[0]);
            }
        }

        /* renamed from: F0 */
        public Double f(w4.l lVar, i5.g gVar) throws IOException {
            return E0(lVar, gVar);
        }

        /* renamed from: G0 */
        public Double h(w4.l lVar, i5.g gVar, u5.f fVar) throws IOException {
            return E0(lVar, gVar);
        }

        public /* bridge */ /* synthetic */ a6.a c() {
            return super.c();
        }

        public /* bridge */ /* synthetic */ Object n(i5.g gVar) throws i5.l {
            return super.n(gVar);
        }
    }

    @j5.a
    public static class h extends l<Float> {
        public static final long Y = 1;
        public static final h Z = new h(Float.TYPE, Float.valueOf(0.0f));

        /* renamed from: a0  reason: collision with root package name */
        public static final h f10881a0 = new h(Float.class, (Float) null);

        public h(Class<Float> cls, Float f10) {
            super(cls, f10, Float.valueOf(0.0f));
        }

        public final Float E0(w4.l lVar, i5.g gVar) throws IOException {
            p Z0 = lVar.Z0();
            if (Z0 == p.VALUE_NUMBER_FLOAT || Z0 == p.VALUE_NUMBER_INT) {
                return Float.valueOf(lVar.A1());
            }
            if (Z0 != p.VALUE_STRING) {
                return Z0 == p.VALUE_NULL ? (Float) z(gVar, this.W) : Z0 == p.START_ARRAY ? (Float) C(lVar, gVar) : (Float) gVar.i0(this.O, lVar);
            }
            String trim = lVar.Y1().trim();
            if (trim.length() == 0) {
                return (Float) x(gVar, this.W);
            }
            if (H(trim)) {
                return (Float) A(gVar, this.W);
            }
            char charAt = trim.charAt(0);
            if (charAt != '-') {
                if (charAt != 'I') {
                    if (charAt == 'N' && L(trim)) {
                        return Float.valueOf(Float.NaN);
                    }
                } else if (N(trim)) {
                    return Float.valueOf(Float.POSITIVE_INFINITY);
                }
            } else if (M(trim)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            o0(gVar, trim);
            try {
                return Float.valueOf(Float.parseFloat(trim));
            } catch (IllegalArgumentException unused) {
                return (Float) gVar.p0(this.O, trim, "not a valid Float value", new Object[0]);
            }
        }

        /* renamed from: F0 */
        public Float f(w4.l lVar, i5.g gVar) throws IOException {
            return E0(lVar, gVar);
        }

        public /* bridge */ /* synthetic */ a6.a c() {
            return super.c();
        }

        public /* bridge */ /* synthetic */ Object n(i5.g gVar) throws i5.l {
            return super.n(gVar);
        }
    }

    @j5.a
    public static final class i extends l<Integer> {
        public static final long Y = 1;
        public static final i Z = new i(Integer.TYPE, 0);

        /* renamed from: a0  reason: collision with root package name */
        public static final i f10882a0 = new i(Integer.class, (Integer) null);

        public i(Class<Integer> cls, Integer num) {
            super(cls, num, 0);
        }

        public final Integer E0(w4.l lVar, i5.g gVar) throws IOException {
            int f12 = lVar.f1();
            if (f12 == 3) {
                return (Integer) C(lVar, gVar);
            }
            if (f12 == 11) {
                return (Integer) z(gVar, this.W);
            }
            if (f12 == 6) {
                String trim = lVar.Y1().trim();
                int length = trim.length();
                if (length == 0) {
                    return (Integer) x(gVar, this.W);
                }
                if (H(trim)) {
                    return (Integer) A(gVar, this.W);
                }
                o0(gVar, trim);
                if (length <= 9) {
                    return Integer.valueOf(c5.i.k(trim));
                }
                try {
                    long parseLong = Long.parseLong(trim);
                    if (!I(parseLong)) {
                        return Integer.valueOf((int) parseLong);
                    }
                    return (Integer) gVar.p0(this.O, trim, String.format("Overflow: numeric value (%s) out of range of Integer (%d - %d)", new Object[]{trim, Integer.MIN_VALUE, Integer.MAX_VALUE}), new Object[0]);
                } catch (IllegalArgumentException unused) {
                    return (Integer) gVar.p0(this.O, trim, "not a valid Integer value", new Object[0]);
                }
            } else if (f12 == 7) {
                return Integer.valueOf(lVar.N1());
            } else {
                if (f12 != 8) {
                    return (Integer) gVar.i0(this.O, lVar);
                }
                if (!gVar.v0(i5.h.ACCEPT_FLOAT_AS_INT)) {
                    F(lVar, gVar, "Integer");
                }
                return Integer.valueOf(lVar.i2());
            }
        }

        /* renamed from: F0 */
        public Integer f(w4.l lVar, i5.g gVar) throws IOException {
            return lVar.q2(p.VALUE_NUMBER_INT) ? Integer.valueOf(lVar.N1()) : E0(lVar, gVar);
        }

        /* renamed from: G0 */
        public Integer h(w4.l lVar, i5.g gVar, u5.f fVar) throws IOException {
            return lVar.q2(p.VALUE_NUMBER_INT) ? Integer.valueOf(lVar.N1()) : E0(lVar, gVar);
        }

        public /* bridge */ /* synthetic */ a6.a c() {
            return super.c();
        }

        public /* bridge */ /* synthetic */ Object n(i5.g gVar) throws i5.l {
            return super.n(gVar);
        }

        public boolean s() {
            return true;
        }
    }

    @j5.a
    public static final class j extends l<Long> {
        public static final long Y = 1;
        public static final j Z = new j(Long.TYPE, 0L);

        /* renamed from: a0  reason: collision with root package name */
        public static final j f10883a0 = new j(Long.class, (Long) null);

        public j(Class<Long> cls, Long l10) {
            super(cls, l10, 0L);
        }

        public final Long E0(w4.l lVar, i5.g gVar) throws IOException {
            int f12 = lVar.f1();
            if (f12 == 3) {
                return (Long) C(lVar, gVar);
            }
            if (f12 == 11) {
                return (Long) z(gVar, this.W);
            }
            if (f12 == 6) {
                String trim = lVar.Y1().trim();
                if (trim.length() == 0) {
                    return (Long) x(gVar, this.W);
                }
                if (H(trim)) {
                    return (Long) A(gVar, this.W);
                }
                o0(gVar, trim);
                try {
                    return Long.valueOf(c5.i.m(trim));
                } catch (IllegalArgumentException unused) {
                    return (Long) gVar.p0(this.O, trim, "not a valid Long value", new Object[0]);
                }
            } else if (f12 == 7) {
                return Long.valueOf(lVar.P1());
            } else {
                if (f12 != 8) {
                    return (Long) gVar.i0(this.O, lVar);
                }
                if (!gVar.v0(i5.h.ACCEPT_FLOAT_AS_INT)) {
                    F(lVar, gVar, "Long");
                }
                return Long.valueOf(lVar.k2());
            }
        }

        /* renamed from: F0 */
        public Long f(w4.l lVar, i5.g gVar) throws IOException {
            return lVar.q2(p.VALUE_NUMBER_INT) ? Long.valueOf(lVar.P1()) : E0(lVar, gVar);
        }

        public /* bridge */ /* synthetic */ a6.a c() {
            return super.c();
        }

        public /* bridge */ /* synthetic */ Object n(i5.g gVar) throws i5.l {
            return super.n(gVar);
        }

        public boolean s() {
            return true;
        }
    }

    @j5.a
    public static class k extends e0<Object> {
        public static final k U = new k();

        public k() {
            super((Class<?>) Number.class);
        }

        public Object f(w4.l lVar, i5.g gVar) throws IOException {
            int f12 = lVar.f1();
            if (f12 == 3) {
                return C(lVar, gVar);
            }
            if (f12 != 6) {
                return f12 != 7 ? f12 != 8 ? gVar.i0(this.O, lVar) : (!gVar.v0(i5.h.USE_BIG_DECIMAL_FOR_FLOATS) || lVar.w2()) ? lVar.S1() : lVar.h1() : gVar.r0(a0.R) ? y(lVar, gVar) : lVar.S1();
            }
            String trim = lVar.Y1().trim();
            if (trim.length() == 0) {
                return d(gVar);
            }
            if (H(trim)) {
                return d(gVar);
            }
            if (N(trim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (M(trim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (L(trim)) {
                return Double.valueOf(Double.NaN);
            }
            o0(gVar, trim);
            try {
                if (!K(trim)) {
                    return gVar.v0(i5.h.USE_BIG_DECIMAL_FOR_FLOATS) ? new BigDecimal(trim) : Double.valueOf(trim);
                }
                if (gVar.v0(i5.h.USE_BIG_INTEGER_FOR_INTS)) {
                    return new BigInteger(trim);
                }
                long parseLong = Long.parseLong(trim);
                return (gVar.v0(i5.h.USE_LONG_FOR_INTS) || parseLong > y4.c.M0 || parseLong < y4.c.L0) ? Long.valueOf(parseLong) : Integer.valueOf((int) parseLong);
            } catch (IllegalArgumentException unused) {
                return gVar.p0(this.O, trim, "not a valid number", new Object[0]);
            }
        }

        public Object h(w4.l lVar, i5.g gVar, u5.f fVar) throws IOException {
            int f12 = lVar.f1();
            return (f12 == 6 || f12 == 7 || f12 == 8) ? f(lVar, gVar) : fVar.f(lVar, gVar);
        }
    }

    public static abstract class l<T> extends e0<T> {
        public static final long X = 1;
        public final T U;
        public final T V;
        public final boolean W;

        public l(Class<T> cls, T t10, T t11) {
            super((Class<?>) cls);
            this.U = t10;
            this.V = t11;
            this.W = cls.isPrimitive();
        }

        public a6.a c() {
            return this.W ? a6.a.DYNAMIC : this.U == null ? a6.a.ALWAYS_NULL : a6.a.CONSTANT;
        }

        public final T d(i5.g gVar) throws i5.l {
            if (this.W && gVar.v0(i5.h.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                gVar.O0(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", r().toString());
            }
            return this.U;
        }

        public Object n(i5.g gVar) throws i5.l {
            return this.V;
        }
    }

    @j5.a
    public static class m extends l<Short> {
        public static final long Y = 1;
        public static final m Z = new m(Short.TYPE, 0);

        /* renamed from: a0  reason: collision with root package name */
        public static final m f10884a0 = new m(Short.class, (Short) null);

        public m(Class<Short> cls, Short sh2) {
            super(cls, sh2, (short) 0);
        }

        public Short E0(w4.l lVar, i5.g gVar) throws IOException {
            p Z0 = lVar.Z0();
            if (Z0 == p.VALUE_NUMBER_INT) {
                return Short.valueOf(lVar.W1());
            }
            if (Z0 == p.VALUE_STRING) {
                String trim = lVar.Y1().trim();
                if (trim.length() == 0) {
                    return (Short) x(gVar, this.W);
                }
                if (H(trim)) {
                    return (Short) A(gVar, this.W);
                }
                o0(gVar, trim);
                try {
                    int k10 = c5.i.k(trim);
                    return i0(k10) ? (Short) gVar.p0(this.O, trim, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) k10);
                } catch (IllegalArgumentException unused) {
                    return (Short) gVar.p0(this.O, trim, "not a valid Short value", new Object[0]);
                }
            } else if (Z0 != p.VALUE_NUMBER_FLOAT) {
                return Z0 == p.VALUE_NULL ? (Short) z(gVar, this.W) : Z0 == p.START_ARRAY ? (Short) C(lVar, gVar) : (Short) gVar.i0(this.O, lVar);
            } else {
                if (!gVar.v0(i5.h.ACCEPT_FLOAT_AS_INT)) {
                    F(lVar, gVar, "Short");
                }
                return Short.valueOf(lVar.W1());
            }
        }

        /* renamed from: F0 */
        public Short f(w4.l lVar, i5.g gVar) throws IOException {
            return E0(lVar, gVar);
        }

        public /* bridge */ /* synthetic */ a6.a c() {
            return super.c();
        }

        public /* bridge */ /* synthetic */ Object n(i5.g gVar) throws i5.l {
            return super.n(gVar);
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i10 = 0; i10 < 11; i10++) {
            f10875a.add(clsArr[i10].getName());
        }
    }

    public static i5.k<?> a(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return i.Z;
            }
            if (cls == Boolean.TYPE) {
                return d.Z;
            }
            if (cls == Long.TYPE) {
                return j.Z;
            }
            if (cls == Double.TYPE) {
                return g.Z;
            }
            if (cls == Character.TYPE) {
                return f.Z;
            }
            if (cls == Byte.TYPE) {
                return e.Z;
            }
            if (cls == Short.TYPE) {
                return m.Z;
            }
            if (cls == Float.TYPE) {
                return h.Z;
            }
            if (cls == Void.TYPE) {
                return t.U;
            }
        } else if (!f10875a.contains(str)) {
            return null;
        } else {
            if (cls == Integer.class) {
                return i.f10882a0;
            }
            if (cls == Boolean.class) {
                return d.f10877a0;
            }
            if (cls == Long.class) {
                return j.f10883a0;
            }
            if (cls == Double.class) {
                return g.f10880a0;
            }
            if (cls == Character.class) {
                return f.f10879a0;
            }
            if (cls == Byte.class) {
                return e.f10878a0;
            }
            if (cls == Short.class) {
                return m.f10884a0;
            }
            if (cls == Float.class) {
                return h.f10881a0;
            }
            if (cls == Number.class) {
                return k.U;
            }
            if (cls == BigDecimal.class) {
                return b.U;
            }
            if (cls == BigInteger.class) {
                return c.U;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }
}
