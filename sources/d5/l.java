package d5;

import c5.a;
import c5.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import w4.j;
import w4.k;
import w4.l;
import w4.p;
import w4.s;
import w4.u;
import y4.b;
import y4.c;

public class l extends b {
    public static final byte E1 = 10;
    public static final int F1 = l.a.ALLOW_TRAILING_COMMA.e();
    public static final int G1 = l.a.ALLOW_NUMERIC_LEADING_ZEROS.e();
    public static final int H1 = l.a.ALLOW_NON_NUMERIC_NUMBERS.e();
    public static final int I1 = l.a.ALLOW_MISSING_VALUES.e();
    public static final int J1 = l.a.ALLOW_SINGLE_QUOTES.e();
    public static final int K1 = l.a.ALLOW_UNQUOTED_FIELD_NAMES.e();
    public static final int L1 = l.a.ALLOW_COMMENTS.e();
    public static final int M1 = l.a.ALLOW_YAML_COMMENTS.e();
    public static final int[] N1 = a.k();
    public static final int[] O1 = a.i();
    public int A1;
    public InputStream B1;
    public byte[] C1;
    public boolean D1;

    /* renamed from: t1  reason: collision with root package name */
    public s f6160t1;

    /* renamed from: u1  reason: collision with root package name */
    public final f5.a f6161u1;

    /* renamed from: v1  reason: collision with root package name */
    public int[] f6162v1;

    /* renamed from: w1  reason: collision with root package name */
    public boolean f6163w1;

    /* renamed from: x1  reason: collision with root package name */
    public int f6164x1;

    /* renamed from: y1  reason: collision with root package name */
    public int f6165y1;

    /* renamed from: z1  reason: collision with root package name */
    public int f6166z1;

    public l(d dVar, int i10, InputStream inputStream, s sVar, f5.a aVar, byte[] bArr, int i11, int i12, int i13, boolean z10) {
        super(dVar, i10);
        this.f6162v1 = new int[16];
        this.B1 = inputStream;
        this.f6160t1 = sVar;
        this.f6161u1 = aVar;
        this.C1 = bArr;
        this.U0 = i11;
        this.V0 = i12;
        this.Y0 = i11 - i13;
        this.W0 = (long) ((-i11) + i13);
        this.D1 = z10;
    }

    @Deprecated
    public l(d dVar, int i10, InputStream inputStream, s sVar, f5.a aVar, byte[] bArr, int i11, int i12, boolean z10) {
        this(dVar, i10, inputStream, sVar, aVar, bArr, i11, i12, 0, z10);
    }

    public static final int U4(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | (-1 << (i11 << 3));
    }

    public int A2(int i10) throws IOException {
        d u10;
        if (this.U != p.FIELD_NAME) {
            return D2() == p.VALUE_NUMBER_INT ? N1() : i10;
        }
        this.f15478g1 = false;
        p pVar = this.f15475d1;
        this.f15475d1 = null;
        this.U = pVar;
        if (pVar == p.VALUE_NUMBER_INT) {
            return N1();
        }
        if (pVar == p.START_ARRAY) {
            u10 = this.f15474c1.t(this.f15472a1, this.f15473b1);
        } else {
            if (pVar == p.START_OBJECT) {
                u10 = this.f15474c1.u(this.f15472a1, this.f15473b1);
            }
            return i10;
        }
        this.f15474c1 = u10;
        return i10;
    }

    public final int A4(int i10) throws IOException {
        int i11 = i10 & 15;
        byte[] bArr = this.C1;
        int i12 = this.U0;
        int i13 = i12 + 1;
        this.U0 = i13;
        byte b10 = bArr[i12];
        if ((b10 & w1.a.K6) != 128) {
            g5(b10 & 255, i13);
        }
        byte b11 = (i11 << 6) | (b10 & 63);
        byte[] bArr2 = this.C1;
        int i14 = this.U0;
        int i15 = i14 + 1;
        this.U0 = i15;
        byte b12 = bArr2[i14];
        if ((b12 & w1.a.K6) != 128) {
            g5(b12 & 255, i15);
        }
        return (b11 << 6) | (b12 & 63);
    }

    public final void A5() {
        this.f15472a1 = this.X0;
        int i10 = this.U0;
        this.Z0 = this.W0 + ((long) i10);
        this.f15473b1 = i10 - this.Y0;
    }

    public long B2(long j10) throws IOException {
        d u10;
        if (this.U != p.FIELD_NAME) {
            return D2() == p.VALUE_NUMBER_INT ? P1() : j10;
        }
        this.f15478g1 = false;
        p pVar = this.f15475d1;
        this.f15475d1 = null;
        this.U = pVar;
        if (pVar == p.VALUE_NUMBER_INT) {
            return P1();
        }
        if (pVar == p.START_ARRAY) {
            u10 = this.f15474c1.t(this.f15472a1, this.f15473b1);
        } else {
            if (pVar == p.START_OBJECT) {
                u10 = this.f15474c1.u(this.f15472a1, this.f15473b1);
            }
            return j10;
        }
        this.f15474c1 = u10;
        return j10;
    }

    public final int B4(int i10) throws IOException {
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr = this.C1;
        int i11 = this.U0;
        int i12 = i11 + 1;
        this.U0 = i12;
        byte b10 = bArr[i11];
        if ((b10 & w1.a.K6) != 128) {
            g5(b10 & 255, i12);
        }
        byte b11 = ((i10 & 7) << 6) | (b10 & 63);
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr2 = this.C1;
        int i13 = this.U0;
        int i14 = i13 + 1;
        this.U0 = i14;
        byte b12 = bArr2[i13];
        if ((b12 & w1.a.K6) != 128) {
            g5(b12 & 255, i14);
        }
        byte b13 = (b11 << 6) | (b12 & 63);
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr3 = this.C1;
        int i15 = this.U0;
        int i16 = i15 + 1;
        this.U0 = i16;
        byte b14 = bArr3[i15];
        if ((b14 & w1.a.K6) != 128) {
            g5(b14 & 255, i16);
        }
        return ((b13 << 6) | (b14 & 63)) - 65536;
    }

    public final void B5() {
        this.f6166z1 = this.X0;
        int i10 = this.U0;
        this.f6165y1 = i10;
        this.A1 = i10 - this.Y0;
    }

    public String C2() throws IOException {
        d u10;
        if (this.U == p.FIELD_NAME) {
            this.f15478g1 = false;
            p pVar = this.f15475d1;
            this.f15475d1 = null;
            this.U = pVar;
            if (pVar != p.VALUE_STRING) {
                if (pVar == p.START_ARRAY) {
                    u10 = this.f15474c1.t(this.f15472a1, this.f15473b1);
                } else {
                    if (pVar == p.START_OBJECT) {
                        u10 = this.f15474c1.u(this.f15472a1, this.f15473b1);
                    }
                    return null;
                }
                this.f15474c1 = u10;
                return null;
            } else if (!this.f6163w1) {
                return this.f15476e1.l();
            } else {
                this.f6163w1 = false;
                return C4();
            }
        } else if (D2() == p.VALUE_STRING) {
            return Y1();
        } else {
            return null;
        }
    }

    public String C4() throws IOException {
        int i10 = this.U0;
        if (i10 >= this.V0) {
            M4();
            i10 = this.U0;
        }
        int i11 = 0;
        char[] n10 = this.f15476e1.n();
        int[] iArr = N1;
        int min = Math.min(this.V0, n10.length + i10);
        byte[] bArr = this.C1;
        while (true) {
            if (i10 >= min) {
                break;
            }
            byte b10 = bArr[i10] & 255;
            if (iArr[b10] == 0) {
                i10++;
                n10[i11] = (char) b10;
                i11++;
            } else if (b10 == 34) {
                this.U0 = i10 + 1;
                return this.f15476e1.I(i11);
            }
        }
        this.U0 = i10;
        D4(n10, i11);
        return this.f15476e1.l();
    }

    public final int C5() throws IOException {
        byte b10;
        if ((this.U0 >= this.V0 && !L4()) || (b10 = this.C1[this.U0] & 255) < 48 || b10 > 57) {
            return 48;
        }
        if ((this.O & G1) == 0) {
            x3("Leading zeroes not allowed");
        }
        this.U0++;
        if (b10 == 48) {
            do {
                if (this.U0 >= this.V0 && !L4()) {
                    break;
                }
                byte[] bArr = this.C1;
                int i10 = this.U0;
                b10 = bArr[i10] & 255;
                if (b10 < 48 || b10 > 57) {
                    return 48;
                }
                this.U0 = i10 + 1;
            } while (b10 == 48);
        }
        return b10;
    }

