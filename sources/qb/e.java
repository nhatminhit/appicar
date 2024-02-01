package qb;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import pb.c;
import qa.h;

public final class e {
    public static final char[] A = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    public static final char[] B = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    public static final BigInteger[] C;
    public static final int D = 2;

    /* renamed from: a  reason: collision with root package name */
    public static final int f22219a = 900;

    /* renamed from: b  reason: collision with root package name */
    public static final int f22220b = 901;

    /* renamed from: c  reason: collision with root package name */
    public static final int f22221c = 902;

    /* renamed from: d  reason: collision with root package name */
    public static final int f22222d = 924;

    /* renamed from: e  reason: collision with root package name */
    public static final int f22223e = 925;

    /* renamed from: f  reason: collision with root package name */
    public static final int f22224f = 926;

    /* renamed from: g  reason: collision with root package name */
    public static final int f22225g = 927;

    /* renamed from: h  reason: collision with root package name */
    public static final int f22226h = 928;

    /* renamed from: i  reason: collision with root package name */
    public static final int f22227i = 923;

    /* renamed from: j  reason: collision with root package name */
    public static final int f22228j = 922;

    /* renamed from: k  reason: collision with root package name */
    public static final int f22229k = 913;

    /* renamed from: l  reason: collision with root package name */
    public static final int f22230l = 15;

    /* renamed from: m  reason: collision with root package name */
    public static final int f22231m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f22232n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f22233o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f22234p = 3;

    /* renamed from: q  reason: collision with root package name */
    public static final int f22235q = 4;

    /* renamed from: r  reason: collision with root package name */
    public static final int f22236r = 5;

    /* renamed from: s  reason: collision with root package name */
    public static final int f22237s = 6;

    /* renamed from: t  reason: collision with root package name */
    public static final int f22238t = 25;

    /* renamed from: u  reason: collision with root package name */
    public static final int f22239u = 27;

    /* renamed from: v  reason: collision with root package name */
    public static final int f22240v = 27;

    /* renamed from: w  reason: collision with root package name */
    public static final int f22241w = 28;

    /* renamed from: x  reason: collision with root package name */
    public static final int f22242x = 28;

    /* renamed from: y  reason: collision with root package name */
    public static final int f22243y = 29;

