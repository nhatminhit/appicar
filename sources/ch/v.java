package ch;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import lf.h0;
import y4.c;

public final class v implements e {
    public final c O = new c();
    public final a0 P;
    public boolean Q;

    public class a extends InputStream {
        public a() {
        }

        public int available() throws IOException {
            v vVar = v.this;
            if (!vVar.Q) {
                return (int) Math.min(vVar.O.P, c.M0);
            }
            throw new IOException("closed");
        }

        public void close() throws IOException {
            v.this.close();
        }

        public int read() throws IOException {
            v vVar = v.this;
            if (!vVar.Q) {
                c cVar = vVar.O;
                if (cVar.P == 0 && vVar.P.C0(cVar, 8192) == -1) {
                    return -1;
                }
                return v.this.O.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!v.this.Q) {
                d0.b((long) bArr.length, (long) i10, (long) i11);
                v vVar = v.this;
                c cVar = vVar.O;
                if (cVar.P == 0 && vVar.P.C0(cVar, 8192) == -1) {
                    return -1;
                }
                return v.this.O.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }

        public String toString() {
            return v.this + ".inputStream()";
        }
    }

    public v(a0 a0Var) {
        if (a0Var != null) {
            this.P = a0Var;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public f B(long j10) throws IOException {
        E1(j10);
        return this.O.B(j10);
    }

    public void B1(c cVar, long j10) throws IOException {
        try {
            E1(j10);
            this.O.B1(cVar, j10);
        } catch (EOFException e10) {
            cVar.V0(this.O);
            throw e10;
        }
    }

    public long C0(c cVar, long j10) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (!this.Q) {
            c cVar2 = this.O;
            if (cVar2.P == 0 && this.P.C0(cVar2, 8192) == -1) {
                return -1;
            }
            return this.O.C0(cVar, Math.min(j10, this.O.P));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public void E1(long j10) throws IOException {
        if (!U0(j10)) {
            throw new EOFException();
        }
    }

    public boolean H1(long j10, f fVar) throws IOException {
        return r(j10, fVar, 0, fVar.R());
    }

    public String I0(Charset charset) throws IOException {
        if (charset != null) {
            this.O.V0(this.P);
            return this.O.I0(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public long K1(byte b10) throws IOException {
        return g0(b10, 0, Long.MAX_VALUE);
    }

    public long M(z zVar) throws IOException {
        if (zVar != null) {
            long j10 = 0;
            while (this.P.C0(this.O, 8192) != -1) {
                long k10 = this.O.k();
                if (k10 > 0) {
                    j10 += k10;
                    zVar.d1(this.O, k10);
                }
            }
            if (this.O.size() <= 0) {
                return j10;
            }
            long size = j10 + this.O.size();
            c cVar = this.O;
            zVar.d1(cVar, cVar.size());
            return size;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public long M1() throws IOException {
        E1(1);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!U0((long) i11)) {
                break;
            }
            byte N = this.O.N((long) i10);
            if ((N >= 48 && N <= 57) || ((N >= 97 && N <= 102) || (N >= 65 && N <= 70))) {
                i10 = i11;
            } else if (i10 == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(N)}));
            }
        }
        return this.O.M1();
    }

    public int N0() throws IOException {
        long j10;
        E1(1);
        byte N = this.O.N(0);
        if ((N & 224) == 192) {
            j10 = 2;
        } else if ((N & 240) == 224) {
            j10 = 3;
        } else {
            if ((N & 248) == 240) {
                j10 = 4;
            }
            return this.O.N0();
        }
        E1(j10);
        return this.O.N0();
    }

    public f Q0() throws IOException {
        this.O.V0(this.P);
        return this.O.Q0();
    }

    public byte[] S() throws IOException {
        this.O.V0(this.P);
        return this.O.S();
    }

    public long U(f fVar) throws IOException {
        return l1(fVar, 0);
    }

    public boolean U0(long j10) throws IOException {
        c cVar;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (!this.Q) {
            do {
                cVar = this.O;
                if (cVar.P >= j10) {
                    return true;
                }
            } while (this.P.C0(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public c V() {
        return this.O;
    }

    public boolean X() throws IOException {
        if (!this.Q) {
            return this.O.X() && this.P.C0(this.O, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public int Z(q qVar) throws IOException {
        if (!this.Q) {
            do {
                int g12 = this.O.g1(qVar, true);
                if (g12 == -1) {
                    return -1;
                }
                if (g12 != -2) {
                    this.O.skip((long) qVar.O[g12].R());
                    return g12;
                }
            } while (this.P.C0(this.O, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public b0 b() {
        return this.P.b();
    }

    public String b1() throws IOException {
        return o0(Long.MAX_VALUE);
    }

    public void close() throws IOException {
        if (!this.Q) {
            this.Q = true;
            this.P.close();
            this.O.g();
        }
    }

    public int e1() throws IOException {
        E1(4);
        return this.O.e1();
    }

    public long f0(byte b10, long j10) throws IOException {
        return g0(b10, j10, Long.MAX_VALUE);
    }

    public long g0(byte b10, long j10, long j11) throws IOException {
        if (this.Q) {
            throw new IllegalStateException("closed");
        } else if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j10), Long.valueOf(j11)}));
        } else {
            while (j10 < j11) {
                long g02 = this.O.g0(b10, j10, j11);
                if (g02 == -1) {
                    c cVar = this.O;
                    long j12 = cVar.P;
                    if (j12 >= j11 || this.P.C0(cVar, 8192) == -1) {
                        break;
                    }
                    j10 = Math.max(j10, j12);
                } else {
                    return g02;
                }
            }
            return -1;
        }
    }

    @Nullable
    public String h0() throws IOException {
        long K1 = K1((byte) 10);
        if (K1 != -1) {
            return this.O.Z0(K1);
        }
        long j10 = this.O.P;
        if (j10 != 0) {
            return u(j10);
        }
        return null;
    }

    public boolean isOpen() {
        return !this.Q;
    }

    public c j() {
        return this.O;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long j0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.E1(r0)
            r0 = 0
            r1 = r0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.U0(r3)
            if (r3 == 0) goto L_0x0040
            ch.c r3 = r6.O
            long r4 = (long) r1
            byte r3 = r3.N(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            ch.c r0 = r6.O
            long r0 = r0.j0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.v.j0():long");
    }

    public byte[] k1(long j10) throws IOException {
        E1(j10);
        return this.O.k1(j10);
    }

    public long l1(f fVar, long j10) throws IOException {
        if (!this.Q) {
            while (true) {
                long l12 = this.O.l1(fVar, j10);
                if (l12 != -1) {
                    return l12;
                }
                c cVar = this.O;
                long j11 = cVar.P;
                if (this.P.C0(cVar, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, (j11 - ((long) fVar.R())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public InputStream n() {
        return new a();
    }

    public String o0(long j10) throws IOException {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            long g02 = g0((byte) 10, 0, j11);
            if (g02 != -1) {
                return this.O.Z0(g02);
            }
            if (j11 < Long.MAX_VALUE && U0(j11) && this.O.N(j11 - 1) == 13 && U0(1 + j11) && this.O.N(j11) == 10) {
                return this.O.Z0(j11);
            }
            c cVar = new c();
            c cVar2 = this.O;
            cVar2.m(cVar, 0, Math.min(32, cVar2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.O.size(), j10) + " content=" + cVar.Q0().s() + h0.F);
        }
        throw new IllegalArgumentException("limit < 0: " + j10);
    }

    public String o1() throws IOException {
        this.O.V0(this.P);
        return this.O.o1();
    }

    public long p0(f fVar, long j10) throws IOException {
        if (!this.Q) {
            while (true) {
                long p02 = this.O.p0(fVar, j10);
                if (p02 != -1) {
                    return p02;
                }
                c cVar = this.O;
                long j11 = cVar.P;
                if (this.P.C0(cVar, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, j11);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public e peek() {
        return p.d(new r(this));
    }

    public String q1(long j10, Charset charset) throws IOException {
        E1(j10);
        if (charset != null) {
            return this.O.q1(j10, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public boolean r(long j10, f fVar, int i10, int i11) throws IOException {
        if (this.Q) {
            throw new IllegalStateException("closed");
        } else if (j10 < 0 || i10 < 0 || i11 < 0 || fVar.R() - i10 < i11) {
            return false;
        } else {
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = ((long) i12) + j10;
                if (!U0(1 + j11) || this.O.N(j11) != fVar.r(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        c cVar = this.O;
        if (cVar.P == 0 && this.P.C0(cVar, 8192) == -1) {
            return -1;
        }
        return this.O.read(byteBuffer);
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = (long) i11;
        d0.b((long) bArr.length, (long) i10, j10);
        c cVar = this.O;
        if (cVar.P == 0 && this.P.C0(cVar, 8192) == -1) {
            return -1;
        }
        return this.O.read(bArr, i10, (int) Math.min(j10, this.O.P));
    }

    public byte readByte() throws IOException {
        E1(1);
        return this.O.readByte();
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            E1((long) bArr.length);
            this.O.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                c cVar = this.O;
                long j10 = cVar.P;
                if (j10 > 0) {
                    int read = cVar.read(bArr, i10, (int) j10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e10;
                }
            }
        }
    }

    public int readInt() throws IOException {
        E1(4);
        return this.O.readInt();
    }

    public long readLong() throws IOException {
        E1(8);
        return this.O.readLong();
    }

    public short readShort() throws IOException {
        E1(2);
        return this.O.readShort();
    }

    public void skip(long j10) throws IOException {
        if (!this.Q) {
            while (j10 > 0) {
                c cVar = this.O;
                if (cVar.P == 0 && this.P.C0(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.O.size());
                this.O.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public short t1() throws IOException {
        E1(2);
        return this.O.t1();
    }

    public String toString() {
        return "buffer(" + this.P + ")";
    }

    public String u(long j10) throws IOException {
        E1(j10);
        return this.O.u(j10);
    }

    public long v1() throws IOException {
        E1(8);
        return this.O.v1();
    }

    public long y1(f fVar) throws IOException {
        return p0(fVar, 0);
    }
}
