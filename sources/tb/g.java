package tb;

import d5.k;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import qa.w;
import t3.c;
import ya.d;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23154a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f23155b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f23156c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f23157d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f23158e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f23159f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f23160g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final int f23161h = 900;

    /* renamed from: i  reason: collision with root package name */
    public static final int f23162i = 901;

    /* renamed from: j  reason: collision with root package name */
    public static final int f23163j = 902;

    /* renamed from: k  reason: collision with root package name */
    public static final int f23164k = 913;

    /* renamed from: l  reason: collision with root package name */
    public static final int f23165l = 924;

    /* renamed from: m  reason: collision with root package name */
    public static final int f23166m = 925;

    /* renamed from: n  reason: collision with root package name */
    public static final int f23167n = 926;

    /* renamed from: o  reason: collision with root package name */
    public static final int f23168o = 927;

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f23169p = {k.f6148y0, 49, 50, 51, 52, 53, 54, 55, 56, 57, i7.a.V, c.T, 9, 44, k.F0, 35, i7.a.f9186b0, i7.a.f9187c0, i7.a.T, i7.a.f9188d0, i7.a.Z, i7.a.U, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f23170q = {59, 60, 62, 64, k.f6149z0, k.D0, k.A0, 95, 96, 126, 33, c.T, 9, 44, k.F0, 10, i7.a.f9186b0, i7.a.f9187c0, i7.a.T, i7.a.f9188d0, 34, 124, 42, 40, i7.a.X, 63, k.B0, k.C0, i7.a.W, 0};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f23171r;

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f23172s = new byte[128];

    /* renamed from: t  reason: collision with root package name */
    public static final Charset f23173t = StandardCharsets.ISO_8859_1;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23174a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                tb.c[] r0 = tb.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23174a = r0
                tb.c r1 = tb.c.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23174a     // Catch:{ NoSuchFieldError -> 0x001d }
                tb.c r1 = tb.c.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23174a     // Catch:{ NoSuchFieldError -> 0x0028 }
                tb.c r1 = tb.c.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.g.a.<clinit>():void");
        }
    }

    static {
        byte[] bArr = new byte[128];
        f23171r = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f23169p;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f23171r[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f23172s, (byte) -1);
        while (true) {
            byte[] bArr3 = f23170q;
            if (i10 < bArr3.length) {
                byte b11 = bArr3[i10];
                if (b11 > 0) {
                    f23172s[b11] = (byte) i10;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) throws qa.w {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L_0x0009:
            if (r1 >= r0) goto L_0x0057
            char r2 = r5.charAt(r1)
            r3 = 0
        L_0x0010:
            r4 = 13
            if (r3 >= r4) goto L_0x0025
            boolean r2 = k(r2)
            if (r2 == 0) goto L_0x0025
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L_0x0025
            char r2 = r5.charAt(r2)
            goto L_0x0010
        L_0x0025:
            if (r3 < r4) goto L_0x0029
            int r1 = r1 - r6
            return r1
        L_0x0029:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L_0x0036
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0036:
            qa.w r5 = new qa.w
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x0057:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    public static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i10);
                while (true) {
                    if (!k(charAt) || i10 >= length) {
                        break loop0;
                    }
                    i11++;
                    i10++;
                    if (i10 < length) {
                    }
                }
            }
        }
        return i11;
    }

    public static int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = i10;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            int i12 = 0;
            while (i12 < 13 && k(charAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    charAt = charSequence.charAt(i11);
                }
            }
            if (i12 < 13) {
                if (i12 <= 0) {
                    if (!n(charSequence.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
            } else {
                return (i11 - i10) - i12;
            }
        }
        return i11 - i10;
    }

    public static void d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
        int i13;
        sb2.append((i11 == 1 && i12 == 0) ? 913 : i11 % 6 == 0 ? (char) 924 : 901);
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + ((long) (bArr[i13 + i14] & 255));
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) ((int) (j10 % 900));
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    public static String e(String str, c cVar, Charset charset) throws w {
        d a10;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f23173t;
        } else if (!f23173t.equals(charset) && (a10 = d.a(charset.name())) != null) {
            h(a10.d(), sb2);
        }
        int length = str.length();
        int i10 = a.f23174a[cVar.ordinal()];
        if (i10 == 1) {
            g(str, 0, length, sb2, 0);
        } else if (i10 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb2);
        } else if (i10 != 3) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int b10 = b(str, i11);
                if (b10 >= 13) {
                    sb2.append(902);
                    f(str, i11, b10, sb2);
                    i11 += b10;
                    i12 = 0;
                    i13 = 2;
                } else {
                    int c10 = c(str, i11);
                    if (c10 >= 5 || b10 == length) {
                        if (i13 != 0) {
                            sb2.append(900);
                            i12 = 0;
                            i13 = 0;
                        }
                        i12 = g(str, i11, c10, sb2, i12);
                        i11 += c10;
                    } else {
                        int a11 = a(str, i11, charset);
                        if (a11 == 0) {
                            a11 = 1;
                        }
                        int i14 = a11 + i11;
                        byte[] bytes2 = str.substring(i11, i14).getBytes(charset);
                        if (bytes2.length == 1 && i13 == 0) {
                            d(bytes2, 0, 1, 0, sb2);
                        } else {
                            d(bytes2, 0, bytes2.length, i13, sb2);
                            i13 = 1;
                            i12 = 0;
                        }
                        i11 = i14;
                    }
                }
            }
        } else {
            sb2.append(902);
            f(str, 0, length, sb2);
        }
        return sb2.toString();
    }

    public static void f(String str, int i10, int i11, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb4.append(str.substring(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i12 += min;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r10 == ' ') goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf A[EDGE_INSN: B:66:0x00cf->B:51:0x00cf ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0011 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = r20
            r8 = r5
        L_0x0011:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r7 == 0) goto L_0x009a
            if (r7 == r6) goto L_0x0075
            if (r7 == r4) goto L_0x0037
            boolean r9 = m(r10)
            if (r9 == 0) goto L_0x0032
            byte[] r9 = f23172s
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x0032:
            r3.append(r15)
        L_0x0035:
            r7 = r5
            goto L_0x0011
        L_0x0037:
            boolean r11 = l(r10)
            if (r11 == 0) goto L_0x0047
            byte[] r9 = f23171r
            byte r9 = r9[r10]
        L_0x0041:
            char r9 = (char) r9
        L_0x0042:
            r3.append(r9)
            goto L_0x00cb
        L_0x0047:
            boolean r11 = j(r10)
            if (r11 == 0) goto L_0x0051
            r3.append(r13)
            goto L_0x0035
        L_0x0051:
            boolean r11 = i(r10)
            if (r11 == 0) goto L_0x0058
            goto L_0x00b0
        L_0x0058:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x006d
            char r9 = r0.charAt(r9)
            boolean r9 = m(r9)
            if (r9 == 0) goto L_0x006d
            r7 = 3
            r9 = 25
            r3.append(r9)
            goto L_0x0011
        L_0x006d:
            r3.append(r15)
            byte[] r9 = f23172s
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x0075:
            boolean r9 = i(r10)
            if (r9 == 0) goto L_0x0081
            if (r10 != r12) goto L_0x007e
            goto L_0x00a2
        L_0x007e:
            int r10 = r10 + -97
            goto L_0x00a8
        L_0x0081:
            boolean r9 = j(r10)
            if (r9 == 0) goto L_0x008b
            r3.append(r14)
            goto L_0x00a6
        L_0x008b:
            boolean r9 = l(r10)
            if (r9 == 0) goto L_0x0092
            goto L_0x00bc
        L_0x0092:
            r3.append(r15)
            byte[] r9 = f23172s
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x009a:
            boolean r9 = j(r10)
            if (r9 == 0) goto L_0x00aa
            if (r10 != r12) goto L_0x00a6
        L_0x00a2:
            r3.append(r11)
            goto L_0x00cb
        L_0x00a6:
            int r10 = r10 + -65
        L_0x00a8:
            char r9 = (char) r10
            goto L_0x0042
        L_0x00aa:
            boolean r9 = i(r10)
            if (r9 == 0) goto L_0x00b6
        L_0x00b0:
            r3.append(r14)
            r7 = r6
            goto L_0x0011
        L_0x00b6:
            boolean r9 = l(r10)
            if (r9 == 0) goto L_0x00c2
        L_0x00bc:
            r3.append(r13)
            r7 = r4
            goto L_0x0011
        L_0x00c2:
            r3.append(r15)
            byte[] r9 = f23172s
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x00cb:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0011
            int r0 = r3.length()
            r1 = r5
            r8 = r1
        L_0x00d5:
            if (r1 >= r0) goto L_0x00f3
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x00dd
            r9 = r6
            goto L_0x00de
        L_0x00dd:
            r9 = r5
        L_0x00de:
            if (r9 == 0) goto L_0x00ec
            int r8 = r8 * 30
            char r9 = r3.charAt(r1)
            int r8 = r8 + r9
            char r8 = (char) r8
            r2.append(r8)
            goto L_0x00f0
        L_0x00ec:
            char r8 = r3.charAt(r1)
        L_0x00f0:
            int r1 = r1 + 1
            goto L_0x00d5
        L_0x00f3:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x00fd
            int r8 = r8 * 30
            int r8 = r8 + r15
            char r0 = (char) r8
            r2.append(r0)
        L_0x00fd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static void h(int i10, StringBuilder sb2) throws w {
        char c10;
        if (i10 >= 0 && i10 < 900) {
            sb2.append(927);
        } else if (i10 < 810900) {
            sb2.append(926);
            sb2.append((char) ((i10 / 900) - 1));
            i10 %= 900;
        } else if (i10 < 811800) {
            sb2.append(925);
            c10 = (char) (810900 - i10);
            sb2.append(c10);
        } else {
            throw new w("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i10)));
        }
        c10 = (char) i10;
        sb2.append(c10);
    }

    public static boolean i(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean j(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static boolean k(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean l(char c10) {
        return f23171r[c10] != -1;
    }

    public static boolean m(char c10) {
        return f23172s[c10] != -1;
    }

    public static boolean n(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 13) {
            return true;
        }
        return c10 >= ' ' && c10 <= '~';
    }
}
