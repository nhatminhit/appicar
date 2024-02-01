package d5;

import c5.a;
import c5.b;
import c5.d;
import c5.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.h;
import w4.i;
import w4.o;
import w4.s;
import w4.t;
import w4.u;

public class m extends c {

    /* renamed from: w0  reason: collision with root package name */
    public static final int f6167w0 = 32;

    /* renamed from: x0  reason: collision with root package name */
    public static final char[] f6168x0 = a.e();

    /* renamed from: n0  reason: collision with root package name */
    public final Writer f6169n0;

    /* renamed from: o0  reason: collision with root package name */
    public char f6170o0;

    /* renamed from: p0  reason: collision with root package name */
    public char[] f6171p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f6172q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f6173r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f6174s0;

    /* renamed from: t0  reason: collision with root package name */
    public char[] f6175t0;

    /* renamed from: u0  reason: collision with root package name */
    public u f6176u0;

    /* renamed from: v0  reason: collision with root package name */
    public char[] f6177v0;

    @Deprecated
    public m(d dVar, int i10, s sVar, Writer writer) {
        this(dVar, i10, sVar, writer, '\"');
    }

    public m(d dVar, int i10, s sVar, Writer writer, char c10) {
        super(dVar, i10, sVar);
        this.f6169n0 = writer;
        char[] f10 = dVar.f();
        this.f6171p0 = f10;
        this.f6174s0 = f10.length;
        this.f6170o0 = c10;
        if (c10 != '\"') {
            this.f6106h0 = a.g(c10);
        }
    }

    public final void A3(String str, boolean z10) throws IOException {
        if (this.O != null) {
            F3(str, z10);
            return;
        }
        if (this.f6173r0 + 1 >= this.f6174s0) {
            t3();
        }
        if (z10) {
            char[] cArr = this.f6171p0;
            int i10 = this.f6173r0;
            this.f6173r0 = i10 + 1;
            cArr[i10] = ',';
        }
        if (this.f6110l0) {
            P3(str);
            return;
        }
        char[] cArr2 = this.f6171p0;
        int i11 = this.f6173r0;
        this.f6173r0 = i11 + 1;
        cArr2[i11] = this.f6170o0;
        P3(str);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr3 = this.f6171p0;
        int i12 = this.f6173r0;
        this.f6173r0 = i12 + 1;
        cArr3[i12] = this.f6170o0;
    }

    public final void B3(u uVar, boolean z10) throws IOException {
        if (this.O != null) {
            G3(uVar, z10);
            return;
        }
        if (this.f6173r0 + 1 >= this.f6174s0) {
            t3();
        }
        if (z10) {
            char[] cArr = this.f6171p0;
            int i10 = this.f6173r0;
            this.f6173r0 = i10 + 1;
            cArr[i10] = ',';
        }
        if (this.f6110l0) {
            char[] a10 = uVar.a();
            L2(a10, 0, a10.length);
            return;
        }
        char[] cArr2 = this.f6171p0;
        int i11 = this.f6173r0;
        int i12 = i11 + 1;
        this.f6173r0 = i12;
        cArr2[i11] = this.f6170o0;
        int h10 = uVar.h(cArr2, i12);
        if (h10 < 0) {
            C3(uVar);
            return;
        }
        int i13 = this.f6173r0 + h10;
        this.f6173r0 = i13;
        if (i13 >= this.f6174s0) {
            t3();
        }
        char[] cArr3 = this.f6171p0;
        int i14 = this.f6173r0;
        this.f6173r0 = i14 + 1;
        cArr3[i14] = this.f6170o0;
    }

    public final void C3(u uVar) throws IOException {
        char[] a10 = uVar.a();
        L2(a10, 0, a10.length);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = this.f6170o0;
    }

    public final void D3(String str) throws IOException {
        t3();
        int length = str.length();
        int i10 = 0;
        while (true) {
            int i11 = this.f6174s0;
            if (i10 + i11 > length) {
                i11 = length - i10;
            }
            int i12 = i10 + i11;
            str.getChars(i10, i12, this.f6171p0, 0);
            if (this.f6108j0 != null) {
                O3(i11);
            } else {
                int i13 = this.f6107i0;
                if (i13 != 0) {
                    N3(i11, i13);
                } else {
                    M3(i11);
                }
            }
            if (i12 < length) {
                i10 = i12;
            } else {
                return;
            }
        }
    }

    public final void E3() throws IOException {
        if (this.f6173r0 + 4 >= this.f6174s0) {
            t3();
        }
        int i10 = this.f6173r0;
        char[] cArr = this.f6171p0;
        cArr[i10] = 'n';
        int i11 = i10 + 1;
        cArr[i11] = 'u';
        int i12 = i11 + 1;
        cArr[i12] = 'l';
        int i13 = i12 + 1;
        cArr[i13] = 'l';
        this.f6173r0 = i13 + 1;
    }

    public final void F3(String str, boolean z10) throws IOException {
        if (z10) {
            this.O.c(this);
        } else {
            this.O.h(this);
        }
        if (this.f6110l0) {
            P3(str);
            return;
        }
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = this.f6170o0;
        P3(str);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i11 = this.f6173r0;
        this.f6173r0 = i11 + 1;
        cArr2[i11] = this.f6170o0;
    }

    public final void G3(u uVar, boolean z10) throws IOException {
        if (z10) {
            this.O.c(this);
        } else {
            this.O.h(this);
        }
        char[] a10 = uVar.a();
        if (this.f6110l0) {
            L2(a10, 0, a10.length);
            return;
        }
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = this.f6170o0;
        L2(a10, 0, a10.length);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i11 = this.f6173r0;
        this.f6173r0 = i11 + 1;
        cArr2[i11] = this.f6170o0;
    }

    public int H0() {
        return Math.max(0, this.f6173r0 - this.f6172q0);
    }

    public void H2(char c10) throws IOException {
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = c10;
    }

