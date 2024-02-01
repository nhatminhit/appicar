package h5;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

public final class c extends OutputStream {
    public static final byte[] T = new byte[0];
    public static final int U = 500;
    public static final int V = 131072;
    public static final int W = 40;
    public final a O;
    public final LinkedList<byte[]> P;
    public int Q;
    public byte[] R;
    public int S;

    public c() {
        this((a) null);
    }

    public c(int i10) {
        this((a) null, i10);
    }

    public c(a aVar) {
        this(aVar, 500);
    }

    public c(a aVar, int i10) {
        this.P = new LinkedList<>();
        this.O = aVar;
        this.R = aVar == null ? new byte[i10] : aVar.a(2);
    }

    public c(a aVar, byte[] bArr, int i10) {
        this.P = new LinkedList<>();
        this.O = null;
        this.R = bArr;
        this.S = i10;
    }

    public static c m(byte[] bArr, int i10) {
        return new c((a) null, bArr, i10);
    }

    public void A(int i10) {
        this.S = i10;
    }

    public int N() {
        return this.Q + this.S;
    }

    public byte[] P() {
        int i10 = this.Q + this.S;
        if (i10 == 0) {
            return T;
        }
        byte[] bArr = new byte[i10];
        Iterator<byte[]> it = this.P.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i11, length);
            i11 += length;
        }
        System.arraycopy(this.R, 0, bArr, i11, this.S);
        int i12 = i11 + this.S;
        if (i12 == i10) {
            if (!this.P.isEmpty()) {
                t();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i10 + ", copied " + i12 + " bytes");
    }

    public void a() {
        byte[] bArr;
        t();
        a aVar = this.O;
        if (aVar != null && (bArr = this.R) != null) {
            aVar.i(2, bArr);
            this.R = null;
        }
    }

    public final void c() {
        int length = this.Q + this.R.length;
        if (length >= 0) {
            this.Q = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = 131072;
            }
            this.P.add(this.R);
            this.R = new byte[max];
            this.S = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    public void close() {
    }

    public void f(int i10) {
        if (this.S >= this.R.length) {
            c();
        }
        byte[] bArr = this.R;
        int i11 = this.S;
        this.S = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void flush() {
    }

    public void g(int i10) {
        int i11 = this.S;
        int i12 = i11 + 3;
        byte[] bArr = this.R;
        if (i12 < bArr.length) {
            int i13 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 24);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (i10 >> 16);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (i10 >> 8);
            this.S = i15 + 1;
            bArr[i15] = (byte) i10;
            return;
        }
        f(i10 >> 24);
        f(i10 >> 16);
        f(i10 >> 8);
        f(i10);
    }

    public void h(int i10) {
        int i11 = this.S;
        int i12 = i11 + 2;
        byte[] bArr = this.R;
        if (i12 < bArr.length) {
            int i13 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 16);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (i10 >> 8);
            this.S = i14 + 1;
            bArr[i14] = (byte) i10;
            return;
        }
        f(i10 >> 16);
        f(i10 >> 8);
        f(i10);
    }

    public void i(int i10) {
        int i11 = this.S;
        int i12 = i11 + 1;
        byte[] bArr = this.R;
        if (i12 < bArr.length) {
            int i13 = i11 + 1;
            bArr[i11] = (byte) (i10 >> 8);
            this.S = i13 + 1;
            bArr[i13] = (byte) i10;
            return;
        }
        f(i10 >> 8);
        f(i10);
    }

    public byte[] k(int i10) {
        this.S = i10;
        return P();
    }

    public byte[] l() {
        c();
        return this.R;
    }

    public byte[] o() {
        return this.R;
    }

    public int q() {
        return this.S;
    }

    public void t() {
        this.Q = 0;
        this.S = 0;
        if (!this.P.isEmpty()) {
            this.P.clear();
        }
    }

    public byte[] w() {
        t();
        return this.R;
    }

    public void write(int i10) {
        f(i10);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int min = Math.min(this.R.length - this.S, i11);
            if (min > 0) {
                System.arraycopy(bArr, i10, this.R, this.S, min);
                i10 += min;
                this.S += min;
                i11 -= min;
            }
            if (i11 > 0) {
                c();
            } else {
                return;
            }
        }
    }
}
