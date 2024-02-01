package lb;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import dg.a;
import java.util.Arrays;
import java.util.Map;
import qa.d;
import qa.e;
import qa.h;
import qa.m;
import qa.r;
import qa.t;

public final class g extends r {

    /* renamed from: c  reason: collision with root package name */
    public static final String f20460c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f20461d = f20460c.toCharArray();

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f20462e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f20463f;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f20464a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public final int[] f20465b = new int[6];

    static {
        int[] iArr = {a.Bj, a.Jo, a.no, a.fo, a.vl, a.Pk, a.Dk, a.np, 274, a.Ei, a.sz, a.cz, a.Gy, 404, 402, a.Zt, a.rr, a.ir, a.Eq, 308, a.fk, a.Mp, a.To, a.Bo, 300, a.Dj, a.uA, 434, a.Uz, a.jz, a.Nx, a.Yx, a.Er, a.kr, a.ym, a.Km, a.lm, 468, 466, 458, a.Kr, a.xs, a.jA, a.Rk, 474, FloatingActionButton.f17068p0, a.sm, a.lq};
        f20462e = iArr;
        f20463f = iArr[47];
    }

    public static void h(CharSequence charSequence) throws d {
        int length = charSequence.length();
        i(charSequence, length - 2, 20);
        i(charSequence, length - 1, 15);
    }

    public static void i(CharSequence charSequence, int i10, int i11) throws d {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += f20460c.indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) != f20461d[i12 % 47]) {
            throw d.a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r4 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String j(java.lang.CharSequence r9) throws qa.h {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r0) goto L_0x00b0
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x00a9
            r5 = 100
            if (r4 > r5) goto L_0x00a9
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x00a4
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0097;
                case 98: goto L_0x004e;
                case 99: goto L_0x003c;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = r2
            goto L_0x00a9
        L_0x002f:
            if (r5 < r8) goto L_0x0037
            if (r5 > r7) goto L_0x0037
            int r5 = r5 + 32
            goto L_0x009d
        L_0x0037:
            qa.h r9 = qa.h.a()
            throw r9
        L_0x003c:
            if (r5 < r8) goto L_0x0043
            if (r5 > r6) goto L_0x0043
            int r5 = r5 + -32
            goto L_0x009d
        L_0x0043:
            if (r5 != r7) goto L_0x0049
            r4 = 58
            goto L_0x00a9
        L_0x0049:
            qa.h r9 = qa.h.a()
            throw r9
        L_0x004e:
            if (r5 < r8) goto L_0x0057
            r4 = 69
            if (r5 > r4) goto L_0x0057
            int r5 = r5 + -38
            goto L_0x009d
        L_0x0057:
            r4 = 70
            if (r5 < r4) goto L_0x0062
            r4 = 74
            if (r5 > r4) goto L_0x0062
            int r5 = r5 + -11
            goto L_0x009d
        L_0x0062:
            r4 = 75
            if (r5 < r4) goto L_0x006b
            if (r5 > r6) goto L_0x006b
            int r5 = r5 + 16
            goto L_0x009d
        L_0x006b:
            r4 = 80
            if (r5 < r4) goto L_0x0076
            r4 = 84
            if (r5 > r4) goto L_0x0076
            int r5 = r5 + 43
            goto L_0x009d
        L_0x0076:
            r4 = 85
            if (r5 != r4) goto L_0x007b
            goto L_0x002c
        L_0x007b:
            r4 = 86
            if (r5 != r4) goto L_0x0082
            r4 = 64
            goto L_0x00a9
        L_0x0082:
            r4 = 87
            if (r5 != r4) goto L_0x0089
            r4 = 96
            goto L_0x00a9
        L_0x0089:
            r4 = 88
            if (r5 < r4) goto L_0x0092
            if (r5 > r7) goto L_0x0092
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x00a9
        L_0x0092:
            qa.h r9 = qa.h.a()
            throw r9
        L_0x0097:
            if (r5 < r8) goto L_0x009f
            if (r5 > r7) goto L_0x009f
            int r5 = r5 + -64
        L_0x009d:
            char r4 = (char) r5
            goto L_0x00a9
        L_0x009f:
            qa.h r9 = qa.h.a()
            throw r9
        L_0x00a4:
            qa.h r9 = qa.h.a()
            throw r9
        L_0x00a9:
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x00b0:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.g.j(java.lang.CharSequence):java.lang.String");
    }

    public static char l(int i10) throws m {
        int i11 = 0;
        while (true) {
            int[] iArr = f20462e;
            if (i11 >= iArr.length) {
                throw m.a();
            } else if (iArr[i11] == i10) {
                return f20461d[i11];
            } else {
                i11++;
            }
        }
    }

    public static int m(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int round = Math.round((((float) iArr[i13]) * 9.0f) / ((float) i10));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < round; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= round;
            }
        }
        return i12;
    }

    public r c(int i10, ya.a aVar, Map<e, ?> map) throws m, d, h {
        int[] k10 = k(aVar);
        int q10 = aVar.q(k10[1]);
        int s10 = aVar.s();
        int[] iArr = this.f20465b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f20464a;
        sb2.setLength(0);
        while (true) {
            r.f(aVar, q10, iArr);
            int m10 = m(iArr);
            if (m10 >= 0) {
                char l10 = l(m10);
                sb2.append(l10);
                int i11 = q10;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                int q11 = aVar.q(i11);
                if (l10 == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i13 = 0;
                    for (int i14 : iArr) {
                        i13 += i14;
                    }
                    if (q11 == s10 || !aVar.n(q11)) {
                        throw m.a();
                    } else if (sb2.length() >= 2) {
                        h(sb2);
                        sb2.setLength(sb2.length() - 2);
                        float f10 = (float) i10;
                        return new r(j(sb2), (byte[]) null, new t[]{new t(((float) (k10[1] + k10[0])) / 2.0f, f10), new t(((float) q10) + (((float) i13) / 2.0f), f10)}, qa.a.CODE_93);
                    } else {
                        throw m.a();
                    }
                } else {
                    q10 = q11;
                }
            } else {
                throw m.a();
            }
        }
    }

    public final int[] k(ya.a aVar) throws m {
        int s10 = aVar.s();
        int q10 = aVar.q(0);
        Arrays.fill(this.f20465b, 0);
        int[] iArr = this.f20465b;
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
                } else if (m(iArr) == f20463f) {
                    return new int[]{i11, q10};
                } else {
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i10] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            q10++;
        }
        throw m.a();
    }
}