    public final void H3(int i10) throws IOException {
        if (this.f6173r0 + 13 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i11 = this.f6173r0;
        int i12 = i11 + 1;
        this.f6173r0 = i12;
        cArr[i11] = this.f6170o0;
        int r10 = j.r(i10, cArr, i12);
        char[] cArr2 = this.f6171p0;
        this.f6173r0 = r10 + 1;
        cArr2[r10] = this.f6170o0;
    }

    public void I2(String str) throws IOException {
        int length = str.length();
        int i10 = this.f6174s0 - this.f6173r0;
        if (i10 == 0) {
            t3();
            i10 = this.f6174s0 - this.f6173r0;
        }
        if (i10 >= length) {
            str.getChars(0, length, this.f6171p0, this.f6173r0);
            this.f6173r0 += length;
            return;
        }
        X3(str);
    }

    public final void I3(long j10) throws IOException {
        if (this.f6173r0 + 23 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        int i11 = i10 + 1;
        this.f6173r0 = i11;
        cArr[i10] = this.f6170o0;
        int t10 = j.t(j10, cArr, i11);
        char[] cArr2 = this.f6171p0;
        this.f6173r0 = t10 + 1;
        cArr2[t10] = this.f6170o0;
    }

    public void J2(String str, int i10, int i11) throws IOException {
        int i12 = this.f6174s0 - this.f6173r0;
        if (i12 < i11) {
            t3();
            i12 = this.f6174s0 - this.f6173r0;
        }
        if (i12 >= i11) {
            str.getChars(i10, i10 + i11, this.f6171p0, this.f6173r0);
            this.f6173r0 += i11;
            return;
        }
        X3(str.substring(i10, i11 + i10));
    }

    public final void J3(String str) throws IOException {
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = this.f6170o0;
        I2(str);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i11 = this.f6173r0;
        this.f6173r0 = i11 + 1;
        cArr2[i11] = this.f6170o0;
    }

    public void K2(u uVar) throws IOException {
        int d10 = uVar.d(this.f6171p0, this.f6173r0);
        if (d10 < 0) {
            I2(uVar.getValue());
        } else {
            this.f6173r0 += d10;
        }
    }

    public final void K3(char[] cArr, int i10, int i11) throws IOException {
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i12 = this.f6173r0;
        this.f6173r0 = i12 + 1;
        cArr2[i12] = this.f6170o0;
        L2(cArr, i10, i11);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr3 = this.f6171p0;
        int i13 = this.f6173r0;
        this.f6173r0 = i13 + 1;
        cArr3[i13] = this.f6170o0;
    }

    public void L2(char[] cArr, int i10, int i11) throws IOException {
        if (i11 < 32) {
            if (i11 > this.f6174s0 - this.f6173r0) {
                t3();
            }
            System.arraycopy(cArr, i10, this.f6171p0, this.f6173r0, i11);
            this.f6173r0 += i11;
            return;
        }
        t3();
        this.f6169n0.write(cArr, i10, i11);
    }

    public final void L3(short s10) throws IOException {
        if (this.f6173r0 + 8 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        int i11 = i10 + 1;
        this.f6173r0 = i11;
        cArr[i10] = this.f6170o0;
        int r10 = j.r(s10, cArr, i11);
        char[] cArr2 = this.f6171p0;
        this.f6173r0 = r10 + 1;
        cArr2[r10] = this.f6170o0;
    }

    public void M2(byte[] bArr, int i10, int i11) throws IOException {
        g();
    }

    public final void M3(int i10) throws IOException {
        char[] cArr;
        char c10;
        int[] iArr = this.f6106h0;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            do {
                cArr = this.f6171p0;
                c10 = cArr[i11];
                if ((c10 < length && iArr[c10] != 0) || (i11 = i11 + 1) >= i10) {
                    int i13 = i11 - i12;
                }
                cArr = this.f6171p0;
                c10 = cArr[i11];
                break;
            } while ((i11 = i11 + 1) >= i10);
            int i132 = i11 - i12;
            if (i132 > 0) {
                this.f6169n0.write(cArr, i12, i132);
                if (i11 >= i10) {
                    return;
                }
            }
            i11++;
            i12 = u3(this.f6171p0, i11, i10, c10, iArr[c10]);
        }
    }

    public final void N3(int i10, int i11) throws IOException, h {
        char[] cArr;
        char c10;
        int[] iArr = this.f6106h0;
        int min = Math.min(iArr.length, i11 + 1);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i10) {
            while (true) {
                cArr = this.f6171p0;
                c10 = cArr[i12];
                if (c10 >= min) {
                    if (c10 > i11) {
                        i14 = -1;
                        break;
                    }
                } else {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                }
                i12++;
                if (i12 >= i10) {
                    break;
                }
            }
            int i15 = i12 - i13;
            if (i15 > 0) {
                this.f6169n0.write(cArr, i13, i15);
                if (i12 >= i10) {
                    return;
                }
            }
            i12++;
            i13 = u3(this.f6171p0, i12, i10, c10, i14);
        }
    }

    public final void O3(int i10) throws IOException, h {
        char c10;
        int[] iArr = this.f6106h0;
        int i11 = this.f6107i0;
        if (i11 < 1) {
            i11 = 65535;
        }
        int min = Math.min(iArr.length, i11 + 1);
        b bVar = this.f6108j0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i10) {
            while (true) {
                c10 = this.f6171p0[i12];
                if (c10 >= min) {
                    if (c10 <= i11) {
                        u b10 = bVar.b(c10);
                        this.f6176u0 = b10;
                        if (b10 != null) {
                            i14 = -2;
                            break;
                        }
                    } else {
                        i14 = -1;
                        break;
                    }
                } else {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                }
                i12++;
                if (i12 >= i10) {
                    break;
                }
            }
            int i15 = i12 - i13;
            if (i15 > 0) {
                this.f6169n0.write(this.f6171p0, i13, i15);
                if (i12 >= i10) {
                    return;
                }
            }
            i12++;
            i13 = u3(this.f6171p0, i12, i10, c10, i14);
        }
    }

