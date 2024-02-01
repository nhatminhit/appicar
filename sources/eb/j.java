package eb;

import dg.a;
import java.util.Arrays;
import qa.f;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final char f18555a = '';

    /* renamed from: b  reason: collision with root package name */
    public static final char f18556b = 'æ';

    /* renamed from: c  reason: collision with root package name */
    public static final char f18557c = 'ç';

    /* renamed from: d  reason: collision with root package name */
    public static final char f18558d = 'ë';

    /* renamed from: e  reason: collision with root package name */
    public static final char f18559e = 'ì';

    /* renamed from: f  reason: collision with root package name */
    public static final char f18560f = 'í';

    /* renamed from: g  reason: collision with root package name */
    public static final char f18561g = 'î';

    /* renamed from: h  reason: collision with root package name */
    public static final char f18562h = 'ï';

    /* renamed from: i  reason: collision with root package name */
    public static final char f18563i = 'ð';

    /* renamed from: j  reason: collision with root package name */
    public static final char f18564j = 'þ';

    /* renamed from: k  reason: collision with root package name */
    public static final char f18565k = 'þ';

    /* renamed from: l  reason: collision with root package name */
    public static final String f18566l = "[)>\u001e05\u001d";

    /* renamed from: m  reason: collision with root package name */
    public static final String f18567m = "[)>\u001e06\u001d";

    /* renamed from: n  reason: collision with root package name */
    public static final String f18568n = "\u001e\u0004";

    /* renamed from: o  reason: collision with root package name */
    public static final int f18569o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f18570p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f18571q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f18572r = 3;

    /* renamed from: s  reason: collision with root package name */
    public static final int f18573s = 4;

    /* renamed from: t  reason: collision with root package name */
    public static final int f18574t = 5;

    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i10);
                while (true) {
                    if (!g(charAt) || i10 >= length) {
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

    public static String b(String str) {
        return c(str, l.FORCE_NONE, (f) null, (f) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.lang.String r7, eb.l r8, qa.f r9, qa.f r10) {
        /*
            r0 = 6
            eb.g[] r0 = new eb.g[r0]
            eb.a r1 = new eb.a
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            eb.c r1 = new eb.c
            r1.<init>()
            r3 = 1
            r0[r3] = r1
            eb.m r1 = new eb.m
            r1.<init>()
            r4 = 2
            r0[r4] = r1
            eb.n r1 = new eb.n
            r1.<init>()
            r5 = 3
            r0[r5] = r1
            eb.f r1 = new eb.f
            r1.<init>()
            r5 = 4
            r0[r5] = r1
            eb.b r1 = new eb.b
            r1.<init>()
            r6 = 5
            r0[r6] = r1
            eb.h r1 = new eb.h
            r1.<init>(r7)
            r1.o(r8)
            r1.m(r9, r10)
            java.lang.String r8 = "[)>\u001e05\u001d"
            boolean r8 = r7.startsWith(r8)
            java.lang.String r9 = "\u001e\u0004"
            if (r8 == 0) goto L_0x005d
            boolean r8 = r7.endsWith(r9)
            if (r8 == 0) goto L_0x005d
            r7 = 236(0xec, float:3.31E-43)
        L_0x0050:
            r1.s(r7)
            r1.n(r4)
            int r7 = r1.f18546f
            int r7 = r7 + 7
            r1.f18546f = r7
            goto L_0x006e
        L_0x005d:
            java.lang.String r8 = "[)>\u001e06\u001d"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x006e
            boolean r7 = r7.endsWith(r9)
            if (r7 == 0) goto L_0x006e
            r7 = 237(0xed, float:3.32E-43)
            goto L_0x0050
        L_0x006e:
            boolean r7 = r1.j()
            if (r7 == 0) goto L_0x0087
            r7 = r0[r2]
            r7.b(r1)
            int r7 = r1.f()
            if (r7 < 0) goto L_0x006e
            int r2 = r1.f()
            r1.k()
            goto L_0x006e
        L_0x0087:
            int r7 = r1.a()
            r1.q()
            eb.k r8 = r1.h()
            int r8 = r8.b()
            if (r7 >= r8) goto L_0x00a3
            if (r2 == 0) goto L_0x00a3
            if (r2 == r6) goto L_0x00a3
            if (r2 == r5) goto L_0x00a3
            r7 = 254(0xfe, float:3.56E-43)
            r1.s(r7)
        L_0x00a3:
            java.lang.StringBuilder r7 = r1.b()
            int r9 = r7.length()
            if (r9 >= r8) goto L_0x00b2
            r9 = 129(0x81, float:1.81E-43)
        L_0x00af:
            r7.append(r9)
        L_0x00b2:
            int r9 = r7.length()
            if (r9 >= r8) goto L_0x00c2
            int r9 = r7.length()
            int r9 = r9 + r3
            char r9 = p(r9)
            goto L_0x00af
        L_0x00c2:
            java.lang.StringBuilder r7 = r1.b()
            java.lang.String r7 = r7.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.j.c(java.lang.String, eb.l, qa.f, qa.f):java.lang.String");
    }

    public static int d(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 6; i11++) {
            int ceil = (int) Math.ceil((double) fArr[i11]);
            iArr[i11] = ceil;
            if (i10 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = ceil;
            }
            if (i10 == ceil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    public static int e(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    public static void f(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean g(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean h(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    public static boolean i(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static boolean j(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    public static boolean k(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean l(char c10) {
        if (n(c10) || c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static boolean m(char c10) {
        return false;
    }

    public static boolean n(char c10) {
        return c10 == 13 || c10 == '*' || c10 == '>';
    }

    public static int o(CharSequence charSequence, int i10, int i11) {
        char c10;
        CharSequence charSequence2 = charSequence;
        int i12 = i10;
        if (i12 >= charSequence.length()) {
            return i11;
        }
        int i13 = 6;
        float[] fArr = new float[6];
        if (i11 == 0) {
            // fill-array-data instruction
            fArr[0] = 0;
            fArr[1] = 1065353216;
            fArr[2] = 1065353216;
            fArr[3] = 1065353216;
            fArr[4] = 1065353216;
            fArr[5] = 1067450368;
        } else {
            // fill-array-data instruction
            fArr[0] = 1065353216;
            fArr[1] = 1073741824;
            fArr[2] = 1073741824;
            fArr[3] = 1073741824;
            fArr[4] = 1073741824;
            fArr[5] = 1074790400;
            fArr[i11] = 0.0f;
        }
        int i14 = 0;
        while (true) {
            int i15 = i12 + i14;
            if (i15 == charSequence.length()) {
                byte[] bArr = new byte[i13];
                int[] iArr = new int[i13];
                int d10 = d(fArr, iArr, Integer.MAX_VALUE, bArr);
                int e10 = e(bArr);
                if (iArr[0] == d10) {
                    return 0;
                }
                if (e10 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (e10 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (e10 != 1 || bArr[2] <= 0) {
                    return (e10 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i15);
            i14++;
            if (g(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (h(charAt)) {
                float ceil = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (i(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (l(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (j(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (h(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m(charAt)) {
                c10 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c10 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i14 >= 4) {
                int[] iArr2 = new int[i13];
                byte[] bArr2 = new byte[i13];
                d(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int e11 = e(bArr2);
                int i16 = iArr2[0];
                int i17 = iArr2[c10];
                if (i16 < i17 && i16 < iArr2[1] && i16 < iArr2[2] && i16 < iArr2[3] && i16 < iArr2[4]) {
                    return 0;
                }
                if (i17 < i16) {
                    return 5;
                }
                byte b10 = bArr2[1];
                byte b11 = bArr2[2];
                byte b12 = bArr2[3];
                byte b13 = bArr2[4];
                if (b10 + b11 + b12 + b13 == 0) {
                    return 5;
                }
                if (e11 == 1 && b13 > 0) {
                    return 4;
                }
                if (e11 == 1 && b11 > 0) {
                    return 2;
                }
                if (e11 == 1 && b12 > 0) {
                    return 3;
                }
                int i18 = iArr2[1];
                if (i18 + 1 < i16 && i18 + 1 < i17 && i18 + 1 < iArr2[4] && i18 + 1 < iArr2[2]) {
                    int i19 = iArr2[3];
                    if (i18 < i19) {
                        return 1;
                    }
                    if (i18 == i19) {
                        int i20 = i12 + i14 + 1;
                        while (i20 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i20);
                            if (!n(charAt2)) {
                                if (!l(charAt2)) {
                                    break;
                                }
                                i20++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
            i13 = 6;
        }
    }

    public static char p(int i10) {
        int i11 = ((i10 * a.Yb) % 253) + 1 + 129;
        if (i11 > 254) {
            i11 -= 254;
        }
        return (char) i11;
    }
}
