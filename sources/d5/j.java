package d5;

import c5.a;
import c5.d;
import h5.c;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import w4.k;
import w4.l;
import w4.p;
import w4.s;
import y4.b;

public class j extends b {
    public static final byte A1 = 10;
    public static final int B1 = l.a.ALLOW_TRAILING_COMMA.e();
    public static final int C1 = l.a.ALLOW_NUMERIC_LEADING_ZEROS.e();
    public static final int D1 = l.a.ALLOW_NON_NUMERIC_NUMBERS.e();
    public static final int E1 = l.a.ALLOW_MISSING_VALUES.e();
    public static final int F1 = l.a.ALLOW_SINGLE_QUOTES.e();
    public static final int G1 = l.a.ALLOW_UNQUOTED_FIELD_NAMES.e();
    public static final int H1 = l.a.ALLOW_COMMENTS.e();
    public static final int I1 = l.a.ALLOW_YAML_COMMENTS.e();
    public static final int[] J1 = a.k();
    public static final int[] K1 = a.i();

    /* renamed from: t1  reason: collision with root package name */
    public s f6140t1;

    /* renamed from: u1  reason: collision with root package name */
    public final f5.a f6141u1;

    /* renamed from: v1  reason: collision with root package name */
    public int[] f6142v1 = new int[16];

    /* renamed from: w1  reason: collision with root package name */
    public boolean f6143w1;

    /* renamed from: x1  reason: collision with root package name */
    public int f6144x1;

    /* renamed from: y1  reason: collision with root package name */
    public DataInput f6145y1;

    /* renamed from: z1  reason: collision with root package name */
    public int f6146z1;

    public j(d dVar, int i10, DataInput dataInput, s sVar, f5.a aVar, int i11) {
        super(dVar, i10);
        this.f6140t1 = sVar;
        this.f6141u1 = aVar;
        this.f6145y1 = dataInput;
        this.f6146z1 = i11;
    }

    public static int[] C4(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : Arrays.copyOf(iArr, iArr.length + i10);
    }

