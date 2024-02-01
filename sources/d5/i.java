package d5;

import c5.a;
import c5.d;
import h5.c;
import h5.n;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import w4.j;
import w4.k;
import w4.l;
import w4.p;
import w4.s;
import w4.u;
import y4.b;

public class i extends b {
    public static final int D1 = l.a.ALLOW_TRAILING_COMMA.e();
    public static final int E1 = l.a.ALLOW_NUMERIC_LEADING_ZEROS.e();
    public static final int F1 = l.a.ALLOW_NON_NUMERIC_NUMBERS.e();
    public static final int G1 = l.a.ALLOW_MISSING_VALUES.e();
    public static final int H1 = l.a.ALLOW_SINGLE_QUOTES.e();
    public static final int I1 = l.a.ALLOW_UNQUOTED_FIELD_NAMES.e();
    public static final int J1 = l.a.ALLOW_COMMENTS.e();
    public static final int K1 = l.a.ALLOW_YAML_COMMENTS.e();
    public static final int[] L1 = a.i();
    public long A1;
    public int B1;
    public int C1;

    /* renamed from: t1  reason: collision with root package name */
    public Reader f6133t1;

    /* renamed from: u1  reason: collision with root package name */
    public char[] f6134u1;

    /* renamed from: v1  reason: collision with root package name */
    public boolean f6135v1;

    /* renamed from: w1  reason: collision with root package name */
    public s f6136w1;

    /* renamed from: x1  reason: collision with root package name */
    public final f5.b f6137x1;

    /* renamed from: y1  reason: collision with root package name */
    public final int f6138y1;

    /* renamed from: z1  reason: collision with root package name */
    public boolean f6139z1;

    public i(d dVar, int i10, Reader reader, s sVar, f5.b bVar) {
        super(dVar, i10);
        this.f6133t1 = reader;
        this.f6134u1 = dVar.j();
        this.U0 = 0;
        this.V0 = 0;
        this.f6136w1 = sVar;
        this.f6137x1 = bVar;
        this.f6138y1 = bVar.r();
        this.f6135v1 = true;
    }

    public i(d dVar, int i10, Reader reader, s sVar, f5.b bVar, char[] cArr, int i11, int i12, boolean z10) {
        super(dVar, i10);
        this.f6133t1 = reader;
        this.f6134u1 = cArr;
        this.U0 = i11;
        this.V0 = i12;
        this.f6136w1 = sVar;
        this.f6137x1 = bVar;
        this.f6138y1 = bVar.r();
        this.f6135v1 = z10;
    }

