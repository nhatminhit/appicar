package y4;

import c5.f;
import c5.i;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.a;
import w4.k;
import w4.l;
import w4.o;
import w4.p;

public abstract class c extends l {
    public static final int A0 = 8;
    public static final int B0 = 16;
    public static final int C0 = 32;
    public static final BigInteger D0;
    public static final BigInteger E0;
    public static final BigInteger F0;
    public static final BigInteger G0;
    public static final BigDecimal H0;
    public static final BigDecimal I0;
    public static final BigDecimal J0;
    public static final BigDecimal K0;
    public static final long L0 = -2147483648L;
    public static final long M0 = 2147483647L;
    public static final double N0 = -9.223372036854776E18d;
    public static final double O0 = 9.223372036854776E18d;
    public static final double P0 = -2.147483648E9d;
    public static final double Q0 = 2.147483647E9d;
    public static final int R0 = 256;
    public static final int W = 9;
    public static final int X = 10;
    public static final int Y = 13;
    public static final int Z = 32;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f15491a0 = 91;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f15492b0 = 93;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f15493c0 = 123;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f15494d0 = 125;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f15495e0 = 34;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f15496f0 = 39;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f15497g0 = 92;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f15498h0 = 47;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f15499i0 = 42;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f15500j0 = 58;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f15501k0 = 44;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f15502l0 = 35;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f15503m0 = 48;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f15504n0 = 57;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f15505o0 = 45;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f15506p0 = 43;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f15507q0 = 46;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f15508r0 = 101;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f15509s0 = 69;

    /* renamed from: t0  reason: collision with root package name */
    public static final char f15510t0 = '\u0000';

    /* renamed from: u0  reason: collision with root package name */
    public static final byte[] f15511u0 = new byte[0];

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f15512v0 = new int[0];

    /* renamed from: w0  reason: collision with root package name */
    public static final int f15513w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f15514x0 = 1;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f15515y0 = 2;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f15516z0 = 4;
    public p U;
    public p V;

    static {
        BigInteger valueOf = BigInteger.valueOf(L0);
        D0 = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(M0);
        E0 = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        F0 = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        G0 = valueOf4;
        H0 = new BigDecimal(valueOf3);
        I0 = new BigDecimal(valueOf4);
        J0 = new BigDecimal(valueOf);
        K0 = new BigDecimal(valueOf2);
    }

    public c() {
    }

    public c(int i10) {
        super(i10);
    }

