package e5;

import c5.d;
import d5.e;
import h5.n;
import java.io.IOException;
import java.io.OutputStream;
import p7.f;
import w4.l;
import w4.p;
import y4.b;
import y4.c;

public class a extends b implements x4.a {
    public static final int J2 = l.a.ALLOW_TRAILING_COMMA.e();
    public static final int K2 = l.a.ALLOW_NUMERIC_LEADING_ZEROS.e();
    public static final int L2 = l.a.ALLOW_MISSING_VALUES.e();
    public static final int M2 = l.a.ALLOW_SINGLE_QUOTES.e();
    public static final int N2 = l.a.ALLOW_UNQUOTED_FIELD_NAMES.e();
    public static final int O2 = l.a.ALLOW_COMMENTS.e();
    public static final int P2 = l.a.ALLOW_YAML_COMMENTS.e();
    public static final int[] Q2 = c5.a.k();
    public static final int[] R2 = c5.a.i();
    public byte[] H2 = c.f15511u0;
    public int I2;

    public a(d dVar, int i10, f5.a aVar) {
        super(dVar, i10, aVar);
    }

    public final int A5(int i10) throws IOException {
        do {
            if (i10 != 32) {
                if (i10 == 10) {
                    this.X0++;
                } else if (i10 == 13) {
                    this.I1++;
                } else if (i10 != 9) {
                    v3(i10);
                }
                this.Y0 = this.U0;
            }
            int i11 = this.U0;
            if (i11 >= this.V0) {
                this.U = p.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this.H2;
            this.U0 = i11 + 1;
            i10 = bArr[i11] & 255;
        } while (i10 <= 32);
        return i10;
    }

    public final p B5(int i10) throws IOException {
        int i11 = this.U0;
        if (i11 >= this.V0) {
            this.D1 = i10;
            p pVar = p.NOT_AVAILABLE;
            this.U = pVar;
            return pVar;
        }
        byte[] bArr = this.H2;
        this.U0 = i11 + 1;
        byte b10 = bArr[i11] & 255;
        if (i10 == 4) {
            return F5(b10);
        }
        if (i10 == 5) {
            return G5(b10);
        }
        switch (i10) {
            case 12:
                return R5(b10);
            case 13:
                return U5(b10);
            case 14:
                return T5(b10);
            case 15:
                return S5(b10);
            default:
                h5.p.f();
                return null;
        }
    }

    public p C5() throws IOException {
        int i10 = this.U0;
        char[] n10 = this.f15476e1.n();
        int[] iArr = Q2;
        int min = Math.min(this.V0, n10.length + i10);
        byte[] bArr = this.H2;
        int i11 = 0;
        while (i10 < min) {
            byte b10 = bArr[i10] & 255;
            if (b10 == 39) {
                this.U0 = i10 + 1;
                this.f15476e1.J(i11);
                return K4(p.VALUE_STRING);
            } else if (iArr[b10] != 0) {
                break;
            } else {
                i10++;
                n10[i11] = (char) b10;
                i11++;
            }
        }
        this.f15476e1.J(i11);
        this.U0 = i10;
        return Z4();
    }

    public p D2() throws IOException {
        int i10 = this.U0;
        if (i10 >= this.V0) {
            if (this.T0) {
                return null;
            }
            return this.F1 ? this.U == p.NOT_AVAILABLE ? t5() : v4() : p.NOT_AVAILABLE;
        } else if (this.U == p.NOT_AVAILABLE) {
            return s5();
        } else {
            this.f15481j1 = 0;
            this.Z0 = this.W0 + ((long) i10);
            this.f15480i1 = null;
            byte[] bArr = this.H2;
            this.U0 = i10 + 1;
            byte b10 = bArr[i10] & 255;
            switch (this.B1) {
                case 0:
                    return D5(b10);
                case 1:
                    return R5(b10);
                case 2:
                    return F5(b10);
                case 3:
                    return G5(b10);
                case 4:
                    return T5(b10);
                case 5:
                    return R5(b10);
                case 6:
                    return U5(b10);
                default:
                    h5.p.f();
                    return null;
            }
        }
    }

    public final p D5(int i10) throws IOException {
        byte b10 = i10 & 255;
        if (b10 == 239 && this.D1 != 1) {
            return a5(1);
        }
        while (b10 <= 32) {
            if (b10 != 32) {
                if (b10 == 10) {
                    this.X0++;
                } else if (b10 == 13) {
                    this.I1++;
                } else if (b10 != 9) {
                    v3(b10);
                }
                this.Y0 = this.U0;
            }
            int i11 = this.U0;
            if (i11 >= this.V0) {
                this.D1 = 3;
                if (this.T0) {
                    return null;
                }
                return this.F1 ? v4() : p.NOT_AVAILABLE;
            }
            byte[] bArr = this.H2;
            this.U0 = i11 + 1;
            b10 = bArr[i11] & 255;
        }
        return R5(b10);
    }

    public p E5() throws IOException {
        byte b10;
        int i10 = this.U0;
        if (i10 + 4 < this.V0) {
            byte[] bArr = this.H2;
            int i11 = i10 + 1;
            if (bArr[i10] == 97) {
                int i12 = i11 + 1;
                if (bArr[i11] == 108) {
                    int i13 = i12 + 1;
                    if (bArr[i12] == 115) {
                        int i14 = i13 + 1;
                        if (bArr[i13] == 101 && ((b10 = bArr[i14] & 255) < 48 || b10 == 93 || b10 == 125)) {
                            this.U0 = i14;
                            return K4(p.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this.D1 = 18;
        return j5("false", 1, p.VALUE_FALSE);
    }

    public final p F5(int i10) throws IOException {
        String X4;
        if (i10 > 32 || (i10 = A5(i10)) > 0) {
            J4();
            return i10 != 34 ? i10 == 125 ? u4() : v5(i10) : (this.U0 + 13 > this.V0 || (X4 = X4()) == null) ? w5(0, 0, 0) : w4(X4);
        }
        this.D1 = 4;
        return this.U;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p G5(int r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 32
            r1 = 5
            if (r5 > r0) goto L_0x0010
            int r5 = r4.A5(r5)
            if (r5 > 0) goto L_0x0010
            r4.D1 = r1
            w4.p r5 = r4.U
            return r5
        L_0x0010:
            r2 = 44
            r3 = 125(0x7d, float:1.75E-43)
            if (r5 == r2) goto L_0x004e
            if (r5 != r3) goto L_0x001d
            w4.p r5 = r4.u4()
            return r5
        L_0x001d:
            r2 = 35
            if (r5 != r2) goto L_0x0026
            w4.p r5 = r4.i5(r1)
            return r5
        L_0x0026:
            r2 = 47
            if (r5 != r2) goto L_0x002f
            w4.p r5 = r4.N5(r1)
            return r5
        L_0x002f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "was expecting comma to separate "
            r1.append(r2)
            d5.d r2 = r4.f15474c1
            java.lang.String r2 = r2.q()
            r1.append(r2)
            java.lang.String r2 = " entries"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.t3(r5, r1)
        L_0x004e:
            int r5 = r4.U0
            int r1 = r4.V0
            r2 = 4
            if (r5 < r1) goto L_0x005c
            r4.D1 = r2
            w4.p r5 = w4.p.NOT_AVAILABLE
            r4.U = r5
            return r5
        L_0x005c:
            byte[] r1 = r4.H2
            byte r1 = r1[r5]
            int r5 = r5 + 1
            r4.U0 = r5
            if (r1 > r0) goto L_0x0071
            int r1 = r4.A5(r1)
            if (r1 > 0) goto L_0x0071
            r4.D1 = r2
            w4.p r5 = r4.U
            return r5
        L_0x0071:
            r4.J4()
            r5 = 34
            if (r1 == r5) goto L_0x008b
            if (r1 != r3) goto L_0x0086
            int r5 = r4.O
            int r0 = J2
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0086
            w4.p r5 = r4.u4()
            return r5
        L_0x0086:
            w4.p r5 = r4.v5(r1)
            return r5
        L_0x008b:
            int r5 = r4.U0
            int r5 = r5 + 13
            int r0 = r4.V0
            if (r5 > r0) goto L_0x009e
            java.lang.String r5 = r4.X4()
            if (r5 == 0) goto L_0x009e
            w4.p r5 = r4.w4(r5)
            return r5
        L_0x009e:
            r5 = 0
            w4.p r5 = r4.w5(r5, r5, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.G5(int):w4.p");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.p H5(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 57
            r1 = 48
            r2 = 46
            r3 = 0
            if (r9 != r2) goto L_0x0057
            int r9 = r7.length
            if (r8 < r9) goto L_0x0012
            h5.n r7 = r6.f15476e1
            char[] r7 = r7.q()
        L_0x0012:
            int r9 = r8 + 1
            r7[r8] = r2
            r8 = r9
            r9 = r3
        L_0x0018:
            int r2 = r6.U0
            int r4 = r6.V0
            if (r2 < r4) goto L_0x002e
            h5.n r7 = r6.f15476e1
            r7.J(r8)
            r7 = 30
            r6.D1 = r7
            r6.f15489r1 = r9
            w4.p r7 = w4.p.NOT_AVAILABLE
            r6.U = r7
            return r7
        L_0x002e:
            byte[] r4 = r6.H2
            int r5 = r2 + 1
            r6.U0 = r5
            byte r2 = r4[r2]
            if (r2 < r1) goto L_0x004d
            if (r2 <= r0) goto L_0x003b
            goto L_0x004d
        L_0x003b:
            int r4 = r7.length
            if (r8 < r4) goto L_0x0044
            h5.n r7 = r6.f15476e1
            char[] r7 = r7.q()
        L_0x0044:
            int r4 = r8 + 1
            char r2 = (char) r2
            r7[r8] = r2
            int r9 = r9 + 1
            r8 = r4
            goto L_0x0018
        L_0x004d:
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r9 != 0) goto L_0x0059
            java.lang.String r4 = "Decimal point not followed by a digit"
            r6.E3(r2, r4)
            goto L_0x0059
        L_0x0057:
            r2 = r9
            r9 = r3
        L_0x0059:
            r6.f15489r1 = r9
            r9 = 101(0x65, float:1.42E-43)
            if (r2 == r9) goto L_0x0063
            r9 = 69
            if (r2 != r9) goto L_0x00ff
        L_0x0063:
            int r9 = r7.length
            if (r8 < r9) goto L_0x006c
            h5.n r7 = r6.f15476e1
            char[] r7 = r7.q()
        L_0x006c:
            int r9 = r8 + 1
            char r2 = (char) r2
            r7[r8] = r2
            int r8 = r6.U0
            int r2 = r6.V0
            if (r8 < r2) goto L_0x0087
            h5.n r7 = r6.f15476e1
            r7.J(r9)
            r7 = 31
            r6.D1 = r7
            r6.f15490s1 = r3
            w4.p r7 = w4.p.NOT_AVAILABLE
            r6.U = r7
            return r7
        L_0x0087:
            byte[] r2 = r6.H2
            int r4 = r8 + 1
            r6.U0 = r4
            byte r8 = r2[r8]
            r2 = 45
            r4 = 32
            if (r8 == r2) goto L_0x0099
            r2 = 43
            if (r8 != r2) goto L_0x00c4
        L_0x0099:
            int r2 = r7.length
            if (r9 < r2) goto L_0x00a2
            h5.n r7 = r6.f15476e1
            char[] r7 = r7.q()
        L_0x00a2:
            int r2 = r9 + 1
            char r8 = (char) r8
            r7[r9] = r8
            int r8 = r6.U0
            int r9 = r6.V0
            if (r8 < r9) goto L_0x00bb
            h5.n r7 = r6.f15476e1
            r7.J(r2)
            r6.D1 = r4
            r6.f15490s1 = r3
            w4.p r7 = w4.p.NOT_AVAILABLE
            r6.U = r7
            return r7
        L_0x00bb:
            byte[] r9 = r6.H2
            int r5 = r8 + 1
            r6.U0 = r5
            byte r8 = r9[r8]
        L_0x00c3:
            r9 = r2
        L_0x00c4:
            if (r8 < r1) goto L_0x00f5
            if (r8 > r0) goto L_0x00f5
            int r3 = r3 + 1
            int r2 = r7.length
            if (r9 < r2) goto L_0x00d3
            h5.n r7 = r6.f15476e1
            char[] r7 = r7.q()
        L_0x00d3:
            int r2 = r9 + 1
            char r8 = (char) r8
            r7[r9] = r8
            int r8 = r6.U0
            int r9 = r6.V0
            if (r8 < r9) goto L_0x00ec
            h5.n r7 = r6.f15476e1
            r7.J(r2)
            r6.D1 = r4
            r6.f15490s1 = r3
            w4.p r7 = w4.p.NOT_AVAILABLE
            r6.U = r7
            return r7
        L_0x00ec:
            byte[] r9 = r6.H2
            int r5 = r8 + 1
            r6.U0 = r5
            byte r8 = r9[r8]
            goto L_0x00c3
        L_0x00f5:
            r7 = r8 & 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L_0x00fe
            java.lang.String r8 = "Exponent indicator not followed by a digit"
            r6.E3(r7, r8)
        L_0x00fe:
            r8 = r9
        L_0x00ff:
            int r7 = r6.U0
            int r7 = r7 + -1
            r6.U0 = r7
            h5.n r7 = r6.f15476e1
            r7.J(r8)
            r6.f15490s1 = r3
            w4.p r7 = w4.p.VALUE_NUMBER_FLOAT
            w4.p r7 = r6.K4(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.H5(char[], int, int):w4.p");
    }

    public p I5() throws IOException {
        this.f15487p1 = false;
        this.f15488q1 = 0;
        return H5(this.f15476e1.n(), 0, 46);
    }

    public char J3() throws IOException {
        h5.p.f();
        return f.f11698i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.p J5() throws java.io.IOException {
        /*
            r8 = this;
            r0 = 1
            r8.f15487p1 = r0
            int r1 = r8.U0
            int r2 = r8.V0
            if (r1 < r2) goto L_0x0012
            r0 = 23
            r8.D1 = r0
            w4.p r0 = w4.p.NOT_AVAILABLE
            r8.U = r0
            return r0
        L_0x0012:
            byte[] r2 = r8.H2
            int r3 = r1 + 1
            r8.U0 = r3
            byte r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = "expected digit (0-9) to follow minus sign, for valid numeric value"
            r3 = 57
            r4 = 2
            r5 = 48
            if (r1 > r5) goto L_0x0030
            if (r1 != r5) goto L_0x002c
            w4.p r0 = r8.o5()
            return r0
        L_0x002c:
            r8.E3(r1, r2)
            goto L_0x003c
        L_0x0030:
            if (r1 <= r3) goto L_0x003c
            r6 = 73
            if (r1 != r6) goto L_0x002c
            r0 = 3
            w4.p r0 = r8.l5(r0, r4)
            return r0
        L_0x003c:
            h5.n r2 = r8.f15476e1
            char[] r2 = r2.n()
            r6 = 0
            r7 = 45
            r2[r6] = r7
            char r1 = (char) r1
            r2[r0] = r1
            int r1 = r8.U0
            int r6 = r8.V0
            r7 = 26
            if (r1 < r6) goto L_0x0060
            r8.D1 = r7
            h5.n r1 = r8.f15476e1
            r1.J(r4)
            r8.f15488q1 = r0
            w4.p r0 = w4.p.NOT_AVAILABLE
            r8.U = r0
            return r0
        L_0x0060:
            byte[] r6 = r8.H2
            byte r1 = r6[r1]
        L_0x0064:
            if (r1 >= r5) goto L_0x0078
            r3 = 46
            if (r1 != r3) goto L_0x0083
            int r3 = r4 + -1
            r8.f15488q1 = r3
            int r3 = r8.U0
            int r3 = r3 + r0
            r8.U0 = r3
            w4.p r0 = r8.H5(r2, r4, r1)
            return r0
        L_0x0078:
            if (r1 <= r3) goto L_0x00a1
            r3 = 101(0x65, float:1.42E-43)
            if (r1 == r3) goto L_0x0093
            r3 = 69
            if (r1 != r3) goto L_0x0083
            goto L_0x0093
        L_0x0083:
            int r0 = r4 + -1
            r8.f15488q1 = r0
            h5.n r0 = r8.f15476e1
            r0.J(r4)
            w4.p r0 = w4.p.VALUE_NUMBER_INT
            w4.p r0 = r8.K4(r0)
            return r0
        L_0x0093:
            int r3 = r4 + -1
            r8.f15488q1 = r3
            int r3 = r8.U0
            int r3 = r3 + r0
            r8.U0 = r3
            w4.p r0 = r8.H5(r2, r4, r1)
            return r0
        L_0x00a1:
            int r6 = r2.length
            if (r4 < r6) goto L_0x00aa
            h5.n r2 = r8.f15476e1
            char[] r2 = r2.q()
        L_0x00aa:
            int r6 = r4 + 1
            char r1 = (char) r1
            r2[r4] = r1
            int r1 = r8.U0
            int r1 = r1 + r0
            r8.U0 = r1
            int r4 = r8.V0
            if (r1 < r4) goto L_0x00c4
            r8.D1 = r7
            h5.n r0 = r8.f15476e1
            r0.J(r6)
            w4.p r0 = w4.p.NOT_AVAILABLE
            r8.U = r0
            return r0
        L_0x00c4:
            byte[] r4 = r8.H2
            byte r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4 = r6
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.J5():w4.p");
    }

    public p K5() throws IOException {
        byte b10;
        int i10 = this.U0;
        if (i10 + 3 < this.V0) {
            byte[] bArr = this.H2;
            int i11 = i10 + 1;
            if (bArr[i10] == 117) {
                int i12 = i11 + 1;
                if (bArr[i11] == 108) {
                    int i13 = i12 + 1;
                    if (bArr[i12] == 108 && ((b10 = bArr[i13] & 255) < 48 || b10 == 93 || b10 == 125)) {
                        this.U0 = i13;
                        return K4(p.VALUE_NULL);
                    }
                }
            }
        }
        this.D1 = 16;
        return j5("null", 1, p.VALUE_NULL);
    }

    public p L5() throws IOException {
        int i10 = this.U0;
        if (i10 >= this.V0) {
            this.D1 = 24;
            p pVar = p.NOT_AVAILABLE;
            this.U = pVar;
            return pVar;
        }
        int i11 = i10 + 1;
        byte b10 = this.H2[i10] & 255;
        if (b10 < 48) {
            if (b10 == 46) {
                this.U0 = i11;
                this.f15488q1 = 1;
                char[] n10 = this.f15476e1.n();
                n10[0] = '0';
                return H5(n10, 1, b10);
            }
        } else if (b10 <= 57) {
            return p5();
        } else {
            if (b10 == 101 || b10 == 69) {
                this.U0 = i11;
                this.f15488q1 = 1;
                char[] n11 = this.f15476e1.n();
                n11[0] = '0';
                return H5(n11, 1, b10);
            } else if (!(b10 == 93 || b10 == 125)) {
                E3(b10, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return L4(0, "0");
    }

    public p M5(int i10) throws IOException {
        this.f15487p1 = false;
        char[] n10 = this.f15476e1.n();
        n10[0] = (char) i10;
        int i11 = this.U0;
        if (i11 >= this.V0) {
            this.D1 = 26;
            this.f15476e1.J(1);
            p pVar = p.NOT_AVAILABLE;
            this.U = pVar;
            return pVar;
        }
        byte b10 = this.H2[i11] & 255;
        int i12 = 1;
        while (true) {
            if (b10 < 48) {
                if (b10 == 46) {
                    this.f15488q1 = i12;
                    this.U0++;
                    return H5(n10, i12, b10);
                }
            } else if (b10 <= 57) {
                if (i12 >= n10.length) {
                    n10 = this.f15476e1.q();
                }
                int i13 = i12 + 1;
                n10[i12] = (char) b10;
                int i14 = this.U0 + 1;
                this.U0 = i14;
                if (i14 >= this.V0) {
                    this.D1 = 26;
                    this.f15476e1.J(i13);
                    p pVar2 = p.NOT_AVAILABLE;
                    this.U = pVar2;
                    return pVar2;
                }
                b10 = this.H2[i14] & 255;
                i12 = i13;
            } else if (b10 == 101 || b10 == 69) {
                this.f15488q1 = i12;
                this.U0++;
                return H5(n10, i12, b10);
            }
        }
        this.f15488q1 = i12;
        this.f15476e1.J(i12);
        return K4(p.VALUE_NUMBER_INT);
    }

    public final p N5(int i10) throws IOException {
        if ((this.O & O2) == 0) {
            t3(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i11 = this.U0;
        if (i11 >= this.V0) {
            this.f6856x1 = i10;
            this.D1 = 51;
            p pVar = p.NOT_AVAILABLE;
            this.U = pVar;
            return pVar;
        }
        byte[] bArr = this.H2;
        this.U0 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 == 42) {
            return b5(i10, false);
        }
        if (b10 == 47) {
            return c5(i10);
        }
        t3(b10 & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    public final int O4() throws IOException {
        return this.V0 - this.U0 < 5 ? Q4(0, -1) : P4();
    }

    public p O5() throws IOException {
        int i10 = this.U0;
        char[] n10 = this.f15476e1.n();
        int[] iArr = Q2;
        int min = Math.min(this.V0, n10.length + i10);
        byte[] bArr = this.H2;
        int i11 = 0;
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
                return K4(p.VALUE_STRING);
            }
        }
        this.f15476e1.J(i11);
        this.U0 = i10;
        return r5();
    }

    public int P2(OutputStream outputStream) throws IOException {
        int i10 = this.V0;
        int i11 = this.U0;
        int i12 = i10 - i11;
        if (i12 > 0) {
            outputStream.write(this.H2, i11, i12);
        }
        return i12;
    }

    public final int P4() throws IOException {
        byte[] bArr = this.H2;
        int i10 = this.U0;
        int i11 = i10 + 1;
        this.U0 = i11;
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
            return P3((char) b10);
        }
        this.U0 = i11 + 1;
        byte b11 = bArr[i11];
        int c10 = c5.a.c(b11);
        if (c10 >= 0) {
            byte[] bArr2 = this.H2;
            int i12 = this.U0;
            this.U0 = i12 + 1;
            b11 = bArr2[i12];
            int c11 = c5.a.c(b11);
            if (c11 >= 0) {
                int i13 = (c10 << 4) | c11;
                byte[] bArr3 = this.H2;
                int i14 = this.U0;
                this.U0 = i14 + 1;
                byte b12 = bArr3[i14];
                int c12 = c5.a.c(b12);
                if (c12 >= 0) {
                    int i15 = (i13 << 4) | c12;
                    byte[] bArr4 = this.H2;
                    int i16 = this.U0;
                    this.U0 = i16 + 1;
                    b12 = bArr4[i16];
                    int c13 = c5.a.c(b12);
                    if (c13 >= 0) {
                        return (i15 << 4) | c13;
                    }
                }
                b11 = b12;
            }
        }
        t3(b11 & 255, "expected a hex-digit for character escape sequence");
        return -1;
    }

    public p P5() throws IOException {
        byte b10;
        int i10 = this.U0;
        if (i10 + 3 < this.V0) {
            byte[] bArr = this.H2;
            int i11 = i10 + 1;
            if (bArr[i10] == 114) {
                int i12 = i11 + 1;
                if (bArr[i11] == 117) {
                    int i13 = i12 + 1;
                    if (bArr[i12] == 101 && ((b10 = bArr[i13] & 255) < 48 || b10 == 93 || b10 == 125)) {
                        this.U0 = i13;
                        return K4(p.VALUE_TRUE);
                    }
                }
            }
        }
        this.D1 = 17;
        return j5("true", 1, p.VALUE_TRUE);
    }

    public final int Q4(int i10, int i11) throws IOException {
        int i12 = this.U0;
        int i13 = this.V0;
        if (i12 >= i13) {
            this.f6858z1 = i10;
            this.A1 = i11;
            return -1;
        }
        byte[] bArr = this.H2;
        int i14 = i12 + 1;
        this.U0 = i14;
        byte b10 = bArr[i12];
        if (i11 == -1) {
            if (b10 == 34 || b10 == 47 || b10 == 92) {
                return b10;
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
                return P3((char) b10);
            }
            if (i14 >= i13) {
                this.A1 = 0;
                this.f6858z1 = 0;
                return -1;
            }
            this.U0 = i14 + 1;
            b10 = bArr[i14];
            i11 = 0;
        }
        while (true) {
            byte b11 = b10 & 255;
            int c10 = c5.a.c(b11);
            if (c10 < 0) {
                t3(b11 & 255, "expected a hex-digit for character escape sequence");
            }
            i10 = (i10 << 4) | c10;
            i11++;
            if (i11 == 4) {
                return i10;
            }
            int i15 = this.U0;
            if (i15 >= this.V0) {
                this.A1 = i11;
                this.f6858z1 = i10;
                return -1;
            }
            byte[] bArr2 = this.H2;
            this.U0 = i15 + 1;
            b10 = bArr2[i15];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r4 != 44) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r2.f15474c1.k() == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.p Q5(boolean r3, int r4) throws java.io.IOException {
        /*
            r2 = this;
            r3 = 39
            if (r4 == r3) goto L_0x0053
            r3 = 73
            r0 = 1
            if (r4 == r3) goto L_0x004e
            r3 = 78
            if (r4 == r3) goto L_0x0048
            r3 = 93
            if (r4 == r3) goto L_0x0024
            r3 = 125(0x7d, float:1.75E-43)
            if (r4 == r3) goto L_0x005f
            r3 = 43
            if (r4 == r3) goto L_0x001e
            r3 = 44
            if (r4 == r3) goto L_0x002d
            goto L_0x005f
        L_0x001e:
            r3 = 2
            w4.p r3 = r2.l5(r3, r0)
            return r3
        L_0x0024:
            d5.d r3 = r2.f15474c1
            boolean r3 = r3.k()
            if (r3 != 0) goto L_0x002d
            goto L_0x005f
        L_0x002d:
            d5.d r3 = r2.f15474c1
            boolean r3 = r3.m()
            if (r3 != 0) goto L_0x005f
            int r3 = r2.O
            int r1 = L2
            r3 = r3 & r1
            if (r3 == 0) goto L_0x005f
            int r3 = r2.U0
            int r3 = r3 - r0
            r2.U0 = r3
            w4.p r3 = w4.p.VALUE_NULL
            w4.p r3 = r2.K4(r3)
            return r3
        L_0x0048:
            r3 = 0
            w4.p r3 = r2.l5(r3, r0)
            return r3
        L_0x004e:
            w4.p r3 = r2.l5(r0, r0)
            return r3
        L_0x0053:
            int r3 = r2.O
            int r0 = M2
            r3 = r3 & r0
            if (r3 == 0) goto L_0x005f
            w4.p r3 = r2.C5()
            return r3
        L_0x005f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "expected a valid value "
            r3.append(r0)
            java.lang.String r0 = r2.Z3()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.t3(r4, r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.Q5(boolean, int):w4.p");
    }

    public final boolean R4(int i10, int i11, boolean z10) throws IOException {
        if (i11 == 1) {
            i10 = Q4(0, -1);
            if (i10 < 0) {
                this.D1 = 41;
                return false;
            }
        } else if (i11 != 2) {
            if (i11 == 3) {
                int i12 = i10 & 15;
                if (z10) {
                    byte[] bArr = this.H2;
                    int i13 = this.U0;
                    this.U0 = i13 + 1;
                    return S4(i12, 1, bArr[i13]);
                }
                this.D1 = 43;
                this.f6856x1 = i12;
                this.f6857y1 = 1;
                return false;
            } else if (i11 == 4) {
                int i14 = i10 & 7;
                if (z10) {
                    byte[] bArr2 = this.H2;
                    int i15 = this.U0;
                    this.U0 = i15 + 1;
                    return T4(i14, 1, bArr2[i15]);
                }
                this.f6856x1 = i14;
                this.f6857y1 = 1;
                this.D1 = 44;
                return false;
            } else if (i10 < 32) {
                X3(i10, "string value");
            } else {
                D4(i10);
            }
        } else if (z10) {
            byte[] bArr3 = this.H2;
            int i16 = this.U0;
            this.U0 = i16 + 1;
            i10 = U4(i10, bArr3[i16]);
        } else {
            this.D1 = 42;
            this.f6856x1 = i10;
            return false;
        }
        this.f15476e1.a((char) i10);
        return true;
    }

    public final p R5(int i10) throws IOException {
        if (i10 > 32 || (i10 = A5(i10)) > 0) {
            J4();
            this.f15474c1.x();
            if (i10 == 34) {
                return O5();
            }
            if (i10 == 35) {
                return i5(12);
            }
            if (i10 == 91) {
                return H4();
            }
            if (i10 == 93) {
                return t4();
            }
            if (i10 == 102) {
                return E5();
            }
            if (i10 == 110) {
                return K5();
            }
            if (i10 == 116) {
                return P5();
            }
            if (i10 == 123) {
                return I4();
            }
            if (i10 == 125) {
                return u4();
            }
            switch (i10) {
                case 45:
                    return J5();
                case 46:
                    if (s2(e.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.i())) {
                        return I5();
                    }
                    break;
                case 47:
                    return N5(12);
                case 48:
                    return L5();
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return M5(i10);
            }
            return Q5(false, i10);
        }
        this.D1 = 12;
        return this.U;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r6v0 ?, r6v1 ?, r6v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final boolean S4(int r4, int r5, 
/*
Method generation error in method: e5.a.S4(int, int, int):boolean, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ?
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

    public final p S5(int i10) throws IOException {
        if (i10 > 32 || (i10 = A5(i10)) > 0) {
            J4();
            if (i10 == 34) {
                return O5();
            }
            if (i10 == 35) {
                return i5(15);
            }
            if (i10 == 45) {
                return J5();
            }
            if (i10 == 91) {
                return H4();
            }
            if (i10 != 93) {
                if (i10 == 102) {
                    return E5();
                }
                if (i10 == 110) {
                    return K5();
                }
                if (i10 == 116) {
                    return P5();
                }
                if (i10 == 123) {
                    return I4();
                }
                if (i10 != 125) {
                    switch (i10) {
                        case 47:
                            return N5(15);
                        case 48:
                            return L5();
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            return M5(i10);
                    }
                } else if ((this.O & J2) != 0) {
                    return u4();
                }
            } else if ((this.O & J2) != 0) {
                return t4();
            }
            return Q5(true, i10);
        }
        this.D1 = 15;
        return this.U;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r9v0 ?, r9v1 ?, r9v2 ?, r9v8 ?, r9v11 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final boolean T4(int r7, int r8, 
/*
Method generation error in method: e5.a.T4(int, int, int):boolean, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ?
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p T5(int r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 32
            r1 = 14
            if (r5 > r0) goto L_0x0011
            int r5 = r4.A5(r5)
            if (r5 > 0) goto L_0x0011
            r4.D1 = r1
            w4.p r5 = r4.U
            return r5
        L_0x0011:
            r2 = 58
            r3 = 35
            if (r5 == r2) goto L_0x002c
            r2 = 47
            if (r5 != r2) goto L_0x0020
            w4.p r5 = r4.N5(r1)
            return r5
        L_0x0020:
            if (r5 != r3) goto L_0x0027
            w4.p r5 = r4.i5(r1)
            return r5
        L_0x0027:
            java.lang.String r1 = "was expecting a colon to separate field name and value"
            r4.t3(r5, r1)
        L_0x002c:
            int r5 = r4.U0
            int r1 = r4.V0
            r2 = 12
            if (r5 < r1) goto L_0x003b
            r4.D1 = r2
            w4.p r5 = w4.p.NOT_AVAILABLE
            r4.U = r5
            return r5
        L_0x003b:
            byte[] r1 = r4.H2
            byte r1 = r1[r5]
            int r5 = r5 + 1
            r4.U0 = r5
            if (r1 > r0) goto L_0x0050
            int r1 = r4.A5(r1)
            if (r1 > 0) goto L_0x0050
            r4.D1 = r2
            w4.p r5 = r4.U
            return r5
        L_0x0050:
            r4.J4()
            r5 = 34
            if (r1 != r5) goto L_0x005c
            w4.p r5 = r4.O5()
            return r5
        L_0x005c:
            if (r1 == r3) goto L_0x00ac
            r5 = 45
            if (r1 == r5) goto L_0x00a7
            r5 = 91
            if (r1 == r5) goto L_0x00a2
            r5 = 102(0x66, float:1.43E-43)
            if (r1 == r5) goto L_0x009d
            r5 = 110(0x6e, float:1.54E-43)
            if (r1 == r5) goto L_0x0098
            r5 = 116(0x74, float:1.63E-43)
            if (r1 == r5) goto L_0x0093
            r5 = 123(0x7b, float:1.72E-43)
            if (r1 == r5) goto L_0x008e
            switch(r1) {
                case 47: goto L_0x0089;
                case 48: goto L_0x0084;
                case 49: goto L_0x007f;
                case 50: goto L_0x007f;
                case 51: goto L_0x007f;
                case 52: goto L_0x007f;
                case 53: goto L_0x007f;
                case 54: goto L_0x007f;
                case 55: goto L_0x007f;
                case 56: goto L_0x007f;
                case 57: goto L_0x007f;
                default: goto L_0x0079;
            }
        L_0x0079:
            r5 = 0
            w4.p r5 = r4.Q5(r5, r1)
            return r5
        L_0x007f:
            w4.p r5 = r4.M5(r1)
            return r5
        L_0x0084:
            w4.p r5 = r4.L5()
            return r5
        L_0x0089:
            w4.p r5 = r4.N5(r2)
            return r5
        L_0x008e:
            w4.p r5 = r4.I4()
            return r5
        L_0x0093:
            w4.p r5 = r4.P5()
            return r5
        L_0x0098:
            w4.p r5 = r4.K5()
            return r5
        L_0x009d:
            w4.p r5 = r4.E5()
            return r5
        L_0x00a2:
            w4.p r5 = r4.H4()
            return r5
        L_0x00a7:
            w4.p r5 = r4.J5()
            return r5
        L_0x00ac:
            w4.p r5 = r4.i5(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.T5(int):w4.p");
    }

    public final int U4(int i10, int i11) throws IOException {
        if ((i11 & 192) != 128) {
            G4(i11 & 255, this.U0);
        }
        return ((i10 & 31) << 6) | (i11 & 63);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p U5(int r8) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 32
            r1 = 13
            if (r8 > r0) goto L_0x0011
            int r8 = r7.A5(r8)
            if (r8 > 0) goto L_0x0011
            r7.D1 = r1
            w4.p r8 = r7.U
            return r8
        L_0x0011:
            r2 = 44
            r3 = 35
            r4 = 125(0x7d, float:1.75E-43)
            r5 = 93
            if (r8 == r2) goto L_0x0058
            if (r8 != r5) goto L_0x0022
            w4.p r8 = r7.t4()
            return r8
        L_0x0022:
            if (r8 != r4) goto L_0x0029
            w4.p r8 = r7.u4()
            return r8
        L_0x0029:
            r2 = 47
            if (r8 != r2) goto L_0x0032
            w4.p r8 = r7.N5(r1)
            return r8
        L_0x0032:
            if (r8 != r3) goto L_0x0039
            w4.p r8 = r7.i5(r1)
            return r8
        L_0x0039:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "was expecting comma to separate "
            r1.append(r2)
            d5.d r2 = r7.f15474c1
            java.lang.String r2 = r2.q()
            r1.append(r2)
            java.lang.String r2 = " entries"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.t3(r8, r1)
        L_0x0058:
            d5.d r8 = r7.f15474c1
            r8.x()
            int r8 = r7.U0
            int r1 = r7.V0
            r2 = 15
            if (r8 < r1) goto L_0x006c
            r7.D1 = r2
            w4.p r8 = w4.p.NOT_AVAILABLE
            r7.U = r8
            return r8
        L_0x006c:
            byte[] r1 = r7.H2
            byte r1 = r1[r8]
            r6 = 1
            int r8 = r8 + r6
            r7.U0 = r8
            if (r1 > r0) goto L_0x0081
            int r1 = r7.A5(r1)
            if (r1 > 0) goto L_0x0081
            r7.D1 = r2
            w4.p r8 = r7.U
            return r8
        L_0x0081:
            r7.J4()
            r8 = 34
            if (r1 != r8) goto L_0x008d
            w4.p r8 = r7.O5()
            return r8
        L_0x008d:
            if (r1 == r3) goto L_0x00f9
            r8 = 45
            if (r1 == r8) goto L_0x00f4
            r8 = 91
            if (r1 == r8) goto L_0x00ef
            if (r1 == r5) goto L_0x00de
            r8 = 102(0x66, float:1.43E-43)
            if (r1 == r8) goto L_0x00d9
            r8 = 110(0x6e, float:1.54E-43)
            if (r1 == r8) goto L_0x00d4
            r8 = 116(0x74, float:1.63E-43)
            if (r1 == r8) goto L_0x00cf
            r8 = 123(0x7b, float:1.72E-43)
            if (r1 == r8) goto L_0x00ca
            if (r1 == r4) goto L_0x00be
            switch(r1) {
                case 47: goto L_0x00b9;
                case 48: goto L_0x00b4;
                case 49: goto L_0x00af;
                case 50: goto L_0x00af;
                case 51: goto L_0x00af;
                case 52: goto L_0x00af;
                case 53: goto L_0x00af;
                case 54: goto L_0x00af;
                case 55: goto L_0x00af;
                case 56: goto L_0x00af;
                case 57: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00ea
        L_0x00af:
            w4.p r8 = r7.M5(r1)
            return r8
        L_0x00b4:
            w4.p r8 = r7.L5()
            return r8
        L_0x00b9:
            w4.p r8 = r7.N5(r2)
            return r8
        L_0x00be:
            int r8 = r7.O
            int r0 = J2
            r8 = r8 & r0
            if (r8 == 0) goto L_0x00ea
            w4.p r8 = r7.u4()
            return r8
        L_0x00ca:
            w4.p r8 = r7.I4()
            return r8
        L_0x00cf:
            w4.p r8 = r7.P5()
            return r8
        L_0x00d4:
            w4.p r8 = r7.K5()
            return r8
        L_0x00d9:
            w4.p r8 = r7.E5()
            return r8
        L_0x00de:
            int r8 = r7.O
            int r0 = J2
            r8 = r8 & r0
            if (r8 == 0) goto L_0x00ea
            w4.p r8 = r7.t4()
            return r8
        L_0x00ea:
            w4.p r8 = r7.Q5(r6, r1)
            return r8
        L_0x00ef:
            w4.p r8 = r7.H4()
            return r8
        L_0x00f4:
            w4.p r8 = r7.J5()
            return r8
        L_0x00f9:
            w4.p r8 = r7.i5(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.U5(int):w4.p");
    }

    public final int V4(int i10, int i11, int i12) throws IOException {
        int i13 = i10 & 15;
        if ((i11 & 192) != 128) {
            G4(i11 & 255, this.U0);
        }
        int i14 = (i13 << 6) | (i11 & 63);
        if ((i12 & 192) != 128) {
            G4(i12 & 255, this.U0);
        }
        return (i14 << 6) | (i12 & 63);
    }

    /* renamed from: V5 */
    public x4.a Q1() {
        return this;
    }

    public final int W4(int i10, int i11, int i12, int i13) throws IOException {
        if ((i11 & 192) != 128) {
            G4(i11 & 255, this.U0);
        }
        int i14 = ((i10 & 7) << 6) | (i11 & 63);
        if ((i12 & 192) != 128) {
            G4(i12 & 255, this.U0);
        }
        int i15 = (i14 << 6) | (i12 & 63);
        if ((i13 & 192) != 128) {
            G4(i13 & 255, this.U0);
        }
        return ((i15 << 6) | (i13 & 63)) - 65536;
    }

    public final String X4() throws IOException {
        byte[] bArr = this.H2;
        int[] iArr = R2;
        int i10 = this.U0;
        int i11 = i10 + 1;
        byte b10 = bArr[i10] & 255;
        if (iArr[b10] == 0) {
            int i12 = i11 + 1;
            byte b11 = bArr[i11] & 255;
            if (iArr[b11] == 0) {
                byte b12 = (b10 << 8) | b11;
                int i13 = i12 + 1;
                byte b13 = bArr[i12] & 255;
                if (iArr[b13] == 0) {
                    byte b14 = (b12 << 8) | b13;
                    int i14 = i13 + 1;
                    byte b15 = bArr[i13] & 255;
                    if (iArr[b15] == 0) {
                        byte b16 = (b14 << 8) | b15;
                        int i15 = i14 + 1;
                        byte b17 = bArr[i14] & 255;
                        if (iArr[b17] == 0) {
                            this.f6855w1 = b16;
                            return x5(i15, b17);
                        } else if (b17 != 34) {
                            return null;
                        } else {
                            this.U0 = i15;
                            return x4(b16, 4);
                        }
                    } else if (b15 != 34) {
                        return null;
                    } else {
                        this.U0 = i14;
                        return x4(b14, 3);
                    }
                } else if (b13 != 34) {
                    return null;
                } else {
                    this.U0 = i13;
                    return x4(b12, 2);
                }
            } else if (b11 != 34) {
                return null;
            } else {
                this.U0 = i12;
                return x4(b10, 1);
            }
        } else if (b10 != 34) {
            return null;
        } else {
            this.U0 = i11;
            return "";
        }
    }

    public final p Y4(int i10, int i11, int i12) throws IOException {
        int[] iArr = this.f6853u1;
        int[] iArr2 = R2;
        while (true) {
            int i13 = this.U0;
            if (i13 >= this.V0) {
                this.f6854v1 = i10;
                this.f6856x1 = r10;
                this.f6857y1 = r11;
                this.D1 = 9;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte[] bArr = this.H2;
            this.U0 = i13 + 1;
            int i14 = bArr[i13] & 255;
            if (i14 == 39) {
                if (r11 > 0) {
                    if (i10 >= iArr.length) {
                        iArr = b.j4(iArr, iArr.length);
                        this.f6853u1 = iArr;
                    }
                    iArr[i10] = b.C4(r10, r11);
                    i10++;
                } else if (i10 == 0) {
                    return w4("");
                }
                String K = this.f6852t1.K(iArr, i10);
                if (K == null) {
                    K = s4(iArr, i10, r11);
                }
                return w4(K);
            }
            if (!(i14 == 34 || iArr2[i14] == 0)) {
                if (i14 != 92) {
                    X3(i14, "name");
                } else {
                    i14 = O4();
                    if (i14 < 0) {
                        this.D1 = 8;
                        this.E1 = 9;
                        this.f6854v1 = i10;
                        this.f6856x1 = r10;
                        this.f6857y1 = r11;
                        p pVar2 = p.NOT_AVAILABLE;
                        this.U = pVar2;
                        return pVar2;
                    }
                }
                if (i14 > 127) {
                    int i15 = 0;
                    if (r11 >= 4) {
                        if (i10 >= iArr.length) {
                            int[] j42 = b.j4(iArr, iArr.length);
                            this.f6853u1 = j42;
                            iArr = j42;
                        }
                        iArr[i10] = r10;
                        i10++;
                        r10 = 0;
                        r11 = 0;
                    }
                    int i16 = r10 << 8;
                    if (i14 < 2048) {
                        r10 = i16 | (i14 >> 6) | 192;
                        r11++;
                    } else {
                        int i17 = i16 | (i14 >> 12) | 224;
                        int i18 = r11 + 1;
                        if (i18 >= 4) {
                            if (i10 >= iArr.length) {
                                int[] j43 = b.j4(iArr, iArr.length);
                                this.f6853u1 = j43;
                                iArr = j43;
                            }
                            iArr[i10] = i17;
                            i10++;
                            i18 = 0;
                        } else {
                            i15 = i17;
                        }
                        r10 = (i15 << 8) | ((i14 >> 6) & 63) | 128;
                        r11 = i18 + 1;
                    }
                    i14 = (i14 & 63) | 128;
                }
            }
            if (r11 < 4) {
                i12 = r11 + 1;
                i11 = (r10 << 8) | i14;
            } else {
                if (i10 >= iArr.length) {
                    iArr = b.j4(iArr, iArr.length);
                    this.f6853u1 = iArr;
                }
                iArr[i10] = r10;
                i10++;
                i11 = i14;
                i12 = 1;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p Z4() throws java.io.IOException {
        /*
            r12 = this;
            int[] r0 = Q2
            byte[] r1 = r12.H2
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.u()
            h5.n r3 = r12.f15476e1
            int r3 = r3.w()
            int r4 = r12.U0
            int r5 = r12.V0
            int r5 = r5 + -5
        L_0x0016:
            int r6 = r12.V0
            r7 = 45
            if (r4 < r6) goto L_0x002a
            r12.U0 = r4
            r12.D1 = r7
            h5.n r0 = r12.f15476e1
            r0.J(r3)
            w4.p r0 = w4.p.NOT_AVAILABLE
            r12.U = r0
            return r0
        L_0x002a:
            int r6 = r2.length
            r8 = 0
            if (r3 < r6) goto L_0x0035
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.s()
            r3 = r8
        L_0x0035:
            int r6 = r12.V0
            int r9 = r2.length
            int r9 = r9 - r3
            int r9 = r9 + r4
            int r6 = java.lang.Math.min(r6, r9)
        L_0x003e:
            if (r4 >= r6) goto L_0x0016
            int r9 = r4 + 1
            byte r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r10 = r0[r4]
            if (r10 == 0) goto L_0x00fd
            r11 = 34
            if (r4 == r11) goto L_0x00fd
            r6 = 1
            if (r9 < r5) goto L_0x007b
            r12.U0 = r9
            h5.n r2 = r12.f15476e1
            r2.J(r3)
            r2 = r0[r4]
            int r3 = r12.V0
            if (r9 >= r3) goto L_0x005f
            r8 = r6
        L_0x005f:
            boolean r2 = r12.R4(r4, r2, r8)
            if (r2 != 0) goto L_0x006c
            r12.E1 = r7
            w4.p r0 = w4.p.NOT_AVAILABLE
            r12.U = r0
            return r0
        L_0x006c:
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.u()
            h5.n r3 = r12.f15476e1
            int r3 = r3.w()
            int r4 = r12.U0
            goto L_0x0016
        L_0x007b:
            if (r10 == r6) goto L_0x00e2
            r6 = 2
            if (r10 == r6) goto L_0x00d6
            r6 = 3
            if (r10 == r6) goto L_0x00c6
            r6 = 4
            if (r10 == r6) goto L_0x0095
            r6 = 32
            if (r4 >= r6) goto L_0x0090
            java.lang.String r6 = "string value"
            r12.X3(r4, r6)
            goto L_0x0093
        L_0x0090:
            r12.D4(r4)
        L_0x0093:
            r6 = r9
            goto L_0x00ea
        L_0x0095:
            byte[] r6 = r12.H2
            int r7 = r9 + 1
            byte r9 = r6[r9]
            int r10 = r7 + 1
            byte r7 = r6[r7]
            int r11 = r10 + 1
            byte r6 = r6[r10]
            int r4 = r12.W4(r4, r9, r7, r6)
            int r6 = r3 + 1
            r7 = 55296(0xd800, float:7.7486E-41)
            int r9 = r4 >> 10
            r7 = r7 | r9
            char r7 = (char) r7
            r2[r3] = r7
            int r3 = r2.length
            if (r6 < r3) goto L_0x00bd
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.s()
            r3 = r8
            goto L_0x00be
        L_0x00bd:
            r3 = r6
        L_0x00be:
            r6 = 56320(0xdc00, float:7.8921E-41)
            r4 = r4 & 1023(0x3ff, float:1.434E-42)
            r4 = r4 | r6
            r6 = r11
            goto L_0x00ea
        L_0x00c6:
            byte[] r6 = r12.H2
            int r7 = r9 + 1
            byte r9 = r6[r9]
            int r10 = r7 + 1
            byte r6 = r6[r7]
            int r4 = r12.V4(r4, r9, r6)
            r6 = r10
            goto L_0x00ea
        L_0x00d6:
            byte[] r6 = r12.H2
            int r7 = r9 + 1
            byte r6 = r6[r9]
            int r4 = r12.U4(r4, r6)
            r6 = r7
            goto L_0x00ea
        L_0x00e2:
            r12.U0 = r9
            int r4 = r12.P4()
            int r6 = r12.U0
        L_0x00ea:
            int r7 = r2.length
            if (r3 < r7) goto L_0x00f4
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.s()
            goto L_0x00f5
        L_0x00f4:
            r8 = r3
        L_0x00f5:
            int r3 = r8 + 1
            char r4 = (char) r4
            r2[r8] = r4
            r4 = r6
            goto L_0x0016
        L_0x00fd:
            r10 = 39
            if (r4 != r10) goto L_0x010f
            r12.U0 = r9
            h5.n r0 = r12.f15476e1
            r0.J(r3)
            w4.p r0 = w4.p.VALUE_STRING
            w4.p r0 = r12.K4(r0)
            return r0
        L_0x010f:
            int r10 = r3 + 1
            char r4 = (char) r4
            r2[r3] = r4
            r4 = r9
            r3 = r10
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.Z4():w4.p");
    }

    public final p a5(int i10) throws IOException {
        String str;
        Integer num;
        while (true) {
            int i11 = this.U0;
            if (i11 < this.V0) {
                byte[] bArr = this.H2;
                this.U0 = i11 + 1;
                byte b10 = bArr[i11] & 255;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            this.W0 -= 3;
                            return D5(b10);
                        }
                    } else if (b10 != 191) {
                        num = Integer.valueOf(b10);
                        str = "Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM";
                    }
                    i10++;
                } else if (b10 != 187) {
                    num = Integer.valueOf(b10);
                    str = "Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM";
                } else {
                    i10++;
                }
                k3(str, num);
                i10++;
            } else {
                this.f6856x1 = i10;
                this.D1 = 1;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
        }
    }

    public final p b5(int i10, boolean z10) throws IOException {
        while (true) {
            int i11 = this.U0;
            if (i11 >= this.V0) {
                this.D1 = z10 ? 52 : 53;
                this.f6856x1 = i10;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte[] bArr = this.H2;
            int i12 = i11 + 1;
            this.U0 = i12;
            byte b10 = bArr[i11] & 255;
            if (b10 < 32) {
                if (b10 == 10) {
                    this.X0++;
                } else if (b10 == 13) {
                    this.I1++;
                } else if (b10 != 9) {
                    v3(b10);
                }
                this.Y0 = i12;
            } else if (b10 == 42) {
                z10 = true;
            } else if (b10 == 47 && z10) {
                return B5(i10);
            }
            z10 = false;
        }
    }

    public void c(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.U0;
        int i13 = this.V0;
        if (i12 < i13) {
            k3("Still have %d undecoded bytes, should not call 'feedInput'", Integer.valueOf(i13 - i12));
        }
        if (i11 < i10) {
            l3("Input end (%d) may not be before start (%d)", Integer.valueOf(i11), Integer.valueOf(i10));
        }
        if (this.F1) {
            j3("Already closed, can not feed more input");
        }
        this.W0 += (long) this.I2;
        this.Y0 = i10 - (this.V0 - this.Y0);
        this.H1 = i10;
        this.H2 = bArr;
        this.U0 = i10;
        this.V0 = i11;
        this.I2 = i11 - i10;
    }

    public final p c5(int i10) throws IOException {
        int i11;
        while (true) {
            int i12 = this.U0;
            if (i12 >= this.V0) {
                this.D1 = 54;
                this.f6856x1 = i10;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte[] bArr = this.H2;
            i11 = i12 + 1;
            this.U0 = i11;
            byte b10 = bArr[i12] & 255;
            if (b10 < 32) {
                if (b10 == 10) {
                    this.X0++;
                    break;
                } else if (b10 == 13) {
                    this.I1++;
                    break;
                } else if (b10 != 9) {
                    v3(b10);
                }
            }
        }
        this.Y0 = i11;
        return B5(i10);
    }

    public p d5() throws IOException {
        do {
            int i10 = this.U0;
            if (i10 < this.V0) {
                byte[] bArr = this.H2;
                this.U0 = i10 + 1;
                char c10 = (char) bArr[i10];
                if (!Character.isJavaIdentifierPart(c10)) {
                    break;
                }
                this.f15476e1.a(c10);
            } else {
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
        } while (this.f15476e1.K() < 256);
        return z5(this.f15476e1.l());
    }

    public p e5() throws IOException {
        return z5(this.f15476e1.l());
    }

    public void f() {
        this.F1 = true;
    }

    public final p f5() throws IOException {
        int i10;
        int i11;
        int Q4 = Q4(this.f6858z1, this.A1);
        if (Q4 < 0) {
            this.D1 = 8;
            return p.NOT_AVAILABLE;
        }
        int i12 = this.f6854v1;
        int[] iArr = this.f6853u1;
        if (i12 >= iArr.length) {
            this.f6853u1 = b.j4(iArr, 32);
        }
        int i13 = this.f6856x1;
        int i14 = this.f6857y1;
        int i15 = 1;
        if (Q4 > 127) {
            int i16 = 0;
            if (i14 >= 4) {
                int[] iArr2 = this.f6853u1;
                int i17 = this.f6854v1;
                this.f6854v1 = i17 + 1;
                iArr2[i17] = i13;
                i13 = 0;
                i14 = 0;
            }
            int i18 = i13 << 8;
            if (Q4 < 2048) {
                i11 = (Q4 >> 6) | 192;
            } else {
                int i19 = i18 | (Q4 >> 12) | 224;
                i10++;
                if (i10 >= 4) {
                    int[] iArr3 = this.f6853u1;
                    int i20 = this.f6854v1;
                    this.f6854v1 = i20 + 1;
                    iArr3[i20] = i19;
                    i10 = 0;
                } else {
                    i16 = i19;
                }
                i18 = i16 << 8;
                i11 = ((Q4 >> 6) & 63) | 128;
            }
            i13 = i18 | i11;
            i14 = i10 + 1;
            Q4 = (Q4 & 63) | 128;
        }
        if (i14 < 4) {
            i15 = 1 + i14;
            Q4 |= i13 << 8;
        } else {
            int[] iArr4 = this.f6853u1;
            int i21 = this.f6854v1;
            this.f6854v1 = i21 + 1;
            iArr4[i21] = i13;
        }
        return this.E1 == 9 ? Y4(this.f6854v1, Q4, i15) : w5(this.f6854v1, Q4, i15);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r6v0 ?, r6v1 ?, r6v2 ?, r6v6 ?, r6v9 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public w4.p g5(boolean r5, 
/*
Method generation error in method: e5.a.g5(boolean, int):w4.p, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ?
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

    public final boolean h() {
        return this.U0 >= this.V0 && !this.F1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.p h5() throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r6.f15489r1
            h5.n r1 = r6.f15476e1
            char[] r1 = r1.u()
            h5.n r2 = r6.f15476e1
            int r2 = r2.w()
        L_0x000e:
            byte[] r3 = r6.H2
            int r4 = r6.U0
            int r5 = r4 + 1
            r6.U0 = r5
            byte r3 = r3[r4]
            r4 = 48
            if (r3 < r4) goto L_0x0042
            r4 = 57
            if (r3 > r4) goto L_0x0042
            int r0 = r0 + 1
            int r4 = r1.length
            if (r2 < r4) goto L_0x002b
            h5.n r1 = r6.f15476e1
            char[] r1 = r1.q()
        L_0x002b:
            int r4 = r2 + 1
            char r3 = (char) r3
            r1[r2] = r3
            int r2 = r6.U0
            int r3 = r6.V0
            if (r2 < r3) goto L_0x0040
            h5.n r1 = r6.f15476e1
            r1.J(r4)
            r6.f15489r1 = r0
            w4.p r0 = w4.p.NOT_AVAILABLE
            return r0
        L_0x0040:
            r2 = r4
            goto L_0x000e
        L_0x0042:
            if (r0 != 0) goto L_0x0049
            java.lang.String r1 = "Decimal point not followed by a digit"
            r6.E3(r3, r1)
        L_0x0049:
            r6.f15489r1 = r0
            h5.n r0 = r6.f15476e1
            r0.J(r2)
            r0 = 101(0x65, float:1.42E-43)
            r1 = 0
            r4 = 1
            if (r3 == r0) goto L_0x006e
            r0 = 69
            if (r3 != r0) goto L_0x005b
            goto L_0x006e
        L_0x005b:
            int r0 = r6.U0
            int r0 = r0 - r4
            r6.U0 = r0
            h5.n r0 = r6.f15476e1
            r0.J(r2)
            r6.f15490s1 = r1
            w4.p r0 = w4.p.VALUE_NUMBER_FLOAT
            w4.p r0 = r6.K4(r0)
            return r0
        L_0x006e:
            h5.n r0 = r6.f15476e1
            char r2 = (char) r3
            r0.a(r2)
            r6.f15490s1 = r1
            int r0 = r6.U0
            int r1 = r6.V0
            if (r0 < r1) goto L_0x0083
            r0 = 31
            r6.D1 = r0
            w4.p r0 = w4.p.NOT_AVAILABLE
            return r0
        L_0x0083:
            r1 = 32
            r6.D1 = r1
            byte[] r1 = r6.H2
            int r2 = r0 + 1
            r6.U0 = r2
            byte r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            w4.p r0 = r6.g5(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.h5():w4.p");
    }

    public final p i5(int i10) throws IOException {
        int i11;
        if ((this.O & P2) == 0) {
            t3(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i12 = this.U0;
            if (i12 >= this.V0) {
                this.D1 = 55;
                this.f6856x1 = i10;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte[] bArr = this.H2;
            i11 = i12 + 1;
            this.U0 = i11;
            byte b10 = bArr[i12] & 255;
            if (b10 < 32) {
                if (b10 == 10) {
                    this.X0++;
                    break;
                } else if (b10 == 13) {
                    this.I1++;
                    break;
                } else if (b10 != 9) {
                    v3(b10);
                }
            }
        }
        this.Y0 = i11;
        return B5(i10);
    }

    public p j5(String str, int i10, p pVar) throws IOException {
        int length = str.length();
        while (true) {
            int i11 = this.U0;
            if (i11 >= this.V0) {
                this.f6856x1 = i10;
                p pVar2 = p.NOT_AVAILABLE;
                this.U = pVar2;
                return pVar2;
            }
            byte b10 = this.H2[i11];
            if (i10 == length) {
                if (b10 < 48 || b10 == 93 || b10 == 125) {
                    return K4(pVar);
                }
            } else if (b10 != str.charAt(i10)) {
                break;
            } else {
                i10++;
                this.U0++;
            }
        }
        this.D1 = 50;
        this.f15476e1.C(str, 0, i10);
        return d5();
    }

    public p k5(String str, int i10, p pVar) throws IOException {
        if (i10 == str.length()) {
            this.U = pVar;
            return pVar;
        }
        this.f15476e1.C(str, 0, i10);
        return e5();
    }

    public p l5(int i10, int i11) throws IOException {
        String B4 = B4(i10);
        int length = B4.length();
        while (true) {
            int i12 = this.U0;
            if (i12 >= this.V0) {
                this.G1 = i10;
                this.f6856x1 = i11;
                this.D1 = 19;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte b10 = this.H2[i12];
            if (i11 == length) {
                if (b10 < 48 || b10 == 93 || b10 == 125) {
                    return M4(i10);
                }
            } else if (b10 != B4.charAt(i11)) {
                break;
            } else {
                i11++;
                this.U0++;
            }
        }
        this.D1 = 50;
        this.f15476e1.C(B4, 0, i11);
        return d5();
    }

    public p m5(int i10, int i11) throws IOException {
        String B4 = B4(i10);
        if (i11 == B4.length()) {
            return M4(i10);
        }
        this.f15476e1.C(B4, 0, i11);
        return e5();
    }

    public p n5(char[] cArr, int i10) throws IOException {
        int i11 = this.f15487p1 ? -1 : 0;
        while (true) {
            int i12 = this.U0;
            if (i12 >= this.V0) {
                this.D1 = 26;
                this.f15476e1.J(i10);
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte b10 = this.H2[i12] & 255;
            if (b10 < 48) {
                if (b10 == 46) {
                    this.f15488q1 = i11 + i10;
                    this.U0 = i12 + 1;
                    return H5(cArr, i10, b10);
                }
            } else if (b10 <= 57) {
                this.U0 = i12 + 1;
                if (i10 >= cArr.length) {
                    cArr = this.f15476e1.q();
                }
                cArr[i10] = (char) b10;
                i10++;
            } else if (b10 == 101 || b10 == 69) {
                this.f15488q1 = i11 + i10;
                this.U0 = i12 + 1;
                return H5(cArr, i10, b10);
            }
        }
        this.f15488q1 = i11 + i10;
        this.f15476e1.J(i10);
        return K4(p.VALUE_NUMBER_INT);
    }

    public p o5() throws IOException {
        byte b10;
        do {
            int i10 = this.U0;
            if (i10 >= this.V0) {
                this.D1 = 25;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte[] bArr = this.H2;
            this.U0 = i10 + 1;
            b10 = bArr[i10] & 255;
            if (b10 < 48) {
                if (b10 == 46) {
                    char[] n10 = this.f15476e1.n();
                    n10[0] = '-';
                    n10[1] = '0';
                    this.f15488q1 = 1;
                    return H5(n10, 2, b10);
                }
            } else if (b10 > 57) {
                if (b10 == 101 || b10 == 69) {
                    char[] n11 = this.f15476e1.n();
                    n11[0] = '-';
                    n11[1] = '0';
                    this.f15488q1 = 1;
                    return H5(n11, 2, b10);
                } else if (!(b10 == 93 || b10 == 125)) {
                    E3(b10, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this.O & K2) == 0) {
                x3("Leading zeroes not allowed");
                continue;
            }
            this.U0--;
            return L4(0, "0");
        } while (b10 == 48);
        char[] n12 = this.f15476e1.n();
        n12[0] = '-';
        n12[1] = (char) b10;
        this.f15488q1 = 1;
        return n5(n12, 2);
    }

    public p p5() throws IOException {
        byte b10;
        do {
            int i10 = this.U0;
            if (i10 >= this.V0) {
                this.D1 = 24;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte[] bArr = this.H2;
            this.U0 = i10 + 1;
            b10 = bArr[i10] & 255;
            if (b10 < 48) {
                if (b10 == 46) {
                    char[] n10 = this.f15476e1.n();
                    n10[0] = '0';
                    this.f15488q1 = 1;
                    return H5(n10, 1, b10);
                }
            } else if (b10 > 57) {
                if (b10 == 101 || b10 == 69) {
                    char[] n11 = this.f15476e1.n();
                    n11[0] = '0';
                    this.f15488q1 = 1;
                    return H5(n11, 1, b10);
                } else if (!(b10 == 93 || b10 == 125)) {
                    E3(b10, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this.O & K2) == 0) {
                x3("Leading zeroes not allowed");
                continue;
            }
            this.U0--;
            return L4(0, "0");
        } while (b10 == 48);
        char[] n12 = this.f15476e1.n();
        n12[0] = (char) b10;
        this.f15488q1 = 1;
        return n5(n12, 1);
    }

    public p q5(int i10) throws IOException {
        if (i10 > 48) {
            if (i10 > 57) {
                if (i10 == 73) {
                    return l5(3, 2);
                }
            }
            char[] n10 = this.f15476e1.n();
            n10[0] = '-';
            n10[1] = (char) i10;
            this.f15488q1 = 1;
            return n5(n10, 2);
        } else if (i10 == 48) {
            return o5();
        }
        E3(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        char[] n102 = this.f15476e1.n();
        n102[0] = '-';
        n102[1] = (char) i10;
        this.f15488q1 = 1;
        return n5(n102, 2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p r5() throws java.io.IOException {
        /*
            r12 = this;
            int[] r0 = Q2
            byte[] r1 = r12.H2
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.u()
            h5.n r3 = r12.f15476e1
            int r3 = r3.w()
            int r4 = r12.U0
            int r5 = r12.V0
            int r5 = r5 + -5
        L_0x0016:
            int r6 = r12.V0
            r7 = 40
            if (r4 < r6) goto L_0x002a
            r12.U0 = r4
            r12.D1 = r7
            h5.n r0 = r12.f15476e1
            r0.J(r3)
            w4.p r0 = w4.p.NOT_AVAILABLE
            r12.U = r0
            return r0
        L_0x002a:
            int r6 = r2.length
            r8 = 0
            if (r3 < r6) goto L_0x0035
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.s()
            r3 = r8
        L_0x0035:
            int r6 = r12.V0
            int r9 = r2.length
            int r9 = r9 - r3
            int r9 = r9 + r4
            int r6 = java.lang.Math.min(r6, r9)
        L_0x003e:
            if (r4 >= r6) goto L_0x0016
            int r9 = r4 + 1
            byte r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r10 = r0[r4]
            if (r10 == 0) goto L_0x010b
            r6 = 34
            if (r4 != r6) goto L_0x005c
            r12.U0 = r9
            h5.n r0 = r12.f15476e1
            r0.J(r3)
            w4.p r0 = w4.p.VALUE_STRING
            w4.p r0 = r12.K4(r0)
            return r0
        L_0x005c:
            r6 = 1
            if (r9 < r5) goto L_0x0089
            r12.U0 = r9
            h5.n r2 = r12.f15476e1
            r2.J(r3)
            r2 = r0[r4]
            int r3 = r12.V0
            if (r9 >= r3) goto L_0x006d
            r8 = r6
        L_0x006d:
            boolean r2 = r12.R4(r4, r2, r8)
            if (r2 != 0) goto L_0x007a
            r12.E1 = r7
            w4.p r0 = w4.p.NOT_AVAILABLE
            r12.U = r0
            return r0
        L_0x007a:
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.u()
            h5.n r3 = r12.f15476e1
            int r3 = r3.w()
            int r4 = r12.U0
            goto L_0x0016
        L_0x0089:
            if (r10 == r6) goto L_0x00f0
            r6 = 2
            if (r10 == r6) goto L_0x00e4
            r6 = 3
            if (r10 == r6) goto L_0x00d4
            r6 = 4
            if (r10 == r6) goto L_0x00a3
            r6 = 32
            if (r4 >= r6) goto L_0x009e
            java.lang.String r6 = "string value"
            r12.X3(r4, r6)
            goto L_0x00a1
        L_0x009e:
            r12.D4(r4)
        L_0x00a1:
            r6 = r9
            goto L_0x00f8
        L_0x00a3:
            byte[] r6 = r12.H2
            int r7 = r9 + 1
            byte r9 = r6[r9]
            int r10 = r7 + 1
            byte r7 = r6[r7]
            int r11 = r10 + 1
            byte r6 = r6[r10]
            int r4 = r12.W4(r4, r9, r7, r6)
            int r6 = r3 + 1
            r7 = 55296(0xd800, float:7.7486E-41)
            int r9 = r4 >> 10
            r7 = r7 | r9
            char r7 = (char) r7
            r2[r3] = r7
            int r3 = r2.length
            if (r6 < r3) goto L_0x00cb
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.s()
            r3 = r8
            goto L_0x00cc
        L_0x00cb:
            r3 = r6
        L_0x00cc:
            r6 = 56320(0xdc00, float:7.8921E-41)
            r4 = r4 & 1023(0x3ff, float:1.434E-42)
            r4 = r4 | r6
            r6 = r11
            goto L_0x00f8
        L_0x00d4:
            byte[] r6 = r12.H2
            int r7 = r9 + 1
            byte r9 = r6[r9]
            int r10 = r7 + 1
            byte r6 = r6[r7]
            int r4 = r12.V4(r4, r9, r6)
            r6 = r10
            goto L_0x00f8
        L_0x00e4:
            byte[] r6 = r12.H2
            int r7 = r9 + 1
            byte r6 = r6[r9]
            int r4 = r12.U4(r4, r6)
            r6 = r7
            goto L_0x00f8
        L_0x00f0:
            r12.U0 = r9
            int r4 = r12.P4()
            int r6 = r12.U0
        L_0x00f8:
            int r7 = r2.length
            if (r3 < r7) goto L_0x0102
            h5.n r2 = r12.f15476e1
            char[] r2 = r2.s()
            goto L_0x0103
        L_0x0102:
            r8 = r3
        L_0x0103:
            int r3 = r8 + 1
            char r4 = (char) r4
            r2[r8] = r4
            r4 = r6
            goto L_0x0016
        L_0x010b:
            int r10 = r3 + 1
            char r4 = (char) r4
            r2[r3] = r4
            r4 = r9
            r3 = r10
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.r5():w4.p");
    }

    public final p s5() throws IOException {
        int i10 = this.D1;
        if (i10 == 1) {
            return a5(this.f6856x1);
        }
        if (i10 == 4) {
            byte[] bArr = this.H2;
            int i11 = this.U0;
            this.U0 = i11 + 1;
            return F5(bArr[i11] & 255);
        } else if (i10 != 5) {
            switch (i10) {
                case 7:
                    return w5(this.f6854v1, this.f6856x1, this.f6857y1);
                case 8:
                    return f5();
                case 9:
                    return Y4(this.f6854v1, this.f6856x1, this.f6857y1);
                case 10:
                    return u5(this.f6854v1, this.f6856x1, this.f6857y1);
                default:
                    switch (i10) {
                        case 12:
                            byte[] bArr2 = this.H2;
                            int i12 = this.U0;
                            this.U0 = i12 + 1;
                            return R5(bArr2[i12] & 255);
                        case 13:
                            byte[] bArr3 = this.H2;
                            int i13 = this.U0;
                            this.U0 = i13 + 1;
                            return U5(bArr3[i13] & 255);
                        case 14:
                            byte[] bArr4 = this.H2;
                            int i14 = this.U0;
                            this.U0 = i14 + 1;
                            return T5(bArr4[i14] & 255);
                        case 15:
                            byte[] bArr5 = this.H2;
                            int i15 = this.U0;
                            this.U0 = i15 + 1;
                            return S5(bArr5[i15] & 255);
                        case 16:
                            return j5("null", this.f6856x1, p.VALUE_NULL);
                        case 17:
                            return j5("true", this.f6856x1, p.VALUE_TRUE);
                        case 18:
                            return j5("false", this.f6856x1, p.VALUE_FALSE);
                        case 19:
                            return l5(this.G1, this.f6856x1);
                        default:
                            switch (i10) {
                                case 23:
                                    byte[] bArr6 = this.H2;
                                    int i16 = this.U0;
                                    this.U0 = i16 + 1;
                                    return q5(bArr6[i16] & 255);
                                case 24:
                                    return p5();
                                case 25:
                                    return o5();
                                case 26:
                                    return n5(this.f15476e1.u(), this.f15476e1.w());
                                default:
                                    switch (i10) {
                                        case 30:
                                            return h5();
                                        case 31:
                                            byte[] bArr7 = this.H2;
                                            int i17 = this.U0;
                                            this.U0 = i17 + 1;
                                            return g5(true, bArr7[i17] & 255);
                                        case 32:
                                            byte[] bArr8 = this.H2;
                                            int i18 = this.U0;
                                            this.U0 = i18 + 1;
                                            return g5(false, bArr8[i18] & 255);
                                        default:
                                            switch (i10) {
                                                case 40:
                                                    return r5();
                                                case 41:
                                                    int Q4 = Q4(this.f6858z1, this.A1);
                                                    if (Q4 < 0) {
                                                        return p.NOT_AVAILABLE;
                                                    }
                                                    this.f15476e1.a((char) Q4);
                                                    return this.E1 == 45 ? Z4() : r5();
                                                case 42:
                                                    n nVar = this.f15476e1;
                                                    int i19 = this.f6856x1;
                                                    byte[] bArr9 = this.H2;
                                                    int i20 = this.U0;
                                                    this.U0 = i20 + 1;
                                                    nVar.a((char) U4(i19, bArr9[i20]));
                                                    return this.E1 == 45 ? Z4() : r5();
                                                case 43:
                                                    int i21 = this.f6856x1;
                                                    int i22 = this.f6857y1;
                                                    byte[] bArr10 = this.H2;
                                                    int i23 = this.U0;
                                                    this.U0 = i23 + 1;
                                                    return !S4(i21, i22, bArr10[i23]) ? p.NOT_AVAILABLE : this.E1 == 45 ? Z4() : r5();
                                                case 44:
                                                    int i24 = this.f6856x1;
                                                    int i25 = this.f6857y1;
                                                    byte[] bArr11 = this.H2;
                                                    int i26 = this.U0;
                                                    this.U0 = i26 + 1;
                                                    return !T4(i24, i25, bArr11[i26]) ? p.NOT_AVAILABLE : this.E1 == 45 ? Z4() : r5();
                                                case 45:
                                                    return Z4();
                                                default:
                                                    switch (i10) {
                                                        case 50:
                                                            return d5();
                                                        case 51:
                                                            return N5(this.f6856x1);
                                                        case 52:
                                                            return b5(this.f6856x1, true);
                                                        case 53:
                                                            return b5(this.f6856x1, false);
                                                        case 54:
                                                            return c5(this.f6856x1);
                                                        case 55:
                                                            return i5(this.f6856x1);
                                                        default:
                                                            h5.p.f();
                                                            return null;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            byte[] bArr12 = this.H2;
            int i27 = this.U0;
            this.U0 = i27 + 1;
            return G5(bArr12[i27] & 255);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        p3(": was expecting closing '*/' for comment", w4.p.NOT_AVAILABLE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        return v4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        return K4(w4.p.VALUE_NUMBER_FLOAT);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p t5() throws java.io.IOException {
        /*
            r3 = this;
            w4.p r0 = r3.U
            int r1 = r3.D1
            r2 = 3
            if (r1 == r2) goto L_0x00a6
            r2 = 12
            if (r1 == r2) goto L_0x00a1
            r2 = 50
            if (r1 == r2) goto L_0x009c
            switch(r1) {
                case 16: goto L_0x0091;
                case 17: goto L_0x0086;
                case 18: goto L_0x007b;
                case 19: goto L_0x0072;
                default: goto L_0x0012;
            }
        L_0x0012:
            r2 = 0
            switch(r1) {
                case 24: goto L_0x006b;
                case 25: goto L_0x006b;
                case 26: goto L_0x0056;
                default: goto L_0x0016;
            }
        L_0x0016:
            switch(r1) {
                case 30: goto L_0x004d;
                case 31: goto L_0x003a;
                case 32: goto L_0x004f;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r1) {
                case 52: goto L_0x0041;
                case 53: goto L_0x0041;
                case 54: goto L_0x0048;
                case 55: goto L_0x0048;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ": was expecting rest of token (internal state: "
            r1.append(r2)
            int r2 = r3.D1
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            w4.p r2 = r3.U
            r3.p3(r1, r2)
            return r0
        L_0x003a:
            w4.p r0 = w4.p.VALUE_NUMBER_FLOAT
            java.lang.String r1 = ": was expecting fraction after exponent marker"
            r3.p3(r1, r0)
        L_0x0041:
            w4.p r0 = w4.p.NOT_AVAILABLE
            java.lang.String r1 = ": was expecting closing '*/' for comment"
            r3.p3(r1, r0)
        L_0x0048:
            w4.p r0 = r3.v4()
            return r0
        L_0x004d:
            r3.f15490s1 = r2
        L_0x004f:
            w4.p r0 = w4.p.VALUE_NUMBER_FLOAT
            w4.p r0 = r3.K4(r0)
            return r0
        L_0x0056:
            h5.n r0 = r3.f15476e1
            int r0 = r0.w()
            boolean r1 = r3.f15487p1
            if (r1 == 0) goto L_0x0062
            int r0 = r0 + -1
        L_0x0062:
            r3.f15488q1 = r0
            w4.p r0 = w4.p.VALUE_NUMBER_INT
            w4.p r0 = r3.K4(r0)
            return r0
        L_0x006b:
            java.lang.String r0 = "0"
            w4.p r0 = r3.L4(r2, r0)
            return r0
        L_0x0072:
            int r0 = r3.G1
            int r1 = r3.f6856x1
            w4.p r0 = r3.m5(r0, r1)
            return r0
        L_0x007b:
            int r0 = r3.f6856x1
            w4.p r1 = w4.p.VALUE_FALSE
            java.lang.String r2 = "false"
            w4.p r0 = r3.k5(r2, r0, r1)
            return r0
        L_0x0086:
            int r0 = r3.f6856x1
            w4.p r1 = w4.p.VALUE_TRUE
            java.lang.String r2 = "true"
            w4.p r0 = r3.k5(r2, r0, r1)
            return r0
        L_0x0091:
            int r0 = r3.f6856x1
            w4.p r1 = w4.p.VALUE_NULL
            java.lang.String r2 = "null"
            w4.p r0 = r3.k5(r2, r0, r1)
            return r0
        L_0x009c:
            w4.p r0 = r3.e5()
            return r0
        L_0x00a1:
            w4.p r0 = r3.v4()
            return r0
        L_0x00a6:
            w4.p r0 = r3.v4()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.t5():w4.p");
    }

    public final p u5(int i10, int i11, int i12) throws IOException {
        int[] iArr = this.f6853u1;
        int[] l10 = c5.a.l();
        while (true) {
            int i13 = this.U0;
            if (i13 >= this.V0) {
                this.f6854v1 = i10;
                this.f6856x1 = i11;
                this.f6857y1 = i12;
                this.D1 = 10;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte b10 = this.H2[i13] & 255;
            if (l10[b10] != 0) {
                if (i12 > 0) {
                    if (i10 >= iArr.length) {
                        iArr = b.j4(iArr, iArr.length);
                        this.f6853u1 = iArr;
                    }
                    iArr[i10] = i11;
                    i10++;
                }
                String K = this.f6852t1.K(iArr, i10);
                if (K == null) {
                    K = s4(iArr, i10, i12);
                }
                return w4(K);
            }
            this.U0 = i13 + 1;
            if (i12 < 4) {
                i12++;
                i11 = (i11 << 8) | b10;
            } else {
                if (i10 >= iArr.length) {
                    iArr = b.j4(iArr, iArr.length);
                    this.f6853u1 = iArr;
                }
                iArr[i10] = i11;
                i11 = b10;
                i12 = 1;
                i10++;
            }
        }
    }

    public final p v5(int i10) throws IOException {
        if (i10 != 35) {
            if (i10 != 39) {
                if (i10 == 47) {
                    return N5(4);
                }
                if (i10 == 93) {
                    return t4();
                }
            } else if ((this.O & M2) != 0) {
                return Y4(0, 0, 0);
            }
        } else if ((this.O & P2) != 0) {
            return i5(4);
        }
        if ((this.O & N2) == 0) {
            t3((char) i10, "was expecting double-quote to start field name");
        }
        if (c5.a.l()[i10] != 0) {
            t3(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return u5(0, i10, 1);
    }

    public final p w5(int i10, int i11, int i12) throws IOException {
        int i13;
        int[] iArr = this.f6853u1;
        int[] iArr2 = R2;
        while (true) {
            int i14 = this.U0;
            if (i14 >= this.V0) {
                this.f6854v1 = i10;
                this.f6856x1 = i11;
                this.f6857y1 = i12;
                this.D1 = 7;
                p pVar = p.NOT_AVAILABLE;
                this.U = pVar;
                return pVar;
            }
            byte[] bArr = this.H2;
            this.U0 = i14 + 1;
            int i15 = bArr[i14] & 255;
            if (iArr2[i15] == 0) {
                if (i12 >= 4) {
                    if (i10 >= iArr.length) {
                        int[] j42 = b.j4(iArr, iArr.length);
                        this.f6853u1 = j42;
                        iArr = j42;
                    }
                    i13 = i10 + 1;
                    iArr[i10] = i11;
                    i10 = i13;
                    i12 = 1;
                    i11 = i15;
                }
            } else if (i15 == 34) {
                if (i12 > 0) {
                    if (i10 >= iArr.length) {
                        iArr = b.j4(iArr, iArr.length);
                        this.f6853u1 = iArr;
                    }
                    iArr[i10] = b.C4(i11, i12);
                    i10++;
                } else if (i10 == 0) {
                    return w4("");
                }
                String K = this.f6852t1.K(iArr, i10);
                if (K == null) {
                    K = s4(iArr, i10, i12);
                }
                return w4(K);
            } else {
                if (i15 != 92) {
                    X3(i15, "name");
                } else {
                    i15 = O4();
                    if (i15 < 0) {
                        this.D1 = 8;
                        this.E1 = 7;
                        this.f6854v1 = i10;
                        this.f6856x1 = i11;
                        this.f6857y1 = i12;
                        p pVar2 = p.NOT_AVAILABLE;
                        this.U = pVar2;
                        return pVar2;
                    }
                }
                if (i10 >= iArr.length) {
                    iArr = b.j4(iArr, iArr.length);
                    this.f6853u1 = iArr;
                }
                if (i15 > 127) {
                    int i16 = 0;
                    if (i12 >= 4) {
                        iArr[i10] = i11;
                        i10++;
                        i11 = 0;
                        i12 = 0;
                    }
                    int i17 = i11 << 8;
                    if (i15 < 2048) {
                        r10 = i17 | (i15 >> 6) | 192;
                        r11 = i12 + 1;
                    } else {
                        int i18 = i17 | (i15 >> 12) | 224;
                        int i19 = i12 + 1;
                        if (i19 >= 4) {
                            iArr[i10] = i18;
                            i10++;
                            i19 = 0;
                        } else {
                            i16 = i18;
                        }
                        r10 = (i16 << 8) | ((i15 >> 6) & 63) | 128;
                        r11 = i19 + 1;
                    }
                    i15 = (i15 & 63) | 128;
                }
                if (i12 >= 4) {
                    i13 = i10 + 1;
                    iArr[i10] = i11;
                    i10 = i13;
                    i12 = 1;
                    i11 = i15;
                }
            }
            i12++;
            i11 = (i11 << 8) | i15;
        }
    }

    public final String x5(int i10, int i11) throws IOException {
        byte[] bArr = this.H2;
        int[] iArr = R2;
        int i12 = i10 + 1;
        byte b10 = bArr[i10] & 255;
        if (iArr[b10] == 0) {
            byte b11 = b10 | (i11 << 8);
            int i13 = i12 + 1;
            byte b12 = bArr[i12] & 255;
            if (iArr[b12] == 0) {
                byte b13 = (b11 << 8) | b12;
                int i14 = i13 + 1;
                byte b14 = bArr[i13] & 255;
                if (iArr[b14] == 0) {
                    byte b15 = (b13 << 8) | b14;
                    int i15 = i14 + 1;
                    byte b16 = bArr[i14] & 255;
                    if (iArr[b16] == 0) {
                        return y5(i15, b16, b15);
                    }
                    if (b16 != 34) {
                        return null;
                    }
                    this.U0 = i15;
                    return y4(this.f6855w1, b15, 4);
                } else if (b14 != 34) {
                    return null;
                } else {
                    this.U0 = i14;
                    return y4(this.f6855w1, b13, 3);
                }
            } else if (b12 != 34) {
                return null;
            } else {
                this.U0 = i13;
                return y4(this.f6855w1, b11, 2);
            }
        } else if (b10 != 34) {
            return null;
        } else {
            this.U0 = i12;
            return y4(this.f6855w1, i11, 1);
        }
    }

    public final String y5(int i10, int i11, int i12) throws IOException {
        byte[] bArr = this.H2;
        int[] iArr = R2;
        int i13 = i10 + 1;
        byte b10 = bArr[i10] & 255;
        if (iArr[b10] == 0) {
            byte b11 = b10 | (i11 << 8);
            int i14 = i13 + 1;
            byte b12 = bArr[i13] & 255;
            if (iArr[b12] == 0) {
                byte b13 = (b11 << 8) | b12;
                int i15 = i14 + 1;
                byte b14 = bArr[i14] & 255;
                if (iArr[b14] == 0) {
                    byte b15 = (b13 << 8) | b14;
                    int i16 = i15 + 1;
                    if ((bArr[i15] & 255) != 34) {
                        return null;
                    }
                    this.U0 = i16;
                    return z4(this.f6855w1, i12, b15, 4);
                } else if (b14 != 34) {
                    return null;
                } else {
                    this.U0 = i15;
                    return z4(this.f6855w1, i12, b13, 3);
                }
            } else if (b12 != 34) {
                return null;
            } else {
                this.U0 = i14;
                return z4(this.f6855w1, i12, b11, 2);
            }
        } else if (b10 != 34) {
            return null;
        } else {
            this.U0 = i13;
            return z4(this.f6855w1, i12, i11, 1);
        }
    }

    public p z5(String str) throws IOException {
        l3("Unrecognized token '%s': was expecting %s", this.f15476e1.l(), Y3());
        return p.NOT_AVAILABLE;
    }
}