    public p D2() throws IOException {
        p pVar;
        p pVar2 = this.U;
        p pVar3 = p.FIELD_NAME;
        if (pVar2 == pVar3) {
            return S4();
        }
        this.f15481j1 = 0;
        if (this.f6163w1) {
            r5();
        }
        int x52 = x5();
        if (x52 < 0) {
            close();
            this.U = null;
            return null;
        }
        this.f15480i1 = null;
        if (x52 == 93) {
            t4();
            p pVar4 = p.END_ARRAY;
            this.U = pVar4;
            return pVar4;
        } else if (x52 == 125) {
            u4();
            p pVar5 = p.END_OBJECT;
            this.U = pVar5;
            return pVar5;
        } else {
            if (this.f15474c1.x()) {
                if (x52 != 44) {
                    t3(x52, "was expecting comma to separate " + this.f15474c1.q() + " entries");
                }
                x52 = v5();
                if ((this.O & F1) != 0 && (x52 == 93 || x52 == 125)) {
                    return v4(x52);
                }
            }
            if (!this.f15474c1.l()) {
                A5();
                return T4(x52);
            }
            B5();
            this.f15474c1.B(Y4(x52));
            this.U = pVar3;
            int m52 = m5();
            A5();
            if (m52 == 34) {
                this.f6163w1 = true;
                this.f15475d1 = p.VALUE_STRING;
                return this.U;
            }
            if (m52 == 45) {
                pVar = Z4();
            } else if (m52 == 46) {
                pVar = X4();
            } else if (m52 == 91) {
                pVar = p.START_ARRAY;
            } else if (m52 == 102) {
                N4();
                pVar = p.VALUE_FALSE;
            } else if (m52 == 110) {
                O4();
                pVar = p.VALUE_NULL;
            } else if (m52 == 116) {
                R4();
                pVar = p.VALUE_TRUE;
            } else if (m52 != 123) {
                switch (m52) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        pVar = b5(m52);
                        break;
                    default:
                        pVar = I4(m52);
                        break;
                }
            } else {
                pVar = p.START_OBJECT;
            }
            this.f15475d1 = pVar;
            return this.U;
        }
    }

    public final void D4(char[] cArr, int i10) throws IOException {
        int[] iArr = N1;
        byte[] bArr = this.C1;
        while (true) {
            int i11 = this.U0;
            if (i11 >= this.V0) {
                M4();
                i11 = this.U0;
            }
            int i12 = 0;
            if (i10 >= cArr.length) {
                cArr = this.f15476e1.s();
                i10 = 0;
            }
            int min = Math.min(this.V0, (cArr.length - i10) + i11);
            while (true) {
                if (i11 >= min) {
                    this.U0 = i11;
                    break;
                }
                int i13 = i11 + 1;
                int i14 = bArr[i11] & 255;
                int i15 = iArr[i14];
                if (i15 != 0) {
                    this.U0 = i13;
                    if (i14 == 34) {
                        this.f15476e1.J(i10);
                        return;
                    }
                    if (i15 == 1) {
                        i14 = J3();
                    } else if (i15 == 2) {
                        i14 = y4(i14);
                    } else if (i15 == 3) {
                        i14 = this.V0 - i13 >= 2 ? A4(i14) : z4(i14);
                    } else if (i15 == 4) {
                        int B4 = B4(i14);
                        int i16 = i10 + 1;
                        cArr[i10] = (char) (55296 | (B4 >> 10));
                        if (i16 >= cArr.length) {
                            cArr = this.f15476e1.s();
                            i10 = 0;
                        } else {
                            i10 = i16;
                        }
                        i14 = (B4 & 1023) | 56320;
                    } else if (i14 < 32) {
                        X3(i14, "string value");
                    } else {
                        d5(i14);
                    }
                    if (i10 >= cArr.length) {
                        cArr = this.f15476e1.s();
                    } else {
                        i12 = i10;
                    }
                    i10 = i12 + 1;
                    cArr[i12] = (char) i14;
                } else {
                    cArr[i10] = (char) i14;
                    i11 = i13;
                    i10++;
                }
            }
        }
    }

    public final void D5(int i10) throws IOException {
        int i11 = this.U0 + 1;
        this.U0 = i11;
        if (i10 == 9) {
            return;
        }
        if (i10 == 10) {
            this.X0++;
            this.Y0 = i11;
        } else if (i10 == 13) {
            l5();
        } else if (i10 != 32) {
            s3(i10);
        }
    }

    public final String E4(p pVar) {
        if (pVar == null) {
            return null;
        }
        int e10 = pVar.e();
        return e10 != 5 ? (e10 == 6 || e10 == 7 || e10 == 8) ? this.f15476e1.l() : pVar.d() : this.f15474c1.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String E5(int[] r17, int r18, int r19) throws w4.k {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            h5.n r8 = r0.f15476e1
            char[] r8 = r8.n()
            r10 = 0
            r11 = 0
        L_0x0025:
            if (r10 >= r4) goto L_0x00f5
            int r12 = r10 >> 2
            r12 = r1[r12]
            r13 = r10 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r10 = r10 + 1
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00e2
            r13 = r12 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r5 = 1
            if (r13 != r14) goto L_0x0044
            r12 = r12 & 31
            r13 = r5
            goto L_0x005d
        L_0x0044:
            r13 = r12 & 240(0xf0, float:3.36E-43)
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 != r14) goto L_0x004e
            r12 = r12 & 15
            r13 = 2
            goto L_0x005d
        L_0x004e:
            r13 = r12 & 248(0xf8, float:3.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
            if (r13 != r14) goto L_0x0058
            r12 = r12 & 7
            r13 = r7
            goto L_0x005d
        L_0x0058:
            r0.e5(r12)
            r12 = r5
            r13 = r12
        L_0x005d:
            int r14 = r10 + r13
            if (r14 <= r4) goto L_0x0068
            w4.p r14 = w4.p.FIELD_NAME
            java.lang.String r6 = " in field name"
            r0.p3(r6, r14)
        L_0x0068:
            int r6 = r10 >> 2
            r6 = r1[r6]
            r14 = r10 & 3
            int r14 = 3 - r14
            int r14 = r14 << r7
            int r6 = r6 >> r14
            int r10 = r10 + 1
            r14 = r6 & 192(0xc0, float:2.69E-43)
            r15 = 128(0x80, float:1.794E-43)
            if (r14 == r15) goto L_0x007d
            r0.f5(r6)
        L_0x007d:
            int r12 = r12 << 6
            r6 = r6 & 63
            r6 = r6 | r12
            if (r13 <= r5) goto L_0x00be
            int r5 = r10 >> 2
            r5 = r1[r5]
            r12 = r10 & 3
            int r12 = 3 - r12
            int r12 = r12 << r7
            int r5 = r5 >> r12
            int r10 = r10 + 1
            r12 = r5 & 192(0xc0, float:2.69E-43)
            if (r12 == r15) goto L_0x0097
            r0.f5(r5)
        L_0x0097:
            int r6 = r6 << 6
            r5 = r5 & 63
            r5 = r5 | r6
            r6 = 2
            if (r13 <= r6) goto L_0x00bb
            int r6 = r10 >> 2
            r6 = r1[r6]
            r12 = r10 & 3
            int r12 = 3 - r12
            int r12 = r12 << r7
            int r6 = r6 >> r12
            int r10 = r10 + 1
            r12 = r6 & 192(0xc0, float:2.69E-43)
            if (r12 == r15) goto L_0x00b4
            r12 = r6 & 255(0xff, float:3.57E-43)
            r0.f5(r12)
        L_0x00b4:
            int r5 = r5 << 6
            r6 = r6 & 63
            r5 = r5 | r6
            r12 = r5
            goto L_0x00bf
        L_0x00bb:
            r12 = r5
            r5 = r6
            goto L_0x00c0
        L_0x00be:
            r12 = r6
        L_0x00bf:
            r5 = 2
        L_0x00c0:
            if (r13 <= r5) goto L_0x00e2
            r5 = 65536(0x10000, float:9.18355E-41)
            int r12 = r12 - r5
            int r5 = r8.length
            if (r11 < r5) goto L_0x00cf
            h5.n r5 = r0.f15476e1
            char[] r5 = r5.q()
            r8 = r5
        L_0x00cf:
            int r5 = r11 + 1
            r6 = 55296(0xd800, float:7.7486E-41)
            int r13 = r12 >> 10
            int r13 = r13 + r6
            char r6 = (char) r13
            r8[r11] = r6
            r6 = 56320(0xdc00, float:7.8921E-41)
            r11 = r12 & 1023(0x3ff, float:1.434E-42)
            r12 = r11 | r6
            r11 = r5
        L_0x00e2:
            int r5 = r8.length
            if (r11 < r5) goto L_0x00ec
            h5.n r5 = r0.f15476e1
            char[] r5 = r5.q()
            r8 = r5
        L_0x00ec:
            int r5 = r11 + 1
            char r6 = (char) r12
            r8[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0025
        L_0x00f5:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r8, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x0102
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x0102:
            f5.a r3 = r0.f6161u1
            java.lang.String r1 = r3.z(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.E5(int[], int, int):java.lang.String");
    }

    public p F4() throws IOException {
        char[] n10 = this.f15476e1.n();
        int[] iArr = N1;
        byte[] bArr = this.C1;
        int i10 = 0;
        while (true) {
            if (this.U0 >= this.V0) {
                M4();
            }
            if (i10 >= n10.length) {
                n10 = this.f15476e1.s();
                i10 = 0;
            }
            int i11 = this.V0;
            int length = this.U0 + (n10.length - i10);
            if (length < i11) {
                i11 = length;
            }
            while (true) {
                int i12 = this.U0;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i12 + 1;
                this.U0 = i13;
                int i14 = bArr[i12] & 255;
                if (i14 != 39 && iArr[i14] == 0) {
                    n10[i10] = (char) i14;
                    i10++;
                } else if (i14 == 39) {
                    this.f15476e1.J(i10);
                    return p.VALUE_STRING;
                } else {
                    int i15 = iArr[i14];
                    if (i15 == 1) {
                        i14 = J3();
                    } else if (i15 == 2) {
                        i14 = y4(i14);
                    } else if (i15 == 3) {
                        i14 = this.V0 - i13 >= 2 ? A4(i14) : z4(i14);
                    } else if (i15 != 4) {
                        if (i14 < 32) {
                            X3(i14, "string value");
                        }
                        d5(i14);
                    } else {
                        int B4 = B4(i14);
                        int i16 = i10 + 1;
                        n10[i10] = (char) (55296 | (B4 >> 10));
                        if (i16 >= n10.length) {
                            n10 = this.f15476e1.s();
                            i10 = 0;
                        } else {
                            i10 = i16;
                        }
                        i14 = 56320 | (B4 & 1023);
                    }
                    if (i10 >= n10.length) {
                        n10 = this.f15476e1.s();
                        i10 = 0;
                    }
                    n10[i10] = (char) i14;
                    i10++;
                }
            }
        }
    }

    public final String F5(int i10, int i11) throws k {
        int U4 = U4(i10, i11);
        String H = this.f6161u1.H(U4);
        if (H != null) {
            return H;
        }
        int[] iArr = this.f6162v1;
        iArr[0] = U4;
        return E5(iArr, 1, i11);
    }

    public void G3() throws IOException {
        if (this.B1 != null) {
            if (this.S0.q() || s2(l.a.AUTO_CLOSE_SOURCE)) {
                this.B1.close();
            }
            this.B1 = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v2 ?, r4v6 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public w4.p G4(
/*
Method generation error in method: d5.l.G4(int, boolean):w4.p, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    public final String G5(int i10, int i11, int i12) throws k {
        int U4 = U4(i11, i12);
        String I = this.f6161u1.I(i10, U4);
        if (I != null) {
            return I;
        }
        int[] iArr = this.f6162v1;
        iArr[0] = i10;
        iArr[1] = U4;
        return E5(iArr, 2, i12);
    }

    public String H4(int i10) throws IOException {
        if (i10 == 39 && (this.O & J1) != 0) {
            return V4();
        }
        if ((this.O & K1) == 0) {
            t3((char) x4(i10), "was expecting double-quote to start field name");
        }
        int[] l10 = a.l();
        if (l10[i10] != 0) {
            t3(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this.f6162v1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i11 < 4) {
                i11++;
                i13 = i10 | (i13 << 8);
            } else {
                if (i12 >= iArr.length) {
                    iArr = b.j4(iArr, iArr.length);
                    this.f6162v1 = iArr;
                }
                iArr[i12] = i13;
                i13 = i10;
                i12++;
                i11 = 1;
            }
            if (this.U0 >= this.V0 && !L4()) {
                p3(" in field name", p.FIELD_NAME);
            }
            byte[] bArr = this.C1;
            int i14 = this.U0;
            i10 = bArr[i14] & 255;
            if (l10[i10] != 0) {
                break;
            }
            this.U0 = i14 + 1;
        }
        if (i11 > 0) {
            if (i12 >= iArr.length) {
                int[] j42 = b.j4(iArr, iArr.length);
                this.f6162v1 = j42;
                iArr = j42;
            }
            iArr[i12] = i13;
            i12++;
        }
        String K = this.f6161u1.K(iArr, i12);
        return K == null ? E5(iArr, i12, i11) : K;
    }

    public final String H5(int i10, int i11, int i12, int i13) throws k {
        int U4 = U4(i12, i13);
        String J = this.f6161u1.J(i10, i11, U4);
        if (J != null) {
            return J;
        }
        int[] iArr = this.f6162v1;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = U4(U4, i13);
        return E5(iArr, 3, i13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r4 != 44) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.f15474c1.k() == false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.p I4(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x0097
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x007e
            r0 = 78
            if (r4 == r0) goto L_0x0068
            r0 = 93
            if (r4 == r0) goto L_0x0042
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x0062
            r0 = 43
            if (r4 == r0) goto L_0x001f
            r0 = 44
            if (r4 == r0) goto L_0x004b
            goto L_0x00a3
        L_0x001f:
            int r4 = r3.U0
            int r0 = r3.V0
            if (r4 < r0) goto L_0x0030
            boolean r4 = r3.L4()
            if (r4 != 0) goto L_0x0030
            w4.p r4 = w4.p.VALUE_NUMBER_INT
            r3.r3(r4)
        L_0x0030:
            byte[] r4 = r3.C1
            int r0 = r3.U0
            int r1 = r0 + 1
            r3.U0 = r1
            byte r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            w4.p r4 = r3.G4(r4, r0)
            return r4
        L_0x0042:
            d5.d r0 = r3.f15474c1
            boolean r0 = r0.k()
            if (r0 != 0) goto L_0x004b
            goto L_0x00a3
        L_0x004b:
            d5.d r0 = r3.f15474c1
            boolean r0 = r0.m()
            if (r0 != 0) goto L_0x0062
            int r0 = r3.O
            int r2 = I1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0062
            int r4 = r3.U0
            int r4 = r4 - r1
            r3.U0 = r4
            w4.p r4 = w4.p.VALUE_NULL
            return r4
        L_0x0062:
            java.lang.String r0 = "expected a value"
            r3.t3(r4, r0)
            goto L_0x0097
        L_0x0068:
            java.lang.String r0 = "NaN"
            r3.P4(r0, r1)
            int r1 = r3.O
            int r2 = H1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x007b
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            w4.p r4 = r3.p4(r0, r1)
            return r4
        L_0x007b:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            goto L_0x0093
        L_0x007e:
            java.lang.String r0 = "Infinity"
            r3.P4(r0, r1)
            int r1 = r3.O
            int r2 = H1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0091
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            w4.p r4 = r3.p4(r0, r1)
            return r4
        L_0x0091:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
        L_0x0093:
            r3.j3(r0)
            goto L_0x00a3
        L_0x0097:
            int r0 = r3.O
            int r1 = J1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a3
            w4.p r4 = r3.F4()
            return r4
        L_0x00a3:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00c2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.Y3()
            r3.j5(r0, r1)
        L_0x00c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "expected a valid value "
            r0.append(r1)
            java.lang.String r1 = r3.Z3()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.t3(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.I4(int):w4.p");
    }

    public final String I5(int[] iArr, int i10, int i11, int i12) throws k {
        if (i10 >= iArr.length) {
            iArr = b.j4(iArr, iArr.length);
            this.f6162v1 = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = U4(i11, i12);
        String K = this.f6161u1.K(iArr, i13);
        return K == null ? E5(iArr, i13, i12) : K;
    }

    public int J2(w4.a aVar, OutputStream outputStream) throws IOException {
        if (!this.f6163w1 || this.U != p.VALUE_STRING) {
            byte[] m02 = m0(aVar);
            outputStream.write(m02);
            return m02.length;
        }
        byte[] d10 = this.S0.d();
        try {
            return c5(aVar, outputStream, d10);
        } finally {
            this.S0.r(d10);
        }
    }

    public char J3() throws IOException {
        if (this.U0 >= this.V0 && !L4()) {
            p3(" in character escape sequence", p.VALUE_STRING);
        }
        byte[] bArr = this.C1;
        int i10 = this.U0;
        this.U0 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == 34 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return 8;
        }
        if (b10 == 102) {
            return 12;
        }
        if (b10 == 110) {
            return 10;
        }
        if (b10 == 114) {
            return 13;
        }
        if (b10 == 116) {
            return 9;
        }
        if (b10 != 117) {
            return P3((char) x4(b10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this.U0 >= this.V0 && !L4()) {
                p3(" in character escape sequence", p.VALUE_STRING);
            }
            byte[] bArr2 = this.C1;
            int i13 = this.U0;
            this.U0 = i13 + 1;
            byte b11 = bArr2[i13];
            int c10 = a.c(b11);
            if (c10 < 0) {
                t3(b11 & 255, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | c10;
        }
        return (char) i11;
    }

    public final boolean J4(int i10, u uVar) throws IOException {
        p pVar;
        String Y4 = Y4(i10);
        this.f15474c1.B(Y4);
        boolean equals = Y4.equals(uVar.getValue());
        this.U = p.FIELD_NAME;
        int m52 = m5();
        A5();
        if (m52 == 34) {
            this.f6163w1 = true;
            this.f15475d1 = p.VALUE_STRING;
            return equals;
        }
        if (m52 == 45) {
            pVar = Z4();
        } else if (m52 == 46) {
            pVar = X4();
        } else if (m52 == 91) {
            pVar = p.START_ARRAY;
        } else if (m52 == 102) {
            N4();
            pVar = p.VALUE_FALSE;
        } else if (m52 == 110) {
            O4();
            pVar = p.VALUE_NULL;
        } else if (m52 == 116) {
            R4();
            pVar = p.VALUE_TRUE;
        } else if (m52 != 123) {
            switch (m52) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    pVar = b5(m52);
                    break;
                default:
                    pVar = I4(m52);
                    break;
            }
        } else {
            pVar = p.START_OBJECT;
        }
        this.f15475d1 = pVar;
        return equals;
    }

    public final int J5() throws IOException {
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr = this.C1;
        int i10 = this.U0;
        this.U0 = i10 + 1;
        return bArr[i10] & 255;
    }

    public final void K4(int i10) throws IOException {
        p pVar;
        this.U = p.FIELD_NAME;
        A5();
        if (i10 == 34) {
            this.f6163w1 = true;
            pVar = p.VALUE_STRING;
        } else if (i10 == 91) {
            pVar = p.START_ARRAY;
        } else if (i10 == 102) {
            N4();
            pVar = p.VALUE_FALSE;
        } else if (i10 == 110) {
            O4();
            pVar = p.VALUE_NULL;
        } else if (i10 == 116) {
            R4();
            pVar = p.VALUE_TRUE;
        } else if (i10 == 123) {
            pVar = p.START_OBJECT;
        } else if (i10 == 45) {
            pVar = Z4();
        } else if (i10 != 46) {
            switch (i10) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    pVar = b5(i10);
                    break;
                default:
                    pVar = I4(i10);
                    break;
            }
        } else {
            pVar = X4();
        }
        this.f15475d1 = pVar;
    }

    public final String K5(int[] iArr, int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr2 = O1;
        while (true) {
            if (iArr2[i12] != 0) {
                if (i12 == 34) {
                    break;
                }
                if (i12 != 92) {
                    X3(i12, "name");
                } else {
                    i12 = J3();
                }
                if (i12 > 127) {
                    int i14 = 0;
                    if (r10 >= 4) {
                        if (i10 >= iArr.length) {
                            iArr = b.j4(iArr, iArr.length);
                            this.f6162v1 = iArr;
                        }
                        iArr[i10] = r8;
                        i10++;
                        r8 = 0;
                        r10 = 0;
                    }
                    int i15 = r8 << 8;
                    if (i12 < 2048) {
                        r8 = i15 | (i12 >> 6) | 192;
                        r10++;
                    } else {
                        int i16 = i15 | (i12 >> 12) | 224;
                        int i17 = r10 + 1;
                        if (i17 >= 4) {
                            if (i10 >= iArr.length) {
                                iArr = b.j4(iArr, iArr.length);
                                this.f6162v1 = iArr;
                            }
                            iArr[i10] = i16;
                            i10++;
                            i17 = 0;
                        } else {
                            i14 = i16;
                        }
                        r8 = (i14 << 8) | ((i12 >> 6) & 63) | 128;
                        r10 = i17 + 1;
                    }
                    i12 = (i12 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i13 = r10 + 1;
                i11 = (r8 << 8) | i12;
            } else {
                if (i10 >= iArr.length) {
                    iArr = b.j4(iArr, iArr.length);
                    this.f6162v1 = iArr;
                }
                iArr[i10] = r8;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            if (this.U0 >= this.V0 && !L4()) {
                p3(" in field name", p.FIELD_NAME);
            }
            byte[] bArr = this.C1;
            int i18 = this.U0;
            this.U0 = i18 + 1;
            i12 = bArr[i18] & 255;
        }
        if (r10 > 0) {
            if (i10 >= iArr.length) {
                iArr = b.j4(iArr, iArr.length);
                this.f6162v1 = iArr;
            }
            iArr[i10] = U4(r8, r10);
            i10++;
        }
        String K = this.f6161u1.K(iArr, i10);
        return K == null ? E5(iArr, i10, r10) : K;
    }

    public Object L1() {
        return this.B1;
    }

    public void L3() throws IOException {
        int i10 = this.U0;
        if (i10 >= this.V0) {
            M4();
            i10 = this.U0;
        }
        int i11 = 0;
        char[] n10 = this.f15476e1.n();
        int[] iArr = N1;
        int min = Math.min(this.V0, n10.length + i10);
        byte[] bArr = this.C1;
        while (true) {
            if (i10 >= min) {
                break;
            }
            byte b10 = bArr[i10] & 255;
            if (iArr[b10] == 0) {
                i10++;
                n10[i11] = (char) b10;
                i11++;
            } else if (b10 == 34) {
                this.U0 = i10 + 1;
                this.f15476e1.J(i11);
                return;
            }
        }
        this.U0 = i10;
        D4(n10, i11);
    }

    public final boolean L4() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.B1;
        if (inputStream == null || (length = bArr.length) == 0) {
            return false;
        }
        int read = inputStream.read((bArr = this.C1), 0, length);
        if (read > 0) {
            int i10 = this.V0;
            this.W0 += (long) i10;
            this.Y0 -= i10;
            this.f6165y1 -= i10;
            this.U0 = 0;
            this.V0 = read;
            return true;
        }
        G3();
        if (read == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.C1.length + " bytes");
        }
        return false;
    }

    public final String L5(int i10, int i11, int i12) throws IOException {
        int[] iArr = this.f6162v1;
        iArr[0] = this.f6164x1;
        iArr[1] = i11;
        iArr[2] = i12;
        byte[] bArr = this.C1;
        int[] iArr2 = O1;
        byte b10 = i10;
        int i13 = 3;
        while (true) {
            int i14 = this.U0;
            if (i14 + 4 <= this.V0) {
                int i15 = i14 + 1;
                this.U0 = i15;
                byte b11 = bArr[i14] & 255;
                if (iArr2[b11] == 0) {
                    byte b12 = (b10 << 8) | b11;
                    int i16 = i15 + 1;
                    this.U0 = i16;
                    byte b13 = bArr[i15] & 255;
                    if (iArr2[b13] == 0) {
                        byte b14 = (b12 << 8) | b13;
                        int i17 = i16 + 1;
                        this.U0 = i17;
                        byte b15 = bArr[i16] & 255;
                        if (iArr2[b15] == 0) {
                            int i18 = (b14 << 8) | b15;
                            this.U0 = i17 + 1;
                            byte b16 = bArr[i17] & 255;
                            if (iArr2[b16] == 0) {
                                int[] iArr3 = this.f6162v1;
                                if (i13 >= iArr3.length) {
                                    this.f6162v1 = b.j4(iArr3, i13);
                                }
                                this.f6162v1[i13] = i18;
                                b10 = b16;
                                i13++;
                            } else if (b16 == 34) {
                                return I5(this.f6162v1, i13, i18, 4);
                            } else {
                                return K5(this.f6162v1, i13, i18, b16, 4);
                            }
                        } else if (b15 == 34) {
                            return I5(this.f6162v1, i13, b14, 3);
                        } else {
                            return K5(this.f6162v1, i13, b14, b15, 3);
                        }
                    } else if (b13 == 34) {
                        return I5(this.f6162v1, i13, b12, 2);
                    } else {
                        return K5(this.f6162v1, i13, b12, b13, 2);
                    }
                } else if (b11 == 34) {
                    return I5(this.f6162v1, i13, b10, 1);
                } else {
                    return K5(this.f6162v1, i13, b10, b11, 1);
                }
            } else {
                return K5(this.f6162v1, i13, 0, b10, 0);
            }
        }
    }

    public void M4() throws IOException {
        if (!L4()) {
            n3();
        }
    }

    public final String M5(int i10) throws IOException {
        byte[] bArr = this.C1;
        int[] iArr = O1;
        int i11 = this.U0;
        int i12 = i11 + 1;
        this.U0 = i12;
        byte b10 = bArr[i11] & 255;
        if (iArr[b10] != 0) {
            int i13 = this.f6164x1;
            return b10 == 34 ? G5(i13, i10, 1) : P5(i13, i10, b10, 1);
        }
        byte b11 = (i10 << 8) | b10;
        int i14 = i12 + 1;
        this.U0 = i14;
        byte b12 = bArr[i12] & 255;
        if (iArr[b12] != 0) {
            int i15 = this.f6164x1;
            return b12 == 34 ? G5(i15, b11, 2) : P5(i15, b11, b12, 2);
        }
        byte b13 = (b11 << 8) | b12;
        int i16 = i14 + 1;
        this.U0 = i16;
        byte b14 = bArr[i14] & 255;
        if (iArr[b14] != 0) {
            int i17 = this.f6164x1;
            return b14 == 34 ? G5(i17, b13, 3) : P5(i17, b13, b14, 3);
        }
        byte b15 = (b13 << 8) | b14;
        this.U0 = i16 + 1;
        byte b16 = bArr[i16] & 255;
        return iArr[b16] != 0 ? b16 == 34 ? G5(this.f6164x1, b15, 4) : P5(this.f6164x1, b15, b16, 4) : N5(b16, b15);
    }

    public final void N4() throws IOException {
        byte b10;
        int i10 = this.U0;
        if (i10 + 4 < this.V0) {
            byte[] bArr = this.C1;
            int i11 = i10 + 1;
            if (bArr[i10] == 97) {
                int i12 = i11 + 1;
                if (bArr[i11] == 108) {
                    int i13 = i12 + 1;
                    if (bArr[i12] == 115) {
                        int i14 = i13 + 1;
                        if (bArr[i13] == 101 && ((b10 = bArr[i14] & 255) < 48 || b10 == 93 || b10 == 125)) {
                            this.U0 = i14;
                            return;
                        }
                    }
                }
            }
        }
        Q4("false", 1);
    }

    public final String N5(int i10, int i11) throws IOException {
        byte[] bArr = this.C1;
        int[] iArr = O1;
        int i12 = this.U0;
        int i13 = i12 + 1;
        this.U0 = i13;
        byte b10 = bArr[i12] & 255;
        if (iArr[b10] == 0) {
            byte b11 = (i10 << 8) | b10;
            int i14 = i13 + 1;
            this.U0 = i14;
            byte b12 = bArr[i13] & 255;
            if (iArr[b12] == 0) {
                byte b13 = (b11 << 8) | b12;
                int i15 = i14 + 1;
                this.U0 = i15;
                byte b14 = bArr[i14] & 255;
                if (iArr[b14] == 0) {
                    byte b15 = (b13 << 8) | b14;
                    this.U0 = i15 + 1;
                    byte b16 = bArr[i15] & 255;
                    if (iArr[b16] == 0) {
                        return L5(b16, i11, b15);
                    }
                    if (b16 == 34) {
                        return H5(this.f6164x1, i11, b15, 4);
                    }
                    return Q5(this.f6164x1, i11, b15, b16, 4);
                } else if (b14 == 34) {
                    return H5(this.f6164x1, i11, b13, 3);
                } else {
                    return Q5(this.f6164x1, i11, b13, b14, 3);
                }
            } else if (b12 == 34) {
                return H5(this.f6164x1, i11, b11, 2);
            } else {
                return Q5(this.f6164x1, i11, b11, b12, 2);
            }
        } else if (b10 == 34) {
            return H5(this.f6164x1, i11, i10, 1);
        } else {
            return Q5(this.f6164x1, i11, i10, b10, 1);
        }
    }

    public final void O4() throws IOException {
        byte b10;
        int i10 = this.U0;
        if (i10 + 3 < this.V0) {
            byte[] bArr = this.C1;
            int i11 = i10 + 1;
            if (bArr[i10] == 117) {
                int i12 = i11 + 1;
                if (bArr[i11] == 108) {
                    int i13 = i12 + 1;
                    if (bArr[i12] == 108 && ((b10 = bArr[i13] & 255) < 48 || b10 == 93 || b10 == 125)) {
                        this.U0 = i13;
                        return;
                    }
                }
            }
        }
        Q4("null", 1);
    }

    public final String O5(int i10, int i11, int i12) throws IOException {
        return K5(this.f6162v1, 0, i10, i11, i12);
    }

    public int P2(OutputStream outputStream) throws IOException {
        int i10 = this.V0;
        int i11 = this.U0;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        this.U0 = i11 + i12;
        outputStream.write(this.C1, i11, i12);
        return i12;
    }

    public final void P4(String str, int i10) throws IOException {
        int i11;
        int length = str.length();
        if (this.U0 + length >= this.V0) {
            Q4(str, i10);
            return;
        }
        do {
            if (this.C1[this.U0] != str.charAt(i10)) {
                h5(str.substring(0, i10));
            }
            i11 = this.U0 + 1;
            this.U0 = i11;
            i10++;
        } while (i10 < length);
        byte b10 = this.C1[i11] & 255;
        if (b10 >= 48 && b10 != 93 && b10 != 125) {
            s4(str, i10, b10);
        }
    }

    public final String P5(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = this.f6162v1;
        iArr[0] = i10;
        return K5(iArr, 1, i11, i12, i13);
    }

    public final void Q4(String str, int i10) throws IOException {
        int i11;
        byte b10;
        int length = str.length();
        do {
            if ((this.U0 >= this.V0 && !L4()) || this.C1[this.U0] != str.charAt(i10)) {
                h5(str.substring(0, i10));
            }
            i11 = this.U0 + 1;
            this.U0 = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this.V0 || L4()) && (b10 = this.C1[this.U0] & 255) >= 48 && b10 != 93 && b10 != 125) {
            s4(str, i10, b10);
        }
    }

    public final String Q5(int i10, int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = this.f6162v1;
        iArr[0] = i10;
        iArr[1] = i11;
        return K5(iArr, 2, i12, i13, i14);
    }

    public final void R4() throws IOException {
        byte b10;
        int i10 = this.U0;
        if (i10 + 3 < this.V0) {
            byte[] bArr = this.C1;
            int i11 = i10 + 1;
            if (bArr[i10] == 114) {
                int i12 = i11 + 1;
                if (bArr[i11] == 117) {
                    int i13 = i12 + 1;
                    if (bArr[i12] == 101 && ((b10 = bArr[i13] & 255) < 48 || b10 == 93 || b10 == 125)) {
                        this.U0 = i13;
                        return;
                    }
                }
            }
        }
        Q4("true", 1);
    }

    public String R5() throws IOException {
        if (this.U0 >= this.V0 && !L4()) {
            p3(": was expecting closing '\"' for name", p.FIELD_NAME);
        }
        byte[] bArr = this.C1;
        int i10 = this.U0;
        this.U0 = i10 + 1;
        byte b10 = bArr[i10] & 255;
        if (b10 == 34) {
            return "";
        }
        return K5(this.f6162v1, 0, 0, b10, 0);
    }

    public void S2(s sVar) {
        this.f6160t1 = sVar;
    }

    public final p S4() {
        d u10;
        this.f15478g1 = false;
        p pVar = this.f15475d1;
        this.f15475d1 = null;
        if (pVar == p.START_ARRAY) {
            u10 = this.f15474c1.t(this.f15472a1, this.f15473b1);
        } else {
            if (pVar == p.START_OBJECT) {
                u10 = this.f15474c1.u(this.f15472a1, this.f15473b1);
            }
            this.U = pVar;
            return pVar;
        }
        this.f15474c1 = u10;
        this.U = pVar;
        return pVar;
    }

    public s T0() {
        return this.f6160t1;
    }

    public final p T4(int i10) throws IOException {
        p Z4;
        if (i10 == 34) {
            this.f6163w1 = true;
            Z4 = p.VALUE_STRING;
        } else if (i10 == 45) {
            Z4 = Z4();
        } else if (i10 == 46) {
            Z4 = X4();
        } else if (i10 == 91) {
            this.f15474c1 = this.f15474c1.t(this.f15472a1, this.f15473b1);
            Z4 = p.START_ARRAY;
        } else if (i10 == 102) {
            N4();
            Z4 = p.VALUE_FALSE;
        } else if (i10 == 110) {
            O4();
            Z4 = p.VALUE_NULL;
        } else if (i10 == 116) {
            R4();
            Z4 = p.VALUE_TRUE;
        } else if (i10 != 123) {
            switch (i10) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    Z4 = b5(i10);
                    break;
                default:
                    Z4 = I4(i10);
                    break;
            }
        } else {
            this.f15474c1 = this.f15474c1.u(this.f15472a1, this.f15473b1);
            Z4 = p.START_OBJECT;
        }
        this.U = Z4;
        return Z4;
    }

    public void U3() throws IOException {
        byte[] bArr;
        byte[] bArr2;
        super.U3();
        this.f6161u1.S();
        if (this.D1 && (bArr = this.C1) != null && bArr != (bArr2 = c.f15511u0)) {
            this.C1 = bArr2;
            this.S0.u(bArr);
        }
    }

    public String V4() throws IOException {
        int i10;
        int i11;
        if (this.U0 >= this.V0 && !L4()) {
            p3(": was expecting closing ''' for field name", p.FIELD_NAME);
        }
        byte[] bArr = this.C1;
        int i12 = this.U0;
        this.U0 = i12 + 1;
        char c10 = bArr[i12] & 255;
        if (c10 == '\'') {
            return "";
        }
        int[] iArr = this.f6162v1;
        int[] iArr2 = O1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (c10 != '\'') {
            if (!(iArr2[c10] == 0 || c10 == '\"')) {
                if (c10 != '\\') {
                    X3(c10, "name");
                } else {
                    c10 = J3();
                }
                if (c10 > 127) {
                    if (i11 >= 4) {
                        if (i14 >= iArr.length) {
                            iArr = b.j4(iArr, iArr.length);
                            this.f6162v1 = iArr;
                        }
                        iArr[i14] = i10;
                        i10 = 0;
                        i14++;
                        i11 = 0;
                    }
                    int i16 = i10 << 8;
                    if (c10 < 2048) {
                        i10 = i16 | (c10 >> 6) | 192;
                        i11++;
                    } else {
                        int i17 = i16 | (c10 >> 12) | 224;
                        int i18 = i11 + 1;
                        if (i18 >= 4) {
                            if (i14 >= iArr.length) {
                                iArr = b.j4(iArr, iArr.length);
                                this.f6162v1 = iArr;
                            }
                            iArr[i14] = i17;
                            i17 = 0;
                            i14++;
                            i18 = 0;
                        }
                        i10 = (i17 << 8) | ((c10 >> 6) & 63) | 128;
                        i11 = i18 + 1;
                    }
                    c10 = (c10 & '?') | 128;
                }
            }
            if (i11 < 4) {
                i13 = i11 + 1;
                i15 = c10 | (i10 << 8);
            } else {
                if (i14 >= iArr.length) {
                    iArr = b.j4(iArr, iArr.length);
                    this.f6162v1 = iArr;
                }
                iArr[i14] = i10;
                i15 = c10;
                i14++;
                i13 = 1;
            }
            if (this.U0 >= this.V0 && !L4()) {
                p3(" in field name", p.FIELD_NAME);
            }
            byte[] bArr2 = this.C1;
            int i19 = this.U0;
            this.U0 = i19 + 1;
            c10 = bArr2[i19] & 255;
        }
        if (i11 > 0) {
            if (i14 >= iArr.length) {
                int[] j42 = b.j4(iArr, iArr.length);
                this.f6162v1 = j42;
                iArr = j42;
            }
            iArr[i14] = U4(i10, i11);
            i14++;
        }
        String K = this.f6161u1.K(iArr, i14);
        return K == null ? E5(iArr, i14, i11) : K;
    }

    public j W0() {
        return new j(N3(), this.W0 + ((long) this.U0), -1, this.X0, (this.U0 - this.Y0) + 1);
    }

    public final p W4(char[] cArr, int i10, int i11, boolean z10, int i12) throws IOException {
        boolean z11;
        int i13;
        int i14 = 0;
        if (i11 == 46) {
            if (i10 >= cArr.length) {
                cArr = this.f15476e1.s();
                i10 = 0;
            }
            cArr[i10] = (char) i11;
            i10++;
            i13 = 0;
            while (true) {
                if (this.U0 >= this.V0 && !L4()) {
                    z11 = true;
                    break;
                }
                byte[] bArr = this.C1;
                int i15 = this.U0;
                this.U0 = i15 + 1;
                i11 = bArr[i15] & 255;
                if (i11 < 48 || i11 > 57) {
                    z11 = false;
                } else {
                    i13++;
                    if (i10 >= cArr.length) {
                        cArr = this.f15476e1.s();
                        i10 = 0;
                    }
                    cArr[i10] = (char) i11;
                    i10++;
                }
            }
            z11 = false;
            if (i13 == 0) {
                E3(i11, "Decimal point not followed by a digit");
            }
        } else {
            i13 = 0;
            z11 = false;
        }
        if (r12 == 101 || r12 == 69) {
            if (i10 >= cArr.length) {
                cArr = this.f15476e1.s();
                i10 = 0;
            }
            int i16 = i10 + 1;
            cArr[i10] = (char) r12;
            if (this.U0 >= this.V0) {
                M4();
            }
            byte[] bArr2 = this.C1;
            int i17 = this.U0;
            this.U0 = i17 + 1;
            byte b10 = bArr2[i17] & 255;
            if (b10 == 45 || b10 == 43) {
                if (i16 >= cArr.length) {
                    cArr = this.f15476e1.s();
                    i16 = 0;
                }
                int i18 = i16 + 1;
                cArr[i16] = (char) b10;
                if (this.U0 >= this.V0) {
                    M4();
                }
                byte[] bArr3 = this.C1;
                int i19 = this.U0;
                this.U0 = i19 + 1;
                b10 = bArr3[i19] & 255;
                i16 = i18;
            }
            r12 = b10;
            int i20 = 0;
            while (true) {
                if (r12 >= 48 && r12 <= 57) {
                    i20++;
                    if (i16 >= cArr.length) {
                        cArr = this.f15476e1.s();
                        i16 = 0;
                    }
                    int i21 = i16 + 1;
                    cArr[i16] = (char) r12;
                    if (this.U0 >= this.V0 && !L4()) {
                        i14 = i20;
                        z11 = true;
                        r11 = i21;
                        break;
                    }
                    byte[] bArr4 = this.C1;
                    int i22 = this.U0;
                    this.U0 = i22 + 1;
                    r12 = bArr4[i22] & 255;
                    i16 = i21;
                } else {
                    i14 = i20;
                    r11 = i16;
                }
            }
            i14 = i20;
            r11 = i16;
            if (i14 == 0) {
                E3(r12, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this.U0--;
            if (this.f15474c1.m()) {
                D5(r12);
            }
        }
        this.f15476e1.J(i10);
        return q4(z10, i12, i13, i14);
    }

    public int X1(Writer writer) throws IOException {
        p pVar = this.U;
        if (pVar == p.VALUE_STRING) {
            if (this.f6163w1) {
                this.f6163w1 = false;
                L3();
            }
            return this.f15476e1.m(writer);
        } else if (pVar == p.FIELD_NAME) {
            String b10 = this.f15474c1.b();
            writer.write(b10);
            return b10.length();
        } else if (pVar == null) {
            return 0;
        } else {
            if (pVar.j()) {
                return this.f15476e1.m(writer);
            }
            char[] b11 = pVar.b();
            writer.write(b11);
            return b11.length;
        }
    }

    public final p X4() throws IOException {
        if (!s2(e.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.i())) {
            return I4(46);
        }
        return W4(this.f15476e1.n(), 0, 46, false, 0);
    }

    public String Y1() throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING) {
            return E4(pVar);
        }
        if (!this.f6163w1) {
            return this.f15476e1.l();
        }
        this.f6163w1 = false;
        return C4();
    }

    public final String Y4(int i10) throws IOException {
        if (i10 != 34) {
            return H4(i10);
        }
        int i11 = this.U0;
        if (i11 + 13 > this.V0) {
            return R5();
        }
        byte[] bArr = this.C1;
        int[] iArr = O1;
        int i12 = i11 + 1;
        this.U0 = i12;
        byte b10 = bArr[i11] & 255;
        if (iArr[b10] != 0) {
            return b10 == 34 ? "" : O5(0, b10, 0);
        }
        int i13 = i12 + 1;
        this.U0 = i13;
        byte b11 = bArr[i12] & 255;
        if (iArr[b11] != 0) {
            return b11 == 34 ? F5(b10, 1) : O5(b10, b11, 1);
        }
        byte b12 = (b10 << 8) | b11;
        int i14 = i13 + 1;
        this.U0 = i14;
        byte b13 = bArr[i13] & 255;
        if (iArr[b13] != 0) {
            return b13 == 34 ? F5(b12, 2) : O5(b12, b13, 2);
        }
        byte b14 = (b12 << 8) | b13;
        int i15 = i14 + 1;
        this.U0 = i15;
        byte b15 = bArr[i14] & 255;
        if (iArr[b15] != 0) {
            return b15 == 34 ? F5(b14, 3) : O5(b14, b15, 3);
        }
        byte b16 = (b14 << 8) | b15;
        this.U0 = i15 + 1;
        byte b17 = bArr[i15] & 255;
        if (iArr[b17] != 0) {
            return b17 == 34 ? F5(b16, 4) : O5(b16, b17, 4);
        }
        this.f6164x1 = b16;
        return M5(b17);
    }

    public char[] Z1() throws IOException {
        p pVar = this.U;
        if (pVar == null) {
            return null;
        }
        int e10 = pVar.e();
        if (e10 != 5) {
            if (e10 != 6) {
                if (!(e10 == 7 || e10 == 8)) {
                    return this.U.b();
                }
            } else if (this.f6163w1) {
                this.f6163w1 = false;
                L3();
            }
            return this.f15476e1.x();
        }
        if (!this.f15478g1) {
            String b10 = this.f15474c1.b();
            int length = b10.length();
            char[] cArr = this.f15477f1;
            if (cArr == null) {
                this.f15477f1 = this.S0.g(length);
            } else if (cArr.length < length) {
                this.f15477f1 = new char[length];
            }
            b10.getChars(0, length, this.f15477f1, 0);
            this.f15478g1 = true;
        }
        return this.f15477f1;
    }

    public p Z4() throws IOException {
        int i10;
        byte b10;
        char[] n10 = this.f15476e1.n();
        n10[0] = '-';
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr = this.C1;
        int i11 = this.U0;
        this.U0 = i11 + 1;
        int i12 = bArr[i11] & 255;
        if (i12 <= 48) {
            if (i12 != 48) {
                return G4(i12, true);
            }
            i12 = C5();
        } else if (i12 > 57) {
            return G4(i12, true);
        }
        int i13 = 2;
        n10[1] = (char) i12;
        int min = Math.min(this.V0, (this.U0 + n10.length) - 2);
        int i14 = 1;
        while (true) {
            int i15 = this.U0;
            if (i15 >= min) {
                return a5(n10, i13, true, i14);
            }
            byte[] bArr2 = this.C1;
            i10 = i15 + 1;
            this.U0 = i10;
            b10 = bArr2[i15] & 255;
            if (b10 >= 48 && b10 <= 57) {
                i14++;
                n10[i13] = (char) b10;
                i13++;
            }
        }
        if (b10 == 46 || b10 == 101 || b10 == 69) {
            return W4(n10, i13, b10, true, i14);
        }
        this.U0 = i10 - 1;
        this.f15476e1.J(i13);
        if (this.f15474c1.m()) {
            D5(b10);
        }
        return r4(true, i14);
    }

    public int a2() throws IOException {
        p pVar = this.U;
        if (pVar == null) {
            return 0;
        }
        int e10 = pVar.e();
        if (e10 == 5) {
            return this.f15474c1.b().length();
        }
        if (e10 != 6) {
            if (!(e10 == 7 || e10 == 8)) {
                return this.U.b().length;
            }
        } else if (this.f6163w1) {
            this.f6163w1 = false;
            L3();
        }
        return this.f15476e1.K();
    }

    public final p a5(char[] cArr, int i10, boolean z10, int i11) throws IOException {
        int i12;
        byte b10;
        char[] cArr2 = cArr;
        int i13 = i10;
        int i14 = i11;
        while (true) {
            if (this.U0 < this.V0 || L4()) {
                byte[] bArr = this.C1;
                int i15 = this.U0;
                i12 = i15 + 1;
                this.U0 = i12;
                b10 = bArr[i15] & 255;
                if (b10 <= 57 && b10 >= 48) {
                    if (i13 >= cArr2.length) {
                        i13 = 0;
                        cArr2 = this.f15476e1.s();
                    }
                    cArr2[i13] = (char) b10;
                    i14++;
                    i13++;
                }
            } else {
                this.f15476e1.J(i13);
                return r4(z10, i14);
            }
        }
        if (b10 == 46 || b10 == 101 || b10 == 69) {
            return W4(cArr2, i13, b10, z10, i14);
        }
        this.U0 = i12 - 1;
        this.f15476e1.J(i13);
        if (this.f15474c1.m()) {
            D5(this.C1[this.U0] & 255);
        }
        return r4(z10, i14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 8) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b2() throws java.io.IOException {
        /*
            r3 = this;
            w4.p r0 = r3.U
            r1 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.e()
            r2 = 6
            if (r0 == r2) goto L_0x0014
            r2 = 7
            if (r0 == r2) goto L_0x001d
            r2 = 8
            if (r0 == r2) goto L_0x001d
            goto L_0x0024
        L_0x0014:
            boolean r0 = r3.f6163w1
            if (r0 == 0) goto L_0x001d
            r3.f6163w1 = r1
            r3.L3()
        L_0x001d:
            h5.n r0 = r3.f15476e1
            int r0 = r0.y()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.b2():int");
    }

    public p b5(int i10) throws IOException {
        int i11;
        byte b10;
        char[] n10 = this.f15476e1.n();
        if (i10 == 48) {
            i10 = C5();
        }
        n10[0] = (char) i10;
        int min = Math.min(this.V0, (this.U0 + n10.length) - 1);
        int i12 = 1;
        int i13 = 1;
        while (true) {
            int i14 = this.U0;
            if (i14 >= min) {
                return a5(n10, i12, false, i13);
            }
            byte[] bArr = this.C1;
            i11 = i14 + 1;
            this.U0 = i11;
            b10 = bArr[i14] & 255;
            if (b10 >= 48 && b10 <= 57) {
                i13++;
                n10[i12] = (char) b10;
                i12++;
            }
        }
        if (b10 == 46 || b10 == 101 || b10 == 69) {
            return W4(n10, i12, b10, false, i13);
        }
        this.U0 = i11 - 1;
        this.f15476e1.J(i12);
        if (this.f15474c1.m()) {
            D5(b10);
        }
        return r4(false, i13);
    }

    public void c0() throws IOException {
        if (this.f6163w1) {
            this.f6163w1 = false;
            L3();
        }
    }

    public j c2() {
        if (this.U == p.FIELD_NAME) {
            return new j(N3(), this.W0 + ((long) (this.f6165y1 - 1)), -1, this.f6166z1, this.A1);
        }
        return new j(N3(), this.Z0 - 1, -1, this.f15472a1, this.f15473b1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r10 < 0) goto L_0x0169;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c5(w4.a r17, java.io.OutputStream r18, byte[] r19) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r3.length
            r5 = 3
            int r4 = r4 - r5
            r6 = 0
            r7 = r6
            r8 = r7
        L_0x000e:
            int r9 = r0.U0
            int r10 = r0.V0
            if (r9 < r10) goto L_0x0017
            r16.M4()
        L_0x0017:
            byte[] r9 = r0.C1
            int r10 = r0.U0
            int r11 = r10 + 1
            r0.U0 = r11
            byte r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 32
            if (r9 <= r10) goto L_0x0169
            int r10 = r1.g(r9)
            r11 = 34
            if (r10 >= 0) goto L_0x003b
            if (r9 != r11) goto L_0x0033
            goto L_0x012e
        L_0x0033:
            int r10 = r0.I3(r1, r9, r6)
            if (r10 >= 0) goto L_0x003b
            goto L_0x0169
        L_0x003b:
            if (r7 <= r4) goto L_0x0042
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
            r7 = r6
        L_0x0042:
            int r9 = r0.U0
            int r12 = r0.V0
            if (r9 < r12) goto L_0x004b
            r16.M4()
        L_0x004b:
            byte[] r9 = r0.C1
            int r12 = r0.U0
            int r13 = r12 + 1
            r0.U0 = r13
            byte r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r12 = r1.g(r9)
            r13 = 1
            if (r12 >= 0) goto L_0x0062
            int r12 = r0.I3(r1, r9, r13)
        L_0x0062:
            int r9 = r10 << 6
            r9 = r9 | r12
            int r10 = r0.U0
            int r12 = r0.V0
            if (r10 < r12) goto L_0x006e
            r16.M4()
        L_0x006e:
            byte[] r10 = r0.C1
            int r12 = r0.U0
            int r14 = r12 + 1
            r0.U0 = r14
            byte r10 = r10[r12]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r12 = r1.g(r10)
            r14 = 2
            r15 = -2
            if (r12 >= 0) goto L_0x00f0
            if (r12 == r15) goto L_0x00a3
            if (r10 != r11) goto L_0x009e
            int r4 = r9 >> 4
            int r5 = r7 + 1
            byte r4 = (byte) r4
            r3[r7] = r4
            boolean r4 = r17.y()
            if (r4 == 0) goto L_0x009b
            int r4 = r0.U0
            int r4 = r4 - r13
            r0.U0 = r4
            r16.O3(r17)
        L_0x009b:
            r7 = r5
            goto L_0x012e
        L_0x009e:
            int r10 = r0.I3(r1, r10, r14)
            r12 = r10
        L_0x00a3:
            if (r12 != r15) goto L_0x00f0
            int r10 = r0.U0
            int r11 = r0.V0
            if (r10 < r11) goto L_0x00ae
            r16.M4()
        L_0x00ae:
            byte[] r10 = r0.C1
            int r11 = r0.U0
            int r12 = r11 + 1
            r0.U0 = r12
            byte r10 = r10[r11]
            r10 = r10 & 255(0xff, float:3.57E-43)
            boolean r11 = r1.A(r10)
            if (r11 != 0) goto L_0x00e6
            int r11 = r0.I3(r1, r10, r5)
            if (r11 != r15) goto L_0x00c7
            goto L_0x00e6
        L_0x00c7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expected padding character '"
            r2.append(r3)
            char r3 = r17.v()
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r1 = r0.n4(r1, r10, r5, r2)
            throw r1
        L_0x00e6:
            int r9 = r9 >> 4
            int r10 = r7 + 1
            byte r9 = (byte) r9
            r3[r7] = r9
            r7 = r10
            goto L_0x000e
        L_0x00f0:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r10 = r0.U0
            int r12 = r0.V0
            if (r10 < r12) goto L_0x00fc
            r16.M4()
        L_0x00fc:
            byte[] r10 = r0.C1
            int r12 = r0.U0
            int r5 = r12 + 1
            r0.U0 = r5
            byte r5 = r10[r12]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r10 = r1.g(r5)
            if (r10 >= 0) goto L_0x0150
            if (r10 == r15) goto L_0x013e
            if (r5 != r11) goto L_0x0137
            int r4 = r9 >> 2
            int r5 = r7 + 1
            int r9 = r4 >> 8
            byte r9 = (byte) r9
            r3[r7] = r9
            int r7 = r5 + 1
            byte r4 = (byte) r4
            r3[r5] = r4
            boolean r4 = r17.y()
            if (r4 == 0) goto L_0x012e
            int r4 = r0.U0
            int r4 = r4 - r13
            r0.U0 = r4
            r16.O3(r17)
        L_0x012e:
            r0.f6163w1 = r6
            if (r7 <= 0) goto L_0x0136
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
        L_0x0136:
            return r8
        L_0x0137:
            r11 = 3
            int r5 = r0.I3(r1, r5, r11)
            r10 = r5
            goto L_0x013f
        L_0x013e:
            r11 = 3
        L_0x013f:
            if (r10 != r15) goto L_0x0151
            int r5 = r9 >> 2
            int r9 = r7 + 1
            int r10 = r5 >> 8
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r9 + 1
            byte r5 = (byte) r5
            r3[r9] = r5
            goto L_0x016a
        L_0x0150:
            r11 = 3
        L_0x0151:
            int r5 = r9 << 6
            r5 = r5 | r10
            int r9 = r7 + 1
            int r10 = r5 >> 16
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r9 + 1
            int r10 = r5 >> 8
            byte r10 = (byte) r10
            r3[r9] = r10
            int r9 = r7 + 1
            byte r5 = (byte) r5
            r3[r7] = r5
            r7 = r9
            goto L_0x016a
        L_0x0169:
            r11 = r5
        L_0x016a:
            r5 = r11
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.c5(w4.a, java.io.OutputStream, byte[]):int");
    }

    public void d5(int i10) throws k {
        if (i10 < 32) {
            v3(i10);
        }
        e5(i10);
    }

    public void e5(int i10) throws k {
        j3("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    public void f5(int i10) throws k {
        j3("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    public void g5(int i10, int i11) throws k {
        this.U0 = i11;
        f5(i10);
    }

    public void h5(String str) throws IOException {
        j5(str, Y3());
    }

    public int i2() throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_NUMBER_INT && pVar != p.VALUE_NUMBER_FLOAT) {
            return super.j2(0);
        }
        int i10 = this.f15481j1;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return Q3();
            }
            if ((i10 & 1) == 0) {
                d4();
            }
        }
        return this.f15482k1;
    }

    public void i5(String str, int i10) throws IOException {
        this.U0 = i10;
        j5(str, Y3());
    }

    public int j2(int i10) throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_NUMBER_INT && pVar != p.VALUE_NUMBER_FLOAT) {
            return super.j2(i10);
        }
        int i11 = this.f15481j1;
        if ((i11 & 1) == 0) {
            if (i11 == 0) {
                return Q3();
            }
            if ((i11 & 1) == 0) {
                d4();
            }
        }
        return this.f15482k1;
    }

    public void j5(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this.U0 >= this.V0 && !L4()) {
                break;
            }
            byte[] bArr = this.C1;
            int i10 = this.U0;
            this.U0 = i10 + 1;
            char x42 = (char) x4(bArr[i10]);
            if (Character.isJavaIdentifierPart(x42)) {
                sb2.append(x42);
                if (sb2.length() >= 256) {
                    sb2.append("...");
                    break;
                }
            } else {
                break;
            }
        }
        l3("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    public final void k5() throws IOException {
        int[] h10 = a.h();
        while (true) {
            if (this.U0 >= this.V0 && !L4()) {
                break;
            }
            byte[] bArr = this.C1;
            int i10 = this.U0;
            int i11 = i10 + 1;
            this.U0 = i11;
            byte b10 = bArr[i10] & 255;
            int i12 = h10[b10];
            if (i12 != 0) {
                if (i12 == 2) {
                    s5();
                } else if (i12 == 3) {
                    t5();
                } else if (i12 == 4) {
                    u5(b10);
                } else if (i12 == 10) {
                    this.X0++;
                    this.Y0 = i11;
                } else if (i12 != 13) {
                    if (i12 == 42) {
                        if (i11 >= this.V0 && !L4()) {
                            break;
                        }
                        byte[] bArr2 = this.C1;
                        int i13 = this.U0;
                        if (bArr2[i13] == 47) {
                            this.U0 = i13 + 1;
                            return;
                        }
                    } else {
                        d5(b10);
                    }
                } else {
                    l5();
                }
            }
        }
        p3(" in a comment", (p) null);
    }

    public final void l5() throws IOException {
        if (this.U0 < this.V0 || L4()) {
            byte[] bArr = this.C1;
            int i10 = this.U0;
            if (bArr[i10] == 10) {
                this.U0 = i10 + 1;
            }
        }
        this.X0++;
        this.Y0 = this.U0;
    }

    public byte[] m0(w4.a aVar) throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING && (pVar != p.VALUE_EMBEDDED_OBJECT || this.f15480i1 == null)) {
            j3("Current token (" + this.U + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f6163w1) {
            try {
                this.f15480i1 = w4(aVar);
                this.f6163w1 = false;
            } catch (IllegalArgumentException e10) {
                throw k("Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e10.getMessage());
            }
        } else if (this.f15480i1 == null) {
            h5.c M3 = M3();
            d3(Y1(), M3, aVar);
            this.f15480i1 = M3.P();
        }
        return this.f15480i1;
    }

    public String m2() throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING) {
            return pVar == p.FIELD_NAME ? X0() : super.n2((String) null);
        }
        if (!this.f6163w1) {
            return this.f15476e1.l();
        }
        this.f6163w1 = false;
        return C4();
    }

    public final int m5() throws IOException {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12 = this.U0;
        if (i12 + 4 >= this.V0) {
            return n5(false);
        }
        byte[] bArr = this.C1;
        byte b12 = bArr[i12];
        if (b12 == 58) {
            i10 = i12 + 1;
            this.U0 = i10;
            b10 = bArr[i10];
            if (b10 <= 32) {
                if (b10 == 32 || b10 == 9) {
                    i11 = i10 + 1;
                    this.U0 = i11;
                    b11 = bArr[i11];
                    if (b11 > 32) {
                        if (b11 == 47 || b11 == 35) {
                            return n5(true);
                        }
                        this.U0 = i11 + 1;
                        return b11;
                    }
                }
                return n5(true);
            } else if (b10 == 47 || b10 == 35) {
                return n5(true);
            }
        } else {
            if (b12 == 32 || b12 == 9) {
                int i13 = i12 + 1;
                this.U0 = i13;
                b12 = bArr[i13];
            }
            if (b12 != 58) {
                return n5(false);
            }
            i10 = this.U0 + 1;
            this.U0 = i10;
            b10 = bArr[i10];
            if (b10 <= 32) {
                if (b10 == 32 || b10 == 9) {
                    i11 = i10 + 1;
                    this.U0 = i11;
                    b11 = bArr[i11];
                    if (b11 > 32) {
                        if (b11 == 47 || b11 == 35) {
                            return n5(true);
                        }
                        this.U0 = i11 + 1;
                        return b11;
                    }
                }
                return n5(true);
            } else if (b10 == 47 || b10 == 35) {
                return n5(true);
            }
        }
        this.U0 = i10 + 1;
        return b10;
    }

    public String n2(String str) throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING) {
            return pVar == p.FIELD_NAME ? X0() : super.n2(str);
        }
        if (!this.f6163w1) {
            return this.f15476e1.l();
        }
        this.f6163w1 = false;
        return C4();
    }

    public final int n5(boolean z10) throws IOException {
        while (true) {
            if (this.U0 < this.V0 || L4()) {
                byte[] bArr = this.C1;
                int i10 = this.U0;
                int i11 = i10 + 1;
                this.U0 = i11;
                byte b10 = bArr[i10] & 255;
                if (b10 > 32) {
                    if (b10 == 47) {
                        p5();
                    } else if (b10 != 35 || !z5()) {
                        if (z10) {
                            return b10;
                        }
                        if (b10 != 58) {
                            t3(b10, "was expecting a colon to separate field name and value");
                        }
                        z10 = true;
                    }
                } else if (b10 != 32) {
                    if (b10 == 10) {
                        this.X0++;
                        this.Y0 = i11;
                    } else if (b10 == 13) {
                        l5();
                    } else if (b10 != 9) {
                        v3(b10);
                    }
                }
            } else {
                p3(" within/between " + this.f15474c1.q() + " entries", (p) null);
                return -1;
            }
        }
    }

    public final int o5(int i10) throws IOException {
        byte[] bArr = this.C1;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == 58) {
            int i12 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 > 32) {
                if (!(b11 == 47 || b11 == 35)) {
                    this.U0 = i12;
                    return b11;
                }
            } else if (b11 == 32 || b11 == 9) {
                int i13 = i12 + 1;
                byte b12 = bArr[i12];
                if (b12 <= 32 || b12 == 47 || b12 == 35) {
                    i12 = i13;
                } else {
                    this.U0 = i13;
                    return b12;
                }
            }
            this.U0 = i12 - 1;
            return n5(true);
        }
        if (b10 == 32 || b10 == 9) {
            byte b13 = bArr[i11];
            i11++;
            b10 = b13;
        }
        if (b10 == 58) {
            int i14 = i11 + 1;
            byte b14 = bArr[i11];
            if (b14 > 32) {
                if (!(b14 == 47 || b14 == 35)) {
                    this.U0 = i14;
                    return b14;
                }
            } else if (b14 == 32 || b14 == 9) {
                int i15 = i14 + 1;
                byte b15 = bArr[i14];
                if (b15 <= 32 || b15 == 47 || b15 == 35) {
                    i14 = i15;
                } else {
                    this.U0 = i15;
                    return b15;
                }
            }
            this.U0 = i14 - 1;
            return n5(true);
        }
        this.U0 = i11 - 1;
        return n5(false);
    }

    public final void p5() throws IOException {
        if ((this.O & L1) == 0) {
            t3(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.U0 >= this.V0 && !L4()) {
            p3(" in a comment", (p) null);
        }
        byte[] bArr = this.C1;
        int i10 = this.U0;
        this.U0 = i10 + 1;
        byte b10 = bArr[i10] & 255;
        if (b10 == 47) {
            q5();
        } else if (b10 == 42) {
            k5();
        } else {
            t3(b10, "was expecting either '*' or '/' for a comment");
        }
    }

    public final void q5() throws IOException {
        int[] h10 = a.h();
        while (true) {
            if (this.U0 < this.V0 || L4()) {
                byte[] bArr = this.C1;
                int i10 = this.U0;
                int i11 = i10 + 1;
                this.U0 = i11;
                byte b10 = bArr[i10] & 255;
                int i12 = h10[b10];
                if (i12 != 0) {
                    if (i12 == 2) {
                        s5();
                    } else if (i12 == 3) {
                        t5();
                    } else if (i12 == 4) {
                        u5(b10);
                    } else if (i12 == 10) {
                        this.X0++;
                        this.Y0 = i11;
                        return;
                    } else if (i12 == 13) {
                        l5();
                        return;
                    } else if (i12 != 42 && i12 < 0) {
                        d5(b10);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void r5() throws IOException {
        this.f6163w1 = false;
        int[] iArr = N1;
        byte[] bArr = this.C1;
        while (true) {
            int i10 = this.U0;
            int i11 = this.V0;
            if (i10 >= i11) {
                M4();
                i10 = this.U0;
                i11 = this.V0;
            }
            while (true) {
                if (i10 >= i11) {
                    this.U0 = i10;
                    break;
                }
                int i12 = i10 + 1;
                byte b10 = bArr[i10] & 255;
                int i13 = iArr[b10];
                if (i13 != 0) {
                    this.U0 = i12;
                    if (b10 != 34) {
                        if (i13 == 1) {
                            J3();
                        } else if (i13 == 2) {
                            s5();
                        } else if (i13 == 3) {
                            t5();
                        } else if (i13 == 4) {
                            u5(b10);
                        } else if (b10 < 32) {
                            X3(b10, "string value");
                        } else {
                            d5(b10);
                        }
                    } else {
                        return;
                    }
                } else {
                    i10 = i12;
                }
            }
        }
    }

    public final void s4(String str, int i10, int i11) throws IOException {
        if (Character.isJavaIdentifierPart((char) x4(i11))) {
            h5(str.substring(0, i10));
        }
    }

    public final void s5() throws IOException {
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr = this.C1;
        int i10 = this.U0;
        int i11 = i10 + 1;
        this.U0 = i11;
        byte b10 = bArr[i10];
        if ((b10 & w1.a.K6) != 128) {
            g5(b10 & 255, i11);
        }
    }

    public final void t4() throws k {
        A5();
        if (!this.f15474c1.k()) {
            V3(93, '}');
        }
        this.f15474c1 = this.f15474c1.s();
    }

    public final void t5() throws IOException {
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr = this.C1;
        int i10 = this.U0;
        int i11 = i10 + 1;
        this.U0 = i11;
        byte b10 = bArr[i10];
        if ((b10 & w1.a.K6) != 128) {
            g5(b10 & 255, i11);
        }
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr2 = this.C1;
        int i12 = this.U0;
        int i13 = i12 + 1;
        this.U0 = i13;
        byte b11 = bArr2[i12];
        if ((b11 & w1.a.K6) != 128) {
            g5(b11 & 255, i13);
        }
    }

    public final void u4() throws k {
        A5();
        if (!this.f15474c1.l()) {
            V3(125, ']');
        }
        this.f15474c1 = this.f15474c1.s();
    }

    public final void u5(int i10) throws IOException {
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr = this.C1;
        int i11 = this.U0;
        int i12 = i11 + 1;
        this.U0 = i12;
        byte b10 = bArr[i11];
        if ((b10 & w1.a.K6) != 128) {
            g5(b10 & 255, i12);
        }
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr2 = this.C1;
        int i13 = this.U0;
        int i14 = i13 + 1;
        this.U0 = i14;
        byte b11 = bArr2[i13];
        if ((b11 & w1.a.K6) != 128) {
            g5(b11 & 255, i14);
        }
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr3 = this.C1;
        int i15 = this.U0;
        int i16 = i15 + 1;
        this.U0 = i16;
        byte b12 = bArr3[i15];
        if ((b12 & w1.a.K6) != 128) {
            g5(b12 & 255, i16);
        }
    }

    public final p v4(int i10) throws k {
        p pVar;
        if (i10 == 125) {
            u4();
            pVar = p.END_OBJECT;
        } else {
            t4();
            pVar = p.END_ARRAY;
        }
        this.U = pVar;
        return pVar;
    }

    public final int v5() throws IOException {
        while (true) {
            int i10 = this.U0;
            if (i10 >= this.V0) {
                return w5();
            }
            byte[] bArr = this.C1;
            int i11 = i10 + 1;
            this.U0 = i11;
            byte b10 = bArr[i10] & 255;
            if (b10 > 32) {
                if (b10 != 47 && b10 != 35) {
                    return b10;
                }
                this.U0 = i11 - 1;
                return w5();
            } else if (b10 != 32) {
                if (b10 == 10) {
                    this.X0++;
                    this.Y0 = i11;
                } else if (b10 == 13) {
                    l5();
                } else if (b10 != 9) {
                    v3(b10);
                }
            }
        }
    }

    public final byte[] w4(w4.a aVar) throws IOException {
        h5.c M3 = M3();
        while (true) {
            if (this.U0 >= this.V0) {
                M4();
            }
            byte[] bArr = this.C1;
            int i10 = this.U0;
            this.U0 = i10 + 1;
            byte b10 = bArr[i10] & 255;
            if (b10 > 32) {
                int g10 = aVar.g(b10);
                if (g10 < 0) {
                    if (b10 == 34) {
                        return M3.P();
                    }
                    g10 = I3(aVar, b10, 0);
                    if (g10 < 0) {
                        continue;
                    }
                }
                if (this.U0 >= this.V0) {
                    M4();
                }
                byte[] bArr2 = this.C1;
                int i11 = this.U0;
                this.U0 = i11 + 1;
                byte b11 = bArr2[i11] & 255;
                int g11 = aVar.g(b11);
                if (g11 < 0) {
                    g11 = I3(aVar, b11, 1);
                }
                int i12 = (g10 << 6) | g11;
                if (this.U0 >= this.V0) {
                    M4();
                }
                byte[] bArr3 = this.C1;
                int i13 = this.U0;
                this.U0 = i13 + 1;
                byte b12 = bArr3[i13] & 255;
                int g12 = aVar.g(b12);
                if (g12 < 0) {
                    if (g12 != -2) {
                        if (b12 == 34) {
                            M3.f(i12 >> 4);
                            if (aVar.y()) {
                                this.U0--;
                                O3(aVar);
                            }
                            return M3.P();
                        }
                        g12 = I3(aVar, b12, 2);
                    }
                    if (g12 == -2) {
                        if (this.U0 >= this.V0) {
                            M4();
                        }
                        byte[] bArr4 = this.C1;
                        int i14 = this.U0;
                        this.U0 = i14 + 1;
                        byte b13 = bArr4[i14] & 255;
                        if (aVar.A(b13) || I3(aVar, b13, 3) == -2) {
                            M3.f(i12 >> 4);
                        } else {
                            throw n4(aVar, b13, 3, "expected padding character '" + aVar.v() + "'");
                        }
                    }
                }
                int i15 = (i12 << 6) | g12;
                if (this.U0 >= this.V0) {
                    M4();
                }
                byte[] bArr5 = this.C1;
                int i16 = this.U0;
                this.U0 = i16 + 1;
                byte b14 = bArr5[i16] & 255;
                int g13 = aVar.g(b14);
                if (g13 < 0) {
                    if (g13 != -2) {
                        if (b14 == 34) {
                            M3.i(i15 >> 2);
                            if (aVar.y()) {
                                this.U0--;
                                O3(aVar);
                            }
                            return M3.P();
                        }
                        g13 = I3(aVar, b14, 3);
                    }
                    if (g13 == -2) {
                        M3.i(i15 >> 2);
                    }
                }
                M3.h((i15 << 6) | g13);
            }
        }
    }

    public final int w5() throws IOException {
        byte b10;
        while (true) {
            if (this.U0 < this.V0 || L4()) {
                byte[] bArr = this.C1;
                int i10 = this.U0;
                int i11 = i10 + 1;
                this.U0 = i11;
                b10 = bArr[i10] & 255;
                if (b10 > 32) {
                    if (b10 == 47) {
                        p5();
                    } else if (b10 != 35 || !z5()) {
                        return b10;
                    }
                } else if (b10 != 32) {
                    if (b10 == 10) {
                        this.X0++;
                        this.Y0 = i11;
                    } else if (b10 == 13) {
                        l5();
                    } else if (b10 != 9) {
                        v3(b10);
                    }
                }
            } else {
                throw k("Unexpected end-of-input within/between " + this.f15474c1.q() + " entries");
            }
        }
        return b10;
    }

    public Boolean x2() throws IOException {
        d u10;
        if (this.U == p.FIELD_NAME) {
            this.f15478g1 = false;
            p pVar = this.f15475d1;
            this.f15475d1 = null;
            this.U = pVar;
            if (pVar == p.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (pVar == p.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (pVar == p.START_ARRAY) {
                u10 = this.f15474c1.t(this.f15472a1, this.f15473b1);
            } else {
                if (pVar == p.START_OBJECT) {
                    u10 = this.f15474c1.u(this.f15472a1, this.f15473b1);
                }
                return null;
            }
            this.f15474c1 = u10;
            return null;
        }
        p D2 = D2();
        if (D2 == p.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (D2 == p.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int x4(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 <= r0) goto L_0x0068
            r0 = r7 & 224(0xe0, float:3.14E-43)
            r1 = 2
            r2 = 1
            r3 = 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto L_0x0012
            r7 = r7 & 31
        L_0x0010:
            r0 = r2
            goto L_0x002c
        L_0x0012:
            r0 = r7 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L_0x001c
            r7 = r7 & 15
            r0 = r1
            goto L_0x002c
        L_0x001c:
            r0 = r7 & 248(0xf8, float:3.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r0 != r3) goto L_0x0026
            r7 = r7 & 7
            r0 = 3
            goto L_0x002c
        L_0x0026:
            r0 = r7 & 255(0xff, float:3.57E-43)
            r6.e5(r0)
            goto L_0x0010
        L_0x002c:
            int r3 = r6.J5()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x003b
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6.f5(r4)
        L_0x003b:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L_0x0068
            int r2 = r6.J5()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L_0x004f
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6.f5(r3)
        L_0x004f:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L_0x0068
            int r0 = r6.J5()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L_0x0063
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6.f5(r1)
        L_0x0063:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L_0x0068:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.x4(int):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082 A[SYNTHETIC] */
    public final int x5() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.U0
            int r1 = r9.V0
            if (r0 < r1) goto L_0x0011
            boolean r0 = r9.L4()
            if (r0 != 0) goto L_0x0011
            int r0 = r9.K3()
            return r0
        L_0x0011:
            byte[] r0 = r9.C1
            int r1 = r9.U0
            int r2 = r1 + 1
            r9.U0 = r2
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 35
            r3 = 47
            r4 = 32
            if (r0 <= r4) goto L_0x0034
            if (r0 == r3) goto L_0x002b
            if (r0 != r1) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            return r0
        L_0x002b:
            int r2 = r2 + -1
            r9.U0 = r2
        L_0x002f:
            int r0 = r9.y5()
            return r0
        L_0x0034:
            r5 = 9
            r6 = 13
            r7 = 10
            if (r0 == r4) goto L_0x0052
            if (r0 != r7) goto L_0x0047
            int r0 = r9.X0
            int r0 = r0 + 1
            r9.X0 = r0
            r9.Y0 = r2
            goto L_0x0052
        L_0x0047:
            if (r0 != r6) goto L_0x004d
        L_0x0049:
            r9.l5()
            goto L_0x0052
        L_0x004d:
            if (r0 == r5) goto L_0x0052
        L_0x004f:
            r9.v3(r0)
        L_0x0052:
            int r0 = r9.U0
            int r2 = r9.V0
            if (r0 >= r2) goto L_0x0082
            byte[] r2 = r9.C1
            int r8 = r0 + 1
            r9.U0 = r8
            byte r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 <= r4) goto L_0x006f
            if (r0 == r3) goto L_0x006a
            if (r0 != r1) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            return r0
        L_0x006a:
            int r8 = r8 + -1
            r9.U0 = r8
            goto L_0x002f
        L_0x006f:
            if (r0 == r4) goto L_0x0052
            if (r0 != r7) goto L_0x007c
            int r0 = r9.X0
            int r0 = r0 + 1
            r9.X0 = r0
            r9.Y0 = r8
            goto L_0x0052
        L_0x007c:
            if (r0 != r6) goto L_0x007f
            goto L_0x0049
        L_0x007f:
            if (r0 == r5) goto L_0x0052
            goto L_0x004f
        L_0x0082:
            int r0 = r9.y5()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.l.x5():int");
    }

    public String y2() throws IOException {
        p pVar;
        this.f15481j1 = 0;
        p pVar2 = this.U;
        p pVar3 = p.FIELD_NAME;
        if (pVar2 == pVar3) {
            S4();
            return null;
        }
        if (this.f6163w1) {
            r5();
        }
        int x52 = x5();
        if (x52 < 0) {
            close();
            this.U = null;
            return null;
        }
        this.f15480i1 = null;
        if (x52 == 93) {
            t4();
            this.U = p.END_ARRAY;
            return null;
        } else if (x52 == 125) {
            u4();
            this.U = p.END_OBJECT;
            return null;
        } else {
            if (this.f15474c1.x()) {
                if (x52 != 44) {
                    t3(x52, "was expecting comma to separate " + this.f15474c1.q() + " entries");
                }
                x52 = v5();
                if ((this.O & F1) != 0 && (x52 == 93 || x52 == 125)) {
                    v4(x52);
                    return null;
                }
            }
            if (!this.f15474c1.l()) {
                A5();
                T4(x52);
                return null;
            }
            B5();
            String Y4 = Y4(x52);
            this.f15474c1.B(Y4);
            this.U = pVar3;
            int m52 = m5();
            A5();
            if (m52 == 34) {
                this.f6163w1 = true;
                this.f15475d1 = p.VALUE_STRING;
                return Y4;
            }
            if (m52 == 45) {
                pVar = Z4();
            } else if (m52 == 46) {
                pVar = X4();
            } else if (m52 == 91) {
                pVar = p.START_ARRAY;
            } else if (m52 == 102) {
                N4();
                pVar = p.VALUE_FALSE;
            } else if (m52 == 110) {
                O4();
                pVar = p.VALUE_NULL;
            } else if (m52 == 116) {
                R4();
                pVar = p.VALUE_TRUE;
            } else if (m52 != 123) {
                switch (m52) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        pVar = b5(m52);
                        break;
                    default:
                        pVar = I4(m52);
                        break;
                }
            } else {
                pVar = p.START_OBJECT;
            }
            this.f15475d1 = pVar;
            return Y4;
        }
    }

    public final int y4(int i10) throws IOException {
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr = this.C1;
        int i11 = this.U0;
        int i12 = i11 + 1;
        this.U0 = i12;
        byte b10 = bArr[i11];
        if ((b10 & w1.a.K6) != 128) {
            g5(b10 & 255, i12);
        }
        return ((i10 & 31) << 6) | (b10 & 63);
    }

    public final int y5() throws IOException {
        byte b10;
        while (true) {
            if (this.U0 >= this.V0 && !L4()) {
                return K3();
            }
            byte[] bArr = this.C1;
            int i10 = this.U0;
            int i11 = i10 + 1;
            this.U0 = i11;
            b10 = bArr[i10] & 255;
            if (b10 > 32) {
                if (b10 == 47) {
                    p5();
                } else if (b10 != 35 || !z5()) {
                    return b10;
                }
            } else if (b10 != 32) {
                if (b10 == 10) {
                    this.X0++;
                    this.Y0 = i11;
                } else if (b10 == 13) {
                    l5();
                } else if (b10 != 9) {
                    v3(b10);
                }
            }
        }
        return b10;
    }

    public boolean z2(u uVar) throws IOException {
        int i10 = 0;
        this.f15481j1 = 0;
        if (this.U == p.FIELD_NAME) {
            S4();
            return false;
        }
        if (this.f6163w1) {
            r5();
        }
        int x52 = x5();
        if (x52 < 0) {
            close();
            this.U = null;
            return false;
        }
        this.f15480i1 = null;
        if (x52 == 93) {
            t4();
            this.U = p.END_ARRAY;
            return false;
        } else if (x52 == 125) {
            u4();
            this.U = p.END_OBJECT;
            return false;
        } else {
            if (this.f15474c1.x()) {
                if (x52 != 44) {
                    t3(x52, "was expecting comma to separate " + this.f15474c1.q() + " entries");
                }
                x52 = v5();
                if ((this.O & F1) != 0 && (x52 == 93 || x52 == 125)) {
                    v4(x52);
                    return false;
                }
            }
            if (!this.f15474c1.l()) {
                A5();
                T4(x52);
                return false;
            }
            B5();
            if (x52 == 34) {
                byte[] b10 = uVar.b();
                int length = b10.length;
                int i11 = this.U0;
                if (i11 + length + 4 < this.V0) {
                    int i12 = length + i11;
                    if (this.C1[i12] == 34) {
                        while (i11 != i12) {
                            if (b10[i10] == this.C1[i11]) {
                                i10++;
                                i11++;
                            }
                        }
                        this.f15474c1.B(uVar.getValue());
                        K4(o5(i11 + 1));
                        return true;
                    }
                }
            }
            return J4(x52, uVar);
        }
    }

    public final int z4(int i10) throws IOException {
        if (this.U0 >= this.V0) {
            M4();
        }
        int i11 = i10 & 15;
        byte[] bArr = this.C1;
        int i12 = this.U0;
        int i13 = i12 + 1;
        this.U0 = i13;
        byte b10 = bArr[i12];
        if ((b10 & w1.a.K6) != 128) {
            g5(b10 & 255, i13);
        }
        byte b11 = (i11 << 6) | (b10 & 63);
        if (this.U0 >= this.V0) {
            M4();
        }
        byte[] bArr2 = this.C1;
        int i14 = this.U0;
        int i15 = i14 + 1;
        this.U0 = i15;
        byte b12 = bArr2[i14];
        if ((b12 & w1.a.K6) != 128) {
            g5(b12 & 255, i15);
        }
        return (b11 << 6) | (b12 & 63);
    }

    public final boolean z5() throws IOException {
        if ((this.O & M1) == 0) {
            return false;
        }
        q5();
        return true;
    }
}
