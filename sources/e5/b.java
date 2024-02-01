package e5;

import c5.d;
import f5.a;
import h5.c;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import w4.j;
import w4.k;
import w4.l;
import w4.p;
import w4.s;

public abstract class b extends y4.b {
    public static final int A2 = 55;
    public static final int B2 = 0;
    public static final int C2 = 1;
    public static final int D2 = 2;
    public static final int E2 = 3;
    public static final String[] F2 = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    public static final double[] G2 = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    public static final int J1 = 0;
    public static final int K1 = 1;
    public static final int L1 = 2;
    public static final int M1 = 3;
    public static final int N1 = 4;
    public static final int O1 = 5;
    public static final int P1 = 6;
    public static final int Q1 = 7;
    public static final int R1 = 1;
    public static final int S1 = 2;
    public static final int T1 = 3;
    public static final int U1 = 4;
    public static final int V1 = 5;
    public static final int W1 = 7;
    public static final int X1 = 8;
    public static final int Y1 = 9;
    public static final int Z1 = 10;

    /* renamed from: a2  reason: collision with root package name */
    public static final int f6826a2 = 12;

    /* renamed from: b2  reason: collision with root package name */
    public static final int f6827b2 = 13;

    /* renamed from: c2  reason: collision with root package name */
    public static final int f6828c2 = 14;

    /* renamed from: d2  reason: collision with root package name */
    public static final int f6829d2 = 15;

    /* renamed from: e2  reason: collision with root package name */
    public static final int f6830e2 = 16;

    /* renamed from: f2  reason: collision with root package name */
    public static final int f6831f2 = 17;

    /* renamed from: g2  reason: collision with root package name */
    public static final int f6832g2 = 18;

    /* renamed from: h2  reason: collision with root package name */
    public static final int f6833h2 = 19;

    /* renamed from: i2  reason: collision with root package name */
    public static final int f6834i2 = 23;

    /* renamed from: j2  reason: collision with root package name */
    public static final int f6835j2 = 24;

    /* renamed from: k2  reason: collision with root package name */
    public static final int f6836k2 = 25;

    /* renamed from: l2  reason: collision with root package name */
    public static final int f6837l2 = 26;

    /* renamed from: m2  reason: collision with root package name */
    public static final int f6838m2 = 30;

    /* renamed from: n2  reason: collision with root package name */
    public static final int f6839n2 = 31;

    /* renamed from: o2  reason: collision with root package name */
    public static final int f6840o2 = 32;

    /* renamed from: p2  reason: collision with root package name */
    public static final int f6841p2 = 40;

    /* renamed from: q2  reason: collision with root package name */
    public static final int f6842q2 = 41;

    /* renamed from: r2  reason: collision with root package name */
    public static final int f6843r2 = 42;

    /* renamed from: s2  reason: collision with root package name */
    public static final int f6844s2 = 43;

    /* renamed from: t2  reason: collision with root package name */
    public static final int f6845t2 = 44;

    /* renamed from: u2  reason: collision with root package name */
    public static final int f6846u2 = 45;

    /* renamed from: v2  reason: collision with root package name */
    public static final int f6847v2 = 50;

    /* renamed from: w2  reason: collision with root package name */
    public static final int f6848w2 = 51;

    /* renamed from: x2  reason: collision with root package name */
    public static final int f6849x2 = 52;

    /* renamed from: y2  reason: collision with root package name */
    public static final int f6850y2 = 53;

    /* renamed from: z2  reason: collision with root package name */
    public static final int f6851z2 = 54;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1 = false;
    public int G1;
    public int H1 = 0;
    public int I1 = 1;

    /* renamed from: t1  reason: collision with root package name */
    public final a f6852t1;

    /* renamed from: u1  reason: collision with root package name */
    public int[] f6853u1 = new int[8];

    /* renamed from: v1  reason: collision with root package name */
    public int f6854v1;

    /* renamed from: w1  reason: collision with root package name */
    public int f6855w1;

    /* renamed from: x1  reason: collision with root package name */
    public int f6856x1;

    /* renamed from: y1  reason: collision with root package name */
    public int f6857y1;

    /* renamed from: z1  reason: collision with root package name */
    public int f6858z1;

    public b(d dVar, int i10, a aVar) {
        super(dVar, i10);
        this.f6852t1 = aVar;
        this.U = null;
        this.B1 = 0;
        this.C1 = 1;
    }

    public static final int C4(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | (-1 << (i11 << 3));
    }

