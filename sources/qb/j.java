package qb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import qa.d;
import qa.h;
import qa.m;
import qa.t;
import rb.a;
import ya.b;
import ya.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int f22256a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f22257b = 3;

    /* renamed from: c  reason: collision with root package name */
    public static final int f22258c = 512;

    /* renamed from: d  reason: collision with root package name */
    public static final a f22259d = new a();

    public static c a(h hVar) throws m {
        int[] j10;
        if (hVar == null || (j10 = hVar.j()) == null) {
            return null;
        }
        int p10 = p(j10);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : j10) {
            i11 += p10 - i12;
            if (i12 > 0) {
                break;
            }
        }
        d[] d10 = hVar.d();
        int i13 = 0;
        while (i11 > 0 && d10[i13] == null) {
            i11--;
            i13++;
        }
        for (int length = j10.length - 1; length >= 0; length--) {
            int i14 = j10[length];
            i10 += p10 - i14;
            if (i14 > 0) {
                break;
            }
        }
        int length2 = d10.length - 1;
        while (i10 > 0 && d10[length2] == null) {
            i10--;
            length2--;
        }
        return hVar.a().a(i11, i10, hVar.k());
    }

    public static void b(f fVar, b[][] bVarArr) throws m {
        b bVar = bVarArr[0][1];
        int[] b10 = bVar.b();
        int j10 = (fVar.j() * fVar.l()) - r(fVar.k());
        if (b10.length == 0) {
            if (j10 <= 0 || j10 > 928) {
                throw m.a();
            }
            bVar.c(j10);
        } else if (b10[0] != j10 && j10 > 0 && j10 <= 928) {
            bVar.c(j10);
        }
    }

    public static int c(b bVar, int i10, int i11, boolean z10, int i12, int i13) {
        int i14 = z10 ? -1 : 1;
        int i15 = i12;
        for (int i16 = 0; i16 < 2; i16++) {
            while (true) {
                if (!z10) {
                    if (i15 >= i11) {
                        continue;
                        break;
                    }
                } else if (i15 < i10) {
                    continue;
                    break;
                }
                if (z10 != bVar.j(i15, i13)) {
                    continue;
                    break;
                } else if (Math.abs(i12 - i15) > 2) {
                    return i12;
                } else {
                    i15 += i14;
                }
            }
            i14 = -i14;
            z10 = !z10;
        }
        return i15;
    }

    public static boolean d(int i10, int i11, int i12) {
        return i11 + -2 <= i10 && i10 <= i12 + 2;
    }

    public static int e(int[] iArr, int[] iArr2, int i10) throws d {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f22259d.a(iArr, i10, iArr2);
        }
        throw d.a();
    }

    public static b[][] f(f fVar) {
        int c10;
        int l10 = fVar.l();
        int[] iArr = new int[2];
        iArr[1] = fVar.j() + 2;
        iArr[0] = l10;
        b[][] bVarArr = (b[][]) Array.newInstance(b.class, iArr);
        for (b[] bVarArr2 : bVarArr) {
            int i10 = 0;
            while (true) {
                if (i10 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i10] = new b();
                i10++;
            }
        }
        int i11 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (c10 = dVar.c()) >= 0 && c10 < bVarArr.length) {
                        bVarArr[c10][i11].c(dVar.e());
                    }
                }
            }
            i11++;
        }
        return bVarArr;
    }

    public static e g(f fVar) throws h, d, m {
        b[][] f10 = f(fVar);
        b(fVar, f10);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.l() * fVar.j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < fVar.l(); i10++) {
            int i11 = 0;
            while (i11 < fVar.j()) {
                int i12 = i11 + 1;
                int[] b10 = f10[i10][i12].b();
                int j10 = (fVar.j() * i10) + i11;
                if (b10.length == 0) {
                    arrayList.add(Integer.valueOf(j10));
                } else if (b10.length == 1) {
                    iArr[j10] = b10[0];
                } else {
                    arrayList3.add(Integer.valueOf(j10));
                    arrayList2.add(b10);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return h(fVar.k(), iArr, pb.a.c(arrayList), pb.a.c(arrayList3), iArr2);
    }

    public static e h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws h, d {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
                }
                try {
                    return j(iArr, i10, iArr2);
                } catch (d unused) {
                    if (length != 0) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                break;
                            }
                            int i15 = iArr5[i14];
                            if (i15 < iArr4[i14].length - 1) {
                                iArr5[i14] = i15 + 1;
                                break;
                            }
                            iArr5[i14] = 0;
                            if (i14 != length - 1) {
                                i14++;
                            } else {
                                throw d.a();
                            }
                        }
                        i11 = i12;
                    } else {
                        throw d.a();
                    }
                }
            } else {
                throw d.a();
            }
        }
    }

    public static e i(b bVar, t tVar, t tVar2, t tVar3, t tVar4, int i10, int i11) throws m, h, d {
        c cVar;
        f v10;
        g gVar;
        int i12;
        int i13;
        int i14;
        int i15;
        c cVar2 = new c(bVar, tVar, tVar2, tVar3, tVar4);
        h hVar = null;
        h hVar2 = null;
        boolean z10 = true;
        while (true) {
            cVar = cVar2;
            if (tVar != null) {
                hVar = s(bVar, cVar, tVar, true, i10, i11);
            }
            if (tVar3 != null) {
                hVar2 = s(bVar, cVar, tVar3, false, i10, i11);
            }
            v10 = v(hVar, hVar2);
            if (v10 != null) {
                cVar2 = v10.m();
                if (!z10 || cVar2 == null || (cVar2.g() >= cVar.g() && cVar2.e() <= cVar.e())) {
                    v10.p(cVar);
                    int j10 = v10.j() + 1;
                    v10.q(0, hVar);
                    v10.q(j10, hVar2);
                } else {
                    z10 = false;
                }
            } else {
                throw m.a();
            }
        }
        v10.p(cVar);
        int j102 = v10.j() + 1;
        v10.q(0, hVar);
        v10.q(j102, hVar2);
        boolean z11 = hVar != null;
        int i16 = i10;
        int i17 = i11;
        for (int i18 = 1; i18 <= j102; i18++) {
            int i19 = z11 ? i18 : j102 - i18;
            if (v10.n(i19) == null) {
                if (i19 == 0 || i19 == j102) {
                    gVar = new h(cVar, i19 == 0);
                } else {
                    gVar = new g(cVar);
                }
                v10.q(i19, gVar);
                int i20 = -1;
                int g10 = cVar.g();
                int i21 = -1;
                while (g10 <= cVar.e()) {
                    int t10 = t(v10, i19, g10, z11);
                    if (t10 >= 0 && t10 <= cVar.d()) {
                        i15 = t10;
                    } else if (i21 != i20) {
                        i15 = i21;
                    } else {
                        i14 = i21;
                        i13 = g10;
                        i12 = i20;
                        i21 = i14;
                        g10 = i13 + 1;
                        i20 = i12;
                    }
                    i14 = i21;
                    int i22 = g10;
                    i12 = i20;
                    d k10 = k(bVar, cVar.f(), cVar.d(), z11, i15, i22, i16, i17);
                    i13 = i22;
                    if (k10 != null) {
                        gVar.f(i13, k10);
                        i16 = Math.min(i16, k10.f());
                        i17 = Math.max(i17, k10.f());
                        i21 = i15;
                        g10 = i13 + 1;
                        i20 = i12;
                    }
                    i21 = i14;
                    g10 = i13 + 1;
                    i20 = i12;
                }
            }
        }
        return g(v10);
    }

    public static e j(int[] iArr, int i10, int[] iArr2) throws h, d {
        if (iArr.length != 0) {
            int i11 = 1 << (i10 + 1);
            int e10 = e(iArr, iArr2, i11);
            x(iArr, i11);
            e b10 = e.b(iArr, String.valueOf(i10));
            b10.m(Integer.valueOf(e10));
            b10.l(Integer.valueOf(iArr2.length));
            return b10;
        }
        throw h.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = qb.i.d(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static qb.d k(ya.b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = za.a.d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = qb.i.d(r7)
            int r9 = pb.a.b(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            qb.d r8 = new qb.d
            int r7 = n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.j.k(ya.b, int, int, boolean, int, int, int, int):qb.d");
    }

    public static a l(h hVar, h hVar2) {
        a i10;
        a i11;
        if (hVar == null || (i10 = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        } else if (hVar2 == null || (i11 = hVar2.i()) == null || i10.a() == i11.a() || i10.b() == i11.b() || i10.c() == i11.c()) {
            return i10;
        } else {
            return null;
        }
    }

    public static int[] m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    public static int n(int i10) {
        return o(m(i10));
    }

    public static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    public static int p(int[] iArr) {
        int i10 = -1;
        for (int max : iArr) {
            i10 = Math.max(i10, max);
        }
        return i10;
    }

    public static int[] q(b bVar, int i10, int i11, boolean z10, int i12, int i13) {
        int[] iArr = new int[8];
        int i14 = z10 ? 1 : -1;
        int i15 = 0;
        boolean z11 = z10;
        while (true) {
            if (!z10) {
                if (i12 < i10) {
                    break;
                }
            } else if (i12 >= i11) {
                break;
            }
            if (i15 >= 8) {
                break;
            } else if (bVar.j(i12, i13) == z11) {
                iArr[i15] = iArr[i15] + 1;
                i12 += i14;
            } else {
                i15++;
                z11 = !z11;
            }
        }
        if (i15 != 8) {
            if (z10) {
                i10 = i11;
            }
            if (!(i12 == i10 && i15 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    public static int r(int i10) {
        return 2 << i10;
    }

    public static h s(b bVar, c cVar, t tVar, boolean z10, int i10, int i11) {
        boolean z11 = z10;
        h hVar = new h(cVar, z11);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int c10 = (int) tVar.c();
            int d10 = (int) tVar.d();
            while (d10 <= cVar.e() && d10 >= cVar.g()) {
                d k10 = k(bVar, 0, bVar.s(), z10, c10, d10, i10, i11);
                if (k10 != null) {
                    hVar.f(d10, k10);
                    c10 = z11 ? k10.d() : k10.b();
                }
                d10 += i13;
            }
            i12++;
        }
        return hVar;
    }

    public static int t(f fVar, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        d dVar = null;
        int i13 = i10 - i12;
        if (u(fVar, i13)) {
            dVar = fVar.n(i13).b(i11);
        }
        if (dVar != null) {
            return z10 ? dVar.b() : dVar.d();
        }
        d c10 = fVar.n(i10).c(i11);
        if (c10 != null) {
            return z10 ? c10.d() : c10.b();
        }
        if (u(fVar, i13)) {
            c10 = fVar.n(i13).c(i11);
        }
        if (c10 != null) {
            return z10 ? c10.b() : c10.d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (u(fVar, i10)) {
                for (d dVar2 : fVar.n(i10).d()) {
                    if (dVar2 != null) {
                        return (z10 ? dVar2.b() : dVar2.d()) + (i12 * i14 * (dVar2.b() - dVar2.d()));
                    }
                }
                i14++;
            } else {
                c m10 = fVar.m();
                return z10 ? m10.f() : m10.d();
            }
        }
    }

    public static boolean u(f fVar, int i10) {
        return i10 >= 0 && i10 <= fVar.j() + 1;
    }

    public static f v(h hVar, h hVar2) throws m {
        a l10;
        if ((hVar == null && hVar2 == null) || (l10 = l(hVar, hVar2)) == null) {
            return null;
        }
        return new f(l10, c.j(a(hVar), a(hVar2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r9.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String w(qb.b[][] r9) {
        /*
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r1 = 0
            r2 = r1
        L_0x0007:
            int r3 = r9.length     // Catch:{ all -> 0x0063 }
            if (r2 >= r3) goto L_0x005b
            java.lang.String r3 = "Row %2d: "
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0063 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0063 }
            r5[r1] = r6     // Catch:{ all -> 0x0063 }
            r0.format(r3, r5)     // Catch:{ all -> 0x0063 }
            r3 = r1
        L_0x0019:
            r5 = r9[r2]     // Catch:{ all -> 0x0063 }
            int r6 = r5.length     // Catch:{ all -> 0x0063 }
            if (r3 >= r6) goto L_0x0051
            r5 = r5[r3]     // Catch:{ all -> 0x0063 }
            int[] r6 = r5.b()     // Catch:{ all -> 0x0063 }
            int r6 = r6.length     // Catch:{ all -> 0x0063 }
            if (r6 != 0) goto L_0x002e
            java.lang.String r5 = "        "
            r6 = 0
            r0.format(r5, r6)     // Catch:{ all -> 0x0063 }
            goto L_0x004e
        L_0x002e:
            java.lang.String r6 = "%4d(%2d)"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0063 }
            int[] r8 = r5.b()     // Catch:{ all -> 0x0063 }
            r8 = r8[r1]     // Catch:{ all -> 0x0063 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0063 }
            r7[r1] = r8     // Catch:{ all -> 0x0063 }
            int[] r8 = r5.b()     // Catch:{ all -> 0x0063 }
            r8 = r8[r1]     // Catch:{ all -> 0x0063 }
            java.lang.Integer r5 = r5.a(r8)     // Catch:{ all -> 0x0063 }
            r7[r4] = r5     // Catch:{ all -> 0x0063 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0063 }
        L_0x004e:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0051:
            java.lang.String r3 = "%n"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0063 }
            r0.format(r3, r4)     // Catch:{ all -> 0x0063 }
            int r2 = r2 + 1
            goto L_0x0007
        L_0x005b:
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0063 }
            r0.close()
            return r9
        L_0x0063:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            r9.addSuppressed(r0)
        L_0x006e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.j.w(qb.b[][]):java.lang.String");
    }

    public static void x(int[] iArr, int i10) throws h {
        if (iArr.length >= 4) {
            int i11 = iArr[0];
            if (i11 > iArr.length) {
                throw h.a();
            } else if (i11 != 0) {
            } else {
                if (i10 < iArr.length) {
                    iArr[0] = iArr.length - i10;
                    return;
                }
                throw h.a();
            }
        } else {
            throw h.a();
        }
    }
}
