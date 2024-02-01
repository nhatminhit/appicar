package pa;

import ja.g;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import ka.f;

public class a implements Closeable {
    public static final int A0 = 4;
    public static final int B0 = 5;
    public static final int C0 = 6;
    public static final int D0 = 7;

    /* renamed from: d0  reason: collision with root package name */
    public static final long f21919d0 = -922337203685477580L;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f21920e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f21921f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f21922g0 = 2;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f21923h0 = 3;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f21924i0 = 4;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f21925j0 = 5;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f21926k0 = 6;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f21927l0 = 7;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f21928m0 = 8;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f21929n0 = 9;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f21930o0 = 10;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f21931p0 = 11;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f21932q0 = 12;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f21933r0 = 13;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f21934s0 = 14;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f21935t0 = 15;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f21936u0 = 16;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f21937v0 = 17;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f21938w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f21939x0 = 1;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f21940y0 = 2;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f21941z0 = 3;
    public final Reader O;
    public boolean P = false;
    public final char[] Q = new char[1024];
    public int R = 0;
    public int S = 0;
    public int T = 0;
    public int U = 0;
    public int V = 0;
    public long W;
    public int X;
    public String Y;
    public int[] Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f21942a0;

    /* renamed from: b0  reason: collision with root package name */
    public String[] f21943b0;

    /* renamed from: c0  reason: collision with root package name */
    public int[] f21944c0;

