package re;

import be.s;
import fh.g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import oe.f;
import ve.h;
import xe.l0;
import zd.b1;
import zd.h1;
import zd.k;
import zd.l;

@h(name = "ByteStreamsKt")
public final class b {

    public static final class a extends s {
        public int O = -1;
        public boolean P;
        public boolean Q;
        public final /* synthetic */ BufferedInputStream R;

        public a(BufferedInputStream bufferedInputStream) {
            this.R = bufferedInputStream;
        }

        public byte b() {
            f();
            if (!this.Q) {
                byte b10 = (byte) this.O;
                this.P = false;
                return b10;
            }
            throw new NoSuchElementException("Input stream is over.");
        }

        public final boolean c() {
            return this.Q;
        }

        public final int d() {
            return this.O;
        }

        public final boolean e() {
            return this.P;
        }

        public final void f() {
            if (!this.P && !this.Q) {
                int read = this.R.read();
                this.O = read;
                boolean z10 = true;
                this.P = true;
                if (read != -1) {
                    z10 = false;
                }
                this.Q = z10;
            }
        }

        public final void h(boolean z10) {
            this.Q = z10;
        }

        public boolean hasNext() {
            f();
            return !this.Q;
        }

        public final void k(int i10) {
            this.O = i10;
        }

        public final void l(boolean z10) {
            this.P = z10;
        }
    }

    @f
    public static final BufferedInputStream a(InputStream inputStream, int i10) {
        l0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    @f
    public static final BufferedOutputStream b(OutputStream outputStream, int i10) {
        l0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    public static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        l0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i10);
    }

    public static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        l0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i10);
    }

    @f
    public static final BufferedReader e(InputStream inputStream, Charset charset) {
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    public static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @f
    public static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    public static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @f
    public static final ByteArrayInputStream i(String str, Charset charset) {
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@g InputStream inputStream, @g OutputStream outputStream, int i10) {
        l0.p(inputStream, "<this>");
        l0.p(outputStream, "out");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return k(inputStream, outputStream, i10);
    }

    @f
    public static final ByteArrayInputStream m(byte[] bArr) {
        l0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @f
    public static final ByteArrayInputStream n(byte[] bArr, int i10, int i11) {
        l0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i10, i11);
    }

    @g
    public static final s o(@g BufferedInputStream bufferedInputStream) {
        l0.p(bufferedInputStream, "<this>");
        return new a(bufferedInputStream);
    }

    @g
    @h1(version = "1.3")
    public static final byte[] p(@g InputStream inputStream) {
        l0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @g
    @l(errorSince = "1.5", warningSince = "1.3")
    @k(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @b1(expression = "readBytes()", imports = {}))
    public static final byte[] q(@g InputStream inputStream, int i10) {
        l0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i10, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        return q(inputStream, i10);
    }

    @f
    public static final InputStreamReader s(InputStream inputStream, Charset charset) {
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @f
    public static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
