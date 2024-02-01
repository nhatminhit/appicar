package t3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class c implements Closeable {
    public static final byte T = 13;
    public static final byte U = 10;
    public final InputStream O;
    public final Charset P;
    public byte[] Q;
    public int R;
    public int S;

    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        public String toString() {
            int i10 = this.count;
            if (i10 > 0 && this.buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(this.buf, 0, i10, c.this.P.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(d.f12935a)) {
            this.O = inputStream;
            this.P = charset;
            this.Q = new byte[i10];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public void close() throws IOException {
        synchronized (this.O) {
            if (this.Q != null) {
                this.Q = null;
                this.O.close();
            }
        }
    }

    public final void f() throws IOException {
        InputStream inputStream = this.O;
        byte[] bArr = this.Q;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.R = 0;
            this.S = read;
            return;
        }
        throw new EOFException();
    }

    public boolean g() {
        return this.S == -1;
    }

    public String h() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.O) {
            if (this.Q != null) {
                if (this.R >= this.S) {
                    f();
                }
                for (int i12 = this.R; i12 != this.S; i12++) {
                    byte[] bArr2 = this.Q;
                    if (bArr2[i12] == 10) {
                        int i13 = this.R;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.P.name());
                                this.R = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.P.name());
                        this.R = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.S - this.R) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.Q;
                    int i14 = this.R;
                    aVar.write(bArr3, i14, this.S - i14);
                    this.S = -1;
                    f();
                    i10 = this.R;
                    while (true) {
                        if (i10 != this.S) {
                            bArr = this.Q;
                            if (bArr[i10] == 10) {
                                break loop1;
                            }
                            i10++;
                        }
                    }
                }
                int i15 = this.R;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.R = i10 + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
