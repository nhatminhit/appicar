package a0;

import a0.b;
import java.util.ArrayList;
import z.a;
import z.e;
import z.f;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f51a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f52b = false;

    /* renamed from: c  reason: collision with root package name */
    public static b.a f53c = new b.a();

    public static boolean a(e eVar) {
        e.b H = eVar.H();
        e.b g02 = eVar.g0();
        f fVar = eVar.U() != null ? (f) eVar.U() : null;
        if (fVar != null) {
            e.b H2 = fVar.H();
            e.b bVar = e.b.FIXED;
        }
        if (fVar != null) {
            e.b g03 = fVar.g0();
            e.b bVar2 = e.b.FIXED;
        }
        e.b bVar3 = e.b.FIXED;
        boolean z10 = H == bVar3 || H == e.b.WRAP_CONTENT || (H == e.b.MATCH_CONSTRAINT && eVar.f15672p == 0 && eVar.Y == 0.0f && eVar.n0(0)) || eVar.x0();
        boolean z11 = g02 == bVar3 || g02 == e.b.WRAP_CONTENT || (g02 == e.b.MATCH_CONSTRAINT && eVar.f15674q == 0 && eVar.Y == 0.0f && eVar.n0(1)) || eVar.y0();
        if (eVar.Y <= 0.0f || (!z10 && !z11)) {
            return z10 && z11;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r10 = r9.L.f15623f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r4 = r9.J.f15623f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(z.e r13, a0.b.C0002b r14, boolean r15) {
        /*
            boolean r0 = r13 instanceof z.f
            if (r0 != 0) goto L_0x001a
            boolean r0 = r13.w0()
            if (r0 == 0) goto L_0x001a
            boolean r0 = a(r13)
            if (r0 == 0) goto L_0x001a
            a0.b$a r0 = new a0.b$a
            r0.<init>()
            int r1 = a0.b.a.f13k
            z.f.v2(r13, r14, r0, r1)
        L_0x001a:
            z.d$b r0 = z.d.b.LEFT
            z.d r0 = r13.r(r0)
            z.d$b r1 = z.d.b.RIGHT
            z.d r1 = r13.r(r1)
            int r2 = r0.f()
            int r3 = r1.f()
            java.util.HashSet r4 = r0.e()
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0125
            boolean r4 = r0.o()
            if (r4 == 0) goto L_0x0125
            java.util.HashSet r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0125
            java.lang.Object r4 = r0.next()
            z.d r4 = (z.d) r4
            z.e r9 = r4.f15621d
            boolean r10 = a(r9)
            boolean r11 = r9.w0()
            if (r11 == 0) goto L_0x006b
            if (r10 == 0) goto L_0x006b
            a0.b$a r11 = new a0.b$a
            r11.<init>()
            int r12 = a0.b.a.f13k
            z.f.v2(r9, r14, r11, r12)
        L_0x006b:
            z.e$b r11 = r9.H()
            z.e$b r12 = z.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00d2
            if (r10 == 0) goto L_0x0076
            goto L_0x00d2
        L_0x0076:
            z.e$b r10 = r9.H()
            if (r10 != r12) goto L_0x0047
            int r10 = r9.f15680t
            if (r10 < 0) goto L_0x0047
            int r10 = r9.f15678s
            if (r10 < 0) goto L_0x0047
            int r10 = r9.i0()
            if (r10 == r6) goto L_0x0096
            int r10 = r9.f15672p
            if (r10 != 0) goto L_0x0047
            float r10 = r9.A()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0047
        L_0x0096:
            boolean r10 = r9.s0()
            if (r10 != 0) goto L_0x0047
            boolean r10 = r9.v0()
            if (r10 != 0) goto L_0x0047
            z.d r10 = r9.J
            if (r4 != r10) goto L_0x00b2
            z.d r10 = r9.L
            z.d r10 = r10.f15623f
            if (r10 == 0) goto L_0x00b2
            boolean r10 = r10.o()
            if (r10 != 0) goto L_0x00c2
        L_0x00b2:
            z.d r10 = r9.L
            if (r4 != r10) goto L_0x00c4
            z.d r4 = r9.J
            z.d r4 = r4.f15623f
            if (r4 == 0) goto L_0x00c4
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x00c4
        L_0x00c2:
            r4 = r7
            goto L_0x00c5
        L_0x00c4:
            r4 = r8
        L_0x00c5:
            if (r4 == 0) goto L_0x0047
            boolean r4 = r9.s0()
            if (r4 != 0) goto L_0x0047
            f(r13, r14, r9, r15)
            goto L_0x0047
        L_0x00d2:
            boolean r10 = r9.w0()
            if (r10 == 0) goto L_0x00da
            goto L_0x0047
        L_0x00da:
            z.d r10 = r9.J
            if (r4 != r10) goto L_0x00f6
            z.d r11 = r9.L
            z.d r11 = r11.f15623f
            if (r11 != 0) goto L_0x00f6
            int r4 = r10.g()
            int r4 = r4 + r2
            int r10 = r9.j0()
            int r10 = r10 + r4
            r9.V0(r4, r10)
        L_0x00f1:
            b(r9, r14, r15)
            goto L_0x0047
        L_0x00f6:
            z.d r11 = r9.L
            if (r4 != r11) goto L_0x010e
            z.d r12 = r10.f15623f
            if (r12 != 0) goto L_0x010e
            int r4 = r11.g()
            int r4 = r2 - r4
            int r10 = r9.j0()
            int r10 = r4 - r10
            r9.V0(r10, r4)
            goto L_0x00f1
        L_0x010e:
            if (r4 != r10) goto L_0x0047
            z.d r4 = r11.f15623f
            if (r4 == 0) goto L_0x0047
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x0047
            boolean r4 = r9.s0()
            if (r4 != 0) goto L_0x0047
            e(r14, r9, r15)
            goto L_0x0047
        L_0x0125:
            boolean r0 = r13 instanceof z.h
            if (r0 == 0) goto L_0x012a
            return
        L_0x012a:
            java.util.HashSet r0 = r1.e()
            if (r0 == 0) goto L_0x0212
            boolean r0 = r1.o()
            if (r0 == 0) goto L_0x0212
            java.util.HashSet r0 = r1.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x013e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0212
            java.lang.Object r1 = r0.next()
            z.d r1 = (z.d) r1
            z.e r2 = r1.f15621d
            boolean r4 = a(r2)
            boolean r9 = r2.w0()
            if (r9 == 0) goto L_0x0162
            if (r4 == 0) goto L_0x0162
            a0.b$a r9 = new a0.b$a
            r9.<init>()
            int r10 = a0.b.a.f13k
            z.f.v2(r2, r14, r9, r10)
        L_0x0162:
            z.d r9 = r2.J
            if (r1 != r9) goto L_0x0172
            z.d r9 = r2.L
            z.d r9 = r9.f15623f
            if (r9 == 0) goto L_0x0172
            boolean r9 = r9.o()
            if (r9 != 0) goto L_0x0182
        L_0x0172:
            z.d r9 = r2.L
            if (r1 != r9) goto L_0x0184
            z.d r9 = r2.J
            z.d r9 = r9.f15623f
            if (r9 == 0) goto L_0x0184
            boolean r9 = r9.o()
            if (r9 == 0) goto L_0x0184
        L_0x0182:
            r9 = r7
            goto L_0x0185
        L_0x0184:
            r9 = r8
        L_0x0185:
            z.e$b r10 = r2.H()
            z.e$b r11 = z.e.b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x01c9
            if (r4 == 0) goto L_0x0190
            goto L_0x01c9
        L_0x0190:
            z.e$b r1 = r2.H()
            if (r1 != r11) goto L_0x013e
            int r1 = r2.f15680t
            if (r1 < 0) goto L_0x013e
            int r1 = r2.f15678s
            if (r1 < 0) goto L_0x013e
            int r1 = r2.i0()
            if (r1 == r6) goto L_0x01b0
            int r1 = r2.f15672p
            if (r1 != 0) goto L_0x013e
            float r1 = r2.A()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x013e
        L_0x01b0:
            boolean r1 = r2.s0()
            if (r1 != 0) goto L_0x013e
            boolean r1 = r2.v0()
            if (r1 != 0) goto L_0x013e
            if (r9 == 0) goto L_0x013e
            boolean r1 = r2.s0()
            if (r1 != 0) goto L_0x013e
            f(r13, r14, r2, r15)
            goto L_0x013e
        L_0x01c9:
            boolean r4 = r2.w0()
            if (r4 == 0) goto L_0x01d1
            goto L_0x013e
        L_0x01d1:
            z.d r4 = r2.J
            if (r1 != r4) goto L_0x01ed
            z.d r10 = r2.L
            z.d r10 = r10.f15623f
            if (r10 != 0) goto L_0x01ed
            int r1 = r4.g()
            int r1 = r1 + r3
            int r4 = r2.j0()
            int r4 = r4 + r1
            r2.V0(r1, r4)
        L_0x01e8:
            b(r2, r14, r15)
            goto L_0x013e
        L_0x01ed:
            z.d r10 = r2.L
            if (r1 != r10) goto L_0x0205
            z.d r1 = r4.f15623f
            if (r1 != 0) goto L_0x0205
            int r1 = r10.g()
            int r1 = r3 - r1
            int r4 = r2.j0()
            int r4 = r1 - r4
            r2.V0(r4, r1)
            goto L_0x01e8
        L_0x0205:
            if (r9 == 0) goto L_0x013e
            boolean r1 = r2.s0()
            if (r1 != 0) goto L_0x013e
            e(r14, r2, r15)
            goto L_0x013e
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.h.b(z.e, a0.b$b, boolean):void");
    }

    public static void c(a aVar, b.C0002b bVar, int i10, boolean z10) {
        if (!aVar.Q1()) {
            return;
        }
        if (i10 == 0) {
            b(aVar, bVar, z10);
        } else {
            j(aVar, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01cb, code lost:
        if (r6.f15621d == r2) goto L_0x01cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(z.f r18, w.e r19, int r20, int r21, z.c r22, boolean r23, boolean r24, boolean r25) {
        /*
            r0 = 0
            if (r25 == 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r20 != 0) goto L_0x000d
            boolean r1 = r18.x0()
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x000d:
            boolean r1 = r18.y0()
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r1 = r18.s2()
            z.e r2 = r22.c()
            z.e r3 = r22.g()
            z.e r4 = r22.e()
            z.e r5 = r22.i()
            z.e r6 = r22.f()
            z.d[] r7 = r2.R
            r7 = r7[r21]
            z.d[] r3 = r3.R
            int r8 = r21 + 1
            r3 = r3[r8]
            z.d r9 = r7.f15623f
            if (r9 == 0) goto L_0x0221
            z.d r10 = r3.f15623f
            if (r10 != 0) goto L_0x0040
            goto L_0x0221
        L_0x0040:
            boolean r9 = r9.o()
            if (r9 == 0) goto L_0x0221
            z.d r9 = r3.f15623f
            boolean r9 = r9.o()
            if (r9 != 0) goto L_0x0050
            goto L_0x0221
        L_0x0050:
            if (r4 == 0) goto L_0x0221
            if (r5 != 0) goto L_0x0056
            goto L_0x0221
        L_0x0056:
            z.d r7 = r7.f15623f
            int r7 = r7.f()
            z.d[] r9 = r4.R
            r9 = r9[r21]
            int r9 = r9.g()
            int r7 = r7 + r9
            z.d r3 = r3.f15623f
            int r3 = r3.f()
            z.d[] r9 = r5.R
            r9 = r9[r8]
            int r9 = r9.g()
            int r3 = r3 - r9
            int r9 = r3 - r7
            if (r9 > 0) goto L_0x0079
            return r0
        L_0x0079:
            a0.b$a r10 = new a0.b$a
            r10.<init>()
            r11 = r0
            r12 = r11
            r14 = r12
            r15 = r14
            r13 = r2
        L_0x0083:
            r16 = 0
            if (r11 != 0) goto L_0x00fa
            z.d[] r0 = r13.R
            r0 = r0[r21]
            boolean r0 = a(r13)
            if (r0 != 0) goto L_0x0093
            r0 = 0
            return r0
        L_0x0093:
            z.e$b[] r0 = r13.U
            r0 = r0[r20]
            r17 = r2
            z.e$b r2 = z.e.b.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x009f
            r0 = 0
            return r0
        L_0x009f:
            boolean r0 = r13.w0()
            if (r0 == 0) goto L_0x00ae
            a0.b$b r0 = r18.k2()
            int r2 = a0.b.a.f13k
            z.f.v2(r13, r0, r10, r2)
        L_0x00ae:
            z.d[] r0 = r13.R
            r0 = r0[r21]
            int r0 = r0.g()
            int r15 = r15 + r0
            if (r20 != 0) goto L_0x00be
            int r0 = r13.j0()
            goto L_0x00c2
        L_0x00be:
            int r0 = r13.D()
        L_0x00c2:
            int r15 = r15 + r0
            z.d[] r0 = r13.R
            r0 = r0[r8]
            int r0 = r0.g()
            int r15 = r15 + r0
            int r14 = r14 + 1
            int r0 = r13.i0()
            r2 = 8
            if (r0 == r2) goto L_0x00d8
            int r12 = r12 + 1
        L_0x00d8:
            z.d[] r0 = r13.R
            r0 = r0[r8]
            z.d r0 = r0.f15623f
            if (r0 == 0) goto L_0x00f1
            z.e r0 = r0.f15621d
            z.d[] r2 = r0.R
            r2 = r2[r21]
            z.d r2 = r2.f15623f
            if (r2 == 0) goto L_0x00f1
            z.e r2 = r2.f15621d
            if (r2 == r13) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r16 = r0
        L_0x00f1:
            if (r16 == 0) goto L_0x00f6
            r13 = r16
            goto L_0x00f7
        L_0x00f6:
            r11 = 1
        L_0x00f7:
            r2 = r17
            goto L_0x0083
        L_0x00fa:
            r17 = r2
            r0 = 0
            if (r12 != 0) goto L_0x0100
            return r0
        L_0x0100:
            if (r12 == r14) goto L_0x0103
            return r0
        L_0x0103:
            if (r9 >= r15) goto L_0x0106
            return r0
        L_0x0106:
            int r9 = r9 - r15
            r0 = 2
            if (r23 == 0) goto L_0x010f
            int r2 = r12 + 1
            int r9 = r9 / r2
        L_0x010d:
            r2 = 1
            goto L_0x0116
        L_0x010f:
            if (r24 == 0) goto L_0x010d
            if (r12 <= r0) goto L_0x010d
            int r9 = r9 / r12
            r2 = 1
            int r9 = r9 - r2
        L_0x0116:
            if (r12 != r2) goto L_0x0147
            if (r20 != 0) goto L_0x011f
            float r0 = r6.E()
            goto L_0x0123
        L_0x011f:
            float r0 = r6.d0()
        L_0x0123:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = (float) r7
            float r3 = r3 + r2
            float r2 = (float) r9
            float r2 = r2 * r0
            float r3 = r3 + r2
            int r0 = (int) r3
            if (r20 != 0) goto L_0x0136
            int r2 = r4.j0()
            int r2 = r2 + r0
            r4.V0(r0, r2)
            goto L_0x013e
        L_0x0136:
            int r2 = r4.D()
            int r2 = r2 + r0
            r4.Y0(r0, r2)
        L_0x013e:
            a0.b$b r0 = r18.k2()
            b(r4, r0, r1)
            r0 = 1
            return r0
        L_0x0147:
            if (r23 == 0) goto L_0x01d7
            int r7 = r7 + r9
            r2 = r17
            r0 = 0
        L_0x014d:
            if (r0 != 0) goto L_0x0220
            z.d[] r3 = r2.R
            r3 = r3[r21]
            int r3 = r2.i0()
            r4 = 8
            if (r3 != r4) goto L_0x0176
            if (r20 != 0) goto L_0x0168
            r2.V0(r7, r7)
            a0.b$b r3 = r18.k2()
            b(r2, r3, r1)
            goto L_0x0172
        L_0x0168:
            r2.Y0(r7, r7)
            a0.b$b r3 = r18.k2()
            j(r2, r3)
        L_0x0172:
            r3 = r19
            r5 = 0
            goto L_0x01b4
        L_0x0176:
            z.d[] r3 = r2.R
            r3 = r3[r21]
            int r3 = r3.g()
            int r7 = r7 + r3
            if (r20 != 0) goto L_0x0195
            int r3 = r2.j0()
            int r3 = r3 + r7
            r2.V0(r7, r3)
            a0.b$b r3 = r18.k2()
            b(r2, r3, r1)
            int r3 = r2.j0()
            goto L_0x01a8
        L_0x0195:
            int r3 = r2.D()
            int r3 = r3 + r7
            r2.Y0(r7, r3)
            a0.b$b r3 = r18.k2()
            j(r2, r3)
            int r3 = r2.D()
        L_0x01a8:
            int r7 = r7 + r3
            z.d[] r3 = r2.R
            r3 = r3[r8]
            int r3 = r3.g()
            int r7 = r7 + r3
            int r7 = r7 + r9
            goto L_0x0172
        L_0x01b4:
            r2.g(r3, r5)
            z.d[] r5 = r2.R
            r5 = r5[r8]
            z.d r5 = r5.f15623f
            if (r5 == 0) goto L_0x01cd
            z.e r5 = r5.f15621d
            z.d[] r6 = r5.R
            r6 = r6[r21]
            z.d r6 = r6.f15623f
            if (r6 == 0) goto L_0x01cd
            z.e r6 = r6.f15621d
            if (r6 == r2) goto L_0x01cf
        L_0x01cd:
            r5 = r16
        L_0x01cf:
            if (r5 == 0) goto L_0x01d4
            r2 = r5
            goto L_0x014d
        L_0x01d4:
            r0 = 1
            goto L_0x014d
        L_0x01d7:
            if (r24 == 0) goto L_0x0220
            if (r12 != r0) goto L_0x021e
            if (r20 != 0) goto L_0x01fd
            int r0 = r4.j0()
            int r0 = r0 + r7
            r4.V0(r7, r0)
            int r0 = r5.j0()
            int r0 = r3 - r0
            r5.V0(r0, r3)
            a0.b$b r0 = r18.k2()
            b(r4, r0, r1)
            a0.b$b r0 = r18.k2()
            b(r5, r0, r1)
            goto L_0x021c
        L_0x01fd:
            int r0 = r4.D()
            int r0 = r0 + r7
            r4.Y0(r7, r0)
            int r0 = r5.D()
            int r0 = r3 - r0
            r5.Y0(r0, r3)
            a0.b$b r0 = r18.k2()
            j(r4, r0)
            a0.b$b r0 = r18.k2()
            j(r5, r0)
        L_0x021c:
            r0 = 1
            return r0
        L_0x021e:
            r0 = 0
            return r0
        L_0x0220:
            r0 = 1
        L_0x0221:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.h.d(z.f, w.e, int, int, z.c, boolean, boolean, boolean):boolean");
    }

    public static void e(b.C0002b bVar, e eVar, boolean z10) {
        float E = eVar.E();
        int f10 = eVar.J.f15623f.f();
        int f11 = eVar.L.f15623f.f();
        int g10 = eVar.J.g() + f10;
        int g11 = f11 - eVar.L.g();
        if (f10 == f11) {
            E = 0.5f;
        } else {
            f10 = g10;
            f11 = g11;
        }
        int j02 = eVar.j0();
        int i10 = (f11 - f10) - j02;
        if (f10 > f11) {
            i10 = (f10 - f11) - j02;
        }
        int i11 = ((int) ((E * ((float) i10)) + 0.5f)) + f10;
        int i12 = i11 + j02;
        if (f10 > f11) {
            i12 = i11 - j02;
        }
        eVar.V0(i11, i12);
        b(eVar, bVar, z10);
    }

    public static void f(e eVar, b.C0002b bVar, e eVar2, boolean z10) {
        float E = eVar2.E();
        int f10 = eVar2.J.f15623f.f() + eVar2.J.g();
        int f11 = eVar2.L.f15623f.f() - eVar2.L.g();
        if (f11 >= f10) {
            int j02 = eVar2.j0();
            if (eVar2.i0() != 8) {
                int i10 = eVar2.f15672p;
                if (i10 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.U();
                    }
                    j02 = (int) (eVar2.E() * 0.5f * ((float) eVar.j0()));
                } else if (i10 == 0) {
                    j02 = f11 - f10;
                }
                j02 = Math.max(eVar2.f15678s, j02);
                int i11 = eVar2.f15680t;
                if (i11 > 0) {
                    j02 = Math.min(i11, j02);
                }
            }
            int i12 = f10 + ((int) ((E * ((float) ((f11 - f10) - j02))) + 0.5f));
            eVar2.V0(i12, j02 + i12);
            b(eVar2, bVar, z10);
        }
    }

    public static void g(b.C0002b bVar, e eVar) {
        float d02 = eVar.d0();
        int f10 = eVar.K.f15623f.f();
        int f11 = eVar.M.f15623f.f();
        int g10 = eVar.K.g() + f10;
        int g11 = f11 - eVar.M.g();
        if (f10 == f11) {
            d02 = 0.5f;
        } else {
            f10 = g10;
            f11 = g11;
        }
        int D = eVar.D();
        int i10 = (f11 - f10) - D;
        if (f10 > f11) {
            i10 = (f10 - f11) - D;
        }
        int i11 = (int) ((d02 * ((float) i10)) + 0.5f);
        int i12 = f10 + i11;
        int i13 = i12 + D;
        if (f10 > f11) {
            i12 = f10 - i11;
            i13 = i12 - D;
        }
        eVar.Y0(i12, i13);
        j(eVar, bVar);
    }

    public static void h(e eVar, b.C0002b bVar, e eVar2) {
        float d02 = eVar2.d0();
        int f10 = eVar2.K.f15623f.f() + eVar2.K.g();
        int f11 = eVar2.M.f15623f.f() - eVar2.M.g();
        if (f11 >= f10) {
            int D = eVar2.D();
            if (eVar2.i0() != 8) {
                int i10 = eVar2.f15674q;
                if (i10 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.U();
                    }
                    D = (int) (d02 * 0.5f * ((float) eVar.D()));
                } else if (i10 == 0) {
                    D = f11 - f10;
                }
                D = Math.max(eVar2.f15684v, D);
                int i11 = eVar2.f15686w;
                if (i11 > 0) {
                    D = Math.min(i11, D);
                }
            }
            int i12 = f10 + ((int) ((d02 * ((float) ((f11 - f10) - D))) + 0.5f));
            eVar2.Y0(i12, D + i12);
            j(eVar2, bVar);
        }
    }

    public static void i(f fVar, b.C0002b bVar) {
        int U1;
        int U12;
        e.b H = fVar.H();
        e.b g02 = fVar.g0();
        fVar.J0();
        ArrayList<e> P1 = fVar.P1();
        int size = P1.size();
        for (int i10 = 0; i10 < size; i10++) {
            P1.get(i10).J0();
        }
        boolean s22 = fVar.s2();
        if (H == e.b.FIXED) {
            fVar.V0(0, fVar.j0());
        } else {
            fVar.W0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = P1.get(i11);
            if (eVar instanceof z.h) {
                z.h hVar = (z.h) eVar;
                if (hVar.Q1() == 1) {
                    if (hVar.R1() != -1) {
                        U12 = hVar.R1();
                    } else if (hVar.T1() == -1 || !fVar.x0()) {
                        if (fVar.x0()) {
                            U12 = (int) ((hVar.U1() * ((float) fVar.j0())) + 0.5f);
                        }
                        z10 = true;
                    } else {
                        U12 = fVar.j0() - hVar.T1();
                    }
                    hVar.Z1(U12);
                    z10 = true;
                }
            } else if ((eVar instanceof a) && ((a) eVar).U1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = P1.get(i12);
                if (eVar2 instanceof z.h) {
                    z.h hVar2 = (z.h) eVar2;
                    if (hVar2.Q1() == 1) {
                        b(hVar2, bVar, s22);
                    }
                }
            }
        }
        b(fVar, bVar, s22);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                e eVar3 = P1.get(i13);
                if (eVar3 instanceof a) {
                    a aVar = (a) eVar3;
                    if (aVar.U1() == 0) {
                        c(aVar, bVar, 0, s22);
                    }
                }
            }
        }
        if (g02 == e.b.FIXED) {
            fVar.Y0(0, fVar.D());
        } else {
            fVar.X0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            e eVar4 = P1.get(i14);
            if (eVar4 instanceof z.h) {
                z.h hVar3 = (z.h) eVar4;
                if (hVar3.Q1() == 0) {
                    if (hVar3.R1() != -1) {
                        U1 = hVar3.R1();
                    } else if (hVar3.T1() == -1 || !fVar.y0()) {
                        if (fVar.y0()) {
                            U1 = (int) ((hVar3.U1() * ((float) fVar.D())) + 0.5f);
                        }
                        z12 = true;
                    } else {
                        U1 = fVar.D() - hVar3.T1();
                    }
                    hVar3.Z1(U1);
                    z12 = true;
                }
            } else if ((eVar4 instanceof a) && ((a) eVar4).U1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                e eVar5 = P1.get(i15);
                if (eVar5 instanceof z.h) {
                    z.h hVar4 = (z.h) eVar5;
                    if (hVar4.Q1() == 0) {
                        j(hVar4, bVar);
                    }
                }
            }
        }
        j(fVar, bVar);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                e eVar6 = P1.get(i16);
                if (eVar6 instanceof a) {
                    a aVar2 = (a) eVar6;
                    if (aVar2.U1() == 1) {
                        c(aVar2, bVar, 1, s22);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            e eVar7 = P1.get(i17);
            if (eVar7.w0() && a(eVar7)) {
                f.v2(eVar7, bVar, f53c, b.a.f13k);
                b(eVar7, bVar, s22);
                j(eVar7, bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r10 = r9.M.f15623f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r4 = r9.K.f15623f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(z.e r13, a0.b.C0002b r14) {
        /*
            boolean r0 = r13 instanceof z.f
            if (r0 != 0) goto L_0x001a
            boolean r0 = r13.w0()
            if (r0 == 0) goto L_0x001a
            boolean r0 = a(r13)
            if (r0 == 0) goto L_0x001a
            a0.b$a r0 = new a0.b$a
            r0.<init>()
            int r1 = a0.b.a.f13k
            z.f.v2(r13, r14, r0, r1)
        L_0x001a:
            z.d$b r0 = z.d.b.TOP
            z.d r0 = r13.r(r0)
            z.d$b r1 = z.d.b.BOTTOM
            z.d r1 = r13.r(r1)
            int r2 = r0.f()
            int r3 = r1.f()
            java.util.HashSet r4 = r0.e()
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x011f
            boolean r4 = r0.o()
            if (r4 == 0) goto L_0x011f
            java.util.HashSet r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x011f
            java.lang.Object r4 = r0.next()
            z.d r4 = (z.d) r4
            z.e r9 = r4.f15621d
            boolean r10 = a(r9)
            boolean r11 = r9.w0()
            if (r11 == 0) goto L_0x006b
            if (r10 == 0) goto L_0x006b
            a0.b$a r11 = new a0.b$a
            r11.<init>()
            int r12 = a0.b.a.f13k
            z.f.v2(r9, r14, r11, r12)
        L_0x006b:
            z.e$b r11 = r9.g0()
            z.e$b r12 = z.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00d2
            if (r10 == 0) goto L_0x0076
            goto L_0x00d2
        L_0x0076:
            z.e$b r10 = r9.g0()
            if (r10 != r12) goto L_0x0047
            int r10 = r9.f15686w
            if (r10 < 0) goto L_0x0047
            int r10 = r9.f15684v
            if (r10 < 0) goto L_0x0047
            int r10 = r9.i0()
            if (r10 == r6) goto L_0x0096
            int r10 = r9.f15674q
            if (r10 != 0) goto L_0x0047
            float r10 = r9.A()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0047
        L_0x0096:
            boolean r10 = r9.u0()
            if (r10 != 0) goto L_0x0047
            boolean r10 = r9.v0()
            if (r10 != 0) goto L_0x0047
            z.d r10 = r9.K
            if (r4 != r10) goto L_0x00b2
            z.d r10 = r9.M
            z.d r10 = r10.f15623f
            if (r10 == 0) goto L_0x00b2
            boolean r10 = r10.o()
            if (r10 != 0) goto L_0x00c2
        L_0x00b2:
            z.d r10 = r9.M
            if (r4 != r10) goto L_0x00c4
            z.d r4 = r9.K
            z.d r4 = r4.f15623f
            if (r4 == 0) goto L_0x00c4
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x00c4
        L_0x00c2:
            r4 = r7
            goto L_0x00c5
        L_0x00c4:
            r4 = r8
        L_0x00c5:
            if (r4 == 0) goto L_0x0047
            boolean r4 = r9.u0()
            if (r4 != 0) goto L_0x0047
            h(r13, r14, r9)
            goto L_0x0047
        L_0x00d2:
            boolean r10 = r9.w0()
            if (r10 == 0) goto L_0x00da
            goto L_0x0047
        L_0x00da:
            z.d r10 = r9.K
            if (r4 != r10) goto L_0x00f6
            z.d r11 = r9.M
            z.d r11 = r11.f15623f
            if (r11 != 0) goto L_0x00f6
            int r4 = r10.g()
            int r4 = r4 + r2
            int r10 = r9.D()
            int r10 = r10 + r4
            r9.Y0(r4, r10)
        L_0x00f1:
            j(r9, r14)
            goto L_0x0047
        L_0x00f6:
            z.d r11 = r9.M
            if (r4 != r11) goto L_0x010e
            z.d r12 = r11.f15623f
            if (r12 != 0) goto L_0x010e
            int r4 = r11.g()
            int r4 = r2 - r4
            int r10 = r9.D()
            int r10 = r4 - r10
            r9.Y0(r10, r4)
            goto L_0x00f1
        L_0x010e:
            if (r4 != r10) goto L_0x0047
            z.d r4 = r11.f15623f
            if (r4 == 0) goto L_0x0047
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x0047
            g(r14, r9)
            goto L_0x0047
        L_0x011f:
            boolean r0 = r13 instanceof z.h
            if (r0 == 0) goto L_0x0124
            return
        L_0x0124:
            java.util.HashSet r0 = r1.e()
            if (r0 == 0) goto L_0x020c
            boolean r0 = r1.o()
            if (r0 == 0) goto L_0x020c
            java.util.HashSet r0 = r1.e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0138:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x020c
            java.lang.Object r1 = r0.next()
            z.d r1 = (z.d) r1
            z.e r2 = r1.f15621d
            boolean r4 = a(r2)
            boolean r9 = r2.w0()
            if (r9 == 0) goto L_0x015c
            if (r4 == 0) goto L_0x015c
            a0.b$a r9 = new a0.b$a
            r9.<init>()
            int r10 = a0.b.a.f13k
            z.f.v2(r2, r14, r9, r10)
        L_0x015c:
            z.d r9 = r2.K
            if (r1 != r9) goto L_0x016c
            z.d r9 = r2.M
            z.d r9 = r9.f15623f
            if (r9 == 0) goto L_0x016c
            boolean r9 = r9.o()
            if (r9 != 0) goto L_0x017c
        L_0x016c:
            z.d r9 = r2.M
            if (r1 != r9) goto L_0x017e
            z.d r9 = r2.K
            z.d r9 = r9.f15623f
            if (r9 == 0) goto L_0x017e
            boolean r9 = r9.o()
            if (r9 == 0) goto L_0x017e
        L_0x017c:
            r9 = r7
            goto L_0x017f
        L_0x017e:
            r9 = r8
        L_0x017f:
            z.e$b r10 = r2.g0()
            z.e$b r11 = z.e.b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x01c3
            if (r4 == 0) goto L_0x018a
            goto L_0x01c3
        L_0x018a:
            z.e$b r1 = r2.g0()
            if (r1 != r11) goto L_0x0138
            int r1 = r2.f15686w
            if (r1 < 0) goto L_0x0138
            int r1 = r2.f15684v
            if (r1 < 0) goto L_0x0138
            int r1 = r2.i0()
            if (r1 == r6) goto L_0x01aa
            int r1 = r2.f15674q
            if (r1 != 0) goto L_0x0138
            float r1 = r2.A()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0138
        L_0x01aa:
            boolean r1 = r2.u0()
            if (r1 != 0) goto L_0x0138
            boolean r1 = r2.v0()
            if (r1 != 0) goto L_0x0138
            if (r9 == 0) goto L_0x0138
            boolean r1 = r2.u0()
            if (r1 != 0) goto L_0x0138
            h(r13, r14, r2)
            goto L_0x0138
        L_0x01c3:
            boolean r4 = r2.w0()
            if (r4 == 0) goto L_0x01cb
            goto L_0x0138
        L_0x01cb:
            z.d r4 = r2.K
            if (r1 != r4) goto L_0x01e7
            z.d r10 = r2.M
            z.d r10 = r10.f15623f
            if (r10 != 0) goto L_0x01e7
            int r1 = r4.g()
            int r1 = r1 + r3
            int r4 = r2.D()
            int r4 = r4 + r1
            r2.Y0(r1, r4)
        L_0x01e2:
            j(r2, r14)
            goto L_0x0138
        L_0x01e7:
            z.d r10 = r2.M
            if (r1 != r10) goto L_0x01ff
            z.d r1 = r4.f15623f
            if (r1 != 0) goto L_0x01ff
            int r1 = r10.g()
            int r1 = r3 - r1
            int r4 = r2.D()
            int r4 = r1 - r4
            r2.Y0(r4, r1)
            goto L_0x01e2
        L_0x01ff:
            if (r9 == 0) goto L_0x0138
            boolean r1 = r2.u0()
            if (r1 != 0) goto L_0x0138
            g(r14, r2)
            goto L_0x0138
        L_0x020c:
            z.d$b r0 = z.d.b.BASELINE
            z.d r13 = r13.r(r0)
            java.util.HashSet r0 = r13.e()
            if (r0 == 0) goto L_0x026a
            boolean r0 = r13.o()
            if (r0 == 0) goto L_0x026a
            int r0 = r13.f()
            java.util.HashSet r13 = r13.e()
            java.util.Iterator r13 = r13.iterator()
        L_0x022a:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x026a
            java.lang.Object r1 = r13.next()
            z.d r1 = (z.d) r1
            z.e r2 = r1.f15621d
            boolean r3 = a(r2)
            boolean r4 = r2.w0()
            if (r4 == 0) goto L_0x024e
            if (r3 == 0) goto L_0x024e
            a0.b$a r4 = new a0.b$a
            r4.<init>()
            int r5 = a0.b.a.f13k
            z.f.v2(r2, r14, r4, r5)
        L_0x024e:
            z.e$b r4 = r2.g0()
            z.e$b r5 = z.e.b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0258
            if (r3 == 0) goto L_0x022a
        L_0x0258:
            boolean r3 = r2.w0()
            if (r3 == 0) goto L_0x025f
            goto L_0x022a
        L_0x025f:
            z.d r3 = r2.N
            if (r1 != r3) goto L_0x022a
            r2.T0(r0)
            j(r2, r14)     // Catch:{ all -> 0x026b }
            goto L_0x022a
        L_0x026a:
            return
        L_0x026b:
            r13 = move-exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.h.j(z.e, a0.b$b):void");
    }
}
