package a6;

import d5.f;
import i5.g;
import i5.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import w4.a0;
import w4.i;
import w4.j;
import w4.k;
import w4.l;
import w4.o;
import w4.p;
import w4.s;
import w4.u;

public class b0 extends i {

    /* renamed from: e0  reason: collision with root package name */
    public static final int f211e0 = i.b.a();
    public s P;
    public o Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public c X;
    public c Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public Object f212a0;

    /* renamed from: b0  reason: collision with root package name */
    public Object f213b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f214c0;

    /* renamed from: d0  reason: collision with root package name */
    public f f215d0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f216a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f217b;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00bd */
        static {
            /*
                w4.l$b[] r0 = w4.l.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f217b = r0
                r1 = 1
                w4.l$b r2 = w4.l.b.INT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f217b     // Catch:{ NoSuchFieldError -> 0x001d }
                w4.l$b r3 = w4.l.b.BIG_INTEGER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f217b     // Catch:{ NoSuchFieldError -> 0x0028 }
                w4.l$b r4 = w4.l.b.BIG_DECIMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f217b     // Catch:{ NoSuchFieldError -> 0x0033 }
                w4.l$b r5 = w4.l.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f217b     // Catch:{ NoSuchFieldError -> 0x003e }
                w4.l$b r6 = w4.l.b.LONG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                w4.p[] r5 = w4.p.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f216a = r5
                w4.p r6 = w4.p.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f216a     // Catch:{ NoSuchFieldError -> 0x0059 }
                w4.p r5 = w4.p.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x0063 }
                w4.p r1 = w4.p.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x006d }
                w4.p r1 = w4.p.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x0077 }
                w4.p r1 = w4.p.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x0082 }
                w4.p r1 = w4.p.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x008d }
                w4.p r1 = w4.p.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x0099 }
                w4.p r1 = w4.p.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x00a5 }
                w4.p r1 = w4.p.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x00b1 }
                w4.p r1 = w4.p.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x00b1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b1 }
            L_0x00b1:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x00bd }
                w4.p r1 = w4.p.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = f216a     // Catch:{ NoSuchFieldError -> 0x00c9 }
                w4.p r1 = w4.p.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x00c9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c9 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c9 }
            L_0x00c9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a6.b0.a.<clinit>():void");
        }
    }

    public static final class b extends y4.c {
        public s S0;
        public final boolean T0;
        public final boolean U0;
        public final boolean V0;
        public c W0;
        public int X0;
        public c0 Y0;
        public boolean Z0;

        /* renamed from: a1  reason: collision with root package name */
        public transient h5.c f218a1;

        /* renamed from: b1  reason: collision with root package name */
        public j f219b1;

        @Deprecated
        public b(c cVar, s sVar, boolean z10, boolean z11) {
            this(cVar, sVar, z10, z11, (o) null);
        }

        public b(c cVar, s sVar, boolean z10, boolean z11, o oVar) {
            super(0);
            this.f219b1 = null;
            this.W0 = cVar;
            this.X0 = -1;
            this.S0 = sVar;
            this.Y0 = c0.t(oVar);
            this.T0 = z10;
            this.U0 = z11;
            this.V0 = z10 | z11;
        }

        public float A1() throws IOException {
            return S1().floatValue();
        }

        public p D2() throws IOException {
            c cVar;
            c0 u10;
            if (this.Z0 || (cVar = this.W0) == null) {
                return null;
            }
            int i10 = this.X0 + 1;
            this.X0 = i10;
            if (i10 >= 16) {
                this.X0 = 0;
                c n10 = cVar.n();
                this.W0 = n10;
                if (n10 == null) {
                    return null;
                }
            }
            p t10 = this.W0.t(this.X0);
            this.U = t10;
            if (t10 == p.FIELD_NAME) {
                Object I3 = I3();
                this.Y0.v(I3 instanceof String ? (String) I3 : I3.toString());
            } else {
                if (t10 == p.START_OBJECT) {
                    u10 = this.Y0.s();
                } else if (t10 == p.START_ARRAY) {
                    u10 = this.Y0.r();
                } else if (t10 == p.END_OBJECT || t10 == p.END_ARRAY) {
                    u10 = this.Y0.u();
                } else {
                    this.Y0.w();
                }
                this.Y0 = u10;
            }
            return this.U;
        }

        public void F2(String str) {
            o oVar = this.Y0;
            p pVar = this.U;
            if (pVar == p.START_OBJECT || pVar == p.START_ARRAY) {
                oVar = oVar.e();
            }
            if (oVar instanceof c0) {
                try {
                    ((c0) oVar).v(str);
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        public final void F3() throws k {
            p pVar = this.U;
            if (pVar == null || !pVar.j()) {
                throw k("Current token (" + this.U + ") not numeric, cannot use numeric value accessors");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (y4.c.E0.compareTo(r0) >= 0) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
            if (y4.c.K0.compareTo(r0) >= 0) goto L_0x0051;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int G3(java.lang.Number r5) throws java.io.IOException {
            /*
                r4 = this;
                boolean r0 = r5 instanceof java.lang.Long
                if (r0 == 0) goto L_0x0012
                long r0 = r5.longValue()
                int r5 = (int) r0
                long r2 = (long) r5
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x0011
                r4.y3()
            L_0x0011:
                return r5
            L_0x0012:
                boolean r0 = r5 instanceof java.math.BigInteger
                if (r0 == 0) goto L_0x002d
                r0 = r5
                java.math.BigInteger r0 = (java.math.BigInteger) r0
                java.math.BigInteger r1 = y4.c.D0
                int r1 = r1.compareTo(r0)
                if (r1 > 0) goto L_0x0029
                java.math.BigInteger r1 = y4.c.E0
                int r0 = r1.compareTo(r0)
                if (r0 >= 0) goto L_0x0051
            L_0x0029:
                r4.y3()
                goto L_0x0051
            L_0x002d:
                boolean r0 = r5 instanceof java.lang.Double
                if (r0 != 0) goto L_0x0056
                boolean r0 = r5 instanceof java.lang.Float
                if (r0 == 0) goto L_0x0036
                goto L_0x0056
            L_0x0036:
                boolean r0 = r5 instanceof java.math.BigDecimal
                if (r0 == 0) goto L_0x004e
                r0 = r5
                java.math.BigDecimal r0 = (java.math.BigDecimal) r0
                java.math.BigDecimal r1 = y4.c.J0
                int r1 = r1.compareTo(r0)
                if (r1 > 0) goto L_0x0029
                java.math.BigDecimal r1 = y4.c.K0
                int r0 = r1.compareTo(r0)
                if (r0 >= 0) goto L_0x0051
                goto L_0x0029
            L_0x004e:
                r4.u3()
            L_0x0051:
                int r5 = r5.intValue()
                return r5
            L_0x0056:
                double r0 = r5.doubleValue()
                r2 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L_0x0069
                r2 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x006c
            L_0x0069:
                r4.y3()
            L_0x006c:
                int r5 = (int) r0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: a6.b0.b.G3(java.lang.Number):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
            if (y4.c.I0.compareTo(r0) >= 0) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
            if (y4.c.G0.compareTo(r0) >= 0) goto L_0x003f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long H3(java.lang.Number r5) throws java.io.IOException {
            /*
                r4 = this;
                boolean r0 = r5 instanceof java.math.BigInteger
                if (r0 == 0) goto L_0x001b
                r0 = r5
                java.math.BigInteger r0 = (java.math.BigInteger) r0
                java.math.BigInteger r1 = y4.c.F0
                int r1 = r1.compareTo(r0)
                if (r1 > 0) goto L_0x0017
                java.math.BigInteger r1 = y4.c.G0
                int r0 = r1.compareTo(r0)
                if (r0 >= 0) goto L_0x003f
            L_0x0017:
                r4.B3()
                goto L_0x003f
            L_0x001b:
                boolean r0 = r5 instanceof java.lang.Double
                if (r0 != 0) goto L_0x0044
                boolean r0 = r5 instanceof java.lang.Float
                if (r0 == 0) goto L_0x0024
                goto L_0x0044
            L_0x0024:
                boolean r0 = r5 instanceof java.math.BigDecimal
                if (r0 == 0) goto L_0x003c
                r0 = r5
                java.math.BigDecimal r0 = (java.math.BigDecimal) r0
                java.math.BigDecimal r1 = y4.c.H0
                int r1 = r1.compareTo(r0)
                if (r1 > 0) goto L_0x0017
                java.math.BigDecimal r1 = y4.c.I0
                int r0 = r1.compareTo(r0)
                if (r0 >= 0) goto L_0x003f
                goto L_0x0017
            L_0x003c:
                r4.u3()
            L_0x003f:
                long r0 = r5.longValue()
                return r0
            L_0x0044:
                double r0 = r5.doubleValue()
                r2 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L_0x0054
                r2 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x0057
            L_0x0054:
                r4.B3()
            L_0x0057:
                long r0 = (long) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a6.b0.b.H3(java.lang.Number):long");
        }

        public final Object I3() {
            return this.W0.l(this.X0);
        }

        public int J2(w4.a aVar, OutputStream outputStream) throws IOException {
            byte[] m02 = m0(aVar);
            if (m02 == null) {
                return 0;
            }
            outputStream.write(m02, 0, m02.length);
            return m02.length;
        }

        public final boolean J3(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        public final boolean K3(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        public p L3() throws IOException {
            if (this.Z0) {
                return null;
            }
            c cVar = this.W0;
            int i10 = this.X0 + 1;
            if (i10 >= 16) {
                i10 = 0;
                cVar = cVar == null ? null : cVar.n();
            }
            if (cVar == null) {
                return null;
            }
            return cVar.t(i10);
        }

        public void M3(j jVar) {
            this.f219b1 = jVar;
        }

        public int N1() throws IOException {
            Number S1 = this.U == p.VALUE_NUMBER_INT ? (Number) I3() : S1();
            return ((S1 instanceof Integer) || J3(S1)) ? S1.intValue() : G3(S1);
        }

        public long P1() throws IOException {
            Number S1 = this.U == p.VALUE_NUMBER_INT ? (Number) I3() : S1();
            return ((S1 instanceof Long) || K3(S1)) ? S1.longValue() : H3(S1);
        }

        public l.b R1() throws IOException {
            Number S1 = S1();
            if (S1 instanceof Integer) {
                return l.b.INT;
            }
            if (S1 instanceof Long) {
                return l.b.LONG;
            }
            if (S1 instanceof Double) {
                return l.b.DOUBLE;
            }
            if (S1 instanceof BigDecimal) {
                return l.b.BIG_DECIMAL;
            }
            if (S1 instanceof BigInteger) {
                return l.b.BIG_INTEGER;
            }
            if (S1 instanceof Float) {
                return l.b.FLOAT;
            }
            if (S1 instanceof Short) {
                return l.b.INT;
            }
            return null;
        }

        public final Number S1() throws IOException {
            F3();
            Object I3 = I3();
            if (I3 instanceof Number) {
                return (Number) I3;
            }
            if (I3 instanceof String) {
                String str = (String) I3;
                return str.indexOf(46) >= 0 ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
            } else if (I3 == null) {
                return null;
            } else {
                throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + I3.getClass().getName());
            }
        }

        public void S2(s sVar) {
            this.S0 = sVar;
        }

        public s T0() {
            return this.S0;
        }

        public Object T1() {
            return this.W0.j(this.X0);
        }

        public o U1() {
            return this.Y0;
        }

        public j W0() {
            j jVar = this.f219b1;
            return jVar == null ? j.V : jVar;
        }

        public String X0() {
            p pVar = this.U;
            return (pVar == p.START_OBJECT || pVar == p.START_ARRAY) ? this.Y0.e().b() : this.Y0.b();
        }

        public String Y1() {
            p pVar = this.U;
            if (pVar == p.VALUE_STRING || pVar == p.FIELD_NAME) {
                Object I3 = I3();
                return I3 instanceof String ? (String) I3 : h.h0(I3);
            } else if (pVar == null) {
                return null;
            } else {
                int i10 = a.f216a[pVar.ordinal()];
                return (i10 == 7 || i10 == 8) ? h.h0(I3()) : this.U.d();
            }
        }

        public char[] Z1() {
            String Y1 = Y1();
            if (Y1 == null) {
                return null;
            }
            return Y1.toCharArray();
        }

        public int a2() {
            String Y1 = Y1();
            if (Y1 == null) {
                return 0;
            }
            return Y1.length();
        }

        public int b2() {
            return 0;
        }

        public j c2() {
            return W0();
        }

        public void close() throws IOException {
            if (!this.Z0) {
                this.Z0 = true;
            }
        }

        public Object d2() {
            return this.W0.k(this.X0);
        }

        public BigInteger e0() throws IOException {
            Number S1 = S1();
            return S1 instanceof BigInteger ? (BigInteger) S1 : R1() == l.b.BIG_DECIMAL ? ((BigDecimal) S1).toBigInteger() : BigInteger.valueOf(S1.longValue());
        }

        public void f3() throws k {
            u3();
        }

        public BigDecimal h1() throws IOException {
            Number S1 = S1();
            if (S1 instanceof BigDecimal) {
                return (BigDecimal) S1;
            }
            int i10 = a.f217b[R1().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return new BigDecimal((BigInteger) S1);
                }
                if (i10 != 5) {
                    return BigDecimal.valueOf(S1.doubleValue());
                }
            }
            return BigDecimal.valueOf(S1.longValue());
        }

        public boolean isClosed() {
            return this.Z0;
        }

        public byte[] m0(w4.a aVar) throws IOException, k {
            if (this.U == p.VALUE_EMBEDDED_OBJECT) {
                Object I3 = I3();
                if (I3 instanceof byte[]) {
                    return (byte[]) I3;
                }
            }
            if (this.U == p.VALUE_STRING) {
                String Y1 = Y1();
                if (Y1 == null) {
                    return null;
                }
                h5.c cVar = this.f218a1;
                if (cVar == null) {
                    cVar = new h5.c(100);
                    this.f218a1 = cVar;
                } else {
                    cVar.t();
                }
                d3(Y1, cVar, aVar);
                return cVar.P();
            }
            throw k("Current token (" + this.U + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
        }

        public double m1() throws IOException {
            return S1().doubleValue();
        }

        public boolean o() {
            return this.U0;
        }

        public Object p1() {
            if (this.U == p.VALUE_EMBEDDED_OBJECT) {
                return I3();
            }
            return null;
        }

        public boolean p2() {
            return false;
        }

        public boolean q() {
            return this.T0;
        }

        public w4.b0 version() {
            return k5.l.O;
        }

        public boolean w2() {
            if (this.U != p.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object I3 = I3();
            if (I3 instanceof Double) {
                Double d10 = (Double) I3;
                return d10.isNaN() || d10.isInfinite();
            } else if (!(I3 instanceof Float)) {
                return false;
            } else {
                Float f10 = (Float) I3;
                return f10.isNaN() || f10.isInfinite();
            }
        }

        public String y2() throws IOException {
            c cVar;
            p pVar;
            if (this.Z0 || (cVar = this.W0) == null) {
                return null;
            }
            int i10 = this.X0 + 1;
            if (i10 < 16 && cVar.t(i10) == (pVar = p.FIELD_NAME)) {
                this.X0 = i10;
                this.U = pVar;
                Object l10 = this.W0.l(i10);
                String obj = l10 instanceof String ? (String) l10 : l10.toString();
                this.Y0.v(obj);
                return obj;
            } else if (D2() == p.FIELD_NAME) {
                return X0();
            } else {
                return null;
            }
        }
    }

    public static final class c {

        /* renamed from: e  reason: collision with root package name */
        public static final int f220e = 16;

        /* renamed from: f  reason: collision with root package name */
        public static final p[] f221f;

        /* renamed from: a  reason: collision with root package name */
        public c f222a;

        /* renamed from: b  reason: collision with root package name */
        public long f223b;

        /* renamed from: c  reason: collision with root package name */
        public final Object[] f224c = new Object[16];

        /* renamed from: d  reason: collision with root package name */
        public TreeMap<Integer, Object> f225d;

        static {
            p[] pVarArr = new p[16];
            f221f = pVarArr;
            p[] values = p.values();
            System.arraycopy(values, 1, pVarArr, 1, Math.min(15, values.length - 1));
        }

        public final int a(int i10) {
            return i10 + i10 + 1;
        }

        public final int b(int i10) {
            return i10 + i10;
        }

        public c e(int i10, p pVar) {
            if (i10 < 16) {
                p(i10, pVar);
                return null;
            }
            c cVar = new c();
            this.f222a = cVar;
            cVar.p(0, pVar);
            return this.f222a;
        }

        public c f(int i10, p pVar, Object obj) {
            if (i10 < 16) {
                q(i10, pVar, obj);
                return null;
            }
            c cVar = new c();
            this.f222a = cVar;
            cVar.q(0, pVar, obj);
            return this.f222a;
        }

        public c g(int i10, p pVar, Object obj, Object obj2) {
            if (i10 < 16) {
                r(i10, pVar, obj, obj2);
                return null;
            }
            c cVar = new c();
            this.f222a = cVar;
            cVar.r(0, pVar, obj, obj2);
            return this.f222a;
        }

        public c h(int i10, p pVar, Object obj, Object obj2, Object obj3) {
            if (i10 < 16) {
                s(i10, pVar, obj, obj2, obj3);
                return null;
            }
            c cVar = new c();
            this.f222a = cVar;
            cVar.s(0, pVar, obj, obj2, obj3);
            return this.f222a;
        }

        public final void i(int i10, Object obj, Object obj2) {
            if (this.f225d == null) {
                this.f225d = new TreeMap<>();
            }
            if (obj != null) {
                this.f225d.put(Integer.valueOf(a(i10)), obj);
            }
            if (obj2 != null) {
                this.f225d.put(Integer.valueOf(b(i10)), obj2);
            }
        }

        public final Object j(int i10) {
            TreeMap<Integer, Object> treeMap = this.f225d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(a(i10)));
        }

        public final Object k(int i10) {
            TreeMap<Integer, Object> treeMap = this.f225d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(b(i10)));
        }

        public Object l(int i10) {
            return this.f224c[i10];
        }

        public boolean m() {
            return this.f225d != null;
        }

        public c n() {
            return this.f222a;
        }

        public int o(int i10) {
            long j10 = this.f223b;
            if (i10 > 0) {
                j10 >>= i10 << 2;
            }
            return ((int) j10) & 15;
        }

        public final void p(int i10, p pVar) {
            long ordinal = (long) pVar.ordinal();
            if (i10 > 0) {
                ordinal <<= i10 << 2;
            }
            this.f223b |= ordinal;
        }

        public final void q(int i10, p pVar, Object obj) {
            this.f224c[i10] = obj;
            long ordinal = (long) pVar.ordinal();
            if (i10 > 0) {
                ordinal <<= i10 << 2;
            }
            this.f223b |= ordinal;
        }

        public final void r(int i10, p pVar, Object obj, Object obj2) {
            long ordinal = (long) pVar.ordinal();
            if (i10 > 0) {
                ordinal <<= i10 << 2;
            }
            this.f223b = ordinal | this.f223b;
            i(i10, obj, obj2);
        }

        public final void s(int i10, p pVar, Object obj, Object obj2, Object obj3) {
            this.f224c[i10] = obj;
            long ordinal = (long) pVar.ordinal();
            if (i10 > 0) {
                ordinal <<= i10 << 2;
            }
            this.f223b = ordinal | this.f223b;
            i(i10, obj2, obj3);
        }

        public p t(int i10) {
            long j10 = this.f223b;
            if (i10 > 0) {
                j10 >>= i10 << 2;
            }
            return f221f[((int) j10) & 15];
        }
    }

    public b0(l lVar) {
        this(lVar, (g) null);
    }

    public b0(l lVar, g gVar) {
        boolean z10 = false;
        this.f214c0 = false;
        this.P = lVar.T0();
        this.Q = lVar.U1();
        this.R = f211e0;
        this.f215d0 = f.y((d5.b) null);
        c cVar = new c();
        this.Y = cVar;
        this.X = cVar;
        this.Z = 0;
        this.T = lVar.q();
        boolean o10 = lVar.o();
        this.U = o10;
        this.V = o10 | this.T;
        this.W = gVar != null ? gVar.v0(h.USE_BIG_DECIMAL_FOR_FLOATS) : z10;
    }

    public b0(s sVar, boolean z10) {
        this.f214c0 = false;
        this.P = sVar;
        this.R = f211e0;
        this.f215d0 = f.y((d5.b) null);
        c cVar = new c();
        this.Y = cVar;
        this.X = cVar;
        this.Z = 0;
        this.T = z10;
        this.U = z10;
        this.V = z10 | z10;
    }

    public static b0 s3(l lVar) throws IOException {
        b0 b0Var = new b0(lVar);
        b0Var.P(lVar);
        return b0Var;
    }

    /* renamed from: A3 */
    public final f T0() {
        return this.f215d0;
    }

    public b0 B3(o oVar) {
        this.Q = oVar;
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C3(w4.i r9) throws java.io.IOException {
        /*
            r8 = this;
            a6.b0$c r0 = r8.X
            boolean r1 = r8.V
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0010
            boolean r4 = r0.m()
            if (r4 == 0) goto L_0x0010
            r4 = r2
            goto L_0x0011
        L_0x0010:
            r4 = r3
        L_0x0011:
            r5 = -1
        L_0x0012:
            int r5 = r5 + r2
            r6 = 16
            if (r5 < r6) goto L_0x002a
            a6.b0$c r0 = r0.n()
            if (r0 != 0) goto L_0x001e
            goto L_0x0030
        L_0x001e:
            if (r1 == 0) goto L_0x0028
            boolean r4 = r0.m()
            if (r4 == 0) goto L_0x0028
            r4 = r2
            goto L_0x0029
        L_0x0028:
            r4 = r3
        L_0x0029:
            r5 = r3
        L_0x002a:
            w4.p r6 = r0.t(r5)
            if (r6 != 0) goto L_0x0031
        L_0x0030:
            return
        L_0x0031:
            if (r4 == 0) goto L_0x0045
            java.lang.Object r7 = r0.j(r5)
            if (r7 == 0) goto L_0x003c
            r9.E2(r7)
        L_0x003c:
            java.lang.Object r7 = r0.k(r5)
            if (r7 == 0) goto L_0x0045
            r9.e3(r7)
        L_0x0045:
            int[] r7 = a6.b0.a.f216a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            switch(r6) {
                case 1: goto L_0x014e;
                case 2: goto L_0x0149;
                case 3: goto L_0x0144;
                case 4: goto L_0x013f;
                case 5: goto L_0x0129;
                case 6: goto L_0x0113;
                case 7: goto L_0x00d0;
                case 8: goto L_0x007a;
                case 9: goto L_0x0076;
                case 10: goto L_0x0072;
                case 11: goto L_0x00a8;
                case 12: goto L_0x0058;
                default: goto L_0x0050;
            }
        L_0x0050:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Internal error: should never end up through this code path"
            r9.<init>(r0)
            throw r9
        L_0x0058:
            java.lang.Object r6 = r0.l(r5)
            boolean r7 = r6 instanceof a6.w
            if (r7 == 0) goto L_0x0066
            a6.w r6 = (a6.w) r6
            r6.c(r9)
            goto L_0x0012
        L_0x0066:
            boolean r7 = r6 instanceof i5.n
            if (r7 == 0) goto L_0x006e
            r9.writeObject(r6)
            goto L_0x0012
        L_0x006e:
            r9.e2(r6)
            goto L_0x0012
        L_0x0072:
            r9.c2(r3)
            goto L_0x0012
        L_0x0076:
            r9.c2(r2)
            goto L_0x0012
        L_0x007a:
            java.lang.Object r6 = r0.l(r5)
            boolean r7 = r6 instanceof java.lang.Double
            if (r7 == 0) goto L_0x008c
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            r9.m2(r6)
            goto L_0x0012
        L_0x008c:
            boolean r7 = r6 instanceof java.math.BigDecimal
            if (r7 == 0) goto L_0x0097
            java.math.BigDecimal r6 = (java.math.BigDecimal) r6
            r9.r2(r6)
            goto L_0x0012
        L_0x0097:
            boolean r7 = r6 instanceof java.lang.Float
            if (r7 == 0) goto L_0x00a6
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r9.n2(r6)
            goto L_0x0012
        L_0x00a6:
            if (r6 != 0) goto L_0x00ad
        L_0x00a8:
            r9.k2()
            goto L_0x0012
        L_0x00ad:
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L_0x00b8
            java.lang.String r6 = (java.lang.String) r6
            r9.q2(r6)
            goto L_0x0012
        L_0x00b8:
            w4.h r0 = new w4.h
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getName()
            r1[r3] = r2
            java.lang.String r2 = "Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>((java.lang.String) r1, (w4.i) r9)
            throw r0
        L_0x00d0:
            java.lang.Object r6 = r0.l(r5)
            boolean r7 = r6 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x00e3
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        L_0x00de:
            r9.o2(r6)
            goto L_0x0012
        L_0x00e3:
            boolean r7 = r6 instanceof java.math.BigInteger
            if (r7 == 0) goto L_0x00ee
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            r9.s2(r6)
            goto L_0x0012
        L_0x00ee:
            boolean r7 = r6 instanceof java.lang.Long
            if (r7 == 0) goto L_0x00fd
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r9.p2(r6)
            goto L_0x0012
        L_0x00fd:
            boolean r7 = r6 instanceof java.lang.Short
            if (r7 == 0) goto L_0x010c
            java.lang.Short r6 = (java.lang.Short) r6
            short r6 = r6.shortValue()
            r9.t2(r6)
            goto L_0x0012
        L_0x010c:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L_0x00de
        L_0x0113:
            java.lang.Object r6 = r0.l(r5)
            boolean r7 = r6 instanceof w4.u
            if (r7 == 0) goto L_0x0122
            w4.u r6 = (w4.u) r6
            r9.a3(r6)
            goto L_0x0012
        L_0x0122:
            java.lang.String r6 = (java.lang.String) r6
            r9.Z2(r6)
            goto L_0x0012
        L_0x0129:
            java.lang.Object r6 = r0.l(r5)
            boolean r7 = r6 instanceof w4.u
            if (r7 == 0) goto L_0x0138
            w4.u r6 = (w4.u) r6
            r9.j2(r6)
            goto L_0x0012
        L_0x0138:
            java.lang.String r6 = (java.lang.String) r6
            r9.i2(r6)
            goto L_0x0012
        L_0x013f:
            r9.f2()
            goto L_0x0012
        L_0x0144:
            r9.R2()
            goto L_0x0012
        L_0x0149:
            r9.g2()
            goto L_0x0012
        L_0x014e:
            r9.V2()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.b0.C3(w4.i):void");
    }

    public void E2(Object obj) {
        this.f213b0 = obj;
        this.f214c0 = true;
    }

    @Deprecated
    public i F1(int i10) {
        this.R = i10;
        return this;
    }

    public void H2(char c10) throws IOException {
        g();
    }

    public void I2(String str) throws IOException {
        g();
    }

    public void J2(String str, int i10, int i11) throws IOException {
        g();
    }

    public void K2(u uVar) throws IOException {
        g();
    }

    public void L2(char[] cArr, int i10, int i11) throws IOException {
        g();
    }

    public void M2(byte[] bArr, int i10, int i11) throws IOException {
        g();
    }

    public void N(l lVar) throws IOException {
        int i10;
        if (this.V) {
            o3(lVar);
        }
        switch (a.f216a[lVar.P().ordinal()]) {
            case 1:
                V2();
                return;
            case 2:
                g2();
                return;
            case 3:
                R2();
                return;
            case 4:
                f2();
                return;
            case 5:
                i2(lVar.X0());
                return;
            case 6:
                if (lVar.p2()) {
                    b3(lVar.Z1(), lVar.b2(), lVar.a2());
                    return;
                } else {
                    Z2(lVar.Y1());
                    return;
                }
            case 7:
                int i11 = a.f217b[lVar.R1().ordinal()];
                if (i11 == 1) {
                    o2(lVar.N1());
                    return;
                } else if (i11 != 2) {
                    p2(lVar.P1());
                    return;
                } else {
                    s2(lVar.e0());
                    return;
                }
            case 8:
                if (this.W || (i10 = a.f217b[lVar.R1().ordinal()]) == 3) {
                    r2(lVar.h1());
                    return;
                } else if (i10 != 4) {
                    m2(lVar.m1());
                    return;
                } else {
                    n2(lVar.A1());
                    return;
                }
            case 9:
                c2(true);
                return;
            case 10:
                c2(false);
                return;
            case 11:
                k2();
                return;
            case 12:
                writeObject(lVar.p1());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + lVar.P());
        }
    }

    public void N2(String str) throws IOException {
        n3(p.VALUE_EMBEDDED_OBJECT, new w(str));
    }

    public void O2(String str, int i10, int i11) throws IOException {
        if (i10 > 0 || i11 != str.length()) {
            str = str.substring(i10, i11 + i10);
        }
        n3(p.VALUE_EMBEDDED_OBJECT, new w(str));
    }

    public void P(l lVar) throws IOException {
        p P2 = lVar.P();
        if (P2 == p.FIELD_NAME) {
            if (this.V) {
                o3(lVar);
            }
            i2(lVar.X0());
            P2 = lVar.D2();
        } else if (P2 == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int i10 = a.f216a[P2.ordinal()];
        if (i10 == 1) {
            if (this.V) {
                o3(lVar);
            }
            V2();
        } else if (i10 == 2) {
            g2();
            return;
        } else if (i10 == 3) {
            if (this.V) {
                o3(lVar);
            }
            R2();
        } else if (i10 != 4) {
            q3(lVar, P2);
            return;
        } else {
            f2();
            return;
        }
        p3(lVar);
    }

    public i Q(i.b bVar) {
        this.R = (~bVar.e()) & this.R;
        return this;
    }

    public i Q1() {
        return this;
    }

    public void Q2(char[] cArr, int i10, int i11) throws IOException {
        n3(p.VALUE_EMBEDDED_OBJECT, new String(cArr, i10, i11));
    }

    public final void R2() throws IOException {
        this.f215d0.F();
        l3(p.START_ARRAY);
        this.f215d0 = this.f215d0.t();
    }

    public final void S2(int i10) throws IOException {
        this.f215d0.F();
        l3(p.START_ARRAY);
        this.f215d0 = this.f215d0.t();
    }

    public void T2(Object obj) throws IOException {
        this.f215d0.F();
        l3(p.START_ARRAY);
        this.f215d0 = this.f215d0.t();
    }

    public void U2(Object obj, int i10) throws IOException {
        this.f215d0.F();
        l3(p.START_ARRAY);
        this.f215d0 = this.f215d0.u(obj);
    }

    public final void V2() throws IOException {
        this.f215d0.F();
        l3(p.START_OBJECT);
        this.f215d0 = this.f215d0.v();
    }

    public void W2(Object obj) throws IOException {
        this.f215d0.F();
        l3(p.START_OBJECT);
        this.f215d0 = this.f215d0.w(obj);
    }

    public int X1(w4.a aVar, InputStream inputStream, int i10) {
        throw new UnsupportedOperationException();
    }

    public void X2(Object obj, int i10) throws IOException {
        this.f215d0.F();
        l3(p.START_OBJECT);
        this.f215d0 = this.f215d0.w(obj);
    }

    public i Y(i.b bVar) {
        this.R = bVar.e() | this.R;
        return this;
    }

    public void Y1(w4.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        writeObject(bArr2);
    }

    public void Z2(String str) throws IOException {
        if (str == null) {
            k2();
        } else {
            n3(p.VALUE_STRING, str);
        }
    }

    public void a3(u uVar) throws IOException {
        if (uVar == null) {
            k2();
        } else {
            n3(p.VALUE_STRING, uVar);
        }
    }

    public void b3(char[] cArr, int i10, int i11) throws IOException {
        Z2(new String(cArr, i10, i11));
    }

    public s c0() {
        return this.P;
    }

    public void c2(boolean z10) throws IOException {
        m3(z10 ? p.VALUE_TRUE : p.VALUE_FALSE);
    }

    public void close() throws IOException {
        this.S = true;
    }

    public void d3(a0 a0Var) throws IOException {
        if (a0Var == null) {
            k2();
            return;
        }
        s sVar = this.P;
        if (sVar == null) {
            n3(p.VALUE_EMBEDDED_OBJECT, a0Var);
        } else {
            sVar.g(this, a0Var);
        }
    }

    public void e2(Object obj) throws IOException {
        n3(p.VALUE_EMBEDDED_OBJECT, obj);
    }

    public void e3(Object obj) {
        this.f212a0 = obj;
        this.f214c0 = true;
    }

    public boolean f1(i.b bVar) {
        return (bVar.e() & this.R) != 0;
    }

    public final void f2() throws IOException {
        i3(p.END_ARRAY);
        f A = this.f215d0.e();
        if (A != null) {
            this.f215d0 = A;
        }
    }

    public void flush() throws IOException {
    }

    public void g() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void g2() throws IOException {
        i3(p.END_OBJECT);
        f A = this.f215d0.e();
        if (A != null) {
            this.f215d0 = A;
        }
    }

    public void h3(byte[] bArr, int i10, int i11) throws IOException {
        g();
    }

    public final void i2(String str) throws IOException {
        this.f215d0.E(str);
        j3(str);
    }

    public final void i3(p pVar) {
        c e10 = this.Y.e(this.Z, pVar);
        if (e10 == null) {
            this.Z++;
            return;
        }
        this.Y = e10;
        this.Z = 1;
    }

    public boolean isClosed() {
        return this.S;
    }

    public void j2(u uVar) throws IOException {
        this.f215d0.E(uVar.getValue());
        j3(uVar);
    }

    public final void j3(Object obj) {
        c cVar;
        if (this.f214c0) {
            cVar = this.Y.h(this.Z, p.FIELD_NAME, obj, this.f213b0, this.f212a0);
        } else {
            cVar = this.Y.f(this.Z, p.FIELD_NAME, obj);
        }
        if (cVar == null) {
            this.Z++;
            return;
        }
        this.Y = cVar;
        this.Z = 1;
    }

    public int k0() {
        return this.R;
    }

    public void k2() throws IOException {
        m3(p.VALUE_NULL);
    }

    public final void k3(StringBuilder sb2) {
        Object c10 = this.Y.j(this.Z - 1);
        if (c10 != null) {
            sb2.append("[objectId=");
            sb2.append(String.valueOf(c10));
            sb2.append(']');
        }
        Object d10 = this.Y.k(this.Z - 1);
        if (d10 != null) {
            sb2.append("[typeId=");
            sb2.append(String.valueOf(d10));
            sb2.append(']');
        }
    }

    public final void l3(p pVar) {
        c g10 = this.f214c0 ? this.Y.g(this.Z, pVar, this.f213b0, this.f212a0) : this.Y.e(this.Z, pVar);
        if (g10 == null) {
            this.Z++;
            return;
        }
        this.Y = g10;
        this.Z = 1;
    }

    public i m1(int i10, int i11) {
        this.R = (i10 & i11) | (k0() & (~i11));
        return this;
    }

    public void m2(double d10) throws IOException {
        n3(p.VALUE_NUMBER_FLOAT, Double.valueOf(d10));
    }

    public final void m3(p pVar) {
        this.f215d0.F();
        c g10 = this.f214c0 ? this.Y.g(this.Z, pVar, this.f213b0, this.f212a0) : this.Y.e(this.Z, pVar);
        if (g10 == null) {
            this.Z++;
            return;
        }
        this.Y = g10;
        this.Z = 1;
    }

    public void n2(float f10) throws IOException {
        n3(p.VALUE_NUMBER_FLOAT, Float.valueOf(f10));
    }

    public final void n3(p pVar, Object obj) {
        c cVar;
        this.f215d0.F();
        if (this.f214c0) {
            cVar = this.Y.h(this.Z, pVar, obj, this.f213b0, this.f212a0);
        } else {
            cVar = this.Y.f(this.Z, pVar, obj);
        }
        if (cVar == null) {
            this.Z++;
            return;
        }
        this.Y = cVar;
        this.Z = 1;
    }

    public boolean o() {
        return true;
    }

    public void o2(int i10) throws IOException {
        n3(p.VALUE_NUMBER_INT, Integer.valueOf(i10));
    }

    public final void o3(l lVar) throws IOException {
        Object d22 = lVar.d2();
        this.f212a0 = d22;
        if (d22 != null) {
            this.f214c0 = true;
        }
        Object T1 = lVar.T1();
        this.f213b0 = T1;
        if (T1 != null) {
            this.f214c0 = true;
        }
    }

    public void p2(long j10) throws IOException {
        n3(p.VALUE_NUMBER_INT, Long.valueOf(j10));
    }

    public void p3(l lVar) throws IOException {
        int i10 = 1;
        while (true) {
            p D2 = lVar.D2();
            if (D2 != null) {
                int i11 = a.f216a[D2.ordinal()];
                if (i11 == 1) {
                    if (this.V) {
                        o3(lVar);
                    }
                    V2();
                } else if (i11 == 2) {
                    g2();
                    i10--;
                    if (i10 == 0) {
                        return;
                    }
                } else if (i11 == 3) {
                    if (this.V) {
                        o3(lVar);
                    }
                    R2();
                } else if (i11 == 4) {
                    f2();
                    i10--;
                    if (i10 == 0) {
                        return;
                    }
                } else if (i11 != 5) {
                    q3(lVar, D2);
                } else {
                    if (this.V) {
                        o3(lVar);
                    }
                    i2(lVar.X0());
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void q2(String str) throws IOException {
        n3(p.VALUE_NUMBER_FLOAT, str);
    }

    public final void q3(l lVar, p pVar) throws IOException {
        int i10;
        if (this.V) {
            o3(lVar);
        }
        switch (a.f216a[pVar.ordinal()]) {
            case 6:
                if (lVar.p2()) {
                    b3(lVar.Z1(), lVar.b2(), lVar.a2());
                    return;
                } else {
                    Z2(lVar.Y1());
                    return;
                }
            case 7:
                int i11 = a.f217b[lVar.R1().ordinal()];
                if (i11 == 1) {
                    o2(lVar.N1());
                    return;
                } else if (i11 != 2) {
                    p2(lVar.P1());
                    return;
                } else {
                    s2(lVar.e0());
                    return;
                }
            case 8:
                if (this.W || (i10 = a.f217b[lVar.R1().ordinal()]) == 3) {
                    r2(lVar.h1());
                    return;
                } else if (i10 != 4) {
                    m2(lVar.m1());
                    return;
                } else {
                    n2(lVar.A1());
                    return;
                }
            case 9:
                c2(true);
                return;
            case 10:
                c2(false);
                return;
            case 11:
                k2();
                return;
            case 12:
                writeObject(lVar.p1());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + pVar);
        }
    }

    public i r1(s sVar) {
        this.P = sVar;
        return this;
    }

    public void r2(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            k2();
        } else {
            n3(p.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public b0 r3(b0 b0Var) throws IOException {
        if (!this.T) {
            this.T = b0Var.w();
        }
        if (!this.U) {
            this.U = b0Var.t();
        }
        this.V = this.T | this.U;
        l t32 = b0Var.t3();
        while (t32.D2() != null) {
            P(t32);
        }
        return this;
    }

    public void s2(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            k2();
        } else {
            n3(p.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public boolean t() {
        return this.U;
    }

    public void t2(short s10) throws IOException {
        n3(p.VALUE_NUMBER_INT, Short.valueOf(s10));
    }

    public l t3() {
        return v3(this.P);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[TokenBuffer: ");
        l t32 = t3();
        int i10 = 0;
        boolean z10 = this.T || this.U;
        while (true) {
            try {
                p D2 = t32.D2();
                if (D2 == null) {
                    break;
                }
                if (z10) {
                    k3(sb2);
                }
                if (i10 < 100) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(D2.toString());
                    if (D2 == p.FIELD_NAME) {
                        sb2.append('(');
                        sb2.append(t32.X0());
                        sb2.append(')');
                    }
                }
                i10++;
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        if (i10 >= 100) {
            sb2.append(" ... (truncated ");
            sb2.append(i10 - 100);
            sb2.append(" entries)");
        }
        sb2.append(']');
        return sb2.toString();
    }

    public l u3(l lVar) {
        b bVar = new b(this.X, lVar.T0(), this.T, this.U, this.Q);
        bVar.M3(lVar.c2());
        return bVar;
    }

    public l v3(s sVar) {
        return new b(this.X, sVar, this.T, this.U, this.Q);
    }

    public w4.b0 version() {
        return k5.l.O;
    }

    public boolean w() {
        return this.T;
    }

    public l w3() throws IOException {
        l v32 = v3(this.P);
        v32.D2();
        return v32;
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            k2();
        } else if (obj.getClass() == byte[].class || (obj instanceof w)) {
            n3(p.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            s sVar = this.P;
            if (sVar == null) {
                n3(p.VALUE_EMBEDDED_OBJECT, obj);
            } else {
                sVar.q(this, obj);
            }
        }
    }

    public b0 x3(l lVar, g gVar) throws IOException {
        p D2;
        if (!lVar.q2(p.FIELD_NAME)) {
            P(lVar);
            return this;
        }
        V2();
        do {
            P(lVar);
            D2 = lVar.D2();
        } while (D2 == p.FIELD_NAME);
        p pVar = p.END_OBJECT;
        if (D2 != pVar) {
            gVar.Z0(b0.class, pVar, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + D2, new Object[0]);
        }
        g2();
        return this;
    }

    public p y3() {
        return this.X.t(0);
    }

    public b0 z3(boolean z10) {
        this.W = z10;
        return this;
    }
}
