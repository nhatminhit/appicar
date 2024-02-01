package wb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import qa.e;
import qa.m;
import qa.t;
import qa.u;

public class f {

    /* renamed from: f  reason: collision with root package name */
    public static final int f24014f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final b f24015g = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final int f24016h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f24017i = 97;

    /* renamed from: a  reason: collision with root package name */
    public final ya.b f24018a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f24019b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f24020c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f24021d;

    /* renamed from: e  reason: collision with root package name */
    public final u f24022e;

    public static final class b implements Serializable, Comparator<d> {
        public b() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return Float.compare(dVar.i(), dVar2.i());
        }
    }

    public f(ya.b bVar) {
        this(bVar, (u) null);
    }

    public f(ya.b bVar, u uVar) {
        this.f24018a = bVar;
        this.f24019b = new ArrayList();
        this.f24021d = new int[5];
        this.f24022e = uVar;
    }

    public static float a(int[] iArr, int i10) {
        return ((float) ((i10 - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    public static void f(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    public static void g(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public static boolean j(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = ((float) i10) / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    public static boolean k(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = ((float) i10) / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    public static double t(d dVar, d dVar2) {
        double c10 = (double) (dVar.c() - dVar2.c());
        double d10 = (double) (dVar.d() - dVar2.d());
        return (c10 * c10) + (d10 * d10);
    }

    @Deprecated
    public final void b(int[] iArr) {
        f(iArr);
    }

    public final boolean c(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] l10 = l();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f24018a.j(i11 - i15, i10 - i15)) {
            l10[2] = l10[2] + 1;
            i15++;
        }
        if (l10[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f24018a.j(i11 - i15, i10 - i15)) {
            l10[1] = l10[1] + 1;
            i15++;
        }
        if (l10[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f24018a.j(i11 - i15, i10 - i15)) {
            l10[0] = l10[0] + 1;
            i15++;
        }
        if (l10[0] == 0) {
            return false;
        }
        int n10 = this.f24018a.n();
        int s10 = this.f24018a.s();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 < n10 && (i14 = i11 + i16) < s10 && this.f24018a.j(i14, i17)) {
                l10[2] = l10[2] + 1;
                i16++;
            }
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 < n10 && (i13 = i11 + i16) < s10 && !this.f24018a.j(i13, i18)) {
                l10[3] = l10[3] + 1;
                i16++;
            }
        }
        if (l10[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 < n10 && (i12 = i11 + i16) < s10 && this.f24018a.j(i12, i19)) {
                l10[4] = l10[4] + 1;
                i16++;
            }
        }
        if (l10[4] == 0) {
            return false;
        }
        return k(l10);
    }

    public final float d(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ya.b bVar = this.f24018a;
        int s10 = bVar.s();
        int[] l10 = l();
        int i17 = i10;
        while (i17 >= 0 && bVar.j(i17, i11)) {
            l10[2] = l10[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !bVar.j(i17, i11)) {
            int i18 = l10[1];
            if (i18 > i12) {
                break;
            }
            l10[1] = i18 + 1;
            i17--;
        }
        if (i17 >= 0 && l10[1] <= i12) {
            while (i17 >= 0 && bVar.j(i17, i11) && (i16 = l10[0]) <= i12) {
                l10[0] = i16 + 1;
                i17--;
            }
            if (l10[0] > i12) {
                return Float.NaN;
            }
            int i19 = i10 + 1;
            while (i19 < s10 && bVar.j(i19, i11)) {
                l10[2] = l10[2] + 1;
                i19++;
            }
            if (i19 == s10) {
                return Float.NaN;
            }
            while (i19 < s10 && !bVar.j(i19, i11) && (i15 = l10[3]) < i12) {
                l10[3] = i15 + 1;
                i19++;
            }
            if (i19 != s10 && l10[3] < i12) {
                while (i19 < s10 && bVar.j(i19, i11) && (i14 = l10[4]) < i12) {
                    l10[4] = i14 + 1;
                    i19++;
                }
                int i20 = l10[4];
                if (i20 < i12 && Math.abs(((((l10[0] + l10[1]) + l10[2]) + l10[3]) + i20) - i13) * 5 < i13 && j(l10)) {
                    return a(l10, i19);
                }
            }
        }
        return Float.NaN;
    }

    public final float e(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ya.b bVar = this.f24018a;
        int n10 = bVar.n();
        int[] l10 = l();
        int i17 = i10;
        while (i17 >= 0 && bVar.j(i11, i17)) {
            l10[2] = l10[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !bVar.j(i11, i17)) {
            int i18 = l10[1];
            if (i18 > i12) {
                break;
            }
            l10[1] = i18 + 1;
            i17--;
        }
        if (i17 >= 0 && l10[1] <= i12) {
            while (i17 >= 0 && bVar.j(i11, i17) && (i16 = l10[0]) <= i12) {
                l10[0] = i16 + 1;
                i17--;
            }
            if (l10[0] > i12) {
                return Float.NaN;
            }
            int i19 = i10 + 1;
            while (i19 < n10 && bVar.j(i11, i19)) {
                l10[2] = l10[2] + 1;
                i19++;
            }
            if (i19 == n10) {
                return Float.NaN;
            }
            while (i19 < n10 && !bVar.j(i11, i19) && (i15 = l10[3]) < i12) {
                l10[3] = i15 + 1;
                i19++;
            }
            if (i19 != n10 && l10[3] < i12) {
                while (i19 < n10 && bVar.j(i11, i19) && (i14 = l10[4]) < i12) {
                    l10[4] = i14 + 1;
                    i19++;
                }
                int i20 = l10[4];
                if (i20 < i12 && Math.abs(((((l10[0] + l10[1]) + l10[2]) + l10[3]) + i20) - i13) * 5 < i13 * 2 && j(l10)) {
                    return a(l10, i19);
                }
            }
        }
        return Float.NaN;
    }

    public final g h(Map<e, ?> map) throws m {
        boolean z10 = map != null && map.containsKey(e.TRY_HARDER);
        int n10 = this.f24018a.n();
        int s10 = this.f24018a.s();
        int i10 = (n10 * 3) / dg.a.Mt;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean z11 = false;
        while (i11 < n10 && !z11) {
            f(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i12 < s10) {
                if (this.f24018a.j(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (!j(iArr) || !o(iArr, i11, i12)) {
                    g(iArr);
                    i13 = 3;
                } else {
                    if (this.f24020c) {
                        z11 = q();
                    } else {
                        int i14 = i();
                        int i15 = iArr[2];
                        if (i14 > i15) {
                            i11 += (i14 - i15) - 2;
                            i12 = s10 - 1;
                        }
                    }
                    f(iArr);
                    i13 = 0;
                    i10 = 2;
                }
                i12++;
            }
            if (j(iArr) && o(iArr, i11, s10)) {
                i10 = iArr[0];
                if (this.f24020c) {
                    z11 = q();
                }
            }
            i11 += i10;
        }
        d[] r10 = r();
        t.e(r10);
        return new g(r10);
    }

    public final int i() {
        if (this.f24019b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d next : this.f24019b) {
            if (next.h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f24020c = true;
                    return ((int) (Math.abs(dVar.c() - next.c()) - Math.abs(dVar.d() - next.d()))) / 2;
                }
            }
        }
        return 0;
    }

    public final int[] l() {
        f(this.f24021d);
        return this.f24021d;
    }

    public final ya.b m() {
        return this.f24018a;
    }

    public final List<d> n() {
        return this.f24019b;
    }

    public final boolean o(int[] iArr, int i10, int i11) {
        boolean z10 = false;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a10 = (int) a(iArr, i11);
        float e10 = e(i10, a10, iArr[2], i12);
        if (!Float.isNaN(e10)) {
            int i13 = (int) e10;
            float d10 = d(a10, i13, iArr[2], i12);
            if (!Float.isNaN(d10) && c(i13, (int) d10)) {
                float f10 = ((float) i12) / 7.0f;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f24019b.size()) {
                        break;
                    }
                    d dVar = this.f24019b.get(i14);
                    if (dVar.f(f10, e10, d10)) {
                        this.f24019b.set(i14, dVar.g(e10, d10, f10));
                        z10 = true;
                        break;
                    }
                    i14++;
                }
                if (!z10) {
                    d dVar2 = new d(d10, e10, f10);
                    this.f24019b.add(dVar2);
                    u uVar = this.f24022e;
                    if (uVar != null) {
                        uVar.a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final boolean p(int[] iArr, int i10, int i11, boolean z10) {
        return o(iArr, i10, i11);
    }

    public final boolean q() {
        int size = this.f24019b.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i10 = 0;
        for (d next : this.f24019b) {
            if (next.h() >= 2) {
                i10++;
                f11 += next.i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f12 = f11 / ((float) size);
        for (d i11 : this.f24019b) {
            f10 += Math.abs(i11.i() - f12);
        }
        return f10 <= f11 * 0.05f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final wb.d[] r() throws qa.m {
        /*
            r26 = this;
            r0 = r26
            java.util.List<wb.d> r1 = r0.f24019b
            int r1 = r1.size()
            r2 = 3
            if (r1 < r2) goto L_0x00d7
            java.util.List<wb.d> r1 = r0.f24019b
            wb.f$b r3 = f24015g
            r1.sort(r3)
            wb.d[] r1 = new wb.d[r2]
            r2 = 0
            r5 = r2
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x001b:
            java.util.List<wb.d> r8 = r0.f24019b
            int r8 = r8.size()
            r9 = 2
            int r8 = r8 - r9
            if (r5 >= r8) goto L_0x00c8
            java.util.List<wb.d> r8 = r0.f24019b
            java.lang.Object r8 = r8.get(r5)
            wb.d r8 = (wb.d) r8
            float r10 = r8.i()
            int r5 = r5 + 1
            r11 = r5
        L_0x0034:
            java.util.List<wb.d> r12 = r0.f24019b
            int r12 = r12.size()
            r13 = 1
            int r12 = r12 - r13
            if (r11 >= r12) goto L_0x001b
            java.util.List<wb.d> r12 = r0.f24019b
            java.lang.Object r12 = r12.get(r11)
            wb.d r12 = (wb.d) r12
            double r14 = t(r8, r12)
            int r11 = r11 + 1
            r3 = r11
        L_0x004d:
            java.util.List<wb.d> r4 = r0.f24019b
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0034
            java.util.List<wb.d> r4 = r0.f24019b
            java.lang.Object r4 = r4.get(r3)
            wb.d r4 = (wb.d) r4
            float r16 = r4.i()
            r17 = 1068708659(0x3fb33333, float:1.4)
            float r17 = r17 * r10
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 > 0) goto L_0x00c5
            double r16 = t(r12, r4)
            double r18 = t(r8, r4)
            int r20 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r20 >= 0) goto L_0x008d
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 <= 0) goto L_0x0084
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x0081
            r20 = r14
            goto L_0x00a5
        L_0x0081:
            r20 = r18
            goto L_0x0099
        L_0x0084:
            r20 = r14
            r24 = r16
            r16 = r18
            r18 = r24
            goto L_0x00a5
        L_0x008d:
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x009f
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x009c
            r20 = r16
            r16 = r18
        L_0x0099:
            r18 = r14
            goto L_0x00a5
        L_0x009c:
            r20 = r16
            goto L_0x00a3
        L_0x009f:
            r20 = r18
            r18 = r16
        L_0x00a3:
            r16 = r14
        L_0x00a5:
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r22
            double r18 = r16 - r18
            double r18 = java.lang.Math.abs(r18)
            double r20 = r20 * r22
            double r16 = r16 - r20
            double r16 = java.lang.Math.abs(r16)
            double r18 = r18 + r16
            int r16 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x00c5
            r1[r2] = r8
            r1[r13] = r12
            r1[r9] = r4
            r6 = r18
        L_0x00c5:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x00c8:
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00d2
            return r1
        L_0x00d2:
            qa.m r1 = qa.m.a()
            throw r1
        L_0x00d7:
            qa.m r1 = qa.m.a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.f.r():wb.d[]");
    }

    @Deprecated
    public final void s(int[] iArr) {
        g(iArr);
    }
}