    public static final int t5(int i10, int i11) {
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

    public final void A4(char[] cArr, int i10, int i11) throws IOException {
        int[] iArr = J1;
        int length = cArr.length;
        while (true) {
            int i12 = iArr[i11];
            int i13 = 0;
            if (i12 == 0) {
                if (i10 >= length) {
                    cArr = this.f15476e1.s();
                    length = cArr.length;
                    i10 = 0;
                }
                cArr[i10] = (char) i11;
                i11 = this.f6145y1.readUnsignedByte();
                i10++;
            } else if (i11 == 34) {
                this.f15476e1.J(i10);
                return;
            } else {
                if (i12 == 1) {
                    i11 = J3();
                } else if (i12 == 2) {
                    i11 = w4(i11);
                } else if (i12 == 3) {
                    i11 = x4(i11);
                } else if (i12 == 4) {
                    int y42 = y4(i11);
                    if (i10 >= cArr.length) {
                        cArr = this.f15476e1.s();
                        length = cArr.length;
                        i10 = 0;
                    }
                    cArr[i10] = (char) (55296 | (y42 >> 10));
                    i11 = (y42 & 1023) | 56320;
                    i10++;
                } else if (i11 < 32) {
                    X3(i11, "string value");
                } else {
                    V4(i11);
                }
                if (i10 >= cArr.length) {
                    cArr = this.f15476e1.s();
                    length = cArr.length;
                } else {
                    i13 = i10;
                }
                i10 = i13 + 1;
                cArr[i13] = (char) i11;
                i11 = this.f6145y1.readUnsignedByte();
            }
        }
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

    public final String B4(p pVar) {
        if (pVar == null) {
            return null;
        }
        int e10 = pVar.e();
        return e10 != 5 ? (e10 == 6 || e10 == 7 || e10 == 8) ? this.f15476e1.l() : pVar.d() : this.f15474c1.b();
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
            } else if (!this.f6143w1) {
                return this.f15476e1.l();
            } else {
                this.f6143w1 = false;
                return z4();
            }
        } else if (D2() == p.VALUE_STRING) {
            return Y1();
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r0 == 125) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.p D2() throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.T0
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            w4.p r0 = r6.U
            w4.p r2 = w4.p.FIELD_NAME
            if (r0 != r2) goto L_0x0011
            w4.p r0 = r6.J4()
            return r0
        L_0x0011:
            r0 = 0
            r6.f15481j1 = r0
            boolean r0 = r6.f6143w1
            if (r0 == 0) goto L_0x001b
            r6.f5()
        L_0x001b:
            int r0 = r6.l5()
            if (r0 >= 0) goto L_0x0027
            r6.close()
            r6.U = r1
            return r1
        L_0x0027:
            r6.f15480i1 = r1
            int r1 = r6.X0
            r6.f15472a1 = r1
            r1 = 93
            if (r0 == r1) goto L_0x0070
            r3 = 125(0x7d, float:1.75E-43)
            if (r0 != r3) goto L_0x0036
            goto L_0x0070
        L_0x0036:
            d5.d r4 = r6.f15474c1
            boolean r4 = r4.x()
            if (r4 == 0) goto L_0x0076
            r4 = 44
            if (r0 == r4) goto L_0x0061
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "was expecting comma to separate "
            r4.append(r5)
            d5.d r5 = r6.f15474c1
            java.lang.String r5 = r5.q()
            r4.append(r5)
            java.lang.String r5 = " entries"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r6.t3(r0, r4)
        L_0x0061:
            int r0 = r6.j5()
            int r4 = r6.O
            int r5 = B1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0076
            if (r0 == r1) goto L_0x0070
            if (r0 != r3) goto L_0x0076
        L_0x0070:
            r6.t4(r0)
        L_0x0073:
            w4.p r0 = r6.U
            return r0
        L_0x0076:
            d5.d r1 = r6.f15474c1
            boolean r1 = r1.l()
            if (r1 != 0) goto L_0x0083
            w4.p r0 = r6.K4(r0)
            return r0
        L_0x0083:
            java.lang.String r0 = r6.R4(r0)
            d5.d r1 = r6.f15474c1
            r1.B(r0)
            r6.U = r2
            int r0 = r6.b5()
            r1 = 34
            r2 = 1
            if (r0 != r1) goto L_0x009e
            r6.f6143w1 = r2
            w4.p r0 = w4.p.VALUE_STRING
        L_0x009b:
            r6.f15475d1 = r0
            goto L_0x0073
        L_0x009e:
            r1 = 45
            if (r0 == r1) goto L_0x00ea
            r1 = 46
            if (r0 == r1) goto L_0x00e5
            r1 = 91
            if (r0 == r1) goto L_0x00e2
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x00da
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L_0x00d2
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x00ca
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x00c7
            switch(r0) {
                case 48: goto L_0x00c2;
                case 49: goto L_0x00c2;
                case 50: goto L_0x00c2;
                case 51: goto L_0x00c2;
                case 52: goto L_0x00c2;
                case 53: goto L_0x00c2;
                case 54: goto L_0x00c2;
                case 55: goto L_0x00c2;
                case 56: goto L_0x00c2;
                case 57: goto L_0x00c2;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            w4.p r0 = r6.H4(r0)
            goto L_0x009b
        L_0x00c2:
            w4.p r0 = r6.T4(r0)
            goto L_0x009b
        L_0x00c7:
            w4.p r0 = w4.p.START_OBJECT
            goto L_0x009b
        L_0x00ca:
            java.lang.String r0 = "true"
            r6.I4(r0, r2)
            w4.p r0 = w4.p.VALUE_TRUE
            goto L_0x009b
        L_0x00d2:
            java.lang.String r0 = "null"
            r6.I4(r0, r2)
            w4.p r0 = w4.p.VALUE_NULL
            goto L_0x009b
        L_0x00da:
            java.lang.String r0 = "false"
            r6.I4(r0, r2)
            w4.p r0 = w4.p.VALUE_FALSE
            goto L_0x009b
        L_0x00e2:
            w4.p r0 = w4.p.START_ARRAY
            goto L_0x009b
        L_0x00e5:
            w4.p r0 = r6.N4()
            goto L_0x009b
        L_0x00ea:
            w4.p r0 = r6.S4()
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.j.D2():w4.p");
    }

    public p D4() throws IOException {
        int i10;
        char[] n10 = this.f15476e1.n();
        int[] iArr = J1;
        int i11 = 0;
        while (true) {
            int length = n10.length;
            if (i11 >= n10.length) {
                n10 = this.f15476e1.s();
                length = n10.length;
                i11 = 0;
            }
            while (true) {
                int readUnsignedByte = this.f6145y1.readUnsignedByte();
                if (readUnsignedByte != 39) {
                    int i12 = iArr[readUnsignedByte];
                    if (i12 == 0) {
                        int i13 = i10 + 1;
                        n10[i10] = (char) readUnsignedByte;
                        i11 = i13;
                        if (i13 >= length) {
                            break;
                        }
                    } else {
                        if (i12 == 1) {
                            readUnsignedByte = J3();
                        } else if (i12 == 2) {
                            readUnsignedByte = w4(readUnsignedByte);
                        } else if (i12 == 3) {
                            readUnsignedByte = x4(readUnsignedByte);
                        } else if (i12 != 4) {
                            if (readUnsignedByte < 32) {
                                X3(readUnsignedByte, "string value");
                            }
                            V4(readUnsignedByte);
                        } else {
                            int y42 = y4(readUnsignedByte);
                            int i14 = i10 + 1;
                            n10[i10] = (char) (55296 | (y42 >> 10));
                            if (i14 >= n10.length) {
                                n10 = this.f15476e1.s();
                                i10 = 0;
                            } else {
                                i10 = i14;
                            }
                            readUnsignedByte = 56320 | (y42 & 1023);
                        }
                        if (i10 >= n10.length) {
                            n10 = this.f15476e1.s();
                            i10 = 0;
                        }
                        n10[i10] = (char) readUnsignedByte;
                        i11 = i10 + 1;
                    }
                } else {
                    this.f15476e1.J(i10);
                    return p.VALUE_STRING;
                }
            }
        }
    }

    public p E4(int i10, boolean z10) throws IOException {
        String str;
        while (i10 == 73) {
            i10 = this.f6145y1.readUnsignedByte();
            if (i10 != 78) {
                if (i10 != 110) {
                    break;
                }
                str = z10 ? "-Infinity" : "+Infinity";
            } else {
                str = z10 ? "-INF" : "+INF";
            }
            I4(str, 3);
            if ((this.O & D1) != 0) {
                return p4(str, z10 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            j3("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        E3(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    public final int F4() throws IOException {
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if (readUnsignedByte >= 48 && readUnsignedByte <= 57) {
            if ((this.O & C1) == 0) {
                x3("Leading zeroes not allowed");
            }
            while (readUnsignedByte == 48) {
                readUnsignedByte = this.f6145y1.readUnsignedByte();
            }
        }
        return readUnsignedByte;
    }

    public void G3() throws IOException {
    }

    public String G4(int i10) throws IOException {
        if (i10 == 39 && (this.O & F1) != 0) {
            return L4();
        }
        if ((this.O & G1) == 0) {
            t3((char) v4(i10), "was expecting double-quote to start field name");
        }
        int[] l10 = a.l();
        if (l10[i10] != 0) {
            t3(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this.f6142v1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        do {
            if (i11 < 4) {
                i11++;
                i13 = i10 | (i13 << 8);
            } else {
                if (i12 >= iArr.length) {
                    iArr = C4(iArr, iArr.length);
                    this.f6142v1 = iArr;
                }
                iArr[i12] = i13;
                i13 = i10;
                i12++;
                i11 = 1;
            }
            i10 = this.f6145y1.readUnsignedByte();
        } while (l10[i10] == 0);
        this.f6146z1 = i10;
        if (i11 > 0) {
            if (i12 >= iArr.length) {
                int[] C4 = C4(iArr, iArr.length);
                this.f6142v1 = C4;
                iArr = C4;
            }
            iArr[i12] = i13;
            i12++;
        }
        String K = this.f6141u1.K(iArr, i12);
        return K == null ? o5(iArr, i12, i11) : K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r4 != 44) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r3.f15474c1.k() == false) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.p H4(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x007c
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x0063
            r0 = 78
            if (r4 == r0) goto L_0x004d
            r0 = 93
            if (r4 == r0) goto L_0x002a
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x0047
            r0 = 43
            if (r4 == r0) goto L_0x001e
            r0 = 44
            if (r4 == r0) goto L_0x0033
            goto L_0x0088
        L_0x001e:
            java.io.DataInput r4 = r3.f6145y1
            int r4 = r4.readUnsignedByte()
            r0 = 0
            w4.p r4 = r3.E4(r4, r0)
            return r4
        L_0x002a:
            d5.d r0 = r3.f15474c1
            boolean r0 = r0.k()
            if (r0 != 0) goto L_0x0033
            goto L_0x0088
        L_0x0033:
            d5.d r0 = r3.f15474c1
            boolean r0 = r0.m()
            if (r0 != 0) goto L_0x0047
            int r0 = r3.O
            int r1 = E1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0047
            r3.f6146z1 = r4
            w4.p r4 = w4.p.VALUE_NULL
            return r4
        L_0x0047:
            java.lang.String r0 = "expected a value"
            r3.t3(r4, r0)
            goto L_0x007c
        L_0x004d:
            java.lang.String r0 = "NaN"
            r3.I4(r0, r1)
            int r1 = r3.O
            int r2 = D1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0060
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            w4.p r4 = r3.p4(r0, r1)
            return r4
        L_0x0060:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            goto L_0x0078
        L_0x0063:
            java.lang.String r0 = "Infinity"
            r3.I4(r0, r1)
            int r1 = r3.O
            int r2 = D1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0076
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            w4.p r4 = r3.p4(r0, r1)
            return r4
        L_0x0076:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
        L_0x0078:
            r3.j3(r0)
            goto L_0x0088
        L_0x007c:
            int r0 = r3.O
            int r1 = F1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0088
            w4.p r4 = r3.D4()
            return r4
        L_0x0088:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.Y3()
            r3.Z4(r4, r0, r1)
        L_0x00a7:
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
        throw new UnsupportedOperationException("Method not decompiled: d5.j.H4(int):w4.p");
    }

    public final void I4(String str, int i10) throws IOException {
        int length = str.length();
        do {
            int readUnsignedByte = this.f6145y1.readUnsignedByte();
            if (readUnsignedByte != str.charAt(i10)) {
                Y4(readUnsignedByte, str.substring(0, i10));
            }
            i10++;
        } while (i10 < length);
        int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
        if (!(readUnsignedByte2 < 48 || readUnsignedByte2 == 93 || readUnsignedByte2 == 125)) {
            s4(str, i10, readUnsignedByte2);
        }
        this.f6146z1 = readUnsignedByte2;
    }

    public int J2(w4.a aVar, OutputStream outputStream) throws IOException {
        if (!this.f6143w1 || this.U != p.VALUE_STRING) {
            byte[] m02 = m0(aVar);
            outputStream.write(m02);
            return m02.length;
        }
        byte[] d10 = this.S0.d();
        try {
            return U4(aVar, outputStream, d10);
        } finally {
            this.S0.r(d10);
        }
    }

    public char J3() throws IOException {
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if (readUnsignedByte == 34 || readUnsignedByte == 47 || readUnsignedByte == 92) {
            return (char) readUnsignedByte;
        }
        if (readUnsignedByte == 98) {
            return 8;
        }
        if (readUnsignedByte == 102) {
            return 12;
        }
        if (readUnsignedByte == 110) {
            return 10;
        }
        if (readUnsignedByte == 114) {
            return 13;
        }
        if (readUnsignedByte == 116) {
            return 9;
        }
        if (readUnsignedByte != 117) {
            return P3((char) v4(readUnsignedByte));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
            int c10 = a.c(readUnsignedByte2);
            if (c10 < 0) {
                t3(readUnsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i10 = (i10 << 4) | c10;
        }
        return (char) i10;
    }

    public final p J4() {
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

    public final p K4(int i10) throws IOException {
        p S4;
        if (i10 == 34) {
            this.f6143w1 = true;
            S4 = p.VALUE_STRING;
        } else if (i10 == 45) {
            S4 = S4();
        } else if (i10 == 46) {
            S4 = N4();
        } else if (i10 == 91) {
            this.f15474c1 = this.f15474c1.t(this.f15472a1, this.f15473b1);
            S4 = p.START_ARRAY;
        } else if (i10 == 102) {
            I4("false", 1);
            S4 = p.VALUE_FALSE;
        } else if (i10 == 110) {
            I4("null", 1);
            S4 = p.VALUE_NULL;
        } else if (i10 == 116) {
            I4("true", 1);
            S4 = p.VALUE_TRUE;
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
                    S4 = T4(i10);
                    break;
                default:
                    S4 = H4(i10);
                    break;
            }
        } else {
            this.f15474c1 = this.f15474c1.u(this.f15472a1, this.f15473b1);
            S4 = p.START_OBJECT;
        }
        this.U = S4;
        return S4;
    }

    public Object L1() {
        return this.f6145y1;
    }

    public void L3() throws IOException {
        char[] n10 = this.f15476e1.n();
        int[] iArr = J1;
        int length = n10.length;
        int i10 = 0;
        while (true) {
            int readUnsignedByte = this.f6145y1.readUnsignedByte();
            if (iArr[readUnsignedByte] == 0) {
                int i11 = i10 + 1;
                n10[i10] = (char) readUnsignedByte;
                if (i11 >= length) {
                    A4(n10, i11, this.f6145y1.readUnsignedByte());
                    return;
                }
                i10 = i11;
            } else if (readUnsignedByte == 34) {
                this.f15476e1.J(i10);
                return;
            } else {
                A4(n10, i10, readUnsignedByte);
                return;
            }
        }
    }

    public String L4() throws IOException {
        int i10;
        int i11;
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if (readUnsignedByte == 39) {
            return "";
        }
        int[] iArr = this.f6142v1;
        int[] iArr2 = K1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (readUnsignedByte != 39) {
            if (!(readUnsignedByte == 34 || iArr2[readUnsignedByte] == 0)) {
                if (readUnsignedByte != 92) {
                    X3(readUnsignedByte, "name");
                } else {
                    readUnsignedByte = J3();
                }
                if (readUnsignedByte > 127) {
                    if (i11 >= 4) {
                        if (i13 >= iArr.length) {
                            iArr = C4(iArr, iArr.length);
                            this.f6142v1 = iArr;
                        }
                        iArr[i13] = i10;
                        i10 = 0;
                        i13++;
                        i11 = 0;
                    }
                    int i15 = i10 << 8;
                    if (readUnsignedByte < 2048) {
                        i10 = i15 | (readUnsignedByte >> 6) | 192;
                        i11++;
                    } else {
                        int i16 = i15 | (readUnsignedByte >> 12) | 224;
                        int i17 = i11 + 1;
                        if (i17 >= 4) {
                            if (i13 >= iArr.length) {
                                iArr = C4(iArr, iArr.length);
                                this.f6142v1 = iArr;
                            }
                            iArr[i13] = i16;
                            i16 = 0;
                            i13++;
                            i17 = 0;
                        }
                        i10 = (i16 << 8) | ((readUnsignedByte >> 6) & 63) | 128;
                        i11 = i17 + 1;
                    }
                    readUnsignedByte = (readUnsignedByte & 63) | 128;
                }
            }
            if (i11 < 4) {
                i12 = i11 + 1;
                i14 = readUnsignedByte | (i10 << 8);
            } else {
                if (i13 >= iArr.length) {
                    iArr = C4(iArr, iArr.length);
                    this.f6142v1 = iArr;
                }
                iArr[i13] = i10;
                i14 = readUnsignedByte;
                i13++;
                i12 = 1;
            }
            readUnsignedByte = this.f6145y1.readUnsignedByte();
        }
        if (i11 > 0) {
            if (i13 >= iArr.length) {
                int[] C4 = C4(iArr, iArr.length);
                this.f6142v1 = C4;
                iArr = C4;
            }
            iArr[i13] = t5(i10, i11);
            i13++;
        }
        String K = this.f6141u1.K(iArr, i13);
        return K == null ? o5(iArr, i13, i11) : K;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p M4(char[] r8, int r9, int r10, boolean r11, int r12) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 57
            r1 = 48
            r2 = 0
            r3 = 46
            if (r10 != r3) goto L_0x0039
            int r3 = r9 + 1
            char r10 = (char) r10
            r8[r9] = r10
            r10 = r2
            r9 = r3
        L_0x0010:
            java.io.DataInput r3 = r7.f6145y1
            int r3 = r3.readUnsignedByte()
            if (r3 < r1) goto L_0x002e
            if (r3 <= r0) goto L_0x001b
            goto L_0x002e
        L_0x001b:
            int r10 = r10 + 1
            int r4 = r8.length
            if (r9 < r4) goto L_0x0027
            h5.n r8 = r7.f15476e1
            char[] r8 = r8.s()
            r9 = r2
        L_0x0027:
            int r4 = r9 + 1
            char r3 = (char) r3
            r8[r9] = r3
            r9 = r4
            goto L_0x0010
        L_0x002e:
            if (r10 != 0) goto L_0x0035
            java.lang.String r4 = "Decimal point not followed by a digit"
            r7.E3(r3, r4)
        L_0x0035:
            r6 = r3
            r3 = r10
            r10 = r6
            goto L_0x003a
        L_0x0039:
            r3 = r2
        L_0x003a:
            r4 = 101(0x65, float:1.42E-43)
            if (r10 == r4) goto L_0x0042
            r4 = 69
            if (r10 != r4) goto L_0x00a2
        L_0x0042:
            int r4 = r8.length
            if (r9 < r4) goto L_0x004c
            h5.n r8 = r7.f15476e1
            char[] r8 = r8.s()
            r9 = r2
        L_0x004c:
            int r4 = r9 + 1
            char r10 = (char) r10
            r8[r9] = r10
            java.io.DataInput r9 = r7.f6145y1
            int r9 = r9.readUnsignedByte()
            r10 = 45
            if (r9 == r10) goto L_0x0064
            r10 = 43
            if (r9 != r10) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            r10 = r9
            r9 = r4
            r4 = r2
            goto L_0x007d
        L_0x0064:
            int r10 = r8.length
            if (r4 < r10) goto L_0x006e
            h5.n r8 = r7.f15476e1
            char[] r8 = r8.s()
            r4 = r2
        L_0x006e:
            int r10 = r4 + 1
            char r9 = (char) r9
            r8[r4] = r9
            java.io.DataInput r9 = r7.f6145y1
            int r9 = r9.readUnsignedByte()
            r4 = r2
            r6 = r10
            r10 = r9
            r9 = r6
        L_0x007d:
            if (r10 > r0) goto L_0x009a
            if (r10 < r1) goto L_0x009a
            int r4 = r4 + 1
            int r5 = r8.length
            if (r9 < r5) goto L_0x008d
            h5.n r8 = r7.f15476e1
            char[] r8 = r8.s()
            r9 = r2
        L_0x008d:
            int r5 = r9 + 1
            char r10 = (char) r10
            r8[r9] = r10
            java.io.DataInput r9 = r7.f6145y1
            int r10 = r9.readUnsignedByte()
            r9 = r5
            goto L_0x007d
        L_0x009a:
            if (r4 != 0) goto L_0x00a1
            java.lang.String r8 = "Exponent indicator not followed by a digit"
            r7.E3(r10, r8)
        L_0x00a1:
            r2 = r4
        L_0x00a2:
            r7.f6146z1 = r10
            d5.d r8 = r7.f15474c1
            boolean r8 = r8.m()
            if (r8 == 0) goto L_0x00af
            r7.n5()
        L_0x00af:
            h5.n r8 = r7.f15476e1
            r8.J(r9)
            w4.p r8 = r7.q4(r11, r12, r3, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.j.M4(char[], int, int, boolean, int):w4.p");
    }

    public final p N4() throws IOException {
        if (!s2(e.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.i())) {
            return H4(46);
        }
        return M4(this.f15476e1.n(), 0, 46, false, 0);
    }

    public final String O4(int i10, int i11, int i12) throws IOException {
        int[] iArr = this.f6142v1;
        iArr[0] = this.f6144x1;
        iArr[1] = i11;
        iArr[2] = i12;
        int[] iArr2 = K1;
        int i13 = i10;
        int i14 = 3;
        while (true) {
            int readUnsignedByte = this.f6145y1.readUnsignedByte();
            if (iArr2[readUnsignedByte] == 0) {
                int i15 = (i13 << 8) | readUnsignedByte;
                int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
                if (iArr2[readUnsignedByte2] == 0) {
                    int i16 = (i15 << 8) | readUnsignedByte2;
                    int readUnsignedByte3 = this.f6145y1.readUnsignedByte();
                    if (iArr2[readUnsignedByte3] == 0) {
                        int i17 = (i16 << 8) | readUnsignedByte3;
                        int readUnsignedByte4 = this.f6145y1.readUnsignedByte();
                        if (iArr2[readUnsignedByte4] == 0) {
                            int[] iArr3 = this.f6142v1;
                            if (i14 >= iArr3.length) {
                                this.f6142v1 = C4(iArr3, i14);
                            }
                            this.f6142v1[i14] = i17;
                            i14++;
                            i13 = readUnsignedByte4;
                        } else if (readUnsignedByte4 == 34) {
                            return s5(this.f6142v1, i14, i17, 4);
                        } else {
                            return u5(this.f6142v1, i14, i17, readUnsignedByte4, 4);
                        }
                    } else if (readUnsignedByte3 == 34) {
                        return s5(this.f6142v1, i14, i16, 3);
                    } else {
                        return u5(this.f6142v1, i14, i16, readUnsignedByte3, 3);
                    }
                } else if (readUnsignedByte2 == 34) {
                    return s5(this.f6142v1, i14, i15, 2);
                } else {
                    return u5(this.f6142v1, i14, i15, readUnsignedByte2, 2);
                }
            } else if (readUnsignedByte == 34) {
                return s5(this.f6142v1, i14, i13, 1);
            } else {
                return u5(this.f6142v1, i14, i13, readUnsignedByte, 1);
            }
        }
    }

    public int P2(OutputStream outputStream) throws IOException {
        return 0;
    }

    public final String P4(int i10) throws IOException {
        int[] iArr = K1;
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            return readUnsignedByte == 34 ? q5(this.f6144x1, i10, 1) : w5(this.f6144x1, i10, readUnsignedByte, 1);
        }
        int i11 = (i10 << 8) | readUnsignedByte;
        int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            return readUnsignedByte2 == 34 ? q5(this.f6144x1, i11, 2) : w5(this.f6144x1, i11, readUnsignedByte2, 2);
        }
        int i12 = (i11 << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this.f6145y1.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            return readUnsignedByte3 == 34 ? q5(this.f6144x1, i12, 3) : w5(this.f6144x1, i12, readUnsignedByte3, 3);
        }
        int i13 = (i12 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this.f6145y1.readUnsignedByte();
        return iArr[readUnsignedByte4] != 0 ? readUnsignedByte4 == 34 ? q5(this.f6144x1, i13, 4) : w5(this.f6144x1, i13, readUnsignedByte4, 4) : Q4(readUnsignedByte4, i13);
    }

    public final String Q4(int i10, int i11) throws IOException {
        int[] iArr = K1;
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int i12 = (i10 << 8) | readUnsignedByte;
            int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i13 = (i12 << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this.f6145y1.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i14 = (i13 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this.f6145y1.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        return O4(readUnsignedByte4, i11, i14);
                    }
                    if (readUnsignedByte4 == 34) {
                        return r5(this.f6144x1, i11, i14, 4);
                    }
                    return x5(this.f6144x1, i11, i14, readUnsignedByte4, 4);
                } else if (readUnsignedByte3 == 34) {
                    return r5(this.f6144x1, i11, i13, 3);
                } else {
                    return x5(this.f6144x1, i11, i13, readUnsignedByte3, 3);
                }
            } else if (readUnsignedByte2 == 34) {
                return r5(this.f6144x1, i11, i12, 2);
            } else {
                return x5(this.f6144x1, i11, i12, readUnsignedByte2, 2);
            }
        } else if (readUnsignedByte == 34) {
            return r5(this.f6144x1, i11, i10, 1);
        } else {
            return x5(this.f6144x1, i11, i10, readUnsignedByte, 1);
        }
    }

    public final String R4(int i10) throws IOException {
        if (i10 != 34) {
            return G4(i10);
        }
        int[] iArr = K1;
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            return readUnsignedByte == 34 ? "" : v5(0, readUnsignedByte, 0);
        }
        int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            return readUnsignedByte2 == 34 ? p5(readUnsignedByte, 1) : v5(readUnsignedByte, readUnsignedByte2, 1);
        }
        int i11 = (readUnsignedByte << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this.f6145y1.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            return readUnsignedByte3 == 34 ? p5(i11, 2) : v5(i11, readUnsignedByte3, 2);
        }
        int i12 = (i11 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this.f6145y1.readUnsignedByte();
        if (iArr[readUnsignedByte4] != 0) {
            return readUnsignedByte4 == 34 ? p5(i12, 3) : v5(i12, readUnsignedByte4, 3);
        }
        int i13 = (i12 << 8) | readUnsignedByte4;
        int readUnsignedByte5 = this.f6145y1.readUnsignedByte();
        if (iArr[readUnsignedByte5] != 0) {
            return readUnsignedByte5 == 34 ? p5(i13, 4) : v5(i13, readUnsignedByte5, 4);
        }
        this.f6144x1 = i13;
        return P4(readUnsignedByte5);
    }

    public void S2(s sVar) {
        this.f6140t1 = sVar;
    }

    public p S4() throws IOException {
        int i10;
        char[] n10 = this.f15476e1.n();
        n10[0] = '-';
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        n10[1] = (char) readUnsignedByte;
        if (readUnsignedByte <= 48) {
            if (readUnsignedByte != 48) {
                return E4(readUnsignedByte, true);
            }
            i10 = F4();
        } else if (readUnsignedByte > 57) {
            return E4(readUnsignedByte, true);
        } else {
            i10 = this.f6145y1.readUnsignedByte();
        }
        int i11 = 2;
        int i12 = 1;
        while (i10 <= 57 && i10 >= 48) {
            i12++;
            n10[i11] = (char) i10;
            i10 = this.f6145y1.readUnsignedByte();
            i11++;
        }
        if (i10 == 46 || i10 == 101 || i10 == 69) {
            return M4(n10, i11, i10, true, i12);
        }
        this.f15476e1.J(i11);
        this.f6146z1 = i10;
        if (this.f15474c1.m()) {
            n5();
        }
        return r4(true, i12);
    }

    public s T0() {
        return this.f6140t1;
    }

    public p T4(int i10) throws IOException {
        int i11;
        char[] n10 = this.f15476e1.n();
        int i12 = 1;
        if (i10 == 48) {
            i11 = F4();
            if (i11 > 57 || i11 < 48) {
                n10[0] = '0';
            } else {
                i12 = 0;
            }
        } else {
            n10[0] = (char) i10;
            i11 = this.f6145y1.readUnsignedByte();
        }
        int i13 = i11;
        char[] cArr = n10;
        int i14 = i12;
        int i15 = i14;
        while (i13 <= 57 && i13 >= 48) {
            i15++;
            if (i14 >= cArr.length) {
                cArr = this.f15476e1.s();
                i14 = 0;
            }
            cArr[i14] = (char) i13;
            i13 = this.f6145y1.readUnsignedByte();
            i14++;
        }
        if (i13 == 46 || i13 == 101 || i13 == 69) {
            return M4(cArr, i14, i13, false, i15);
        }
        this.f15476e1.J(i14);
        if (this.f15474c1.m()) {
            n5();
        } else {
            this.f6146z1 = i13;
        }
        return r4(false, i15);
    }

    public void U3() throws IOException {
        super.U3();
        this.f6141u1.S();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
        r11.f6143w1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (r3 <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d6, code lost:
        r4 = r4 + r3;
        r13.write(r14, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int U4(w4.a r12, java.io.OutputStream r13, byte[] r14) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r14.length
            r1 = 3
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0006:
            java.io.DataInput r5 = r11.f6145y1
            int r5 = r5.readUnsignedByte()
            r6 = 32
            if (r5 <= r6) goto L_0x0006
            int r6 = r12.g(r5)
            r7 = 34
            if (r6 >= 0) goto L_0x0023
            if (r5 != r7) goto L_0x001c
            goto L_0x00d2
        L_0x001c:
            int r6 = r11.I3(r12, r5, r2)
            if (r6 >= 0) goto L_0x0023
            goto L_0x0006
        L_0x0023:
            if (r3 <= r0) goto L_0x002a
            int r4 = r4 + r3
            r13.write(r14, r2, r3)
            r3 = r2
        L_0x002a:
            java.io.DataInput r5 = r11.f6145y1
            int r5 = r5.readUnsignedByte()
            int r8 = r12.g(r5)
            if (r8 >= 0) goto L_0x003b
            r8 = 1
            int r8 = r11.I3(r12, r5, r8)
        L_0x003b:
            int r5 = r6 << 6
            r5 = r5 | r8
            java.io.DataInput r6 = r11.f6145y1
            int r6 = r6.readUnsignedByte()
            int r8 = r12.g(r6)
            r9 = 2
            r10 = -2
            if (r8 >= 0) goto L_0x00a8
            if (r8 == r10) goto L_0x0068
            if (r6 != r7) goto L_0x0063
            int r0 = r5 >> 4
            int r1 = r3 + 1
            byte r0 = (byte) r0
            r14[r3] = r0
            boolean r0 = r12.y()
            if (r0 == 0) goto L_0x0060
            r11.O3(r12)
        L_0x0060:
            r3 = r1
            goto L_0x00d2
        L_0x0063:
            int r6 = r11.I3(r12, r6, r9)
            r8 = r6
        L_0x0068:
            if (r8 != r10) goto L_0x00a8
            java.io.DataInput r6 = r11.f6145y1
            int r6 = r6.readUnsignedByte()
            boolean r7 = r12.A(r6)
            if (r7 != 0) goto L_0x00a0
            r7 = 92
            if (r6 != r7) goto L_0x0081
            int r7 = r11.I3(r12, r6, r1)
            if (r7 != r10) goto L_0x0081
            goto L_0x00a0
        L_0x0081:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "expected padding character '"
            r13.append(r14)
            char r14 = r12.v()
            r13.append(r14)
            java.lang.String r14 = "'"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r12 = r11.n4(r12, r6, r1, r13)
            throw r12
        L_0x00a0:
            int r5 = r5 >> 4
            int r6 = r3 + 1
            byte r5 = (byte) r5
            r14[r3] = r5
            goto L_0x0108
        L_0x00a8:
            int r5 = r5 << 6
            r5 = r5 | r8
            java.io.DataInput r6 = r11.f6145y1
            int r6 = r6.readUnsignedByte()
            int r8 = r12.g(r6)
            if (r8 >= 0) goto L_0x00f2
            if (r8 == r10) goto L_0x00e0
            if (r6 != r7) goto L_0x00db
            int r0 = r5 >> 2
            int r1 = r3 + 1
            int r5 = r0 >> 8
            byte r5 = (byte) r5
            r14[r3] = r5
            int r3 = r1 + 1
            byte r0 = (byte) r0
            r14[r1] = r0
            boolean r0 = r12.y()
            if (r0 == 0) goto L_0x00d2
            r11.O3(r12)
        L_0x00d2:
            r11.f6143w1 = r2
            if (r3 <= 0) goto L_0x00da
            int r4 = r4 + r3
            r13.write(r14, r2, r3)
        L_0x00da:
            return r4
        L_0x00db:
            int r6 = r11.I3(r12, r6, r1)
            r8 = r6
        L_0x00e0:
            if (r8 != r10) goto L_0x00f2
            int r5 = r5 >> 2
            int r6 = r3 + 1
            int r7 = r5 >> 8
            byte r7 = (byte) r7
            r14[r3] = r7
            int r3 = r6 + 1
            byte r5 = (byte) r5
            r14[r6] = r5
            goto L_0x0006
        L_0x00f2:
            int r5 = r5 << 6
            r5 = r5 | r8
            int r6 = r3 + 1
            int r7 = r5 >> 16
            byte r7 = (byte) r7
            r14[r3] = r7
            int r3 = r6 + 1
            int r7 = r5 >> 8
            byte r7 = (byte) r7
            r14[r6] = r7
            int r6 = r3 + 1
            byte r5 = (byte) r5
            r14[r3] = r5
        L_0x0108:
            r3 = r6
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.j.U4(w4.a, java.io.OutputStream, byte[]):int");
    }

    public void V4(int i10) throws k {
        if (i10 < 32) {
            v3(i10);
        }
        W4(i10);
    }

    public w4.j W0() {
        return new w4.j(N3(), -1, -1, this.X0, -1);
    }

    public void W4(int i10) throws k {
        j3("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    public int X1(Writer writer) throws IOException {
        p pVar = this.U;
        if (pVar == p.VALUE_STRING) {
            if (this.f6143w1) {
                this.f6143w1 = false;
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

    public final void X4(int i10) throws k {
        j3("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    public String Y1() throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING) {
            return B4(pVar);
        }
        if (!this.f6143w1) {
            return this.f15476e1.l();
        }
        this.f6143w1 = false;
        return z4();
    }

    public void Y4(int i10, String str) throws IOException {
        Z4(i10, str, Y3());
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
            } else if (this.f6143w1) {
                this.f6143w1 = false;
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

    public void Z4(int i10, String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            char v42 = (char) v4(i10);
            if (!Character.isJavaIdentifierPart(v42)) {
                j3("Unrecognized token '" + sb2.toString() + "': was expecting " + str2);
                return;
            }
            sb2.append(v42);
            i10 = this.f6145y1.readUnsignedByte();
        }
    }

    public int a2() throws IOException {
        p pVar = this.U;
        if (pVar == p.VALUE_STRING) {
            if (this.f6143w1) {
                this.f6143w1 = false;
                L3();
            }
            return this.f15476e1.K();
        } else if (pVar == p.FIELD_NAME) {
            return this.f15474c1.b().length();
        } else {
            if (pVar != null) {
                return pVar.j() ? this.f15476e1.K() : this.U.b().length;
            }
            return 0;
        }
    }

    public final void a5() throws IOException {
        int[] h10 = a.h();
        while (true) {
            int readUnsignedByte = this.f6145y1.readUnsignedByte();
            while (true) {
                int i10 = h10[readUnsignedByte];
                if (i10 != 0) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                i5();
                                break;
                            } else if (i10 == 10 || i10 == 13) {
                                this.X0++;
                            } else if (i10 != 42) {
                                V4(readUnsignedByte);
                                break;
                            } else {
                                readUnsignedByte = this.f6145y1.readUnsignedByte();
                                if (readUnsignedByte == 47) {
                                    return;
                                }
                            }
                        } else {
                            h5();
                            break;
                        }
                    } else {
                        g5();
                        break;
                    }
                } else {
                    break;
                }
            }
            this.X0++;
        }
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
            boolean r0 = r3.f6143w1
            if (r0 == 0) goto L_0x001d
            r3.f6143w1 = r1
            r3.L3()
        L_0x001d:
            h5.n r0 = r3.f15476e1
            int r0 = r0.y()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.j.b2():int");
    }

    public final int b5() throws IOException {
        int i10 = this.f6146z1;
        if (i10 < 0) {
            i10 = this.f6145y1.readUnsignedByte();
        } else {
            this.f6146z1 = -1;
        }
        if (i10 == 58) {
            int readUnsignedByte = this.f6145y1.readUnsignedByte();
            return readUnsignedByte > 32 ? (readUnsignedByte == 47 || readUnsignedByte == 35) ? c5(readUnsignedByte, true) : readUnsignedByte : ((readUnsignedByte == 32 || readUnsignedByte == 9) && (readUnsignedByte = this.f6145y1.readUnsignedByte()) > 32) ? (readUnsignedByte == 47 || readUnsignedByte == 35) ? c5(readUnsignedByte, true) : readUnsignedByte : c5(readUnsignedByte, true);
        }
        if (i10 == 32 || i10 == 9) {
            i10 = this.f6145y1.readUnsignedByte();
        }
        if (i10 != 58) {
            return c5(i10, false);
        }
        int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
        return readUnsignedByte2 > 32 ? (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) ? c5(readUnsignedByte2, true) : readUnsignedByte2 : ((readUnsignedByte2 == 32 || readUnsignedByte2 == 9) && (readUnsignedByte2 = this.f6145y1.readUnsignedByte()) > 32) ? (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) ? c5(readUnsignedByte2, true) : readUnsignedByte2 : c5(readUnsignedByte2, true);
    }

    public void c0() throws IOException {
        if (this.f6143w1) {
            this.f6143w1 = false;
            L3();
        }
    }

    public w4.j c2() {
        return new w4.j(N3(), -1, -1, this.f15472a1, -1);
    }

    public final int c5(int i10, boolean z10) throws IOException {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    d5();
                } else if (i10 != 35 || !m5()) {
                    if (z10) {
                        return i10;
                    }
                    if (i10 != 58) {
                        t3(i10, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (i10 == 13 || i10 == 10) {
                this.X0++;
            }
            i10 = this.f6145y1.readUnsignedByte();
        }
    }

    public final void d5() throws IOException {
        if ((this.O & H1) == 0) {
            t3(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if (readUnsignedByte == 47) {
            e5();
        } else if (readUnsignedByte == 42) {
            a5();
        } else {
            t3(readUnsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    public final void e5() throws IOException {
        int[] h10 = a.h();
        while (true) {
            int readUnsignedByte = this.f6145y1.readUnsignedByte();
            int i10 = h10[readUnsignedByte];
            if (i10 != 0) {
                if (i10 == 2) {
                    g5();
                } else if (i10 == 3) {
                    h5();
                } else if (i10 == 4) {
                    i5();
                } else if (i10 == 10 || i10 == 13) {
                    this.X0++;
                } else if (i10 != 42 && i10 < 0) {
                    V4(readUnsignedByte);
                }
            }
        }
        this.X0++;
    }

    public void f5() throws IOException {
        this.f6143w1 = false;
        int[] iArr = J1;
        while (true) {
            int readUnsignedByte = this.f6145y1.readUnsignedByte();
            int i10 = iArr[readUnsignedByte];
            if (i10 != 0) {
                if (readUnsignedByte != 34) {
                    if (i10 == 1) {
                        J3();
                    } else if (i10 == 2) {
                        g5();
                    } else if (i10 == 3) {
                        h5();
                    } else if (i10 == 4) {
                        i5();
                    } else if (readUnsignedByte < 32) {
                        X3(readUnsignedByte, "string value");
                    } else {
                        V4(readUnsignedByte);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void g5() throws IOException {
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            X4(readUnsignedByte & 255);
        }
    }

    public final void h5() throws IOException {
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            X4(readUnsignedByte & 255);
        }
        int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            X4(readUnsignedByte2 & 255);
        }
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

    public final void i5() throws IOException {
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            X4(readUnsignedByte & 255);
        }
        int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            X4(readUnsignedByte2 & 255);
        }
        int readUnsignedByte3 = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            X4(readUnsignedByte3 & 255);
        }
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

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j5() throws java.io.IOException {
        /*
            r2 = this;
            int r0 = r2.f6146z1
            if (r0 >= 0) goto L_0x000b
        L_0x0004:
            java.io.DataInput r0 = r2.f6145y1
            int r0 = r0.readUnsignedByte()
            goto L_0x000e
        L_0x000b:
            r1 = -1
            r2.f6146z1 = r1
        L_0x000e:
            r1 = 32
            if (r0 <= r1) goto L_0x0021
            r1 = 47
            if (r0 == r1) goto L_0x001c
            r1 = 35
            if (r0 != r1) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            return r0
        L_0x001c:
            int r0 = r2.k5(r0)
            return r0
        L_0x0021:
            r1 = 13
            if (r0 == r1) goto L_0x0029
            r1 = 10
            if (r0 != r1) goto L_0x0004
        L_0x0029:
            int r0 = r2.X0
            int r0 = r0 + 1
            r2.X0 = r0
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.j.j5():int");
    }

    public final int k5(int i10) throws IOException {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    d5();
                } else if (i10 != 35 || !m5()) {
                    return i10;
                }
            } else if (i10 == 13 || i10 == 10) {
                this.X0++;
            }
            i10 = this.f6145y1.readUnsignedByte();
        }
        return i10;
    }

    public final int l5() throws IOException {
        int i10 = this.f6146z1;
        if (i10 < 0) {
            try {
                i10 = this.f6145y1.readUnsignedByte();
            } catch (EOFException unused) {
                return K3();
            }
        } else {
            this.f6146z1 = -1;
        }
        while (i10 <= 32) {
            if (i10 == 13 || i10 == 10) {
                this.X0++;
            }
            try {
                i10 = this.f6145y1.readUnsignedByte();
            } catch (EOFException unused2) {
                return K3();
            }
        }
        return (i10 == 47 || i10 == 35) ? k5(i10) : i10;
    }

    public byte[] m0(w4.a aVar) throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING && (pVar != p.VALUE_EMBEDDED_OBJECT || this.f15480i1 == null)) {
            j3("Current token (" + this.U + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f6143w1) {
            try {
                this.f15480i1 = u4(aVar);
                this.f6143w1 = false;
            } catch (IllegalArgumentException e10) {
                throw k("Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e10.getMessage());
            }
        } else if (this.f15480i1 == null) {
            c M3 = M3();
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
        if (!this.f6143w1) {
            return this.f15476e1.l();
        }
        this.f6143w1 = false;
        return z4();
    }

    public final boolean m5() throws IOException {
        if ((this.O & I1) == 0) {
            return false;
        }
        e5();
        return true;
    }

    public String n2(String str) throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING) {
            return pVar == p.FIELD_NAME ? X0() : super.n2(str);
        }
        if (!this.f6143w1) {
            return this.f15476e1.l();
        }
        this.f6143w1 = false;
        return z4();
    }

    public final void n5() throws IOException {
        int i10 = this.f6146z1;
        if (i10 <= 32) {
            this.f6146z1 = -1;
            if (i10 == 13 || i10 == 10) {
                this.X0++;
                return;
            }
            return;
        }
        s3(i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String o5(int[] r17, int r18, int r19) throws w4.k {
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
            r0.W4(r12)
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
            r0.X4(r6)
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
            r0.X4(r5)
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
            r0.X4(r12)
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
            f5.a r3 = r0.f6141u1
            java.lang.String r1 = r3.z(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.j.o5(int[], int, int):java.lang.String");
    }

    public final String p5(int i10, int i11) throws k {
        int t52 = t5(i10, i11);
        String H = this.f6141u1.H(t52);
        if (H != null) {
            return H;
        }
        int[] iArr = this.f6142v1;
        iArr[0] = t52;
        return o5(iArr, 1, i11);
    }

    public final String q5(int i10, int i11, int i12) throws k {
        int t52 = t5(i11, i12);
        String I = this.f6141u1.I(i10, t52);
        if (I != null) {
            return I;
        }
        int[] iArr = this.f6142v1;
        iArr[0] = i10;
        iArr[1] = t52;
        return o5(iArr, 2, i12);
    }

    public final String r5(int i10, int i11, int i12, int i13) throws k {
        int t52 = t5(i12, i13);
        String J = this.f6141u1.J(i10, i11, t52);
        if (J != null) {
            return J;
        }
        int[] iArr = this.f6142v1;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = t5(t52, i13);
        return o5(iArr, 3, i13);
    }

    public final void s4(String str, int i10, int i11) throws IOException {
        char v42 = (char) v4(i11);
        if (Character.isJavaIdentifierPart(v42)) {
            Y4(v42, str.substring(0, i10));
        }
    }

    public final String s5(int[] iArr, int i10, int i11, int i12) throws k {
        if (i10 >= iArr.length) {
            iArr = C4(iArr, iArr.length);
            this.f6142v1 = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = t5(i11, i12);
        String K = this.f6141u1.K(iArr, i13);
        return K == null ? o5(iArr, i13, i12) : K;
    }

    public final void t4(int i10) throws k {
        if (i10 == 93) {
            if (!this.f15474c1.k()) {
                V3(i10, '}');
            }
            this.f15474c1 = this.f15474c1.s();
            this.U = p.END_ARRAY;
        }
        if (i10 == 125) {
            if (!this.f15474c1.l()) {
                V3(i10, ']');
            }
            this.f15474c1 = this.f15474c1.s();
            this.U = p.END_OBJECT;
        }
    }

    public final byte[] u4(w4.a aVar) throws IOException {
        int readUnsignedByte;
        c M3 = M3();
        while (true) {
            int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                int g10 = aVar.g(readUnsignedByte2);
                if (g10 < 0) {
                    if (readUnsignedByte2 == 34) {
                        return M3.P();
                    }
                    g10 = I3(aVar, readUnsignedByte2, 0);
                    if (g10 < 0) {
                        continue;
                    }
                }
                int readUnsignedByte3 = this.f6145y1.readUnsignedByte();
                int g11 = aVar.g(readUnsignedByte3);
                if (g11 < 0) {
                    g11 = I3(aVar, readUnsignedByte3, 1);
                }
                int i10 = (g10 << 6) | g11;
                int readUnsignedByte4 = this.f6145y1.readUnsignedByte();
                int g12 = aVar.g(readUnsignedByte4);
                if (g12 < 0) {
                    if (g12 != -2) {
                        if (readUnsignedByte4 == 34) {
                            M3.f(i10 >> 4);
                            if (aVar.y()) {
                                O3(aVar);
                            }
                            return M3.P();
                        }
                        g12 = I3(aVar, readUnsignedByte4, 2);
                    }
                    if (g12 == -2) {
                        readUnsignedByte = this.f6145y1.readUnsignedByte();
                        if (aVar.A(readUnsignedByte) || (readUnsignedByte == 92 && I3(aVar, readUnsignedByte, 3) == -2)) {
                            M3.f(i10 >> 4);
                        }
                    }
                }
                int i11 = (i10 << 6) | g12;
                int readUnsignedByte5 = this.f6145y1.readUnsignedByte();
                int g13 = aVar.g(readUnsignedByte5);
                if (g13 < 0) {
                    if (g13 != -2) {
                        if (readUnsignedByte5 == 34) {
                            M3.i(i11 >> 2);
                            if (aVar.y()) {
                                O3(aVar);
                            }
                            return M3.P();
                        }
                        g13 = I3(aVar, readUnsignedByte5, 3);
                    }
                    if (g13 == -2) {
                        M3.i(i11 >> 2);
                    }
                }
                M3.h((i11 << 6) | g13);
            }
        }
        throw n4(aVar, readUnsignedByte, 3, "expected padding character '" + aVar.v() + "'");
    }

    public final String u5(int[] iArr, int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr2 = K1;
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
                            iArr = C4(iArr, iArr.length);
                            this.f6142v1 = iArr;
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
                                iArr = C4(iArr, iArr.length);
                                this.f6142v1 = iArr;
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
                    iArr = C4(iArr, iArr.length);
                    this.f6142v1 = iArr;
                }
                iArr[i10] = r8;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            i12 = this.f6145y1.readUnsignedByte();
        }
        if (r10 > 0) {
            if (i10 >= iArr.length) {
                iArr = C4(iArr, iArr.length);
                this.f6142v1 = iArr;
            }
            iArr[i10] = t5(r8, r10);
            i10++;
        }
        String K = this.f6141u1.K(iArr, i10);
        return K == null ? o5(iArr, i10, r10) : K;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int v4(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 <= r0) goto L_0x006e
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
            r6.W4(r0)
            goto L_0x0010
        L_0x002c:
            java.io.DataInput r3 = r6.f6145y1
            int r3 = r3.readUnsignedByte()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x003d
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6.X4(r4)
        L_0x003d:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L_0x006e
            java.io.DataInput r2 = r6.f6145y1
            int r2 = r2.readUnsignedByte()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L_0x0053
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6.X4(r3)
        L_0x0053:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L_0x006e
            java.io.DataInput r0 = r6.f6145y1
            int r0 = r0.readUnsignedByte()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L_0x0069
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6.X4(r1)
        L_0x0069:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L_0x006e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.j.v4(int):int");
    }

    public final String v5(int i10, int i11, int i12) throws IOException {
        return u5(this.f6142v1, 0, i10, i11, i12);
    }

    public final int w4(int i10) throws IOException {
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            X4(readUnsignedByte & 255);
        }
        return ((i10 & 31) << 6) | (readUnsignedByte & 63);
    }

    public final String w5(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = this.f6142v1;
        iArr[0] = i10;
        return u5(iArr, 1, i11, i12, i13);
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

    public final int x4(int i10) throws IOException {
        int i11 = i10 & 15;
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            X4(readUnsignedByte & 255);
        }
        int i12 = (i11 << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            X4(readUnsignedByte2 & 255);
        }
        return (i12 << 6) | (readUnsignedByte2 & 63);
    }

    public final String x5(int i10, int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = this.f6142v1;
        iArr[0] = i10;
        iArr[1] = i11;
        return u5(iArr, 2, i12, i13, i14);
    }

    public String y2() throws IOException {
        p pVar;
        this.f15481j1 = 0;
        p pVar2 = this.U;
        p pVar3 = p.FIELD_NAME;
        if (pVar2 == pVar3) {
            J4();
            return null;
        }
        if (this.f6143w1) {
            f5();
        }
        int j52 = j5();
        this.f15480i1 = null;
        this.f15472a1 = this.X0;
        if (j52 == 93 || j52 == 125) {
            t4(j52);
            return null;
        }
        if (this.f15474c1.x()) {
            if (j52 != 44) {
                t3(j52, "was expecting comma to separate " + this.f15474c1.q() + " entries");
            }
            j52 = j5();
            if ((this.O & B1) != 0 && (j52 == 93 || j52 == 125)) {
                t4(j52);
                return null;
            }
        }
        if (!this.f15474c1.l()) {
            K4(j52);
            return null;
        }
        String R4 = R4(j52);
        this.f15474c1.B(R4);
        this.U = pVar3;
        int b52 = b5();
        if (b52 == 34) {
            this.f6143w1 = true;
            this.f15475d1 = p.VALUE_STRING;
            return R4;
        }
        if (b52 != 45) {
            if (b52 == 46) {
                N4();
            } else if (b52 == 91) {
                pVar = p.START_ARRAY;
            } else if (b52 == 102) {
                I4("false", 1);
                pVar = p.VALUE_FALSE;
            } else if (b52 == 110) {
                I4("null", 1);
                pVar = p.VALUE_NULL;
            } else if (b52 == 116) {
                I4("true", 1);
                pVar = p.VALUE_TRUE;
            } else if (b52 != 123) {
                switch (b52) {
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
                        break;
                    default:
                        pVar = H4(b52);
                        break;
                }
            } else {
                pVar = p.START_OBJECT;
            }
            pVar = T4(b52);
        } else {
            pVar = S4();
        }
        this.f15475d1 = pVar;
        return R4;
    }

    public final int y4(int i10) throws IOException {
        int readUnsignedByte = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            X4(readUnsignedByte & 255);
        }
        int i11 = ((i10 & 7) << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            X4(readUnsignedByte2 & 255);
        }
        int i12 = (i11 << 6) | (readUnsignedByte2 & 63);
        int readUnsignedByte3 = this.f6145y1.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            X4(readUnsignedByte3 & 255);
        }
        return ((i12 << 6) | (readUnsignedByte3 & 63)) - 65536;
    }

    public final String z4() throws IOException {
        char[] n10 = this.f15476e1.n();
        int[] iArr = J1;
        int length = n10.length;
        int i10 = 0;
        while (true) {
            int readUnsignedByte = this.f6145y1.readUnsignedByte();
            if (iArr[readUnsignedByte] == 0) {
                int i11 = i10 + 1;
                n10[i10] = (char) readUnsignedByte;
                if (i11 >= length) {
                    A4(n10, i11, this.f6145y1.readUnsignedByte());
                    return this.f15476e1.l();
                }
                i10 = i11;
            } else if (readUnsignedByte == 34) {
                return this.f15476e1.I(i10);
            } else {
                A4(n10, i10, readUnsignedByte);
                return this.f15476e1.l();
            }
        }
    }
}
