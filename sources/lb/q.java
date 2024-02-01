package lb;

import java.util.Collection;
import java.util.Map;
import qa.e;
import qa.m;
import qa.r;
import ya.a;

public final class q extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final y[] f20490b = new y[0];

    /* renamed from: a  reason: collision with root package name */
    public final y[] f20491a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(java.util.Map<qa.e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            qa.e r0 = qa.e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0055
            qa.a r1 = qa.a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0027
            lb.i r1 = new lb.i
            r1.<init>()
        L_0x0023:
            r0.add(r1)
            goto L_0x0035
        L_0x0027:
            qa.a r1 = qa.a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0035
            lb.t r1 = new lb.t
            r1.<init>()
            goto L_0x0023
        L_0x0035:
            qa.a r1 = qa.a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0045
            lb.k r1 = new lb.k
            r1.<init>()
            r0.add(r1)
        L_0x0045:
            qa.a r1 = qa.a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0055
            lb.a0 r3 = new lb.a0
            r3.<init>()
            r0.add(r3)
        L_0x0055:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0073
            lb.i r3 = new lb.i
            r3.<init>()
            r0.add(r3)
            lb.k r3 = new lb.k
            r3.<init>()
            r0.add(r3)
            lb.a0 r3 = new lb.a0
            r3.<init>()
            r0.add(r3)
        L_0x0073:
            lb.y[] r3 = f20490b
            java.lang.Object[] r3 = r0.toArray(r3)
            lb.y[] r3 = (lb.y[]) r3
            r2.f20491a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.q.<init>(java.util.Map):void");
    }

    public r c(int i10, a aVar, Map<e, ?> map) throws m {
        boolean z10;
        int[] p10 = y.p(aVar);
        y[] yVarArr = this.f20491a;
        int i11 = 0;
        while (i11 < yVarArr.length) {
            try {
                r m10 = yVarArr[i11].m(i10, aVar, p10, map);
                boolean z11 = m10.b() == qa.a.EAN_13 && m10.g().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
                if (collection != null) {
                    if (!collection.contains(qa.a.UPC_A)) {
                        z10 = false;
                        if (z11 || !z10) {
                            return m10;
                        }
                        r rVar = new r(m10.g().substring(1), m10.d(), m10.f(), qa.a.UPC_A);
                        rVar.i(m10.e());
                        return rVar;
                    }
                }
                z10 = true;
                if (z11) {
                }
                return m10;
            } catch (qa.q unused) {
                i11++;
            }
        }
        throw m.a();
    }

    public void reset() {
        for (y reset : this.f20491a) {
            reset.reset();
        }
    }
}
