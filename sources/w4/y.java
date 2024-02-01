package w4;

import c5.c;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.net.URL;
import w4.i;
import w4.l;

public abstract class y implements c0, Serializable {
    public static final long O = 2;

    public abstract Class<? extends c> A();

    public abstract int B();

    public abstract int C();

    public abstract boolean D(i.b bVar);

    public abstract boolean E(l.a aVar);

    public abstract boolean F();

    public OutputStream a(DataOutput dataOutput) {
        return new c(dataOutput);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r3.getHost();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream b(java.net.URL r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = r3.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r3.getHost()
            if (r0 == 0) goto L_0x0018
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002e
        L_0x0018:
            java.lang.String r0 = r3.getPath()
            r1 = 37
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L_0x002e
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.String r3 = r3.getPath()
            r0.<init>(r3)
            return r0
        L_0x002e:
            java.io.InputStream r3 = r3.openStream()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.y.b(java.net.URL):java.io.InputStream");
    }

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e(d dVar);

    public abstract i f(DataOutput dataOutput) throws IOException;

    public abstract i g(DataOutput dataOutput, e eVar) throws IOException;

    public abstract i h(File file, e eVar) throws IOException;

    public abstract i i(OutputStream outputStream) throws IOException;

    public abstract i j(OutputStream outputStream, e eVar) throws IOException;

    public abstract i k(Writer writer) throws IOException;

    public abstract l l() throws IOException;

    public abstract l m(DataInput dataInput) throws IOException;

    public abstract l n(File file) throws IOException;

    public abstract l o(InputStream inputStream) throws IOException;

    public abstract l p(Reader reader) throws IOException;

    public abstract l q(String str) throws IOException;

    public abstract l r(URL url) throws IOException;

    public abstract l s(byte[] bArr) throws IOException;

    public abstract l t(byte[] bArr, int i10, int i11) throws IOException;

    public abstract l u(char[] cArr) throws IOException;

    public abstract l v(char[] cArr, int i10, int i11) throws IOException;

    public abstract int w();

    public abstract String x();

    public abstract int y();

    public abstract Class<? extends c> z();
}