    public final void P3(String str) throws IOException {
        int length = str.length();
        int i10 = this.f6174s0;
        if (length > i10) {
            D3(str);
            return;
        }
        if (this.f6173r0 + length > i10) {
            t3();
        }
        str.getChars(0, length, this.f6171p0, this.f6173r0);
        if (this.f6108j0 != null) {
            V3(length);
            return;
        }
        int i11 = this.f6107i0;
        if (i11 != 0) {
            T3(length, i11);
        } else {
            R3(length);
        }
    }

    public final void Q3(char[] cArr, int i10, int i11) throws IOException {
        if (this.f6108j0 != null) {
            W3(cArr, i10, i11);
            return;
        }
        int i12 = this.f6107i0;
        if (i12 != 0) {
            U3(cArr, i10, i11, i12);
            return;
        }
        int i13 = i11 + i10;
        int[] iArr = this.f6106h0;
        int length = iArr.length;
        while (i10 < i13) {
            int i14 = i10;
            do {
                char c10 = cArr[i14];
                if ((c10 < length && iArr[c10] != 0) || (i14 = i14 + 1) >= i13) {
                    int i15 = i14 - i10;
                }
                char c102 = cArr[i14];
                break;
            } while ((i14 = i14 + 1) >= i13);
            int i152 = i14 - i10;
            if (i152 < 32) {
                if (this.f6173r0 + i152 > this.f6174s0) {
                    t3();
                }
                if (i152 > 0) {
                    System.arraycopy(cArr, i10, this.f6171p0, this.f6173r0, i152);
                    this.f6173r0 += i152;
                }
            } else {
                t3();
                this.f6169n0.write(cArr, i10, i152);
            }
            if (i14 < i13) {
                i10 = i14 + 1;
                char c11 = cArr[i14];
                s3(c11, iArr[c11]);
            } else {
                return;
            }
        }
    }