    @Deprecated
    public static String a3(byte[] bArr) {
        try {
            return new String(bArr, b6.c.f4237k);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Deprecated
    public static byte[] b3(String str) {
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public static final String e3(int i10) {
        char c10 = (char) i10;
        if (Character.isISOControl(c10)) {
            return "(CTRL-CHAR, code " + i10 + ")";
        } else if (i10 > 255) {
            return "'" + c10 + "' (code " + i10 + " / 0x" + Integer.toHexString(i10) + ")";
        } else {
            return "'" + c10 + "' (code " + i10 + ")";
        }
    }

    public void A3(String str, p pVar) throws IOException {
        m3(String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{h3(str), Integer.MIN_VALUE, Integer.MAX_VALUE}), pVar, Integer.TYPE);
    }

    public void B3() throws IOException {
        C3(Y1());
    }

    public void C3(String str) throws IOException {
        D3(str, P());
    }

    public abstract p D2() throws IOException;

    public void D3(String str, p pVar) throws IOException {
        m3(String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{h3(str), Long.MIN_VALUE, Long.MAX_VALUE}), pVar, Long.TYPE);
    }

    public p E2() throws IOException {
        p D2 = D2();
        return D2 == p.FIELD_NAME ? D2() : D2;
    }

    public void E3(int i10, String str) throws k {
        String format = String.format("Unexpected character (%s) in numeric value", new Object[]{e3(i10)});
        if (str != null) {
            format = format + ": " + str;
        }
        j3(format);
    }

    public abstract void F2(String str);

    public p O1() {
        return this.V;
    }

    public p P() {
        return this.U;
    }

    public int Q() {
        p pVar = this.U;
        if (pVar == null) {
            return 0;
        }
        return pVar.e();
    }

    public abstract o U1();

    public abstract String X0() throws IOException;

    public abstract String Y1() throws IOException;

    public p Z0() {
        return this.U;
    }

    public abstract char[] Z1() throws IOException;

    public l Z2() throws IOException {
        p pVar = this.U;
        if (pVar != p.START_OBJECT && pVar != p.START_ARRAY) {
            return this;
        }
        int i10 = 1;
        while (true) {
            p D2 = D2();
            if (D2 == null) {
                f3();
                return this;
            } else if (D2.m()) {
                i10++;
            } else if (D2.l()) {
                i10--;
                if (i10 == 0) {
                    return this;
                }
            } else if (D2 == p.NOT_AVAILABLE) {
                k3("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    public abstract int a2() throws IOException;

    public abstract int b2() throws IOException;

    public final k c3(String str, Throwable th2) {
        return new k((l) this, str, th2);
    }

    public abstract void close() throws IOException;

    public void d3(String str, h5.c cVar, a aVar) throws IOException {
        try {
            aVar.c(str, cVar);
        } catch (IllegalArgumentException e10) {
            j3(e10.getMessage());
        }
    }

    public int f1() {
        p pVar = this.U;
        if (pVar == null) {
            return 0;
        }
        return pVar.e();
    }

    public boolean f2(boolean z10) throws IOException {
        p pVar = this.U;
        if (pVar != null) {
            switch (pVar.e()) {
                case 6:
                    String trim = Y1().trim();
                    if ("true".equals(trim)) {
                        return true;
                    }
                    if (!"false".equals(trim) && !g3(trim)) {
                        return z10;
                    }
                    return false;
                case 7:
                    return N1() != 0;
                case 9:
                    return true;
                case 10:
                case 11:
                    return false;
                case 12:
                    Object p12 = p1();
                    if (p12 instanceof Boolean) {
                        return ((Boolean) p12).booleanValue();
                    }
                    break;
            }
        }
        return z10;
    }

    public abstract void f3() throws k;

    public boolean g3(String str) {
        return "null".equals(str);
    }

    public double h2(double d10) throws IOException {
        p pVar = this.U;
        if (pVar == null) {
            return d10;
        }
        switch (pVar.e()) {
            case 6:
                String Y1 = Y1();
                if (g3(Y1)) {
                    return 0.0d;
                }
                return i.d(Y1, d10);
            case 7:
            case 8:
                return m1();
            case 9:
                return 1.0d;
            case 10:
            case 11:
                return 0.0d;
            case 12:
                Object p12 = p1();
                return p12 instanceof Number ? ((Number) p12).doubleValue() : d10;
            default:
                return d10;
        }
    }

    public String h3(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    public int i2() throws IOException {
        p pVar = this.U;
        return (pVar == p.VALUE_NUMBER_INT || pVar == p.VALUE_NUMBER_FLOAT) ? N1() : j2(0);
    }

    public String i3(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    public abstract boolean isClosed();

    public int j2(int i10) throws IOException {
        p pVar = this.U;
        if (pVar == p.VALUE_NUMBER_INT || pVar == p.VALUE_NUMBER_FLOAT) {
            return N1();
        }
        if (pVar == null) {
            return i10;
        }
        int e10 = pVar.e();
        if (e10 != 6) {
            switch (e10) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object p12 = p1();
                    return p12 instanceof Number ? ((Number) p12).intValue() : i10;
                default:
                    return i10;
            }
        } else {
            String Y1 = Y1();
            if (g3(Y1)) {
                return 0;
            }
            return i.e(Y1, i10);
        }
    }

    public final void j3(String str) throws k {
        throw k(str);
    }

    public long k2() throws IOException {
        p pVar = this.U;
        return (pVar == p.VALUE_NUMBER_INT || pVar == p.VALUE_NUMBER_FLOAT) ? P1() : l2(0);
    }

    public final void k3(String str, Object obj) throws k {
        throw k(String.format(str, new Object[]{obj}));
    }

    public long l2(long j10) throws IOException {
        p pVar = this.U;
        if (pVar == p.VALUE_NUMBER_INT || pVar == p.VALUE_NUMBER_FLOAT) {
            return P1();
        }
        if (pVar == null) {
            return j10;
        }
        int e10 = pVar.e();
        if (e10 != 6) {
            switch (e10) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object p12 = p1();
                    return p12 instanceof Number ? ((Number) p12).longValue() : j10;
                default:
                    return j10;
            }
        } else {
            String Y1 = Y1();
            if (g3(Y1)) {
                return 0;
            }
            return i.f(Y1, j10);
        }
    }

    public final void l3(String str, Object obj, Object obj2) throws k {
        throw k(String.format(str, new Object[]{obj, obj2}));
    }

    public abstract byte[] m0(a aVar) throws IOException;

    public String m2() throws IOException {
        return n2((String) null);
    }

    public void m3(String str, p pVar, Class<?> cls) throws z4.a {
        throw new z4.a(this, str, pVar, cls);
    }

    public String n2(String str) throws IOException {
        p pVar = this.U;
        return pVar == p.VALUE_STRING ? Y1() : pVar == p.FIELD_NAME ? X0() : (pVar == null || pVar == p.VALUE_NULL || !pVar.k()) ? str : Y1();
    }

    public void n3() throws k {
        p3(" in " + this.U, this.U);
    }

    public boolean o2() {
        return this.U != null;
    }

    @Deprecated
    public void o3(String str) throws k {
        throw new f(this, (p) null, "Unexpected end-of-input" + str);
    }

    public abstract boolean p2();

    public void p3(String str, p pVar) throws k {
        throw new f(this, pVar, "Unexpected end-of-input" + str);
    }

    public boolean q2(p pVar) {
        return this.U == pVar;
    }

    @Deprecated
    public void q3() throws k {
        o3(" in a value");
    }

    public boolean r2(int i10) {
        p pVar = this.U;
        return pVar == null ? i10 == 0 : pVar.e() == i10;
    }

    public void r3(p pVar) throws k {
        p3(pVar == p.VALUE_STRING ? " in a String value" : (pVar == p.VALUE_NUMBER_INT || pVar == p.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value", pVar);
    }

    public void s3(int i10) throws k {
        t3(i10, "Expected space separating root-level values");
    }

    public void t3(int i10, String str) throws k {
        if (i10 < 0) {
            n3();
        }
        String format = String.format("Unexpected character (%s)", new Object[]{e3(i10)});
        if (str != null) {
            format = format + ": " + str;
        }
        j3(format);
    }

    public boolean u2() {
        return this.U == p.START_ARRAY;
    }

    public final void u3() {
        h5.p.f();
    }

    public boolean v2() {
        return this.U == p.START_OBJECT;
    }

    public void v3(int i10) throws k {
        j3("Illegal character (" + e3((char) i10) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public void w() {
        p pVar = this.U;
        if (pVar != null) {
            this.V = pVar;
            this.U = null;
        }
    }

    public final void w3(String str, Throwable th2) throws k {
        throw c3(str, th2);
    }

    public void x3(String str) throws k {
        j3("Invalid numeric value: " + str);
    }

    public void y3() throws IOException {
        z3(Y1());
    }

    public void z3(String str) throws IOException {
        A3(str, P());
    }
}
