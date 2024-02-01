package pa;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class d implements Closeable, Flushable {
    public static final String[] X = new String[128];
    public static final String[] Y;
    public final Writer O;
    public int[] P = new int[32];
    public int Q = 0;
    public String R;
    public String S;
    public boolean T;
    public boolean U;
    public String V;
    public boolean W;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            X[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = X;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        Y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public d(Writer writer) {
        Y(6);
        this.S = ":";
        this.W = true;
        if (writer != null) {
            this.O = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final void A() throws IOException {
        if (this.R != null) {
            this.O.write(10);
            int i10 = this.Q;
            for (int i11 = 1; i11 < i10; i11++) {
                this.O.write(this.R);
            }
        }
    }

    public d H0(double d10) throws IOException {
        g1();
        if (this.T || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            f();
            this.O.append(Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public d N() throws IOException {
        if (this.V != null) {
            if (this.W) {
                g1();
            } else {
                this.V = null;
                return this;
            }
        }
        f();
        this.O.write("null");
        return this;
    }

    public final d P(int i10, char c10) throws IOException {
        f();
        Y(i10);
        this.O.write(c10);
        return this;
    }

    public final int Q() {
        int i10 = this.Q;
        if (i10 != 0) {
            return this.P[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public d T0(long j10) throws IOException {
        g1();
        f();
        this.O.write(Long.toString(j10));
        return this;
    }

    public d W0(Boolean bool) throws IOException {
        if (bool == null) {
            return N();
        }
        g1();
        f();
        this.O.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public d X0(Number number) throws IOException {
        if (number == null) {
            return N();
        }
        g1();
        String obj = number.toString();
        if (this.T || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            f();
            this.O.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public final void Y(int i10) {
        int i11 = this.Q;
        int[] iArr = this.P;
        if (i11 == iArr.length) {
            this.P = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.P;
        int i12 = this.Q;
        this.Q = i12 + 1;
        iArr2[i12] = i10;
    }

    public d Z0(String str) throws IOException {
        if (str == null) {
            return N();
        }
        g1();
        f();
        z0(str);
        return this;
    }

    public final void a0(int i10) {
        this.P[this.Q - 1] = i10;
    }

    public final void c() throws IOException {
        int Q2 = Q();
        if (Q2 == 5) {
            this.O.write(44);
        } else if (Q2 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        A();
        a0(4);
    }

    public final void c0(boolean z10) {
        this.U = z10;
    }

    public void close() throws IOException {
        this.O.close();
        int i10 = this.Q;
        if (i10 > 1 || (i10 == 1 && this.P[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.Q = 0;
    }

    public final void e0(String str) {
        String str2;
        if (str.length() == 0) {
            this.R = null;
            str2 = ":";
        } else {
            this.R = str;
            str2 = ": ";
        }
        this.S = str2;
    }

    public final void f() throws IOException {
        int Q2 = Q();
        if (Q2 == 1) {
            a0(2);
        } else if (Q2 == 2) {
            this.O.append(',');
        } else if (Q2 != 4) {
            if (Q2 != 6) {
                if (Q2 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.T) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            a0(7);
            return;
        } else {
            this.O.append(this.S);
            a0(5);
            return;
        }
        A();
    }

    public d f1(boolean z10) throws IOException {
        g1();
        f();
        this.O.write(z10 ? "true" : "false");
        return this;
    }

    public void flush() throws IOException {
        if (this.Q != 0) {
            this.O.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public d g() throws IOException {
        g1();
        return P(1, '[');
    }

    public final void g1() throws IOException {
        if (this.V != null) {
            c();
            z0(this.V);
            this.V = null;
        }
    }

    public d h() throws IOException {
        g1();
        return P(3, '{');
    }

    public final d i(int i10, int i11, char c10) throws IOException {
        int Q2 = Q();
        if (Q2 != i11 && Q2 != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.V == null) {
            this.Q--;
            if (Q2 == i11) {
                A();
            }
            this.O.write(c10);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.V);
        }
    }

    public d k() throws IOException {
        return i(1, 2, ']');
    }

    public final void k0(boolean z10) {
        this.T = z10;
    }

    public d l() throws IOException {
        return i(3, 5, '}');
    }

    public final boolean m() {
        return this.W;
    }

    public final void m0(boolean z10) {
        this.W = z10;
    }

    public final boolean o() {
        return this.U;
    }

    public boolean q() {
        return this.T;
    }

    public d t(String str) throws IOException {
        if (str == null) {
            return N();
        }
        g1();
        f();
        this.O.append(str);
        return this;
    }

    public d w(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.V != null) {
            throw new IllegalStateException();
        } else if (this.Q != 0) {
            this.V = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void z0(String str) throws IOException {
        String str2;
        String[] strArr = this.U ? Y : X;
        this.O.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                this.O.write(str, i10, i11 - i10);
            }
            this.O.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.O.write(str, i10, length - i10);
        }
        this.O.write(34);
    }
}