    public void R2() throws IOException {
        n3("start an array");
        this.S = this.S.t();
        t tVar = this.O;
        if (tVar != null) {
            tVar.a(this);
            return;
        }
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = '[';
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r6.f6171p0;
        r3 = r6.f6173r0;
        r6.f6173r0 = r3 + 1;
        r2 = r2[r3];
        v3(r2, r7[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r4 = r6.f6172q0;
        r3 = r3 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 <= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6.f6169n0.write(r2, r4, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R3(int r7) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r6.f6173r0
            int r0 = r0 + r7
            int[] r7 = r6.f6106h0
            int r1 = r7.length
        L_0x0006:
            int r2 = r6.f6173r0
            if (r2 >= r0) goto L_0x0036
        L_0x000a:
            char[] r2 = r6.f6171p0
            int r3 = r6.f6173r0
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x0030
            r4 = r7[r4]
            if (r4 == 0) goto L_0x0030
            int r4 = r6.f6172q0
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x0020
            java.io.Writer r5 = r6.f6169n0
            r5.write(r2, r4, r3)
        L_0x0020:
            char[] r2 = r6.f6171p0
            int r3 = r6.f6173r0
            int r4 = r3 + 1
            r6.f6173r0 = r4
            char r2 = r2[r3]
            r3 = r7[r2]
            r6.v3(r2, r3)
            goto L_0x0006
        L_0x0030:
            int r3 = r3 + 1
            r6.f6173r0 = r3
            if (r3 < r0) goto L_0x000a
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.m.R3(int):void");
    }

    public void S2(int i10) throws IOException {
        n3("start an array");
        this.S = this.S.t();
        t tVar = this.O;
        if (tVar != null) {
            tVar.a(this);
            return;
        }
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i11 = this.f6173r0;
        this.f6173r0 = i11 + 1;
        cArr[i11] = '[';
    }

    public final void S3(u uVar) throws IOException {
        char[] a10 = uVar.a();
        int length = a10.length;
        if (length < 32) {
            if (length > this.f6174s0 - this.f6173r0) {
                t3();
            }
            System.arraycopy(a10, 0, this.f6171p0, this.f6173r0, length);
            this.f6173r0 += length;
        } else {
            t3();
            this.f6169n0.write(a10, 0, length);
        }
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = this.f6170o0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T3(int r9, int r10) throws java.io.IOException, w4.h {
        /*
            r8 = this;
            int r0 = r8.f6173r0
            int r0 = r0 + r9
            int[] r9 = r8.f6106h0
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        L_0x000c:
            int r2 = r8.f6173r0
            if (r2 >= r0) goto L_0x003a
        L_0x0010:
            char[] r2 = r8.f6171p0
            int r3 = r8.f6173r0
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x001d
            r5 = r9[r4]
            if (r5 == 0) goto L_0x0034
            goto L_0x0020
        L_0x001d:
            if (r4 <= r10) goto L_0x0034
            r5 = -1
        L_0x0020:
            int r6 = r8.f6172q0
            int r3 = r3 - r6
            if (r3 <= 0) goto L_0x002a
            java.io.Writer r7 = r8.f6169n0
            r7.write(r2, r6, r3)
        L_0x002a:
            int r2 = r8.f6173r0
            int r2 = r2 + 1
            r8.f6173r0 = r2
            r8.v3(r4, r5)
            goto L_0x000c
        L_0x0034:
            int r3 = r3 + 1
            r8.f6173r0 = r3
            if (r3 < r0) goto L_0x0010
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.m.T3(int, int):void");
    }

    public final void U3(char[] cArr, int i10, int i11, int i12) throws IOException, h {
        char c10;
        int i13 = i11 + i10;
        int[] iArr = this.f6106h0;
        int min = Math.min(iArr.length, i12 + 1);
        int i14 = 0;
        while (i10 < i13) {
            int i15 = i10;
            while (true) {
                c10 = cArr[i15];
                if (c10 >= min) {
                    if (c10 > i12) {
                        i14 = -1;
                        break;
                    }
                } else {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                }
                i15++;
                if (i15 >= i13) {
                    break;
                }
            }
            int i16 = i15 - i10;
            if (i16 < 32) {
                if (this.f6173r0 + i16 > this.f6174s0) {
                    t3();
                }
                if (i16 > 0) {
                    System.arraycopy(cArr, i10, this.f6171p0, this.f6173r0, i16);
                    this.f6173r0 += i16;
                }
            } else {
                t3();
                this.f6169n0.write(cArr, i10, i16);
            }
            if (i15 < i13) {
                i10 = i15 + 1;
                s3(c10, i14);
            } else {
                return;
            }
        }
    }

    public void V2() throws IOException {
        n3("start an object");
        this.S = this.S.v();
        t tVar = this.O;
        if (tVar != null) {
            tVar.b(this);
            return;
        }
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = '{';
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V3(int r12) throws java.io.IOException, w4.h {
        /*
            r11 = this;
            int r0 = r11.f6173r0
            int r0 = r0 + r12
            int[] r12 = r11.f6106h0
            int r1 = r11.f6107i0
            r2 = 1
            if (r1 >= r2) goto L_0x000d
            r1 = 65535(0xffff, float:9.1834E-41)
        L_0x000d:
            int r3 = r12.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
            c5.b r4 = r11.f6108j0
        L_0x0016:
            int r5 = r11.f6173r0
            if (r5 >= r0) goto L_0x0052
        L_0x001a:
            char[] r5 = r11.f6171p0
            int r6 = r11.f6173r0
            char r5 = r5[r6]
            if (r5 >= r3) goto L_0x0027
            r6 = r12[r5]
            if (r6 == 0) goto L_0x004b
            goto L_0x0034
        L_0x0027:
            if (r5 <= r1) goto L_0x002b
            r6 = -1
            goto L_0x0034
        L_0x002b:
            w4.u r6 = r4.b(r5)
            r11.f6176u0 = r6
            if (r6 == 0) goto L_0x004b
            r6 = -2
        L_0x0034:
            int r7 = r11.f6173r0
            int r8 = r11.f6172q0
            int r7 = r7 - r8
            if (r7 <= 0) goto L_0x0042
            java.io.Writer r9 = r11.f6169n0
            char[] r10 = r11.f6171p0
            r9.write(r10, r8, r7)
        L_0x0042:
            int r7 = r11.f6173r0
            int r7 = r7 + r2
            r11.f6173r0 = r7
            r11.v3(r5, r6)
            goto L_0x0016
        L_0x004b:
            int r5 = r11.f6173r0
            int r5 = r5 + r2
            r11.f6173r0 = r5
            if (r5 < r0) goto L_0x001a
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.m.V3(int):void");
    }

    public Object W0() {
        return this.f6169n0;
    }

    public void W2(Object obj) throws IOException {
        n3("start an object");
        this.S = this.S.w(obj);
        t tVar = this.O;
        if (tVar != null) {
            tVar.b(this);
            return;
        }
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = '{';
    }

    public final void W3(char[] cArr, int i10, int i11) throws IOException, h {
        char c10;
        int i12 = i11 + i10;
        int[] iArr = this.f6106h0;
        int i13 = this.f6107i0;
        if (i13 < 1) {
            i13 = 65535;
        }
        int min = Math.min(iArr.length, i13 + 1);
        b bVar = this.f6108j0;
        int i14 = 0;
        while (i10 < i12) {
            int i15 = i10;
            while (true) {
                c10 = cArr[i15];
                if (c10 >= min) {
                    if (c10 <= i13) {
                        u b10 = bVar.b(c10);
                        this.f6176u0 = b10;
                        if (b10 != null) {
                            i14 = -2;
                            break;
                        }
                    } else {
                        i14 = -1;
                        break;
                    }
                } else {
                    i14 = iArr[c10];
                    if (i14 != 0) {
                        break;
                    }
                }
                i15++;
                if (i15 >= i12) {
                    break;
                }
            }
            int i16 = i15 - i10;
            if (i16 < 32) {
                if (this.f6173r0 + i16 > this.f6174s0) {
                    t3();
                }
                if (i16 > 0) {
                    System.arraycopy(cArr, i10, this.f6171p0, this.f6173r0, i16);
                    this.f6173r0 += i16;
                }
            } else {
                t3();
                this.f6169n0.write(cArr, i10, i16);
            }
            if (i15 < i12) {
                i10 = i15 + 1;
                s3(c10, i14);
            } else {
                return;
            }
        }
    }

    public int X1(w4.a aVar, InputStream inputStream, int i10) throws IOException, h {
        n3(y4.a.Z);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i11 = this.f6173r0;
        this.f6173r0 = i11 + 1;
        cArr[i11] = this.f6170o0;
        byte[] d10 = this.f6105g0.d();
        if (i10 < 0) {
            try {
                i10 = x3(aVar, inputStream, d10);
            } catch (Throwable th2) {
                this.f6105g0.r(d10);
                throw th2;
            }
        } else {
            int y32 = y3(aVar, inputStream, d10, i10);
            if (y32 > 0) {
                f("Too few bytes available: missing " + y32 + " bytes (out of " + i10 + ")");
            }
        }
        this.f6105g0.r(d10);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i12 = this.f6173r0;
        this.f6173r0 = i12 + 1;
        cArr2[i12] = this.f6170o0;
        return i10;
    }

    public final void X3(String str) throws IOException {
        int i10 = this.f6174s0;
        int i11 = this.f6173r0;
        int i12 = i10 - i11;
        str.getChars(0, i12, this.f6171p0, i11);
        this.f6173r0 += i12;
        t3();
        int length = str.length() - i12;
        while (true) {
            int i13 = this.f6174s0;
            if (length > i13) {
                int i14 = i12 + i13;
                str.getChars(i12, i14, this.f6171p0, 0);
                this.f6172q0 = 0;
                this.f6173r0 = i13;
                t3();
                length -= i13;
                i12 = i14;
            } else {
                str.getChars(i12, i12 + length, this.f6171p0, 0);
                this.f6172q0 = 0;
                this.f6173r0 = length;
                return;
            }
        }
    }

    public void Y1(w4.a aVar, byte[] bArr, int i10, int i11) throws IOException, h {
        n3(y4.a.Z);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i12 = this.f6173r0;
        this.f6173r0 = i12 + 1;
        cArr[i12] = this.f6170o0;
        z3(aVar, bArr, i10, i11 + i10);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i13 = this.f6173r0;
        this.f6173r0 = i13 + 1;
        cArr2[i13] = this.f6170o0;
    }

    public void Y2(Reader reader, int i10) throws IOException {
        n3(y4.a.f15470e0);
        if (reader == null) {
            f("null reader");
        }
        int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
        if (this.f6173r0 + i10 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i12 = this.f6173r0;
        this.f6173r0 = i12 + 1;
        cArr[i12] = this.f6170o0;
        char[] q32 = q3();
        while (i11 > 0) {
            int read = reader.read(q32, 0, Math.min(i11, q32.length));
            if (read <= 0) {
                break;
            }
            if (this.f6173r0 + i10 >= this.f6174s0) {
                t3();
            }
            Q3(q32, 0, read);
            i11 -= read;
        }
        if (this.f6173r0 + i10 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i13 = this.f6173r0;
        this.f6173r0 = i13 + 1;
        cArr2[i13] = this.f6170o0;
        if (i11 > 0 && i10 >= 0) {
            f("Didn't read enough from reader");
        }
    }

    public void Z2(String str) throws IOException {
        n3(y4.a.f15470e0);
        if (str == null) {
            E3();
            return;
        }
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = this.f6170o0;
        P3(str);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i11 = this.f6173r0;
        this.f6173r0 = i11 + 1;
        cArr2[i11] = this.f6170o0;
    }

    public void a3(u uVar) throws IOException {
        n3(y4.a.f15470e0);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        int i11 = i10 + 1;
        this.f6173r0 = i11;
        cArr[i10] = this.f6170o0;
        int h10 = uVar.h(cArr, i11);
        if (h10 < 0) {
            S3(uVar);
            return;
        }
        int i12 = this.f6173r0 + h10;
        this.f6173r0 = i12;
        if (i12 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i13 = this.f6173r0;
        this.f6173r0 = i13 + 1;
        cArr2[i13] = this.f6170o0;
    }

    public void b3(char[] cArr, int i10, int i11) throws IOException {
        n3(y4.a.f15470e0);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr2 = this.f6171p0;
        int i12 = this.f6173r0;
        this.f6173r0 = i12 + 1;
        cArr2[i12] = this.f6170o0;
        Q3(cArr, i10, i11);
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr3 = this.f6171p0;
        int i13 = this.f6173r0;
        this.f6173r0 = i13 + 1;
        cArr3[i13] = this.f6170o0;
    }

    public void c2(boolean z10) throws IOException {
        int i10;
        n3(y4.a.f15466a0);
        if (this.f6173r0 + 5 >= this.f6174s0) {
            t3();
        }
        int i11 = this.f6173r0;
        char[] cArr = this.f6171p0;
        if (z10) {
            cArr[i11] = 't';
            int i12 = i11 + 1;
            cArr[i12] = 'r';
            int i13 = i12 + 1;
            cArr[i13] = 'u';
            i10 = i13 + 1;
            cArr[i10] = 'e';
        } else {
            cArr[i11] = 'f';
            int i14 = i11 + 1;
            cArr[i14] = 'a';
            int i15 = i14 + 1;
            cArr[i15] = 'l';
            int i16 = i15 + 1;
            cArr[i16] = 's';
            i10 = i16 + 1;
            cArr[i10] = 'e';
        }
        this.f6173r0 = i10 + 1;
    }

    public void close() throws IOException {
        super.close();
        if (this.f6171p0 != null && f1(i.b.AUTO_CLOSE_JSON_CONTENT)) {
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
        t3();
        this.f6172q0 = 0;
        this.f6173r0 = 0;
        if (this.f6169n0 != null) {
            if (this.f6105g0.q() || f1(i.b.AUTO_CLOSE_TARGET)) {
                this.f6169n0.close();
            } else if (f1(i.b.FLUSH_PASSED_TO_STREAM)) {
                this.f6169n0.flush();
            }
        }
        m3();
    }

    public void f2() throws IOException {
        if (!this.S.k()) {
            f("Current context not Array but " + this.S.q());
        }
        t tVar = this.O;
        if (tVar != null) {
            tVar.f(this, this.S.d());
        } else {
            if (this.f6173r0 >= this.f6174s0) {
                t3();
            }
            char[] cArr = this.f6171p0;
            int i10 = this.f6173r0;
            this.f6173r0 = i10 + 1;
            cArr[i10] = ']';
        }
        this.S = this.S.s();
    }

    public void flush() throws IOException {
        t3();
        if (this.f6169n0 != null && f1(i.b.FLUSH_PASSED_TO_STREAM)) {
            this.f6169n0.flush();
        }
    }

    public void g2() throws IOException {
        if (!this.S.l()) {
            f("Current context not Object but " + this.S.q());
        }
        t tVar = this.O;
        if (tVar != null) {
            tVar.k(this, this.S.d());
        } else {
            if (this.f6173r0 >= this.f6174s0) {
                t3();
            }
            char[] cArr = this.f6171p0;
            int i10 = this.f6173r0;
            this.f6173r0 = i10 + 1;
            cArr[i10] = '}';
        }
        this.S = this.S.s();
    }

    public void h3(byte[] bArr, int i10, int i11) throws IOException {
        g();
    }

    public void i2(String str) throws IOException {
        int E = this.S.E(str);
        if (E == 4) {
            f("Can not write a field name, expecting a value");
        }
        boolean z10 = true;
        if (E != 1) {
            z10 = false;
        }
        A3(str, z10);
    }

    public void j2(u uVar) throws IOException {
        int E = this.S.E(uVar.getValue());
        if (E == 4) {
            f("Can not write a field name, expecting a value");
        }
        boolean z10 = true;
        if (E != 1) {
            z10 = false;
        }
        B3(uVar, z10);
    }

    public void k2() throws IOException {
        n3(y4.a.f15467b0);
        E3();
    }

    public void m2(double d10) throws IOException {
        if (this.R || (j.o(d10) && f1(i.b.QUOTE_NON_NUMERIC_NUMBERS))) {
            Z2(String.valueOf(d10));
            return;
        }
        n3(y4.a.f15468c0);
        I2(String.valueOf(d10));
    }

    public void m3() {
        char[] cArr = this.f6171p0;
        if (cArr != null) {
            this.f6171p0 = null;
            this.f6105g0.s(cArr);
        }
        char[] cArr2 = this.f6177v0;
        if (cArr2 != null) {
            this.f6177v0 = null;
            this.f6105g0.t(cArr2);
        }
    }

    public void n2(float f10) throws IOException {
        if (this.R || (j.p(f10) && f1(i.b.QUOTE_NON_NUMERIC_NUMBERS))) {
            Z2(String.valueOf(f10));
            return;
        }
        n3(y4.a.f15468c0);
        I2(String.valueOf(f10));
    }

    public final void n3(String str) throws IOException {
        char c10;
        int F = this.S.F();
        if (this.O != null) {
            p3(str, F);
            return;
        }
        if (F == 1) {
            c10 = ',';
        } else if (F == 2) {
            c10 = ':';
        } else if (F == 3) {
            u uVar = this.f6109k0;
            if (uVar != null) {
                I2(uVar.getValue());
                return;
            }
            return;
        } else if (F == 5) {
            o3(str);
            return;
        } else {
            return;
        }
        if (this.f6173r0 >= this.f6174s0) {
            t3();
        }
        char[] cArr = this.f6171p0;
        int i10 = this.f6173r0;
        this.f6173r0 = i10 + 1;
        cArr[i10] = c10;
    }

    public void o2(int i10) throws IOException {
        n3(y4.a.f15468c0);
        if (this.R) {
            H3(i10);
            return;
        }
        if (this.f6173r0 + 11 >= this.f6174s0) {
            t3();
        }
        this.f6173r0 = j.r(i10, this.f6171p0, this.f6173r0);
    }

    public void p2(long j10) throws IOException {
        n3(y4.a.f15468c0);
        if (this.R) {
            I3(j10);
            return;
        }
        if (this.f6173r0 + 21 >= this.f6174s0) {
            t3();
        }
        this.f6173r0 = j.t(j10, this.f6171p0, this.f6173r0);
    }

    public boolean q() {
        return true;
    }

    public void q2(String str) throws IOException {
        n3(y4.a.f15468c0);
        if (this.R) {
            J3(str);
        } else {
            I2(str);
        }
    }

    public final char[] q3() {
        if (this.f6177v0 == null) {
            this.f6177v0 = this.f6105g0.g(2000);
        }
        return this.f6177v0;
    }

    public void r2(BigDecimal bigDecimal) throws IOException {
        n3(y4.a.f15468c0);
        if (bigDecimal == null) {
            E3();
            return;
        }
        boolean z10 = this.R;
        String i32 = i3(bigDecimal);
        if (z10) {
            J3(i32);
        } else {
            I2(i32);
        }
    }

    public final char[] r3() {
        char[] cArr = new char[14];
        cArr[0] = kh.j.f20323c;
        cArr[2] = kh.j.f20323c;
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = kh.j.f20323c;
        cArr[9] = 'u';
        this.f6175t0 = cArr;
        return cArr;
    }

    public void s2(BigInteger bigInteger) throws IOException {
        n3(y4.a.f15468c0);
        if (bigInteger == null) {
            E3();
            return;
        }
        boolean z10 = this.R;
        String bigInteger2 = bigInteger.toString();
        if (z10) {
            J3(bigInteger2);
        } else {
            I2(bigInteger2);
        }
    }

    public final void s3(char c10, int i10) throws IOException, h {
        String str;
        int i11;
        if (i10 >= 0) {
            if (this.f6173r0 + 2 > this.f6174s0) {
                t3();
            }
            char[] cArr = this.f6171p0;
            int i12 = this.f6173r0;
            int i13 = i12 + 1;
            cArr[i12] = kh.j.f20323c;
            this.f6173r0 = i13 + 1;
            cArr[i13] = (char) i10;
        } else if (i10 != -2) {
            if (this.f6173r0 + 5 >= this.f6174s0) {
                t3();
            }
            int i14 = this.f6173r0;
            char[] cArr2 = this.f6171p0;
            int i15 = i14 + 1;
            cArr2[i14] = kh.j.f20323c;
            int i16 = i15 + 1;
            cArr2[i15] = 'u';
            if (c10 > 255) {
                int i17 = 255 & (c10 >> 8);
                int i18 = i16 + 1;
                char[] cArr3 = f6168x0;
                cArr2[i16] = cArr3[i17 >> 4];
                i11 = i18 + 1;
                cArr2[i18] = cArr3[i17 & 15];
                c10 = (char) (c10 & 255);
            } else {
                int i19 = i16 + 1;
                cArr2[i16] = '0';
                i11 = i19 + 1;
                cArr2[i19] = '0';
            }
            int i20 = i11 + 1;
            char[] cArr4 = f6168x0;
            cArr2[i11] = cArr4[c10 >> 4];
            cArr2[i20] = cArr4[c10 & 15];
            this.f6173r0 = i20 + 1;
        } else {
            u uVar = this.f6176u0;
            if (uVar == null) {
                str = this.f6108j0.b(c10).getValue();
            } else {
                str = uVar.getValue();
                this.f6176u0 = null;
            }
            int length = str.length();
            if (this.f6173r0 + length > this.f6174s0) {
                t3();
                if (length > this.f6174s0) {
                    this.f6169n0.write(str);
                    return;
                }
            }
            str.getChars(0, length, this.f6171p0, this.f6173r0);
            this.f6173r0 += length;
        }
    }

    public void t2(short s10) throws IOException {
        n3(y4.a.f15468c0);
        if (this.R) {
            L3(s10);
            return;
        }
        if (this.f6173r0 + 6 >= this.f6174s0) {
            t3();
        }
        this.f6173r0 = j.r(s10, this.f6171p0, this.f6173r0);
    }

    public void t3() throws IOException {
        int i10 = this.f6173r0;
        int i11 = this.f6172q0;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f6172q0 = 0;
            this.f6173r0 = 0;
            this.f6169n0.write(this.f6171p0, i11, i12);
        }
    }

    public void u2(char[] cArr, int i10, int i11) throws IOException {
        n3(y4.a.f15468c0);
        if (this.R) {
            K3(cArr, i10, i11);
        } else {
            L2(cArr, i10, i11);
        }
    }

    public final int u3(char[] cArr, int i10, int i11, char c10, int i12) throws IOException, h {
        String str;
        int i13;
        if (i12 >= 0) {
            if (i10 <= 1 || i10 >= i11) {
                char[] cArr2 = this.f6175t0;
                if (cArr2 == null) {
                    cArr2 = r3();
                }
                cArr2[1] = (char) i12;
                this.f6169n0.write(cArr2, 0, 2);
                return i10;
            }
            int i14 = i10 - 2;
            cArr[i14] = kh.j.f20323c;
            cArr[i14 + 1] = (char) i12;
            return i14;
        } else if (i12 == -2) {
            u uVar = this.f6176u0;
            if (uVar == null) {
                str = this.f6108j0.b(c10).getValue();
            } else {
                str = uVar.getValue();
                this.f6176u0 = null;
            }
            int length = str.length();
            if (i10 < length || i10 >= i11) {
                this.f6169n0.write(str);
                return i10;
            }
            int i15 = i10 - length;
            str.getChars(0, length, cArr, i15);
            return i15;
        } else if (i10 <= 5 || i10 >= i11) {
            char[] cArr3 = this.f6175t0;
            if (cArr3 == null) {
                cArr3 = r3();
            }
            this.f6172q0 = this.f6173r0;
            if (c10 > 255) {
                int i16 = (c10 >> 8) & 255;
                char c11 = c10 & 255;
                char[] cArr4 = f6168x0;
                cArr3[10] = cArr4[i16 >> 4];
                cArr3[11] = cArr4[i16 & 15];
                cArr3[12] = cArr4[c11 >> 4];
                cArr3[13] = cArr4[c11 & 15];
                this.f6169n0.write(cArr3, 8, 6);
                return i10;
            }
            char[] cArr5 = f6168x0;
            cArr3[6] = cArr5[c10 >> 4];
            cArr3[7] = cArr5[c10 & 15];
            this.f6169n0.write(cArr3, 2, 6);
            return i10;
        } else {
            int i17 = i10 - 6;
            int i18 = i17 + 1;
            cArr[i17] = kh.j.f20323c;
            int i19 = i18 + 1;
            cArr[i18] = 'u';
            if (c10 > 255) {
                int i20 = (c10 >> 8) & 255;
                int i21 = i19 + 1;
                char[] cArr6 = f6168x0;
                cArr[i19] = cArr6[i20 >> 4];
                i13 = i21 + 1;
                cArr[i21] = cArr6[i20 & 15];
                c10 = (char) (c10 & 255);
            } else {
                int i22 = i19 + 1;
                cArr[i19] = '0';
                i13 = i22 + 1;
                cArr[i22] = '0';
            }
            int i23 = i13 + 1;
            char[] cArr7 = f6168x0;
            cArr[i13] = cArr7[c10 >> 4];
            cArr[i23] = cArr7[c10 & 15];
            return i23 - 5;
        }
    }

    public final void v3(char c10, int i10) throws IOException, h {
        String str;
        int i11;
        if (i10 >= 0) {
            int i12 = this.f6173r0;
            if (i12 >= 2) {
                int i13 = i12 - 2;
                this.f6172q0 = i13;
                char[] cArr = this.f6171p0;
                cArr[i13] = kh.j.f20323c;
                cArr[i13 + 1] = (char) i10;
                return;
            }
            char[] cArr2 = this.f6175t0;
            if (cArr2 == null) {
                cArr2 = r3();
            }
            this.f6172q0 = this.f6173r0;
            cArr2[1] = (char) i10;
            this.f6169n0.write(cArr2, 0, 2);
        } else if (i10 != -2) {
            int i14 = this.f6173r0;
            if (i14 >= 6) {
                char[] cArr3 = this.f6171p0;
                int i15 = i14 - 6;
                this.f6172q0 = i15;
                cArr3[i15] = kh.j.f20323c;
                int i16 = i15 + 1;
                cArr3[i16] = 'u';
                if (c10 > 255) {
                    int i17 = (c10 >> 8) & 255;
                    int i18 = i16 + 1;
                    char[] cArr4 = f6168x0;
                    cArr3[i18] = cArr4[i17 >> 4];
                    i11 = i18 + 1;
                    cArr3[i11] = cArr4[i17 & 15];
                    c10 = (char) (c10 & 255);
                } else {
                    int i19 = i16 + 1;
                    cArr3[i19] = '0';
                    i11 = i19 + 1;
                    cArr3[i11] = '0';
                }
                int i20 = i11 + 1;
                char[] cArr5 = f6168x0;
                cArr3[i20] = cArr5[c10 >> 4];
                cArr3[i20 + 1] = cArr5[c10 & 15];
                return;
            }
            char[] cArr6 = this.f6175t0;
            if (cArr6 == null) {
                cArr6 = r3();
            }
            this.f6172q0 = this.f6173r0;
            if (c10 > 255) {
                int i21 = (c10 >> 8) & 255;
                char c11 = c10 & 255;
                char[] cArr7 = f6168x0;
                cArr6[10] = cArr7[i21 >> 4];
                cArr6[11] = cArr7[i21 & 15];
                cArr6[12] = cArr7[c11 >> 4];
                cArr6[13] = cArr7[c11 & 15];
                this.f6169n0.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = f6168x0;
            cArr6[6] = cArr8[c10 >> 4];
            cArr6[7] = cArr8[c10 & 15];
            this.f6169n0.write(cArr6, 2, 6);
        } else {
            u uVar = this.f6176u0;
            if (uVar == null) {
                str = this.f6108j0.b(c10).getValue();
            } else {
                str = uVar.getValue();
                this.f6176u0 = null;
            }
            int length = str.length();
            int i22 = this.f6173r0;
            if (i22 >= length) {
                int i23 = i22 - length;
                this.f6172q0 = i23;
                str.getChars(0, length, this.f6171p0, i23);
                return;
            }
            this.f6172q0 = i22;
            this.f6169n0.write(str);
        }
    }

    public final int w3(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) throws IOException {
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

    public final int x3(w4.a aVar, InputStream inputStream, byte[] bArr) throws IOException, h {
        int i10 = this.f6174s0 - 6;
        int i11 = 2;
        int s10 = aVar.s() >> 2;
        int i12 = -3;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 > i12) {
                i14 = w3(inputStream, bArr, i13, i14, bArr.length);
                if (i14 < 3) {
                    break;
                }
                i12 = i14 - 3;
                i13 = 0;
            }
            if (this.f6173r0 > i10) {
                t3();
            }
            int i16 = i13 + 1;
            int i17 = i16 + 1;
            i13 = i17 + 1;
            i15 += 3;
            int n10 = aVar.n((((bArr[i16] & 255) | (bArr[i13] << 8)) << 8) | (bArr[i17] & 255), this.f6171p0, this.f6173r0);
            this.f6173r0 = n10;
            s10--;
            if (s10 <= 0) {
                char[] cArr = this.f6171p0;
                int i18 = n10 + 1;
                cArr[n10] = kh.j.f20323c;
                this.f6173r0 = i18 + 1;
                cArr[i18] = 'n';
                s10 = aVar.s() >> 2;
            }
        }
        if (i14 <= 0) {
            return i15;
        }
        if (this.f6173r0 > i10) {
            t3();
        }
        int i19 = bArr[0] << 16;
        if (1 < i14) {
            i19 |= (bArr[1] & 255) << 8;
        } else {
            i11 = 1;
        }
        int i20 = i15 + i11;
        this.f6173r0 = aVar.q(i19, i11, this.f6171p0, this.f6173r0);
        return i20;
    }

    public final int y3(w4.a aVar, InputStream inputStream, byte[] bArr, int i10) throws IOException, h {
        int w32;
        int i11 = this.f6174s0 - 6;
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
                i15 = w3(inputStream, bArr, i14, i15, i10);
                if (i15 < 3) {
                    i14 = 0;
                    break;
                }
                i13 = i15 - 3;
                i14 = 0;
            }
            if (this.f6173r0 > i11) {
                t3();
            }
            int i16 = i14 + 1;
            int i17 = i16 + 1;
            i14 = i17 + 1;
            i10 -= 3;
            int n10 = aVar.n((((bArr[i16] & 255) | (bArr[i14] << 8)) << 8) | (bArr[i17] & 255), this.f6171p0, this.f6173r0);
            this.f6173r0 = n10;
            s10--;
            if (s10 <= 0) {
                char[] cArr = this.f6171p0;
                int i18 = n10 + 1;
                cArr[n10] = kh.j.f20323c;
                this.f6173r0 = i18 + 1;
                cArr[i18] = 'n';
                s10 = aVar.s() >> 2;
            }
        }
        if (i10 <= 0 || (w32 = w3(inputStream, bArr, i14, i15, i10)) <= 0) {
            return i10;
        }
        if (this.f6173r0 > i11) {
            t3();
        }
        int i19 = bArr[0] << 16;
        if (1 < w32) {
            i19 |= (bArr[1] & 255) << 8;
        } else {
            i12 = 1;
        }
        this.f6173r0 = aVar.q(i19, i12, this.f6171p0, this.f6173r0);
        return i10 - i12;
    }

    public final void z3(w4.a aVar, byte[] bArr, int i10, int i11) throws IOException, h {
        int i12 = i11 - 3;
        int i13 = this.f6174s0 - 6;
        int s10 = aVar.s() >> 2;
        while (i10 <= i12) {
            if (this.f6173r0 > i13) {
                t3();
            }
            int i14 = i10 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int n10 = aVar.n((((bArr[i10] << 8) | (bArr[i14] & 255)) << 8) | (bArr[i15] & 255), this.f6171p0, this.f6173r0);
            this.f6173r0 = n10;
            s10--;
            if (s10 <= 0) {
                char[] cArr = this.f6171p0;
                int i17 = n10 + 1;
                cArr[n10] = kh.j.f20323c;
                this.f6173r0 = i17 + 1;
                cArr[i17] = 'n';
                s10 = aVar.s() >> 2;
            }
            i10 = i16;
        }
        int i18 = i11 - i10;
        if (i18 > 0) {
            if (this.f6173r0 > i13) {
                t3();
            }
            int i19 = i10 + 1;
            int i20 = bArr[i10] << 16;
            if (i18 == 2) {
                i20 |= (bArr[i19] & 255) << 8;
            }
            this.f6173r0 = aVar.q(i20, i18, this.f6171p0, this.f6173r0);
        }
    }
}
