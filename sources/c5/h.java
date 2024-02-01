package c5;

import java.io.IOException;
import java.io.InputStream;

public final class h extends InputStream {
    public final d O;
    public final InputStream P;
    public byte[] Q;
    public int R;
    public final int S;

    public h(d dVar, InputStream inputStream, byte[] bArr, int i10, int i11) {
        this.O = dVar;
        this.P = inputStream;
        this.Q = bArr;
        this.R = i10;
        this.S = i11;
    }

    public int available() throws IOException {
        return this.Q != null ? this.S - this.R : this.P.available();
    }

    public final void c() {
        byte[] bArr = this.Q;
        if (bArr != null) {
            this.Q = null;
            d dVar = this.O;
            if (dVar != null) {
                dVar.u(bArr);
            }
        }
    }

    public void close() throws IOException {
        c();
        this.P.close();
    }

    public void mark(int i10) {
        if (this.Q == null) {
            this.P.mark(i10);
        }
    }

    public boolean markSupported() {
        return this.Q == null && this.P.markSupported();
    }

    public int read() throws IOException {
        byte[] bArr = this.Q;
        if (bArr == null) {
            return this.P.read();
        }
        int i10 = this.R;
        int i11 = i10 + 1;
        this.R = i11;
        byte b10 = bArr[i10] & 255;
        if (i11 >= this.S) {
            c();
        }
        return b10;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2 = this.Q;
        if (bArr2 == null) {
            return this.P.read(bArr, i10, i11);
        }
        int i12 = this.S;
        int i13 = this.R;
        int i14 = i12 - i13;
        if (i11 > i14) {
            i11 = i14;
        }
        System.arraycopy(bArr2, i13, bArr, i10, i11);
        int i15 = this.R + i11;
        this.R = i15;
        if (i15 >= this.S) {
            c();
        }
        return i11;
    }

    public void reset() throws IOException {
        if (this.Q == null) {
            this.P.reset();
        }
    }

    public long skip(long j10) throws IOException {
        long j11;
        if (this.Q != null) {
            int i10 = this.S;
            int i11 = this.R;
            long j12 = (long) (i10 - i11);
            if (j12 > j10) {
                this.R = i11 + ((int) j10);
                return j10;
            }
            c();
            j11 = j12 + 0;
            j10 -= j12;
        } else {
            j11 = 0;
        }
        return j10 > 0 ? j11 + this.P.skip(j10) : j11;
    }
}
