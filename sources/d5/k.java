package d5;

import c5.a;
import c5.b;
import c5.d;
import c5.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.h;
import w4.i;
import w4.o;
import w4.s;
import w4.t;
import w4.u;

public class k extends c {
    public static final byte A0 = 93;
    public static final byte B0 = 123;
    public static final byte C0 = 125;
    public static final byte D0 = 92;
    public static final byte E0 = 44;
    public static final byte F0 = 58;
    public static final int G0 = 512;
    public static final byte[] H0 = a.d();
    public static final byte[] I0 = {110, f6147x0, 108, 108};
    public static final byte[] J0 = {116, 114, f6147x0, 101};
    public static final byte[] K0 = {102, 97, 108, 115, 101};

    /* renamed from: x0  reason: collision with root package name */
    public static final byte f6147x0 = 117;

    /* renamed from: y0  reason: collision with root package name */
    public static final byte f6148y0 = 48;

    /* renamed from: z0  reason: collision with root package name */
    public static final byte f6149z0 = 91;

    /* renamed from: n0  reason: collision with root package name */
    public final OutputStream f6150n0;

    /* renamed from: o0  reason: collision with root package name */
    public byte f6151o0;

    /* renamed from: p0  reason: collision with root package name */
    public byte[] f6152p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f6153q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f6154r0;

    /* renamed from: s0  reason: collision with root package name */
    public final int f6155s0;

    /* renamed from: t0  reason: collision with root package name */
    public char[] f6156t0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f6157u0;

    /* renamed from: v0  reason: collision with root package name */
    public byte[] f6158v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f6159w0;

    @Deprecated
    public k(d dVar, int i10, s sVar, OutputStream outputStream) {
        this(dVar, i10, sVar, outputStream, '\"');
    }

    public k(d dVar, int i10, s sVar, OutputStream outputStream, char c10) {
        super(dVar, i10, sVar);
        this.f6150n0 = outputStream;
        this.f6151o0 = (byte) c10;
        if (c10 != '\"') {
            this.f6106h0 = a.g(c10);
        }
        this.f6159w0 = true;
        byte[] l10 = dVar.l();
        this.f6152p0 = l10;
        int length = l10.length;
        this.f6154r0 = length;
        this.f6155s0 = length >> 3;
        char[] f10 = dVar.f();
        this.f6156t0 = f10;
        this.f6157u0 = f10.length;
        if (f1(i.b.ESCAPE_NON_ASCII)) {
            L1(127);
        }
    }

    public k(d dVar, int i10, s sVar, OutputStream outputStream, char c10, byte[] bArr, int i11, boolean z10) {
        super(dVar, i10, sVar);
        this.f6150n0 = outputStream;
        this.f6151o0 = (byte) c10;
        if (c10 != '\"') {
            this.f6106h0 = a.g(c10);
        }
        this.f6159w0 = z10;
        this.f6153q0 = i11;
        this.f6152p0 = bArr;
        int length = bArr.length;
        this.f6154r0 = length;
        this.f6155s0 = length >> 3;
        char[] f10 = dVar.f();
        this.f6156t0 = f10;
        this.f6157u0 = f10.length;
    }

    @Deprecated
    public k(d dVar, int i10, s sVar, OutputStream outputStream, byte[] bArr, int i11, boolean z10) {
        this(dVar, i10, sVar, outputStream, '\"', bArr, i11, z10);
    }

