package mh;

import hh.d;
import java.util.Iterator;
import jh.h;
import jh.m;
import mh.e;

public class f {
    public static e.a a(e eVar, m mVar) {
        m mVar2 = mVar;
        int i10 = 0;
        while (mVar2 != null) {
            e.a a10 = eVar.a(mVar2, i10);
            if (a10 == e.a.STOP) {
                return a10;
            }
            if (a10 != e.a.CONTINUE || mVar2.u() <= 0) {
                while (mVar2.M() == null && i10 > 0) {
                    e.a aVar = e.a.CONTINUE;
                    if ((a10 == aVar || a10 == e.a.SKIP_CHILDREN) && (a10 = eVar.b(mVar2, i10)) == e.a.STOP) {
                        return a10;
                    }
                    m V = mVar2.V();
                    i10--;
                    if (a10 == e.a.REMOVE) {
                        mVar2.Y();
                    }
                    a10 = aVar;
                    mVar2 = V;
                }
                if ((a10 == e.a.CONTINUE || a10 == e.a.SKIP_CHILDREN) && (a10 = eVar.b(mVar2, i10)) == e.a.STOP) {
                    return a10;
                }
                if (mVar2 == mVar) {
                    return a10;
                }
                m M = mVar2.M();
                if (a10 == e.a.REMOVE) {
                    mVar2.Y();
                }
                mVar2 = M;
            } else {
                mVar2 = mVar2.t(0);
                i10++;
            }
        }
        return e.a.CONTINUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000a A[LOOP:0: B:1:0x000a->B:4:0x001c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(mh.e r2, mh.c r3) {
        /*
            hh.d.j(r2)
            hh.d.j(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r3.next()
            jh.h r0 = (jh.h) r0
            mh.e$a r0 = a(r2, r0)
            mh.e$a r1 = mh.e.a.STOP
            if (r0 != r1) goto L_0x000a
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.f.b(mh.e, mh.c):void");
    }

    public static void c(g gVar, m mVar) {
        m mVar2 = mVar;
        int i10 = 0;
        while (mVar2 != null) {
            gVar.a(mVar2, i10);
            if (mVar2.u() > 0) {
                mVar2 = mVar2.t(0);
                i10++;
            } else {
                while (mVar2.M() == null && i10 > 0) {
                    gVar.b(mVar2, i10);
                    mVar2 = mVar2.V();
                    i10--;
                }
                gVar.b(mVar2, i10);
                if (mVar2 != mVar) {
                    mVar2 = mVar2.M();
                } else {
                    return;
                }
            }
        }
    }

    public static void d(g gVar, c cVar) {
        d.j(gVar);
        d.j(cVar);
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            c(gVar, (h) it.next());
        }
    }
}
