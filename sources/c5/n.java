package c5;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class n extends Reader {
    public static final int Z = 1114111;

    /* renamed from: a0  reason: collision with root package name */
    public static final char f4871a0 = 0;
    public final d O;
    public InputStream P;
    public byte[] Q;
    public int R;
    public int S;
    public final boolean T;
    public char U = 0;
    public int V;
    public int W;
    public final boolean X;
    public char[] Y;

    public n(d dVar, InputStream inputStream, byte[] bArr, int i10, int i11, boolean z10) {
        boolean z11 = false;
        this.O = dVar;
        this.P = inputStream;
        this.Q = bArr;
        this.R = i10;
        this.S = i11;
        this.T = z10;
        this.X = inputStream != null ? true : z11;
    }

    public final void c() {
        byte[] bArr = this.Q;
        if (bArr != null) {
            this.Q = null;
            this.O.u(bArr);
        }
    }

    public void close() throws IOException {
        InputStream inputStream = this.P;
        if (inputStream != null) {
            this.P = null;
            c();
            inputStream.close();
        }
    }

    public final boolean f(int i10) throws IOException {
        int i11;
        this.W += this.S - i10;
        if (i10 > 0) {
            int i12 = this.R;
            if (i12 > 0) {
                byte[] bArr = this.Q;
                System.arraycopy(bArr, i12, bArr, 0, i10);
                this.R = 0;
            }
        } else {
            this.R = 0;
            InputStream inputStream = this.P;
            i10 = inputStream == null ? -1 : inputStream.read(this.Q);
            if (i10 < 1) {
                this.S = 0;
                if (i10 < 0) {
                    if (this.X) {
                        c();
                    }
                    return false;
                }
                i();
            }
        }
        this.S = i10;
        while (true) {
            int i13 = this.S;
            if (i13 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.P;
            if (inputStream2 == null) {
                i11 = -1;
            } else {
                byte[] bArr2 = this.Q;
                i11 = inputStream2.read(bArr2, i13, bArr2.length - i13);
            }
            if (i11 < 1) {
                if (i11 < 0) {
                    if (this.X) {
                        c();
                    }
                    k(this.S, 4);
                }
                i();
            }
            this.S += i11;
        }
    }

    public final void g(char[] cArr, int i10, int i11) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i10 + "," + i11 + "), cbuf[" + cArr.length + "]");
    }

    public final void h(int i10, int i11, String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid UTF-32 character 0x");
        sb2.append(Integer.toHexString(i10));
        sb2.append(str);
        sb2.append(" at char #");
        sb2.append(this.V + i11);
        sb2.append(", byte #");
        sb2.append((this.W + this.R) - 1);
        sb2.append(")");
        throw new CharConversionException(sb2.toString());
    }

    public final void i() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    public final void k(int i10, int i11) throws IOException {
        int i12 = this.V;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i10 + ", needed " + i11 + ", at char #" + i12 + ", byte #" + (this.W + i10) + ")");
    }

    public int read() throws IOException {
        if (this.Y == null) {
            this.Y = new char[1];
        }
        if (read(this.Y, 0, 1) < 1) {
            return -1;
        }
        return this.Y[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r1 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(char[] r11, int r12, int r13) throws java.io.IOException {
        /*
            r10 = this;
            byte[] r0 = r10.Q
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            if (r13 >= r0) goto L_0x000a
            return r13
        L_0x000a:
            if (r12 < 0) goto L_0x0011
            int r2 = r12 + r13
            int r3 = r11.length
            if (r2 <= r3) goto L_0x0014
        L_0x0011:
            r10.g(r11, r12, r13)
        L_0x0014:
            int r13 = r13 + r12
            char r2 = r10.U
            r3 = 0
            r4 = 4
            if (r2 == 0) goto L_0x0022
            int r1 = r12 + 1
            r11[r12] = r2
            r10.U = r3
            goto L_0x003b
        L_0x0022:
            int r2 = r10.S
            int r5 = r10.R
            int r2 = r2 - r5
            if (r2 >= r4) goto L_0x003a
            boolean r5 = r10.f(r2)
            if (r5 != 0) goto L_0x003a
            if (r2 != 0) goto L_0x0032
            return r1
        L_0x0032:
            int r1 = r10.S
            int r2 = r10.R
            int r1 = r1 - r2
            r10.k(r1, r4)
        L_0x003a:
            r1 = r12
        L_0x003b:
            int r2 = r10.S
            int r2 = r2 - r4
        L_0x003e:
            if (r1 >= r13) goto L_0x00d1
            int r4 = r10.R
            boolean r5 = r10.T
            if (r5 == 0) goto L_0x0063
            byte[] r5 = r10.Q
            byte r6 = r5[r4]
            int r6 = r6 << 8
            int r7 = r4 + 1
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            int r7 = r4 + 2
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            int r8 = r4 + 3
            byte r5 = r5[r8]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r7
            goto L_0x0082
        L_0x0063:
            byte[] r5 = r10.Q
            byte r6 = r5[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r4 + 1
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r7 = r4 + 2
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 + 3
            byte r5 = r5[r8]
            int r5 = r5 << 8
            r5 = r5 | r7
            r9 = r6
            r6 = r5
            r5 = r9
        L_0x0082:
            int r4 = r4 + 4
            r10.R = r4
            if (r6 == 0) goto L_0x00c3
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r6
            int r6 = r4 + -1
            r7 = 16
            int r6 = r6 << r7
            r5 = r5 | r6
            if (r4 <= r7) goto L_0x00aa
            int r4 = r1 - r12
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            java.lang.String r7 = " (above 0x%08x)"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r10.h(r5, r4, r6)
        L_0x00aa:
            int r4 = r1 + 1
            r6 = 55296(0xd800, float:7.7486E-41)
            int r7 = r5 >> 10
            int r7 = r7 + r6
            char r6 = (char) r7
            r11[r1] = r6
            r1 = 56320(0xdc00, float:7.8921E-41)
            r6 = r5 & 1023(0x3ff, float:1.434E-42)
            r1 = r1 | r6
            if (r4 < r13) goto L_0x00c1
            char r11 = (char) r5
            r10.U = r11
            goto L_0x00cc
        L_0x00c1:
            r5 = r1
            r1 = r4
        L_0x00c3:
            int r4 = r1 + 1
            char r5 = (char) r5
            r11[r1] = r5
            int r1 = r10.R
            if (r1 <= r2) goto L_0x00ce
        L_0x00cc:
            r1 = r4
            goto L_0x00d1
        L_0x00ce:
            r1 = r4
            goto L_0x003e
        L_0x00d1:
            int r1 = r1 - r12
            int r11 = r10.V
            int r11 = r11 + r1
            r10.V = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.n.read(char[], int, int):int");
    }
}
