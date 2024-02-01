package y4;

import d5.b;
import d5.f;
import d5.h;
import h5.e;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import w4.a0;
import w4.b0;
import w4.i;
import w4.o;
import w4.s;
import w4.t;
import w4.u;

public abstract class a extends i {
    public static final int U = 55296;
    public static final int V = 56319;
    public static final int W = 56320;
    public static final int X = 57343;
    public static final int Y = ((i.b.WRITE_NUMBERS_AS_STRINGS.e() | i.b.ESCAPE_NON_ASCII.e()) | i.b.STRICT_DUPLICATE_DETECTION.e());
    public static final String Z = "write a binary value";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f15466a0 = "write a boolean value";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f15467b0 = "write a null";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f15468c0 = "write a number";

    /* renamed from: d0  reason: collision with root package name */
    public static final String f15469d0 = "write a raw (unencoded) value";

    /* renamed from: e0  reason: collision with root package name */
    public static final String f15470e0 = "write a string";

    /* renamed from: f0  reason: collision with root package name */
    public static final int f15471f0 = 9999;
    public s P;
    public int Q;
    public boolean R;
    public f S;
    public boolean T;

    public a(int i10, s sVar) {
        this.Q = i10;
        this.P = sVar;
        this.S = f.y(i.b.STRICT_DUPLICATE_DETECTION.d(i10) ? b.f(this) : null);
        this.R = i.b.WRITE_NUMBERS_AS_STRINGS.d(i10);
    }

    public a(int i10, s sVar, f fVar) {
        this.Q = i10;
        this.P = sVar;
        this.S = fVar;
        this.R = i.b.WRITE_NUMBERS_AS_STRINGS.d(i10);
    }

    public void A1(Object obj) {
        f fVar = this.S;
        if (fVar != null) {
            fVar.p(obj);
        }
    }

    @Deprecated
    public i F1(int i10) {
        int i11 = this.Q ^ i10;
        this.Q = i10;
        if (i11 != 0) {
            j3(i10, i11);
        }
        return this;
    }

    public void N2(String str) throws IOException {
        n3("write raw value");
        I2(str);
    }

    public void O2(String str, int i10, int i11) throws IOException {
        n3("write raw value");
        J2(str, i10, i11);
    }

    public void P2(u uVar) throws IOException {
        n3("write raw value");
        K2(uVar);
    }

    public i Q(i.b bVar) {
        int e10 = bVar.e();
        this.Q &= ~e10;
        if ((e10 & Y) != 0) {
            if (bVar == i.b.WRITE_NUMBERS_AS_STRINGS) {
                this.R = false;
            } else if (bVar == i.b.ESCAPE_NON_ASCII) {
                L1(0);
            } else if (bVar == i.b.STRICT_DUPLICATE_DETECTION) {
                this.S = this.S.D((b) null);
            }
        }
        return this;
    }

    public i Q1() {
        return X0() != null ? this : N1(k3());
    }

    public void Q2(char[] cArr, int i10, int i11) throws IOException {
        n3("write raw value");
        L2(cArr, i10, i11);
    }

    public o T0() {
        return this.S;
    }

    public void W2(Object obj) throws IOException {
        V2();
        if (obj != null) {
            A1(obj);
        }
    }

    public int X1(w4.a aVar, InputStream inputStream, int i10) throws IOException {
        g();
        return 0;
    }

    public i Y(i.b bVar) {
        int e10 = bVar.e();
        this.Q |= e10;
        if ((e10 & Y) != 0) {
            if (bVar == i.b.WRITE_NUMBERS_AS_STRINGS) {
                this.R = true;
            } else if (bVar == i.b.ESCAPE_NON_ASCII) {
                L1(127);
            } else if (bVar == i.b.STRICT_DUPLICATE_DETECTION && this.S.z() == null) {
                this.S = this.S.D(b.f(this));
            }
        }
        return this;
    }

    public void a3(u uVar) throws IOException {
        Z2(uVar.getValue());
    }

    public s c0() {
        return this.P;
    }

    public void close() throws IOException {
        this.T = true;
    }

    public void d3(a0 a0Var) throws IOException {
        if (a0Var == null) {
            k2();
            return;
        }
        s sVar = this.P;
        if (sVar != null) {
            sVar.q(this, a0Var);
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined");
    }

    public Object e0() {
        return this.S.c();
    }

    public final boolean f1(i.b bVar) {
        return (bVar.e() & this.Q) != 0;
    }

    public abstract void flush() throws IOException;

    public String i3(BigDecimal bigDecimal) throws IOException {
        if (!i.b.WRITE_BIGDECIMAL_AS_PLAIN.d(this.Q)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale < -9999 || scale > 9999) {
            f(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), 9999, 9999}));
        }
        return bigDecimal.toPlainString();
    }

    public boolean isClosed() {
        return this.T;
    }

    public void j2(u uVar) throws IOException {
        i2(uVar.getValue());
    }

    public void j3(int i10, int i11) {
        b bVar;
        f fVar;
        if ((Y & i11) != 0) {
            this.R = i.b.WRITE_NUMBERS_AS_STRINGS.d(i10);
            i.b bVar2 = i.b.ESCAPE_NON_ASCII;
            if (bVar2.d(i11)) {
                L1(bVar2.d(i10) ? 127 : 0);
            }
            i.b bVar3 = i.b.STRICT_DUPLICATE_DETECTION;
            if (bVar3.d(i11)) {
                if (!bVar3.d(i10)) {
                    fVar = this.S;
                    bVar = null;
                } else if (this.S.z() == null) {
                    fVar = this.S;
                    bVar = b.f(this);
                } else {
                    return;
                }
                this.S = fVar.D(bVar);
            }
        }
    }

    public int k0() {
        return this.Q;
    }

    public t k3() {
        return new e();
    }

    public final int l3(int i10, int i11) throws IOException {
        if (i11 < 56320 || i11 > 57343) {
            f("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i10) + ", second 0x" + Integer.toHexString(i11));
        }
        return ((i10 - 55296) << 10) + 65536 + (i11 - 56320);
    }

    public i m1(int i10, int i11) {
        int i12 = this.Q;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this.Q = i13;
            j3(i13, i14);
        }
        return this;
    }

    public abstract void m3();

    public abstract void n3(String str) throws IOException;

    public i r1(s sVar) {
        this.P = sVar;
        return this;
    }

    public b0 version() {
        return h.O;
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            k2();
            return;
        }
        s sVar = this.P;
        if (sVar != null) {
            sVar.q(this, obj);
        } else {
            k(obj);
        }
    }
}
