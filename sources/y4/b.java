package y4;

import c5.d;
import c5.i;
import d5.h;
import h5.c;
import h5.n;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import w4.a;
import w4.b0;
import w4.j;
import w4.k;
import w4.l;
import w4.p;

public abstract class b extends c {
    public final d S0;
    public boolean T0;
    public int U0;
    public int V0;
    public long W0;
    public int X0 = 1;
    public int Y0;
    public long Z0;

    /* renamed from: a1  reason: collision with root package name */
    public int f15472a1 = 1;

    /* renamed from: b1  reason: collision with root package name */
    public int f15473b1;

    /* renamed from: c1  reason: collision with root package name */
    public d5.d f15474c1;

    /* renamed from: d1  reason: collision with root package name */
    public p f15475d1;

    /* renamed from: e1  reason: collision with root package name */
    public final n f15476e1;

    /* renamed from: f1  reason: collision with root package name */
    public char[] f15477f1;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f15478g1;

    /* renamed from: h1  reason: collision with root package name */
    public c f15479h1;

    /* renamed from: i1  reason: collision with root package name */
    public byte[] f15480i1;

    /* renamed from: j1  reason: collision with root package name */
    public int f15481j1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    public int f15482k1;

    /* renamed from: l1  reason: collision with root package name */
    public long f15483l1;

    /* renamed from: m1  reason: collision with root package name */
    public double f15484m1;

    /* renamed from: n1  reason: collision with root package name */
    public BigInteger f15485n1;

    /* renamed from: o1  reason: collision with root package name */
    public BigDecimal f15486o1;

    /* renamed from: p1  reason: collision with root package name */
    public boolean f15487p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f15488q1;

    /* renamed from: r1  reason: collision with root package name */
    public int f15489r1;

    /* renamed from: s1  reason: collision with root package name */
    public int f15490s1;

    public b(d dVar, int i10) {
        super(i10);
        this.S0 = dVar;
        this.f15476e1 = dVar.n();
        this.f15474c1 = d5.d.w(l.a.STRICT_DUPLICATE_DETECTION.d(i10) ? d5.b.g(this) : null);
    }

    public static int[] j4(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : Arrays.copyOf(iArr, iArr.length + i10);
    }

    public float A1() throws IOException {
        return (float) m1();
    }

