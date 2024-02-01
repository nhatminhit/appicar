package ch;

import d5.k;
import d6.b0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lf.h0;
import xe.o;

public final class c implements e, d, Cloneable, ByteChannel {
    public static final byte[] Q = {k.f6148y0, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public static final int R = 65533;
    @Nullable
    public w O;
    public long P;

    public class a extends OutputStream {
        public a() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        public void write(int i10) {
            c.this.writeByte((byte) i10);
        }

        public void write(byte[] bArr, int i10, int i11) {
            c.this.write(bArr, i10, i11);
        }
    }

    public class b extends InputStream {
        public b() {
        }

        public int available() {
            return (int) Math.min(c.this.P, y4.c.M0);
        }

        public void close() {
        }

        public int read() {
            c cVar = c.this;
            if (cVar.P > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i10, int i11) {
            return c.this.read(bArr, i10, i11);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    /* renamed from: ch.c$c  reason: collision with other inner class name */
    public static final class C0271c implements Closeable {
        public c O;
        public boolean P;
        public w Q;
        public long R = -1;
        public byte[] S;
        public int T = -1;
        public int U = -1;

        public final long c(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: " + i10);
            } else if (i10 <= 8192) {
                c cVar = this.O;
                if (cVar == null) {
                    throw new IllegalStateException("not attached to a buffer");
                } else if (this.P) {
                    long j10 = cVar.P;
                    w F1 = cVar.F1(i10);
                    int i11 = 8192 - F1.f16531c;
                    F1.f16531c = 8192;
                    long j11 = (long) i11;
                    this.O.P = j10 + j11;
                    this.Q = F1;
                    this.R = j10;
                    this.S = F1.f16529a;
                    this.T = 8192 - i11;
                    this.U = 8192;
                    return j11;
                } else {
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                }
            } else {
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: " + i10);
            }
        }

        public void close() {
            if (this.O != null) {
                this.O = null;
                this.Q = null;
                this.R = -1;
                this.S = null;
                this.T = -1;
                this.U = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int f() {
            long j10 = this.R;
            if (j10 != this.O.P) {
                return h(j10 == -1 ? 0 : j10 + ((long) (this.U - this.T)));
            }
            throw new IllegalStateException();
        }

        public final long g(long j10) {
            c cVar = this.O;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            } else if (this.P) {
                long j11 = cVar.P;
                int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                if (i10 <= 0) {
                    if (j10 >= 0) {
                        long j12 = j11 - j10;
                        while (true) {
                            if (j12 <= 0) {
                                break;
                            }
                            c cVar2 = this.O;
                            w wVar = cVar2.O.f16535g;
                            int i11 = wVar.f16531c;
                            long j13 = (long) (i11 - wVar.f16530b);
                            if (j13 > j12) {
                                wVar.f16531c = (int) (((long) i11) - j12);
                                break;
                            }
                            cVar2.O = wVar.b();
                            x.a(wVar);
                            j12 -= j13;
                        }
                        this.Q = null;
                        this.R = j10;
                        this.S = null;
                        this.T = -1;
                        this.U = -1;
                    } else {
                        throw new IllegalArgumentException("newSize < 0: " + j10);
                    }
                } else if (i10 > 0) {
                    long j14 = j10 - j11;
                    boolean z10 = true;
                    while (j14 > 0) {
                        w F1 = this.O.F1(1);
                        int min = (int) Math.min(j14, (long) (8192 - F1.f16531c));
                        int i12 = F1.f16531c + min;
                        F1.f16531c = i12;
                        j14 -= (long) min;
                        if (z10) {
                            this.Q = F1;
                            this.R = j11;
                            this.S = F1.f16529a;
                            this.T = i12 - min;
                            this.U = i12;
                            z10 = false;
                        }
                    }
                }
                this.O.P = j10;
                return j11;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
        }

        public final int h(long j10) {
            int i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
            if (i10 >= 0) {
                c cVar = this.O;
                long j11 = cVar.P;
                if (j10 <= j11) {
                    if (i10 == 0 || j10 == j11) {
                        this.Q = null;
                        this.R = j10;
                        this.S = null;
                        this.T = -1;
                        this.U = -1;
                        return -1;
                    }
                    long j12 = 0;
                    w wVar = cVar.O;
                    w wVar2 = this.Q;
                    if (wVar2 != null) {
                        long j13 = this.R - ((long) (this.T - wVar2.f16530b));
                        if (j13 > j10) {
                            j11 = j13;
                            w wVar3 = wVar2;
                            wVar2 = wVar;
                            wVar = wVar3;
                        } else {
                            j12 = j13;
                        }
                    } else {
                        wVar2 = wVar;
                    }
                    if (j11 - j10 > j10 - j12) {
                        while (true) {
                            int i11 = wVar2.f16531c;
                            int i12 = wVar2.f16530b;
                            if (j10 < ((long) (i11 - i12)) + j12) {
                                break;
                            }
                            j12 += (long) (i11 - i12);
                            wVar2 = wVar2.f16534f;
                        }
                    } else {
                        while (j11 > j10) {
                            wVar = wVar.f16535g;
                            j11 -= (long) (wVar.f16531c - wVar.f16530b);
                        }
                        wVar2 = wVar;
                        j12 = j11;
                    }
                    if (this.P && wVar2.f16532d) {
                        w f10 = wVar2.f();
                        c cVar2 = this.O;
                        if (cVar2.O == wVar2) {
                            cVar2.O = f10;
                        }
                        wVar2 = wVar2.c(f10);
                        wVar2.f16535g.b();
                    }
                    this.Q = wVar2;
                    this.R = j10;
                    this.S = wVar2.f16529a;
                    int i13 = wVar2.f16530b + ((int) (j10 - j12));
                    this.T = i13;
                    int i14 = wVar2.f16531c;
                    this.U = i14;
                    return i14 - i13;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", new Object[]{Long.valueOf(j10), Long.valueOf(this.O.P)}));
        }
    }

    /* renamed from: A */
    public c i0() {
        return this;
    }

    public final f A1(int i10) {
        return i10 == 0 ? f.T : new y(this, i10);
    }

    public f B(long j10) throws EOFException {
        return new f(k1(j10));
    }

    public void B1(c cVar, long j10) throws EOFException {
        long j11 = this.P;
        if (j11 >= j10) {
            cVar.d1(this, j10);
        } else {
            cVar.d1(this, j11);
            throw new EOFException();
        }
    }

    public long C0(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j10 >= 0) {
            long j11 = this.P;
            if (j11 == 0) {
                return -1;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            cVar.d1(this, j10);
            return j10;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
    }

    public void E1(long j10) throws EOFException {
        if (this.P < j10) {
            throw new EOFException();
        }
    }

    public w F1(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        w wVar = this.O;
        if (wVar == null) {
            w b10 = x.b();
            this.O = b10;
            b10.f16535g = b10;
            b10.f16534f = b10;
            return b10;
        }
        w wVar2 = wVar.f16535g;
        return (wVar2.f16531c + i10 > 8192 || !wVar2.f16533e) ? wVar2.c(x.b()) : wVar2;
    }

    public d H() {
        return this;
    }

    public final c H0(InputStream inputStream, long j10) throws IOException {
        if (j10 >= 0) {
            T0(inputStream, j10, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    public boolean H1(long j10, f fVar) {
        return r(j10, fVar, 0, fVar.R());
    }

    public String I0(Charset charset) {
        try {
            return q1(this.P, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public OutputStream J1() {
        return new a();
    }

    public long K1(byte b10) {
        return g0(b10, 0, Long.MAX_VALUE);
    }

    /* renamed from: L1 */
    public c T(f fVar) {
        if (fVar != null) {
            fVar.b0(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public long M(z zVar) throws IOException {
        long j10 = this.P;
        if (j10 > 0) {
            zVar.d1(this, j10);
        }
        return j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r8 != r9) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r14.O = r6.b();
        ch.x.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r6.f16530b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long M1() {
        /*
            r14 = this;
            long r0 = r14.P
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00ac
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            ch.w r6 = r14.O
            byte[] r7 = r6.f16529a
            int r8 = r6.f16530b
            int r9 = r6.f16531c
        L_0x0013:
            if (r8 >= r9) goto L_0x0091
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0072
            r11 = 70
            if (r10 > r11) goto L_0x0072
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            ch.c r0 = new ch.c
            r0.<init>()
            ch.c r0 = r0.P0(r4)
            ch.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.o1()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0091
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            if (r8 != r9) goto L_0x009d
            ch.w r7 = r6.b()
            r14.O = r7
            ch.x.a(r6)
            goto L_0x009f
        L_0x009d:
            r6.f16530b = r8
        L_0x009f:
            if (r1 != 0) goto L_0x00a5
            ch.w r6 = r14.O
            if (r6 != 0) goto L_0x000b
        L_0x00a5:
            long r1 = r14.P
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.P = r1
            return r4
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.c.M1():long");
    }

    public final byte N(long j10) {
        int i10;
        d0.b(this.P, j10, 1);
        long j11 = this.P;
        if (j11 - j10 > j10) {
            w wVar = this.O;
            while (true) {
                int i11 = wVar.f16531c;
                int i12 = wVar.f16530b;
                long j12 = (long) (i11 - i12);
                if (j10 < j12) {
                    return wVar.f16529a[i12 + ((int) j10)];
                }
                j10 -= j12;
                wVar = wVar.f16534f;
            }
        } else {
            long j13 = j10 - j11;
            w wVar2 = this.O;
            do {
                wVar2 = wVar2.f16535g;
                int i13 = wVar2.f16531c;
                i10 = wVar2.f16530b;
                j13 += (long) (i13 - i10);
            } while (j13 < 0);
            return wVar2.f16529a[i10 + ((int) j13)];
        }
    }

    public int N0() throws EOFException {
        byte b10;
        int i10;
        byte b11;
        if (this.P != 0) {
            byte N = N(0);
            int i11 = 1;
            if ((N & o.f24535b) == 0) {
                b11 = N & Byte.MAX_VALUE;
                b10 = 0;
                i10 = 1;
            } else if ((N & 224) == 192) {
                b11 = N & b0.f6265f;
                i10 = 2;
                b10 = 128;
            } else if ((N & 240) == 224) {
                b11 = N & 15;
                i10 = 3;
                b10 = 2048;
            } else if ((N & 248) == 240) {
                b11 = N & 7;
                i10 = 4;
                b10 = 65536;
            } else {
                skip(1);
                return R;
            }
            long j10 = (long) i10;
            if (this.P >= j10) {
                while (i11 < i10) {
                    long j11 = (long) i11;
                    byte N2 = N(j11);
                    if ((N2 & w1.a.K6) == 128) {
                        b11 = (b11 << 6) | (N2 & 63);
                        i11++;
                    } else {
                        skip(j11);
                        return R;
                    }
                }
                skip(j10);
                return b11 > 1114111 ? R : ((b11 < 55296 || b11 > 57343) && b11 >= b10) ? b11 : R;
            }
            throw new EOFException("size < " + i10 + ": " + this.P + " (to read code point prefixed 0x" + Integer.toHexString(N) + ")");
        }
        throw new EOFException();
    }

    /* renamed from: N1 */
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: O1 */
    public c write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = (long) i11;
            d0.b((long) bArr.length, (long) i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                w F1 = F1(1);
                int min = Math.min(i12 - i10, 8192 - F1.f16531c);
                System.arraycopy(bArr, i10, F1.f16529a, F1.f16531c, min);
                i10 += min;
                F1.f16531c += min;
            }
            this.P += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final f P(String str, f fVar) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(fVar.Z(), str));
            w wVar = this.O;
            if (wVar != null) {
                byte[] bArr = wVar.f16529a;
                int i10 = wVar.f16530b;
                instance.update(bArr, i10, wVar.f16531c - i10);
                w wVar2 = this.O;
                while (true) {
                    wVar2 = wVar2.f16534f;
                    if (wVar2 == this.O) {
                        break;
                    }
                    byte[] bArr2 = wVar2.f16529a;
                    int i11 = wVar2.f16530b;
                    instance.update(bArr2, i11, wVar2.f16531c - i11);
                }
            }
            return f.I(instance.doFinal());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: P1 */
    public c writeByte(int i10) {
        w F1 = F1(1);
        byte[] bArr = F1.f16529a;
        int i11 = F1.f16531c;
        F1.f16531c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.P++;
        return this;
    }

    public final f Q(f fVar) {
        return P("HmacSHA1", fVar);
    }

    public f Q0() {
        return new f(S());
    }

    /* renamed from: Q1 */
    public c G1(long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            return writeByte(48);
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return D0("-9223372036854775808");
            }
            z10 = true;
        }
        if (j10 >= 100000000) {
            i11 = j10 < com.google.android.material.slider.c.f17347d ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i11 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i11 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i11 = 2;
        }
        if (z10) {
            i11++;
        }
        w F1 = F1(i11);
        byte[] bArr = F1.f16529a;
        int i12 = F1.f16531c + i11;
        while (j10 != 0) {
            i12--;
            bArr[i12] = Q[(int) (j10 % 10)];
            j10 /= 10;
        }
        if (z10) {
            bArr[i12 - 1] = i7.a.f9186b0;
        }
        F1.f16531c += i11;
        this.P += (long) i11;
        return this;
    }

    /* renamed from: R1 */
    public c P0(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        w F1 = F1(numberOfTrailingZeros);
        byte[] bArr = F1.f16529a;
        int i10 = F1.f16531c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = Q[(int) (15 & j10)];
            j10 >>>= 4;
        }
        F1.f16531c += numberOfTrailingZeros;
        this.P += (long) numberOfTrailingZeros;
        return this;
    }

    public byte[] S() {
        try {
            return k1(this.P);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: S1 */
    public c writeInt(int i10) {
        w F1 = F1(4);
        byte[] bArr = F1.f16529a;
        int i11 = F1.f16531c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        F1.f16531c = i14 + 1;
        this.P += 4;
        return this;
    }

    public final void T0(InputStream inputStream, long j10, boolean z10) throws IOException {
        if (inputStream != null) {
            while (true) {
                if (j10 > 0 || z10) {
                    w F1 = F1(1);
                    int read = inputStream.read(F1.f16529a, F1.f16531c, (int) Math.min(j10, (long) (8192 - F1.f16531c)));
                    if (read != -1) {
                        F1.f16531c += read;
                        long j11 = (long) read;
                        this.P += j11;
                        j10 -= j11;
                    } else if (!z10) {
                        throw new EOFException();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("in == null");
        }
    }

    /* renamed from: T1 */
    public c W(int i10) {
        return writeInt(d0.c(i10));
    }

    public long U(f fVar) throws IOException {
        return l1(fVar, 0);
    }

    public boolean U0(long j10) {
        return this.P >= j10;
    }

    /* renamed from: U1 */
    public c writeLong(long j10) {
        w F1 = F1(8);
        byte[] bArr = F1.f16529a;
        int i10 = F1.f16531c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((int) ((j10 >>> 56) & 255));
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((int) ((j10 >>> 48) & 255));
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((int) ((j10 >>> 40) & 255));
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((int) ((j10 >>> 32) & 255));
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((int) ((j10 >>> 24) & 255));
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((int) ((j10 >>> 16) & 255));
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((int) ((j10 >>> 8) & 255));
        bArr[i17] = (byte) ((int) (j10 & 255));
        F1.f16531c = i17 + 1;
        this.P += 8;
        return this;
    }

    public c V() {
        return this;
    }

    public long V0(a0 a0Var) throws IOException {
        if (a0Var != null) {
            long j10 = 0;
            while (true) {
                long C0 = a0Var.C0(this, 8192);
                if (C0 == -1) {
                    return j10;
                }
                j10 += C0;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: V1 */
    public c O(long j10) {
        return writeLong(d0.d(j10));
    }

    public final C0271c W0() {
        return X0(new C0271c());
    }

    /* renamed from: W1 */
    public c writeShort(int i10) {
        w F1 = F1(2);
        byte[] bArr = F1.f16529a;
        int i11 = F1.f16531c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        F1.f16531c = i12 + 1;
        this.P += 2;
        return this;
    }

    public boolean X() {
        return this.P == 0;
    }

    public final C0271c X0(C0271c cVar) {
        if (cVar.O == null) {
            cVar.O = this;
            cVar.P = false;
            return cVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    /* renamed from: X1 */
    public c A0(int i10) {
        return writeShort(d0.e((short) i10));
    }

    public final f Y(f fVar) {
        return P("HmacSHA256", fVar);
    }

    /* renamed from: Y1 */
    public c D1(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i10);
        } else if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        } else if (i11 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(d0.f16511a)) {
            return O0(str, i10, i11);
        } else {
            byte[] bytes = str.substring(i10, i11).getBytes(charset);
            return write(bytes, 0, bytes.length);
        }
    }

    public int Z(q qVar) {
        int g12 = g1(qVar, false);
        if (g12 == -1) {
            return -1;
        }
        try {
            skip((long) qVar.O[g12].R());
            return g12;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public String Z0(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (N(j11) == 13) {
                String u10 = u(j11);
                skip(2);
                return u10;
            }
        }
        String u11 = u(j10);
        skip(1);
        return u11;
    }

    /* renamed from: Z1 */
    public c R0(String str, Charset charset) {
        return D1(str, 0, str.length(), charset);
    }

    public final f a0(f fVar) {
        return P("HmacSHA512", fVar);
    }

    public final c a2(OutputStream outputStream) throws IOException {
        return b2(outputStream, this.P);
    }

    public b0 b() {
        return b0.f16507d;
    }

    public String b1() throws EOFException {
        return o0(Long.MAX_VALUE);
    }

    public final c b2(OutputStream outputStream, long j10) throws IOException {
        if (outputStream != null) {
            d0.b(this.P, 0, j10);
            w wVar = this.O;
            while (j10 > 0) {
                int min = (int) Math.min(j10, (long) (wVar.f16531c - wVar.f16530b));
                outputStream.write(wVar.f16529a, wVar.f16530b, min);
                int i10 = wVar.f16530b + min;
                wVar.f16530b = i10;
                long j11 = (long) min;
                this.P -= j11;
                j10 -= j11;
                if (i10 == wVar.f16531c) {
                    w b10 = wVar.b();
                    this.O = b10;
                    x.a(wVar);
                    wVar = b10;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final f c0() {
        return w("MD5");
    }

    /* renamed from: c2 */
    public c D0(String str) {
        return O0(str, 0, str.length());
    }

    public void close() {
    }

    public void d1(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            d0.b(cVar.P, 0, j10);
            while (j10 > 0) {
                w wVar = cVar.O;
                if (j10 < ((long) (wVar.f16531c - wVar.f16530b))) {
                    w wVar2 = this.O;
                    w wVar3 = wVar2 != null ? wVar2.f16535g : null;
                    if (wVar3 != null && wVar3.f16533e) {
                        if ((((long) wVar3.f16531c) + j10) - ((long) (wVar3.f16532d ? 0 : wVar3.f16530b)) <= 8192) {
                            wVar.g(wVar3, (int) j10);
                            cVar.P -= j10;
                            this.P += j10;
                            return;
                        }
                    }
                    cVar.O = wVar.e((int) j10);
                }
                w wVar4 = cVar.O;
                long j11 = (long) (wVar4.f16531c - wVar4.f16530b);
                cVar.O = wVar4.b();
                w wVar5 = this.O;
                if (wVar5 == null) {
                    this.O = wVar4;
                    wVar4.f16535g = wVar4;
                    wVar4.f16534f = wVar4;
                } else {
                    wVar5.f16535g.c(wVar4).a();
                }
                cVar.P -= j11;
                this.P += j11;
                j10 -= j11;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: d2 */
    public c O0(String str, int i10, int i11) {
        int i12;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i10);
        } else if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        } else if (i11 <= str.length()) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt < 128) {
                    w F1 = F1(1);
                    byte[] bArr = F1.f16529a;
                    int i13 = F1.f16531c - i10;
                    int min = Math.min(i11, 8192 - i13);
                    int i14 = i10 + 1;
                    bArr[i10 + i13] = (byte) charAt;
                    while (i14 < min) {
                        char charAt2 = str.charAt(i14);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i14 + i13] = (byte) charAt2;
                        i14++;
                    }
                    int i15 = F1.f16531c;
                    int i16 = (i13 + i14) - i15;
                    F1.f16531c = i15 + i16;
                    this.P += (long) i16;
                    i10 = i14;
                } else {
                    if (charAt < 2048) {
                        i12 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        writeByte((charAt >> 12) | 224);
                        i12 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i17 = i10 + 1;
                        char charAt3 = i17 < i11 ? str.charAt(i17) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i10 = i17;
                        } else {
                            int i18 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            writeByte((i18 >> 18) | 240);
                            writeByte(((i18 >> 12) & 63) | 128);
                            writeByte(((i18 >> 6) & 63) | 128);
                            writeByte((i18 & 63) | 128);
                            i10 += 2;
                        }
                    }
                    writeByte(i12);
                    writeByte((charAt & '?') | 128);
                    i10++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
    }

    public final boolean e0(w wVar, int i10, f fVar, int i11, int i12) {
        int i13 = wVar.f16531c;
        byte[] bArr = wVar.f16529a;
        while (i11 < i12) {
            if (i10 == i13) {
                wVar = wVar.f16534f;
                byte[] bArr2 = wVar.f16529a;
                int i14 = wVar.f16530b;
                bArr = bArr2;
                i10 = i14;
                i13 = wVar.f16531c;
            }
            if (bArr[i10] != fVar.r(i11)) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public int e1() {
        return d0.c(readInt());
    }

    /* renamed from: e2 */
    public c J(int i10) {
        int i11;
        int i12;
        if (i10 >= 128) {
            if (i10 < 2048) {
                i12 = (i10 >> 6) | 192;
            } else {
                if (i10 < 65536) {
                    if (i10 < 55296 || i10 > 57343) {
                        i11 = (i10 >> 12) | 224;
                    } else {
                        writeByte(63);
                        return this;
                    }
                } else if (i10 <= 1114111) {
                    writeByte((i10 >> 18) | 240);
                    i11 = ((i10 >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
                }
                writeByte(i11);
                i12 = ((i10 >> 6) & 63) | 128;
            }
            writeByte(i12);
            i10 = (i10 & 63) | 128;
        }
        writeByte(i10);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j10 = this.P;
        if (j10 != cVar.P) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        w wVar = this.O;
        w wVar2 = cVar.O;
        int i10 = wVar.f16530b;
        int i11 = wVar2.f16530b;
        while (j11 < this.P) {
            long min = (long) Math.min(wVar.f16531c - i10, wVar2.f16531c - i11);
            int i12 = 0;
            while (((long) i12) < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (wVar.f16529a[i10] != wVar2.f16529a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == wVar.f16531c) {
                wVar = wVar.f16534f;
                i10 = wVar.f16530b;
            }
            if (i11 == wVar2.f16531c) {
                wVar2 = wVar2.f16534f;
                i11 = wVar2.f16530b;
            }
            j11 += min;
        }
        return true;
    }

    public long f0(byte b10, long j10) {
        return g0(b10, j10, Long.MAX_VALUE);
    }

    public List<Integer> f1() {
        if (this.O == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        w wVar = this.O;
        arrayList.add(Integer.valueOf(wVar.f16531c - wVar.f16530b));
        w wVar2 = this.O;
        while (true) {
            wVar2 = wVar2.f16534f;
            if (wVar2 == this.O) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(wVar2.f16531c - wVar2.f16530b));
        }
    }

    public void flush() {
    }

    public final void g() {
        try {
            skip(this.P);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public long g0(byte b10, long j10, long j11) {
        w wVar;
        long j12 = 0;
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.P), Long.valueOf(j10), Long.valueOf(j11)}));
        }
        long j13 = this.P;
        long j14 = j11 > j13 ? j13 : j11;
        if (j10 == j14 || (wVar = this.O) == null) {
            return -1;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                wVar = wVar.f16535g;
                j13 -= (long) (wVar.f16531c - wVar.f16530b);
            }
        } else {
            while (true) {
                long j15 = ((long) (wVar.f16531c - wVar.f16530b)) + j12;
                if (j15 >= j10) {
                    break;
                }
                wVar = wVar.f16534f;
                j12 = j15;
            }
            j13 = j12;
        }
        long j16 = j10;
        while (j13 < j14) {
            byte[] bArr = wVar.f16529a;
            int min = (int) Math.min((long) wVar.f16531c, (((long) wVar.f16530b) + j14) - j13);
            for (int i10 = (int) ((((long) wVar.f16530b) + j16) - j13); i10 < min; i10++) {
                if (bArr[i10] == b10) {
                    return ((long) (i10 - wVar.f16530b)) + j13;
                }
            }
            byte b11 = b10;
            j13 += (long) (wVar.f16531c - wVar.f16530b);
            wVar = wVar.f16534f;
            j16 = j13;
        }
        return -1;
    }

    public int g1(q qVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        w wVar;
        int i13;
        q qVar2 = qVar;
        w wVar2 = this.O;
        int i14 = -2;
        if (wVar2 != null) {
            byte[] bArr = wVar2.f16529a;
            int i15 = wVar2.f16530b;
            int i16 = wVar2.f16531c;
            int[] iArr = qVar2.P;
            w wVar3 = wVar2;
            int i17 = 0;
            int i18 = -1;
            loop0:
            while (true) {
                int i19 = i17 + 1;
                int i20 = iArr[i17];
                int i21 = i19 + 1;
                int i22 = iArr[i19];
                if (i22 != -1) {
                    i18 = i22;
                }
                if (wVar3 == null) {
                    break;
                }
                if (i20 < 0) {
                    int i23 = i21 + (i20 * -1);
                    while (true) {
                        int i24 = i15 + 1;
                        int i25 = i21 + 1;
                        if ((bArr[i15] & 255) != iArr[i21]) {
                            return i18;
                        }
                        boolean z11 = i25 == i23;
                        if (i24 == i16) {
                            w wVar4 = wVar3.f16534f;
                            i13 = wVar4.f16530b;
                            byte[] bArr2 = wVar4.f16529a;
                            i12 = wVar4.f16531c;
                            if (wVar4 != wVar2) {
                                byte[] bArr3 = bArr2;
                                wVar = wVar4;
                                bArr = bArr3;
                            } else if (!z11) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                wVar = null;
                            }
                        } else {
                            w wVar5 = wVar3;
                            i12 = i16;
                            i13 = i24;
                            wVar = wVar5;
                        }
                        if (z11) {
                            i10 = iArr[i25];
                            i11 = i13;
                            i16 = i12;
                            wVar3 = wVar;
                            break;
                        }
                        i15 = i13;
                        i16 = i12;
                        i21 = i25;
                        wVar3 = wVar;
                    }
                } else {
                    int i26 = i15 + 1;
                    byte b10 = bArr[i15] & 255;
                    int i27 = i21 + i20;
                    while (i21 != i27) {
                        if (b10 == iArr[i21]) {
                            i10 = iArr[i21 + i20];
                            if (i26 == i16) {
                                wVar3 = wVar3.f16534f;
                                i11 = wVar3.f16530b;
                                bArr = wVar3.f16529a;
                                i16 = wVar3.f16531c;
                                if (wVar3 == wVar2) {
                                    wVar3 = null;
                                }
                            } else {
                                i11 = i26;
                            }
                        } else {
                            i21++;
                        }
                    }
                    return i18;
                }
                if (i10 >= 0) {
                    return i10;
                }
                i17 = -i10;
                i15 = i11;
                i14 = -2;
            }
            return z10 ? i14 : i18;
        } else if (z10) {
            return -2;
        } else {
            return qVar2.indexOf(f.T);
        }
    }

    @Nullable
    public String h0() throws EOFException {
        long K1 = K1((byte) 10);
        if (K1 != -1) {
            return Z0(K1);
        }
        long j10 = this.P;
        if (j10 != 0) {
            return u(j10);
        }
        return null;
    }

    public final f h1() {
        return w("SHA-1");
    }

    public int hashCode() {
        w wVar = this.O;
        if (wVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = wVar.f16531c;
            for (int i12 = wVar.f16530b; i12 < i11; i12++) {
                i10 = (i10 * 31) + wVar.f16529a[i12];
            }
            wVar = wVar.f16534f;
        } while (wVar != this.O);
        return i10;
    }

    /* renamed from: i */
    public c clone() {
        c cVar = new c();
        if (this.P == 0) {
            return cVar;
        }
        w d10 = this.O.d();
        cVar.O = d10;
        d10.f16535g = d10;
        d10.f16534f = d10;
        w wVar = this.O;
        while (true) {
            wVar = wVar.f16534f;
            if (wVar != this.O) {
                cVar.O.f16535g.c(wVar.d());
            } else {
                cVar.P = this.P;
                return cVar;
            }
        }
    }

    public boolean isOpen() {
        return true;
    }

    public c j() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00be, code lost:
        if (r8 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long j0() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.P
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00c3
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = r7
            r9 = r8
        L_0x0014:
            ch.w r10 = r0.O
            byte[] r11 = r10.f16529a
            int r12 = r10.f16530b
            int r13 = r10.f16531c
        L_0x001c:
            if (r12 >= r13) goto L_0x009c
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x0069
            r14 = 57
            if (r15 > r14) goto L_0x0069
            int r14 = 48 - r15
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x003c
            if (r16 != 0) goto L_0x0036
            long r1 = (long) r14
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L_0x0073
        L_0x003c:
            ch.c r1 = new ch.c
            r1.<init>()
            ch.c r1 = r1.G1(r3)
            ch.c r1 = r1.writeByte(r15)
            if (r8 != 0) goto L_0x004e
            r1.readByte()
        L_0x004e:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.o1()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0069:
            r1 = 45
            if (r15 != r1) goto L_0x007d
            if (r7 != 0) goto L_0x007d
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L_0x0073:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x001c
        L_0x007d:
            if (r7 == 0) goto L_0x0081
            r9 = 1
            goto L_0x009c
        L_0x0081:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009c:
            if (r12 != r13) goto L_0x00a8
            ch.w r1 = r10.b()
            r0.O = r1
            ch.x.a(r10)
            goto L_0x00aa
        L_0x00a8:
            r10.f16530b = r12
        L_0x00aa:
            if (r9 != 0) goto L_0x00b8
            ch.w r1 = r0.O
            if (r1 != 0) goto L_0x00b1
            goto L_0x00b8
        L_0x00b1:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x0014
        L_0x00b8:
            long r1 = r0.P
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.P = r1
            if (r8 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            long r3 = -r3
        L_0x00c2:
            return r3
        L_0x00c3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.c.j0():long");
    }

    public final long k() {
        long j10 = this.P;
        if (j10 == 0) {
            return 0;
        }
        w wVar = this.O.f16535g;
        int i10 = wVar.f16531c;
        return (i10 >= 8192 || !wVar.f16533e) ? j10 : j10 - ((long) (i10 - wVar.f16530b));
    }

    public final C0271c k0() {
        return m0(new C0271c());
    }

    public byte[] k1(long j10) throws EOFException {
        d0.b(this.P, 0, j10);
        if (j10 <= y4.c.M0) {
            byte[] bArr = new byte[((int) j10)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    public long l1(f fVar, long j10) throws IOException {
        byte[] bArr;
        if (fVar.R() != 0) {
            long j11 = 0;
            if (j10 >= 0) {
                w wVar = this.O;
                long j12 = -1;
                if (wVar == null) {
                    return -1;
                }
                long j13 = this.P;
                if (j13 - j10 < j10) {
                    while (j13 > j10) {
                        wVar = wVar.f16535g;
                        j13 -= (long) (wVar.f16531c - wVar.f16530b);
                    }
                } else {
                    while (true) {
                        long j14 = ((long) (wVar.f16531c - wVar.f16530b)) + j11;
                        if (j14 >= j10) {
                            break;
                        }
                        wVar = wVar.f16534f;
                        j11 = j14;
                    }
                    j13 = j11;
                }
                byte r10 = fVar.r(0);
                int R2 = fVar.R();
                long j15 = 1 + (this.P - ((long) R2));
                long j16 = j10;
                w wVar2 = wVar;
                long j17 = j13;
                while (j17 < j15) {
                    byte[] bArr2 = wVar2.f16529a;
                    int min = (int) Math.min((long) wVar2.f16531c, (((long) wVar2.f16530b) + j15) - j17);
                    int i10 = (int) ((((long) wVar2.f16530b) + j16) - j17);
                    while (i10 < min) {
                        if (bArr2[i10] == r10) {
                            bArr = bArr2;
                            if (e0(wVar2, i10 + 1, fVar, 1, R2)) {
                                return ((long) (i10 - wVar2.f16530b)) + j17;
                            }
                        } else {
                            bArr = bArr2;
                        }
                        i10++;
                        bArr2 = bArr;
                    }
                    j17 += (long) (wVar2.f16531c - wVar2.f16530b);
                    wVar2 = wVar2.f16534f;
                    j16 = j17;
                    j12 = -1;
                }
                return j12;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    public final c m(c cVar, long j10, long j11) {
        if (cVar != null) {
            d0.b(this.P, j10, j11);
            if (j11 == 0) {
                return this;
            }
            cVar.P += j11;
            w wVar = this.O;
            while (true) {
                int i10 = wVar.f16531c;
                int i11 = wVar.f16530b;
                if (j10 < ((long) (i10 - i11))) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                wVar = wVar.f16534f;
            }
            while (j11 > 0) {
                w d10 = wVar.d();
                int i12 = (int) (((long) d10.f16530b) + j10);
                d10.f16530b = i12;
                d10.f16531c = Math.min(i12 + ((int) j11), d10.f16531c);
                w wVar2 = cVar.O;
                if (wVar2 == null) {
                    d10.f16535g = d10;
                    d10.f16534f = d10;
                    cVar.O = d10;
                } else {
                    wVar2.f16535g.c(d10);
                }
                j11 -= (long) (d10.f16531c - d10.f16530b);
                wVar = wVar.f16534f;
                j10 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final C0271c m0(C0271c cVar) {
        if (cVar.O == null) {
            cVar.O = this;
            cVar.P = true;
            return cVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public final f m1() {
        return w("SHA-256");
    }

    public InputStream n() {
        return new b();
    }

    public String o0(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long g02 = g0((byte) 10, 0, j11);
            if (g02 != -1) {
                return Z0(g02);
            }
            if (j11 < size() && N(j11 - 1) == 13 && N(j11) == 10) {
                return Z0(j11);
            }
            c cVar = new c();
            m(cVar, 0, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + cVar.Q0().s() + h0.F);
        }
        throw new IllegalArgumentException("limit < 0: " + j10);
    }

    public String o1() {
        try {
            return q1(this.P, d0.f16511a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public long p0(f fVar, long j10) {
        int i10;
        long j11 = 0;
        if (j10 >= 0) {
            w wVar = this.O;
            if (wVar == null) {
                return -1;
            }
            long j12 = this.P;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    wVar = wVar.f16535g;
                    j12 -= (long) (wVar.f16531c - wVar.f16530b);
                }
            } else {
                while (true) {
                    long j13 = ((long) (wVar.f16531c - wVar.f16530b)) + j11;
                    if (j13 >= j10) {
                        break;
                    }
                    wVar = wVar.f16534f;
                    j11 = j13;
                }
                j12 = j11;
            }
            if (fVar.R() == 2) {
                byte r10 = fVar.r(0);
                byte r11 = fVar.r(1);
                while (j12 < this.P) {
                    byte[] bArr = wVar.f16529a;
                    i10 = (int) ((((long) wVar.f16530b) + j10) - j12);
                    int i11 = wVar.f16531c;
                    while (i10 < i11) {
                        byte b10 = bArr[i10];
                        if (!(b10 == r10 || b10 == r11)) {
                            i10++;
                        }
                    }
                    j12 += (long) (wVar.f16531c - wVar.f16530b);
                    wVar = wVar.f16534f;
                    j10 = j12;
                }
                return -1;
            }
            byte[] B = fVar.B();
            while (j12 < this.P) {
                byte[] bArr2 = wVar.f16529a;
                int i12 = (int) ((((long) wVar.f16530b) + j10) - j12);
                int i13 = wVar.f16531c;
                while (i10 < i13) {
                    byte b11 = bArr2[i10];
                    int length = B.length;
                    int i14 = 0;
                    while (i14 < length) {
                        if (b11 != B[i14]) {
                            i14++;
                        }
                    }
                    i12 = i10 + 1;
                }
                j12 += (long) (wVar.f16531c - wVar.f16530b);
                wVar = wVar.f16534f;
                j10 = j12;
            }
            return -1;
            return ((long) (i10 - wVar.f16530b)) + j12;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public final f p1() {
        return w("SHA-512");
    }

    public e peek() {
        return p.d(new r(this));
    }

    public final c q(OutputStream outputStream) throws IOException {
        return t(outputStream, 0, this.P);
    }

    public String q1(long j10, Charset charset) throws EOFException {
        d0.b(this.P, 0, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j10 > y4.c.M0) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
        } else if (j10 == 0) {
            return "";
        } else {
            w wVar = this.O;
            int i10 = wVar.f16530b;
            if (((long) i10) + j10 > ((long) wVar.f16531c)) {
                return new String(k1(j10), charset);
            }
            String str = new String(wVar.f16529a, i10, (int) j10, charset);
            int i11 = (int) (((long) wVar.f16530b) + j10);
            wVar.f16530b = i11;
            this.P -= j10;
            if (i11 == wVar.f16531c) {
                this.O = wVar.b();
                x.a(wVar);
            }
            return str;
        }
    }

    public boolean r(long j10, f fVar, int i10, int i11) {
        if (j10 < 0 || i10 < 0 || i11 < 0 || this.P - j10 < ((long) i11) || fVar.R() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (N(((long) i12) + j10) != fVar.r(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final f r1() {
        long j10 = this.P;
        if (j10 <= y4.c.M0) {
            return A1((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.P);
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        w wVar = this.O;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), wVar.f16531c - wVar.f16530b);
        byteBuffer.put(wVar.f16529a, wVar.f16530b, min);
        int i10 = wVar.f16530b + min;
        wVar.f16530b = i10;
        this.P -= (long) min;
        if (i10 == wVar.f16531c) {
            this.O = wVar.b();
            x.a(wVar);
        }
        return min;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        d0.b((long) bArr.length, (long) i10, (long) i11);
        w wVar = this.O;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(i11, wVar.f16531c - wVar.f16530b);
        System.arraycopy(wVar.f16529a, wVar.f16530b, bArr, i10, min);
        int i12 = wVar.f16530b + min;
        wVar.f16530b = i12;
        this.P -= (long) min;
        if (i12 == wVar.f16531c) {
            this.O = wVar.b();
            x.a(wVar);
        }
        return min;
    }

    public byte readByte() {
        long j10 = this.P;
        if (j10 != 0) {
            w wVar = this.O;
            int i10 = wVar.f16530b;
            int i11 = wVar.f16531c;
            int i12 = i10 + 1;
            byte b10 = wVar.f16529a[i10];
            this.P = j10 - 1;
            if (i12 == i11) {
                this.O = wVar.b();
                x.a(wVar);
            } else {
                wVar.f16530b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j10 = this.P;
        if (j10 >= 4) {
            w wVar = this.O;
            int i10 = wVar.f16530b;
            int i11 = wVar.f16531c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = wVar.f16529a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i14 = i13 + 1;
            byte b11 = b10 | ((bArr[i13] & 255) << 8);
            int i15 = i14 + 1;
            byte b12 = b11 | (bArr[i14] & 255);
            this.P = j10 - 4;
            if (i15 == i11) {
                this.O = wVar.b();
                x.a(wVar);
            } else {
                wVar.f16530b = i15;
            }
            return b12;
        }
        throw new IllegalStateException("size < 4: " + this.P);
    }

    public long readLong() {
        long j10 = this.P;
        if (j10 >= 8) {
            w wVar = this.O;
            int i10 = wVar.f16530b;
            int i11 = wVar.f16531c;
            if (i11 - i10 < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = wVar.f16529a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            long j11 = (((long) bArr[i12]) & 255) << 48;
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int i17 = i16 + 1;
            int i18 = i17 + 1;
            int i19 = i18 + 1;
            long j12 = j11 | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i13]) & 255) << 40) | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 24) | ((((long) bArr[i16]) & 255) << 16) | ((((long) bArr[i17]) & 255) << 8) | (((long) bArr[i18]) & 255);
            this.P = j10 - 8;
            if (i19 == i11) {
                this.O = wVar.b();
                x.a(wVar);
            } else {
                wVar.f16530b = i19;
            }
            return j12;
        }
        throw new IllegalStateException("size < 8: " + this.P);
    }

    public short readShort() {
        long j10 = this.P;
        if (j10 >= 2) {
            w wVar = this.O;
            int i10 = wVar.f16530b;
            int i11 = wVar.f16531c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = wVar.f16529a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.P = j10 - 2;
            if (i13 == i11) {
                this.O = wVar.b();
                x.a(wVar);
            } else {
                wVar.f16530b = i13;
            }
            return (short) b10;
        }
        throw new IllegalStateException("size < 2: " + this.P);
    }

    public final long size() {
        return this.P;
    }

    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            w wVar = this.O;
            if (wVar != null) {
                int min = (int) Math.min(j10, (long) (wVar.f16531c - wVar.f16530b));
                long j11 = (long) min;
                this.P -= j11;
                j10 -= j11;
                w wVar2 = this.O;
                int i10 = wVar2.f16530b + min;
                wVar2.f16530b = i10;
                if (i10 == wVar2.f16531c) {
                    this.O = wVar2.b();
                    x.a(wVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final c t(OutputStream outputStream, long j10, long j11) throws IOException {
        if (outputStream != null) {
            d0.b(this.P, j10, j11);
            if (j11 == 0) {
                return this;
            }
            w wVar = this.O;
            while (true) {
                int i10 = wVar.f16531c;
                int i11 = wVar.f16530b;
                if (j10 < ((long) (i10 - i11))) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                wVar = wVar.f16534f;
            }
            while (j11 > 0) {
                int i12 = (int) (((long) wVar.f16530b) + j10);
                int min = (int) Math.min((long) (wVar.f16531c - i12), j11);
                outputStream.write(wVar.f16529a, i12, min);
                j11 -= (long) min;
                wVar = wVar.f16534f;
                j10 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public d t0(a0 a0Var, long j10) throws IOException {
        while (j10 > 0) {
            long C0 = a0Var.C0(this, j10);
            if (C0 != -1) {
                j10 -= C0;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public short t1() {
        return d0.e(readShort());
    }

    public String toString() {
        return r1().toString();
    }

    public String u(long j10) throws EOFException {
        return q1(j10, d0.f16511a);
    }

    public long v1() {
        return d0.d(readLong());
    }

    public final f w(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            w wVar = this.O;
            if (wVar != null) {
                byte[] bArr = wVar.f16529a;
                int i10 = wVar.f16530b;
                instance.update(bArr, i10, wVar.f16531c - i10);
                w wVar2 = this.O;
                while (true) {
                    wVar2 = wVar2.f16534f;
                    if (wVar2 == this.O) {
                        break;
                    }
                    byte[] bArr2 = wVar2.f16529a;
                    int i11 = wVar2.f16530b;
                    instance.update(bArr2, i11, wVar2.f16531c - i11);
                }
            }
            return f.I(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                w F1 = F1(1);
                int min = Math.min(i10, 8192 - F1.f16531c);
                byteBuffer.get(F1.f16529a, F1.f16531c, min);
                i10 -= min;
                F1.f16531c += min;
            }
            this.P += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long y1(f fVar) {
        return p0(fVar, 0);
    }

    public final c z0(InputStream inputStream) throws IOException {
        T0(inputStream, Long.MAX_VALUE, true);
        return this;
    }
}
