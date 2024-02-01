package lb;

import dg.a;
import hb.b;
import java.util.Arrays;
import java.util.Map;
import p7.f;
import qa.d;
import qa.h;
import qa.m;
import qa.r;
import qa.t;

public final class e extends r {

    /* renamed from: e  reason: collision with root package name */
    public static final String f20453e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f20454f = {52, a.vk, 97, a.nq, 49, a.pm, 112, 37, a.Pk, 100, a.f18122ni, 73, a.Jo, 25, a.Fj, 88, 13, a.Li, 76, 28, a.f17850ai, 67, a.fo, 19, 274, 82, 7, a.f17955fi, 70, 22, a.It, 193, a.RI, 145, 400, a.f17889cf, 133, a.Mt, a.Le, a.Cd, a.f18075ld, 138, 42};

    /* renamed from: g  reason: collision with root package name */
    public static final int f20455g = 148;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20456a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20457b;

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f20458c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f20459d;

    public e() {
        this(false);
    }

    public e(boolean z10) {
        this(z10, false);
    }

    public e(boolean z10, boolean z11) {
        this.f20456a = z10;
        this.f20457b = z11;
        this.f20458c = new StringBuilder(20);
        this.f20459d = new int[9];
    }

    public static String h(CharSequence charSequence) throws h {
        int i10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i11++;
                char charAt2 = charSequence.charAt(i11);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i10 = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    charAt = ':';
                                } else {
                                    throw h.a();
                                }
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw h.a();
                        } else {
                            i10 = charAt2 + f.f11698i;
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i10 = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i10 = charAt2 + b.f19520f;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i10 = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i10 = charAt2 + '+';
                    } else if (charAt2 != 'U') {
                        if (charAt2 == 'V') {
                            charAt = '@';
                        } else if (charAt2 == 'W') {
                            charAt = '`';
                        } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                            charAt = 127;
                        } else {
                            throw h.a();
                        }
                    }
                    charAt = 0;
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw h.a();
                } else {
                    i10 = charAt2 - '@';
                }
                charAt = (char) i10;
            }
            sb2.append(charAt);
            i11++;
        }
        return sb2.toString();
    }

    public static int[] i(ya.a aVar, int[] iArr) throws m {
        int s10 = aVar.s();
        int q10 = aVar.q(0);
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = q10;
        while (q10 < s10) {
            if (aVar.n(q10) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else if (k(iArr) != 148 || !aVar.u(Math.max(0, i11 - ((q10 - i11) / 2)), i11, false)) {
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i10] = 0;
                    i10--;
                } else {
                    return new int[]{i11, q10};
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            q10++;
        }
        throw m.a();
    }

    public static char j(int i10) throws m {
        int i11 = 0;
        while (true) {
            int[] iArr = f20454f;
            if (i11 < iArr.length) {
                if (iArr[i11] == i10) {
                    return f20453e.charAt(i11);
                }
                i11++;
            } else if (i10 == 148) {
                return '*';
            } else {
                throw m.a();
            }
        }
    }

    public static int k(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if ((i19 << 1) >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            } else if (i13 <= 3) {
                return -1;
            } else {
                i10 = i11;
            }
        }
    }

    public r c(int i10, ya.a aVar, Map<qa.e, ?> map) throws m, d, h {
        int[] iArr = this.f20459d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f20458c;
        sb2.setLength(0);
        int[] i11 = i(aVar, iArr);
        int q10 = aVar.q(i11[1]);
        int s10 = aVar.s();
        while (true) {
            r.f(aVar, q10, iArr);
            int k10 = k(iArr);
            if (k10 >= 0) {
                char j10 = j(k10);
                sb2.append(j10);
                int i12 = q10;
                for (int i13 : iArr) {
                    i12 += i13;
                }
                int q11 = aVar.q(i12);
                if (j10 == '*') {
                    sb2.setLength(sb2.length() - 1);
                    int i14 = 0;
                    for (int i15 : iArr) {
                        i14 += i15;
                    }
                    int i16 = (q11 - q10) - i14;
                    if (q11 == s10 || (i16 << 1) >= i14) {
                        if (this.f20456a) {
                            int length = sb2.length() - 1;
                            int i17 = 0;
                            for (int i18 = 0; i18 < length; i18++) {
                                i17 += f20453e.indexOf(this.f20458c.charAt(i18));
                            }
                            if (sb2.charAt(length) == f20453e.charAt(i17 % 43)) {
                                sb2.setLength(length);
                            } else {
                                throw d.a();
                            }
                        }
                        if (sb2.length() != 0) {
                            float f10 = (float) i10;
                            return new r(this.f20457b ? h(sb2) : sb2.toString(), (byte[]) null, new t[]{new t(((float) (i11[1] + i11[0])) / 2.0f, f10), new t(((float) q10) + (((float) i14) / 2.0f), f10)}, qa.a.CODE_39);
                        }
                        throw m.a();
                    }
                    throw m.a();
                }
                q10 = q11;
            } else {
                throw m.a();
            }
        }
    }
}