    public final String A4(p pVar) {
        int e10;
        if (pVar == null || (e10 = pVar.e()) == -1) {
            return null;
        }
        return e10 != 5 ? (e10 == 6 || e10 == 7 || e10 == 8) ? this.f15476e1.l() : pVar.d() : this.f15474c1.b();
    }

    public final String B4(int i10) {
        return F2[i10];
    }

    public void D4(int i10) throws k {
        if (i10 < 32) {
            v3(i10);
        }
        E4(i10);
    }

    public void E4(int i10) throws k {
        j3("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    public void F4(int i10) throws k {
        j3("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    public void G3() throws IOException {
        this.H1 = 0;
        this.V0 = 0;
    }

    public void G4(int i10, int i11) throws k {
        this.U0 = i11;
        F4(i10);
    }

    public final p H4() throws IOException {
        this.f15474c1 = this.f15474c1.t(-1, -1);
        this.B1 = 5;
        this.C1 = 6;
        p pVar = p.START_ARRAY;
        this.U = pVar;
        return pVar;
    }

    public final p I4() throws IOException {
        this.f15474c1 = this.f15474c1.u(-1, -1);
        this.B1 = 2;
        this.C1 = 3;
        p pVar = p.START_OBJECT;
        this.U = pVar;
        return pVar;
    }

    public int J2(w4.a aVar, OutputStream outputStream) throws IOException {
        byte[] m02 = m0(aVar);
        outputStream.write(m02);
        return m02.length;
    }

    public final void J4() {
        this.f15472a1 = Math.max(this.X0, this.I1);
        int i10 = this.U0;
        this.f15473b1 = i10 - this.Y0;
        this.Z0 = this.W0 + ((long) (i10 - this.H1));
    }

    public final p K4(p pVar) throws IOException {
        this.B1 = this.C1;
        this.U = pVar;
        return pVar;
    }

    public Object L1() {
        return null;
    }

    public final p L4(int i10, String str) throws IOException {
        this.f15476e1.G(str);
        this.f15488q1 = str.length();
        this.f15481j1 = 1;
        this.f15482k1 = i10;
        this.B1 = this.C1;
        p pVar = p.VALUE_NUMBER_INT;
        this.U = pVar;
        return pVar;
    }

    public final p M4(int i10) throws IOException {
        String str = F2[i10];
        this.f15476e1.G(str);
        if (!s2(l.a.ALLOW_NON_NUMERIC_NUMBERS)) {
            k3("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        this.f15488q1 = 0;
        this.f15481j1 = 8;
        this.f15484m1 = G2[i10];
        this.B1 = this.C1;
        p pVar = p.VALUE_NUMBER_FLOAT;
        this.U = pVar;
        return pVar;
    }

    public a N4() {
        return this.f6852t1;
    }

    public abstract int P2(OutputStream outputStream) throws IOException;

    public void S2(s sVar) {
        throw new UnsupportedOperationException("Can not use ObjectMapper with non-blocking parser");
    }

    public s T0() {
        return null;
    }

    public void U3() throws IOException {
        super.U3();
        this.f6852t1.S();
    }

    public j W0() {
        int i10 = (this.U0 - this.Y0) + 1;
        return new j(N3(), this.W0 + ((long) (this.U0 - this.H1)), -1, Math.max(this.X0, this.I1), i10);
    }

    public int X1(Writer writer) throws IOException {
        p pVar = this.U;
        if (pVar == p.VALUE_STRING) {
            return this.f15476e1.m(writer);
        }
        if (pVar == p.FIELD_NAME) {
            String b10 = this.f15474c1.b();
            writer.write(b10);
            return b10.length();
        } else if (pVar == null) {
            return 0;
        } else {
            if (pVar.j()) {
                return this.f15476e1.m(writer);
            }
            if (pVar == p.NOT_AVAILABLE) {
                j3("Current token not available: can not call this method");
            }
            char[] b11 = pVar.b();
            writer.write(b11);
            return b11.length;
        }
    }

    public String Y1() throws IOException {
        p pVar = this.U;
        return pVar == p.VALUE_STRING ? this.f15476e1.l() : A4(pVar);
    }

    public char[] Z1() throws IOException {
        p pVar = this.U;
        if (pVar == null) {
            return null;
        }
        int e10 = pVar.e();
        if (e10 != 5) {
            return (e10 == 6 || e10 == 7 || e10 == 8) ? this.f15476e1.x() : this.U.b();
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

    public int a2() throws IOException {
        p pVar = this.U;
        if (pVar == null) {
            return 0;
        }
        int e10 = pVar.e();
        return e10 != 5 ? (e10 == 6 || e10 == 7 || e10 == 8) ? this.f15476e1.K() : this.U.b().length : this.f15474c1.b().length();
    }

    public int b2() throws IOException {
        p pVar = this.U;
        if (pVar == null) {
            return 0;
        }
        int e10 = pVar.e();
        if (e10 == 6 || e10 == 7 || e10 == 8) {
            return this.f15476e1.y();
        }
        return 0;
    }

    public j c2() {
        return new j(N3(), this.Z0, -1, this.f15472a1, this.f15473b1);
    }

    public boolean m() {
        return true;
    }

    public byte[] m0(w4.a aVar) throws IOException {
        p pVar = this.U;
        if (pVar != p.VALUE_STRING) {
            k3("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", pVar);
        }
        if (this.f15480i1 == null) {
            c M3 = M3();
            d3(Y1(), M3, aVar);
            this.f15480i1 = M3.P();
        }
        return this.f15480i1;
    }

    public String m2() throws IOException {
        p pVar = this.U;
        return pVar == p.VALUE_STRING ? this.f15476e1.l() : pVar == p.FIELD_NAME ? X0() : super.n2((String) null);
    }

    public String n2(String str) throws IOException {
        p pVar = this.U;
        return pVar == p.VALUE_STRING ? this.f15476e1.l() : pVar == p.FIELD_NAME ? X0() : super.n2(str);
    }

    public Object p1() throws IOException {
        if (this.U == p.VALUE_EMBEDDED_OBJECT) {
            return this.f15480i1;
        }
        return null;
    }

    public boolean p2() {
        p pVar = this.U;
        if (pVar == p.VALUE_STRING) {
            return this.f15476e1.z();
        }
        if (pVar == p.FIELD_NAME) {
            return this.f15478g1;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String s4(int[] r17, int r18, int r19) throws w4.k {
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
            r0.E4(r12)
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
            r0.F4(r6)
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
            r0.F4(r5)
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
            r0.F4(r12)
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
            f5.a r3 = r0.f6852t1
            java.lang.String r1 = r3.z(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.b.s4(int[], int, int):java.lang.String");
    }

    public final p t4() throws IOException {
        if (!this.f15474c1.k()) {
            V3(93, '}');
        }
        d5.d z10 = this.f15474c1.e();
        this.f15474c1 = z10;
        int i10 = z10.l() ? 3 : z10.k() ? 6 : 1;
        this.B1 = i10;
        this.C1 = i10;
        p pVar = p.END_ARRAY;
        this.U = pVar;
        return pVar;
    }

    public final p u4() throws IOException {
        if (!this.f15474c1.l()) {
            V3(125, ']');
        }
        d5.d z10 = this.f15474c1.e();
        this.f15474c1 = z10;
        int i10 = z10.l() ? 3 : z10.k() ? 6 : 1;
        this.B1 = i10;
        this.C1 = i10;
        p pVar = p.END_OBJECT;
        this.U = pVar;
        return pVar;
    }

    public final p v4() throws IOException {
        this.B1 = 7;
        if (!this.f15474c1.m()) {
            f3();
        }
        close();
        this.U = null;
        return null;
    }

    public final p w4(String str) throws IOException {
        this.B1 = 4;
        this.f15474c1.B(str);
        p pVar = p.FIELD_NAME;
        this.U = pVar;
        return pVar;
    }

    public final String x4(int i10, int i11) throws k {
        int C4 = C4(i10, i11);
        String H = this.f6852t1.H(C4);
        if (H != null) {
            return H;
        }
        int[] iArr = this.f6853u1;
        iArr[0] = C4;
        return s4(iArr, 1, i11);
    }

    public final String y4(int i10, int i11, int i12) throws k {
        int C4 = C4(i11, i12);
        String I = this.f6852t1.I(i10, C4);
        if (I != null) {
            return I;
        }
        int[] iArr = this.f6853u1;
        iArr[0] = i10;
        iArr[1] = C4;
        return s4(iArr, 2, i12);
    }

    public final String z4(int i10, int i11, int i12, int i13) throws k {
        int C4 = C4(i12, i13);
        String J = this.f6852t1.J(i10, i11, C4);
        if (J != null) {
            return J;
        }
        int[] iArr = this.f6853u1;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = C4(C4, i13);
        return s4(iArr, 3, i13);
    }
}
