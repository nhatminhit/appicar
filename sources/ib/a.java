package ib;

import java.util.Map;
import qa.c;
import qa.d;
import qa.e;
import qa.h;
import qa.m;
import qa.p;
import qa.r;
import qa.t;

public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    public final p f19684a;

    public a(p pVar) {
        this.f19684a = pVar;
    }

    public static void c(t[] tVarArr, int i10, int i11) {
        if (tVarArr != null) {
            for (int i12 = 0; i12 < tVarArr.length; i12++) {
                t tVar = tVarArr[i12];
                if (tVar != null) {
                    tVarArr[i12] = new t(tVar.c() + ((float) i10), tVar.d() + ((float) i11));
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r5.f19684a.a(r6.a(r0, r1, r0, r1), r7);
        c(r2.f(), r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r2 = r0 / 2;
        r3 = r1 / 2;
        r6 = r5.f19684a.a(r6.a(r2, r3, r0, r1), r7);
        c(r6.f(), r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r3 = r5.f19684a.a(r6.a(r0, 0, r0, r1), r7);
        c(r3.f(), r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = r5.f19684a.a(r6.a(0, r1, r0, r1), r7);
        c(r3.f(), 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0018 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qa.r a(qa.c r6, java.util.Map<qa.e, ?> r7) throws qa.m, qa.d, qa.h {
        /*
            r5 = this;
            int r0 = r6.e()
            int r1 = r6.d()
            int r0 = r0 / 2
            int r1 = r1 / 2
            r2 = 0
            qa.p r3 = r5.f19684a     // Catch:{ m -> 0x0018 }
            qa.c r4 = r6.a(r2, r2, r0, r1)     // Catch:{ m -> 0x0018 }
            qa.r r6 = r3.a(r4, r7)     // Catch:{ m -> 0x0018 }
            return r6
        L_0x0018:
            qa.p r3 = r5.f19684a     // Catch:{ m -> 0x002a }
            qa.c r4 = r6.a(r0, r2, r0, r1)     // Catch:{ m -> 0x002a }
            qa.r r3 = r3.a(r4, r7)     // Catch:{ m -> 0x002a }
            qa.t[] r4 = r3.f()     // Catch:{ m -> 0x002a }
            c(r4, r0, r2)     // Catch:{ m -> 0x002a }
            return r3
        L_0x002a:
            qa.p r3 = r5.f19684a     // Catch:{ m -> 0x003c }
            qa.c r4 = r6.a(r2, r1, r0, r1)     // Catch:{ m -> 0x003c }
            qa.r r3 = r3.a(r4, r7)     // Catch:{ m -> 0x003c }
            qa.t[] r4 = r3.f()     // Catch:{ m -> 0x003c }
            c(r4, r2, r1)     // Catch:{ m -> 0x003c }
            return r3
        L_0x003c:
            qa.p r2 = r5.f19684a     // Catch:{ m -> 0x004e }
            qa.c r3 = r6.a(r0, r1, r0, r1)     // Catch:{ m -> 0x004e }
            qa.r r2 = r2.a(r3, r7)     // Catch:{ m -> 0x004e }
            qa.t[] r3 = r2.f()     // Catch:{ m -> 0x004e }
            c(r3, r0, r1)     // Catch:{ m -> 0x004e }
            return r2
        L_0x004e:
            int r2 = r0 / 2
            int r3 = r1 / 2
            qa.c r6 = r6.a(r2, r3, r0, r1)
            qa.p r0 = r5.f19684a
            qa.r r6 = r0.a(r6, r7)
            qa.t[] r7 = r6.f()
            c(r7, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.a.a(qa.c, java.util.Map):qa.r");
    }

    public r b(c cVar) throws m, d, h {
        return a(cVar, (Map<e, ?>) null);
    }

    public void reset() {
        this.f19684a.reset();
    }
}
