package e1;

import d.x0;
import java.io.PrintWriter;
import p7.f;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public final class w {
    @x0({x0.a.LIBRARY_GROUP_PREFIX})

    /* renamed from: a  reason: collision with root package name */
    public static final int f6763a = 19;

    /* renamed from: b  reason: collision with root package name */
    public static final int f6764b = 60;

    /* renamed from: c  reason: collision with root package name */
    public static final int f6765c = 3600;

    /* renamed from: d  reason: collision with root package name */
    public static final int f6766d = 86400;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f6767e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static char[] f6768f = new char[24];

    public static int a(int i10, int i11, boolean z10, int i12) {
        if (i10 > 99 || (z10 && i12 >= 3)) {
            return i11 + 3;
        }
        if (i10 > 9 || (z10 && i12 >= 2)) {
            return i11 + 2;
        }
        if (z10 || i10 > 0) {
            return i11 + 1;
        }
        return 0;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static void b(long j10, long j11, PrintWriter printWriter) {
        if (j10 == 0) {
            printWriter.print("--");
        } else {
            d(j10 - j11, printWriter, 0);
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static void c(long j10, PrintWriter printWriter) {
        d(j10, printWriter, 0);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static void d(long j10, PrintWriter printWriter, int i10) {
        synchronized (f6767e) {
            printWriter.print(new String(f6768f, 0, f(j10, i10)));
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static void e(long j10, StringBuilder sb2) {
        synchronized (f6767e) {
            sb2.append(f6768f, 0, f(j10, 0));
        }
    }

    public static int f(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = j10;
        int i16 = i10;
        if (f6768f.length < i16) {
            f6768f = new char[i16];
        }
        char[] cArr = f6768f;
        int i17 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
        if (i17 == 0) {
            int i18 = i16 - 1;
            while (i18 > 0) {
                cArr[0] = f.f11698i;
            }
            cArr[0] = '0';
            return 1;
        }
        if (i17 > 0) {
            c10 = '+';
        } else {
            c10 = '-';
            j11 = -j11;
        }
        int i19 = (int) (j11 % 1000);
        int floor = (int) Math.floor((double) (j11 / 1000));
        if (floor > 86400) {
            i11 = floor / f6766d;
            floor -= f6766d * i11;
        } else {
            i11 = 0;
        }
        if (floor > 3600) {
            i12 = floor / f6765c;
            floor -= i12 * f6765c;
        } else {
            i12 = 0;
        }
        if (floor > 60) {
            int i20 = floor / 60;
            i13 = floor - (i20 * 60);
            i14 = i20;
        } else {
            i13 = floor;
            i14 = 0;
        }
        if (i16 != 0) {
            int a10 = a(i11, 1, false, 0);
            int a11 = a10 + a(i12, 1, a10 > 0, 2);
            int a12 = a11 + a(i14, 1, a11 > 0, 2);
            int a13 = a12 + a(i13, 1, a12 > 0, 2);
            i15 = 0;
            for (int a14 = a13 + a(i19, 2, true, a13 > 0 ? 3 : 0) + 1; a14 < i16; a14++) {
                cArr[i15] = f.f11698i;
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c10;
        int i21 = i15 + 1;
        boolean z10 = i16 != 0;
        int i22 = i21;
        int g10 = g(cArr, i11, 'd', i21, false, 0);
        int g11 = g(cArr, i12, 'h', g10, g10 != i22, z10 ? 2 : 0);
        int g12 = g(cArr, i14, 'm', g11, g11 != i22, z10 ? 2 : 0);
        int g13 = g(cArr, i13, 's', g12, g12 != i22, z10 ? 2 : 0);
        int g14 = g(cArr, i19, 'm', g13, true, (!z10 || g13 == i22) ? 0 : 3);
        cArr[g14] = 's';
        return g14 + 1;
    }

    public static int g(char[] cArr, int i10, char c10, int i11, boolean z10, int i12) {
        int i13;
        if (!z10 && i10 <= 0) {
            return i11;
        }
        if ((!z10 || i12 < 3) && i10 <= 99) {
            i13 = i11;
        } else {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        }
        if ((z10 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        int i16 = i13 + 1;
        cArr[i16] = c10;
        return i16 + 1;
    }
}
