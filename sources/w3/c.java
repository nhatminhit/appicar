package w3;

import d.g1;
import d.m0;
import java.io.IOException;
import java.io.OutputStream;
import z3.b;

public final class c extends OutputStream {
    @m0
    public final OutputStream O;
    public byte[] P;
    public b Q;
    public int R;

    public c(@m0 OutputStream outputStream, @m0 b bVar) {
        this(outputStream, bVar, 65536);
    }

    @g1
    public c(@m0 OutputStream outputStream, b bVar, int i10) {
        this.O = outputStream;
        this.Q = bVar;
        this.P = (byte[]) bVar.e(i10, byte[].class);
    }

    public final void a() {
        byte[] bArr = this.P;
        if (bArr != null) {
            this.Q.put(bArr);
            this.P = null;
        }
    }

    public final void c() throws IOException {
        int i10 = this.R;
        if (i10 > 0) {
            this.O.write(this.P, 0, i10);
            this.R = 0;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.O.close();
            a();
        } catch (Throwable th2) {
            this.O.close();
            throw th2;
        }
    }

    public final void f() throws IOException {
        if (this.R == this.P.length) {
            c();
        }
    }

    public void flush() throws IOException {
        c();
        this.O.flush();
    }

    public void write(int i10) throws IOException {
        byte[] bArr = this.P;
        int i11 = this.R;
        this.R = i11 + 1;
        bArr[i11] = (byte) i10;
        f();
    }

    public void write(@m0 byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(@m0 byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.R;
            if (i15 != 0 || i13 < this.P.length) {
                int min = Math.min(i13, this.P.length - i15);
                System.arraycopy(bArr, i14, this.P, this.R, min);
                this.R += min;
                i12 += min;
                f();
            } else {
                this.O.write(bArr, i14, i13);
                return;
            }
        } while (i12 < i11);
    }
}
