package ih;

import hh.d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

public final class a extends BufferedInputStream {
    public static final int U = 32768;
    public final boolean O;
    public final int P;
    public long Q;
    public long R = 0;
    public int S;
    public boolean T;

    public a(InputStream inputStream, int i10, int i11) {
        super(inputStream, i10);
        boolean z10 = true;
        d.d(i11 >= 0);
        this.P = i11;
        this.S = i11;
        this.O = i11 == 0 ? false : z10;
        this.Q = System.nanoTime();
    }

    public static a h(InputStream inputStream, int i10, int i11) {
        return inputStream instanceof a ? (a) inputStream : new a(inputStream, i10, i11);
    }

    public final boolean c() {
        return this.R != 0 && System.nanoTime() - this.Q > this.R;
    }

    public ByteBuffer f(int i10) throws IOException {
        boolean z10 = true;
        d.e(i10 >= 0, "maxSize must be 0 (unlimited) or larger");
        if (i10 <= 0) {
            z10 = false;
        }
        int i11 = 32768;
        if (z10 && i10 < 32768) {
            i11 = i10;
        }
        byte[] bArr = new byte[i11];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        while (true) {
            int read = read(bArr);
            if (read == -1) {
                break;
            }
            if (z10) {
                if (read >= i10) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                    break;
                }
                i10 -= read;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    public a g(long j10, long j11) {
        this.Q = j10;
        this.R = j11 * 1000000;
        return this;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        if (this.T || (this.O && this.S <= 0)) {
            return -1;
        }
        if (Thread.interrupted()) {
            this.T = true;
            return -1;
        } else if (!c()) {
            if (this.O && i11 > (i12 = this.S)) {
                i11 = i12;
            }
            try {
                int read = super.read(bArr, i10, i11);
                this.S -= read;
                return read;
            } catch (SocketTimeoutException unused) {
                return 0;
            }
        } else {
            throw new SocketTimeoutException("Read timeout");
        }
    }

    public void reset() throws IOException {
        super.reset();
        this.S = this.P - this.markpos;
    }
}
