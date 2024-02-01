package w4;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import x4.c;

public abstract class l implements Closeable, c0 {
    public static final int Q = -128;
    public static final int R = 255;
    public static final int S = -32768;
    public static final int T = 32767;
    public int O;
    public transient h5.l P;

    public enum a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);
        
        public final boolean O;
        public final int P;

        /* access modifiers changed from: public */
        a(boolean z10) {
            this.P = 1 << ordinal();
            this.O = z10;
        }

        public static int a() {
            int i10 = 0;
            for (a aVar : values()) {
                if (aVar.b()) {
                    i10 |= aVar.e();
                }
            }
            return i10;
        }

        public boolean b() {
            return this.O;
        }

        public boolean d(int i10) {
            return (i10 & this.P) != 0;
        }

        public int e() {
            return this.P;
        }
    }

    public enum b {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public l() {
    }

    public l(int i10) {
        this.O = i10;
    }

    public l A(a aVar, boolean z10) {
        if (z10) {
            a0(aVar);
        } else {
            Y(aVar);
        }
        return this;
    }

    public abstract float A1() throws IOException;

    public int A2(int i10) throws IOException {
        return D2() == p.VALUE_NUMBER_INT ? N1() : i10;
    }

    public long B2(long j10) throws IOException {
        return D2() == p.VALUE_NUMBER_INT ? P1() : j10;
    }

    public String C2() throws IOException {
        if (D2() == p.VALUE_STRING) {
            return Y1();
        }
        return null;
    }

    public abstract p D2() throws IOException;

    public abstract p E2() throws IOException;

    public int F1() {
        return 0;
    }

    public abstract void F2(String str);

    public l G2(int i10, int i11) {
        return this;
    }

    public byte H0() throws IOException {
        int N1 = N1();
        if (N1 >= -128 && N1 <= 255) {
            return (byte) N1;
        }
        throw new z4.a(this, String.format("Numeric value (%s) out of range of Java byte", new Object[]{Y1()}), p.VALUE_NUMBER_INT, Byte.TYPE);
    }

    public l H2(int i10, int i11) {
        return U2((i10 & i11) | (this.O & (~i11)));
    }

    public int I2(OutputStream outputStream) throws IOException {
        return J2(b.a(), outputStream);
    }

    public int J2(a aVar, OutputStream outputStream) throws IOException {
        l();
        return 0;
    }

    public <T> T K2(g5.b<?> bVar) throws IOException {
        return i().k(this, bVar);
    }

    public Object L1() {
        return null;
    }

    public <T> T L2(Class<T> cls) throws IOException {
        return i().l(this, cls);
    }

    public <T extends a0> T M2() throws IOException {
        return i().e(this);
    }

    public String N() throws IOException {
        return X0();
    }

    public abstract int N1() throws IOException;

    public <T> Iterator<T> N2(g5.b<T> bVar) throws IOException {
        return i().n(this, bVar);
    }

    public abstract p O1();

    public <T> Iterator<T> O2(Class<T> cls) throws IOException {
        return i().o(this, cls);
    }

    public p P() {
        return Z0();
    }

    public abstract long P1() throws IOException;

    public int P2(OutputStream outputStream) throws IOException {
        return -1;
    }

    public int Q() {
        return f1();
    }

    public c Q1() {
        return null;
    }

    public int Q2(Writer writer) throws IOException {
        return -1;
    }

    public abstract b R1() throws IOException;

    public boolean R2() {
        return false;
    }

    public abstract Number S1() throws IOException;

    public abstract void S2(s sVar);

    public abstract s T0();

    public Object T1() throws IOException {
        return null;
    }

    public void T2(Object obj) {
        o U1 = U1();
        if (U1 != null) {
            U1.p(obj);
        }
    }

    public abstract o U1();

    @Deprecated
    public l U2(int i10) {
        this.O = i10;
        return this;
    }

    public d V1() {
        return null;
    }

    public void V2(h5.l lVar) {
        this.P = lVar;
    }

    public abstract j W0();

    public short W1() throws IOException {
        int N1 = N1();
        if (N1 >= -32768 && N1 <= 32767) {
            return (short) N1;
        }
        throw new z4.a(this, String.format("Numeric value (%s) out of range of Java short", new Object[]{Y1()}), p.VALUE_NUMBER_INT, Short.TYPE);
    }

    public void W2(String str) {
        this.P = str == null ? null : new h5.l(str);
    }

    public abstract String X0() throws IOException;

    public int X1(Writer writer) throws IOException, UnsupportedOperationException {
        String Y1 = Y1();
        if (Y1 == null) {
            return 0;
        }
        writer.write(Y1);
        return Y1.length();
    }

    public void X2(byte[] bArr, String str) {
        this.P = bArr == null ? null : new h5.l(bArr, str);
    }

    public l Y(a aVar) {
        this.O = (~aVar.e()) & this.O;
        return this;
    }

    public abstract String Y1() throws IOException;

    public void Y2(d dVar) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + dVar.a() + "'");
    }

    public abstract p Z0();

    public abstract char[] Z1() throws IOException;

    public abstract l Z2() throws IOException;

    public l a0(a aVar) {
        this.O = aVar.e() | this.O;
        return this;
    }

    public abstract int a2() throws IOException;

    public abstract int b2() throws IOException;

    public void c0() throws IOException {
    }

    public abstract j c2();

    public abstract void close() throws IOException;

    public Object d2() throws IOException {
        return null;
    }

    public abstract BigInteger e0() throws IOException;

    public boolean e2() throws IOException {
        return f2(false);
    }

    public abstract int f1();

    public boolean f2(boolean z10) throws IOException {
        return z10;
    }

    public Object g1() {
        o U1 = U1();
        if (U1 == null) {
            return null;
        }
        return U1.c();
    }

    public double g2() throws IOException {
        return h2(0.0d);
    }

    public abstract BigDecimal h1() throws IOException;

    public double h2(double d10) throws IOException {
        return d10;
    }

    public s i() {
        s T0 = T0();
        if (T0 != null) {
            return T0;
        }
        throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
    }

    public int i2() throws IOException {
        return j2(0);
    }

    public abstract boolean isClosed();

    public int j2(int i10) throws IOException {
        return i10;
    }

    public k k(String str) {
        return new k(this, str).j(this.P);
    }

    public byte[] k0() throws IOException {
        return m0(b.a());
    }

    public long k2() throws IOException {
        return l2(0);
    }

    public void l() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }

    public long l2(long j10) throws IOException {
        return j10;
    }

    public boolean m() {
        return false;
    }

    public abstract byte[] m0(a aVar) throws IOException;

    public abstract double m1() throws IOException;

    public String m2() throws IOException {
        return n2((String) null);
    }

    public abstract String n2(String str) throws IOException;

    public boolean o() {
        return false;
    }

    public abstract boolean o2();

    public Object p1() throws IOException {
        return null;
    }

    public abstract boolean p2();

    public boolean q() {
        return false;
    }

    public abstract boolean q2(p pVar);

    public int r1() {
        return this.O;
    }

    public abstract boolean r2(int i10);

    public boolean s2(a aVar) {
        return aVar.d(this.O);
    }

    public boolean t(d dVar) {
        return false;
    }

    public boolean t2(v vVar) {
        return vVar.i().d(this.O);
    }

    public boolean u2() {
        return P() == p.START_ARRAY;
    }

    public boolean v2() {
        return P() == p.START_OBJECT;
    }

    public abstract b0 version();

    public abstract void w();

    public boolean w2() throws IOException {
        return false;
    }

    public Boolean x2() throws IOException {
        p D2 = D2();
        if (D2 == p.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (D2 == p.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return null;
    }

    public String y2() throws IOException {
        if (D2() == p.FIELD_NAME) {
            return X0();
        }
        return null;
    }

    public boolean z0() throws IOException {
        p P2 = P();
        if (P2 == p.VALUE_TRUE) {
            return true;
        }
        if (P2 == p.VALUE_FALSE) {
            return false;
        }
        throw new k(this, String.format("Current token (%s) not of boolean type", new Object[]{P2})).j(this.P);
    }

    public boolean z2(u uVar) throws IOException {
        return D2() == p.FIELD_NAME && uVar.getValue().equals(X0());
    }
}
