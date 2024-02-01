package nb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mb.a;
import mb.b;
import mb.c;
import mb.f;
import ob.j;
import qa.e;
import qa.h;
import qa.m;
import qa.r;
import qa.t;

public final class d extends a {
    public static final int A = 11;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f21194o = {7, 5, 4, 3, 1};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f21195p = {4, 20, 52, 104, dg.a.Ye};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f21196q = {0, dg.a.Xp, 1388, 2948, 3988};

    /* renamed from: r  reason: collision with root package name */
    public static final int[][] f21197r = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: s  reason: collision with root package name */
    public static final int[][] f21198s = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, dg.a.Ze}, new int[]{193, 157, 49, dg.a.Wb, 19, 57, dg.a.Kd, 91}, new int[]{62, 186, 136, dg.a.Me, 169, 85, 44, 132}, new int[]{dg.a.f18034je, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, dg.a.Md, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, dg.a.Ve, 187, 139, dg.a.f17847af, dg.a.Le, dg.a.f18329xd}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, dg.a.Sd}, new int[]{109, 116, 137, 200, 178, 112, 125, dg.a.f18223sd}, new int[]{70, dg.a.f17952ff, dg.a.f17889cf, dg.a.Ue, 184, 130, 179, 115}, new int[]{134, dg.a.Be, 151, 31, 93, 68, dg.a.Ye, dg.a.f18139oe}, new int[]{148, 22, 66, dg.a.Ne, 172, 94, 71, 2}, new int[]{6, 18, 54, dg.a.f18075ld, 64, 192, 154, 40}, new int[]{120, dg.a.Yb, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, dg.a.f17868bf, dg.a.Oe, 175}, new int[]{103, 98, 83, 38, 114, 131, dg.a.f17867be, 124}, new int[]{161, 61, 183, 127, dg.a.Jd, 88, 53, 159}, new int[]{55, dg.a.f18244td, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, dg.a.Fe, 160, 58, 174, 100, 89}};

    /* renamed from: t  reason: collision with root package name */
    public static final int f21199t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f21200u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f21201v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f21202w = 3;

    /* renamed from: x  reason: collision with root package name */
    public static final int f21203x = 4;

    /* renamed from: y  reason: collision with root package name */
    public static final int f21204y = 5;

    /* renamed from: z  reason: collision with root package name */
    public static final int[][] f21205z = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: k  reason: collision with root package name */
    public final List<b> f21206k = new ArrayList(11);

    /* renamed from: l  reason: collision with root package name */
    public final List<c> f21207l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final int[] f21208m = new int[2];

    /* renamed from: n  reason: collision with root package name */
    public boolean f21209n;

    public static int A(ya.a aVar, int i10) {
        return aVar.n(i10) ? aVar.q(aVar.r(i10)) : aVar.r(aVar.q(i10));
    }

    public static boolean C(c cVar, boolean z10, boolean z11) {
        return cVar.c() != 0 || !z10 || !z11;
    }

    public static boolean D(Iterable<b> iterable, Iterable<c> iterable2) {
        boolean z10;
        boolean z11;
        Iterator<c> it = iterable2.iterator();
        do {
            z10 = false;
            if (it.hasNext()) {
                c next = it.next();
                Iterator<b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z10 = true;
                        continue;
                        break;
                    }
                    b next2 = it2.next();
                    Iterator<b> it3 = next.a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z11 = true;
                                continue;
                                break;
                            }
                        } else {
                            z11 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z11) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z10);
        return true;
    }

    public static boolean E(List<b> list) {
        boolean z10;
        for (int[] iArr : f21205z) {
            if (list.size() <= iArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    } else if (list.get(i10).a().c() != iArr[i10]) {
                        z10 = false;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void G(Collection<b> collection, Collection<c> collection2) {
        Iterator<c> it = collection2.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.a().size() != collection.size()) {
                boolean z10 = true;
                Iterator<b> it2 = next.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!collection.contains(it2.next())) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    it.remove();
                }
            }
        }
    }

    public static void I(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    public static r w(List<b> list) throws m, h {
        String d10 = j.a(a.a(list)).d();
        t[] a10 = list.get(0).a().a();
        t[] a11 = list.get(list.size() - 1).a().a();
        return new r(d10, (byte[]) null, new t[]{a10[0], a10[1], a11[0], a11[1]}, qa.a.RSS_EXPANDED);
    }

    public List<c> B() {
        return this.f21207l;
    }

    public final c F(ya.a aVar, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f21208m[0] - 1;
            while (i14 >= 0 && !aVar.n(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.f21208m;
            i13 = iArr[0] - i15;
            i11 = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.f21208m;
            int i16 = iArr2[0];
            int r10 = aVar.r(iArr2[1] + 1);
            i11 = r10;
            i12 = i16;
            i13 = r10 - this.f21208m[1];
        }
        int[] k10 = k();
        System.arraycopy(k10, 0, k10, 1, k10.length - 1);
        k10[0] = i13;
        try {
            return new c(a.r(k10, f21197r), new int[]{i12, i11}, i12, i11, i10);
        } catch (m unused) {
            return null;
        }
    }

    public b H(ya.a aVar, List<b> list, int i10) throws m {
        c F;
        b bVar;
        boolean z10 = list.size() % 2 == 0;
        if (this.f21209n) {
            z10 = !z10;
        }
        int i11 = -1;
        boolean z11 = true;
        do {
            z(aVar, list, i11);
            F = F(aVar, i10, z10);
            if (F == null) {
                i11 = A(aVar, this.f21208m[0]);
                continue;
            } else {
                z11 = false;
                continue;
            }
        } while (z11);
        b x10 = x(aVar, F, z10, true);
        if (list.isEmpty() || !list.get(list.size() - 1).d()) {
            try {
                bVar = x(aVar, F, z10, false);
            } catch (m unused) {
                bVar = null;
            }
            return new b(x10, bVar, F);
        }
        throw m.a();
    }

    public final void J(int i10) {
        boolean z10;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= this.f21207l.size()) {
                z10 = false;
                break;
            }
            c cVar = this.f21207l.get(i11);
            if (cVar.b() > i10) {
                z10 = cVar.c(this.f21206k);
                break;
            } else {
                z11 = cVar.c(this.f21206k);
                i11++;
            }
        }
        if (!z10 && !z11 && !D(this.f21206k, this.f21207l)) {
            this.f21207l.add(i11, new c(this.f21206k, i10, false));
            G(this.f21206k, this.f21207l);
        }
    }

    public r c(int i10, ya.a aVar, Map<e, ?> map) throws m, h {
        this.f21206k.clear();
        this.f21209n = false;
        try {
            return w(y(i10, aVar));
        } catch (m unused) {
            this.f21206k.clear();
            this.f21209n = true;
            return w(y(i10, aVar));
        }
    }

    public void reset() {
        this.f21206k.clear();
        this.f21207l.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(int r11) throws qa.m {
        /*
            r10 = this;
            int[] r0 = r10.n()
            int r0 = za.a.d(r0)
            int[] r1 = r10.l()
            int r1 = za.a.d(r1)
            r2 = 4
            r3 = 13
            r4 = 0
            r5 = 1
            if (r0 <= r3) goto L_0x001a
            r6 = r4
            r7 = r5
            goto L_0x0021
        L_0x001a:
            if (r0 >= r2) goto L_0x001f
            r7 = r4
            r6 = r5
            goto L_0x0021
        L_0x001f:
            r6 = r4
            r7 = r6
        L_0x0021:
            if (r1 <= r3) goto L_0x0026
            r2 = r4
            r3 = r5
            goto L_0x002d
        L_0x0026:
            if (r1 >= r2) goto L_0x002b
            r3 = r4
            r2 = r5
            goto L_0x002d
        L_0x002b:
            r2 = r4
            r3 = r2
        L_0x002d:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r5) goto L_0x0036
            r11 = r5
            goto L_0x0037
        L_0x0036:
            r11 = r4
        L_0x0037:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x003c
            r4 = r5
        L_0x003c:
            r9 = -1
            if (r8 == r9) goto L_0x0075
            if (r8 == 0) goto L_0x005c
            if (r8 != r5) goto L_0x0057
            if (r11 == 0) goto L_0x004e
            if (r4 != 0) goto L_0x0049
            r7 = r5
            goto L_0x006e
        L_0x0049:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x004e:
            if (r4 == 0) goto L_0x0052
            r3 = r5
            goto L_0x006e
        L_0x0052:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x0057:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x005c:
            if (r11 == 0) goto L_0x006c
            if (r4 == 0) goto L_0x0067
            if (r0 >= r1) goto L_0x0064
            r3 = r5
            goto L_0x0083
        L_0x0064:
            r2 = r5
            r7 = r2
            goto L_0x006e
        L_0x0067:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x006c:
            if (r4 != 0) goto L_0x0070
        L_0x006e:
            r5 = r6
            goto L_0x0083
        L_0x0070:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x0075:
            if (r11 == 0) goto L_0x007f
            if (r4 != 0) goto L_0x007a
            goto L_0x0083
        L_0x007a:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x007f:
            if (r4 == 0) goto L_0x00c8
            r2 = r5
            goto L_0x006e
        L_0x0083:
            if (r5 == 0) goto L_0x0098
            if (r7 != 0) goto L_0x0093
            int[] r11 = r10.n()
            float[] r0 = r10.o()
            mb.a.p(r11, r0)
            goto L_0x0098
        L_0x0093:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x0098:
            if (r7 == 0) goto L_0x00a5
            int[] r11 = r10.n()
            float[] r0 = r10.o()
            mb.a.i(r11, r0)
        L_0x00a5:
            if (r2 == 0) goto L_0x00ba
            if (r3 != 0) goto L_0x00b5
            int[] r11 = r10.l()
            float[] r0 = r10.o()
            mb.a.p(r11, r0)
            goto L_0x00ba
        L_0x00b5:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x00ba:
            if (r3 == 0) goto L_0x00c7
            int[] r11 = r10.l()
            float[] r0 = r10.m()
            mb.a.i(r11, r0)
        L_0x00c7:
            return
        L_0x00c8:
            qa.m r11 = qa.m.a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.d.s(int):void");
    }

    public final boolean t() {
        b bVar = this.f21206k.get(0);
        b b10 = bVar.b();
        b c10 = bVar.c();
        if (c10 == null) {
            return false;
        }
        int a10 = c10.a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f21206k.size(); i11++) {
            b bVar2 = this.f21206k.get(i11);
            a10 += bVar2.b().a();
            i10++;
            b c11 = bVar2.c();
            if (c11 != null) {
                a10 += c11.a();
                i10++;
            }
        }
        return ((i10 + -4) * dg.a.f1if) + (a10 % dg.a.f1if) == b10.b();
    }

    public final List<b> u(List<c> list, int i10) throws m {
        while (i10 < this.f21207l.size()) {
            c cVar = this.f21207l.get(i10);
            this.f21206k.clear();
            for (c a10 : list) {
                this.f21206k.addAll(a10.a());
            }
            this.f21206k.addAll(cVar.a());
            if (!E(this.f21206k)) {
                i10++;
            } else if (t()) {
                return this.f21206k;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return u(arrayList, i10 + 1);
                } catch (m unused) {
                }
            }
        }
        throw m.a();
    }

    public final List<b> v(boolean z10) {
        List<b> list = null;
        if (this.f21207l.size() > 25) {
            this.f21207l.clear();
            return null;
        }
        this.f21206k.clear();
        if (z10) {
            Collections.reverse(this.f21207l);
        }
        try {
            list = u(new ArrayList(), 0);
        } catch (m unused) {
        }
        if (z10) {
            Collections.reverse(this.f21207l);
        }
        return list;
    }

    public b x(ya.a aVar, c cVar, boolean z10, boolean z11) throws m {
        ya.a aVar2 = aVar;
        int[] j10 = j();
        Arrays.fill(j10, 0);
        int[] b10 = cVar.b();
        if (z11) {
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
        float d10 = ((float) za.a.d(j10)) / 17.0f;
        float f10 = ((float) (cVar.b()[1] - cVar.b()[0])) / 15.0f;
        if (Math.abs(d10 - f10) / f10 <= 0.3f) {
            int[] n10 = n();
            int[] l10 = l();
            float[] o10 = o();
            float[] m10 = m();
            for (int i12 = 0; i12 < j10.length; i12++) {
                float f11 = (((float) j10[i12]) * 1.0f) / d10;
                int i13 = (int) (0.5f + f11);
                if (i13 <= 0) {
                    if (f11 >= 0.3f) {
                        i13 = 1;
                    } else {
                        throw m.a();
                    }
                } else if (i13 > 8) {
                    if (f11 <= 8.7f) {
                        i13 = 8;
                    } else {
                        throw m.a();
                    }
                }
                int i14 = i12 / 2;
                if ((i12 & 1) == 0) {
                    n10[i14] = i13;
                    o10[i14] = f11 - ((float) i13);
                } else {
                    l10[i14] = i13;
                    m10[i14] = f11 - ((float) i13);
                }
            }
            s(17);
            int c10 = (((cVar.c() * 4) + (z10 ? 0 : 2)) + (z11 ^ true ? 1 : 0)) - 1;
            int i15 = 0;
            int i16 = 0;
            for (int length2 = n10.length - 1; length2 >= 0; length2--) {
                if (C(cVar, z10, z11)) {
                    i15 += n10[length2] * f21198s[c10][length2 * 2];
                }
                i16 += n10[length2];
            }
            int i17 = 0;
            for (int length3 = l10.length - 1; length3 >= 0; length3--) {
                if (C(cVar, z10, z11)) {
                    i17 += l10[length3] * f21198s[c10][(length3 * 2) + 1];
                }
            }
            int i18 = i15 + i17;
            if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
                throw m.a();
            }
            int i19 = (13 - i16) / 2;
            int i20 = f21194o[i19];
            return new b((f.b(n10, i20, true) * f21195p[i19]) + f.b(l10, 9 - i20, false) + f21196q[i19], i18);
        }
        throw m.a();
    }

    public List<b> y(int i10, ya.a aVar) throws m {
        boolean z10 = false;
        while (!z10) {
            try {
                List<b> list = this.f21206k;
                list.add(H(aVar, list, i10));
            } catch (m e10) {
                if (!this.f21206k.isEmpty()) {
                    z10 = true;
                } else {
                    throw e10;
                }
            }
        }
        if (t()) {
            return this.f21206k;
        }
        boolean z11 = !this.f21207l.isEmpty();
        J(i10);
        if (z11) {
            List<b> v10 = v(false);
            if (v10 != null) {
                return v10;
            }
            List<b> v11 = v(true);
            if (v11 != null) {
                return v11;
            }
        }
        throw m.a();
    }

    public final void z(ya.a aVar, List<b> list, int i10) throws m {
        int[] k10 = k();
        k10[0] = 0;
        k10[1] = 0;
        k10[2] = 0;
        k10[3] = 0;
        int s10 = aVar.s();
        if (i10 < 0) {
            i10 = list.isEmpty() ? 0 : list.get(list.size() - 1).a().b()[1];
        }
        boolean z10 = list.size() % 2 != 0;
        if (this.f21209n) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (i10 < s10) {
            z11 = !aVar.n(i10);
            if (!z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        boolean z12 = z11;
        int i12 = i10;
        while (i10 < s10) {
            if (aVar.n(i10) != z12) {
                k10[i11] = k10[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z10) {
                        I(k10);
                    }
                    if (a.q(k10)) {
                        int[] iArr = this.f21208m;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        I(k10);
                    }
                    i12 += k10[0] + k10[1];
                    k10[0] = k10[2];
                    k10[1] = k10[3];
                    k10[2] = 0;
                    k10[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                k10[i11] = 1;
                z12 = !z12;
            }
            i10++;
        }
        throw m.a();
    }
}
