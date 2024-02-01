package a0;

import java.util.ArrayList;
import java.util.Iterator;
import z.e;
import z.f;

public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<p> f26k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public int f27l;

    public c(e eVar, int i10) {
        super(eVar);
        this.f93f = i10;
        u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x019f, code lost:
        if (r1 != r7) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c5, code lost:
        if (r1 != r7) goto L_0x01c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(a0.d r26) {
        /*
            r25 = this;
            r0 = r25
            a0.f r1 = r0.f95h
            boolean r1 = r1.f47j
            if (r1 == 0) goto L_0x0407
            a0.f r1 = r0.f96i
            boolean r1 = r1.f47j
            if (r1 != 0) goto L_0x0010
            goto L_0x0407
        L_0x0010:
            z.e r1 = r0.f89b
            z.e r1 = r1.U()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof z.f
            if (r3 == 0) goto L_0x0023
            z.f r1 = (z.f) r1
            boolean r1 = r1.s2()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            a0.f r3 = r0.f96i
            int r3 = r3.f44g
            a0.f r4 = r0.f95h
            int r4 = r4.f44g
            int r3 = r3 - r4
            java.util.ArrayList<a0.p> r4 = r0.f26k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<a0.p> r8 = r0.f26k
            java.lang.Object r8 = r8.get(r5)
            a0.p r8 = (a0.p) r8
            z.e r8 = r8.f89b
            int r8 = r8.i0()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = r6
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<a0.p> r10 = r0.f26k
            java.lang.Object r10 = r10.get(r9)
            a0.p r10 = (a0.p) r10
            z.e r10 = r10.f89b
            int r10 = r10.i0()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            if (r9 >= r11) goto L_0x010b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0071:
            if (r13 >= r4) goto L_0x00fd
            java.util.ArrayList<a0.p> r2 = r0.f26k
            java.lang.Object r2 = r2.get(r13)
            a0.p r2 = (a0.p) r2
            z.e r11 = r2.f89b
            int r11 = r11.i0()
            if (r11 != r7) goto L_0x0085
            goto L_0x00f6
        L_0x0085:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0090
            if (r13 < r5) goto L_0x0090
            a0.f r11 = r2.f95h
            int r11 = r11.f43f
            int r14 = r14 + r11
        L_0x0090:
            a0.g r11 = r2.f92e
            int r7 = r11.f44g
            z.e$b r10 = r2.f91d
            z.e$b r12 = z.e.b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009c
            r10 = 1
            goto L_0x009d
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 == 0) goto L_0x00bf
            int r11 = r0.f93f
            if (r11 != 0) goto L_0x00ae
            z.e r12 = r2.f89b
            a0.l r12 = r12.f15650e
            a0.g r12 = r12.f92e
            boolean r12 = r12.f47j
            if (r12 != 0) goto L_0x00ae
            return
        L_0x00ae:
            r12 = 1
            if (r11 != r12) goto L_0x00bc
            z.e r11 = r2.f89b
            a0.n r11 = r11.f15652f
            a0.g r11 = r11.f92e
            boolean r11 = r11.f47j
            if (r11 != 0) goto L_0x00bc
            return
        L_0x00bc:
            r19 = r7
            goto L_0x00d5
        L_0x00bf:
            r19 = r7
            r12 = 1
            int r7 = r2.f88a
            if (r7 != r12) goto L_0x00cd
            if (r9 != 0) goto L_0x00cd
            int r7 = r11.f50m
            int r15 = r15 + 1
            goto L_0x00d3
        L_0x00cd:
            boolean r7 = r11.f47j
            if (r7 == 0) goto L_0x00d5
            r7 = r19
        L_0x00d3:
            r10 = 1
            goto L_0x00d7
        L_0x00d5:
            r7 = r19
        L_0x00d7:
            if (r10 != 0) goto L_0x00eb
            int r15 = r15 + 1
            z.e r7 = r2.f89b
            float[] r7 = r7.F0
            int r10 = r0.f93f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ec
            float r17 = r17 + r7
            goto L_0x00ec
        L_0x00eb:
            int r14 = r14 + r7
        L_0x00ec:
            if (r13 >= r8) goto L_0x00f6
            if (r13 >= r6) goto L_0x00f6
            a0.f r2 = r2.f96i
            int r2 = r2.f43f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f6:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0071
        L_0x00fd:
            if (r14 < r3) goto L_0x0108
            if (r15 != 0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0108:
            r2 = r16
            goto L_0x0110
        L_0x010b:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x0110:
            a0.f r7 = r0.f95h
            int r7 = r7.f44g
            if (r1 == 0) goto L_0x011a
            a0.f r7 = r0.f96i
            int r7 = r7.f44g
        L_0x011a:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x012b
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x012a
            int r7 = r7 + r10
            goto L_0x012b
        L_0x012a:
            int r7 = r7 - r10
        L_0x012b:
            if (r15 <= 0) goto L_0x0238
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x0137:
            if (r12 >= r4) goto L_0x01ea
            java.util.ArrayList<a0.p> r9 = r0.f26k
            java.lang.Object r9 = r9.get(r12)
            a0.p r9 = (a0.p) r9
            r19 = r11
            z.e r11 = r9.f89b
            int r11 = r11.i0()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0151
            goto L_0x01d0
        L_0x0151:
            z.e$b r11 = r9.f91d
            z.e$b r14 = z.e.b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01d0
            a0.g r11 = r9.f92e
            boolean r14 = r11.f47j
            if (r14 != 0) goto L_0x01d0
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0174
            z.e r14 = r9.f89b
            float[] r14 = r14.F0
            r21 = r7
            int r7 = r0.f93f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x0178
        L_0x0174:
            r21 = r7
            r7 = r19
        L_0x0178:
            int r14 = r0.f93f
            if (r14 != 0) goto L_0x01a2
            z.e r14 = r9.f89b
            r22 = r10
            int r10 = r14.f15680t
            int r14 = r14.f15678s
            r23 = r1
            int r1 = r9.f88a
            r24 = r2
            r2 = 1
            if (r1 != r2) goto L_0x0194
            int r1 = r11.f50m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x0195
        L_0x0194:
            r1 = r7
        L_0x0195:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x019f
            int r1 = java.lang.Math.min(r10, r1)
        L_0x019f:
            if (r1 == r7) goto L_0x01ca
            goto L_0x01c7
        L_0x01a2:
            r23 = r1
            r24 = r2
            r22 = r10
            z.e r1 = r9.f89b
            int r2 = r1.f15686w
            int r1 = r1.f15684v
            int r10 = r9.f88a
            r14 = 1
            if (r10 != r14) goto L_0x01ba
            int r10 = r11.f50m
            int r10 = java.lang.Math.min(r7, r10)
            goto L_0x01bb
        L_0x01ba:
            r10 = r7
        L_0x01bb:
            int r1 = java.lang.Math.max(r1, r10)
            if (r2 <= 0) goto L_0x01c5
            int r1 = java.lang.Math.min(r2, r1)
        L_0x01c5:
            if (r1 == r7) goto L_0x01ca
        L_0x01c7:
            int r13 = r13 + 1
            r7 = r1
        L_0x01ca:
            a0.g r1 = r9.f92e
            r1.e(r7)
            goto L_0x01d8
        L_0x01d0:
            r23 = r1
            r24 = r2
            r21 = r7
            r22 = r10
        L_0x01d8:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r2 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0137
        L_0x01ea:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0229
            int r15 = r15 - r13
            r1 = 0
            r2 = 0
        L_0x01f7:
            if (r1 >= r4) goto L_0x0227
            java.util.ArrayList<a0.p> r7 = r0.f26k
            java.lang.Object r7 = r7.get(r1)
            a0.p r7 = (a0.p) r7
            z.e r9 = r7.f89b
            int r9 = r9.i0()
            r10 = 8
            if (r9 != r10) goto L_0x020c
            goto L_0x0224
        L_0x020c:
            if (r1 <= 0) goto L_0x0215
            if (r1 < r5) goto L_0x0215
            a0.f r9 = r7.f95h
            int r9 = r9.f43f
            int r2 = r2 + r9
        L_0x0215:
            a0.g r9 = r7.f92e
            int r9 = r9.f44g
            int r2 = r2 + r9
            if (r1 >= r8) goto L_0x0224
            if (r1 >= r6) goto L_0x0224
            a0.f r7 = r7.f96i
            int r7 = r7.f43f
            int r7 = -r7
            int r2 = r2 + r7
        L_0x0224:
            int r1 = r1 + 1
            goto L_0x01f7
        L_0x0227:
            r14 = r2
            goto L_0x022b
        L_0x0229:
            r14 = r20
        L_0x022b:
            int r1 = r0.f27l
            r2 = 2
            if (r1 != r2) goto L_0x0236
            if (r13 != 0) goto L_0x0236
            r1 = 0
            r0.f27l = r1
            goto L_0x0242
        L_0x0236:
            r1 = 0
            goto L_0x0242
        L_0x0238:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            r1 = 0
            r2 = 2
        L_0x0242:
            if (r14 <= r3) goto L_0x0246
            r0.f27l = r2
        L_0x0246:
            if (r24 <= 0) goto L_0x024e
            if (r15 != 0) goto L_0x024e
            if (r5 != r6) goto L_0x024e
            r0.f27l = r2
        L_0x024e:
            int r2 = r0.f27l
            r7 = 1
            r9 = r24
            if (r2 != r7) goto L_0x02e2
            if (r9 <= r7) goto L_0x025c
            int r3 = r3 - r14
            int r2 = r9 + -1
            int r3 = r3 / r2
            goto L_0x0263
        L_0x025c:
            if (r9 != r7) goto L_0x0262
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x0263
        L_0x0262:
            r3 = r1
        L_0x0263:
            if (r15 <= 0) goto L_0x0266
            r3 = r1
        L_0x0266:
            r2 = r1
            r7 = r21
        L_0x0269:
            if (r2 >= r4) goto L_0x0407
            if (r23 == 0) goto L_0x0272
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x0273
        L_0x0272:
            r1 = r2
        L_0x0273:
            java.util.ArrayList<a0.p> r9 = r0.f26k
            java.lang.Object r1 = r9.get(r1)
            a0.p r1 = (a0.p) r1
            z.e r9 = r1.f89b
            int r9 = r9.i0()
            r10 = 8
            if (r9 != r10) goto L_0x0290
            a0.f r9 = r1.f95h
            r9.e(r7)
            a0.f r1 = r1.f96i
            r1.e(r7)
            goto L_0x02df
        L_0x0290:
            if (r2 <= 0) goto L_0x0297
            if (r23 == 0) goto L_0x0296
            int r7 = r7 - r3
            goto L_0x0297
        L_0x0296:
            int r7 = r7 + r3
        L_0x0297:
            if (r2 <= 0) goto L_0x02a4
            if (r2 < r5) goto L_0x02a4
            a0.f r9 = r1.f95h
            int r9 = r9.f43f
            if (r23 == 0) goto L_0x02a3
            int r7 = r7 - r9
            goto L_0x02a4
        L_0x02a3:
            int r7 = r7 + r9
        L_0x02a4:
            if (r23 == 0) goto L_0x02a9
            a0.f r9 = r1.f96i
            goto L_0x02ab
        L_0x02a9:
            a0.f r9 = r1.f95h
        L_0x02ab:
            r9.e(r7)
            a0.g r9 = r1.f92e
            int r10 = r9.f44g
            z.e$b r11 = r1.f91d
            z.e$b r12 = z.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02bf
            int r11 = r1.f88a
            r12 = 1
            if (r11 != r12) goto L_0x02bf
            int r10 = r9.f50m
        L_0x02bf:
            if (r23 == 0) goto L_0x02c3
            int r7 = r7 - r10
            goto L_0x02c4
        L_0x02c3:
            int r7 = r7 + r10
        L_0x02c4:
            if (r23 == 0) goto L_0x02c9
            a0.f r9 = r1.f95h
            goto L_0x02cb
        L_0x02c9:
            a0.f r9 = r1.f96i
        L_0x02cb:
            r9.e(r7)
            r9 = 1
            r1.f94g = r9
            if (r2 >= r8) goto L_0x02df
            if (r2 >= r6) goto L_0x02df
            a0.f r1 = r1.f96i
            int r1 = r1.f43f
            int r1 = -r1
            if (r23 == 0) goto L_0x02de
            int r7 = r7 - r1
            goto L_0x02df
        L_0x02de:
            int r7 = r7 + r1
        L_0x02df:
            int r2 = r2 + 1
            goto L_0x0269
        L_0x02e2:
            if (r2 != 0) goto L_0x0367
            int r3 = r3 - r14
            r2 = 1
            int r7 = r9 + 1
            int r3 = r3 / r7
            if (r15 <= 0) goto L_0x02ec
            r3 = r1
        L_0x02ec:
            r2 = r1
            r7 = r21
        L_0x02ef:
            if (r2 >= r4) goto L_0x0407
            if (r23 == 0) goto L_0x02f8
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x02f9
        L_0x02f8:
            r1 = r2
        L_0x02f9:
            java.util.ArrayList<a0.p> r9 = r0.f26k
            java.lang.Object r1 = r9.get(r1)
            a0.p r1 = (a0.p) r1
            z.e r9 = r1.f89b
            int r9 = r9.i0()
            r10 = 8
            if (r9 != r10) goto L_0x0316
            a0.f r9 = r1.f95h
            r9.e(r7)
            a0.f r1 = r1.f96i
            r1.e(r7)
            goto L_0x0364
        L_0x0316:
            if (r23 == 0) goto L_0x031a
            int r7 = r7 - r3
            goto L_0x031b
        L_0x031a:
            int r7 = r7 + r3
        L_0x031b:
            if (r2 <= 0) goto L_0x0328
            if (r2 < r5) goto L_0x0328
            a0.f r9 = r1.f95h
            int r9 = r9.f43f
            if (r23 == 0) goto L_0x0327
            int r7 = r7 - r9
            goto L_0x0328
        L_0x0327:
            int r7 = r7 + r9
        L_0x0328:
            if (r23 == 0) goto L_0x032d
            a0.f r9 = r1.f96i
            goto L_0x032f
        L_0x032d:
            a0.f r9 = r1.f95h
        L_0x032f:
            r9.e(r7)
            a0.g r9 = r1.f92e
            int r10 = r9.f44g
            z.e$b r11 = r1.f91d
            z.e$b r12 = z.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0347
            int r11 = r1.f88a
            r12 = 1
            if (r11 != r12) goto L_0x0347
            int r9 = r9.f50m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0347:
            if (r23 == 0) goto L_0x034b
            int r7 = r7 - r10
            goto L_0x034c
        L_0x034b:
            int r7 = r7 + r10
        L_0x034c:
            if (r23 == 0) goto L_0x0351
            a0.f r9 = r1.f95h
            goto L_0x0353
        L_0x0351:
            a0.f r9 = r1.f96i
        L_0x0353:
            r9.e(r7)
            if (r2 >= r8) goto L_0x0364
            if (r2 >= r6) goto L_0x0364
            a0.f r1 = r1.f96i
            int r1 = r1.f43f
            int r1 = -r1
            if (r23 == 0) goto L_0x0363
            int r7 = r7 - r1
            goto L_0x0364
        L_0x0363:
            int r7 = r7 + r1
        L_0x0364:
            int r2 = r2 + 1
            goto L_0x02ef
        L_0x0367:
            r7 = 2
            if (r2 != r7) goto L_0x0407
            int r2 = r0.f93f
            if (r2 != 0) goto L_0x0375
            z.e r2 = r0.f89b
            float r2 = r2.E()
            goto L_0x037b
        L_0x0375:
            z.e r2 = r0.f89b
            float r2 = r2.d0()
        L_0x037b:
            if (r23 == 0) goto L_0x0381
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = r7 - r2
        L_0x0381:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x038c
            if (r15 <= 0) goto L_0x038d
        L_0x038c:
            r2 = r1
        L_0x038d:
            if (r23 == 0) goto L_0x0392
            int r7 = r21 - r2
            goto L_0x0394
        L_0x0392:
            int r7 = r21 + r2
        L_0x0394:
            r2 = r1
        L_0x0395:
            if (r2 >= r4) goto L_0x0407
            if (r23 == 0) goto L_0x039e
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x039f
        L_0x039e:
            r1 = r2
        L_0x039f:
            java.util.ArrayList<a0.p> r3 = r0.f26k
            java.lang.Object r1 = r3.get(r1)
            a0.p r1 = (a0.p) r1
            z.e r3 = r1.f89b
            int r3 = r3.i0()
            r9 = 8
            if (r3 != r9) goto L_0x03bd
            a0.f r3 = r1.f95h
            r3.e(r7)
            a0.f r1 = r1.f96i
            r1.e(r7)
            r12 = 1
            goto L_0x0404
        L_0x03bd:
            if (r2 <= 0) goto L_0x03ca
            if (r2 < r5) goto L_0x03ca
            a0.f r3 = r1.f95h
            int r3 = r3.f43f
            if (r23 == 0) goto L_0x03c9
            int r7 = r7 - r3
            goto L_0x03ca
        L_0x03c9:
            int r7 = r7 + r3
        L_0x03ca:
            if (r23 == 0) goto L_0x03cf
            a0.f r3 = r1.f96i
            goto L_0x03d1
        L_0x03cf:
            a0.f r3 = r1.f95h
        L_0x03d1:
            r3.e(r7)
            a0.g r3 = r1.f92e
            int r10 = r3.f44g
            z.e$b r11 = r1.f91d
            z.e$b r12 = z.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03e6
            int r11 = r1.f88a
            r12 = 1
            if (r11 != r12) goto L_0x03e7
            int r10 = r3.f50m
            goto L_0x03e7
        L_0x03e6:
            r12 = 1
        L_0x03e7:
            if (r23 == 0) goto L_0x03eb
            int r7 = r7 - r10
            goto L_0x03ec
        L_0x03eb:
            int r7 = r7 + r10
        L_0x03ec:
            if (r23 == 0) goto L_0x03f1
            a0.f r3 = r1.f95h
            goto L_0x03f3
        L_0x03f1:
            a0.f r3 = r1.f96i
        L_0x03f3:
            r3.e(r7)
            if (r2 >= r8) goto L_0x0404
            if (r2 >= r6) goto L_0x0404
            a0.f r1 = r1.f96i
            int r1 = r1.f43f
            int r1 = -r1
            if (r23 == 0) goto L_0x0403
            int r7 = r7 - r1
            goto L_0x0404
        L_0x0403:
            int r7 = r7 + r1
        L_0x0404:
            int r2 = r2 + 1
            goto L_0x0395
        L_0x0407:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.c.a(a0.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList<a0.p> r0 = r5.f26k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            a0.p r1 = (a0.p) r1
            r1.d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<a0.p> r0 = r5.f26k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<a0.p> r2 = r5.f26k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            a0.p r2 = (a0.p) r2
            z.e r2 = r2.f89b
            java.util.ArrayList<a0.p> r4 = r5.f26k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            a0.p r0 = (a0.p) r0
            z.e r0 = r0.f89b
            int r4 = r5.f93f
            if (r4 != 0) goto L_0x0070
            z.d r1 = r2.J
            z.d r0 = r0.L
            a0.f r2 = r5.i(r1, r3)
            int r1 = r1.g()
            z.e r4 = r5.v()
            if (r4 == 0) goto L_0x0052
            z.d r1 = r4.J
            int r1 = r1.g()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            a0.f r4 = r5.f95h
            r5.b(r4, r2, r1)
        L_0x0059:
            a0.f r1 = r5.i(r0, r3)
            int r0 = r0.g()
            z.e r2 = r5.w()
            if (r2 == 0) goto L_0x006d
            z.d r0 = r2.L
            int r0 = r0.g()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            z.d r2 = r2.K
            z.d r0 = r0.M
            a0.f r3 = r5.i(r2, r1)
            int r2 = r2.g()
            z.e r4 = r5.v()
            if (r4 == 0) goto L_0x0088
            z.d r2 = r4.K
            int r2 = r2.g()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            a0.f r4 = r5.f95h
            r5.b(r4, r3, r2)
        L_0x008f:
            a0.f r1 = r5.i(r0, r1)
            int r0 = r0.g()
            z.e r2 = r5.w()
            if (r2 == 0) goto L_0x00a3
            z.d r0 = r2.M
            int r0 = r0.g()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            a0.f r2 = r5.f96i
            int r0 = -r0
            r5.b(r2, r1, r0)
        L_0x00ab:
            a0.f r0 = r5.f95h
            r0.f38a = r5
            a0.f r0 = r5.f96i
            r0.f38a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.c.d():void");
    }

    public void e() {
        for (int i10 = 0; i10 < this.f26k.size(); i10++) {
            this.f26k.get(i10).e();
        }
    }

    public void f() {
        this.f90c = null;
        Iterator<p> it = this.f26k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public long j() {
        int size = this.f26k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f26k.get(i10);
            j10 = j10 + ((long) pVar.f95h.f43f) + pVar.j() + ((long) pVar.f96i.f43f);
        }
        return j10;
    }

    public void n() {
        this.f95h.f47j = false;
        this.f96i.f47j = false;
    }

    public boolean p() {
        int size = this.f26k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f26k.get(i10).p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        sb2.append(this.f93f == 0 ? "horizontal : " : "vertical : ");
        String sb3 = sb2.toString();
        Iterator<p> it = this.f26k.iterator();
        while (it.hasNext()) {
            sb3 = ((sb3 + "<") + it.next()) + "> ";
        }
        return sb3;
    }

    public final void u() {
        e eVar;
        e eVar2 = this.f89b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.V(this.f93f);
        } while (eVar2 != null);
        this.f89b = eVar;
        this.f26k.add(eVar.a0(this.f93f));
        e R = eVar.R(this.f93f);
        while (R != null) {
            this.f26k.add(R.a0(this.f93f));
            R = R.R(this.f93f);
        }
        Iterator<p> it = this.f26k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f93f;
            if (i10 == 0) {
                next.f89b.f15646c = this;
            } else if (i10 == 1) {
                next.f89b.f15648d = this;
            }
        }
        if ((this.f93f == 0 && ((f) this.f89b.U()).s2()) && this.f26k.size() > 1) {
            ArrayList<p> arrayList = this.f26k;
            this.f89b = arrayList.get(arrayList.size() - 1).f89b;
        }
        this.f27l = this.f93f == 0 ? this.f89b.G() : this.f89b.f0();
    }

    public final e v() {
        for (int i10 = 0; i10 < this.f26k.size(); i10++) {
            p pVar = this.f26k.get(i10);
            if (pVar.f89b.i0() != 8) {
                return pVar.f89b;
            }
        }
        return null;
    }

    public final e w() {
        for (int size = this.f26k.size() - 1; size >= 0; size--) {
            p pVar = this.f26k.get(size);
            if (pVar.f89b.i0() != 8) {
                return pVar.f89b;
            }
        }
        return null;
    }
}
