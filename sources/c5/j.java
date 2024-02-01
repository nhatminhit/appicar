package c5;

import bc.p;
import w1.a;
import y4.c;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static int f4861a = 1000000;

    /* renamed from: b  reason: collision with root package name */
    public static int f4862b = 1000000000;

    /* renamed from: c  reason: collision with root package name */
    public static long f4863c = 1000000000;

    /* renamed from: d  reason: collision with root package name */
    public static long f4864d = -2147483648L;

    /* renamed from: e  reason: collision with root package name */
    public static long f4865e = 2147483647L;

    /* renamed from: f  reason: collision with root package name */
    public static final String f4866f = String.valueOf(Integer.MIN_VALUE);

    /* renamed from: g  reason: collision with root package name */
    public static final String f4867g = String.valueOf(Long.MIN_VALUE);

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f4868h = new int[1000];

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f4869i = {"0", "1", "2", a.T4, "4", p.f16204w, "6", "7", "8", "9", "10"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f4870j = {"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int i13 = 0;
                while (i13 < 10) {
                    f4868h[i10] = ((i11 + 48) << 16) | ((i12 + 48) << 8) | (i13 + 48);
                    i13++;
                    i10++;
                }
            }
        }
    }

    public static int a(int i10, byte[] bArr, int i11) {
        int i12 = f4868h[i10];
        int i13 = i11 + 1;
        bArr[i11] = (byte) (i12 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i12 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) i12;
        return i15;
    }

    public static int b(int i10, char[] cArr, int i11) {
        int i12 = f4868h[i10];
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 >> 16);
        int i14 = i13 + 1;
        cArr[i13] = (char) ((i12 >> 8) & 127);
        int i15 = i14 + 1;
        cArr[i14] = (char) (i12 & 127);
        return i15;
    }

    public static int c(int i10, byte[] bArr, int i11) {
        int i12 = f4868h[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                bArr[i11] = (byte) (i12 >> 16);
                i11++;
            }
            bArr[i11] = (byte) (i12 >> 8);
            i11++;
        }
        int i13 = i11 + 1;
        bArr[i11] = (byte) i12;
        return i13;
    }

    public static int d(int i10, char[] cArr, int i11) {
        int i12 = f4868h[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i11] = (char) (i12 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i12 >> 8) & 127);
            i11++;
        }
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 & 127);
        return i13;
    }

    public static int e(int i10, byte[] bArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int i15 = i12 - (i14 * 1000);
        int[] iArr = f4868h;
        int i16 = iArr[i14];
        int i17 = i11 + 1;
        bArr[i11] = (byte) (i16 >> 16);
        int i18 = i17 + 1;
        bArr[i17] = (byte) (i16 >> 8);
        int i19 = i18 + 1;
        bArr[i18] = (byte) i16;
        int i20 = iArr[i15];
        int i21 = i19 + 1;
        bArr[i19] = (byte) (i20 >> 16);
        int i22 = i21 + 1;
        bArr[i21] = (byte) (i20 >> 8);
        int i23 = i22 + 1;
        bArr[i22] = (byte) i20;
        int i24 = iArr[i13];
        int i25 = i23 + 1;
        bArr[i23] = (byte) (i24 >> 16);
        int i26 = i25 + 1;
        bArr[i25] = (byte) (i24 >> 8);
        int i27 = i26 + 1;
        bArr[i26] = (byte) i24;
        return i27;
    }

    public static int f(int i10, char[] cArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int[] iArr = f4868h;
        int i15 = iArr[i14];
        int i16 = i11 + 1;
        cArr[i11] = (char) (i15 >> 16);
        int i17 = i16 + 1;
        cArr[i16] = (char) ((i15 >> 8) & 127);
        int i18 = i17 + 1;
        cArr[i17] = (char) (i15 & 127);
        int i19 = iArr[i12 - (i14 * 1000)];
        int i20 = i18 + 1;
        cArr[i18] = (char) (i19 >> 16);
        int i21 = i20 + 1;
        cArr[i20] = (char) ((i19 >> 8) & 127);
        int i22 = i21 + 1;
        cArr[i21] = (char) (i19 & 127);
        int i23 = iArr[i13];
        int i24 = i22 + 1;
        cArr[i22] = (char) (i23 >> 16);
        int i25 = i24 + 1;
        cArr[i24] = (char) ((i23 >> 8) & 127);
        int i26 = i25 + 1;
        cArr[i25] = (char) (i23 & 127);
        return i26;
    }

    public static int g(byte[] bArr, int i10) {
        int length = f4866f.length();
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = (byte) f4866f.charAt(i11);
            i11++;
            i10++;
        }
        return i10;
    }

    public static int h(char[] cArr, int i10) {
        String str = f4866f;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    public static int i(byte[] bArr, int i10) {
        int length = f4867g.length();
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = (byte) f4867g.charAt(i11);
            i11++;
            i10++;
        }
        return i10;
    }

    public static int j(char[] cArr, int i10) {
        String str = f4867g;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    public static int k(int i10, byte[] bArr, int i11) {
        if (i10 >= f4861a) {
            int i12 = i10 / 1000;
            int i13 = i10 - (i12 * 1000);
            int i14 = i12 / 1000;
            int c10 = c(i14, bArr, i11);
            int[] iArr = f4868h;
            int i15 = iArr[i12 - (i14 * 1000)];
            int i16 = c10 + 1;
            bArr[c10] = (byte) (i15 >> 16);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (i15 >> 8);
            int i18 = i17 + 1;
            bArr[i17] = (byte) i15;
            int i19 = iArr[i13];
            int i20 = i18 + 1;
            bArr[i18] = (byte) (i19 >> 16);
            int i21 = i20 + 1;
            bArr[i20] = (byte) (i19 >> 8);
            int i22 = i21 + 1;
            bArr[i21] = (byte) i19;
            return i22;
        } else if (i10 < 1000) {
            return c(i10, bArr, i11);
        } else {
            int i23 = i10 / 1000;
            return m(bArr, i11, i23, i10 - (i23 * 1000));
        }
    }

    public static int l(int i10, char[] cArr, int i11) {
        if (i10 >= f4861a) {
            int i12 = i10 / 1000;
            int i13 = i10 - (i12 * 1000);
            int i14 = i12 / 1000;
            int d10 = d(i14, cArr, i11);
            int[] iArr = f4868h;
            int i15 = iArr[i12 - (i14 * 1000)];
            int i16 = d10 + 1;
            cArr[d10] = (char) (i15 >> 16);
            int i17 = i16 + 1;
            cArr[i16] = (char) ((i15 >> 8) & 127);
            int i18 = i17 + 1;
            cArr[i17] = (char) (i15 & 127);
            int i19 = iArr[i13];
            int i20 = i18 + 1;
            cArr[i18] = (char) (i19 >> 16);
            int i21 = i20 + 1;
            cArr[i20] = (char) ((i19 >> 8) & 127);
            int i22 = i21 + 1;
            cArr[i21] = (char) (i19 & 127);
            return i22;
        } else if (i10 < 1000) {
            return d(i10, cArr, i11);
        } else {
            int i23 = i10 / 1000;
            return n(cArr, i11, i23, i10 - (i23 * 1000));
        }
    }

    public static int m(byte[] bArr, int i10, int i11, int i12) {
        int[] iArr = f4868h;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                bArr[i10] = (byte) (i13 >> 16);
                i10++;
            }
            bArr[i10] = (byte) (i13 >> 8);
            i10++;
        }
        int i14 = i10 + 1;
        bArr[i10] = (byte) i13;
        int i15 = iArr[i12];
        int i16 = i14 + 1;
        bArr[i14] = (byte) (i15 >> 16);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (i15 >> 8);
        int i18 = i17 + 1;
        bArr[i17] = (byte) i15;
        return i18;
    }

    public static int n(char[] cArr, int i10, int i11, int i12) {
        int[] iArr = f4868h;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                cArr[i10] = (char) (i13 >> 16);
                i10++;
            }
            cArr[i10] = (char) ((i13 >> 8) & 127);
            i10++;
        }
        int i14 = i10 + 1;
        cArr[i10] = (char) (i13 & 127);
        int i15 = iArr[i12];
        int i16 = i14 + 1;
        cArr[i14] = (char) (i15 >> 16);
        int i17 = i16 + 1;
        cArr[i16] = (char) ((i15 >> 8) & 127);
        int i18 = i17 + 1;
        cArr[i17] = (char) (i15 & 127);
        return i18;
    }

    public static boolean o(double d10) {
        return Double.isNaN(d10) || Double.isInfinite(d10);
    }

    public static boolean p(float f10) {
        return Float.isNaN(f10) || Float.isInfinite(f10);
    }

    public static int q(int i10, byte[] bArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return g(bArr, i11);
            }
            bArr[i11] = i7.a.f9186b0;
            i10 = -i10;
            i11++;
        }
        if (i10 >= f4861a) {
            int i13 = f4862b;
            if (i10 >= i13) {
                int i14 = i10 - i13;
                if (i14 >= i13) {
                    i14 -= i13;
                    i12 = i11 + 1;
                    bArr[i11] = 50;
                } else {
                    i12 = i11 + 1;
                    bArr[i11] = 49;
                }
                return e(i14, bArr, i12);
            }
            int i15 = i10 / 1000;
            int i16 = i15 / 1000;
            return a(i10 - (i15 * 1000), bArr, a(i15 - (i16 * 1000), bArr, c(i16, bArr, i11)));
        } else if (i10 >= 1000) {
            int i17 = i10 / 1000;
            return a(i10 - (i17 * 1000), bArr, c(i17, bArr, i11));
        } else if (i10 >= 10) {
            return c(i10, bArr, i11);
        } else {
            int i18 = i11 + 1;
            bArr[i11] = (byte) (i10 + 48);
            return i18;
        }
    }

    public static int r(int i10, char[] cArr, int i11) {
        int i12;
        int b10;
        int i13;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return h(cArr, i11);
            }
            cArr[i11] = '-';
            i10 = -i10;
            i11++;
        }
        if (i10 >= f4861a) {
            int i14 = f4862b;
            if (i10 >= i14) {
                int i15 = i10 - i14;
                if (i15 >= i14) {
                    i15 -= i14;
                    i13 = i11 + 1;
                    cArr[i11] = '2';
                } else {
                    i13 = i11 + 1;
                    cArr[i11] = '1';
                }
                return f(i15, cArr, i13);
            }
            int i16 = i10 / 1000;
            i12 = i10 - (i16 * 1000);
            int i17 = i16 / 1000;
            b10 = b(i16 - (i17 * 1000), cArr, d(i17, cArr, i11));
        } else if (i10 >= 1000) {
            int i18 = i10 / 1000;
            i12 = i10 - (i18 * 1000);
            b10 = d(i18, cArr, i11);
        } else if (i10 >= 10) {
            return d(i10, cArr, i11);
        } else {
            cArr[i11] = (char) (i10 + 48);
            return i11 + 1;
        }
        return b(i12, cArr, b10);
    }

    public static int s(long j10, byte[] bArr, int i10) {
        int i11;
        if (j10 < 0) {
            if (j10 > f4864d) {
                return q((int) j10, bArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return i(bArr, i10);
            }
            bArr[i10] = i7.a.f9186b0;
            j10 = -j10;
            i10++;
        } else if (j10 <= f4865e) {
            return q((int) j10, bArr, i10);
        }
        long j11 = f4863c;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            i11 = k((int) j12, bArr, i10);
        } else {
            long j14 = j12 / j11;
            int c10 = c((int) j14, bArr, i10);
            i11 = e((int) (j12 - (j11 * j14)), bArr, c10);
        }
        return e((int) j13, bArr, i11);
    }

    public static int t(long j10, char[] cArr, int i10) {
        int i11;
        if (j10 < 0) {
            if (j10 > f4864d) {
                return r((int) j10, cArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return j(cArr, i10);
            }
            cArr[i10] = '-';
            j10 = -j10;
            i10++;
        } else if (j10 <= f4865e) {
            return r((int) j10, cArr, i10);
        }
        long j11 = f4863c;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            i11 = l((int) j12, cArr, i10);
        } else {
            long j14 = j12 / j11;
            int d10 = d((int) j14, cArr, i10);
            i11 = f((int) (j12 - (j11 * j14)), cArr, d10);
        }
        return f((int) j13, cArr, i11);
    }

    public static String u(double d10) {
        return Double.toString(d10);
    }

    public static String v(float f10) {
        return Float.toString(f10);
    }

    public static String w(int i10) {
        String[] strArr = f4869i;
        if (i10 < strArr.length) {
            if (i10 >= 0) {
                return strArr[i10];
            }
            int i11 = (-i10) - 1;
            String[] strArr2 = f4870j;
            if (i11 < strArr2.length) {
                return strArr2[i11];
            }
        }
        return Integer.toString(i10);
    }

    public static String x(long j10) {
        return (j10 > c.M0 || j10 < c.L0) ? Long.toString(j10) : w((int) j10);
    }
}
