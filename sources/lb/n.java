package lb;

import java.util.Map;
import qa.e;
import qa.h;
import qa.m;
import qa.r;
import qa.t;
import ya.a;

public final class n extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final float f20473b = 0.38f;

    /* renamed from: c  reason: collision with root package name */
    public static final float f20474c = 0.5f;

    /* renamed from: d  reason: collision with root package name */
    public static final int f20475d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f20476e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f20477f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f20478g = {6, 8, 10, 12, 14};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f20479h = {1, 1, 1, 1};

    /* renamed from: i  reason: collision with root package name */
    public static final int[][] f20480i = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: j  reason: collision with root package name */
    public static final int[][] f20481j = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a  reason: collision with root package name */
    public int f20482a = -1;

    public static int h(int[] iArr) throws m {
        int length = f20481j.length;
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float e10 = r.e(iArr, f20481j[i11], 0.5f);
            if (e10 < f10) {
                i10 = i11;
                f10 = e10;
            } else if (e10 == f10) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw m.a();
    }

    public static void j(a aVar, int i10, int i11, StringBuilder sb2) throws m {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            r.f(aVar, i10, iArr);
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                iArr2[i12] = iArr[i13];
                iArr3[i12] = iArr[i13 + 1];
            }
            sb2.append((char) (h(iArr2) + 48));
            sb2.append((char) (h(iArr3) + 48));
            for (int i14 = 0; i14 < 10; i14++) {
                i10 += iArr[i14];
            }
        }
    }

    public static int[] l(a aVar, int i10, int[] iArr) throws m {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int s10 = aVar.s();
        int i11 = i10;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < s10) {
            if (aVar.n(i10) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else if (r.e(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i11, i10};
                } else {
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw m.a();
    }

    public static int m(a aVar) throws m {
        int s10 = aVar.s();
        int q10 = aVar.q(0);
        if (q10 != s10) {
            return q10;
        }
        throw m.a();
    }

    public r c(int i10, a aVar, Map<e, ?> map) throws h, m {
        boolean z10;
        int[] k10 = k(aVar);
        int[] i11 = i(aVar);
        StringBuilder sb2 = new StringBuilder(20);
        j(aVar, k10[1], i11[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f20478g;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= length2) {
                z10 = false;
                break;
            }
            int i14 = iArr[i12];
            if (length == i14) {
                z10 = true;
                break;
            }
            if (i14 > i13) {
                i13 = i14;
            }
            i12++;
        }
        if (!z10 && length > i13) {
            z10 = true;
        }
        if (z10) {
            float f10 = (float) i10;
            return new r(sb3, (byte[]) null, new t[]{new t((float) k10[1], f10), new t((float) i11[0], f10)}, qa.a.ITF);
        }
        throw h.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = l(r7, r0, f20480i[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] i(ya.a r7) throws qa.m {
        /*
            r6 = this;
            r7.w()
            int r0 = m(r7)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            int[][] r3 = f20480i     // Catch:{ m -> 0x0012 }
            r3 = r3[r2]     // Catch:{ m -> 0x0012 }
            int[] r0 = l(r7, r0, r3)     // Catch:{ m -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            int[][] r3 = f20480i     // Catch:{ all -> 0x0035 }
            r3 = r3[r1]     // Catch:{ all -> 0x0035 }
            int[] r0 = l(r7, r0, r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            r6.n(r7, r3)     // Catch:{ all -> 0x0035 }
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            int r4 = r7.s()     // Catch:{ all -> 0x0035 }
            r5 = r0[r1]     // Catch:{ all -> 0x0035 }
            int r4 = r4 - r5
            r0[r2] = r4     // Catch:{ all -> 0x0035 }
            int r2 = r7.s()     // Catch:{ all -> 0x0035 }
            int r2 = r2 - r3
            r0[r1] = r2     // Catch:{ all -> 0x0035 }
            r7.w()
            return r0
        L_0x0035:
            r0 = move-exception
            r7.w()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.n.i(ya.a):int[]");
    }

    public final int[] k(a aVar) throws m {
        int[] l10 = l(aVar, m(aVar), f20479h);
        int i10 = l10[1];
        int i11 = l10[0];
        this.f20482a = (i10 - i11) / 4;
        n(aVar, i11);
        return l10;
    }

    public final void n(a aVar, int i10) throws m {
        int min = Math.min(this.f20482a * 10, i10);
        int i11 = i10 - 1;
        while (min > 0 && i11 >= 0 && !aVar.n(i11)) {
            min--;
            i11--;
        }
        if (min != 0) {
            throw m.a();
        }
    }
}
