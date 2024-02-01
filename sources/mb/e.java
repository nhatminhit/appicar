package mb;

import dg.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qa.m;
import qa.r;
import qa.t;
import qa.u;

public final class e extends a {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f21018m = {1, 10, 34, 70, 126};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f21019n = {4, 20, 48, 81};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f21020o = {0, 161, 961, 2015, 2715};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f21021p = {0, a.np, a.f18125o0, 1516};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f21022q = {8, 6, 4, 3, 1};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f21023r = {2, 4, 6, 8};

    /* renamed from: s  reason: collision with root package name */
    public static final int[][] f21024s = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: k  reason: collision with root package name */
    public final List<d> f21025k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final List<d> f21026l = new ArrayList();

    public static void s(Collection<d> collection, d dVar) {
        if (dVar != null) {
            boolean z10 = false;
            Iterator<d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (next.b() == dVar.b()) {
                    next.e();
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                collection.add(dVar);
            }
        }
    }

    public static boolean u(d dVar, d dVar2) {
        int a10 = (dVar.a() + (dVar2.a() * 16)) % 79;
        int c10 = (dVar.d().c() * 9) + dVar2.d().c();
        if (c10 > 72) {
            c10--;
        }
        if (c10 > 8) {
            c10--;
        }
        return a10 == c10;
    }

    public static r v(d dVar, d dVar2) {
        String valueOf = String.valueOf((((long) dVar.b()) * 4537077) + ((long) dVar2.b()));
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int charAt = sb2.charAt(i11) - '0';
            if ((i11 & 1) == 0) {
                charAt *= 3;
            }
            i10 += charAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb2.append(i12);
        t[] a10 = dVar.d().a();
        t[] a11 = dVar2.d().a();
        return new r(sb2.toString(), (byte[]) null, new t[]{a10[0], a10[1], a11[0], a11[1]}, qa.a.RSS_14);
    }

    public r c(int i10, ya.a aVar, Map<qa.e, ?> map) throws m {
        s(this.f21025k, x(aVar, false, i10, map));
        aVar.w();
        s(this.f21026l, x(aVar, true, i10, map));
        aVar.w();
        for (d next : this.f21025k) {
            if (next.c() > 1) {
                for (d next2 : this.f21026l) {
                    if (next2.c() > 1 && u(next, next2)) {
                        return v(next, next2);
                    }
                }
                continue;
            }
        }
        throw m.a();
    }

