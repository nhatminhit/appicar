package lb;

import java.util.Arrays;
import java.util.Map;
import qa.d;
import qa.e;
import qa.h;
import qa.m;
import qa.q;
import qa.r;
import qa.s;
import qa.t;
import qa.u;
import ya.a;

public abstract class y extends r {

    /* renamed from: d  reason: collision with root package name */
    public static final float f20503d = 0.48f;

    /* renamed from: e  reason: collision with root package name */
    public static final float f20504e = 0.7f;

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f20505f = {1, 1, 1};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f20506g = {1, 1, 1, 1, 1};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f20507h = {1, 1, 1, 1, 1, 1};

    /* renamed from: i  reason: collision with root package name */
    public static final int[][] f20508i;

    /* renamed from: j  reason: collision with root package name */
    public static final int[][] f20509j;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f20510a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public final x f20511b = new x();

    /* renamed from: c  reason: collision with root package name */
    public final m f20512c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f20508i = iArr;
        int[][] iArr2 = new int[20][];
        f20509j = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f20508i[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f20509j[i10] = iArr4;
        }
    }

    public static boolean i(CharSequence charSequence) throws h {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return r(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    public static int j(a aVar, int[] iArr, int i10, int[][] iArr2) throws m {
        r.f(aVar, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float e10 = r.e(iArr, iArr2[i12], 0.7f);
            if (e10 < f10) {
                i11 = i12;
                f10 = e10;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw m.a();
    }

    public static int[] n(a aVar, int i10, boolean z10, int[] iArr) throws m {
        return o(aVar, i10, z10, iArr, new int[iArr.length]);
    }

    public static int[] o(a aVar, int i10, boolean z10, int[] iArr, int[] iArr2) throws m {
        int s10 = aVar.s();
        int r10 = z10 ? aVar.r(i10) : aVar.q(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = r10;
        while (r10 < s10) {
            if (aVar.n(r10) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else if (r.e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i12, r10};
                } else {
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            r10++;
        }
        throw m.a();
    }

    public static int[] p(a aVar) throws m {
        int[] iArr = new int[f20505f.length];
        int[] iArr2 = null;
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int[] iArr3 = f20505f;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = o(aVar, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                z10 = aVar.u(i13, i11, false);
            }
            i10 = i12;
        }
        return iArr2;
    }

    public static int r(CharSequence charSequence) throws h {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw h.a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw h.a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }

    public r c(int i10, a aVar, Map<e, ?> map) throws m, d, h {
        return m(i10, aVar, p(aVar), map);
    }

    public boolean h(String str) throws h {
        return i(str);
    }

    public int[] k(a aVar, int i10) throws m {
        return n(aVar, i10, false, f20505f);
    }

    public abstract int l(a aVar, int[] iArr, StringBuilder sb2) throws m;

    public r m(int i10, a aVar, int[] iArr, Map<e, ?> map) throws m, d, h {
        int i11;
        String c10;
        int[] iArr2 = null;
        u uVar = map == null ? null : (u) map.get(e.NEED_RESULT_POINT_CALLBACK);
        boolean z10 = true;
        if (uVar != null) {
            uVar.a(new t(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i10));
        }
        StringBuilder sb2 = this.f20510a;
        sb2.setLength(0);
        int l10 = l(aVar, iArr, sb2);
        if (uVar != null) {
            uVar.a(new t((float) l10, (float) i10));
        }
        int[] k10 = k(aVar, l10);
        if (uVar != null) {
            uVar.a(new t(((float) (k10[0] + k10[1])) / 2.0f, (float) i10));
        }
        int i12 = k10[1];
        int i13 = (i12 - k10[0]) + i12;
        if (i13 >= aVar.s() || !aVar.u(i12, i13, false)) {
            throw m.a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw h.a();
        } else if (h(sb3)) {
            qa.a q10 = q();
            float f10 = (float) i10;
            r rVar = new r(sb3, (byte[]) null, new t[]{new t(((float) (iArr[1] + iArr[0])) / 2.0f, f10), new t(((float) (k10[1] + k10[0])) / 2.0f, f10)}, q10);
            try {
                r a10 = this.f20511b.a(i10, aVar, k10[1]);
                rVar.j(s.UPC_EAN_EXTENSION, a10.g());
                rVar.i(a10.e());
                rVar.a(a10.f());
                i11 = a10.g().length();
            } catch (q unused) {
                i11 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        z10 = false;
                        break;
                    } else if (i11 == iArr2[i14]) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (!z10) {
                    throw m.a();
                }
            }
            if ((q10 == qa.a.EAN_13 || q10 == qa.a.UPC_A) && (c10 = this.f20512c.c(sb3)) != null) {
                rVar.j(s.POSSIBLE_COUNTRY, c10);
            }
            return rVar;
        } else {
            throw d.a();
        }
    }

    public abstract qa.a q();
}