    public void F2(String str) {
        d5.d dVar = this.f15474c1;
        p pVar = this.U;
        if (pVar == p.START_OBJECT || pVar == p.START_ARRAY) {
            dVar = dVar.e();
        }
        try {
            dVar.B(str);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void F3(int i10, int i11) {
        d5.b bVar;
        d5.d dVar;
        int e10 = l.a.STRICT_DUPLICATE_DETECTION.e();
        if ((i11 & e10) != 0 && (i10 & e10) != 0) {
            if (this.f15474c1.y() == null) {
                dVar = this.f15474c1;
                bVar = d5.b.g(this);
            } else {
                dVar = this.f15474c1;
                bVar = null;
            }
            this.f15474c1 = dVar.C(bVar);
        }
    }

    public abstract void G3() throws IOException;

    public l H2(int i10, int i11) {
        int i12 = this.O;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this.O = i13;
            F3(i13, i14);
        }
        return this;
    }

    public final int H3(a aVar, char c10, int i10) throws IOException {
        if (c10 == '\\') {
            char J3 = J3();
            if (J3 <= ' ' && i10 == 0) {
                return -1;
            }
            int f10 = aVar.f(J3);
            if (f10 >= 0 || (f10 == -2 && i10 >= 2)) {
                return f10;
            }
            throw m4(aVar, J3, i10);
        }
        throw m4(aVar, c10, i10);
    }

    public final int I3(a aVar, int i10, int i11) throws IOException {
        if (i10 == 92) {
            char J3 = J3();
            if (J3 <= ' ' && i11 == 0) {
                return -1;
            }
            int g10 = aVar.g(J3);
            if (g10 >= 0 || g10 == -2) {
                return g10;
            }
            throw m4(aVar, J3, i11);
        }
        throw m4(aVar, i10, i11);
    }

    public char J3() throws IOException {
        throw new UnsupportedOperationException();
    }

    public final int K3() throws k {
        f3();
        return -1;
    }

    public void L3() throws IOException {
    }

    public c M3() {
        c cVar = this.f15479h1;
        if (cVar == null) {
            this.f15479h1 = new c();
        } else {
            cVar.t();
        }
        return this.f15479h1;
    }

    public int N1() throws IOException {
        int i10 = this.f15481j1;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return Q3();
            }
            if ((i10 & 1) == 0) {
                d4();
            }
        }
        return this.f15482k1;
    }

    public Object N3() {
        if (l.a.INCLUDE_SOURCE_IN_LOCATION.d(this.O)) {
            return this.S0.p();
        }
        return null;
    }

    public void O3(a aVar) throws IOException {
        j3(aVar.w());
    }

    public long P1() throws IOException {
        int i10 = this.f15481j1;
        if ((i10 & 2) == 0) {
            if (i10 == 0) {
                R3(2);
            }
            if ((this.f15481j1 & 2) == 0) {
                e4();
            }
        }
        return this.f15483l1;
    }

    public char P3(char c10) throws w4.n {
        if (s2(l.a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c10;
        }
        if (c10 == '\'' && s2(l.a.ALLOW_SINGLE_QUOTES)) {
            return c10;
        }
        j3("Unrecognized character escape " + c.e3(c10));
        return c10;
    }

    public int Q3() throws IOException {
        if (this.U != p.VALUE_NUMBER_INT || this.f15488q1 > 9) {
            R3(1);
            if ((this.f15481j1 & 1) == 0) {
                d4();
            }
            return this.f15482k1;
        }
        int j10 = this.f15476e1.j(this.f15487p1);
        this.f15482k1 = j10;
        this.f15481j1 = 1;
        return j10;
    }

    public l.b R1() throws IOException {
        if (this.f15481j1 == 0) {
            R3(0);
        }
        if (this.U != p.VALUE_NUMBER_INT) {
            return (this.f15481j1 & 16) != 0 ? l.b.BIG_DECIMAL : l.b.DOUBLE;
        }
        int i10 = this.f15481j1;
        return (i10 & 1) != 0 ? l.b.INT : (i10 & 2) != 0 ? l.b.LONG : l.b.BIG_INTEGER;
    }

    public void R3(int i10) throws IOException {
        p pVar = this.U;
        if (pVar == p.VALUE_NUMBER_INT) {
            int i11 = this.f15488q1;
            if (i11 <= 9) {
                this.f15482k1 = this.f15476e1.j(this.f15487p1);
                this.f15481j1 = 1;
            } else if (i11 <= 18) {
                long k10 = this.f15476e1.k(this.f15487p1);
                if (i11 == 10) {
                    if (this.f15487p1) {
                        if (k10 >= c.L0) {
                            this.f15482k1 = (int) k10;
                            this.f15481j1 = 1;
                            return;
                        }
                    } else if (k10 <= c.M0) {
                        this.f15482k1 = (int) k10;
                        this.f15481j1 = 1;
                        return;
                    }
                }
                this.f15483l1 = k10;
                this.f15481j1 = 2;
            } else {
                T3(i10);
            }
        } else if (pVar == p.VALUE_NUMBER_FLOAT) {
            S3(i10);
        } else {
            k3("Current token (%s) not numeric, can not use numeric value accessors", pVar);
        }
    }

    public Number S1() throws IOException {
        if (this.f15481j1 == 0) {
            R3(0);
        }
        if (this.U == p.VALUE_NUMBER_INT) {
            int i10 = this.f15481j1;
            return (i10 & 1) != 0 ? Integer.valueOf(this.f15482k1) : (i10 & 2) != 0 ? Long.valueOf(this.f15483l1) : (i10 & 4) != 0 ? this.f15485n1 : this.f15486o1;
        }
        int i11 = this.f15481j1;
        if ((i11 & 16) != 0) {
            return this.f15486o1;
        }
        if ((i11 & 8) == 0) {
            u3();
        }
        return Double.valueOf(this.f15484m1);
    }

    public final void S3(int i10) throws IOException {
        if (i10 == 16) {
            try {
                this.f15486o1 = this.f15476e1.h();
                this.f15481j1 = 16;
            } catch (NumberFormatException e10) {
                w3("Malformed numeric value (" + i3(this.f15476e1.l()) + ")", e10);
            }
        } else {
            this.f15484m1 = this.f15476e1.i();
            this.f15481j1 = 8;
        }
    }

    public void T2(Object obj) {
        this.f15474c1.p(obj);
    }

    public final void T3(int i10) throws IOException {
        String l10 = this.f15476e1.l();
        try {
            int i11 = this.f15488q1;
            char[] x10 = this.f15476e1.x();
            int y10 = this.f15476e1.y();
            boolean z10 = this.f15487p1;
            if (z10) {
                y10++;
            }
            if (i.c(x10, y10, i11, z10)) {
                this.f15483l1 = Long.parseLong(l10);
                this.f15481j1 = 2;
                return;
            }
            if (i10 == 1 || i10 == 2) {
                W3(i10, l10);
            }
            if (i10 != 8) {
                if (i10 != 32) {
                    this.f15485n1 = new BigInteger(l10);
                    this.f15481j1 = 4;
                    return;
                }
            }
            this.f15484m1 = i.j(l10);
            this.f15481j1 = 8;
        } catch (NumberFormatException e10) {
            w3("Malformed numeric value (" + i3(l10) + ")", e10);
        }
    }

    @Deprecated
    public l U2(int i10) {
        int i11 = this.O ^ i10;
        if (i11 != 0) {
            this.O = i10;
            F3(i10, i11);
        }
        return this;
    }

    public void U3() throws IOException {
        this.f15476e1.A();
        char[] cArr = this.f15477f1;
        if (cArr != null) {
            this.f15477f1 = null;
            this.S0.t(cArr);
        }
    }

    public void V3(int i10, char c10) throws k {
        d5.d f42 = U1();
        j3(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[]{Character.valueOf((char) i10), Character.valueOf(c10), f42.q(), f42.f(N3())}));
    }

    public j W0() {
        return new j(N3(), -1, ((long) this.U0) + this.W0, this.X0, (this.U0 - this.Y0) + 1);
    }

    public void W3(int i10, String str) throws IOException {
        if (i10 == 1) {
            z3(str);
        } else {
            C3(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.f15474c1.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String X0() throws java.io.IOException {
        /*
            r2 = this;
            w4.p r0 = r2.U
            w4.p r1 = w4.p.START_OBJECT
            if (r0 == r1) goto L_0x000a
            w4.p r1 = w4.p.START_ARRAY
            if (r0 != r1) goto L_0x0017
        L_0x000a:
            d5.d r0 = r2.f15474c1
            d5.d r0 = r0.e()
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.b()
            return r0
        L_0x0017:
            d5.d r0 = r2.f15474c1
            java.lang.String r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.b.X0():java.lang.String");
    }

    public void X3(int i10, String str) throws k {
        if (!s2(l.a.ALLOW_UNQUOTED_CONTROL_CHARS) || i10 > 32) {
            j3("Illegal unquoted character (" + c.e3((char) i10) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    public l Y(l.a aVar) {
        this.O &= ~aVar.e();
        if (aVar == l.a.STRICT_DUPLICATE_DETECTION) {
            this.f15474c1 = this.f15474c1.C((d5.b) null);
        }
        return this;
    }

    public String Y3() throws IOException {
        return Z3();
    }

    public String Z3() throws IOException {
        return s2(l.a.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public l a0(l.a aVar) {
        this.O |= aVar.e();
        if (aVar == l.a.STRICT_DUPLICATE_DETECTION && this.f15474c1.y() == null) {
            this.f15474c1 = this.f15474c1.C(d5.b.g(this));
        }
        return this;
    }

    public void a4() throws IOException {
        long j10;
        BigDecimal valueOf;
        int i10 = this.f15481j1;
        if ((i10 & 8) != 0) {
            valueOf = i.g(Y1());
        } else if ((i10 & 4) != 0) {
            valueOf = new BigDecimal(this.f15485n1);
        } else {
            if ((i10 & 2) != 0) {
                j10 = this.f15483l1;
            } else if ((i10 & 1) != 0) {
                j10 = (long) this.f15482k1;
            } else {
                u3();
                this.f15481j1 |= 16;
            }
            valueOf = BigDecimal.valueOf(j10);
        }
        this.f15486o1 = valueOf;
        this.f15481j1 |= 16;
    }

    public void b4() throws IOException {
        BigDecimal valueOf;
        long j10;
        BigInteger valueOf2;
        int i10 = this.f15481j1;
        if ((i10 & 16) != 0) {
            valueOf = this.f15486o1;
        } else {
            if ((i10 & 2) != 0) {
                j10 = this.f15483l1;
            } else if ((i10 & 1) != 0) {
                j10 = (long) this.f15482k1;
            } else if ((i10 & 8) != 0) {
                valueOf = BigDecimal.valueOf(this.f15484m1);
            } else {
                u3();
                this.f15481j1 |= 4;
            }
            valueOf2 = BigInteger.valueOf(j10);
            this.f15485n1 = valueOf2;
            this.f15481j1 |= 4;
        }
        valueOf2 = valueOf.toBigInteger();
        this.f15485n1 = valueOf2;
        this.f15481j1 |= 4;
    }

    public j c2() {
        return new j(N3(), -1, g4(), i4(), h4());
    }

    public void c4() throws IOException {
        double d10;
        int i10 = this.f15481j1;
        if ((i10 & 16) != 0) {
            d10 = this.f15486o1.doubleValue();
        } else if ((i10 & 4) != 0) {
            d10 = this.f15485n1.doubleValue();
        } else if ((i10 & 2) != 0) {
            d10 = (double) this.f15483l1;
        } else if ((i10 & 1) != 0) {
            d10 = (double) this.f15482k1;
        } else {
            u3();
            this.f15481j1 |= 8;
        }
        this.f15484m1 = d10;
        this.f15481j1 |= 8;
    }

    public void close() throws IOException {
        if (!this.T0) {
            this.U0 = Math.max(this.U0, this.V0);
            this.T0 = true;
            try {
                G3();
            } finally {
                U3();
            }
        }
    }

    public void d4() throws IOException {
        int intValue;
        int i10 = this.f15481j1;
        if ((i10 & 2) != 0) {
            long j10 = this.f15483l1;
            int i11 = (int) j10;
            if (((long) i11) != j10) {
                A3(Y1(), P());
            }
            this.f15482k1 = i11;
        } else {
            if ((i10 & 4) != 0) {
                if (c.D0.compareTo(this.f15485n1) > 0 || c.E0.compareTo(this.f15485n1) < 0) {
                    y3();
                }
                intValue = this.f15485n1.intValue();
            } else if ((i10 & 8) != 0) {
                double d10 = this.f15484m1;
                if (d10 < -2.147483648E9d || d10 > 2.147483647E9d) {
                    y3();
                }
                intValue = (int) this.f15484m1;
            } else if ((i10 & 16) != 0) {
                if (c.J0.compareTo(this.f15486o1) > 0 || c.K0.compareTo(this.f15486o1) < 0) {
                    y3();
                }
                intValue = this.f15486o1.intValue();
            } else {
                u3();
            }
            this.f15482k1 = intValue;
        }
        this.f15481j1 |= 1;
    }

    public BigInteger e0() throws IOException {
        int i10 = this.f15481j1;
        if ((i10 & 4) == 0) {
            if (i10 == 0) {
                R3(4);
            }
            if ((this.f15481j1 & 4) == 0) {
                b4();
            }
        }
        return this.f15485n1;
    }

    public void e4() throws IOException {
        long longValue;
        int i10 = this.f15481j1;
        if ((i10 & 1) != 0) {
            longValue = (long) this.f15482k1;
        } else if ((i10 & 4) != 0) {
            if (c.F0.compareTo(this.f15485n1) > 0 || c.G0.compareTo(this.f15485n1) < 0) {
                B3();
            }
            longValue = this.f15485n1.longValue();
        } else if ((i10 & 8) != 0) {
            double d10 = this.f15484m1;
            if (d10 < -9.223372036854776E18d || d10 > 9.223372036854776E18d) {
                B3();
            }
            longValue = (long) this.f15484m1;
        } else if ((i10 & 16) != 0) {
            if (c.H0.compareTo(this.f15486o1) > 0 || c.I0.compareTo(this.f15486o1) < 0) {
                B3();
            }
            longValue = this.f15486o1.longValue();
        } else {
            u3();
            this.f15481j1 |= 2;
        }
        this.f15483l1 = longValue;
        this.f15481j1 |= 2;
    }

    public void f3() throws k {
        if (!this.f15474c1.m()) {
            p3(String.format(": expected close marker for %s (start marker at %s)", new Object[]{this.f15474c1.k() ? "Array" : "Object", this.f15474c1.f(N3())}), (p) null);
        }
    }

    /* renamed from: f4 */
    public d5.d U1() {
        return this.f15474c1;
    }

    public Object g1() {
        return this.f15474c1.c();
    }

    public long g4() {
        return this.Z0;
    }

    public BigDecimal h1() throws IOException {
        int i10 = this.f15481j1;
        if ((i10 & 16) == 0) {
            if (i10 == 0) {
                R3(16);
            }
            if ((this.f15481j1 & 16) == 0) {
                a4();
            }
        }
        return this.f15486o1;
    }

    public int h4() {
        int i10 = this.f15473b1;
        return i10 < 0 ? i10 : i10 + 1;
    }

    public int i4() {
        return this.f15472a1;
    }

    public boolean isClosed() {
        return this.T0;
    }

    @Deprecated
    public boolean k4() throws IOException {
        return false;
    }

    @Deprecated
    public void l4() throws IOException {
        if (!k4()) {
            n3();
        }
    }

    public byte[] m0(a aVar) throws IOException {
        if (this.f15480i1 == null) {
            if (this.U != p.VALUE_STRING) {
                j3("Current token (" + this.U + ") not VALUE_STRING, can not access as binary");
            }
            c M3 = M3();
            d3(Y1(), M3, aVar);
            this.f15480i1 = M3.P();
        }
        return this.f15480i1;
    }

    public double m1() throws IOException {
        int i10 = this.f15481j1;
        if ((i10 & 8) == 0) {
            if (i10 == 0) {
                R3(8);
            }
            if ((this.f15481j1 & 8) == 0) {
                c4();
            }
        }
        return this.f15484m1;
    }

    public IllegalArgumentException m4(a aVar, int i10, int i11) throws IllegalArgumentException {
        return n4(aVar, i10, i11, (String) null);
    }

    public IllegalArgumentException n4(a aVar, int i10, int i11, String str) throws IllegalArgumentException {
        String str2;
        StringBuilder sb2;
        String str3;
        if (i10 <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", new Object[]{Integer.toHexString(i10), Integer.valueOf(i11 + 1)});
        } else if (aVar.A(i10)) {
            str2 = "Unexpected padding character ('" + aVar.v() + "') as character #" + (i11 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else {
            if (!Character.isDefined(i10) || Character.isISOControl(i10)) {
                sb2 = new StringBuilder();
                str3 = "Illegal character (code 0x";
            } else {
                sb2 = new StringBuilder();
                sb2.append("Illegal character '");
                sb2.append((char) i10);
                str3 = "' (code 0x";
            }
            sb2.append(str3);
            sb2.append(Integer.toHexString(i10));
            sb2.append(") in base64 content");
            str2 = sb2.toString();
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    public final p o4(boolean z10, int i10, int i11, int i12) {
        return (i11 >= 1 || i12 >= 1) ? q4(z10, i10, i11, i12) : r4(z10, i10);
    }

    public boolean p2() {
        p pVar = this.U;
        if (pVar == p.VALUE_STRING) {
            return true;
        }
        if (pVar == p.FIELD_NAME) {
            return this.f15478g1;
        }
        return false;
    }

    public final p p4(String str, double d10) {
        this.f15476e1.G(str);
        this.f15484m1 = d10;
        this.f15481j1 = 8;
        return p.VALUE_NUMBER_FLOAT;
    }

    public final p q4(boolean z10, int i10, int i11, int i12) {
        this.f15487p1 = z10;
        this.f15488q1 = i10;
        this.f15489r1 = i11;
        this.f15490s1 = i12;
        this.f15481j1 = 0;
        return p.VALUE_NUMBER_FLOAT;
    }

    public final p r4(boolean z10, int i10) {
        this.f15487p1 = z10;
        this.f15488q1 = i10;
        this.f15489r1 = 0;
        this.f15490s1 = 0;
        this.f15481j1 = 0;
        return p.VALUE_NUMBER_INT;
    }

    public b0 version() {
        return h.O;
    }

    public boolean w2() {
        if (this.U != p.VALUE_NUMBER_FLOAT || (this.f15481j1 & 8) == 0) {
            return false;
        }
        double d10 = this.f15484m1;
        return Double.isNaN(d10) || Double.isInfinite(d10);
    }
}