    /* renamed from: z  reason: collision with root package name */
    public static final int f22244z = 29;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22245a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                qb.e$b[] r0 = qb.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22245a = r0
                qb.e$b r1 = qb.e.b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22245a     // Catch:{ NoSuchFieldError -> 0x001d }
                qb.e$b r1 = qb.e.b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22245a     // Catch:{ NoSuchFieldError -> 0x0028 }
                qb.e$b r1 = qb.e.b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22245a     // Catch:{ NoSuchFieldError -> 0x0033 }
                qb.e$b r1 = qb.e.b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22245a     // Catch:{ NoSuchFieldError -> 0x003e }
                qb.e$b r1 = qb.e.b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22245a     // Catch:{ NoSuchFieldError -> 0x0049 }
                qb.e$b r1 = qb.e.b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qb.e.a.<clinit>():void");
        }
    }

    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        C = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = C;
            if (i10 < bigIntegerArr2.length) {
                bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
                i10++;
            } else {
                return;
            }
        }
    }

    public static int a(int i10, int[] iArr, Charset charset, int i11, StringBuilder sb2) {
        int i12;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16 = i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j11 = 900;
        int i17 = 6;
        if (i16 == 901) {
            int[] iArr2 = new int[6];
            int i18 = i11 + 1;
            int i19 = iArr[i11];
            boolean z10 = false;
            int i20 = 0;
            while (true) {
                long j12 = 0;
                while (true) {
                    int i21 = iArr[0];
                    if (i15 < i21 && !z10) {
                        int i22 = i13 + 1;
                        iArr2[i13] = i14;
                        j12 = (j12 * j10) + ((long) i14);
                        int i23 = i15 + 1;
                        i19 = iArr[i15];
                        if (i19 != 928) {
                            switch (i19) {
                                case 900:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i19) {
                                        case f22228j /*922*/:
                                        case f22227i /*923*/:
                                        case 924:
                                            break;
                                        default:
                                            if (i22 % 5 != 0 || i22 <= 0) {
                                                i14 = i19;
                                                i15 = i23;
                                                i13 = i22;
                                                j10 = 900;
                                                i17 = 6;
                                                break;
                                            } else {
                                                int i24 = 0;
                                                while (i24 < i17) {
                                                    byteArrayOutputStream.write((byte) ((int) (j12 >> ((5 - i24) * 8))));
                                                    i24++;
                                                    i19 = i19;
                                                    i17 = 6;
                                                }
                                                int i25 = i19;
                                                i18 = i23;
                                                i20 = 0;
                                                j11 = 900;
                                            }
                                    }
                                    break;
                            }
                        }
                        i15 = i23 - 1;
                        i14 = i19;
                        i13 = i22;
                        j10 = 900;
                        i17 = 6;
                        z10 = true;
                    } else if (i15 == i21 && i14 < 900) {
                        iArr2[i13] = i14;
                        i13++;
                    }
                }
            }
            iArr2[i13] = i14;
            i13++;
            for (int i26 = 0; i26 < i13; i26++) {
                byteArrayOutputStream.write((byte) iArr2[i26]);
            }
            i12 = i15;
        } else if (i16 != 924) {
            i12 = i11;
        } else {
            i12 = i11;
            boolean z11 = false;
            int i27 = 0;
            while (true) {
                long j13 = 0;
                while (i12 < iArr[0] && !z11) {
                    int i28 = i12 + 1;
                    int i29 = iArr[i12];
                    if (i29 < 900) {
                        i27++;
                        j13 = (j13 * 900) + ((long) i29);
                    } else {
                        if (i29 != 928) {
                            switch (i29) {
                                case 900:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i29) {
                                        case f22228j /*922*/:
                                        case f22227i /*923*/:
                                        case 924:
                                            break;
                                    }
                            }
                        }
                        i12 = i28 - 1;
                        z11 = true;
                        if (i27 % 5 != 0 && i27 > 0) {
                            for (int i30 = 0; i30 < 6; i30++) {
                                byteArrayOutputStream.write((byte) ((int) (j13 >> ((5 - i30) * 8))));
                            }
                            i27 = 0;
                        }
                    }
                    i12 = i28;
                    if (i27 % 5 != 0) {
                    }
                }
            }
        }
        sb2.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r2 = a(r2, r6, r1, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r2 = g(r6, r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ya.e b(int[] r6, java.lang.String r7) throws qa.h {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            pb.c r3 = new pb.c
            r3.<init>()
            r4 = 2
        L_0x0012:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L_0x0069
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L_0x0054
            switch(r2) {
                case 900: goto L_0x004f;
                case 901: goto L_0x004a;
                case 902: goto L_0x0045;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r2) {
                case 922: goto L_0x0040;
                case 923: goto L_0x0040;
                case 924: goto L_0x004a;
                case 925: goto L_0x003d;
                case 926: goto L_0x003a;
                case 927: goto L_0x0029;
                case 928: goto L_0x0024;
                default: goto L_0x0021;
            }
        L_0x0021:
            int r4 = r4 + -1
            goto L_0x004f
        L_0x0024:
            int r2 = d(r6, r4, r3)
            goto L_0x005c
        L_0x0029:
            int r2 = r4 + 1
            r1 = r6[r4]
            ya.d r1 = ya.d.b(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L_0x005c
        L_0x003a:
            int r2 = r4 + 2
            goto L_0x005c
        L_0x003d:
            int r2 = r4 + 1
            goto L_0x005c
        L_0x0040:
            qa.h r6 = qa.h.a()
            throw r6
        L_0x0045:
            int r2 = f(r6, r4, r0)
            goto L_0x005c
        L_0x004a:
            int r2 = a(r2, r6, r1, r4, r0)
            goto L_0x005c
        L_0x004f:
            int r2 = g(r6, r4, r0)
            goto L_0x005c
        L_0x0054:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L_0x005c:
            int r4 = r6.length
            if (r2 >= r4) goto L_0x0064
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L_0x0012
        L_0x0064:
            qa.h r6 = qa.h.a()
            throw r6
        L_0x0069:
            int r6 = r0.length()
            if (r6 == 0) goto L_0x007d
            ya.e r6 = new ya.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.o(r3)
            return r6
        L_0x007d:
            qa.h r6 = qa.h.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.e.b(int[], java.lang.String):ya.e");
    }

    public static String c(int[] iArr, int i10) throws h {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(C[(i10 - i11) - 1].multiply(BigInteger.valueOf((long) iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw h.a();
    }

    public static int d(int[] iArr, int i10, c cVar) throws h {
        if (i10 + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i11 = 0;
            while (i11 < 2) {
                iArr2[i11] = iArr[i10];
                i11++;
                i10++;
            }
            cVar.t(Integer.parseInt(c(iArr2, 2)));
            StringBuilder sb2 = new StringBuilder();
            int g10 = g(iArr, i10, sb2);
            cVar.n(sb2.toString());
            int i12 = iArr[g10] == 923 ? g10 + 1 : -1;
            while (g10 < iArr[0]) {
                int i13 = iArr[g10];
                if (i13 == 922) {
                    g10++;
                    cVar.q(true);
                } else if (i13 == 923) {
                    int i14 = g10 + 1;
                    switch (iArr[i14]) {
                        case 0:
                            StringBuilder sb3 = new StringBuilder();
                            g10 = g(iArr, i14 + 1, sb3);
                            cVar.o(sb3.toString());
                            break;
                        case 1:
                            StringBuilder sb4 = new StringBuilder();
                            g10 = f(iArr, i14 + 1, sb4);
                            cVar.s(Integer.parseInt(sb4.toString()));
                            break;
                        case 2:
                            StringBuilder sb5 = new StringBuilder();
                            g10 = f(iArr, i14 + 1, sb5);
                            cVar.v(Long.parseLong(sb5.toString()));
                            break;
                        case 3:
                            StringBuilder sb6 = new StringBuilder();
                            g10 = g(iArr, i14 + 1, sb6);
                            cVar.u(sb6.toString());
                            break;
                        case 4:
                            StringBuilder sb7 = new StringBuilder();
                            g10 = g(iArr, i14 + 1, sb7);
                            cVar.l(sb7.toString());
                            break;
                        case 5:
                            StringBuilder sb8 = new StringBuilder();
                            g10 = f(iArr, i14 + 1, sb8);
                            cVar.p(Long.parseLong(sb8.toString()));
                            break;
                        case 6:
                            StringBuilder sb9 = new StringBuilder();
                            g10 = f(iArr, i14 + 1, sb9);
                            cVar.m(Integer.parseInt(sb9.toString()));
                            break;
                        default:
                            throw h.a();
                    }
                } else {
                    throw h.a();
                }
            }
            if (i12 != -1) {
                int i15 = g10 - i12;
                if (cVar.k()) {
                    i15--;
                }
                cVar.r(Arrays.copyOfRange(iArr, i12, i15 + i12));
            }
            return g10;
        }
        throw h.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        r0 = qb.e.b.O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        r6 = (char) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        r2 = qb.e.b.T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0095, code lost:
        r6 = 0;
        r11 = r2;
        r2 = r0;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009a, code lost:
        r0 = qb.e.b.Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        r0 = qb.e.b.P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a2, code lost:
        r15.append((char) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a7, code lost:
        if (r6 == 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a9, code lost:
        r15.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ac, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(int[] r12, int[] r13, int r14, java.lang.StringBuilder r15) {
        /*
            qb.e$b r0 = qb.e.b.ALPHA
            r1 = 0
            r2 = r0
            r3 = r1
        L_0x0005:
            if (r3 >= r14) goto L_0x00b0
            r4 = r12[r3]
            int[] r5 = qb.e.a.f22245a
            int r6 = r0.ordinal()
            r5 = r5[r6]
            r6 = 32
            r7 = 29
            r8 = 26
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            switch(r5) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0072;
                case 3: goto L_0x0058;
                case 4: goto L_0x0045;
                case 5: goto L_0x0036;
                case 6: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00a6
        L_0x0020:
            if (r4 >= r7) goto L_0x0027
            char[] r0 = A
            char r6 = r0[r4]
            goto L_0x003b
        L_0x0027:
            if (r4 == r7) goto L_0x006f
            if (r4 == r10) goto L_0x006f
            if (r4 == r9) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            r0 = r13[r3]
            char r0 = (char) r0
            r15.append(r0)
        L_0x0034:
            r6 = r1
            goto L_0x003b
        L_0x0036:
            if (r4 >= r8) goto L_0x003e
            int r4 = r4 + 65
            char r6 = (char) r4
        L_0x003b:
            r0 = r2
            goto L_0x00a7
        L_0x003e:
            if (r4 == r8) goto L_0x003b
            if (r4 == r10) goto L_0x006f
            r0 = r2
            goto L_0x00a6
        L_0x0045:
            if (r4 >= r7) goto L_0x004d
            char[] r5 = A
            char r6 = r5[r4]
            goto L_0x00a7
        L_0x004d:
            if (r4 == r7) goto L_0x006f
            if (r4 == r10) goto L_0x006f
            if (r4 == r9) goto L_0x0055
            goto L_0x00a6
        L_0x0055:
            r4 = r13[r3]
            goto L_0x00a2
        L_0x0058:
            r5 = 25
            if (r4 >= r5) goto L_0x0061
            char[] r5 = B
            char r6 = r5[r4]
            goto L_0x00a7
        L_0x0061:
            if (r4 == r10) goto L_0x006f
            if (r4 == r9) goto L_0x006c
            switch(r4) {
                case 25: goto L_0x0069;
                case 26: goto L_0x00a7;
                case 27: goto L_0x009d;
                case 28: goto L_0x006f;
                case 29: goto L_0x0093;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x00a6
        L_0x0069:
            qb.e$b r0 = qb.e.b.PUNCT
            goto L_0x00a6
        L_0x006c:
            r4 = r13[r3]
            goto L_0x00a2
        L_0x006f:
            qb.e$b r0 = qb.e.b.ALPHA
            goto L_0x00a6
        L_0x0072:
            if (r4 >= r8) goto L_0x0077
            int r4 = r4 + 97
            goto L_0x0089
        L_0x0077:
            if (r4 == r10) goto L_0x006f
            if (r4 == r9) goto L_0x0082
            switch(r4) {
                case 26: goto L_0x00a7;
                case 27: goto L_0x007f;
                case 28: goto L_0x009a;
                case 29: goto L_0x0093;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x00a6
        L_0x007f:
            qb.e$b r2 = qb.e.b.ALPHA_SHIFT
            goto L_0x0095
        L_0x0082:
            r4 = r13[r3]
            goto L_0x00a2
        L_0x0085:
            if (r4 >= r8) goto L_0x008b
            int r4 = r4 + 65
        L_0x0089:
            char r6 = (char) r4
            goto L_0x00a7
        L_0x008b:
            if (r4 == r10) goto L_0x006f
            if (r4 == r9) goto L_0x00a0
            switch(r4) {
                case 26: goto L_0x00a7;
                case 27: goto L_0x009d;
                case 28: goto L_0x009a;
                case 29: goto L_0x0093;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x00a6
        L_0x0093:
            qb.e$b r2 = qb.e.b.PUNCT_SHIFT
        L_0x0095:
            r6 = r1
            r11 = r2
            r2 = r0
            r0 = r11
            goto L_0x00a7
        L_0x009a:
            qb.e$b r0 = qb.e.b.MIXED
            goto L_0x00a6
        L_0x009d:
            qb.e$b r0 = qb.e.b.LOWER
            goto L_0x00a6
        L_0x00a0:
            r4 = r13[r3]
        L_0x00a2:
            char r4 = (char) r4
            r15.append(r4)
        L_0x00a6:
            r6 = r1
        L_0x00a7:
            if (r6 == 0) goto L_0x00ac
            r15.append(r6)
        L_0x00ac:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.e.e(int[], int[], int, java.lang.StringBuilder):void");
    }

    public static int f(int[] iArr, int i10, StringBuilder sb2) throws h {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int i12 = iArr[0];
            if (i10 >= i12 || z10) {
                return i10;
            }
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i13 == i12) {
                z10 = true;
            }
            if (i14 < 900) {
                iArr2[i11] = i14;
                i11++;
            } else {
                if (!(i14 == 900 || i14 == 901 || i14 == 928)) {
                    switch (i14) {
                        case f22228j /*922*/:
                        case f22227i /*923*/:
                        case 924:
                            break;
                    }
                }
                i13--;
                z10 = true;
            }
            if ((i11 % 15 == 0 || i14 == 902 || z10) && i11 > 0) {
                sb2.append(c(iArr2, i11));
                i11 = 0;
            }
            i10 = i13;
        }
        return i10;
    }

    public static int g(int[] iArr, int i10, StringBuilder sb2) {
        int i11 = iArr[0];
        int[] iArr2 = new int[((i11 - i10) << 1)];
        int[] iArr3 = new int[((i11 - i10) << 1)];
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iArr[0] && !z10) {
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i14 < 900) {
                iArr2[i12] = i14 / 30;
                iArr2[i12 + 1] = i14 % 30;
                i12 += 2;
            } else if (i14 != 913) {
                if (i14 != 928) {
                    switch (i14) {
                        case 900:
                            iArr2[i12] = 900;
                            i12++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i14) {
                                case f22228j /*922*/:
                                case f22227i /*923*/:
                                case 924:
                                    break;
                            }
                    }
                }
                i10 = i13 - 1;
                z10 = true;
            } else {
                iArr2[i12] = 913;
                i10 = i13 + 1;
                iArr3[i12] = iArr[i13];
                i12++;
            }
            i10 = i13;
        }
        e(iArr2, iArr3, i12, sb2);
        return i10;
    }
}
