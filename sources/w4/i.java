package w4;

import g5.c;
import h5.p;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import w4.l;

public abstract class i implements Closeable, Flushable, c0 {
    public t O;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14630a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                g5.c$a[] r0 = g5.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14630a = r0
                g5.c$a r1 = g5.c.a.PARENT_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14630a     // Catch:{ NoSuchFieldError -> 0x001d }
                g5.c$a r1 = g5.c.a.PAYLOAD_PROPERTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14630a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g5.c$a r1 = g5.c.a.METADATA_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14630a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g5.c$a r1 = g5.c.a.WRAPPER_OBJECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14630a     // Catch:{ NoSuchFieldError -> 0x003e }
                g5.c$a r1 = g5.c.a.WRAPPER_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w4.i.a.<clinit>():void");
        }
    }

    public enum b {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        public final boolean O;
        public final int P;

        /* access modifiers changed from: public */
        b(boolean z10) {
            this.O = z10;
            this.P = 1 << ordinal();
        }

        public static int a() {
            int i10 = 0;
            for (b bVar : values()) {
                if (bVar.b()) {
                    i10 |= bVar.e();
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

    public final i A(b bVar, boolean z10) {
        if (z10) {
            Y(bVar);
        } else {
            Q(bVar);
        }
        return this;
    }

    public void A1(Object obj) {
        o T0 = T0();
        if (T0 != null) {
            T0.p(obj);
        }
    }

    public void A2(String str, BigInteger bigInteger) throws IOException {
        i2(str);
        s2(bigInteger);
    }

    public void B2(String str, short s10) throws IOException {
        i2(str);
        t2(s10);
    }

    public void C2(String str, Object obj) throws IOException {
        i2(str);
        writeObject(obj);
    }

    public void D2(String str) throws IOException {
        i2(str);
        V2();
    }

    public void E2(Object obj) throws IOException {
        throw new h("No native support for writing Object Ids", this);
    }

    @Deprecated
    public abstract i F1(int i10);

    public void F2(Object obj) throws IOException {
        throw new h("No native support for writing Object Ids", this);
    }

    public void G2(String str) throws IOException {
    }

    public int H0() {
        return -1;
    }

    public abstract void H2(char c10) throws IOException;

    public abstract void I2(String str) throws IOException;

    public abstract void J2(String str, int i10, int i11) throws IOException;

    public void K2(u uVar) throws IOException {
        I2(uVar.getValue());
    }

    public i L1(int i10) {
        return this;
    }

    public abstract void L2(char[] cArr, int i10, int i11) throws IOException;

    public abstract void M2(byte[] bArr, int i10, int i11) throws IOException;

    public void N(l lVar) throws IOException {
        boolean z10;
        p P = lVar.P();
        switch (P == null ? -1 : P.e()) {
            case -1:
                f("No current event to copy");
                return;
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
                l.b R1 = lVar.R1();
                if (R1 == l.b.INT) {
                    o2(lVar.N1());
                    return;
                } else if (R1 == l.b.BIG_INTEGER) {
                    s2(lVar.e0());
                    return;
                } else {
                    p2(lVar.P1());
                    return;
                }
            case 8:
                l.b R12 = lVar.R1();
                if (R12 == l.b.BIG_DECIMAL) {
                    r2(lVar.h1());
                    return;
                } else if (R12 == l.b.FLOAT) {
                    n2(lVar.A1());
                    return;
                } else {
                    m2(lVar.m1());
                    return;
                }
            case 9:
                z10 = true;
                break;
            case 10:
                z10 = false;
                break;
            case 11:
                k2();
                return;
            case 12:
                writeObject(lVar.p1());
                return;
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + P);
        }
        c2(z10);
    }

    public i N1(t tVar) {
        this.O = tVar;
        return this;
    }

    public abstract void N2(String str) throws IOException;

    public i O1(u uVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void O2(String str, int i10, int i11) throws IOException;

    public void P(l lVar) throws IOException {
        p P = lVar.P();
        int i10 = -1;
        int e10 = P == null ? -1 : P.e();
        if (e10 == 5) {
            i2(lVar.X0());
            p D2 = lVar.D2();
            if (D2 != null) {
                i10 = D2.e();
            }
            e10 = i10;
        }
        if (e10 == 1) {
            V2();
        } else if (e10 != 3) {
            N(lVar);
            return;
        } else {
            R2();
        }
        c(lVar);
    }

    public void P1(d dVar) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", new Object[]{getClass().getName(), dVar.a()}));
    }

    public void P2(u uVar) throws IOException {
        N2(uVar.getValue());
    }

    public abstract i Q(b bVar);

    public abstract i Q1();

    public abstract void Q2(char[] cArr, int i10, int i11) throws IOException;

    public void R1(double[] dArr, int i10, int i11) throws IOException {
        if (dArr != null) {
            i(dArr.length, i10, i11);
            U2(dArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                m2(dArr[i10]);
                i10++;
            }
            f2();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public abstract void R2() throws IOException;

    public void S1(int[] iArr, int i10, int i11) throws IOException {
        if (iArr != null) {
            i(iArr.length, i10, i11);
            U2(iArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                o2(iArr[i10]);
                i10++;
            }
            f2();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void S2(int i10) throws IOException {
        R2();
    }

    public abstract o T0();

    public void T1(long[] jArr, int i10, int i11) throws IOException {
        if (jArr != null) {
            i(jArr.length, i10, i11);
            U2(jArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                p2(jArr[i10]);
                i10++;
            }
            f2();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void T2(Object obj) throws IOException {
        R2();
        A1(obj);
    }

    public void U1(String[] strArr, int i10, int i11) throws IOException {
        if (strArr != null) {
            i(strArr.length, i10, i11);
            U2(strArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                Z2(strArr[i10]);
                i10++;
            }
            f2();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void U2(Object obj, int i10) throws IOException {
        S2(i10);
        A1(obj);
    }

    public void V1(String str) throws IOException {
        i2(str);
        R2();
    }

    public abstract void V2() throws IOException;

    public Object W0() {
        return null;
    }

    public int W1(InputStream inputStream, int i10) throws IOException {
        return X1(b.a(), inputStream, i10);
    }

    public void W2(Object obj) throws IOException {
        V2();
        A1(obj);
    }

    public t X0() {
        return this.O;
    }

    public abstract int X1(a aVar, InputStream inputStream, int i10) throws IOException;

    public void X2(Object obj, int i10) throws IOException {
        V2();
        A1(obj);
    }

    public abstract i Y(b bVar);

    public abstract void Y1(a aVar, byte[] bArr, int i10, int i11) throws IOException;

    public void Y2(Reader reader, int i10) throws IOException {
        g();
    }

    public d Z0() {
        return null;
    }

    public void Z1(byte[] bArr) throws IOException {
        Y1(b.a(), bArr, 0, bArr.length);
    }

    public abstract void Z2(String str) throws IOException;

    public c5.b a0() {
        return null;
    }

    public void a2(byte[] bArr, int i10, int i11) throws IOException {
        Y1(b.a(), bArr, i10, i11);
    }

    public abstract void a3(u uVar) throws IOException;

    public void b2(String str, byte[] bArr) throws IOException {
        i2(str);
        Z1(bArr);
    }

    public abstract void b3(char[] cArr, int i10, int i11) throws IOException;

    public void c(l lVar) throws IOException {
        int i10 = 1;
        while (true) {
            p D2 = lVar.D2();
            if (D2 != null) {
                switch (D2.e()) {
                    case 1:
                        V2();
                        break;
                    case 2:
                        g2();
                        i10--;
                        if (i10 != 0) {
                            continue;
                        } else {
                            return;
                        }
                    case 3:
                        R2();
                        break;
                    case 4:
                        f2();
                        i10--;
                        if (i10 != 0) {
                            continue;
                        } else {
                            return;
                        }
                    case 5:
                        i2(lVar.X0());
                        continue;
                    case 6:
                        if (!lVar.p2()) {
                            Z2(lVar.Y1());
                            break;
                        } else {
                            b3(lVar.Z1(), lVar.b2(), lVar.a2());
                            continue;
                        }
                    case 7:
                        l.b R1 = lVar.R1();
                        if (R1 != l.b.INT) {
                            if (R1 != l.b.BIG_INTEGER) {
                                p2(lVar.P1());
                                break;
                            } else {
                                s2(lVar.e0());
                                break;
                            }
                        } else {
                            o2(lVar.N1());
                            continue;
                        }
                    case 8:
                        l.b R12 = lVar.R1();
                        if (R12 != l.b.BIG_DECIMAL) {
                            if (R12 != l.b.FLOAT) {
                                m2(lVar.m1());
                                break;
                            } else {
                                n2(lVar.A1());
                                break;
                            }
                        } else {
                            r2(lVar.h1());
                            continue;
                        }
                    case 9:
                        c2(true);
                        continue;
                    case 10:
                        c2(false);
                        continue;
                    case 11:
                        k2();
                        continue;
                    case 12:
                        writeObject(lVar.p1());
                        continue;
                    default:
                        throw new IllegalStateException("Internal error: unknown current token, " + D2);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract s c0();

    public abstract void c2(boolean z10) throws IOException;

    public void c3(String str, String str2) throws IOException {
        i2(str);
        Z2(str2);
    }

    public abstract void close() throws IOException;

    public void d2(String str, boolean z10) throws IOException {
        i2(str);
        c2(z10);
    }

    public abstract void d3(a0 a0Var) throws IOException;

    public Object e0() {
        o T0 = T0();
        if (T0 == null) {
            return null;
        }
        return T0.c();
    }

    public void e2(Object obj) throws IOException {
        if (obj == null) {
            k2();
        } else if (obj instanceof byte[]) {
            Z1((byte[]) obj);
        } else {
            throw new h("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public void e3(Object obj) throws IOException {
        throw new h("No native support for writing Type Ids", this);
    }

    public void f(String str) throws h {
        throw new h(str, this);
    }

    public abstract boolean f1(b bVar);

    public abstract void f2() throws IOException;

    public c f3(c cVar) throws IOException {
        Object obj = cVar.f8041c;
        p pVar = cVar.f8044f;
        if (w()) {
            cVar.f8045g = false;
            e3(obj);
        } else {
            String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            cVar.f8045g = true;
            c.a aVar = cVar.f8043e;
            if (pVar != p.START_OBJECT && aVar.a()) {
                aVar = c.a.WRAPPER_ARRAY;
                cVar.f8043e = aVar;
            }
            int i10 = a.f14630a[aVar.ordinal()];
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 3) {
                    W2(cVar.f8039a);
                    c3(cVar.f8042d, valueOf);
                    return cVar;
                } else if (i10 != 4) {
                    R2();
                    Z2(valueOf);
                } else {
                    V2();
                    i2(valueOf);
                }
            }
        }
        if (pVar == p.START_OBJECT) {
            W2(cVar.f8039a);
        } else if (pVar == p.START_ARRAY) {
            R2();
        }
        return cVar;
    }

    public abstract void flush() throws IOException;

    public void g() {
        throw new UnsupportedOperationException("Operation not supported by generator of type " + getClass().getName());
    }

    public boolean g1(w wVar) {
        return f1(wVar.i());
    }

    public abstract void g2() throws IOException;

    public c g3(c cVar) throws IOException {
        p pVar = cVar.f8044f;
        if (pVar == p.START_OBJECT) {
            g2();
        } else if (pVar == p.START_ARRAY) {
            f2();
        }
        if (cVar.f8045g) {
            int i10 = a.f14630a[cVar.f8043e.ordinal()];
            if (i10 == 1) {
                Object obj = cVar.f8041c;
                c3(cVar.f8042d, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (!(i10 == 2 || i10 == 3)) {
                if (i10 != 5) {
                    g2();
                } else {
                    f2();
                }
            }
        }
        return cVar;
    }

    public final void h() {
        p.f();
    }

    public i h1(int i10, int i11) {
        return this;
    }

    public void h2(long j10) throws IOException {
        i2(Long.toString(j10));
    }

    public abstract void h3(byte[] bArr, int i10, int i11) throws IOException;

    public final void i(int i10, int i11, int i12) {
        if (i11 < 0 || i11 + i12 > i10) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)}));
        }
    }

    public abstract void i2(String str) throws IOException;

    public abstract boolean isClosed();

    public abstract void j2(u uVar) throws IOException;

    public void k(Object obj) throws IOException {
        if (obj == null) {
            k2();
        } else if (obj instanceof String) {
            Z2((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    o2(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    p2(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    m2(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    n2(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    t2(number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    t2((short) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    s2((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    r2((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    o2(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    p2(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                Z1((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                c2(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                c2(((AtomicBoolean) obj).get());
                return;
            }
            throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
        }
    }

    public abstract int k0();

    public abstract void k2() throws IOException;

    public boolean l() {
        return true;
    }

    public void l2(String str) throws IOException {
        i2(str);
        k2();
    }

    public boolean m(d dVar) {
        return false;
    }

    public int m0() {
        return 0;
    }

    public i m1(int i10, int i11) {
        return F1((i10 & i11) | (k0() & (~i11)));
    }

    public abstract void m2(double d10) throws IOException;

    public abstract void n2(float f10) throws IOException;

    public boolean o() {
        return false;
    }

    public abstract void o2(int i10) throws IOException;

    public i p1(c5.b bVar) {
        return this;
    }

    public abstract void p2(long j10) throws IOException;

    public boolean q() {
        return false;
    }

    public abstract void q2(String str) throws IOException;

    public abstract i r1(s sVar);

    public abstract void r2(BigDecimal bigDecimal) throws IOException;

    public abstract void s2(BigInteger bigInteger) throws IOException;

    public boolean t() {
        return false;
    }

    public void t2(short s10) throws IOException {
        o2(s10);
    }

    public void u2(char[] cArr, int i10, int i11) throws IOException {
        q2(new String(cArr, i10, i11));
    }

    public void v2(String str, double d10) throws IOException {
        i2(str);
        m2(d10);
    }

    public abstract b0 version();

    public boolean w() {
        return false;
    }

    public void w2(String str, float f10) throws IOException {
        i2(str);
        n2(f10);
    }

    public abstract void writeObject(Object obj) throws IOException;

    public void x2(String str, int i10) throws IOException {
        i2(str);
        o2(i10);
    }

    public void y2(String str, long j10) throws IOException {
        i2(str);
        p2(j10);
    }

    public int z0() {
        return 0;
    }

    public void z2(String str, BigDecimal bigDecimal) throws IOException {
        i2(str);
        r2(bigDecimal);
    }
}
