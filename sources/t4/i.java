package t4;

import d.m0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class i extends FilterInputStream {
    public static final int P = Integer.MIN_VALUE;
    public static final int Q = -1;
    public int O = Integer.MIN_VALUE;

    public i(@m0 InputStream inputStream) {
        super(inputStream);
    }

    public int available() throws IOException {
        int i10 = this.O;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final long c(long j10) {
        int i10 = this.O;
        if (i10 == 0) {
            return -1;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : (long) i10;
    }

    public final void f(long j10) {
        int i10 = this.O;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.O = (int) (((long) i10) - j10);
        }
    }

    public synchronized void mark(int i10) {
        super.mark(i10);
        this.O = i10;
    }

    public int read() throws IOException {
        if (c(1) == -1) {
            return -1;
        }
        int read = super.read();
        f(1);
        return read;
    }

    public int read(@m0 byte[] bArr, int i10, int i11) throws IOException {
        int c10 = (int) c((long) i11);
        if (c10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, c10);
        f((long) read);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.O = Integer.MIN_VALUE;
    }

    public long skip(long j10) throws IOException {
        long c10 = c(j10);
        if (c10 == -1) {
            return 0;
        }
        long skip = super.skip(c10);
        f(skip);
        return skip;
    }
}
