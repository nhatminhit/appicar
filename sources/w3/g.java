package w3;

import d.m0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import w1.a;

public final class g extends FilterInputStream {
    public static final int Q = 2;
    public static final byte[] R;
    public static final int S;
    public static final int T;
    public final byte O;
    public int P;

    static {
        byte[] bArr = {-1, a.Y6, 0, 28, 69, k7.a.f10047w, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        R = bArr;
        int length = bArr.length;
        S = length;
        T = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
        }
        this.O = (byte) i10;
    }

    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i10;
        int i11 = this.P;
        int read = (i11 < 2 || i11 > (i10 = T)) ? super.read() : i11 == i10 ? this.O : R[i11 - 2] & 255;
        if (read != -1) {
            this.P++;
        }
        return read;
    }

    public int read(@m0 byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.P;
        int i14 = T;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.O;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(R, this.P - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.P += i12;
        }
        return i12;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j10) throws IOException {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.P = (int) (((long) this.P) + skip);
        }
        return skip;
    }
}
