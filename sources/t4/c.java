package t4;

import android.text.TextUtils;
import android.util.Log;
import d.m0;
import d.o0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {
    public static final String Q = "ContentLengthStream";
    public static final int R = -1;
    public final long O;
    public int P;

    public c(@m0 InputStream inputStream, long j10) {
        super(inputStream);
        this.O = j10;
    }

    @m0
    public static InputStream f(@m0 InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @m0
    public static InputStream g(@m0 InputStream inputStream, @o0 String str) {
        return f(inputStream, (long) h(str));
    }

    public static int h(@o0 String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                if (Log.isLoggable(Q, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("failed to parse content length header: ");
                    sb2.append(str);
                }
            }
        }
        return -1;
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.O - ((long) this.P), (long) this.in.available());
    }

    public final int c(int i10) throws IOException {
        if (i10 >= 0) {
            this.P += i10;
        } else if (this.O - ((long) this.P) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.O + ", but read: " + this.P);
        }
        return i10;
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        c(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        return c(super.read(bArr, i10, i11));
    }
}
