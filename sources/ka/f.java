package ka;

import ha.h;
import ha.k;
import ha.m;
import ha.n;
import ha.q;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import pa.c;

public final class f extends pa.a {
    public static final Reader I0 = new a();
    public static final Object J0 = new Object();
    public Object[] E0 = new Object[32];
    public int F0 = 0;
    public String[] G0 = new String[32];
    public int[] H0 = new int[32];

    public class a extends Reader {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    public f(k kVar) {
        super(I0);
        P1(kVar);
    }

    private String w() {
        return " at path " + j1();
    }

    public boolean A() throws IOException {
        A1(c.BOOLEAN);
        boolean f10 = ((q) N1()).f();
        int i10 = this.F0;
        if (i10 > 0) {
            int[] iArr = this.H0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return f10;
    }

    public final void A1(c cVar) throws IOException {
        if (z0() != cVar) {
            throw new IllegalStateException("Expected " + cVar + " but was " + z0() + w());
        }
    }

    public k F1() throws IOException {
        c z02 = z0();
        if (z02 == c.NAME || z02 == c.END_ARRAY || z02 == c.END_OBJECT || z02 == c.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + z02 + " when reading a JsonElement.");
        }
        k kVar = (k) L1();
        p1();
        return kVar;
    }

    public final Object L1() {
        return this.E0[this.F0 - 1];
    }

    public double N() throws IOException {
        c z02 = z0();
        c cVar = c.NUMBER;
        if (z02 == cVar || z02 == c.STRING) {
            double j10 = ((q) L1()).j();
            if (q() || (!Double.isNaN(j10) && !Double.isInfinite(j10))) {
                N1();
                int i10 = this.F0;
                if (i10 > 0) {
                    int[] iArr = this.H0;
                    int i11 = i10 - 1;
                    iArr[i11] = iArr[i11] + 1;
                }
                return j10;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + j10);
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + z02 + w());
    }

    public final Object N1() {
        Object[] objArr = this.E0;
        int i10 = this.F0 - 1;
        this.F0 = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public void O1() throws IOException {
        A1(c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) L1()).next();
        P1(entry.getValue());
        P1(new q((String) entry.getKey()));
    }

    public int P() throws IOException {
        c z02 = z0();
        c cVar = c.NUMBER;
        if (z02 == cVar || z02 == c.STRING) {
            int m10 = ((q) L1()).m();
            N1();
            int i10 = this.F0;
            if (i10 > 0) {
                int[] iArr = this.H0;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return m10;
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + z02 + w());
    }

    public final void P1(Object obj) {
        int i10 = this.F0;
        Object[] objArr = this.E0;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.E0 = Arrays.copyOf(objArr, i11);
            this.H0 = Arrays.copyOf(this.H0, i11);
            this.G0 = (String[]) Arrays.copyOf(this.G0, i11);
        }
        Object[] objArr2 = this.E0;
        int i12 = this.F0;
        this.F0 = i12 + 1;
        objArr2[i12] = obj;
    }

    public long Q() throws IOException {
        c z02 = z0();
        c cVar = c.NUMBER;
        if (z02 == cVar || z02 == c.STRING) {
            long r10 = ((q) L1()).r();
            N1();
            int i10 = this.F0;
            if (i10 > 0) {
                int[] iArr = this.H0;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return r10;
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + z02 + w());
    }

    public String Y() throws IOException {
        A1(c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) L1()).next();
        String str = (String) entry.getKey();
        this.G0[this.F0 - 1] = str;
        P1(entry.getValue());
        return str;
    }

    public void c() throws IOException {
        A1(c.BEGIN_ARRAY);
        P1(((h) L1()).iterator());
        this.H0[this.F0 - 1] = 0;
    }

    public void c0() throws IOException {
        A1(c.NULL);
        N1();
        int i10 = this.F0;
        if (i10 > 0) {
            int[] iArr = this.H0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public void close() throws IOException {
        this.E0 = new Object[]{J0};
        this.F0 = 1;
    }

    public void f() throws IOException {
        A1(c.BEGIN_OBJECT);
        P1(((n) L1()).F().iterator());
    }

    public String j1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.F0;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.E0;
            Object obj = objArr[i10];
            if (obj instanceof h) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    sb2.append('[');
                    sb2.append(this.H0[i10]);
                    sb2.append(']');
                }
            } else if ((obj instanceof n) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.G0[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    public void k() throws IOException {
        A1(c.END_ARRAY);
        N1();
        N1();
        int i10 = this.F0;
        if (i10 > 0) {
            int[] iArr = this.H0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public String k0() throws IOException {
        c z02 = z0();
        c cVar = c.STRING;
        if (z02 == cVar || z02 == c.NUMBER) {
            String u10 = ((q) N1()).u();
            int i10 = this.F0;
            if (i10 > 0) {
                int[] iArr = this.H0;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return u10;
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + z02 + w());
    }

    public void l() throws IOException {
        A1(c.END_OBJECT);
        N1();
        N1();
        int i10 = this.F0;
        if (i10 > 0) {
            int[] iArr = this.H0;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public boolean o() throws IOException {
        c z02 = z0();
        return (z02 == c.END_OBJECT || z02 == c.END_ARRAY) ? false : true;
    }

    public void p1() throws IOException {
        if (z0() == c.NAME) {
            Y();
            this.G0[this.F0 - 2] = "null";
        } else {
            N1();
            int i10 = this.F0;
            if (i10 > 0) {
                this.G0[i10 - 1] = "null";
            }
        }
        int i11 = this.F0;
        if (i11 > 0) {
            int[] iArr = this.H0;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    public String toString() {
        return f.class.getSimpleName() + w();
    }

    public c z0() throws IOException {
        if (this.F0 == 0) {
            return c.END_DOCUMENT;
        }
        Object L1 = L1();
        if (L1 instanceof Iterator) {
            boolean z10 = this.E0[this.F0 - 2] instanceof n;
            Iterator it = (Iterator) L1;
            if (!it.hasNext()) {
                return z10 ? c.END_OBJECT : c.END_ARRAY;
            }
            if (z10) {
                return c.NAME;
            }
            P1(it.next());
            return z0();
        } else if (L1 instanceof n) {
            return c.BEGIN_OBJECT;
        } else {
            if (L1 instanceof h) {
                return c.BEGIN_ARRAY;
            }
            if (L1 instanceof q) {
                q qVar = (q) L1;
                if (qVar.D()) {
                    return c.STRING;
                }
                if (qVar.A()) {
                    return c.BOOLEAN;
                }
                if (qVar.C()) {
                    return c.NUMBER;
                }
                throw new AssertionError();
            } else if (L1 instanceof m) {
                return c.NULL;
            } else {
                if (L1 == J0) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }
}