    public void reset() {
        this.f21025k.clear();
        this.f21026l.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r5 = false;
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r1 < 4) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(boolean r10, int r11) throws qa.m {
        /*
            r9 = this;
            int[] r0 = r9.n()
            int r0 = za.a.d(r0)
            int[] r1 = r9.l()
            int r1 = za.a.d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0029
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = r3
            r7 = r4
            goto L_0x0023
        L_0x001c:
            if (r0 >= r2) goto L_0x0021
            r7 = r3
            r6 = r4
            goto L_0x0023
        L_0x0021:
            r6 = r3
            r7 = r6
        L_0x0023:
            if (r1 <= r5) goto L_0x0026
            goto L_0x003c
        L_0x0026:
            if (r1 >= r2) goto L_0x0044
            goto L_0x0041
        L_0x0029:
            r5 = 11
            if (r0 <= r5) goto L_0x0030
            r6 = r3
            r7 = r4
            goto L_0x0038
        L_0x0030:
            r5 = 5
            if (r0 >= r5) goto L_0x0036
            r7 = r3
            r6 = r4
            goto L_0x0038
        L_0x0036:
            r6 = r3
            r7 = r6
        L_0x0038:
            r5 = 10
            if (r1 <= r5) goto L_0x003f
        L_0x003c:
            r2 = r3
            r5 = r4
            goto L_0x0046
        L_0x003f:
            if (r1 >= r2) goto L_0x0044
        L_0x0041:
            r5 = r3
            r2 = r4
            goto L_0x0046
        L_0x0044:
            r2 = r3
            r5 = r2
        L_0x0046:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004f
            r10 = r4
            goto L_0x0050
        L_0x004f:
            r10 = r3
        L_0x0050:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0055
            r3 = r4
        L_0x0055:
            r11 = -1
            if (r8 == r11) goto L_0x008e
            if (r8 == 0) goto L_0x0075
            if (r8 != r4) goto L_0x0070
            if (r10 == 0) goto L_0x0067
            if (r3 != 0) goto L_0x0062
            r7 = r4
            goto L_0x0087
        L_0x0062:
            qa.m r10 = qa.m.a()
            throw r10
        L_0x0067:
            if (r3 == 0) goto L_0x006b
            r5 = r4
            goto L_0x0087
        L_0x006b:
            qa.m r10 = qa.m.a()
            throw r10
        L_0x0070:
            qa.m r10 = qa.m.a()
            throw r10
        L_0x0075:
            if (r10 == 0) goto L_0x0085
            if (r3 == 0) goto L_0x0080
            if (r0 >= r1) goto L_0x007d
            r5 = r4
            goto L_0x009c
        L_0x007d:
            r2 = r4
            r7 = r2
            goto L_0x0087
        L_0x0080:
            qa.m r10 = qa.m.a()
            throw r10
        L_0x0085:
            if (r3 != 0) goto L_0x0089
        L_0x0087:
            r4 = r6
            goto L_0x009c
        L_0x0089:
            qa.m r10 = qa.m.a()
            throw r10
        L_0x008e:
            if (r10 == 0) goto L_0x0098
            if (r3 != 0) goto L_0x0093
            goto L_0x009c
        L_0x0093:
            qa.m r10 = qa.m.a()
            throw r10
        L_0x0098:
            if (r3 == 0) goto L_0x00e1
            r2 = r4
            goto L_0x0087
        L_0x009c:
            if (r4 == 0) goto L_0x00b1
            if (r7 != 0) goto L_0x00ac
            int[] r10 = r9.n()
            float[] r11 = r9.o()
            mb.a.p(r10, r11)
            goto L_0x00b1
        L_0x00ac:
            qa.m r10 = qa.m.a()
            throw r10
        L_0x00b1:
            if (r7 == 0) goto L_0x00be
            int[] r10 = r9.n()
            float[] r11 = r9.o()
            mb.a.i(r10, r11)
        L_0x00be:
            if (r2 == 0) goto L_0x00d3
            if (r5 != 0) goto L_0x00ce
            int[] r10 = r9.l()
            float[] r11 = r9.o()
            mb.a.p(r10, r11)
            goto L_0x00d3
        L_0x00ce:
            qa.m r10 = qa.m.a()
            throw r10
        L_0x00d3:
            if (r5 == 0) goto L_0x00e0
            int[] r10 = r9.l()
            float[] r11 = r9.m()
            mb.a.i(r10, r11)
        L_0x00e0:
            return
        L_0x00e1:
            qa.m r10 = qa.m.a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.e.t(boolean, int):void");
    }

    public final b w(ya.a aVar, c cVar, boolean z10) throws m {
        int[] j10 = j();
        Arrays.fill(j10, 0);
        int[] b10 = cVar.b();
        if (z10) {
            lb.r.g(aVar, b10[0], j10);
        } else {
            lb.r.f(aVar, b10[1], j10);
            int i10 = 0;
            for (int length = j10.length - 1; i10 < length; length--) {
                int i11 = j10[i10];
                j10[i10] = j10[length];
                j10[length] = i11;
                i10++;
            }
        }
        int i12 = z10 ? 16 : 15;
        float d10 = ((float) za.a.d(j10)) / ((float) i12);
        int[] n10 = n();
        int[] l10 = l();
        float[] o10 = o();
        float[] m10 = m();
        for (int i13 = 0; i13 < j10.length; i13++) {
            float f10 = ((float) j10[i13]) / d10;
            int i14 = (int) (0.5f + f10);
            if (i14 <= 0) {
                i14 = 1;
            } else if (i14 > 8) {
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                n10[i15] = i14;
                o10[i15] = f10 - ((float) i14);
            } else {
                l10[i15] = i14;
                m10[i15] = f10 - ((float) i14);
            }
        }
        t(z10, i12);
        int i16 = 0;
        int i17 = 0;
        for (int length2 = n10.length - 1; length2 >= 0; length2--) {
            int i18 = n10[length2];
            i16 = (i16 * 9) + i18;
            i17 += i18;
        }
        int i19 = 0;
        int i20 = 0;
        for (int length3 = l10.length - 1; length3 >= 0; length3--) {
            int i21 = l10[length3];
            i19 = (i19 * 9) + i21;
            i20 += i21;
        }
        int i22 = i16 + (i19 * 3);
        if (z10) {
            if ((i17 & 1) != 0 || i17 > 12 || i17 < 4) {
                throw m.a();
            }
            int i23 = (12 - i17) / 2;
            int i24 = f21022q[i23];
            return new b((f.b(n10, i24, false) * f21018m[i23]) + f.b(l10, 9 - i24, true) + f21020o[i23], i22);
        } else if ((i20 & 1) != 0 || i20 > 10 || i20 < 4) {
            throw m.a();
        } else {
            int i25 = (10 - i20) / 2;
            int i26 = f21023r[i25];
            return new b((f.b(l10, 9 - i26, false) * f21019n[i25]) + f.b(n10, i26, true) + f21021p[i25], i22);
        }
    }

    public final d x(ya.a aVar, boolean z10, int i10, Map<qa.e, ?> map) {
        try {
            c z11 = z(aVar, i10, z10, y(aVar, z10));
            u uVar = map == null ? null : (u) map.get(qa.e.NEED_RESULT_POINT_CALLBACK);
            if (uVar != null) {
                int[] b10 = z11.b();
                float f10 = ((float) ((b10[0] + b10[1]) - 1)) / 2.0f;
                if (z10) {
                    f10 = ((float) (aVar.s() - 1)) - f10;
                }
                uVar.a(new t(f10, (float) i10));
            }
            b w10 = w(aVar, z11, true);
            b w11 = w(aVar, z11, false);
            return new d((w10.b() * 1597) + w11.b(), w10.a() + (w11.a() * 4), z11);
        } catch (m unused) {
            return null;
        }
    }

    public final int[] y(ya.a aVar, boolean z10) throws m {
        int[] k10 = k();
        k10[0] = 0;
        k10[1] = 0;
        k10[2] = 0;
        k10[3] = 0;
        int s10 = aVar.s();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < s10) {
            z11 = !aVar.n(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < s10) {
            if (aVar.n(i10) != z11) {
                k10[i11] = k10[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else if (a.q(k10)) {
                    return new int[]{i12, i10};
                } else {
                    i12 += k10[0] + k10[1];
                    k10[0] = k10[2];
                    k10[1] = k10[3];
                    k10[2] = 0;
                    k10[3] = 0;
                    i11--;
                }
                k10[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw m.a();
    }

    public final c z(ya.a aVar, int i10, boolean z10, int[] iArr) throws m {
        int i11;
        int i12;
        boolean n10 = aVar.n(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && n10 != aVar.n(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int[] k10 = k();
        System.arraycopy(k10, 0, k10, 1, k10.length - 1);
        k10[0] = iArr[0] - i14;
        int r10 = a.r(k10, f21024s);
        int i15 = iArr[1];
        if (z10) {
            i11 = (aVar.s() - 1) - i15;
            i12 = (aVar.s() - 1) - i14;
        } else {
            i11 = i15;
            i12 = i14;
        }
        return new c(r10, new int[]{i14, iArr[1]}, i12, i11, i10);
    }
}
