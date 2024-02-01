package sb;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import qa.c;
import qa.e;
import qa.m;
import qa.t;
import ya.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f22876a = {0, 4, 1, 5};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f22877b = {6, 2, 7, 3};

    /* renamed from: c  reason: collision with root package name */
    public static final float f22878c = 0.42f;

    /* renamed from: d  reason: collision with root package name */
    public static final float f22879d = 0.8f;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f22880e = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f22881f = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: g  reason: collision with root package name */
    public static final int f22882g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final int f22883h = 5;

    /* renamed from: i  reason: collision with root package name */
    public static final int f22884i = 25;

    /* renamed from: j  reason: collision with root package name */
    public static final int f22885j = 5;

    /* renamed from: k  reason: collision with root package name */
    public static final int f22886k = 10;

    public static void a(t[] tVarArr, t[] tVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            tVarArr[iArr[i10]] = tVarArr2[i10];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (qa.t[]) r4.next();
        r7 = r5[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r7.d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r5 = r5[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r5 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = java.lang.Math.max(r3, (int) r5.d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<qa.t[]> b(boolean r8, ya.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0009:
            r5 = r4
        L_0x000a:
            int r6 = r9.n()
            if (r3 >= r6) goto L_0x0073
            qa.t[] r4 = f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x004f
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x004f
            if (r5 == 0) goto L_0x0073
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004b
            java.lang.Object r5 = r4.next()
            qa.t[] r5 = (qa.t[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x003d
            float r3 = (float) r3
            float r7 = r7.d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x003d:
            r5 = r5[r6]
            if (r5 == 0) goto L_0x0023
            float r5 = r5.d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0023
        L_0x004b:
            int r3 = r3 + 5
            r4 = r2
            goto L_0x0009
        L_0x004f:
            r0.add(r4)
            if (r8 == 0) goto L_0x0073
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x0061
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L_0x006b
        L_0x0061:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.c()
            int r5 = (int) r5
            r3 = r4[r3]
        L_0x006b:
            float r3 = r3.d()
            int r3 = (int) r3
            r4 = r5
            r5 = r1
            goto L_0x000a
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.a.b(boolean, ya.b):java.util.List");
    }

    public static b c(c cVar, Map<e, ?> map, boolean z10) throws m {
        b b10 = cVar.b();
        List<t[]> b11 = b(z10, b10);
        if (b11.isEmpty()) {
            b10 = b10.clone();
            b10.v();
            b11 = b(z10, b10);
        }
        return new b(b10, b11);
    }

    public static int[] d(b bVar, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.j(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (bVar.j(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else if (g(iArr2, iArr) < 0.42f) {
                    return new int[]{i15, i10};
                } else {
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    public static t[] e(b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        int i16 = i10;
        t[] tVarArr = new t[4];
        int[] iArr2 = new int[iArr.length];
        int i17 = i12;
        while (true) {
            if (i17 >= i16) {
                z10 = false;
                break;
            }
            int[] d10 = d(bVar, i13, i17, i11, iArr, iArr2);
            if (d10 != null) {
                int i18 = i17;
                int[] iArr3 = d10;
                int i19 = i18;
                while (true) {
                    if (i19 <= 0) {
                        i15 = i19;
                        break;
                    }
                    int i20 = i19 - 1;
                    int[] d11 = d(bVar, i13, i20, i11, iArr, iArr2);
                    if (d11 == null) {
                        i15 = i20 + 1;
                        break;
                    }
                    iArr3 = d11;
                    i19 = i20;
                }
                float f10 = (float) i15;
                tVarArr[0] = new t((float) iArr3[0], f10);
                tVarArr[1] = new t((float) iArr3[1], f10);
                z10 = true;
                i17 = i15;
            } else {
                i17 += 5;
            }
        }
        int i21 = i17 + 1;
        if (z10) {
            int[] iArr4 = {(int) tVarArr[0].c(), (int) tVarArr[1].c()};
            int i22 = i21;
            int i23 = 0;
            while (true) {
                if (i22 >= i16) {
                    i14 = i23;
                    break;
                }
                i14 = i23;
                int[] d12 = d(bVar, iArr4[0], i22, i11, iArr, iArr2);
                if (d12 == null || Math.abs(iArr4[0] - d12[0]) >= 5 || Math.abs(iArr4[1] - d12[1]) >= 5) {
                    if (i14 > 25) {
                        break;
                    }
                    i23 = i14 + 1;
                } else {
                    iArr4 = d12;
                    i23 = 0;
                }
                i22++;
            }
            i21 = i22 - (i14 + 1);
            float f11 = (float) i21;
            tVarArr[2] = new t((float) iArr4[0], f11);
            tVarArr[3] = new t((float) iArr4[1], f11);
        }
        if (i21 - i17 < 10) {
            Arrays.fill(tVarArr, (Object) null);
        }
        return tVarArr;
    }

    public static t[] f(b bVar, int i10, int i11) {
        int n10 = bVar.n();
        int s10 = bVar.s();
        t[] tVarArr = new t[8];
        a(tVarArr, e(bVar, n10, s10, i10, i11, f22880e), f22876a);
        t tVar = tVarArr[4];
        if (tVar != null) {
            i11 = (int) tVar.c();
            i10 = (int) tVarArr[4].d();
        }
        a(tVarArr, e(bVar, n10, s10, i10, i11, f22881f), f22877b);
        return tVarArr;
    }

    public static float g(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = (float) i10;
        float f11 = f10 / ((float) i11);
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f14 = ((float) iArr2[i13]) * f11;
            float f15 = (float) i14;
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }
}
