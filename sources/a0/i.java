package a0;

import java.util.ArrayList;
import z.d;
import z.e;
import z.h;
import z.j;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f54a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f55b = false;

    public static o a(e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        d dVar;
        int P1;
        int i11 = i10 == 0 ? eVar.K0 : eVar.L0;
        int i12 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f75b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i13);
                if (oVar2.f() == i11) {
                    if (oVar != null) {
                        oVar.m(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof j) && (P1 = ((j) eVar).P1(i10)) != -1) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i14);
                    if (oVar3.f() == P1) {
                        oVar = oVar3;
                        break;
                    }
                    i14++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                d P12 = hVar.P1();
                if (hVar.Q1() == 0) {
                    i12 = 1;
                }
                P12.d(i12, arrayList, oVar);
            }
            int f10 = oVar.f();
            if (i10 == 0) {
                eVar.K0 = f10;
                eVar.J.d(i10, arrayList, oVar);
                dVar = eVar.L;
            } else {
                eVar.L0 = f10;
                eVar.K.d(i10, arrayList, oVar);
                eVar.N.d(i10, arrayList, oVar);
                dVar = eVar.M;
            }
            dVar.d(i10, arrayList, oVar);
            eVar.Q.d(i10, arrayList, oVar);
        }
        return oVar;
    }

    public static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.f75b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x038d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(z.f r16, a0.b.C0002b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.P1()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            z.e r5 = (z.e) r5
            z.e$b r6 = r16.H()
            z.e$b r7 = r16.g0()
            z.e$b r8 = r5.H()
            z.e$b r9 = r5.g0()
            boolean r6 = d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof z.g
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            w.f r4 = r0.f15700t1
            if (r4 == 0) goto L_0x003e
            long r5 = r4.Q
            r7 = 1
            long r5 = r5 + r7
            r4.Q = r5
        L_0x003e:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0045:
            r12 = 1
            if (r5 >= r2) goto L_0x011c
            java.lang.Object r13 = r1.get(r5)
            z.e r13 = (z.e) r13
            z.e$b r14 = r16.H()
            z.e$b r15 = r16.g0()
            z.e$b r3 = r13.H()
            z.e$b r4 = r13.g0()
            boolean r3 = d(r14, r15, r3, r4)
            if (r3 != 0) goto L_0x006e
            a0.b$a r3 = r0.R1
            int r4 = a0.b.a.f13k
            r14 = r17
            z.f.v2(r13, r14, r3, r4)
            goto L_0x0070
        L_0x006e:
            r14 = r17
        L_0x0070:
            boolean r3 = r13 instanceof z.h
            if (r3 == 0) goto L_0x0097
            r4 = r13
            z.h r4 = (z.h) r4
            int r15 = r4.Q1()
            if (r15 != 0) goto L_0x0087
            if (r8 != 0) goto L_0x0084
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0084:
            r8.add(r4)
        L_0x0087:
            int r15 = r4.Q1()
            if (r15 != r12) goto L_0x0097
            if (r6 != 0) goto L_0x0094
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0094:
            r6.add(r4)
        L_0x0097:
            boolean r4 = r13 instanceof z.j
            if (r4 == 0) goto L_0x00d7
            boolean r4 = r13 instanceof z.a
            if (r4 == 0) goto L_0x00c0
            r4 = r13
            z.a r4 = (z.a) r4
            int r15 = r4.U1()
            if (r15 != 0) goto L_0x00b2
            if (r7 != 0) goto L_0x00af
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00af:
            r7.add(r4)
        L_0x00b2:
            int r15 = r4.U1()
            if (r15 != r12) goto L_0x00d7
            if (r9 != 0) goto L_0x00d4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x00d4
        L_0x00c0:
            r4 = r13
            z.j r4 = (z.j) r4
            if (r7 != 0) goto L_0x00ca
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00ca:
            r7.add(r4)
            if (r9 != 0) goto L_0x00d4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00d4:
            r9.add(r4)
        L_0x00d7:
            z.d r4 = r13.J
            z.d r4 = r4.f15623f
            if (r4 != 0) goto L_0x00f4
            z.d r4 = r13.L
            z.d r4 = r4.f15623f
            if (r4 != 0) goto L_0x00f4
            if (r3 != 0) goto L_0x00f4
            boolean r4 = r13 instanceof z.a
            if (r4 != 0) goto L_0x00f4
            if (r10 != 0) goto L_0x00f1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r10 = r4
        L_0x00f1:
            r10.add(r13)
        L_0x00f4:
            z.d r4 = r13.K
            z.d r4 = r4.f15623f
            if (r4 != 0) goto L_0x0117
            z.d r4 = r13.M
            z.d r4 = r4.f15623f
            if (r4 != 0) goto L_0x0117
            z.d r4 = r13.N
            z.d r4 = r4.f15623f
            if (r4 != 0) goto L_0x0117
            if (r3 != 0) goto L_0x0117
            boolean r3 = r13 instanceof z.a
            if (r3 != 0) goto L_0x0117
            if (r11 != 0) goto L_0x0114
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0114:
            r11.add(r13)
        L_0x0117:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0045
        L_0x011c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x0139
            java.util.Iterator r4 = r6.iterator()
        L_0x0127:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0139
            java.lang.Object r5 = r4.next()
            z.h r5 = (z.h) r5
            r6 = 0
            r13 = 0
            a(r5, r6, r3, r13)
            goto L_0x0127
        L_0x0139:
            r6 = 0
            r13 = 0
            if (r7 == 0) goto L_0x015a
            java.util.Iterator r4 = r7.iterator()
        L_0x0141:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x015a
            java.lang.Object r5 = r4.next()
            z.j r5 = (z.j) r5
            a0.o r7 = a(r5, r6, r3, r13)
            r5.O1(r3, r6, r7)
            r7.c(r3)
            r6 = 0
            r13 = 0
            goto L_0x0141
        L_0x015a:
            z.d$b r4 = z.d.b.LEFT
            z.d r4 = r0.r(r4)
            java.util.HashSet r5 = r4.e()
            if (r5 == 0) goto L_0x0182
            java.util.HashSet r4 = r4.e()
            java.util.Iterator r4 = r4.iterator()
        L_0x016e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0182
            java.lang.Object r5 = r4.next()
            z.d r5 = (z.d) r5
            z.e r5 = r5.f15621d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x016e
        L_0x0182:
            z.d$b r4 = z.d.b.RIGHT
            z.d r4 = r0.r(r4)
            java.util.HashSet r5 = r4.e()
            if (r5 == 0) goto L_0x01aa
            java.util.HashSet r4 = r4.e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0196:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01aa
            java.lang.Object r5 = r4.next()
            z.d r5 = (z.d) r5
            z.e r5 = r5.f15621d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0196
        L_0x01aa:
            z.d$b r4 = z.d.b.CENTER
            z.d r4 = r0.r(r4)
            java.util.HashSet r5 = r4.e()
            if (r5 == 0) goto L_0x01d2
            java.util.HashSet r4 = r4.e()
            java.util.Iterator r4 = r4.iterator()
        L_0x01be:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01d2
            java.lang.Object r5 = r4.next()
            z.d r5 = (z.d) r5
            z.e r5 = r5.f15621d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x01be
        L_0x01d2:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01ea
            java.util.Iterator r4 = r10.iterator()
        L_0x01da:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ea
            java.lang.Object r5 = r4.next()
            z.e r5 = (z.e) r5
            a(r5, r6, r3, r7)
            goto L_0x01da
        L_0x01ea:
            if (r8 == 0) goto L_0x0200
            java.util.Iterator r4 = r8.iterator()
        L_0x01f0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0200
            java.lang.Object r5 = r4.next()
            z.h r5 = (z.h) r5
            a(r5, r12, r3, r7)
            goto L_0x01f0
        L_0x0200:
            if (r9 == 0) goto L_0x021e
            java.util.Iterator r4 = r9.iterator()
        L_0x0206:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x021e
            java.lang.Object r5 = r4.next()
            z.j r5 = (z.j) r5
            a0.o r6 = a(r5, r12, r3, r7)
            r5.O1(r3, r12, r6)
            r6.c(r3)
            r7 = 0
            goto L_0x0206
        L_0x021e:
            z.d$b r4 = z.d.b.TOP
            z.d r4 = r0.r(r4)
            java.util.HashSet r5 = r4.e()
            if (r5 == 0) goto L_0x0245
            java.util.HashSet r4 = r4.e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0232:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0245
            java.lang.Object r5 = r4.next()
            z.d r5 = (z.d) r5
            z.e r5 = r5.f15621d
            r6 = 0
            a(r5, r12, r3, r6)
            goto L_0x0232
        L_0x0245:
            z.d$b r4 = z.d.b.BASELINE
            z.d r4 = r0.r(r4)
            java.util.HashSet r5 = r4.e()
            if (r5 == 0) goto L_0x026c
            java.util.HashSet r4 = r4.e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0259:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x026c
            java.lang.Object r5 = r4.next()
            z.d r5 = (z.d) r5
            z.e r5 = r5.f15621d
            r6 = 0
            a(r5, r12, r3, r6)
            goto L_0x0259
        L_0x026c:
            z.d$b r4 = z.d.b.BOTTOM
            z.d r4 = r0.r(r4)
            java.util.HashSet r5 = r4.e()
            if (r5 == 0) goto L_0x0293
            java.util.HashSet r4 = r4.e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0280:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0293
            java.lang.Object r5 = r4.next()
            z.d r5 = (z.d) r5
            z.e r5 = r5.f15621d
            r6 = 0
            a(r5, r12, r3, r6)
            goto L_0x0280
        L_0x0293:
            z.d$b r4 = z.d.b.CENTER
            z.d r4 = r0.r(r4)
            java.util.HashSet r5 = r4.e()
            if (r5 == 0) goto L_0x02ba
            java.util.HashSet r4 = r4.e()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02ba
            java.lang.Object r5 = r4.next()
            z.d r5 = (z.d) r5
            z.e r5 = r5.f15621d
            r13 = 0
            a(r5, r12, r3, r13)
            goto L_0x02a7
        L_0x02ba:
            r13 = 0
            if (r11 == 0) goto L_0x02d1
            java.util.Iterator r4 = r11.iterator()
        L_0x02c1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02d1
            java.lang.Object r5 = r4.next()
            z.e r5 = (z.e) r5
            a(r5, r12, r3, r13)
            goto L_0x02c1
        L_0x02d1:
            r4 = 0
        L_0x02d2:
            if (r4 >= r2) goto L_0x02fe
            java.lang.Object r5 = r1.get(r4)
            z.e r5 = (z.e) r5
            boolean r6 = r5.E0()
            if (r6 == 0) goto L_0x02fb
            int r6 = r5.K0
            a0.o r6 = b(r3, r6)
            int r5 = r5.L0
            a0.o r5 = b(r3, r5)
            if (r6 == 0) goto L_0x02fb
            if (r5 == 0) goto L_0x02fb
            r7 = 0
            r6.m(r7, r5)
            r7 = 2
            r5.o(r7)
            r3.remove(r6)
        L_0x02fb:
            int r4 = r4 + 1
            goto L_0x02d2
        L_0x02fe:
            int r1 = r3.size()
            if (r1 > r12) goto L_0x0306
            r1 = 0
            return r1
        L_0x0306:
            z.e$b r1 = r16.H()
            z.e$b r2 = z.e.b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0346
            java.util.Iterator r1 = r3.iterator()
            r2 = r13
            r6 = 0
        L_0x0314:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0338
            java.lang.Object r4 = r1.next()
            a0.o r4 = (a0.o) r4
            int r5 = r4.g()
            if (r5 != r12) goto L_0x0327
            goto L_0x0314
        L_0x0327:
            r5 = 0
            r4.n(r5)
            w.e r7 = r16.m2()
            int r7 = r4.l(r7, r5)
            if (r7 <= r6) goto L_0x0314
            r2 = r4
            r6 = r7
            goto L_0x0314
        L_0x0338:
            if (r2 == 0) goto L_0x0346
            z.e$b r1 = z.e.b.FIXED
            r0.i1(r1)
            r0.H1(r6)
            r2.n(r12)
            goto L_0x0347
        L_0x0346:
            r2 = r13
        L_0x0347:
            z.e$b r1 = r16.g0()
            z.e$b r4 = z.e.b.WRAP_CONTENT
            if (r1 != r4) goto L_0x0389
            java.util.Iterator r1 = r3.iterator()
            r3 = r13
            r6 = 0
        L_0x0355:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0379
            java.lang.Object r4 = r1.next()
            a0.o r4 = (a0.o) r4
            int r5 = r4.g()
            if (r5 != 0) goto L_0x0368
            goto L_0x0355
        L_0x0368:
            r5 = 0
            r4.n(r5)
            w.e r7 = r16.m2()
            int r7 = r4.l(r7, r12)
            if (r7 <= r6) goto L_0x0355
            r3 = r4
            r6 = r7
            goto L_0x0355
        L_0x0379:
            r5 = 0
            if (r3 == 0) goto L_0x038a
            z.e$b r1 = z.e.b.FIXED
            r0.D1(r1)
            r0.d1(r6)
            r3.n(r12)
            r4 = r3
            goto L_0x038b
        L_0x0389:
            r5 = 0
        L_0x038a:
            r4 = r13
        L_0x038b:
            if (r2 != 0) goto L_0x0392
            if (r4 == 0) goto L_0x0390
            goto L_0x0392
        L_0x0390:
            r3 = r5
            goto L_0x0393
        L_0x0392:
            r3 = r12
        L_0x0393:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.i.c(z.f, a0.b$b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = z.e.b.P;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(z.e.b r5, z.e.b r6, z.e.b r7, z.e.b r8) {
        /*
            z.e$b r0 = z.e.b.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            z.e$b r3 = z.e.b.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            z.e$b r4 = z.e.b.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r1
            goto L_0x0014
        L_0x0013:
            r5 = r2
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            z.e$b r7 = z.e.b.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            z.e$b r0 = z.e.b.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = r1
            goto L_0x0024
        L_0x0023:
            r6 = r2
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.i.d(z.e$b, z.e$b, z.e$b, z.e$b):boolean");
    }
}
