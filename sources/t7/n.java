package t7;

import d.m0;
import java.io.IOException;
import java.io.InputStream;
import w7.a;

public final class n extends InputStream {
    public final l O;
    public final o P;
    public final byte[] Q;
    public boolean R = false;
    public boolean S = false;
    public long T;

    public n(l lVar, o oVar) {
        this.O = lVar;
        this.P = oVar;
        this.Q = new byte[1];
    }

    public long c() {
        return this.T;
    }

    public void close() throws IOException {
        if (!this.S) {
            this.O.close();
            this.S = true;
        }
    }

    public final void f() throws IOException {
        if (!this.R) {
            this.O.a(this.P);
            this.R = true;
        }
    }

    public void g() throws IOException {
        f();
    }

    public int read() throws IOException {
        if (read(this.Q) == -1) {
            return -1;
        }
        return this.Q[0] & 255;
    }

    public int read(@m0 byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(@m0 byte[] bArr, int i10, int i11) throws IOException {
        a.i(!this.S);
        f();
        int read = this.O.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.T += (long) read;
        return read;
    }
}