    public final int A2(int i10) throws IOException {
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

    public final String A4(int i10, int i11, int[] iArr) throws IOException {
        this.f15476e1.F(this.f6134u1, i10, this.U0 - i10);
        char[] v10 = this.f15476e1.v();
        int w10 = this.f15476e1.w();
        int length = iArr.length;
        while (true) {
            if (this.U0 >= this.V0 && !E4()) {
                break;
            }
            char c10 = this.f6134u1[this.U0];
            if (c10 >= length) {
                if (!Character.isJavaIdentifierPart(c10)) {
                    break;
                }
            } else if (iArr[c10] != 0) {
                break;
            }
            this.U0++;
            i11 = (i11 * 33) + c10;
            int i12 = w10 + 1;
            v10[w10] = c10;
            if (i12 >= v10.length) {
                v10 = this.f15476e1.s();
                w10 = 0;
            } else {
                w10 = i12;
            }
        }
        this.f15476e1.J(w10);
        n nVar = this.f15476e1;
        return this.f6137x1.q(nVar.x(), nVar.y(), nVar.K(), i11);
    }

    public final long B2(long j10) throws IOException {
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

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r4 != 44) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3.f15474c1.k() == false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w4.p B4(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L_0x008b
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L_0x0072
            r0 = 78
            if (r4 == r0) goto L_0x005c
            r0 = 93
            if (r4 == r0) goto L_0x003c
            r0 = 43
            if (r4 == r0) goto L_0x001b
            r0 = 44
            if (r4 == r0) goto L_0x0045
            goto L_0x0097
        L_0x001b:
            int r4 = r3.U0
            int r0 = r3.V0
            if (r4 < r0) goto L_0x002c
            boolean r4 = r3.E4()
            if (r4 != 0) goto L_0x002c
            w4.p r4 = w4.p.VALUE_NUMBER_INT
            r3.r3(r4)
        L_0x002c:
            char[] r4 = r3.f6134u1
            int r0 = r3.U0
            int r1 = r0 + 1
            r3.U0 = r1
            char r4 = r4[r0]
            r0 = 0
            w4.p r4 = r3.y4(r4, r0)
            return r4
        L_0x003c:
            d5.d r0 = r3.f15474c1
            boolean r0 = r0.k()
            if (r0 != 0) goto L_0x0045
            goto L_0x0097
        L_0x0045:
            d5.d r0 = r3.f15474c1
            boolean r0 = r0.m()
            if (r0 != 0) goto L_0x0097
            int r0 = r3.O
            int r2 = G1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0097
            int r4 = r3.U0
            int r4 = r4 - r1
            r3.U0 = r4
            w4.p r4 = w4.p.VALUE_NULL
            return r4
        L_0x005c:
            java.lang.String r0 = "NaN"
            r3.I4(r0, r1)
            int r1 = r3.O
            int r2 = F1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x006f
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            w4.p r4 = r3.p4(r0, r1)
            return r4
        L_0x006f:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            goto L_0x0087
        L_0x0072:
            java.lang.String r0 = "Infinity"
            r3.I4(r0, r1)
            int r1 = r3.O
            int r2 = F1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0085
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            w4.p r4 = r3.p4(r0, r1)
            return r4
        L_0x0085:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
        L_0x0087:
            r3.j3(r0)
            goto L_0x0097
        L_0x008b:
            int r0 = r3.O
            int r1 = H1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0097
            w4.p r4 = r3.x4()
            return r4
        L_0x0097:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L_0x00b6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.Y3()
            r3.X4(r0, r1)
        L_0x00b6:
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
        throw new UnsupportedOperationException("Method not decompiled: d5.i.B4(int):w4.p");
    }

    public final String C2() throws IOException {
        d u10;
        if (this.U == p.FIELD_NAME) {
            this.f15478g1 = false;
            p pVar = this.f15475d1;
            this.f15475d1 = null;
            this.U = pVar;
            if (pVar == p.VALUE_STRING) {
                if (this.f6139z1) {
                    this.f6139z1 = false;
                    L3();
                }
                return this.f15476e1.l();
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
        } else if (D2() == p.VALUE_STRING) {
            return Y1();
        } else {
            return null;
        }
    }

    public boolean C4(int i10, String str) throws IOException {
        p S4;
        String Q4 = i10 == 34 ? Q4() : z4(i10);
        this.f15474c1.B(Q4);
        this.U = p.FIELD_NAME;
        int b52 = b5();
        l5();
        if (b52 == 34) {
            this.f6139z1 = true;
            S4 = p.VALUE_STRING;
        } else if (b52 == 45) {
            S4 = S4();
        } else if (b52 == 46) {
            S4 = P4();
        } else if (b52 == 91) {
            S4 = p.START_ARRAY;
        } else if (b52 == 102) {
            G4();
            S4 = p.VALUE_FALSE;
        } else if (b52 == 110) {
            H4();
            S4 = p.VALUE_NULL;
        } else if (b52 == 116) {
            K4();
            S4 = p.VALUE_TRUE;
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
                    S4 = U4(b52);
                    break;
                default:
                    S4 = B4(b52);
                    break;
            }
        } else {
            S4 = p.START_OBJECT;
        }
        this.f15475d1 = S4;
        return str.equals(Q4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r0 == 125) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p D2() throws java.io.IOException {
        /*
            r6 = this;
            w4.p r0 = r6.U
            w4.p r1 = w4.p.FIELD_NAME
            if (r0 != r1) goto L_0x000b
            w4.p r0 = r6.L4()
            return r0
        L_0x000b:
            r0 = 0
            r6.f15481j1 = r0
            boolean r0 = r6.f6139z1
            if (r0 == 0) goto L_0x0015
            r6.h5()
        L_0x0015:
            int r0 = r6.i5()
            r2 = 0
            if (r0 >= 0) goto L_0x0022
            r6.close()
            r6.U = r2
            return r2
        L_0x0022:
            r6.f15480i1 = r2
            r2 = 93
            if (r0 == r2) goto L_0x0044
            r3 = 125(0x7d, float:1.75E-43)
            if (r0 != r3) goto L_0x002d
            goto L_0x0044
        L_0x002d:
            d5.d r4 = r6.f15474c1
            boolean r4 = r4.x()
            if (r4 == 0) goto L_0x004a
            int r0 = r6.e5(r0)
            int r4 = r6.O
            int r5 = D1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x004a
            if (r0 == r2) goto L_0x0044
            if (r0 != r3) goto L_0x004a
        L_0x0044:
            r6.t4(r0)
        L_0x0047:
            w4.p r0 = r6.U
            return r0
        L_0x004a:
            d5.d r2 = r6.f15474c1
            boolean r2 = r2.l()
            r4 = 34
            if (r2 == 0) goto L_0x006d
            r6.m5()
            if (r0 != r4) goto L_0x005e
            java.lang.String r0 = r6.Q4()
            goto L_0x0062
        L_0x005e:
            java.lang.String r0 = r6.z4(r0)
        L_0x0062:
            d5.d r5 = r6.f15474c1
            r5.B(r0)
            r6.U = r1
            int r0 = r6.b5()
        L_0x006d:
            r6.l5()
            if (r0 == r4) goto L_0x00e1
            r1 = 91
            if (r0 == r1) goto L_0x00d0
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x00ca
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L_0x00c4
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x00be
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x00ad
            if (r0 == r3) goto L_0x00a7
            r1 = 45
            if (r0 == r1) goto L_0x00a2
            r1 = 46
            if (r0 == r1) goto L_0x009d
            switch(r0) {
                case 48: goto L_0x0098;
                case 49: goto L_0x0098;
                case 50: goto L_0x0098;
                case 51: goto L_0x0098;
                case 52: goto L_0x0098;
                case 53: goto L_0x0098;
                case 54: goto L_0x0098;
                case 55: goto L_0x0098;
                case 56: goto L_0x0098;
                case 57: goto L_0x0098;
                default: goto L_0x0093;
            }
        L_0x0093:
            w4.p r0 = r6.B4(r0)
            goto L_0x00e6
        L_0x0098:
            w4.p r0 = r6.U4(r0)
            goto L_0x00e6
        L_0x009d:
            w4.p r0 = r6.P4()
            goto L_0x00e6
        L_0x00a2:
            w4.p r0 = r6.S4()
            goto L_0x00e6
        L_0x00a7:
            java.lang.String r1 = "expected a value"
            r6.t3(r0, r1)
            goto L_0x00be
        L_0x00ad:
            if (r2 != 0) goto L_0x00bb
            d5.d r0 = r6.f15474c1
            int r1 = r6.f15472a1
            int r3 = r6.f15473b1
            d5.d r0 = r0.u(r1, r3)
            r6.f15474c1 = r0
        L_0x00bb:
            w4.p r0 = w4.p.START_OBJECT
            goto L_0x00e6
        L_0x00be:
            r6.K4()
            w4.p r0 = w4.p.VALUE_TRUE
            goto L_0x00e6
        L_0x00c4:
            r6.H4()
            w4.p r0 = w4.p.VALUE_NULL
            goto L_0x00e6
        L_0x00ca:
            r6.G4()
            w4.p r0 = w4.p.VALUE_FALSE
            goto L_0x00e6
        L_0x00d0:
            if (r2 != 0) goto L_0x00de
            d5.d r0 = r6.f15474c1
            int r1 = r6.f15472a1
            int r3 = r6.f15473b1
            d5.d r0 = r0.t(r1, r3)
            r6.f15474c1 = r0
        L_0x00de:
            w4.p r0 = w4.p.START_ARRAY
            goto L_0x00e6
        L_0x00e1:
            r0 = 1
            r6.f6139z1 = r0
            w4.p r0 = w4.p.VALUE_STRING
        L_0x00e6:
            if (r2 == 0) goto L_0x00ec
            r6.f15475d1 = r0
            goto L_0x0047
        L_0x00ec:
            r6.U = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.D2():w4.p");
    }

    public final void D4(int i10) throws IOException {
        p pVar;
        this.U = p.FIELD_NAME;
        l5();
        if (i10 == 34) {
            this.f6139z1 = true;
            pVar = p.VALUE_STRING;
        } else if (i10 == 91) {
            pVar = p.START_ARRAY;
        } else if (i10 == 102) {
            I4("false", 1);
            pVar = p.VALUE_FALSE;
        } else if (i10 == 110) {
            I4("null", 1);
            pVar = p.VALUE_NULL;
        } else if (i10 == 116) {
            I4("true", 1);
            pVar = p.VALUE_TRUE;
        } else if (i10 == 123) {
            pVar = p.START_OBJECT;
        } else if (i10 == 45) {
            pVar = S4();
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
                    pVar = U4(i10);
                    break;
                default:
                    pVar = B4(i10);
                    break;
            }
        } else {
            pVar = P4();
        }
        this.f15475d1 = pVar;
    }

    public boolean E4() throws IOException {
        Reader reader = this.f6133t1;
        if (reader != null) {
            char[] cArr = this.f6134u1;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                int i10 = this.V0;
                long j10 = (long) i10;
                this.W0 += j10;
                this.Y0 -= i10;
                this.A1 -= j10;
                this.U0 = 0;
                this.V0 = read;
                return true;
            }
            G3();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.V0);
            }
        }
        return false;
    }

    public void F4() throws IOException {
        if (!E4()) {
            n3();
        }
    }

    public void G3() throws IOException {
        if (this.f6133t1 != null) {
            if (this.S0.q() || s2(l.a.AUTO_CLOSE_SOURCE)) {
                this.f6133t1.close();
            }
            this.f6133t1 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G4() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.U0
            int r1 = r0 + 4
            int r2 = r5.V0
            r3 = 1
            if (r1 >= r2) goto L_0x0038
            char[] r1 = r5.f6134u1
            char r2 = r1[r0]
            r4 = 97
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 115(0x73, float:1.61E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0038
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x0035
            r2 = 93
            if (r1 == r2) goto L_0x0035
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0038
        L_0x0035:
            r5.U0 = r0
            return
        L_0x0038:
            java.lang.String r0 = "false"
            r5.I4(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.G4():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H4() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.U0
            int r1 = r0 + 3
            int r2 = r5.V0
            r3 = 1
            if (r1 >= r2) goto L_0x002f
            char[] r1 = r5.f6134u1
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r2 = r1[r0]
            if (r2 != r4) goto L_0x002f
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002c
            r2 = 93
            if (r1 == r2) goto L_0x002c
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x002f
        L_0x002c:
            r5.U0 = r0
            return
        L_0x002f:
            java.lang.String r0 = "null"
            r5.I4(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.H4():void");
    }

    public final void I4(String str, int i10) throws IOException {
        int i11;
        int length = str.length();
        if (this.U0 + length >= this.V0) {
            J4(str, i10);
            return;
        }
        do {
            if (this.f6134u1[this.U0] != str.charAt(i10)) {
                W4(str.substring(0, i10));
            }
            i11 = this.U0 + 1;
            this.U0 = i11;
            i10++;
        } while (i10 < length);
        char c10 = this.f6134u1[i11];
        if (c10 >= '0' && c10 != ']' && c10 != '}') {
            s4(str, i10, c10);
        }
    }

    public int J2(w4.a aVar, OutputStream outputStream) throws IOException {
        if (!this.f6139z1 || this.U != p.VALUE_STRING) {
            byte[] m02 = m0(aVar);
            outputStream.write(m02);
            return m02.length;
        }
        byte[] d10 = this.S0.d();
        try {
            return V4(aVar, outputStream, d10);
        } finally {
            this.S0.r(d10);
        }
    }

    public char J3() throws IOException {
        if (this.U0 >= this.V0 && !E4()) {
            p3(" in character escape sequence", p.VALUE_STRING);
        }
        char[] cArr = this.f6134u1;
        int i10 = this.U0;
        this.U0 = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '\"' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return 8;
        }
        if (c10 == 'f') {
            return 12;
        }
        if (c10 == 'n') {
            return 10;
        }
        if (c10 == 'r') {
            return 13;
        }
        if (c10 == 't') {
            return 9;
        }
        if (c10 != 'u') {
            return P3(c10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this.U0 >= this.V0 && !E4()) {
                p3(" in character escape sequence", p.VALUE_STRING);
            }
            char[] cArr2 = this.f6134u1;
            int i13 = this.U0;
            this.U0 = i13 + 1;
            char c11 = cArr2[i13];
            int c12 = a.c(c11);
            if (c12 < 0) {
                t3(c11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | c12;
        }
        return (char) i11;
    }

    public final void J4(String str, int i10) throws IOException {
        int i11;
        char c10;
        int length = str.length();
        do {
            if ((this.U0 >= this.V0 && !E4()) || this.f6134u1[this.U0] != str.charAt(i10)) {
                W4(str.substring(0, i10));
            }
            i11 = this.U0 + 1;
            this.U0 = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this.V0 || E4()) && (c10 = this.f6134u1[this.U0]) >= '0' && c10 != ']' && c10 != '}') {
            s4(str, i10, c10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K4() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.U0
            int r1 = r0 + 3
            int r2 = r5.V0
            r3 = 1
            if (r1 >= r2) goto L_0x0031
            char[] r1 = r5.f6134u1
            char r2 = r1[r0]
            r4 = 114(0x72, float:1.6E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r2 = r1[r0]
            r4 = 101(0x65, float:1.42E-43)
            if (r2 != r4) goto L_0x0031
            int r0 = r0 + r3
            char r1 = r1[r0]
            r2 = 48
            if (r1 < r2) goto L_0x002e
            r2 = 93
            if (r1 == r2) goto L_0x002e
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0031
        L_0x002e:
            r5.U0 = r0
            return
        L_0x0031:
            java.lang.String r0 = "true"
            r5.I4(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.K4():void");
    }

    public Object L1() {
        return this.f6133t1;
    }

    public final void L3() throws IOException {
        int i10 = this.U0;
        int i11 = this.V0;
        if (i10 < i11) {
            int[] iArr = L1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.f6134u1;
                char c10 = cArr[i10];
                if (c10 >= length || iArr[c10] == 0) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                } else if (c10 == '\"') {
                    n nVar = this.f15476e1;
                    int i12 = this.U0;
                    nVar.F(cArr, i12, i10 - i12);
                    this.U0 = i10 + 1;
                    return;
                }
            }
        }
        n nVar2 = this.f15476e1;
        char[] cArr2 = this.f6134u1;
        int i13 = this.U0;
        nVar2.D(cArr2, i13, i10 - i13);
        this.U0 = i10;
        v4();
    }

    public final p L4() {
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

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        r4 = B4(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p M4(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 1
            r1 = 34
            if (r4 != r1) goto L_0x000c
            r3.f6139z1 = r0
            w4.p r4 = w4.p.VALUE_STRING
        L_0x0009:
            r3.U = r4
            return r4
        L_0x000c:
            r1 = 91
            if (r4 == r1) goto L_0x0077
            r1 = 102(0x66, float:1.43E-43)
            if (r4 == r1) goto L_0x006f
            r1 = 110(0x6e, float:1.54E-43)
            if (r4 == r1) goto L_0x0069
            r1 = 116(0x74, float:1.63E-43)
            if (r4 == r1) goto L_0x0061
            r1 = 123(0x7b, float:1.72E-43)
            if (r4 == r1) goto L_0x0052
            switch(r4) {
                case 44: goto L_0x0036;
                case 45: goto L_0x0031;
                case 46: goto L_0x002c;
                default: goto L_0x0023;
            }
        L_0x0023:
            switch(r4) {
                case 48: goto L_0x0027;
                case 49: goto L_0x0027;
                case 50: goto L_0x0027;
                case 51: goto L_0x0027;
                case 52: goto L_0x0027;
                case 53: goto L_0x0027;
                case 54: goto L_0x0027;
                case 55: goto L_0x0027;
                case 56: goto L_0x0027;
                case 57: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x004d
        L_0x0027:
            w4.p r4 = r3.U4(r4)
            goto L_0x0009
        L_0x002c:
            w4.p r4 = r3.P4()
            goto L_0x0009
        L_0x0031:
            w4.p r4 = r3.S4()
            goto L_0x0009
        L_0x0036:
            d5.d r1 = r3.f15474c1
            boolean r1 = r1.m()
            if (r1 != 0) goto L_0x004d
            int r1 = r3.O
            int r2 = G1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x004d
            int r4 = r3.U0
            int r4 = r4 - r0
            r3.U0 = r4
        L_0x004a:
            w4.p r4 = w4.p.VALUE_NULL
            goto L_0x0009
        L_0x004d:
            w4.p r4 = r3.B4(r4)
            goto L_0x0009
        L_0x0052:
            d5.d r4 = r3.f15474c1
            int r0 = r3.f15472a1
            int r1 = r3.f15473b1
            d5.d r4 = r4.u(r0, r1)
            r3.f15474c1 = r4
            w4.p r4 = w4.p.START_OBJECT
            goto L_0x0009
        L_0x0061:
            java.lang.String r4 = "true"
            r3.I4(r4, r0)
            w4.p r4 = w4.p.VALUE_TRUE
            goto L_0x0009
        L_0x0069:
            java.lang.String r4 = "null"
            r3.I4(r4, r0)
            goto L_0x004a
        L_0x006f:
            java.lang.String r4 = "false"
            r3.I4(r4, r0)
            w4.p r4 = w4.p.VALUE_FALSE
            goto L_0x0009
        L_0x0077:
            d5.d r4 = r3.f15474c1
            int r0 = r3.f15472a1
            int r1 = r3.f15473b1
            d5.d r4 = r4.t(r0, r1)
            r3.f15474c1 = r4
            w4.p r4 = w4.p.START_ARRAY
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.M4(int):w4.p");
    }

    public String N4() throws IOException {
        int i10 = this.U0;
        int i11 = this.f6138y1;
        int i12 = this.V0;
        if (i10 < i12) {
            int[] iArr = L1;
            int length = iArr.length;
            do {
                char[] cArr = this.f6134u1;
                char c10 = cArr[i10];
                if (c10 != '\'') {
                    if (c10 < length && iArr[c10] != 0) {
                        break;
                    }
                    i11 = (i11 * 33) + c10;
                    i10++;
                } else {
                    int i13 = this.U0;
                    this.U0 = i10 + 1;
                    return this.f6137x1.q(cArr, i13, i10 - i13, i11);
                }
            } while (i10 < i12);
        }
        int i14 = this.U0;
        this.U0 = i10;
        return R4(i14, i11, 39);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r9 == 'E') goto L_0x0037;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w4.p O4(int r9, int r10, int r11, boolean r12, int r13) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.V0
            r1 = 57
            r2 = 48
            r3 = 0
            r4 = 46
            if (r9 != r4) goto L_0x002d
            r9 = r3
        L_0x000c:
            if (r11 < r0) goto L_0x0013
            w4.p r9 = r8.T4(r12, r10)
            return r9
        L_0x0013:
            char[] r4 = r8.f6134u1
            int r5 = r11 + 1
            char r11 = r4[r11]
            if (r11 < r2) goto L_0x0022
            if (r11 <= r1) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            int r9 = r9 + 1
            r11 = r5
            goto L_0x000c
        L_0x0022:
            if (r9 != 0) goto L_0x0029
            java.lang.String r4 = "Decimal point not followed by a digit"
            r8.E3(r11, r4)
        L_0x0029:
            r7 = r11
            r11 = r9
            r9 = r7
            goto L_0x002f
        L_0x002d:
            r5 = r11
            r11 = r3
        L_0x002f:
            r4 = 101(0x65, float:1.42E-43)
            if (r9 == r4) goto L_0x0037
            r4 = 69
            if (r9 != r4) goto L_0x007c
        L_0x0037:
            if (r5 < r0) goto L_0x0040
            r8.U0 = r10
            w4.p r9 = r8.T4(r12, r10)
            return r9
        L_0x0040:
            char[] r9 = r8.f6134u1
            int r4 = r5 + 1
            char r5 = r9[r5]
            r6 = 45
            if (r5 == r6) goto L_0x0052
            r6 = 43
            if (r5 != r6) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r9 = r5
        L_0x0050:
            r5 = r4
            goto L_0x005f
        L_0x0052:
            if (r4 < r0) goto L_0x005b
            r8.U0 = r10
            w4.p r9 = r8.T4(r12, r10)
            return r9
        L_0x005b:
            int r5 = r4 + 1
            char r9 = r9[r4]
        L_0x005f:
            if (r9 > r1) goto L_0x0075
            if (r9 < r2) goto L_0x0075
            int r3 = r3 + 1
            if (r5 < r0) goto L_0x006e
            r8.U0 = r10
            w4.p r9 = r8.T4(r12, r10)
            return r9
        L_0x006e:
            char[] r9 = r8.f6134u1
            int r4 = r5 + 1
            char r9 = r9[r5]
            goto L_0x0050
        L_0x0075:
            if (r3 != 0) goto L_0x007c
            java.lang.String r0 = "Exponent indicator not followed by a digit"
            r8.E3(r9, r0)
        L_0x007c:
            int r5 = r5 + -1
            r8.U0 = r5
            d5.d r0 = r8.f15474c1
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x008b
            r8.p5(r9)
        L_0x008b:
            int r5 = r5 - r10
            h5.n r9 = r8.f15476e1
            char[] r0 = r8.f6134u1
            r9.F(r0, r10, r5)
            w4.p r9 = r8.q4(r12, r13, r11, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.O4(int, int, int, boolean, int):w4.p");
    }

    public final p P4() throws IOException {
        if (!s2(e.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.i())) {
            return B4(46);
        }
        int i10 = this.U0;
        return O4(46, i10 - 1, i10, false, 0);
    }

    public int Q2(Writer writer) throws IOException {
        int i10 = this.V0;
        int i11 = this.U0;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        this.U0 = i11 + i12;
        writer.write(this.f6134u1, i11, i12);
        return i12;
    }

    public final String Q4() throws IOException {
        int i10 = this.U0;
        int i11 = this.f6138y1;
        int[] iArr = L1;
        while (true) {
            if (i10 >= this.V0) {
                break;
            }
            char[] cArr = this.f6134u1;
            char c10 = cArr[i10];
            if (c10 >= iArr.length || iArr[c10] == 0) {
                i11 = (i11 * 33) + c10;
                i10++;
            } else if (c10 == '\"') {
                int i12 = this.U0;
                this.U0 = i10 + 1;
                return this.f6137x1.q(cArr, i12, i10 - i12, i11);
            }
        }
        int i13 = this.U0;
        this.U0 = i10;
        return R4(i13, i11, 34);
    }

    public final String R4(int i10, int i11, int i12) throws IOException {
        this.f15476e1.F(this.f6134u1, i10, this.U0 - i10);
        char[] v10 = this.f15476e1.v();
        int w10 = this.f15476e1.w();
        while (true) {
            if (this.U0 >= this.V0 && !E4()) {
                p3(" in field name", p.FIELD_NAME);
            }
            char[] cArr = this.f6134u1;
            int i13 = this.U0;
            this.U0 = i13 + 1;
            char c10 = cArr[i13];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    c10 = J3();
                } else if (c10 <= i12) {
                    if (c10 == i12) {
                        this.f15476e1.J(w10);
                        n nVar = this.f15476e1;
                        return this.f6137x1.q(nVar.x(), nVar.y(), nVar.K(), i11);
                    } else if (c10 < ' ') {
                        X3(c10, "name");
                    }
                }
            }
            i11 = (i11 * 33) + c10;
            int i14 = w10 + 1;
            v10[w10] = c10;
            if (i14 >= v10.length) {
                v10 = this.f15476e1.s();
                w10 = 0;
            } else {
                w10 = i14;
            }
        }
    }

    public void S2(s sVar) {
        this.f6136w1 = sVar;
    }

    public final p S4() throws IOException {
        int i10 = this.U0;
        int i11 = i10 - 1;
        int i12 = this.V0;
        if (i10 >= i12) {
            return T4(true, i11);
        }
        int i13 = i10 + 1;
        char c10 = this.f6134u1[i10];
        if (c10 > '9' || c10 < '0') {
            this.U0 = i13;
            return y4(c10, true);
        } else if (c10 == '0') {
            return T4(true, i11);
        } else {
            int i14 = 1;
            while (i13 < i12) {
                int i15 = i13 + 1;
                char c11 = this.f6134u1[i13];
                if (c11 >= '0' && c11 <= '9') {
                    i14++;
                    i13 = i15;
                } else if (c11 == '.' || c11 == 'e' || c11 == 'E') {
                    this.U0 = i15;
                    return O4(c11, i11, i15, true, i14);
                } else {
                    int i16 = i15 - 1;
                    this.U0 = i16;
                    if (this.f15474c1.m()) {
                        p5(c11);
                    }
                    this.f15476e1.F(this.f6134u1, i11, i16 - i11);
                    return r4(true, i14);
                }
            }
            return T4(true, i11);
        }
    }

    public s T0() {
        return this.f6136w1;
    }

    public final p T4(boolean z10, int i10) throws IOException {
        int i11;
        char c10;
        boolean z11;
        int i12;
        char c11;
        char q52;
        int i13;
        if (z10) {
            i10++;
        }
        this.U0 = i10;
        char[] n10 = this.f15476e1.n();
        int i14 = 0;
        if (z10) {
            n10[0] = '-';
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i15 = this.U0;
        if (i15 < this.V0) {
            char[] cArr = this.f6134u1;
            this.U0 = i15 + 1;
            c10 = cArr[i15];
        } else {
            c10 = r5("No digit following minus sign", p.VALUE_NUMBER_INT);
        }
        if (c10 == '0') {
            c10 = o5();
        }
        int i16 = 0;
        while (true) {
            if (c10 >= '0' && c10 <= '9') {
                i16++;
                if (i11 >= n10.length) {
                    n10 = this.f15476e1.s();
                    i11 = 0;
                }
                int i17 = i11 + 1;
                n10[i11] = c10;
                if (this.U0 >= this.V0 && !E4()) {
                    c10 = 0;
                    i11 = i17;
                    z11 = true;
                    break;
                }
                char[] cArr2 = this.f6134u1;
                int i18 = this.U0;
                this.U0 = i18 + 1;
                c10 = cArr2[i18];
                i11 = i17;
            } else {
                z11 = false;
            }
        }
        z11 = false;
        if (i16 == 0) {
            return y4(c10, z10);
        }
        if (c10 == '.') {
            if (i11 >= n10.length) {
                n10 = this.f15476e1.s();
                i11 = 0;
            }
            n10[i11] = c10;
            int i19 = i11 + 1;
            i12 = 0;
            while (true) {
                if (this.U0 >= this.V0 && !E4()) {
                    z11 = true;
                    break;
                }
                char[] cArr3 = this.f6134u1;
                int i20 = this.U0;
                this.U0 = i20 + 1;
                c10 = cArr3[i20];
                if (c10 < '0' || c10 > '9') {
                    break;
                }
                i12++;
                if (i11 >= n10.length) {
                    n10 = this.f15476e1.s();
                    i11 = 0;
                }
                n10[i11] = c10;
                i19 = i11 + 1;
            }
            if (i12 == 0) {
                E3(c10, "Decimal point not followed by a digit");
            }
        } else {
            i12 = 0;
        }
        if (c10 == 'e' || c10 == 'E') {
            if (i11 >= n10.length) {
                n10 = this.f15476e1.s();
                i11 = 0;
            }
            int i21 = i11 + 1;
            n10[i11] = c10;
            int i22 = this.U0;
            if (i22 < this.V0) {
                char[] cArr4 = this.f6134u1;
                this.U0 = i22 + 1;
                c11 = cArr4[i22];
            } else {
                c11 = q5("expected a digit for number exponent");
            }
            if (c11 == '-' || c11 == '+') {
                if (i21 >= n10.length) {
                    n10 = this.f15476e1.s();
                    i21 = 0;
                }
                int i23 = i21 + 1;
                n10[i21] = c11;
                int i24 = this.U0;
                if (i24 < this.V0) {
                    char[] cArr5 = this.f6134u1;
                    this.U0 = i24 + 1;
                    q52 = cArr5[i24];
                } else {
                    q52 = q5("expected a digit for number exponent");
                }
                i21 = i23;
            }
            int i25 = 0;
            char c12 = c11;
            while (true) {
                if (c10 <= '9' && c10 >= '0') {
                    i25++;
                    if (i21 >= n10.length) {
                        n10 = this.f15476e1.s();
                        i21 = 0;
                    }
                    i13 = i21 + 1;
                    n10[i21] = c10;
                    if (this.U0 >= this.V0 && !E4()) {
                        i14 = i25;
                        z11 = true;
                        break;
                    }
                    char[] cArr6 = this.f6134u1;
                    int i26 = this.U0;
                    this.U0 = i26 + 1;
                    c12 = cArr6[i26];
                    i21 = i13;
                } else {
                    i14 = i25;
                    i13 = i21;
                }
            }
            i14 = i25;
            i13 = i21;
            if (i14 == 0) {
                E3(c10, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this.U0--;
            if (this.f15474c1.m()) {
                p5(c10);
            }
        }
        this.f15476e1.J(i11);
        return o4(z10, i16, i12, i14);
    }

    public void U3() throws IOException {
        char[] cArr;
        super.U3();
        this.f6137x1.x();
        if (this.f6135v1 && (cArr = this.f6134u1) != null) {
            this.f6134u1 = null;
            this.S0.v(cArr);
        }
    }

    public final p U4(int i10) throws IOException {
        int i11 = this.U0;
        int i12 = i11 - 1;
        int i13 = this.V0;
        if (i10 == 48) {
            return T4(false, i12);
        }
        int i14 = 1;
        while (i11 < i13) {
            int i15 = i11 + 1;
            char c10 = this.f6134u1[i11];
            if (c10 >= '0' && c10 <= '9') {
                i14++;
                i11 = i15;
            } else if (c10 == '.' || c10 == 'e' || c10 == 'E') {
                this.U0 = i15;
                return O4(c10, i12, i15, false, i14);
            } else {
                int i16 = i15 - 1;
                this.U0 = i16;
                if (this.f15474c1.m()) {
                    p5(c10);
                }
                this.f15476e1.F(this.f6134u1, i12, i16 - i12);
                return r4(false, i14);
            }
        }
        this.U0 = i12;
        return T4(false, i12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r10 < 0) goto L_0x015f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int V4(w4.a r17, java.io.OutputStream r18, byte[] r19) throws java.io.IOException {
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
            r16.F4()
        L_0x0017:
            char[] r9 = r0.f6134u1
            int r10 = r0.U0
            int r11 = r10 + 1
            r0.U0 = r11
            char r9 = r9[r10]
            r10 = 32
            if (r9 <= r10) goto L_0x015f
            int r10 = r1.f(r9)
            r11 = 34
            if (r10 >= 0) goto L_0x0039
            if (r9 != r11) goto L_0x0031
            goto L_0x0124
        L_0x0031:
            int r10 = r0.H3(r1, r9, r6)
            if (r10 >= 0) goto L_0x0039
            goto L_0x015f
        L_0x0039:
            if (r7 <= r4) goto L_0x0040
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
            r7 = r6
        L_0x0040:
            int r9 = r0.U0
            int r12 = r0.V0
            if (r9 < r12) goto L_0x0049
            r16.F4()
        L_0x0049:
            char[] r9 = r0.f6134u1
            int r12 = r0.U0
            int r13 = r12 + 1
            r0.U0 = r13
            char r9 = r9[r12]
            int r12 = r1.f(r9)
            r13 = 1
            if (r12 >= 0) goto L_0x005e
            int r12 = r0.H3(r1, r9, r13)
        L_0x005e:
            int r9 = r10 << 6
            r9 = r9 | r12
            int r10 = r0.U0
            int r12 = r0.V0
            if (r10 < r12) goto L_0x006a
            r16.F4()
        L_0x006a:
            char[] r10 = r0.f6134u1
            int r12 = r0.U0
            int r14 = r12 + 1
            r0.U0 = r14
            char r10 = r10[r12]
            int r12 = r1.f(r10)
            r14 = 2
            r15 = -2
            if (r12 >= 0) goto L_0x00e8
            if (r12 == r15) goto L_0x009d
            if (r10 != r11) goto L_0x0098
            int r4 = r9 >> 4
            int r5 = r7 + 1
            byte r4 = (byte) r4
            r3[r7] = r4
            boolean r4 = r17.y()
            if (r4 == 0) goto L_0x0095
            int r4 = r0.U0
            int r4 = r4 - r13
            r0.U0 = r4
            r16.O3(r17)
        L_0x0095:
            r7 = r5
            goto L_0x0124
        L_0x0098:
            int r10 = r0.H3(r1, r10, r14)
            r12 = r10
        L_0x009d:
            if (r12 != r15) goto L_0x00e8
            int r10 = r0.U0
            int r11 = r0.V0
            if (r10 < r11) goto L_0x00a8
            r16.F4()
        L_0x00a8:
            char[] r10 = r0.f6134u1
            int r11 = r0.U0
            int r12 = r11 + 1
            r0.U0 = r12
            char r10 = r10[r11]
            boolean r11 = r1.z(r10)
            if (r11 != 0) goto L_0x00de
            int r11 = r0.H3(r1, r10, r5)
            if (r11 != r15) goto L_0x00bf
            goto L_0x00de
        L_0x00bf:
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
        L_0x00de:
            int r9 = r9 >> 4
            int r10 = r7 + 1
            byte r9 = (byte) r9
            r3[r7] = r9
            r7 = r10
            goto L_0x000e
        L_0x00e8:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r10 = r0.U0
            int r12 = r0.V0
            if (r10 < r12) goto L_0x00f4
            r16.F4()
        L_0x00f4:
            char[] r10 = r0.f6134u1
            int r12 = r0.U0
            int r5 = r12 + 1
            r0.U0 = r5
            char r5 = r10[r12]
            int r10 = r1.f(r5)
            if (r10 >= 0) goto L_0x0146
            if (r10 == r15) goto L_0x0134
            if (r5 != r11) goto L_0x012d
            int r4 = r9 >> 2
            int r5 = r7 + 1
            int r9 = r4 >> 8
            byte r9 = (byte) r9
            r3[r7] = r9
            int r7 = r5 + 1
            byte r4 = (byte) r4
            r3[r5] = r4
            boolean r4 = r17.y()
            if (r4 == 0) goto L_0x0124
            int r4 = r0.U0
            int r4 = r4 - r13
            r0.U0 = r4
            r16.O3(r17)
        L_0x0124:
            r0.f6139z1 = r6
            if (r7 <= 0) goto L_0x012c
            int r8 = r8 + r7
            r2.write(r3, r6, r7)
        L_0x012c:
            return r8
        L_0x012d:
            r11 = 3
            int r5 = r0.H3(r1, r5, r11)
            r10 = r5
            goto L_0x0135
        L_0x0134:
            r11 = 3
        L_0x0135:
            if (r10 != r15) goto L_0x0147
            int r5 = r9 >> 2
            int r9 = r7 + 1
            int r10 = r5 >> 8
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r9 + 1
            byte r5 = (byte) r5
            r3[r9] = r5
            goto L_0x0160
        L_0x0146:
            r11 = 3
        L_0x0147:
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
            goto L_0x0160
        L_0x015f:
            r11 = r5
        L_0x0160:
            r5 = r11
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.V4(w4.a, java.io.OutputStream, byte[]):int");
    }

    public j W0() {
        return new j(N3(), -1, ((long) this.U0) + this.W0, this.X0, (this.U0 - this.Y0) + 1);
    }

    public void W4(String str) throws IOException {
        X4(str, Y3());
    }

    public int X1(Writer writer) throws IOException {
        p pVar = this.U;
        if (pVar == p.VALUE_STRING) {
            if (this.f6139z1) {
                this.f6139z1 = false;
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

    public void X4(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this.U0 >= this.V0 && !E4()) {
                break;
            }
            char c10 = this.f6134u1[this.U0];
            if (Character.isJavaIdentifierPart(c10)) {
                this.U0++;
                sb2.append(c10);
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

    public final String Y1() throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING) {
            return w4(pVar);
        }
        if (this.f6139z1) {
            this.f6139z1 = false;
            L3();
        }
        return this.f15476e1.l();
    }

    public final int Y4() throws IOException {
        char c10;
        while (true) {
            if (this.U0 < this.V0 || E4()) {
                char[] cArr = this.f6134u1;
                int i10 = this.U0;
                int i11 = i10 + 1;
                this.U0 = i11;
                c10 = cArr[i10];
                if (c10 > ' ') {
                    if (c10 == '/') {
                        f5();
                    } else if (c10 != '#' || !k5()) {
                        return c10;
                    }
                } else if (c10 < ' ') {
                    if (c10 == 10) {
                        this.X0++;
                        this.Y0 = i11;
                    } else if (c10 == 13) {
                        a5();
                    } else if (c10 != 9) {
                        v3(c10);
                    }
                }
            } else {
                throw k("Unexpected end-of-input within/between " + this.f15474c1.q() + " entries");
            }
        }
        return c10;
    }

    public final char[] Z1() throws IOException {
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
            } else if (this.f6139z1) {
                this.f6139z1 = false;
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

    public final void Z4() throws IOException {
        while (true) {
            if (this.U0 >= this.V0 && !E4()) {
                break;
            }
            char[] cArr = this.f6134u1;
            int i10 = this.U0;
            int i11 = i10 + 1;
            this.U0 = i11;
            char c10 = cArr[i10];
            if (c10 <= '*') {
                if (c10 == '*') {
                    if (i11 >= this.V0 && !E4()) {
                        break;
                    }
                    char[] cArr2 = this.f6134u1;
                    int i12 = this.U0;
                    if (cArr2[i12] == '/') {
                        this.U0 = i12 + 1;
                        return;
                    }
                } else if (c10 < ' ') {
                    if (c10 == 10) {
                        this.X0++;
                        this.Y0 = i11;
                    } else if (c10 == 13) {
                        a5();
                    } else if (c10 != 9) {
                        v3(c10);
                    }
                }
            }
        }
        p3(" in a comment", (p) null);
    }

    public final int a2() throws IOException {
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
        } else if (this.f6139z1) {
            this.f6139z1 = false;
            L3();
        }
        return this.f15476e1.K();
    }

    public final void a5() throws IOException {
        if (this.U0 < this.V0 || E4()) {
            char[] cArr = this.f6134u1;
            int i10 = this.U0;
            if (cArr[i10] == 10) {
                this.U0 = i10 + 1;
            }
        }
        this.X0++;
        this.Y0 = this.U0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 8) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b2() throws java.io.IOException {
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
            boolean r0 = r3.f6139z1
            if (r0 == 0) goto L_0x001d
            r3.f6139z1 = r1
            r3.L3()
        L_0x001d:
            h5.n r0 = r3.f15476e1
            int r0 = r0.y()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.b2():int");
    }

    public final int b5() throws IOException {
        int i10;
        char c10;
        int i11;
        char c11;
        int i12 = this.U0;
        if (i12 + 4 >= this.V0) {
            return c5(false);
        }
        char[] cArr = this.f6134u1;
        char c12 = cArr[i12];
        if (c12 == ':') {
            i10 = i12 + 1;
            this.U0 = i10;
            c10 = cArr[i10];
            if (c10 <= ' ') {
                if (c10 == ' ' || c10 == 9) {
                    i11 = i10 + 1;
                    this.U0 = i11;
                    c11 = cArr[i11];
                    if (c11 > ' ') {
                        if (c11 == '/' || c11 == '#') {
                            return c5(true);
                        }
                        this.U0 = i11 + 1;
                        return c11;
                    }
                }
                return c5(true);
            } else if (c10 == '/' || c10 == '#') {
                return c5(true);
            }
        } else {
            if (c12 == ' ' || c12 == 9) {
                int i13 = i12 + 1;
                this.U0 = i13;
                c12 = cArr[i13];
            }
            if (c12 != ':') {
                return c5(false);
            }
            i10 = this.U0 + 1;
            this.U0 = i10;
            c10 = cArr[i10];
            if (c10 <= ' ') {
                if (c10 == ' ' || c10 == 9) {
                    i11 = i10 + 1;
                    this.U0 = i11;
                    c11 = cArr[i11];
                    if (c11 > ' ') {
                        if (c11 == '/' || c11 == '#') {
                            return c5(true);
                        }
                        this.U0 = i11 + 1;
                        return c11;
                    }
                }
                return c5(true);
            } else if (c10 == '/' || c10 == '#') {
                return c5(true);
            }
        }
        this.U0 = i10 + 1;
        return c10;
    }

    public void c0() throws IOException {
        if (this.f6139z1) {
            this.f6139z1 = false;
            L3();
        }
    }

    public j c2() {
        if (this.U == p.FIELD_NAME) {
            return new j(N3(), -1, this.W0 + (this.A1 - 1), this.B1, this.C1);
        }
        return new j(N3(), -1, this.Z0 - 1, this.f15472a1, this.f15473b1);
    }

    public final int c5(boolean z10) throws IOException {
        while (true) {
            if (this.U0 < this.V0 || E4()) {
                char[] cArr = this.f6134u1;
                int i10 = this.U0;
                int i11 = i10 + 1;
                this.U0 = i11;
                char c10 = cArr[i10];
                if (c10 > ' ') {
                    if (c10 == '/') {
                        f5();
                    } else if (c10 != '#' || !k5()) {
                        if (z10) {
                            return c10;
                        }
                        if (c10 != ':') {
                            t3(c10, "was expecting a colon to separate field name and value");
                        }
                        z10 = true;
                    }
                } else if (c10 < ' ') {
                    if (c10 == 10) {
                        this.X0++;
                        this.Y0 = i11;
                    } else if (c10 == 13) {
                        a5();
                    } else if (c10 != 9) {
                        v3(c10);
                    }
                }
            } else {
                p3(" within/between " + this.f15474c1.q() + " entries", (p) null);
                return -1;
            }
        }
    }

    public final int d5(int i10) throws IOException {
        char[] cArr = this.f6134u1;
        int i11 = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == ':') {
            int i12 = i11 + 1;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (!(c11 == '/' || c11 == '#')) {
                    this.U0 = i12;
                    return c11;
                }
            } else if (c11 == ' ' || c11 == 9) {
                int i13 = i12 + 1;
                char c12 = cArr[i12];
                if (c12 <= ' ' || c12 == '/' || c12 == '#') {
                    i12 = i13;
                } else {
                    this.U0 = i13;
                    return c12;
                }
            }
            this.U0 = i12 - 1;
            return c5(true);
        }
        if (c10 == ' ' || c10 == 9) {
            char c13 = cArr[i11];
            i11++;
            c10 = c13;
        }
        boolean z10 = c10 == ':';
        if (z10) {
            int i14 = i11 + 1;
            char c14 = cArr[i11];
            if (c14 > ' ') {
                if (!(c14 == '/' || c14 == '#')) {
                    this.U0 = i14;
                    return c14;
                }
            } else if (c14 == ' ' || c14 == 9) {
                i11 = i14 + 1;
                char c15 = cArr[i14];
                if (!(c15 <= ' ' || c15 == '/' || c15 == '#')) {
                    this.U0 = i11;
                    return c15;
                }
            }
            i11 = i14;
        }
        this.U0 = i11 - 1;
        return c5(z10);
    }

    public final int e5(int i10) throws IOException {
        if (i10 != 44) {
            t3(i10, "was expecting comma to separate " + this.f15474c1.q() + " entries");
        }
        while (true) {
            int i11 = this.U0;
            if (i11 >= this.V0) {
                return Y4();
            }
            char[] cArr = this.f6134u1;
            int i12 = i11 + 1;
            this.U0 = i12;
            char c10 = cArr[i11];
            if (c10 > ' ') {
                if (c10 != '/' && c10 != '#') {
                    return c10;
                }
                this.U0 = i12 - 1;
                return Y4();
            } else if (c10 < ' ') {
                if (c10 == 10) {
                    this.X0++;
                    this.Y0 = i12;
                } else if (c10 == 13) {
                    a5();
                } else if (c10 != 9) {
                    v3(c10);
                }
            }
        }
    }

    public final void f5() throws IOException {
        if ((this.O & J1) == 0) {
            t3(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.U0 >= this.V0 && !E4()) {
            p3(" in a comment", (p) null);
        }
        char[] cArr = this.f6134u1;
        int i10 = this.U0;
        this.U0 = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '/') {
            g5();
        } else if (c10 == '*') {
            Z4();
        } else {
            t3(c10, "was expecting either '*' or '/' for a comment");
        }
    }

    public final void g5() throws IOException {
        while (true) {
            if (this.U0 < this.V0 || E4()) {
                char[] cArr = this.f6134u1;
                int i10 = this.U0;
                int i11 = i10 + 1;
                this.U0 = i11;
                char c10 = cArr[i10];
                if (c10 < ' ') {
                    if (c10 == 10) {
                        this.X0++;
                        this.Y0 = i11;
                        return;
                    } else if (c10 == 13) {
                        a5();
                        return;
                    } else if (c10 != 9) {
                        v3(c10);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void h5() throws IOException {
        this.f6139z1 = false;
        int i10 = this.U0;
        int i11 = this.V0;
        char[] cArr = this.f6134u1;
        while (true) {
            if (i10 >= i11) {
                this.U0 = i10;
                if (!E4()) {
                    p3(": was expecting closing quote for a string value", p.VALUE_STRING);
                }
                i10 = this.U0;
                i11 = this.V0;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    this.U0 = i12;
                    J3();
                    i10 = this.U0;
                    i11 = this.V0;
                } else if (c10 <= '\"') {
                    if (c10 == '\"') {
                        this.U0 = i12;
                        return;
                    } else if (c10 < ' ') {
                        this.U0 = i12;
                        X3(c10, "string value");
                    }
                }
            }
            i10 = i12;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r0 != 9) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        v3(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i5() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.U0
            int r1 = r9.V0
            if (r0 < r1) goto L_0x0011
            boolean r0 = r9.E4()
            if (r0 != 0) goto L_0x0011
            int r0 = r9.K3()
            return r0
        L_0x0011:
            char[] r0 = r9.f6134u1
            int r1 = r9.U0
            int r2 = r1 + 1
            r9.U0 = r2
            char r0 = r0[r1]
            r1 = 35
            r3 = 47
            r4 = 32
            if (r0 <= r4) goto L_0x0032
            if (r0 == r3) goto L_0x0029
            if (r0 != r1) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            return r0
        L_0x0029:
            int r2 = r2 + -1
            r9.U0 = r2
        L_0x002d:
            int r0 = r9.j5()
            return r0
        L_0x0032:
            r5 = 9
            r6 = 13
            r7 = 10
            if (r0 == r4) goto L_0x0050
            if (r0 != r7) goto L_0x0045
            int r0 = r9.X0
            int r0 = r0 + 1
            r9.X0 = r0
            r9.Y0 = r2
            goto L_0x0050
        L_0x0045:
            if (r0 != r6) goto L_0x004b
        L_0x0047:
            r9.a5()
            goto L_0x0050
        L_0x004b:
            if (r0 == r5) goto L_0x0050
        L_0x004d:
            r9.v3(r0)
        L_0x0050:
            int r0 = r9.U0
            int r2 = r9.V0
            if (r0 >= r2) goto L_0x007e
            char[] r2 = r9.f6134u1
            int r8 = r0 + 1
            r9.U0 = r8
            char r0 = r2[r0]
            if (r0 <= r4) goto L_0x006b
            if (r0 == r3) goto L_0x0066
            if (r0 != r1) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r0
        L_0x0066:
            int r8 = r8 + -1
            r9.U0 = r8
            goto L_0x002d
        L_0x006b:
            if (r0 == r4) goto L_0x0050
            if (r0 != r7) goto L_0x0078
            int r0 = r9.X0
            int r0 = r0 + 1
            r9.X0 = r0
            r9.Y0 = r8
            goto L_0x0050
        L_0x0078:
            if (r0 != r6) goto L_0x007b
            goto L_0x0047
        L_0x007b:
            if (r0 == r5) goto L_0x0050
            goto L_0x004d
        L_0x007e:
            int r0 = r9.j5()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.i.i5():int");
    }

    public final int j5() throws IOException {
        char c10;
        while (true) {
            if (this.U0 >= this.V0 && !E4()) {
                return K3();
            }
            char[] cArr = this.f6134u1;
            int i10 = this.U0;
            int i11 = i10 + 1;
            this.U0 = i11;
            c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    f5();
                } else if (c10 != '#' || !k5()) {
                    return c10;
                }
            } else if (c10 != ' ') {
                if (c10 == 10) {
                    this.X0++;
                    this.Y0 = i11;
                } else if (c10 == 13) {
                    a5();
                } else if (c10 != 9) {
                    v3(c10);
                }
            }
        }
        return c10;
    }

    public final boolean k5() throws IOException {
        if ((this.O & K1) == 0) {
            return false;
        }
        g5();
        return true;
    }

    public final void l5() {
        int i10 = this.U0;
        this.Z0 = this.W0 + ((long) i10);
        this.f15472a1 = this.X0;
        this.f15473b1 = i10 - this.Y0;
    }

    public byte[] m0(w4.a aVar) throws IOException {
        byte[] bArr;
        p pVar = this.U;
        if (pVar == p.VALUE_EMBEDDED_OBJECT && (bArr = this.f15480i1) != null) {
            return bArr;
        }
        if (pVar != p.VALUE_STRING) {
            j3("Current token (" + this.U + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f6139z1) {
            try {
                this.f15480i1 = u4(aVar);
                this.f6139z1 = false;
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

    public final String m2() throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING) {
            return pVar == p.FIELD_NAME ? X0() : super.n2((String) null);
        }
        if (this.f6139z1) {
            this.f6139z1 = false;
            L3();
        }
        return this.f15476e1.l();
    }

    public final void m5() {
        int i10 = this.U0;
        this.A1 = (long) i10;
        this.B1 = this.X0;
        this.C1 = i10 - this.Y0;
    }

    public final String n2(String str) throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING) {
            return pVar == p.FIELD_NAME ? X0() : super.n2(str);
        }
        if (this.f6139z1) {
            this.f6139z1 = false;
            L3();
        }
        return this.f15476e1.l();
    }

    public final char n5() throws IOException {
        char c10;
        if ((this.U0 >= this.V0 && !E4()) || (c10 = this.f6134u1[this.U0]) < '0' || c10 > '9') {
            return '0';
        }
        if ((this.O & E1) == 0) {
            x3("Leading zeroes not allowed");
        }
        this.U0++;
        if (c10 == '0') {
            do {
                if (this.U0 >= this.V0 && !E4()) {
                    break;
                }
                char[] cArr = this.f6134u1;
                int i10 = this.U0;
                c10 = cArr[i10];
                if (c10 < '0' || c10 > '9') {
                    return '0';
                }
                this.U0 = i10 + 1;
            } while (c10 == '0');
        }
        return c10;
    }

    public final char o5() throws IOException {
        char c10;
        int i10 = this.U0;
        if (i10 >= this.V0 || ((c10 = this.f6134u1[i10]) >= '0' && c10 <= '9')) {
            return n5();
        }
        return '0';
    }

    public final void p5(int i10) throws IOException {
        int i11 = this.U0 + 1;
        this.U0 = i11;
        if (i10 == 9) {
            return;
        }
        if (i10 == 10) {
            this.X0++;
            this.Y0 = i11;
        } else if (i10 == 13) {
            a5();
        } else if (i10 != 32) {
            s3(i10);
        }
    }

    @Deprecated
    public char q5(String str) throws IOException {
        return r5(str, (p) null);
    }

    public char r5(String str, p pVar) throws IOException {
        if (this.U0 >= this.V0 && !E4()) {
            p3(str, pVar);
        }
        char[] cArr = this.f6134u1;
        int i10 = this.U0;
        this.U0 = i10 + 1;
        return cArr[i10];
    }

    public final void s4(String str, int i10, int i11) throws IOException {
        if (Character.isJavaIdentifierPart((char) i11)) {
            W4(str.substring(0, i10));
        }
    }

    public final void t4(int i10) throws k {
        if (i10 == 93) {
            l5();
            if (!this.f15474c1.k()) {
                V3(i10, '}');
            }
            this.f15474c1 = this.f15474c1.s();
            this.U = p.END_ARRAY;
        }
        if (i10 == 125) {
            l5();
            if (!this.f15474c1.l()) {
                V3(i10, ']');
            }
            this.f15474c1 = this.f15474c1.s();
            this.U = p.END_OBJECT;
        }
    }

    public byte[] u4(w4.a aVar) throws IOException {
        c M3 = M3();
        while (true) {
            if (this.U0 >= this.V0) {
                F4();
            }
            char[] cArr = this.f6134u1;
            int i10 = this.U0;
            this.U0 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                int f10 = aVar.f(c10);
                if (f10 < 0) {
                    if (c10 == '\"') {
                        return M3.P();
                    }
                    f10 = H3(aVar, c10, 0);
                    if (f10 < 0) {
                        continue;
                    }
                }
                if (this.U0 >= this.V0) {
                    F4();
                }
                char[] cArr2 = this.f6134u1;
                int i11 = this.U0;
                this.U0 = i11 + 1;
                char c11 = cArr2[i11];
                int f11 = aVar.f(c11);
                if (f11 < 0) {
                    f11 = H3(aVar, c11, 1);
                }
                int i12 = (f10 << 6) | f11;
                if (this.U0 >= this.V0) {
                    F4();
                }
                char[] cArr3 = this.f6134u1;
                int i13 = this.U0;
                this.U0 = i13 + 1;
                char c12 = cArr3[i13];
                int f12 = aVar.f(c12);
                if (f12 < 0) {
                    if (f12 != -2) {
                        if (c12 == '\"') {
                            M3.f(i12 >> 4);
                            if (aVar.y()) {
                                this.U0--;
                                O3(aVar);
                            }
                            return M3.P();
                        }
                        f12 = H3(aVar, c12, 2);
                    }
                    if (f12 == -2) {
                        if (this.U0 >= this.V0) {
                            F4();
                        }
                        char[] cArr4 = this.f6134u1;
                        int i14 = this.U0;
                        this.U0 = i14 + 1;
                        char c13 = cArr4[i14];
                        if (aVar.z(c13) || H3(aVar, c13, 3) == -2) {
                            M3.f(i12 >> 4);
                        } else {
                            throw n4(aVar, c13, 3, "expected padding character '" + aVar.v() + "'");
                        }
                    }
                }
                int i15 = (i12 << 6) | f12;
                if (this.U0 >= this.V0) {
                    F4();
                }
                char[] cArr5 = this.f6134u1;
                int i16 = this.U0;
                this.U0 = i16 + 1;
                char c14 = cArr5[i16];
                int f13 = aVar.f(c14);
                if (f13 < 0) {
                    if (f13 != -2) {
                        if (c14 == '\"') {
                            M3.i(i15 >> 2);
                            if (aVar.y()) {
                                this.U0--;
                                O3(aVar);
                            }
                            return M3.P();
                        }
                        f13 = H3(aVar, c14, 3);
                    }
                    if (f13 == -2) {
                        M3.i(i15 >> 2);
                    }
                }
                M3.h((i15 << 6) | f13);
            }
        }
    }

    public void v4() throws IOException {
        char[] v10 = this.f15476e1.v();
        int w10 = this.f15476e1.w();
        int[] iArr = L1;
        int length = iArr.length;
        while (true) {
            if (this.U0 >= this.V0 && !E4()) {
                p3(": was expecting closing quote for a string value", p.VALUE_STRING);
            }
            char[] cArr = this.f6134u1;
            int i10 = this.U0;
            this.U0 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 < length && iArr[c10] != 0) {
                if (c10 == '\"') {
                    this.f15476e1.J(w10);
                    return;
                } else if (c10 == '\\') {
                    c10 = J3();
                } else if (c10 < ' ') {
                    X3(c10, "string value");
                }
            }
            if (w10 >= v10.length) {
                v10 = this.f15476e1.s();
                w10 = 0;
            }
            v10[w10] = c10;
            w10++;
        }
    }

    public final String w4(p pVar) {
        if (pVar == null) {
            return null;
        }
        int e10 = pVar.e();
        return e10 != 5 ? (e10 == 6 || e10 == 7 || e10 == 8) ? this.f15476e1.l() : pVar.d() : this.f15474c1.b();
    }

    public final Boolean x2() throws IOException {
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
        if (D2 != null) {
            int e10 = D2.e();
            if (e10 == 9) {
                return Boolean.TRUE;
            }
            if (e10 == 10) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public p x4() throws IOException {
        char[] n10 = this.f15476e1.n();
        int w10 = this.f15476e1.w();
        while (true) {
            if (this.U0 >= this.V0 && !E4()) {
                p3(": was expecting closing quote for a string value", p.VALUE_STRING);
            }
            char[] cArr = this.f6134u1;
            int i10 = this.U0;
            this.U0 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    c10 = J3();
                } else if (c10 <= '\'') {
                    if (c10 == '\'') {
                        this.f15476e1.J(w10);
                        return p.VALUE_STRING;
                    } else if (c10 < ' ') {
                        X3(c10, "string value");
                    }
                }
            }
            if (w10 >= n10.length) {
                n10 = this.f15476e1.s();
                w10 = 0;
            }
            n10[w10] = c10;
            w10++;
        }
    }

    public String y2() throws IOException {
        p pVar;
        this.f15481j1 = 0;
        p pVar2 = this.U;
        p pVar3 = p.FIELD_NAME;
        if (pVar2 == pVar3) {
            L4();
            return null;
        }
        if (this.f6139z1) {
            h5();
        }
        int i52 = i5();
        if (i52 < 0) {
            close();
            this.U = null;
            return null;
        }
        this.f15480i1 = null;
        if (i52 == 93 || i52 == 125) {
            t4(i52);
            return null;
        }
        if (this.f15474c1.x()) {
            i52 = e5(i52);
            if ((this.O & D1) != 0 && (i52 == 93 || i52 == 125)) {
                t4(i52);
                return null;
            }
        }
        if (!this.f15474c1.l()) {
            l5();
            M4(i52);
            return null;
        }
        m5();
        String Q4 = i52 == 34 ? Q4() : z4(i52);
        this.f15474c1.B(Q4);
        this.U = pVar3;
        int b52 = b5();
        l5();
        if (b52 == 34) {
            this.f6139z1 = true;
            this.f15475d1 = p.VALUE_STRING;
            return Q4;
        }
        if (b52 == 45) {
            pVar = S4();
        } else if (b52 == 46) {
            pVar = P4();
        } else if (b52 == 91) {
            pVar = p.START_ARRAY;
        } else if (b52 == 102) {
            G4();
            pVar = p.VALUE_FALSE;
        } else if (b52 == 110) {
            H4();
            pVar = p.VALUE_NULL;
        } else if (b52 == 116) {
            K4();
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
                    pVar = U4(b52);
                    break;
                default:
                    pVar = B4(b52);
                    break;
            }
        } else {
            pVar = p.START_OBJECT;
        }
        this.f15475d1 = pVar;
        return Q4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ?, r10v1 ?, r10v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public w4.p y4(
/*
Method generation error in method: d5.i.y4(int, boolean):w4.p, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ?
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

    public boolean z2(u uVar) throws IOException {
        int i10 = 0;
        this.f15481j1 = 0;
        if (this.U == p.FIELD_NAME) {
            L4();
            return false;
        }
        if (this.f6139z1) {
            h5();
        }
        int i52 = i5();
        if (i52 < 0) {
            close();
            this.U = null;
            return false;
        }
        this.f15480i1 = null;
        if (i52 == 93 || i52 == 125) {
            t4(i52);
            return false;
        }
        if (this.f15474c1.x()) {
            i52 = e5(i52);
            if ((this.O & D1) != 0 && (i52 == 93 || i52 == 125)) {
                t4(i52);
                return false;
            }
        }
        if (!this.f15474c1.l()) {
            l5();
            M4(i52);
            return false;
        }
        m5();
        if (i52 == 34) {
            char[] a10 = uVar.a();
            int length = a10.length;
            int i11 = this.U0;
            if (i11 + length + 4 < this.V0) {
                int i12 = length + i11;
                if (this.f6134u1[i12] == '\"') {
                    while (i11 != i12) {
                        if (a10[i10] == this.f6134u1[i11]) {
                            i10++;
                            i11++;
                        }
                    }
                    this.f15474c1.B(uVar.getValue());
                    D4(d5(i11 + 1));
                    return true;
                }
            }
        }
        return C4(i52, uVar.getValue());
    }

    public String z4(int i10) throws IOException {
        if (i10 == 39 && (this.O & H1) != 0) {
            return N4();
        }
        if ((this.O & I1) == 0) {
            t3(i10, "was expecting double-quote to start field name");
        }
        int[] j10 = a.j();
        int length = j10.length;
        if (!(i10 < length ? j10[i10] == 0 : Character.isJavaIdentifierPart((char) i10))) {
            t3(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i11 = this.U0;
        int i12 = this.f6138y1;
        int i13 = this.V0;
        if (i11 < i13) {
            do {
                char[] cArr = this.f6134u1;
                char c10 = cArr[i11];
                if (c10 < length) {
                    if (j10[c10] != 0) {
                        int i14 = this.U0 - 1;
                        this.U0 = i11;
                        return this.f6137x1.q(cArr, i14, i11 - i14, i12);
                    }
                } else if (!Character.isJavaIdentifierPart((char) c10)) {
                    int i15 = this.U0 - 1;
                    this.U0 = i11;
                    return this.f6137x1.q(this.f6134u1, i15, i11 - i15, i12);
                }
                i12 = (i12 * 33) + c10;
                i11++;
            } while (i11 < i13);
        }
        this.U0 = i11;
        return A4(this.U0 - 1, i12, j10);
    }
}