    /* renamed from: pa.a$a  reason: collision with other inner class name */
    public class C0384a extends g {
        public void a(a aVar) throws IOException {
            int i10;
            if (aVar instanceof f) {
                ((f) aVar).O1();
                return;
            }
            int i11 = aVar.V;
            if (i11 == 0) {
                i11 = aVar.i();
            }
            if (i11 == 13) {
                i10 = 9;
            } else if (i11 == 12) {
                i10 = 8;
            } else if (i11 == 14) {
                i10 = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.z0() + aVar.w());
            }
            aVar.V = i10;
        }
    }

    static {
        g.f19886a = new C0384a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.Z = iArr;
        this.f21942a0 = 0 + 1;
        iArr[0] = 6;
        this.f21943b0 = new String[32];
        this.f21944c0 = new int[32];
        if (reader != null) {
            this.O = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public boolean A() throws IOException {
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 5) {
            this.V = 0;
            int[] iArr = this.f21944c0;
            int i11 = this.f21942a0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.V = 0;
            int[] iArr2 = this.f21944c0;
            int i12 = this.f21942a0 - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + z0() + w());
        }
    }

    public final int H0() throws IOException {
        String str;
        String str2;
        int i10;
        char c10 = this.Q[this.R];
        if (c10 == 't' || c10 == 'T') {
            i10 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c10 == 'f' || c10 == 'F') {
            i10 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            i10 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.R + i11 >= this.S && !m(i11 + 1)) {
                return 0;
            }
            char c11 = this.Q[this.R + i11];
            if (c11 != str2.charAt(i11) && c11 != str.charAt(i11)) {
                return 0;
            }
        }
        if ((this.R + length < this.S || m(length + 1)) && t(this.Q[this.R + length])) {
            return 0;
        }
        this.R += length;
        this.V = i10;
        return i10;
    }

    public double N() throws IOException {
        String str;
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            this.V = 0;
            int[] iArr = this.f21944c0;
            int i11 = this.f21942a0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.W;
        }
        if (i10 == 16) {
            this.Y = new String(this.Q, this.R, this.X);
            this.R += this.X;
        } else {
            if (i10 == 8 || i10 == 9) {
                str = e0(i10 == 8 ? '\'' : '\"');
            } else if (i10 == 10) {
                str = m0();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + z0() + w());
            }
            this.Y = str;
        }
        this.V = 11;
        double parseDouble = Double.parseDouble(this.Y);
        if (this.P || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.Y = null;
            this.V = 0;
            int[] iArr2 = this.f21944c0;
            int i12 = this.f21942a0 - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw new e("JSON forbids NaN and infinities: " + parseDouble + w());
    }

    public int P() throws IOException {
        String e02;
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            long j10 = this.W;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.V = 0;
                int[] iArr = this.f21944c0;
                int i12 = this.f21942a0 - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.W + w());
        }
        if (i10 == 16) {
            this.Y = new String(this.Q, this.R, this.X);
            this.R += this.X;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                e02 = m0();
            } else {
                e02 = e0(i10 == 8 ? '\'' : '\"');
            }
            this.Y = e02;
            try {
                int parseInt = Integer.parseInt(this.Y);
                this.V = 0;
                int[] iArr2 = this.f21944c0;
                int i13 = this.f21942a0 - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + z0() + w());
        }
        this.V = 11;
        double parseDouble = Double.parseDouble(this.Y);
        int i14 = (int) parseDouble;
        if (((double) i14) == parseDouble) {
            this.Y = null;
            this.V = 0;
            int[] iArr3 = this.f21944c0;
            int i15 = this.f21942a0 - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.Y + w());
    }

    public long Q() throws IOException {
        String e02;
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            this.V = 0;
            int[] iArr = this.f21944c0;
            int i11 = this.f21942a0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.W;
        }
        if (i10 == 16) {
            this.Y = new String(this.Q, this.R, this.X);
            this.R += this.X;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                e02 = m0();
            } else {
                e02 = e0(i10 == 8 ? '\'' : '\"');
            }
            this.Y = e02;
            try {
                long parseLong = Long.parseLong(this.Y);
                this.V = 0;
                int[] iArr2 = this.f21944c0;
                int i12 = this.f21942a0 - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + z0() + w());
        }
        this.V = 11;
        double parseDouble = Double.parseDouble(this.Y);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.Y = null;
            this.V = 0;
            int[] iArr3 = this.f21944c0;
            int i13 = this.f21942a0 - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.Y + w());
    }

    public final int T0() throws IOException {
        int i10;
        char c10;
        char[] cArr = this.Q;
        int i11 = this.R;
        int i12 = this.S;
        int i13 = 0;
        boolean z10 = true;
        int i14 = 0;
        char c11 = 0;
        boolean z11 = false;
        long j10 = 0;
        while (true) {
            if (i11 + i14 == i12) {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!m(i14 + 1)) {
                    break;
                }
                i11 = this.R;
                i12 = this.S;
            }
            c10 = cArr[i11 + i14];
            char c12 = 3;
            if (c10 == '+') {
                c12 = 6;
                i13 = 0;
                if (c11 != 5) {
                    return 0;
                }
            } else if (c10 == 'E' || c10 == 'e') {
                i13 = 0;
                if (c11 != 2 && c11 != 4) {
                    return 0;
                }
                c11 = 5;
                i14++;
            } else if (c10 == '-') {
                c12 = 6;
                i13 = 0;
                if (c11 == 0) {
                    c11 = 1;
                    z11 = true;
                    i14++;
                } else if (c11 != 5) {
                    return 0;
                }
            } else if (c10 == '.') {
                i13 = 0;
                if (c11 != 2) {
                    return 0;
                }
            } else if (c10 >= '0' && c10 <= '9') {
                if (c11 == 1 || c11 == 0) {
                    j10 = (long) (-(c10 - '0'));
                    c11 = 2;
                } else if (c11 != 2) {
                    if (c11 == 3) {
                        i13 = 0;
                        c11 = 4;
                    } else if (c11 == 5 || c11 == 6) {
                        i13 = 0;
                        c11 = 7;
                    }
                    i14++;
                } else if (j10 == 0) {
                    return 0;
                } else {
                    long j11 = (10 * j10) - ((long) (c10 - '0'));
                    int i15 = (j10 > f21919d0 ? 1 : (j10 == f21919d0 ? 0 : -1));
                    z10 &= i15 > 0 || (i15 == 0 && j11 < j10);
                    j10 = j11;
                }
                i13 = 0;
                i14++;
            }
            c11 = c12;
            i14++;
        }
        if (t(c10)) {
            return 0;
        }
        if (c11 == 2 && z10 && ((j10 != Long.MIN_VALUE || z11) && (j10 != 0 || !z11))) {
            if (!z11) {
                j10 = -j10;
            }
            this.W = j10;
            this.R += i14;
            i10 = 15;
        } else if (c11 != 2 && c11 != 4 && c11 != 7) {
            return 0;
        } else {
            this.X = i14;
            i10 = 16;
        }
        this.V = i10;
        return i10;
    }

    public final void W0(int i10) {
        int i11 = this.f21942a0;
        int[] iArr = this.Z;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.Z = Arrays.copyOf(iArr, i12);
            this.f21944c0 = Arrays.copyOf(this.f21944c0, i12);
            this.f21943b0 = (String[]) Arrays.copyOf(this.f21943b0, i12);
        }
        int[] iArr2 = this.Z;
        int i13 = this.f21942a0;
        this.f21942a0 = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char X0() throws IOException {
        int i10;
        int i11;
        if (this.R != this.S || m(1)) {
            char[] cArr = this.Q;
            int i12 = this.R;
            int i13 = i12 + 1;
            this.R = i13;
            char c10 = cArr[i12];
            if (c10 == 10) {
                this.T++;
                this.U = i13;
            } else if (!(c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\')) {
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
                    throw r1("Invalid escape sequence");
                } else if (i13 + 4 <= this.S || m(4)) {
                    char c11 = 0;
                    int i14 = this.R;
                    int i15 = i14 + 4;
                    while (i14 < i15) {
                        char c12 = this.Q[i14];
                        char c13 = (char) (c11 << 4);
                        if (c12 < '0' || c12 > '9') {
                            if (c12 >= 'a' && c12 <= 'f') {
                                i10 = c12 - 'a';
                            } else if (c12 < 'A' || c12 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.Q, this.R, 4));
                            } else {
                                i10 = c12 - 'A';
                            }
                            i11 = i10 + 10;
                        } else {
                            i11 = c12 - '0';
                        }
                        c11 = (char) (c13 + i11);
                        i14++;
                    }
                    this.R += 4;
                    return c11;
                } else {
                    throw r1("Unterminated escape sequence");
                }
            }
            return c10;
        }
        throw r1("Unterminated escape sequence");
    }

    public String Y() throws IOException {
        String str;
        char c10;
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 14) {
            str = m0();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else if (i10 == 13) {
                c10 = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + z0() + w());
            }
            str = e0(c10);
        }
        this.V = 0;
        this.f21943b0[this.f21942a0 - 1] = str;
        return str;
    }

    public final void Z0(boolean z10) {
        this.P = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.R = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.R = r4 - 1;
        r2 = m(2);
        r7.R++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        g();
        r2 = r7.R;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r3 == '*') goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r3 == '/') goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        r7.R = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r7.R = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (g1("*/") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        throw r1("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r7.R = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r1 != '#') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a0(boolean r8) throws java.io.IOException {
        /*
            r7 = this;
            char[] r0 = r7.Q
        L_0x0002:
            int r1 = r7.R
        L_0x0004:
            int r2 = r7.S
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.R = r1
            boolean r1 = r7.m(r3)
            if (r1 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0015
            r8 = -1
            return r8
        L_0x0015:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.w()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.R
            int r2 = r7.S
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.T
            int r1 = r1 + r3
            r7.T = r1
            r7.U = r4
            goto L_0x00a3
        L_0x0044:
            r5 = 32
            if (r1 == r5) goto L_0x00a3
            r5 = 13
            if (r1 == r5) goto L_0x00a3
            r5 = 9
            if (r1 != r5) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            r5 = 47
            if (r1 != r5) goto L_0x0098
            r7.R = r4
            r6 = 2
            if (r4 != r2) goto L_0x006a
            int r4 = r4 + -1
            r7.R = r4
            boolean r2 = r7.m(r6)
            int r4 = r7.R
            int r4 = r4 + r3
            r7.R = r4
            if (r2 != 0) goto L_0x006a
            return r1
        L_0x006a:
            r7.g()
            int r2 = r7.R
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0080
            if (r3 == r5) goto L_0x0078
            return r1
        L_0x0078:
            int r2 = r2 + 1
            r7.R = r2
        L_0x007c:
            r7.h1()
            goto L_0x0002
        L_0x0080:
            int r2 = r2 + 1
            r7.R = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.g1(r1)
            if (r1 == 0) goto L_0x0091
            int r1 = r7.R
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0091:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.r1(r8)
            throw r8
        L_0x0098:
            r2 = 35
            r7.R = r4
            if (r1 != r2) goto L_0x00a2
            r7.g()
            goto L_0x007c
        L_0x00a2:
            return r1
        L_0x00a3:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.a.a0(boolean):int");
    }

    public void c() throws IOException {
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 3) {
            W0(1);
            this.f21944c0[this.f21942a0 - 1] = 0;
            this.V = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + z0() + w());
    }

    public void c0() throws IOException {
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 7) {
            this.V = 0;
            int[] iArr = this.f21944c0;
            int i11 = this.f21942a0 - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + z0() + w());
    }

    public void close() throws IOException {
        this.V = 0;
        this.Z[0] = 8;
        this.f21942a0 = 1;
        this.O.close();
    }

    public final String e0(char c10) throws IOException {
        char[] cArr = this.Q;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.R;
            int i11 = this.S;
            int i12 = i10;
            while (true) {
                if (i10 < i11) {
                    int i13 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.R = i13;
                        int i14 = (i13 - i12) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i12, i14);
                        }
                        sb2.append(cArr, i12, i14);
                        return sb2.toString();
                    } else if (c11 == '\\') {
                        this.R = i13;
                        int i15 = (i13 - i12) - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max((i15 + 1) * 2, 16));
                        }
                        sb2.append(cArr, i12, i15);
                        sb2.append(X0());
                    } else {
                        if (c11 == 10) {
                            this.T++;
                            this.U = i13;
                        }
                        i10 = i13;
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i10 - i12) * 2, 16));
                    }
                    sb2.append(cArr, i12, i10 - i12);
                    this.R = i10;
                    if (!m(1)) {
                        throw r1("Unterminated string");
                    }
                }
            }
        }
    }

    public void f() throws IOException {
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 1) {
            W0(3);
            this.V = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + z0() + w());
    }

    public final void f1(char c10) throws IOException {
        char[] cArr = this.Q;
        while (true) {
            int i10 = this.R;
            int i11 = this.S;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.R = i12;
                        return;
                    } else if (c11 == '\\') {
                        this.R = i12;
                        X0();
                        break;
                    } else {
                        if (c11 == 10) {
                            this.T++;
                            this.U = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.R = i10;
                    if (!m(1)) {
                        throw r1("Unterminated string");
                    }
                }
            }
        }
    }

    public final void g() throws IOException {
        if (!this.P) {
            throw r1("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final boolean g1(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i10 = 0;
            if (this.R + length > this.S && !m(length)) {
                return false;
            }
            char[] cArr = this.Q;
            int i11 = this.R;
            if (cArr[i11] == 10) {
                this.T++;
                this.U = i11 + 1;
            } else {
                while (i10 < length) {
                    if (this.Q[this.R + i10] == str.charAt(i10)) {
                        i10++;
                    }
                }
                return true;
            }
            this.R++;
        }
    }

    public final void h() throws IOException {
        a0(true);
        int i10 = this.R - 1;
        this.R = i10;
        if (i10 + 5 <= this.S || m(5)) {
            char[] cArr = this.Q;
            if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == 10) {
                this.R += 5;
            }
        }
    }

    public final void h1() throws IOException {
        char c10;
        do {
            if (this.R < this.S || m(1)) {
                char[] cArr = this.Q;
                int i10 = this.R;
                int i11 = i10 + 1;
                this.R = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.T++;
                    this.U = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int i() throws java.io.IOException {
        /*
            r15 = this;
            int[] r0 = r15.Z
            int r1 = r15.f21942a0
            int r2 = r1 + -1
            r2 = r0[r2]
            r3 = 8
            r4 = 39
            r5 = 34
            r6 = 93
            r7 = 3
            r8 = 7
            r9 = 59
            r10 = 44
            r11 = 4
            r12 = 2
            r13 = 1
            if (r2 != r13) goto L_0x0020
            int r1 = r1 - r13
            r0[r1] = r12
            goto L_0x00a2
        L_0x0020:
            if (r2 != r12) goto L_0x003a
            int r0 = r15.a0(r13)
            if (r0 == r10) goto L_0x00a2
            if (r0 == r9) goto L_0x0036
            if (r0 != r6) goto L_0x002f
            r15.V = r11
            return r11
        L_0x002f:
            java.lang.String r0 = "Unterminated array"
            java.io.IOException r0 = r15.r1(r0)
            throw r0
        L_0x0036:
            r15.g()
            goto L_0x00a2
        L_0x003a:
            r14 = 5
            if (r2 == r7) goto L_0x0117
            if (r2 != r14) goto L_0x0041
            goto L_0x0117
        L_0x0041:
            if (r2 != r11) goto L_0x0076
            int r1 = r1 - r13
            r0[r1] = r14
            int r0 = r15.a0(r13)
            r1 = 58
            if (r0 == r1) goto L_0x00a2
            r1 = 61
            if (r0 != r1) goto L_0x006f
            r15.g()
            int r0 = r15.R
            int r1 = r15.S
            if (r0 < r1) goto L_0x0061
            boolean r0 = r15.m(r13)
            if (r0 == 0) goto L_0x00a2
        L_0x0061:
            char[] r0 = r15.Q
            int r1 = r15.R
            char r0 = r0[r1]
            r14 = 62
            if (r0 != r14) goto L_0x00a2
            int r1 = r1 + r13
            r15.R = r1
            goto L_0x00a2
        L_0x006f:
            java.lang.String r0 = "Expected ':'"
            java.io.IOException r0 = r15.r1(r0)
            throw r0
        L_0x0076:
            r0 = 6
            if (r2 != r0) goto L_0x0088
            boolean r0 = r15.P
            if (r0 == 0) goto L_0x0080
            r15.h()
        L_0x0080:
            int[] r0 = r15.Z
            int r1 = r15.f21942a0
            int r1 = r1 - r13
            r0[r1] = r8
            goto L_0x00a2
        L_0x0088:
            if (r2 != r8) goto L_0x00a0
            r0 = 0
            int r0 = r15.a0(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0097
            r0 = 17
        L_0x0094:
            r15.V = r0
            return r0
        L_0x0097:
            r15.g()
            int r0 = r15.R
            int r0 = r0 - r13
            r15.R = r0
            goto L_0x00a2
        L_0x00a0:
            if (r2 == r3) goto L_0x010f
        L_0x00a2:
            int r0 = r15.a0(r13)
            if (r0 == r5) goto L_0x010c
            if (r0 == r4) goto L_0x0106
            if (r0 == r10) goto L_0x00ef
            if (r0 == r9) goto L_0x00ef
            r1 = 91
            if (r0 == r1) goto L_0x00ec
            if (r0 == r6) goto L_0x00e7
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x00e4
            int r0 = r15.R
            int r0 = r0 - r13
            r15.R = r0
            int r0 = r15.H0()
            if (r0 == 0) goto L_0x00c4
            return r0
        L_0x00c4:
            int r0 = r15.T0()
            if (r0 == 0) goto L_0x00cb
            return r0
        L_0x00cb:
            char[] r0 = r15.Q
            int r1 = r15.R
            char r0 = r0[r1]
            boolean r0 = r15.t(r0)
            if (r0 == 0) goto L_0x00dd
            r15.g()
            r0 = 10
            goto L_0x0094
        L_0x00dd:
            java.lang.String r0 = "Expected value"
            java.io.IOException r0 = r15.r1(r0)
            throw r0
        L_0x00e4:
            r15.V = r13
            return r13
        L_0x00e7:
            if (r2 != r13) goto L_0x00ef
            r15.V = r11
            return r11
        L_0x00ec:
            r15.V = r7
            return r7
        L_0x00ef:
            if (r2 == r13) goto L_0x00fb
            if (r2 != r12) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = "Unexpected value"
            java.io.IOException r0 = r15.r1(r0)
            throw r0
        L_0x00fb:
            r15.g()
            int r0 = r15.R
            int r0 = r0 - r13
            r15.R = r0
            r15.V = r8
            return r8
        L_0x0106:
            r15.g()
            r15.V = r3
            return r3
        L_0x010c:
            r0 = 9
            goto L_0x0094
        L_0x010f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L_0x0117:
            int r1 = r1 - r13
            r0[r1] = r11
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 != r14) goto L_0x0135
            int r1 = r15.a0(r13)
            if (r1 == r10) goto L_0x0135
            if (r1 == r9) goto L_0x0132
            if (r1 != r0) goto L_0x012b
            r15.V = r12
            return r12
        L_0x012b:
            java.lang.String r0 = "Unterminated object"
            java.io.IOException r0 = r15.r1(r0)
            throw r0
        L_0x0132:
            r15.g()
        L_0x0135:
            int r1 = r15.a0(r13)
            if (r1 == r5) goto L_0x016a
            if (r1 == r4) goto L_0x0163
            java.lang.String r3 = "Expected name"
            if (r1 == r0) goto L_0x0159
            r15.g()
            int r0 = r15.R
            int r0 = r0 - r13
            r15.R = r0
            char r0 = (char) r1
            boolean r0 = r15.t(r0)
            if (r0 == 0) goto L_0x0154
            r0 = 14
            goto L_0x0094
        L_0x0154:
            java.io.IOException r0 = r15.r1(r3)
            throw r0
        L_0x0159:
            if (r2 == r14) goto L_0x015e
            r15.V = r12
            return r12
        L_0x015e:
            java.io.IOException r0 = r15.r1(r3)
            throw r0
        L_0x0163:
            r15.g()
            r0 = 12
            goto L_0x0094
        L_0x016a:
            r0 = 13
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.a.i():int");
    }

    public String j1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f21942a0;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.Z[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.f21944c0[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f21943b0[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public void k() throws IOException {
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 4) {
            int i11 = this.f21942a0 - 1;
            this.f21942a0 = i11;
            int[] iArr = this.f21944c0;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.V = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + z0() + w());
    }

    public String k0() throws IOException {
        String str;
        char c10;
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 10) {
            str = m0();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.Y;
                this.Y = null;
            } else if (i10 == 15) {
                str = Long.toString(this.W);
            } else if (i10 == 16) {
                str = new String(this.Q, this.R, this.X);
                this.R += this.X;
            } else {
                throw new IllegalStateException("Expected a string but was " + z0() + w());
            }
            str = e0(c10);
        }
        this.V = 0;
        int[] iArr = this.f21944c0;
        int i11 = this.f21942a0 - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public void l() throws IOException {
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 2) {
            int i11 = this.f21942a0 - 1;
            this.f21942a0 = i11;
            this.f21943b0[i11] = null;
            int[] iArr = this.f21944c0;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.V = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + z0() + w());
    }

    public final boolean m(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.Q;
        int i13 = this.U;
        int i14 = this.R;
        this.U = i13 - i14;
        int i15 = this.S;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.S = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.S = 0;
        }
        this.R = 0;
        do {
            Reader reader = this.O;
            int i17 = this.S;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.S + read;
            this.S = i11;
            if (this.T == 0 && (i12 = this.U) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.R++;
                this.U = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r0
        L_0x0003:
            int r3 = r6.R
            int r4 = r3 + r2
            int r5 = r6.S
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.Q
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.g()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.Q
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.Q
            int r4 = r6.R
            r1.append(r3, r4, r2)
            int r3 = r6.R
            int r3 = r3 + r2
            r6.R = r3
            r2 = 1
            boolean r2 = r6.m(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.Q
            int r3 = r6.R
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.Q
            int r3 = r6.R
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.R
            int r2 = r2 + r0
            r6.R = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.a.m0():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1() throws java.io.IOException {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.R
            int r2 = r1 + r0
            int r3 = r4.S
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.Q
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.g()
        L_0x004b:
            int r1 = r4.R
            int r1 = r1 + r0
            r4.R = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.R = r1
            r0 = 1
            boolean r0 = r4.m(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.a.m1():void");
    }

    public boolean o() throws IOException {
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public void p1() throws IOException {
        char c10;
        int i10 = 0;
        do {
            int i11 = this.V;
            if (i11 == 0) {
                i11 = i();
            }
            if (i11 == 3) {
                W0(1);
            } else if (i11 == 1) {
                W0(3);
            } else if (i11 == 4 || i11 == 2) {
                this.f21942a0--;
                i10--;
                this.V = 0;
            } else if (i11 == 14 || i11 == 10) {
                m1();
                this.V = 0;
            } else {
                if (i11 == 8 || i11 == 12) {
                    c10 = '\'';
                } else if (i11 == 9 || i11 == 13) {
                    c10 = '\"';
                } else {
                    if (i11 == 16) {
                        this.R += this.X;
                    }
                    this.V = 0;
                }
                f1(c10);
                this.V = 0;
            }
            i10++;
            this.V = 0;
        } while (i10 != 0);
        int[] iArr = this.f21944c0;
        int i12 = this.f21942a0;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f21943b0[i12 - 1] = "null";
    }

    public final boolean q() {
        return this.P;
    }

    public final IOException r1(String str) throws IOException {
        throw new e(str + w());
    }

    public final boolean t(char c10) throws IOException {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + w();
    }

    public String w() {
        return " at line " + (this.T + 1) + " column " + ((this.R - this.U) + 1) + " path " + j1();
    }

    public c z0() throws IOException {
        int i10 = this.V;
        if (i10 == 0) {
            i10 = i();
        }
        switch (i10) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
                return c.NAME;
            case 15:
            case 16:
                return c.NUMBER;
            case 17:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
