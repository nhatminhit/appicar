package gc;

import gc.j0;
import gc.v;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class x extends ThreadPoolExecutor {
    public static final int O = 3;

    public static final class a extends FutureTask<c> implements Comparable<a> {
        public final c O;

        public a(c cVar) {
            super(cVar, (Object) null);
            this.O = cVar;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            v.f p10 = this.O.p();
            v.f p11 = aVar.O.p();
            return p10 == p11 ? this.O.O - aVar.O.O : p11.ordinal() - p10.ordinal();
        }
    }

    public x() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new j0.f());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r4 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.net.NetworkInfo r4) {
        /*
            r3 = this;
            r0 = 3
            if (r4 == 0) goto L_0x0034
            boolean r1 = r4.isConnectedOrConnecting()
            if (r1 != 0) goto L_0x000a
            goto L_0x0034
        L_0x000a:
            int r1 = r4.getType()
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r2) goto L_0x001e
            r4 = 6
            if (r1 == r4) goto L_0x001e
            r4 = 9
            if (r1 == r4) goto L_0x001e
        L_0x001a:
            r3.b(r0)
            goto L_0x0033
        L_0x001e:
            r4 = 4
        L_0x001f:
            r3.b(r4)
            goto L_0x0033
        L_0x0023:
            int r4 = r4.getSubtype()
            switch(r4) {
                case 1: goto L_0x0030;
                case 2: goto L_0x0030;
                case 3: goto L_0x002e;
                case 4: goto L_0x002e;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r4) {
                case 12: goto L_0x002e;
                case 13: goto L_0x001a;
                case 14: goto L_0x001a;
                case 15: goto L_0x001a;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x001a
        L_0x002e:
            r4 = 2
            goto L_0x001f
        L_0x0030:
            r3.b(r2)
        L_0x0033:
            return
        L_0x0034:
            r3.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.x.a(android.net.NetworkInfo):void");
    }

    public final void b(int i10) {
        setCorePoolSize(i10);
        setMaximumPoolSize(i10);
    }

    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}