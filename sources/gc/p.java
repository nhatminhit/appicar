package gc;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class p extends InputStream {
    public static final int T = 4096;
    public final InputStream O;
    public long P;
    public long Q;
    public long R;
    public long S;

    public p(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public p(InputStream inputStream, int i10) {
        this.S = -1;
        this.O = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i10) : inputStream;
    }

    public int available() throws IOException {
        return this.O.available();
    }

    public void c(long j10) throws IOException {
        if (this.P > this.R || j10 < this.Q) {
            throw new IOException("Cannot reset");
        }
        this.O.reset();
        h(this.Q, j10);
        this.P = j10;
    }

    public void close() throws IOException {
        this.O.close();
    }

    public long f(int i10) {
        long j10 = this.P + ((long) i10);
        if (this.R < j10) {
            g(j10);
        }
        return this.P;
    }

    public final void g(long j10) {
        try {
            long j11 = this.Q;
            long j12 = this.P;
            if (j11 >= j12 || j12 > this.R) {
                this.Q = j12;
                this.O.mark((int) (j10 - j12));
            } else {
                this.O.reset();
                this.O.mark((int) (j10 - this.Q));
                h(this.Q, this.P);
            }
            this.R = j10;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    public final void h(long j10, long j11) throws IOException {
        while (j10 < j11) {
            long skip = this.O.skip(j11 - j10);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j10 += skip;
        }
    }

    public void mark(int i10) {
        this.S = f(i10);
    }

    public boolean markSupported() {
        return this.O.markSupported();
    }

    public int read() throws IOException {
        int read = this.O.read();
        if (read != -1) {
            this.P++;
        }
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        int read = this.O.read(bArr);
        if (read != -1) {
            this.P += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.O.read(bArr, i10, i11);
        if (read != -1) {
            this.P += (long) read;
        }
        return read;
    }

    public void reset() throws IOException {
        c(this.S);
    }

    public long skip(long j10) throws IOException {
        long skip = this.O.skip(j10);
        this.P += skip;
        return skip;
    }
}
