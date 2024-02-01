package ra;

import java.util.Map;
import qa.c;
import qa.e;
import qa.h;
import qa.m;
import qa.p;
import qa.r;

public final class b implements p {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[LOOP:0: B:29:0x005c->B:30:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qa.r a(qa.c r11, java.util.Map<qa.e, ?> r12) throws qa.m, qa.h {
        /*
            r10 = this;
            ta.a r0 = new ta.a
            ya.b r11 = r11.b()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            ra.a r2 = r0.b(r11)     // Catch:{ m -> 0x002b, h -> 0x0025 }
            qa.t[] r3 = r2.b()     // Catch:{ m -> 0x002b, h -> 0x0025 }
            sa.a r4 = new sa.a     // Catch:{ m -> 0x0023, h -> 0x0021 }
            r4.<init>()     // Catch:{ m -> 0x0023, h -> 0x0021 }
            ya.e r2 = r4.c(r2)     // Catch:{ m -> 0x0023, h -> 0x0021 }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004e
            r1 = 1
            ra.a r0 = r0.b(r1)     // Catch:{ m -> 0x0046, h -> 0x0044 }
            qa.t[] r4 = r0.b()     // Catch:{ m -> 0x0046, h -> 0x0044 }
            sa.a r1 = new sa.a     // Catch:{ m -> 0x0046, h -> 0x0044 }
            r1.<init>()     // Catch:{ m -> 0x0046, h -> 0x0044 }
            ya.e r1 = r1.c(r0)     // Catch:{ m -> 0x0046, h -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            r11 = move-exception
            goto L_0x0047
        L_0x0046:
            r11 = move-exception
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x004c
            throw r3
        L_0x004c:
            throw r11
        L_0x004d:
            throw r2
        L_0x004e:
            r6 = r4
            if (r12 == 0) goto L_0x0066
            qa.e r0 = qa.e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            qa.u r12 = (qa.u) r12
            if (r12 == 0) goto L_0x0066
            int r0 = r6.length
        L_0x005c:
            if (r11 >= r0) goto L_0x0066
            r2 = r6[r11]
            r12.a(r2)
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0066:
            qa.r r11 = new qa.r
            java.lang.String r3 = r1.j()
            byte[] r4 = r1.g()
            int r5 = r1.e()
            qa.a r7 = qa.a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.a()
            if (r12 == 0) goto L_0x0089
            qa.s r0 = qa.s.BYTE_SEGMENTS
            r11.j(r0, r12)
        L_0x0089:
            java.lang.String r12 = r1.b()
            if (r12 == 0) goto L_0x0094
            qa.s r0 = qa.s.ERROR_CORRECTION_LEVEL
            r11.j(r0, r12)
        L_0x0094:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.b.a(qa.c, java.util.Map):qa.r");
    }

    public r b(c cVar) throws m, h {
        return a(cVar, (Map<e, ?>) null);
    }

    public void reset() {
    }
}