    public final void A3(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f6153q0 + i11 > this.f6154r0) {
            q3();
            if (i11 > 512) {
                this.f6150n0.write(bArr, i10, i11);
                return;
            }
        }
        System.arraycopy(bArr, i10, this.f6152p0, this.f6153q0, i11);
        this.f6153q0 += i11;
    }

    public final int B3(byte[] bArr, int i10, u uVar, int i11) throws IOException, h {
        byte[] k10 = uVar.k();
        int length = k10.length;
        if (length > 6) {
            return r3(bArr, i10, this.f6154r0, k10, i11);
        }
        System.arraycopy(k10, 0, bArr, i10, length);
        return i10 + length;
    }

    public final void C3(String str, int i10, int i11) throws IOException {
        u uVar;
        if (this.f6153q0 + ((i11 - i10) * 6) > this.f6154r0) {
            q3();
        }
        int i12 = this.f6153q0;
        byte[] bArr = this.f6152p0;
        int[] iArr = this.f6106h0;
        int i13 = this.f6107i0;
        if (i13 <= 0) {
            i13 = 65535;
        }
        b bVar = this.f6108j0;
        while (i10 < i11) {
            int i14 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt <= 127) {
                int i15 = iArr[charAt];
                if (i15 == 0) {
                    bArr[i12] = (byte) charAt;
                    i10 = i14;
                    i12++;
                } else if (i15 > 0) {
                    int i16 = i12 + 1;
                    bArr[i12] = D0;
                    i12 = i16 + 1;
                    bArr[i16] = (byte) i15;
                    i10 = i14;
                } else if (i15 == -2) {
                    uVar = bVar.b(charAt);
                    if (uVar == null) {
                        f("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(charAt) + ", although was supposed to have one");
                    }
                    i12 = B3(bArr, i12, uVar, i11 - i14);
                    i10 = i14;
                }
            } else if (charAt <= i13) {
                uVar = bVar.b(charAt);
                if (uVar == null) {
                    if (charAt <= 2047) {
                        int i17 = i12 + 1;
                        bArr[i12] = (byte) ((charAt >> 6) | 192);
                        i12 = i17 + 1;
                        bArr[i17] = (byte) ((charAt & '?') | 128);
                    } else {
                        i12 = s3(charAt, i12);
                    }
                    i10 = i14;
                }
                i12 = B3(bArr, i12, uVar, i11 - i14);
                i10 = i14;
            }
            i12 = E3(charAt, i12);
            i10 = i14;
        }
        this.f6153q0 = i12;
    }

    public final void D3(char[] cArr, int i10, int i11) throws IOException {
        u uVar;
        if (this.f6153q0 + ((i11 - i10) * 6) > this.f6154r0) {
            q3();
        }
        int i12 = this.f6153q0;
        byte[] bArr = this.f6152p0;
        int[] iArr = this.f6106h0;
        int i13 = this.f6107i0;
        if (i13 <= 0) {
            i13 = 65535;
        }
        b bVar = this.f6108j0;
        while (i10 < i11) {
            int i14 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i15 = iArr[c10];
                if (i15 == 0) {
                    bArr[i12] = (byte) c10;
                    i10 = i14;
                    i12++;
                } else if (i15 > 0) {
                    int i16 = i12 + 1;
                    bArr[i12] = D0;
                    i12 = i16 + 1;
                    bArr[i16] = (byte) i15;
                    i10 = i14;
                } else if (i15 == -2) {
                    uVar = bVar.b(c10);
                    if (uVar == null) {
                        f("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c10) + ", although was supposed to have one");
                    }
                    i12 = B3(bArr, i12, uVar, i11 - i14);
                    i10 = i14;
                }
            } else if (c10 <= i13) {
                uVar = bVar.b(c10);
                if (uVar == null) {
                    if (c10 <= 2047) {
                        int i17 = i12 + 1;
                        bArr[i12] = (byte) ((c10 >> 6) | 192);
                        i12 = i17 + 1;
                        bArr[i17] = (byte) ((c10 & '?') | 128);
                    } else {
                        i12 = s3(c10, i12);
                    }
                    i10 = i14;
                }
                i12 = B3(bArr, i12, uVar, i11 - i14);
                i10 = i14;
            }
            i12 = E3(c10, i12);
            i10 = i14;
        }
        this.f6153q0 = i12;
    }

    public final int E3(int i10, int i11) throws IOException {
        int i12;
        byte[] bArr = this.f6152p0;
        int i13 = i11 + 1;
        bArr[i11] = D0;
        int i14 = i13 + 1;
        bArr[i13] = f6147x0;
        if (i10 > 255) {
            int i15 = 255 & (i10 >> 8);
            int i16 = i14 + 1;
            byte[] bArr2 = H0;
            bArr[i14] = bArr2[i15 >> 4];
            i12 = i16 + 1;
            bArr[i16] = bArr2[i15 & 15];
            i10 &= 255;
        } else {
            int i17 = i14 + 1;
            bArr[i14] = f6148y0;
            i12 = i17 + 1;
            bArr[i17] = f6148y0;
        }
        int i18 = i12 + 1;
        byte[] bArr3 = H0;
        bArr[i12] = bArr3[i10 >> 4];
        int i19 = i18 + 1;
        bArr[i18] = bArr3[i10 & 15];
        return i19;
    }

    public final void F3() throws IOException {
        if (this.f6153q0 + 4 >= this.f6154r0) {
            q3();
        }
        System.arraycopy(I0, 0, this.f6152p0, this.f6153q0, 4);
        this.f6153q0 += 4;
    }

    public final void G3(String str) throws IOException {
        int E = this.S.E(str);
        if (E == 4) {
            f("Can not write a field name, expecting a value");
        }
        if (E == 1) {
            this.O.c(this);
        } else {
            this.O.h(this);
        }
        if (this.f6110l0) {
            W3(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f6157u0) {
            W3(str, true);
            return;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        this.f6153q0 = i10 + 1;
        bArr[i10] = this.f6151o0;
        str.getChars(0, length, this.f6156t0, 0);
        if (length <= this.f6155s0) {
            if (this.f6153q0 + length > this.f6154r0) {
                q3();
            }
            Q3(this.f6156t0, 0, length);
        } else {
            X3(this.f6156t0, 0, length);
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i11 = this.f6153q0;
        this.f6153q0 = i11 + 1;
        bArr2[i11] = this.f6151o0;
    }

    public int H0() {
        return this.f6153q0;
    }

    public void H2(char c10) throws IOException {
        if (this.f6153q0 + 3 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        if (c10 <= 127) {
            int i10 = this.f6153q0;
            this.f6153q0 = i10 + 1;
            bArr[i10] = (byte) c10;
        } else if (c10 < 2048) {
            int i11 = this.f6153q0;
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((c10 >> 6) | 192);
            this.f6153q0 = i12 + 1;
            bArr[i12] = (byte) ((c10 & '?') | 128);
        } else {
            t3(c10, (char[]) null, 0, 0);
        }
    }

    public final void H3(u uVar) throws IOException {
        int E = this.S.E(uVar.getValue());
        if (E == 4) {
            f("Can not write a field name, expecting a value");
        }
        if (E == 1) {
            this.O.c(this);
        } else {
            this.O.h(this);
        }
        boolean z10 = !this.f6110l0;
        if (z10) {
            if (this.f6153q0 >= this.f6154r0) {
                q3();
            }
            byte[] bArr = this.f6152p0;
            int i10 = this.f6153q0;
            this.f6153q0 = i10 + 1;
            bArr[i10] = this.f6151o0;
        }
        int c10 = uVar.c(this.f6152p0, this.f6153q0);
        if (c10 < 0) {
            z3(uVar.b());
        } else {
            this.f6153q0 += c10;
        }
        if (z10) {
            if (this.f6153q0 >= this.f6154r0) {
                q3();
            }
            byte[] bArr2 = this.f6152p0;
            int i11 = this.f6153q0;
            this.f6153q0 = i11 + 1;
            bArr2[i11] = this.f6151o0;
        }
    }

    public void I2(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.f6156t0;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            L2(cArr, 0, length);
            return;
        }
        J2(str, 0, length);
    }

    public final void I3(int i10) throws IOException {
        if (this.f6153q0 + 13 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i11 = this.f6153q0;
        int i12 = i11 + 1;
        this.f6153q0 = i12;
        bArr[i11] = this.f6151o0;
        int q10 = j.q(i10, bArr, i12);
        byte[] bArr2 = this.f6152p0;
        this.f6153q0 = q10 + 1;
        bArr2[q10] = this.f6151o0;
    }

    public void J2(String str, int i10, int i11) throws IOException {
        char c10;
        char[] cArr = this.f6156t0;
        int length = cArr.length;
        if (i11 <= length) {
            str.getChars(i10, i10 + i11, cArr, 0);
            L2(cArr, 0, i11);
            return;
        }
        int i12 = this.f6154r0;
        int min = Math.min(length, (i12 >> 2) + (i12 >> 4));
        int i13 = min * 3;
        while (i11 > 0) {
            int min2 = Math.min(min, i11);
            str.getChars(i10, i10 + min2, cArr, 0);
            if (this.f6153q0 + i13 > this.f6154r0) {
                q3();
            }
            if (min2 > 1 && (c10 = cArr[min2 - 1]) >= 55296 && c10 <= 56319) {
                min2--;
            }
            N3(cArr, 0, min2);
            i10 += min2;
            i11 -= min2;
        }
    }

    public final void J3(long j10) throws IOException {
        if (this.f6153q0 + 23 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        int i11 = i10 + 1;
        this.f6153q0 = i11;
        bArr[i10] = this.f6151o0;
        int s10 = j.s(j10, bArr, i11);
        byte[] bArr2 = this.f6152p0;
        this.f6153q0 = s10 + 1;
        bArr2[s10] = this.f6151o0;
    }

    public void K2(u uVar) throws IOException {
        int f10 = uVar.f(this.f6152p0, this.f6153q0);
        if (f10 < 0) {
            z3(uVar.k());
        } else {
            this.f6153q0 += f10;
        }
    }

    public final void K3(String str) throws IOException {
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        this.f6153q0 = i10 + 1;
        bArr[i10] = this.f6151o0;
        I2(str);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i11 = this.f6153q0;
        this.f6153q0 = i11 + 1;
        bArr2[i11] = this.f6151o0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 >= 2048) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r1 = r5.f6152p0;
        r2 = r5.f6153q0;
        r3 = r2 + 1;
        r1[r2] = (byte) ((r0 >> 6) | 192);
        r5.f6153q0 = r3 + 1;
        r1[r3] = (byte) ((r0 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r7 = t3(r0, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L2(char[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r8 + r8
            int r0 = r0 + r8
            int r1 = r5.f6153q0
            int r1 = r1 + r0
            int r2 = r5.f6154r0
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r5.O3(r6, r7, r8)
            return
        L_0x0010:
            r5.q3()
        L_0x0013:
            int r8 = r8 + r7
        L_0x0014:
            if (r7 >= r8) goto L_0x004f
        L_0x0016:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0040
            int r7 = r7 + 1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L_0x003b
            byte[] r1 = r5.f6152p0
            int r2 = r5.f6153q0
            int r3 = r2 + 1
            int r4 = r0 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5.f6153q0 = r2
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            r1[r3] = r0
            goto L_0x0014
        L_0x003b:
            int r7 = r5.t3(r0, r6, r7, r8)
            goto L_0x0014
        L_0x0040:
            byte[] r1 = r5.f6152p0
            int r2 = r5.f6153q0
            int r3 = r2 + 1
            r5.f6153q0 = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0016
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.k.L2(char[], int, int):void");
    }

    public final void L3(char[] cArr, int i10, int i11) throws IOException {
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i12 = this.f6153q0;
        this.f6153q0 = i12 + 1;
        bArr[i12] = this.f6151o0;
        L2(cArr, i10, i11);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i13 = this.f6153q0;
        this.f6153q0 = i13 + 1;
        bArr2[i13] = this.f6151o0;
    }

    public void M2(byte[] bArr, int i10, int i11) throws IOException {
        n3(y4.a.f15470e0);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i12 = this.f6153q0;
        this.f6153q0 = i12 + 1;
        bArr2[i12] = this.f6151o0;
        A3(bArr, i10, i11);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr3 = this.f6152p0;
        int i13 = this.f6153q0;
        this.f6153q0 = i13 + 1;
        bArr3[i13] = this.f6151o0;
    }

    public final void M3(short s10) throws IOException {
        if (this.f6153q0 + 8 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        int i11 = i10 + 1;
        this.f6153q0 = i11;
        bArr[i10] = this.f6151o0;
        int q10 = j.q(s10, bArr, i11);
        byte[] bArr2 = this.f6152p0;
        this.f6153q0 = q10 + 1;
        bArr2[q10] = this.f6151o0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 >= 2048) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r1 = r5.f6152p0;
        r2 = r5.f6153q0;
        r3 = r2 + 1;
        r1[r2] = (byte) ((r0 >> 6) | 192);
        r5.f6153q0 = r3 + 1;
        r1[r3] = (byte) ((r0 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r7 = t3(r0, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N3(char[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
        L_0x0000:
            if (r7 >= r8) goto L_0x003b
        L_0x0002:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x002c
            int r7 = r7 + 1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L_0x0027
            byte[] r1 = r5.f6152p0
            int r2 = r5.f6153q0
            int r3 = r2 + 1
            int r4 = r0 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5.f6153q0 = r2
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            r1[r3] = r0
            goto L_0x0000
        L_0x0027:
            int r7 = r5.t3(r0, r6, r7, r8)
            goto L_0x0000
        L_0x002c:
            byte[] r1 = r5.f6152p0
            int r2 = r5.f6153q0
            int r3 = r2 + 1
            r5.f6153q0 = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0002
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.k.N3(char[], int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r9 = t3(r9, r8, r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if ((r7.f6153q0 + 3) < r7.f6154r0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        q3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r2 = r9 + 1;
        r9 = r8[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r9 >= 2048) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r7.f6153q0;
        r5 = r4 + 1;
        r1[r4] = (byte) ((r9 >> 6) | 192);
        r7.f6153q0 = r5 + 1;
        r1[r5] = (byte) ((r9 & '?') | 128);
        r9 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O3(char[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.f6154r0
            byte[] r1 = r7.f6152p0
            int r10 = r10 + r9
        L_0x0005:
            if (r9 >= r10) goto L_0x0050
        L_0x0007:
            char r2 = r8[r9]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L_0x003c
            int r2 = r7.f6153q0
            int r2 = r2 + 3
            int r4 = r7.f6154r0
            if (r2 < r4) goto L_0x0018
            r7.q3()
        L_0x0018:
            int r2 = r9 + 1
            char r9 = r8[r9]
            r4 = 2048(0x800, float:2.87E-42)
            if (r9 >= r4) goto L_0x0037
            int r4 = r7.f6153q0
            int r5 = r4 + 1
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r5 + 1
            r7.f6153q0 = r4
            r9 = r9 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r1[r5] = r9
            r9 = r2
            goto L_0x0005
        L_0x0037:
            int r9 = r7.t3(r9, r8, r2, r10)
            goto L_0x0005
        L_0x003c:
            int r3 = r7.f6153q0
            if (r3 < r0) goto L_0x0043
            r7.q3()
        L_0x0043:
            int r3 = r7.f6153q0
            int r4 = r3 + 1
            r7.f6153q0 = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x0007
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.k.O3(char[], int, int):void");
    }

    public void P2(u uVar) throws IOException {
        n3(y4.a.f15469d0);
        int f10 = uVar.f(this.f6152p0, this.f6153q0);
        if (f10 < 0) {
            z3(uVar.k());
        } else {
            this.f6153q0 += f10;
        }
    }

    public final void P3(String str, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = this.f6153q0;
        byte[] bArr = this.f6152p0;
        int[] iArr = this.f6106h0;
        while (i10 < i12) {
            char charAt = str.charAt(i10);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            bArr[i13] = (byte) charAt;
            i10++;
            i13++;
        }
        this.f6153q0 = i13;
        if (i10 >= i12) {
            return;
        }
        if (this.f6108j0 != null) {
            C3(str, i10, i12);
        } else if (this.f6107i0 == 0) {
            R3(str, i10, i12);
        } else {
            T3(str, i10, i12);
        }
    }

    public final void Q3(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = this.f6153q0;
        byte[] bArr = this.f6152p0;
        int[] iArr = this.f6106h0;
        while (i10 < i12) {
            char c10 = cArr[i10];
            if (c10 > 127 || iArr[c10] != 0) {
                break;
            }
            bArr[i13] = (byte) c10;
            i10++;
            i13++;
        }
        this.f6153q0 = i13;
        if (i10 >= i12) {
            return;
        }
        if (this.f6108j0 != null) {
            D3(cArr, i10, i12);
        } else if (this.f6107i0 == 0) {
            S3(cArr, i10, i12);
        } else {
            U3(cArr, i10, i12);
        }
    }

    public final void R2() throws IOException {
        n3("start an array");
        this.S = this.S.t();
        t tVar = this.O;
        if (tVar != null) {
            tVar.a(this);
            return;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        this.f6153q0 = i10 + 1;
        bArr[i10] = f6149z0;
    }

    public final void R3(String str, int i10, int i11) throws IOException {
        if (this.f6153q0 + ((i11 - i10) * 6) > this.f6154r0) {
            q3();
        }
        int i12 = this.f6153q0;
        byte[] bArr = this.f6152p0;
        int[] iArr = this.f6106h0;
        while (i10 < i11) {
            int i13 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt <= 127) {
                int i14 = iArr[charAt];
                if (i14 == 0) {
                    bArr[i12] = (byte) charAt;
                    i10 = i13;
                    i12++;
                } else if (i14 > 0) {
                    int i15 = i12 + 1;
                    bArr[i12] = D0;
                    i12 = i15 + 1;
                    bArr[i15] = (byte) i14;
                } else {
                    i12 = E3(charAt, i12);
                }
            } else if (charAt <= 2047) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) ((charAt >> 6) | 192);
                i12 = i16 + 1;
                bArr[i16] = (byte) ((charAt & '?') | 128);
            } else {
                i12 = s3(charAt, i12);
            }
            i10 = i13;
        }
        this.f6153q0 = i12;
    }

    public void S2(int i10) throws IOException {
        n3("start an array");
        this.S = this.S.t();
        t tVar = this.O;
        if (tVar != null) {
            tVar.a(this);
            return;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i11 = this.f6153q0;
        this.f6153q0 = i11 + 1;
        bArr[i11] = f6149z0;
    }

    public final void S3(char[] cArr, int i10, int i11) throws IOException {
        if (this.f6153q0 + ((i11 - i10) * 6) > this.f6154r0) {
            q3();
        }
        int i12 = this.f6153q0;
        byte[] bArr = this.f6152p0;
        int[] iArr = this.f6106h0;
        while (i10 < i11) {
            int i13 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i14 = iArr[c10];
                if (i14 == 0) {
                    bArr[i12] = (byte) c10;
                    i10 = i13;
                    i12++;
                } else if (i14 > 0) {
                    int i15 = i12 + 1;
                    bArr[i12] = D0;
                    i12 = i15 + 1;
                    bArr[i15] = (byte) i14;
                } else {
                    i12 = E3(c10, i12);
                }
            } else if (c10 <= 2047) {
                int i16 = i12 + 1;
                bArr[i12] = (byte) ((c10 >> 6) | 192);
                i12 = i16 + 1;
                bArr[i16] = (byte) ((c10 & '?') | 128);
            } else {
                i12 = s3(c10, i12);
            }
            i10 = i13;
        }
        this.f6153q0 = i12;
    }

    public final void T3(String str, int i10, int i11) throws IOException {
        if (this.f6153q0 + ((i11 - i10) * 6) > this.f6154r0) {
            q3();
        }
        int i12 = this.f6153q0;
        byte[] bArr = this.f6152p0;
        int[] iArr = this.f6106h0;
        int i13 = this.f6107i0;
        while (i10 < i11) {
            int i14 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt <= 127) {
                int i15 = iArr[charAt];
                if (i15 == 0) {
                    bArr[i12] = (byte) charAt;
                    i10 = i14;
                    i12++;
                } else if (i15 > 0) {
                    int i16 = i12 + 1;
                    bArr[i12] = D0;
                    i12 = i16 + 1;
                    bArr[i16] = (byte) i15;
                    i10 = i14;
                }
            } else if (charAt <= i13) {
                if (charAt <= 2047) {
                    int i17 = i12 + 1;
                    bArr[i12] = (byte) ((charAt >> 6) | 192);
                    i12 = i17 + 1;
                    bArr[i17] = (byte) ((charAt & '?') | 128);
                } else {
                    i12 = s3(charAt, i12);
                }
                i10 = i14;
            }
            i12 = E3(charAt, i12);
            i10 = i14;
        }
        this.f6153q0 = i12;
    }

    public final void U3(char[] cArr, int i10, int i11) throws IOException {
        if (this.f6153q0 + ((i11 - i10) * 6) > this.f6154r0) {
            q3();
        }
        int i12 = this.f6153q0;
        byte[] bArr = this.f6152p0;
        int[] iArr = this.f6106h0;
        int i13 = this.f6107i0;
        while (i10 < i11) {
            int i14 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i15 = iArr[c10];
                if (i15 == 0) {
                    bArr[i12] = (byte) c10;
                    i10 = i14;
                    i12++;
                } else if (i15 > 0) {
                    int i16 = i12 + 1;
                    bArr[i12] = D0;
                    i12 = i16 + 1;
                    bArr[i16] = (byte) i15;
                    i10 = i14;
                }
            } else if (c10 <= i13) {
                if (c10 <= 2047) {
                    int i17 = i12 + 1;
                    bArr[i12] = (byte) ((c10 >> 6) | 192);
                    i12 = i17 + 1;
                    bArr[i17] = (byte) ((c10 & '?') | 128);
                } else {
                    i12 = s3(c10, i12);
                }
                i10 = i14;
            }
            i12 = E3(c10, i12);
            i10 = i14;
        }
        this.f6153q0 = i12;
    }

    public final void V2() throws IOException {
        n3("start an object");
        this.S = this.S.v();
        t tVar = this.O;
        if (tVar != null) {
            tVar.b(this);
            return;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        this.f6153q0 = i10 + 1;
        bArr[i10] = B0;
    }

    public final void V3(String str, int i10, int i11) throws IOException {
        do {
            int min = Math.min(this.f6155s0, i11);
            if (this.f6153q0 + min > this.f6154r0) {
                q3();
            }
            P3(str, i10, min);
            i10 += min;
            i11 -= min;
        } while (i11 > 0);
    }

    public Object W0() {
        return this.f6150n0;
    }

    public void W2(Object obj) throws IOException {
        n3("start an object");
        this.S = this.S.w(obj);
        t tVar = this.O;
        if (tVar != null) {
            tVar.b(this);
            return;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        this.f6153q0 = i10 + 1;
        bArr[i10] = B0;
    }

    public final void W3(String str, boolean z10) throws IOException {
        if (z10) {
            if (this.f6153q0 >= this.f6154r0) {
                q3();
            }
            byte[] bArr = this.f6152p0;
            int i10 = this.f6153q0;
            this.f6153q0 = i10 + 1;
            bArr[i10] = this.f6151o0;
        }
        int length = str.length();
        int i11 = 0;
        while (length > 0) {
            int min = Math.min(this.f6155s0, length);
            if (this.f6153q0 + min > this.f6154r0) {
                q3();
            }
            P3(str, i11, min);
            i11 += min;
            length -= min;
        }
        if (z10) {
            if (this.f6153q0 >= this.f6154r0) {
                q3();
            }
            byte[] bArr2 = this.f6152p0;
            int i12 = this.f6153q0;
            this.f6153q0 = i12 + 1;
            bArr2[i12] = this.f6151o0;
        }
    }

    public int X1(w4.a aVar, InputStream inputStream, int i10) throws IOException, h {
        n3(y4.a.Z);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i11 = this.f6153q0;
        this.f6153q0 = i11 + 1;
        bArr[i11] = this.f6151o0;
        byte[] d10 = this.f6105g0.d();
        if (i10 < 0) {
            try {
                i10 = w3(aVar, inputStream, d10);
            } catch (Throwable th2) {
                this.f6105g0.r(d10);
                throw th2;
            }
        } else {
            int x32 = x3(aVar, inputStream, d10, i10);
            if (x32 > 0) {
                f("Too few bytes available: missing " + x32 + " bytes (out of " + i10 + ")");
            }
        }
        this.f6105g0.r(d10);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i12 = this.f6153q0;
        this.f6153q0 = i12 + 1;
        bArr2[i12] = this.f6151o0;
        return i10;
    }

    public final void X3(char[] cArr, int i10, int i11) throws IOException {
        do {
            int min = Math.min(this.f6155s0, i11);
            if (this.f6153q0 + min > this.f6154r0) {
                q3();
            }
            Q3(cArr, i10, min);
            i10 += min;
            i11 -= min;
        } while (i11 > 0);
    }

    public void Y1(w4.a aVar, byte[] bArr, int i10, int i11) throws IOException, h {
        n3(y4.a.Z);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i12 = this.f6153q0;
        this.f6153q0 = i12 + 1;
        bArr2[i12] = this.f6151o0;
        y3(aVar, bArr, i10, i11 + i10);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr3 = this.f6152p0;
        int i13 = this.f6153q0;
        this.f6153q0 = i13 + 1;
        bArr3[i13] = this.f6151o0;
    }

    public void Y2(Reader reader, int i10) throws IOException {
        n3(y4.a.f15470e0);
        if (reader == null) {
            f("null reader");
        }
        int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
        char[] cArr = this.f6156t0;
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i12 = this.f6153q0;
        this.f6153q0 = i12 + 1;
        bArr[i12] = this.f6151o0;
        while (i11 > 0) {
            int read = reader.read(cArr, 0, Math.min(i11, cArr.length));
            if (read <= 0) {
                break;
            }
            if (this.f6153q0 + i10 >= this.f6154r0) {
                q3();
            }
            X3(cArr, 0, read);
            i11 -= read;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i13 = this.f6153q0;
        this.f6153q0 = i13 + 1;
        bArr2[i13] = this.f6151o0;
        if (i11 > 0 && i10 >= 0) {
            f("Didn't read enough from reader");
        }
    }

    public final void Y3(byte[] bArr, int i10, int i11) throws IOException, h {
        int[] iArr = this.f6106h0;
        int i12 = i10 + i11;
        int i13 = i10;
        while (i13 < i12) {
            int i14 = i13 + 1;
            byte b10 = bArr[i13];
            if (b10 < 0 || iArr[b10] == 0) {
                i13 = i14;
            } else {
                Z3(bArr, i10, i11);
                return;
            }
        }
        if (this.f6153q0 + i11 > this.f6154r0) {
            q3();
        }
        System.arraycopy(bArr, i10, this.f6152p0, this.f6153q0, i11);
        this.f6153q0 += i11;
    }

    public void Z2(String str) throws IOException {
        n3(y4.a.f15470e0);
        if (str == null) {
            F3();
            return;
        }
        int length = str.length();
        if (length > this.f6155s0) {
            W3(str, true);
            return;
        }
        if (this.f6153q0 + length >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        this.f6153q0 = i10 + 1;
        bArr[i10] = this.f6151o0;
        P3(str, 0, length);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i11 = this.f6153q0;
        this.f6153q0 = i11 + 1;
        bArr2[i11] = this.f6151o0;
    }

    public final void Z3(byte[] bArr, int i10, int i11) throws IOException, h {
        int i12;
        int i13;
        int i14 = this.f6153q0;
        if ((i11 * 6) + i14 > this.f6154r0) {
            q3();
            i14 = this.f6153q0;
        }
        byte[] bArr2 = this.f6152p0;
        int[] iArr = this.f6106h0;
        int i15 = i11 + i10;
        while (i10 < i15) {
            int i16 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 < 0 || (i13 = iArr[b10]) == 0) {
                bArr2[i12] = b10;
                i10 = i16;
                i12++;
            } else {
                if (i13 > 0) {
                    int i17 = i12 + 1;
                    bArr2[i12] = D0;
                    i12 = i17 + 1;
                    bArr2[i17] = (byte) i13;
                } else {
                    i12 = E3(b10, i12);
                }
                i10 = i16;
            }
        }
        this.f6153q0 = i12;
    }

    public final void a3(u uVar) throws IOException {
        n3(y4.a.f15470e0);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        int i11 = i10 + 1;
        this.f6153q0 = i11;
        bArr[i10] = this.f6151o0;
        int c10 = uVar.c(bArr, i11);
        if (c10 < 0) {
            z3(uVar.b());
        } else {
            this.f6153q0 += c10;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i12 = this.f6153q0;
        this.f6153q0 = i12 + 1;
        bArr2[i12] = this.f6151o0;
    }

    public final void a4(byte[] bArr, int i10, int i11) throws IOException, h {
        do {
            int min = Math.min(this.f6155s0, i11);
            Y3(bArr, i10, min);
            i10 += min;
            i11 -= min;
        } while (i11 > 0);
    }

    public void b3(char[] cArr, int i10, int i11) throws IOException {
        n3(y4.a.f15470e0);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i12 = this.f6153q0;
        int i13 = i12 + 1;
        this.f6153q0 = i13;
        bArr[i12] = this.f6151o0;
        if (i11 <= this.f6155s0) {
            if (i13 + i11 > this.f6154r0) {
                q3();
            }
            Q3(cArr, i10, i11);
        } else {
            X3(cArr, i10, i11);
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i14 = this.f6153q0;
        this.f6153q0 = i14 + 1;
        bArr2[i14] = this.f6151o0;
    }

    public final void b4(u uVar) throws IOException {
        int c10 = uVar.c(this.f6152p0, this.f6153q0);
        if (c10 < 0) {
            z3(uVar.b());
        } else {
            this.f6153q0 += c10;
        }
    }

    public void c2(boolean z10) throws IOException {
        n3(y4.a.f15466a0);
        if (this.f6153q0 + 5 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = z10 ? J0 : K0;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f6152p0, this.f6153q0, length);
        this.f6153q0 += length;
    }

    public void close() throws IOException {
        super.close();
        if (this.f6152p0 != null && f1(i.b.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                o T0 = T0();
                if (!T0.k()) {
                    if (!T0.l()) {
                        break;
                    }
                    g2();
                } else {
                    f2();
                }
            }
        }
        q3();
        this.f6153q0 = 0;
        if (this.f6150n0 != null) {
            if (this.f6105g0.q() || f1(i.b.AUTO_CLOSE_TARGET)) {
                this.f6150n0.close();
            } else if (f1(i.b.FLUSH_PASSED_TO_STREAM)) {
                this.f6150n0.flush();
            }
        }
        m3();
    }

    public final void f2() throws IOException {
        if (!this.S.k()) {
            f("Current context not Array but " + this.S.q());
        }
        t tVar = this.O;
        if (tVar != null) {
            tVar.f(this, this.S.d());
        } else {
            if (this.f6153q0 >= this.f6154r0) {
                q3();
            }
            byte[] bArr = this.f6152p0;
            int i10 = this.f6153q0;
            this.f6153q0 = i10 + 1;
            bArr[i10] = A0;
        }
        this.S = this.S.s();
    }

    public void flush() throws IOException {
        q3();
        if (this.f6150n0 != null && f1(i.b.FLUSH_PASSED_TO_STREAM)) {
            this.f6150n0.flush();
        }
    }

    public final void g2() throws IOException {
        if (!this.S.l()) {
            f("Current context not Object but " + this.S.q());
        }
        t tVar = this.O;
        if (tVar != null) {
            tVar.k(this, this.S.d());
        } else {
            if (this.f6153q0 >= this.f6154r0) {
                q3();
            }
            byte[] bArr = this.f6152p0;
            int i10 = this.f6153q0;
            this.f6153q0 = i10 + 1;
            bArr[i10] = C0;
        }
        this.S = this.S.s();
    }

    public void h3(byte[] bArr, int i10, int i11) throws IOException {
        n3(y4.a.f15470e0);
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i12 = this.f6153q0;
        this.f6153q0 = i12 + 1;
        bArr2[i12] = this.f6151o0;
        if (i11 <= this.f6155s0) {
            Y3(bArr, i10, i11);
        } else {
            a4(bArr, i10, i11);
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr3 = this.f6152p0;
        int i13 = this.f6153q0;
        this.f6153q0 = i13 + 1;
        bArr3[i13] = this.f6151o0;
    }

    public void i2(String str) throws IOException {
        if (this.O != null) {
            G3(str);
            return;
        }
        int E = this.S.E(str);
        if (E == 4) {
            f("Can not write a field name, expecting a value");
        }
        if (E == 1) {
            if (this.f6153q0 >= this.f6154r0) {
                q3();
            }
            byte[] bArr = this.f6152p0;
            int i10 = this.f6153q0;
            this.f6153q0 = i10 + 1;
            bArr[i10] = 44;
        }
        if (this.f6110l0) {
            W3(str, false);
            return;
        }
        int length = str.length();
        if (length > this.f6157u0) {
            W3(str, true);
            return;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i11 = this.f6153q0;
        int i12 = i11 + 1;
        this.f6153q0 = i12;
        bArr2[i11] = this.f6151o0;
        if (length <= this.f6155s0) {
            if (i12 + length > this.f6154r0) {
                q3();
            }
            P3(str, 0, length);
        } else {
            V3(str, 0, length);
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr3 = this.f6152p0;
        int i13 = this.f6153q0;
        this.f6153q0 = i13 + 1;
        bArr3[i13] = this.f6151o0;
    }

    public void j2(u uVar) throws IOException {
        if (this.O != null) {
            H3(uVar);
            return;
        }
        int E = this.S.E(uVar.getValue());
        if (E == 4) {
            f("Can not write a field name, expecting a value");
        }
        if (E == 1) {
            if (this.f6153q0 >= this.f6154r0) {
                q3();
            }
            byte[] bArr = this.f6152p0;
            int i10 = this.f6153q0;
            this.f6153q0 = i10 + 1;
            bArr[i10] = 44;
        }
        if (this.f6110l0) {
            b4(uVar);
            return;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr2 = this.f6152p0;
        int i11 = this.f6153q0;
        int i12 = i11 + 1;
        this.f6153q0 = i12;
        bArr2[i11] = this.f6151o0;
        int c10 = uVar.c(bArr2, i12);
        if (c10 < 0) {
            z3(uVar.b());
        } else {
            this.f6153q0 += c10;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr3 = this.f6152p0;
        int i13 = this.f6153q0;
        this.f6153q0 = i13 + 1;
        bArr3[i13] = this.f6151o0;
    }

    public void k2() throws IOException {
        n3(y4.a.f15467b0);
        F3();
    }

    public void m2(double d10) throws IOException {
        if (this.R || (j.o(d10) && i.b.QUOTE_NON_NUMERIC_NUMBERS.d(this.Q))) {
            Z2(String.valueOf(d10));
            return;
        }
        n3(y4.a.f15468c0);
        I2(String.valueOf(d10));
    }

    public void m3() {
        byte[] bArr = this.f6152p0;
        if (bArr != null && this.f6159w0) {
            this.f6152p0 = null;
            this.f6105g0.w(bArr);
        }
        char[] cArr = this.f6156t0;
        if (cArr != null) {
            this.f6156t0 = null;
            this.f6105g0.s(cArr);
        }
    }

    public void n2(float f10) throws IOException {
        if (this.R || (j.p(f10) && i.b.QUOTE_NON_NUMERIC_NUMBERS.d(this.Q))) {
            Z2(String.valueOf(f10));
            return;
        }
        n3(y4.a.f15468c0);
        I2(String.valueOf(f10));
    }

    public final void n3(String str) throws IOException {
        byte b10;
        int F = this.S.F();
        if (this.O != null) {
            p3(str, F);
            return;
        }
        if (F == 1) {
            b10 = 44;
        } else if (F == 2) {
            b10 = F0;
        } else if (F == 3) {
            u uVar = this.f6109k0;
            if (uVar != null) {
                byte[] k10 = uVar.k();
                if (k10.length > 0) {
                    z3(k10);
                    return;
                }
                return;
            }
            return;
        } else if (F == 5) {
            o3(str);
            return;
        } else {
            return;
        }
        if (this.f6153q0 >= this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i10 = this.f6153q0;
        this.f6153q0 = i10 + 1;
        bArr[i10] = b10;
    }

    public void o2(int i10) throws IOException {
        n3(y4.a.f15468c0);
        if (this.f6153q0 + 11 >= this.f6154r0) {
            q3();
        }
        if (this.R) {
            I3(i10);
        } else {
            this.f6153q0 = j.q(i10, this.f6152p0, this.f6153q0);
        }
    }

    public void p2(long j10) throws IOException {
        n3(y4.a.f15468c0);
        if (this.R) {
            J3(j10);
            return;
        }
        if (this.f6153q0 + 21 >= this.f6154r0) {
            q3();
        }
        this.f6153q0 = j.s(j10, this.f6152p0, this.f6153q0);
    }

    public void q2(String str) throws IOException {
        n3(y4.a.f15468c0);
        if (this.R) {
            K3(str);
        } else {
            I2(str);
        }
    }

    public final void q3() throws IOException {
        int i10 = this.f6153q0;
        if (i10 > 0) {
            this.f6153q0 = 0;
            this.f6150n0.write(this.f6152p0, 0, i10);
        }
    }

    public void r2(BigDecimal bigDecimal) throws IOException {
        n3(y4.a.f15468c0);
        if (bigDecimal == null) {
            F3();
            return;
        }
        boolean z10 = this.R;
        String i32 = i3(bigDecimal);
        if (z10) {
            K3(i32);
        } else {
            I2(i32);
        }
    }

    public final int r3(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException, h {
        int length = bArr2.length;
        if (i10 + length > i11) {
            this.f6153q0 = i10;
            q3();
            i10 = this.f6153q0;
            if (length > bArr.length) {
                this.f6150n0.write(bArr2, 0, length);
                return i10;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i10, length);
        int i13 = i10 + length;
        if ((i12 * 6) + i13 <= i11) {
            return i13;
        }
        this.f6153q0 = i13;
        q3();
        return this.f6153q0;
    }

    public void s2(BigInteger bigInteger) throws IOException {
        n3(y4.a.f15468c0);
        if (bigInteger == null) {
            F3();
            return;
        }
        boolean z10 = this.R;
        String bigInteger2 = bigInteger.toString();
        if (z10) {
            K3(bigInteger2);
        } else {
            I2(bigInteger2);
        }
    }

    public final int s3(int i10, int i11) throws IOException {
        byte[] bArr = this.f6152p0;
        if (i10 < 55296 || i10 > 57343) {
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i10 >> 12) | 224);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((i10 >> 6) & 63) | 128);
            bArr[i13] = (byte) ((i10 & 63) | 128);
            return i13 + 1;
        }
        int i14 = i11 + 1;
        bArr[i11] = D0;
        int i15 = i14 + 1;
        bArr[i14] = f6147x0;
        int i16 = i15 + 1;
        byte[] bArr2 = H0;
        bArr[i15] = bArr2[(i10 >> 12) & 15];
        int i17 = i16 + 1;
        bArr[i16] = bArr2[(i10 >> 8) & 15];
        int i18 = i17 + 1;
        bArr[i17] = bArr2[(i10 >> 4) & 15];
        int i19 = i18 + 1;
        bArr[i18] = bArr2[i10 & 15];
        return i19;
    }

    public void t2(short s10) throws IOException {
        n3(y4.a.f15468c0);
        if (this.f6153q0 + 6 >= this.f6154r0) {
            q3();
        }
        if (this.R) {
            M3(s10);
        } else {
            this.f6153q0 = j.q(s10, this.f6152p0, this.f6153q0);
        }
    }

    public final int t3(int i10, char[] cArr, int i11, int i12) throws IOException {
        if (i10 < 55296 || i10 > 57343) {
            byte[] bArr = this.f6152p0;
            int i13 = this.f6153q0;
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 12) | 224);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((i10 >> 6) & 63) | 128);
            this.f6153q0 = i15 + 1;
            bArr[i15] = (byte) ((i10 & 63) | 128);
            return i11;
        }
        if (i11 >= i12 || cArr == null) {
            f(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[]{Integer.valueOf(i10)}));
        }
        u3(i10, cArr[i11]);
        return i11 + 1;
    }

    public void u2(char[] cArr, int i10, int i11) throws IOException {
        n3(y4.a.f15468c0);
        if (this.R) {
            L3(cArr, i10, i11);
        } else {
            L2(cArr, i10, i11);
        }
    }

    public final void u3(int i10, int i11) throws IOException {
        int l32 = l3(i10, i11);
        if (this.f6153q0 + 4 > this.f6154r0) {
            q3();
        }
        byte[] bArr = this.f6152p0;
        int i12 = this.f6153q0;
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((l32 >> 18) | 240);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (((l32 >> 12) & 63) | 128);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (((l32 >> 6) & 63) | 128);
        this.f6153q0 = i15 + 1;
        bArr[i15] = (byte) ((l32 & 63) | 128);
    }

    public final int v3(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) throws IOException {
        int i13 = 0;
        while (i10 < i11) {
            bArr[i13] = bArr[i10];
            i13++;
            i10++;
        }
        int min = Math.min(i12, bArr.length);
        do {
            int i14 = min - i13;
            if (i14 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i13, i14);
            if (read < 0) {
                return i13;
            }
            i13 += read;
        } while (i13 < 3);
        return i13;
    }

    public final int w3(w4.a aVar, InputStream inputStream, byte[] bArr) throws IOException, h {
        int i10 = this.f6154r0 - 6;
        int i11 = 2;
        int s10 = aVar.s() >> 2;
        int i12 = -3;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 > i12) {
                i14 = v3(inputStream, bArr, i13, i14, bArr.length);
                if (i14 < 3) {
                    break;
                }
                i12 = i14 - 3;
                i13 = 0;
            }
            if (this.f6153q0 > i10) {
                q3();
            }
            int i16 = i13 + 1;
            int i17 = i16 + 1;
            i13 = i17 + 1;
            i15 += 3;
            int m10 = aVar.m((((bArr[i16] & 255) | (bArr[i13] << 8)) << 8) | (bArr[i17] & 255), this.f6152p0, this.f6153q0);
            this.f6153q0 = m10;
            s10--;
            if (s10 <= 0) {
                byte[] bArr2 = this.f6152p0;
                int i18 = m10 + 1;
                bArr2[m10] = D0;
                this.f6153q0 = i18 + 1;
                bArr2[i18] = 110;
                s10 = aVar.s() >> 2;
            }
        }
        if (i14 <= 0) {
            return i15;
        }
        if (this.f6153q0 > i10) {
            q3();
        }
        int i19 = bArr[0] << 16;
        if (1 < i14) {
            i19 |= (bArr[1] & 255) << 8;
        } else {
            i11 = 1;
        }
        int i20 = i15 + i11;
        this.f6153q0 = aVar.p(i19, i11, this.f6152p0, this.f6153q0);
        return i20;
    }

    public final int x3(w4.a aVar, InputStream inputStream, byte[] bArr, int i10) throws IOException, h {
        int v32;
        int i11 = this.f6154r0 - 6;
        int i12 = 2;
        int s10 = aVar.s() >> 2;
        int i13 = -3;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i10 <= 2) {
                break;
            }
            if (i14 > i13) {
                i15 = v3(inputStream, bArr, i14, i15, i10);
                if (i15 < 3) {
                    i14 = 0;
                    break;
                }
                i13 = i15 - 3;
                i14 = 0;
            }
            if (this.f6153q0 > i11) {
                q3();
            }
            int i16 = i14 + 1;
            int i17 = i16 + 1;
            i14 = i17 + 1;
            i10 -= 3;
            int m10 = aVar.m((((bArr[i16] & 255) | (bArr[i14] << 8)) << 8) | (bArr[i17] & 255), this.f6152p0, this.f6153q0);
            this.f6153q0 = m10;
            s10--;
            if (s10 <= 0) {
                byte[] bArr2 = this.f6152p0;
                int i18 = m10 + 1;
                bArr2[m10] = D0;
                this.f6153q0 = i18 + 1;
                bArr2[i18] = 110;
                s10 = aVar.s() >> 2;
            }
        }
        if (i10 <= 0 || (v32 = v3(inputStream, bArr, i14, i15, i10)) <= 0) {
            return i10;
        }
        if (this.f6153q0 > i11) {
            q3();
        }
        int i19 = bArr[0] << 16;
        if (1 < v32) {
            i19 |= (bArr[1] & 255) << 8;
        } else {
            i12 = 1;
        }
        this.f6153q0 = aVar.p(i19, i12, this.f6152p0, this.f6153q0);
        return i10 - i12;
    }

    public final void y3(w4.a aVar, byte[] bArr, int i10, int i11) throws IOException, h {
        int i12 = i11 - 3;
        int i13 = this.f6154r0 - 6;
        int s10 = aVar.s() >> 2;
        while (i10 <= i12) {
            if (this.f6153q0 > i13) {
                q3();
            }
            int i14 = i10 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int m10 = aVar.m((((bArr[i10] << 8) | (bArr[i14] & 255)) << 8) | (bArr[i15] & 255), this.f6152p0, this.f6153q0);
            this.f6153q0 = m10;
            s10--;
            if (s10 <= 0) {
                byte[] bArr2 = this.f6152p0;
                int i17 = m10 + 1;
                bArr2[m10] = D0;
                this.f6153q0 = i17 + 1;
                bArr2[i17] = 110;
                s10 = aVar.s() >> 2;
            }
            i10 = i16;
        }
        int i18 = i11 - i10;
        if (i18 > 0) {
            if (this.f6153q0 > i13) {
                q3();
            }
            int i19 = i10 + 1;
            int i20 = bArr[i10] << 16;
            if (i18 == 2) {
                i20 |= (bArr[i19] & 255) << 8;
            }
            this.f6153q0 = aVar.p(i20, i18, this.f6152p0, this.f6153q0);
        }
    }

    public final void z3(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f6153q0 + length > this.f6154r0) {
            q3();
            if (length > 512) {
                this.f6150n0.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f6152p0, this.f6153q0, length);
        this.f6153q0 += length;
    }
}
