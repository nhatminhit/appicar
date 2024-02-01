package lb;

import java.util.Arrays;
import java.util.Map;
import qa.c;
import qa.d;
import qa.e;
import qa.h;
import qa.m;
import qa.p;
import qa.s;
import qa.t;
import ya.a;

public abstract class r implements p {
    public static float e(int[] iArr, int[] iArr2, float f10) {
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
        float f11 = (float) i10;
        float f12 = f11 / ((float) i11);
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = ((float) iArr2[i13]) * f12;
            float f16 = (float) i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    public static void f(a aVar, int i10, int[] iArr) throws m {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int s10 = aVar.s();
        if (i10 < s10) {
            boolean z10 = !aVar.n(i10);
            while (i10 < s10) {
                if (aVar.n(i10) == z10) {
                    i11++;
                    if (i11 == length) {
                        break;
                    }
                    iArr[i11] = 1;
                    z10 = !z10;
                } else {
                    iArr[i11] = iArr[i11] + 1;
                }
                i10++;
            }
            if (i11 == length) {
                return;
            }
            if (i11 != length - 1 || i10 != s10) {
                throw m.a();
            }
            return;
        }
        throw m.a();
    }

    public static void g(a aVar, int i10, int[] iArr) throws m {
        int length = iArr.length;
        boolean n10 = aVar.n(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.n(i10) != n10) {
                length--;
                n10 = !n10;
            }
        }
        if (length < 0) {
            f(aVar, i10 + 1, iArr);
            return;
        }
        throw m.a();
    }

    public qa.r a(c cVar, Map<e, ?> map) throws m, h {
        try {
            return d(cVar, map);
        } catch (m e10) {
            if (!(map != null && map.containsKey(e.TRY_HARDER)) || !cVar.g()) {
                throw e10;
            }
            c h10 = cVar.h();
            qa.r d10 = d(h10, map);
            Map<s, Object> e11 = d10.e();
            int i10 = 270;
            if (e11 != null) {
                s sVar = s.ORIENTATION;
                if (e11.containsKey(sVar)) {
                    i10 = (((Integer) e11.get(sVar)).intValue() + 270) % dg.a.rr;
                }
            }
            d10.j(s.ORIENTATION, Integer.valueOf(i10));
            t[] f10 = d10.f();
            if (f10 != null) {
                int d11 = h10.d();
                for (int i11 = 0; i11 < f10.length; i11++) {
                    f10[i11] = new t((((float) d11) - f10[i11].d()) - 1.0f, f10[i11].c());
                }
            }
            return d10;
        }
    }

    public qa.r b(c cVar) throws m, h {
        return a(cVar, (Map<e, ?>) null);
    }

    public abstract qa.r c(int i10, a aVar, Map<e, ?> map) throws m, d, h;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c A[Catch:{ q -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00cb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final qa.r d(qa.c r22, java.util.Map<qa.e, ?> r23) throws qa.m {
        /*
            r21 = this;
            r0 = r23
            int r1 = r22.e()
            int r2 = r22.d()
            ya.a r3 = new ya.a
            r3.<init>(r1)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x001d
            qa.e r6 = qa.e.TRY_HARDER
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L_0x001d
            r6 = r5
            goto L_0x001e
        L_0x001d:
            r6 = r4
        L_0x001e:
            if (r6 == 0) goto L_0x0023
            r7 = 8
            goto L_0x0024
        L_0x0023:
            r7 = 5
        L_0x0024:
            int r7 = r2 >> r7
            int r7 = java.lang.Math.max(r5, r7)
            if (r6 == 0) goto L_0x002e
            r6 = r2
            goto L_0x0030
        L_0x002e:
            r6 = 15
        L_0x0030:
            int r8 = r2 / 2
            r9 = r4
        L_0x0033:
            if (r9 >= r6) goto L_0x00e7
            int r10 = r9 + 1
            int r11 = r10 / 2
            r9 = r9 & 1
            if (r9 != 0) goto L_0x003f
            r9 = r5
            goto L_0x0040
        L_0x003f:
            r9 = r4
        L_0x0040:
            if (r9 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            int r11 = -r11
        L_0x0044:
            int r11 = r11 * r7
            int r11 = r11 + r8
            if (r11 < 0) goto L_0x00e7
            if (r11 >= r2) goto L_0x00e7
            r9 = r22
            ya.a r3 = r9.c(r11, r3)     // Catch:{ m -> 0x00db }
            r12 = r4
        L_0x0051:
            r13 = 2
            if (r12 >= r13) goto L_0x00db
            if (r12 != r5) goto L_0x0074
            r3.w()
            if (r0 == 0) goto L_0x0074
            qa.e r13 = qa.e.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L_0x0074
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<qa.e> r15 = qa.e.class
            r14.<init>(r15)
            r14.putAll(r0)
            r14.remove(r13)
            r13 = r21
            r0 = r14
            goto L_0x0076
        L_0x0074:
            r13 = r21
        L_0x0076:
            qa.r r14 = r13.c(r11, r3, r0)     // Catch:{ q -> 0x00cc }
            if (r12 != r5) goto L_0x00cb
            qa.s r15 = qa.s.ORIENTATION     // Catch:{ q -> 0x00cc }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ q -> 0x00c5 }
            r14.j(r15, r5)     // Catch:{ q -> 0x00c5 }
            qa.t[] r5 = r14.f()     // Catch:{ q -> 0x00c5 }
            if (r5 == 0) goto L_0x00cb
            qa.t r15 = new qa.t     // Catch:{ q -> 0x00c5 }
            r16 = r0
            float r0 = (float) r1
            r18 = r5[r4]     // Catch:{ q -> 0x00c7 }
            float r18 = r18.c()     // Catch:{ q -> 0x00c7 }
            float r18 = r0 - r18
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            float r1 = r18 - r19
            r18 = r5[r4]     // Catch:{ q -> 0x00c9 }
            float r4 = r18.d()     // Catch:{ q -> 0x00c9 }
            r15.<init>(r1, r4)     // Catch:{ q -> 0x00c9 }
            r1 = 0
            r5[r1] = r15     // Catch:{ q -> 0x00c9 }
            qa.t r4 = new qa.t     // Catch:{ q -> 0x00c9 }
            r15 = 1
            r17 = r5[r15]     // Catch:{ q -> 0x00d1 }
            float r17 = r17.c()     // Catch:{ q -> 0x00d1 }
            float r0 = r0 - r17
            float r0 = r0 - r19
            r17 = r5[r15]     // Catch:{ q -> 0x00d1 }
            float r1 = r17.d()     // Catch:{ q -> 0x00d1 }
            r4.<init>(r0, r1)     // Catch:{ q -> 0x00d1 }
            r5[r15] = r4     // Catch:{ q -> 0x00d1 }
            goto L_0x00cb
        L_0x00c5:
            r16 = r0
        L_0x00c7:
            r20 = r1
        L_0x00c9:
            r15 = 1
            goto L_0x00d1
        L_0x00cb:
            return r14
        L_0x00cc:
            r16 = r0
            r20 = r1
            r15 = r5
        L_0x00d1:
            int r12 = r12 + 1
            r5 = r15
            r0 = r16
            r1 = r20
            r4 = 0
            goto L_0x0051
        L_0x00db:
            r13 = r21
            r20 = r1
            r15 = r5
            r9 = r10
            r5 = r15
            r1 = r20
            r4 = 0
            goto L_0x0033
        L_0x00e7:
            r13 = r21
            qa.m r0 = qa.m.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.r.d(qa.c, java.util.Map):qa.r");
    }

    public void reset() {
    }
}
