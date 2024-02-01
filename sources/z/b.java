package z;

import java.util.ArrayList;
import w.e;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f15592a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f15593b = false;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: z.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: w.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: w.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: z.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: w.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: z.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: w.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: z.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: z.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: w.i} */
    /* JADX WARNING: type inference failed for: r5v10, types: [w.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r7 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r7 == 2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x024a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04b3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0385 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:318:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(z.f r37, w.e r38, int r39, int r40, z.c r41) {
        /*
            r0 = r37
            r9 = r38
            r1 = r41
            z.e r10 = r1.f15594a
            z.e r11 = r1.f15596c
            z.e r12 = r1.f15595b
            z.e r13 = r1.f15597d
            z.e r2 = r1.f15598e
            float r3 = r1.f15604k
            z.e$b[] r4 = r0.U
            r4 = r4[r39]
            z.e$b r5 = z.e.b.WRAP_CONTENT
            r14 = 1
            if (r4 != r5) goto L_0x001d
            r4 = r14
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r39 != 0) goto L_0x0030
            int r7 = r2.B0
            if (r7 != 0) goto L_0x0027
            r8 = r14
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            if (r7 != r14) goto L_0x002c
            r15 = r14
            goto L_0x002d
        L_0x002c:
            r15 = 0
        L_0x002d:
            if (r7 != r5) goto L_0x0040
            goto L_0x003e
        L_0x0030:
            int r7 = r2.C0
            if (r7 != 0) goto L_0x0036
            r8 = r14
            goto L_0x0037
        L_0x0036:
            r8 = 0
        L_0x0037:
            if (r7 != r14) goto L_0x003b
            r15 = r14
            goto L_0x003c
        L_0x003b:
            r15 = 0
        L_0x003c:
            if (r7 != r5) goto L_0x0040
        L_0x003e:
            r5 = r14
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            r16 = r15
            r7 = 0
            r15 = r8
            r8 = r10
        L_0x0046:
            r20 = 0
            if (r7 != 0) goto L_0x011e
            z.d[] r6 = r8.R
            r6 = r6[r40]
            if (r5 == 0) goto L_0x0053
            r18 = 1
            goto L_0x0055
        L_0x0053:
            r18 = 4
        L_0x0055:
            int r22 = r6.g()
            z.e$b[] r14 = r8.U
            r14 = r14[r39]
            r24 = r3
            z.e$b r3 = z.e.b.MATCH_CONSTRAINT
            if (r14 != r3) goto L_0x006d
            int[] r14 = r8.f15676r
            r14 = r14[r39]
            if (r14 != 0) goto L_0x006d
            r25 = r7
            r14 = 1
            goto L_0x0070
        L_0x006d:
            r25 = r7
            r14 = 0
        L_0x0070:
            z.d r7 = r6.f15623f
            if (r7 == 0) goto L_0x007c
            if (r8 == r10) goto L_0x007c
            int r7 = r7.g()
            int r22 = r22 + r7
        L_0x007c:
            r7 = r22
            if (r5 == 0) goto L_0x0089
            if (r8 == r10) goto L_0x0089
            if (r8 == r12) goto L_0x0089
            r22 = r15
            r18 = 8
            goto L_0x008b
        L_0x0089:
            r22 = r15
        L_0x008b:
            z.d r15 = r6.f15623f
            r26 = r2
            if (r15 == 0) goto L_0x00bb
            if (r8 != r12) goto L_0x009e
            w.i r2 = r6.f15626i
            w.i r15 = r15.f15626i
            r27 = r10
            r10 = 6
            r9.i(r2, r15, r7, r10)
            goto L_0x00a9
        L_0x009e:
            r27 = r10
            w.i r2 = r6.f15626i
            w.i r10 = r15.f15626i
            r15 = 8
            r9.i(r2, r10, r7, r15)
        L_0x00a9:
            if (r14 == 0) goto L_0x00af
            if (r5 != 0) goto L_0x00af
            r2 = 5
            goto L_0x00b1
        L_0x00af:
            r2 = r18
        L_0x00b1:
            w.i r10 = r6.f15626i
            z.d r6 = r6.f15623f
            w.i r6 = r6.f15626i
            r9.e(r10, r6, r7, r2)
            goto L_0x00bd
        L_0x00bb:
            r27 = r10
        L_0x00bd:
            if (r4 == 0) goto L_0x00f1
            int r2 = r8.i0()
            r6 = 8
            if (r2 == r6) goto L_0x00df
            z.e$b[] r2 = r8.U
            r2 = r2[r39]
            if (r2 != r3) goto L_0x00df
            z.d[] r2 = r8.R
            int r3 = r40 + 1
            r3 = r2[r3]
            w.i r3 = r3.f15626i
            r2 = r2[r40]
            w.i r2 = r2.f15626i
            r6 = 5
            r7 = 0
            r9.i(r3, r2, r7, r6)
            goto L_0x00e0
        L_0x00df:
            r7 = 0
        L_0x00e0:
            z.d[] r2 = r8.R
            r2 = r2[r40]
            w.i r2 = r2.f15626i
            z.d[] r3 = r0.R
            r3 = r3[r40]
            w.i r3 = r3.f15626i
            r6 = 8
            r9.i(r2, r3, r7, r6)
        L_0x00f1:
            z.d[] r2 = r8.R
            int r3 = r40 + 1
            r2 = r2[r3]
            z.d r2 = r2.f15623f
            if (r2 == 0) goto L_0x010c
            z.e r2 = r2.f15621d
            z.d[] r3 = r2.R
            r3 = r3[r40]
            z.d r3 = r3.f15623f
            if (r3 == 0) goto L_0x010c
            z.e r3 = r3.f15621d
            if (r3 == r8) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r20 = r2
        L_0x010c:
            if (r20 == 0) goto L_0x0113
            r8 = r20
            r7 = r25
            goto L_0x0114
        L_0x0113:
            r7 = 1
        L_0x0114:
            r15 = r22
            r3 = r24
            r2 = r26
            r10 = r27
            goto L_0x0046
        L_0x011e:
            r26 = r2
            r24 = r3
            r27 = r10
            r22 = r15
            if (r13 == 0) goto L_0x0189
            z.d[] r2 = r11.R
            int r3 = r40 + 1
            r2 = r2[r3]
            z.d r2 = r2.f15623f
            if (r2 == 0) goto L_0x0189
            z.d[] r2 = r13.R
            r2 = r2[r3]
            z.e$b[] r6 = r13.U
            r6 = r6[r39]
            z.e$b r7 = z.e.b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0146
            int[] r6 = r13.f15676r
            r6 = r6[r39]
            if (r6 != 0) goto L_0x0146
            r6 = 1
            goto L_0x0147
        L_0x0146:
            r6 = 0
        L_0x0147:
            if (r6 == 0) goto L_0x015f
            if (r5 != 0) goto L_0x015f
            z.d r6 = r2.f15623f
            z.e r7 = r6.f15621d
            if (r7 != r0) goto L_0x015f
            w.i r7 = r2.f15626i
            w.i r6 = r6.f15626i
            int r8 = r2.g()
            int r8 = -r8
            r10 = 5
            r9.e(r7, r6, r8, r10)
            goto L_0x0175
        L_0x015f:
            r10 = 5
            if (r5 == 0) goto L_0x0175
            z.d r6 = r2.f15623f
            z.e r7 = r6.f15621d
            if (r7 != r0) goto L_0x0175
            w.i r7 = r2.f15626i
            w.i r6 = r6.f15626i
            int r8 = r2.g()
            int r8 = -r8
            r14 = 4
            r9.e(r7, r6, r8, r14)
        L_0x0175:
            w.i r6 = r2.f15626i
            z.d[] r7 = r11.R
            r3 = r7[r3]
            z.d r3 = r3.f15623f
            w.i r3 = r3.f15626i
            int r2 = r2.g()
            int r2 = -r2
            r7 = 6
            r9.k(r6, r3, r2, r7)
            goto L_0x018a
        L_0x0189:
            r10 = 5
        L_0x018a:
            if (r4 == 0) goto L_0x01a3
            z.d[] r0 = r0.R
            int r2 = r40 + 1
            r0 = r0[r2]
            w.i r0 = r0.f15626i
            z.d[] r3 = r11.R
            r2 = r3[r2]
            w.i r3 = r2.f15626i
            int r2 = r2.g()
            r4 = 8
            r9.i(r0, r3, r2, r4)
        L_0x01a3:
            java.util.ArrayList<z.e> r0 = r1.f15601h
            if (r0 == 0) goto L_0x0248
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0248
            boolean r3 = r1.f15611r
            if (r3 == 0) goto L_0x01ba
            boolean r3 = r1.f15613t
            if (r3 != 0) goto L_0x01ba
            int r3 = r1.f15603j
            float r3 = (float) r3
            goto L_0x01bc
        L_0x01ba:
            r3 = r24
        L_0x01bc:
            r4 = 0
            r29 = r4
            r6 = r20
            r7 = 0
        L_0x01c2:
            if (r7 >= r2) goto L_0x0248
            java.lang.Object r8 = r0.get(r7)
            z.e r8 = (z.e) r8
            float[] r14 = r8.F0
            r14 = r14[r39]
            int r15 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r15 >= 0) goto L_0x01ed
            boolean r14 = r1.f15613t
            if (r14 == 0) goto L_0x01e9
            z.d[] r8 = r8.R
            int r14 = r40 + 1
            r14 = r8[r14]
            w.i r14 = r14.f15626i
            r8 = r8[r40]
            w.i r8 = r8.f15626i
            r10 = 0
            r15 = 4
            r9.e(r14, r8, r10, r15)
            r4 = r10
            goto L_0x0204
        L_0x01e9:
            r15 = 4
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01ee
        L_0x01ed:
            r15 = 4
        L_0x01ee:
            int r10 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0207
            z.d[] r8 = r8.R
            int r10 = r40 + 1
            r10 = r8[r10]
            w.i r10 = r10.f15626i
            r8 = r8[r40]
            w.i r8 = r8.f15626i
            r4 = 0
            r14 = 8
            r9.e(r10, r8, r4, r14)
        L_0x0204:
            r17 = r0
            goto L_0x0240
        L_0x0207:
            r4 = 0
            if (r6 == 0) goto L_0x023b
            z.d[] r6 = r6.R
            r10 = r6[r40]
            w.i r10 = r10.f15626i
            int r17 = r40 + 1
            r6 = r6[r17]
            w.i r6 = r6.f15626i
            z.d[] r4 = r8.R
            r15 = r4[r40]
            w.i r15 = r15.f15626i
            r4 = r4[r17]
            w.i r4 = r4.f15626i
            r17 = r0
            w.b r0 = r38.v()
            r28 = r0
            r30 = r3
            r31 = r14
            r32 = r10
            r33 = r6
            r34 = r15
            r35 = r4
            r28.p(r29, r30, r31, r32, r33, r34, r35)
            r9.d(r0)
            goto L_0x023d
        L_0x023b:
            r17 = r0
        L_0x023d:
            r6 = r8
            r29 = r14
        L_0x0240:
            int r7 = r7 + 1
            r0 = r17
            r4 = 0
            r10 = 5
            goto L_0x01c2
        L_0x0248:
            if (r12 == 0) goto L_0x029d
            if (r12 == r13) goto L_0x024e
            if (r5 == 0) goto L_0x029d
        L_0x024e:
            r10 = r27
            z.d[] r0 = r10.R
            r0 = r0[r40]
            z.d[] r1 = r11.R
            int r2 = r40 + 1
            r1 = r1[r2]
            z.d r0 = r0.f15623f
            if (r0 == 0) goto L_0x0262
            w.i r0 = r0.f15626i
            r3 = r0
            goto L_0x0264
        L_0x0262:
            r3 = r20
        L_0x0264:
            z.d r0 = r1.f15623f
            if (r0 == 0) goto L_0x026c
            w.i r0 = r0.f15626i
            r5 = r0
            goto L_0x026e
        L_0x026c:
            r5 = r20
        L_0x026e:
            z.d[] r0 = r12.R
            r0 = r0[r40]
            z.d[] r1 = r13.R
            r1 = r1[r2]
            if (r3 == 0) goto L_0x04b1
            if (r5 == 0) goto L_0x04b1
            r2 = r26
            if (r39 != 0) goto L_0x0281
            float r2 = r2.f15661j0
            goto L_0x0283
        L_0x0281:
            float r2 = r2.f15663k0
        L_0x0283:
            r4 = r2
            int r6 = r0.g()
            int r7 = r1.g()
            w.i r2 = r0.f15626i
            w.i r8 = r1.f15626i
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04b1
        L_0x029d:
            r10 = r27
            if (r22 == 0) goto L_0x0389
            if (r12 == 0) goto L_0x0389
            int r0 = r1.f15603j
            if (r0 <= 0) goto L_0x02ae
            int r1 = r1.f15602i
            if (r1 != r0) goto L_0x02ae
            r18 = 1
            goto L_0x02b0
        L_0x02ae:
            r18 = 0
        L_0x02b0:
            r14 = r12
            r15 = r14
        L_0x02b2:
            if (r14 == 0) goto L_0x04b1
            z.e[] r0 = r14.H0
            r0 = r0[r39]
            r8 = r0
        L_0x02b9:
            if (r8 == 0) goto L_0x02c8
            int r0 = r8.i0()
            r6 = 8
            if (r0 != r6) goto L_0x02ca
            z.e[] r0 = r8.H0
            r8 = r0[r39]
            goto L_0x02b9
        L_0x02c8:
            r6 = 8
        L_0x02ca:
            if (r8 != 0) goto L_0x02d3
            if (r14 != r13) goto L_0x02cf
            goto L_0x02d3
        L_0x02cf:
            r17 = r8
            goto L_0x037c
        L_0x02d3:
            z.d[] r0 = r14.R
            r0 = r0[r40]
            w.i r1 = r0.f15626i
            z.d r2 = r0.f15623f
            if (r2 == 0) goto L_0x02e0
            w.i r2 = r2.f15626i
            goto L_0x02e2
        L_0x02e0:
            r2 = r20
        L_0x02e2:
            if (r15 == r14) goto L_0x02ed
            z.d[] r2 = r15.R
            int r3 = r40 + 1
            r2 = r2[r3]
        L_0x02ea:
            w.i r2 = r2.f15626i
            goto L_0x02fc
        L_0x02ed:
            if (r14 != r12) goto L_0x02fc
            if (r15 != r14) goto L_0x02fc
            z.d[] r2 = r10.R
            r2 = r2[r40]
            z.d r2 = r2.f15623f
            if (r2 == 0) goto L_0x02fa
            goto L_0x02ea
        L_0x02fa:
            r2 = r20
        L_0x02fc:
            int r0 = r0.g()
            z.d[] r3 = r14.R
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.g()
            if (r8 == 0) goto L_0x031e
            z.d[] r5 = r8.R
            r5 = r5[r40]
            w.i r7 = r5.f15626i
            z.d[] r6 = r14.R
            r6 = r6[r4]
            w.i r6 = r6.f15626i
            r36 = r7
            r7 = r6
            r6 = r36
            goto L_0x0331
        L_0x031e:
            z.d[] r5 = r11.R
            r5 = r5[r4]
            z.d r5 = r5.f15623f
            if (r5 == 0) goto L_0x0329
            w.i r6 = r5.f15626i
            goto L_0x032b
        L_0x0329:
            r6 = r20
        L_0x032b:
            z.d[] r7 = r14.R
            r7 = r7[r4]
            w.i r7 = r7.f15626i
        L_0x0331:
            if (r5 == 0) goto L_0x0338
            int r5 = r5.g()
            int r3 = r3 + r5
        L_0x0338:
            if (r15 == 0) goto L_0x0343
            z.d[] r5 = r15.R
            r5 = r5[r4]
            int r5 = r5.g()
            int r0 = r0 + r5
        L_0x0343:
            if (r1 == 0) goto L_0x02cf
            if (r2 == 0) goto L_0x02cf
            if (r6 == 0) goto L_0x02cf
            if (r7 == 0) goto L_0x02cf
            if (r14 != r12) goto L_0x0355
            z.d[] r0 = r12.R
            r0 = r0[r40]
            int r0 = r0.g()
        L_0x0355:
            r5 = r0
            if (r14 != r13) goto L_0x0363
            z.d[] r0 = r13.R
            r0 = r0[r4]
            int r0 = r0.g()
            r17 = r0
            goto L_0x0365
        L_0x0363:
            r17 = r3
        L_0x0365:
            if (r18 == 0) goto L_0x036a
            r23 = 8
            goto L_0x036c
        L_0x036a:
            r23 = 5
        L_0x036c:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r23
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x037c:
            int r0 = r14.i0()
            r8 = 8
            if (r0 == r8) goto L_0x0385
            r15 = r14
        L_0x0385:
            r14 = r17
            goto L_0x02b2
        L_0x0389:
            r8 = 8
            if (r16 == 0) goto L_0x04b1
            if (r12 == 0) goto L_0x04b1
            int r0 = r1.f15603j
            if (r0 <= 0) goto L_0x039a
            int r1 = r1.f15602i
            if (r1 != r0) goto L_0x039a
            r18 = 1
            goto L_0x039c
        L_0x039a:
            r18 = 0
        L_0x039c:
            r14 = r12
            r15 = r14
        L_0x039e:
            if (r14 == 0) goto L_0x0453
            z.e[] r0 = r14.H0
            r0 = r0[r39]
        L_0x03a4:
            if (r0 == 0) goto L_0x03b1
            int r1 = r0.i0()
            if (r1 != r8) goto L_0x03b1
            z.e[] r0 = r0.H0
            r0 = r0[r39]
            goto L_0x03a4
        L_0x03b1:
            if (r14 == r12) goto L_0x0440
            if (r14 == r13) goto L_0x0440
            if (r0 == 0) goto L_0x0440
            if (r0 != r13) goto L_0x03bc
            r7 = r20
            goto L_0x03bd
        L_0x03bc:
            r7 = r0
        L_0x03bd:
            z.d[] r0 = r14.R
            r0 = r0[r40]
            w.i r1 = r0.f15626i
            z.d r2 = r0.f15623f
            if (r2 == 0) goto L_0x03c9
            w.i r2 = r2.f15626i
        L_0x03c9:
            z.d[] r2 = r15.R
            int r3 = r40 + 1
            r2 = r2[r3]
            w.i r2 = r2.f15626i
            int r0 = r0.g()
            z.d[] r4 = r14.R
            r4 = r4[r3]
            int r4 = r4.g()
            if (r7 == 0) goto L_0x03ed
            z.d[] r5 = r7.R
            r5 = r5[r40]
            w.i r6 = r5.f15626i
            z.d r8 = r5.f15623f
            if (r8 == 0) goto L_0x03ea
            goto L_0x03fc
        L_0x03ea:
            r8 = r20
            goto L_0x03fe
        L_0x03ed:
            z.d[] r5 = r13.R
            r5 = r5[r40]
            if (r5 == 0) goto L_0x03f6
            w.i r6 = r5.f15626i
            goto L_0x03f8
        L_0x03f6:
            r6 = r20
        L_0x03f8:
            z.d[] r8 = r14.R
            r8 = r8[r3]
        L_0x03fc:
            w.i r8 = r8.f15626i
        L_0x03fe:
            if (r5 == 0) goto L_0x0405
            int r5 = r5.g()
            int r4 = r4 + r5
        L_0x0405:
            r17 = r4
            z.d[] r4 = r15.R
            r3 = r4[r3]
            int r3 = r3.g()
            int r3 = r3 + r0
            if (r18 == 0) goto L_0x0415
            r19 = 8
            goto L_0x0417
        L_0x0415:
            r19 = 4
        L_0x0417:
            if (r1 == 0) goto L_0x0435
            if (r2 == 0) goto L_0x0435
            if (r6 == 0) goto L_0x0435
            if (r8 == 0) goto L_0x0435
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r21 = 4
            r6 = r8
            r23 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r19
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x043d
        L_0x0435:
            r23 = r7
            r17 = r15
            r15 = 8
            r21 = 4
        L_0x043d:
            r0 = r23
            goto L_0x0445
        L_0x0440:
            r17 = r15
            r21 = 4
            r15 = r8
        L_0x0445:
            int r1 = r14.i0()
            if (r1 == r15) goto L_0x044c
            goto L_0x044e
        L_0x044c:
            r14 = r17
        L_0x044e:
            r8 = r15
            r15 = r14
            r14 = r0
            goto L_0x039e
        L_0x0453:
            z.d[] r0 = r12.R
            r0 = r0[r40]
            z.d[] r1 = r10.R
            r1 = r1[r40]
            z.d r1 = r1.f15623f
            z.d[] r2 = r13.R
            int r3 = r40 + 1
            r10 = r2[r3]
            z.d[] r2 = r11.R
            r2 = r2[r3]
            z.d r14 = r2.f15623f
            if (r1 == 0) goto L_0x04a0
            if (r12 == r13) goto L_0x047a
            w.i r2 = r0.f15626i
            w.i r1 = r1.f15626i
            int r0 = r0.g()
            r15 = 5
            r9.e(r2, r1, r0, r15)
            goto L_0x04a1
        L_0x047a:
            r15 = 5
            if (r14 == 0) goto L_0x04a1
            w.i r2 = r0.f15626i
            w.i r3 = r1.f15626i
            int r4 = r0.g()
            r5 = 1056964608(0x3f000000, float:0.5)
            w.i r6 = r10.f15626i
            w.i r7 = r14.f15626i
            int r8 = r10.g()
            r17 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04a1
        L_0x04a0:
            r15 = 5
        L_0x04a1:
            if (r14 == 0) goto L_0x04b1
            if (r12 == r13) goto L_0x04b1
            w.i r0 = r10.f15626i
            w.i r1 = r14.f15626i
            int r2 = r10.g()
            int r2 = -r2
            r9.e(r0, r1, r2, r15)
        L_0x04b1:
            if (r22 != 0) goto L_0x04b5
            if (r16 == 0) goto L_0x050c
        L_0x04b5:
            if (r12 == 0) goto L_0x050c
            if (r12 == r13) goto L_0x050c
            z.d[] r0 = r12.R
            r1 = r0[r40]
            z.d[] r2 = r13.R
            r3 = 1
            int r3 = r40 + 1
            r2 = r2[r3]
            z.d r4 = r1.f15623f
            if (r4 == 0) goto L_0x04cb
            w.i r4 = r4.f15626i
            goto L_0x04cd
        L_0x04cb:
            r4 = r20
        L_0x04cd:
            z.d r5 = r2.f15623f
            if (r5 == 0) goto L_0x04d4
            w.i r5 = r5.f15626i
            goto L_0x04d6
        L_0x04d4:
            r5 = r20
        L_0x04d6:
            if (r11 == r13) goto L_0x04e6
            z.d[] r5 = r11.R
            r5 = r5[r3]
            z.d r5 = r5.f15623f
            if (r5 == 0) goto L_0x04e4
            w.i r5 = r5.f15626i
            r20 = r5
        L_0x04e4:
            r5 = r20
        L_0x04e6:
            if (r12 != r13) goto L_0x04ea
            r2 = r0[r3]
        L_0x04ea:
            if (r4 == 0) goto L_0x050c
            if (r5 == 0) goto L_0x050c
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.g()
            z.d[] r0 = r13.R
            r0 = r0[r3]
            int r8 = r0.g()
            w.i r1 = r1.f15626i
            w.i r10 = r2.f15626i
            r11 = 5
            r0 = r38
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x050c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.b.a(z.f, w.e, int, int, z.c):void");
    }

    public static void b(f fVar, e eVar, ArrayList<e> arrayList, int i10) {
        c[] cVarArr;
        int i11;
        int i12;
        if (i10 == 0) {
            i12 = fVar.f15706z1;
            cVarArr = fVar.C1;
            i11 = 0;
        } else {
            int i13 = fVar.A1;
            cVarArr = fVar.B1;
            int i14 = i13;
            i11 = 2;
            i12 = i14;
        }
        for (int i15 = 0; i15 < i12; i15++) {
            c cVar = cVarArr[i15];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f15594a)) {
                a(fVar, eVar, i10, i11, cVar);
            }
        }
    }
}
